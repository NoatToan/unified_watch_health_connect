package u7;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
public final class d0 extends v13.i implements e23.l<t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f169103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f169104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m<Object> f169105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t13.g f169106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.p<Object, t13.d<Object>, Object> f169107e;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {331}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f169108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.p<Object, t13.d<Object>, Object> f169109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e<Object> f169110c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.p<Object, ? super t13.d<Object>, ? extends Object> pVar, e<Object> eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f169109b = pVar;
            this.f169110c = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f169109b, this.f169110c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<Object> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f169108a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            Object obj2 = this.f169110c.f169112b;
            this.f169108a = 1;
            Object objInvoke = this.f169109b.invoke(obj2, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(m<Object> mVar, t13.g gVar, e23.p<Object, ? super t13.d<Object>, ? extends Object> pVar, t13.d<? super d0> dVar) {
        super(1, dVar);
        this.f169105c = mVar;
        this.f169106d = gVar;
        this.f169107e = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d0(this.f169105c, this.f169106d, this.f169107e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<Object> dVar) {
        return ((d0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        e eVar;
        T t7;
        int iHashCode;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169104b;
        m<Object> mVar = this.f169105c;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f169104b = 1;
            obj = m.f(mVar, true, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj2 = this.f169103a;
                o13.r.b(obj);
                return obj2;
            }
            eVar = (e) this.f169103a;
            o13.r.b(obj);
        }
        t7 = eVar.f169112b;
        if (t7 != 0) {
            iHashCode = t7.hashCode();
        } else {
            iHashCode = 0;
        }
        if (iHashCode == eVar.f169113c) {
            vb.h.z("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            return null;
        }
        if (!p005kotlin.jvm.internal.s.g(eVar.f169112b, obj)) {
            this.f169103a = obj;
            this.f169104b = 3;
            if (mVar.j(obj, true, this) == aVar) {
                return aVar;
            }
        }
        return obj;
        eVar = (e) obj;
        a aVar2 = new a(this.f169107e, eVar, null);
        this.f169103a = eVar;
        this.f169104b = 2;
        obj = ge1.b.e0(this.f169106d, aVar2, this);
        if (obj != aVar) {
            t7 = eVar.f169112b;
            if (t7 != 0) {
                iHashCode = t7.hashCode();
            } else {
                iHashCode = 0;
            }
            if (iHashCode == eVar.f169113c) {
                vb.h.z("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                return null;
            }
            if (!p005kotlin.jvm.internal.s.g(eVar.f169112b, obj)) {
                this.f169103a = obj;
                this.f169104b = 3;
                if (mVar.j(obj, true, this) == aVar) {
                }
            }
            return obj;
        }
        return aVar;
    }
}
