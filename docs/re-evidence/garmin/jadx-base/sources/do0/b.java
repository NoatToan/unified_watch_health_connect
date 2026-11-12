package do0;

import c83.a0;
import i83.s;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ5\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Ldo0/b;", "", "Lfz0/c;", "startDate", "endDate", "Lo53/i0;", "Lc83/a0;", "", "Lco0/d;", "b", "(Lfz0/c;Lfz0/c;)Lo53/i0;", "", "numWeeks", "a", "(Lfz0/c;I)Lo53/i0;", "", "eventTimestamp", "", "c", "(Ljava/lang/String;)Lo53/i0;", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @i83.f("usersummary-service/stats/heartRate/weekly/{endDate}/{numWeeks}")
    i0<a0<List<co0.d>>> a(@s("endDate") fz0.c endDate, @s("numWeeks") int numWeeks);

    @i83.f("usersummary-service/stats/heartRate/daily/{startDate}/{endDate}")
    i0<a0<List<co0.d>>> b(@s("startDate") fz0.c startDate, @s("endDate") fz0.c endDate);

    @i83.b("wellness-service/wellness/abnormalHeartRate/{eventTimestamp}")
    i0<a0<Unit>> c(@s("eventTimestamp") String eventTimestamp);
}
