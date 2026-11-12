package g60;

import c83.a0;
import i83.o;
import i83.s;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0007J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lg60/a;", "", "Lfz0/c;", "date", "Lo53/i0;", "Lc83/a0;", "Lg60/b;", "a", "(Lfz0/c;)Lo53/i0;", "criticalSwimSpeed", "b", "(Lg60/b;)Lo53/i0;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1526a f76028a = C1526a.f76029a;

    /* JADX INFO: renamed from: g60.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg60/a$a;", "", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1526a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C1526a f76029a = new C1526a();

        private C1526a() {
        }
    }

    @i83.f("/biometric-service/criticalSwimSpeed/latest/{date}")
    i0<a0<b>> a(@s("date") fz0.c date);

    @o("/biometric-service/criticalSwimSpeed")
    i0<a0<b>> b(@i83.a b criticalSwimSpeed);
}
