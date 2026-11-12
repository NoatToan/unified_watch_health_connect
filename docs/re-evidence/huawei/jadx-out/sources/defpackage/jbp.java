package defpackage;

import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jbp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f38347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f38348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f38349c;
    private float d;
    private float e;
    private String h;

    public String g() {
        return this.h;
    }

    public void b(String str) {
        this.h = str;
    }

    public float e() {
        return this.e;
    }

    public void e(float f) {
        this.e = f;
    }

    public float d() {
        return this.d;
    }

    public void a(float f) {
        this.d = f;
    }

    public float b() {
        return this.f38348b;
    }

    public void c(float f) {
        this.f38348b = f;
    }

    public float a() {
        return this.f38347a;
    }

    public void b(float f) {
        this.f38347a = f;
    }

    public float c() {
        return this.f38349c;
    }

    public void d(float f) {
        this.f38349c = f;
    }

    public void b(int[] iArr, String str) {
        if (iArr == null) {
            LogUtil.j("Track_PaceZoneStatisticData", "paceZoneArray null");
            return;
        }
        this.h = str;
        this.e = iArr[0];
        this.d = iArr[1];
        this.f38348b = iArr[2];
        this.f38347a = iArr[3];
        this.f38349c = iArr[4];
    }

    public void a(float[] fArr, String str) {
        if (fArr == null) {
            LogUtil.j("Track_PaceZoneStatisticData", "paceZoneArray null");
            return;
        }
        this.h = str;
        this.e = fArr[0];
        this.d = fArr[1];
        this.f38348b = fArr[2];
        this.f38347a = fArr[3];
        this.f38349c = fArr[4];
    }
}
