package com.xiaomi.smarthome.device;

import android.content.Intent;
import android.net.wifi.ScanResult;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class Device implements Cloneable, Serializable, Parcelable {
    public static final int COM_FLAG_CARD_STYLE_BIG = 64;
    public static final int COM_FLAG_NORMAL = 1;
    public static final int COM_FLAG_SUPER = 256;
    public static final Parcelable.Creator<Device> CREATOR = new Parcelable.Creator<Device>() { // from class: com.xiaomi.smarthome.device.Device.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Device createFromParcel(Parcel parcel) {
            return new Device(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Device[] newArray(int i) {
            return new Device[i];
        }
    };
    public static int HIDE_MODE_HIDE_MAIN_LIST = 1;
    public static int HIDE_MODE_SHOW_MAIN_LIST = 0;
    public static int PERMISSION_AGGREGATE = 64;
    public static int PERMISSION_FAMILY = 8;
    public static int PERMISSION_NONE = 65296;
    public static int PERMISSION_NONE_MASK = 30;
    public static int PERMISSION_OWNER = 16;
    public static int PERMISSION_SHARE = 4;
    public static int PERMISSION_SHARE_READONLY = 32;
    public static int PID_BLE_MESH = 16;
    public static int PID_BLUETOOTH = 6;
    public static final int PID_CAMERA = 1;
    public static int PID_CLOUD = 2;
    public static int PID_IR_CONTROL = 15;
    public static int PID_MIIO = 0;
    public static int PID_NBIOT = 13;
    public static int PID_SUBDEVICE = 3;
    public static int PID_VIRTUAL_DEVICE = 5;
    public static int PID_VIRTUAL_GROUP = 17;
    public static final int PID_VIRTUAL_MIIO = 24685;
    public static int PID_WEBSOCKET = 4;
    public static int PID_YUNYI = 1;
    public static int SHOW_HIDDEN = 0;
    private static final String TAG = "SmarthomeDevice";
    public static final int VOICECTRL_OTHER = 1;
    public static final int VOICECTRL_XIAOAI = 2;
    public static final byte VOICE_CTRL_GENERAL_VC = 1;
    public static final byte VOICE_CTRL_NON_VC = 0;
    public static final byte VOICE_CTRL_XIAOAI_VC = 2;
    public int accessType;
    public String bssid;
    public boolean canAuth;
    public boolean canUseNotBind;
    public int comFlag;
    public String descNew;
    public String descTimeJString;
    public String did;
    public int ethType;
    public String event;
    private JSONObject extra;

    @Deprecated
    public boolean freqFlag;
    public int hideMode;
    private String icon;
    public String ip;
    public boolean isConnected;
    public boolean isNew;
    public boolean isOnline;
    public long lastModified;
    public long lastOnline;
    public double latitude;
    private String localIP;
    public Location location;
    public double longitude;
    private String mPropInfo;
    public String mac;
    public String meshId;
    public JSONArray method;
    private String methodInfo;
    public String model;
    public String name;
    public String orderTimeJString;
    public String ownerId;
    public String ownerName;
    public String parentId;
    public String parentModel;
    public String partnerId;
    public int permitLevel;
    public int pid;
    public JSONObject propInfo;
    public Bundle property;
    public int resetFlag;
    public int rssi;
    public int rssiNumber;
    public ScanResult scanResult;
    public boolean scrollTo;

    @Deprecated
    public int showMode;
    public String sn;
    public int sort;
    public String specUrn;
    public String ssid;
    public String token;
    public String userId;
    public byte voiceCtrl;

    public enum Location implements Parcelable {
        UNKNOWN,
        LOCAL,
        REMOTE;

        public static final Parcelable.Creator<Location> CREATOR = new Parcelable.Creator<Location>() { // from class: com.xiaomi.smarthome.device.Device.Location.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Location createFromParcel(Parcel parcel) {
                return Location.values()[parcel.readInt()];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Location[] newArray(int i) {
                return new Location[i];
            }
        };

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public Device() {
        this.userId = "";
        this.rssiNumber = 0;
        this.isOnline = true;
        this.canAuth = true;
        this.canUseNotBind = false;
        this.isConnected = true;
        this.property = new Bundle();
        this.scrollTo = false;
        this.orderTimeJString = "";
        this.lastOnline = 0L;
        this.freqFlag = true;
        this.comFlag = 0;
    }

    public void addExtraInfo(String str, long j) {
        try {
            getExtra().put(str, j);
        } catch (Throwable unused) {
        }
    }

    public synchronized boolean canAuth() {
        return this.canAuth;
    }

    public synchronized boolean canUseNotBind() {
        return this.canUseNotBind;
    }

    public void cloneTo(Device device) {
        device.did = this.did;
        device.token = this.token;
        device.name = this.name;
        device.userId = this.userId;
        device.model = this.model;
        device.location = this.location;
        device.latitude = this.latitude;
        device.longitude = this.longitude;
        device.bssid = this.bssid;
        device.ssid = this.ssid;
        device.showMode = this.showMode;
        device.hideMode = this.hideMode;
        device.pid = this.pid;
        device.rssi = this.rssi;
        device.resetFlag = this.resetFlag;
        device.permitLevel = this.permitLevel;
        device.sort = this.sort;
        device.lastModified = this.lastModified;
        device.parentId = this.parentId;
        device.parentModel = this.parentModel;
        device.ip = this.ip;
        device.mac = this.mac;
        device.ownerName = this.ownerName;
        device.ownerId = this.ownerId;
        device.extra = this.extra;
        device.event = this.event;
        device.icon = this.icon;
        device.descNew = this.descNew;
        device.descTimeJString = this.descTimeJString;
        device.isNew = this.isNew;
        device.isOnline = this.isOnline;
        device.scrollTo = this.scrollTo;
        device.canAuth = this.canAuth;
        device.canUseNotBind = this.canUseNotBind;
        device.isConnected = this.isConnected;
        device.propInfo = this.propInfo;
        device.method = this.method;
        device.scanResult = this.scanResult;
        device.specUrn = this.specUrn;
        device.voiceCtrl = this.voiceCtrl;
        device.freqFlag = this.freqFlag;
        device.comFlag = this.comFlag;
        device.property.clear();
        device.property.putAll(this.property);
        device.localIP = this.localIP;
        device.mPropInfo = this.mPropInfo;
        device.methodInfo = this.methodInfo;
        device.ethType = this.ethType;
        device.orderTimeJString = getOrderTimeJString();
        device.sn = this.sn;
        device.accessType = this.accessType;
        device.partnerId = this.partnerId;
        device.meshId = this.meshId;
        device.lastOnline = this.lastOnline;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        String str = this.did;
        return str != null && str.equals(device.did);
    }

    public synchronized String getBleFwVersion() {
        return getExtra().optString("ble_fw_ver");
    }

    public synchronized String getBssid() {
        return this.bssid;
    }

    public int getComFlag() {
        return this.comFlag;
    }

    public synchronized String getDescNew() {
        return this.descNew;
    }

    public synchronized String getDid() {
        return this.did;
    }

    public synchronized String getEventInfo() {
        return this.event;
    }

    public JSONObject getExtra() {
        if (this.extra == null) {
            this.extra = new JSONObject();
        }
        return this.extra;
    }

    public synchronized String getExtraInfo() {
        return getExtra().toString();
    }

    public boolean getFreqFlag() {
        return this.freqFlag;
    }

    public synchronized String getFwVersion() {
        return getExtra().optString("fw_version");
    }

    public synchronized int getHideMode() {
        return this.hideMode;
    }

    public synchronized String getIcon() {
        return this.icon;
    }

    public int getIsSetPinCode() {
        return getExtra().optInt("isSetPincode");
    }

    public synchronized String getKeyId() {
        return getExtra().optString("keyid", "");
    }

    public long getLastOnline() {
        return this.lastOnline;
    }

    public synchronized double getLatitude() {
        return this.latitude;
    }

    public synchronized String getLocalIP() {
        return this.localIP;
    }

    public synchronized Location getLocation() {
        return this.location;
    }

    public synchronized long getLockShareCreateTime() {
        return getExtra().optLong(MiuiCursorConstants.CREATE_TIME, -1L);
    }

    public synchronized double getLongitude() {
        return this.longitude;
    }

    public synchronized String getMac() {
        return this.mac;
    }

    public String getMeshId() {
        return this.meshId;
    }

    public synchronized String getMethodInfo() {
        return this.methodInfo;
    }

    public synchronized String getModel() {
        return this.model;
    }

    public String getName() {
        return TextUtils.isEmpty(this.name) ? this.did : this.name;
    }

    public synchronized int getNewKeyId() {
        return getExtra().optInt("key_id", -100111);
    }

    public String getOrderTimeJString() {
        return this.orderTimeJString;
    }

    public synchronized String getOwnerId() {
        return this.ownerId;
    }

    public synchronized String getOwnerName() {
        return this.ownerName;
    }

    public synchronized String getParentId() {
        return this.parentId;
    }

    public synchronized String getParentModel() {
        return this.parentModel;
    }

    public String getPartnerId() {
        return this.partnerId;
    }

    public synchronized int getPermitLevel() {
        return this.permitLevel;
    }

    public synchronized int getPid() {
        return this.pid;
    }

    public synchronized int getPinCodeType() {
        return getExtra().optInt("pincodeType");
    }

    public synchronized String getPropInfo() {
        return this.mPropInfo;
    }

    public synchronized int getResetFlag() {
        return this.resetFlag;
    }

    public synchronized int getRssi() {
        return this.rssi;
    }

    public synchronized int getShowMode() {
        return this.showMode;
    }

    public synchronized String getSpecUrn() {
        return this.specUrn;
    }

    public synchronized String getSsid() {
        return this.ssid;
    }

    public synchronized String getToken() {
        return this.token;
    }

    public byte getVoiceCtrl() {
        return this.voiceCtrl;
    }

    public String getmDescTimeJString() {
        return this.descTimeJString;
    }

    public boolean hasShortcut() {
        return true;
    }

    public int hashCode() {
        return TextUtils.isEmpty(this.did) ? super.hashCode() : this.did.hashCode();
    }

    public void initialLocal() {
        this.location = Location.REMOTE;
    }

    public boolean isBigStyle() {
        return (this.comFlag & 64) == 64;
    }

    public boolean isBinded() {
        return (this.permitLevel & PERMISSION_NONE_MASK) != 0;
    }

    public boolean isFamily() {
        return ((this.permitLevel & PERMISSION_NONE_MASK) & PERMISSION_FAMILY) != 0;
    }

    public boolean isHideMainList() {
        return this.hideMode != SHOW_HIDDEN;
    }

    public boolean isHomeShared() {
        int i = this.permitLevel;
        return ((PERMISSION_SHARE & i) == 0 || (i & PERMISSION_AGGREGATE) == 0) ? false : true;
    }

    public boolean isLocal() {
        return this.location == Location.LOCAL;
    }

    public boolean isMiioBinded() {
        return ((this.permitLevel & PERMISSION_SHARE) == 0 || !TextUtils.isEmpty(this.ownerName)) && (this.permitLevel & PERMISSION_NONE_MASK) != 0;
    }

    public synchronized boolean isOnline() {
        return this.isOnline;
    }

    public boolean isOnlineAdvance() {
        return this.isOnline;
    }

    public boolean isOpen() {
        return true;
    }

    public boolean isOwner() {
        return ((this.permitLevel & PERMISSION_NONE_MASK) & PERMISSION_OWNER) != 0;
    }

    public boolean isSameDevice(Device device) {
        if (device != null) {
            return TextUtils.equals(getDid(), device.getDid());
        }
        return false;
    }

    public boolean isShared() {
        return (!this.canAuth || (this.permitLevel & PERMISSION_SHARE) == 0 || TextUtils.isEmpty(this.ownerName)) ? false : true;
    }

    public boolean isSharedReadOnly() {
        return (!this.canAuth || (this.permitLevel & PERMISSION_SHARE_READONLY) == 0 || TextUtils.isEmpty(this.ownerName)) ? false : true;
    }

    @Deprecated
    public boolean isShowMainList() {
        return this.showMode > SHOW_HIDDEN;
    }

    public boolean isSubDevice() {
        return !TextUtils.isEmpty(this.parentId);
    }

    public boolean isVirtualDevice() {
        return this.pid == PID_VIRTUAL_DEVICE;
    }

    public void parseEvent(String str) {
    }

    public void parseFromJSONObject(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.did = jSONObject.optString("did");
        this.model = jSONObject.optString("model");
        this.name = jSONObject.optString("name");
        this.userId = jSONObject.optString("uid");
        this.mac = jSONObject.optString("mac");
        this.isOnline = jSONObject.optBoolean("isOnline");
        this.pid = jSONObject.optInt("pid");
        this.permitLevel = jSONObject.optInt("permitLevel");
        this.resetFlag = jSONObject.optInt("resetFlag");
        this.rssi = jSONObject.optInt("rssi", 0);
        this.token = jSONObject.optString("token");
        this.localIP = jSONObject.optString("localip");
        this.longitude = jSONObject.optDouble("longitude");
        this.latitude = jSONObject.optDouble("latitude");
        this.ssid = jSONObject.optString("ssid");
        this.bssid = jSONObject.optString(DeviceTagInterface.ROUTER_BSSID);
        this.showMode = jSONObject.optInt("show_mode");
        this.hideMode = jSONObject.optInt("hide_mode");
        this.icon = jSONObject.optString("subclass_id");
        this.parentId = jSONObject.optString("parent_id");
        this.parentModel = jSONObject.optString("parent_model");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(CardInfo.KEY_OWNER);
        if (jSONObjectOptJSONObject != null) {
            this.ownerName = jSONObjectOptJSONObject.optString("nickname");
            this.ownerId = jSONObjectOptJSONObject.optString(AuthorizeActivityBase.KEY_USERID);
            if (TextUtils.isEmpty(this.ownerName)) {
                this.ownerName = this.ownerId;
            }
        }
        if (this.pid == PID_VIRTUAL_DEVICE) {
            this.canUseNotBind = true;
            this.isOnline = true;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("prop");
        if (jSONObjectOptJSONObject2 != null) {
            this.propInfo = jSONObjectOptJSONObject2;
            this.mPropInfo = jSONObjectOptJSONObject2.toString();
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("method");
        if (jSONArrayOptJSONArray != null) {
            this.method = jSONArrayOptJSONArray;
            this.methodInfo = jSONArrayOptJSONArray.toString();
        }
        this.extra = jSONObject.optJSONObject("extra");
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("event");
        if (jSONObjectOptJSONObject3 != null) {
            this.event = jSONObjectOptJSONObject3.toString();
        }
        this.descNew = jSONObject.optString("desc_new");
        if (!TextUtils.isEmpty(jSONObject.optString("spec_type"))) {
            this.specUrn = jSONObject.optString("spec_type");
        }
        this.voiceCtrl = (byte) jSONObject.optInt("voice_ctrl");
        this.freqFlag = jSONObject.optBoolean("freqFlag", true);
        this.comFlag = jSONObject.optInt("comFlag", 0);
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("desc_time");
        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
            this.descTimeJString = jSONArrayOptJSONArray2.toString();
        }
        this.orderTimeJString = jSONObject.optString("orderTime", "");
        this.ethType = jSONObject.optInt("eth_type");
        this.sn = jSONObject.optString("sn");
        this.accessType = jSONObject.optInt(ThirdPartAccessConstants.KEY_ACCESS_TYPE);
        this.partnerId = jSONObject.optString("partner_id");
        this.meshId = jSONObject.optString("mesh_id");
        this.lastOnline = jSONObject.optLong("last_online", 0L);
        parseProp();
        initialLocal();
    }

    public void parseProp() {
    }

    public void set(Device device) {
        device.cloneTo(this);
    }

    public synchronized void setBleFwVersion(String str) {
        addExtraInfo("ble_fw_ver", str);
    }

    public synchronized void setBssid(String str) {
        this.bssid = str;
    }

    public void setComFlag(int i) {
        this.comFlag = i;
    }

    public synchronized void setDescNew(String str) {
        this.descNew = str;
    }

    public synchronized void setDid(String str) {
        this.did = str;
    }

    public synchronized void setEventInfo(String str) {
        this.event = str;
    }

    public void setExtraInfo(JSONObject jSONObject) {
        this.extra = jSONObject;
    }

    public void setFamily(boolean z) {
        int i = this.permitLevel & (~PERMISSION_NONE_MASK);
        this.permitLevel = i;
        if (z) {
            this.permitLevel = PERMISSION_FAMILY | i;
        } else {
            this.permitLevel = (~PERMISSION_FAMILY) & i;
        }
    }

    public void setFreqFlag(boolean z) {
        this.freqFlag = z;
    }

    public synchronized void setHideMode(int i) {
        this.hideMode = i;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setIsSetPinCode(int i) {
        addExtraInfo("isSetPincode", i);
    }

    public synchronized void setKeyId(String str) {
        addExtraInfo("keyid", str);
    }

    public void setLastOnline(long j) {
        this.lastOnline = j;
    }

    public synchronized void setLatitude(double d) {
        this.latitude = d;
    }

    public void setLaunchParams(Intent intent) {
    }

    public synchronized void setLocalIP(String str) {
        this.localIP = str;
    }

    public synchronized void setLocation(Location location) {
        this.location = location;
    }

    public synchronized void setLockShareCreateTime(long j) {
        addExtraInfo(MiuiCursorConstants.CREATE_TIME, j);
    }

    public synchronized void setLongitude(double d) {
        this.longitude = d;
    }

    public synchronized void setMac(String str) {
        this.mac = str;
    }

    public void setMeshId(String str) {
        this.meshId = str;
    }

    public synchronized void setMethodInfo(String str) {
        this.methodInfo = str;
    }

    public synchronized void setModel(String str) {
        this.model = str;
    }

    public synchronized void setName(String str) {
        this.name = str;
    }

    public synchronized void setNewKeyId(int i) {
        addExtraInfo("key_id", i);
    }

    public void setOwner(boolean z) {
        int i = this.permitLevel & (~PERMISSION_NONE_MASK);
        this.permitLevel = i;
        if (z) {
            this.permitLevel = PERMISSION_OWNER | i;
        } else {
            this.permitLevel = (~PERMISSION_OWNER) & i;
        }
    }

    public synchronized void setOwnerId(String str) {
        this.ownerId = str;
    }

    public synchronized void setOwnerName(String str) {
        this.ownerName = str;
    }

    public synchronized void setParentId(String str) {
        this.parentId = str;
    }

    public synchronized void setParentModel(String str) {
        this.parentModel = str;
    }

    public void setPartnerId(String str) {
        this.partnerId = str;
    }

    public synchronized void setPermitLevel(int i) {
        this.permitLevel = i;
    }

    public synchronized void setPid(int i) {
        this.pid = i;
    }

    public synchronized void setPinCodeType(int i) {
        addExtraInfo("pincodeType", i);
    }

    public synchronized void setPropInfo(String str) {
        this.mPropInfo = str;
    }

    public synchronized void setResetFlag(int i) {
        this.resetFlag = i;
    }

    public synchronized void setRssi(int i) {
        this.rssi = i;
    }

    public void setShared(boolean z) {
        this.permitLevel &= ~PERMISSION_NONE_MASK;
        if (this.canAuth && z && !TextUtils.isEmpty(this.ownerName)) {
            this.permitLevel |= PERMISSION_SHARE;
        } else {
            this.permitLevel &= ~PERMISSION_SHARE;
        }
    }

    public synchronized void setShowMode(int i) {
        this.showMode = i;
    }

    public void setSpecUrn(String str) {
        this.specUrn = str;
    }

    public synchronized void setSsid(String str) {
        this.ssid = str;
    }

    public synchronized void setToken(String str) {
        this.token = str;
    }

    public void setUnbind() {
        this.permitLevel &= ~PERMISSION_NONE_MASK;
    }

    public synchronized void setVersion(String str) {
        addExtraInfo("fw_version", str);
    }

    public void setVoiceCtrl(byte b2) {
        this.voiceCtrl = b2;
    }

    public boolean superFreq() {
        return (this.comFlag & 256) == 256;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", this.did);
            jSONObject.put("model", this.model);
            jSONObject.put("name", this.name);
            jSONObject.put("uid", this.userId);
            jSONObject.put("mac", this.mac);
            jSONObject.put("isOnline", this.isOnline);
            jSONObject.put("pid", this.pid);
            jSONObject.put("permitLevel", this.permitLevel);
            jSONObject.put("resetFlag", this.resetFlag);
            jSONObject.put("rssi", this.rssi);
            jSONObject.put("token", this.token);
            jSONObject.put("localip", this.localIP);
            jSONObject.put("longitude", this.longitude);
            jSONObject.put("latitude", this.latitude);
            jSONObject.put("ssid", this.ssid);
            jSONObject.put(DeviceTagInterface.ROUTER_BSSID, this.bssid);
            jSONObject.put("show_mode", this.showMode);
            jSONObject.put("hide_mode", this.hideMode);
            jSONObject.put("parent_id", this.parentId);
            jSONObject.put("parent_model", this.parentModel);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("nickname", this.ownerName);
            jSONObject2.put(AuthorizeActivityBase.KEY_USERID, this.ownerId);
            jSONObject.put(CardInfo.KEY_OWNER, jSONObject2);
            if (this.propInfo != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("propInfo", this.propInfo);
                jSONObject3.put("mPropInfo ", this.mPropInfo);
            }
            jSONObject.put("desc_new", this.descNew);
            jSONObject.put("spec_type", this.specUrn);
            jSONObject.put("voice_ctrl", (int) this.voiceCtrl);
            jSONObject.put("freqFlag", this.freqFlag);
            jSONObject.put("comFlag", this.comFlag);
            if (this.descTimeJString != null) {
                jSONObject.put("desc_time", new JSONArray(this.descTimeJString));
            }
            jSONObject.put("orderTime", this.orderTimeJString);
            jSONObject.put("eth_type", this.ethType);
            jSONObject.put("sn", this.sn);
            jSONObject.put(ThirdPartAccessConstants.KEY_ACCESS_TYPE, this.accessType);
            jSONObject.put("last_online", this.lastOnline);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Device{did='");
        String str = this.did;
        sb.append(str == null ? "" : Base64.encodeToString(str.getBytes(), 0));
        sb.append('\'');
        sb.append(", model='");
        sb.append(this.model);
        sb.append('\'');
        sb.append(", name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", mac='");
        sb.append(this.mac);
        sb.append('\'');
        sb.append(", isOnline=");
        sb.append(this.isOnline);
        sb.append(", pid=");
        sb.append(this.pid);
        sb.append(", permitLevel=");
        sb.append(this.permitLevel);
        sb.append(", resetFlag=");
        sb.append(this.resetFlag);
        sb.append(", rssi=");
        sb.append(this.rssi);
        sb.append(", localIP='");
        sb.append(this.localIP);
        sb.append('\'');
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", ssid='");
        sb.append(this.ssid);
        sb.append('\'');
        sb.append(", bssid='");
        sb.append(this.bssid);
        sb.append('\'');
        sb.append(", showMode=");
        sb.append(this.showMode);
        sb.append(", hideMode=");
        sb.append(this.hideMode);
        sb.append(", icon='");
        sb.append(this.icon);
        sb.append('\'');
        sb.append(", parentId='");
        sb.append(this.parentId);
        sb.append('\'');
        sb.append(", parentModel='");
        sb.append(this.parentModel);
        sb.append('\'');
        sb.append(", ownerName='");
        sb.append(this.ownerName);
        sb.append('\'');
        sb.append(", ownerId='");
        sb.append(this.ownerId);
        sb.append('\'');
        sb.append(", propInfo='");
        sb.append(this.mPropInfo);
        sb.append('\'');
        sb.append(", methodInfo='");
        sb.append(this.methodInfo);
        sb.append('\'');
        sb.append(", extraInfo='");
        sb.append(this.extra);
        sb.append('\'');
        sb.append(", eventInfo='");
        sb.append(this.event);
        sb.append('\'');
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", canUseNotBind=");
        sb.append(this.canUseNotBind);
        sb.append(", canAuth=");
        sb.append(this.canAuth);
        sb.append(", descNew='");
        sb.append(this.descNew);
        sb.append('\'');
        sb.append(", descTimeJString='");
        sb.append(this.descTimeJString);
        sb.append('\'');
        sb.append(", specUrn='");
        sb.append(this.specUrn);
        sb.append('\'');
        sb.append(", voiceCtrl='");
        sb.append((int) this.voiceCtrl);
        sb.append('\'');
        sb.append(", freqFlag='");
        sb.append(this.freqFlag);
        sb.append('\'');
        sb.append(", comFlag='");
        sb.append(this.comFlag);
        sb.append('\'');
        sb.append(", ethType'");
        sb.append(this.ethType);
        sb.append('\'');
        sb.append(", partnerId'");
        sb.append(this.partnerId);
        sb.append('\'');
        sb.append(", meshId'");
        sb.append(this.meshId);
        sb.append('\'');
        sb.append(", last_online'");
        sb.append(this.lastOnline);
        sb.append('\'');
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public synchronized void toggleCanAuth(boolean z) {
        this.canAuth = z;
    }

    public synchronized void toggleCanUseNotBind(boolean z) {
        this.canUseNotBind = z;
    }

    public synchronized void toggleOnline(boolean z) {
        this.isOnline = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.did);
        parcel.writeString(this.model);
        parcel.writeString(this.name);
        parcel.writeString(this.mac);
        parcel.writeByte(this.isOnline ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.pid);
        parcel.writeInt(this.permitLevel);
        parcel.writeInt(this.resetFlag);
        parcel.writeInt(this.rssi);
        parcel.writeString(this.token);
        parcel.writeString(this.localIP);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.latitude);
        parcel.writeString(this.ssid);
        parcel.writeString(this.bssid);
        parcel.writeInt(this.showMode);
        parcel.writeInt(this.hideMode);
        parcel.writeString(this.icon);
        parcel.writeString(this.parentId);
        parcel.writeString(this.parentModel);
        parcel.writeString(this.ownerName);
        parcel.writeString(this.ownerId);
        parcel.writeString(this.mPropInfo);
        parcel.writeString(this.methodInfo);
        parcel.writeString(getExtraInfo());
        parcel.writeString(this.event);
        Location location = this.location;
        parcel.writeInt(location == null ? -1 : location.ordinal());
        parcel.writeByte(this.canUseNotBind ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.canAuth ? (byte) 1 : (byte) 0);
        parcel.writeString(this.descNew);
        parcel.writeString(this.descTimeJString);
        parcel.writeString(this.specUrn);
        parcel.writeByte(this.voiceCtrl);
        parcel.writeByte(this.freqFlag ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.comFlag);
        parcel.writeString(this.orderTimeJString);
        parcel.writeInt(this.ethType);
        parcel.writeString(this.userId);
        parcel.writeInt(this.sort);
        parcel.writeLong(this.lastModified);
        parcel.writeString(this.ip);
        parcel.writeByte(this.isNew ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.scrollTo ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isConnected ? (byte) 1 : (byte) 0);
        parcel.writeString(this.sn);
        parcel.writeInt(this.accessType);
        parcel.writeString(this.partnerId);
        parcel.writeString(this.meshId);
        parcel.writeLong(this.lastOnline);
    }

    public void addExtraInfo(String str, int i) {
        try {
            getExtra().put(str, i);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Device m845clone() {
        Device device = new Device();
        cloneTo(device);
        return device;
    }

    public synchronized void setExtraInfo(String str) {
        try {
            this.extra = new JSONObject(str);
        } catch (Throwable unused) {
        }
    }

    public void addExtraInfo(String str, String str2) {
        try {
            getExtra().put(str, str2);
        } catch (Throwable unused) {
        }
    }

    public Device(String str, String str2) {
        this.userId = "";
        this.rssiNumber = 0;
        this.isOnline = true;
        this.canAuth = true;
        this.canUseNotBind = false;
        this.isConnected = true;
        this.property = new Bundle();
        this.scrollTo = false;
        this.orderTimeJString = "";
        this.lastOnline = 0L;
        this.freqFlag = true;
        this.comFlag = 0;
        this.did = str;
        this.model = str2;
    }

    public Device(Parcel parcel) {
        this.userId = "";
        this.rssiNumber = 0;
        this.isOnline = true;
        this.canAuth = true;
        this.canUseNotBind = false;
        this.isConnected = true;
        this.property = new Bundle();
        this.scrollTo = false;
        this.orderTimeJString = "";
        this.lastOnline = 0L;
        this.freqFlag = true;
        this.comFlag = 0;
        this.did = parcel.readString();
        this.model = parcel.readString();
        this.name = parcel.readString();
        this.mac = parcel.readString();
        this.isOnline = parcel.readByte() != 0;
        this.pid = parcel.readInt();
        this.permitLevel = parcel.readInt();
        this.resetFlag = parcel.readInt();
        this.rssi = parcel.readInt();
        this.token = parcel.readString();
        this.localIP = parcel.readString();
        this.longitude = parcel.readDouble();
        this.latitude = parcel.readDouble();
        this.ssid = parcel.readString();
        this.bssid = parcel.readString();
        this.showMode = parcel.readInt();
        this.hideMode = parcel.readInt();
        this.icon = parcel.readString();
        this.parentId = parcel.readString();
        this.parentModel = parcel.readString();
        this.ownerName = parcel.readString();
        this.ownerId = parcel.readString();
        this.mPropInfo = parcel.readString();
        this.methodInfo = parcel.readString();
        setExtraInfo(parcel.readString());
        this.event = parcel.readString();
        int i = parcel.readInt();
        this.location = i == -1 ? null : Location.values()[i];
        this.canUseNotBind = parcel.readByte() != 0;
        this.canAuth = parcel.readByte() != 0;
        this.descNew = parcel.readString();
        this.descTimeJString = parcel.readString();
        this.specUrn = parcel.readString();
        this.voiceCtrl = parcel.readByte();
        this.freqFlag = parcel.readByte() != 0;
        this.comFlag = parcel.readInt();
        this.orderTimeJString = parcel.readString();
        this.ethType = parcel.readInt();
        this.userId = parcel.readString();
        this.sort = parcel.readInt();
        this.lastModified = parcel.readLong();
        this.ip = parcel.readString();
        this.isNew = parcel.readByte() == 1;
        this.scrollTo = parcel.readByte() == 1;
        this.isConnected = parcel.readByte() == 1;
        this.sn = parcel.readString();
        this.accessType = parcel.readInt();
        this.partnerId = parcel.readString();
        this.meshId = parcel.readString();
        this.lastOnline = parcel.readLong();
    }
}
