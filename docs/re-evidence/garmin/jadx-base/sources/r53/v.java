package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lr53/v;", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v implements i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p f150895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f150896b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {112, 116}, m = "collect")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f150897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f150898b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public v f150900d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public j f150901e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public s53.x f150902f;

        public a(t13.d dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150897a = obj;
            this.f150898b |= Integer.MIN_VALUE;
            return v.this.collect(null, this);
        }
    }

    public v(e23.p pVar, i iVar) {
        this.f150895a = pVar;
        this.f150896b = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r7.collect(r2, r0) == r1) goto L27;
     */
    @Override // r53.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(j<? super Object> jVar, t13.d<? super Unit> dVar) throws Throwable {
        a aVar;
        Throwable th3;
        s53.x xVar;
        v vVar;
        j<? super Object> jVar2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150898b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150898b = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f150897a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150898b;
        if (i15 != 0) {
            if (i15 == 1) {
                xVar = aVar.f150902f;
                jVar2 = aVar.f150901e;
                vVar = aVar.f150900d;
                try {
                    o13.r.b(obj);
                    xVar.releaseIntercepted();
                    i iVar = vVar.f150896b;
                    aVar.f150900d = null;
                    aVar.f150901e = null;
                    aVar.f150902f = null;
                    aVar.f150898b = 2;
                } catch (Throwable th4) {
                    th3 = th4;
                    xVar.releaseIntercepted();
                    throw th3;
                }
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        s53.x xVar2 = new s53.x(jVar, aVar.getF157466b());
        try {
            e23.p pVar = this.f150895a;
            aVar.f150900d = this;
            aVar.f150901e = jVar;
            aVar.f150902f = xVar2;
            aVar.f150898b = 1;
            if (pVar.invoke(xVar2, aVar) != aVar2) {
                vVar = this;
                jVar2 = jVar;
                xVar = xVar2;
                xVar.releaseIntercepted();
                i iVar2 = vVar.f150896b;
                aVar.f150900d = null;
                aVar.f150901e = null;
                aVar.f150902f = null;
                aVar.f150898b = 2;
            }
            return aVar2;
        } catch (Throwable th5) {
            th3 = th5;
            xVar = xVar2;
            xVar.releaseIntercepted();
            throw th3;
        }
    }
}
