package ls0;

import am.x0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.EditText;
import android.widget.Toast;
import androidx.lifecycle.v1;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.activities.stats.rounds.edit.EditExerciseSetActivity;
import com.garmin.android.apps.connectmobile.activities.stats.rounds.edit.EditExerciseSetsActivity;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupTransferOwnershipActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripFlightFragment;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.StyledInlineTextFieldViewDark;
import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import e2.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l72.i3;
import lc.m0;
import m92.h0;
import o53.s0;
import p005kotlin.Unit;
import p006l2.y1;
import p13.j0;
import p13.k0;
import p13.u0;
import p3.m1;
import p3.n1;
import p3.p1;
import p3.x3;
import qt1.t0;
import rk0.o0;
import x5.l0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f114722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f114723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f114724d;

    public /* synthetic */ h(Object obj, int i14, Object obj2, Object obj3) {
        this.f114721a = i14;
        this.f114722b = obj;
        this.f114723c = obj2;
        this.f114724d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:134:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:135:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:138:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:140:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:141:0x04fa  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        double dDoubleValue;
        double d14;
        List listA;
        n92.o oVar;
        Object next;
        n92.o oVar2;
        Float fG;
        float fFloatValue;
        Float fG2;
        float fFloatValue2;
        MapAnimationOptions mapAnimationOptionsBuild;
        Intent intent;
        Parcelable parcelable;
        pt1.p pVar;
        int i14 = this.f114721a;
        int i15 = 12;
        int i16 = 0;
        Object obj2 = this.f114724d;
        Object obj3 = this.f114723c;
        Object obj4 = this.f114722b;
        switch (i14) {
            case 0:
                TripFlightFragment tripFlightFragment = (TripFlightFragment) obj4;
                ms0.e eVar = (ms0.e) obj3;
                yr0.n nVar = (yr0.n) obj;
                int i17 = TripFlightFragment.f37039n;
                nVar.getClass();
                tripFlightFragment.w6().f114746c.f198999g = nVar.f199033a;
                tripFlightFragment.w6().f114746c.f199000h = nVar.f199034b;
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = eVar.f120466b;
                styledInlineTextFieldViewDark.getClass();
                EditText editText = styledInlineTextFieldViewDark.editText;
                editText.getClass();
                editText.removeTextChangedListener((com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.c) obj2);
                Unit unit = Unit.INSTANCE;
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = eVar.f120466b;
                EditText editText2 = styledInlineTextFieldViewDark2.editText;
                editText2.clearFocus();
                v22.e.c(editText2, styledInlineTextFieldViewDark2);
                return Unit.INSTANCE;
            case 1:
                i53.c cVar = (i53.c) obj4;
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                f0Var.a(cVar.size(), null, new ly0.g.e(ly0.g.d.f115301a, cVar), new z3.e(802480018, true, new ly0.g.f(cVar, (fy0.e) obj3, (e23.l) obj2)));
                return Unit.INSTANCE;
            case 2:
                i53.c cVar2 = (i53.c) obj4;
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                f0Var2.a(cVar2.size(), null, new ly0.g.h(ly0.g.C2196g.f115307a, cVar2), new z3.e(802480018, true, new ly0.g.i(cVar2, (e23.a) obj3, (fy0.e) obj2)));
                return Unit.INSTANCE;
            case 3:
                Context context = (Context) obj;
                context.getClass();
                GCMMapView gCMMapView = new GCMMapView(context);
                gCMMapView.f(null, (com.garmin.android.library.mapsdkadapter.i.d) ((x3) obj4).getF182175a(), new ie2.l(((Number) ((x3) obj3).getF182175a()).intValue(), false, null, 0.0f, null, null, null, null, null, null, null, null, 4094, null), new ly0.g.a((ly0.o) obj2, gCMMapView));
                gCMMapView.onCreate(null);
                return gCMMapView;
            case 4:
                e23.l lVar = (e23.l) obj4;
                n30.e eVar2 = (n30.e) obj3;
                p1 p1Var = (p1) obj2;
                a60.a aVar = (a60.a) obj;
                aVar.getClass();
                a60.b bVarA = (a60.b) p1Var.getF182175a();
                if (aVar instanceof a60.a.h) {
                    bVarA = a60.b.a(bVarA, null, ((a60.a.h) aVar).f1534a, false, false, false, null, null, 16381);
                } else if (aVar instanceof a60.a.c) {
                    bVarA = a60.b.a(bVarA, null, null, ((a60.a.c) aVar).f1529a, false, false, null, null, 16375);
                } else if (aVar instanceof a60.a.b) {
                    bVarA = a60.b.a(bVarA, null, null, false, ((a60.a.b) aVar).f1528a, false, null, null, 16367);
                } else if (aVar instanceof a60.a.d) {
                    bVarA = a60.b.a(bVarA, null, null, false, false, ((a60.a.d) aVar).f1530a, null, null, 16351);
                } else if (aVar instanceof a60.a.f) {
                    bVarA = a60.b.a(bVarA, null, null, false, false, false, ((a60.a.f) aVar).f1532a, null, 16319);
                } else if (aVar instanceof a60.a.e) {
                    bVarA = a60.b.a(bVarA, null, null, false, false, false, null, ((a60.a.e) aVar).f1531a, 15359);
                }
                p1Var.setValue(bVarA);
                if (b60.a.b(((a60.b) p1Var.getF182175a()).f1542h, ((a60.b) p1Var.getF182175a()).f1543i, ((a60.b) p1Var.getF182175a()).f1541g)) {
                    a60.b bVar = (a60.b) p1Var.getF182175a();
                    int i18 = eVar2.f123452g;
                    boolean z14 = bVar.f1546l;
                    Double d15 = bVar.f1541g;
                    if (z14) {
                        l3.a aVar2 = l3.f23124b;
                        dDoubleValue = d15 != null ? d15.doubleValue() : 0.0d;
                        aVar2.getClass();
                        d14 = 1000.0d;
                    } else {
                        l3.a aVar3 = l3.f23124b;
                        dDoubleValue = d15 != null ? d15.doubleValue() : 0.0d;
                        aVar3.getClass();
                        d14 = 1609.344d;
                    }
                    lVar.invoke(new n30.e(bVar.f1536b, bVar.f1538d, bVar.f1539e, bVar.f1540f, dDoubleValue * d14, bVar.f1545k, i18));
                }
                return Unit.INSTANCE;
            case 5:
                x72.e eVar3 = (x72.e) obj;
                int i19 = PreviewCatalogActivity.f49781a;
                eVar3.getClass();
                ge1.b.T((o53.b0) obj4, null, null, new PreviewCatalogActivity.b((e23.l) obj2, eVar3, null), 3);
                ((e23.a) obj3).invoke();
                return Unit.INSTANCE;
            case 6:
                List list = (List) obj4;
                f0 f0Var3 = (f0) obj;
                int i24 = PreviewCatalogActivity.f49781a;
                f0Var3.getClass();
                f0Var3.a(list.size(), new PreviewCatalogActivity.g(new m30.n(12), list), new PreviewCatalogActivity.h(PreviewCatalogActivity.f.f49792a, list), new z3.e(802480018, true, new PreviewCatalogActivity.i(list, (PreviewCatalogActivity) obj3, (m0) obj2)));
                m72.h.f117107a.getClass();
                f0.b(f0Var3, null, m72.h.f117109c, 3);
                return Unit.INSTANCE;
            case 7:
                i53.c<m92.d0> cVar3 = (i53.c) obj4;
                Float f14 = (Float) obj3;
                n92.a aVar4 = (n92.a) obj2;
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                if (aVar4 == null || (oVar2 = aVar4.f125056a) == null || (listA = oVar2.a()) == null) {
                    listA = (aVar4 == null || (oVar = aVar4.f125057b) == null) ? j0.f134944a : oVar.a();
                }
                ArrayList arrayList = new ArrayList();
                for (m92.d0 d0Var : cVar3) {
                    float f15 = d0Var.f117279a;
                    boolean z15 = d0Var.f117282d;
                    float f16 = d0Var.f117283e;
                    o4.d0 d0Var2 = d0Var.f117284f;
                    i53.c<h0.e.a> cVar4 = d0Var.f117281c;
                    o13.p pVar2 = (o13.p) p13.h0.d0(listA);
                    Float f17 = pVar2 != null ? (Float) pVar2.f128594a : null;
                    o13.p pVar3 = (o13.p) p13.h0.n0(listA);
                    arrayList.add(m92.c0.e(fVar, f15, d0Var.f117280b, z15, f16, null, d0Var2, cVar4, f14, null, null, f17, pVar3 != null ? (Float) pVar3.f128594a : null, d0Var.f117285g, d0Var.f117286h, d0Var.f117287i, 784));
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    while (it.hasNext()) {
                        next = u0.h((Map) next, (Map) it.next());
                    }
                } else {
                    next = null;
                }
                Map map = (Map) next;
                i53.g gVarK = map != null ? i53.a.k(map) : null;
                if (gVarK != null) {
                    return gVarK;
                }
                k0 k0Var = k0.f134949a;
                k0Var.getClass();
                return k0Var;
            case 8:
                ((CustomLineChart) obj).getClass();
                qz.a.b((tz.a) obj4, (kw0.f) obj3, (String) obj2, 4);
                return Unit.INSTANCE;
            case 9:
                j23.e eVar4 = (j23.e) obj4;
                e23.l lVar2 = (e23.l) obj3;
                p1 p1Var2 = (p1) obj2;
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                String str = l0Var.f188878a.f157138b;
                while (true) {
                    if (i16 >= str.length()) {
                        if (str.length() <= 3) {
                            p1Var2.setValue(l0Var);
                            fG = d53.s.g(str);
                            if (fG != null) {
                                fFloatValue = fG.floatValue();
                            } else {
                                fFloatValue = Float.valueOf(eVar4.f96789a).floatValue();
                            }
                            if (fFloatValue <= Float.valueOf(eVar4.f96790b).floatValue()) {
                                fG2 = d53.s.g(str);
                                if (fG2 != null) {
                                    fFloatValue2 = fG2.floatValue();
                                } else {
                                    fFloatValue2 = 0.0f;
                                }
                                lVar2.invoke(Float.valueOf(fFloatValue2));
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (Character.isDigit(str.charAt(i16))) {
                        i16++;
                    }
                    if (str.length() == 0) {
                        p1Var2.setValue(l0Var);
                        fG = d53.s.g(str);
                        if (fG != null) {
                            fFloatValue = fG.floatValue();
                        } else {
                            fFloatValue = Float.valueOf(eVar4.f96789a).floatValue();
                        }
                        if (fFloatValue <= Float.valueOf(eVar4.f96790b).floatValue()) {
                            fG2 = d53.s.g(str);
                            if (fG2 != null) {
                                fFloatValue2 = fG2.floatValue();
                            } else {
                                fFloatValue2 = 0.0f;
                            }
                            lVar2.invoke(Float.valueOf(fFloatValue2));
                        }
                    }
                    return Unit.INSTANCE;
                }
            case 10:
                ((y1) obj).getClass();
                ((m4.q) obj4).y(false);
                ((e23.l) obj3).invoke((l0) obj2);
                return Unit.INSTANCE;
            case 11:
                zc.d dVar = (zc.d) obj4;
                f0 f0Var4 = (f0) obj;
                f0Var4.getClass();
                f0.b(f0Var4, null, new z3.e(-685160913, true, new j21.p((String) obj3, i15)), 3);
                f0.f(f0Var4, dVar.b(), new zc.a(new mi0.i(28), dVar), new z3.e(1189764934, true, new dl0.f(dVar, (e23.l) obj2, 2)), 4);
                return Unit.INSTANCE;
            case 12:
                f4.s sVar = (f4.s) obj4;
                lc.v vVar = (lc.v) obj3;
                sVar.add(vVar);
                return new nc.i((nc.k) obj2, vVar, sVar);
            case 13:
                Long l14 = (Long) obj4;
                ne2.n nVar2 = (ne2.n) obj3;
                ne2.s sVar2 = (ne2.s) obj2;
                CameraOptions cameraOptions = (CameraOptions) obj;
                cameraOptions.getClass();
                if (l14 == null || (mapAnimationOptionsBuild = new MapAnimationOptions.Builder().duration(l14.longValue()).build()) == null) {
                    MapAnimationOptions.Builder builder = new MapAnimationOptions.Builder();
                    Long l15 = nVar2.f125691c;
                    if (l15 != null) {
                        builder.duration(l15.longValue());
                    }
                    mapAnimationOptionsBuild = builder.build();
                }
                ne2.v.b(sVar2, cameraOptions, mapAnimationOptionsBuild);
                return Unit.INSTANCE;
            case 14:
                qs.g gVar = (qs.g) obj4;
                com.garmin.android.apps.connectmobile.activities.manual.eventType.b.a aVar5 = com.garmin.android.apps.connectmobile.activities.manual.eventType.b.f29199g;
                ((qs.g) obj).getClass();
                ((p1) obj2).setValue(gVar);
                ((com.garmin.android.apps.connectmobile.activities.manual.eventType.b) obj3).v6().f133057g = gVar;
                return Unit.INSTANCE;
            case 15:
                EditExerciseSetsActivity editExerciseSetsActivity = (EditExerciseSetsActivity) obj4;
                com.garmin.android.apps.connectmobile.repcounting.model.c cVar5 = (com.garmin.android.apps.connectmobile.repcounting.model.c) obj2;
                sq.a aVar6 = (sq.a) obj;
                EditExerciseSetsActivity.a aVar7 = EditExerciseSetsActivity.f29937e;
                aVar6.getClass();
                EditExerciseSetActivity.f29932e.getClass();
                cVar5.getClass();
                Intent intent2 = new Intent(editExerciseSetsActivity, (Class<?>) EditExerciseSetActivity.class);
                com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent2, h7.c.a(new o13.p("GCM_extra_activity_type", (x0) obj3), new o13.p("EXTRA_EXERCISE_SET", aVar6), new o13.p("EXTRA_EXERCISE_LIST", cVar5)));
                editExerciseSetsActivity.startActivityForResult(intent2, 1001);
                return Unit.INSTANCE;
            case 16:
                nw0.r rVar = (nw0.r) obj3;
                ((p1) obj2).setValue(Boolean.valueOf(og2.k.y((pv0.b) obj)));
                if (((nw0.j0) obj4) instanceof nw0.j0.a) {
                    rVar.B4(null);
                }
                return Unit.INSTANCE;
            case 17:
                Context context2 = (Context) obj4;
                e23.a aVar8 = (e23.a) obj3;
                m0 m0Var = (m0) obj2;
                f.a aVar9 = (f.a) obj;
                aVar9.getClass();
                if (aVar9.f67585a == -1) {
                    ActiveTrainingPlansActivity.a.d(ActiveTrainingPlansActivity.f45098w, context2, false, false, false, null, 126);
                    aVar8.invoke();
                } else {
                    fy1.c.f73884a.getClass();
                    fy1.c.a();
                    lc.y.q(m0Var, nw1.d.a.INSTANCE);
                }
                return Unit.INSTANCE;
            case 18:
                Context context3 = (Context) obj4;
                e23.a aVar10 = (e23.a) obj3;
                lw1.f fVar2 = (lw1.f) obj2;
                f.a aVar11 = (f.a) obj;
                aVar11.getClass();
                Intent intent3 = aVar11.f67586b;
                int i25 = aVar11.f67585a;
                if (i25 == -1) {
                    if (intent3 == null || !intent3.getBooleanExtra("fetch_active_plans_key", false)) {
                        fVar2.y4(intent3 != null ? intent3.getIntExtra("GCM_tp_completed_plans", 0) : 0);
                    } else {
                        ActiveTrainingPlansActivity.a.d(ActiveTrainingPlansActivity.f45098w, context3, false, false, false, null, 126);
                        aVar10.invoke();
                    }
                }
                if (i25 == 12) {
                    ActiveTrainingPlansActivity.a.d(ActiveTrainingPlansActivity.f45098w, context3, false, false, false, null, 126);
                    aVar10.invoke();
                }
                return Unit.INSTANCE;
            case 19:
                int iIntValue = ((Integer) obj).intValue();
                ((n1) obj2).t(iIntValue);
                Toast.makeText((Context) obj4, sn.a.e(iIntValue, "Selected dateRange[", "] ", ((t82.a) ((i53.c) obj3).get(iIntValue)).f163158a), 1).show();
                return Unit.INSTANCE;
            case 20:
                q4.f fVar3 = (q4.f) obj;
                fVar3.getClass();
                float f18 = 2;
                o92.d.b(fVar3, Float.intBitsToFloat((int) (fVar3.b() >> 32)) / f18, Float.intBitsToFloat((int) (fVar3.b() & 4294967295L)) / f18, (o92.b) obj4, ((m1) obj3).getFloatValue(), ((m1) obj2).getFloatValue());
                return Unit.INSTANCE;
            case 21:
                ok0.m mVar = (ok0.m) obj4;
                e23.l lVar3 = (e23.l) obj3;
                Context context4 = (Context) obj2;
                f.a aVar12 = (f.a) obj;
                aVar12.getClass();
                if (aVar12.f67585a == -1 && (intent = aVar12.f67586b) != null) {
                    GearActivity.f35500b.getClass();
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) intent.getParcelableExtra("GearDetailsScreen_Edited", o0.class);
                    } else {
                        Parcelable parcelableExtra = intent.getParcelableExtra("GearDetailsScreen_Edited");
                        parcelable = (o0) (!(parcelableExtra instanceof o0) ? null : parcelableExtra);
                    }
                    o0 o0Var = (o0) parcelable;
                    if (o0Var != null) {
                        if (o0Var.f153244g) {
                            mVar.j1(o0Var.f153238a);
                            String string = context4.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            lVar3.invoke(string);
                        } else if (o0Var.f()) {
                            mVar.E3();
                        }
                    }
                }
                return Unit.INSTANCE;
            case 22:
                zc.d dVar2 = (zc.d) obj4;
                f0 f0Var5 = (f0) obj;
                GroupTransferOwnershipActivity.a aVar13 = GroupTransferOwnershipActivity.f36209d;
                f0Var5.getClass();
                f0.f(f0Var5, dVar2.b(), null, new z3.e(-1342331729, true, new i91.e(dVar2, 19, (p1) obj3, (p1) obj2)), 6);
                return Unit.INSTANCE;
            case 23:
                ((CustomLineChart) obj).getClass();
                qz.a.b((tz.a) obj4, (gs1.t) obj3, (String) obj2, 4);
                return Unit.INSTANCE;
            case 24:
                Activity activity = (Activity) obj4;
                p1 p1Var3 = (p1) obj3;
                p1 p1Var4 = (p1) obj2;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                String str2 = i3Var.f111063a;
                if (p005kotlin.jvm.internal.s.g(str2, "HELP")) {
                    ir0.d dVar3 = ((or0.q) p1Var3.getF182175a()).f133398b ? ((or0.q) p1Var3.getF182175a()).f133402f : null;
                    or0.j.f133348g.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("KEY_INTENSITY_MINUTES_EXTRA", dVar3);
                    HelpActivity.a aVar14 = HelpActivity.f36653a;
                    ro0.l lVar4 = ro0.l.INTENSITY_MINUTES;
                    aVar14.getClass();
                    HelpActivity.a.d(activity, lVar4, "DEFAULT_ACTION", bundle);
                } else if (p005kotlin.jvm.internal.s.g(str2, "EDIT_GOAL")) {
                    p1Var4.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 25:
                lr0.a aVar15 = (lr0.a) obj4;
                Activity activity2 = (Activity) obj3;
                c.q qVar = (c.q) obj2;
                ir0.b bVar2 = (ir0.b) obj;
                bVar2.getClass();
                if (bVar2.d()) {
                    aVar15.b(activity2, bVar2);
                } else {
                    ActivityListItemDTO activityListItemDTO = bVar2.f94783b;
                    if (activityListItemDTO != null) {
                        qVar.a(aVar15.a(activity2, activityListItemDTO), null);
                    }
                }
                return Unit.INSTANCE;
            case 26:
                n82.f fVar4 = (n82.f) obj4;
                or0.m mVar2 = (or0.m) obj2;
                fVar4.d((o82.g) ((i53.f) obj3).get(((Integer) obj).intValue()));
                o82.g gVarA = fVar4.f124961b.a();
                mVar2.getClass();
                gVarA.getClass();
                b63.o.INSTANCE.getClass();
                fVar4.f(new o82.a(b63.o.Companion.a(0), gVarA == o82.g.f130850c ? mVar2.f133364c : mVar2.f133366e));
                return Unit.INSTANCE;
            case 27:
                qt1.a aVar16 = (qt1.a) obj4;
                qt1.k kVar = (qt1.k) obj2;
                ((Long) obj).getClass();
                ot1.u uVar = ot1.u.f133824a;
                pt1.p pVar4 = ((pt1.o) ((p1) obj3).getF182175a()).f140912j;
                if (pVar4 != null) {
                    pt1.t tVar = new pt1.t(pVar4.f140929a, pVar4.f140930b, pVar4.f140931c, pVar4.f140932d, pVar4.f140933e, pVar4.f140937i, pVar4.f140934f, pVar4.f140935g, pVar4.f140940l, pVar4.f140941m, pVar4.f140942n, pVar4.f140943o, pVar4.f140944p, pVar4.f140945q, pVar4.f140946r, pVar4.f140947s, pVar4.f140948t, pVar4.f140949u, pVar4.f140951w);
                    ot1.j jVar = new ot1.j(kVar, 9);
                    aVar16.getClass();
                    vs1.t tVar2 = aVar16.f147506t;
                    p90.h hVar = new p90.h(aVar16, 15, jVar, tVar);
                    tVar2.getClass();
                    o53.b0 b0Var = tVar2.f179893b;
                    if (tVar.f140980n) {
                        x53.c cVar6 = s0.f129406a;
                        ge1.b.T(b0Var, x53.b.f189152a, null, new vs1.s(tVar2, tVar, true, hVar, null), 2);
                    } else {
                        x53.c cVar7 = s0.f129406a;
                        ge1.b.T(b0Var, x53.b.f189152a, null, new vs1.q(tVar2, tVar, true, hVar, null), 2);
                    }
                }
                return Unit.INSTANCE;
            case 28:
                qt1.k kVar2 = (qt1.k) obj4;
                Context context5 = (Context) obj3;
                pt1.l lVar5 = (pt1.l) obj;
                ot1.u uVar2 = ot1.u.f133824a;
                lVar5.getClass();
                oe.j jVar2 = new oe.j(13, (c.q) obj2, lVar5);
                context5.getClass();
                w9.a aVarA = v1.a(kVar2);
                x53.c cVar8 = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new t0(kVar2, lVar5, context5, jVar2, null), 2);
                return Unit.INSTANCE;
            default:
                x3 x3Var = (x3) obj4;
                qt1.k kVar3 = (qt1.k) obj3;
                Context context6 = (Context) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ot1.u uVar3 = ot1.u.f133824a;
                if (zBooleanValue && (pVar = ((pt1.o) x3Var.getF182175a()).f140912j) != null) {
                    long j8 = pVar.f140930b;
                    context6.getClass();
                    vs1.w wVar = kVar3.f147688y;
                    wVar.getClass();
                    o53.b0 b0Var2 = wVar.f179918a;
                    x53.c cVar9 = s0.f129406a;
                    ge1.b.T(b0Var2, x53.b.f189152a, null, new vs1.v(wVar, j8, context6, null), 2);
                }
                return Unit.INSTANCE;
        }
    }
}
