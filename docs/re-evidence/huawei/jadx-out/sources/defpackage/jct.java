package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.ble.BleConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class jct implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gcm f38385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("distanceType")
    private int f38386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("pathClass")
    private int f38387c;

    @SerializedName("pathType")
    private int d;

    @SerializedName("sortType")
    private int e;

    @SerializedName(BleConstants.SPORT_TYPE)
    private int g;

    @SerializedName("themeType")
    private int j;

    public jct() {
        this.g = 258;
        this.e = 1;
        this.d = 0;
        this.f38386b = 0;
        this.j = 0;
        this.f38387c = 0;
    }

    public jct(int i) {
        this.g = 258;
        this.e = 1;
        this.d = 0;
        this.f38386b = 0;
        this.j = 0;
        this.f38387c = i;
    }

    public int c() {
        return this.e;
    }

    public int a() {
        return this.d;
    }

    public int e() {
        return this.f38386b;
    }

    public gcm b() {
        return this.f38385a;
    }

    public void b(gcm gcmVar) {
        this.f38385a = gcmVar;
    }

    public void b(int i) {
        this.e = i;
    }

    public void e(int i) {
        this.d = i;
    }

    public void a(int i) {
        this.f38386b = i;
    }

    public int h() {
        return this.j;
    }

    public void d(int i) {
        this.j = i;
    }

    public int d() {
        return this.f38387c;
    }

    public void c(int i) {
        this.f38387c = i;
    }

    public boolean g() {
        return this.f38386b == 0 && this.d == 0;
    }

    public int i() {
        return this.g;
    }
}
