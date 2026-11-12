package jr1;

import c83.a0;
import fz0.c;
import i83.f;
import i83.s;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u00060\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Ljr1/a;", "", "Lfz0/c;", "startDate", "endDate", "Lo53/i0;", "Lc83/a0;", "", "Lkr1/a;", "b", "(Lfz0/c;Lfz0/c;)Lo53/i0;", "", "numOfWeeks", "Lkr1/c;", "c", "(Lfz0/c;I)Lo53/i0;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/usersummary-service/stats/stress/daily/{startDate}/{endDate}")
    i0<a0<List<kr1.a>>> b(@s("startDate") c startDate, @s("endDate") c endDate);

    @f("/usersummary-service/stats/stress/weekly/{endDate}/{numOfWeeks}")
    i0<a0<List<kr1.c>>> c(@s("endDate") c endDate, @s("numOfWeeks") int numOfWeeks);
}
