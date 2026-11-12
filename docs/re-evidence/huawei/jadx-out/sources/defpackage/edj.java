package defpackage;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class edj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("mDeviceIdentify")
    private String f32785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mEarPhoneClose")
    private int f32786c;

    @SerializedName("mDeviceName")
    private String e;

    @SerializedName("mEarphoneIgnore")
    private int g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mDeviceStatus")
    private int f32784a = -1;

    @SerializedName("mEarphoneConnectState")
    private int d = 255;

    public String d() {
        return this.f32785b;
    }

    public void b(String str) {
        this.f32785b = str;
    }

    public String c() {
        return this.e;
    }

    public void a(String str) {
        this.e = str;
    }

    public int e() {
        return this.f32784a;
    }

    public void e(int i) {
        this.f32784a = i;
    }

    public int a() {
        return this.f32786c;
    }

    public void b(int i) {
        this.f32786c = i;
    }

    public int g() {
        return this.g;
    }

    public void d(int i) {
        this.g = i;
    }

    public int b() {
        return this.d;
    }

    public void c(int i) {
        this.d = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof edj)) {
            edj edjVar = (edj) obj;
            if (TextUtils.equals(this.f32785b, edjVar.f32785b) && TextUtils.equals(this.e, edjVar.e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f32785b, this.e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EarPhoneInfo{mDeviceIdentify='");
        String str = this.f32785b;
        sb.append(str.substring(str.length() - 3));
        sb.append("', mDeviceName='");
        sb.append(this.e);
        sb.append("', mDeviceStatus=");
        sb.append(this.f32784a);
        sb.append(", mEarPhoneClose=");
        sb.append(this.f32786c);
        sb.append(", mEarphoneIgnore=");
        sb.append(this.g);
        sb.append(", mEarphoneConnectState=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
