package ol;

import c83.a0;
import fz0.c;
import i83.f;
import i83.t;
import p005kotlin.Metadata;
import pl.b;
import t13.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\b¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lol/a;", "", "Lfz0/c;", "startDate", "endDate", "Lc83/a0;", "Lnl/a;", "a", "(Lfz0/c;Lfz0/c;Lt13/d;)Ljava/lang/Object;", "Lpl/b;", "b", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/wellness-service/stats/daily/acclimation")
    Object a(@t("fromDate") c cVar, @t("untilDate") c cVar2, d<? super a0<nl.a>> dVar);

    @f("/usersummary-service/stats/weekly/acclimation")
    Object b(@t("startDate") c cVar, @t("endDate") c cVar2, d<? super a0<b>> dVar);
}
