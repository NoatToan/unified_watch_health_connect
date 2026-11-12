package o63;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo13/c;", "", "Ln63/i;", "it", "<anonymous>", "(Lkotlin/DeepRecursiveScope;V)Lkotlinx/serialization/json/JsonElement;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {115}, m = "invokeSuspend")
public final class w extends v13.h implements e23.q<o13.c<Unit, n63.i>, Unit, t13.d<? super n63.i>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f129895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ o13.c f129896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f129897c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, t13.d<? super w> dVar) {
        super(3, dVar);
        this.f129897c = yVar;
    }

    @Override // e23.q
    public final Object invoke(o13.c<Unit, n63.i> cVar, Unit unit, t13.d<? super n63.i> dVar) {
        w wVar = new w(this.f129897c, dVar);
        wVar.f129896b = cVar;
        return wVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f129895a;
        if (i14 == 0) {
            o13.r.b(obj);
            o13.c cVar = this.f129896b;
            y yVar = this.f129897c;
            byte bQ = yVar.f129905a.q();
            if (bQ == 1) {
                return yVar.d(true);
            }
            if (bQ == 0) {
                return yVar.d(false);
            }
            if (bQ != 6) {
                if (bQ == 8) {
                    return yVar.c();
                }
                a.m(yVar.f129905a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f129895a = 1;
            obj = y.a(yVar, cVar, this);
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
        return (n63.i) obj;
    }
}
