package com.xiaomi.smarthome.core.server.internal.bluetooth.model;

import android.text.TextUtils;
import com.xiaomi.smarthome.cache.SecurityCache;
import com.xiaomi.smarthome.core.entity.device.BtDevice;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BtConstants;
import com.xiaomi.smarthome.core.server.internal.bluetooth.decorator.BluetoothDeviceDecorator;
import com.xiaomi.smarthome.core.server.internal.bluetooth.decorator.BluetoothDevicePermitLevelDecorator;
import com.xiaomi.smarthome.core.server.internal.plugin.util.Callback;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.device.api.BleMeshFirmwareUpdateInfo;
import com.xiaomi.smarthome.device.api.McuUpdateInfo;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.connect.BleGattProfile;
import com.xiaomi.smarthome.library.bluetooth.encryption.TokenEncryption;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import com.xiaomi.smarthome.library.common.util.StringUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class BluetoothCache {
    public static final int LOCAL_BOUNDED_DEVICES = 100;
    public static final int LOCAL_REMOVED_DEVICES = 101;
    public static final int PROP_BEACON_NAME = 13;
    public static final int PROP_BOUND_STATUS = 5;
    public static final int PROP_DESC = 3;
    public static final int PROP_DID = 2;
    public static final int PROP_EXTRA = 7;
    public static final int PROP_GATT_PROFILE = 9;
    public static final int PROP_LOCK_SHARE_CREATE_TIME = 27;
    public static final int PROP_LOCK_SHARE_KEY_ID = 26;
    public static final int PROP_LOCK_SHARE_USER_KEY = 25;
    public static final int PROP_LTMK = 19;
    public static final int PROP_LTMK_ENCRYPT_TYPE = 22;
    public static final int PROP_MESH_BIND_INFO = 24;
    public static final int PROP_MODEL = 4;
    public static final int PROP_NAME = 1;
    public static final int PROP_OWNER_ID = 10;
    public static final int PROP_OWNER_NAME = 16;
    public static final int PROP_PERMITLEVEL = 15;
    public static final int PROP_PINCODE = 21;
    public static final int PROP_PRODUCTID = 11;
    public static final int PROP_RSSI = 14;
    public static final int PROP_SCANRECORD = 8;
    public static final int PROP_SESSION_KEY = 18;
    public static final int PROP_SHARED_KEY_ID = 20;
    public static final int PROP_SHOW_PINCODE_STATUS = 23;
    public static final int PROP_SMAC = 17;
    public static final int PROP_TOKEN = 6;
    public static final int PROP_TYPE = 12;
    public static final int REMOTE_BOUNDED_DEVICES = 102;
    private static Map<String, String> mFirmareVersion = new HashMap();
    private static List<String> mSupportBleSpecMacs = new ArrayList();
    static Map<String, String> sessionKeyMap = new ConcurrentHashMap();

    public static void addSupportBleSpecMac(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        mSupportBleSpecMacs.add(str);
    }

    private static String decryptProp(String str) {
        return TokenEncryption.getInstance().decryptToken(BluetoothService.getBleCoreProvider().getMiId(), str);
    }

    private static String encryptProp(String str) {
        return TokenEncryption.getInstance().encryptToken(BluetoothService.getBleCoreProvider().getMiId(), str);
    }

    public static BleMeshFirmwareUpdateInfo getBleFirmwareUpdateInfo(String str) {
        String jsonFirmwareUpdateInfo = BleDevicePropCache.getInstance().getJsonFirmwareUpdateInfo(str);
        if (TextUtils.isEmpty(jsonFirmwareUpdateInfo)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(jsonFirmwareUpdateInfo);
            BleMeshFirmwareUpdateInfo bleMeshFirmwareUpdateInfo = new BleMeshFirmwareUpdateInfo();
            bleMeshFirmwareUpdateInfo.version = jSONObject.optString("version");
            bleMeshFirmwareUpdateInfo.safeUrl = jSONObject.optString("safe_url");
            bleMeshFirmwareUpdateInfo.timeout = jSONObject.optInt("time_out", 30);
            bleMeshFirmwareUpdateInfo.url = jSONObject.optString("url");
            bleMeshFirmwareUpdateInfo.changeLog = jSONObject.optString("changeLog");
            bleMeshFirmwareUpdateInfo.md5 = jSONObject.optString("md5");
            String strOptString = jSONObject.optString("mcu_version");
            String strOptString2 = jSONObject.optString("mcu_safe_url");
            String strOptString3 = jSONObject.optString("mcu_md5");
            if (!TextUtils.isEmpty(strOptString)) {
                McuUpdateInfo mcuUpdateInfo = new McuUpdateInfo();
                mcuUpdateInfo.version = strOptString;
                mcuUpdateInfo.url = strOptString2;
                mcuUpdateInfo.md5 = strOptString3;
                bleMeshFirmwareUpdateInfo.mcuUpdateInfo = mcuUpdateInfo;
            }
            return bleMeshFirmwareUpdateInfo;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getFirmwareVersion(String str) {
        return mFirmareVersion.get(str);
    }

    public static ArrayList<BtDevice> getLocalBoundedDevices() {
        final ArrayList<BtDevice> arrayList = new ArrayList<>();
        BleDevicePropCache.getInstance().traverse(new BleDevicePropCache.IPropTraverse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache.1
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropTraverse
            public boolean onTraverse(String str, BleDeviceProp bleDeviceProp) {
                if (TextUtils.isEmpty(str) || bleDeviceProp.getBoundStatus() != 1 || "xiaomi.ble.v1".equalsIgnoreCase(bleDeviceProp.getModel())) {
                    return false;
                }
                BtDevice btDevice = new BtDevice(str);
                BluetoothDeviceDecorator.getInstance().decorate(btDevice);
                BluetoothDevicePermitLevelDecorator.getInstance().decorate(btDevice);
                arrayList.add(btDevice);
                return false;
            }
        });
        return arrayList;
    }

    public static ArrayList<BtDevice> getLocalRemovedDevices() {
        final ArrayList<BtDevice> arrayList = new ArrayList<>();
        BleDevicePropCache.getInstance().traverse(new BleDevicePropCache.IPropTraverse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache.2
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropTraverse
            public boolean onTraverse(String str, BleDeviceProp bleDeviceProp) {
                if (bleDeviceProp.getExtra(BtConstants.KEY_LOCAL_REMOVED, false)) {
                    BtDevice btDevice = new BtDevice(str);
                    BluetoothDeviceDecorator.getInstance().decorate(btDevice);
                    arrayList.add(btDevice);
                }
                return false;
            }
        });
        return arrayList;
    }

    public static String getLockShareCreateTime(String str) {
        if (!BluetoothService.getGreyProvider().isUseSecurityCache()) {
            String lockShareUserKey = BleDevicePropCache.getInstance().getLockShareUserKey(str);
            return TextUtils.isEmpty(lockShareUserKey) ? SecurityCache.getInstance().getLockShareCreateTime(str) : decryptProp(lockShareUserKey);
        }
        String lockShareCreateTime = SecurityCache.getInstance().getLockShareCreateTime(str);
        if (TextUtils.isEmpty(lockShareCreateTime)) {
            lockShareCreateTime = decryptProp(BleDevicePropCache.getInstance().getLockShareCreateTime(str));
            if (!TextUtils.isEmpty(lockShareCreateTime) && SecurityCache.getInstance().setLockShareCreateTime(str, lockShareCreateTime)) {
                BleDevicePropCache.getInstance().setLockShareCreateTime(str, "");
            }
        }
        return lockShareCreateTime;
    }

    public static String getLockShareKeyId(String str) {
        if (!BluetoothService.getGreyProvider().isUseSecurityCache()) {
            String lockShareKeyId = BleDevicePropCache.getInstance().getLockShareKeyId(str);
            return TextUtils.isEmpty(lockShareKeyId) ? SecurityCache.getInstance().getLockShareKeyId(str) : decryptProp(lockShareKeyId);
        }
        String lockShareKeyId2 = SecurityCache.getInstance().getLockShareKeyId(str);
        if (TextUtils.isEmpty(lockShareKeyId2)) {
            lockShareKeyId2 = decryptProp(BleDevicePropCache.getInstance().getLockShareKeyId(str));
            if (!TextUtils.isEmpty(lockShareKeyId2) && SecurityCache.getInstance().setLockShareKeyId(str, lockShareKeyId2)) {
                BleDevicePropCache.getInstance().setLockShareKeyId(str, "");
            }
        }
        return lockShareKeyId2;
    }

    public static String getLockShareUserKey(String str) {
        if (!BluetoothService.getGreyProvider().isUseSecurityCache()) {
            String lockShareUserKey = BleDevicePropCache.getInstance().getLockShareUserKey(str);
            return TextUtils.isEmpty(lockShareUserKey) ? SecurityCache.getInstance().getLockShareUserKey(str) : decryptProp(lockShareUserKey);
        }
        String lockShareUserKey2 = SecurityCache.getInstance().getLockShareUserKey(str);
        if (TextUtils.isEmpty(lockShareUserKey2)) {
            lockShareUserKey2 = decryptProp(BleDevicePropCache.getInstance().getLockShareUserKey(str));
            if (!TextUtils.isEmpty(lockShareUserKey2) && SecurityCache.getInstance().setLockShareUserKey(str, lockShareUserKey2)) {
                BleDevicePropCache.getInstance().setLockShareUserKey(str, "");
            }
        }
        return lockShareUserKey2;
    }

    public static List<BtDevice> getMiuiBoundedDevices() {
        final ArrayList arrayList = new ArrayList();
        BleDevicePropCache.getInstance().traverse(new BleDevicePropCache.IPropTraverse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache.4
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropTraverse
            public boolean onTraverse(String str, BleDeviceProp bleDeviceProp) {
                if (bleDeviceProp.getExtra(BtConstants.KEY_MIUI_BIND, false)) {
                    BtDevice btDevice = new BtDevice(str);
                    BluetoothDeviceDecorator.getInstance().decorate(btDevice);
                    arrayList.add(btDevice);
                }
                return false;
            }
        });
        return arrayList;
    }

    public static String getPropBeaconName(String str) {
        return BleDevicePropCache.getInstance().getPropBeaconName(str);
    }

    public static int getPropBoundStatus(String str) {
        return BleDevicePropCache.getInstance().getPropBoundStatus(str);
    }

    public static String getPropDesc(String str) {
        return BleDevicePropCache.getInstance().getPropDesc(str);
    }

    public static String getPropDid(String str) {
        return BleDevicePropCache.getInstance().getPropDid(str);
    }

    public static String getPropExtra(String str, String str2) {
        return BleDevicePropCache.getInstance().getPropExtra(str, str2);
    }

    public static BleGattProfile getPropGattProfile(String str) {
        return BleDevicePropCache.getInstance().getPropGattProfile(str);
    }

    public static String getPropLtmk(String str) {
        if (!BluetoothService.getGreyProvider().isUseSecurityCache()) {
            String encryptedLtmk = BleDevicePropCache.getInstance().getEncryptedLtmk(str);
            return TextUtils.isEmpty(encryptedLtmk) ? SecurityCache.getInstance().getLtmk(str) : decryptProp(encryptedLtmk);
        }
        String ltmk = SecurityCache.getInstance().getLtmk(str);
        if (TextUtils.isEmpty(ltmk)) {
            ltmk = decryptProp(BleDevicePropCache.getInstance().getEncryptedLtmk(str));
            if (!TextUtils.isEmpty(ltmk) && SecurityCache.getInstance().setLtmk(str, ltmk)) {
                BleDevicePropCache.getInstance().setEncryptedLtmk(str, "");
            }
        }
        return ltmk;
    }

    public static byte[] getPropLtmkBytes(String str) {
        String propLtmk = getPropLtmk(str);
        return TextUtils.isEmpty(propLtmk) ? ByteUtils.EMPTY_BYTES : ByteUtils.stringToBytes(propLtmk);
    }

    public static int getPropLtmkEncryptType(String str) {
        return BleDevicePropCache.getInstance().getLtmkEncryptType(str);
    }

    public static String getPropMeshBindInfo(String str) {
        if (!BluetoothService.getGreyProvider().isUseSecurityCache()) {
            String encryptedMeshBindInfo = BleDevicePropCache.getInstance().getEncryptedMeshBindInfo(str);
            return TextUtils.isEmpty(encryptedMeshBindInfo) ? SecurityCache.getInstance().getMeshBindInfo(str) : decryptProp(encryptedMeshBindInfo);
        }
        String meshBindInfo = SecurityCache.getInstance().getMeshBindInfo(str);
        if (TextUtils.isEmpty(meshBindInfo)) {
            meshBindInfo = decryptProp(BleDevicePropCache.getInstance().getEncryptedMeshBindInfo(str));
            if (!TextUtils.isEmpty(meshBindInfo) && SecurityCache.getInstance().setMeshBindInfo(str, meshBindInfo)) {
                BleDevicePropCache.getInstance().setEncryptedMeshBindInfo(str, "");
            }
        }
        return meshBindInfo;
    }

    public static String getPropModel(String str) {
        return BleDevicePropCache.getInstance().getPropModel(str);
    }

    public static String getPropName(String str) {
        return BleDevicePropCache.getInstance().getPropName(str);
    }

    public static String getPropOwnerId(String str) {
        return BleDevicePropCache.getInstance().getPropOwnerId(str);
    }

    public static String getPropOwnerName(String str) {
        return BleDevicePropCache.getInstance().getPropOwnerName(str);
    }

    public static int getPropPermitLevel(String str) {
        return BleDevicePropCache.getInstance().getPropPermitLevel(str);
    }

    public static String getPropPincode(String str) {
        if (!BluetoothService.getGreyProvider().isUseSecurityCache()) {
            String pincode = BleDevicePropCache.getInstance().getPincode(str);
            return TextUtils.isEmpty(pincode) ? SecurityCache.getInstance().getPinCode(str) : decryptProp(pincode);
        }
        String pinCode = SecurityCache.getInstance().getPinCode(str);
        if (TextUtils.isEmpty(pinCode)) {
            pinCode = decryptProp(BleDevicePropCache.getInstance().getPincode(str));
            if (!TextUtils.isEmpty(pinCode) && SecurityCache.getInstance().setPinCode(str, pinCode)) {
                BleDevicePropCache.getInstance().setPincode(str, "");
            }
        }
        return pinCode;
    }

    public static int getPropProductId(String str) {
        return BleDevicePropCache.getInstance().getPropProductId(str);
    }

    public static int getPropRssi(String str) {
        return BleDevicePropCache.getInstance().getPropRssi(str);
    }

    public static String getPropSMac(String str) {
        return BleDevicePropCache.getInstance().getPropSMac(str);
    }

    public static byte[] getPropScanRecord(String str) {
        return BleDevicePropCache.getInstance().getPropScanRecord(str);
    }

    public static String getPropSessionKey(String str) {
        String sessionKey = sessionKeyMap.get(str);
        if (TextUtils.isEmpty(sessionKey)) {
            sessionKey = getSessionKey(str);
            if (!TextUtils.isEmpty(sessionKey)) {
                sessionKeyMap.put(str, sessionKey);
            }
        }
        return sessionKey;
    }

    public static byte[] getPropSessionKeyBytes(String str) {
        String propSessionKey = getPropSessionKey(str);
        return TextUtils.isEmpty(propSessionKey) ? ByteUtils.EMPTY_BYTES : ByteUtils.stringToBytes(propSessionKey);
    }

    public static String getPropSharedKeyId(String str) {
        if (!BluetoothService.getGreyProvider().isUseSecurityCache()) {
            String encryptedKeyId = BleDevicePropCache.getInstance().getEncryptedKeyId(str);
            if (TextUtils.isEmpty(encryptedKeyId)) {
                SecurityCache.getInstance().getShareKeyId(str);
            }
            return decryptProp(encryptedKeyId);
        }
        String shareKeyId = SecurityCache.getInstance().getShareKeyId(str);
        if (TextUtils.isEmpty(shareKeyId)) {
            shareKeyId = decryptProp(BleDevicePropCache.getInstance().getEncryptedKeyId(str));
            if (!TextUtils.isEmpty(shareKeyId) && SecurityCache.getInstance().setShareKeyId(str, shareKeyId)) {
                BleDevicePropCache.getInstance().setEncryptedKeyId(str, "");
            }
        }
        return shareKeyId;
    }

    public static String getPropToken(String str) {
        if (!BluetoothService.getGreyProvider().isUseSecurityCache()) {
            String encryptedToken = BleDevicePropCache.getInstance().getEncryptedToken(str);
            return TextUtils.isEmpty(encryptedToken) ? SecurityCache.getInstance().getToken(str) : decryptProp(encryptedToken);
        }
        String token = SecurityCache.getInstance().getToken(str);
        if (TextUtils.isEmpty(token)) {
            token = decryptProp(BleDevicePropCache.getInstance().getEncryptedToken(str));
            if (!TextUtils.isEmpty(token) && SecurityCache.getInstance().setToken(str, token)) {
                BleDevicePropCache.getInstance().setEncryptedToken(str, "");
            }
        }
        return token;
    }

    public static byte[] getPropTokenBytes(String str) {
        String propToken = getPropToken(str);
        return TextUtils.isEmpty(propToken) ? ByteUtils.EMPTY_BYTES : ByteUtils.stringToBytes(propToken);
    }

    public static int getPropType(String str) {
        return BleDevicePropCache.getInstance().getPropType(str);
    }

    public static ArrayList<BtDevice> getRemoteBoundedDevices() {
        final ArrayList<BtDevice> arrayList = new ArrayList<>();
        BleDevicePropCache.getInstance().traverse(new BleDevicePropCache.IPropTraverse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache.3
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropTraverse
            public boolean onTraverse(String str, BleDeviceProp bleDeviceProp) {
                if (bleDeviceProp.getBoundStatus() != 2) {
                    return false;
                }
                BtDevice btDevice = new BtDevice(str);
                BluetoothDeviceDecorator.getInstance().decorate(btDevice);
                arrayList.add(btDevice);
                return false;
            }
        });
        return arrayList;
    }

    private static String getSessionKey(String str) {
        if (!BluetoothService.getGreyProvider().isUseSecurityCache()) {
            String encryptedSessionKey = BleDevicePropCache.getInstance().getEncryptedSessionKey(str);
            return TextUtils.isEmpty(encryptedSessionKey) ? SecurityCache.getInstance().getSessionKey(str) : decryptProp(encryptedSessionKey);
        }
        String sessionKey = SecurityCache.getInstance().getSessionKey(str);
        if (TextUtils.isEmpty(sessionKey)) {
            sessionKey = decryptProp(BleDevicePropCache.getInstance().getEncryptedSessionKey(str));
            if (!TextUtils.isEmpty(sessionKey) && SecurityCache.getInstance().setSessionKey(str, sessionKey)) {
                BleDevicePropCache.getInstance().setEncryptedSessionKey(str, "");
            }
        }
        return sessionKey;
    }

    public static boolean getSupportReportDeviceLog(String str, boolean z) {
        return BleDevicePropCache.getInstance().getPropExtra(str, "support.report.device.log", z);
    }

    public static void isCacheReady(Callback<Integer, Integer> callback) throws Exception {
        BleDevicePropCache.getInstance().isCacheReady(callback);
    }

    public static boolean isComboV3OrPlus(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return BleDevicePropCache.getInstance().getPropExtra(str, "device.combo.v3", false);
    }

    public static boolean isShowPincode(String str) {
        return BleDevicePropCache.getInstance().isShowPincode(str);
    }

    public static boolean isSupportBleSupport(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return mSupportBleSpecMacs.contains(str);
    }

    public static boolean isSupportPollDeviceLog(String str, boolean z) {
        return BleDevicePropCache.getInstance().getPropExtra(str, "support.device.log", z);
    }

    public static void reloadCache() {
        BleDevicePropCache.getInstance().reloadIfNeeded();
    }

    public static void setBleFirmwareUpdateInfo(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            BluetoothLog.d("Ble-OTA: remove update info");
        }
        BleDevicePropCache.getInstance().setJsonFirmwareUpdateInfo(str, str2);
    }

    public static void setComboV3OrPlus(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        BleDevicePropCache.getInstance().setPropExtra(str, "device.combo.v3", z);
    }

    public static void setLockShareCreateTime(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            SecurityCache.getInstance().setLockShareCreateTime(str, str2);
            BleDevicePropCache.getInstance().setLockShareCreateTime(str, encryptProp(str2));
            return;
        }
        if (!BluetoothService.getGreyProvider().isUseSecurityCache()) {
            BleDevicePropCache.getInstance().setLockShareCreateTime(str, encryptProp(str2));
        }
        SecurityCache.getInstance().setLockShareCreateTime(str, str2);
        if (TextUtils.equals(str2, SecurityCache.getInstance().getLockShareCreateTime(str))) {
            return;
        }
        BleDevicePropCache.getInstance().setLockShareCreateTime(str, encryptProp(str2));
    }

    public static void setLockShareKeyId(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            SecurityCache.getInstance().setLockShareKeyId(str, str2);
            BleDevicePropCache.getInstance().setLockShareKeyId(str, encryptProp(str2));
            return;
        }
        if (!BluetoothService.getGreyProvider().isUseSecurityCache()) {
            BleDevicePropCache.getInstance().setLockShareKeyId(str, encryptProp(str2));
        }
        SecurityCache.getInstance().setLockShareKeyId(str, str2);
        if (TextUtils.equals(str2, SecurityCache.getInstance().getLockShareKeyId(str))) {
            return;
        }
        BleDevicePropCache.getInstance().setLockShareKeyId(str, encryptProp(str2));
    }

    public static void setLockShareUserKey(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            SecurityCache.getInstance().setLockShareUserKey(str, str2);
            BleDevicePropCache.getInstance().setLockShareUserKey(str, encryptProp(str2));
            return;
        }
        if (!BluetoothService.getGreyProvider().isUseSecurityCache()) {
            BleDevicePropCache.getInstance().setLockShareUserKey(str, encryptProp(str2));
        }
        SecurityCache.getInstance().setLockShareUserKey(str, str2);
        if (TextUtils.equals(str2, SecurityCache.getInstance().getLockShareUserKey(str))) {
            return;
        }
        BleDevicePropCache.getInstance().setLockShareUserKey(str, encryptProp(str2));
    }

    public static void setPropBeaconName(String str, String str2) {
        BleDevicePropCache.getInstance().setPropBeaconName(str, str2);
    }

    public static void setPropBoundStatus(String str, int i) {
        BleDevicePropCache.getInstance().setPropBoundStatus(str, i);
    }

    public static void setPropDesc(String str, String str2) {
        BleDevicePropCache.getInstance().setPropDesc(str, str2);
    }

    public static void setPropDid(String str, String str2) {
        BleDevicePropCache.getInstance().setPropDid(str, str2);
    }

    public static void setPropExtra(String str, String str2, String str3) {
        BleDevicePropCache.getInstance().setPropExtra(str, str2, str3);
    }

    public static void setPropFirVersion(String str, String str2) {
        mFirmareVersion.put(str, str2);
    }

    public static void setPropGattProfile(String str, BleGattProfile bleGattProfile) {
        BleDevicePropCache.getInstance().setPropGattProfile(str, bleGattProfile);
    }

    public static void setPropLtmk(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            SecurityCache.getInstance().setLtmk(str, str2);
            BleDevicePropCache.getInstance().setEncryptedLtmk(str, encryptProp(str2));
            return;
        }
        if (!BluetoothService.getGreyProvider().isUseSecurityCache()) {
            BleDevicePropCache.getInstance().setEncryptedLtmk(str, encryptProp(str2));
        }
        SecurityCache.getInstance().setLtmk(str, str2);
        if (TextUtils.equals(str2, SecurityCache.getInstance().getLtmk(str))) {
            return;
        }
        BleDevicePropCache.getInstance().setEncryptedLtmk(str, encryptProp(str2));
    }

    public static void setPropLtmkBytes(String str, byte[] bArr) {
        setPropLtmk(str, ByteUtils.byteToString(bArr));
    }

    public static void setPropLtmkEncryptType(String str, int i) {
        BleDevicePropCache.getInstance().setLtmkEncryptType(str, i);
    }

    public static void setPropMeshBindInfo(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            SecurityCache.getInstance().setMeshBindInfo(str, str2);
            BleDevicePropCache.getInstance().setEncryptedMeshBindInfo(str, encryptProp(str2));
            return;
        }
        if (!BluetoothService.getGreyProvider().isUseSecurityCache()) {
            BleDevicePropCache.getInstance().setEncryptedMeshBindInfo(str, encryptProp(str2));
        }
        SecurityCache.getInstance().setMeshBindInfo(str, str2);
        if (TextUtils.equals(SecurityCache.getInstance().getMeshBindInfo(str), str2)) {
            return;
        }
        BleDevicePropCache.getInstance().setEncryptedMeshBindInfo(str, encryptProp(str2));
    }

    public static void setPropModel(String str, String str2) {
        BleDevicePropCache.getInstance().setPropModel(str, str2);
    }

    public static void setPropName(String str, String str2) {
        BleDevicePropCache.getInstance().setPropName(str, str2);
    }

    public static void setPropOwnerId(String str, String str2) {
        BleDevicePropCache.getInstance().setPropOwnerId(str, StringUtil.getNonNullString(str2));
    }

    public static void setPropOwnerName(String str, String str2) {
        BleDevicePropCache.getInstance().setPropOwnerName(str, StringUtil.getNonNullString(str2));
    }

    public static void setPropPermitlevel(String str, int i) {
        BleDevicePropCache.getInstance().setPropPermitLevel(str, i);
    }

    public static void setPropPincode(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            BluetoothMyLogger.e(getPropName(str) + " set pin code is empty");
            SecurityCache.getInstance().setPinCode(str, str2);
            BleDevicePropCache.getInstance().setPincode(str, encryptProp(str2));
            return;
        }
        if (!BluetoothService.getGreyProvider().isUseSecurityCache()) {
            BleDevicePropCache.getInstance().setPincode(str, encryptProp(str2));
        }
        SecurityCache.getInstance().setPinCode(str, str2);
        if (TextUtils.equals(str2, SecurityCache.getInstance().getPinCode(str))) {
            return;
        }
        BleDevicePropCache.getInstance().setPincode(str, encryptProp(str2));
    }

    public static void setPropProductId(String str, int i) {
        BleDevicePropCache.getInstance().setPropProductId(str, i);
    }

    public static void setPropRssi(String str, int i) {
        BleDevicePropCache.getInstance().setPropRssi(str, i);
    }

    public static void setPropSMac(String str, String str2) {
        BleDevicePropCache.getInstance().setPropSMac(str, str2);
    }

    public static void setPropScanRecord(String str, byte[] bArr) {
        BleDevicePropCache.getInstance().setPropScanRecord(str, bArr);
    }

    public static void setPropSessionKey(String str, String str2) {
        sessionKeyMap.put(str, str2);
        if (TextUtils.isEmpty(str2)) {
            SecurityCache.getInstance().setSessionKey(str, str2);
            BleDevicePropCache.getInstance().setEncryptedSessionKey(str, encryptProp(str2));
            return;
        }
        if (!BluetoothService.getGreyProvider().isUseSecurityCache()) {
            BleDevicePropCache.getInstance().setEncryptedSessionKey(str, encryptProp(str2));
        }
        SecurityCache.getInstance().setSessionKey(str, str2);
        if (TextUtils.equals(str2, SecurityCache.getInstance().getSessionKey(str))) {
            return;
        }
        BleDevicePropCache.getInstance().setEncryptedSessionKey(str, encryptProp(str2));
    }

    public static void setPropSessionKeyBytes(String str, byte[] bArr) {
        setPropSessionKey(str, ByteUtils.byteToString(bArr));
    }

    public static void setPropSharedKeyId(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            SecurityCache.getInstance().setShareKeyId(str, str2);
            BleDevicePropCache.getInstance().setEncryptedKeyId(str, encryptProp(str2));
            return;
        }
        if (!BluetoothService.getGreyProvider().isUseSecurityCache()) {
            BleDevicePropCache.getInstance().setEncryptedKeyId(str, encryptProp(str2));
        }
        SecurityCache.getInstance().setShareKeyId(str, str2);
        if (TextUtils.equals(str2, SecurityCache.getInstance().getShareKeyId(str))) {
            return;
        }
        BleDevicePropCache.getInstance().setEncryptedKeyId(str, encryptProp(str2));
    }

    public static void setPropToken(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            BluetoothMyLogger.e("BluetoothCache set prop token empty");
            SecurityCache.getInstance().setToken(str, str2);
            BleDevicePropCache.getInstance().setEncryptedToken(str, encryptProp(str2));
            return;
        }
        if (!BluetoothService.getGreyProvider().isUseSecurityCache()) {
            BleDevicePropCache.getInstance().setEncryptedToken(str, encryptProp(str2));
        }
        SecurityCache.getInstance().setToken(str, str2);
        if (TextUtils.equals(SecurityCache.getInstance().getToken(str), str2)) {
            return;
        }
        BleDevicePropCache.getInstance().setEncryptedToken(str, encryptProp(str2));
    }

    public static void setPropTokenBytes(String str, byte[] bArr) {
        setPropToken(str, ByteUtils.byteToString(bArr));
    }

    public static void setPropType(String str, int i) {
        BleDevicePropCache.getInstance().setPropType(str, i);
    }

    public static void setShowPincode(String str, boolean z) {
        BleDevicePropCache.getInstance().setShowPincode(str, z);
    }

    public static void setSupportPollDeviceLog(String str, boolean z) {
        BleDevicePropCache.getInstance().setPropExtra(str, "support.device.log", z);
    }

    public static void setSupportReportDeviceLog(String str, boolean z) {
        BleDevicePropCache.getInstance().setPropExtra(str, "support.report.device.log", z);
    }

    public static void updateRemoteDeviceCache(Device device) {
        String mac = device.getMac();
        setPropName(mac, device.getName());
        setPropToken(mac, device.getToken());
        setPropDid(mac, device.getDid());
        setPropBoundStatus(mac, 2);
        setPropSharedKeyId(mac, device.getKeyId());
    }

    public static boolean getPropExtra(String str, String str2, boolean z) {
        return BleDevicePropCache.getInstance().getPropExtra(str, str2, z);
    }

    public static void setPropExtra(String str, String str2, boolean z) {
        BleDevicePropCache.getInstance().setPropExtra(str, str2, z);
    }
}
