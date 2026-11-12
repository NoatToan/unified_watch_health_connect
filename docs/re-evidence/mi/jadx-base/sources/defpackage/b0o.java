package defpackage;

import com.xiaomi.fitness.common.utils.AppUtil;

/* JADX INFO: loaded from: classes8.dex */
public class b0o extends tb2 {
    public long l;
    public float m;
    public String n;

    public b0o(int i, long j, float f, int i2, int i3) {
        super(i, j, f, i2, i3);
        this.c = i;
        this.l = j;
        this.m = f;
        this.d = i2;
        this.f = i3;
    }

    @Override // defpackage.tb2
    public String h() {
        return AppUtil.getApp().getString(j1j.c7);
    }

    public b0o(int i, long j, int i2, String str, int i3) {
        this.c = i;
        this.l = j;
        this.d = i2;
        this.g = str;
        this.f = i3;
    }

    public b0o(int i, int i2, String str, int i3, int i4, int i5) {
        this.c = i;
        this.h = i2;
        this.n = str;
        this.j = i3;
        this.i = i4;
        this.f = i5;
    }

    public b0o(long j, float f, int i) {
        this.f = i;
        this.m = f;
        this.l = j;
    }
}
