package jp2;

import e23.p;
import fo2.s;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps2.n;
import ps2.w;
import zn2.g1;
import zn2.t;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationViewModel$initViewModel$1", f = "FitPayCardVerificationViewModel.kt", l = {79, 82}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a f99929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a f99930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f99931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f99932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a f99933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f99934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f99935g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar, long j8, String str, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f99933e = aVar;
        this.f99934f = j8;
        this.f99935g = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f99933e, this.f99934f, this.f99935g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ms2.d dVarG;
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar;
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar2;
        int i14;
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar3;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f99932d;
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar5 = this.f99933e;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    i14 = this.f99931c;
                    aVar = this.f99930b;
                    aVar2 = this.f99929a;
                    r.b(obj);
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar3 = this.f99929a;
                    r.b(obj);
                }
                Logger logger = com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.f51466j;
                aVar3.A4().f205982d.i(aVar3.z4().f205819e.f205629a.f73101a, aVar3);
                aVar3.f51469c.j(Boolean.TRUE);
                return Unit.INSTANCE;
            }
            r.b(obj);
            Logger logger2 = com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.f51466j;
            logger2.debug("initViewModel");
            long j8 = this.f99934f;
            new Long(j8);
            aVar5.getClass();
            String str = this.f99935g;
            aVar5.f51474h = str;
            w wVar = w.f140538a;
            is2.b bVar = is2.b.FITPAY;
            wVar.getClass();
            n nVarI = w.i(j8);
            if (nVarI != null) {
                dVarG = nVarI.g(bVar);
                if (!(dVarG instanceof t)) {
                    dVarG = null;
                }
            } else {
                dVarG = null;
            }
            dVarG.getClass();
            aVar5.f51468b = (t) dVarG;
            ms2.g gVarA = wVar.a(bVar);
            gVarA.getClass();
            aVar5.f51467a = (z0) gVarA;
            z0 z0VarA4 = aVar5.A4();
            logger2.debug("initViewModel: fetching latest credit card");
            g1 g1Var = z0VarA4.f205979a;
            s sVar = aVar5.z4().f205819e.f205629a;
            this.f99929a = aVar5;
            this.f99930b = aVar5;
            this.f99931c = 0;
            this.f99932d = 1;
            ch.qos.logback.classic.Logger logger3 = g1.f205525n;
            obj = g1Var.A(str, sVar, false, this);
            if (obj != aVar4) {
                aVar = aVar5;
                aVar2 = aVar;
                i14 = 0;
            }
            return aVar4;
            yo2.b bVar2 = (yo2.b) obj;
            aVar.getClass();
            bVar2.getClass();
            aVar.f51473g = bVar2;
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.f51466j.debug("initViewModel: fetching verification methods");
            yo2.b bVarY4 = aVar2.y4();
            this.f99929a = aVar2;
            this.f99930b = null;
            this.f99931c = i14;
            this.f99932d = 2;
            if (com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.x4(aVar2, bVarY4, this) != aVar4) {
                aVar3 = aVar2;
                Logger logger4 = com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.f51466j;
                aVar3.A4().f205982d.i(aVar3.z4().f205819e.f205629a.f73101a, aVar3);
                aVar3.f51469c.j(Boolean.TRUE);
                return Unit.INSTANCE;
            }
            return aVar4;
        } catch (Exception e4) {
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.f51466j.error("initViewModel: failed to init view model", (Throwable) e4);
            aVar5.f51469c.j(Boolean.FALSE);
        }
    }
}
