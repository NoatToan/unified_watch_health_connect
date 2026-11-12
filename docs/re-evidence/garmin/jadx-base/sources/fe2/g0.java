package fe2;

import java.util.concurrent.TimeUnit;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.domain.DefaultPeriodicUploadTask$beginTask$2", f = "DefaultPeriodicUploadTask.kt", l = {100, 105}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f70750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f70751c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.domain.DefaultPeriodicUploadTask$beginTask$2$1", f = "DefaultPeriodicUploadTask.kt", l = {108}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f70753b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0 e0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f70753b = e0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f70753b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f70752a;
            if (i14 == 0) {
                o13.r.b(obj);
                e0 e0Var = this.f70753b;
                e23.a<Unit> aVar2 = e0Var.f70716e;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                this.f70752a = 1;
                if (e0.a(e0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(e0 e0Var, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f70751c = e0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g0 g0Var = new g0(this.f70751c, dVar);
        g0Var.f70750b = obj;
        return g0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r10.d(r7, r9) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (o53.m0.b(r7, r9) == r1) goto L22;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0074 -> B:23:0x0077). Please report as a decompilation issue!!! */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f70750b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f70749a;
        e0 e0Var = this.f70751c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (!o53.c0.g(b0Var)) {
                return Unit.INSTANCE;
            }
            if (e0Var.f70715d.getF104148e().d()) {
                com.airbnb.lottie.animation.keyframe.a.r("Delaying for ", e0Var.f70722k, " seconds", e0Var.f70719h);
                long jConvert = TimeUnit.MILLISECONDS.convert(e0Var.f70722k, TimeUnit.SECONDS);
                this.f70750b = b0Var;
                this.f70749a = 2;
            } else {
                xd2.a1 a1Var = e0Var.f70714c;
                long j8 = e0Var.f70712a;
                this.f70750b = null;
                this.f70749a = 1;
            }
            return aVar;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            ge1.b.T(b0Var, null, null, new a(e0Var, null), 3);
            if (!o53.c0.g(b0Var)) {
                return Unit.INSTANCE;
            }
            if (e0Var.f70715d.getF104148e().d()) {
                xd2.a1 a1Var2 = e0Var.f70714c;
                long j14 = e0Var.f70712a;
                this.f70750b = null;
                this.f70749a = 1;
            } else {
                com.airbnb.lottie.animation.keyframe.a.r("Delaying for ", e0Var.f70722k, " seconds", e0Var.f70719h);
                long jConvert2 = TimeUnit.MILLISECONDS.convert(e0Var.f70722k, TimeUnit.SECONDS);
                this.f70750b = b0Var;
                this.f70749a = 2;
            }
            return aVar;
        }
        o13.r.b(obj);
        wd2.m.g(e0Var.f70715d.getF104144a().f(), null);
        return Unit.INSTANCE;
    }
}
