package q20;

import e23.p;
import g8.i;
import ge1.b;
import o13.r;
import o53.b0;
import o53.m1;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import t13.g;
import v13.c;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq20/a;", "Lo53/b0;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f142199a = i.c();

    /* JADX INFO: renamed from: q20.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.coroutines.CoroutineCompatTask$executeTask$1", f = "CoroutineCompatTask.kt", l = {20}, m = "invokeSuspend", v = 2)
    public static final class C2671a extends v13.i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f142200a;

        public C2671a(d<? super C2671a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return a.this.new C2671a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C2671a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f142200a;
            if (i14 == 0) {
                r.b(obj);
                this.f142200a = 1;
                if (a.this.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public abstract Object a(c cVar);

    public final void b() {
        b.T(this, null, null, new C2671a(null), 3);
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final g getF195311f() {
        x53.c cVar = s0.f129406a;
        return x53.b.f189152a.plus(this.f142199a);
    }
}
