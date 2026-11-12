package mh1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import c22.k3;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengeTermsActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.e0;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.f0;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.q0;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.r0;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.settings.devices.index.IndexDevicesGeneralSettingActivity;
import com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageActivity;
import com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel;
import com.garmin.android.apps.connectmobile.workouts.presentation.selectworkout.SelectWorkoutActivityActivity;
import java.util.Arrays;
import mt0.g0;
import mt0.n2;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p13.u0;
import p3.a2;
import p3.n1;
import p3.p0;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f118478b;

    public /* synthetic */ i(Object obj, int i14) {
        this.f118477a = i14;
        this.f118478b = obj;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        int i14 = this.f118477a;
        Object obj = this.f118478b;
        switch (i14) {
            case 0:
                int i15 = IndexDevicesGeneralSettingActivity.f43030o;
                HelpActivity.a.e(HelpActivity.f36653a, (IndexDevicesGeneralSettingActivity) obj, ro0.l.INDEX_S2_LOCATION_SETTINGS, null, null, 12);
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.settings.devices.index.a.C0800a c0800a = com.garmin.android.apps.connectmobile.settings.devices.index.a.f43064a;
                ((com.garmin.android.apps.connectmobile.settings.devices.index.a) obj).dismiss();
                return Unit.INSTANCE;
            case 2:
                mi0.a aVar = (mi0.a) obj;
                int i16 = mi0.a.f118681h;
                return new fi0.a(aVar.f118685d, aVar.f118682a, 20);
            case 3:
                ((mk1.h) obj).y4();
                return Unit.INSTANCE;
            case 4:
                mq.e eVar = (mq.e) obj;
                Logger logger = mq.e.f120159p;
                xn.j.a aVar2 = xn.j.f191609g;
                String str = eVar.f120174o;
                aVar2.getClass();
                Bundle bundleA = xn.j.a.a(str);
                HelpActivity.a aVar3 = HelpActivity.f36653a;
                Context context = eVar.f120160a;
                ro0.l lVar = ro0.l.FIVE_HZ_DATA_RECORDING;
                aVar3.getClass();
                HelpActivity.a.d(context, lVar, null, bundleA);
                return Unit.INSTANCE;
            case 5:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar = (com.garmin.android.apps.connectmobile.leaderboard.challenges.b) obj;
                boolean zT = com.garmin.android.apps.connectmobile.leaderboard.challenges.x.t(bVar.f37328f);
                if ((zT || bVar.E6().k1()) && (!zT || bVar.E6().S0())) {
                    bVar.u6();
                } else {
                    AdHocChallengeTermsActivity.a aVar4 = AdHocChallengeTermsActivity.f37181c;
                    Context contextRequireContext = bVar.requireContext();
                    aVar4.getClass();
                    Intent intent = new Intent(contextRequireContext, (Class<?>) AdHocChallengeTermsActivity.class);
                    intent.putExtra("GCM_challenge_is_vivokid", zT);
                    bVar.startActivityForResult(intent, 4);
                }
                return Unit.INSTANCE;
            case 6:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.f fVar = (com.garmin.android.apps.connectmobile.leaderboard.challenges.f) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.f.a aVar5 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f.R0;
                Context contextRequireContext2 = fVar.requireContext();
                contextRequireContext2.getClass();
                AdHocChallengeDTO adHocChallengeDTO = fVar.f37694z;
                if (adHocChallengeDTO == null) {
                    adHocChallengeDTO = new AdHocChallengeDTO();
                }
                return new com.garmin.android.apps.connectmobile.leaderboard.challenges.e(contextRequireContext2, adHocChallengeDTO);
            case 7:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.g gVar = (com.garmin.android.apps.connectmobile.leaderboard.challenges.g) obj;
                kt0.a aVar6 = gVar.f37529a;
                androidx.fragment.app.m mVarRequireActivity = gVar.requireActivity();
                mVarRequireActivity.getClass();
                aVar6.i(mVarRequireActivity);
                return Unit.INSTANCE;
            case 8:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.k kVar = (com.garmin.android.apps.connectmobile.leaderboard.challenges.k) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.k.a aVar7 = com.garmin.android.apps.connectmobile.leaderboard.challenges.k.O0;
                Context contextRequireContext3 = kVar.requireContext();
                contextRequireContext3.getClass();
                return new com.garmin.android.apps.connectmobile.leaderboard.challenges.j(contextRequireContext3, kVar);
            case 9:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.n.a aVar8 = com.garmin.android.apps.connectmobile.leaderboard.challenges.n.I;
                androidx.fragment.app.m mVarRequireActivity2 = ((com.garmin.android.apps.connectmobile.leaderboard.challenges.n) obj).requireActivity();
                mVarRequireActivity2.getClass();
                return new g0(mVarRequireActivity2);
            case 10:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.o.a aVar9 = com.garmin.android.apps.connectmobile.leaderboard.challenges.o.I;
                androidx.fragment.app.m mVarRequireActivity3 = ((com.garmin.android.apps.connectmobile.leaderboard.challenges.o) obj).requireActivity();
                mVarRequireActivity3.getClass();
                return new g0(mVarRequireActivity3);
            case 11:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.q qVar = (com.garmin.android.apps.connectmobile.leaderboard.challenges.q) obj;
                ub1.g gVar2 = (ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null);
                Context contextRequireContext4 = qVar.requireContext();
                contextRequireContext4.getClass();
                qVar.f37773k.a(gVar2.g(contextRequireContext4, c80.q.SOCIAL, false), null);
                return Unit.INSTANCE;
            case 12:
                e0 e0Var = (e0) obj;
                e0.a aVar10 = e0.I;
                boolean z14 = e0Var.f7().C() != com.garmin.android.apps.connectmobile.leaderboard.model.v.COMPLETED;
                androidx.fragment.app.m mVarRequireActivity4 = e0Var.requireActivity();
                mVarRequireActivity4.getClass();
                com.garmin.android.apps.connectmobile.leaderboard.model.s sVarB = com.garmin.android.apps.connectmobile.leaderboard.model.s.b(e0Var.f7().f37989c);
                sVarB.getClass();
                return new n2(mVarRequireActivity4, sVarB, z14);
            case 13:
                int i17 = f0.p.f37516b;
                return (ComposeView) ((f0.p) obj).itemView.findViewById(R.id.compose_container);
            case 14:
                r0 r0Var = (r0) obj;
                r0.a aVar11 = r0.K0;
                Context contextRequireContext5 = r0Var.requireContext();
                contextRequireContext5.getClass();
                return new q0(contextRequireContext5, r0Var.u7().f120604d, r0Var);
            case 15:
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.b.a aVar12 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.b.f38557g;
                ht.a.f85464a.getClass();
                ht.a.a(null, "LiveEventSharingEstCompletionTimeClicked");
                cu0.i iVarU6 = ((com.garmin.android.apps.connectmobile.liveeventsharing.ui.b) obj).u6();
                iVarU6.getClass();
                iVarU6.f55591i.m("LiveEventEstCompletionTimeFragment");
                return Unit.INSTANCE;
            case 16:
                return Integer.valueOf(((w13.a) obj).size());
            case 17:
                return p0.n((n02.f) obj);
            case 18:
                l3.a aVar13 = l3.f23124b;
                long intValue = ((long) ((n1) obj).getIntValue()) * 1000;
                aVar13.getClass();
                return p0.n(l3.a.b1(intValue));
            case 19:
                EditProfileImageActivity.a aVar14 = EditProfileImageActivity.f46576j;
                EditProfileImageViewModel editProfileImageViewModelCa = ((EditProfileImageActivity) obj).ca();
                editProfileImageViewModelCa.X.j(Boolean.FALSE);
                editProfileImageViewModelCa.f46601f.f122267a.O2("keyShowTipView", true);
                return Unit.INSTANCE;
            case 20:
                Context context2 = ((com.garmin.android.apps.connectmobile.userprofile.editimage.c) obj).f46661d.getContext();
                context2.getClass();
                return k3.a(context2, "crop_output.png");
            case 21:
                return new a2(com.garmin.android.apps.connectmobile.courses.model.c.f32836h.indexOf((com.garmin.android.apps.connectmobile.courses.model.c) obj));
            case 22:
                return p0.n(Boolean.valueOf(((m40.h) obj).f116597d));
            case 23:
                p2 p2Var = ((p51.c) obj).f136154c.f175575e;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, new o51.g(false, false, false, null, 15, null)));
                return Unit.INSTANCE;
            case 24:
                SelectWorkoutActivityActivity.a aVar15 = SelectWorkoutActivityActivity.f49549a;
                return ParametersHolderKt.parametersOf((m52.k) obj);
            case 25:
                SelectWorkoutActivityActivity.a aVar16 = SelectWorkoutActivityActivity.f49549a;
                ((SelectWorkoutActivityActivity) obj).finish();
                return Unit.INSTANCE;
            case 26:
                n62.c cVar = (n62.c) obj;
                return new r52.j(cVar.f123883a, p13.w.c(cVar.f123884b));
            case 27:
                return ParametersHolderKt.parametersOf((j70.d) obj);
            case 28:
                o13.p[] pVarArr = (o13.p[]) obj;
                return u0.f((o13.p[]) Arrays.copyOf(pVarArr, pVarArr.length));
            default:
                n82.f.a aVar17 = (n82.f.a) obj;
                return new n82.b(aVar17.f124963a, aVar17.f124964b);
        }
    }
}
