package w52;

import android.content.Context;
import java.io.File;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw52/e;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends androidx.lifecycle.u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l52.a f182501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f182502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f182503c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.common.components.AudioNoteViewModel$1", f = "AudioNoteViewModel.kt", l = {29}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f182504a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f182504a;
            if (i14 == 0) {
                o13.r.b(obj);
                l52.a aVar = e.this.f182501a;
                this.f182504a = 1;
                aVar.getClass();
                x53.c cVar = o53.s0.f129406a;
                Object objE0 = ge1.b.e0(x53.b.f189152a, new l52.b(aVar, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == obj2) {
                    return obj2;
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

    public e() {
        Context applicationContext = ((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null)).getApplicationContext();
        applicationContext.getClass();
        l52.a aVar = new l52.a(applicationContext);
        this.f182501a = aVar;
        this.f182503c = aVar.f110209a;
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new a(null), 3);
    }

    public final Object x4(String str, String str2, t13.d<? super Boolean> dVar) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new f(this, str, str2, null), dVar);
    }
}
