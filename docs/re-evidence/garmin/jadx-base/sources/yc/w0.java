package yc;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lo53/b0;", "Lyc/h3$b$c;", "<anonymous>", "(Lo53/b0;)Lyc/h3$b$c;"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.LegacyPagingSource$load$2", f = "LegacyPagingSource.jvm.kt", l = {110}, m = "invokeSuspend")
public final class w0 extends v13.i implements e23.p<o53.b0, t13.d<? super h3.b.c<Object, Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f196560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0<Object, Object> f196561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x.f<Object> f196562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h3.a<Object> f196563d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(u0<Object, Object> u0Var, x.f<Object> fVar, h3.a<Object> aVar, t13.d<? super w0> dVar) {
        super(2, dVar);
        this.f196561b = u0Var;
        this.f196562c = fVar;
        this.f196563d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w0(this.f196561b, this.f196562c, this.f196563d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super h3.b.c<Object, Object>> dVar) {
        return ((w0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f196560a;
        if (i14 == 0) {
            o13.r.b(obj);
            x<Object, Object> xVar = this.f196561b.f196502c;
            this.f196560a = 1;
            obj = xVar.c(this.f196562c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        x.a aVar2 = (x.a) obj;
        List<Value> list = aVar2.f196576a;
        boolean zIsEmpty = list.isEmpty();
        h3.a<Object> aVar3 = this.f196563d;
        return new h3.b.c(list, (zIsEmpty && (aVar3 instanceof h3.a.c)) ? null : aVar2.f196577b, (aVar2.f196576a.isEmpty() && (aVar3 instanceof h3.a.C3655a)) ? null : aVar2.f196578c, aVar2.f196579d, aVar2.f196580e);
    }
}
