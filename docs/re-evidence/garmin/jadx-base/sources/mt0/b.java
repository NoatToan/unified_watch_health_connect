package mt0;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.b f120517b;

    public /* synthetic */ b(com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar, int i14) {
        this.f120516a = i14;
        this.f120517b = bVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f120516a;
        com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar = this.f120517b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.b.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.f37321p;
                g3Var.getClass();
                int i15 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.C0667b.f37338a[g3Var.f35300a.ordinal()];
                if (i15 == 1) {
                    g22.e.l(bVar);
                } else if (i15 == 2) {
                    g22.e.f(bVar);
                    bVar.requireActivity().setResult(-1);
                    bVar.f37327e = null;
                    bVar.A6(true);
                    bVar.E6().T3(true);
                } else {
                    if (i15 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    g22.e.f(bVar);
                    Toast.makeText(bVar.requireContext(), R.string.txt_error_occurred, 0).show();
                }
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.g3 g3Var2 = (com.garmin.android.apps.connectmobile.g3) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.b.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.f37321p;
                g3Var2.getClass();
                int i16 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.C0667b.f37338a[g3Var2.f35300a.ordinal()];
                if (i16 == 1) {
                    g22.e.l(bVar);
                } else if (i16 == 2) {
                    g22.e.f(bVar);
                    bVar.y6(-1);
                    bVar.E6().T3(true);
                } else {
                    if (i16 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    g22.e.f(bVar);
                    Toast.makeText(bVar.requireContext(), bVar.getString(R.string.txt_error_occurred), 0).show();
                }
                return Unit.INSTANCE;
            case 2:
                com.garmin.android.apps.connectmobile.g3 g3Var3 = (com.garmin.android.apps.connectmobile.g3) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.b.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.f37321p;
                g3Var3.getClass();
                int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.C0667b.f37338a[g3Var3.f35300a.ordinal()];
                if (i17 == 1) {
                    g22.e.l(bVar);
                } else if (i17 == 2) {
                    g22.e.f(bVar);
                    bVar.y6(-1);
                    bVar.E6().T3(true);
                } else {
                    if (i17 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    g22.e.f(bVar);
                    Toast.makeText(bVar.requireContext(), bVar.getString(R.string.txt_error_occurred), 0).show();
                }
                return Unit.INSTANCE;
            case 3:
                com.garmin.android.apps.connectmobile.g3 g3Var4 = (com.garmin.android.apps.connectmobile.g3) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.b.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.f37321p;
                g3Var4.getClass();
                int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.C0667b.f37338a[g3Var4.f35300a.ordinal()];
                if (i18 == 1) {
                    g22.e.l(bVar);
                } else if (i18 == 2) {
                    g22.e.f(bVar);
                    bVar.requireActivity().setResult(-1);
                    bVar.A6(true);
                } else {
                    if (i18 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    g22.e.f(bVar);
                    Toast.makeText(bVar.requireContext(), R.string.txt_error_occurred, 0).show();
                    bVar.H6();
                }
                return Unit.INSTANCE;
            case 4:
                String str = (String) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.b.a aVar5 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.f37321p;
                str.getClass();
                AdHocChallengeDTO adHocChallengeDTO = bVar.f37328f;
                adHocChallengeDTO.getClass();
                adHocChallengeDTO.f37990d = str;
                bVar.H6();
                bVar.requireActivity().setResult(-1);
                return Unit.INSTANCE;
            case 5:
                com.garmin.android.apps.connectmobile.g3 g3Var5 = (com.garmin.android.apps.connectmobile.g3) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.b.a aVar6 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.f37321p;
                g3Var5.getClass();
                int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.C0667b.f37338a[g3Var5.f35300a.ordinal()];
                if (i19 == 1) {
                    g22.e.l(bVar);
                } else if (i19 == 2) {
                    g22.e.f(bVar);
                    bVar.A6(true);
                } else {
                    if (i19 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    g22.e.f(bVar);
                    Toast.makeText(bVar.requireContext(), R.string.txt_error_occurred, 0).show();
                }
                return Unit.INSTANCE;
            case 6:
                com.garmin.android.apps.connectmobile.g3 g3Var6 = (com.garmin.android.apps.connectmobile.g3) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.b.a aVar7 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.f37321p;
                g3Var6.getClass();
                int i24 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.C0667b.f37338a[g3Var6.f35300a.ordinal()];
                if (i24 == 1) {
                    g22.e.l(bVar);
                } else if (i24 == 2) {
                    g22.e.f(bVar);
                    bVar.y6(-1);
                    bVar.E6().T3(true);
                } else {
                    if (i24 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    g22.e.f(bVar);
                    Toast.makeText(bVar.requireContext(), R.string.txt_error_occurred, 0).show();
                    bVar.y6(null);
                }
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.g3 g3Var7 = (com.garmin.android.apps.connectmobile.g3) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.b.a aVar8 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.f37321p;
                g3Var7.getClass();
                bVar.f37329g = (List) g3Var7.f35301b;
                ge1.b.T(g22.f.b(bVar), null, null, new e(bVar, null), 3);
                return Unit.INSTANCE;
        }
    }
}
