package cf2;

import o53.b0;
import o53.m1;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcf2/l;", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "Lo53/b0;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "", "operation", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;)V", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class l extends com.garmin.android.library.backgroundtaskmanagement.d implements b0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m1 f27058i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.promotionlibrary.data.CoroutinesBizTask$executeTask$1", f = "CoroutinesBizTask.kt", l = {19}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l f27059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27060b;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            l lVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f27060b;
            if (i14 == 0) {
                o13.r.b(obj);
                l lVar2 = l.this;
                this.f27059a = lVar2;
                this.f27060b = 1;
                Object objD = lVar2.d(this);
                if (objD == aVar) {
                    return aVar;
                }
                lVar = lVar2;
                obj = objD;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lVar = this.f27059a;
                o13.r.b(obj);
            }
            lVar.c((com.garmin.android.library.backgroundtaskmanagement.b.c) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.garmin.android.library.backgroundtaskmanagement.b<? extends Object> bVar) {
        super(bVar);
        bVar.getClass();
        this.f27058i = g8.i.c();
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        ge1.b.T(this, null, null, new a(null), 3);
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
        this.f27058i.c(null);
    }

    public abstract Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar);

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        x53.c cVar = s0.f129406a;
        return x53.b.f189152a.plus(this.f27058i);
    }
}
