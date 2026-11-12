package com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon;

import com.xiaomi.smarthome.library.common.util.StringUtil;
import com.xiaomi.smarthome.library.crypto.HexUtil;

/* JADX INFO: loaded from: classes10.dex */
public class MiotPacketParser {
    public static MiotBleAdvPacket parse(BleAdvertiseItem bleAdvertiseItem) {
        if (bleAdvertiseItem.type != 22) {
            return null;
        }
        PacketReader packetReader = new PacketReader(bleAdvertiseItem);
        if (packetReader.getShort() != 65173) {
            return null;
        }
        try {
            return tryParse(packetReader);
        } catch (Exception unused) {
            return parseZimiPower(packetReader);
        }
    }

    private static MiotBleAdvPacket parseZimiPower(PacketReader packetReader) {
        MiotBleAdvPacket miotBleAdvPacket = new MiotBleAdvPacket();
        try {
            miotBleAdvPacket.productId = packetReader.getLastShort();
            return miotBleAdvPacket;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static MiotBleAdvPacket tryParse(PacketReader packetReader) {
        MiotBleAdvPacket miotBleAdvPacket = new MiotBleAdvPacket();
        miotBleAdvPacket.frameControl = new MiotBleAdvPacket.FrameControl();
        int i = packetReader.getByte();
        miotBleAdvPacket.frameControl.encrypted = packetReader.getBit(i, 3);
        miotBleAdvPacket.frameControl.withMac = packetReader.getBit(i, 4);
        miotBleAdvPacket.frameControl.withCapability = packetReader.getBit(i, 5);
        miotBleAdvPacket.frameControl.withEvent = packetReader.getBit(i, 6);
        miotBleAdvPacket.frameControl.withMesh = packetReader.getBit(i, 7);
        int i2 = packetReader.getByte();
        miotBleAdvPacket.frameControl.registered = packetReader.getBit(i2, 0);
        miotBleAdvPacket.frameControl.bindingCfm = packetReader.getBit(i2, 1);
        miotBleAdvPacket.frameControl.authMode = packetReader.getInt(i2, 2, 3);
        miotBleAdvPacket.frameControl.version = packetReader.getInt(i2, 4, 7);
        miotBleAdvPacket.productId = packetReader.getShort();
        miotBleAdvPacket.frameCounter = packetReader.getByte();
        if (miotBleAdvPacket.frameControl.withMac) {
            miotBleAdvPacket.mac = packetReader.getMac();
        }
        if (miotBleAdvPacket.frameControl.withCapability) {
            int i3 = packetReader.getByte();
            MiotBleAdvPacket.Capability capability = new MiotBleAdvPacket.Capability();
            miotBleAdvPacket.capability = capability;
            capability.connectable = packetReader.getBit(i3, 0);
            miotBleAdvPacket.capability.centralable = packetReader.getBit(i3, 1);
            miotBleAdvPacket.capability.encryptable = packetReader.getBit(i3, 2);
            miotBleAdvPacket.capability.bindable = packetReader.getInt(i3, 3, 4);
            miotBleAdvPacket.capability.ioCapabilityable = packetReader.getBit(i3, 5);
            miotBleAdvPacket.capability.netStatus = packetReader.getInt(i3, 6, 7);
        }
        if (miotBleAdvPacket.isComboPacket()) {
            miotBleAdvPacket.comboKey = packetReader.getShortString();
        }
        if (miotBleAdvPacket.frameControl.withCapability && miotBleAdvPacket.capability.ioCapabilityable) {
            int i4 = packetReader.getByte();
            MiotBleAdvPacket.IoCapability ioCapability = new MiotBleAdvPacket.IoCapability();
            miotBleAdvPacket.ioCapability = ioCapability;
            ioCapability.inputCapability = packetReader.getInt(i4, 0, 3);
            miotBleAdvPacket.ioCapability.outputCapability = packetReader.getInt(i4, 4, 7);
            packetReader.getByte();
        }
        try {
            if (miotBleAdvPacket.frameControl.withEvent) {
                MiotBleAdvPacket.Event event = new MiotBleAdvPacket.Event();
                miotBleAdvPacket.event = event;
                event.eventId = packetReader.getShort();
                miotBleAdvPacket.event.eventLength = packetReader.getByte();
                int i5 = miotBleAdvPacket.event.eventLength;
                if (i5 > 0) {
                    String[] strArr = new String[i5];
                    for (int i6 = i5 - 1; i6 > 0; i6--) {
                        strArr[i6] = String.format("%02x", Integer.valueOf(packetReader.getByte()));
                    }
                    miotBleAdvPacket.event.eventStr = String.valueOf(HexUtil.hexToDecimal(StringUtil.join(strArr)));
                }
            }
            if (miotBleAdvPacket.frameControl.encrypted) {
                miotBleAdvPacket.extendedFrameCounter = new int[]{packetReader.getByte(), 0, 0};
                miotBleAdvPacket.extendedFrameCounter[1] = packetReader.getByte();
                miotBleAdvPacket.extendedFrameCounter[2] = packetReader.getByte();
                if (miotBleAdvPacket.frameControl.version >= 4) {
                    int[] iArr = new int[4];
                    miotBleAdvPacket.messageIntegrityCheck = iArr;
                    iArr[0] = packetReader.getByte();
                    miotBleAdvPacket.messageIntegrityCheck[1] = packetReader.getByte();
                    miotBleAdvPacket.messageIntegrityCheck[2] = packetReader.getByte();
                    miotBleAdvPacket.messageIntegrityCheck[3] = packetReader.getByte();
                } else {
                    miotBleAdvPacket.messageIntegrityCheck = new int[]{packetReader.getByte()};
                }
            }
            if (miotBleAdvPacket.frameControl.withMesh) {
                miotBleAdvPacket.mesh = new MiotBleAdvPacket.Mesh();
                int i7 = packetReader.getByte();
                miotBleAdvPacket.mesh.pbType = packetReader.getInt(i7, 0, 1);
                miotBleAdvPacket.mesh.state = packetReader.getInt(i7, 2, 3);
                miotBleAdvPacket.mesh.version = packetReader.getInt(i7, 4, 7);
                packetReader.getByte();
            }
        } catch (Exception unused) {
        }
        return miotBleAdvPacket;
    }
}
