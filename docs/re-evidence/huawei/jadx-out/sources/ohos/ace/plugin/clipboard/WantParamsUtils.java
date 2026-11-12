package ohos.ace.plugin.clipboard;

import android.content.ClipDescription;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import com.alipay.sdk.m.s.e;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class WantParamsUtils {
    private static final String KEY_TYPE = "type";
    private static final String KEY_VALUE = "value";
    private static final String KEY_VALUE_JSON = "value_json";
    private static final String LOG_TAG = "WantParamsUtils";
    private static final int TYPE_ARRAY = 102;
    private static final int TYPE_BOOLEAN = 1;
    private static final int TYPE_DOUBLE = 9;
    private static final int TYPE_INT = 5;
    private static final int TYPE_STRING = 10;
    private static final int TYPE_WANT_PARAMS = 101;

    public static Bundle jsonToExtras(String str) {
        if (str == null) {
            return new Bundle();
        }
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray(e.n);
            if (jSONArrayOptJSONArray == null) {
                return new Bundle();
            }
            return buildBundleFromParamsArray(jSONArrayOptJSONArray);
        } catch (JSONException unused) {
            Log.e(LOG_TAG, "jsonToExtras: JSON parse error");
            return new Bundle();
        }
    }

    public static String extrasToJson(Bundle bundle) {
        if (bundle == null) {
            return "{}";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(e.n, buildParamsArrayFromBundle(bundle));
            return jSONObject.toString();
        } catch (JSONException unused) {
            Log.e(LOG_TAG, "extrasToJson: JSON parse error");
            return "{}";
        }
    }

    private static String intentToJsonString(Intent intent) {
        if (intent == null) {
            Log.e(LOG_TAG, "intentToJsonString: intent is null");
            return "{}";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (intent.getComponent() != null) {
                jSONObject.put("bundleName", intent.getComponent().getPackageName());
                jSONObject.put("abilityName", intent.getComponent().getClassName());
            }
            if (intent.hasExtra("ArkUIXModuleNameCustom")) {
                jSONObject.put("moduleName", intent.getStringExtra("ArkUIXModuleNameCustom"));
                intent.removeExtra("ArkUIXModuleNameCustom");
            }
            if (intent.getType() != null) {
                jSONObject.put("type", intent.getType());
            }
            Bundle extras = intent.getExtras();
            if (extras != null && !extras.isEmpty()) {
                jSONObject.put(e.n, buildParamsArrayFromBundle(extras));
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            Log.e(LOG_TAG, "intentToJsonString: JSON parse error");
            return "{}";
        }
    }

    public static Boolean putJsonToIntent(Intent intent, String str) {
        if (intent == null || str == null) {
            Log.e(LOG_TAG, "putJsonToIntent: intent or json is null");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("bundleName", null);
            String strOptString2 = jSONObject.optString("abilityName", null);
            String strOptString3 = jSONObject.optString("moduleName", null);
            if (strOptString != null && strOptString2 != null) {
                intent.setClassName(strOptString, strOptString2);
            }
            if (strOptString3 != null) {
                intent.putExtra("ArkUIXModuleNameCustom", strOptString3);
            }
            String strOptString4 = jSONObject.optString("type", null);
            if (strOptString4 != null) {
                intent.setType(strOptString4);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(e.n);
            if (jSONArrayOptJSONArray == null) {
                return false;
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                String strOptString5 = jSONObject2.optString(MedalConstants.EVENT_KEY, null);
                if (strOptString5 != null) {
                    handlePutParamToIntent(intent, strOptString5, jSONObject2.getInt("type"), jSONObject2);
                }
            }
            return true;
        } catch (JSONException unused) {
            Log.w(LOG_TAG, "putJsonToIntent: JSON parse error");
            return false;
        }
    }

    private static void handlePutParamToIntent(Intent intent, String str, int i, JSONObject jSONObject) throws JSONException {
        if (i == 1) {
            intent.putExtra(str, jSONObject.getBoolean("value"));
            return;
        }
        if (i == 5) {
            intent.putExtra(str, jSONObject.getInt("value"));
            return;
        }
        if (i == 9) {
            intent.putExtra(str, jSONObject.getDouble("value"));
            return;
        }
        if (i == 10) {
            intent.putExtra(str, jSONObject.getString("value"));
            return;
        }
        if (i == 101) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("value");
            intent.putExtra(str, jSONArrayOptJSONArray == null ? new Bundle() : buildBundleFromParamsArray(jSONArrayOptJSONArray));
        } else {
            if (i == 102) {
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("value");
                if (jSONArrayOptJSONArray2 == null) {
                    return;
                }
                handlePutArrayToIntent(intent, str, jSONArrayOptJSONArray2);
                return;
            }
            Log.w(LOG_TAG, "handlePutParamToIntent: Unknown param type");
            intent.putExtra(str, jSONObject.optString("value", ""));
        }
    }

    private static void handlePutArrayToIntent(Intent intent, String str, JSONArray jSONArray) throws JSONException {
        Object objJsonArrayToPrimitiveArray = jsonArrayToPrimitiveArray(jSONArray);
        if (objJsonArrayToPrimitiveArray instanceof boolean[]) {
            intent.putExtra(str, (boolean[]) objJsonArrayToPrimitiveArray);
            return;
        }
        if (objJsonArrayToPrimitiveArray instanceof int[]) {
            intent.putExtra(str, (int[]) objJsonArrayToPrimitiveArray);
            return;
        }
        if (objJsonArrayToPrimitiveArray instanceof long[]) {
            intent.putExtra(str, (long[]) objJsonArrayToPrimitiveArray);
            return;
        }
        if (objJsonArrayToPrimitiveArray instanceof double[]) {
            intent.putExtra(str, (double[]) objJsonArrayToPrimitiveArray);
        } else if (objJsonArrayToPrimitiveArray instanceof String[]) {
            intent.putExtra(str, (String[]) objJsonArrayToPrimitiveArray);
        } else {
            intent.putExtra(str, jSONArray.toString());
        }
    }

    public static String getJsonFromIntent(Intent intent) {
        if (intent == null) {
            Log.e(LOG_TAG, "getJsonFromIntent: intent is null");
            return "{}";
        }
        return intentToJsonString(intent);
    }

    public static void setExtrasToClipDescription(ClipDescription clipDescription, Bundle bundle) {
        if (clipDescription == null || bundle == null) {
            Log.e(LOG_TAG, "setExtrasToClipDescription: desc or extras is null");
            return;
        }
        try {
            clipDescription.setExtras(bundleToPersistableBundle(bundle));
        } catch (NoSuchMethodError unused) {
            Log.w(LOG_TAG, "setExtrasToClipDescription: platform does not support setting ClipDescription extras");
        }
    }

    public static String getJsonFromClipDescription(ClipDescription clipDescription) {
        if (clipDescription == null) {
            Log.e(LOG_TAG, "getJsonFromClipDescription: desc is null");
            return "{}";
        }
        return extrasToJson(persistableBundleToBundle(clipDescription.getExtras()));
    }

    private static PersistableBundle bundleToPersistableBundle(Bundle bundle) {
        PersistableBundle persistableBundle = new PersistableBundle();
        if (bundle == null) {
            Log.e(LOG_TAG, "bundleToPersistableBundle: bundle is null");
            return persistableBundle;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                persistableBundle.putPersistableBundle(str, bundleToPersistableBundle((Bundle) obj));
            } else if (obj instanceof Boolean) {
                persistableBundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                persistableBundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                persistableBundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                persistableBundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                persistableBundle.putString(str, (String) obj);
            } else if (obj instanceof boolean[]) {
                persistableBundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof int[]) {
                persistableBundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                persistableBundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof double[]) {
                persistableBundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof String[]) {
                persistableBundle.putStringArray(str, (String[]) obj);
            } else {
                persistableBundle.putString(str, String.valueOf(obj));
            }
        }
        return persistableBundle;
    }

    private static Bundle persistableBundleToBundle(PersistableBundle persistableBundle) {
        Bundle bundle = new Bundle();
        if (persistableBundle == null) {
            Log.e(LOG_TAG, "persistableBundleToBundle: pb is null");
            return bundle;
        }
        for (String str : persistableBundle.keySet()) {
            Object obj = persistableBundle.get(str);
            if (obj instanceof PersistableBundle) {
                bundle.putBundle(str, persistableBundleToBundle((PersistableBundle) obj));
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof String[]) {
                bundle.putStringArray(str, (String[]) obj);
            } else {
                bundle.putString(str, String.valueOf(obj));
            }
        }
        return bundle;
    }

    private static Bundle buildBundleFromParamsArray(JSONArray jSONArray) throws JSONException {
        Bundle bundle = new Bundle();
        for (int i = 0; i < jSONArray.length(); i++) {
            putParamIntoBundle(bundle, jSONArray.getJSONObject(i));
        }
        return bundle;
    }

    private static void putParamIntoBundle(Bundle bundle, JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString(MedalConstants.EVENT_KEY, null);
        if (strOptString == null) {
            Log.e(LOG_TAG, "putParamIntoBundle: key is null");
            return;
        }
        int i = jSONObject.getInt("type");
        if (i == 1) {
            handleBooleanParam(bundle, strOptString, jSONObject);
            return;
        }
        if (i == 5) {
            handleIntParam(bundle, strOptString, jSONObject);
            return;
        }
        if (i == 9) {
            handleDoubleParam(bundle, strOptString, jSONObject);
            return;
        }
        if (i == 10) {
            handleStringParam(bundle, strOptString, jSONObject);
            return;
        }
        if (i == 101) {
            handleWantParamsParam(bundle, strOptString, jSONObject);
        } else if (i == 102) {
            handleArrayParam(bundle, strOptString, jSONObject);
        } else {
            handleDefaultParam(bundle, strOptString, jSONObject);
        }
    }

    private static void handleBooleanParam(Bundle bundle, String str, JSONObject jSONObject) throws JSONException {
        bundle.putBoolean(str, jSONObject.getBoolean("value"));
    }

    private static void handleIntParam(Bundle bundle, String str, JSONObject jSONObject) throws JSONException {
        Object objOpt = jSONObject.opt("value");
        if (objOpt instanceof Number) {
            Number number = (Number) objOpt;
            long jLongValue = number.longValue();
            if (jLongValue < -2147483648L || jLongValue > 2147483647L) {
                bundle.putLong(str, jLongValue);
                return;
            } else {
                bundle.putInt(str, number.intValue());
                return;
            }
        }
        try {
            long j = Long.parseLong(jSONObject.optString("value", "0"));
            if (j >= -2147483648L && j <= 2147483647L) {
                bundle.putInt(str, (int) j);
                return;
            }
            bundle.putLong(str, j);
        } catch (NumberFormatException unused) {
            Log.w(LOG_TAG, "handleIntParam: NumberFormatException for key " + str);
            bundle.putInt(str, 0);
        }
    }

    private static void handleDoubleParam(Bundle bundle, String str, JSONObject jSONObject) throws JSONException {
        bundle.putDouble(str, jSONObject.getDouble("value"));
    }

    private static void handleStringParam(Bundle bundle, String str, JSONObject jSONObject) throws JSONException {
        bundle.putString(str, jSONObject.getString("value"));
    }

    private static void handleWantParamsParam(Bundle bundle, String str, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("value");
        if (jSONArrayOptJSONArray != null) {
            bundle.putBundle(str, buildBundleFromParamsArray(jSONArrayOptJSONArray));
        } else {
            bundle.putBundle(str, new Bundle());
        }
    }

    private static void handleArrayParam(Bundle bundle, String str, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("value");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        Object objJsonArrayToPrimitiveArray = jsonArrayToPrimitiveArray(jSONArrayOptJSONArray);
        if (objJsonArrayToPrimitiveArray instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) objJsonArrayToPrimitiveArray);
            return;
        }
        if (objJsonArrayToPrimitiveArray instanceof int[]) {
            bundle.putIntArray(str, (int[]) objJsonArrayToPrimitiveArray);
            return;
        }
        if (objJsonArrayToPrimitiveArray instanceof long[]) {
            bundle.putLongArray(str, (long[]) objJsonArrayToPrimitiveArray);
            return;
        }
        if (objJsonArrayToPrimitiveArray instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) objJsonArrayToPrimitiveArray);
        } else if (objJsonArrayToPrimitiveArray instanceof String[]) {
            bundle.putStringArray(str, (String[]) objJsonArrayToPrimitiveArray);
        } else {
            bundle.putString(str, jSONArrayOptJSONArray.toString());
        }
    }

    private static void handleDefaultParam(Bundle bundle, String str, JSONObject jSONObject) throws JSONException {
        bundle.putString(str, jSONObject.optString("value", ""));
    }

    private static JSONArray buildParamsArrayFromBundle(Bundle bundle) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (String str : bundle.keySet()) {
            jSONArray.put(paramFromEntry(str, bundle.get(str)));
        }
        return jSONArray;
    }

    private static JSONObject paramFromEntry(String str, Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(MedalConstants.EVENT_KEY, str);
        if (obj instanceof Bundle) {
            jSONObject.put("type", 101);
            jSONObject.put("value", buildParamsArrayFromBundle((Bundle) obj));
            return jSONObject;
        }
        if (obj instanceof Boolean) {
            jSONObject.put("type", 1);
            jSONObject.put("value", (Boolean) obj);
            return jSONObject;
        }
        if (obj instanceof Number) {
            return paramFromNumber(str, (Number) obj, jSONObject);
        }
        if (obj instanceof String) {
            jSONObject.put("type", 10);
            jSONObject.put("value", (String) obj);
            return jSONObject;
        }
        if (obj instanceof boolean[]) {
            jSONObject.put("type", 102);
            jSONObject.put("value", arrayToJson((boolean[]) obj));
            return jSONObject;
        }
        if (obj instanceof int[]) {
            jSONObject.put("type", 102);
            jSONObject.put("value", arrayToJson((int[]) obj));
            return jSONObject;
        }
        if (obj instanceof long[]) {
            jSONObject.put("type", 102);
            jSONObject.put("value", arrayToJson((long[]) obj));
            return jSONObject;
        }
        if (obj instanceof double[]) {
            jSONObject.put("type", 102);
            jSONObject.put("value", arrayToJson((double[]) obj));
            return jSONObject;
        }
        if (obj instanceof String[]) {
            jSONObject.put("type", 102);
            jSONObject.put("value", arrayToJson((String[]) obj));
            return jSONObject;
        }
        jSONObject.put("type", 10);
        jSONObject.put("value", obj == null ? JSONObject.NULL : obj.toString());
        return jSONObject;
    }

    private static JSONObject paramFromNumber(String str, Number number, JSONObject jSONObject) throws JSONException {
        if (number instanceof Integer) {
            jSONObject.put("type", 5);
            jSONObject.put("value", number.intValue());
            return jSONObject;
        }
        if (number instanceof Long) {
            long jLongValue = number.longValue();
            jSONObject.put("type", 5);
            if (jLongValue >= -2147483648L && jLongValue <= 2147483647L) {
                jLongValue = (int) jLongValue;
            }
            jSONObject.put("value", jLongValue);
            return jSONObject;
        }
        if ((number instanceof Double) || (number instanceof Float)) {
            jSONObject.put("type", 9);
            jSONObject.put("value", number.doubleValue());
            return jSONObject;
        }
        double dDoubleValue = number.doubleValue();
        if (Double.isFinite(dDoubleValue) && dDoubleValue == Math.rint(dDoubleValue) && dDoubleValue >= -2.147483648E9d && dDoubleValue <= 2.147483647E9d) {
            jSONObject.put("type", 5);
            jSONObject.put("value", (int) dDoubleValue);
            return jSONObject;
        }
        jSONObject.put("type", 9);
        jSONObject.put("value", dDoubleValue);
        return jSONObject;
    }

    private static JSONArray arrayToJson(boolean[] zArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (boolean z : zArr) {
            jSONArray.put(z);
        }
        return jSONArray;
    }

    private static JSONArray arrayToJson(int[] iArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (int i : iArr) {
            jSONArray.put(i);
        }
        return jSONArray;
    }

    private static JSONArray arrayToJson(long[] jArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (long j : jArr) {
            jSONArray.put(j);
        }
        return jSONArray;
    }

    private static JSONArray arrayToJson(double[] dArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (double d : dArr) {
            jSONArray.put(d);
        }
        return jSONArray;
    }

    private static JSONArray arrayToJson(String[] strArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    private static Object jsonArrayToPrimitiveArray(JSONArray jSONArray) throws JSONException {
        return buildPrimitiveArrayFromFlags(jSONArray, detectArrayFlags(jSONArray));
    }

    static class ArrayFlags {
        boolean hasBoolean;
        boolean hasDecimal;
        boolean hasLong;
        boolean hasNumber;
        boolean hasString;
        int length;

        private ArrayFlags() {
        }
    }

    private static ArrayFlags detectArrayFlags(JSONArray jSONArray) throws JSONException {
        ArrayFlags arrayFlags = new ArrayFlags();
        arrayFlags.length = jSONArray.length();
        for (int i = 0; i < arrayFlags.length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof String) {
                arrayFlags.hasString = true;
            } else if (obj instanceof Boolean) {
                arrayFlags.hasBoolean = true;
            } else if (obj instanceof Number) {
                arrayFlags.hasNumber = true;
                Number number = (Number) obj;
                double dDoubleValue = number.doubleValue();
                long jLongValue = number.longValue();
                if (Double.compare(dDoubleValue, jLongValue) != 0) {
                    arrayFlags.hasDecimal = true;
                }
                if (jLongValue < -2147483648L || jLongValue > 2147483647L) {
                    arrayFlags.hasLong = true;
                }
            } else {
                StringBuilder sb = new StringBuilder("detectArrayFlags: unsupported array item type: ");
                sb.append(obj == null ? Constants.NULL : obj.getClass().getName());
                Log.e(LOG_TAG, sb.toString());
            }
        }
        return arrayFlags;
    }

    private static Object buildPrimitiveArrayFromFlags(JSONArray jSONArray, ArrayFlags arrayFlags) throws JSONException {
        int i = arrayFlags.length;
        if (i == 0) {
            return new String[0];
        }
        if (arrayFlags.hasString) {
            return buildStringArray(jSONArray, i);
        }
        if (arrayFlags.hasBoolean && !arrayFlags.hasNumber && !arrayFlags.hasString) {
            return buildBooleanArray(jSONArray, i);
        }
        if (arrayFlags.hasNumber) {
            if (arrayFlags.hasDecimal) {
                return buildDoubleArray(jSONArray, i);
            }
            if (arrayFlags.hasLong) {
                return buildLongArray(jSONArray, i);
            }
            return buildIntArray(jSONArray, i);
        }
        return buildFallbackStringArray(jSONArray, i);
    }

    private static String[] buildStringArray(JSONArray jSONArray, int i) throws JSONException {
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = String.valueOf(jSONArray.get(i2));
        }
        return strArr;
    }

    private static boolean[] buildBooleanArray(JSONArray jSONArray, int i) throws JSONException {
        boolean[] zArr = new boolean[i];
        for (int i2 = 0; i2 < i; i2++) {
            zArr[i2] = jSONArray.getBoolean(i2);
        }
        return zArr;
    }

    private static double[] buildDoubleArray(JSONArray jSONArray, int i) throws JSONException {
        double[] dArr = new double[i];
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof Number) {
                dArr[i2] = ((Number) obj).doubleValue();
            } else {
                dArr[i2] = Double.parseDouble(String.valueOf(obj));
            }
        }
        return dArr;
    }

    private static long[] buildLongArray(JSONArray jSONArray, int i) throws JSONException {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof Number) {
                jArr[i2] = ((Number) obj).longValue();
            } else {
                jArr[i2] = Long.parseLong(String.valueOf(obj));
            }
        }
        return jArr;
    }

    private static int[] buildIntArray(JSONArray jSONArray, int i) throws JSONException {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof Number) {
                iArr[i2] = ((Number) obj).intValue();
            } else {
                iArr[i2] = Integer.parseInt(String.valueOf(obj));
            }
        }
        return iArr;
    }

    private static String[] buildFallbackStringArray(JSONArray jSONArray, int i) throws JSONException {
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = String.valueOf(jSONArray.get(i2));
        }
        return strArr;
    }
}
