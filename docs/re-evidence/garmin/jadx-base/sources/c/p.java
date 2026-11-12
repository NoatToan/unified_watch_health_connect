package c;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p3.j0;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc/p;", "", "<init>", "()V", "activity-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f22335a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f22336b = p3.v.c(new bv0.b(18));

    private p() {
    }

    public static b.w a(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        b.w wVar = (b.w) mVar.A(f22336b);
        Context context = null;
        if (wVar == null) {
            mVar.C(1208426157);
            View view2 = (View) mVar.A(AndroidCompositionLocals_androidKt.f6046f);
            view2.getClass();
            while (true) {
                if (view2 == null) {
                    wVar = null;
                    break;
                }
                Object tag = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                b.w wVar2 = tag instanceof b.w ? (b.w) tag : null;
                if (wVar2 != null) {
                    wVar = wVar2;
                    break;
                }
                Object objA = gl1.d.A(view2);
                view2 = objA instanceof View ? (View) objA : null;
            }
            mVar.f();
        } else {
            mVar.C(1208423708);
            mVar.f();
        }
        if (wVar == null) {
            mVar.C(1208428160);
            for (Context baseContext = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                if (baseContext instanceof b.w) {
                    context = baseContext;
                    break;
                }
            }
            wVar = (b.w) context;
            mVar.f();
        } else {
            mVar.C(1208423789);
            mVar.f();
        }
        x1 x1Var2 = p3.n.f135158a;
        return wVar;
    }
}
