package tn2;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.v1;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.powerguide.create.CreatePowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.powerguide.create.ScheduledEventsActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.SafetyFeaturesActivity;
import com.garmin.android.apps.connectmobile.social.share.ui.StickerEditorView;
import com.garmin.android.apps.connectmobile.traininginitiative.components.ui.GCMComplexButton;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.SendToDeviceActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.feature.garminpay.providers.gpay.ui.managecard.FitPayCardDetailsActivity;
import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsActivity;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import mz1.i1;
import o4.j1;
import o4.l1;
import o4.t1;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p3.a2;
import ps.x1;
import ty1.g2;
import u1.d2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class t implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f165666b;

    public /* synthetic */ t(Object obj, int i14) {
        this.f165665a = i14;
        this.f165666b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x046b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r42v2, types: [T, o4.v0] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        byte[] bArrA;
        ps.u apnea;
        List<ps.t> listB;
        Entry entryD;
        long j8;
        int i14;
        o4.r rVarA;
        boolean z14;
        Object obj2;
        int i15 = this.f165665a;
        int i16 = 6;
        int i17 = 3;
        Object obj3 = this.f165666b;
        switch (i15) {
            case 0:
                wl2.b bVar = (wl2.b) obj;
                Logger logger = w.f165679d;
                bVar.getClass();
                e13.p pVarG = q03.r.e(bVar.j((com.garmin.device.nfc.h[]) obj3, 0L)).g(l13.a.f108328c);
                n nVar = new n(new m(i17), 5);
                int i18 = w03.b.f181178a;
                e13.k kVar = new e13.k(pVarG, nVar);
                hq2.d dVar = new hq2.d(bVar, 1);
                w03.a.d dVar2 = w03.a.f181172c;
                w03.a.c cVar = w03.a.f181171b;
                return kVar.f(dVar2, dVar2, cVar, dVar, cVar, cVar);
            case 1:
                w.a.EnumC3112a enumC3112a = (w.a.EnumC3112a) obj3;
                byte[] bArr = (byte[]) obj;
                Logger logger2 = w.f165679d;
                bArr.getClass();
                a aVar = new a();
                LinkedHashMap linkedHashMapB = aVar.b((byte[]) p13.u0.c(new e1.a(-91), aVar.b((byte[]) p13.u0.c(new e1.a(111), aVar.b(bArr)))));
                byte[] bArr2 = (byte[]) p13.u0.c(new e1.a(-124), linkedHashMapB);
                byte[] bArr3 = (byte[]) p13.u0.c(new e1.a(-112), linkedHashMapB);
                pn2.a.f138690a.getClass();
                int i19 = w.g.f165729a[pn2.a.d().ordinal()];
                if (i19 != 1) {
                    if (i19 != 2 && i19 != 3 && i19 != 4) {
                        lc.u0.r();
                    } else if (bArr3.length < 2 || bArr3[1] != 1) {
                        f.f165551a.getClass();
                        vb.h.z("Unhandled appletVersion: ".concat(f.a(bArr3)));
                    } else {
                        f.f165551a.getClass();
                        bArrA = hb2.d.a("0011");
                        bArrA.getClass();
                    }
                    return null;
                }
                f.f165551a.getClass();
                bArrA = hb2.d.a("0000");
                bArrA.getClass();
                return new w.a(enumC3112a, bArr2, bArr3, bArrA, new byte[]{p13.u.D((byte[]) p13.u0.c(new e1.a(-97, 112), linkedHashMapB))});
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                return (q03.v) ((r0.d) obj3).f165653f.invoke(th3);
            case 3:
                View view2 = (View) obj;
                int i24 = StickerEditorView.f44707l;
                view2.getClass();
                return Boolean.valueOf(!view2.equals(((StickerEditorView) obj3).f44713f));
            case 4:
                to2.a aVar2 = (to2.a) obj3;
                aVar2.f165846b.debug("startHeartBeatTimer: something went wrong, stopping timer...");
                aVar2.j();
                return Unit.INSTANCE;
            case 5:
                FitPayCardDetailsActivity fitPayCardDetailsActivity = (FitPayCardDetailsActivity) obj3;
                qs2.f fVar = (qs2.f) obj;
                FitPayCardDetailsActivity.a aVar3 = FitPayCardDetailsActivity.F;
                fitPayCardDetailsActivity.ea().debug("onCardStateChange: " + fVar);
                fVar.getClass();
                fitPayCardDetailsActivity.fa(fVar);
                return Unit.INSTANCE;
            case 6:
                ps.i0 i0Var = (ps.i0) obj3;
                List list = (List) obj;
                int i25 = tq.a.f165992k;
                ArrayList arrayListL = androidx.core.view.j.l(list);
                for (Object obj4 : list) {
                    qs.x xVarA2 = ((x1) obj4).a2();
                    int i26 = xVarA2 == null ? -1 : tq.a.b.f166004b[xVarA2.ordinal()];
                    if (i26 == 1 || i26 == 2 || i26 == 3) {
                        arrayListL.add(obj4);
                    }
                }
                if (i0Var != null && (apnea = i0Var.getApnea()) != null && (listB = apnea.b()) != null) {
                    int i27 = 0;
                    for (Object obj5 : listB) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        ps.t tVar = (ps.t) obj5;
                        x1 x1Var = (x1) p13.h0.e0(i27, arrayListL);
                        if (x1Var != null) {
                            x1Var.C1 = tVar.getMinHr();
                        }
                        i27 = i28;
                    }
                }
                return arrayListL;
            case 7:
                PaymentCardDetailsActivity paymentCardDetailsActivity = (PaymentCardDetailsActivity) obj3;
                Boolean bool = (Boolean) obj;
                Logger logger3 = PaymentCardDetailsActivity.f52178q;
                paymentCardDetailsActivity.x(false);
                vr2.i iVar = paymentCardDetailsActivity.f52180h;
                if (iVar == null) {
                    p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                    throw null;
                }
                Boolean boolD = iVar.f179621z.d();
                Boolean bool2 = Boolean.TRUE;
                if (p005kotlin.jvm.internal.s.g(boolD, bool2)) {
                    logger3.debug("showMaintenanceAlertDialog");
                    androidx.appcompat.app.e eVarF = br2.c.f19585a.f(paymentCardDetailsActivity, new tr2.h(paymentCardDetailsActivity, i16), new tr2.h(paymentCardDetailsActivity, 1));
                    if (eVarF != null) {
                        eVarF.show();
                    }
                    return Unit.INSTANCE;
                }
                if (p005kotlin.jvm.internal.s.g(bool, bool2)) {
                    logger3.debug("onCreate: paymentCardDetailsViewModel initialization complete, getting card types and going to payment card details");
                    vr2.i iVar2 = paymentCardDetailsActivity.f52180h;
                    if (iVar2 == null) {
                        p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                        throw null;
                    }
                    ge1.b.T(v1.a(iVar2), null, null, new vr2.l(iVar2, null), 3);
                } else {
                    logger3.debug("onCreate: paymentCardDetailsViewModel initialization failed");
                    paymentCardDetailsActivity.ha();
                }
                return Unit.INSTANCE;
            case 8:
                com.garmin.feature.garminpay.ui.userwallet.e eVar = (com.garmin.feature.garminpay.ui.userwallet.e) obj3;
                vr2.q qVar = (vr2.q) obj;
                com.garmin.feature.garminpay.ui.userwallet.e.a aVar4 = com.garmin.feature.garminpay.ui.userwallet.e.f52303k;
                qVar.getClass();
                eVar.u6(qVar);
                androidx.fragment.app.m activity = eVar.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return Unit.INSTANCE;
            case 9:
                iw1.a aVar5 = (iw1.a) obj;
                aVar5.getClass();
                return Boolean.valueOf((g22.k.f(aVar5.f95330q, ((av1.d) obj3).j()) && aVar5.f95320h) || (aVar5.f95318f && aVar5.f95323k));
            case 10:
                final SendToDeviceActivity sendToDeviceActivity = (SendToDeviceActivity) obj3;
                o13.p pVar = (o13.p) obj;
                SendToDeviceActivity.a aVar6 = SendToDeviceActivity.f45711b;
                if (((Boolean) pVar.f128595b).booleanValue()) {
                    final r22.m0 m0VarB = r22.m0.a.b(r22.m0.f149759e, sendToDeviceActivity.getString(R.string.on_its_way), sendToDeviceActivity.getString(R.string.event_available_after_sync, pVar.f128594a), 256);
                    final int i29 = 0;
                    o53.f0.w(sendToDeviceActivity).b(new g22.g(new e23.a() { // from class: ty1.b0
                        @Override // e23.a
                        public final Object invoke() {
                            int i30 = i29;
                            SendToDeviceActivity sendToDeviceActivity2 = sendToDeviceActivity;
                            r22.m0 m0Var = m0VarB;
                            switch (i30) {
                                case 0:
                                    SendToDeviceActivity.a aVar7 = SendToDeviceActivity.f45711b;
                                    m0Var.show(sendToDeviceActivity2.getSupportFragmentManager(), "EVENT_SENT_DIALOG_KEY");
                                    break;
                                default:
                                    SendToDeviceActivity.a aVar8 = SendToDeviceActivity.f45711b;
                                    m0Var.dismiss();
                                    sendToDeviceActivity2.finish();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, null));
                    final int i30 = 1;
                    o53.f0.w(sendToDeviceActivity).b(new g22.h(1500L, new e23.a() { // from class: ty1.b0
                        @Override // e23.a
                        public final Object invoke() {
                            int i34 = i30;
                            SendToDeviceActivity sendToDeviceActivity2 = sendToDeviceActivity;
                            r22.m0 m0Var = m0VarB;
                            switch (i34) {
                                case 0:
                                    SendToDeviceActivity.a aVar7 = SendToDeviceActivity.f45711b;
                                    m0Var.show(sendToDeviceActivity2.getSupportFragmentManager(), "EVENT_SENT_DIALOG_KEY");
                                    break;
                                default:
                                    SendToDeviceActivity.a aVar8 = SendToDeviceActivity.f45711b;
                                    m0Var.dismiss();
                                    sendToDeviceActivity2.finish();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, null));
                }
                return Unit.INSTANCE;
            case 11:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.f fVar2 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.f) obj3;
                List list2 = (List) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.f.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.f.f45956e;
                com.garmin.android.apps.connectmobile.courses.model.e eVar2 = ((i1) fVar2.f45958b.getValue()).f121790e;
                boolean z15 = (eVar2 != null ? eVar2.z() : null) == com.garmin.android.library.mapsdkadapter.i.b.GCJ02;
                Context contextRequireContext = fVar2.requireContext();
                contextRequireContext.getClass();
                list2.getClass();
                uy1.g gVar = new uy1.g(contextRequireContext, p13.h0.N0(list2, new ty1.c0(z15)), z15);
                gVar.f173419d = fVar2;
                RecyclerView recyclerView = fVar2.f45959c;
                if (recyclerView != null) {
                    recyclerView.setAdapter(gVar);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("recyclerViewDevices");
                throw null;
            case 12:
                Boolean bool3 = (Boolean) obj;
                TextView textView = ((com.garmin.android.apps.connectmobile.traininginitiative.ui.h) obj3).f46059d;
                if (textView == null) {
                    p005kotlin.jvm.internal.s.m("selectACourse");
                    throw null;
                }
                bool3.getClass();
                v22.e.v(textView, bool3.booleanValue());
                return Unit.INSTANCE;
            case 13:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.i iVar3 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.i) obj3;
                o13.p pVar2 = (o13.p) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.i.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.i.f46067g;
                pVar2.getClass();
                Integer num = (Integer) pVar2.f128594a;
                Integer num2 = (Integer) pVar2.f128595b;
                if (num != null && num2 != null) {
                    int iIntValue = num.intValue();
                    int iIntValue2 = num2.intValue();
                    androidx.appcompat.app.e.a aVar9 = new androidx.appcompat.app.e.a(iVar3.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                    aVar9.setTitle(iIntValue);
                    aVar9.setMessage(iIntValue2);
                    aVar9.setCancelable(false);
                    aVar9.setPositiveButton(R.string.lbl_exit, new sa2.b(iVar3, i16));
                    aVar9.setNegativeButton(R.string.lbl_cancel, new ty1.o(1));
                    iVar3.f46070d.f(false);
                    iVar3.requireActivity().onBackPressed();
                }
                return Unit.INSTANCE;
            case 14:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.n nVar2 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.n) obj3;
                zf0.a aVar10 = (zf0.a) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.n.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.n.f46137f;
                if (aVar10 != null) {
                    int i34 = com.garmin.android.apps.connectmobile.traininginitiative.ui.n.b.f46143a[aVar10.ordinal()];
                    GCMComplexButton gCMComplexButton = nVar2.f46141d;
                    if (i34 == 1) {
                        if (gCMComplexButton == null) {
                            p005kotlin.jvm.internal.s.m("findEventButton");
                            throw null;
                        }
                        gCMComplexButton.a(false);
                        GCMComplexButton gCMComplexButton2 = nVar2.f46142e;
                        if (gCMComplexButton2 == null) {
                            p005kotlin.jvm.internal.s.m("createEventButton");
                            throw null;
                        }
                        gCMComplexButton2.a(true);
                    } else {
                        if (gCMComplexButton == null) {
                            p005kotlin.jvm.internal.s.m("findEventButton");
                            throw null;
                        }
                        gCMComplexButton.a(true);
                        GCMComplexButton gCMComplexButton3 = nVar2.f46142e;
                        if (gCMComplexButton3 == null) {
                            p005kotlin.jvm.internal.s.m("createEventButton");
                            throw null;
                        }
                        gCMComplexButton3.a(false);
                    }
                }
                return Unit.INSTANCE;
            case 15:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.b0 b0Var = (com.garmin.android.apps.connectmobile.traininginitiative.ui.b0) obj3;
                g3 g3Var = (g3) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.b0.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.b0.f45848e;
                fw.p pVar3 = g3Var != null ? g3Var.f35300a : null;
                int i35 = pVar3 != null ? com.garmin.android.apps.connectmobile.traininginitiative.ui.b0.b.f45853a[pVar3.ordinal()] : -1;
                if (i35 == 1) {
                    g22.e.l(b0Var);
                } else if (i35 != 2) {
                    g22.e.f(b0Var);
                    g22.e.a(b0Var, null);
                } else {
                    g22.e.f(b0Var);
                    o13.p pVar4 = (o13.p) g3Var.f35301b;
                    List list3 = pVar4 != null ? (List) pVar4.f128594a : null;
                    List list4 = pVar4 != null ? (List) pVar4.f128595b : null;
                    if (list3 == null || list3.isEmpty()) {
                        AddTIEventViewModel addTIEventViewModelU6 = b0Var.u6();
                        addTIEventViewModelU6.P = true;
                        addTIEventViewModelU6.O5().m("TIFindEventFragment");
                    } else {
                        Context contextRequireContext2 = b0Var.requireContext();
                        contextRequireContext2.getClass();
                        wy1.c cVar2 = new wy1.c(contextRequireContext2, list3, list4);
                        cVar2.f188070d = b0Var;
                        RecyclerView recyclerView2 = b0Var.f45851c;
                        if (recyclerView2 == null) {
                            p005kotlin.jvm.internal.s.m("eventsList");
                            throw null;
                        }
                        recyclerView2.setAdapter(cVar2);
                    }
                }
                return Unit.INSTANCE;
            case 16:
                Highlight[] highlightArr = (Highlight[]) obj;
                LineDataSet lineDataSet = tz.a.f167283i;
                highlightArr.getClass();
                qz.e eVar3 = ((tz.a) obj3).f167287d;
                int length = highlightArr.length;
                if (length == 1) {
                    return (eVar3 == null || (entryD = eVar3.d(highlightArr[0])) == null) ? new Entry() : entryD;
                }
                if (length == 2 && eVar3 != null) {
                    return eVar3.g(highlightArr);
                }
                return new Entry();
            case 17:
                u1.s sVar = (u1.s) obj3;
                l4.f fVar3 = (l4.f) obj;
                if (fVar3.getF94881a() * sVar.f167673d < 0.0f || n4.g.f(fVar3.f109845a.b()) <= 0.0f) {
                    return fVar3.e(new n0(26));
                }
                float f14 = sVar.f167673d;
                g6.f.f75994b.getClass();
                float f15 = 2;
                final float fMin = Math.min(g6.f.c(f14, 0.0f) ? 1.0f : (float) Math.ceil(fVar3.getF94881a() * sVar.f167673d), (float) Math.ceil(n4.g.f(fVar3.f109845a.b()) / f15));
                final float f16 = fMin / f15;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L);
                n4.c.a aVar13 = n4.c.f123541b;
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar3.f109845a.b() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar3.f109845a.b() & 4294967295L)) - fMin)) & 4294967295L);
                float f17 = fMin * f15;
                boolean z16 = f17 > n4.g.f(fVar3.f109845a.b());
                o4.b1 b1VarA = sVar.f167675f.a(fVar3.f109845a.b(), fVar3.f109845a.getLayoutDirection(), fVar3);
                if (!(b1VarA instanceof o4.b1.a)) {
                    if (!(b1VarA instanceof o4.b1.c)) {
                        boolean z17 = z16;
                        if (!(b1VarA instanceof o4.b1.b)) {
                            lc.u0.r();
                            return null;
                        }
                        o4.w wVar = sVar.f167674e;
                        if (z17) {
                            n4.c.f123541b.getClass();
                            j8 = 0;
                        } else {
                            j8 = jFloatToRawIntBits;
                        }
                        return fVar3.e(new mx.e(wVar, j8, z17 ? fVar3.f109845a.b() : jFloatToRawIntBits2, z17 ? q4.j.f142560a : new q4.k(fMin, 0.0f, 0, 0, null, 30, null)));
                    }
                    final o4.w wVar2 = sVar.f167674e;
                    n4.e eVar4 = ((o4.b1.c) b1VarA).f128813a;
                    if (n4.f.d(eVar4)) {
                        final long j14 = eVar4.f123555e;
                        final q4.k kVar2 = new q4.k(fMin, 0.0f, 0, 0, null, 30, null);
                        final boolean z18 = z16;
                        return fVar3.e(new e23.l() { // from class: u1.r
                            @Override // e23.l
                            public final Object invoke(Object obj6) throws Throwable {
                                q4.a.b bVar2;
                                long j15;
                                q4.c cVar3 = (q4.c) obj6;
                                cVar3.m1();
                                boolean z19 = z18;
                                o4.w wVar3 = wVar2;
                                long j16 = j14;
                                if (z19) {
                                    q4.f.z1(cVar3, wVar3, 0L, 0L, j16, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j16 >> 32));
                                    float f18 = f16;
                                    if (fIntBitsToFloat < f18) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cVar3.b() >> 32));
                                        float f19 = fMin;
                                        float f22 = fIntBitsToFloat2 - f19;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (cVar3.b() & 4294967295L)) - f19;
                                        o4.c0.f128819b.getClass();
                                        q4.a.b f142543b = cVar3.getF142543b();
                                        long jB = f142543b.b();
                                        f142543b.a().l();
                                        try {
                                            f142543b.f142550a.a(f19, f19, f22, fIntBitsToFloat3, 0);
                                            j15 = jB;
                                            bVar2 = f142543b;
                                            try {
                                                q4.f.z1(cVar3, wVar3, 0L, 0L, j16, null, 246);
                                                tn.k.p(bVar2, j15);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                tn.k.p(bVar2, j15);
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            bVar2 = f142543b;
                                            j15 = jB;
                                        }
                                    } else {
                                        q4.f.z1(cVar3, wVar3, jFloatToRawIntBits, jFloatToRawIntBits2, q.d(f18, j16), kVar2, 208);
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                    boolean z19 = z16;
                    if (sVar.f167672c == null) {
                        sVar.f167672c = new u1.p(null, null, null, null, 15, null);
                    }
                    u1.p pVar5 = sVar.f167672c;
                    pVar5.getClass();
                    o4.f1 f1VarA = pVar5.f167653d;
                    if (f1VarA == null) {
                        f1VarA = o4.m.a();
                        pVar5.f167653d = f1VarA;
                    }
                    f1VarA.reset();
                    f1VarA.k(eVar4, o4.f1.b.CounterClockwise);
                    if (!z19) {
                        o4.j jVarA = o4.m.a();
                        jVarA.k(new n4.e(fMin, fMin, eVar4.b() - fMin, eVar4.a() - fMin, u1.q.d(fMin, eVar4.f123555e), u1.q.d(fMin, eVar4.f123556f), u1.q.d(fMin, eVar4.f123557g), u1.q.d(fMin, eVar4.f123558h), null), o4.f1.b.CounterClockwise);
                        j1.f128873b.getClass();
                        f1VarA.s(f1VarA, jVarA, 0);
                    }
                    return fVar3.e(new g2(2, f1VarA, wVar2));
                }
                o4.w wVar3 = sVar.f167674e;
                o4.b1.a aVar14 = (o4.b1.a) b1VarA;
                o4.f1 f1Var = aVar14.f128811a;
                if (z16) {
                    return fVar3.e(new g2(i17, aVar14, wVar3));
                }
                if (wVar3 instanceof t1) {
                    o4.w0.f129024b.getClass();
                    i14 = o4.w0.f129025c;
                    rVarA = o4.e0.a.a(o4.e0.f128843b, o4.d0.c(1.0f, ((t1) wVar3).f129007b, 14));
                } else {
                    o4.w0.f129024b.getClass();
                    i14 = 0;
                    rVarA = null;
                }
                n4.d bounds = f1Var.getBounds();
                if (sVar.f167672c == null) {
                    sVar.f167672c = new u1.p(null, null, null, null, 15, null);
                }
                u1.p pVar6 = sVar.f167672c;
                pVar6.getClass();
                o4.f1 f1VarA2 = pVar6.f167653d;
                if (f1VarA2 == null) {
                    f1VarA2 = o4.m.a();
                    pVar6.f167653d = f1VarA2;
                }
                f1VarA2.reset();
                f1VarA2.q(bounds, o4.f1.b.CounterClockwise);
                j1.f128873b.getClass();
                f1VarA2.s(f1VarA2, f1Var, 0);
                p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                float f18 = bounds.f123549c;
                float f19 = bounds.f123548b;
                float f22 = bounds.f123547a;
                long jCeil = (((long) ((int) Math.ceil(f18 - f22))) << 32) | (((long) ((int) Math.ceil(bounds.f123550d - f19))) & 4294967295L);
                g6.m.a aVar15 = g6.m.f76012b;
                u1.p pVar7 = sVar.f167672c;
                pVar7.getClass();
                o4.v0 v0Var = pVar7.f167650a;
                o4.y yVarA = pVar7.f167651b;
                o4.w0 w0VarA = v0Var != null ? o4.w0.a(v0Var.b()) : null;
                o4.w0.f129024b.getClass();
                if (w0VarA != null && w0VarA.f129029a == 0) {
                    z14 = true;
                } else {
                    o4.w0 w0VarA2 = v0Var != null ? o4.w0.a(v0Var.b()) : null;
                    if (w0VarA2 != null && i14 == w0VarA2.f129029a) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                if (v0Var == null || yVarA == null || Float.intBitsToFloat((int) (fVar3.f109845a.b() >> 32)) > v0Var.getWidth() || Float.intBitsToFloat((int) (fVar3.f109845a.b() & 4294967295L)) > v0Var.getHeight() || !z14) {
                    obj2 = v0Var;
                    o4.f fVarA = o4.x0.a((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i14, 24);
                    pVar7.f167650a = fVarA;
                    yVarA = l1.a(fVarA);
                    pVar7.f167651b = yVarA;
                    obj2 = fVarA;
                }
                q4.a aVar16 = pVar7.f167652c;
                if (aVar16 == null) {
                    aVar16 = new q4.a();
                    pVar7.f167652c = aVar16;
                }
                q4.a.b bVar2 = aVar16.f142543b;
                q4.a.C2680a c2680a = aVar16.f142542a;
                long jC = g6.n.c(jCeil);
                g6.o layoutDirection = fVar3.f109845a.getLayoutDirection();
                g6.c cVar3 = c2680a.f142546a;
                g6.o oVar = c2680a.f142547b;
                q4.a aVar17 = aVar16;
                o4.y yVar = c2680a.f142548c;
                long j15 = c2680a.f142549d;
                c2680a.f142546a = fVar3;
                c2680a.f142547b = layoutDirection;
                c2680a.f142548c = yVarA;
                c2680a.f142549d = jC;
                yVarA.l();
                o4.d0.f128823b.getClass();
                long j16 = o4.d0.f128824c;
                o4.q.f128930b.getClass();
                q4.f.A0(aVar17, j16, 0L, jC, 0.0f, null, null, 58);
                float f24 = -f22;
                float f25 = -f19;
                bVar2.f142550a.h(f24, f25);
                try {
                    q4.f.C1(aVar17, aVar14.f128811a, wVar3, 0.0f, new q4.k(f17, 0.0f, 0, 0, null, 30, null), 52);
                    float f26 = 1;
                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (aVar17.b() >> 32)) + f26) / Float.intBitsToFloat((int) (aVar17.b() >> 32));
                    o4.f1 f1Var2 = f1VarA2;
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (aVar17.b() & 4294967295L)) + f26) / Float.intBitsToFloat((int) (aVar17.b() & 4294967295L));
                    long jI1 = aVar17.i1();
                    ?? r44 = obj2;
                    o4.y yVar2 = yVarA;
                    long jB = bVar2.b();
                    bVar2.a().l();
                    try {
                        bVar2.f142550a.g(fIntBitsToFloat, fIntBitsToFloat2, jI1);
                        q4.f.C1(aVar17, f1Var2, wVar3, 0.0f, null, 28);
                        bVar2.a().i();
                        bVar2.c(jB);
                        bVar2.f142550a.h(-f24, -f25);
                        yVar2.i();
                        c2680a.f142546a = cVar3;
                        c2680a.f142547b = oVar;
                        c2680a.f142548c = yVar;
                        c2680a.f142549d = j15;
                        r44.a();
                        r0Var.f105810a = r44;
                        return fVar3.e(new bn0.h(bounds, r0Var, jCeil, rVarA, 10));
                    } catch (Throwable th4) {
                        bVar2.a().i();
                        bVar2.c(jB);
                        throw th4;
                    }
                } catch (Throwable th5) {
                    bVar2.f142550a.h(-f24, -f25);
                    throw th5;
                }
            case 18:
                u1.y yVar3 = (u1.y) obj3;
                if (yVar3.f167353h) {
                    yVar3.f167354i.invoke();
                }
                return Unit.INSTANCE;
            case 19:
                d2 d2Var = (d2) obj3;
                float fFloatValue = ((Float) obj).floatValue();
                a2 a2Var = d2Var.f167433a;
                float intValue = a2Var.getIntValue() + fFloatValue + d2Var.f167438f;
                float fD = j23.t.d(intValue, 0.0f, d2Var.f167437e.getIntValue());
                boolean z24 = intValue == fD;
                float intValue2 = fD - a2Var.getIntValue();
                int iRound = Math.round(intValue2);
                a2Var.t(a2Var.getIntValue() + iRound);
                d2Var.f167438f = intValue2 - iRound;
                if (!z24) {
                    fFloatValue = intValue2;
                }
                return Float.valueOf(fFloatValue);
            case 20:
                PrivacyType privacyType = (PrivacyType) obj;
                int i36 = com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a.f47119i;
                privacyType.getClass();
                ((com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a) obj3).v6(privacyType);
                return Unit.INSTANCE;
            case 21:
                List list5 = (List) obj;
                u12.f fVar4 = ((u12.h) obj3).f167780b;
                list5.getClass();
                fVar4.getClass();
                ArrayList arrayList = fVar4.f167778c;
                arrayList.clear();
                arrayList.addAll(list5);
                fVar4.notifyDataSetChanged();
                return Unit.INSTANCE;
            case 22:
                p5.k0 k0Var = (p5.k0) obj;
                k0Var.getClass();
                p5.h0.n(k0Var, ((aa1.d) obj3).f2254f);
                return Unit.INSTANCE;
            case 23:
                final ScheduledEventsActivity scheduledEventsActivity = (ScheduledEventsActivity) obj3;
                ab1.m mVar = (ab1.m) obj;
                ScheduledEventsActivity.a aVar18 = ScheduledEventsActivity.f40379d;
                mVar.getClass();
                final String strValueOf = String.valueOf(mVar.f2609d);
                Long l14 = mVar.f2610e;
                final long jLongValue = l14 != null ? l14.longValue() : 0L;
                if (jLongValue > 0) {
                    new androidx.appcompat.app.e.a(scheduledEventsActivity).setTitle(R.string.lbl_existing_power_guide).setMessage(R.string.msg_existing_power_guide).setNegativeButton(R.string.power_guide_view_guide, new DialogInterface.OnClickListener() { // from class: ua1.l
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i37) {
                            ScheduledEventsActivity.a aVar19 = ScheduledEventsActivity.f40379d;
                            EditPowerGuideStrategyActivity.f40384t.getClass();
                            EditPowerGuideStrategyActivity.a.a(scheduledEventsActivity, jLongValue, strValueOf, 345);
                        }
                    }).setPositiveButton(R.string.lbl_replace, new bn0.i(scheduledEventsActivity, strValueOf, jLongValue, mVar)).show();
                } else if (p005kotlin.jvm.internal.s.g(mVar.f2611f, Boolean.TRUE)) {
                    new androidx.appcompat.app.e.a(scheduledEventsActivity).setTitle(R.string.power_guide_create_lbl).setMessage(scheduledEventsActivity.getString(R.string.power_guide_assign_shared_event_message)).setPositiveButton(R.string.lbl_common_continue, new bi2.k(scheduledEventsActivity, 27, strValueOf, mVar)).setNegativeButton(R.string.lbl_cancel, new ty1.o(11)).setCancelable(false).show();
                } else {
                    CreatePowerGuideStrategyActivity.a aVar19 = CreatePowerGuideStrategyActivity.f40374b;
                    Double dValueOf = Double.valueOf(mVar.f2607b);
                    String str = mVar.f2606a;
                    aVar19.getClass();
                    CreatePowerGuideStrategyActivity.a.a(scheduledEventsActivity, strValueOf, dValueOf, str);
                    scheduledEventsActivity.finish();
                    Unit unit = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 24:
                return Boolean.valueOf(p005kotlin.jvm.internal.s.g(((sc.h) obj).f158452b, ((sc.h) obj3).f158452b));
            case 25:
                Logger logger4 = uc0.d.f169948i;
                ((String) obj).getClass();
                return Boolean.valueOf(((m80.a) KoinJavaComponent.get$default(m80.a.class, null, null, 6, null)).e(((uc0.d) obj3).f169950b));
            case 26:
                ((p3.i0) obj).getClass();
                return new ug0.j((ug0.q) obj3);
            case 27:
                sd2.f fVar5 = (sd2.f) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c.a aVar20 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c.f43732k;
                fVar5.getClass();
                f.c<Long> cVar4 = ((com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c) obj3).f43735i;
                if (cVar4 != null) {
                    cVar4.a(Long.valueOf(fVar5.getUnitID()), null);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("activityResultLauncher");
                throw null;
            case 28:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c.a aVar21 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c.f43732k;
                ((uj1.n) obj3).t((List) obj);
                return Unit.INSTANCE;
            default:
                SafetyFeaturesActivity safetyFeaturesActivity = (SafetyFeaturesActivity) obj3;
                String str2 = (String) obj;
                SafetyFeaturesActivity.a aVar22 = SafetyFeaturesActivity.f43691f;
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -2117742814:
                            if (str2.equals("AssistanceTypeFragment")) {
                                pj1.s.d5((pj1.s) safetyFeaturesActivity.f43693d.getValue(), safetyFeaturesActivity, "GCM_OpenAssistanceTypeScreen", null, 12);
                            }
                            break;
                        case -1757308446:
                            if (str2.equals("LTEDeviceSelectorFragment")) {
                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c.f43732k.getClass();
                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c cVar5 = new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c();
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("ARG_IS_SETUP_WIZARD", false);
                                cVar5.setArguments(bundle);
                                cVar5.setCancelable(false);
                                cVar5.show(safetyFeaturesActivity.getSupportFragmentManager(), str2);
                            }
                            break;
                        case -1621439660:
                            if (str2.equals("EmergencyContactsFragment")) {
                                boolean z25 = safetyFeaturesActivity.f43694e;
                                if (z25) {
                                    com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m.getClass();
                                    com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar3 = new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putBoolean("ARG_FROM_MY_DAY_CARD", z25);
                                    bVar3.setArguments(bundle2);
                                    androidx.fragment.app.v supportFragmentManager = safetyFeaturesActivity.getSupportFragmentManager();
                                    supportFragmentManager.getClass();
                                    androidx.fragment.app.a aVar23 = new androidx.fragment.app.a(supportFragmentManager);
                                    aVar23.l(R.id.content_frame, bVar3, str2);
                                    aVar23.e();
                                } else {
                                    com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m.getClass();
                                    com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar4 = new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putBoolean("ARG_FROM_MY_DAY_CARD", false);
                                    bVar4.setArguments(bundle3);
                                    androidx.fragment.app.v supportFragmentManager2 = safetyFeaturesActivity.getSupportFragmentManager();
                                    supportFragmentManager2.getClass();
                                    androidx.fragment.app.a aVar24 = new androidx.fragment.app.a(supportFragmentManager2);
                                    aVar24.l(R.id.content_frame, bVar4, str2);
                                    aVar24.d(str2);
                                    aVar24.e();
                                }
                            }
                            break;
                        case -1283079632:
                            if (str2.equals("MyInformationFragment")) {
                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X.getClass();
                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar3 = new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d();
                                androidx.fragment.app.v supportFragmentManager3 = safetyFeaturesActivity.getSupportFragmentManager();
                                supportFragmentManager3.getClass();
                                androidx.fragment.app.a aVar25 = new androidx.fragment.app.a(supportFragmentManager3);
                                aVar25.l(R.id.content_frame, dVar3, str2);
                                aVar25.d(str2);
                                aVar25.e();
                            }
                            break;
                        case 1785174552:
                            if (str2.equals("SafetyFeaturesMainFragment")) {
                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h.getClass();
                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f fVar6 = new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f();
                                androidx.fragment.app.v supportFragmentManager4 = safetyFeaturesActivity.getSupportFragmentManager();
                                supportFragmentManager4.getClass();
                                androidx.fragment.app.a aVar26 = new androidx.fragment.app.a(supportFragmentManager4);
                                aVar26.l(R.id.content_frame, fVar6, str2);
                                aVar26.e();
                            }
                            break;
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
