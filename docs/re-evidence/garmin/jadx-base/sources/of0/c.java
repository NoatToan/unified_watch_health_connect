package of0;

import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.BirthDateFragment;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import lc.h0;
import lc.u0;
import lc.y;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BirthDateFragment f131670b;

    public /* synthetic */ c(BirthDateFragment birthDateFragment, int i14) {
        this.f131669a = i14;
        this.f131670b = birthDateFragment;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f131669a;
        final BirthDateFragment birthDateFragment = this.f131670b;
        final int i15 = 3;
        final int i16 = 2;
        final int i17 = 1;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                int i18 = BirthDateFragment.f34780k;
                int i19 = BirthDateFragment.c.f34784a[g3Var.f35300a.ordinal()];
                if (i19 == 1) {
                    birthDateFragment.F6();
                } else if (i19 == 2) {
                    birthDateFragment.hideProgressOverlay();
                    if (g3Var.f35303d instanceof NoNetworkException) {
                        a2 a2Var = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var, "BirthDateFragment", "[checkMultiFactorAuthentication] no internet");
                        nf0.b.a(birthDateFragment, new e23.a() { // from class: of0.a
                            @Override // e23.a
                            public final Object invoke() {
                                int i24 = i17;
                                BirthDateFragment birthDateFragment2 = birthDateFragment;
                                switch (i24) {
                                    case 0:
                                        int i25 = BirthDateFragment.f34780k;
                                        a2 a2Var2 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var2, "BirthDateFragment", "[createGHSAccount] exit onboarding");
                                        birthDateFragment2.z6().K4();
                                        break;
                                    case 1:
                                        int i26 = BirthDateFragment.f34780k;
                                        a2 a2Var3 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var3, "BirthDateFragment", "[checkMultiFactorAuthentication] retry");
                                        birthDateFragment2.G6();
                                        break;
                                    case 2:
                                        int i27 = BirthDateFragment.f34780k;
                                        a2 a2Var4 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var4, "BirthDateFragment", "[checkMultiFactorAuthentication] exit onboarding");
                                        birthDateFragment2.z6().K4();
                                        break;
                                    default:
                                        int i28 = BirthDateFragment.f34780k;
                                        a2 a2Var5 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var5, "BirthDateFragment", "[createGHSAccount] retry");
                                        birthDateFragment2.H6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new e23.a() { // from class: of0.a
                            @Override // e23.a
                            public final Object invoke() {
                                int i24 = i16;
                                BirthDateFragment birthDateFragment2 = birthDateFragment;
                                switch (i24) {
                                    case 0:
                                        int i25 = BirthDateFragment.f34780k;
                                        a2 a2Var2 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var2, "BirthDateFragment", "[createGHSAccount] exit onboarding");
                                        birthDateFragment2.z6().K4();
                                        break;
                                    case 1:
                                        int i26 = BirthDateFragment.f34780k;
                                        a2 a2Var3 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var3, "BirthDateFragment", "[checkMultiFactorAuthentication] retry");
                                        birthDateFragment2.G6();
                                        break;
                                    case 2:
                                        int i27 = BirthDateFragment.f34780k;
                                        a2 a2Var4 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var4, "BirthDateFragment", "[checkMultiFactorAuthentication] exit onboarding");
                                        birthDateFragment2.z6().K4();
                                        break;
                                    default:
                                        int i28 = BirthDateFragment.f34780k;
                                        a2 a2Var5 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var5, "BirthDateFragment", "[createGHSAccount] retry");
                                        birthDateFragment2.H6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    } else {
                        a2 a2Var2 = a2.ONBOARDING;
                        String strN = fb1.c.n("[checkMultiFactorAuthentication] error: ", g3Var.f35302c);
                        i2.f36769a.getClass();
                        i2.a.f(a2Var2, "BirthDateFragment", strN);
                        g22.e.a(birthDateFragment, new fw.r());
                    }
                } else {
                    if (i19 != 3) {
                        u0.r();
                        return null;
                    }
                    birthDateFragment.hideProgressOverlay();
                    if (p005kotlin.jvm.internal.s.g(g3Var.f35301b, Boolean.TRUE)) {
                        a2 a2Var3 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var3, "BirthDateFragment", "[checkMultiFactorAuthentication] valid MFA");
                        birthDateFragment.H6();
                    } else {
                        a2 a2Var4 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var4, "BirthDateFragment", "[checkMultiFactorAuthentication] no or invalid MFA");
                        NavHostFragment.f10124e.getClass();
                        y yVarA = NavHostFragment.a.a(birthDateFragment);
                        h0 h0VarJ = yVarA.f111904b.j();
                        if (h0VarJ != null && h0VarJ.f111773b.f144346e == R.id.birthDateFragment) {
                            yVarA.g(R.id.action_two_step_verification, null);
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                int i24 = BirthDateFragment.f34780k;
                int i25 = BirthDateFragment.c.f34784a[g3Var.f35300a.ordinal()];
                if (i25 == 1) {
                    birthDateFragment.F6();
                } else if (i25 == 2) {
                    birthDateFragment.hideProgressOverlay();
                    if (g3Var.f35303d instanceof NoNetworkException) {
                        a2 a2Var5 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var5, "BirthDateFragment", "[createGHSAccount] no internet");
                        final int i26 = 0;
                        nf0.b.a(birthDateFragment, new e23.a() { // from class: of0.a
                            @Override // e23.a
                            public final Object invoke() {
                                int i27 = i15;
                                BirthDateFragment birthDateFragment2 = birthDateFragment;
                                switch (i27) {
                                    case 0:
                                        int i28 = BirthDateFragment.f34780k;
                                        a2 a2Var6 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var6, "BirthDateFragment", "[createGHSAccount] exit onboarding");
                                        birthDateFragment2.z6().K4();
                                        break;
                                    case 1:
                                        int i29 = BirthDateFragment.f34780k;
                                        a2 a2Var7 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var7, "BirthDateFragment", "[checkMultiFactorAuthentication] retry");
                                        birthDateFragment2.G6();
                                        break;
                                    case 2:
                                        int i210 = BirthDateFragment.f34780k;
                                        a2 a2Var8 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var8, "BirthDateFragment", "[checkMultiFactorAuthentication] exit onboarding");
                                        birthDateFragment2.z6().K4();
                                        break;
                                    default:
                                        int i211 = BirthDateFragment.f34780k;
                                        a2 a2Var9 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var9, "BirthDateFragment", "[createGHSAccount] retry");
                                        birthDateFragment2.H6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new e23.a() { // from class: of0.a
                            @Override // e23.a
                            public final Object invoke() {
                                int i27 = i26;
                                BirthDateFragment birthDateFragment2 = birthDateFragment;
                                switch (i27) {
                                    case 0:
                                        int i28 = BirthDateFragment.f34780k;
                                        a2 a2Var6 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var6, "BirthDateFragment", "[createGHSAccount] exit onboarding");
                                        birthDateFragment2.z6().K4();
                                        break;
                                    case 1:
                                        int i29 = BirthDateFragment.f34780k;
                                        a2 a2Var7 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var7, "BirthDateFragment", "[checkMultiFactorAuthentication] retry");
                                        birthDateFragment2.G6();
                                        break;
                                    case 2:
                                        int i210 = BirthDateFragment.f34780k;
                                        a2 a2Var8 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var8, "BirthDateFragment", "[checkMultiFactorAuthentication] exit onboarding");
                                        birthDateFragment2.z6().K4();
                                        break;
                                    default:
                                        int i211 = BirthDateFragment.f34780k;
                                        a2 a2Var9 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var9, "BirthDateFragment", "[createGHSAccount] retry");
                                        birthDateFragment2.H6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    } else {
                        a2 a2Var6 = a2.ONBOARDING;
                        String strN2 = fb1.c.n("[createGHSAccount] error: ", g3Var.f35302c);
                        i2.f36769a.getClass();
                        i2.a.f(a2Var6, "BirthDateFragment", strN2);
                        g22.e.a(birthDateFragment, new fw.r());
                    }
                } else {
                    if (i25 != 3) {
                        u0.r();
                        return null;
                    }
                    birthDateFragment.hideProgressOverlay();
                    if (p005kotlin.jvm.internal.s.g(g3Var.f35301b, Boolean.TRUE)) {
                        a2 a2Var7 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var7, "BirthDateFragment", "[createGHSAccount] GHS account created");
                        NavHostFragment.f10124e.getClass();
                        y yVarA2 = NavHostFragment.a.a(birthDateFragment);
                        h0 h0VarJ2 = yVarA2.f111904b.j();
                        if (h0VarJ2 != null && h0VarJ2.f111773b.f144346e == R.id.birthDateFragment) {
                            yVarA2.g(R.id.action_education, null);
                        }
                    } else {
                        a2 a2Var8 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var8, "BirthDateFragment", "[createGHSAccount] GHS account couldn't be created");
                        g22.e.a(birthDateFragment, new fw.r());
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
