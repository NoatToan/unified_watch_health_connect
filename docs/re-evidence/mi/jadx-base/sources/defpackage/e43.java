package defpackage;

import com.xiaomi.heart.bmp.MonitorStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes10.dex */
public class e43 {
    public static AtomicBoolean f = new AtomicBoolean(false);
    public static e43 g = null;
    public static f2a h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g5i f16244b = new g5i(18000, 9);
    public List<Integer> c = new ArrayList();
    public List<Integer> d = new ArrayList();
    public List<Integer> e = new ArrayList();

    public e43(int i) {
        this.f16243a = i;
    }

    public static void c() {
        g = null;
        f.set(false);
    }

    public static f43 d(double d, double d2) {
        return g.e(d, d2);
    }

    public static int[] f() {
        List<Integer> list = g.e;
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = list.get(i).intValue();
        }
        return iArr;
    }

    public static boolean g(double d, double d2) {
        return d > 160.0d && d2 < 60.0d;
    }

    public static void i(int i) {
        if (!f.compareAndSet(false, true)) {
            throw new RuntimeException("bmpMonitor is running... ...");
        }
        if (i < 30) {
            throw new RuntimeException(String.format("fps value error：%d , which should more than 30", Integer.valueOf(i)));
        }
        g = new e43(i);
        h = new f2a();
    }

    public final f43 b() {
        if (this.e.size() == 0) {
            return new f43(MonitorStatus.PRE_CHECK, -1, -1);
        }
        if (this.e.size() < 5) {
            int asDouble = (int) this.e.stream().mapToInt(new ToIntFunction() { // from class: d43
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return ((Integer) obj).intValue();
                }
            }).average().getAsDouble();
            return new f43(MonitorStatus.OK, asDouble, asDouble);
        }
        Collections.sort(this.e);
        int size = (int) (((double) this.e.size()) * 0.2d);
        int iIntValue = 0;
        int i = 0;
        for (int i2 = size; i2 < this.e.size() - size; i2++) {
            iIntValue += this.e.get(i2).intValue();
            i++;
        }
        int i3 = iIntValue / i;
        return new f43(MonitorStatus.OK, i3, i3);
    }

    public f43 e(double d, double d2) {
        if (!h.a()) {
            return new f43(MonitorStatus.FPS_JITTER, -1, -1);
        }
        if (!g(d, d2)) {
            this.f16244b.c();
            this.c.clear();
            this.d.clear();
            return new f43(MonitorStatus.PRE_CHECK, -1, -1);
        }
        this.f16244b.a(d);
        double[] dArrD = this.f16244b.d(this.f16243a);
        if (dArrD == null) {
            return new f43(MonitorStatus.PRE_CHECK, -1, -1);
        }
        boolean zA = c43.a(dArrD, this.f16243a / 2, 5);
        boolean zB = c43.b(dArrD, this.f16243a / 2, 5);
        if (zA) {
            this.c.add(Integer.valueOf(this.f16244b.b() - (this.f16243a / 2)));
            int size = this.c.size();
            if (size > 1) {
                float fB = (h.b() * 1.0f) / (this.c.get(size - 1).intValue() - this.c.get(size - 2).intValue());
                if (fB < 3.67f && fB > 0.8333f) {
                    this.e.add(Integer.valueOf((int) (fB * 60.0f)));
                }
            }
        }
        if (zB) {
            this.d.add(Integer.valueOf(this.f16244b.b() - (this.f16243a / 2)));
            int size2 = this.d.size();
            if (size2 > 1) {
                float fB2 = (h.b() * 1.0f) / (this.d.get(size2 - 1).intValue() - this.d.get(size2 - 2).intValue());
                if (fB2 < 3.67f && fB2 > 0.8333f) {
                    this.e.add(Integer.valueOf((int) (fB2 * 60.0f)));
                }
            }
        }
        return b();
    }
}
