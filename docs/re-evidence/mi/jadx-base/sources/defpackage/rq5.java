package defpackage;

import java.util.Locale;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.chrono.b;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public final class rq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t4p f32786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Locale f32787b;
    public wr5 c;
    public int d;

    public class a extends sv5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ org.threeten.bp.chrono.a f32788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t4p f32789b;
        public final /* synthetic */ b c;
        public final /* synthetic */ ZoneId d;

        public a(org.threeten.bp.chrono.a aVar, t4p t4pVar, b bVar, ZoneId zoneId) {
            this.f32788a = aVar;
            this.f32789b = t4pVar;
            this.c = bVar;
            this.d = zoneId;
        }

        @Override // defpackage.t4p
        public long getLong(z4p z4pVar) {
            return (this.f32788a == null || !z4pVar.isDateBased()) ? this.f32789b.getLong(z4pVar) : this.f32788a.getLong(z4pVar);
        }

        @Override // defpackage.t4p
        public boolean isSupported(z4p z4pVar) {
            return (this.f32788a == null || !z4pVar.isDateBased()) ? this.f32789b.isSupported(z4pVar) : this.f32788a.isSupported(z4pVar);
        }

        @Override // defpackage.sv5, defpackage.t4p
        public <R> R query(b5p<R> b5pVar) {
            if (b5pVar == a5p.a()) {
                return (R) this.c;
            }
            if (b5pVar == a5p.g()) {
                return (R) this.d;
            }
            return b5pVar == a5p.e() ? (R) this.f32789b.query(b5pVar) : b5pVar.a(this);
        }

        @Override // defpackage.sv5, defpackage.t4p
        public ValueRange range(z4p z4pVar) {
            return (this.f32788a == null || !z4pVar.isDateBased()) ? this.f32789b.range(z4pVar) : this.f32788a.range(z4pVar);
        }
    }

    public rq5(t4p t4pVar, iq5 iq5Var) {
        this.f32786a = a(t4pVar, iq5Var);
        this.f32787b = iq5Var.f();
        this.c = iq5Var.e();
    }

    public static t4p a(t4p t4pVar, iq5 iq5Var) {
        b bVarD = iq5Var.d();
        ZoneId zoneIdG = iq5Var.g();
        if (bVarD == null && zoneIdG == null) {
            return t4pVar;
        }
        b bVar = (b) t4pVar.query(a5p.a());
        ZoneId zoneId = (ZoneId) t4pVar.query(a5p.g());
        org.threeten.bp.chrono.a aVarDate = null;
        if (crd.c(bVar, bVarD)) {
            bVarD = null;
        }
        if (crd.c(zoneId, zoneIdG)) {
            zoneIdG = null;
        }
        if (bVarD == null && zoneIdG == null) {
            return t4pVar;
        }
        b bVar2 = bVarD != null ? bVarD : bVar;
        if (zoneIdG != null) {
            zoneId = zoneIdG;
        }
        if (zoneIdG != null) {
            if (t4pVar.isSupported(ChronoField.INSTANT_SECONDS)) {
                if (bVar2 == null) {
                    bVar2 = IsoChronology.INSTANCE;
                }
                return bVar2.zonedDateTime(Instant.from(t4pVar), zoneIdG);
            }
            ZoneId zoneIdNormalized = zoneIdG.normalized();
            ZoneOffset zoneOffset = (ZoneOffset) t4pVar.query(a5p.d());
            if ((zoneIdNormalized instanceof ZoneOffset) && zoneOffset != null && !zoneIdNormalized.equals(zoneOffset)) {
                throw new DateTimeException("Invalid override zone for temporal: " + zoneIdG + " " + t4pVar);
            }
        }
        if (bVarD != null) {
            if (t4pVar.isSupported(ChronoField.EPOCH_DAY)) {
                aVarDate = bVar2.date(t4pVar);
            } else if (bVarD != IsoChronology.INSTANCE || bVar != null) {
                for (ChronoField chronoField : ChronoField.values()) {
                    if (chronoField.isDateBased() && t4pVar.isSupported(chronoField)) {
                        throw new DateTimeException("Invalid override chronology for temporal: " + bVarD + " " + t4pVar);
                    }
                }
            }
        }
        return new a(aVarDate, t4pVar, bVar2, zoneId);
    }

    public void b() {
        this.d--;
    }

    public Locale c() {
        return this.f32787b;
    }

    public wr5 d() {
        return this.c;
    }

    public t4p e() {
        return this.f32786a;
    }

    public Long f(z4p z4pVar) {
        try {
            return Long.valueOf(this.f32786a.getLong(z4pVar));
        } catch (DateTimeException e) {
            if (this.d > 0) {
                return null;
            }
            throw e;
        }
    }

    public <R> R g(b5p<R> b5pVar) {
        R r2 = (R) this.f32786a.query(b5pVar);
        if (r2 != null || this.d != 0) {
            return r2;
        }
        throw new DateTimeException("Unable to extract value: " + this.f32786a.getClass());
    }

    public void h() {
        this.d++;
    }

    public String toString() {
        return this.f32786a.toString();
    }
}
