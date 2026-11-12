package lp2;

import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayApp2WebVerificationFragment;
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
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayApp2WebVerificationFragment$verifyResponse$1", f = "FitPayApp2WebVerificationFragment.kt", l = {219}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FitPayApp2WebVerificationFragment f114231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f114232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FitPayApp2WebVerificationFragment f114233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dq2.f f114234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f114235e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FitPayApp2WebVerificationFragment fitPayApp2WebVerificationFragment, dq2.f fVar, String str, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f114233c = fitPayApp2WebVerificationFragment;
        this.f114234d = fVar;
        this.f114235e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f114233c, this.f114234d, this.f114235e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c A[Catch: Exception -> 0x0012, TryCatch #1 {Exception -> 0x0012, blocks: (B:6:0x000e, B:21:0x0048, B:23:0x005c, B:25:0x006b, B:26:0x0073, B:27:0x0076, B:28:0x0077, B:29:0x007a), top: B:48:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[Catch: Exception -> 0x0012, TryCatch #1 {Exception -> 0x0012, blocks: (B:6:0x000e, B:21:0x0048, B:23:0x005c, B:25:0x006b, B:26:0x0073, B:27:0x0076, B:28:0x0077, B:29:0x007a), top: B:48:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[Catch: Exception -> 0x0012, TryCatch #1 {Exception -> 0x0012, blocks: (B:6:0x000e, B:21:0x0048, B:23:0x005c, B:25:0x006b, B:26:0x0073, B:27:0x0076, B:28:0x0077, B:29:0x007a), top: B:48:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0077 A[Catch: Exception -> 0x0012, TryCatch #1 {Exception -> 0x0012, blocks: (B:6:0x000e, B:21:0x0048, B:23:0x005c, B:25:0x006b, B:26:0x0073, B:27:0x0076, B:28:0x0077, B:29:0x007a), top: B:48:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00a3, please report this as an issue */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        FitPayApp2WebVerificationFragment fitPayApp2WebVerificationFragment;
        Exception e4;
        AtomicReference<String> atomicReference;
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar;
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar2;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f114232b;
        if (i14 == 0) {
            r.b(obj);
            FitPayApp2WebVerificationFragment fitPayApp2WebVerificationFragment2 = this.f114233c;
            fitPayApp2WebVerificationFragment2.w6().debug("verifyResponse");
            String str = this.f114234d.f60812g;
            if (str != null) {
                String str2 = this.f114235e;
                try {
                    com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar4 = fitPayApp2WebVerificationFragment2.f51494d;
                    if (aVar4 == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    g1 g1Var = aVar4.A4().f205979a;
                    this.f114231a = fitPayApp2WebVerificationFragment2;
                    this.f114232b = 1;
                    if (g1Var.m0(str2, str, this) == aVar3) {
                        return aVar3;
                    }
                    fitPayApp2WebVerificationFragment = fitPayApp2WebVerificationFragment2;
                    fitPayApp2WebVerificationFragment.w6().debug("verifyResponse : verification successful, Navigating to wallet screen");
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
                } catch (Exception e14) {
                    fitPayApp2WebVerificationFragment = fitPayApp2WebVerificationFragment2;
                    e4 = e14;
                    if ((e4 instanceof NewFitPayException) || ((NewFitPayException) e4).getErrorFlag() != z.CARD_VERIFICATION_INCORRECT_CODE) {
                        fitPayApp2WebVerificationFragment.w6().debug("verifyResponse: Verification is failed: " + e4.getMessage());
                        fitPayApp2WebVerificationFragment.y6();
                    } else {
                        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar = fitPayApp2WebVerificationFragment.f51495e;
                        if (bVar == null) {
                            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                            throw null;
                        }
                        bVar.P0(FitPayCardVerificationActivity.a.d.f51459a);
                    }
                }
            } else {
                fitPayApp2WebVerificationFragment2.w6().error("verifyResponse: verifyUrl is missing, can not continue app 2 app");
                fitPayApp2WebVerificationFragment2.y6();
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fitPayApp2WebVerificationFragment = this.f114231a;
            try {
                r.b(obj);
                fitPayApp2WebVerificationFragment.w6().debug("verifyResponse : verification successful, Navigating to wallet screen");
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
            } catch (Exception e15) {
                e4 = e15;
                if (e4 instanceof NewFitPayException) {
                    fitPayApp2WebVerificationFragment.w6().debug("verifyResponse: Verification is failed: " + e4.getMessage());
                    fitPayApp2WebVerificationFragment.y6();
                } else {
                    fitPayApp2WebVerificationFragment.w6().debug("verifyResponse: Verification is failed: " + e4.getMessage());
                    fitPayApp2WebVerificationFragment.y6();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
