package c53;

import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lc53/l;", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", l = {383}, m = "invokeSuspend", v = 2)
public final class r extends v13.h implements e23.p<l<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f24575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j<Object> f24579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.p<Integer, Object, Object> f24580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l<Object, Iterator<Object>> f24581g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(j<Object> jVar, e23.p<? super Integer, Object, Object> pVar, e23.l<Object, ? extends Iterator<Object>> lVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f24579e = jVar;
        this.f24580f = pVar;
        this.f24581g = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f24579e, this.f24580f, this.f24581g, dVar);
        rVar.f24578d = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(l<Object> lVar, t13.d<? super Unit> dVar) {
        return ((r) create(lVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        int i14;
        Iterator<Object> it;
        l lVar = (l) this.f24578d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f24577c;
        if (i15 == 0) {
            o13.r.b(obj);
            i14 = 0;
            it = this.f24579e.iterator();
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = this.f24576b;
            it = this.f24575a;
            o13.r.b(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            int i16 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            Iterator<Object> itInvoke = this.f24581g.invoke(this.f24580f.invoke(new Integer(i14), next));
            this.f24578d = lVar;
            this.f24575a = it;
            this.f24576b = i16;
            this.f24577c = 1;
            if (lVar.b(itInvoke, this) == aVar) {
                return aVar;
            }
            i14 = i16;
        }
        return Unit.INSTANCE;
    }
}
