package bm;

import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.c2;
import r53.z1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.advancedactivityediting.TrimActivityViewModel$pollUploadStatus$1", f = "TrimActivityViewModel.kt", l = {490, 491}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d f18773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f18774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f18775e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d f18776a;

        public a(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar) {
            this.f18776a = dVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            c83.a0 a0Var = (c83.a0) obj;
            ((z1) this.f18776a.B.getValue()).setValue(new o13.p(a0Var.f25745a.headers().toMultimap(), new Integer(a0Var.f25745a.code())));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(long j8, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar, String str, String str2, t13.d<? super c0> dVar2) {
        super(2, dVar2);
        this.f18772b = j8;
        this.f18773c = dVar;
        this.f18774d = str;
        this.f18775e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c0(this.f18772b, this.f18773c, this.f18774d, this.f18775e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r1.collect(r2, r7) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18771a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f18771a = 1;
            if (o53.m0.b(this.f18772b, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar = this.f18773c;
        am.m mVar = dVar.f28863a;
        mVar.getClass();
        String str = this.f18774d;
        str.getClass();
        String str2 = this.f18775e;
        str2.getClass();
        c2 c2Var = new c2(new am.c0(mVar, str, str2, null));
        x53.c cVar = s0.f129406a;
        r53.i iVarA = r53.s.A(c2Var, x53.b.f189152a);
        a aVar2 = new a(dVar);
        this.f18771a = 2;
    }
}
