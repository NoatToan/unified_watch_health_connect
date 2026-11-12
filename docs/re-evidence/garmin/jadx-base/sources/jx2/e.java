package jx2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.manager.SaMDAccountManager$doesSaMDUserAccountExist$2", f = "SaMDAccountManager.kt", l = {81}, m = "invokeSuspend")
public final class e extends v13.i implements e23.p<b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f101526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mx2.a.C2301a f101527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f101528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f101529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f101529d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f101529d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [jx2.a] */
    /* JADX WARN: Type inference failed for: r2v3, types: [jx2.a, jx2.b] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        mx2.a.C2301a c2301a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        ?? r14 = this.f101528c;
        try {
            if (r14 == 0) {
                o13.r.b(obj);
                b bVar = this.f101529d;
                gx2.a aVarH = bVar.h("doesSaMDUserAccountExist");
                bVar.d().debug("doesSaMDUserAccountExist");
                mx2.a.C2301a c2301a2 = mx2.a.f121449c;
                this.f101526a = bVar;
                this.f101527b = c2301a2;
                this.f101528c = 1;
                Object objJ = oc.b.j(aVarH, this);
                if (objJ == aVar) {
                    return aVar;
                }
                c2301a = c2301a2;
                obj = objJ;
                r14 = bVar;
            } else {
                if (r14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c2301a = this.f101527b;
                b bVar2 = this.f101526a;
                o13.r.b(obj);
                r14 = bVar2;
            }
            c2301a.getClass();
            mx2.a aVarA = mx2.a.C2301a.a((mx2.b) obj);
            String str = aVarA.f121451b;
            boolean z14 = aVarA.f121450a;
            r14.d().debug("doesSaMDUserAccountExist: " + aVarA);
            b.i(r14, z14 ? str : null);
            qx2.a aVar2 = qx2.a.f148445a;
            if (!z14) {
                str = null;
            }
            aVar2.i(str);
            return Boolean.valueOf(z14);
        } catch (Throwable th3) {
            throw r14.g(th3);
        }
    }
}
