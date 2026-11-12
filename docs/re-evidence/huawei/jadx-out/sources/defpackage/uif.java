package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class uif implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f50126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("productId")
    private String f50127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("deviceName")
    private String f50128c;

    @SerializedName("deviceUniqueCode")
    private String d;

    @SerializedName("deviceModel")
    private String e;

    @SerializedName("type")
    private int f;

    public Object e() {
        return this.f50126a;
    }

    public void e(Object obj) {
        this.f50126a = obj;
    }

    public int a() {
        return this.f;
    }

    public void b(int i) {
        this.f = i;
    }

    public void c(String str) {
        this.f50127b = str;
    }

    public String c() {
        return this.f50128c;
    }

    public void b(String str) {
        this.f50128c = str;
    }

    public String d() {
        return this.e;
    }

    public void a(String str) {
        this.e = str;
    }

    public String b() {
        return this.d;
    }

    public void e(String str) {
        this.d = str;
    }

    public String toString() {
        return "DataOriginListItem{mType=" + this.f + ", mProductId='" + this.f50127b + "', mDeviceName='" + this.f50128c + "', mDeviceModel='" + this.e + "', mDeviceUniqueCode='" + this.d + "', mExtraInfo=" + this.f50126a + '}';
    }
}
