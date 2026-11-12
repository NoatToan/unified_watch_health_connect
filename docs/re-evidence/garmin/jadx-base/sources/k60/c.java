package k60;

import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import pi0.e;
import pi0.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lk60/c;", "Li60/a;", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "Lpi0/e;", "dateTimeFormatter", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lpi0/e;)V", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends i60.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f103159d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LocalDate localDate, LocalDate localDate2, e eVar) {
        super(localDate, localDate2);
        localDate.getClass();
        localDate2.getClass();
        eVar.getClass();
        this.f103159d = eVar;
    }

    @Override // i60.a
    public final int a(LocalDate localDate, LocalDate localDate2) {
        localDate2.getClass();
        return (int) ((Days.daysBetween(localDate, localDate2).getDays() + 1) / 7.0f);
    }

    @Override // i60.a
    public final String b(LocalDate localDate, LocalDate localDate2) {
        return this.f103159d.m(localDate, localDate2, f.SHORT_MONTH_NO_WEEKDAY);
    }
}
