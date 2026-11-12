package r22;

import androidx.fragment.app.Fragment;
import i3.e5;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Months;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lr22/b0;", "Lr22/w0;", "Landroidx/fragment/app/v;", "fm", "", "intervalType", "Lorg/joda/time/DateTime;", "referenceStartDate", "endDate", "Lr22/b0$b;", "pagerTitleFormatter", "<init>", "(Landroidx/fragment/app/v;ILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lr22/b0$b;)V", "b", "c", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b0 extends w0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f149584l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f149585m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a0 f149586n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final DateTime f149587o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f149588p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DateTime f149589q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DateTime f149590r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f149591t;

    public interface b {
        String a(int i14, DateTime dateTime, DateTime dateTime2);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr22/b0$c;", "Lr22/b0$b;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static class c implements b {
        @Override // r22.b0.b
        public String a(int i14, DateTime dateTime, DateTime dateTime2) {
            switch (i14) {
                case 1:
                    return c22.j0.b(dateTime, "MMM d, yyyy", dateTime.getZone());
                case 2:
                default:
                    return e5.g(c22.j0.b(dateTime, "MMM d, yyyy", dateTime.getZone()), " — ", c22.j0.b(dateTime2, "MMM d, yyyy", dateTime2.getZone()));
                case 3:
                    return c22.j0.b(dateTime, "MMMM yyyy", null);
                case 4:
                case 5:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    return e5.g(c22.j0.b(dateTime, "MMM d, yyyy", dateTime.getZone()), " — ", c22.j0.b(dateTime2, "MMM d, yyyy", dateTime2.getZone()));
                case 6:
                case 7:
                    return e5.g(c22.j0.b(dateTime, "MMMM yyyy", dateTime.getZone()), " — ", c22.j0.b(dateTime2, "MMMM yyyy", dateTime2.getZone()));
            }
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.fragment.app.v vVar, int i14, DateTime dateTime, DateTime dateTime2, b bVar) {
        super(vVar, 1);
        vVar.getClass();
        bVar.getClass();
        this.f149584l = i14;
        this.f149585m = bVar;
        a0 a0Var = new a0(Integer.valueOf(i14), dateTime, dateTime2);
        this.f149586n = a0Var;
        this.f149587o = a0Var.f149549b;
        this.f149588p = a0Var.f149551d;
        this.f149589q = a0Var.f149553f;
        this.f149590r = a0Var.f149550c;
        int i15 = a0Var.f149552e;
        this.f149591t = i15;
        this.f149912i = i15 - 1;
    }

    public final DateTime a(int i14, boolean z14) {
        int months = (Months.monthsBetween(this.f149587o, this.f149590r).getMonths() + 1) % 6;
        DateTime dateTime = this.f149589q;
        if (z14) {
            DateTime dateTimePlusMonths = dateTime.plusMonths((i14 * 5) + i14 + months);
            dateTimePlusMonths.getClass();
            return dateTimePlusMonths;
        }
        DateTime dateTimePlusMonths2 = dateTime.plusMonths(((i14 + 1) * 5) + i14 + months);
        dateTimePlusMonths2.getClass();
        return dateTimePlusMonths2;
    }

    public abstract Fragment b(long j8, long j14);

    public final int c(DateTime dateTime) {
        int i14 = this.f149584l;
        int i15 = this.f149588p;
        DateTime dateTime2 = this.f149589q;
        switch (i14) {
            case 1:
                return Days.daysBetween(dateTime2, dateTime).getDays();
            case 2:
            default:
                return Days.daysBetween(dateTime2.toLocalDate(), dateTime.toLocalDate()).getDays() / i15;
            case 3:
                return Months.monthsBetween(dateTime2, dateTime).getMonths();
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return Days.daysBetween(dateTime2.toLocalDate(), dateTime.toLocalDate()).getDays() / i15;
            case 6:
                return Months.monthsBetween(dateTime2, dateTime).getMonths() / 12;
            case 7:
                return Months.monthsBetween(dateTime2, dateTime).getMonths() / 6;
        }
    }

    @Override // r22.w0, fe.a
    /* JADX INFO: renamed from: getCount, reason: from getter */
    public final int getF44034e() {
        return this.f149591t;
    }

    @Override // androidx.fragment.app.e0
    @o13.e
    public final Fragment getItem(int i14) {
        o13.p<DateTime, DateTime> pVarB = this.f149586n.b(i14);
        return b(pVarB.f128594a.getMillis(), pVarB.f128595b.getMillis());
    }

    @Override // fe.a
    public CharSequence getPageTitle(int i14) {
        DateTime dateTimePlusDays;
        DateTime dateTimePlusDays2;
        int i15 = this.f149588p;
        DateTime dateTime = this.f149589q;
        int i16 = this.f149584l;
        switch (i16) {
            case 1:
                dateTimePlusDays = dateTime.plusDays(i14);
                dateTimePlusDays.getClass();
                dateTimePlusDays2 = dateTimePlusDays;
                break;
            case 2:
            default:
                dateTimePlusDays = dateTime.plusDays(i14 * i15);
                dateTimePlusDays.getClass();
                dateTimePlusDays2 = dateTime.plusDays(((i14 + 1) * i15) - 1);
                dateTimePlusDays2.getClass();
                break;
            case 3:
                dateTimePlusDays = dateTime.plusMonths(i14);
                dateTimePlusDays.getClass();
                dateTimePlusDays2 = dateTimePlusDays;
                break;
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                dateTimePlusDays = dateTime.plusDays(i14 * i15);
                dateTimePlusDays.getClass();
                dateTimePlusDays2 = dateTime.plusDays(((i14 + 1) * i15) - 1);
                dateTimePlusDays2.getClass();
                break;
            case 6:
                dateTimePlusDays = dateTime.plusMonths(i14 * 12);
                dateTimePlusDays.getClass();
                dateTimePlusDays2 = dateTime.plusMonths(((i14 + 1) * 12) - 1);
                dateTimePlusDays2.getClass();
                break;
            case 7:
                dateTimePlusDays = a(i14, true);
                dateTimePlusDays2 = a(i14, false);
                break;
        }
        return this.f149585m.a(i16, dateTimePlusDays, dateTimePlusDays2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006¨\u0006\u0016"}, d2 = {"Lr22/b0$a;", "", "<init>", "()V", "", "DAILY_INTERVAL", "I", "MONTHLY_INTERVAL", "SEVEN_DAYS_INTERVAL", "TWENTY_EIGHT_DAYS_INTERVAL", "TWELVE_MONTHS_INTERVAL", "SIX_MONTH_INTERVAL", "THIRTEEN_WEEKS_INTERVAL", "TWENTY_SIX_WEEKS_INTERVAL", "TWELVE_WEEKS_INTERVAL", "THREE_MONTH_INTERVAL", "TWELVE_MONTH_DAYS_INTERVAL", "FIFTY_TWO_WEEKS_INTERVAL", "ONE_DAY", "SEVEN_DAYS", "TWENTY_EIGHT_DAYS", "TWELVE_MONTHS", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(androidx.fragment.app.v vVar, int i14, DateTime dateTime) {
        this(vVar, i14, dateTime, null, null, 24, null);
        vVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(androidx.fragment.app.v vVar, int i14, DateTime dateTime, DateTime dateTime2) {
        this(vVar, i14, dateTime, dateTime2, null, 16, null);
        vVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(androidx.fragment.app.v vVar, int i14) {
        this(vVar, i14, null, null, null, 28, null);
        vVar.getClass();
    }

    public /* synthetic */ b0(androidx.fragment.app.v vVar, int i14, DateTime dateTime, DateTime dateTime2, b bVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(vVar, i14, (i15 & 4) != 0 ? null : dateTime, (i15 & 8) != 0 ? null : dateTime2, (i15 & 16) != 0 ? new c() : bVar);
    }
}
