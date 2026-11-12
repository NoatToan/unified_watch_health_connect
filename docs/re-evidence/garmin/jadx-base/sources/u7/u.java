package u7;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend")
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f169317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m<Object> f169318b;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "", "it", "emit", "(Lkotlin/Unit;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m<T> f169319a;

        public a(m<T> mVar) {
            this.f169319a = mVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            Object objE;
            m<T> mVar = this.f169319a;
            return ((mVar.f169195h.a() instanceof r0) || (objE = m.e(mVar, true, dVar)) != u13.a.COROUTINE_SUSPENDED) ? Unit.INSTANCE : objE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(m<Object> mVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f169318b = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f169318b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r6.collect(r1, r5) == r0) goto L18;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169317a;
        m<Object> mVar = this.f169318b;
        if (i14 != 0) {
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
        }
        o13.r.b(obj);
        m<Object>.b bVar = mVar.f169196i;
        this.f169317a = 1;
        Object objC = bVar.f169174b.C(this);
        if (objC != aVar) {
            objC = Unit.INSTANCE;
        }
        if (objC != aVar) {
        }
        return aVar;
        int i15 = m.f169187m;
        r53.i iVarO = r53.s.o(mVar.g().c());
        a aVar2 = new a(mVar);
        this.f169317a = 2;
    }
}
