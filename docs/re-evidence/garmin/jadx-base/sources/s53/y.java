package s53;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e23.q<r53.j<Object>, Object, t13.d<? super Unit>, Object> f157606a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.q<r53.j<? super Object>, Object, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f157607a = new a();

        public a() {
            super(3, r53.j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super Object> jVar, Object obj, t13.d<? super Unit> dVar) {
            return jVar.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f157607a;
        aVar.getClass();
        y0.e(3, aVar);
        f157606a = aVar;
    }
}
