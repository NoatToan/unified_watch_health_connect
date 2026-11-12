package defpackage;

import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes8.dex */
public class hca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36386c;
    private int d;
    private int e;
    private int g;

    public int e(int i, boolean z) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            if (z) {
                                return this.f36385b;
                            }
                            return this.f36384a;
                        }
                        LogUtil.e("Suggestion_FitnessHeartRateZoneConfig", "heartRateZone should be given right data ", Integer.valueOf(i));
                        if (i < 1) {
                            return this.f36386c;
                        }
                        return this.f36384a;
                    }
                    if (z) {
                        return this.d;
                    }
                    i2 = this.f36385b;
                } else {
                    if (z) {
                        return this.e;
                    }
                    i2 = this.d;
                }
            } else {
                if (z) {
                    return this.g;
                }
                i2 = this.e;
            }
        } else {
            if (z) {
                return this.f36386c;
            }
            i2 = this.g;
        }
        return i2 - 1;
    }

    public int b() {
        return this.f36384a;
    }

    public void b(int i) {
        this.f36384a = i;
    }

    public void d(int i) {
        this.f36385b = i;
    }

    public void e(int i) {
        this.d = i;
    }

    public void c(int i) {
        this.e = i;
    }

    public void g(int i) {
        this.g = i;
    }

    public void a(int i) {
        this.f36386c = i;
    }
}
