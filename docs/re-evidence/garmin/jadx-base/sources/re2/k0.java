package re2;

import android.content.SharedPreferences;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import te2.g2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.MobileAuthUtil$isSignInFallback$2", f = "MobileAuthUtil.kt", l = {}, m = "invokeSuspend")
public final class k0 extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {
    public k0(t13.d<? super k0> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k0(dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return new k0(dVar).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean z14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        g2.f164047a.getClass();
        SharedPreferences sharedPreferences = g2.f164049c;
        if (sharedPreferences == null) {
            p005kotlin.jvm.internal.s.m("prefs");
            throw null;
        }
        if (sharedPreferences.contains("is.signin.fallback")) {
            SharedPreferences sharedPreferences2 = g2.f164049c;
            if (sharedPreferences2 == null) {
                p005kotlin.jvm.internal.s.m("prefs");
                throw null;
            }
            if (sharedPreferences2.getString("signedin.account", null) != null) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }
}
