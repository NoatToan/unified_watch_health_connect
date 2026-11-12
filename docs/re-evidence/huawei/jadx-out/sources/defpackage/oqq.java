package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hianalytics.core.storage.Event;
import com.huawei.wearengine.sensor.AsyncReadCallback;
import com.huawei.wearengine.sensor.AsyncStopCallback;
import com.huawei.wearengine.sensor.DataResult;
import com.huawei.wearengine.sensor.Sensor;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class oqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f44374a = new Object();
    private static final Pattern e = Pattern.compile("[0-9]+:");

    private static boolean e(byte b2) {
        return (b2 & (-128)) == -128;
    }

    public static byte[] a() {
        return oqn.a("00012400000003000000FFE800000800");
    }

    public static byte[] d(Sensor sensor, int i, String str) {
        if (sensor == null) {
            yit.b("CommandUtil", "controlSensorCmd sensor is null");
            return new byte[0];
        }
        if (TextUtils.isEmpty(str)) {
            yit.b("CommandUtil", "controlSensorCmd cmd is null");
            return new byte[0];
        }
        yit.a("CommandUtil", "controlSensorCmd sensorId " + sensor.getId() + " cmd " + str);
        StringBuilder sb = new StringBuilder("SET_PARAMETER * DMSDP/1.0\r\nServiceType: 2048\r\nDataSessionID: ");
        sb.append(sensor.getId());
        sb.append("\r\nCSeq: ");
        sb.append(i);
        sb.append("\r\nDataVersion: 2\r\nRate: ");
        sb.append(ymn.d(sensor.getExtendJson()));
        sb.append("\r\nContent-Type: text/parameters\r\nContent-Length: ");
        StringBuilder sb2 = new StringBuilder("msdp_trigger_method: ");
        sb2.append(str);
        sb.append(sb2.length());
        sb.append("\r\n\r\n");
        sb.append((CharSequence) sb2);
        sb.append((char) 0);
        String string = sb.toString();
        yit.a("CommandUtil", "controlSensorCmd controlSensorCmd:");
        yit.a("CommandUtil", string);
        byte[] bytes = new byte[0];
        try {
            bytes = string.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            yit.b("CommandUtil", "controlSensorCmd UnsupportedEncodingException");
        }
        return d((Integer) 2, bytes);
    }

    public static byte[] d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            yit.c("CommandUtil", "getSensorData value is empty");
            return new byte[0];
        }
        if (bArr.length > 65535) {
            yit.c("CommandUtil", "getSensorData value.length out of range");
            return new byte[0];
        }
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        e(bArr, 1, bArr2, 0, length);
        yit.a("CommandUtil", "getSensorData: " + Arrays.toString(bArr2));
        return bArr2;
    }

    public static float[] e(int i, byte[] bArr, boolean z) {
        if (i > 4) {
            yit.c("CommandUtil", "convertByteArrayToFloatArray size over 4");
            return new float[0];
        }
        if (i <= 0) {
            yit.c("CommandUtil", "convertByteArrayToFloatArray size is 0");
            return new float[0];
        }
        if (bArr == null) {
            yit.c("CommandUtil", "convertByteArrayToFloatArray data is null");
            return new float[0];
        }
        float[] fArr = new float[bArr.length / i];
        int i2 = 0;
        while (i2 < bArr.length) {
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                i3 |= (bArr[i2 + i4] & 255) << (i4 * 8);
            }
            fArr[i2 / i] = z ? Float.intBitsToFloat(i3) : i3;
            i2 += i;
        }
        return fArr;
    }

    public static void c(byte[] bArr, Map<Integer, AsyncReadCallback> map, Map<Integer, AsyncStopCallback> map2) throws RemoteException {
        if (bArr == null || bArr.length <= 0) {
            yit.b("CommandUtil", "handleSensorEnable dataContents is invalids");
            return;
        }
        if (map == null) {
            yit.b("CommandUtil", "handleSensorEnable asyncReadErrorCallbackMap is null");
            return;
        }
        if (map2 == null) {
            yit.b("CommandUtil", "handleSensorEnable asyncStopCallbackMap is null");
            return;
        }
        byte[] bArrA = a(bArr);
        yit.a("CommandUtil", "handleSensorEnable data: " + oqn.a(bArrA));
        int length = bArrA.length + (-1);
        byte[] bArr2 = new byte[length];
        e(bArrA, 0, bArr2, 0, length);
        String[] strArrSplit = new String(bArr2, Charset.defaultCharset()).split("\r\n");
        int iA = a(strArrSplit);
        int iE = e(strArrSplit);
        yit.e("CommandUtil", "handleSensorEnable code: " + iA + " req: " + iE);
        AsyncReadCallback asyncReadCallback = map.get(Integer.valueOf(iE));
        map.remove(Integer.valueOf(iE));
        if (asyncReadCallback != null) {
            if (iA == 200) {
                return;
            }
            try {
                asyncReadCallback.onReadResult(iA, null);
                return;
            } catch (Exception unused) {
                yit.b("CommandUtil", "handleSensorEnable asyncReadCallback onReadResult Exception");
                return;
            }
        }
        AsyncStopCallback asyncStopCallback = map2.get(Integer.valueOf(iE));
        map2.remove(Integer.valueOf(iE));
        if (asyncStopCallback != null) {
            try {
                asyncStopCallback.onStopResult(iA != 200 ? iA : 0);
            } catch (Exception unused2) {
                yit.b("CommandUtil", "handleSensorEnable asyncStopCallback onStopResult Exception");
            }
        }
    }

    private static int a(String[] strArr) {
        String str;
        if (strArr == null) {
            yit.b("CommandUtil", "getCode retLines is null");
            throw new IllegalStateException(String.valueOf(12));
        }
        String[] strArrSplit = strArr[0].split(" ");
        if (strArrSplit.length <= 1) {
            yit.c("CommandUtil", "code information is null.");
            str = null;
        } else {
            str = strArrSplit[1];
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            yit.b("CommandUtil", "getCode NumberFormatException");
            throw new IllegalStateException(String.valueOf(12));
        }
    }

    private static int e(String[] strArr) {
        String str;
        if (strArr == null) {
            yit.b("CommandUtil", "getReq retLines is null");
            throw new IllegalStateException(String.valueOf(12));
        }
        try {
            if (strArr.length <= 2) {
                yit.c("CommandUtil", "result does not contain req information.");
            } else {
                String[] strArrSplit = strArr[2].split(": ");
                if (strArrSplit.length <= 1) {
                    yit.c("CommandUtil", "req information is null.");
                } else {
                    str = strArrSplit[1];
                }
                return Integer.parseInt(str);
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            yit.b("CommandUtil", "getReq NumberFormatException");
            throw new IllegalStateException(String.valueOf(12));
        }
        str = null;
    }

    public static void d(byte[] bArr, List<Sensor> list, yiu yiuVar) {
        if (bArr == null || bArr.length <= 0) {
            yit.b("CommandUtil", "handleSensorSync dataContents is invalids");
            return;
        }
        if (list == null) {
            yit.b("CommandUtil", "handleSensorSync sensors is null");
            return;
        }
        if (yiuVar == null) {
            yit.b("CommandUtil", "handleSensorSync asynToSyncListener is null");
            return;
        }
        yit.a("CommandUtil", "handleSensorSync dataContents " + oqn.a(bArr));
        byte[] bArrJ = j(a(bArr));
        b bVarD = d(bArrJ, 0);
        byte[] bArr2 = new byte[(bArrJ.length - 1) - bVarD.c()];
        e(bArrJ, bVarD.c(), bArr2, 0, (bArrJ.length - 1) - bVarD.c());
        int iE = e(bArr2);
        if (list.size() >= iE) {
            yit.e("CommandUtil", "handleSensorSync onFinish first");
            yiuVar.onFinish();
            return;
        }
        Sensor sensorB = b(bArr2);
        synchronized (f44374a) {
            list.add(sensorB);
        }
        yit.e("CommandUtil", "handleSensorSync sensor num is " + list.size());
        if (list.size() >= iE) {
            yit.e("CommandUtil", "handleSensorSync onFinish");
            yiuVar.onFinish();
        }
    }

    public static int c(byte[] bArr) {
        byte[] bArr2 = new byte[2];
        e(bArr, 0, bArr2, 0, 2);
        yit.a("CommandUtil", "parseControlModeCmdType controlModeCmd " + Arrays.toString(bArr2));
        return bArr2[1];
    }

    private static Sensor b(byte[] bArr) {
        try {
            JSONObject jSONObject = new JSONObject(c(new String(bArr, Charset.defaultCharset())));
            yit.a("CommandUtil", "getSensor CMD_SYNC_DEVICE_SERVICE resultJson: " + jSONObject);
            JSONObject jSONObject2 = jSONObject.getJSONObject(Event.EventConstants.PROPERTIES).getJSONObject("2017");
            int i = jSONObject2.getInt("sensorType");
            yit.a("CommandUtil", "getSensor CMD_SYNC_DEVICE_SERVICE innerSensorType: " + i);
            int iC = ykw.c(i);
            yit.a("CommandUtil", "getSensor CMD_SYNC_DEVICE_SERVICE sensorType: " + iC);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("FrequencyType", 2);
            if (jSONObject.has("isSupportUTC")) {
                jSONObject3.put("isSupportUTC", jSONObject.getBoolean("isSupportUTC"));
            }
            if (jSONObject.has("FrequencyList")) {
                jSONObject3.put("SupportFrequencyList", jSONObject.getString("FrequencyList"));
            }
            if (jSONObject.has("SensorChipType")) {
                jSONObject3.put("SensorChipType", jSONObject.getString("SensorChipType"));
            }
            return new Sensor(jSONObject2.getInt("sensorId"), iC, jSONObject2.getInt("accuracy"), (float) jSONObject2.getDouble("resolution"), jSONObject3.toString());
        } catch (JSONException e2) {
            yit.b("CommandUtil", "createSensorByJson resultJson formmat error");
            yit.a("CommandUtil", "createSensorByJson resultJson formmat error " + e2);
            return null;
        }
    }

    private static String c(String str) {
        Matcher matcher = e.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group();
            str = str.replace(strGroup, "\"" + strGroup.substring(0, strGroup.length() - 1) + "\":");
        }
        return str.replaceAll("\\\\", "").replace("\"{", "{").replace("}\"", "}");
    }

    private static int e(byte[] bArr) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject(c(new String(bArr, Charset.defaultCharset()))).getJSONObject(Event.EventConstants.PROPERTIES);
            Iterator<String> itKeys = jSONObject.keys();
            int i = 0;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!(next instanceof String)) {
                    str = "";
                } else {
                    str = next;
                }
                if (!str.equals("2017")) {
                    yit.e("CommandUtil", "parseSensorNum key: " + str + " value: " + jSONObject.getBoolean(str));
                    if (jSONObject.getBoolean(str)) {
                        i++;
                    }
                }
            }
            yit.e("CommandUtil", "parseSensorNum sensor num is " + i);
            return i;
        } catch (JSONException e2) {
            yit.b("CommandUtil", "createSensorByJson resultJson formmat error");
            yit.a("CommandUtil", "createSensorByJson resultJson formmat error " + e2);
            return -1;
        }
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 2) {
            return bArr2;
        }
        byte[] bArr3 = new byte[bArr.length - 2];
        e(bArr, 2, bArr3, 0, bArr.length - 2);
        return bArr3;
    }

    private static byte[] j(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 9) {
            return bArr2;
        }
        byte[] bArr3 = new byte[bArr.length - 9];
        e(bArr, 9, bArr3, 0, bArr.length - 9);
        return bArr3;
    }

    private static void e(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i < 0) {
            yit.b("CommandUtil", "srcPos IndexOutOfBounds");
            return;
        }
        if (i2 < 0) {
            yit.b("CommandUtil", "destPos IndexOutOfBounds");
            return;
        }
        if (i3 < 0) {
            yit.b("CommandUtil", "length IndexOutOfBounds");
            return;
        }
        if (i + i3 > bArr.length) {
            yit.b("CommandUtil", "srcPos + length IndexOutOfBounds");
        } else if (i2 + i3 > bArr2.length) {
            yit.b("CommandUtil", "destPos + length IndexOutOfBounds");
        } else {
            System.arraycopy(bArr, i, bArr2, i2, i3);
        }
    }

    public static byte[] d(byte b2) {
        return new byte[]{b2, 0};
    }

    public static int c(int i, byte[] bArr, DataResult dataResult) {
        if (bArr == null || dataResult == null) {
            yit.b("CommandUtil", "getMultiChannelSensorData sensorData or dataResult is null");
            return 12;
        }
        int iA = 0;
        try {
            long jD = 0;
            byte[] bArrA = null;
            int iA2 = 0;
            for (oqs oqsVar : new oqo().d(oqn.a(bArr)).e()) {
                try {
                    yit.a("CommandUtil", "getNewSensorData tlv tag " + oqsVar.c() + " length " + oqsVar.d() + " value " + oqsVar.b());
                    int iA3 = a(oqsVar.c());
                    if (iA3 == 1) {
                        iA2 = a(oqsVar.b());
                    } else if (iA3 == 3) {
                        jD = d(oqsVar.b());
                    } else if (iA3 == 4) {
                        iA = a(oqsVar.b());
                    } else if (iA3 == 5) {
                        bArrA = oqn.a(oqsVar.b());
                    }
                } catch (oqr unused) {
                    iA = iA2;
                    yit.b("CommandUtil", "getNewSensorData parse sensorData Exception");
                    return iA;
                }
            }
            dataResult.setTimestamp(jD);
            c(i, bArrA, iA, dataResult);
            return iA2;
        } catch (oqr unused2) {
        }
    }

    public static int e(int i, boolean z, byte[] bArr, DataResult dataResult) {
        byte[] bArr2;
        if (bArr == null || dataResult == null) {
            yit.b("CommandUtil", "getNoneChannelSensorData sensorData or dataResult is null");
            return 12;
        }
        if (bArr.length < 9) {
            dataResult.setTimestamp(0L);
            dataResult.setListValues(new LinkedList());
            if (dataResult.getSensor().getName().equals(Sensor.NAME_ACC)) {
                dataResult.setValues(new float[0]);
                return 13;
            }
            dataResult.setValues(e(ykw.a(i), bArr, i == 4));
            return 0;
        }
        int i2 = 8;
        byte[] bArr3 = new byte[8];
        e(bArr, 0, bArr3, 0, 8);
        dataResult.setTimestamp(d(oqn.a(bArr3)));
        if (z) {
            byte[] bArr4 = new byte[8];
            e(bArr, 8, bArr4, 0, 8);
            dataResult.setUtc(d(oqn.a(bArr4)));
            i2 = 16;
            bArr2 = new byte[bArr.length - 16];
        } else {
            bArr2 = new byte[bArr.length - 8];
        }
        e(bArr, i2, bArr2, 0, bArr2.length);
        dataResult.setValues(e(ykw.a(i), bArr2, i == 4));
        dataResult.setListValues(new LinkedList());
        return 0;
    }

    public static int e(int i, byte[] bArr, DataResult dataResult) {
        if (bArr == null || dataResult == null) {
            yit.b("CommandUtil", "getHeartRateSensorData sensorData or dataResult is null");
            return 12;
        }
        if (bArr.length < 9) {
            dataResult.setTimestamp(0L);
            dataResult.setListValues(new LinkedList());
            dataResult.setValues(e(ykw.a(i), bArr, false));
            return 0;
        }
        byte[] bArr2 = new byte[8];
        e(bArr, 0, bArr2, 0, 8);
        dataResult.setTimestamp(d(oqn.a(bArr2)));
        int length = bArr.length - 8;
        byte[] bArr3 = new byte[length];
        e(bArr, 8, bArr3, 0, length);
        float[] fArrE = e(ykw.a(i), bArr3, false);
        dataResult.setValues(fArrE);
        dataResult.setListValues(new LinkedList());
        if (((int) fArrE[0]) <= 255) {
            return 0;
        }
        dataResult.setTimestamp(0L);
        dataResult.setValues(new float[0]);
        return (int) fArrE[0];
    }

    private static void c(int i, byte[] bArr, int i2, DataResult dataResult) {
        ArrayList arrayList = new ArrayList();
        dataResult.setListValues(arrayList);
        dataResult.setValues(new float[0]);
        float[] fArrE = e(4, bArr, false);
        if (fArrE.length == 0) {
            yit.c("CommandUtil", "parseNewSensorData floatData is empty");
            return;
        }
        if (i2 == 0) {
            i2 = fArrE.length;
        }
        int length = fArrE.length / i2;
        for (int i3 = 0; i3 < length; i3++) {
            DataResult dataResult2 = new DataResult();
            dataResult2.setTimestamp(dataResult.getTimestamp());
            dataResult2.setChannel(d(i, i3));
            float[] fArr = new float[i2];
            for (int i4 = 0; i4 < fArrE.length; i4 += length) {
                fArr[i4 / length] = fArrE[i4 + i3];
            }
            dataResult2.setValues(fArr);
            dataResult2.setSensor(dataResult.getSensor());
            arrayList.add(dataResult2);
        }
        dataResult.setListValues(arrayList);
    }

    private static int d(int i, int i2) {
        if (i == 1) {
            return ykw.e(i2);
        }
        return 0;
    }

    public static int a(String str) {
        int iA = a(str, 16);
        yit.a("CommandUtil", "parseIntByRadix value is: " + iA);
        return iA;
    }

    private static int a(String str, int i) {
        try {
            return Integer.parseInt(str, i);
        } catch (NumberFormatException unused) {
            yit.b("CommandUtil", "parseIntByRadix exception, input is : " + str);
            return -1;
        }
    }

    public static long d(String str) {
        try {
            return Long.parseLong(str, 16);
        } catch (NumberFormatException unused) {
            yit.b("CommandUtil", "parseLongByRadix exception");
            return -1L;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f44375a;
        private int d;

        b(int i, int i2) {
            this.d = i;
            this.f44375a = i2;
        }

        public int c() {
            return this.f44375a;
        }
    }

    private static b d(byte[] bArr, int i) {
        int length = i + 4;
        if (length > bArr.length) {
            length = bArr.length;
        }
        int i2 = 0;
        int i3 = i;
        while (i3 < length) {
            byte b2 = bArr[i3];
            i2 |= (b2 & 127) << ((i3 - i) * 7);
            i3++;
            if (e(b2)) {
                break;
            }
        }
        return new b(i2, i3);
    }

    public static byte[] d(Integer num, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            yit.c("CommandUtil", "packageSendData data is empty");
            return new byte[0];
        }
        if (bArr.length > 65535) {
            yit.c("CommandUtil", "packageSendData data.length out of range");
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length + 2];
        bArr2[0] = 0;
        bArr2[1] = num.byteValue();
        e(bArr, 0, bArr2, 2, bArr.length);
        return bArr2;
    }
}
