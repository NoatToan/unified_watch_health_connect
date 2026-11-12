package pf0;

import androidx.compose.ui.platform.ComposeView;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgCompleteSetupFragment;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EcgCompleteSetupFragment f137483b;

    public /* synthetic */ h(EcgCompleteSetupFragment ecgCompleteSetupFragment, int i14) {
        this.f137482a = i14;
        this.f137483b = ecgCompleteSetupFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f137482a;
        final EcgCompleteSetupFragment ecgCompleteSetupFragment = this.f137483b;
        final int i15 = 3;
        final int i16 = 2;
        final int i17 = 1;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                int i18 = EcgCompleteSetupFragment.f34851d;
                int i19 = EcgCompleteSetupFragment.b.f34855a[g3Var.f35300a.ordinal()];
                if (i19 == 1) {
                    g22.e.l(ecgCompleteSetupFragment);
                } else if (i19 == 2) {
                    g22.e.f(ecgCompleteSetupFragment);
                    if (g3Var.f35303d instanceof NoNetworkException) {
                        a2 a2Var = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var, "EcgCompleteSetupFragment", "[createGHSAccount] no internet");
                        final int i24 = 4;
                        final int i25 = 5;
                        nf0.b.a(ecgCompleteSetupFragment, new e23.a() { // from class: pf0.g
                            @Override // e23.a
                            public final Object invoke() {
                                int i26 = i24;
                                EcgCompleteSetupFragment ecgCompleteSetupFragment2 = ecgCompleteSetupFragment;
                                switch (i26) {
                                    case 0:
                                        int i27 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                    case 1:
                                        int i28 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                    case 2:
                                        int i29 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    case 3:
                                        int i30 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                    case 4:
                                        int i34 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var2 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var2, "EcgCompleteSetupFragment", "[createGHSAccount] retry");
                                        ecgCompleteSetupFragment2.w6();
                                        break;
                                    case 5:
                                        int i35 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var3 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var3, "EcgCompleteSetupFragment", "[createGHSAccount] exit onboarding");
                                        ecgCompleteSetupFragment2.requireActivity().finish();
                                        break;
                                    case 6:
                                        int i36 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var4 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var4, "EcgCompleteSetupFragment", "[checkSetupComplete] retry");
                                        ecgCompleteSetupFragment2.v6();
                                        break;
                                    case 7:
                                        int i37 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var5 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var5, "EcgCompleteSetupFragment", "[checkSetupComplete] exit onboarding");
                                        ecgCompleteSetupFragment2.requireActivity().finish();
                                        break;
                                    case 8:
                                        int i38 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var6 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var6, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] retry");
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    case 9:
                                        int i39 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var7 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var7, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] exit onboarding");
                                        ecgCompleteSetupFragment2.requireActivity().finish();
                                        break;
                                    case 10:
                                        int i44 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    case 11:
                                        int i45 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    default:
                                        int i46 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new e23.a() { // from class: pf0.g
                            @Override // e23.a
                            public final Object invoke() {
                                int i26 = i25;
                                EcgCompleteSetupFragment ecgCompleteSetupFragment2 = ecgCompleteSetupFragment;
                                switch (i26) {
                                    case 0:
                                        int i27 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                    case 1:
                                        int i28 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                    case 2:
                                        int i29 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    case 3:
                                        int i30 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                    case 4:
                                        int i34 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var2 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var2, "EcgCompleteSetupFragment", "[createGHSAccount] retry");
                                        ecgCompleteSetupFragment2.w6();
                                        break;
                                    case 5:
                                        int i35 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var3 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var3, "EcgCompleteSetupFragment", "[createGHSAccount] exit onboarding");
                                        ecgCompleteSetupFragment2.requireActivity().finish();
                                        break;
                                    case 6:
                                        int i36 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var4 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var4, "EcgCompleteSetupFragment", "[checkSetupComplete] retry");
                                        ecgCompleteSetupFragment2.v6();
                                        break;
                                    case 7:
                                        int i37 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var5 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var5, "EcgCompleteSetupFragment", "[checkSetupComplete] exit onboarding");
                                        ecgCompleteSetupFragment2.requireActivity().finish();
                                        break;
                                    case 8:
                                        int i38 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var6 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var6, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] retry");
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    case 9:
                                        int i39 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var7 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var7, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] exit onboarding");
                                        ecgCompleteSetupFragment2.requireActivity().finish();
                                        break;
                                    case 10:
                                        int i44 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    case 11:
                                        int i45 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    default:
                                        int i46 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    } else {
                        a2 a2Var2 = a2.ONBOARDING;
                        String strN = fb1.c.n("[createGHSAccount] error: ", g3Var.f35302c);
                        i2.f36769a.getClass();
                        i2.a.f(a2Var2, "EcgCompleteSetupFragment", strN);
                        g22.e.a(ecgCompleteSetupFragment, new fw.r());
                    }
                } else {
                    if (i19 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(ecgCompleteSetupFragment);
                    NavHostFragment.f10124e.getClass();
                    NavHostFragment.a.a(ecgCompleteSetupFragment).g(R.id.action_ecg_activities_list, null);
                }
                return Unit.INSTANCE;
            case 1:
                int i26 = EcgCompleteSetupFragment.f34851d;
                int i27 = EcgCompleteSetupFragment.b.f34855a[g3Var.f35300a.ordinal()];
                if (i27 == 1) {
                    g22.e.l(ecgCompleteSetupFragment);
                } else if (i27 == 2) {
                    g22.e.f(ecgCompleteSetupFragment);
                    if (g3Var.f35303d instanceof NoNetworkException) {
                        a2 a2Var3 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var3, "EcgCompleteSetupFragment", "[checkSetupComplete] no internet");
                        final int i28 = 6;
                        final int i29 = 7;
                        nf0.b.a(ecgCompleteSetupFragment, new e23.a() { // from class: pf0.g
                            @Override // e23.a
                            public final Object invoke() {
                                int i210 = i28;
                                EcgCompleteSetupFragment ecgCompleteSetupFragment2 = ecgCompleteSetupFragment;
                                switch (i210) {
                                    case 0:
                                        int i211 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                    case 1:
                                        int i212 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                    case 2:
                                        int i213 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    case 3:
                                        int i30 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                    case 4:
                                        int i34 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var4 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var4, "EcgCompleteSetupFragment", "[createGHSAccount] retry");
                                        ecgCompleteSetupFragment2.w6();
                                        break;
                                    case 5:
                                        int i35 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var5 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var5, "EcgCompleteSetupFragment", "[createGHSAccount] exit onboarding");
                                        ecgCompleteSetupFragment2.requireActivity().finish();
                                        break;
                                    case 6:
                                        int i36 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var6 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var6, "EcgCompleteSetupFragment", "[checkSetupComplete] retry");
                                        ecgCompleteSetupFragment2.v6();
                                        break;
                                    case 7:
                                        int i37 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var7 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var7, "EcgCompleteSetupFragment", "[checkSetupComplete] exit onboarding");
                                        ecgCompleteSetupFragment2.requireActivity().finish();
                                        break;
                                    case 8:
                                        int i38 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var8 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var8, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] retry");
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    case 9:
                                        int i39 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var9 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var9, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] exit onboarding");
                                        ecgCompleteSetupFragment2.requireActivity().finish();
                                        break;
                                    case 10:
                                        int i44 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    case 11:
                                        int i45 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    default:
                                        int i46 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new e23.a() { // from class: pf0.g
                            @Override // e23.a
                            public final Object invoke() {
                                int i210 = i29;
                                EcgCompleteSetupFragment ecgCompleteSetupFragment2 = ecgCompleteSetupFragment;
                                switch (i210) {
                                    case 0:
                                        int i211 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                    case 1:
                                        int i212 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                    case 2:
                                        int i213 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    case 3:
                                        int i30 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                    case 4:
                                        int i34 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var4 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var4, "EcgCompleteSetupFragment", "[createGHSAccount] retry");
                                        ecgCompleteSetupFragment2.w6();
                                        break;
                                    case 5:
                                        int i35 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var5 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var5, "EcgCompleteSetupFragment", "[createGHSAccount] exit onboarding");
                                        ecgCompleteSetupFragment2.requireActivity().finish();
                                        break;
                                    case 6:
                                        int i36 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var6 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var6, "EcgCompleteSetupFragment", "[checkSetupComplete] retry");
                                        ecgCompleteSetupFragment2.v6();
                                        break;
                                    case 7:
                                        int i37 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var7 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var7, "EcgCompleteSetupFragment", "[checkSetupComplete] exit onboarding");
                                        ecgCompleteSetupFragment2.requireActivity().finish();
                                        break;
                                    case 8:
                                        int i38 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var8 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var8, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] retry");
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    case 9:
                                        int i39 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var9 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var9, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] exit onboarding");
                                        ecgCompleteSetupFragment2.requireActivity().finish();
                                        break;
                                    case 10:
                                        int i44 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    case 11:
                                        int i45 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    default:
                                        int i46 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    } else {
                        a2 a2Var4 = a2.ONBOARDING;
                        String strN2 = fb1.c.n("[checkSetupComplete] error: ", g3Var.f35302c);
                        i2.f36769a.getClass();
                        i2.a.f(a2Var4, "EcgCompleteSetupFragment", strN2);
                        g22.e.a(ecgCompleteSetupFragment, new fw.r());
                    }
                } else {
                    if (i27 != 3) {
                        u0.r();
                        return null;
                    }
                    gf0.g gVar = (gf0.g) g3Var.f35301b;
                    if (gVar != null) {
                        boolean z14 = gVar.f77068e;
                        boolean z15 = gVar.f77067d;
                        boolean z16 = gVar.f77066c;
                        boolean z17 = gVar.f77064a;
                        if (z17 && z16 && z15 && !z14) {
                            a2 a2Var5 = a2.ONBOARDING;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var5, "EcgCompleteSetupFragment", "[checkSetupComplete] setup complete");
                            g22.e.f(ecgCompleteSetupFragment);
                            NavHostFragment.f10124e.getClass();
                            NavHostFragment.a.a(ecgCompleteSetupFragment).g(R.id.action_ecg_activities_list, null);
                        } else {
                            g22.e.f(ecgCompleteSetupFragment);
                            boolean z18 = gVar.f77065b;
                            if (!z16 && z15) {
                                a2 a2Var6 = a2.ONBOARDING;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var6, "EcgCompleteSetupFragment", "[showCompleteSetupState] create GHS account");
                                ecgCompleteSetupFragment.w6();
                            } else if (z17 && z18 && z14) {
                                a2 a2Var7 = a2.ONBOARDING;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var7, "EcgCompleteSetupFragment", "[showCompleteSetupState] expired MFA");
                                final int i30 = 10;
                                e23.a aVar = new e23.a() { // from class: pf0.g
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i210 = i30;
                                        EcgCompleteSetupFragment ecgCompleteSetupFragment2 = ecgCompleteSetupFragment;
                                        switch (i210) {
                                            case 0:
                                                int i211 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 1:
                                                int i212 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 2:
                                                int i213 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 3:
                                                int i34 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 4:
                                                int i35 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var8 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var8, "EcgCompleteSetupFragment", "[createGHSAccount] retry");
                                                ecgCompleteSetupFragment2.w6();
                                                break;
                                            case 5:
                                                int i36 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var9 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var9, "EcgCompleteSetupFragment", "[createGHSAccount] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 6:
                                                int i37 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var10 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var10, "EcgCompleteSetupFragment", "[checkSetupComplete] retry");
                                                ecgCompleteSetupFragment2.v6();
                                                break;
                                            case 7:
                                                int i38 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var11 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var11, "EcgCompleteSetupFragment", "[checkSetupComplete] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 8:
                                                int i39 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var12 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var12, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] retry");
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 9:
                                                int i310 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var13 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var13, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 10:
                                                int i44 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 11:
                                                int i45 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            default:
                                                int i46 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                ComposeView composeView = ecgCompleteSetupFragment.f34853b;
                                if (composeView == null) {
                                    p005kotlin.jvm.internal.s.m("noDataStateView");
                                    throw null;
                                }
                                composeView.setContent(new z3.e(939386740, true, new i(R.string.lbl_account_verification_required, R.string.msg_ecg_account_verification, R.string.lbl_common_continue, 0, aVar)));
                            } else if (z17 && z18 && !z15) {
                                a2 a2Var8 = a2.ONBOARDING;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var8, "EcgCompleteSetupFragment", "[showCompleteSetupState] invalid MFA");
                                final int i34 = 11;
                                EcgCompleteSetupFragment.z6(ecgCompleteSetupFragment, R.string.msg_ecg_no_two_step_verification, new e23.a() { // from class: pf0.g
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i210 = i34;
                                        EcgCompleteSetupFragment ecgCompleteSetupFragment2 = ecgCompleteSetupFragment;
                                        switch (i210) {
                                            case 0:
                                                int i211 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 1:
                                                int i212 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 2:
                                                int i213 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 3:
                                                int i35 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 4:
                                                int i36 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var9 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var9, "EcgCompleteSetupFragment", "[createGHSAccount] retry");
                                                ecgCompleteSetupFragment2.w6();
                                                break;
                                            case 5:
                                                int i37 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var10 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var10, "EcgCompleteSetupFragment", "[createGHSAccount] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 6:
                                                int i38 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var11 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var11, "EcgCompleteSetupFragment", "[checkSetupComplete] retry");
                                                ecgCompleteSetupFragment2.v6();
                                                break;
                                            case 7:
                                                int i39 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var12 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var12, "EcgCompleteSetupFragment", "[checkSetupComplete] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 8:
                                                int i310 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var13 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var13, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] retry");
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 9:
                                                int i311 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var14 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var14, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 10:
                                                int i44 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 11:
                                                int i45 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            default:
                                                int i46 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            } else if (!z17 && !z18 && z15) {
                                a2 a2Var9 = a2.ONBOARDING;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var9, "EcgCompleteSetupFragment", "[showCompleteSetupState] data storage and upload revoked");
                                final int i35 = 12;
                                EcgCompleteSetupFragment.z6(ecgCompleteSetupFragment, R.string.msg_ecg_no_data_storage_processing_upload, new e23.a() { // from class: pf0.g
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i210 = i35;
                                        EcgCompleteSetupFragment ecgCompleteSetupFragment2 = ecgCompleteSetupFragment;
                                        switch (i210) {
                                            case 0:
                                                int i211 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 1:
                                                int i212 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 2:
                                                int i213 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 3:
                                                int i36 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 4:
                                                int i37 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var10 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var10, "EcgCompleteSetupFragment", "[createGHSAccount] retry");
                                                ecgCompleteSetupFragment2.w6();
                                                break;
                                            case 5:
                                                int i38 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var11 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var11, "EcgCompleteSetupFragment", "[createGHSAccount] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 6:
                                                int i39 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var12 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var12, "EcgCompleteSetupFragment", "[checkSetupComplete] retry");
                                                ecgCompleteSetupFragment2.v6();
                                                break;
                                            case 7:
                                                int i310 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var13 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var13, "EcgCompleteSetupFragment", "[checkSetupComplete] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 8:
                                                int i311 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var14 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var14, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] retry");
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 9:
                                                int i312 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var15 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var15, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 10:
                                                int i44 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 11:
                                                int i45 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            default:
                                                int i46 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            } else if (z17 && !z18 && z15) {
                                a2 a2Var10 = a2.ONBOARDING;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var10, "EcgCompleteSetupFragment", "[showCompleteSetupState] data upload revoked");
                                final int i36 = 0;
                                EcgCompleteSetupFragment.z6(ecgCompleteSetupFragment, R.string.msg_ecg_no_data_upload, new e23.a() { // from class: pf0.g
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i210 = i36;
                                        EcgCompleteSetupFragment ecgCompleteSetupFragment2 = ecgCompleteSetupFragment;
                                        switch (i210) {
                                            case 0:
                                                int i211 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 1:
                                                int i212 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 2:
                                                int i213 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 3:
                                                int i37 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 4:
                                                int i38 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var11 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var11, "EcgCompleteSetupFragment", "[createGHSAccount] retry");
                                                ecgCompleteSetupFragment2.w6();
                                                break;
                                            case 5:
                                                int i39 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var12 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var12, "EcgCompleteSetupFragment", "[createGHSAccount] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 6:
                                                int i310 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var13 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var13, "EcgCompleteSetupFragment", "[checkSetupComplete] retry");
                                                ecgCompleteSetupFragment2.v6();
                                                break;
                                            case 7:
                                                int i311 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var14 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var14, "EcgCompleteSetupFragment", "[checkSetupComplete] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 8:
                                                int i312 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var15 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var15, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] retry");
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 9:
                                                int i313 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var16 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var16, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 10:
                                                int i44 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 11:
                                                int i45 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            default:
                                                int i46 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            } else if (!z17 && !z18 && !z15) {
                                a2 a2Var11 = a2.ONBOARDING;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var11, "EcgCompleteSetupFragment", "[showCompleteSetupState] data storage and upload revoked and invalid MFA");
                                EcgCompleteSetupFragment.z6(ecgCompleteSetupFragment, R.string.msg_ecg_no_data_storage_processing_upload_mfa, new e23.a() { // from class: pf0.g
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i210 = i17;
                                        EcgCompleteSetupFragment ecgCompleteSetupFragment2 = ecgCompleteSetupFragment;
                                        switch (i210) {
                                            case 0:
                                                int i211 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 1:
                                                int i212 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 2:
                                                int i213 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 3:
                                                int i37 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 4:
                                                int i38 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var12 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var12, "EcgCompleteSetupFragment", "[createGHSAccount] retry");
                                                ecgCompleteSetupFragment2.w6();
                                                break;
                                            case 5:
                                                int i39 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var13 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var13, "EcgCompleteSetupFragment", "[createGHSAccount] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 6:
                                                int i310 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var14 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var14, "EcgCompleteSetupFragment", "[checkSetupComplete] retry");
                                                ecgCompleteSetupFragment2.v6();
                                                break;
                                            case 7:
                                                int i311 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var15 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var15, "EcgCompleteSetupFragment", "[checkSetupComplete] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 8:
                                                int i312 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var16 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var16, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] retry");
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 9:
                                                int i313 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var17 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var17, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 10:
                                                int i44 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 11:
                                                int i45 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            default:
                                                int i46 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            } else if (!z17 || z18 || z15) {
                                a2 a2Var12 = a2.ONBOARDING;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var12, "EcgCompleteSetupFragment", "[showCompleteSetupState] other state");
                                EcgCompleteSetupFragment.z6(ecgCompleteSetupFragment, R.string.msg_ecg_no_data_storage_processing_upload_mfa, new e23.a() { // from class: pf0.g
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i210 = i15;
                                        EcgCompleteSetupFragment ecgCompleteSetupFragment2 = ecgCompleteSetupFragment;
                                        switch (i210) {
                                            case 0:
                                                int i211 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 1:
                                                int i212 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 2:
                                                int i213 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 3:
                                                int i37 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 4:
                                                int i38 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var13 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var13, "EcgCompleteSetupFragment", "[createGHSAccount] retry");
                                                ecgCompleteSetupFragment2.w6();
                                                break;
                                            case 5:
                                                int i39 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var14 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var14, "EcgCompleteSetupFragment", "[createGHSAccount] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 6:
                                                int i310 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var15 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var15, "EcgCompleteSetupFragment", "[checkSetupComplete] retry");
                                                ecgCompleteSetupFragment2.v6();
                                                break;
                                            case 7:
                                                int i311 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var16 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var16, "EcgCompleteSetupFragment", "[checkSetupComplete] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 8:
                                                int i312 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var17 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var17, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] retry");
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 9:
                                                int i313 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var18 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var18, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 10:
                                                int i44 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 11:
                                                int i45 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            default:
                                                int i46 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            } else {
                                a2 a2Var13 = a2.ONBOARDING;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var13, "EcgCompleteSetupFragment", "[showCompleteSetupState] data upload revoked and invalid MFA");
                                EcgCompleteSetupFragment.z6(ecgCompleteSetupFragment, R.string.msg_ecg_no_data_upload_mfa, new e23.a() { // from class: pf0.g
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i210 = i16;
                                        EcgCompleteSetupFragment ecgCompleteSetupFragment2 = ecgCompleteSetupFragment;
                                        switch (i210) {
                                            case 0:
                                                int i211 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 1:
                                                int i212 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 2:
                                                int i213 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 3:
                                                int i37 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                            case 4:
                                                int i38 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var14 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var14, "EcgCompleteSetupFragment", "[createGHSAccount] retry");
                                                ecgCompleteSetupFragment2.w6();
                                                break;
                                            case 5:
                                                int i39 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var15 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var15, "EcgCompleteSetupFragment", "[createGHSAccount] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 6:
                                                int i310 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var16 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var16, "EcgCompleteSetupFragment", "[checkSetupComplete] retry");
                                                ecgCompleteSetupFragment2.v6();
                                                break;
                                            case 7:
                                                int i311 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var17 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var17, "EcgCompleteSetupFragment", "[checkSetupComplete] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 8:
                                                int i312 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var18 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var18, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] retry");
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 9:
                                                int i313 = EcgCompleteSetupFragment.f34851d;
                                                a2 a2Var19 = a2.ONBOARDING;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var19, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] exit onboarding");
                                                ecgCompleteSetupFragment2.requireActivity().finish();
                                                break;
                                            case 10:
                                                int i44 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            case 11:
                                                int i45 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.u6();
                                                break;
                                            default:
                                                int i46 = EcgCompleteSetupFragment.f34851d;
                                                ecgCompleteSetupFragment2.y6();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                int i37 = EcgCompleteSetupFragment.f34851d;
                int i38 = EcgCompleteSetupFragment.b.f34855a[g3Var.f35300a.ordinal()];
                if (i38 == 1) {
                    g22.e.l(ecgCompleteSetupFragment);
                } else if (i38 == 2) {
                    g22.e.f(ecgCompleteSetupFragment);
                    if (g3Var.f35303d instanceof NoNetworkException) {
                        a2 a2Var14 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var14, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] no internet");
                        final int i39 = 8;
                        final int i44 = 9;
                        nf0.b.a(ecgCompleteSetupFragment, new e23.a() { // from class: pf0.g
                            @Override // e23.a
                            public final Object invoke() {
                                int i210 = i39;
                                EcgCompleteSetupFragment ecgCompleteSetupFragment2 = ecgCompleteSetupFragment;
                                switch (i210) {
                                    case 0:
                                        int i211 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                    case 1:
                                        int i212 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                    case 2:
                                        int i213 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    case 3:
                                        int i310 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                    case 4:
                                        int i311 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var15 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var15, "EcgCompleteSetupFragment", "[createGHSAccount] retry");
                                        ecgCompleteSetupFragment2.w6();
                                        break;
                                    case 5:
                                        int i312 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var16 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var16, "EcgCompleteSetupFragment", "[createGHSAccount] exit onboarding");
                                        ecgCompleteSetupFragment2.requireActivity().finish();
                                        break;
                                    case 6:
                                        int i313 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var17 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var17, "EcgCompleteSetupFragment", "[checkSetupComplete] retry");
                                        ecgCompleteSetupFragment2.v6();
                                        break;
                                    case 7:
                                        int i314 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var18 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var18, "EcgCompleteSetupFragment", "[checkSetupComplete] exit onboarding");
                                        ecgCompleteSetupFragment2.requireActivity().finish();
                                        break;
                                    case 8:
                                        int i315 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var19 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var19, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] retry");
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    case 9:
                                        int i316 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var110 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var110, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] exit onboarding");
                                        ecgCompleteSetupFragment2.requireActivity().finish();
                                        break;
                                    case 10:
                                        int i45 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    case 11:
                                        int i46 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    default:
                                        int i47 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new e23.a() { // from class: pf0.g
                            @Override // e23.a
                            public final Object invoke() {
                                int i210 = i44;
                                EcgCompleteSetupFragment ecgCompleteSetupFragment2 = ecgCompleteSetupFragment;
                                switch (i210) {
                                    case 0:
                                        int i211 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                    case 1:
                                        int i212 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                    case 2:
                                        int i213 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    case 3:
                                        int i310 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                    case 4:
                                        int i311 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var15 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var15, "EcgCompleteSetupFragment", "[createGHSAccount] retry");
                                        ecgCompleteSetupFragment2.w6();
                                        break;
                                    case 5:
                                        int i312 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var16 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var16, "EcgCompleteSetupFragment", "[createGHSAccount] exit onboarding");
                                        ecgCompleteSetupFragment2.requireActivity().finish();
                                        break;
                                    case 6:
                                        int i313 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var17 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var17, "EcgCompleteSetupFragment", "[checkSetupComplete] retry");
                                        ecgCompleteSetupFragment2.v6();
                                        break;
                                    case 7:
                                        int i314 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var18 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var18, "EcgCompleteSetupFragment", "[checkSetupComplete] exit onboarding");
                                        ecgCompleteSetupFragment2.requireActivity().finish();
                                        break;
                                    case 8:
                                        int i315 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var19 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var19, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] retry");
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    case 9:
                                        int i316 = EcgCompleteSetupFragment.f34851d;
                                        a2 a2Var110 = a2.ONBOARDING;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var110, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] exit onboarding");
                                        ecgCompleteSetupFragment2.requireActivity().finish();
                                        break;
                                    case 10:
                                        int i45 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    case 11:
                                        int i46 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.u6();
                                        break;
                                    default:
                                        int i47 = EcgCompleteSetupFragment.f34851d;
                                        ecgCompleteSetupFragment2.y6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    } else {
                        a2 a2Var15 = a2.ONBOARDING;
                        String strN3 = fb1.c.n("[checkMultiFactorAuthentication] error: ", g3Var.f35302c);
                        i2.f36769a.getClass();
                        i2.a.f(a2Var15, "EcgCompleteSetupFragment", strN3);
                        g22.e.a(ecgCompleteSetupFragment, new fw.r());
                    }
                } else {
                    if (i38 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(ecgCompleteSetupFragment);
                    if (p005kotlin.jvm.internal.s.g(g3Var.f35301b, Boolean.TRUE)) {
                        a2 a2Var16 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var16, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] valid MFA");
                        ecgCompleteSetupFragment.w6();
                    } else {
                        a2 a2Var17 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var17, "EcgCompleteSetupFragment", "[checkMultiFactorAuthentication] no or invalid MFA");
                        NavHostFragment.f10124e.getClass();
                        NavHostFragment.a.a(ecgCompleteSetupFragment).g(R.id.action_two_step_verification, null);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
