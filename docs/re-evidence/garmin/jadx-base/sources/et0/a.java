package et0;

import org.joda.time.LocalDate;
import org.joda.time.Weeks;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Let0/a;", "Lbt0/b;", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "Lxs0/a;", "lactateThresholdSportType", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lxs0/a;)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends bt0.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LocalDate localDate, LocalDate localDate2, xs0.a aVar) {
        super(localDate, localDate2, aVar);
        localDate.getClass();
        localDate2.getClass();
        aVar.getClass();
    }

    @Override // bt0.b
    public final int a(LocalDate localDate, LocalDate localDate2) {
        localDate.getClass();
        localDate2.getClass();
        return Weeks.weeksBetween(localDate, localDate2).getWeeks() + 1;
    }
}
