package defpackage;

import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes19.dex */
public class uih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50134c;
    private boolean d;
    private String e;
    private String f;

    public void a(boolean z) {
        this.d = z;
    }

    public boolean e() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public void e(String str) {
        this.e = str;
    }

    public int a() {
        return this.f50134c;
    }

    public void c(int i) {
        this.f50134c = i;
    }

    public String c() {
        return this.f50132a;
    }

    public void c(String str) {
        this.f50132a = str;
    }

    public boolean h() {
        return this.f50133b;
    }

    public void d(boolean z) {
        this.f50133b = z;
    }

    public String b() {
        return this.f;
    }

    public void d(String str) {
        this.f = str;
    }

    public String toString() {
        return "StepSourceItem{mId='" + CommonUtil.n(this.e) + ", mDeviceName='" + this.f50132a + "', mIsLocalDevice=" + this.f50133b + ", mSteps=" + this.f + '}';
    }
}
