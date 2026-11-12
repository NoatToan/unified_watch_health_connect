package com.xiaomi.digitalkey.wearable;

import android.content.Context;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.xiaomi.digitalkey.wearable.certificate.EndpointCertificate;
import com.xiaomi.digitalkey.wearable.utils.ByteUtils;
import com.xiaomi.digitalkey.wearable.utils.ConstUtils;
import com.xiaomi.digitalkey.wearable.utils.EnvironmentConfig;
import com.xiaomi.digitalkey.wearable.utils.Logger;
import com.xiaomi.digitalkey.wearable.utils.TLVObject;
import com.xiaomi.digitalkey.wearable.utils.TLVParser;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Endpoint {
    private static final boolean DEBUG = Logger.LOG_ENDPOINT;
    private static final boolean ERR = true;
    private EPConfig mConfig;
    WearableSEProxy mWearableSEProxy;
    private final String LogTag = "SDK-DKF-Endpoint:";
    private int mOP_status = 0;
    private int SERetryMaxCount = 100;
    private int SERetryInterval = 50;
    DeviceConf mDeviceConf = DeviceConf.getInstance();

    public class EndpointExistException extends Exception {
        public EndpointExistException(String str) {
            super(str);
        }
    }

    public class EndpointTerminatedException extends Exception {
        public EndpointTerminatedException(String str) {
            super(str);
        }
    }

    public class EndpointTerminatedNetworkException extends Exception {
        public EndpointTerminatedNetworkException(String str) {
            super(str);
        }
    }

    public int calWritePayloadLen() {
        int length = this.mConfig.getEpId().length;
        int length2 = length + 13 + this.mConfig.getInstanceCAId().length + 79 + this.mConfig.getNotBefore().length + 2 + this.mConfig.getNotAfter().length + 2;
        if (this.mConfig.getAuthPk() != null) {
            int length3 = this.mConfig.getAuthPk().length;
            length2 += length3 + TLVParser.getTvlLenLen(length3) + 1;
        }
        if (this.mConfig.getPrivMbxSize() != null) {
            length2 += 4;
        }
        if (this.mConfig.getConfMbxSize() != null) {
            length2 += 4;
        }
        if (this.mConfig.getKeySlot() != null) {
            length2 += this.mConfig.getKeySlot().length + 2;
        }
        return this.mConfig.getCountLimit() != null ? length2 + 6 : length2;
    }

    public byte[] createEncryptionKey(byte[] bArr) throws IOException {
        WearableSEProxy wearableSEProxy = WearableSEProxy.getInstance();
        this.mWearableSEProxy = wearableSEProxy;
        try {
            wearableSEProxy.open_se();
            try {
                this.mWearableSEProxy.select(ConstUtils.CCC_APPLET);
                byte[] bArrSendCreateEncryptionKeyCmd = sendCreateEncryptionKeyCmd(bArr);
                if (DEBUG) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("create_encryption rsp: ");
                    sb.append(ByteUtils.toHexString(bArrSendCreateEncryptionKeyCmd));
                }
                int iStream2len = 0;
                if (bArrSendCreateEncryptionKeyCmd.length > 2) {
                    byte[] bArr2 = new byte[bArrSendCreateEncryptionKeyCmd.length - 2];
                    System.arraycopy(bArrSendCreateEncryptionKeyCmd, 0, bArr2, 0, bArrSendCreateEncryptionKeyCmd.length - 2);
                    iStream2len = ByteUtils.stream2len(bArr2);
                }
                if (iStream2len != 0) {
                    bArrSendCreateEncryptionKeyCmd = sendReadBufferCmd(iStream2len);
                }
                this.mWearableSEProxy.close_se();
                return bArrSendCreateEncryptionKeyCmd;
            } catch (WearableSEProxy.AppletNotFoundException e) {
                e.printStackTrace();
                throw new IOException();
            }
        } catch (Throwable th) {
            this.mWearableSEProxy.close_se();
            throw th;
        }
    }

    public byte[] createShare() throws IOException {
        WearableSEProxy wearableSEProxy = WearableSEProxy.getInstance();
        this.mWearableSEProxy = wearableSEProxy;
        try {
            wearableSEProxy.open_se();
            byte[] bArrSelectCccApplet = selectCccApplet();
            boolean z = DEBUG;
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("select rsp: ");
                sb.append(ByteUtils.toHexString(bArrSelectCccApplet));
            }
            byte[] writeBufferPayload = getWriteBufferPayload();
            if (z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("create payload: ");
                sb2.append(ByteUtils.toHexString(writeBufferPayload));
            }
            byte[] bArrSendWriteBufferCmd = sendWriteBufferCmd(writeBufferPayload);
            if (z) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("write buffer rsp: ");
                sb3.append(ByteUtils.toHexString(bArrSendWriteBufferCmd));
            }
            int iSendCreateCmd = sendCreateCmd(null);
            if (iSendCreateCmd == 0) {
                throw new IOException("create ep fail");
            }
            byte[] bArrSendReadBufferCmd = sendReadBufferCmd(iSendCreateCmd);
            this.mDeviceConf.set_ep_certificate(bArrSendReadBufferCmd);
            try {
                byte[] keyIdentifier = new EndpointCertificate(bArrSendReadBufferCmd).getKeyIdentifier();
                if (this.mConfig.getAuth1ConfidentialMB() != null || this.mConfig.getAuth1PrivateMB() != null || this.mConfig.getKeySlot() != null) {
                    setupEndpoint(keyIdentifier);
                }
                if (z) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("read buffer rsp: ");
                    sb4.append(ByteUtils.toHexString(bArrSendReadBufferCmd));
                }
                this.mWearableSEProxy.close_se();
                return bArrSendReadBufferCmd;
            } catch (CertificateException e) {
                e.printStackTrace();
                throw new IOException();
            }
        } catch (Throwable th) {
            this.mWearableSEProxy.close_se();
            throw th;
        }
    }

    public boolean deleteEndpointIfDuplicateVehicleId(Context context, byte[] bArr, int i) throws EndpointTerminatedNetworkException, IOException, EndpointExistException {
        String keyType;
        this.mWearableSEProxy = WearableSEProxy.getInstance();
        ArrayList<String> arrayList = new ArrayList();
        try {
            this.mWearableSEProxy.open_se();
            selectCccApplet();
            arrayList.addAll(list());
            arrayList.size();
            this.mWearableSEProxy.close_se();
            String hexString = ByteUtils.toHexString(bArr);
            boolean z = false;
            for (String str : arrayList) {
                EndpointCertificate endpointCertificateViewEpCa = null;
                try {
                    this.mWearableSEProxy.open_se();
                    selectCccApplet();
                    endpointCertificateViewEpCa = viewEpCa(str);
                    this.mWearableSEProxy.close_se();
                } catch (EndpointTerminatedException unused) {
                    this.mWearableSEProxy.close_se();
                    StringBuilder sb = new StringBuilder();
                    sb.append("The key termniated, deleted anyway");
                    sb.append(str);
                    terminateEpViaServer(context, str);
                    z = true;
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    this.mWearableSEProxy.close_se();
                } catch (CertificateException e2) {
                    e = e2;
                    e.printStackTrace();
                    this.mWearableSEProxy.close_se();
                }
                if (endpointCertificateViewEpCa != null) {
                    String vehicleId = endpointCertificateViewEpCa.getVehicleId();
                    boolean z2 = DEBUG;
                    if (z2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("find vehicleId ");
                        sb2.append(vehicleId);
                    }
                    if (z2) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("to be created vehicleId ");
                        sb3.append(hexString);
                    }
                    if (vehicleId.equalsIgnoreCase(hexString)) {
                        if (i == 1 && (keyType = endpointCertificateViewEpCa.getKeyType()) != null && keyType.equalsIgnoreCase("OWNR")) {
                            throw new EndpointExistException("shared key unable to replace owner key");
                        }
                        terminateEpViaServer(context, str);
                        return true;
                    }
                } else if (DEBUG) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("wrong keyId, skipp ");
                    sb4.append(str);
                }
            }
            return z;
        } catch (Throwable th) {
            this.mWearableSEProxy.close_se();
            throw th;
        }
    }

    public void deselectSe() throws IOException {
        this.mWearableSEProxy = WearableSEProxy.getInstance();
        this.mWearableSEProxy.close_se();
    }

    public EPConfig getConfig(byte[] bArr) {
        if (this.mConfig == null) {
            EPConfig ePConfig = new EPConfig();
            this.mConfig = ePConfig;
            if (bArr != null) {
                ePConfig.loadLongTermConfig(EnvironmentConfig.getContext(), bArr);
            }
        }
        return this.mConfig;
    }

    public int getEPStatus() {
        return this.mOP_status;
    }

    public byte[] getEndpointCertificate(byte[] bArr) throws WearableSEProxy.AppletNotFoundException, IOException, EndpointTerminatedException {
        WearableSEProxy wearableSEProxy = WearableSEProxy.getInstance();
        this.mWearableSEProxy = wearableSEProxy;
        try {
            wearableSEProxy.open_se();
            this.mWearableSEProxy.select(ConstUtils.CCC_APPLET);
            int iSendViewCmd = sendViewCmd(5, bArr);
            if (iSendViewCmd == 0) {
                return null;
            }
            return sendReadBufferCmd(iSendViewCmd);
        } finally {
            this.mWearableSEProxy.close_se();
        }
    }

    public byte[] getKeyAttSig(byte[] bArr, Context context) throws IOException {
        this.mWearableSEProxy = WearableSEProxy.getInstance();
        int iStream2len = ByteUtils.stream2len(getConfig(bArr).getKeyAttOffset(context, bArr));
        byte[] privateData = getPrivateData(bArr, iStream2len, 5);
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("private data TL: ");
            sb.append(ByteUtils.toHexString(privateData));
        }
        int tlvlen = TLVParser.getTlvlen(privateData);
        byte[] bArrConcatenate = null;
        int i = 0;
        int i2 = tlvlen;
        while (i2 > 0) {
            if (i2 > 255) {
                i2 = 255;
            }
            byte[] privateData2 = getPrivateData(bArr, iStream2len + i, i2);
            i += i2;
            i2 = tlvlen - i;
            bArrConcatenate = bArrConcatenate == null ? privateData2 : ByteUtils.concatenate(bArrConcatenate, privateData2);
        }
        if (DEBUG) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("keyatt : ");
            sb2.append(ByteUtils.toHexString(bArrConcatenate));
        }
        return bArrConcatenate;
    }

    public byte[] getPayloadForConfidentialMB(byte[] bArr, byte[] bArr2) {
        return ByteUtils.concatenate(new TLVObject(new byte[]{-105}, bArr).toBytes(), new TLVObject(new byte[]{74}, bArr2).toBytes());
    }

    public byte[] getPrivateData(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArrSendGetPrivateDataCmd = sendGetPrivateDataCmd(bArr, i, i2);
        if (bArrSendGetPrivateDataCmd.length <= 2) {
            return null;
        }
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("get priv rsp: ");
            sb.append(ByteUtils.toHexString(bArrSendGetPrivateDataCmd));
        }
        return ByteUtils.clone(bArrSendGetPrivateDataCmd, 0, bArrSendGetPrivateDataCmd.length - 2);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x001d  */
    public byte[] getWriteBufferPayload() {
        int i;
        char c;
        int length = this.mConfig.getEpId().length;
        int length2 = this.mConfig.getInstanceCAId().length;
        int iCalWritePayloadLen = calWritePayloadLen();
        int i2 = 5;
        if (iCalWritePayloadLen <= 127) {
            i = 3;
            c = 1;
        } else if (iCalWritePayloadLen <= 255) {
            i = 4;
            c = 2;
        } else if (iCalWritePayloadLen <= 65535) {
            i = 5;
            c = 3;
        } else {
            i = 3;
            c = 1;
        }
        byte[] bArr = new byte[i + iCalWritePayloadLen];
        bArr[0] = 127;
        bArr[1] = HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT;
        if (c == 1) {
            bArr[2] = (byte) iCalWritePayloadLen;
            i2 = 3;
        } else if (c == 2) {
            bArr[2] = -127;
            bArr[3] = (byte) iCalWritePayloadLen;
            i2 = 4;
        } else if (c == 3) {
            bArr[2] = -126;
            bArr[3] = (byte) ((65280 & iCalWritePayloadLen) >> 8);
            bArr[4] = (byte) (iCalWritePayloadLen & 255);
        } else {
            i2 = 2;
        }
        bArr[i2] = 77;
        bArr[i2 + 1] = 8;
        System.arraycopy(this.mConfig.getVehicleId(), 0, bArr, i2 + 2, 8);
        bArr[i2 + 10] = 95;
        bArr[i2 + 11] = 32;
        bArr[i2 + 12] = (byte) length;
        int i3 = i2 + 13;
        System.arraycopy(this.mConfig.getEpId(), 0, bArr, i3, length);
        int i4 = i3 + length;
        bArr[i4] = 66;
        bArr[i4 + 1] = (byte) length2;
        int i5 = i4 + 2;
        System.arraycopy(this.mConfig.getInstanceCAId(), 0, bArr, i5, length2);
        int i6 = i5 + length2;
        bArr[i6] = 70;
        bArr[i6 + 1] = 1;
        bArr[i6 + 2] = this.mConfig.getTag46();
        bArr[i6 + 3] = 71;
        bArr[i6 + 4] = 1;
        bArr[i6 + 5] = this.mConfig.getTag47();
        bArr[i6 + 6] = 92;
        bArr[i6 + 7] = 2;
        bArr[i6 + 8] = this.mConfig.getVersion()[0];
        bArr[i6 + 9] = this.mConfig.getVersion()[1];
        bArr[i6 + 10] = 91;
        bArr[i6 + 11] = HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION;
        System.arraycopy(this.mConfig.getVehiclePK(), 0, bArr, i6 + 12, 65);
        bArr[i6 + 77] = 81;
        bArr[i6 + 78] = (byte) this.mConfig.getNotBefore().length;
        int i7 = i6 + 79;
        System.arraycopy(this.mConfig.getNotBefore(), 0, bArr, i7, this.mConfig.getNotBefore().length);
        int length3 = i7 + this.mConfig.getNotBefore().length;
        bArr[length3] = 82;
        bArr[length3 + 1] = (byte) this.mConfig.getNotAfter().length;
        int i8 = length3 + 2;
        System.arraycopy(this.mConfig.getNotAfter(), 0, bArr, i8, this.mConfig.getNotAfter().length);
        int length4 = i8 + this.mConfig.getNotAfter().length;
        if (this.mConfig.getAuthPk() != null) {
            byte[] lenArray = TLVParser.getLenArray(this.mConfig.getAuthPk().length);
            int length5 = lenArray.length;
            bArr[length4] = 73;
            int i9 = length4 + 1;
            System.arraycopy(lenArray, 0, bArr, i9, length5);
            int i10 = i9 + length5;
            System.arraycopy(this.mConfig.getAuthPk(), 0, bArr, i10, this.mConfig.getAuthPk().length);
            length4 = i10 + this.mConfig.getAuthPk().length;
        }
        if (this.mConfig.getConfMbxSize() != null) {
            bArr[length4] = 74;
            bArr[length4 + 1] = 2;
            bArr[length4 + 2] = this.mConfig.getConfMbxSize()[0];
            bArr[length4 + 3] = this.mConfig.getConfMbxSize()[1];
            length4 += 4;
        }
        if (this.mConfig.getPrivMbxSize() != null) {
            bArr[length4] = 75;
            bArr[length4 + 1] = 2;
            bArr[length4 + 2] = this.mConfig.getPrivMbxSize()[0];
            bArr[length4 + 3] = this.mConfig.getPrivMbxSize()[1];
            length4 += 4;
        }
        if (this.mConfig.getKeySlot() != null) {
            int length6 = this.mConfig.getKeySlot().length;
            bArr[length4] = 78;
            bArr[length4 + 1] = (byte) length6;
            int i11 = length4 + 2;
            System.arraycopy(this.mConfig.getKeySlot(), 0, bArr, i11, length6);
            length4 = i11 + length6;
        }
        if (this.mConfig.getCountLimit() != null) {
            bArr[length4] = 87;
            bArr[length4 + 1] = 4;
            System.arraycopy(this.mConfig.getCountLimit(), 0, bArr, length4 + 2, 4);
        }
        return bArr;
    }

    public List<String> list() throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] bArrSendReadBufferCmd = sendReadBufferCmd(sendListCmd());
        byte[] bArr = new byte[20];
        if (bArrSendReadBufferCmd.length % 21 == 0) {
            int length = bArrSendReadBufferCmd.length / 21;
            for (int i = 0; i < length; i++) {
                System.arraycopy(bArrSendReadBufferCmd, (i * 21) + 1, bArr, 0, 20);
                arrayList.add(ByteUtils.toHexString(bArr));
                if (DEBUG) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("list key id: ");
                    sb.append(ByteUtils.toHexString(bArr));
                }
            }
        }
        return arrayList;
    }

    public void openSe() throws IOException {
        this.mWearableSEProxy = WearableSEProxy.getInstance();
        this.mWearableSEProxy.open_se();
    }

    public byte[] selectCccApplet() throws IOException {
        byte[] bArrSelect;
        int i = this.SERetryMaxCount;
        int i2 = this.SERetryInterval;
        for (int i3 = 0; i3 < i; i3++) {
            try {
                bArrSelect = this.mWearableSEProxy.select(ConstUtils.CCC_APPLET);
            } catch (WearableSEProxy.AppletNotFoundException | IOException e) {
                e.printStackTrace();
                if (i3 == i - 1) {
                    throw new IOException();
                }
                bArrSelect = null;
            }
            if (DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("select resp: ");
                sb.append(ByteUtils.toHexString(bArrSelect));
                sb.append(" retry: ");
                sb.append(i3);
            }
            if (bArrSelect != null) {
                return bArrSelect;
            }
            try {
                Thread.sleep(i2);
            } catch (InterruptedException unused) {
                throw new IOException();
            }
        }
        throw new IOException();
    }

    public int sendCreateCmd(byte[] bArr) throws IOException {
        boolean z = DEBUG;
        int iStream2len = 0;
        if (bArr == null) {
            byte[] bArrTransmit = this.mWearableSEProxy.transmit(new byte[]{-128, 112, 0, 0, 0}, false);
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("create EP responser ");
                sb.append(ByteUtils.toHexString(bArrTransmit));
            }
            if (z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("create EP response len: ");
                sb2.append(bArrTransmit.length);
            }
            if (bArrTransmit.length <= 2) {
                throw new IOException();
            }
            byte[] bArr2 = new byte[bArrTransmit.length - 2];
            System.arraycopy(bArrTransmit, 0, bArr2, 0, bArrTransmit.length - 2);
            if (z) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("rsp data: ");
                sb3.append(ByteUtils.toHexString(bArr2));
            }
            iStream2len = ByteUtils.stream2len(bArr2);
            if (z) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("create EP datalen is ");
                sb4.append(iStream2len);
            }
        }
        return iStream2len;
    }

    public byte[] sendCreateEncryptionKeyCmd(byte[] bArr) throws IOException {
        byte[] bArr2 = new byte[27];
        bArr2[0] = -128;
        bArr2[1] = -118;
        bArr2[2] = 0;
        bArr2[3] = 0;
        bArr2[4] = 22;
        bArr2[5] = SettingsModule.VALUE_TYPE_FLAG;
        bArr2[6] = 20;
        System.arraycopy(bArr, 0, bArr2, 7, 20);
        byte[] bArrTransmit = this.mWearableSEProxy.transmit(bArr2, false);
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("create_encryption_key rsp: ");
            sb.append(ByteUtils.toHexString(bArrTransmit));
        }
        return bArrTransmit;
    }

    public byte[] sendDeleteCmd(byte[] bArr) throws IOException {
        byte[] bArr2 = new byte[27];
        bArr2[0] = -128;
        bArr2[1] = 116;
        bArr2[2] = 0;
        bArr2[3] = 0;
        bArr2[4] = 22;
        bArr2[5] = SettingsModule.VALUE_TYPE_FLAG;
        bArr2[6] = 20;
        System.arraycopy(bArr, 0, bArr2, 7, 20);
        byte[] bArrTransmit = this.mWearableSEProxy.transmit(bArr2, false);
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("terminate rsp data : ");
            sb.append(ByteUtils.toHexString(bArrTransmit));
        }
        return bArrTransmit;
    }

    public byte[] sendGetPrivateDataCmd(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = new byte[30];
        bArr2[0] = -128;
        bArr2[1] = 120;
        bArr2[2] = (byte) ((65280 & i) >> 8);
        bArr2[3] = (byte) (i & 255);
        bArr2[4] = 25;
        bArr2[5] = SettingsModule.VALUE_TYPE_FLAG;
        bArr2[6] = 20;
        System.arraycopy(bArr, 0, bArr2, 7, 20);
        bArr2[27] = -128;
        bArr2[28] = 1;
        bArr2[29] = (byte) (i2 & 255);
        return this.mWearableSEProxy.transmit(bArr2, false);
    }

    public int sendListCmd() throws IOException {
        int iStream2len = 0;
        byte[] bArrTransmit = this.mWearableSEProxy.transmit(new byte[]{-128, 118, 0, 0, 0}, false);
        if (bArrTransmit.length > 2) {
            byte[] bArr = new byte[bArrTransmit.length - 2];
            System.arraycopy(bArrTransmit, 0, bArr, 0, bArrTransmit.length - 2);
            iStream2len = ByteUtils.stream2len(bArr);
        }
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("list data len is ");
            sb.append(iStream2len);
        }
        return iStream2len;
    }

    public byte[] sendReadBufferCmd(int i) throws IOException {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("SE read buff: ");
            sb.append(i);
        }
        byte[] bArr = new byte[8];
        int i2 = i > 239 ? 239 : i;
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        while (i > 0) {
            bArr[0] = -128;
            bArr[1] = -80;
            bArr[2] = (byte) ((i3 >> 8) & 255);
            bArr[3] = (byte) (i3 & 255);
            bArr[4] = 3;
            bArr[5] = -128;
            bArr[6] = 1;
            bArr[7] = (byte) i2;
            byte[] bArrTransmit = this.mWearableSEProxy.transmit(bArr, false);
            if (DEBUG) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("read_buffer response ");
                sb2.append(ByteUtils.toHexString(bArrTransmit));
            }
            System.arraycopy(bArrTransmit, 0, bArr2, i3, bArrTransmit.length - 2);
            i -= i2;
            i3 += i2;
            if (i == 0) {
                break;
            }
            i2 = i > 239 ? 239 : i;
        }
        if (DEBUG) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("read_buffer data ");
            sb3.append(ByteUtils.toHexString(bArr2));
        }
        return bArr2;
    }

    public byte[] sendSetConfidDataCmd(byte[] bArr, int i) throws IOException {
        byte[] bArr2 = new byte[27];
        bArr2[0] = -128;
        bArr2[1] = 124;
        bArr2[2] = (byte) ((65280 & i) >> 8);
        bArr2[3] = (byte) (i & 255);
        bArr2[4] = 22;
        bArr2[5] = SettingsModule.VALUE_TYPE_FLAG;
        bArr2[6] = 20;
        System.arraycopy(bArr, 0, bArr2, 7, 20);
        return this.mWearableSEProxy.transmit(bArr2, false);
    }

    public byte[] sendSetPrivateDataCmd(byte[] bArr, int i, byte[] bArr2) throws IOException {
        byte[] bArr3 = new byte[27];
        int length = bArr2.length;
        int i2 = length > 127 ? 3 : 2;
        bArr3[0] = -128;
        bArr3[1] = 122;
        bArr3[2] = (byte) ((65280 & i) >> 8);
        bArr3[3] = (byte) (i & 255);
        bArr3[4] = (byte) (i2 + 22 + length);
        bArr3[5] = SettingsModule.VALUE_TYPE_FLAG;
        bArr3[6] = 20;
        System.arraycopy(bArr, 0, bArr3, 7, 20);
        return this.mWearableSEProxy.transmit(ByteUtils.concatenate(bArr3, ByteUtils.concatenateTLV(new byte[]{75}, bArr2)), false);
    }

    public byte[] sendSetupEndpointCmd(byte[] bArr) throws IOException {
        byte[] auth1ConfidentialMB;
        byte visibilityWiredVolatile;
        byte[] auth1PrivateMB;
        byte[] keySlot;
        byte[] transactionCodeWired;
        byte[] transactionCodeCl;
        byte visibilityWiredPersist;
        byte visibilityWlVolatile;
        byte visibilityWlPersist;
        byte[] bArrConcatenate = new byte[27];
        bArrConcatenate[0] = -128;
        bArrConcatenate[1] = 126;
        bArrConcatenate[2] = 0;
        bArrConcatenate[3] = 0;
        int length = 22;
        bArrConcatenate[4] = (byte) 22;
        bArrConcatenate[5] = SettingsModule.VALUE_TYPE_FLAG;
        bArrConcatenate[6] = 20;
        System.arraycopy(bArr, 0, bArrConcatenate, 7, 20);
        EPConfig ePConfig = this.mConfig;
        if (ePConfig != null) {
            auth1ConfidentialMB = ePConfig.getAuth1ConfidentialMB();
            auth1PrivateMB = this.mConfig.getAuth1PrivateMB();
            keySlot = this.mConfig.getKeySlot();
            visibilityWiredVolatile = this.mConfig.getVisibilityWiredVolatile();
            visibilityWiredPersist = this.mConfig.getVisibilityWiredPersist();
            visibilityWlVolatile = this.mConfig.getVisibilityWlVolatile();
            visibilityWlPersist = this.mConfig.getVisibilityWlPersist();
            transactionCodeWired = this.mConfig.getTransactionCodeWired();
            transactionCodeCl = this.mConfig.getTransactionCodeCl();
        } else {
            auth1ConfidentialMB = null;
            visibilityWiredVolatile = 31;
            auth1PrivateMB = null;
            keySlot = null;
            transactionCodeWired = null;
            transactionCodeCl = null;
            visibilityWiredPersist = 31;
            visibilityWlVolatile = 31;
            visibilityWlPersist = 31;
        }
        if (auth1ConfidentialMB != null) {
            byte[] bArrConcatenateTLV = ByteUtils.concatenateTLV(new byte[]{74}, auth1ConfidentialMB);
            bArrConcatenate = ByteUtils.concatenate(bArrConcatenate, bArrConcatenateTLV);
            length = 22 + bArrConcatenateTLV.length;
        }
        if (auth1PrivateMB != null) {
            byte[] bArrConcatenateTLV2 = ByteUtils.concatenateTLV(new byte[]{75}, auth1PrivateMB);
            bArrConcatenate = ByteUtils.concatenate(bArrConcatenate, bArrConcatenateTLV2);
            length += bArrConcatenateTLV2.length;
        }
        if (keySlot != null) {
            byte[] bArrConcatenateTLV3 = ByteUtils.concatenateTLV(new byte[]{78}, keySlot);
            bArrConcatenate = ByteUtils.concatenate(bArrConcatenate, bArrConcatenateTLV3);
            length += bArrConcatenateTLV3.length;
        }
        if (visibilityWiredVolatile == 1 || visibilityWiredVolatile == 0) {
            byte[] bArrConcatenateTLV4 = ByteUtils.concatenateTLV(new byte[]{-100}, new byte[]{visibilityWiredVolatile});
            bArrConcatenate = ByteUtils.concatenate(bArrConcatenate, bArrConcatenateTLV4);
            length += bArrConcatenateTLV4.length;
        }
        if (visibilityWiredPersist == 1 || visibilityWiredPersist == 0) {
            byte[] bArrConcatenateTLV5 = ByteUtils.concatenateTLV(new byte[]{-101}, new byte[]{visibilityWiredPersist});
            bArrConcatenate = ByteUtils.concatenate(bArrConcatenate, bArrConcatenateTLV5);
            length += bArrConcatenateTLV5.length;
        }
        if (visibilityWlVolatile == 1 || visibilityWlVolatile == 0) {
            byte[] bArrConcatenateTLV6 = ByteUtils.concatenateTLV(new byte[]{-125}, new byte[]{visibilityWlVolatile});
            bArrConcatenate = ByteUtils.concatenate(bArrConcatenate, bArrConcatenateTLV6);
            length += bArrConcatenateTLV6.length;
        }
        if (visibilityWlPersist == 1 || visibilityWlPersist == 0) {
            byte[] bArrConcatenateTLV7 = ByteUtils.concatenateTLV(new byte[]{-126}, new byte[]{visibilityWlPersist});
            bArrConcatenate = ByteUtils.concatenate(bArrConcatenate, bArrConcatenateTLV7);
            length += bArrConcatenateTLV7.length;
        }
        if (transactionCodeWired != null) {
            byte[] bArrConcatenateTLV8 = ByteUtils.concatenateTLV(new byte[]{-123}, transactionCodeWired);
            bArrConcatenate = ByteUtils.concatenate(bArrConcatenate, bArrConcatenateTLV8);
            length += bArrConcatenateTLV8.length;
        }
        if (transactionCodeCl != null) {
            byte[] bArrConcatenateTLV9 = ByteUtils.concatenateTLV(new byte[]{-124}, transactionCodeCl);
            bArrConcatenate = ByteUtils.concatenate(bArrConcatenate, bArrConcatenateTLV9);
            length += bArrConcatenateTLV9.length;
        }
        bArrConcatenate[4] = (byte) length;
        return this.mWearableSEProxy.transmit(bArrConcatenate, false);
    }

    public int sendTerminateCmd(byte[] bArr) throws IOException {
        byte[] bArr2 = new byte[22];
        byte[] bArr3 = new byte[18];
        int iStream2len = 0;
        bArr2[0] = SettingsModule.VALUE_TYPE_FLAG;
        bArr2[1] = 20;
        System.arraycopy(bArr, 0, bArr2, 2, 20);
        bArr3[0] = -111;
        bArr3[1] = 16;
        System.arraycopy(ByteUtils.randomByteArry(16), 0, bArr3, 2, 16);
        byte[] bArrConcatenate = ByteUtils.concatenate(bArr2, bArr3);
        byte[] bArrConcatenate2 = ByteUtils.concatenate(new byte[]{127, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, (byte) bArrConcatenate.length}, bArrConcatenate);
        byte[] bArrTransmit = this.mWearableSEProxy.transmit(ByteUtils.concatenate(new byte[]{-128, 114, 0, 0, (byte) bArrConcatenate2.length}, bArrConcatenate2), false);
        boolean z = DEBUG;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("terminate rsp data : ");
            sb.append(ByteUtils.toHexString(bArrTransmit));
        }
        if (bArrTransmit.length > 2) {
            byte[] bArr4 = new byte[bArrTransmit.length - 2];
            System.arraycopy(bArrTransmit, 0, bArr4, 0, bArrTransmit.length - 2);
            iStream2len = ByteUtils.stream2len(bArr4);
        }
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("terminate datalen is ");
            sb2.append(iStream2len);
        }
        return iStream2len;
    }

    public int sendViewCmd(int i, byte[] bArr) throws IOException, EndpointTerminatedException {
        byte b2;
        byte[] bArr2 = new byte[26];
        int iStream2len = 0;
        if (i == 1) {
            b2 = 1;
        } else if (i == 2) {
            b2 = 4;
        } else if (i == 3) {
            b2 = -124;
        } else if (i != 4) {
            b2 = i != 5 ? (byte) 0 : (byte) 2;
        } else {
            b2 = -123;
        }
        bArr2[0] = -128;
        bArr2[1] = 118;
        bArr2[2] = b2;
        bArr2[3] = 0;
        bArr2[4] = 20;
        System.arraycopy(bArr, 0, bArr2, 5, 20);
        bArr2[25] = 0;
        byte[] bArrTransmit = this.mWearableSEProxy.transmit(bArr2, false);
        if (bArrTransmit == null) {
            throw new IOException(" IO exception");
        }
        if (bArrTransmit.length > 2) {
            byte[] bArr3 = new byte[bArrTransmit.length - 2];
            System.arraycopy(bArrTransmit, 0, bArr3, 0, bArrTransmit.length - 2);
            iStream2len = ByteUtils.stream2len(bArr3);
        } else if (ByteUtils.equals(bArrTransmit, new byte[]{106, -120})) {
            throw new EndpointTerminatedException("key terminated");
        }
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("view EP len is: ");
            sb.append(iStream2len);
        }
        return iStream2len;
    }

    public byte[] sendWriteBufferCmd(byte[] bArr) throws IOException {
        int length = bArr.length;
        byte[] bArrTransmit = null;
        int i = length;
        int i2 = 0;
        while (i > 0) {
            int i3 = i <= 239 ? i : 239;
            byte[] bArr2 = new byte[i3 + 5];
            boolean z = DEBUG;
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("remaining_len ");
                sb.append(i);
            }
            bArr2[0] = -128;
            bArr2[1] = -48;
            bArr2[2] = (byte) ((i2 >> 8) & 255);
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) i3;
            System.arraycopy(bArr, i2, bArr2, 5, i3);
            i2 += i3;
            i = length - i2;
            bArrTransmit = this.mWearableSEProxy.transmit(bArr2, false);
            if (z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("write buffer responser ");
                sb2.append(ByteUtils.toHexString(bArrTransmit));
            }
        }
        if (DEBUG) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("return rsp ");
            sb3.append(ByteUtils.toHexString(bArrTransmit));
        }
        return bArrTransmit;
    }

    public byte[] setConfidentialData(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) throws WearableSEProxy.AppletNotFoundException, IOException {
        byte[] payloadForConfidentialMB = getPayloadForConfidentialMB(bArr2, bArr3);
        boolean z = DEBUG;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("getPayloadForConfidentialMB rsp: ");
            sb.append(ByteUtils.toHexString(payloadForConfidentialMB));
        }
        byte[] bArrSendWriteBufferCmd = sendWriteBufferCmd(payloadForConfidentialMB);
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("writedata rsp: ");
            sb2.append(ByteUtils.toHexString(bArrSendWriteBufferCmd));
        }
        byte[] bArrSendSetConfidDataCmd = sendSetConfidDataCmd(bArr, i);
        if (z) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("setConfidentialData rsp: ");
            sb3.append(ByteUtils.toHexString(bArrSendSetConfidDataCmd));
        }
        return bArrSendSetConfidDataCmd;
    }

    public void setConfig(EPConfig ePConfig) {
        this.mConfig = ePConfig;
    }

    public void setEPStatus(int i) {
        this.mOP_status = i;
    }

    public byte[] setPrivateData(byte[] bArr, int i, byte[] bArr2) throws IOException {
        boolean z = DEBUG;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("setpriv offset: ");
            sb.append(i);
            sb.append(" data: ");
            sb.append(ByteUtils.toHexString(bArr2));
        }
        byte[] bArrSendSetPrivateDataCmd = sendSetPrivateDataCmd(bArr, i, bArr2);
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("setpriv rsp: ");
            sb2.append(ByteUtils.toHexString(bArrSendSetPrivateDataCmd));
        }
        return bArrSendSetPrivateDataCmd;
    }

    public boolean setPrivateMailboxBit(byte[] bArr, int i, int i2) throws IOException {
        byte[] privateData = getPrivateData(bArr, i2, 1);
        if (privateData == null) {
            return false;
        }
        byte b2 = privateData[0];
        boolean z = DEBUG;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("before set: Data: ");
            sb.append((int) b2);
        }
        byte[] privateData2 = setPrivateData(bArr, i2, new byte[]{(byte) ((1 << i) | b2)});
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("setPrivateMailboxBit rsp: ");
            sb2.append(ByteUtils.toHexString(privateData2));
        }
        return true;
    }

    public boolean setupEndpoint(byte[] bArr) throws IOException {
        byte[] bArrSendSetupEndpointCmd = sendSetupEndpointCmd(bArr);
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("SETUP ENDPOINT RSP: ");
            sb.append(ByteUtils.toHexString(bArrSendSetupEndpointCmd));
        }
        return ByteUtils.equals(ConstUtils.SW_OK, bArrSendSetupEndpointCmd);
    }

    public byte[] setupEndpointVisibility(byte[] bArr, byte b2) throws IOException {
        byte[] bArr2 = new byte[30];
        bArr2[0] = -128;
        bArr2[1] = 126;
        bArr2[2] = 0;
        bArr2[3] = 0;
        bArr2[4] = 25;
        bArr2[5] = SettingsModule.VALUE_TYPE_FLAG;
        bArr2[6] = 20;
        System.arraycopy(bArr, 0, bArr2, 7, 20);
        bArr2[27] = -126;
        bArr2[28] = 1;
        bArr2[29] = b2;
        return this.mWearableSEProxy.transmit(bArr2, false);
    }

    public void storeTerminationAttestation(String str) throws IOException {
        boolean z = DEBUG;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("terminate for key_id: ");
            sb.append(str);
        }
        WearableSEProxy wearableSEProxy = WearableSEProxy.getInstance();
        this.mWearableSEProxy = wearableSEProxy;
        try {
            wearableSEProxy.open_se();
            selectCccApplet();
            byte[] bArrFromHexString = ByteUtils.fromHexString(str);
            int iSendTerminateCmd = sendTerminateCmd(bArrFromHexString);
            if (iSendTerminateCmd > 0) {
                byte[] bArrSendReadBufferCmd = sendReadBufferCmd(iSendTerminateCmd);
                if (z) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("terminate Attestation : ");
                    sb2.append(ByteUtils.toHexString(bArrSendReadBufferCmd));
                }
                getConfig(bArrFromHexString).setDuplicateVehicleIdKeyId(bArrFromHexString);
                getConfig(bArrFromHexString).setDuplicateVehicleIdTerminationAttestation(bArrSendReadBufferCmd);
            }
        } finally {
            this.mWearableSEProxy.close_se();
        }
    }

    public void terminateEpViaServer(Context context, String str) throws EndpointTerminatedNetworkException, IOException {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("terminate via server for key_id: ");
            sb.append(str);
        }
        storeTerminationAttestation(str);
        byte[] bArrFromHexString = ByteUtils.fromHexString(str);
        if (!ByteUtils.equals(TSMProxy.getInstance(context).KTS_terminate(bArrFromHexString), ConstUtils.SW_OK)) {
            throw new EndpointTerminatedNetworkException("terminate fail from server");
        }
        EPConfig.removeLongTermConf(context, bArrFromHexString);
    }

    public EndpointCertificate viewEpCa(String str) throws IOException, CertificateException, EndpointTerminatedException {
        byte[] bArrFromHexString = ByteUtils.fromHexString(str);
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("view for key_id: ");
            sb.append(ByteUtils.toHexString(bArrFromHexString));
        }
        int iSendViewCmd = sendViewCmd(5, bArrFromHexString);
        if (iSendViewCmd != 0) {
            return new EndpointCertificate(sendReadBufferCmd(iSendViewCmd));
        }
        throw new IOException();
    }

    public byte[] writeKeyAttSig(byte[] bArr, int i, byte[] bArr2) throws IOException {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("write_KeyAtt_sig offset: ");
            sb.append(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("write_KeyAtt_sig data: ");
            sb2.append(ByteUtils.toHexString(bArr2));
        }
        int length = bArr2.length;
        if (length - (bArr2.length > 219 ? 219 : bArr2.length) == 0) {
            return setPrivateData(bArr, i, bArr2);
        }
        byte[] bArr3 = null;
        int i2 = 0;
        while (length > 0) {
            int i3 = length > 219 ? 219 : length;
            byte[] privateData = setPrivateData(bArr, i, ByteUtils.clone(bArr2, i2, i3));
            i += i3;
            i2 += i3;
            length -= i3;
            bArr3 = privateData;
        }
        return bArr3;
    }
}
