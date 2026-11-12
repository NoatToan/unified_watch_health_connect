package re2;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import te2.e2;
import te2.g2;
import te2.j2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$handleGlobalSignOut$2", f = "AuthenticationHelper.kt", l = {2342, 2350}, m = "invokeSuspend")
public final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152307a;

    public j(t13.d<? super j> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return new j(dVar).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (r9.c(r1, r4, r2, r8) == r0) goto L36;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ve2.e eVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152307a;
        ve2.d dVar = null;
        try {
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
                try {
                    g2.f164047a.getClass();
                    g2.b();
                } catch (Exception e4) {
                    b.f152216b.error("handleGlobalSignOut", (Throwable) e4);
                }
                try {
                    j2 j2Var = j2.f164115a;
                    Context contextB = b.f152215a.b();
                    j2Var.getClass();
                    j2.j(contextB);
                } catch (Exception e14) {
                    b.f152216b.error("handleGlobalSignOut", (Throwable) e14);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            b bVar = b.f152215a;
            bVar.getClass();
            if (b.w()) {
                eVar = ve2.e.f177705e;
            } else {
                ud2.b bVar2 = ud2.b.f170019a;
                Context contextB2 = bVar.b();
                bVar2.getClass();
                if (d53.u.q(Locale.CHINA.getCountry(), ud2.b.a(contextB2, null), true)) {
                    eVar = ve2.e.f177705e;
                } else {
                    eVar = ve2.e.f177704d;
                }
            }
            g2.f164047a.getClass();
            eVar.getClass();
            SharedPreferences sharedPreferences = g2.f164049c;
            if (sharedPreferences == null) {
                p005kotlin.jvm.internal.s.m("prefs");
                throw null;
            }
            sharedPreferences.edit().putString("environment", eVar.name()).commit();
            b.f152216b.info("handleGlobalSignOut: environment set to '" + eVar.name() + "'");
            this.f152307a = 1;
            obj = b.j(this);
            if (obj == aVar) {
            }
            return aVar;
            dVar = (ve2.d) obj;
        } catch (Exception e15) {
            b.f152216b.error("handleGlobalSignOut", (Throwable) e15);
        }
        if (dVar != null) {
            ve2.k kVar = dVar.f177697h;
            if (kVar != null && kVar.f177753a != null) {
                e2 e2Var = new e2();
                Context contextB3 = b.f152215a.b();
                ve2.l lVarM = b.m();
                this.f152307a = 2;
            }
            g2.f164047a.getClass();
            g2.b();
            j2 j2Var2 = j2.f164115a;
            Context contextB4 = b.f152215a.b();
            j2Var2.getClass();
            j2.j(contextB4);
        } else {
            try {
                b.f(b.f152215a);
            } catch (Exception e16) {
                b.f152216b.error("handleGlobalSignOut", (Throwable) e16);
            }
        }
        return Unit.INSTANCE;
    }
}
