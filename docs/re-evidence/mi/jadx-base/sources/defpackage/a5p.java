package defpackage;

import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.temporal.ChronoField;

/* JADX INFO: loaded from: classes3.dex */
public final class a5p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b5p<ZoneId> f661a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b5p<org.threeten.bp.chrono.b> f662b = new b();
    public static final b5p<c5p> c = new c();
    public static final b5p<ZoneId> d = new d();
    public static final b5p<ZoneOffset> e = new e();
    public static final b5p<LocalDate> f = new f();
    public static final b5p<LocalTime> g = new g();

    public class a implements b5p<ZoneId> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ZoneId a(t4p t4pVar) {
            return (ZoneId) t4pVar.query(this);
        }
    }

    public class b implements b5p<org.threeten.bp.chrono.b> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public org.threeten.bp.chrono.b a(t4p t4pVar) {
            return (org.threeten.bp.chrono.b) t4pVar.query(this);
        }
    }

    public class c implements b5p<c5p> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c5p a(t4p t4pVar) {
            return (c5p) t4pVar.query(this);
        }
    }

    public class d implements b5p<ZoneId> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ZoneId a(t4p t4pVar) {
            ZoneId zoneId = (ZoneId) t4pVar.query(a5p.f661a);
            return zoneId != null ? zoneId : (ZoneId) t4pVar.query(a5p.e);
        }
    }

    public class e implements b5p<ZoneOffset> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ZoneOffset a(t4p t4pVar) {
            ChronoField chronoField = ChronoField.OFFSET_SECONDS;
            if (t4pVar.isSupported(chronoField)) {
                return ZoneOffset.ofTotalSeconds(t4pVar.get(chronoField));
            }
            return null;
        }
    }

    public class f implements b5p<LocalDate> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LocalDate a(t4p t4pVar) {
            ChronoField chronoField = ChronoField.EPOCH_DAY;
            if (t4pVar.isSupported(chronoField)) {
                return LocalDate.ofEpochDay(t4pVar.getLong(chronoField));
            }
            return null;
        }
    }

    public class g implements b5p<LocalTime> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LocalTime a(t4p t4pVar) {
            ChronoField chronoField = ChronoField.NANO_OF_DAY;
            if (t4pVar.isSupported(chronoField)) {
                return LocalTime.ofNanoOfDay(t4pVar.getLong(chronoField));
            }
            return null;
        }
    }

    public static final b5p<org.threeten.bp.chrono.b> a() {
        return f662b;
    }

    public static final b5p<LocalDate> b() {
        return f;
    }

    public static final b5p<LocalTime> c() {
        return g;
    }

    public static final b5p<ZoneOffset> d() {
        return e;
    }

    public static final b5p<c5p> e() {
        return c;
    }

    public static final b5p<ZoneId> f() {
        return d;
    }

    public static final b5p<ZoneId> g() {
        return f661a;
    }
}
