package defpackage;

import java.io.Serializable;
import org.threeten.bp.Instant;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g14 {

    public static final class a extends g14 implements Serializable {
        private static final long serialVersionUID = 6740630888130243051L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ZoneId f18453a;

        public a(ZoneId zoneId) {
            this.f18453a = zoneId;
        }

        @Override // defpackage.g14
        public ZoneId a() {
            return this.f18453a;
        }

        @Override // defpackage.g14
        public Instant b() {
            return Instant.ofEpochMilli(f());
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f18453a.equals(((a) obj).f18453a);
            }
            return false;
        }

        public long f() {
            return System.currentTimeMillis();
        }

        public int hashCode() {
            return this.f18453a.hashCode() + 1;
        }

        public String toString() {
            return "SystemClock[" + this.f18453a + "]";
        }
    }

    public static g14 c(ZoneId zoneId) {
        crd.i(zoneId, "zone");
        return new a(zoneId);
    }

    public static g14 d() {
        return new a(ZoneId.systemDefault());
    }

    public static g14 e() {
        return new a(ZoneOffset.UTC);
    }

    public abstract ZoneId a();

    public abstract Instant b();
}
