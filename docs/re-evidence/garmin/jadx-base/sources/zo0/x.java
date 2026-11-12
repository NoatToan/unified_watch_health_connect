package zo0;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r22.m0;
import r22.u0;
import r22.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzo0/x;", "Lzo0/p;", "Lzo0/q;", "navigator", "<init>", "(Lzo0/q;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x implements p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f206203c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f206204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0 f206205b;

    static {
        new a(null);
    }

    public x(q qVar) {
        qVar.getClass();
        this.f206204a = qVar;
    }

    @Override // zo0.p
    public final v0 b(n nVar) {
        if (!(nVar instanceof n.j)) {
            return null;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "OnboardingWeatherDialogHandler", "showWeatherLocationInfoDialog:");
        final int i14 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: zo0.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f206202b;

            {
                this.f206202b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                u0 u0Var;
                int i15 = i14;
                x xVar = this.f206202b;
                switch (i15) {
                    case 0:
                        int i16 = x.f206203c;
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.b(a2Var2, "OnboardingWeatherDialogHandler", "showWeatherLocationInfoDialog: positive button clicked, starting WeatherLocationSelectionActivity");
                        xVar.f206204a.d4();
                        break;
                    default:
                        int i17 = x.f206203c;
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.b(a2Var3, "OnboardingWeatherDialogHandler", "showWeatherLocationInfoDialog: negative button clicked, showing next dialog");
                        m0 m0Var = xVar.f206205b;
                        q qVar = xVar.f206204a;
                        if (m0Var != null && (u0Var = m0Var.f149762c) != null) {
                            u0Var.b(m0.a.c(m0.f149759e, qVar.u5().getString(R.string.weather_location_info_prompt_title), qVar.u5().getString(R.string.weather_location_info_prompt_message), R.string.sleep_advanced_sleep_got_it_button, new do1.l(5), 0, null, PsExtractor.VIDEO_STREAM_MASK));
                            break;
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: zo0.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f206202b;

            {
                this.f206202b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                u0 u0Var;
                int i16 = i15;
                x xVar = this.f206202b;
                switch (i16) {
                    case 0:
                        int i17 = x.f206203c;
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.b(a2Var2, "OnboardingWeatherDialogHandler", "showWeatherLocationInfoDialog: positive button clicked, starting WeatherLocationSelectionActivity");
                        xVar.f206204a.d4();
                        break;
                    default:
                        int i18 = x.f206203c;
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.b(a2Var3, "OnboardingWeatherDialogHandler", "showWeatherLocationInfoDialog: negative button clicked, showing next dialog");
                        m0 m0Var = xVar.f206205b;
                        q qVar = xVar.f206204a;
                        if (m0Var != null && (u0Var = m0Var.f149762c) != null) {
                            u0Var.b(m0.a.c(m0.f149759e, qVar.u5().getString(R.string.weather_location_info_prompt_title), qVar.u5().getString(R.string.weather_location_info_prompt_message), R.string.sleep_advanced_sleep_got_it_button, new do1.l(5), 0, null, PsExtractor.VIDEO_STREAM_MASK));
                            break;
                        }
                        break;
                }
            }
        };
        m0.a aVar2 = m0.f149759e;
        q qVar = this.f206204a;
        m0 m0VarC = m0.a.c(aVar2, qVar.u5().getString(R.string.weather_location_prompt_title), qVar.u5().getString(R.string.weather_location_prompt_message), R.string.weather_location_prompt_manage_button, onClickListener, R.string.feedback_no_thanks_btn, onClickListener2, 192);
        this.f206205b = m0VarC;
        return m0VarC;
    }

    @Override // zo0.p
    public final Object c(t13.d<? super n> dVar) {
        ArrayList arrayList;
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListD = rd2.j.d();
        if (arrayListD != null) {
            arrayList = new ArrayList();
            for (Object obj : arrayListD) {
                String productNumber = ((sd2.f) obj).getProductNumber();
                productNumber.getClass();
                if (!h0.R(p13.x.k(zb0.u0.O4, zb0.u0.Z4, zb0.u0.W4), zb0.u0.f203782n6.get(productNumber))) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "OnboardingWeatherDialogHandler", "requestDialogData: no supported devices found, not showing weather location info dialog");
            return null;
        }
        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.a aVar2 = com.garmin.android.apps.connectmobile.weather.defaultlocation.b.f47923j;
        Context context = this.f206204a.getContext();
        aVar2.getClass();
        context.getClass();
        j22.b.f96736a.getClass();
        j22.f fVarJ = j22.b.j(context);
        du2.g.f61293g.getClass();
        boolean z14 = du2.g.a.b(context).getBoolean("key_user_has_seen_info_dialog", false);
        boolean z15 = fVarJ == j22.f.ALLOWED_ALL_TIME;
        boolean zF = km2.a.f(SupportedCapability.WEATHER_CONDITIONS.ordinal());
        Logger logger = com.garmin.android.apps.connectmobile.weather.defaultlocation.b.f47924k;
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("shouldShowInfoDialog: has seen dialog = ", ", location permission allowed all time = ", ", has weather capable device = ", z14, z15);
        sbM.append(zF);
        logger.debug(sbM.toString());
        if (!zF || z14 || z15) {
            return null;
        }
        return n.j.f206181a;
    }

    @Override // zo0.p
    public final Unit d(n nVar) {
        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.a aVar = com.garmin.android.apps.connectmobile.weather.defaultlocation.b.f47923j;
        Context context = this.f206204a.getContext();
        aVar.getClass();
        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.a.a(context, true);
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzo0/x$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
