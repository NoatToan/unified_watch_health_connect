package v31;

import c83.a0;
import fz0.c;
import i41.b;
import i41.e;
import i83.f;
import i83.s;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lv31/a;", "", "Lfz0/c;", "date", "Lo53/i0;", "Lc83/a0;", "Li41/b;", "d", "(Lfz0/c;)Lo53/i0;", "fromDate", "toDate", "Li41/e;", "a", "(Lfz0/c;Lfz0/c;)Lo53/i0;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("hrv-service/hrv/daily/{fromDate}/{toDate}")
    i0<a0<e>> a(@s("fromDate") c fromDate, @s("toDate") c toDate);

    @f("hrv-service/hrv/{calendarDate}")
    i0<a0<b>> d(@s("calendarDate") c date);
}
