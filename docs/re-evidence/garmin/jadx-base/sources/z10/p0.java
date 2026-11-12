package z10;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz10/p0;", "Lbv/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p0 implements bv.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f201200a;

    public p0(Context context) {
        context.getClass();
        this.f201200a = context;
    }

    @Override // bv.a
    public final void a(boolean z14) {
        ((vf1.a) KoinJavaComponent.get$default(vf1.a.class, null, null, 6, null)).c(z14);
    }

    @Override // bv.a
    public final void b(long j8, String str) {
        eq0.a aVarA = eq0.a.f65038b.a();
        if (str == null) {
            str = "";
        }
        aVarA.getClass();
        eq0.a.R(j8, str);
    }

    @Override // bv.a
    public final boolean c(String str) {
        str.getClass();
        w13.c cVar = aq1.a.f12344b;
        if (cVar != null && cVar.isEmpty()) {
            return false;
        }
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            String strName = ((aq1.a) bVarN.next()).name();
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (p005kotlin.jvm.internal.s.g(strName, upperCase)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // bv.a
    public final Object d(long j8, v13.c cVar) {
        o0 o0Var;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i14 = o0Var.f201186c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o0Var.f201186c = i14 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(this, cVar);
            }
        } else {
            o0Var = new o0(this, cVar);
        }
        Object objO = o0Var.f201184a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = o0Var.f201186c;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(objO);
            re0.o oVar = (re0.o) KoinJavaComponent.get$default(re0.o.class, null, null, 6, null);
            o0Var.f201186c = 1;
            objO = oVar.o(j8, o0Var);
            if (objO == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objO);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objO;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            List<l20.a> listF = ((l20.r) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).f();
            if (listF == null || listF.isEmpty()) {
            }
            return Boolean.valueOf(z14);
        }
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
            lc.u0.r();
            return null;
        }
        z14 = false;
        return Boolean.valueOf(z14);
    }

    @Override // bv.a
    public final SharedPreferences e() {
        SharedPreferences sharedPreferences = this.f201200a.getSharedPreferences("gcm_consent_preferences", 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    @Override // bv.a
    public final Object f(long j8, s sVar) {
        return ((re0.o) KoinJavaComponent.get$default(re0.o.class, null, null, 6, null)).g(j8, sVar);
    }
}
