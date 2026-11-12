package com.huami.network.base.model;

import com.huami.network.base.util.HMHttpUtils;
import com.huami.tools.log.HMLog;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class HMHttpResponseData {
    private final String a = HMHttpResponseData.class.getSimpleName();
    private String b;
    private String c;
    private boolean d;
    private int e;
    private byte[] f;
    private Map<String, String> g;
    private Throwable h;

    private String a(String str, String[] strArr, int i) throws JSONException {
        return (strArr.length != i && b(str)) ? a(new JSONObject(str).getString(strArr[i]), strArr, i + 1) : str;
    }

    private boolean b(String str) {
        int iIndexOf = str.trim().indexOf("[");
        int iIndexOf2 = str.trim().indexOf("{");
        if (iIndexOf >= 0 || iIndexOf2 >= 0) {
            return iIndexOf != 0 && (iIndexOf2 == 0 || iIndexOf > iIndexOf2);
        }
        throw new IllegalArgumentException();
    }

    public void copy(HMHttpResponseData hMHttpResponseData) {
        this.b = hMHttpResponseData.b;
        this.c = hMHttpResponseData.c;
        this.d = hMHttpResponseData.d;
        this.e = hMHttpResponseData.e;
        this.f = hMHttpResponseData.f;
        this.g = hMHttpResponseData.g;
        this.h = hMHttpResponseData.h;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Throwable getError() {
        return this.h;
    }

    public Map<String, String> getHeader() {
        return this.g;
    }

    public byte[] getResponseBody() {
        return this.f;
    }

    public String getResponseString() {
        return getResponseString(Charset.defaultCharset());
    }

    public int getStatusCode() {
        return this.e;
    }

    public boolean getSuccess() {
        return this.d;
    }

    public String getTag() {
        return this.c;
    }

    public String getUrl() {
        return this.b;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean isSuccess() {
        int i;
        return this.d && (i = this.e) >= 200 && i <= 207;
    }

    public <T extends Bean> T parse(Class<T> cls) {
        try {
            return (T) parse(cls, cls.newInstance().getParses());
        } catch (Exception e) {
            e.printStackTrace();
            HMLog.e(this.a, "parse error", new Object[0]);
            return null;
        }
    }

    public <T> List<T> parseList(Class<T[]> cls, String[] strArr) {
        byte[] bArr;
        if (isSuccess() && (bArr = this.f) != null) {
            try {
                String strPurgeJson = HMHttpUtils.purgeJson(HMHttpUtils.decodeJson(new String(bArr)));
                if (strArr != null && strArr.length > 0 && b(strPurgeJson)) {
                    strPurgeJson = a(strPurgeJson, strArr, 0);
                }
                return Arrays.asList((Object[]) HMHttpUtils.getGson().fromJson(strPurgeJson, (Class) cls));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public void setError(Throwable th) {
        this.h = th;
    }

    public void setHeader(Map<String, String> map) {
        this.g = map;
    }

    public void setResponseBody(byte[] bArr) {
        this.f = bArr;
    }

    public void setStatusCode(int i) {
        this.e = i;
    }

    public void setSuccess(boolean z) {
        this.d = z;
    }

    public void setTag(String str) {
        this.c = str;
    }

    public void setUrl(String str) {
        this.b = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(is null:");
        sb.append(this.f == null);
        sb.append(") ");
        byte[] bArr = this.f;
        sb.append(bArr == null ? "null" : new String(bArr));
        return toString(sb.toString());
    }

    public String getResponseString(Charset charset) {
        byte[] bArr = this.f;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return new String(bArr, charset);
    }

    public String toString(String str) {
        return "\n----------------\nmUrl:" + this.b + "\nmTag:" + this.c + "\nmSuccess:" + this.d + "\nmStatusCode:" + this.e + "\nmResponseBody:" + str + "\n----------------\n";
    }

    public <T> T parse(Class<T> cls, String[] strArr) {
        byte[] bArr;
        if (isSuccess() && (bArr = this.f) != null) {
            try {
                String strPurgeJson = HMHttpUtils.purgeJson(HMHttpUtils.decodeJson(new String(bArr)));
                if (strArr != null && strArr.length != 0) {
                    return (T) HMHttpUtils.getGson().fromJson(a(strPurgeJson, strArr, 0), (Class) cls);
                }
                return (T) HMHttpUtils.getGson().fromJson(strPurgeJson, (Class) cls);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
