package of0;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.view.View;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.IntroFragment;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import lc.h0;
import lc.u0;
import lc.y;
import o53.f0;
import p005kotlin.Metadata;
import r22.o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Lof0/n;", "Le32/e;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends e32.e<g3<? extends Boolean>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IntroFragment f131692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Location f131693b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131694a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f131694a = iArr;
        }
    }

    public n(IntroFragment introFragment, Location location) {
        this.f131692a = introFragment;
        this.f131693b = location;
    }

    @Override // e32.e
    public final void a(g3<? extends Boolean> g3Var) {
        g3<? extends Boolean> g3Var2 = g3Var;
        int i14 = a.f131694a[g3Var2.f35300a.ordinal()];
        final IntroFragment introFragment = this.f131692a;
        final int i15 = 1;
        if (i14 == 1) {
            int i16 = IntroFragment.f34814j;
            introFragment.F6();
            return;
        }
        if (i14 == 2) {
            int i17 = IntroFragment.f34814j;
            introFragment.hideProgressOverlay();
            if (g3Var2.f35303d instanceof NoNetworkException) {
                a2 a2Var = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "IntroFragment", "[checkEnabledAtCurrentLocation] no internet");
                nf0.b.a(introFragment, new oe.j(this, introFragment, this.f131693b), new n82.i(this, introFragment));
                return;
            }
            a2 a2Var2 = a2.ONBOARDING;
            String strN = fb1.c.n("[checkEnabledAtCurrentLocation] error: ", g3Var2.f35302c);
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "IntroFragment", strN);
            g22.e.a(introFragment, new fw.r());
            return;
        }
        if (i14 != 3) {
            u0.r();
            return;
        }
        int i18 = IntroFragment.f34814j;
        introFragment.hideProgressOverlay();
        if (p005kotlin.jvm.internal.s.g(g3Var2.f35301b, Boolean.TRUE)) {
            a2 a2Var3 = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "IntroFragment", "[checkEnabledAtCurrentLocation] ECG available at location");
            NavHostFragment.f10124e.getClass();
            y yVarA = NavHostFragment.a.a(introFragment);
            h0 h0VarJ = yVarA.f111904b.j();
            if (h0VarJ == null || h0VarJ.f111773b.f144346e != R.id.introFragment) {
                return;
            }
            yVarA.g(R.id.action_birth_date_validation, null);
            return;
        }
        a2 a2Var4 = a2.ONBOARDING;
        i2.f36769a.getClass();
        i2.a.b(a2Var4, "IntroFragment", "[checkEnabledAtCurrentLocation] ECG not available at location");
        o0.a aVar = o0.f149771c;
        String string = introFragment.getString(R.string.lbl_cannot_complete_ecg_app_setup);
        String string2 = introFragment.getString(R.string.msg_ecg_location_restriction);
        final int i19 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: of0.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i24 = i19;
                IntroFragment introFragment2 = introFragment;
                switch (i24) {
                    case 0:
                        int i25 = IntroFragment.f34814j;
                        a2 a2Var5 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var5, "IntroFragment", "[showCannotCompleteDialog] exit onboarding -> location not available: learn more");
                        introFragment2.getClass();
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("https://garmin.com/ecgappifu"));
                        introFragment2.startActivity(intent);
                        introFragment2.z6().K4();
                        break;
                    default:
                        int i26 = IntroFragment.f34814j;
                        a2 a2Var6 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var6, "IntroFragment", "[showCannotCompleteDialog] exit onboarding -> location not available");
                        introFragment2.z6().K4();
                        break;
                }
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: of0.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i24 = i15;
                IntroFragment introFragment2 = introFragment;
                switch (i24) {
                    case 0:
                        int i25 = IntroFragment.f34814j;
                        a2 a2Var5 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var5, "IntroFragment", "[showCannotCompleteDialog] exit onboarding -> location not available: learn more");
                        introFragment2.getClass();
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("https://garmin.com/ecgappifu"));
                        introFragment2.startActivity(intent);
                        introFragment2.z6().K4();
                        break;
                    default:
                        int i26 = IntroFragment.f34814j;
                        a2 a2Var6 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var6, "IntroFragment", "[showCannotCompleteDialog] exit onboarding -> location not available");
                        introFragment2.z6().K4();
                        break;
                }
            }
        };
        aVar.getClass();
        f0.w(introFragment).b(new o(o0.a.a(string, string2, R.string.common_learn_more, onClickListener, R.string.lbl_exit_setup_capitalized, onClickListener2), introFragment, null));
    }
}
