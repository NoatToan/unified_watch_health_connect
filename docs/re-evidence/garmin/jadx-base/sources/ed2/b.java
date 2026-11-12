package ed2;

import e23.l;
import e23.p;
import java.util.concurrent.CountDownLatch;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "com.garmin.android.lib.networking.okhttp.OkHttpFactory$Companion$synchronousCredentials$1", f = "OkHttpFactory.kt", l = {92}, m = "invokeSuspend")
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f63877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0<String> f63878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l<d<? super String>, Object> f63879d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "com.garmin.android.lib.networking.okhttp.OkHttpFactory$Companion$synchronousCredentials$1$1", f = "OkHttpFactory.kt", l = {94}, m = "invokeSuspend")
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r0 f63880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f63881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r0<String> f63882c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l<d<? super String>, Object> f63883d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(r0<String> r0Var, l<? super d<? super String>, ? extends Object> lVar, d<? super a> dVar) {
            super(2, dVar);
            this.f63882c = r0Var;
            this.f63883d = lVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f63882c, this.f63883d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            r0<String> r0Var;
            T t7;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f63881b;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    r0<String> r0Var2 = this.f63882c;
                    l<d<? super String>, Object> lVar = this.f63883d;
                    this.f63880a = r0Var2;
                    this.f63881b = 1;
                    Object objInvoke = lVar.invoke(this);
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                    r0Var = r0Var2;
                    t7 = objInvoke;
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r0Var = this.f63880a;
                    r.b(obj);
                    t7 = obj;
                }
                r0Var.f105810a = t7;
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(CountDownLatch countDownLatch, r0<String> r0Var, l<? super d<? super String>, ? extends Object> lVar, d<? super b> dVar) {
        super(2, dVar);
        this.f63877b = countDownLatch;
        this.f63878c = r0Var;
        this.f63879d = lVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f63877b, this.f63878c, this.f63879d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f63876a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(this.f63878c, this.f63879d, null);
            this.f63876a = 1;
            if (ge1.b.Y(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        this.f63877b.countDown();
        return Unit.INSTANCE;
    }
}
