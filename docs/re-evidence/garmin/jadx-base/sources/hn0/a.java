package hn0;

import c83.a0;
import fz0.c;
import i83.f;
import i83.s;
import java.util.List;
import p005kotlin.Metadata;
import t13.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lhn0/a;", "", "Lfz0/c;", "date", "Lc83/a0;", "Lin0/d;", "b", "(Lfz0/c;Lt13/d;)Ljava/lang/Object;", "startDate", "endDate", "", "a", "(Lfz0/c;Lfz0/c;Lt13/d;)Ljava/lang/Object;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/healthstatus-service/healthstatus/summary/{startDate}/{endDate}")
    Object a(@s("startDate") c cVar, @s("endDate") c cVar2, d<? super a0<List<in0.d>>> dVar);

    @f("/healthstatus-service/healthstatus/summary/{calendarDate}")
    Object b(@s("calendarDate") c cVar, d<? super a0<in0.d>> dVar);
}
