package q42;

import android.content.Context;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f142604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3 f142605c;

    public /* synthetic */ c(Context context, x3 x3Var, int i14) {
        this.f142603a = i14;
        this.f142604b = context;
        this.f142605c = x3Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String string;
        int i14 = this.f142603a;
        x3 x3Var = this.f142605c;
        Context context = this.f142604b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    l3.a aVar = l3.f23124b;
                    zk0.e eVar = (zk0.e) x3Var.getF182175a();
                    double goalValue = eVar != null ? eVar.getGoalValue() : 0.0d;
                    aVar.getClass();
                    String strA = k42.b.a(context, k42.b.j(context, k42.b.c(l3.a.P1(goalValue)), false, l3.f23130h));
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strA, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar), mVar, 0, 0, 131070);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    double dC = k42.b.c(((Number) x3Var.getF182175a()).doubleValue());
                    l3.f23124b.getClass();
                    String strA2 = k42.b.a(context, k42.b.j(context, dC, false, l3.f23130h));
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strA2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar2), mVar2, 0, 0, 131070);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    j0 j0Var = j0.f23099a;
                    DateTime dateTimeAtStartOfDay = ((LocalDate) x3Var.getF182175a()).toDateTimeAtStartOfDay(DateTimeZone.UTC);
                    dateTimeAtStartOfDay.getClass();
                    j0Var.getClass();
                    context.getClass();
                    DateTime dateTime = new DateTime();
                    if (g22.k.f(dateTime, dateTimeAtStartOfDay)) {
                        string = context.getString(R.string.challenge_leaderboard_header_today_label);
                        string.getClass();
                    } else if (g22.k.d(dateTime, dateTimeAtStartOfDay)) {
                        string = context.getString(R.string.common_tomorrow);
                        string.getClass();
                    } else if (g22.k.f(dateTime.minusDays(1), dateTimeAtStartOfDay)) {
                        string = context.getString(R.string.social_elapsed_time_yesterday);
                        string.getClass();
                    } else if (Math.abs(Days.daysBetween(dateTime, dateTimeAtStartOfDay).getDays()) < 7) {
                        string = dateTimeAtStartOfDay.toString("EEEE");
                        string.getClass();
                    } else {
                        string = dateTimeAtStartOfDay.toString("MMMM d");
                        string.getClass();
                    }
                    String str = string;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar3), mVar3, 0, 0, 131070);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
