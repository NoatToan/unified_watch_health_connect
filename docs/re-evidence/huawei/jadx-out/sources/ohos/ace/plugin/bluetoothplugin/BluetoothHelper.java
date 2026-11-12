package ohos.ace.plugin.bluetoothplugin;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.ParcelUuid;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.huawei.hianalytics.core.storage.Event;
import com.huawei.openalliance.ad.constant.Constants;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class BluetoothHelper {
    private static final int ANDROID_PERMISSION_READ = 1;
    private static final int ANDROID_PERMISSION_WRITE = 2;
    private static final int CHARACTERISTIC_PROPERTIE_BROADCAST = 1;
    private static final int CHARACTERISTIC_PROPERTIE_EXTENDED_PROPERTIES = 128;
    private static final int CHARACTERISTIC_PROPERTIE_INDICATE = 32;
    private static final int CHARACTERISTIC_PROPERTIE_NOTIFY = 16;
    private static final int CHARACTERISTIC_PROPERTIE_READ = 2;
    private static final int CHARACTERISTIC_PROPERTIE_WRITE = 8;
    private static final int INVALID_LENGTH = 0;
    private static final String LOG_TAG = "BluetoothHelper";
    private static final int MAX_PERMISSIONS = 16;
    private static final int MAX_PROPERTIE = 255;
    private static final int MIN_PERMISSIONS = 0;
    private static final int MIN_PROPERTIE = 0;
    private static final int PERMISSION_READ = 1;
    private static final int PERMISSION_WRITE = 16;
    private static final String UUID_CHARACTERISTIC_AGGREGATE_FROMAT = "00002905-0000-1000-8000-00805F9B34FB";
    private static final String UUID_CHARACTERISTIC_EXTENDED_PROPERTIES = "00002900-0000-1000-8000-00805F9B34FB";
    private static final String UUID_CHARACTERISTIC_FROMAT = "00002904-0000-1000-8000-00805F9B34FB";
    private static final String UUID_CHARACTERISTIC_USER_DESCRIPTION = "00002901-0000-1000-8000-00805F9B34FB";
    private static final String UUID_CLIENT_CHARACTERISTIC_CONFIGURATION = "00002902-0000-1000-8000-00805F9B34FB";
    private static final String UUID_SERVER_CHARACTERISTIC_CONFIGURATION = "00002903-0000-1000-8000-00805F9B34FB";

    public static int convertPermission(int i) {
        int i2 = (i & 1) != 0 ? 1 : 0;
        return (i & 16) != 0 ? i2 | 2 : i2;
    }

    public static <T> T getValueFromJson(JSONObject jSONObject, String str, Class<T> cls) {
        if (jSONObject == null) {
            Log.e(LOG_TAG, "jsonObject is null");
            return null;
        }
        try {
            if (jSONObject.has(str)) {
                Object obj = jSONObject.get(str);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
                if (cls == Integer.class && (obj instanceof Number)) {
                    return cls.cast(Integer.valueOf(((Number) obj).intValue()));
                }
                if (cls == Long.class && (obj instanceof Number)) {
                    return cls.cast(Long.valueOf(((Number) obj).longValue()));
                }
                if (cls == Double.class && (obj instanceof Number)) {
                    return cls.cast(Double.valueOf(((Number) obj).doubleValue()));
                }
                if (cls == Boolean.class && (obj instanceof Boolean)) {
                    return cls.cast(obj);
                }
                if (cls == JSONArray.class && (obj instanceof JSONArray)) {
                    return cls.cast(obj);
                }
                if (cls == String.class && (obj instanceof String)) {
                    return cls.cast(obj);
                }
                Log.e(LOG_TAG, "The given ValueType : " + str + " does not exist");
                return null;
            }
            Log.e(LOG_TAG, "JsonData do not has " + str);
            return null;
        } catch (JSONException e) {
            Log.e(LOG_TAG, "CreateScanFilters failed; err is ", e);
            return null;
        }
    }

    public static byte[] convertJsonArrayToByteArray(JSONObject jSONObject, String str) {
        try {
            JSONArray jSONArray = (JSONArray) getValueFromJson(jSONObject, str, JSONArray.class);
            if (jSONArray == null) {
                Log.e(LOG_TAG, str + " dataJson is null");
                return null;
            }
            byte[] bArr = new byte[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                bArr[i] = (byte) jSONArray.getInt(i);
            }
            return bArr;
        } catch (IllegalArgumentException | JSONException e) {
            Log.e(LOG_TAG, "convertJsonArrayToByteArray failed; err is ", e);
            return null;
        }
    }

    public static ScanFilter getBluetoothScanFilter(String str) {
        ScanFilter.Builder builder = new ScanFilter.Builder();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String str2 = (String) getValueFromJson(jSONObject, "name", String.class);
            if (str2 != null && !str2.trim().isEmpty()) {
                builder.setDeviceName(str2);
            }
            String str3 = (String) getValueFromJson(jSONObject, "deviceId", String.class);
            if (str3 != null && !str3.trim().isEmpty()) {
                builder.setDeviceAddress(str3);
            }
            String str4 = (String) getValueFromJson(jSONObject, "serviceUuid", String.class);
            ParcelUuid parcelUuidFromString = str4 == null ? null : ParcelUuid.fromString(str4);
            String str5 = (String) getValueFromJson(jSONObject, "serviceUuidMask", String.class);
            ParcelUuid parcelUuidFromString2 = str5 == null ? null : ParcelUuid.fromString(str5);
            if (parcelUuidFromString != null || parcelUuidFromString2 != null) {
                builder.setServiceUuid(parcelUuidFromString, parcelUuidFromString2);
            }
            String str6 = (String) getValueFromJson(jSONObject, "serviceSolicitationUuid", String.class);
            ParcelUuid parcelUuidFromString3 = str6 == null ? null : ParcelUuid.fromString(str6);
            String str7 = (String) getValueFromJson(jSONObject, "serviceSolicitationUuidMask", String.class);
            ParcelUuid parcelUuidFromString4 = str7 == null ? null : ParcelUuid.fromString(str7);
            if (parcelUuidFromString3 != null || parcelUuidFromString4 != null) {
                Class.forName("android.bluetooth.le.ScanFilter$Builder").getMethod("setServiceSolicitationUuid", ParcelUuid.class, ParcelUuid.class).invoke(builder, parcelUuidFromString3, parcelUuidFromString4);
            }
            int iIntValue = ((Integer) getValueFromJson(jSONObject, "manufactureId", Integer.class)).intValue();
            byte[] bArrConvertJsonArrayToByteArray = convertJsonArrayToByteArray(jSONObject, "manufactureData");
            byte[] bArrConvertJsonArrayToByteArray2 = convertJsonArrayToByteArray(jSONObject, "manufactureDataMask");
            if (iIntValue != 0 && (bArrConvertJsonArrayToByteArray != null || bArrConvertJsonArrayToByteArray2 != null)) {
                builder.setManufacturerData(iIntValue, bArrConvertJsonArrayToByteArray, bArrConvertJsonArrayToByteArray2);
            } else if (iIntValue == 0 && (bArrConvertJsonArrayToByteArray != null || bArrConvertJsonArrayToByteArray2 != null)) {
                return null;
            }
            byte[] bArrConvertJsonArrayToByteArray3 = convertJsonArrayToByteArray(jSONObject, "serviceData");
            byte[] bArrConvertJsonArrayToByteArray4 = convertJsonArrayToByteArray(jSONObject, "serviceDataMask");
            if (parcelUuidFromString != null || bArrConvertJsonArrayToByteArray3 != null || bArrConvertJsonArrayToByteArray4 != null) {
                builder.setServiceData(parcelUuidFromString, bArrConvertJsonArrayToByteArray3, bArrConvertJsonArrayToByteArray4);
            }
            return builder.build();
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException | JSONException e) {
            Log.e(LOG_TAG, "createScanFilters failed; err is " + e.getClass().getSimpleName(), e);
            return null;
        }
    }

    public static List<ScanFilter> getBluetoothScanFilters(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            ScanFilter bluetoothScanFilter = getBluetoothScanFilter(str);
            if (bluetoothScanFilter == null) {
                return null;
            }
            arrayList.add(bluetoothScanFilter);
        }
        return arrayList;
    }

    public static ScanSettings getBluetoothLeScanSettings(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            long jLongValue = ((Long) getValueFromJson(jSONObject, "reportDelayMillis", Long.class)).longValue();
            int iIntValue = ((Integer) getValueFromJson(jSONObject, "scanMode", Integer.class)).intValue();
            boolean zBooleanValue = ((Boolean) getValueFromJson(jSONObject, "legacy", Boolean.class)).booleanValue();
            int iIntValue2 = ((Integer) getValueFromJson(jSONObject, "phy", Integer.class)).intValue();
            int iIntValue3 = ((Integer) getValueFromJson(jSONObject, "callbackType", Integer.class)).intValue();
            if (jLongValue >= 0 && ((iIntValue2 == 1 || iIntValue2 == 255) && iIntValue >= -1 && iIntValue <= 2 && (iIntValue3 == 1 || iIntValue3 == 2 || iIntValue3 == 4))) {
                return new ScanSettings.Builder().setReportDelay(jLongValue).setScanMode(iIntValue).setLegacy(zBooleanValue).setPhy(iIntValue2).setCallbackType(iIntValue3).build();
            }
            return null;
        } catch (IllegalArgumentException | JSONException e) {
            Log.e(LOG_TAG, "getBluetoothLeScanSettings failed; err is ", e);
            return null;
        }
    }

    public static String encapsulationBluetoothLeScanResults(ScanResult scanResult) {
        try {
            String address = scanResult.getDevice().getAddress();
            if (address == null || address.isEmpty()) {
                address = "";
            }
            int rssi = scanResult.getRssi();
            boolean zIsConnectable = scanResult.isConnectable();
            String name = scanResult.getDevice().getName();
            if (name == null || name.isEmpty()) {
                name = "";
            }
            byte[] bytes = scanResult.getScanRecord().getBytes();
            JSONArray jSONArray = new JSONArray();
            for (byte b2 : bytes) {
                jSONArray.put((int) b2);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("addr", address);
            jSONObject.put("rssi", rssi);
            jSONObject.put("connectable", zIsConnectable);
            jSONObject.put("name", name);
            jSONObject.put(Constants.CA_PAYLOAD, jSONArray);
            return jSONObject.toString();
        } catch (IllegalArgumentException | JSONException e) {
            Log.e(LOG_TAG, "encapsulationBluetoothLeScanResults failed; err is ", e);
            return "";
        }
    }

    public static String convertVectorToJString(Vector<String> vector) {
        return new JSONArray((Collection) vector).toString();
    }

    public static AdvertiseSettings getBluetoothAdvertiseSettings(String str) {
        try {
            return new AdvertiseSettings.Builder().setConnectable(((Boolean) getValueFromJson(new JSONObject(str), "connectable", Boolean.class)).booleanValue()).build();
        } catch (IllegalArgumentException | JSONException e) {
            Log.e(LOG_TAG, "getBluetoothAdvertiseSettings failed; err is ", e);
            return null;
        }
    }

    public static AdvertiseData getBluetoothAdvertiseData(String str) {
        try {
            AdvertiseData.Builder builder = new AdvertiseData.Builder();
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = (JSONArray) getValueFromJson(jSONObject, "serviceUuids", JSONArray.class);
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    builder.addServiceUuid(new ParcelUuid(UUID.fromString(jSONArray.getString(i))));
                }
            }
            JSONArray jSONArray2 = (JSONArray) getValueFromJson(jSONObject, "manufactureData", JSONArray.class);
            if (jSONArray2 != null) {
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    int iIntValue = ((Integer) getValueFromJson(jSONArray2.getJSONObject(i2), "manufactureId", Integer.class)).intValue();
                    byte[] bArrConvertJsonArrayToByteArray = new byte[0];
                    if (jSONArray2.getJSONObject(i2).has("manufactureValue")) {
                        bArrConvertJsonArrayToByteArray = convertJsonArrayToByteArray(jSONArray2.getJSONObject(i2), "manufactureValue");
                    }
                    builder.addManufacturerData(iIntValue, bArrConvertJsonArrayToByteArray);
                }
            }
            JSONArray jSONArray3 = (JSONArray) getValueFromJson(jSONObject, "serviceData", JSONArray.class);
            if (jSONArray3 != null) {
                for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                    String str2 = (String) getValueFromJson(jSONArray3.getJSONObject(i3), "serviceUuid", String.class);
                    byte[] bArrConvertJsonArrayToByteArray2 = new byte[0];
                    if (jSONArray3.getJSONObject(i3).has("serviceValue")) {
                        bArrConvertJsonArrayToByteArray2 = convertJsonArrayToByteArray(jSONArray3.getJSONObject(i3), "serviceValue");
                    }
                    builder.addServiceData(new ParcelUuid(UUID.fromString(str2)), bArrConvertJsonArrayToByteArray2);
                }
            }
            builder.setIncludeDeviceName(((Boolean) getValueFromJson(jSONObject, "includeDeviceName", Boolean.class)).booleanValue());
            return builder.build();
        } catch (IllegalArgumentException | JSONException e) {
            Log.e(LOG_TAG, "getBluetoothAdvertiseData failed, try-catch err is " + e);
            return null;
        }
    }

    public static boolean hasScanResponseData(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return (((JSONArray) getValueFromJson(jSONObject, "serviceUuids", JSONArray.class)) == null && ((JSONArray) getValueFromJson(jSONObject, "manufactureData", JSONArray.class)) == null && ((JSONArray) getValueFromJson(jSONObject, "serviceData", JSONArray.class)) == null) ? false : true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static BluetoothGattCharacteristic getBluetoothGattCharacteristic(String str, String str2, BluetoothGatt bluetoothGatt) {
        BluetoothGattCharacteristic characteristic;
        try {
            UUID uuidFromString = UUID.fromString((String) getValueFromJson(new JSONObject(str), "characteristicUuid", String.class));
            BluetoothGattService service = bluetoothGatt.getService(UUID.fromString(str2));
            if (service == null || (characteristic = service.getCharacteristic(uuidFromString)) == null) {
                return null;
            }
            return characteristic;
        } catch (IllegalArgumentException | JSONException e) {
            Log.e(LOG_TAG, "getBluetoothGattCharacteristic failed, try-catch err is " + e);
            return null;
        }
    }

    public static byte[] getCharacteristicValue(String str) {
        try {
            byte[] bArr = new byte[0];
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.has("characteristicValue") ? convertJsonArrayToByteArray(jSONObject, "characteristicValue") : bArr;
        } catch (JSONException e) {
            Log.e(LOG_TAG, "getCharacteristicValue failed, try-catch err is " + e);
            return null;
        }
    }

    public static String convertGattServiceToJSONString(BluetoothGattService bluetoothGattService) {
        try {
            if (bluetoothGattService == null) {
                Log.e(LOG_TAG, "BluetoothGattService Object to be converted is null");
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            String string = bluetoothGattService.getUuid().toString();
            int type = bluetoothGattService.getType();
            jSONObject.put("uuid", string);
            jSONObject.put("type", type);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.e(LOG_TAG, "Json data encapsulation error; error is : ", e);
            return "";
        }
    }

    public static String convertBluetoothDeviceToJString(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            Log.e(LOG_TAG, "Device Object to be converted is null");
            return "";
        }
        try {
            String address = bluetoothDevice.getAddress();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("addr", address);
            jSONObject.put(NotificationCompat.CATEGORY_TRANSPORT, 2);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.e(LOG_TAG, "Json data encapsulation error; error is : ", e);
            return "";
        }
    }

    public static String convertCharacteristicToJSONString(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        int length;
        try {
            if (bluetoothGattCharacteristic == null) {
                Log.e(LOG_TAG, "Characteristic Object to be converted is null");
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            String string = bluetoothGattCharacteristic.getUuid().toString();
            int properties = bluetoothGattCharacteristic.getProperties();
            int permissions = bluetoothGattCharacteristic.getPermissions();
            byte[] value = new byte[0];
            if (bluetoothGattCharacteristic.getValue() != null) {
                value = bluetoothGattCharacteristic.getValue();
                length = value.length;
            } else {
                length = 0;
            }
            JSONArray jSONArray = new JSONArray();
            for (byte b2 : value) {
                jSONArray.put((int) b2);
            }
            jSONObject.put("uuid", string);
            BluetoothGattService service = bluetoothGattCharacteristic.getService();
            if (service != null) {
                jSONObject.put("serviceUuid", service.getUuid().toString());
            }
            jSONObject.put(Event.EventConstants.PROPERTIES, properties);
            jSONObject.put("permissions", permissions);
            jSONObject.put("value", jSONArray);
            jSONObject.put("length", length);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.e(LOG_TAG, "Json data encapsulation error; error is : ", e);
            return "";
        }
    }

    public static String convertDescriptorToJSONString(BluetoothGattDescriptor bluetoothGattDescriptor) {
        int length;
        try {
            if (bluetoothGattDescriptor == null) {
                Log.e(LOG_TAG, "descriptor Object to be converted is null.");
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            UUID uuid = bluetoothGattDescriptor.getUuid();
            int permissions = bluetoothGattDescriptor.getPermissions();
            byte[] value = new byte[0];
            if (bluetoothGattDescriptor.getValue() != null) {
                value = bluetoothGattDescriptor.getValue();
                length = value.length;
            } else {
                Log.e(LOG_TAG, "descriptor value is null.");
                length = 0;
            }
            JSONArray jSONArray = new JSONArray();
            for (byte b2 : value) {
                jSONArray.put((int) b2);
            }
            jSONObject.put("uuid", uuid.toString());
            BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
            if (characteristic != null) {
                jSONObject.put("characteristicUuid", characteristic.getUuid().toString());
                BluetoothGattService service = characteristic.getService();
                if (service != null) {
                    jSONObject.put("serviceUuid", service.getUuid().toString());
                }
            }
            jSONObject.put("permissions", permissions);
            jSONObject.put("value", jSONArray);
            jSONObject.put("length", length);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.e(LOG_TAG, "Json data encapsulation error; error is : ", e);
            return "";
        }
    }

    public static String convertCharacteristicToJString(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        try {
            if (bluetoothGattCharacteristic == null) {
                Log.e(LOG_TAG, "Characteristic Object to be converted is null");
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            String string = bluetoothGattCharacteristic.getUuid().toString();
            int length = 0;
            byte[] value = new byte[0];
            if (bluetoothGattCharacteristic.getValue() != null) {
                value = bluetoothGattCharacteristic.getValue();
                length = value.length;
            }
            String str = new String(value, StandardCharsets.UTF_8);
            jSONObject.put("uuid", string);
            jSONObject.put("handle", i);
            jSONObject.put("value", str);
            jSONObject.put("length", length);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.e(LOG_TAG, "Json data encapsulation error; error is : ", e);
            return "";
        }
    }

    public static String convertDescriptorToJSONString(BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        return convertDescriptorToJSONString(bluetoothGattDescriptor, i, null);
    }

    public static String convertDescriptorToJSONString(BluetoothGattDescriptor bluetoothGattDescriptor, int i, byte[] bArr) {
        try {
            if (bluetoothGattDescriptor == null) {
                Log.e(LOG_TAG, "Descriptor Object to be converted is null");
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            String string = bluetoothGattDescriptor.getUuid().toString();
            int permissions = bluetoothGattDescriptor.getPermissions();
            int length = 0;
            byte[] bArr2 = new byte[0];
            if (bArr != null) {
                length = bArr.length;
            } else if (bluetoothGattDescriptor.getValue() != null) {
                bArr = bluetoothGattDescriptor.getValue();
                length = bArr.length;
            } else {
                bArr = bArr2;
            }
            String str = new String(bArr, StandardCharsets.UTF_8);
            jSONObject.put("uuid", string);
            jSONObject.put("handle", i);
            jSONObject.put("permissions", permissions);
            jSONObject.put("value", str);
            jSONObject.put("length", length);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.e(LOG_TAG, "convert descriptor To JSONString failed; err is ", e);
            return "";
        }
    }

    public static int addServiceToCustomGattServer(String str, CustomGattServer customGattServer) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String str2 = (String) getValueFromJson(jSONObject, "serviceUuid", String.class);
            boolean zBooleanValue = ((Boolean) getValueFromJson(jSONObject, "isPrimary", Boolean.class)).booleanValue();
            int iIntValue = ((Integer) getValueFromJson(jSONObject, "handle", Integer.class)).intValue();
            int iIntValue2 = ((Integer) getValueFromJson(jSONObject, "endHandle", Integer.class)).intValue();
            JSONArray jSONArray = (JSONArray) getValueFromJson(jSONObject, "characteristics", JSONArray.class);
            UUID uuidFromString = UUID.fromString(str2);
            if (!checkServiceJsonIsLegality(customGattServer, str2, jSONArray)) {
                Log.e(LOG_TAG, "addServiceToCustomGattServer failed; service Json is not legally");
                return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
            }
            BluetoothGattService bluetoothGattService = new BluetoothGattService(uuidFromString, !zBooleanValue ? 1 : 0);
            int id = BluetoothErrorCode.BT_NO_ERROR.getId();
            HashMap<Integer, BluetoothGattCharacteristic> characteristicMap = getCharacteristicMap(jSONArray, customGattServer);
            if (characteristicMap == null) {
                return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
            }
            for (Map.Entry<Integer, BluetoothGattCharacteristic> entry : characteristicMap.entrySet()) {
                Integer key = entry.getKey();
                BluetoothGattCharacteristic value = entry.getValue();
                if (bluetoothGattService.addCharacteristic(value)) {
                    customGattServer.addBluetoothGattCharacter(key.intValue(), value);
                }
            }
            customGattServer.addBluetoothGattService(iIntValue, bluetoothGattService);
            customGattServer.addBluetoothHandleInfo(iIntValue, iIntValue2);
            return id;
        } catch (IllegalArgumentException | JSONException e) {
            Log.e(LOG_TAG, "addServiceToCustomGattServer failed; err is ", e);
            return BluetoothErrorCode.BT_ERR_INTERNAL_ERROR.getId();
        }
    }

    public static boolean checkServiceJsonIsLegality(CustomGattServer customGattServer, String str, JSONArray jSONArray) {
        if (customGattServer.getBluetoothGattServer() != null && !customGattServer.serviceIsExist(str) && checkCharacterJsonIsLegality(jSONArray)) {
            return true;
        }
        Log.e(LOG_TAG, "checkServiceJsonIsLegality failed, bluetoothGattServer is null or service is exist");
        return false;
    }

    public static boolean checkCharacterJsonIsLegality(JSONArray jSONArray) {
        if (jSONArray == null) {
            return true;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if (!jSONArray.getJSONObject(i).has("characteristicValue")) {
                    return false;
                }
                int iIntValue = ((Integer) getValueFromJson(jSONArray.getJSONObject(i), Event.EventConstants.PROPERTIES, Integer.class)).intValue();
                int iConvertPermission = convertPermission(((Integer) getValueFromJson(jSONArray.getJSONObject(i), "permissions", Integer.class)).intValue());
                JSONArray jSONArray2 = (JSONArray) getValueFromJson(jSONArray.getJSONObject(i), "descriptors", JSONArray.class);
                if (iIntValue <= 255 && iIntValue >= 0 && iConvertPermission <= 16 && iConvertPermission >= 0) {
                    if (((iIntValue & 2) != 0 && (iConvertPermission & 1) == 0) || (((iIntValue & 8) != 0 && (iConvertPermission & 2) == 0) || !checkDescriptorJsonIsLegality(iIntValue, jSONArray2))) {
                        return false;
                    }
                }
                return false;
            } catch (JSONException e) {
                Log.e(LOG_TAG, "checkCharacterJsonIsLegality error; error is : ", e);
                return false;
            }
        }
        return true;
    }

    public static boolean checkDescriptorJsonIsLegality(int i, JSONArray jSONArray) {
        if (jSONArray == null) {
            return true;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                if (!jSONArray.getJSONObject(i2).has("descriptorValue")) {
                    return false;
                }
                List<String> descriptorUuidList = getDescriptorUuidList(jSONArray);
                int iConvertPermission = convertPermission(((Integer) getValueFromJson(jSONArray.getJSONObject(i2), "permissions", Integer.class)).intValue());
                if (iConvertPermission <= 16 && iConvertPermission >= 0) {
                    if ((i & 1) != 0 && Collections.frequency(descriptorUuidList, UUID_SERVER_CHARACTERISTIC_CONFIGURATION) != 1) {
                        return false;
                    }
                    if (((i & 16) != 0 || (i & 32) != 0) && Collections.frequency(descriptorUuidList, UUID_CLIENT_CHARACTERISTIC_CONFIGURATION) != 1) {
                        return false;
                    }
                    if (((i & 128) != 0 && Collections.frequency(descriptorUuidList, UUID_CHARACTERISTIC_EXTENDED_PROPERTIES) != 1) || Collections.frequency(descriptorUuidList, UUID_CHARACTERISTIC_USER_DESCRIPTION) > 1) {
                        return false;
                    }
                    if (Collections.frequency(descriptorUuidList, UUID_CHARACTERISTIC_FROMAT) > 1 && Collections.frequency(descriptorUuidList, UUID_CHARACTERISTIC_AGGREGATE_FROMAT) != 1) {
                        return false;
                    }
                }
                return false;
            } catch (NullPointerException | JSONException e) {
                Log.e(LOG_TAG, "checkDescriptorJsonIsLegality error; error is : ", e);
                return false;
            }
        }
        return true;
    }

    public static HashMap<Integer, BluetoothGattCharacteristic> getCharacteristicMap(JSONArray jSONArray, CustomGattServer customGattServer) {
        HashMap<Integer, BluetoothGattDescriptor> descriptorMap;
        HashMap<Integer, BluetoothGattCharacteristic> map = new HashMap<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String str = (String) getValueFromJson(jSONArray.getJSONObject(i), "characteristicUuid", String.class);
                    byte[] bArrConvertJsonArrayToByteArray = new byte[0];
                    if (jSONArray.getJSONObject(i).has("characteristicValue")) {
                        bArrConvertJsonArrayToByteArray = convertJsonArrayToByteArray(jSONArray.getJSONObject(i), "characteristicValue");
                    }
                    Integer num = (Integer) getValueFromJson(jSONArray.getJSONObject(i), "characterHandle", Integer.class);
                    num.intValue();
                    int iIntValue = ((Integer) getValueFromJson(jSONArray.getJSONObject(i), "permissions", Integer.class)).intValue();
                    JSONArray jSONArray2 = (JSONArray) getValueFromJson(jSONArray.getJSONObject(i), "descriptors", JSONArray.class);
                    BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(UUID.fromString(str), ((Integer) getValueFromJson(jSONArray.getJSONObject(i), Event.EventConstants.PROPERTIES, Integer.class)).intValue(), iIntValue);
                    bluetoothGattCharacteristic.setValue(bArrConvertJsonArrayToByteArray);
                    if (jSONArray2 != null && (descriptorMap = getDescriptorMap(jSONArray2)) != null) {
                        for (Map.Entry<Integer, BluetoothGattDescriptor> entry : descriptorMap.entrySet()) {
                            Integer key = entry.getKey();
                            BluetoothGattDescriptor value = entry.getValue();
                            if (bluetoothGattCharacteristic.addDescriptor(value)) {
                                customGattServer.addBluetoothGattDescriptor(key.intValue(), value);
                            }
                        }
                    }
                    map.put(num, bluetoothGattCharacteristic);
                } catch (IllegalArgumentException | JSONException e) {
                    Log.e(LOG_TAG, "getCharacteristicMap failed; err is ", e);
                    return new HashMap<>();
                }
            }
        }
        return map;
    }

    public static HashMap<Integer, BluetoothGattDescriptor> getDescriptorMap(JSONArray jSONArray) {
        HashMap<Integer, BluetoothGattDescriptor> map = new HashMap<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String str = (String) getValueFromJson(jSONArray.getJSONObject(i), "descriptorUuid", String.class);
                    byte[] bArrConvertJsonArrayToByteArray = new byte[0];
                    if (jSONArray.getJSONObject(i).has("descriptorValue")) {
                        bArrConvertJsonArrayToByteArray = convertJsonArrayToByteArray(jSONArray.getJSONObject(i), "descriptorValue");
                    }
                    Integer num = (Integer) getValueFromJson(jSONArray.getJSONObject(i), "desHandle", Integer.class);
                    num.intValue();
                    BluetoothGattDescriptor bluetoothGattDescriptor = new BluetoothGattDescriptor(UUID.fromString(str), ((Integer) getValueFromJson(jSONArray.getJSONObject(i), "permissions", Integer.class)).intValue());
                    bluetoothGattDescriptor.setValue(bArrConvertJsonArrayToByteArray);
                    map.put(num, bluetoothGattDescriptor);
                } catch (IllegalArgumentException | JSONException e) {
                    Log.e(LOG_TAG, "getDescriptorMap failed; err is ", e);
                    return new HashMap<>();
                }
            }
        }
        return map;
    }

    public static List<String> getDescriptorUuidList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    arrayList.add((String) getValueFromJson(jSONArray.getJSONObject(i), "descriptorUuid", String.class));
                } catch (JSONException e) {
                    Log.e(LOG_TAG, "getDescriptorUuidList failed; err is ", e);
                    return new ArrayList();
                }
            }
        }
        return arrayList;
    }
}
