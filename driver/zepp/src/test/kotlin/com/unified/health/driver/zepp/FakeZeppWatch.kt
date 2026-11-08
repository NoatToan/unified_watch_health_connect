package com.unified.health.driver.zepp

import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_NOTIFY
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_READ
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_WRITE
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_WRITE_NO_RESPONSE
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.protocol.buildBytes
import com.unified.health.core.testing.FakeGattClient
import com.unified.health.core.testing.characteristic
import com.unified.health.driver.zepp.codec.AesEcb
import com.unified.health.driver.zepp.codec.B163Ecdh
import com.unified.health.driver.zepp.codec.ChannelAck
import com.unified.health.driver.zepp.codec.ChannelCipher
import com.unified.health.driver.zepp.codec.ChannelCodec
import com.unified.health.driver.zepp.codec.ChannelProtocol
import com.unified.health.driver.zepp.codec.ChannelMessage
import com.unified.health.driver.zepp.codec.ChannelReassembler
import com.unified.health.driver.zepp.codec.ChannelReplyCode
import com.unified.health.driver.zepp.codec.crc32
import java.time.LocalDateTime
import java.util.Random
import java.util.UUID

/**
 * Scripted Zepp watch for JVM tests: channel v2 with real B-163 session auth on module 0x82, a
 * legacy 0x0009 auth variant and a GDSP history server. Byte layouts follow the protocol document.
 */
