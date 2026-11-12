package ew;

import com.garmin.android.library.backgroundtaskmanagement.d;
import e23.p;
import o13.r;
import o53.b0;
import o53.m1;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.g;
import v13.e;
import v13.i;
import vb.h;
import x53.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lew/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "Lo53/b0;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "", "operation", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;)V", "gcm-legacy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends d implements b0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m1 f66184i;

    /* JADX INFO: renamed from: ew.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.biz.coroutines.CoroutinesBizTask$executeTask$1", f = "CoroutinesBizTask.kt", l = {19}, m = "invokeSuspend", v = 2)
    public static final class C1393a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f66185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f66186b;

        public C1393a(t13.d<? super C1393a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new C1393a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1393a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f66186b;
            if (i14 == 0) {
                r.b(obj);
                a aVar3 = a.this;
                this.f66185a = aVar3;
                this.f66186b = 1;
                Object objD = aVar3.d(this);
                if (objD == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
                obj = objD;
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = this.f66185a;
                r.b(obj);
            }
            aVar.c((com.garmin.android.library.backgroundtaskmanagement.b.c) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.garmin.android.library.backgroundtaskmanagement.b<? extends Object> bVar) {
        super(bVar);
        bVar.getClass();
        this.f66184i = g8.i.c();
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        ge1.b.T(this, null, null, new C1393a(null), 3);
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public void b() {
        this.f66184i.c(null);
    }

    public abstract Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar);

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final g getF195311f() {
        c cVar = s0.f129406a;
        return x53.b.f189152a.plus(this.f66184i);
    }
}
