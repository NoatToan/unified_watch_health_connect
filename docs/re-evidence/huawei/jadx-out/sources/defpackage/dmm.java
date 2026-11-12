package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class dmm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f32010a;
    private String d;
    private int e;

    private dmm(int i, long j, String str) {
        this.e = i;
        this.f32010a = j;
        this.d = str;
    }

    public int c() {
        return ((Integer) dym.d(Integer.valueOf(this.e))).intValue();
    }

    public long e() {
        return ((Long) dym.d(Long.valueOf(this.f32010a))).longValue();
    }

    public String a() {
        return (String) dym.d(this.d);
    }

    public static final class e {
        private static final int[] d = {1, 2, 4, 8, 16, 32};
        private int e = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f32012b = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32011a = "no";

        public e e(int i) {
            for (int i2 : d) {
                if (i2 == i) {
                    this.e = i;
                    return this;
                }
            }
            throw new IllegalArgumentException("invalid scan type " + i);
        }

        public e b(long j, TimeUnit timeUnit) {
            if (j < 0 && j != -1) {
                throw new IllegalArgumentException("invalid scan duration " + j);
            }
            this.f32012b = j > 0 ? (int) timeUnit.toMillis(j) : -1L;
            return this;
        }

        public e e(String str) {
            this.f32011a = str;
            return this;
        }

        public dmm b() {
            return new dmm(this.e, this.f32012b, this.f32011a);
        }
    }
}
