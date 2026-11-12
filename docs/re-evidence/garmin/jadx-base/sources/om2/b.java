package om2;

import e23.p;
import java.util.concurrent.atomic.AtomicReference;
import o13.r;
import o53.b0;
import o53.s;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lom2/b;", "", "<init>", "()V", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f132975a = gl.b.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<om2.a> f132976b = new AtomicReference<>();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.pairing.operations.DeviceOperation$waitForAccess$1", f = "DeviceOperation.kt", l = {83}, m = "invokeSuspend")
    public static final class a extends i implements p<b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f132977a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f132977a;
            b bVar = b.this;
            if (i14 == 0) {
                r.b(obj);
                s sVar = bVar.f132975a;
                this.f132977a = 1;
                obj = sVar.C(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            bVar.getClass();
            return bool;
        }
    }

    public String a() {
        return getClass().getSimpleName();
    }

    public void b() {
    }

    public abstract void c();

    public final void d() {
        om2.a andSet = this.f132976b.getAndSet(null);
        if (andSet != null) {
            andSet.onSuccess();
        }
    }

    public final void e(Exception exc) {
        om2.a andSet = this.f132976b.getAndSet(null);
        if (andSet != null) {
            andSet.onFailure(exc);
        }
    }

    public final boolean f() {
        try {
            x53.c cVar = s0.f129406a;
            return ((Boolean) ge1.b.W(x53.b.f189152a, new a(null))).booleanValue();
        } catch (Exception e4) {
            e(e4);
            return false;
        }
    }
}
