package xc;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p3.j0;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;
import xa1.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxc/b;", "", "<init>", "()V", "navigationevent-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f189878a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f189879b = v.c(new j(5));

    private b() {
    }

    public static wc.d a(m mVar) {
        wc.d dVar;
        x1 x1Var = n.f135158a;
        wc.d dVar2 = (wc.d) mVar.A(f189879b);
        if (dVar2 != null) {
            mVar.C(950834231);
            mVar.f();
            return dVar2;
        }
        mVar.C(950836184);
        View view2 = (View) mVar.A(AndroidCompositionLocals_androidKt.f6046f);
        view2.getClass();
        while (true) {
            dVar = null;
            if (view2 == null) {
                break;
            }
            Object tag = view2.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            wc.d dVar3 = tag instanceof wc.d ? (wc.d) tag : null;
            if (dVar3 != null) {
                dVar = dVar3;
                break;
            }
            Object objA = gl1.d.A(view2);
            view2 = objA instanceof View ? (View) objA : null;
        }
        x1 x1Var2 = n.f135158a;
        mVar.f();
        return dVar;
    }
}
