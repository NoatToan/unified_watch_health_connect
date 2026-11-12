package defpackage;

import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;

/* JADX INFO: loaded from: classes10.dex */
public class z7r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f40996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40997b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;

    public boolean a() {
        return FitnessSportTypeUtils.INSTANCE.supportSport(this.c) && this.f40996a != 0;
    }

    public String toString() {
        return "timeStamp = " + this.f40996a + ", sportType = " + this.c + ", paused = " + this.d + ", duration = " + this.e + ", appLaunched= " + this.g;
    }
}
