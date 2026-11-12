package a03;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.m1;
import b21.l4;
import com.garmin.android.apps.connectmobile.ftp.reports.presentation.activity.FtpActivity;
import com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.settings.thirdparty.GCMSettingsThirdPartyAppsActivity;
import java.util.concurrent.Callable;
import org.koin.bundle.factory.AndroidParametersHolder;
import org.koin.bundle.factory.KoinViewModelFactory;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f79b;

    public /* synthetic */ e(hj0.a aVar, FtpActivity ftpActivity) {
        this.f78a = 6;
        this.f79b = ftpActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        int i14 = this.f78a;
        Parcelable parcelable = null;
        Object obj = this.f79b;
        switch (i14) {
            case 0:
                ((zz2.e) obj).invoke();
                return Unit.INSTANCE;
            case 1:
                return p3.p0.n(((t41.i) obj).f162321a);
            case 2:
                return KoinViewModelFactory.create$lambda$0((AndroidParametersHolder) obj);
            case 3:
                return ParametersHolderKt.parametersOf((we0.d) obj);
            case 4:
                af2.c cVar = (af2.c) obj;
                u53.d dVar = cVar.f3117c;
                if (dVar != null) {
                    ge1.b.T(dVar, null, null, new af2.d(cVar, null), 3);
                }
                return Unit.INSTANCE;
            case 5:
                FtpActivity.a aVar = FtpActivity.f35281a;
                return ParametersHolderKt.parametersOf((yi0.c) obj);
            case 6:
                FtpActivity.a aVar2 = FtpActivity.f35281a;
                HelpActivity.a.e(HelpActivity.f36653a, (FtpActivity) obj, ro0.l.FUNCTIONAL_THRESHOLD_POWER, "MEASUREMENT_ACTION", null, 8);
                return Unit.INSTANCE;
            case 7:
                ((com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.h) obj).a();
                return Unit.INSTANCE;
            case 8:
                GCPlusHomeActivity gCPlusHomeActivity = (GCPlusHomeActivity) obj;
                GCPlusHomeActivity.a aVar3 = GCPlusHomeActivity.f35323e;
                Intent intent = gCPlusHomeActivity.getIntent();
                if (Build.VERSION.SDK_INT < 33) {
                    Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("EXTRA_DESTINATION") : null;
                    if (parcelableExtra instanceof Parcelable) {
                        parcelable = parcelableExtra;
                    }
                } else if (intent != null) {
                    parcelable = (Parcelable) intent.getParcelableExtra("EXTRA_DESTINATION", Parcelable.class);
                }
                return ParametersHolderKt.parametersOf(parcelable, Boolean.valueOf(gCPlusHomeActivity.getIntent().getBooleanExtra("REFRESH_SUBSCRIPTION_CACHE", true)));
            case 9:
                return ParametersHolderKt.parametersOf((ck0.t) obj);
            case 10:
                p2 p2Var = ((com.garmin.android.apps.connectmobile.gcplus.presentation.home.e) obj).f35430z;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, new ck0.e(true, null)));
                return Unit.INSTANCE;
            case 11:
                ((com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.c) obj).f35346a.invoke();
                return Unit.INSTANCE;
            case 12:
                int i15 = GCMSettingsThirdPartyAppsActivity.f43944b;
                ((GCMSettingsThirdPartyAppsActivity) obj).onBackPressed();
                return Unit.INSTANCE;
            case 13:
                al2.a aVar4 = (al2.a) obj;
                long j8 = aVar4.f3762d;
                float fMin = aVar4.f3763e;
                float f14 = aVar4.f3765g;
                if (j8 != 0) {
                    long j14 = aVar4.f3761c;
                    if (j14 >= j8) {
                        fMin = f14;
                    } else {
                        float f15 = j14 / j8;
                        float f16 = 100;
                        float f17 = f15 * f16;
                        fMin = f17 < fMin ? Float.min(Math.max((f16 - fMin) * f15, fMin), f14) : Float.min(f17, f14);
                    }
                }
                return Float.valueOf(fMin);
            case 14:
                ((androidx.lifecycle.j) obj).f7940m = null;
                return Unit.INSTANCE;
            case 15:
                return m1.c((ViewModelStoreOwner) obj);
            case 16:
                return androidx.room.b0.runInTransaction$lambda$10((Runnable) obj);
            case 17:
                return ((Callable) obj).call();
            case 18:
                return ((androidx.room.q0) obj).createNewStatement();
            case 19:
                Unit unit = Unit.INSTANCE;
                ((q53.t) obj).i(unit);
                return unit;
            case 20:
                yt1.c cVar2 = ((com.garmin.android.apps.connectmobile.training.atp.create.steps.b) obj).f45248a;
                if (cVar2 != null) {
                    cVar2.b();
                }
                return Unit.INSTANCE;
            case 21:
                return ParametersHolderKt.parametersOf(b63.o.Companion.b(b63.o.INSTANCE, ((l4.r) obj).f14958c));
            case 22:
                l4.g gVar = (l4.g) obj;
                Long lValueOf = Long.valueOf(gVar.f14880b);
                b63.u uVarA = b63.u.Companion.a(b63.u.INSTANCE, gVar.f14881c);
                b11.m mVar = gVar.f14884f;
                i01.i.Companion companion = i01.i.INSTANCE;
                String str = gVar.f14882d;
                companion.getClass();
                return ParametersHolderKt.parametersOf(lValueOf, uVarA, mVar, i01.i.Companion.a(str), gVar.b());
            case 23:
                return ParametersHolderKt.parametersOf(((l4.f) obj).f14875b);
            case 24:
                return ParametersHolderKt.parametersOf((f11.g.b) obj);
            case 25:
                l4.h hVar = (l4.h) obj;
                String str2 = hVar.f14889d;
                String str3 = hVar.f14890e;
                double d14 = hVar.f14891f;
                String str4 = hVar.f14892g;
                String str5 = hVar.f14893h;
                g01.u.Companion companion2 = g01.u.INSTANCE;
                String str6 = hVar.f14894i;
                companion2.getClass();
                l11.a.c.C2074c c2074c = new l11.a.c.C2074c(str2, str3, d14, str4, str5, g01.u.Companion.a(str6));
                b63.u uVarA2 = b63.u.Companion.a(b63.u.INSTANCE, hVar.f14887b);
                b11.m mVar2 = hVar.f14897l;
                i01.i.Companion companion3 = i01.i.INSTANCE;
                String str7 = hVar.f14895j;
                companion3.getClass();
                return ParametersHolderKt.parametersOf(uVarA2, mVar2, c2074c, i01.i.Companion.a(str7), hVar.b());
            case 26:
                l4.w0 w0Var = (l4.w0) obj;
                w0Var.getClass();
                return ParametersHolderKt.parametersOf(b63.u.Companion.a(b63.u.INSTANCE, w0Var.f14983b), w0Var.f14985d, w0Var.f14984c);
            case 27:
                return ParametersHolderKt.parametersOf((f11.a.b) obj);
            case 28:
                l4.a aVar5 = (l4.a) obj;
                String str8 = aVar5.f14831c;
                double d15 = aVar5.f14832d;
                String str9 = aVar5.f14833e;
                String str10 = aVar5.f14834f;
                String str11 = aVar5.f14835g;
                g01.u.Companion companion4 = g01.u.INSTANCE;
                String str12 = aVar5.f14838j;
                companion4.getClass();
                l11.a.c.C2073a c2073a = new l11.a.c.C2073a(str8, str9, d15, str10, str11, g01.u.Companion.a(str12), aVar5.f14836h, aVar5.f14837i);
                b63.u uVarA3 = b63.u.Companion.a(b63.u.INSTANCE, aVar5.f14830b);
                b11.m mVar3 = aVar5.f14841m;
                i01.i.Companion companion5 = i01.i.INSTANCE;
                String str13 = aVar5.f14839k;
                companion5.getClass();
                return ParametersHolderKt.parametersOf(uVarA3, mVar3, c2073a, i01.i.Companion.a(str13), aVar5.b());
            default:
                l4.k kVar = (l4.k) obj;
                l11.a.c.b bVar = new l11.a.c.b(kVar.f14912c);
                b63.u uVarA4 = b63.u.Companion.a(b63.u.INSTANCE, kVar.f14911b);
                b11.m mVar4 = kVar.f14915f;
                i01.i.Companion companion6 = i01.i.INSTANCE;
                String str14 = kVar.f14913d;
                companion6.getClass();
                return ParametersHolderKt.parametersOf(uVarA4, mVar4, bVar, i01.i.Companion.a(str14), kVar.b());
        }
    }

    public /* synthetic */ e(Object obj, int i14) {
        this.f78a = i14;
        this.f79b = obj;
    }
}