internal class FakeZeppWatch(
    private var authKey: ByteArray,
    mtu: Int = 23,
    hasChannel: Boolean = true,
    hasLegacyAuth: Boolean = false,
    hasHeartRate: Boolean = false,
    /** With [hasHeartRate]: false leaves out the `2A39` control point (Zepp OS watches may lack it). */
    hasHrControl: Boolean = true,
    /** Second byte of the version reply; null omits the encrypt byte. */
    private val channelVersion: Int = 2,
    private val encryptByte: Int? = 1,
    /** `allowLocalBinding` byte of the Zepp OS authorization info (§5.2 step 0). */
    private val allowLocalBinding: Int = 0,
    /** BuiltInModule list: module id → requireEncryption. Without OpenAppModule (29) by default. */
    private val modules: Map<Int, Boolean> = mapOf(0x82 to false),
    /** ConnectModule (0x15) reply payload, little-endian: ATT MTU = payload + 3 (default 247). */
    private val connectParamPayload: Int = 244,
    /** False: the watch does not expose the standard Current Time characteristic (§4 step 7). */
    hasCurrentTime: Boolean = true,
    /** Service holding 2A2B: FEE0 in the vendor flow (`BaseProfile.setDateTime`), SIG 0x1805 otherwise. */
    private val currentTimeService: UUID = StandardUuids.CURRENT_TIME_SERVICE,
    /** False: no SIG battery service 0x180F (legacy Huami watch exposing only 0x0006). */
    hasStandardBattery: Boolean = true,
    /** True: expose the Huami legacy battery characteristic 0x0006 in FEE0. */
    hasLegacyBattery: Boolean = false,
    /** Version answered by channel module 0x29; the vendor only queries battery when it is 1. */
    private val batteryModuleVersion: Int = 1,
    /** True: expose a readable PnP ID (`2A50`) with `productId = 0x1234`, `productVersion = 0x0102`. */
    private val hasPnpId: Boolean = false,
) {
    val channelDown = characteristic(ZeppUuids.SERVICE_MILI, ZeppUuids.CHANNEL_DOWN, PROPERTY_WRITE_NO_RESPONSE, PROPERTY_NOTIFY)
    val channelUp = characteristic(ZeppUuids.SERVICE_MILI, ZeppUuids.CHANNEL_UP, PROPERTY_WRITE_NO_RESPONSE, PROPERTY_NOTIFY)
    val gdspControl = characteristic(ZeppUuids.SERVICE_MILI, ZeppUuids.GDSP_CONTROL, PROPERTY_WRITE_NO_RESPONSE, PROPERTY_NOTIFY)
    val gdspData = characteristic(ZeppUuids.SERVICE_MILI, ZeppUuids.GDSP_DATA, PROPERTY_NOTIFY)
    val legacyAuth = characteristic(ZeppUuids.SERVICE_MILI_SECONDARY, ZeppUuids.LEGACY_AUTH, PROPERTY_WRITE, PROPERTY_NOTIFY)
    val hrMeasurement = characteristic(StandardUuids.HEART_RATE_SERVICE, StandardUuids.HEART_RATE_MEASUREMENT, PROPERTY_NOTIFY)
    val hrControl = characteristic(StandardUuids.HEART_RATE_SERVICE, ZeppUuids.HR_CONTROL, PROPERTY_WRITE, PROPERTY_WRITE_NO_RESPONSE)
    val battery = characteristic(StandardUuids.BATTERY_SERVICE, StandardUuids.BATTERY_LEVEL, PROPERTY_READ)
    val legacyBattery = characteristic(ZeppUuids.SERVICE_MILI, ZeppUuids.BATTERY, PROPERTY_READ)
    val currentTime = characteristic(currentTimeService, StandardUuids.CURRENT_TIME, PROPERTY_WRITE)
    val pnpId = characteristic(StandardUuids.DEVICE_INFORMATION_SERVICE, StandardUuids.PNP_ID, PROPERTY_READ)

    val gatt = FakeGattClient(
        buildList {
            if (hasChannel) addAll(listOf(channelDown, channelUp))
            if (hasLegacyAuth) add(legacyAuth)
            if (hasHeartRate) add(hrMeasurement)
            if (hasHeartRate && hasHrControl) add(hrControl)
            addAll(listOf(gdspControl, gdspData))
            if (hasStandardBattery) add(battery)
            if (hasLegacyBattery) add(legacyBattery)
            if (hasCurrentTime) add(currentTime)
            if (hasPnpId) add(pnpId)
        },
        mtu = mtu,
    )

    /** Status byte of the OpenAppModule realtime-HR result `[0x05, status]`; 0 = accepted. */
    var realtimeHrStatus = 0

    /** False: the watch never answers OpenAppModule commands. */
    var answersOpenApp = true

    /** Plaintext OpenAppModule commands received, decrypted when they came encrypted. */
    val openAppCommands = mutableListOf<ByteArray>()

    /** Whether each OpenAppModule command arrived with the ENCRYPTED flag. */
    val openAppEncrypted = mutableListOf<Boolean>()

    /** Status the watch answers to `[0x05, …]` when the proof is correct. */
    var authorizeStatus = 1

    /** Status answered to a bind command (1 = accepted). An accepted bind replaces [authKey]. */
    var bindStatus = 1

    /** Raw bind commands received (legacy `0x01` writes and Zepp OS local-bind messages). */
    val bindCommands = mutableListOf<ByteArray>()

    /** Number of auth-info `[0x00]` requests received on module 0x80 or 0x82. */
    var infoRequests = 0
        private set

    /** Number of BuiltInModule requests received (must stay 0 on channel v1). */
    var builtInRequests = 0
        private set

    /** Number of any module-0x80 messages received (must stay 0 on channel v1). */
    var module1Requests = 0
        private set

    /** Number of legacy 0x0009 auth writes received. */
    var legacyAuthRequests = 0
        private set

    /** Module 0x29 version and battery queries received. */
    var batteryVersionQueries = 0
        private set
    var batteryQueries = 0
        private set

    /** Module 0x15 `queryConnectParam` requests received. */
    var connectParamRequests = 0
        private set

    /** False: the watch never answers module 0x15 (the driver must keep the GATT MTU). */
    var answersConnectParam = true

    /** Channel ACKs to drop before acknowledging normally (simulates a lost DATA_REPLY). */
    var dropAcks = 0

    /**
     * Start-transfer commands answered with a transient OPERATION_FAILED (4) before serving data.
     * The pending block is put back, as a real watch keeps undelivered history.
     */
    var transientGdspFailures = 0

    /** Flags byte and level answered by module 0x29 (`[flags, level, …]`). */
    var batteryFlags = 0
    var batteryLevel = 87

    /** The key the watch currently holds. */
    val storedKey: ByteArray get() = authKey

    /** When false the watch never answers module 0x82 (timeout path). */
    var answersAuth = true

    /** GDSP blocks per type code; each is served once, then the header count is 0. */
    val gdspBlocks = mutableMapOf<Int, ArrayDeque<GdspBlock>>()

    /** Codes received with `[0x03, code]` (null for a plain `[0x03]`). */
    val stopCodes = mutableListOf<Int?>()

    /** True once both auth proofs matched. */
    var authenticated = false
        private set

    /** Header requests received, as raw bytes. */
    val headerRequests = mutableListOf<ByteArray>()

    var corruptNextCrc = false

    /** Corrupt the CRC of every transfer (exercises the retry budget). */
    var corruptCrcAlways = false

    /** Answer a non-empty header with an impossible date (a non-retryable protocol error). */
    var malformedGdspHeader = false

    class GdspBlock(val count: Long, val start: LocalDateTime, val payload: ByteArray, val tzKey: Int = 0)

    private val reassembler = ChannelReassembler()
    private val random = Random(7)
    private val challenge = ByteArray(16).also(random::nextBytes)
    private val watchKeys = B163Ecdh.generateKeyPair(random)
    private var sessionKey: ByteArray? = null
    private var outSession = 0x40
    private var pendingBlock: GdspBlock? = null
    private var pendingType: Int? = null

    /** Block sent but not yet confirmed with `[0x03, 0x01]`; re-queued if the app aborts. */
    private var unconfirmedBlock: GdspBlock? = null
    private var unconfirmedType: Int? = null

    init {
        if (hasStandardBattery) gatt.readValues[StandardUuids.BATTERY_LEVEL] = byteArrayOf(87)
        if (hasLegacyBattery) gatt.readValues[ZeppUuids.BATTERY] = byteArrayOf(0x00, 87)
        if (hasPnpId) {
            gatt.readValues[StandardUuids.PNP_ID] =
                byteArrayOf(0x01, 0x57, 0x01, 0x34, 0x12, 0x02, 0x01) // vendorSource=SIG, vendorId=0x0157, productId=0x1234, productVersion=0x0102
        }
        gatt.onWrite = { c, value -> onWrite(c, value) }
    }

    private fun onWrite(c: GattCharacteristic, value: ByteArray) {
        when (c) {
            channelDown -> onChannelDown(value)
            gdspControl -> onGdspControl(value)
            legacyAuth -> onLegacyAuth(value)
            else -> Unit // phone ACKs on 0x0017
        }
    }

    /** Framing only (§3.3): matches the configured [channelVersion], independent of which auth module is used. */
    private val channelProtocol: ChannelProtocol get() = if (channelVersion == 1) ChannelProtocol.V1 else ChannelProtocol.V2

    private fun onChannelDown(value: ByteArray) {
        if (value[0].toInt() == 0x01) {
            val reply = if (encryptByte == null) byteArrayOf(0x02, channelVersion.toByte()) else byteArrayOf(0x02, channelVersion.toByte(), encryptByte.toByte())
            gatt.notify(channelDown, reply)
            return
        }
        val packet = ChannelCodec.decodeData(channelProtocol, value)
        val result = reassembler.append(packet)
        if (packet.needsReply) {
            if (dropAcks > 0) {
                dropAcks--
            } else {
                gatt.notify(channelDown, ChannelCodec.encodeAck(channelProtocol, ChannelAck(packet.sessionId, ChannelReplyCode.OK, packet.index)))
            }
        }
        if (result !is ChannelReassembler.Result.Complete) return
        val message = result.message
        when (message.module) {
            0x82 -> onAuthMessage(message.data)
            0x80 -> onAuthModule1Message(message.data)
            0x00 -> onBuiltInMessage(message.data)
            0x1D -> onOpenAppMessage(message)
            0x29 -> onBatteryMessage(message)
            0x15 -> onConnectParamMessage(message)
        }
    }

    /** Module 0x80 session auth plus local bind (`DeviceAuthorizationImpl1`, §3.2). */
    private fun onAuthModule1Message(data: ByteArray) {
        module1Requests++
        if (!answersAuth) return
        when (data[0].toInt()) {
            0x00 -> {
                infoRequests++
                sendModule(0x80, byteArrayOf(0x10, 0x00, 0x01, 0x01, 0x01, 0x00, allowLocalBinding.toByte()))
            }
            0x01 -> {
                bindCommands += data
                if (bindStatus == 1) authKey = data.copyOfRange(3, 19)
                sendModule(0x80, byteArrayOf(0x10, 0x01, bindStatus.toByte()))
            }
            0x04 -> sendModule(0x80, byteArrayOf(0x10, 0x04, 0x01) + challenge)
            0x05 -> {
                val proofOk = data.copyOfRange(1, 17).contentEquals(AesEcb.encrypt(authKey, challenge))
                authenticated = proofOk && authorizeStatus == 1
                sendModule(0x80, byteArrayOf(0x10, 0x05, (if (proofOk) authorizeStatus else 2).toByte()))
            }
        }
    }

    private fun onBuiltInMessage(data: ByteArray) {
        builtInRequests++
        when (data[0].toInt()) {
            0x03 -> sendModule(0x00, buildBytes {
                u8(0x04)
                u16le(modules.size)
                modules.forEach { (id, encrypted) -> u16le(id); u8(if (encrypted) 1 else 0) }
            })
            0x00 -> sendModule(0x00, buildBytes {
                u8(0x01)
                u16le(modules.size)
                modules.keys.forEach { u8(it) }
            })
        }
    }

    /** Decrypts an encrypted module message with the session key; plaintext messages pass through. */
    private fun plaintext(message: ChannelMessage): ByteArray =
        if (message.isEncrypted) {
            val key = ByteArray(16) { (checkNotNull(sessionKey)[it].toInt() xor message.sessionId).toByte() }
            AesEcb.decrypt(key, message.data).copyOf(message.totalSize)
        } else {
            message.data
        }

    private fun onOpenAppMessage(message: ChannelMessage) {
        val data = plaintext(message)
        openAppCommands += data
        openAppEncrypted += message.isEncrypted
        if (answersOpenApp && data[0].toInt() == 0x04) sendModule(0x1D, byteArrayOf(0x05, realtimeHrStatus.toByte()))
    }

    /** Module 0x29: query version `[0x01]` → `[0x02, version]`, query battery `[0x03]` → `[0x04, flags, level]`. */
    private fun onBatteryMessage(message: ChannelMessage) {
        val data = plaintext(message)
        when (data[0].toInt()) {
            0x01 -> {
                batteryVersionQueries++
                sendModule(0x29, byteArrayOf(0x10, 0x02, 0x01, batteryModuleVersion.toByte()))
            }
            0x03 -> {
                batteryQueries++
                sendModule(0x29, byteArrayOf(0x10, 0x04, 0x01, batteryFlags.toByte(), batteryLevel.toByte()))
            }
        }
    }

    /** Module 0x15: query `[0x01]` → notify `[0x02, payload u16 LE]`; ATT MTU = payload + 3 (§2). */
    private fun onConnectParamMessage(message: ChannelMessage) {
        val data = plaintext(message)
        if (data.isNotEmpty() && data[0].toInt() == 0x01) {
            connectParamRequests++
            if (!answersConnectParam) return
            sendModule(0x15, buildBytes {
                u8(0x02)
                u16le(connectParamPayload)
            })
        }
    }

    private fun onAuthMessage(data: ByteArray) {
        if (!answersAuth) return
        when (data[0].toInt()) {
            0x00 -> {
                infoRequests++
                sendModule(0x82, byteArrayOf(0x10, 0x00, 0x01, 0x01, 0x02, 0x00, allowLocalBinding.toByte()))
            }
            0x01 -> {
                bindCommands += data
                if (bindStatus == 1) authKey = data.copyOfRange(3, 19)
                sendModule(0x82, byteArrayOf(0x10, 0x01, bindStatus.toByte()))
            }
            0x04 -> {
                val phonePublic = data.copyOfRange(4, 52)
                val shared = B163Ecdh.sharedSecret(watchKeys.privateKey, phonePublic)
                sessionKey = ChannelCipher.deriveSessionKey(shared, authKey)
                sendModule(0x82, byteArrayOf(0x10, 0x04, 0x01) + challenge + watchKeys.publicKey)
            }
            0x05 -> {
                val proofOk = data.copyOfRange(1, 17).contentEquals(AesEcb.encrypt(authKey, challenge)) &&
                    data.copyOfRange(17, 33).contentEquals(AesEcb.encrypt(checkNotNull(sessionKey), challenge))
                authenticated = proofOk && authorizeStatus == 1
                sendModule(0x82, byteArrayOf(0x10, 0x05, (if (proofOk) authorizeStatus else 2).toByte()))
            }
        }
    }

    private fun sendModule(module: Int, payload: ByteArray) {
        val packets = ChannelCodec.split(channelProtocol, outSession++, module, payload, packetSize = gatt.maxWriteLength)
        packets.forEach { gatt.notify(channelUp, ChannelCodec.encodeData(channelProtocol, it)) }
    }

    /** Unsolicited module 0x29 battery push (`[0x10, 0x04, 0x01, flags, level]`). */
    fun pushBattery(level: Int, flags: Int = 0) {
        sendModule(0x29, byteArrayOf(0x10, 0x04, 0x01, flags.toByte(), level.toByte()))
    }

    private fun onLegacyAuth(value: ByteArray) {
        legacyAuthRequests++
        when (value[0].toInt()) {
            0x01 -> {
                bindCommands += value
                if (bindStatus == 1) authKey = value.copyOfRange(2, 18)
                gatt.notify(legacyAuth, byteArrayOf(0x10, 0x01, bindStatus.toByte()))
            }
            0x02 -> gatt.notify(legacyAuth, byteArrayOf(0x10, 0x02, 0x01) + challenge)
            0x03 -> {
                val ok = value.copyOfRange(2, 18).contentEquals(AesEcb.encrypt(authKey, challenge))
                authenticated = ok
                gatt.notify(legacyAuth, byteArrayOf(0x10, 0x03, if (ok) 0x01 else 0x04))
            }
        }
    }

    private fun onGdspControl(value: ByteArray) {
        when (value[0].toInt()) {
            0x00 -> gatt.notify(gdspControl, byteArrayOf(0x10, 0x00, 0x01, 0x01))
            0x01 -> {
                headerRequests += value
                // A new header means the app accepted the previous block (it advances its cursor only
                // after decoding it), so that block no longer needs to be recoverable.
                unconfirmedBlock = null
                unconfirmedType = null
                val type = value[1].toInt() and 0xFF
                pendingType = type
                val block = gdspBlocks[type]?.removeFirstOrNull()
                pendingBlock = block
                gatt.notify(gdspControl, header(block))
            }
            0x02 -> {
                val block = checkNotNull(pendingBlock) { "start without header" }
                if (transientGdspFailures > 0) {
                    transientGdspFailures--
                    pendingType?.let { gdspBlocks[it]?.addFirst(block) } // Undelivered history stays on the watch.
                    pendingBlock = null
                    gatt.notify(gdspControl, byteArrayOf(0x10, 0x02, 0x04)) // OPERATION_FAILED
                } else {
                    sendBlock(block)
                }
            }
            0x03 -> {
                stopCodes += value.getOrNull(1)?.toInt()
                if (value.getOrNull(1)?.toInt() != 1) {
                    // Cancel/abort: the watch keeps undelivered history for the next attempt.
                    unconfirmedBlock?.let { gdspBlocks[checkNotNull(unconfirmedType)]?.addFirst(it) }
                }
                unconfirmedBlock = null
                unconfirmedType = null
                pendingBlock = null
                gatt.notify(gdspControl, byteArrayOf(0x10, 0x03, 0x01))
            }
        }
    }

    private fun header(block: GdspBlock?): ByteArray = buildBytes {
        bytes(byteArrayOf(0x10, 0x01, 0x01))
        if (block == null) {
            u32le(0)
            bytes(ByteArray(8))
        } else {
            u32le(block.count)
            u16le(block.start.year)
            u8(if (malformedGdspHeader) 13 else block.start.monthValue) // month 13 is not a date
            u8(block.start.dayOfMonth)
            u8(block.start.hour)
            u8(block.start.minute)
            u8(block.start.second)
            u8(block.tzKey)
        }
    }

    private fun sendBlock(block: GdspBlock) {
        val chunk = gatt.maxWriteLength - 1
        block.payload.toList().chunked(chunk).forEachIndexed { seq, part ->
            gatt.notify(gdspData, byteArrayOf(seq.toByte()) + part.toByteArray())
        }
        val corrupt = corruptNextCrc || corruptCrcAlways
        val crc = crc32(block.payload) xor if (corrupt) 1L else 0L
        corruptNextCrc = false
        pendingBlock = null
        unconfirmedBlock = block
        unconfirmedType = pendingType
        gatt.notify(gdspControl, buildBytes { bytes(byteArrayOf(0x10, 0x02, 0x01)); u32le(crc) })
    }
}
