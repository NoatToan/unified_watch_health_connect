package my;

import c83.a0;
import fz0.c;
import i83.f;
import i83.s;
import i83.t;
import java.util.List;
import ny.b;
import ny.e;
import p005kotlin.Metadata;
import t13.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ0\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00062\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lmy/a;", "", "Lfz0/c;", "startDate", "endDate", "currentDate", "Lc83/a0;", "Lny/b;", "a", "(Lfz0/c;Lfz0/c;Lfz0/c;Lt13/d;)Ljava/lang/Object;", "", "numberOfWeeks", "", "Lny/e;", "b", "(Lfz0/c;ILt13/d;)Ljava/lang/Object;", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/usersummary-service/stats/daily/{startDate}/{endDate}?statsType=CALORIES")
    Object a(@s("startDate") c cVar, @s("endDate") c cVar2, @t("currentDate") c cVar3, d<? super a0<b>> dVar);

    @f("/usersummary-service/stats/calories/weekly/{endDate}/{numWeeks}")
    Object b(@s("endDate") c cVar, @s("numWeeks") int i14, d<? super a0<List<e>>> dVar);
}
