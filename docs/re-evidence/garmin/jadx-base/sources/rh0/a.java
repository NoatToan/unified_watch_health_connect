package rh0;

import c83.a0;
import fz0.c;
import i83.f;
import i83.s;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import sh0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lrh0/a;", "", "Lfz0/c;", "date", "Lo53/i0;", "Lc83/a0;", "Lsh0/c;", "b", "(Lfz0/c;)Lo53/i0;", "startDate", "endDate", "", "Lsh0/b;", "a", "(Lfz0/c;Lfz0/c;)Lo53/i0;", "", "numOfWeeks", "Lsh0/f;", "c", "(Lfz0/c;I)Lo53/i0;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/usersummary-service/stats/floors/daily/{startDate}/{endDate}")
    i0<a0<List<b>>> a(@s("startDate") c startDate, @s("endDate") c endDate);

    @f("wellness-service/wellness/floorsChartData/daily/{calendarDate}")
    i0<a0<sh0.c>> b(@s("calendarDate") c date);

    @f("/usersummary-service/stats/floors/weekly/{endDate}/{numOfWeeks}")
    i0<a0<List<sh0.f>>> c(@s("endDate") c endDate, @s("numOfWeeks") int numOfWeeks);
}
