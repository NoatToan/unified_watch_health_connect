package wz1;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.os.SystemClock;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import c22.q0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.steps.EmergencyCallingServicesFragment;
import com.garmin.android.apps.connectmobile.view.StyledInlineTextFieldViewDark;
import com.garmin.android.apps.connectmobile.x;
import com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag;
import com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag;
import d53.w;
import e23.l;
import j70.r;
import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.o1;
import p3.p1;
import p3.x3;
import r70.z;
import x01.k;
import x40.l0;
import xc0.o;
import xe2.y;
import xg0.n;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f188183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f188184c;

    public /* synthetic */ c(int i14, Object obj, Object obj2) {
        this.f188182a = i14;
        this.f188183b = obj;
        this.f188184c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f188182a;
        int i15 = 0;
        Object obj = this.f188184c;
        Object obj2 = this.f188183b;
        switch (i14) {
            case 0:
                e23.a aVar = (e23.a) obj2;
                o1 o1Var = (o1) obj;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - o1Var.j() >= 1000) {
                    o1Var.k(jElapsedRealtime);
                    aVar.invoke();
                }
                return Unit.INSTANCE;
            case 1:
                NutritionActivity.a aVar2 = NutritionActivity.f39581f;
                ((k) obj2).z4(false);
                q0.f23203a.getClass();
                q0.a.b((Context) obj, "com.myfitnesspal.android");
                return Unit.INSTANCE;
            case 2:
                CreateCustomCourseActivity createCustomCourseActivity = (CreateCustomCourseActivity) obj2;
                com.garmin.android.apps.connectmobile.courses.model.f fVar = (com.garmin.android.apps.connectmobile.courses.model.f) obj;
                CreateCustomCourseActivity.a aVar3 = CreateCustomCourseActivity.f33013f;
                if (createCustomCourseActivity.hasInternetConnection()) {
                    l0 l0VarFa = createCustomCourseActivity.fa();
                    l0VarFa.getClass();
                    l0VarFa.D4(new a50.e.h(fVar));
                } else {
                    createCustomCourseActivity.displayFailedMessage();
                    createCustomCourseActivity.fa().C4();
                    createCustomCourseActivity.fa().A4();
                }
                return Unit.INSTANCE;
            case 3:
                CreateCustomCourseActivity createCustomCourseActivity2 = (CreateCustomCourseActivity) obj2;
                CreateCustomCourseActivity.a aVar4 = CreateCustomCourseActivity.f33013f;
                l0 l0VarFa2 = createCustomCourseActivity2.fa();
                l0VarFa2.getClass();
                l0VarFa2.D4(new a50.e.b0((List) obj));
                createCustomCourseActivity2.fa().A4();
                return Unit.INSTANCE;
            case 4:
                CreateCustomCourseActivity createCustomCourseActivity3 = (CreateCustomCourseActivity) obj2;
                CreateCustomCourseActivity.a aVar5 = CreateCustomCourseActivity.f33013f;
                l0 l0VarFa3 = createCustomCourseActivity3.fa();
                l0VarFa3.getClass();
                l0VarFa3.D4(new a50.e.e0((PointOfInterestDTO) obj));
                createCustomCourseActivity3.fa().A4();
                return Unit.INSTANCE;
            case 5:
                CreateCustomCourseActivity createCustomCourseActivity4 = (CreateCustomCourseActivity) obj2;
                CreateCustomCourseActivity.a aVar6 = CreateCustomCourseActivity.f33013f;
                l0 l0VarFa4 = createCustomCourseActivity4.fa();
                l0VarFa4.getClass();
                l0VarFa4.D4(new a50.e.d0((fn0.a) obj));
                createCustomCourseActivity4.fa().A4();
                return Unit.INSTANCE;
            case 6:
                ((l0) obj2).D4(new a50.e.t0(((a50.g) obj).f1393d.f181476a));
                return Unit.INSTANCE;
            case 7:
                z zVar = (z) obj2;
                zVar.f151130n.k(null, Boolean.FALSE);
                r rVar = (r) ((p1) obj).getF182175a();
                if (rVar != null) {
                    zVar.x4(rVar, false);
                }
                return Unit.INSTANCE;
            case 8:
                ((l) obj2).invoke((x72.f) obj);
                return Unit.INSTANCE;
            case 9:
                ((l) obj2).invoke((x72.b) obj);
                return Unit.INSTANCE;
            case 10:
                ((l) obj2).invoke((x72.d) obj);
                return Unit.INSTANCE;
            case 11:
                l lVar = (l) obj;
                q91.d dVar = ((aa1.b) obj2).f2232c;
                if (dVar != null) {
                    lVar.invoke(dVar);
                }
                return Unit.INSTANCE;
            case 12:
                ((l) obj2).invoke(((aa1.e) obj).f2262d);
                return Unit.INSTANCE;
            case 13:
                ((l) obj2).invoke((n90.b) obj);
                return Unit.INSTANCE;
            case 14:
                EditPowerGuideStrategyActivity.a aVar7 = EditPowerGuideStrategyActivity.f40384t;
                ((e23.a) obj2).invoke();
                ((x) obj).dismiss();
                return Unit.INSTANCE;
            case 15:
                EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = (EditPowerGuideStrategyActivity) obj2;
                Long l14 = (Long) obj;
                androidx.appcompat.app.e eVar = editPowerGuideStrategyActivity.f40400p;
                if (eVar == null) {
                    s.m("powerGuideUpdatedDialog");
                    throw null;
                }
                eVar.dismiss();
                ab1.f fVar2 = editPowerGuideStrategyActivity.f40390f;
                if (fVar2 == null) {
                    s.m("powerGuideStrategyDetails");
                    throw null;
                }
                com.garmin.android.apps.connectmobile.courses.model.e eVar2 = fVar2.f2564b;
                if (editPowerGuideStrategyActivity.f40393i && eVar2 != null) {
                    editPowerGuideStrategyActivity.f40397m.h(editPowerGuideStrategyActivity, eVar2);
                }
                editPowerGuideStrategyActivity.setResult(-1);
                editPowerGuideStrategyActivity.finish();
                EditPowerGuideStrategyActivity.a aVar8 = EditPowerGuideStrategyActivity.f40384t;
                long jLongValue = l14 != null ? l14.longValue() : -1L;
                String strValueOf = String.valueOf(editPowerGuideStrategyActivity.f40392h);
                aVar8.getClass();
                EditPowerGuideStrategyActivity.a.a(editPowerGuideStrategyActivity, jLongValue, strValueOf, 345);
                return Unit.INSTANCE;
            case 16:
                com.garmin.android.apps.connectmobile.devices.settings.realtime.c cVar = (com.garmin.android.apps.connectmobile.devices.settings.realtime.c) obj2;
                Logger logger = com.garmin.android.apps.connectmobile.devices.settings.realtime.c.f34371f;
                ComposeView composeView = new ComposeView(cVar.f34372a, null, 0, 6, null);
                composeView.setContent(new z3.e(-2086251621, true, new o((String) obj, cVar, composeView, i15)));
                return composeView;
            case 17:
                y yVar = (y) obj2;
                ve2.s sVar = (ve2.s) obj;
                TextView textView = yVar.f190583g;
                if (textView == null) {
                    s.m("skipSignInText");
                    throw null;
                }
                textView.setText(w.i0(sVar.f177849a).toString());
                textView.setOnClickListener(new xe2.s(yVar, 1));
                textView.setVisibility(0);
                return Unit.INSTANCE;
            case 18:
                y yVar2 = (y) obj2;
                ve2.d dVar2 = (ve2.d) obj;
                TextView textView2 = yVar2.f190582f;
                if (textView2 != null) {
                    textView2.setText(yVar2.getString(R.string.ssoSignInAsUserText, dVar2.f177692c));
                    return Unit.INSTANCE;
                }
                s.m("customerNameText");
                throw null;
            case 19:
                y yVar3 = (y) obj2;
                Bitmap bitmap = (Bitmap) obj;
                ImageView imageView = yVar3.f190581e;
                if (imageView == null) {
                    s.m("customerImage");
                    throw null;
                }
                imageView.setImageBitmap(bitmap);
                ImageView imageView2 = yVar3.f190581e;
                if (imageView2 != null) {
                    imageView2.setTag("");
                    return Unit.INSTANCE;
                }
                s.m("customerImage");
                throw null;
            case 20:
                return MobileAuthAbstractWebFrag.showWebViewError$lambda$15((MobileAuthAbstractWebFrag) obj2, (String) obj);
            case 21:
                return MobileAuthBgBlurCapableFrag.updateToolbarTitle$lambda$5((MobileAuthBgBlurCapableFrag) obj2, (String) obj);
            case 22:
                ((n) obj2).J1((wg0.g) obj);
                return Unit.INSTANCE;
            case 23:
                ((n) obj2).o4((wg0.a) obj, null);
                return Unit.INSTANCE;
            case 24:
                ((xi1.d) obj2).f191134b.k(null, Boolean.valueOf(!((Boolean) ((x3) obj).getF182175a()).booleanValue()));
                return Unit.INSTANCE;
            case 25:
                xi2.b.a aVar9 = (xi2.b.a) obj;
                ConnectivityManager connectivityManager = ((xi2.c) obj2).f191150a;
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(aVar9);
                }
                return Unit.INSTANCE;
            case 26:
                EmergencyCallingServicesFragment emergencyCallingServicesFragment = (EmergencyCallingServicesFragment) obj;
                int i16 = EmergencyCallingServicesFragment.f43825f;
                ((StyledInlineTextFieldViewDark) obj2).setHasError(false);
                TextView textView3 = emergencyCallingServicesFragment.f43830e;
                if (textView3 == null) {
                    s.m("validationMessage");
                    throw null;
                }
                if (textView3.getVisibility() == 4) {
                    TextView textView4 = emergencyCallingServicesFragment.f43830e;
                    if (textView4 == null) {
                        s.m("validationMessage");
                        throw null;
                    }
                    textView4.setVisibility(0);
                }
                return Unit.INSTANCE;
            case 27:
                ((xm0.y) obj2).f191485a.Q2((xm0.k) obj);
                return Unit.INSTANCE;
            case 28:
                int i17 = xn.l.f191612f;
                h82.c.f((xn.l) obj2, (Context) obj, "https://www.garmin.com/");
                return Unit.INSTANCE;
            default:
                List<Integer> list = xn.x.f191633p;
                ((xn.x) obj2).e((String) obj);
                return Unit.INSTANCE;
        }
    }
}
