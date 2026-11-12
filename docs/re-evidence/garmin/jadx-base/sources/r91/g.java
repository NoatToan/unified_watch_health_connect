package r91;

import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;
import u53.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.domain.usecase.PRHistoryUseCase$declineCurrentPRCandidate$1", f = "PRHistoryUseCase.kt", l = {175}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f151400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f151401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f151402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f151403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f151404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l<q91.d, Unit> f151405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l<Long, Unit> f151406g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.domain.usecase.PRHistoryUseCase$declineCurrentPRCandidate$1$2$2", f = "PRHistoryUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f151407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<q91.d, Unit> f151408b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(k kVar, l<? super q91.d, Unit> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f151407a = kVar;
            this.f151408b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f151407a, this.f151408b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            q91.d dVar = ((aa1.e) this.f151407a.f151437k.f150540a.getValue()).f2262d;
            if (dVar != null) {
                this.f151408b.invoke(dVar);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(k kVar, l<? super q91.d, Unit> lVar, l<? super Long, Unit> lVar2, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f151404e = kVar;
        this.f151405f = lVar;
        this.f151406g = lVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f151404e, this.f151405f, this.f151406g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        aa1.e value;
        Long l14;
        l<q91.d, Unit> lVar;
        Object objC;
        k kVar;
        l<Long, Unit> lVar2;
        z1<aa1.e> z1Var;
        aa1.e value2;
        aa1.e value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151403d;
        k kVar2 = this.f151404e;
        if (i14 == 0) {
            r.b(obj);
            z1<aa1.e> z1Var2 = kVar2.f151431e;
            do {
                value = z1Var2.getValue();
            } while (!z1Var2.b(value, aa1.e.b(value, true, false, null, null, null, null, null, 2046)));
            n91.a aVar2 = kVar2.f151432f;
            if (aVar2 != null && (l14 = aVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) != null) {
                long jLongValue = l14.longValue();
                o91.a aVar3 = kVar2.f151428b;
                this.f151400a = kVar2;
                lVar = this.f151405f;
                this.f151401b = lVar;
                l<Long, Unit> lVar3 = this.f151406g;
                this.f151402c = lVar3;
                this.f151403d = 1;
                objC = aVar3.c(jLongValue, this);
                if (objC == aVar) {
                    return aVar;
                }
                kVar = kVar2;
                lVar2 = lVar3;
            }
            z1Var = kVar2.f151431e;
            do {
                value2 = z1Var.getValue();
            } while (!z1Var.b(value2, aa1.e.b(value2, false, false, null, null, null, null, null, 2046)));
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        lVar2 = this.f151402c;
        l<q91.d, Unit> lVar4 = this.f151401b;
        kVar = this.f151400a;
        r.b(obj);
        lVar = lVar4;
        objC = obj;
        if (((v2) objC) instanceof v2.b) {
            z1<aa1.e> z1Var3 = kVar.f151431e;
            do {
                value3 = z1Var3.getValue();
            } while (!z1Var3.b(value3, aa1.e.b(value3, false, false, null, null, null, null, null, 1535)));
            if (((aa1.e) kVar.f151437k.f150540a.getValue()).f2269k.isEmpty()) {
                b0 b0Var = kVar.f151429c;
                x53.c cVar = s0.f129406a;
                ge1.b.T(b0Var, o.f168762a, null, new a(kVar, lVar, null), 2);
            }
            n91.a aVar4 = kVar.f151432f;
            if (aVar4 != null) {
                lVar2.invoke(new Long(aVar4.getTypeId()));
            }
        } else {
            kVar.f151430d.a();
        }
        z1Var = kVar2.f151431e;
        do {
            value2 = z1Var.getValue();
        } while (!z1Var.b(value2, aa1.e.b(value2, false, false, null, null, null, null, null, 2046)));
        return Unit.INSTANCE;
    }
}
