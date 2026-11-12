package defpackage;

import java.util.concurrent.TimeUnit;
import org.eclipse.californium.core.config.CoapConfig;
import org.eclipse.californium.elements.config.Configuration;

/* JADX INFO: loaded from: classes20.dex */
public class zwx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f54703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f54704c;
    private final int d;
    private final int e;
    private final int j;

    zwx(int i, int i2, float f, float f2, int i3, int i4) {
        this.f54702a = i;
        this.d = i2;
        this.f54703b = f;
        this.f54704c = f2;
        this.e = i3;
        this.j = i4;
    }

    public int c() {
        return this.f54702a;
    }

    public int a() {
        return this.d;
    }

    public float d() {
        return this.f54703b;
    }

    public float b() {
        return this.f54704c;
    }

    public int i() {
        return this.e;
    }

    public int f() {
        return this.j;
    }

    public static b e() {
        return new b();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f54705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f54706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f54707c;
        private int d;
        private int e;
        private int h;

        private b() {
        }

        public b a(Configuration configuration) {
            this.e = configuration.d(CoapConfig.e, TimeUnit.MILLISECONDS);
            this.f54707c = configuration.d(CoapConfig.x, TimeUnit.MILLISECONDS);
            this.f54705a = ((Float) configuration.c(CoapConfig.f44408a)).floatValue();
            this.f54706b = ((Float) configuration.c(CoapConfig.f44410c)).floatValue();
            this.d = ((Integer) configuration.c(CoapConfig.ab)).intValue();
            this.h = ((Integer) configuration.c(CoapConfig.aj)).intValue();
            c();
            return this;
        }

        public zwx e() {
            c();
            return new zwx(this.e, this.f54707c, this.f54705a, this.f54706b, this.d, this.h);
        }

        private void c() {
            if (this.f54707c < this.e) {
                throw new IllegalStateException("Maximum ack timeout " + this.f54707c + "ms must not be less than ack timeout " + this.e + "ms!");
            }
            if (1 > this.d) {
                throw new IllegalStateException("Maxium retransmit " + this.d + " must not be less than 1!");
            }
            if (1 > this.h) {
                throw new IllegalStateException("Nstart " + this.h + " must not be less than 1!");
            }
            if (1.0d > this.f54705a) {
                throw new IllegalStateException("Ack random factor " + this.f54705a + " must not be less than 1.0!");
            }
            if (1.0d <= this.f54706b) {
                return;
            }
            throw new IllegalStateException("Ack scale factor " + this.f54706b + " must not be less than 1.0!");
        }
    }
}
