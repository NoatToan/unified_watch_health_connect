package lp2;

import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayApp2AppVerificationFragment;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import e23.p;
import java.util.concurrent.atomic.AtomicReference;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import zn2.g1;
import zn2.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayApp2AppVerificationFragment$verifyResponse$1", f = "FitPayApp2AppVerificationFragment.kt", l = {235}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FitPayApp2AppVerificationFragment f114219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f114220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FitPayApp2AppVerificationFragment f114221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dq2.f f114222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f114223e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FitPayApp2AppVerificationFragment fitPayApp2AppVerificationFragment, dq2.f fVar, String str, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f114221c = fitPayApp2AppVerificationFragment;
        this.f114222d = fVar;
        this.f114223e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f114221c, this.f114222d, this.f114223e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e A[Catch: Exception -> 0x0014, TryCatch #1 {Exception -> 0x0014, blocks: (B:6:0x0010, B:21:0x004a, B:23:0x005e, B:25:0x006d, B:26:0x0075, B:27:0x0078, B:28:0x0079, B:29:0x007c), top: B:56:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x006d A[Catch: Exception -> 0x0014, TryCatch #1 {Exception -> 0x0014, blocks: (B:6:0x0010, B:21:0x004a, B:23:0x005e, B:25:0x006d, B:26:0x0075, B:27:0x0078, B:28:0x0079, B:29:0x007c), top: B:56:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0075 A[Catch: Exception -> 0x0014, TryCatch #1 {Exception -> 0x0014, blocks: (B:6:0x0010, B:21:0x004a, B:23:0x005e, B:25:0x006d, B:26:0x0075, B:27:0x0078, B:28:0x0079, B:29:0x007c), top: B:56:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0079 A[Catch: Exception -> 0x0014, TryCatch #1 {Exception -> 0x0014, blocks: (B:6:0x0010, B:21:0x004a, B:23:0x005e, B:25:0x006d, B:26:0x0075, B:27:0x0078, B:28:0x0079, B:29:0x007c), top: B:56:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        FitPayApp2AppVerificationFragment fitPayApp2AppVerificationFragment;
        Exception e4;
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar;
        AtomicReference<String> atomicReference;
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar;
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar2;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f114220b;
        if (i14 == 0) {
            r.b(obj);
            FitPayApp2AppVerificationFragment fitPayApp2AppVerificationFragment2 = this.f114221c;
            fitPayApp2AppVerificationFragment2.v6().debug("verifyResponse");
            String str = this.f114222d.f60812g;
            if (str != null) {
                String str2 = this.f114223e;
                try {
                    com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar4 = fitPayApp2AppVerificationFragment2.f51483d;
                    if (aVar4 == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    g1 g1Var = aVar4.A4().f205979a;
                    this.f114219a = fitPayApp2AppVerificationFragment2;
                    this.f114220b = 1;
                    if (g1Var.l0(str2, str, this) == aVar3) {
                        return aVar3;
                    }
                    fitPayApp2AppVerificationFragment = fitPayApp2AppVerificationFragment2;
                    fitPayApp2AppVerificationFragment.v6().debug(" verifyResponse : verification successful, Navigating to wallet screen");
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
                } catch (Exception e14) {
                    fitPayApp2AppVerificationFragment = fitPayApp2AppVerificationFragment2;
                    e4 = e14;
                    if ((e4 instanceof NewFitPayException) || ((NewFitPayException) e4).getErrorFlag() != z.CARD_VERIFICATION_INCORRECT_CODE) {
                        fitPayApp2AppVerificationFragment.v6().debug(" verifyResponse: Verification is failed");
                        bVar = fitPayApp2AppVerificationFragment.f51484e;
                        if (bVar == null) {
                            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                            throw null;
                        }
                        bVar.P0(FitPayCardVerificationActivity.a.f.f51461a);
                    } else {
                        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar2 = fitPayApp2AppVerificationFragment.f51484e;
                        if (bVar2 == null) {
                            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                            throw null;
                        }
                        bVar2.P0(FitPayCardVerificationActivity.a.d.f51459a);
                    }
                }
            } else {
                fitPayApp2AppVerificationFragment2.v6().error("verifyResponse: verifyUrl is missing, can not continue app 2 app");
                com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar3 = fitPayApp2AppVerificationFragment2.f51484e;
                if (bVar3 == null) {
                    s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    throw null;
                }
                bVar3.P0(FitPayCardVerificationActivity.a.f.f51461a);
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fitPayApp2AppVerificationFragment = this.f114219a;
            try {
                r.b(obj);
                fitPayApp2AppVerificationFragment.v6().debug(" verifyResponse : verification successful, Navigating to wallet screen");
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
            } catch (Exception e15) {
                e4 = e15;
                if (e4 instanceof NewFitPayException) {
                    fitPayApp2AppVerificationFragment.v6().debug(" verifyResponse: Verification is failed");
                    bVar = fitPayApp2AppVerificationFragment.f51484e;
                    if (bVar == null) {
                        s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        throw null;
                    }
                    bVar.P0(FitPayCardVerificationActivity.a.f.f51461a);
                } else {
                    fitPayApp2AppVerificationFragment.v6().debug(" verifyResponse: Verification is failed");
                    bVar = fitPayApp2AppVerificationFragment.f51484e;
                    if (bVar == null) {
                        s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        throw null;
                    }
                    bVar.P0(FitPayCardVerificationActivity.a.f.f51461a);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
