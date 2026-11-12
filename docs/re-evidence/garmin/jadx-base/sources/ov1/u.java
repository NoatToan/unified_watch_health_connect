package ov1;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.v1;
import androidx.lifecycle.y1;
import androidx.navigation.fragment.NavHostFragment;
import c83.b0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.device.companion.presentation.CompanionDeviceLinkActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.training.stp.presentation.activity.SetupStrengthTrainingPlanActivity;
import com.garmin.android.apps.connectmobile.training.stp.presentation.activity.StrengthTrainingPlanDashboardActivity;
import com.garmin.android.apps.connectmobile.util.gson.GCMEnumTypeAdapterFactory;
import com.google.gson.GsonBuilder;
import gg1.v0;
import java.util.TimeZone;
import lc.m0;
import lc.w0;
import mt0.b1;
import mt0.m3;
import okhttp3.OkHttpClient;
import org.joda.time.DateTimeZone;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;
import p40.f0;
import p40.n0;
import po2.h0;
import pt0.o0;
import pt0.z;
import r53.p2;
import yt0.r0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f134232b;

    public /* synthetic */ u(Object obj, int i14) {
        this.f134231a = i14;
        this.f134232b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, o13.l] */
    @Override // e23.a
    public final Object invoke() throws Throwable {
        Object value;
        int i14 = this.f134231a;
        Object obj = this.f134232b;
        switch (i14) {
            case 0:
                w.a aVar = w.f134236b;
                ((w) obj).getParentFragmentManager().Z();
                return Unit.INSTANCE;
            case 1:
                ((ix.j) obj).A4();
                return Unit.INSTANCE;
            case 2:
                ((kb0.k) obj).invoke();
                return Unit.INSTANCE;
            case 3:
                return ParametersHolderKt.parametersOf((tn1.d) obj);
            case 4:
                tn1.g gVar = (tn1.g) obj;
                tn1.d dVar = gVar.f165516a;
                if (dVar != null) {
                    gVar.f165517b.b(dVar);
                    Unit unit = Unit.INSTANCE;
                    p2 p2Var = gVar.f165519d;
                    do {
                        value = p2Var.getValue();
                        ((Boolean) value).getClass();
                    } while (!p2Var.b(value, Boolean.TRUE));
                    tn1.a aVar2 = gVar.f165518c;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                }
                return Unit.INSTANCE;
            case 5:
                p10.a.b bVar = p10.a.f134883c;
                b0.b bVar2 = new b0.b();
                v0 v0VarK = GCMSettingManager.k();
                v0VarK.getClass();
                bVar2.b("https://" + v0VarK.f77343i + "/gcm/appstore/rest/");
                bVar2.d((OkHttpClient) ((p10.a) obj).f134884a.getValue());
                mz2.c.f122004a.getClass();
                bVar2.f25769d.add(mz2.c.b.a());
                bVar2.a(h83.k.c());
                bVar2.a(e83.a.d(new GsonBuilder().registerTypeAdapterFactory(new GCMEnumTypeAdapterFactory()).setExclusionStrategies(new com.garmin.android.apps.connectmobile.util.gson.a()).create()));
                return (p10.a.InterfaceC2560a) bVar2.c().b(p10.a.InterfaceC2560a.class);
            case 6:
                p10.c.a aVar3 = p10.c.f134886c;
                b0.b bVar3 = new b0.b();
                bVar3.b("https://" + GCMSettingManager.k().A);
                bVar3.d((OkHttpClient) ((p10.c) obj).f134888b.getValue());
                mz2.c.f122004a.getClass();
                bVar3.f25769d.add(mz2.c.b.a());
                bVar3.a(h83.k.c());
                bVar3.a(e83.a.d(new GsonBuilder().registerTypeAdapterFactory(new GCMEnumTypeAdapterFactory()).setExclusionStrategies(new com.garmin.android.apps.connectmobile.util.gson.a()).create()));
                return (p10.b) bVar3.c().b(p10.b.class);
            case 7:
                return ((Iterable) obj).iterator();
            case 8:
                c60.b bVar4 = ((p40.l) obj).f135696j;
                if (bVar4 != null) {
                    bVar4.invoke();
                }
                return Unit.INSTANCE;
            case 9:
                ((u) obj).invoke();
                return Unit.INSTANCE;
            case 10:
                int i15 = n0.f135706b;
                ((f0) obj).invoke();
                return Unit.INSTANCE;
            case 11:
                int i16 = n0.f135706b;
                ((f0) obj).invoke();
                return Unit.INSTANCE;
            case 12:
                CompanionDeviceLinkActivity.a aVar4 = CompanionDeviceLinkActivity.f33743a;
                ((CompanionDeviceLinkActivity) obj).finish();
                return Unit.INSTANCE;
            case 13:
                NavHostFragment navHostFragment = (NavHostFragment) obj;
                NavHostFragment.a aVar5 = NavHostFragment.f10124e;
                Context context = navHostFragment.getContext();
                if (context == null) {
                    vb.h.z("NavController cannot be created before the fragment is attached");
                    return null;
                }
                m0 m0Var = new m0(context);
                m0Var.u(navHostFragment);
                y1 viewModelStore = navHostFragment.getF189591b();
                viewModelStore.getClass();
                m0Var.v(viewModelStore);
                qc.h hVar = m0Var.f111904b;
                w0 w0Var = hVar.f144333t;
                Context contextRequireContext = navHostFragment.requireContext();
                contextRequireContext.getClass();
                androidx.fragment.app.v childFragmentManager = navHostFragment.getChildFragmentManager();
                childFragmentManager.getClass();
                w0Var.a(new pc.b(contextRequireContext, childFragmentManager));
                w0 w0Var2 = hVar.f144333t;
                Context contextRequireContext2 = navHostFragment.requireContext();
                contextRequireContext2.getClass();
                androidx.fragment.app.v childFragmentManager2 = navHostFragment.getChildFragmentManager();
                childFragmentManager2.getClass();
                int id3 = navHostFragment.getId();
                if (id3 == 0 || id3 == -1) {
                    id3 = R.id.nav_host_fragment_container;
                }
                w0Var2.a(new androidx.navigation.fragment.a(contextRequireContext2, childFragmentManager2, id3));
                Bundle bundleA = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:navControllerState");
                if (bundleA != null) {
                    m0Var.r(bundleA);
                }
                navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:navControllerState", new androidx.fragment.app.j(m0Var, 4));
                Bundle bundleA2 = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:graphId");
                if (bundleA2 != null) {
                    navHostFragment.f10127c = bundleA2.getInt("android-support-nav:fragment:graphId");
                }
                navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:graphId", new androidx.fragment.app.j(navHostFragment, 5));
                int i17 = navHostFragment.f10127c;
                if (i17 != 0) {
                    hVar.x(m0Var.e().b(i17), null);
                } else {
                    Bundle arguments = navHostFragment.getArguments();
                    int i18 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
                    Bundle bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                    if (i18 != 0) {
                        hVar.x(m0Var.e().b(i18), bundle);
                    }
                }
                return m0Var;
            case 14:
                pl1.d.b bVar5 = ((pl1.d) obj).f138529a;
                if (bVar5 != null) {
                    bVar5.p8();
                }
                return Unit.INSTANCE;
            case 15:
                return hb2.d.a(((pn2.a.EnumC2623a) obj).f138701a);
            case 16:
                h0 h0Var = (h0) obj;
                return h0Var.f139209c.toDateTime(h0Var.f139210d, DateTimeZone.forOffsetHours(8)).toDateTime(DateTimeZone.forTimeZone(TimeZone.getDefault()));
            case 17:
                return ((ps2.p) obj).f140533a.invoke("prefs_wallet_device_metadata");
            case 18:
                return ((ps2.x) obj).f140556a.invoke("prefs_user_wallet");
            case 19:
                pt0.n nVar = (pt0.n) obj;
                int i19 = pt0.n.f140733d;
                return new b1.b(v1.a(nVar), (r0) nVar.f140734a.getValue(), b1.d.ADVENTURE, nVar.f140735b, null, 16, null).c(999);
            case 20:
                pt0.o oVar = (pt0.o) obj;
                int i24 = pt0.o.f140741e;
                return new b1.b(v1.a(oVar), (r0) oVar.f140742a.getValue(), b1.d.GENERAL, oVar.f140744c, oVar.f140743b).c(999);
            case 21:
                z zVar = (z) obj;
                int i25 = z.f140793e;
                return new m3.b(v1.a(zVar), zVar.f140794a, m3.d.COMPLETED, zVar.f140796c).c(20);
            case 22:
                o0 o0Var = (o0) obj;
                int i26 = o0.f140749d;
                return new m3.b(v1.a(o0Var), o0Var.f140750a, m3.d.NON_COMPLETED, o0Var.f140751b).c(20);
            case 23:
                int i27 = pw1.d.H0;
                return ((pw1.d) obj).Z4();
            case 24:
                SetupStrengthTrainingPlanActivity.a aVar6 = SetupStrengthTrainingPlanActivity.f45640a;
                ((SetupStrengthTrainingPlanActivity) obj).finish();
                return Unit.INSTANCE;
            case 25:
                return ParametersHolderKt.parametersOf(((StrengthTrainingPlanDashboardActivity) obj).f45644g);
            case 26:
                q12.e eVar = (q12.e) obj;
                return new q12.c(eVar.f142087a, eVar.f142088b, 0, 50);
            case 27:
                return ((s2.e) obj).F();
            case 28:
                ((o2.h) obj).close();
                return Unit.INSTANCE;
            default:
                q2.u uVar = q2.u.f142195a;
                q2.q qVar = q2.q.f142189a;
                PendingIntent actionIntent = ((RemoteAction) obj).getActionIntent();
                qVar.getClass();
                q2.q.a(actionIntent);
                return Unit.INSTANCE;
        }
    }
}
