package bl2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "Lo53/b0;", "", "Lo53/i0;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.tasks.ReadActiveTransfer$Companion$awaitAllAsync$3", f = "ReadActiveTransfer.kt", l = {91}, m = "invokeSuspend")
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends i0<Object>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Collection<Object> f18703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<List<? extends i0<Object>>, Unit> f18704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.p<Object, t13.d<Object>, Object> f18705e;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.tasks.ReadActiveTransfer$Companion$awaitAllAsync$3$tasks$1$1", f = "ReadActiveTransfer.kt", l = {84}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.p<Object, t13.d<Object>, Object> f18707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f18708c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.p<Object, ? super t13.d<Object>, ? extends Object> pVar, Object obj, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f18707b = pVar;
            this.f18708c = obj;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f18707b, this.f18708c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<Object> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f18706a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f18706a = 1;
                Object objInvoke = this.f18707b.invoke(this.f18708c, this);
                return objInvoke == aVar ? aVar : objInvoke;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(Collection<Object> collection, e23.l<? super List<? extends i0<Object>>, Unit> lVar, e23.p<Object, ? super t13.d<Object>, ? extends Object> pVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f18703c = collection;
        this.f18704d = lVar;
        this.f18705e = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f18703c, this.f18704d, this.f18705e, dVar);
        qVar.f18702b = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends i0<Object>>> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18701a;
        if (i14 != 0) {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list = (List) this.f18702b;
            try {
                o13.r.b(obj);
                return list;
            } catch (Throwable unused) {
                return list;
            }
        }
        o13.r.b(obj);
        o53.b0 b0Var = (o53.b0) this.f18702b;
        Collection<Object> collection = this.f18703c;
        ArrayList arrayList = new ArrayList(p13.y.r(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(ge1.b.j(b0Var, null, null, new a(this.f18705e, it.next(), null), 3));
        }
        this.f18704d.invoke(arrayList);
        try {
            this.f18702b = arrayList;
            this.f18701a = 1;
            return g8.i.o(arrayList, this) == aVar ? aVar : arrayList;
        } catch (Throwable unused2) {
            return arrayList;
        }
    }
}
