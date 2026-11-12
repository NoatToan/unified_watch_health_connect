package org.koin.androidx.compose;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import e23.p;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.androidx.compose.scope.a;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/Function0;", "", FirebaseAnalytics.Param.CONTENT, "KoinAndroidContext", "(Le23/p;Lp3/m;I)V", "Landroid/content/Context;", "Landroid/content/ComponentCallbacks;", "findContextForKoin", "(Landroid/content/Context;)Landroid/content/ComponentCallbacks;", "koin-androidx-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KoinAndroidContextKt {
    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    public static final void KoinAndroidContext(p<? super m, ? super Integer, Unit> pVar, m mVar, int i14) {
        int i15;
        pVar.getClass();
        o0 o0VarE = mVar.E(-318078207);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i15 & 3) == 2 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            o0VarE.L(229822871);
            boolean zB = o0VarE.B(context);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = ComponentCallbackExtKt.getKoin(findContextForKoin(context));
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = ComponentCallbackExtKt.getKoin(findContextForKoin(context));
                    o0VarE.K(objQ);
                }
            }
            o0VarE.g0(false);
            KoinApplicationKt.KoinContext((Koin) objQ, pVar, o0VarE, (i15 << 3) & 112, 0);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(pVar, i14, i16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KoinAndroidContext$lambda$1(p pVar, int i14, m mVar, int i15) {
        KoinAndroidContext(pVar, mVar, p0.t(i14 | 1));
        return Unit.INSTANCE;
    }

    private static final ComponentCallbacks findContextForKoin(Context context) {
        for (Object baseContext = context; baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if ((baseContext instanceof KoinComponent) && (baseContext instanceof ComponentCallbacks)) {
                return (ComponentCallbacks) baseContext;
            }
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        return (Application) applicationContext;
    }
}
