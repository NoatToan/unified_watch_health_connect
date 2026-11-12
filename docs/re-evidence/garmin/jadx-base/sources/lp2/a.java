package lp2;

import androidx.lifecycle.i0;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayApp2AppVerificationFragment;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import ds.e0;
import e23.p;
import java.util.concurrent.atomic.AtomicReference;
import o13.r;
import o53.b0;
import o53.f0;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import u53.o;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayApp2AppVerificationFragment$startVerificationProcess$1", f = "FitPayApp2AppVerificationFragment.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f114211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f114212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FitPayApp2AppVerificationFragment f114213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f114214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f114215e;

    /* JADX INFO: renamed from: lp2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ldq2/f;", "<anonymous>", "(Lo53/b0;)Ldq2/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayApp2AppVerificationFragment$startVerificationProcess$1$verificationMethod$1$1", f = "FitPayApp2AppVerificationFragment.kt", l = {190}, m = "invokeSuspend", v = 2)
    public static final class C2175a extends v13.i implements p<b0, t13.d<? super dq2.f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f114216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FitPayApp2AppVerificationFragment f114217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ dq2.f f114218c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2175a(FitPayApp2AppVerificationFragment fitPayApp2AppVerificationFragment, dq2.f fVar, t13.d<? super C2175a> dVar) {
            super(2, dVar);
            this.f114217b = fitPayApp2AppVerificationFragment;
            this.f114218c = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C2175a(this.f114217b, this.f114218c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super dq2.f> dVar) {
            return ((C2175a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws NewFitPayException {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f114216a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar2 = this.f114217b.f51483d;
            if (aVar2 == null) {
                s.m("viewModel");
                throw null;
            }
            g1 g1Var = aVar2.A4().f205979a;
            this.f114216a = 1;
            Object objR = g1Var.R(this.f114218c, this);
            return objR == aVar ? aVar : objR;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FitPayApp2AppVerificationFragment fitPayApp2AppVerificationFragment, String str, String str2, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f114213c = fitPayApp2AppVerificationFragment;
        this.f114214d = str;
        this.f114215e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a aVar = new a(this.f114213c, this.f114214d, this.f114215e, dVar);
        aVar.f114212b = obj;
        return aVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code duplicated, block: B:25:0x0083  */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x011f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0127  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0092, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x00b9, please report this as an issue */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        dq2.f fVarD;
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar;
        mp2.b bVar2;
        int i14;
        AtomicReference<String> atomicReference;
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar;
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar2;
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar3;
        b0 b0Var = (b0) this.f114212b;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f114211a;
        FitPayApp2AppVerificationFragment fitPayApp2AppVerificationFragment = this.f114213c;
        if (i15 == 0) {
            r.b(obj);
            fitPayApp2AppVerificationFragment.v6().debug("startVerificationProcess");
            String str = dq2.e.APPROVED.f60805a;
            String str2 = this.f114214d;
            if (s.g(str2, str)) {
                fitPayApp2AppVerificationFragment.v6().debug("---------------------- APPROVED");
                dq2.f fVar = fitPayApp2AppVerificationFragment.f51481b;
                if (fVar != null) {
                    com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar4 = fitPayApp2AppVerificationFragment.f51483d;
                    if (aVar4 == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    fVarD = aVar4.f51471e.d();
                    if (fVarD == null) {
                        t13.g gVarPlus = f0.w(fitPayApp2AppVerificationFragment).f7937b.plus(s0.f129406a);
                        C2175a c2175a = new C2175a(fitPayApp2AppVerificationFragment, fVar, null);
                        this.f114212b = b0Var;
                        this.f114211a = 1;
                        obj = ge1.b.e0(gVarPlus, c2175a, this);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                    } else if (fVarD != null) {
                        fitPayApp2AppVerificationFragment.v6().debug("handleVerificationState");
                        bVar2 = fVarD.f60807b;
                        if (bVar2 == null) {
                            i14 = -1;
                        } else {
                            i14 = FitPayApp2AppVerificationFragment.a.f51488a[bVar2.ordinal()];
                        }
                        if (i14 != 1) {
                            i0 i0VarW = f0.w(fitPayApp2AppVerificationFragment);
                            x53.c cVar = s0.f129406a;
                            ge1.b.T(i0VarW, o.f168762a, null, new b(fitPayApp2AppVerificationFragment, fVarD, this.f114215e, null), 2);
                        } else if (i14 != 2) {
                            fitPayApp2AppVerificationFragment.v6().debug("handleVerificationState: app to app verification  STATE -> " + bVar2 + StringUtils.SPACE);
                            bVar3 = fitPayApp2AppVerificationFragment.f51484e;
                            if (bVar3 != null) {
                                s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                                throw null;
                            }
                            bVar3.P0(FitPayCardVerificationActivity.a.f.f51461a);
                        } else {
                            fitPayApp2AppVerificationFragment.v6().debug("handleVerificationState: app to app verification  SUCCESS -> " + bVar2 + StringUtils.SPACE);
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                            atomicReference = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51195f;
                            aVar = fitPayApp2AppVerificationFragment.f51483d;
                            if (aVar != null) {
                                s.m("viewModel");
                                throw null;
                            }
                            atomicReference.set(aVar.y4().getExternalTokenReference());
                            aVar2 = fitPayApp2AppVerificationFragment.f51483d;
                            if (aVar2 != null) {
                                s.m("viewModel");
                                throw null;
                            }
                            aVar2.f51475i.j(com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.b.CARD_VERIFIED);
                        }
                    }
                }
                fitPayApp2AppVerificationFragment.v6().error("startVerificationProcess: verificationId is not available");
                bVar = fitPayApp2AppVerificationFragment.f51484e;
                if (bVar != null) {
                    bVar.P0(FitPayCardVerificationActivity.a.f.f51461a);
                    return Unit.INSTANCE;
                }
                s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                throw null;
            }
            e0.v("startVerificationProcess : Failed, response: ", str2, fitPayApp2AppVerificationFragment.v6());
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar4 = fitPayApp2AppVerificationFragment.f51484e;
            if (bVar4 == null) {
                s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                throw null;
            }
            bVar4.P0(FitPayCardVerificationActivity.a.f.f51461a);
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        fVarD = (dq2.f) obj;
        if (fVarD != null) {
            fitPayApp2AppVerificationFragment.v6().debug("handleVerificationState");
            bVar2 = fVarD.f60807b;
            if (bVar2 == null) {
                i14 = -1;
            } else {
                i14 = FitPayApp2AppVerificationFragment.a.f51488a[bVar2.ordinal()];
            }
            if (i14 != 1) {
                i0 i0VarW2 = f0.w(fitPayApp2AppVerificationFragment);
                x53.c cVar2 = s0.f129406a;
                ge1.b.T(i0VarW2, o.f168762a, null, new b(fitPayApp2AppVerificationFragment, fVarD, this.f114215e, null), 2);
            } else if (i14 != 2) {
                fitPayApp2AppVerificationFragment.v6().debug("handleVerificationState: app to app verification  STATE -> " + bVar2 + StringUtils.SPACE);
                bVar3 = fitPayApp2AppVerificationFragment.f51484e;
                if (bVar3 != null) {
                    s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    throw null;
                }
                bVar3.P0(FitPayCardVerificationActivity.a.f.f51461a);
            } else {
                fitPayApp2AppVerificationFragment.v6().debug("handleVerificationState: app to app verification  SUCCESS -> " + bVar2 + StringUtils.SPACE);
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                atomicReference = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51195f;
                aVar = fitPayApp2AppVerificationFragment.f51483d;
                if (aVar != null) {
                    s.m("viewModel");
                    throw null;
                }
                atomicReference.set(aVar.y4().getExternalTokenReference());
                aVar2 = fitPayApp2AppVerificationFragment.f51483d;
                if (aVar2 != null) {
                    s.m("viewModel");
                    throw null;
                }
                aVar2.f51475i.j(com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.b.CARD_VERIFIED);
            }
            return Unit.INSTANCE;
        }
        fitPayApp2AppVerificationFragment.v6().error("startVerificationProcess: verificationId is not available");
        bVar = fitPayApp2AppVerificationFragment.f51484e;
        if (bVar != null) {
            bVar.P0(FitPayCardVerificationActivity.a.f.f51461a);
            return Unit.INSTANCE;
        }
        s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        throw null;
    }
}
