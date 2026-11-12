package pc1;

import c83.a0;
import i83.f;
import i83.s;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import tc1.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J?\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lpc1/a;", "", "", "eventRef", "Lfz0/f;", "startDate", "endDate", "Lo53/i0;", "Lc83/a0;", "", "Ltc1/b;", "a", "(Ljava/lang/String;Lfz0/f;Lfz0/f;)Lo53/i0;", "gcm-race-time-prediction_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/metrics-service/metrics/eventracetimeprojections/{eventRef}/{startDate}/{endDate}")
    i0<a0<List<b>>> a(@s("eventRef") String eventRef, @s("startDate") fz0.f startDate, @s("endDate") fz0.f endDate);
}
