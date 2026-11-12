package ohos.ace.adapter.capability.bridge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ohos.ace.adapter.ALog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class ParameterHelper {
    private static final int HASH_CODE = 1;
    private static final long JS_MAX_VALUE = 9007199254740991L;
    private static final long JS_MIN_VALUE = -9007199254740991L;
    private static final String LOG_TAG = "ParameterHelper";
    private static final long[] LONG_ARRAY;
    private static final String LONG_ARRAY_CLASS_NAME;

    static {
        long[] jArr = new long[0];
        LONG_ARRAY = jArr;
        LONG_ARRAY_CLASS_NAME = jArr.getClass().getName().toString();
    }

    public ParameterHelper() {
        ALog.i(LOG_TAG, "ParameterHelper construction");
    }

    public static boolean isExceedJsSafeInteger(Object obj) {
        if (!(obj instanceof Long)) {
            return true;
        }
        Long l = (Long) obj;
        if (l.longValue() <= JS_MAX_VALUE && l.longValue() >= JS_MIN_VALUE) {
            return true;
        }
        ALog.e(LOG_TAG, "Data exceeds JavaScript safe integer.");
        return false;
    }

    public static Object[] binaryTransformObject(Object obj) {
        if (obj instanceof List) {
            return ((List) obj).toArray();
        }
        return null;
    }

    public static Object[] jsonTransformObject(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            Object objOpt = jSONObject.opt(itKeys.next());
            if (objOpt == null) {
                return null;
            }
            if (objOpt instanceof JSONArray) {
                addArraysObject((JSONArray) objOpt, arrayList);
            } else if (objOpt instanceof JSONObject) {
                Object objConvertJsonObjectToTypedMap = convertJsonObjectToTypedMap((JSONObject) objOpt);
                if (objConvertJsonObjectToTypedMap != null) {
                    objOpt = objConvertJsonObjectToTypedMap;
                }
                arrayList.add(objOpt);
            } else {
                arrayList.add(objOpt);
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    private static void addArraysObject(JSONArray jSONArray, List<Object> list) {
        if (jSONArray != null) {
            try {
                if (jSONArray.get(0) instanceof String) {
                    addArraysString(jSONArray, list, 0);
                    return;
                }
            } catch (JSONException unused) {
                ALog.e(LOG_TAG, "addArraysObject failed, JSONException.");
                return;
            }
        }
        if (jSONArray != null && (jSONArray.get(0) instanceof Integer)) {
            addArraysInteger(jSONArray, list, 0);
            return;
        }
        if (jSONArray != null && (jSONArray.get(0) instanceof Boolean)) {
            addArraysBoolean(jSONArray, list, 0);
            return;
        }
        if (jSONArray != null && (jSONArray.get(0) instanceof Character)) {
            addArraysCharacter(jSONArray, list, 0);
            return;
        }
        if (jSONArray != null && (jSONArray.get(0) instanceof Double)) {
            addArraysDouble(jSONArray, list, 0);
        } else {
            if (jSONArray == null || !(jSONArray.get(0) instanceof Float)) {
                return;
            }
            addArraysFloat(jSONArray, list, 0);
        }
    }

    private static void addArraysString(JSONArray jSONArray, List<Object> list, int i) {
        try {
            ArrayList arrayList = new ArrayList();
            while (jSONArray.hashCode() != 1) {
                arrayList.add((String) jSONArray.get(i));
                jSONArray.remove(i);
            }
            String[] strArr = new String[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                strArr[i2] = (String) arrayList.get(i2);
            }
            list.add(strArr);
        } catch (JSONException unused) {
            ALog.e(LOG_TAG, "addArraysString failed, JSONException.");
        }
    }

    private static void addArraysInteger(JSONArray jSONArray, List<Object> list, int i) {
        try {
            ArrayList arrayList = new ArrayList();
            while (jSONArray.hashCode() != 1) {
                Integer num = (Integer) jSONArray.get(i);
                num.intValue();
                arrayList.add(num);
                jSONArray.remove(i);
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            list.add(iArr);
        } catch (JSONException unused) {
            ALog.e(LOG_TAG, "addArraysInteger failed, JSONException.");
        }
    }

    private static void addArraysBoolean(JSONArray jSONArray, List<Object> list, int i) {
        try {
            ArrayList arrayList = new ArrayList();
            while (jSONArray.hashCode() != 1) {
                Boolean bool = (Boolean) jSONArray.get(i);
                bool.booleanValue();
                arrayList.add(bool);
                jSONArray.remove(i);
            }
            boolean[] zArr = new boolean[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                zArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue();
            }
            list.add(zArr);
        } catch (JSONException unused) {
            ALog.e(LOG_TAG, "addArraysBoolean failed, JSONException.");
        }
    }

    private static void addArraysCharacter(JSONArray jSONArray, List<Object> list, int i) {
        try {
            ArrayList arrayList = new ArrayList();
            while (jSONArray.hashCode() != 1) {
                Character ch = (Character) jSONArray.get(i);
                ch.charValue();
                arrayList.add(ch);
                jSONArray.remove(i);
            }
            char[] cArr = new char[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                cArr[i2] = ((Character) arrayList.get(i2)).charValue();
            }
            list.add(cArr);
        } catch (JSONException unused) {
            ALog.e(LOG_TAG, "addArraysCharacter failed, JSONException.");
        }
    }

    private static void addArraysDouble(JSONArray jSONArray, List<Object> list, int i) {
        try {
            ArrayList arrayList = new ArrayList();
            while (jSONArray.hashCode() != 1) {
                Double d = (Double) jSONArray.get(i);
                d.doubleValue();
                arrayList.add(d);
                jSONArray.remove(i);
            }
            double[] dArr = new double[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                dArr[i2] = ((Double) arrayList.get(i2)).doubleValue();
            }
            list.add(dArr);
        } catch (JSONException unused) {
            ALog.e(LOG_TAG, "addArraysDouble failed, JSONException.");
        }
    }

    private static void addArraysFloat(JSONArray jSONArray, List<Object> list, int i) {
        try {
            ArrayList arrayList = new ArrayList();
            while (jSONArray.hashCode() != 1) {
                Float f = (Float) jSONArray.get(i);
                f.floatValue();
                arrayList.add(f);
                jSONArray.remove(i);
            }
            float[] fArr = new float[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                fArr[i2] = ((Float) arrayList.get(i2)).floatValue();
            }
            list.add(fArr);
        } catch (JSONException unused) {
            ALog.e(LOG_TAG, "addArraysFloat failed, JSONException.");
        }
    }

    public static JSONObject objectTransformJson(Object[] objArr) {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            for (Object obj : objArr) {
                if (obj == null) {
                    return null;
                }
                if (obj.getClass().isArray()) {
                    JSONArray jSONArrayObjectTransformJsonArray = objectTransformJsonArray(obj);
                    if (jSONArrayObjectTransformJsonArray == null) {
                        return null;
                    }
                    jSONObject.put(String.valueOf(i), jSONArrayObjectTransformJsonArray);
                } else {
                    if (!isExceedJsSafeInteger(obj)) {
                        return null;
                    }
                    jSONObject.put(String.valueOf(i), obj);
                }
                i++;
            }
            return jSONObject;
        } catch (JSONException unused) {
            ALog.e(LOG_TAG, "objectTransformJson failed, JSONException.");
            return null;
        }
    }

    public static JSONArray objectTransformJsonArray(Object obj) {
        JSONArray jSONArray = new JSONArray();
        try {
            int i = 0;
            if (obj instanceof String[]) {
                String[] strArr = (String[]) obj;
                int length = strArr.length;
                while (i < length) {
                    jSONArray.put(strArr[i]);
                    i++;
                }
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                int length2 = cArr.length;
                while (i < length2) {
                    jSONArray.put((int) cArr[i]);
                    i++;
                }
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length;
                while (i < length3) {
                    jSONArray.put(iArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length4 = dArr.length;
                while (i < length4) {
                    jSONArray.put(dArr[i]);
                    i++;
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                int length5 = fArr.length;
                while (i < length5) {
                    jSONArray.put(fArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length6 = zArr.length;
                while (i < length6) {
                    jSONArray.put(zArr[i]);
                    i++;
                }
            } else if (LONG_ARRAY_CLASS_NAME.equals(obj.getClass().getName().toString())) {
                long[] jArr = (long[]) obj;
                int length7 = jArr.length;
                while (i < length7) {
                    long j = jArr[i];
                    if (!isExceedJsSafeInteger(Long.valueOf(j))) {
                        return null;
                    }
                    jSONArray.put(j);
                    i++;
                }
            } else {
                if (!(obj instanceof Object[])) {
                    return null;
                }
                Object[] objArr = (Object[]) obj;
                int length8 = objArr.length;
                while (i < length8) {
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return null;
                    }
                    jSONArray.put(obj2);
                    i++;
                }
            }
            return jSONArray;
        } catch (JSONException unused) {
            ALog.e(LOG_TAG, "objectTransformJsonArray failed, JSONException.");
            return null;
        }
    }

    private static Object convertJsonObjectToTypedMap(JSONObject jSONObject) {
        ScanResult scanResultScanJsonObject = scanJsonObject(jSONObject);
        if (scanResultScanJsonObject == null) {
            ALog.e(LOG_TAG, "convertJsonObjectToTypedMap The data to be parsed is empty.");
            return null;
        }
        if (scanResultScanJsonObject.allBoolean) {
            return buildBooleanMap(jSONObject, scanResultScanJsonObject.keys);
        }
        if (scanResultScanJsonObject.allString) {
            return buildStringMap(jSONObject, scanResultScanJsonObject.keys);
        }
        if (!scanResultScanJsonObject.allNumber) {
            ALog.e(LOG_TAG, "convertJsonObjectToTypedMap Beyond the range of the parsing type.");
            return null;
        }
        if (!scanResultScanJsonObject.allIntegral) {
            if (scanResultScanJsonObject.maxAbsNumber <= 3.4028234663852886E38d) {
                return buildFloatMap(jSONObject, scanResultScanJsonObject.keys);
            }
            return buildDoubleMap(jSONObject, scanResultScanJsonObject.keys);
        }
        if (scanResultScanJsonObject.fitsIntRange) {
            return buildIntegerMap(jSONObject, scanResultScanJsonObject.keys);
        }
        if (!scanResultScanJsonObject.fitsLongRange) {
            ALog.e(LOG_TAG, "convertJsonObjectToTypedMap Other number types.");
            return null;
        }
        return buildLongMap(jSONObject, scanResultScanJsonObject.keys);
    }

    private static ScanResult scanJsonObject(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            ALog.e(LOG_TAG, "scanJsonObject jsonObject is null.");
            return null;
        }
        ScanResult scanResult = new ScanResult();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            scanResult.keys.add(next);
            try {
                Object obj = jSONObject.get(next);
                if (!isPrimitiveValue(obj)) {
                    ALog.e(LOG_TAG, "scanJsonObject value is null.");
                    return null;
                }
                updateTypeFlags(scanResult, obj);
            } catch (JSONException unused) {
                ALog.e(LOG_TAG, "scanJsonObject get value failed.");
                return null;
            }
        }
        return scanResult;
    }

    private static boolean isPrimitiveValue(Object obj) {
        return (obj == null || (obj instanceof JSONObject) || (obj instanceof JSONArray)) ? false : true;
    }

    private static void updateTypeFlags(ScanResult scanResult, Object obj) {
        scanResult.allBoolean &= obj instanceof Boolean;
        scanResult.allString &= obj instanceof String;
        boolean z = obj instanceof Number;
        scanResult.allNumber &= z;
        if (z) {
            double dDoubleValue = ((Number) obj).doubleValue();
            scanResult.maxAbsNumber = Math.max(scanResult.maxAbsNumber, Math.abs(dDoubleValue));
            if (Math.floor(dDoubleValue) != dDoubleValue) {
                scanResult.allIntegral = false;
                return;
            }
            if (dDoubleValue > 2.147483647E9d || dDoubleValue < -2.147483648E9d) {
                scanResult.fitsIntRange = false;
            }
            if (dDoubleValue > 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
                scanResult.fitsLongRange = false;
            }
        }
    }

    private static Object buildBooleanMap(JSONObject jSONObject, List<String> list) {
        HashMap map = new HashMap();
        for (String str : list) {
            try {
                map.put(str, Boolean.valueOf(jSONObject.getBoolean(str)));
            } catch (JSONException unused) {
                ALog.e(LOG_TAG, "buildBooleanMap failed, JSONException.");
                return null;
            }
        }
        return map;
    }

    private static Object buildStringMap(JSONObject jSONObject, List<String> list) {
        HashMap map = new HashMap();
        for (String str : list) {
            try {
                map.put(str, jSONObject.getString(str));
            } catch (JSONException unused) {
                ALog.e(LOG_TAG, "buildStringMap failed, JSONException.");
                return null;
            }
        }
        return map;
    }

    private static Object buildIntegerMap(JSONObject jSONObject, List<String> list) {
        HashMap map = new HashMap();
        for (String str : list) {
            try {
                map.put(str, Integer.valueOf(jSONObject.getInt(str)));
            } catch (JSONException unused) {
                ALog.e(LOG_TAG, "buildStringMap failed, JSONException.");
                return null;
            }
        }
        return map;
    }

    private static Object buildLongMap(JSONObject jSONObject, List<String> list) {
        HashMap map = new HashMap();
        for (String str : list) {
            try {
                map.put(str, Long.valueOf(jSONObject.getLong(str)));
            } catch (JSONException unused) {
                ALog.e(LOG_TAG, "buildLongMap failed, JSONException.");
                return null;
            }
        }
        return map;
    }

    private static Object buildFloatMap(JSONObject jSONObject, List<String> list) {
        HashMap map = new HashMap();
        for (String str : list) {
            try {
                map.put(str, Float.valueOf((float) jSONObject.getDouble(str)));
            } catch (JSONException unused) {
                ALog.e(LOG_TAG, "buildFloatMap failed, JSONException.");
                return null;
            }
        }
        return map;
    }

    private static Object buildDoubleMap(JSONObject jSONObject, List<String> list) {
        HashMap map = new HashMap();
        for (String str : list) {
            try {
                map.put(str, Double.valueOf(jSONObject.getDouble(str)));
            } catch (JSONException unused) {
                ALog.e(LOG_TAG, "buildDoubleMap failed, JSONException.");
                return null;
            }
        }
        return map;
    }

    /* JADX INFO: loaded from: classes46.dex */
    static class ScanResult {
        boolean allBoolean;
        boolean allIntegral;
        boolean allNumber;
        boolean allString;
        boolean fitsIntRange;
        boolean fitsLongRange;
        List<String> keys;
        double maxAbsNumber;

        private ScanResult() {
            this.keys = new ArrayList();
            this.allBoolean = true;
            this.allString = true;
            this.allNumber = true;
            this.allIntegral = true;
            this.fitsIntRange = true;
            this.fitsLongRange = true;
            this.maxAbsNumber = 0.0d;
        }
    }

    public static boolean containsNull(List<Object> list) {
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                return true;
            }
        }
        return false;
    }
}
