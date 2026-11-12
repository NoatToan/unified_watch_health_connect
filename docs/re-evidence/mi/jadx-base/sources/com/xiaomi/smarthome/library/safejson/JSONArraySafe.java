package com.xiaomi.smarthome.library.safejson;

import android.annotation.TargetApi;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JSONArraySafe extends JSONArray {
    private boolean mCatchException;
    private JSONArray mJSONArrayDelegate;

    public JSONArraySafe() {
        this.mCatchException = false;
    }

    @Override // org.json.JSONArray
    public boolean equals(Object obj) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.equals(obj) : jSONArray.equals(obj);
    }

    @Override // org.json.JSONArray
    public Object get(int i) throws JSONException {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.get(i) : jSONArray.get(i);
    }

    @Override // org.json.JSONArray
    @Deprecated
    public boolean getBoolean(int i) throws JSONException {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.getBoolean(i) : jSONArray.getBoolean(i);
    }

    @Override // org.json.JSONArray
    @Deprecated
    public double getDouble(int i) throws JSONException {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.getDouble(i) : jSONArray.getDouble(i);
    }

    @Override // org.json.JSONArray
    @Deprecated
    public int getInt(int i) throws JSONException {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.getInt(i) : jSONArray.getInt(i);
    }

    @Override // org.json.JSONArray
    @Deprecated
    public long getLong(int i) throws JSONException {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.getLong(i) : jSONArray.getLong(i);
    }

    @Override // org.json.JSONArray
    public String getString(int i) throws JSONException {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        String string = jSONArray == null ? super.getString(i) : jSONArray.getString(i);
        return string == null ? "" : string;
    }

    @Override // org.json.JSONArray
    public int hashCode() {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.hashCode() : jSONArray.hashCode();
    }

    @Override // org.json.JSONArray
    public boolean isNull(int i) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.isNull(i) : jSONArray.isNull(i);
    }

    @Override // org.json.JSONArray
    public String join(String str) throws JSONException {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        String strJoin = jSONArray == null ? super.join(str) : jSONArray.join(str);
        return strJoin == null ? "" : strJoin;
    }

    @Override // org.json.JSONArray
    public int length() {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.length() : jSONArray.length();
    }

    @Override // org.json.JSONArray
    public Object opt(int i) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.opt(i) : jSONArray.opt(i);
    }

    @Override // org.json.JSONArray
    @Deprecated
    public boolean optBoolean(int i) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.optBoolean(i) : jSONArray.optBoolean(i);
    }

    @Override // org.json.JSONArray
    @Deprecated
    public double optDouble(int i) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.optDouble(i) : jSONArray.optDouble(i);
    }

    @Override // org.json.JSONArray
    @Deprecated
    public int optInt(int i) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.optInt(i) : jSONArray.optInt(i);
    }

    @Override // org.json.JSONArray
    @Deprecated
    public long optLong(int i) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.optLong(i) : jSONArray.optLong(i);
    }

    @Override // org.json.JSONArray
    public String optString(int i) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        String strOptString = jSONArray == null ? super.optString(i) : jSONArray.optString(i);
        return strOptString == null ? "" : strOptString;
    }

    @Override // org.json.JSONArray
    @TargetApi(19)
    public Object remove(int i) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.remove(i) : jSONArray.remove(i);
    }

    @Override // org.json.JSONArray
    public String toString() {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        String string = jSONArray == null ? super.toString() : jSONArray.toString();
        return string == null ? "" : string;
    }

    @Override // org.json.JSONArray
    public JSONArraySafe getJSONArray(int i) throws JSONException {
        JSONArray jSONArray;
        try {
            JSONArray jSONArray2 = this.mJSONArrayDelegate;
            jSONArray = jSONArray2 == null ? super.getJSONArray(i) : jSONArray2.getJSONArray(i);
        } catch (JSONException e) {
            if (!this.mCatchException) {
                throw e;
            }
            e.printStackTrace();
            jSONArray = null;
        }
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        return new JSONArraySafe(jSONArray, this.mCatchException);
    }

    @Override // org.json.JSONArray
    public JSONObjectSafe getJSONObject(int i) throws JSONException {
        JSONObject jSONObject;
        try {
            JSONArray jSONArray = this.mJSONArrayDelegate;
            jSONObject = jSONArray == null ? super.getJSONObject(i) : jSONArray.getJSONObject(i);
        } catch (JSONException e) {
            if (!this.mCatchException) {
                throw e;
            }
            e.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return new JSONObjectSafe(jSONObject, this.mCatchException);
    }

    @Override // org.json.JSONArray
    public boolean optBoolean(int i, boolean z) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.optBoolean(i, z) : jSONArray.optBoolean(i, z);
    }

    @Override // org.json.JSONArray
    public double optDouble(int i, double d) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.optDouble(i, d) : jSONArray.optDouble(i, d);
    }

    @Override // org.json.JSONArray
    public int optInt(int i, int i2) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.optInt(i, i2) : jSONArray.optInt(i, i2);
    }

    @Override // org.json.JSONArray
    public JSONArraySafe optJSONArray(int i) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        JSONArray jSONArrayOptJSONArray = jSONArray == null ? super.optJSONArray(i) : jSONArray.optJSONArray(i);
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new JSONArraySafe(jSONArrayOptJSONArray, this.mCatchException);
    }

    @Override // org.json.JSONArray
    public JSONObjectSafe optJSONObject(int i) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        JSONObject jSONObjectOptJSONObject = jSONArray == null ? super.optJSONObject(i) : jSONArray.optJSONObject(i);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        return new JSONObjectSafe(jSONObjectOptJSONObject, this.mCatchException);
    }

    @Override // org.json.JSONArray
    public long optLong(int i, long j) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.optLong(i, j) : jSONArray.optLong(i, j);
    }

    @Override // org.json.JSONArray
    public JSONObjectSafe toJSONObject(JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2 = this.mJSONArrayDelegate;
        JSONObject jSONObject = jSONArray2 == null ? super.toJSONObject(jSONArray) : jSONArray2.toJSONObject(jSONArray);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return new JSONObjectSafe(jSONObject);
    }

    public JSONArraySafe(String str) throws JSONException {
        super(str);
        this.mCatchException = false;
    }

    @Override // org.json.JSONArray
    public String optString(int i, String str) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        return jSONArray == null ? super.optString(i, str) : jSONArray.optString(i, str);
    }

    @Override // org.json.JSONArray
    public String toString(int i) throws JSONException {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        String string = jSONArray == null ? super.toString(i) : jSONArray.toString(i);
        return string == null ? "" : string;
    }

    public JSONArraySafe(JSONArray jSONArray) {
        this.mCatchException = false;
        this.mJSONArrayDelegate = jSONArray;
    }

    public JSONArraySafe(boolean z) {
        this.mCatchException = z;
    }

    public JSONArraySafe(String str, boolean z) throws JSONException {
        super(str);
        this.mCatchException = z;
    }

    @Override // org.json.JSONArray
    public JSONArraySafe put(boolean z) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        JSONArray jSONArrayPut = jSONArray == null ? super.put(z) : jSONArray.put(z);
        if (jSONArrayPut == null) {
            jSONArrayPut = new JSONArray();
        }
        return new JSONArraySafe(jSONArrayPut);
    }

    public JSONArraySafe(JSONArray jSONArray, boolean z) {
        this.mJSONArrayDelegate = jSONArray;
        this.mCatchException = z;
    }

    @Override // org.json.JSONArray
    public JSONArraySafe put(double d) throws JSONException {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        JSONArray jSONArrayPut = jSONArray == null ? super.put(d) : jSONArray.put(d);
        if (jSONArrayPut == null) {
            jSONArrayPut = new JSONArray();
        }
        return new JSONArraySafe(jSONArrayPut);
    }

    @Override // org.json.JSONArray
    public JSONArraySafe put(int i) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        JSONArray jSONArrayPut = jSONArray == null ? super.put(i) : jSONArray.put(i);
        if (jSONArrayPut == null) {
            jSONArrayPut = new JSONArray();
        }
        return new JSONArraySafe(jSONArrayPut);
    }

    @Override // org.json.JSONArray
    public JSONArraySafe put(long j) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        JSONArray jSONArrayPut = jSONArray == null ? super.put(j) : jSONArray.put(j);
        if (jSONArrayPut == null) {
            jSONArrayPut = new JSONArray();
        }
        return new JSONArraySafe(jSONArrayPut);
    }

    @Override // org.json.JSONArray
    public JSONArraySafe put(Object obj) {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        JSONArray jSONArrayPut = jSONArray == null ? super.put(obj) : jSONArray.put(obj);
        if (jSONArrayPut == null) {
            jSONArrayPut = new JSONArray();
        }
        return new JSONArraySafe(jSONArrayPut);
    }

    @Override // org.json.JSONArray
    public JSONArraySafe put(int i, boolean z) throws JSONException {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        JSONArray jSONArrayPut = jSONArray == null ? super.put(i, z) : jSONArray.put(i, z);
        if (jSONArrayPut == null) {
            jSONArrayPut = new JSONArray();
        }
        return new JSONArraySafe(jSONArrayPut);
    }

    @Override // org.json.JSONArray
    public JSONArraySafe put(int i, double d) throws JSONException {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        JSONArray jSONArrayPut = jSONArray == null ? super.put(i, d) : jSONArray.put(i, d);
        if (jSONArrayPut == null) {
            jSONArrayPut = new JSONArray();
        }
        return new JSONArraySafe(jSONArrayPut);
    }

    @Override // org.json.JSONArray
    public JSONArraySafe put(int i, int i2) throws JSONException {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        JSONArray jSONArrayPut = jSONArray == null ? super.put(i, i2) : jSONArray.put(i, i2);
        if (jSONArrayPut == null) {
            jSONArrayPut = new JSONArray();
        }
        return new JSONArraySafe(jSONArrayPut);
    }

    @Override // org.json.JSONArray
    public JSONArraySafe put(int i, long j) throws JSONException {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        JSONArray jSONArrayPut = jSONArray == null ? super.put(i, j) : jSONArray.put(i, j);
        if (jSONArrayPut == null) {
            jSONArrayPut = new JSONArray();
        }
        return new JSONArraySafe(jSONArrayPut);
    }

    @Override // org.json.JSONArray
    public JSONArraySafe put(int i, Object obj) throws JSONException {
        JSONArray jSONArray = this.mJSONArrayDelegate;
        JSONArray jSONArrayPut = jSONArray == null ? super.put(i, obj) : jSONArray.put(i, obj);
        if (jSONArrayPut == null) {
            jSONArrayPut = new JSONArray();
        }
        return new JSONArraySafe(jSONArrayPut);
    }
}
