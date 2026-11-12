package r53;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lr53/i1;", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i1 implements i<List<Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f150650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f150651b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1", f = "Transform.kt", l = {110, 120}, m = "collect")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f150652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f150653b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public j f150655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public p005kotlin.jvm.internal.r0 f150656e;

        public a(t13.d dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150652a = obj;
            this.f150653b |= Integer.MIN_VALUE;
            return i1.this.collect(null, this);
        }
    }

    public i1(i iVar, int i14) {
        this.f150650a = iVar;
        this.f150651b = i14;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r2.emit(r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r53.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(j<? super List<Object>> jVar, t13.d<? super Unit> dVar) {
        a aVar;
        j jVar2;
        p005kotlin.jvm.internal.r0 r0Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150653b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150653b = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f150652a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150653b;
        if (i15 != 0) {
            if (i15 == 1) {
                r0Var = aVar.f150656e;
                jVar2 = aVar.f150655d;
                o13.r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        p005kotlin.jvm.internal.r0 r0VarS = wr.g.s(obj);
        j1 j1Var = new j1(r0VarS, this.f150651b, jVar);
        aVar.f150655d = jVar;
        aVar.f150656e = r0VarS;
        aVar.f150653b = 1;
        if (this.f150650a.collect(j1Var, aVar) != aVar2) {
            jVar2 = jVar;
            r0Var = r0VarS;
        }
        return aVar2;
        ArrayList arrayList = (ArrayList) r0Var.f105810a;
        if (arrayList != null) {
            aVar.f150655d = null;
            aVar.f150656e = null;
            aVar.f150653b = 2;
        }
        return Unit.INSTANCE;
    }
}
