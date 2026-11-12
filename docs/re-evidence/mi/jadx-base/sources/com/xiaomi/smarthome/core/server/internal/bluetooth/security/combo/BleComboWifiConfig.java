package com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes10.dex */
public class BleComboWifiConfig implements Parcelable {
    public static final Parcelable.Creator<BleComboWifiConfig> CREATOR = new Parcelable.Creator<BleComboWifiConfig>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboWifiConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BleComboWifiConfig createFromParcel(Parcel parcel) {
            return new BleComboWifiConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BleComboWifiConfig[] newArray(int i) {
            return new BleComboWifiConfig[i];
        }
    };
    private static final String TAG = "com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboWifiConfig";
    private static final int TYPE_BINDKEY_INDEX = 13;
    private static final int TYPE_BINDKEY_TIMESTAMP = 14;
    private static final int TYPE_BIND_KEY = 9;
    private static final int TYPE_CONFIG_TYPE = 8;
    private static final int TYPE_COUNTRY_CODE = 10;
    private static final int TYPE_COUNTRY_DOMAIN = 6;
    private static final int TYPE_GMT_OFFSET = 5;
    private static final int TYPE_LN_TYPE = 15;
    private static final int TYPE_LOCK_WIFI_TOKEN = 12;
    private static final int TYPE_PASSPORT_URL = 11;
    private static final int TYPE_PWD = 2;
    private static final int TYPE_ROUTER_BAND = 19;
    private static final int TYPE_ROUTER_BSSID = 16;
    private static final int TYPE_ROUTER_CHANNEL = 18;
    private static final int TYPE_ROUTER_EXTRAS = 20;
    private static final int TYPE_ROUTER_SECURITY = 17;
    private static final int TYPE_SSID = 1;
    private static final int TYPE_TIME_ZONE = 7;
    private static final int TYPE_UID = 0;
    private static final int TYPE_WUGAN_MESSAGE = 22;
    private static final int TYPE_WUGAN_RANDOM = 21;
    public String bindIndex;
    public String bindKey;
    public long bindTimestamp;
    public String bleToken;
    public String configType;
    public String countryCode;
    public String countryDomain;
    public int gmtOffset;
    public String lnType;
    public String passportUrl;
    public String password;
    public String router_extras;
    public String ssid;
    public String timezone;
    public String uid;
    public String wuganConfirmMessage;
    public String wuganRandomKey;

