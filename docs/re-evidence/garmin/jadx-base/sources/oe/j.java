package oe;

import android.content.Context;
import android.location.Location;
import androidx.lifecycle.y0;
import b.u;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.IntroFragment;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.extension.compose.animation.viewport.MapViewportState;
import e23.p;
import ht.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m4.q;
import ok2.a0;
import ok2.g0;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import ov1.r;
import ov1.y;
import p005kotlin.Unit;
import p1.u0;
import p3.c0;
import p3.j1;
import p3.n1;
import p3.o0;
import p3.p1;
import p3.s2;
import p3.u1;
import pk2.x;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f131231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f131232c;

    public /* synthetic */ j(of0.n nVar, IntroFragment introFragment, Location location) {
        this.f131230a = 3;
        this.f131231b = introFragment;
        this.f131232c = location;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:187:0x0501  */
    /* JADX WARN: Code duplicated, block: B:188:0x0504  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:191:0x0525  */
    /* JADX WARN: Code duplicated, block: B:193:0x0529  */
    /* JADX WARN: Code duplicated, block: B:199:0x0544 A[Catch: all -> 0x054f, TryCatch #1 {all -> 0x054f, blocks: (B:197:0x053c, B:199:0x0544, B:201:0x054a, B:204:0x0551, B:210:0x05ac, B:205:0x0555, B:209:0x057b), top: B:230:0x053c }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[LOOP:0: B:9:0x002c->B:19:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x054a A[Catch: all -> 0x054f, TryCatch #1 {all -> 0x054f, blocks: (B:197:0x053c, B:199:0x0544, B:201:0x054a, B:204:0x0551, B:210:0x05ac, B:205:0x0555, B:209:0x057b), top: B:230:0x053c }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0555 A[Catch: all -> 0x054f, TryCatch #1 {all -> 0x054f, blocks: (B:197:0x053c, B:199:0x0544, B:201:0x054a, B:204:0x0551, B:210:0x05ac, B:205:0x0555, B:209:0x057b), top: B:230:0x053c }] */
    /* JADX WARN: Code duplicated, block: B:207:0x0578  */
    /* JADX WARN: Code duplicated, block: B:208:0x057a  */
    /* JADX WARN: Code duplicated, block: B:230:0x053c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        x f205158h;
        ok2.e eVar;
        bl2.o oVar;
        boolean z14;
        g0 f205155e;
        p<? super al2.b, ? super CoreTransferException, Unit> pVar;
        Object next;
        Object value;
        Object value2;
        u onBackPressedDispatcher;
        u onBackPressedDispatcher2;
        switch (this.f131230a) {
            case 0:
                ((k) this.f131231b).f131234c.b((h) this.f131232c);
                return Unit.INSTANCE;
            case 1:
                MapViewportState mapViewportState = (MapViewportState) this.f131231b;
                oe2.e eVar2 = (oe2.e) this.f131232c;
                CameraState cameraState = mapViewportState.getCameraState();
                return Double.valueOf(cameraState != null ? cameraState.getZoom() : eVar2.f98597a.f98594b);
            case 2:
                y0 y0Var = (y0) this.f131231b;
                of0.m mVar = (of0.m) this.f131232c;
                int i14 = IntroFragment.f34814j;
                y0Var.k(mVar);
                return Unit.INSTANCE;
            case 3:
                IntroFragment introFragment = (IntroFragment) this.f131231b;
                Location location = (Location) this.f131232c;
                a2 a2Var = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "IntroFragment", "[checkEnabledAtCurrentLocation] retry");
                IntroFragment.G6(introFragment, location);
                return Unit.INSTANCE;
            case 4:
                ok2.g gVar = (ok2.g) this.f131231b;
                bl2.b bVar = (bl2.b) this.f131232c;
                ok2.g.b bVar2 = ok2.g.f132677s;
                wk2.i iVar = bVar.f18603d;
                x f205158h2 = iVar.getF205158h();
                CoreTransferException coreTransferException = f205158h2 != null ? f205158h2.f138497b : null;
                x f205158h3 = iVar.getF205158h();
                if ((f205158h3 != null ? f205158h3.f138498c : null) == ok2.e.f132639g) {
                    Collection<g0> collectionG = cl2.c.g(gVar.f132683b, iVar.getF205155e());
                    if (collectionG.isEmpty()) {
                        Logger logger = gVar.f132688g;
                        f205158h = iVar.getF205158h();
                        if (f205158h != null) {
                            eVar = f205158h.f138498c;
                        } else {
                            eVar = null;
                        }
                        logger.debug("transfer interrupted " + eVar + " ending batch");
                        oVar = bVar.f18607h;
                        if (!oVar.f18695c.get()) {
                            pVar = oVar.f18694b;
                            if (pVar != null) {
                                pVar.invoke(al2.b.REJECTED, coreTransferException);
                            }
                            gVar.f132692k.f(iVar.getF205155e(), coreTransferException);
                        }
                        synchronized (gVar.f132692k.f132601c) {
                            if (gVar.f132692k.b()) {
                                f205155e = gVar.f132692k.f132603e;
                                if (f205155e == null) {
                                    f205155e = iVar.getF205155e();
                                }
                                gVar.y(f205155e);
                            } else {
                                g0 f205155e2 = iVar.getF205155e();
                                o13.p<Integer, List<al2.j>> pVarD = gVar.f132695n.d();
                                int iIntValue = pVarD.f128594a.intValue();
                                List<al2.j> list = pVarD.f128595b;
                                rs2.c cVar = gVar.f132682a;
                                al2.b bVar3 = al2.b.REJECTED;
                                if (gVar.B() != null) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                al2.c cVar2 = new al2.c(cVar, f205155e2, bVar3, coreTransferException, list, iIntValue, z14, false, 128, null);
                                gVar.f132688g.warn("notifyRejectBatch(" + f205155e2 + "): " + cVar2);
                                gVar.f132684c.y(cVar2);
                                gVar.f132689h.a(cVar2);
                            }
                            gVar.f132694m.set(null);
                            Unit unit = Unit.INSTANCE;
                        }
                    } else {
                        Iterator<T> it = collectionG.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            if (it.hasNext()) {
                                int iA = ((g0) next).a();
                                do {
                                    Object next2 = it.next();
                                    int iA2 = ((g0) next2).a();
                                    if (iA > iA2) {
                                        next = next2;
                                        iA = iA2;
                                    }
                                } while (it.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        g0 g0Var = (g0) next;
                        if (g0Var == null || !gVar.h(g0Var.a(), iVar.getId())) {
                            Logger logger2 = gVar.f132688g;
                            f205158h = iVar.getF205158h();
                            if (f205158h != null) {
                                eVar = f205158h.f138498c;
                            } else {
                                eVar = null;
                            }
                            logger2.debug("transfer interrupted " + eVar + " ending batch");
                            oVar = bVar.f18607h;
                            if (!oVar.f18695c.get()) {
                                pVar = oVar.f18694b;
                                if (pVar != null) {
                                    pVar.invoke(al2.b.REJECTED, coreTransferException);
                                }
                                gVar.f132692k.f(iVar.getF205155e(), coreTransferException);
                            }
                            synchronized (gVar.f132692k.f132601c) {
                                try {
                                    if (gVar.f132692k.b()) {
                                        f205155e = gVar.f132692k.f132603e;
                                        if (f205155e == null) {
                                            f205155e = iVar.getF205155e();
                                        }
                                        gVar.y(f205155e);
                                    } else {
                                        g0 f205155e3 = iVar.getF205155e();
                                        o13.p<Integer, List<al2.j>> pVarD2 = gVar.f132695n.d();
                                        int iIntValue2 = pVarD2.f128594a.intValue();
                                        List<al2.j> list2 = pVarD2.f128595b;
                                        rs2.c cVar3 = gVar.f132682a;
                                        al2.b bVar4 = al2.b.REJECTED;
                                        if (gVar.B() != null) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        al2.c cVar4 = new al2.c(cVar3, f205155e3, bVar4, coreTransferException, list2, iIntValue2, z14, false, 128, null);
                                        gVar.f132688g.warn("notifyRejectBatch(" + f205155e3 + "): " + cVar4);
                                        gVar.f132684c.y(cVar4);
                                        gVar.f132689h.a(cVar4);
                                    }
                                    gVar.f132694m.set(null);
                                    Unit unit2 = Unit.INSTANCE;
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        } else {
                            Logger logger3 = gVar.f132688g;
                            x f205158h4 = iVar.getF205158h();
                            logger3.debug("transfer interrupted " + (f205158h4 != null ? f205158h4.f138498c : null) + " but more items available in current batch");
                            ge1.b.T(gVar.f132687f, null, null, new ok2.u(gVar, null), 3);
                        }
                    }
                } else {
                    Logger logger4 = gVar.f132688g;
                    f205158h = iVar.getF205158h();
                    if (f205158h != null) {
                        eVar = f205158h.f138498c;
                    } else {
                        eVar = null;
                    }
                    logger4.debug("transfer interrupted " + eVar + " ending batch");
                    oVar = bVar.f18607h;
                    if (!oVar.f18695c.get()) {
                        pVar = oVar.f18694b;
                        if (pVar != null) {
                            pVar.invoke(al2.b.REJECTED, coreTransferException);
                        }
                        gVar.f132692k.f(iVar.getF205155e(), coreTransferException);
                    }
                    synchronized (gVar.f132692k.f132601c) {
                        if (gVar.f132692k.b()) {
                            f205155e = gVar.f132692k.f132603e;
                            if (f205155e == null) {
                                f205155e = iVar.getF205155e();
                            }
                            gVar.y(f205155e);
                        } else {
                            g0 f205155e4 = iVar.getF205155e();
                            o13.p<Integer, List<al2.j>> pVarD3 = gVar.f132695n.d();
                            int iIntValue3 = pVarD3.f128594a.intValue();
                            List<al2.j> list3 = pVarD3.f128595b;
                            rs2.c cVar5 = gVar.f132682a;
                            al2.b bVar5 = al2.b.REJECTED;
                            if (gVar.B() != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            al2.c cVar6 = new al2.c(cVar5, f205155e4, bVar5, coreTransferException, list3, iIntValue3, z14, false, 128, null);
                            gVar.f132688g.warn("notifyRejectBatch(" + f205155e4 + "): " + cVar6);
                            gVar.f132684c.y(cVar6);
                            gVar.f132689h.a(cVar6);
                        }
                        gVar.f132694m.set(null);
                        Unit unit3 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 5:
                e23.l lVar = (e23.l) this.f131231b;
                a0 a0Var = (a0) this.f131232c;
                a0.a aVar = a0.f132585h;
                return (ok2.a) lVar.invoke(a0Var);
            case 6:
                ((e23.l) this.f131231b).invoke((gs1.d.b) this.f131232c);
                return Unit.INSTANCE;
            case 7:
                ((e23.l) this.f131231b).invoke((co0.f) this.f131232c);
                return Unit.INSTANCE;
            case 8:
                ((qo0.a) this.f131231b).f145928m.i(new o82.a(g22.k.z((DateTime) this.f131232c).b(), null, 2, null), true);
                return Unit.INSTANCE;
            case 9:
                qo0.a aVar2 = (qo0.a) this.f131231b;
                boolean zIsFullyZoomedOut = ((CustomLineChart) this.f131232c).isFullyZoomedOut();
                p2 p2Var = aVar2.f145922g;
                do {
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.valueOf(zIsFullyZoomedOut)));
                return Unit.INSTANCE;
            case 10:
                ((or.b) this.f131231b).f133326a.unregisterReceiver((or.a.C2532a) this.f131232c);
                return Unit.INSTANCE;
            case 11:
                ot.p pVar2 = (ot.p) this.f131231b;
                Context context = (Context) this.f131232c;
                int i15 = ot.p.f133646m;
                try {
                    ot.x xVar = pVar2.f133647a;
                    return pVar2.h(context, xVar.f133698a, xVar.f133699b, xVar.f133700c);
                } catch (Exception e4) {
                    String strJ = androidx.room.a0.j("getProcessedLottieComposition ", pVar2.getClass().getSimpleName(), " has exception = ", e4.getMessage());
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.b(a2Var2, "AnnualReportPlayable", strJ);
                    nt.a aVar4 = nt.a.f127827a;
                    String strF = pVar2.getF133666o();
                    aVar4.getClass();
                    strF.getClass();
                    s sVar = s.f85508a;
                    lt.a.e eVar3 = new lt.a.e(strF, lt.a.d.CHAPTER_MAIN_ANIMATION_FAILED);
                    sVar.getClass();
                    s.a(eVar3);
                    return null;
                }
            case 12:
                qt1.a aVar5 = (qt1.a) this.f131231b;
                q qVar = (q) this.f131232c;
                ot1.e eVar4 = ot1.e.f133785a;
                p2 p2Var2 = aVar5.f147501n;
                do {
                    value2 = p2Var2.getValue();
                    ((Boolean) value2).getClass();
                } while (!p2Var2.b(value2, Boolean.TRUE));
                aVar5.H4();
                qVar.y(false);
                return Unit.INSTANCE;
            case 13:
                c.q qVar2 = (c.q) this.f131231b;
                pt1.l lVar2 = (pt1.l) this.f131232c;
                ot1.u uVar = ot1.u.f133824a;
                qVar2.a(lVar2.f140876c, null);
                return Unit.INSTANCE;
            case 14:
                ov1.b.C2543b c2543b = (ov1.b.C2543b) this.f131231b;
                ov1.b bVar6 = (ov1.b) this.f131232c;
                c2543b.f(false);
                bVar6.requireActivity().getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
            case 15:
                p1 p1Var = (p1) this.f131231b;
                ov1.f fVar = (ov1.f) this.f131232c;
                ov1.f.a aVar6 = ov1.f.f134159c;
                fVar.v6().v5("FBTEditLongDaysFragment", new j(16, fVar, tu1.a.x((List) p1Var.getF182175a())));
                return Unit.INSTANCE;
            case 16:
                ov1.f fVar2 = (ov1.f) this.f131231b;
                ArrayList arrayList = (ArrayList) this.f131232c;
                ov1.f.a aVar7 = ov1.f.f134159c;
                if (fVar2.v6().p5()) {
                    fVar2.v6().C5(arrayList);
                } else if (fVar2.v6().n5()) {
                    p2 p2Var3 = fVar2.v6().Y0;
                    p2Var3.setValue(((mv1.c) p2Var3.getValue()) != null ? new mv1.c(arrayList) : null);
                } else {
                    fVar2.v6().x5(arrayList);
                }
                return Unit.INSTANCE;
            case 17:
                ov1.l lVar3 = (ov1.l) this.f131231b;
                vt1.h hVar = (vt1.h) this.f131232c;
                ov1.l.a aVar8 = ov1.l.f134184c;
                pv1.b bVarU6 = lVar3.u6();
                hVar.getClass();
                bVarU6.Z = hVar;
                ArrayList arrayList2 = new ArrayList();
                String str = bVarU6.Z.f180123d;
                tw1.h hVar2 = tw1.h.STRENGTH_TRAINING_GYM;
                if (p005kotlin.jvm.internal.s.g(str, hVar2.f166715a)) {
                    arrayList2.add(hVar2);
                } else {
                    tw1.h hVar3 = tw1.h.STRENGTH_TRAINING_BODYWEIGHT;
                    if (p005kotlin.jvm.internal.s.g(str, hVar3.f166715a)) {
                        arrayList2.add(hVar3);
                    } else {
                        tw1.h hVar4 = tw1.h.STRENGTH_TRAINING_DUMBBELLS_ONLY;
                        if (p005kotlin.jvm.internal.s.g(str, hVar4.f166715a)) {
                            arrayList2.add(hVar4);
                        } else if (p005kotlin.jvm.internal.s.g(str, vt1.h.NONE.f180123d)) {
                            arrayList2.clear();
                        }
                    }
                }
                if (bVarU6.p5()) {
                    p2 p2Var4 = bVarU6.R0;
                    mv1.b bVar7 = (mv1.b) p2Var4.getValue();
                    p2Var4.setValue(bVar7 != null ? mv1.b.a(bVar7, null, null, null, null, null, null, arrayList2, 447) : null);
                } else if (bVarU6.Y == vt1.o.f180179j) {
                    p2 p2Var5 = bVarU6.V0;
                    mv1.d dVar = (mv1.d) p2Var5.getValue();
                    p2Var5.setValue(dVar != null ? new mv1.d(dVar.f121182a, arrayList2) : null);
                } else {
                    p2 p2Var6 = bVarU6.N0;
                    mv1.a aVar9 = (mv1.a) p2Var6.getValue();
                    p2Var6.setValue(aVar9 != null ? mv1.a.a(aVar9, null, null, null, null, null, arrayList2, null, 383) : null);
                }
                return Unit.INSTANCE;
            case 18:
                p1 p1Var2 = (p1) this.f131231b;
                ov1.m mVar2 = (ov1.m) this.f131232c;
                ov1.m.a aVar10 = ov1.m.f134192b;
                jv1.c cVar7 = (jv1.c) p1Var2.getF182175a();
                if (cVar7 != null) {
                    p2 p2Var7 = ((pv1.b) mVar2.f134193a.getValue()).N0;
                    mv1.a aVar11 = (mv1.a) p2Var7.getValue();
                    p2Var7.setValue(aVar11 != null ? mv1.a.a(aVar11, null, null, null, cVar7, null, null, null, 479) : null);
                    androidx.fragment.app.m activity = mVar2.getActivity();
                    if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                        onBackPressedDispatcher.d();
                    }
                }
                return Unit.INSTANCE;
            case 19:
                e23.l lVar4 = (e23.l) this.f131231b;
                jv1.c cVar8 = (jv1.c) this.f131232c;
                ov1.m.a aVar12 = ov1.m.f134192b;
                lVar4.invoke(cVar8);
                return Unit.INSTANCE;
            case 20:
                p1 p1Var3 = (p1) this.f131231b;
                ov1.p pVar3 = (ov1.p) this.f131232c;
                ov1.p.a aVar13 = ov1.p.f134204c;
                pVar3.v6().v5("FBTEditTrainingDaysFragment", new j(21, pVar3, tu1.a.x((List) p1Var3.getF182175a())));
                return Unit.INSTANCE;
            case 21:
                ov1.p pVar4 = (ov1.p) this.f131231b;
                ArrayList arrayList3 = (ArrayList) this.f131232c;
                ov1.p.a aVar14 = ov1.p.f134204c;
                if (pVar4.v6().p5()) {
                    pVar4.v6().z5(arrayList3);
                } else {
                    pVar4.v6().w5(arrayList3);
                }
                return Unit.INSTANCE;
            case 22:
                r rVar = (r) this.f131231b;
                tw1.k kVar = (tw1.k) this.f131232c;
                r.a aVar15 = r.f134213c;
                pv1.b bVarU7 = rVar.u6();
                kVar.getClass();
                p2 p2Var8 = bVarU7.N0;
                mv1.a aVar16 = (mv1.a) p2Var8.getValue();
                p2Var8.setValue(aVar16 != null ? mv1.a.a(aVar16, kVar, null, null, null, null, null, null, 510) : null);
                return Unit.INSTANCE;
            case 23:
                y yVar = (y) this.f131231b;
                n1 n1Var = (n1) this.f131232c;
                y.a aVar17 = y.f134244b;
                jv1.c cVar9 = (jv1.c) jv1.c.f101018h.get(n1Var.getIntValue());
                if (p005kotlin.jvm.internal.s.g(yVar.v6().T0, Boolean.TRUE)) {
                    pv1.b bVarV6 = yVar.v6();
                    cVar9.getClass();
                    p2 p2Var9 = bVarV6.R0;
                    mv1.b bVar8 = (mv1.b) p2Var9.getValue();
                    p2Var9.setValue(bVar8 != null ? mv1.b.a(bVar8, null, null, null, cVar9, null, null, null, 503) : null);
                } else {
                    pv1.b bVarV7 = yVar.v6();
                    cVar9.getClass();
                    p2 p2Var10 = bVarV7.R0;
                    mv1.b bVar9 = (mv1.b) p2Var10.getValue();
                    p2Var10.setValue(bVar9 != null ? mv1.b.a(bVar9, null, null, null, null, cVar9, null, null, 495) : null);
                }
                androidx.fragment.app.m activity2 = yVar.getActivity();
                if (activity2 != null && (onBackPressedDispatcher2 = activity2.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher2.d();
                }
                return Unit.INSTANCE;
            case 24:
                ((ix.j) this.f131231b).f95634n.i(new o82.a(g22.k.z((DateTime) this.f131232c).b(), null, 2, null), true);
                return Unit.INSTANCE;
            case 25:
                ((e23.l) this.f131231b).invoke((o21.f) this.f131232c);
                return Unit.INSTANCE;
            case 26:
                o0 o0Var = (o0) this.f131231b;
                j1 j1Var = (j1) this.f131232c;
                o0Var.r0(j1Var.f135123a, j1Var.f135129g, j1Var.f135124b, true);
                return Unit.INSTANCE;
            case 27:
                u1 u1Var = (u1) this.f131231b;
                e23.a aVar18 = (e23.a) this.f131232c;
                if (u1Var.f135321a.get() == 0) {
                    aVar18.invoke();
                }
                return Unit.INSTANCE;
            case 28:
                u0 u0Var = (u0) this.f131231b;
                c0 c0Var = (c0) this.f131232c;
                s2.a aVar19 = s2.f135273z;
                Object[] objArr = u0Var.f134733b;
                long[] jArr = u0Var.f134732a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j8 = jArr[i16];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i17 = 8 - ((~(i16 - length)) >>> 31);
                            for (int i18 = 0; i18 < i17; i18++) {
                                if ((255 & j8) < 128) {
                                    c0Var.v(objArr[(i16 << 3) + i18]);
                                }
                                j8 >>= 8;
                            }
                            if (i17 == 8) {
                                if (i16 != length) {
                                    i16++;
                                }
                            }
                        } else if (i16 != length) {
                            i16++;
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                ((e23.l) this.f131231b).invoke((q40.a) this.f131232c);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j(int i14, Object obj, Object obj2) {
        this.f131230a = i14;
        this.f131231b = obj;
        this.f131232c = obj2;
    }
}
