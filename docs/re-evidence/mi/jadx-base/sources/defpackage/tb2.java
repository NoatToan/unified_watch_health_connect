package defpackage;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.util.DataUtil;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class tb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f34529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f34530b;
    public int c;
    public int d;
    public int f;
    public String g;
    public int h;
    public int i;
    public int j;
    public int e = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f34531k = true;

    public tb2() {
    }

    public static <T extends tb2> m9f b(List<T> list) {
        m9f m9fVarD = d(list);
        float f = m9fVarD.f25916a * 1.1111112f;
        Logger.d("SegmentModel last min:" + m9fVarD.f25917b, new Object[0]);
        return new m9f(f, m9fVarD.f25917b);
    }

    public static <T extends tb2> m9f c(List<T> list) {
        m9f m9fVarD = d(list);
        float f = m9fVarD.f25916a;
        if (f == 0.0f) {
            return new m9f(f, m9fVarD.f25917b);
        }
        float speed = DataUtil.getSpeed((int) m9fVarD.f25917b);
        float speed2 = DataUtil.getSpeed((int) m9fVarD.f25916a);
        float f2 = 1.1111112f * speed;
        Logger.d("SegmentModel fastSpeedF:" + speed + " slowSpeedF" + speed2, new Object[0]);
        return new m9f(f2, speed2);
    }

    public static <T extends tb2> m9f d(List<T> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        int iMax = 0;
        int iMin = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            T t = list.get(i2);
            if (t != null && t.f == 0 && t.f34530b >= 1.0f) {
                iMax = Math.max(iMax, t.d);
            }
            int i4 = t.f;
            boolean z = i4 == 0;
            if (t instanceof gro) {
                z = i4 == 0;
            }
            if (t.d < 36) {
                t.d = 0;
            }
            if (z && (i = t.d) > 0) {
                if (iMin == 0) {
                    iMin = i;
                } else {
                    iMin = Math.min(iMin, i);
                    if (iMin == t.d) {
                        i3 = i2;
                    }
                }
            }
            i2++;
        }
        if (size > 1) {
            list.get(i3).e = 1;
        }
        return new m9f(iMax, iMin);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:35:0x0049 A[SYNTHETIC] */
    public static <T extends tb2> m9f e(List<T> list) {
        int i;
        list.size();
        int iMax = 0;
        int iMin = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            if (t != null && t.f == 0 && t.f34530b >= 1.0f) {
                iMax = Math.max(iMax, t.d);
            }
            int i3 = t.f;
            boolean z = i3 == 0 && t.f34530b >= 1.0f;
            if (t instanceof gro) {
                if (i3 == 0) {
                    i = t.d;
                    if (i <= 0) {
                        if (iMin == 0) {
                            iMin = i;
                        } else {
                            iMin = Math.min(iMin, i);
                        }
                    }
                }
            } else if (z) {
                i = t.d;
                if (i <= 0) {
                    if (iMin == 0) {
                        iMin = i;
                    } else {
                        iMin = Math.min(iMin, i);
                    }
                }
            }
        }
        return new m9f(iMax, iMin);
    }

    public String a() {
        return Integer.toString(this.d);
    }

    public String f() {
        return TimeDateUtil.getSportPaceStrWithSecDef(this.d);
    }

    public String g() {
        return xr5.g(2, 1.0f / ((this.d * 1.0f) / 3600.0f));
    }

    public abstract String h();

    public tb2(int i, long j, float f, int i2, int i3) {
        this.c = i;
        this.f34529a = j;
        this.f34530b = f;
        this.d = i2;
        this.f = i3;
    }
}
