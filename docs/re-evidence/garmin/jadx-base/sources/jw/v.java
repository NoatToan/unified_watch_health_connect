package jw;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.m1;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0007\bB\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Ljw/v;", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "Lo53/b0;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;)V", "a", "b", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v extends com.garmin.android.library.backgroundtaskmanagement.d implements o53.b0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m1 f101312i;

    public interface b {
        void a(e12.e eVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.biz.tasks.IntelligentRoleTask$executeTask$1", f = "IntelligentRoleTask.kt", l = {36}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f101313a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return v.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f101313a;
            if (i14 == 0) {
                o13.r.b(obj);
                d12.e eVar = (d12.e) KoinJavaComponent.get$default(d12.e.class, null, null, 6, null);
                this.f101313a = 1;
                obj = eVar.a(this);
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
            v2 v2Var = (v2) obj;
            boolean z14 = v2Var instanceof v2.b;
            v vVar = v.this;
            if (z14) {
                v.d(vVar, (e12.e) ((v2.b) v2Var).f47386a);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                v.d(vVar, null);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar) {
        super(bVar, false);
        bVar.getClass();
        this.f101312i = g8.i.c();
    }

    public static final void d(v vVar, e12.e eVar) {
        vVar.getClass();
        try {
            Object obj = vVar.f50126f;
            if (obj instanceof b) {
                obj.getClass();
                ((b) obj).a(eVar);
            }
        } catch (Exception e4) {
            a2 a2Var = a2.USER;
            i2.f36769a.getClass();
            i2.a.g(a2Var, "IntelligentRoleTask", e4);
        }
        vVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        ge1.b.T(this, null, null, new c(null), 3);
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
        this.f101312i.c(null);
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF7937b() {
        x53.c cVar = s0.f129406a;
        return x53.b.f189152a.plus(this.f101312i);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljw/v$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
