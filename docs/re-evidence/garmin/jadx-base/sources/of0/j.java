package of0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.FirstTimeUseFragment;
import com.garmin.android.apps.connectmobile.g3;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Lof0/j;", "Le32/e;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends e32.e<g3<? extends Unit>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirstTimeUseFragment f131685a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131686a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f131686a = iArr;
        }
    }

    public j(FirstTimeUseFragment firstTimeUseFragment) {
        this.f131685a = firstTimeUseFragment;
    }

    @Override // e32.e
    public final void a(g3<? extends Unit> g3Var) {
        g3<? extends Unit> g3Var2 = g3Var;
        int i14 = a.f131686a[g3Var2.f35300a.ordinal()];
        FirstTimeUseFragment firstTimeUseFragment = this.f131685a;
        if (i14 == 1) {
            int i15 = FirstTimeUseFragment.f34793m;
            firstTimeUseFragment.getClass();
            firstTimeUseFragment.I6(new f(firstTimeUseFragment, o0.a.b(o0.f149771c, firstTimeUseFragment.getString(R.string.lbl_ecg_app_enabled), firstTimeUseFragment.getString(R.string.msg_ecg_app_enabled_updated), R.string.lbl_ok, new e(firstTimeUseFragment, 13), 0, null, 48), 2));
        } else if (i14 != 2) {
            if (i14 == 3) {
                return;
            }
            u0.r();
        } else if (g3Var2.f35303d instanceof IllegalStateException) {
            int i16 = FirstTimeUseFragment.f34793m;
            firstTimeUseFragment.getClass();
            firstTimeUseFragment.I6(new h(firstTimeUseFragment, 2));
        } else {
            int i17 = FirstTimeUseFragment.f34793m;
            firstTimeUseFragment.getClass();
            firstTimeUseFragment.I6(new h(firstTimeUseFragment, 3));
        }
    }
}
