package ka1;

import c83.a0;
import fz0.c;
import i83.f;
import i83.t;
import na1.b;
import p005kotlin.Metadata;
import t13.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lka1/a;", "", "Lfz0/c;", "startDate", "endDate", "", "sport", "Lc83/a0;", "Lna1/b;", "a", "(Lfz0/c;Lfz0/c;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/fitnessstats-service/powerCurve/")
    Object a(@t("startDate") c cVar, @t("endDate") c cVar2, @t("sport") String str, d<? super a0<b>> dVar);

    @f("/fitnessstats-service/powerCurve")
    Object b(@t("sport") String str, d<? super a0<b>> dVar);
}
