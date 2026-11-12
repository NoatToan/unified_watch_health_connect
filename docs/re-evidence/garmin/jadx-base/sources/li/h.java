package li;

import e23.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import r53.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lw63/g;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
@v13.e(c = "com.apollographql.apollo3.internal.MultipartKt$multipartBodyFlow$2", f = "multipart.kt", l = {}, m = "invokeSuspend")
public final class h extends v13.i implements q<j<? super w63.g>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ j f112588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0<i> f112589b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r0<i> r0Var, t13.d<? super h> dVar) {
        super(3, dVar);
        this.f112589b = r0Var;
    }

    @Override // e23.q
    public final Object invoke(j<? super w63.g> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        h hVar = new h(this.f112589b, dVar);
        hVar.f112588a = jVar;
        return hVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        r0<i> r0Var = this.f112589b;
        try {
            int i14 = o13.q.f128596b;
            i iVar = r0Var.f105810a;
            if (iVar != null) {
                iVar.close();
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            new o13.q.b(th3);
        }
        return Unit.INSTANCE;
    }
}
