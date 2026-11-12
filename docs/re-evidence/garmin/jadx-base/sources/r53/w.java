package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lr53/w;", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w implements i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f150915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.q f150916b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {109, 110}, m = "collect")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f150917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f150918b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public w f150920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public j f150921e;

        public a(t13.d dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150917a = obj;
            this.f150918b |= Integer.MIN_VALUE;
            return w.this.collect(null, this);
        }
    }

    public w(i iVar, e23.q qVar) {
        this.f150915a = iVar;
        this.f150916b = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r2.invoke(r6, r7, r0) == r1) goto L24;
     */
    @Override // r53.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(j<? super Object> jVar, t13.d<? super Unit> dVar) throws Throwable {
        a aVar;
        w wVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150918b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150918b = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objH = aVar.f150917a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150918b;
        if (i15 == 0) {
            o13.r.b(objH);
            aVar.f150920d = this;
            aVar.f150921e = jVar;
            aVar.f150918b = 1;
            objH = s.h(this.f150915a, jVar, aVar);
            if (objH != obj) {
                wVar = this;
            }
            return obj;
        }
        if (i15 == 1) {
            jVar = aVar.f150921e;
            wVar = aVar.f150920d;
            o13.r.b(objH);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objH);
        }
        return Unit.INSTANCE;
        Throwable th3 = (Throwable) objH;
        if (th3 != null) {
            e23.q qVar = wVar.f150916b;
            aVar.f150920d = null;
            aVar.f150921e = null;
            aVar.f150918b = 2;
        }
        return Unit.INSTANCE;
    }
}
