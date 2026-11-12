package ap;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.NumberPicker;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.w0;
import androidx.lifecycle.w1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.photos.GroupPostViewImageActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.r0;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.photos.EpicViewImageActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.x;
import e2.d0;
import e2.i0;
import f2.p0;
import f4.s;
import g2.r1;
import g22.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lc.u0;
import ng1.c1;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p5.k0;
import po2.o;
import v.e0;
import vn2.e1;
import vn2.g0;
import xk1.v;
import xn2.p;
import ya1.r;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11583c;

    public /* synthetic */ b(int i14, Object obj, int i15) {
        this.f11581a = i15;
        this.f11582b = i14;
        this.f11583c = obj;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        ab1.g powerGuidanceSummary;
        int i14 = this.f11581a;
        int i15 = 4;
        int i16 = this.f11582b;
        Object obj2 = this.f11583c;
        switch (i14) {
            case 0:
                List list = (List) obj;
                int i17 = d.f11588o;
                list.getClass();
                ((w0) obj2).j(h0.e0(i16, list));
                return Unit.INSTANCE;
            case 1:
                GroupPostViewImageActivity groupPostViewImageActivity = (GroupPostViewImageActivity) obj2;
                g3 g3Var = (g3) obj;
                GroupPostViewImageActivity.a aVar = GroupPostViewImageActivity.f29703m;
                g3Var.getClass();
                int i18 = GroupPostViewImageActivity.b.f29707a[g3Var.f35300a.ordinal()];
                if (i18 == 1) {
                    groupPostViewImageActivity.hideProgressOverlay();
                    groupPostViewImageActivity.ga(i16);
                } else if (i18 == 2) {
                    groupPostViewImageActivity.hideProgressOverlay();
                    groupPostViewImageActivity.displayFailedMessage();
                } else {
                    if (i18 != 3) {
                        u0.r();
                        return null;
                    }
                    groupPostViewImageActivity.showProgressOverlay();
                }
                return Unit.INSTANCE;
            case 2:
                r1 r1Var = (r1) obj;
                d0 d0Var = ((i0) obj2).f62434a;
                f4.f.f68735e.getClass();
                f4.f fVarA = f4.f.a.a();
                f4.f.a.e(fVarA, f4.f.a.b(fVarA), fVarA != null ? fVarA.getF68733f() : null);
                d0Var.a(r1Var, i16);
                return Unit.INSTANCE;
            case 3:
                r1 r1Var2 = (r1) obj;
                f2.h0 h0Var = ((p0) obj2).f68261a;
                f4.f.f68735e.getClass();
                f4.f fVarA2 = f4.f.a.a();
                f4.f.a.e(fVarA2, f4.f.a.b(fVarA2), fVarA2 != null ? fVarA2.getF68733f() : null);
                h0Var.a(r1Var2, i16);
                return Unit.INSTANCE;
            case 4:
                List list2 = (List) obj;
                Parcelable.Creator<s<Object>> creator = s.CREATOR;
                return Boolean.valueOf(list2.addAll(i16, (Collection) obj2));
            case 5:
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a aVar2 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a) obj2;
                w1 w1Var = aVar2.f49095a;
                m52.k kVar = (m52.k) obj;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a.C0961a c0961a = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a.f49094h;
                kVar.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.i iVar = aVar2.f49096b;
                if (iVar == null) {
                    p005kotlin.jvm.internal.s.m("adapter");
                    throw null;
                }
                ArrayList arrayList = new ArrayList(iVar.r());
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.i iVar2 = aVar2.f49096b;
                if (iVar2 == null) {
                    p005kotlin.jvm.internal.s.m("adapter");
                    throw null;
                }
                if (iVar2.r().size() == 1) {
                    arrayList.add(com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c.Z4());
                }
                ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c) w1Var.getValue()).X4(i16, kVar, arrayList, true);
                return Unit.INSTANCE;
            case 6:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                p5.h0.n(k0Var, ((b10.c) obj2).b(i16));
                return Unit.INSTANCE;
            case 7:
                com.garmin.android.apps.connectmobile.connections.groups.details.d dVar = (com.garmin.android.apps.connectmobile.connections.groups.details.d) obj2;
                String str = (String) obj;
                int i19 = com.garmin.android.apps.connectmobile.connections.groups.details.d.f31487h;
                str.getClass();
                dVar.f31488d = str;
                boolean zD = n.d(str);
                ArrayList arrayList2 = dVar.f96386a;
                if (zD) {
                    Integer numValueOf = Integer.valueOf(i16);
                    if (!arrayList2.contains(numValueOf)) {
                        arrayList2.add(numValueOf);
                    }
                } else {
                    Integer numValueOf2 = Integer.valueOf(i16);
                    if (arrayList2.contains(numValueOf2)) {
                        arrayList2.remove(numValueOf2);
                    }
                }
                ((j10.n) dVar.f31489e).f96387a.f31449a.f31574q = str;
                return Unit.INSTANCE;
            case 8:
                g3 g3Var2 = (g3) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.f.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f.R0;
                g3Var2.getClass();
                ((com.garmin.android.apps.connectmobile.leaderboard.challenges.f) obj2).i7(g3Var2, i16);
                return Unit.INSTANCE;
            case 9:
                g3 g3Var3 = (g3) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.k.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.k.O0;
                g3Var3.getClass();
                ((com.garmin.android.apps.connectmobile.leaderboard.challenges.k) obj2).i7(g3Var3, i16);
                return Unit.INSTANCE;
            case 10:
                g3 g3Var4 = (g3) obj;
                r0.a aVar5 = r0.K0;
                g3Var4.getClass();
                ((r0) obj2).i7(g3Var4, i16);
                return Unit.INSTANCE;
            case 11:
                g3 g3Var5 = (g3) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.a aVar6 = com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.M0;
                g3Var5.getClass();
                ((com.garmin.android.apps.connectmobile.leaderboard.challenges.w0) obj2).i7(g3Var5, i16);
                return Unit.INSTANCE;
            case 12:
                EpicViewImageActivity epicViewImageActivity = (EpicViewImageActivity) obj2;
                g3 g3Var6 = (g3) obj;
                EpicViewImageActivity.a aVar7 = EpicViewImageActivity.f39276m;
                g3Var6.getClass();
                int i24 = EpicViewImageActivity.c.f39281a[g3Var6.f35300a.ordinal()];
                if (i24 == 1) {
                    epicViewImageActivity.hideProgressOverlay();
                    ArrayList arrayList3 = epicViewImageActivity.f39278k;
                    epicViewImageActivity.f82680f = true;
                    ia1.a aVar8 = epicViewImageActivity.f82677c;
                    if (aVar8 != null) {
                        aVar8.b(i16);
                    }
                    if (i16 < 0 || i16 >= arrayList3.size()) {
                        String strF = e0.f(i16, "Position: ", " is out of bounds.");
                        i2.a aVar9 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar9.getClass();
                        i2.a.f(a2Var, "EpicViewImageActivity", strF);
                    } else {
                        arrayList3.remove(i16);
                    }
                    ia1.a aVar10 = epicViewImageActivity.f82677c;
                    if (aVar10 != null && aVar10.f92438h.size() == 0) {
                        epicViewImageActivity.fa();
                    }
                    epicViewImageActivity.ea();
                } else if (i24 == 2) {
                    epicViewImageActivity.hideProgressOverlay();
                    epicViewImageActivity.displayFailedMessage();
                } else {
                    if (i24 != 3) {
                        u0.r();
                        return null;
                    }
                    epicViewImageActivity.showProgressOverlay();
                }
                return Unit.INSTANCE;
            case 13:
                List list3 = (List) obj;
                list3.getClass();
                w13.c cVar = n02.g.f122178e;
                Object obj3 = list3.get(0);
                obj3.getClass();
                n02.g gVar = (n02.g) cVar.get(((Integer) obj3).intValue());
                Object obj4 = list3.get(1);
                obj4.getClass();
                double dDoubleValue = ((Double) obj4).doubleValue();
                Object obj5 = list3.get(2);
                obj5.getClass();
                return p3.p0.n(new n02.f(gVar, dDoubleValue, (i53.d) obj2, this.f11582b, ((Boolean) obj5).booleanValue()));
            case 14:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                p5.h0.n(k0Var2, ((pn1.f) obj2).f138687b.b(i16));
                return Unit.INSTANCE;
            case 15:
                androidx.appcompat.app.e.a aVar11 = (androidx.appcompat.app.e.a) obj;
                aVar11.getClass();
                aVar11.setTitle(R.string.wallet_unable_to_remove_card);
                aVar11.setMessage(aVar11.getContext().getString(R.string.wallet_cannot_remove_card_in_specified_days, String.valueOf(i16)));
                aVar11.setPositiveButton(R.string.lbl_ok, new c1((o) obj2, 12));
                aVar11.setCancelable(false);
                return Unit.INSTANCE;
            case 16:
                ua1.c cVar2 = (ua1.c) obj2;
                ok1.b bVar = (ok1.b) obj;
                PowerZonesDTO powerZonesDTO = bVar.f132582a;
                if (powerZonesDTO != null) {
                    ok1.a aVar12 = ok1.a.f132581a;
                    powerZonesDTO.f43987b = i16;
                    ok1.a.d(powerZonesDTO);
                }
                cVar2.f169609e.l(bVar, new ua1.h.a(cVar2, i16));
                return Unit.INSTANCE;
            case 17:
                com.garmin.android.apps.connectmobile.group.details.invite.b bVar2 = (com.garmin.android.apps.connectmobile.group.details.invite.b) obj2;
                g3 g3Var7 = (g3) obj;
                com.garmin.android.apps.connectmobile.group.details.invite.b.a aVar13 = com.garmin.android.apps.connectmobile.group.details.invite.b.f36368o;
                g3Var7.getClass();
                int i25 = com.garmin.android.apps.connectmobile.group.details.invite.b.C0643b.f36371a[g3Var7.f35300a.ordinal()];
                if (i25 == 1) {
                    List list4 = (List) g3Var7.f35301b;
                    com.garmin.android.apps.connectmobile.group.details.invite.c cVar3 = bVar2.d7().f36367c;
                    cVar3.getClass();
                    ArrayList arrayList4 = cVar3.f36382d;
                    if (list4 != null && !list4.isEmpty()) {
                        arrayList4.addAll(list4);
                        cVar3.f().u(cVar3, arrayList4.size(), list4.size());
                        cVar3.g();
                    }
                    bVar2.X6(list4 != null ? list4.size() : 0);
                } else if (i25 == 2) {
                    bVar2.Y6(true);
                } else {
                    if (i25 != 3) {
                        u0.r();
                        return null;
                    }
                    if (i16 == 1) {
                        bVar2.T6(false);
                    }
                }
                return Unit.INSTANCE;
            case 18:
                return g0.e1((g0) obj2, i16, (Integer) obj);
            case 19:
                vn2.k0 k0Var3 = (vn2.k0) obj2;
                Integer num = (Integer) obj;
                Logger logger = vn2.k0.f178905d;
                k0Var3.getView().c0();
                e1 view2 = k0Var3.getView();
                num.getClass();
                view2.e6(num.intValue(), i16);
                return Unit.INSTANCE;
            case 20:
                EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = (EditPowerGuideStrategyActivity) obj2;
                g3 g3Var8 = (g3) obj;
                EditPowerGuideStrategyActivity.a aVar14 = EditPowerGuideStrategyActivity.f40384t;
                if (g3Var8 != null) {
                    int i26 = EditPowerGuideStrategyActivity.b.f40403a[g3Var8.f35300a.ordinal()];
                    if (i26 == 1) {
                        editPowerGuideStrategyActivity.showProgressOverlay();
                    } else if (i26 == 2) {
                        editPowerGuideStrategyActivity.hideProgressOverlay();
                        ab1.f fVar = editPowerGuideStrategyActivity.f40390f;
                        if (fVar == null) {
                            p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                            throw null;
                        }
                        ab1.d dVar2 = fVar.f2563a;
                        if (dVar2 != null && (powerGuidanceSummary = dVar2.getPowerGuidanceSummary()) != null) {
                            powerGuidanceSummary.j(Integer.valueOf(i16));
                        }
                        r rVar = editPowerGuideStrategyActivity.f40385a;
                        if (rVar == null) {
                            p005kotlin.jvm.internal.s.m("summaryViewHolder");
                            throw null;
                        }
                        ya1.i iVar3 = rVar.f195605p;
                        if (iVar3 != null) {
                            iVar3.a(i16);
                        }
                        Fragment fragmentG = editPowerGuideStrategyActivity.getSupportFragmentManager().G("BannerFragment");
                        x xVar = fragmentG instanceof x ? (x) fragmentG : null;
                        if (xVar != null) {
                            xVar.dismiss();
                        }
                        ab1.f fVar2 = editPowerGuideStrategyActivity.f40390f;
                        if (fVar2 != null) {
                            ab1.d dVar3 = fVar2.f2563a;
                            ab1.a alertUserSettingsChanges = dVar3 != null ? dVar3.getAlertUserSettingsChanges() : null;
                            if (alertUserSettingsChanges != null) {
                                Collection collection = alertUserSettingsChanges.f2532a;
                                if (collection == null) {
                                    collection = j0.f134944a;
                                }
                                ArrayList arrayListD1 = h0.d1(collection);
                                p13.d0.A(arrayListD1, new x91.j(i15), true);
                                if (arrayListD1.isEmpty()) {
                                    ab1.f fVar3 = editPowerGuideStrategyActivity.f40390f;
                                    if (fVar3 == null) {
                                        p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                                        throw null;
                                    }
                                    ab1.d dVar4 = fVar3.f2563a;
                                    if (dVar4 != null) {
                                        dVar4.h(null);
                                    }
                                } else {
                                    alertUserSettingsChanges.f2532a = arrayListD1;
                                }
                            }
                        }
                        ab1.f fVar4 = editPowerGuideStrategyActivity.f40390f;
                        if (fVar4 == null) {
                            p005kotlin.jvm.internal.s.m("powerGuideStrategyDetails");
                            throw null;
                        }
                        ab1.d dVar5 = fVar4.f2563a;
                        ab1.a alertUserSettingsChanges2 = dVar5 != null ? dVar5.getAlertUserSettingsChanges() : null;
                        if (alertUserSettingsChanges2 != null) {
                            editPowerGuideStrategyActivity.ka(alertUserSettingsChanges2);
                        }
                    } else {
                        if (i26 != 3) {
                            u0.r();
                            return null;
                        }
                        editPowerGuideStrategyActivity.hideProgressOverlay();
                        editPowerGuideStrategyActivity.displayFailedMessage();
                    }
                }
                return Unit.INSTANCE;
            default:
                p pVar = (p) obj2;
                androidx.appcompat.app.e.a aVar15 = (androidx.appcompat.app.e.a) obj;
                p.a aVar16 = p.f191723f;
                aVar15.getClass();
                View viewInflate = LayoutInflater.from(aVar15.getContext()).inflate(R.layout.view_number_picker, pVar.f191725c, false);
                NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.number_picker);
                int[] iArr = pVar.f191727e;
                if (iArr == null) {
                    p005kotlin.jvm.internal.s.m("initialChargeOptions");
                    throw null;
                }
                ArrayList arrayList5 = new ArrayList(iArr.length);
                for (int i27 : iArr) {
                    arrayList5.add(pVar.f191724b.a(Integer.valueOf(i27)));
                }
                numberPicker.setDisplayedValues((String[]) arrayList5.toArray(new String[0]));
                numberPicker.setMinValue(1);
                numberPicker.setMaxValue(5);
                numberPicker.setValue(i16 / 1000);
                numberPicker.setWrapSelectorWheel(false);
                aVar15.setTitle(R.string.wallet_balance);
                aVar15.setView(viewInflate);
                aVar15.setPositiveButton(R.string.lbl_done, new wq.c(numberPicker, pVar, 8));
                aVar15.setNegativeButton(R.string.lbl_cancel, new v(i15));
                aVar15.setCancelable(false);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(Object obj, int i14, int i15) {
        this.f11581a = i15;
        this.f11583c = obj;
        this.f11582b = i14;
    }
}
