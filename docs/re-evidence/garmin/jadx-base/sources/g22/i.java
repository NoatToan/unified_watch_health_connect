package g22;

import androidx.lifecycle.h1;
import androidx.lifecycle.n0;
import cd0.h0;
import com.garmin.android.apps.connectmobile.GCMActivityStartup;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.util.extensions.JavaCoroutines$observeSharedFlowEvents$1", f = "JavaCoroutines.kt", l = {124}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f75569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f75570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.b0.b f75571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r53.i<Object> f75572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j<Object> f75573e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.util.extensions.JavaCoroutines$observeSharedFlowEvents$1$1", f = "JavaCoroutines.kt", l = {125}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f75574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r53.i<Object> f75575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j<Object> f75576c;

        /* JADX INFO: renamed from: g22.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1520a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j<T> f75577a;

            public C1520a(j<T> jVar) {
                this.f75577a = jVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // r53.j
            public final Object emit(T t7, t13.d<? super Unit> dVar) {
                GCMActivityStartup gCMActivityStartup = (GCMActivityStartup) ((bd0.e) this.f75577a).f17557b;
                gCMActivityStartup.f28660b.execute(new h0(gCMActivityStartup, 5));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r53.i<Object> iVar, j<Object> jVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f75575b = iVar;
            this.f75576c = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f75575b, this.f75576c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f75574a;
            if (i14 == 0) {
                r.b(obj);
                C1520a c1520a = new C1520a(this.f75576c);
                this.f75574a = 1;
                if (this.f75575b.collect(c1520a, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n0 n0Var, androidx.lifecycle.b0.b bVar, r53.i<Object> iVar, j<Object> jVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f75570b = n0Var;
        this.f75571c = bVar;
        this.f75572d = iVar;
        this.f75573e = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f75570b, this.f75571c, this.f75572d, this.f75573e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f75569a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(this.f75572d, this.f75573e, null);
            this.f75569a = 1;
            if (h1.b(this.f75570b, this.f75571c, aVar2, this) == aVar) {
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
