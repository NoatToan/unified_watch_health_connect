package q60;

import c83.a0;
import i83.f;
import i83.s;
import i83.t;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\tJ/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\rH'¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lq60/a;", "", "Lfz0/c;", "calendarDate", "", "selectedVersion", "Lo53/i0;", "Lc83/a0;", "", "a", "(Lfz0/c;J)Lo53/i0;", "startDate", "endDate", "", "aggregation", "Ln60/b;", "b", "(Lfz0/c;Lfz0/c;Ljava/lang/String;)Lo53/i0;", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2692a f143157a = C2692a.f143158a;

    /* JADX INFO: renamed from: q60.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq60/a$a;", "", "<init>", "()V", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2692a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C2692a f143158a = new C2692a();

        private C2692a() {
        }
    }

    @i83.b("/biometric-service/criticalSwimSpeed/{calendarDate}/{selectedVersion}")
    i0<a0<Unit>> a(@s("calendarDate") fz0.c calendarDate, @s("selectedVersion") long selectedVersion);

    @f("/biometric-service/criticalSwimSpeed/range/{startDate}/{endDate}")
    i0<a0<n60.b>> b(@s("startDate") fz0.c startDate, @s("endDate") fz0.c endDate, @t("aggregation") String aggregation);
}
