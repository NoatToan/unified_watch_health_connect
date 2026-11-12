package ww;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import e23.p;
import kw.m;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww/g;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.b f187511a = (lw.b) KoinJavaComponent.get$default(lw.b.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<m> f187512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f187513c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.help.BloodPressureHelpViewModel$1", f = "BloodPressureHelpViewModel.kt", l = {21}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f187514a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f187514a;
            g gVar = g.this;
            if (i14 == 0) {
                r.b(obj);
                lw.b bVar = gVar.f187511a;
                this.f187514a = 1;
                obj = bVar.b(this);
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
            gVar.f187512b.m((m) obj);
            return Unit.INSTANCE;
        }
    }

    public g() {
        y0<m> y0Var = new y0<>();
        this.f187512b = y0Var;
        this.f187513c = y0Var;
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
    }
}
