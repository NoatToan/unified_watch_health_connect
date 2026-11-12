package com.garmin.feature.garminpay.providers.gpay.ui.common;

import androidx.lifecycle.i0;
import com.garmin.feature.garminpay.providers.gpay.ui.garminpaytermsconditions.NewFitPayTermsAndConditionActivity;
import e23.p;
import gp2.g;
import lc.u0;
import o13.r;
import o53.b0;
import o53.f0;
import o53.s0;
import op2.l;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import rd2.f;
import rd2.j;
import t13.d;
import u53.o;
import v13.e;
import v13.i;
import vb.h;
import zn2.g1;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebNavigationActivity$handleSetupComplete$1", f = "NewFitPayWebNavigationActivity.kt", l = {264}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewFitPayWebNavigationActivity f51583b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebNavigationActivity$handleSetupComplete$1$1", f = "NewFitPayWebNavigationActivity.kt", l = {266}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NewFitPayWebNavigationActivity f51585b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NewFitPayWebNavigationActivity newFitPayWebNavigationActivity, d<? super a> dVar) {
            super(2, dVar);
            this.f51585b = newFitPayWebNavigationActivity;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f51585b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51584a;
            NewFitPayWebNavigationActivity newFitPayWebNavigationActivity = this.f51585b;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    z0 z0Var = newFitPayWebNavigationActivity.f51558n;
                    if (z0Var == null) {
                        s.m("fitPayServiceProvider");
                        throw null;
                    }
                    g1 g1Var = z0Var.f205979a;
                    this.f51584a = 1;
                    if (g1Var.b0(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                try {
                    j jVar = f.a().f152045a;
                    op2.d dVar = newFitPayWebNavigationActivity.f51554j;
                    if (dVar == null) {
                        s.m("fitPayWebNavigationViewModel");
                        throw null;
                    }
                    long deviceUnitId = dVar.getDeviceUnitId();
                    jVar.getClass();
                    sd2.f fVarI = j.i(deviceUnitId, null);
                    if (fVarI == null) {
                        return Unit.INSTANCE;
                    }
                    newFitPayWebNavigationActivity.f51560p = fVarI;
                    return Unit.INSTANCE;
                } catch (Exception e4) {
                    Logger logger = NewFitPayWebNavigationActivity.f51550x;
                    op2.d dVar2 = newFitPayWebNavigationActivity.f51554j;
                    if (dVar2 == null) {
                        s.m("fitPayWebNavigationViewModel");
                        throw null;
                    }
                    logger.warn("handleAddCardFlow: can not get device record for " + dVar2.getDeviceUnitId(), (Throwable) e4);
                    return Unit.INSTANCE;
                }
            } catch (Exception e14) {
                NewFitPayWebNavigationActivity.f51550x.error("handleSetupComplete: failed to load user data", (Throwable) e14);
                return Unit.INSTANCE;
            }
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51586a;

        static {
            int[] iArr = new int[NewFitPayWebNavigationActivity.b.values().length];
            try {
                iArr[NewFitPayWebNavigationActivity.b.ADD_CARD_FLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NewFitPayWebNavigationActivity.b.MANAGE_CARD_FLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f51586a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NewFitPayWebNavigationActivity newFitPayWebNavigationActivity, d<? super c> dVar) {
        super(2, dVar);
        this.f51583b = newFitPayWebNavigationActivity;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new c(this.f51583b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f51582a;
        NewFitPayWebNavigationActivity newFitPayWebNavigationActivity = this.f51583b;
        if (i14 == 0) {
            r.b(obj);
            x53.c cVar = s0.f129406a;
            a aVar2 = new a(newFitPayWebNavigationActivity, null);
            this.f51582a = 1;
            if (ge1.b.e0(cVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        if (newFitPayWebNavigationActivity.f51560p == null) {
            NewFitPayWebNavigationActivity.f51550x.warn("handleAddCardFlow: deviceRecord not found. Check if card is orphan card");
        }
        NewFitPayWebNavigationActivity.b bVar = newFitPayWebNavigationActivity.f51551g;
        if (bVar == null) {
            s.m("fitPayWebViewNavigation");
            throw null;
        }
        int i15 = b.f51586a[bVar.ordinal()];
        if (i15 == 1) {
            z0 z0Var = newFitPayWebNavigationActivity.f51558n;
            if (z0Var == null) {
                s.m("fitPayServiceProvider");
                throw null;
            }
            if (z0Var.f205979a.W()) {
                g gVar = newFitPayWebNavigationActivity.f51556l;
                int i16 = gVar == null ? -1 : NewFitPayWebNavigationActivity.c.f51571d[gVar.ordinal()];
                if (i16 != -1) {
                    if (i16 == 1 || i16 == 2 || i16 == 3) {
                        z0 z0Var2 = newFitPayWebNavigationActivity.f51558n;
                        if (z0Var2 == null) {
                            s.m("fitPayServiceProvider");
                            throw null;
                        }
                        z0Var2.s();
                    } else if (i16 != 4 && i16 != 5) {
                        u0.r();
                        return null;
                    }
                }
                if (newFitPayWebNavigationActivity.ea()) {
                    newFitPayWebNavigationActivity.ha();
                } else {
                    newFitPayWebNavigationActivity.fa(false);
                }
            } else {
                qy2.d dVar = qy2.d.f148594a;
                NewFitPayTermsAndConditionActivity.a aVar3 = NewFitPayTermsAndConditionActivity.f51587j;
                op2.d dVar2 = newFitPayWebNavigationActivity.f51554j;
                if (dVar2 == null) {
                    s.m("fitPayWebNavigationViewModel");
                    throw null;
                }
                Long lValueOf = Long.valueOf(dVar2.getDeviceUnitId());
                aVar3.getClass();
                oc.b.L(newFitPayWebNavigationActivity, dVar, NewFitPayTermsAndConditionActivity.a.a(newFitPayWebNavigationActivity, lValueOf), newFitPayWebNavigationActivity.f51561q);
            }
        } else {
            if (i15 != 2) {
                u0.r();
                return null;
            }
            i0 i0VarW = f0.w(newFitPayWebNavigationActivity);
            x53.c cVar2 = s0.f129406a;
            ge1.b.T(i0VarW, o.f168762a, null, new l(newFitPayWebNavigationActivity, null), 2);
        }
        return Unit.INSTANCE;
    }
}
