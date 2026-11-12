package g22;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.i0;
import androidx.lifecycle.n0;
import o13.q;
import o13.r;
import o53.a0;
import o53.b0;
import o53.c0;
import o53.f0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.util.extensions.JavaCoroutines$launchAsyncCoroutine$1", f = "JavaCoroutines.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f75561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Object> f75562b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Object> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f75562b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f75562b, dVar);
            aVar.f75561a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            e23.a<Object> aVar2 = this.f75562b;
            try {
                int i14 = q.f128596b;
                aVar2.invoke();
            } catch (Throwable th3) {
                int i15 = q.f128596b;
                new q.b(th3);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(String str, e23.a aVar) {
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a.plus(new a0(str))), null, null, new a(aVar, null), 3);
    }

    public static final i0 b(Fragment fragment) {
        fragment.getClass();
        n0 viewLifecycleOwner = fragment.getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        return f0.w(viewLifecycleOwner);
    }
}
