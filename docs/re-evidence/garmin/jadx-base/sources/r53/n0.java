package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class n0<T> implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j<T> f150753a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", l = {79}, m = "emit")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f150754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n0<T> f150755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f150756c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(n0<? super T> n0Var, t13.d<? super a> dVar) {
            super(dVar);
            this.f150755b = n0Var;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150754a = obj;
            this.f150756c |= Integer.MIN_VALUE;
            return this.f150755b.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0(j<? super T> jVar) {
        this.f150753a = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // r53.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object emit(i<? extends T> iVar, t13.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150756c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150756c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f150754a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150756c;
        if (i15 == 0) {
            o13.r.b(obj);
            aVar.f150756c = 1;
            if (s.v(this.f150753a, iVar, aVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