    public BleComboWifiConfig() {
        this.uid = "";
        this.ssid = "";
        this.password = "";
        this.countryDomain = "";
        this.timezone = "";
        this.configType = "";
        this.bindKey = "";
        this.countryCode = "";
        this.passportUrl = "";
        this.bleToken = "";
        this.bindIndex = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] toBytes() {
        long j;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        BluetoothMyLogger.v(String.format(TAG + " sendUserId = %s", this.uid));
        byteBufferOrder.put((byte) 0);
        if (TextUtils.isEmpty(this.uid)) {
            j = 0;
        } else {
            try {
                j = Long.parseLong(this.uid);
            } catch (Throwable th) {
                BluetoothLog.e(th);
                j = 0;
            }
        }
        if (j < 0) {
            j = 0;
        }
        byte[] bArrFromLong = ByteUtils.fromLong(j);
        byteBufferOrder.put((byte) bArrFromLong.length);
        byteBufferOrder.put(bArrFromLong);
        byteBufferOrder.put((byte) 1);
        if (TextUtils.isEmpty(this.ssid)) {
            byteBufferOrder.put((byte) 0);
        } else {
            byteBufferOrder.put((byte) this.ssid.getBytes().length);
            byteBufferOrder.put(this.ssid.getBytes());
        }
        byteBufferOrder.put((byte) 2);
        if (TextUtils.isEmpty(this.password)) {
            byteBufferOrder.put((byte) 0);
        } else {
            byteBufferOrder.put((byte) this.password.getBytes().length);
            byteBufferOrder.put(this.password.getBytes());
        }
        StringBuilder sb = new StringBuilder();
        String str = TAG;
        sb.append(str);
        sb.append(" gmt_offset = %d");
        BluetoothMyLogger.v(String.format(sb.toString(), Integer.valueOf(this.gmtOffset)));
        byteBufferOrder.put((byte) 5);
        byteBufferOrder.put((byte) 4);
        byteBufferOrder.put(ByteUtils.fromInt(this.gmtOffset));
        BluetoothMyLogger.v(String.format(str + " country_domain = %s", this.countryDomain));
        byteBufferOrder.put((byte) 6);
        byteBufferOrder.put((byte) 3);
        byte[] bArr = {0, 0, 0};
        if (!TextUtils.isEmpty(this.countryDomain)) {
            ByteUtils.copy(bArr, this.countryDomain.getBytes(), 0, 0);
        }
        byteBufferOrder.put(bArr);
        BluetoothMyLogger.v(String.format(str + " timezone = %s", this.timezone));
        byteBufferOrder.put((byte) 7);
        if (TextUtils.isEmpty(this.timezone)) {
            byteBufferOrder.put((byte) 0);
        } else {
            byteBufferOrder.put((byte) this.timezone.getBytes().length);
            byteBufferOrder.put(this.timezone.getBytes());
        }
        BluetoothMyLogger.v(String.format(str + " config_type = %s", this.configType));
        byteBufferOrder.put((byte) 8);
        if (TextUtils.isEmpty(this.configType)) {
            byteBufferOrder.put((byte) 0);
        } else {
            byteBufferOrder.put((byte) this.configType.getBytes().length);
            byteBufferOrder.put(this.configType.getBytes());
        }
        BluetoothMyLogger.v(String.format(str + " bind_key = %s", this.bindKey));
        byteBufferOrder.put((byte) 9);
        if (TextUtils.isEmpty(this.bindKey)) {
            byteBufferOrder.put((byte) 0);
        } else {
            byteBufferOrder.put((byte) this.bindKey.getBytes().length);
            byteBufferOrder.put(this.bindKey.getBytes());
        }
        BluetoothMyLogger.v(String.format(str + " country_code = %s", this.countryCode));
        byteBufferOrder.put((byte) 10);
        if (TextUtils.isEmpty(this.countryCode)) {
            byteBufferOrder.put((byte) 0);
        } else {
            byteBufferOrder.put((byte) this.countryCode.getBytes().length);
            byteBufferOrder.put(this.countryCode.getBytes());
        }
        BluetoothMyLogger.v(String.format(str + " passportUrl = %s", this.passportUrl));
        if (!TextUtils.isEmpty(this.passportUrl)) {
            byteBufferOrder.put((byte) 11);
            byteBufferOrder.put((byte) this.passportUrl.getBytes().length);
            byteBufferOrder.put(this.passportUrl.getBytes());
        }
        BluetoothMyLogger.v(String.format(str + " ble token = %s", this.bleToken));
        if (!TextUtils.isEmpty(this.bleToken)) {
            byteBufferOrder.put(AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT);
            byte[] bArrStringToBytes = ByteUtils.stringToBytes(this.bleToken);
            byteBufferOrder.put((byte) bArrStringToBytes.length);
            byteBufferOrder.put(bArrStringToBytes);
        }
        BluetoothMyLogger.v(String.format(str + " bindIndex = %s", this.bindIndex));
        if (!TextUtils.isEmpty(this.bindIndex)) {
            byteBufferOrder.put(HMProSyncDataBaseProfile.DATA_TYPE_PAI);
            byte[] bytes = this.bindIndex.getBytes();
            byteBufferOrder.put((byte) bytes.length);
            byteBufferOrder.put(bytes);
        }
        BluetoothMyLogger.v(String.format(str + " bindTimestamp = %s", Long.valueOf(this.bindTimestamp)));
        if (this.bindTimestamp > 0) {
            byteBufferOrder.put(HMProSyncDataBaseProfile.DATA_TYPE_COACHING);
            byte[] bArrFromLong2 = ByteUtils.fromLong(this.bindTimestamp);
            byteBufferOrder.put((byte) bArrFromLong2.length);
            byteBufferOrder.put(bArrFromLong2);
        }
        BluetoothMyLogger.v(String.format(str + " lnType = %s", this.lnType));
        if (!TextUtils.isEmpty(this.lnType)) {
            byteBufferOrder.put((byte) 15);
            byte[] bytes2 = this.lnType.getBytes();
            byteBufferOrder.put((byte) bytes2.length);
            byteBufferOrder.put(bytes2);
        }
        BluetoothMyLogger.v(String.format(str + " router_extra = %s", BluetoothMyLogger.getBase64(this.router_extras)));
        if (!TextUtils.isEmpty(this.router_extras)) {
            byteBufferOrder.put((byte) 20);
            byteBufferOrder.put((byte) (this.router_extras.length() / 2));
            byteBufferOrder.put(ByteUtils.stringToBytes(this.router_extras));
        }
        BluetoothMyLogger.v(String.format(str + " wuganRandom = %s, wuganMsg", BluetoothMyLogger.getBase64(this.wuganRandomKey), BluetoothMyLogger.getBase64(this.wuganConfirmMessage)));
        if (!TextUtils.isEmpty(this.wuganRandomKey) && !TextUtils.isEmpty(this.wuganConfirmMessage)) {
            byteBufferOrder.put((byte) 21);
            byte[] bytes3 = this.lnType.getBytes();
            byteBufferOrder.put((byte) bytes3.length);
            byteBufferOrder.put(bytes3);
            byteBufferOrder.put((byte) 22);
            byte[] bytes4 = this.lnType.getBytes();
            byteBufferOrder.put((byte) bytes4.length);
            byteBufferOrder.put(bytes4);
        }
        int iPosition = byteBufferOrder.position();
        byte[] bArr2 = new byte[iPosition];
        System.arraycopy(byteBufferOrder.array(), 0, bArr2, 0, iPosition);
        return bArr2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.ssid);
        parcel.writeString(this.password);
        parcel.writeInt(this.gmtOffset);
        parcel.writeString(this.countryDomain);
        parcel.writeString(this.timezone);
        parcel.writeString(this.configType);
        parcel.writeString(this.bindKey);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.passportUrl);
        parcel.writeString(this.bleToken);
        parcel.writeString(this.bindIndex);
        parcel.writeLong(this.bindTimestamp);
        parcel.writeString(this.lnType);
        parcel.writeString(this.router_extras);
        parcel.writeString(this.wuganRandomKey);
        parcel.writeString(this.wuganConfirmMessage);
    }

    public BleComboWifiConfig(Parcel parcel) {
        this.uid = "";
        this.ssid = "";
        this.password = "";
        this.countryDomain = "";
        this.timezone = "";
        this.configType = "";
        this.bindKey = "";
        this.countryCode = "";
        this.passportUrl = "";
        this.bleToken = "";
        this.bindIndex = "";
        this.uid = parcel.readString();
        this.ssid = parcel.readString();
        this.password = parcel.readString();
        this.gmtOffset = parcel.readInt();
        this.countryDomain = parcel.readString();
        this.timezone = parcel.readString();
        this.configType = parcel.readString();
        this.bindKey = parcel.readString();
        this.countryCode = parcel.readString();
        this.passportUrl = parcel.readString();
        this.bleToken = parcel.readString();
        this.bindIndex = parcel.readString();
        this.bindTimestamp = parcel.readLong();
        this.lnType = parcel.readString();
        this.router_extras = parcel.readString();
        this.wuganRandomKey = parcel.readString();
        this.wuganConfirmMessage = parcel.readString();
    }
}
