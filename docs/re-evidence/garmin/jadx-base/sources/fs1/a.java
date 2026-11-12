package fs1;

import c83.a0;
import fz0.c;
import gs1.k;
import gs1.t;
import i83.f;
import i83.s;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lfs1/a;", "", "Lfz0/c;", "date", "Lo53/i0;", "Lc83/a0;", "Lgs1/t;", "a", "(Lfz0/c;)Lo53/i0;", "calendarDate", "", "includeOverlaps", "", "Lgs1/k;", "b", "(Lfz0/c;Z)Lo53/i0;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/mobile-gateway/snapshot/timeline/v2/forDate/{date}")
    i0<a0<t>> a(@s("date") c date);

    @f("/sleep-service/sleep/naps/{calendarDate}")
    i0<a0<List<k>>> b(@s("calendarDate") c calendarDate, @i83.t("includeOverlaps") boolean includeOverlaps);
}
