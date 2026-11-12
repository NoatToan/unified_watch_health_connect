package kd0;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.annual_report.player.AnnualReportPlayerActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/g;", "Lmt/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements mt.a {
    public static String g() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.h("ar_sharing_scope");
    }

    @Override // mt.a
    public final String a() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        String strH = gh2.i.f77458c.a().f77477b.h("annual_report_remote_resource_uuid");
        strH.getClass();
        return strH;
    }

    @Override // mt.a
    public final void b(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        float f14 = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        float f15 = Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale", 1.0f);
        float f16 = Settings.Global.getFloat(context.getContentResolver(), "window_animation_scale", 1.0f);
        if (f14 == 0.0f || f15 == 0.0f || f16 == 0.0f) {
            new androidx.appcompat.app.e.a(context).setTitle(R.string.annual_report_animation_reduce_detected_title).setMessage(R.string.annual_report_animation_reduce_detected_description).setPositiveButton(R.string.lbl_ok, new hg1.g(14, context, intent)).show();
        } else {
            context.startActivity(intent);
        }
    }

    @Override // mt.a
    public final boolean c() {
        String strG = g();
        if (strG != null ? strG.equalsIgnoreCase("allUsers") : false) {
            return true;
        }
        String strG2 = g();
        if (strG2 != null ? strG2.equalsIgnoreCase("diTester") : false) {
            c22.s3.f23252a.getClass();
            if (c22.s3.a("ROLE_DI_TESTER")) {
                return true;
            }
        }
        String strG3 = g();
        if (strG3 != null ? strG3.equalsIgnoreCase("associateTester") : false) {
            c22.s3.f23252a.getClass();
            if (c22.s3.a("ROLE_TESTER_ASSOCIATE")) {
                return true;
            }
        }
        kg1.a.f104701a.getClass();
        return kg1.a.C2003a.a().B();
    }

    @Override // mt.a
    public final void d() {
        ((xt.a) KoinJavaComponent.get$default(xt.a.class, null, null, 6, null)).f192134c.i();
    }

    @Override // mt.a
    public final Intent e(Context context) {
        context.getClass();
        AnnualReportPlayerActivity.f30170b.getClass();
        return new Intent(context, (Class<?>) AnnualReportPlayerActivity.class);
    }

    @Override // mt.a
    public final void f(Context context) {
        context.getClass();
        Intent intentE = e(context);
        com.garmin.android.apps.connectmobile.l.g().getClass();
        if (Boolean.valueOf(gh2.i.f77458c.a().f77477b.c("ar_sharing_alert_required")).equals(Boolean.TRUE)) {
            new androidx.appcompat.app.e.a(context).setMessage(R.string.annual_report_entrance_testing_hint_message).setPositiveButton(R.string.lbl_ok, new bi2.k(this, 21, context, intentE)).setNegativeButton(R.string.lbl_cancel, new jm0.c(5)).show();
        } else {
            b(context, intentE);
        }
    }
}
