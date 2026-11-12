package defpackage;

import android.content.Context;
import com.xiaomi.fitness.common.utils.AppUtil;

/* JADX INFO: loaded from: classes8.dex */
public class gro extends tb2 {
    public int l;
    public int m;

    public gro(int i, long j, float f, int i2, int i3, int i4, int i5) {
        super(i, j, f, i2, i3);
        this.l = i4;
        this.m = i5;
    }

    public static String i(Context context, int i) {
        if (i == 2) {
            return context.getString(j1j.ca);
        }
        if (i == 1) {
            return context.getString(j1j.aa);
        }
        if (i == 4) {
            return context.getString(j1j.ba);
        }
        if (i == 3) {
            return context.getString(j1j.Z9);
        }
        return i == 0 ? context.getString(j1j.da) : "";
    }

    @Override // defpackage.tb2
    public String h() {
        return AppUtil.getApp().getString(j1j.d7);
    }

    public gro(long j, int i, int i2) {
        this.f = i2;
        this.f34530b = i;
        this.f34529a = j;
    }
}
