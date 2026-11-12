package j02;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import s1.j1;
import s1.u2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.list.ReorderableLazyCollectionState$onDragStop$1", f = "ReorderableLazyCollection.kt", l = {337, 338}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f96029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s<Object> f96030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f96031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(s<Object> sVar, long j8, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f96030b = sVar;
        this.f96031c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b0(this.f96030b, this.f96031c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (s1.b.c(r6, r7, r8, null, r12, 12) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f96029a;
        s<Object> sVar = this.f96030b;
        if (i14 == 0) {
            o13.r.b(obj);
            s1.b<n4.c, s1.o> bVar = sVar.f96145t;
            n4.c cVarA = n4.c.a(this.f96031c);
            this.f96029a = 1;
            if (bVar.g(cVarA, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        int i15 = s.f96125v;
        sVar.f96144s.setValue(null);
        return Unit.INSTANCE;
        s1.b<n4.c, s1.o> bVar2 = sVar.f96145t;
        n4.c.f123541b.getClass();
        n4.c cVarA2 = n4.c.a(0L);
        j1 j1VarC = s1.l.c(1, 0.0f, 400.0f, n4.c.a(u2.b()));
        this.f96029a = 2;
    }
}
