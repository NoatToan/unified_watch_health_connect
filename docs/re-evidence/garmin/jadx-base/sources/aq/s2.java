package aq;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.RestoreActivityViewModel$pollUploadStatus$1", f = "RestoreActivityViewModel.kt", l = {108, 109}, m = "invokeSuspend", v = 2)
public final class s2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f12199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u2 f12200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f12202e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u2 f12203a;

        public a(u2 u2Var) {
            this.f12203a = u2Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            c83.a0 a0Var = (c83.a0) obj;
            ((androidx.lifecycle.y0) this.f12203a.f12263e.getValue()).j(new o13.p(a0Var.f25745a.headers().toMultimap(), new Integer(a0Var.f25745a.code())));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(long j8, u2 u2Var, String str, String str2, t13.d<? super s2> dVar) {
        super(2, dVar);
        this.f12199b = j8;
        this.f12200c = u2Var;
        this.f12201d = str;
        this.f12202e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s2(this.f12199b, this.f12200c, this.f12201d, this.f12202e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
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
        int i14 = this.f12198a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f12198a = 1;
            if (o53.m0.b(this.f12199b, this) != aVar) {
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
        u2 u2Var = this.f12200c;
        am.m mVar = u2Var.f12259a;
        mVar.getClass();
        String str = this.f12201d;
        str.getClass();
        String str2 = this.f12202e;
        str2.getClass();
        r53.c2 c2Var = new r53.c2(new am.c0(mVar, str, str2, null));
        x53.c cVar = o53.s0.f129406a;
        r53.i iVarA = r53.s.A(c2Var, x53.b.f189152a);
        a aVar2 = new a(u2Var);
        this.f12198a = 2;
    }
}
