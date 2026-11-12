package eh0;

import c83.a0;
import dh0.k;
import i83.s;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Leh0/a;", "", "Lfz0/f;", "date", "Lo53/i0;", "Lc83/a0;", "Ldh0/c;", "c", "(Lfz0/f;)Lo53/i0;", "startDate", "endDate", "", "Ldh0/k;", "a", "(Lfz0/f;Lfz0/f;)Lo53/i0;", "", "noOfWeeks", "b", "(Lfz0/f;Ljava/lang/String;)Lo53/i0;", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.f("/fitnessage-service/stats/daily/{startDate}/{endDate}")
    i0<a0<List<k>>> a(@s("startDate") fz0.f startDate, @s("endDate") fz0.f endDate);

    @i83.f("/fitnessage-service/stats/weekly/{endDate}/{noOfWeeks}")
    i0<a0<List<k>>> b(@s("endDate") fz0.f endDate, @s("noOfWeeks") String noOfWeeks);

    @i83.f("/fitnessage-service/fitnessage/{date}")
    i0<a0<dh0.c>> c(@s("date") fz0.f date);
}
