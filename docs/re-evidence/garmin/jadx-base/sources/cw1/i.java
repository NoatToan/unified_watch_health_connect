package cw1;

import i3.bc;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcw1/i;", "Li3/bc;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f56058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f56059b;

    public i(LocalDate localDate, LocalDate localDate2) {
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        this.f56058a = localDate.toDateTimeAtStartOfDay(dateTimeZone).getMillis();
        this.f56059b = localDate2.toDateTimeAtStartOfDay(dateTimeZone).getMillis();
    }

    @Override // i3.bc
    public final boolean a(long j8) {
        return j8 <= this.f56059b && this.f56058a <= j8;
    }
}
