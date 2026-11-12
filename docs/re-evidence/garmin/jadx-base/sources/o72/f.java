package o72;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.steps.presentation.StepsActivity;
import java.util.Locale;
import java.util.Map;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f130375b;

    public /* synthetic */ f(nq1.k kVar, Context context) {
        this.f130374a = 27;
        this.f130375b = context;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f130374a;
        Context context = this.f130375b;
        switch (i14) {
            case 0:
                Toast.makeText(context, "Close clicked", 0).show();
                return Unit.INSTANCE;
            case 1:
                Toast.makeText(context, "Action clicked", 0).show();
                return Unit.INSTANCE;
            case 2:
                Toast.makeText(context, "Left range button clicked", 0).show();
                return Unit.INSTANCE;
            case 3:
                Toast.makeText(context, "Right range button clicked", 0).show();
                return Unit.INSTANCE;
            case 4:
                Toast.makeText(context, "Edit clicked", 0).show();
                return Unit.INSTANCE;
            case 5:
                Toast.makeText(context, "Add clicked", 0).show();
                return Unit.INSTANCE;
            case 6:
                r1.c(context, "Help");
                return Unit.INSTANCE;
            case 7:
                r1.c(context, "Help");
                return Unit.INSTANCE;
            case 8:
                r1.c(context, "Open the chart");
                return Unit.INSTANCE;
            case 9:
                d3.b(context, "Learn more clicked");
                return Unit.INSTANCE;
            case 10:
                d3.b(context, "Close clicked");
                return Unit.INSTANCE;
            case 11:
                d3.b(context, "Close clicked");
                return Unit.INSTANCE;
            case 12:
                d3.b(context, "Learn more clicked");
                return Unit.INSTANCE;
            case 13:
                d3.b(context, "Close clicked");
                return Unit.INSTANCE;
            case 14:
                d3.b(context, "Learn more clicked");
                return Unit.INSTANCE;
            case 15:
                d3.b(context, "Close clicked");
                return Unit.INSTANCE;
            case 16:
                d3.b(context, "Learn more clicked");
                return Unit.INSTANCE;
            case 17:
                d3.b(context, "Close clicked");
                return Unit.INSTANCE;
            case 18:
                d3.b(context, "Learn more clicked");
                return Unit.INSTANCE;
            case 19:
                u3.b(context, "Back Pressed");
                return Unit.INSTANCE;
            case 20:
                u3.b(context, "Custom Navigation Clicked");
                return Unit.INSTANCE;
            case 21:
                u3.b(context, "Open the drawer");
                return Unit.INSTANCE;
            case 22:
                String str = ot.d.f133577w;
                return context.getString(R.string.annual_report_activity_ascent_elevation_chart_title);
            case 23:
                String str2 = ot.f.f133585v;
                return context.getString(R.string.annual_report_activity_distance_map_view_title);
            case 24:
                HelpActivity.a.e(HelpActivity.f36653a, this.f130375b, ro0.l.COURSE_PLANNING, null, null, 12);
                return Unit.INSTANCE;
            case 25:
                HelpActivity.a.e(HelpActivity.f36653a, this.f130375b, ro0.l.COURSE_PLANNING, null, null, 12);
                return Unit.INSTANCE;
            case 26:
                int i15 = pu.f.f141063c;
                return context.getSharedPreferences("gcm_auth_remote_config_prefs", 0);
            case 27:
                ht.s sVar = ht.s.f85508a;
                lt.e.g gVar = new lt.e.g(lt.e.a.Tapped, o70.o.STEPS);
                sVar.getClass();
                ht.s.a(gVar);
                f12.l.f68084a.getClass();
                if (f12.l.a.a().B3()) {
                    context.startActivity(((mq1.a) KoinJavaComponent.get$default(mq1.a.class, null, null, 6, null)).b(DateTime.now(), false));
                } else {
                    context.startActivity(dh.b.z(StepsActivity.class, context, DateTime.now(), false));
                }
                return Unit.INSTANCE;
            case 28:
                ht.s sVar2 = ht.s.f85508a;
                kt.a.c cVar = new kt.a.c(kt.a.EnumC2056a.Tapped);
                sVar2.getClass();
                ht.s.a(cVar);
                Locale locale = Locale.getDefault();
                String strI = GCMSettingManager.k().i();
                Map<zb0.u0, vg1.t> map = zb0.n0.f203577a;
                Uri uri = Uri.parse(strI + "/" + c22.s1.b(locale) + context.getString(R.string.garmin_connect_html_faq_path));
                uri.getClass();
                g22.a.d(context, uri);
                return Unit.INSTANCE;
            default:
                ht.s sVar3 = ht.s.f85508a;
                kt.a.e eVar = new kt.a.e(kt.a.EnumC2056a.Tapped, kt.a.f.WEAR_AND_CARE_TIPS);
                sVar3.getClass();
                ht.s.a(eVar);
                Locale locale2 = Locale.getDefault();
                String strK = GCMSettingManager.k().k();
                Map<zb0.u0, vg1.t> map2 = zb0.n0.f203577a;
                Uri uri2 = Uri.parse(strK + "/" + c22.s1.b(locale2) + context.getString(R.string.garmin_connect_wear_and_care_path));
                uri2.getClass();
                g22.a.d(context, uri2);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(Context context, int i14) {
        this.f130374a = i14;
        this.f130375b = context;
    }
}
