package re2;

import android.content.SharedPreferences;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import te2.g2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$setPreferredUserEnvironment$2", f = "AuthenticationHelper.kt", l = {786, 801}, m = "invokeSuspend")
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ve2.e f152264b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ve2.e eVar, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f152264b = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b0(this.f152264b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (r7.G(r6) == r0) goto L27;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152263a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        b bVar = b.f152215a;
        b.c cVar = b.c.DEFAULT;
        bVar.getClass();
        b.K("setPreferredUserEnvironment", cVar, null);
        this.f152263a = 1;
        obj = b.q(this);
        if (obj != aVar) {
        }
        return aVar;
        ve2.e eVar = (ve2.e) obj;
        ve2.e eVar2 = this.f152264b;
        if (eVar == eVar2) {
            return Unit.INSTANCE;
        }
        com.airbnb.lottie.animation.keyframe.a.w("setPreferredUserEnvironment: ", eVar2.name(), b.f152216b);
        g2.f164047a.getClass();
        SharedPreferences sharedPreferences = g2.f164049c;
        if (sharedPreferences == null) {
            p005kotlin.jvm.internal.s.m("prefs");
            throw null;
        }
        sharedPreferences.edit().putString("environment", eVar2.name()).commit();
        b.f152215a.getClass();
        Iterator<b.InterfaceC2863b> it = b.f152218d.iterator();
        while (it.hasNext()) {
            try {
                it.next().c(eVar2);
            } catch (Exception unused) {
            }
        }
        b bVar2 = b.f152215a;
        this.f152263a = 2;
    }
}
