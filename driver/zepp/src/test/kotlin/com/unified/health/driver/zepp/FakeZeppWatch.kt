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
    /** False: the watch does not expose the standard Current Time characteristic (§4 step 7). */
    hasCurrentTime: Boolean = true,
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
    val currentTime = characteristic(StandardUuids.CURRENT_TIME_SERVICE, StandardUuids.CURRENT_TIME, PROPERTY_WRITE)
    val pnpId = characteristic(StandardUuids.DEVICE_INFORMATION_SERVICE, StandardUuids.PNP_ID, PROPERTY_READ)

    val gatt = FakeGattClient(
        buildList {
            if (hasChannel) addAll(listOf(channelDown, channelUp))
            if (hasLegacyAuth) add(legacyAuth)
            if (hasHeartRate) add(hrMeasurement)
            if (hasHeartRate && hasHrControl) add(hrControl)
            addAll(listOf(gdspControl, gdspData, battery))
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

    /** Number of Zepp OS `[0x00]` authorization-info requests received. */
    var infoRequests = 0
        private set

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

    class GdspBlock(val count: Long, val start: LocalDateTime, val payload: ByteArray, val tzKey: Int = 0)

    private val reassembler = ChannelReassembler()
    private val random = Random(7)
    private val challenge = ByteArray(16).also(random::nextBytes)
    private val watchKeys = B163Ecdh.generateKeyPair(random)
    private var sessionKey: ByteArray? = null
    private var outSession = 0x40
    private var pendingBlock: GdspBlock? = null

    init {
        gatt.readValues[StandardUuids.BATTERY_LEVEL] = byteArrayOf(87)
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
            gatt.notify(channelDown, ChannelCodec.encodeAck(channelProtocol, ChannelAck(packet.sessionId, ChannelReplyCode.OK, packet.index)))
        }
        if (result !is ChannelReassembler.Result.Complete) return
        val message = result.message
        when (message.module) {
            0x82 -> onAuthMessage(message.data)
            0x80 -> onAuthModule1Message(message.data)
            0x00 -> onBuiltInMessage(message.data)
            0x1D -> onOpenAppMessage(message)
        }
    }

    /** Module 0x80 session auth (no ECDH, brief TODO-1): `[0x04,...]` random request, `[0x05, enc]` authorize. */
    private fun onAuthModule1Message(data: ByteArray) {
        if (!answersAuth) return
        when (data[0].toInt()) {
            0x04 -> sendModule(0x80, byteArrayOf(0x10, 0x04, 0x01) + challenge)
            0x05 -> {
                val proofOk = data.copyOfRange(1, 17).contentEquals(AesEcb.encrypt(authKey, challenge))
                authenticated = proofOk && authorizeStatus == 1
                sendModule(0x80, byteArrayOf(0x10, 0x05, (if (proofOk) authorizeStatus else 2).toByte()))
            }
        }
    }

    private fun onBuiltInMessage(data: ByteArray) {
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

    private fun onOpenAppMessage(message: ChannelMessage) {
        val data = if (message.isEncrypted) {
            val key = ByteArray(16) { (checkNotNull(sessionKey)[it].toInt() xor message.sessionId).toByte() }
            AesEcb.decrypt(key, message.data).copyOf(message.totalSize)
        } else {
            message.data
        }
        openAppCommands += data
        openAppEncrypted += message.isEncrypted
        if (answersOpenApp && data[0].toInt() == 0x04) sendModule(0x1D, byteArrayOf(0x05, realtimeHrStatus.toByte()))
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

    private fun onLegacyAuth(value: ByteArray) {
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
                val block = gdspBlocks[value[1].toInt() and 0xFF]?.removeFirstOrNull()
                pendingBlock = block
                gatt.notify(gdspControl, header(block))
            }
            0x02 -> sendBlock(checkNotNull(pendingBlock) { "start without header" })
            0x03 -> {
                stopCodes += value.getOrNull(1)?.toInt()
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
            u8(block.start.monthValue)
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
        val crc = crc32(block.payload) xor if (corruptNextCrc) 1L else 0L
        corruptNextCrc = false
        gatt.notify(gdspControl, buildBytes { bytes(byteArrayOf(0x10, 0x02, 0x01)); u32le(crc) })
    }
}
