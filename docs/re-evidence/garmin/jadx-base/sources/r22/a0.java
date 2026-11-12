package r22;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Months;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lr22/a0;", "", "", "intervalType", "Lorg/joda/time/DateTime;", "referenceStartDate", "endDate", "<init>", "(Ljava/lang/Integer;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DateTime f149547g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f149548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f149549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f149550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f149551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f149552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DateTime f149553f;

    static {
        new a(null);
        f149547g = new DateTime(2006, 1, 1, 0, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da A[ADDED_TO_REGION] */
    public a0(Integer num, DateTime dateTime, DateTime dateTime2) {
        DateTime dateTime3;
        int months;
        double dCeil;
        int months2;
        this.f149548a = num;
        DateTime dateTimeR = c22.j0.R(dateTime == null ? f149547g : dateTime);
        this.f149549b = dateTimeR;
        DateTime dateTimeNow = dateTime2 == null ? DateTime.now() : dateTime2;
        c22.j0 j0Var = c22.j0.f23099a;
        DateTimeZone dateTimeZone = DateTimeZone.getDefault();
        dateTimeZone.getClass();
        j0Var.getClass();
        if (dateTimeNow == null) {
            dateTime3 = new DateTime().withTime(23, 59, 59, 0).withZone(dateTimeZone);
            dateTime3.getClass();
        } else {
            dateTime3 = new DateTime(dateTimeNow.getYear(), dateTimeNow.getMonthOfYear(), dateTimeNow.getDayOfMonth(), 23, 59, 59, 0, dateTimeZone);
        }
        this.f149550c = dateTime3;
        int i14 = (num != null && num.intValue() == 1) ? 1 : (num != null && num.intValue() == 4) ? 7 : (num != null && num.intValue() == 5) ? 28 : (num != null && num.intValue() == 8) ? 91 : (num != null && num.intValue() == 9) ? 182 : (num != null && num.intValue() == 10) ? 84 : (num != null && num.intValue() == 11) ? 92 : (num != null && num.intValue() == 12) ? 365 : (num != null && num.intValue() == 13) ? 364 : -1;
        this.f149551d = i14;
        if (num == null || num.intValue() != 1) {
            if (num != null && num.intValue() == 3) {
                months2 = Months.monthsBetween(dateTimeR, dateTime3).getMonths();
            } else {
                if ((num != null && num.intValue() == 4) || ((num != null && num.intValue() == 5) || ((num != null && num.intValue() == 10) || ((num != null && num.intValue() == 8) || ((num != null && num.intValue() == 9) || ((num != null && num.intValue() == 11) || ((num != null && num.intValue() == 12) || (num != null && num.intValue() == 13)))))))) {
                    dCeil = Math.ceil(((double) Days.daysBetween(dateTimeR, dateTime3).getDays()) / ((double) i14));
                } else if (num != null && num.intValue() == 6) {
                    dCeil = Math.ceil(((double) (Months.monthsBetween(dateTimeR, dateTime3).getMonths() + 1)) / ((double) 12));
                } else {
                    months = (num != null && num.intValue() == 7) ? (Months.monthsBetween(dateTimeR, dateTime3).getMonths() + 1) / 6 : -1;
                }
                months = (int) dCeil;
            }
            this.f149552e = months;
            if ((num != null || num.intValue() != 1) && ((num == null || num.intValue() != 3) && (num == null || num.intValue() != 7))) {
                if (num == null && num.intValue() == 6) {
                    dateTimeR = dateTimeR.minusMonths(((months * 12) - Months.monthsBetween(dateTimeR, dateTime3).getMonths()) - 1);
                    dateTimeR.getClass();
                } else if ((num == null && num.intValue() == 4) || ((num != null && num.intValue() == 5) || ((num != null && num.intValue() == 10) || ((num != null && num.intValue() == 8) || ((num != null && num.intValue() == 9) || ((num != null && num.intValue() == 11) || ((num != null && num.intValue() == 12) || (num != null && num.intValue() == 13)))))))) {
                    dateTimeR = dateTimeR.minusDays(((months * i14) - Days.daysBetween(dateTimeR.toLocalDate(), dateTime3.toLocalDate()).getDays()) - 1);
                    dateTimeR.getClass();
                }
            }
            this.f149553f = c22.j0.R(dateTimeR);
        }
        months2 = Days.daysBetween(dateTimeR, dateTime3).getDays();
        months = months2 + 1;
        this.f149552e = months;
        if (num != null) {
            if (num == null) {
                dateTimeR = dateTimeR.minusMonths(((months * 12) - Months.monthsBetween(dateTimeR, dateTime3).getMonths()) - 1);
                dateTimeR.getClass();
            } else if (num == null) {
                dateTimeR = dateTimeR.minusDays(((months * i14) - Days.daysBetween(dateTimeR.toLocalDate(), dateTime3.toLocalDate()).getDays()) - 1);
                dateTimeR.getClass();
            } else {
                dateTimeR = dateTimeR.minusDays(((months * i14) - Days.daysBetween(dateTimeR.toLocalDate(), dateTime3.toLocalDate()).getDays()) - 1);
                dateTimeR.getClass();
            }
        } else if (num == null) {
            dateTimeR = dateTimeR.minusMonths(((months * 12) - Months.monthsBetween(dateTimeR, dateTime3).getMonths()) - 1);
            dateTimeR.getClass();
        } else if (num == null) {
            dateTimeR = dateTimeR.minusDays(((months * i14) - Days.daysBetween(dateTimeR.toLocalDate(), dateTime3.toLocalDate()).getDays()) - 1);
            dateTimeR.getClass();
        } else {
            dateTimeR = dateTimeR.minusDays(((months * i14) - Days.daysBetween(dateTimeR.toLocalDate(), dateTime3.toLocalDate()).getDays()) - 1);
            dateTimeR.getClass();
        }
        this.f149553f = c22.j0.R(dateTimeR);
    }

    public final DateTime a(int i14, boolean z14) {
        int months = (Months.monthsBetween(this.f149549b, this.f149550c).getMonths() + 1) % 6;
        DateTime dateTime = this.f149553f;
        if (z14) {
            DateTime dateTimePlusMonths = dateTime.plusMonths((i14 * 5) + i14 + months);
            dateTimePlusMonths.getClass();
            return dateTimePlusMonths;
        }
        DateTime dateTimePlusMonths2 = dateTime.plusMonths(((i14 + 1) * 5) + i14 + months);
        dateTimePlusMonths2.getClass();
        return dateTimePlusMonths2;
    }

    public final o13.p<DateTime, DateTime> b(int i14) {
        DateTime dateTime = this.f149553f;
        Integer num = this.f149548a;
        if (num != null && num.intValue() == 1) {
            DateTime dateTimePlusDays = dateTime.plusDays(i14);
            dateTimePlusDays.getClass();
            return new o13.p<>(dateTimePlusDays, dateTimePlusDays);
        }
        if (num != null && num.intValue() == 3) {
            DateTime dateTimePlusMonths = dateTime.plusMonths(i14);
            dateTimePlusMonths.getClass();
            return new o13.p<>(dateTimePlusMonths.dayOfMonth().withMinimumValue(), dateTimePlusMonths.dayOfMonth().withMaximumValue());
        }
        if (num != null && num.intValue() == 7) {
            DateTime dateTimeWithMinimumValue = a(i14, true).dayOfMonth().withMinimumValue();
            dateTimeWithMinimumValue.getClass();
            DateTime dateTimeWithMaximumValue = a(i14, false).dayOfMonth().withMaximumValue();
            dateTimeWithMaximumValue.getClass();
            return new o13.p<>(dateTimeWithMinimumValue, dateTimeWithMaximumValue);
        }
        if (num != null && num.intValue() == 6) {
            DateTime dateTimePlusMonths2 = dateTime.plusMonths(i14 * 12);
            dateTimePlusMonths2.getClass();
            DateTime dateTimePlusMonths3 = dateTime.plusMonths(((i14 + 1) * 12) - 1);
            dateTimePlusMonths3.getClass();
            return new o13.p<>(dateTimePlusMonths2, dateTimePlusMonths3);
        }
        int i15 = this.f149551d;
        if ((num != null && num.intValue() == 4) || ((num != null && num.intValue() == 5) || ((num != null && num.intValue() == 10) || ((num != null && num.intValue() == 8) || ((num != null && num.intValue() == 9) || ((num != null && num.intValue() == 11) || ((num != null && num.intValue() == 12) || (num != null && num.intValue() == 13)))))))) {
            DateTime dateTimePlusDays2 = dateTime.plusDays(i14 * i15);
            dateTimePlusDays2.getClass();
            DateTime dateTimePlusDays3 = dateTime.plusDays(((i14 + 1) * i15) - 1);
            dateTimePlusDays3.getClass();
            return new o13.p<>(dateTimePlusDays2, dateTimePlusDays3);
        }
        DateTime dateTimePlusDays4 = dateTime.plusDays(i14 * i15);
        dateTimePlusDays4.getClass();
        DateTime dateTimePlusDays5 = dateTime.plusDays(((i14 + 1) * i15) - 1);
        dateTimePlusDays5.getClass();
        return new o13.p<>(dateTimePlusDays4, dateTimePlusDays5);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\t¨\u0006\u0014"}, d2 = {"Lr22/a0$a;", "", "<init>", "()V", "Lorg/joda/time/DateTime;", "DEFAULT_REFERENCE_START_DATE", "Lorg/joda/time/DateTime;", "", "ONE_DAY", "I", "SEVEN_DAYS", "FOURTEEN_DAYS", "TWENTY_EIGHT_DAYS", "TWELVE_MONTHS", "NUM_OF_DAYS_IN_TWELVE_WEEKS", "NUM_OF_DAYS_IN_THIRTEEN_WEEKS", "NUM_OF_DAYS_IN_TWENTY_SIX_WEEKS", "NUM_OF_DAYS_IN_THREE_MONTHS", "NUM_OF_DAYS_IN_TWELVE_MONTHS", "NUM_OF_DAYS_IN_FIFTY_TWO_WEEKS", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ a0(Integer num, DateTime dateTime, DateTime dateTime2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(num, (i14 & 2) != 0 ? null : dateTime, (i14 & 4) != 0 ? null : dateTime2);
    }
}
