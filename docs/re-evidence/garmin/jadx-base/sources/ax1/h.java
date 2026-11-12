package ax1;

import c83.a0;
import i83.s;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ww1.f0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\bJ\u001b\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u0004H'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lax1/h;", "", "", "planId", "Lo53/i0;", "Lc83/a0;", "", "b", "(J)Lo53/i0;", "Lww1/i;", "c", "d", "Lww1/f0;", "a", "()Lo53/i0;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface h {
    @i83.f("/trainingplan-service/trainingplan/plans")
    i0<a0<f0>> a();

    @i83.b("/trainingplan-service/trainingplan/trainingplan/{planId}")
    i0<a0<Unit>> b(@s("planId") long planId);

    @i83.f("/trainingplan-service/trainingplan/fbt-adaptive/{planId}")
    i0<a0<ww1.i>> c(@s("planId") long planId);

    @i83.f("/trainingplan-service/trainingplan/phased/{planId}")
    i0<a0<ww1.i>> d(@s("planId") long planId);
}
