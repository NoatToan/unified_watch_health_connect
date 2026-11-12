package ax;

import bx.b;
import bx.e;
import c83.a0;
import fz0.c;
import i83.f;
import i83.s;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007H'¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\u00030\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0007H'¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lax/a;", "", "Lo53/i0;", "Lc83/a0;", "Lbx/e;", "a", "()Lo53/i0;", "Lfz0/c;", "startDate", "endDate", "", "Lbx/f;", "c", "(Lfz0/c;Lfz0/c;)Lo53/i0;", "calendarDate", "Lbx/b;", "b", "(Lfz0/c;)Lo53/i0;", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("wellness-service/wellness/bodyBattery/messagingToday")
    i0<a0<e>> a();

    @f("wellness-service/wellness/bodyBattery/events/{calendarDate}")
    i0<a0<List<b>>> b(@s("calendarDate") c calendarDate);

    @f("/usersummary-service/stats/bodybattery/daily/{startDate}/{endDate}")
    i0<a0<List<bx.f>>> c(@s("startDate") c startDate, @s("endDate") c endDate);
}
