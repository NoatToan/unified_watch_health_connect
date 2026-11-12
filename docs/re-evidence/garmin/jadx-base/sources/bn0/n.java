package bn0;

import androidx.lifecycle.y0;
import e23.p;
import o13.r;
import o53.b0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.groupride.GroupRideViewModel$sendCodeToDevice$1", f = "GroupRideViewModel.kt", l = {53}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0<fw.m<Unit>> f19021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f19022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f19023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f19024e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.groupride.GroupRideViewModel$sendCodeToDevice$1$1", f = "GroupRideViewModel.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f19026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f19027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f19028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ y0<fw.m<Unit>> f19029e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, long j8, String str, y0<fw.m<Unit>> y0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f19026b = lVar;
            this.f19027c = j8;
            this.f19028d = str;
            this.f19029e = y0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f19026b, this.f19027c, this.f19028d, this.f19029e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f19025a;
            y0<fw.m<Unit>> y0Var = this.f19029e;
            l lVar = this.f19026b;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    d dVar = lVar.f19011c;
                    long j8 = this.f19027c;
                    String str = this.f19028d;
                    this.f19025a = 1;
                    if (dVar.c(j8, str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                y0Var.j(fw.m.a.g(fw.m.f73767e, null, 3));
            } catch (Exception e4) {
                lVar.f19010b.error(l.f19008d + " - Got exception while sending group ride code to device", (Throwable) e4);
                y0Var.j(fw.m.a.b(fw.m.f73767e, new fw.l(), null, 5));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(y0<fw.m<Unit>> y0Var, l lVar, long j8, String str, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f19021b = y0Var;
        this.f19022c = lVar;
        this.f19023d = j8;
        this.f19024e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f19021b, this.f19022c, this.f19023d, this.f19024e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f19020a;
        if (i14 == 0) {
            r.b(obj);
            this.f19021b.j(fw.m.a.f(fw.m.f73767e, null, null, 3));
            l lVar = this.f19022c;
            z zVar = lVar.f19009a.f22991c;
            a aVar2 = new a(lVar, this.f19023d, this.f19024e, this.f19021b, null);
            this.f19020a = 1;
            if (ge1.b.e0(zVar, aVar2, this) == aVar) {
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
