package ot;

import am.x0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.creation.MultiDayActivitiesCreationActivity;
import com.garmin.android.apps.connectmobile.onboarding.presentation.DeviceOnboardingActivity;
import com.garmin.android.apps.connectmobile.vo2.reports.presentation.activity.VO2MaxReportsActivity;
import java.util.Date;
import l72.i3;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.koin.android.ext.koin.KoinExtKt;
import org.koin.core.module.Module;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p5.h0;
import p5.k0;
import vn2.q0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f133574b;

    public /* synthetic */ c(int i14, Context context, Object obj) {
        this.f133573a = i14;
        this.f133574b = context;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        DateTime dateTime;
        int i14 = this.f133573a;
        Context context = this.f133574b;
        switch (i14) {
            case 0:
                Number number = (Number) obj;
                String str = d.f133577w;
                number.getClass();
                pt.h hVar = pt.h.f140570a;
                double dDoubleValue = number.doubleValue();
                hVar.getClass();
                return pt.h.d(context, dDoubleValue);
            case 1:
                Number number2 = (Number) obj;
                String str2 = f.f133585v;
                number2.getClass();
                pt.h.f140570a.getClass();
                return pt.h.b(number2, context);
            case 2:
                Number number3 = (Number) obj;
                String str3 = f.f133585v;
                number3.getClass();
                pt.h.f140570a.getClass();
                return pt.h.b(number3, context);
            case 3:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.n(k0Var, context.getString(R.string.lbl_avg_speed_full) + StringUtils.SPACE + context.getString(yq.c.h(true)));
                return Unit.INSTANCE;
            case 4:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                h0.n(k0Var2, context.getString(R.string.lbl_distance) + StringUtils.SPACE + context.getString(yq.c.e(true)));
                return Unit.INSTANCE;
            case 5:
                String str4 = (String) obj;
                int i15 = ps2.x.f140555e;
                str4.getClass();
                SharedPreferences sharedPreferences = context.getSharedPreferences(str4, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            case 6:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                Bundle bundleA = h7.c.a(new o13.p("REGISTERED_INDEX_SCALE_2", bool));
                HelpActivity.a aVar = HelpActivity.f36653a;
                ro0.l lVar = ro0.l.WEIGHT;
                aVar.getClass();
                HelpActivity.a.d(context, lVar, null, bundleA);
                return Unit.INSTANCE;
            case 7:
                qk0.v.b bVar = (qk0.v.b) obj;
                bVar.getClass();
                x0 x0Var = bVar.f145160a;
                boolean z14 = bVar.f145161b;
                String strA = dh.b.A(context, x0Var.f4360c);
                if (!z14) {
                    return strA;
                }
                String string = context.getString(R.string.label_all_activity_name, strA);
                string.getClass();
                return string;
            case 8:
                long jLongValue = ((Long) obj).longValue();
                DeviceOnboardingActivity.f39726b.getClass();
                context.startActivity(DeviceOnboardingActivity.a.a(context, jLongValue));
                return Unit.INSTANCE;
            case 9:
                return KoinExtKt.androidContext$lambda$2(context, (Module) obj);
            case 10:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "MENU_ITEM_CREATE")) {
                    androidx.room.a0.r(context, MultiDayActivitiesCreationActivity.class);
                }
                return Unit.INSTANCE;
            case 11:
                k0 k0Var3 = (k0) obj;
                k0Var3.getClass();
                String string2 = context.getString(R.string.lbl_profile);
                string2.getClass();
                h0.n(k0Var3, string2);
                return Unit.INSTANCE;
            case 12:
                ((n70.g) KoinJavaComponent.get$default(n70.g.class, null, null, 6, null)).A(context, ((Long) obj).longValue());
                return Unit.INSTANCE;
            case 13:
                q91.b bVar2 = (q91.b) obj;
                bVar2.getClass();
                String string3 = context.getString(bVar2.f143548a);
                string3.getClass();
                return string3;
            case 14:
                wt1.q qVar = (wt1.q) obj;
                qVar.getClass();
                String string4 = context.getString(qVar.f187132c);
                string4.getClass();
                return string4;
            case 15:
                wt1.q qVar2 = (wt1.q) obj;
                qVar2.getClass();
                String string5 = context.getString(qVar2.f187131b);
                string5.getClass();
                return string5;
            case 16:
                return q0.V0(context, (rn2.v) obj);
            case 17:
                com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                sd2.f fVar = (sd2.f) ((w61.f) obj).a();
                if (fVar != null) {
                    ((nr1.a) KoinJavaComponent.get$default(nr1.a.class, null, null, 6, null)).a(context, fVar);
                }
                return Unit.INSTANCE;
            case 18:
                i3 i3Var2 = (i3) obj;
                i3Var2.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var2.f111063a, "HELP")) {
                    HelpActivity.a.e(HelpActivity.f36653a, this.f133574b, ro0.l.PROFILE_PRIVACY, null, null, 12);
                }
                return Unit.INSTANCE;
            case 19:
                c42.b bVar3 = new c42.b(p13.w.c((sd2.f) obj));
                context.getClass();
                VO2MaxReportsActivity.f47876b.getClass();
                Intent intent = new Intent(context, (Class<?>) VO2MaxReportsActivity.class);
                intent.putExtra("open_walking_test_extra", true);
                intent.putExtra("vo2_max_extra_data", bVar3);
                context.startActivity(intent);
                return Unit.INSTANCE;
            case 20:
                xw.d dVar = xw.d.f192294a;
                ((String) obj).getClass();
                ((nw.a) KoinJavaComponent.get$default(nw.a.class, null, null, 6, null)).a(context);
                return Unit.INSTANCE;
            case 21:
                xw.d dVar2 = xw.d.f192294a;
                ((String) obj).getClass();
                context.startActivity(new Intent("android.settings.SETTINGS"));
                return Unit.INSTANCE;
            case 22:
                String strA2 = yq0.d.a(context, (tq0.b) obj);
                return strA2 == null ? "" : strA2;
            case 23:
                tq0.k kVar = (tq0.k) obj;
                kVar.getClass();
                new yq0.d();
                context.getClass();
                int i16 = kVar.f166097b;
                int i17 = kVar.f166096a;
                if (i17 < 0) {
                    String string6 = context.getString(R.string.lbl_personal_records_current_record);
                    string6.getClass();
                    return string6;
                }
                if (i17 == 0) {
                    return String.valueOf(i16);
                }
                try {
                    dateTime = new LocalDateTime().withYear(i16).withMonthOfYear(i17).withHourOfDay(0).withMinuteOfHour(0).toDateTime();
                    dateTime.getClass();
                    break;
                } catch (IllegalArgumentException unused) {
                    dateTime = new DateTime();
                }
                Date date = dateTime.toDate();
                date.getClass();
                return j0.g(date, "LLLL yyyy", null);
            case 24:
                ((Context) obj).getClass();
                return new xr.k(this.f133574b, null, 0, 6, null);
            case 25:
                ((Context) obj).getClass();
                return new zw1.g(this.f133574b, null, 0, 6, null);
            default:
                ((Context) obj).getClass();
                return new xr.p(context);
        }
    }

    public /* synthetic */ c(Context context, int i14) {
        this.f133573a = i14;
        this.f133574b = context;
    }

    public /* synthetic */ c(Context context, yq.c cVar, int i14) {
        this.f133573a = i14;
        this.f133574b = context;
    }
}
