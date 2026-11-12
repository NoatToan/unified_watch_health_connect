package lp2;

import androidx.lifecycle.i0;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayApp2WebVerificationFragment;
import e23.p;
import java.util.concurrent.atomic.AtomicReference;
import o13.r;
import o53.b0;
import o53.f0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import u53.o;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayApp2WebVerificationFragment$startVerificationProcess$1", f = "FitPayApp2WebVerificationFragment.kt", l = {180}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f114224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f114225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FitPayApp2WebVerificationFragment f114226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f114227d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ldq2/f;", "<anonymous>", "(Lo53/b0;)Ldq2/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayApp2WebVerificationFragment$startVerificationProcess$1$verificationMethod$1$1", f = "FitPayApp2WebVerificationFragment.kt", l = {181}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super dq2.f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f114228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FitPayApp2WebVerificationFragment f114229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ dq2.f f114230c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FitPayApp2WebVerificationFragment fitPayApp2WebVerificationFragment, dq2.f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f114229b = fitPayApp2WebVerificationFragment;
            this.f114230c = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f114229b, this.f114230c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super dq2.f> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws NewFitPayException {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f114228a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar2 = this.f114229b.f51494d;
            if (aVar2 == null) {
                s.m("viewModel");
                throw null;
            }
            g1 g1Var = aVar2.A4().f205979a;
            this.f114228a = 1;
            Object objR = g1Var.R(this.f114230c, this);
            return objR == aVar ? aVar : objR;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FitPayApp2WebVerificationFragment fitPayApp2WebVerificationFragment, String str, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f114226c = fitPayApp2WebVerificationFragment;
        this.f114227d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f114226c, this.f114227d, dVar);
        cVar.f114225b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        dq2.f fVarD;
        mp2.b bVar;
        int i14;
        AtomicReference<String> atomicReference;
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar;
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar2;
        b0 b0Var = (b0) this.f114225b;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f114224a;
        FitPayApp2WebVerificationFragment fitPayApp2WebVerificationFragment = this.f114226c;
        if (i15 == 0) {
            r.b(obj);
            fitPayApp2WebVerificationFragment.w6().debug("startVerificationProcess");
            dq2.f fVar = fitPayApp2WebVerificationFragment.f51492b;
            if (fVar != null) {
                com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar4 = fitPayApp2WebVerificationFragment.f51494d;
                if (aVar4 == null) {
                    s.m("viewModel");
                    throw null;
                }
                fVarD = aVar4.f51471e.d();
                if (fVarD == null) {
                    t13.g gVarPlus = f0.w(fitPayApp2WebVerificationFragment).f7937b.plus(s0.f129406a);
                    a aVar5 = new a(fitPayApp2WebVerificationFragment, fVar, null);
                    this.f114225b = b0Var;
                    this.f114224a = 1;
                    obj = ge1.b.e0(gVarPlus, aVar5, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                }
                if (fVarD != null) {
                    fitPayApp2WebVerificationFragment.w6().debug("handleVerificationState");
                    bVar = fVarD.f60807b;
                    if (bVar == null) {
                        i14 = -1;
                    } else {
                        i14 = FitPayApp2WebVerificationFragment.a.f51498a[bVar.ordinal()];
                    }
                    if (i14 != 1) {
                        i0 i0VarW = f0.w(fitPayApp2WebVerificationFragment);
                        x53.c cVar = s0.f129406a;
                        ge1.b.T(i0VarW, o.f168762a, null, new d(fitPayApp2WebVerificationFragment, fVarD, this.f114227d, null), 2);
                    } else if (i14 != 2) {
                        fitPayApp2WebVerificationFragment.w6().debug("handleVerificationState: app to app verification  STATE -> {} ", bVar);
                        fitPayApp2WebVerificationFragment.y6();
                    } else {
                        fitPayApp2WebVerificationFragment.w6().debug("handleVerificationState: app to app verification  SUCCESS -> {} ", bVar);
                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                        atomicReference = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51195f;
                        aVar = fitPayApp2WebVerificationFragment.f51494d;
                        if (aVar != null) {
                            s.m("viewModel");
                            throw null;
                        }
                        atomicReference.set(aVar.y4().getExternalTokenReference());
                        aVar2 = fitPayApp2WebVerificationFragment.f51494d;
                        if (aVar2 != null) {
                            s.m("viewModel");
                            throw null;
                        }
                        aVar2.f51475i.j(com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.b.CARD_VERIFIED);
                    }
                    return Unit.INSTANCE;
                }
            }
            fitPayApp2WebVerificationFragment.w6().error("startVerificationProcess: verificationId is not available");
            fitPayApp2WebVerificationFragment.y6();
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        fVarD = (dq2.f) obj;
        if (fVarD != null) {
            fitPayApp2WebVerificationFragment.w6().debug("handleVerificationState");
            bVar = fVarD.f60807b;
            if (bVar == null) {
                i14 = -1;
            } else {
                i14 = FitPayApp2WebVerificationFragment.a.f51498a[bVar.ordinal()];
            }
            if (i14 != 1) {
                i0 i0VarW2 = f0.w(fitPayApp2WebVerificationFragment);
                x53.c cVar2 = s0.f129406a;
                ge1.b.T(i0VarW2, o.f168762a, null, new d(fitPayApp2WebVerificationFragment, fVarD, this.f114227d, null), 2);
            } else if (i14 != 2) {
                fitPayApp2WebVerificationFragment.w6().debug("handleVerificationState: app to app verification  STATE -> {} ", bVar);
                fitPayApp2WebVerificationFragment.y6();
            } else {
                fitPayApp2WebVerificationFragment.w6().debug("handleVerificationState: app to app verification  SUCCESS -> {} ", bVar);
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                atomicReference = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51195f;
                aVar = fitPayApp2WebVerificationFragment.f51494d;
                if (aVar != null) {
                    s.m("viewModel");
                    throw null;
                }
                atomicReference.set(aVar.y4().getExternalTokenReference());
                aVar2 = fitPayApp2WebVerificationFragment.f51494d;
                if (aVar2 != null) {
                    s.m("viewModel");
                    throw null;
                }
                aVar2.f51475i.j(com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.b.CARD_VERIFIED);
            }
            return Unit.INSTANCE;
        }
        fitPayApp2WebVerificationFragment.w6().error("startVerificationProcess: verificationId is not available");
        fitPayApp2WebVerificationFragment.y6();
        return Unit.INSTANCE;
    }
}
