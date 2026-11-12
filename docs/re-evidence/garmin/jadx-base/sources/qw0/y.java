package qw0;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.device.setup.presentation.inreach.InReachSubscriptionPollingWorker;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.InviteAuthorizedUserActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.developer.SnowballUIReviewActivity;
import com.garmin.feature.garminpay.ui.selectcarddestination.CardDestinationSelectionActivity;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import ei0.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import o53.c2;
import o53.f0;
import o53.l1;
import o53.m0;
import p005kotlin.Unit;
import p13.h0;
import p3.j1;
import p5.k0;
import ps.x1;
import r22.g1;
import r53.p2;
import ro1.j0;
import yg2.i0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f148371b;

    public /* synthetic */ y(Object obj, int i14) {
        this.f148370a = i14;
        this.f148371b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x02fa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, o13.l] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Object next;
        List list;
        boolean z14;
        fw.m mVar;
        hi0.a aVar;
        com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.m.b bVar;
        List<hi0.a> list2;
        Object obj2;
        Entry entryD;
        Entry entryD2;
        int i14 = this.f148370a;
        Object obj3 = this.f148371b;
        switch (i14) {
            case 0:
                ie2.j jVar = (ie2.j) obj;
                int i15 = z.M1;
                jVar.getClass();
                ArrayList arrayList = ((z) obj3).J1;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        Integer messageIndex = ((x1) next).getMessageIndex();
                        String title = jVar.getTitle();
                        title.getClass();
                        int i16 = Integer.parseInt(title) - 1;
                        if (messageIndex != null && messageIndex.intValue() == i16) {
                        }
                    } else {
                        next = null;
                    }
                }
                x1 x1Var = (x1) next;
                Double distance = x1Var != null ? x1Var.getDistance() : null;
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Double distance2 = ((x1) it3.next()).getDistance();
                    if (distance2 != null) {
                        arrayList2.add(distance2);
                    }
                }
                return Boolean.valueOf(p005kotlin.jvm.internal.s.d(distance, h0.p0(arrayList2)));
            case 1:
                dy1.h hVar = (dy1.h) obj3;
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                if (hVar.f61560e) {
                    p5.h0.x(k0Var, hVar.f61561f);
                }
                return Unit.INSTANCE;
            case 2:
                r02.m mVar2 = (r02.m) obj3;
                b5.a0 a0Var = (b5.a0) obj;
                l1 l1Var = mVar2.f148900h;
                if (l1Var != null) {
                    l1Var.c(null);
                }
                mVar2.f148904l.setValue(Boolean.TRUE);
                mVar2.f148894b.f24464a.a(a0Var.f15749b, a0Var.f15750c);
                return Unit.INSTANCE;
            case 3:
                r2.c cVar = (r2.c) obj3;
                cVar.f149433c.invoke((n2.a) obj, h5.i.a(cVar, AndroidCompositionLocals_androidKt.f6042b));
                return Unit.INSTANCE;
            case 4:
                ((e23.l) obj).invoke((n2.a) obj3);
                return Unit.INSTANCE;
            case 5:
                r22.o oVar = (r22.o) obj3;
                int iIntValue = ((Integer) obj).intValue();
                r22.o.a aVar2 = r22.o.f149769b;
                oVar.dismiss();
                g1 g1Var = oVar.f149770a;
                if (g1Var != null) {
                    g1Var.a(iIntValue);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("onItemSelected");
                throw null;
            case 6:
                View view2 = (View) obj;
                r22.y.a aVar3 = r22.y.f149923b;
                view2.getClass();
                e23.l<? super View, Unit> lVar = ((r22.y) obj3).f149924a;
                if (lVar != null) {
                    lVar.invoke(view2);
                }
                return Unit.INSTANCE;
            case 7:
                GeoPointDTO geoPointDTO = (GeoPointDTO) obj;
                r40.k.a aVar4 = r40.k.f150284l;
                geoPointDTO.getClass();
                b41.a aVar5 = ((r40.k) obj3).f150286i;
                if (aVar5 != null) {
                    aVar5.invoke(geoPointDTO);
                }
                return Unit.INSTANCE;
            case 8:
                com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.a aVar6 = (com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.a) obj3;
                fw.m mVar3 = (fw.m) obj;
                com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.a.C0939a c0939a = com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.a.f48009b;
                mVar3.getClass();
                aVar6.getClass();
                Boolean bool = (Boolean) mVar3.f73770c;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                if (mVar3.f73769b == fw.p.SUCCESS && zBooleanValue) {
                    r42.d dVar = (r42.d) aVar6.f48010a.getValue();
                    f12.l.f68084a.getClass();
                    f12.l.a.a().K1(((Number) dVar.f150329g.getValue()).doubleValue());
                    f12.l.a.a().T3(true);
                    g22.e.f(aVar6);
                    androidx.fragment.app.m mVarRequireActivity = aVar6.requireActivity();
                    mVarRequireActivity.setResult(11);
                    mVarRequireActivity.finish();
                } else {
                    fw.c cVar2 = mVar3.f73771d;
                    g22.e.f(aVar6);
                    g22.e.a(aVar6, cVar2);
                    androidx.fragment.app.m mVarRequireActivity2 = aVar6.requireActivity();
                    mVarRequireActivity2.setResult(12);
                    mVarRequireActivity2.finish();
                }
                return Unit.INSTANCE;
            case 9:
                return Long.valueOf(m0.e(((e53.c) ((fh0.b) obj3).invoke(obj)).f63098a));
            case 10:
                DashboardActivity dashboardActivity = (DashboardActivity) obj3;
                com.garmin.android.apps.connectmobile.dashboard.presentation.c cVar3 = (com.garmin.android.apps.connectmobile.dashboard.presentation.c) obj;
                int i17 = DashboardActivity.f33444q;
                cVar3.getClass();
                if (cVar3 instanceof com.garmin.android.apps.connectmobile.dashboard.presentation.c.b) {
                    dashboardActivity.ca("HOME");
                    dashboardActivity.hideConsentBanner();
                    r70.f fVar = new r70.f(dashboardActivity, cVar3);
                    c2 c2Var = dashboardActivity.f33456p;
                    if (c2Var != null) {
                        c2Var.c(null);
                    }
                    dashboardActivity.f33456p = ge1.b.T(f0.w(dashboardActivity), null, null, new r70.j(dashboardActivity, fVar, null), 3);
                } else if (cVar3 instanceof com.garmin.android.apps.connectmobile.dashboard.presentation.c.C0549c) {
                    dashboardActivity.ca("MY_DEVICE");
                    r70.e eVar = new r70.e(dashboardActivity, 1);
                    c2 c2Var2 = dashboardActivity.f33456p;
                    if (c2Var2 != null) {
                        c2Var2.c(null);
                    }
                    dashboardActivity.f33456p = ge1.b.T(f0.w(dashboardActivity), null, null, new r70.j(dashboardActivity, eVar, null), 3);
                }
                return Unit.INSTANCE;
            case 11:
                com.garmin.android.apps.connectmobile.dashboard.presentation.c.C0549c c0549c = (com.garmin.android.apps.connectmobile.dashboard.presentation.c.C0549c) obj3;
                r70.p pVar = (r70.p) obj;
                pVar.getClass();
                Long l14 = c0549c.f33540a;
                com.garmin.android.apps.connectmobile.devices.a aVar7 = c0549c.f33541b;
                n0 viewLifecycleOwner = pVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                ge1.b.T(f0.w(viewLifecycleOwner), null, null, new r70.o(pVar, l14, aVar7, null), 3);
                return Unit.INSTANCE;
            case 12:
                Long l15 = (Long) obj;
                long jLongValue = l15.longValue();
                InviteAuthorizedUserActivity.a aVar8 = InviteAuthorizedUserActivity.f34996q;
                com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.m mVarHa = ((InviteAuthorizedUserActivity) obj3).ha();
                ArrayList arrayList3 = mVarHa.f35159h;
                ReentrantLock reentrantLock = mVarHa.f35160i;
                p2 p2Var = mVarHa.f35156e;
                if (mVarHa.f35154c.get(l15) == null && (list = (List) mVarHa.f35157f.getValue()) != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : list) {
                        if (obj4 instanceof u0.a) {
                            arrayList4.add(obj4);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(arrayList4);
                    hi0.a aVar9 = (hi0.a) p2Var.getValue();
                    int i18 = -1;
                    if (aVar9 != null) {
                        Long userId = aVar9.getUserId();
                        if (userId == null) {
                            vb.h.z("User ID cannot be null");
                            return null;
                        }
                        Integer numY4 = mVarHa.y4(userId.longValue(), false);
                        if (numY4 != null) {
                            int iIntValue2 = numY4.intValue();
                            Iterator it4 = arrayList5.iterator();
                            int i19 = 0;
                            while (true) {
                                if (it4.hasNext()) {
                                    long j8 = ((u0.a) it4.next()).f64330a;
                                    Long userId2 = aVar9.getUserId();
                                    if (userId2 == null || j8 != userId2.longValue()) {
                                        i19++;
                                    }
                                } else {
                                    i19 = -1;
                                }
                            }
                            if (i19 != -1) {
                                reentrantLock.lock();
                                try {
                                    u0.a aVar10 = (u0.a) arrayList3.get(iIntValue2);
                                    reentrantLock.unlock();
                                    arrayList5.set(i19, aVar10);
                                } catch (Throwable th3) {
                                    reentrantLock.unlock();
                                    throw th3;
                                }
                            }
                        }
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    Integer numY5 = mVarHa.y4(jLongValue, z14);
                    if (numY5 != null) {
                        int iIntValue3 = numY5.intValue();
                        Iterator it5 = arrayList5.iterator();
                        int i24 = 0;
                        try {
                            while (it5.hasNext()) {
                                if (((u0.a) it5.next()).f64330a == jLongValue) {
                                    i18 = i24;
                                    reentrantLock.lock();
                                    u0.a aVar11 = (u0.a) arrayList3.get(iIntValue3);
                                    reentrantLock.unlock();
                                    arrayList5.set(i18, aVar11);
                                    mVarHa.z4(h0.b1(arrayList5));
                                    mVar = (fw.m) mVarHa.f35155d.getValue();
                                    if (mVar != null || (bVar = (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.m.b) mVar.f73770c) == null || (list2 = bVar.f35165a) == null) {
                                        aVar = null;
                                    } else {
                                        Iterator<T> it6 = list2.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                Object next2 = it6.next();
                                                Long userId3 = ((hi0.a) next2).getUserId();
                                                if (userId3 != null && userId3.longValue() == jLongValue) {
                                                    obj2 = next2;
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        aVar = (hi0.a) obj2;
                                    }
                                    p2Var.setValue(aVar);
                                } else {
                                    i24++;
                                }
                            }
                            u0.a aVar12 = (u0.a) arrayList3.get(iIntValue3);
                            reentrantLock.unlock();
                            arrayList5.set(i18, aVar12);
                            mVarHa.z4(h0.b1(arrayList5));
                            mVar = (fw.m) mVarHa.f35155d.getValue();
                            if (mVar != null) {
                                aVar = null;
                            } else {
                                aVar = null;
                            }
                            p2Var.setValue(aVar);
                        } catch (Throwable th4) {
                            reentrantLock.unlock();
                            throw th4;
                        }
                        reentrantLock.lock();
                    }
                }
                return Unit.INSTANCE;
            case 13:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                p5.h0.n(k0Var2, ((i0) obj3).f197054b.f127845b);
                return Unit.INSTANCE;
            case 14:
                ri1.p pVar2 = (ri1.p) obj3;
                String str = (String) obj;
                str.getClass();
                pVar2.getClass();
                pc0.n0 n0VarX4 = pVar2.x4();
                long j14 = pVar2.f152858a;
                n0VarX4.e(j14, str);
                pVar2.x4().o(j14, System.currentTimeMillis());
                InReachSubscriptionPollingWorker.a aVar13 = InReachSubscriptionPollingWorker.f33782k;
                long jCurrentTimeMillis = System.currentTimeMillis();
                aVar13.getClass();
                InReachSubscriptionPollingWorker.a.a(j14, jCurrentTimeMillis, str);
                pVar2.y4();
                return Unit.INSTANCE;
            case 15:
                ro1.c.a aVar14 = (ro1.c.a) obj3;
                g3 g3Var = (g3) obj;
                int i25 = ro1.c.f153915b;
                if (g3Var.f35300a == fw.p.SUCCESS) {
                    aVar14.f153919b.setImageBitmap((Bitmap) g3Var.f35301b);
                }
                return Unit.INSTANCE;
            case 16:
                com.garmin.android.apps.connectmobile.social.share.b bVar2 = (com.garmin.android.apps.connectmobile.social.share.b) obj3;
                ro1.e eVar2 = (ro1.e) obj;
                com.garmin.android.apps.connectmobile.social.share.b.a aVar15 = com.garmin.android.apps.connectmobile.social.share.b.f44643d;
                eVar2.getClass();
                com.garmin.android.apps.connectmobile.social.share.b.InterfaceC0845b interfaceC0845b = bVar2.f44646c;
                if (interfaceC0845b != null) {
                    interfaceC0845b.i8(eVar2, bVar2.f44644a);
                }
                bVar2.dismiss();
                return Unit.INSTANCE;
            case 17:
                List<bq0.k> list3 = (List) obj;
                ro1.o oVar2 = ((com.garmin.android.apps.connectmobile.social.share.f) obj3).f44685b;
                if (oVar2 == null) {
                    p005kotlin.jvm.internal.s.m("adapter");
                    throw null;
                }
                oVar2.f153995c = list3;
                oVar2.notifyDataSetChanged();
                return Unit.INSTANCE;
            case 18:
                ro1.h0 h0Var = (ro1.h0) obj3;
                int i26 = j0.f153972c;
                if (((g3) obj).f35300a == fw.p.SUCCESS) {
                    h0Var.notifyDataSetChanged();
                }
                return Unit.INSTANCE;
            case 19:
                wr2.f fVar2 = (wr2.f) obj;
                int i27 = SnowballUIReviewActivity.f51313a;
                fVar2.getClass();
                wr2.g gVar = wr2.g.f186857a;
                View viewFindViewById = ((SnowballUIReviewActivity) obj3).findViewById(R.id.content);
                viewFindViewById.getClass();
                gVar.getClass();
                wr2.g.b(viewFindViewById, fVar2);
                return Unit.INSTANCE;
            case 20:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b) obj3).f51615e.j(bool2);
                return Unit.INSTANCE;
            case 21:
                rr.k kVar = (rr.k) obj;
                kVar.getClass();
                qr.t tVar = (qr.t) ((rr.f) obj3).f154161a.getValue();
                tVar.getClass();
                tVar.Q1.k(null, kVar);
                return Unit.INSTANCE;
            case 22:
                Context context = (Context) obj;
                context.getClass();
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                layoutInflaterFrom.getClass();
                View viewInflate = layoutInflaterFrom.inflate(com.garmin.android.apps.connectmobile.R.layout.gcm3_recycler_view_layout, (ViewGroup) null);
                viewInflate.getClass();
                RecyclerView recyclerView = (RecyclerView) viewInflate;
                recyclerView.setAdapter((im.k) obj3);
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
                return recyclerView;
            case 23:
                CardDestinationSelectionActivity cardDestinationSelectionActivity = (CardDestinationSelectionActivity) obj3;
                Boolean bool3 = (Boolean) obj;
                CardDestinationSelectionActivity.a aVar16 = CardDestinationSelectionActivity.f52143n;
                hn2.c.ba(cardDestinationSelectionActivity, bool3, null, null, 14);
                if (p005kotlin.jvm.internal.s.g(bool3, Boolean.FALSE)) {
                    cardDestinationSelectionActivity.setResult(0);
                    cardDestinationSelectionActivity.finish();
                }
                return Unit.INSTANCE;
            case 24:
                com.garmin.feature.garminpay.ui.selectcarddestination.b bVar3 = (com.garmin.feature.garminpay.ui.selectcarddestination.b) obj3;
                br2.f fVar3 = bVar3.f52164b.get(((Integer) obj).intValue());
                androidx.fragment.app.m activity = bVar3.getActivity();
                CardDestinationSelectionActivity cardDestinationSelectionActivity2 = activity instanceof CardDestinationSelectionActivity ? (CardDestinationSelectionActivity) activity : null;
                if (cardDestinationSelectionActivity2 != null) {
                    cardDestinationSelectionActivity2.ea(fVar3);
                }
                return Unit.INSTANCE;
            case 25:
                rz.a aVar17 = (rz.a) obj3;
                Highlight[] highlightArr = (Highlight[]) obj;
                rz.a.C2940a c2940a = rz.a.f155189g;
                highlightArr.getClass();
                if (highlightArr.length != 1) {
                    return new Entry();
                }
                qz.e eVar3 = aVar17.f155196d;
                return (eVar3 == null || (entryD = eVar3.d(highlightArr[0])) == null) ? new Entry() : entryD;
            case 26:
                rz.b bVar4 = (rz.b) obj3;
                Highlight[] highlightArr2 = (Highlight[]) obj;
                int i28 = rz.b.f155199g;
                highlightArr2.getClass();
                if (highlightArr2.length != 1) {
                    return new Entry();
                }
                qz.e eVar4 = bVar4.f155205d;
                return (eVar4 == null || (entryD2 = eVar4.d(highlightArr2[0])) == null) ? new Entry() : entryD2;
            case 27:
                return new s2.d.a((s2.b) obj3);
            case 28:
                return Integer.valueOf(((s3.i) obj3).c(oc.b.f(((j1) obj).f135127e)));
            default:
                obj.getClass();
                s51.c cVar4 = (s51.c) ((s51.c.a) obj3).f157381a.d();
                if (cVar4 != null) {
                    cVar4.h(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
