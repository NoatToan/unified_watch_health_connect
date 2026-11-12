package zc;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import yc.c3;
import yc.i4;
import yc.v2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lyc/v2;", "it", "", "<anonymous>", "(Lyc/v2;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", f = "LazyPagingItems.kt", l = {179}, m = "invokeSuspend")
public final class c extends i implements p<v2<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f203901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f203902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d<Object> f203903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d<Object> dVar, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f203903c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f203903c, dVar);
        cVar.f203902b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(v2<Object> v2Var, t13.d<? super Unit> dVar) {
        return ((c) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f203901a;
        if (i14 == 0) {
            r.b(obj);
            v2 v2Var = (v2) this.f203902b;
            d.a aVar2 = this.f203903c.f203906c;
            this.f203901a = 1;
            i4 i4Var = aVar2.f195742g;
            c3 c3Var = new c3(aVar2, v2Var, null);
            int i15 = i4.f196065b;
            Object objA = i4Var.a(0, c3Var, this);
            if (objA != aVar) {
                objA = Unit.INSTANCE;
            }
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
