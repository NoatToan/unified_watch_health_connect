package com.google.maps.android.compose.streetview;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.StreetViewPanoramaView;
import e23.p;
import java.util.Objects;
import o53.b0;
import o53.m0;
import p005kotlin.KotlinNothingValueException;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.c;
import p3.m;
import p3.n;
import p3.o;
import p3.p0;
import p3.r;
import p3.s;
import p3.x1;
import p3.x3;
import t13.d;
import u13.f;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "com.google.maps.android.compose.streetview.StreetViewKt$StreetView$6$1", f = "StreetView.kt", l = {196, 208}, m = "invokeSuspend")
public final class StreetViewKt$StreetView$6$1 extends i implements p<b0, d<? super Unit>, Object> {
    final /* synthetic */ x3<StreetViewPanoramaEventListeners> $clickListeners$delegate;
    final /* synthetic */ x3<StreetViewCameraPositionState> $currentCameraPositionState$delegate;
    final /* synthetic */ x3<Boolean> $currentIsPanningGestureEnabled$delegate;
    final /* synthetic */ x3<Boolean> $currentIsStreetNamesEnabled$delegate;
    final /* synthetic */ x3<Boolean> $currentIsUserNavigationEnabled$delegate;
    final /* synthetic */ x3<Boolean> $currentIsZoomGesturesEnabled$delegate;
    final /* synthetic */ p3.p $parentComposition;
    final /* synthetic */ StreetViewPanoramaView $streetView;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreetViewKt$StreetView$6$1(StreetViewPanoramaView streetViewPanoramaView, p3.p pVar, x3<StreetViewCameraPositionState> x3Var, x3<Boolean> x3Var2, x3<Boolean> x3Var3, x3<Boolean> x3Var4, x3<Boolean> x3Var5, x3<StreetViewPanoramaEventListeners> x3Var6, d<? super StreetViewKt$StreetView$6$1> dVar) {
        super(2, dVar);
        this.$streetView = streetViewPanoramaView;
        this.$parentComposition = pVar;
        this.$currentCameraPositionState$delegate = x3Var;
        this.$currentIsPanningGestureEnabled$delegate = x3Var2;
        this.$currentIsStreetNamesEnabled$delegate = x3Var3;
        this.$currentIsUserNavigationEnabled$delegate = x3Var4;
        this.$currentIsZoomGesturesEnabled$delegate = x3Var5;
        this.$clickListeners$delegate = x3Var6;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new StreetViewKt$StreetView$6$1(this.$streetView, this.$parentComposition, this.$currentCameraPositionState$delegate, this.$currentIsPanningGestureEnabled$delegate, this.$currentIsStreetNamesEnabled$delegate, this.$currentIsUserNavigationEnabled$delegate, this.$currentIsZoomGesturesEnabled$delegate, this.$clickListeners$delegate, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((StreetViewKt$StreetView$6$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        p3.p pVar;
        p<? super m, ? super Integer, Unit> pVar2;
        r rVar;
        o oVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                StreetViewPanoramaView streetViewPanoramaView = this.$streetView;
                p3.p pVar3 = this.$parentComposition;
                final x3<StreetViewCameraPositionState> x3Var = this.$currentCameraPositionState$delegate;
                final x3<Boolean> x3Var2 = this.$currentIsPanningGestureEnabled$delegate;
                final x3<Boolean> x3Var3 = this.$currentIsStreetNamesEnabled$delegate;
                final x3<Boolean> x3Var4 = this.$currentIsUserNavigationEnabled$delegate;
                final x3<Boolean> x3Var5 = this.$currentIsZoomGesturesEnabled$delegate;
                final x3<StreetViewPanoramaEventListeners> x3Var6 = this.$clickListeners$delegate;
                z3.e eVar = new z3.e(-1039809540, true, new p<m, Integer, Unit>() { // from class: com.google.maps.android.compose.streetview.StreetViewKt$StreetView$6$1$1$1
                    /* JADX WARN: Code duplicated, block: B:13:0x006c  */
                    public final void invoke(m mVar, int i15) {
                        if ((i15 & 3) == 2 && mVar.b()) {
                            mVar.e();
                            return;
                        }
                        x1 x1Var = n.f135158a;
                        StreetViewCameraPositionState streetViewCameraPositionStateStreetView$lambda$11 = StreetViewKt.StreetView$lambda$11(x3Var);
                        boolean zStreetView$lambda$12 = StreetViewKt.StreetView$lambda$12(x3Var2);
                        boolean zStreetView$lambda$13 = StreetViewKt.StreetView$lambda$13(x3Var3);
                        boolean zStreetView$lambda$14 = StreetViewKt.StreetView$lambda$14(x3Var4);
                        boolean zStreetView$lambda$15 = StreetViewKt.StreetView$lambda$15(x3Var5);
                        StreetViewPanoramaEventListeners streetViewPanoramaEventListenersStreetView$lambda$17 = StreetViewKt.StreetView$lambda$17(x3Var6);
                        mVar.C(-647819622);
                        c<?> cVarF = mVar.F();
                        cVarF.getClass();
                        StreetViewPanorama streetViewPanorama = ((StreetViewPanoramaApplier) cVarF).getStreetViewPanorama();
                        mVar.C(-406642905);
                        boolean zR = mVar.r(streetViewCameraPositionStateStreetView$lambda$11) | mVar.r(streetViewPanorama) | mVar.B(streetViewPanoramaEventListenersStreetView$lambda$17);
                        Object objQ = mVar.q();
                        if (zR) {
                            objQ = new StreetViewPanoramaUpdaterKt$StreetViewUpdater$1$1(streetViewCameraPositionStateStreetView$lambda$11, streetViewPanorama, streetViewPanoramaEventListenersStreetView$lambda$17);
                            mVar.K(objQ);
                        } else {
                            m.f135153a.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new StreetViewPanoramaUpdaterKt$StreetViewUpdater$1$1(streetViewCameraPositionStateStreetView$lambda$11, streetViewPanorama, streetViewPanoramaEventListenersStreetView$lambda$17);
                                mVar.K(objQ);
                            }
                        }
                        e23.a aVar2 = (e23.a) objQ;
                        mVar.f();
                        if (!(mVar.F() instanceof StreetViewPanoramaApplier)) {
                            p0.l();
                            throw null;
                        }
                        mVar.H();
                        if (mVar.getT()) {
                            mVar.M(aVar2);
                        } else {
                            mVar.c();
                        }
                        b4.c(new StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$1(zStreetView$lambda$12), Boolean.valueOf(zStreetView$lambda$12), mVar);
                        b4.c(new StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$2(zStreetView$lambda$13), Boolean.valueOf(zStreetView$lambda$13), mVar);
                        b4.c(new StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$3(zStreetView$lambda$14), Boolean.valueOf(zStreetView$lambda$14), mVar);
                        b4.c(new StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$4(zStreetView$lambda$15), Boolean.valueOf(zStreetView$lambda$15), mVar);
                        b4.c(StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$5.INSTANCE, streetViewPanoramaEventListenersStreetView$lambda$17, mVar);
                        mVar.y();
                        mVar.f();
                    }

                    @Override // e23.p
                    public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
                        invoke(mVar, num.intValue());
                        return Unit.INSTANCE;
                    }
                });
                this.L$0 = pVar3;
                this.L$1 = eVar;
                this.L$2 = this;
                this.L$3 = streetViewPanoramaView;
                this.label = 1;
                t13.i iVar = new t13.i(f.b(this));
                streetViewPanoramaView.getStreetViewPanoramaAsync(new StreetViewKt$newComposition$$inlined$awaitStreetViewPanorama$1(iVar));
                obj = iVar.a();
                if (obj != aVar) {
                    pVar = pVar3;
                    pVar2 = eVar;
                }
                return aVar;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oVar = (o) this.L$0;
                try {
                    o13.r.b(obj);
                    throw new KotlinNothingValueException();
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    oVar.dispose();
                    throw th4;
                }
            }
            pVar2 = (p) this.L$1;
            pVar = (p3.p) this.L$0;
            o13.r.b(obj);
            this.L$0 = rVar;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            if (m0.a(this) != aVar) {
                oVar = rVar;
                throw new KotlinNothingValueException();
            }
            return aVar;
        } catch (Throwable th5) {
            th = th5;
            oVar = rVar;
            Throwable th6 = th;
            oVar.dispose();
            throw th6;
        }
        StreetViewPanorama streetViewPanorama = (StreetViewPanorama) obj;
        Objects.toString(streetViewPanorama.getLocation());
        StreetViewPanoramaApplier streetViewPanoramaApplier = new StreetViewPanoramaApplier(streetViewPanorama);
        Object obj2 = s.f135268a;
        rVar = new r(pVar, streetViewPanoramaApplier);
        rVar.r(pVar2);
    }
}
