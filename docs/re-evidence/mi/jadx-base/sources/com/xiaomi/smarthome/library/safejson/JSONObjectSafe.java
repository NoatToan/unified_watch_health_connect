package com.xiaomi.smarthome.library.safejson;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JSONObjectSafe extends JSONObject {
    private boolean mCatchException;
    private JSONObject mJSONDelegate;

    public JSONObjectSafe() {
        this.mCatchException = false;
    }

    public boolean equals(Object obj) {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.equals(obj) : jSONObject.equals(obj);
    }

    @Override // org.json.JSONObject
    public Object get(String str) throws JSONException {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.get(str) : jSONObject.get(str);
    }

    @Override // org.json.JSONObject
    @Deprecated
    public boolean getBoolean(String str) throws JSONException {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.getBoolean(str) : jSONObject.getBoolean(str);
    }

    @Override // org.json.JSONObject
    @Deprecated
    public double getDouble(String str) throws JSONException {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.getDouble(str) : jSONObject.getDouble(str);
    }

    @Override // org.json.JSONObject
    @Deprecated
    public int getInt(String str) throws JSONException {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.getInt(str) : jSONObject.getInt(str);
    }

    @Override // org.json.JSONObject
    @Deprecated
    public long getLong(String str) throws JSONException {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.getLong(str) : jSONObject.getLong(str);
    }

    @Override // org.json.JSONObject
    public String getString(String str) throws JSONException {
        JSONObject jSONObject = this.mJSONDelegate;
        String string = jSONObject == null ? super.getString(str) : jSONObject.getString(str);
        return string == null ? "" : string;
    }

    @Override // org.json.JSONObject
    public boolean has(String str) {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.has(str) : jSONObject.has(str);
    }

    public int hashCode() {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.hashCode() : jSONObject.hashCode();
    }

    @Override // org.json.JSONObject
    public boolean isNull(String str) {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.isNull(str) : jSONObject.isNull(str);
    }

    @Override // org.json.JSONObject
    public Iterator<String> keys() {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.keys() : jSONObject.keys();
    }

    @Override // org.json.JSONObject
    public int length() {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.length() : jSONObject.length();
    }

    @Override // org.json.JSONObject
    public Object opt(String str) {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.opt(str) : jSONObject.opt(str);
    }

    @Override // org.json.JSONObject
    @Deprecated
    public boolean optBoolean(String str) {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.optBoolean(str) : jSONObject.optBoolean(str);
    }

    @Override // org.json.JSONObject
    @Deprecated
    public double optDouble(String str) {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.optDouble(str) : jSONObject.optDouble(str);
    }

    @Override // org.json.JSONObject
    @Deprecated
    public int optInt(String str) {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.optInt(str) : jSONObject.optInt(str);
    }

    @Override // org.json.JSONObject
    @Deprecated
    public long optLong(String str) {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.optLong(str) : jSONObject.optLong(str);
    }

    @Override // org.json.JSONObject
    public String optString(String str) {
        JSONObject jSONObject = this.mJSONDelegate;
        String strOptString = jSONObject == null ? super.optString(str) : jSONObject.optString(str);
        return strOptString == null ? "" : strOptString;
    }

    @Override // org.json.JSONObject
    public Object remove(String str) {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.remove(str) : jSONObject.remove(str);
    }

    @Override // org.json.JSONObject
    public String toString() {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.toString() : jSONObject.toString();
    }

    @Override // org.json.JSONObject
    public JSONObjectSafe accumulate(String str, Object obj) throws JSONException {
        JSONObject jSONObject = this.mJSONDelegate;
        JSONObject jSONObjectAccumulate = jSONObject == null ? super.accumulate(str, obj) : jSONObject.accumulate(str, obj);
        if (jSONObjectAccumulate == null) {
            jSONObjectAccumulate = new JSONObject();
        }
        return new JSONObjectSafe(jSONObjectAccumulate);
    }

    @Override // org.json.JSONObject
    public JSONArraySafe getJSONArray(String str) throws JSONException {
        JSONArray jSONArray;
        try {
            JSONObject jSONObject = this.mJSONDelegate;
            jSONArray = jSONObject == null ? super.getJSONArray(str) : jSONObject.getJSONArray(str);
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

    @Override // org.json.JSONObject
    public JSONObjectSafe getJSONObject(String str) throws JSONException {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = this.mJSONDelegate;
            jSONObject = jSONObject2 == null ? super.getJSONObject(str) : jSONObject2.getJSONObject(str);
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

    @Override // org.json.JSONObject
    public JSONArraySafe names() {
        JSONObject jSONObject = this.mJSONDelegate;
        JSONArray jSONArrayNames = jSONObject == null ? super.names() : jSONObject.names();
        if (jSONArrayNames == null) {
            jSONArrayNames = new JSONArray();
        }
        return new JSONArraySafe(jSONArrayNames);
    }

    @Override // org.json.JSONObject
    public boolean optBoolean(String str, boolean z) {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.optBoolean(str, z) : jSONObject.optBoolean(str, z);
    }

    @Override // org.json.JSONObject
    public double optDouble(String str, double d) {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.optDouble(str, d) : jSONObject.optDouble(str, d);
    }

    @Override // org.json.JSONObject
    public int optInt(String str, int i) {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.optInt(str, i) : jSONObject.optInt(str, i);
    }

    @Override // org.json.JSONObject
    public JSONArraySafe optJSONArray(String str) {
        JSONObject jSONObject = this.mJSONDelegate;
        JSONArray jSONArrayOptJSONArray = jSONObject == null ? super.optJSONArray(str) : jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new JSONArraySafe(jSONArrayOptJSONArray, this.mCatchException);
    }

    @Override // org.json.JSONObject
    public JSONObjectSafe optJSONObject(String str) {
        JSONObject jSONObject = this.mJSONDelegate;
        JSONObject jSONObjectOptJSONObject = jSONObject == null ? super.optJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        return new JSONObjectSafe(jSONObjectOptJSONObject, this.mCatchException);
    }

    @Override // org.json.JSONObject
    public long optLong(String str, long j) {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.optLong(str, j) : jSONObject.optLong(str, j);
    }

    @Override // org.json.JSONObject
    public JSONObjectSafe putOpt(String str, Object obj) throws JSONException {
        JSONObject jSONObject = this.mJSONDelegate;
        JSONObject jSONObjectPut = jSONObject == null ? super.put(str, obj) : jSONObject.put(str, obj);
        if (jSONObjectPut == null) {
            jSONObjectPut = new JSONObject();
        }
        return new JSONObjectSafe(jSONObjectPut);
    }

    @Override // org.json.JSONObject
    public JSONArraySafe toJSONArray(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject = this.mJSONDelegate;
        JSONArray jSONArray2 = jSONObject == null ? super.toJSONArray(jSONArray) : jSONObject.toJSONArray(jSONArray);
        if (jSONArray2 == null) {
            jSONArray2 = new JSONArray();
        }
        return new JSONArraySafe(jSONArray2);
    }

    @Override // org.json.JSONObject
    public String toString(int i) throws JSONException {
        JSONObject jSONObject = this.mJSONDelegate;
        return jSONObject == null ? super.toString(i) : jSONObject.toString(i);
    }

    public JSONObjectSafe(String str) throws JSONException {
        super(str);
        this.mCatchException = false;
    }

    @Override // org.json.JSONObject
    public String optString(String str, String str2) {
        JSONObject jSONObject = this.mJSONDelegate;
        String strOptString = jSONObject == null ? super.optString(str, str2) : jSONObject.optString(str, str2);
        return strOptString == null ? "" : strOptString;
    }

    public JSONObjectSafe(JSONObject jSONObject) {
        this.mCatchException = false;
        this.mJSONDelegate = jSONObject;
    }

    @Override // org.json.JSONObject
    public JSONObjectSafe put(String str, boolean z) throws JSONException {
        JSONObject jSONObject = this.mJSONDelegate;
        JSONObject jSONObjectPut = jSONObject == null ? super.put(str, z) : jSONObject.put(str, z);
        if (jSONObjectPut == null) {
            jSONObjectPut = new JSONObject();
        }
        return new JSONObjectSafe(jSONObjectPut);
    }

    public JSONObjectSafe(boolean z) {
        this.mCatchException = z;
    }

    @Override // org.json.JSONObject
    public JSONObjectSafe put(String str, double d) throws JSONException {
        JSONObject jSONObject = this.mJSONDelegate;
        JSONObject jSONObjectPut = jSONObject == null ? super.put(str, d) : jSONObject.put(str, d);
        if (jSONObjectPut == null) {
            jSONObjectPut = new JSONObject();
        }
        return new JSONObjectSafe(jSONObjectPut);
    }

    public JSONObjectSafe(String str, boolean z) throws JSONException {
        super(str);
        this.mCatchException = z;
    }

    public JSONObjectSafe(JSONObject jSONObject, boolean z) {
        this.mJSONDelegate = jSONObject;
        this.mCatchException = z;
    }

    @Override // org.json.JSONObject
    public JSONObjectSafe put(String str, int i) throws JSONException {
        JSONObject jSONObject = this.mJSONDelegate;
        JSONObject jSONObjectPut = jSONObject == null ? super.put(str, i) : jSONObject.put(str, i);
        if (jSONObjectPut == null) {
            jSONObjectPut = new JSONObject();
        }
        return new JSONObjectSafe(jSONObjectPut);
    }

    @Override // org.json.JSONObject
    public JSONObjectSafe put(String str, long j) throws JSONException {
        JSONObject jSONObject = this.mJSONDelegate;
        JSONObject jSONObjectPut = jSONObject == null ? super.put(str, j) : jSONObject.put(str, j);
        if (jSONObjectPut == null) {
            jSONObjectPut = new JSONObject();
        }
        return new JSONObjectSafe(jSONObjectPut);
    }

    @Override // org.json.JSONObject
    public JSONObjectSafe put(String str, Object obj) throws JSONException {
        JSONObject jSONObject = this.mJSONDelegate;
        JSONObject jSONObjectPut = jSONObject == null ? super.put(str, obj) : jSONObject.put(str, obj);
        if (jSONObjectPut == null) {
            jSONObjectPut = new JSONObject();
        }
        return new JSONObjectSafe(jSONObjectPut);
    }
}
