package c53;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lc53/l;", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", l = {AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.h implements e23.p<l<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f24510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f24511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j<Object> f24514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.p<Object, Object, Object> f24515f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(j<Object> jVar, e23.p<Object, Object, Object> pVar, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f24514e = jVar;
        this.f24515f = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b0 b0Var = new b0(this.f24514e, this.f24515f, dVar);
        b0Var.f24513d = obj;
        return b0Var;
    }

    @Override // e23.p
    public final Object invoke(l<Object> lVar, t13.d<? super Unit> dVar) {
        return ((b0) create(lVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        Iterator<Object> it;
        l lVar = (l) this.f24513d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f24512c;
        if (i14 == 0) {
            o13.r.b(obj);
            Iterator<Object> it3 = this.f24514e.iterator();
            if (!it3.hasNext()) {
                return Unit.INSTANCE;
            }
            next = it3.next();
            it = it3;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            next = this.f24511b;
            it = this.f24510a;
            o13.r.b(obj);
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            Object objInvoke = this.f24515f.invoke(next, next2);
            this.f24513d = lVar;
            this.f24510a = it;
            this.f24511b = next2;
            this.f24512c = 1;
            if (lVar.a(objInvoke, this) == aVar) {
                return aVar;
            }
            next = next2;
        }
        return Unit.INSTANCE;
    }
}
