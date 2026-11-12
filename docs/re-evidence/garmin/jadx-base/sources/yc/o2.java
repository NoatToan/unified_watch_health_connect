package yc;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.PagedList$dispatchStateChangeAsync$1", f = "PagedList.kt", l = {}, m = "invokeSuspend")
public final class o2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m2<Object> f196287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f196288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f196289c;

    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00030\u0002H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function2;", "Lyc/c1;", "Lyc/z0;", "", "it", "", "invoke", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<WeakReference<e23.p<? super c1, ? super z0, ? extends Unit>>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f196290a = new a();

        public a() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(WeakReference<e23.p<? super c1, ? super z0, ? extends Unit>> weakReference) {
            WeakReference<e23.p<? super c1, ? super z0, ? extends Unit>> weakReference2 = weakReference;
            weakReference2.getClass();
            return Boolean.valueOf(weakReference2.get() == null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(m2<Object> m2Var, c1 c1Var, z0 z0Var, t13.d<? super o2> dVar) {
        super(2, dVar);
        this.f196287a = m2Var;
        this.f196288b = c1Var;
        this.f196289c = z0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o2(this.f196287a, this.f196288b, this.f196289c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        m2<Object> m2Var = this.f196287a;
        p13.d0.B(a.f196290a, m2Var.f196227h);
        Iterator it = m2Var.f196227h.iterator();
        while (it.hasNext()) {
            e23.p pVar = (e23.p) ((WeakReference) it.next()).get();
            if (pVar != null) {
                pVar.invoke(this.f196288b, this.f196289c);
            }
        }
        return Unit.INSTANCE;
    }
}
