package y80;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0005H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Ly80/v;", "", "", "unitId", "Lc83/a0;", "Lz80/f;", "b", "(JLt13/d;)Ljava/lang/Object;", "deviceSettings", "", "a", "(JLz80/f;Lt13/d;)Ljava/lang/Object;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface v {
    @i83.p("device-service/deviceservice/device-info/settings/{unitId}")
    Object a(@i83.s("unitId") long j8, @i83.a z80.f fVar, t13.d<? super c83.a0<Unit>> dVar);

    @i83.f("device-service/deviceservice/device-info/settings/{unitId}")
    Object b(@i83.s("unitId") long j8, t13.d<? super c83.a0<z80.f>> dVar);
}
