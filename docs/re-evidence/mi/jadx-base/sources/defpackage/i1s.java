package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.zone.ZoneOffsetTransition;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i1s {

    public static final class a extends i1s implements Serializable {
        private static final long serialVersionUID = -8733721350312276297L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ZoneOffset f20669a;

        public a(ZoneOffset zoneOffset) {
            this.f20669a = zoneOffset;
        }

        @Override // defpackage.i1s
        public ZoneOffset a(Instant instant) {
            return this.f20669a;
        }

        @Override // defpackage.i1s
        public ZoneOffsetTransition b(LocalDateTime localDateTime) {
            return null;
        }

        @Override // defpackage.i1s
        public List<ZoneOffset> c(LocalDateTime localDateTime) {
            return Collections.singletonList(this.f20669a);
        }

        @Override // defpackage.i1s
        public boolean d(Instant instant) {
            return false;
        }

        @Override // defpackage.i1s
        public boolean e() {
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f20669a.equals(((a) obj).f20669a);
            }
            if (!(obj instanceof pbo)) {
                return false;
            }
            pbo pboVar = (pbo) obj;
            return pboVar.e() && this.f20669a.equals(pboVar.a(Instant.EPOCH));
        }

        @Override // defpackage.i1s
        public boolean f(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
            return this.f20669a.equals(zoneOffset);
        }

        public int hashCode() {
            return ((this.f20669a.hashCode() + 31) ^ (this.f20669a.hashCode() + 31)) ^ 1;
        }

        public String toString() {
            return "FixedRules:" + this.f20669a;
        }
    }

    public static i1s g(ZoneOffset zoneOffset) {
        crd.i(zoneOffset, "offset");
        return new a(zoneOffset);
    }

    public abstract ZoneOffset a(Instant instant);

    public abstract ZoneOffsetTransition b(LocalDateTime localDateTime);

    public abstract List<ZoneOffset> c(LocalDateTime localDateTime);

    public abstract boolean d(Instant instant);

    public abstract boolean e();

    public abstract boolean f(LocalDateTime localDateTime, ZoneOffset zoneOffset);
}
