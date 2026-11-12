package hf;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import o53.c2;
import o53.j0;

/* JADX INFO: loaded from: classes7.dex */
public final class u {
    public static final wf.d a(wf.f fVar, j0 j0Var) {
        ag.a aVar = fVar.f184904c;
        if (!(aVar instanceof ag.b)) {
            return new wf.l(j0Var);
        }
        View view2 = ((ag.b) aVar).getView();
        Object tag = view2.getTag(R.id.coil3_request_manager);
        wf.t tVar = tag instanceof wf.t ? (wf.t) tag : null;
        if (tVar == null) {
            synchronized (view2) {
                try {
                    Object tag2 = view2.getTag(R.id.coil3_request_manager);
                    tVar = tag2 instanceof wf.t ? (wf.t) tag2 : null;
                    if (tVar == null) {
                        tVar = new wf.t(view2);
                        view2.addOnAttachStateChangeListener(tVar);
                        view2.setTag(R.id.coil3_request_manager, tVar);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        synchronized (tVar) {
            wf.q qVar = tVar.f185021b;
            if (qVar != null) {
                Bitmap.Config[] configArr = dg.u.f59504a;
                if (p005kotlin.jvm.internal.s.g(Looper.myLooper(), Looper.getMainLooper()) && tVar.f185024e) {
                    tVar.f185024e = false;
                    qVar.f185014b = j0Var;
                    return qVar;
                }
            }
            c2 c2Var = tVar.f185022c;
            if (c2Var != null) {
                c2Var.c(null);
            }
            tVar.f185022c = null;
            wf.q qVar2 = new wf.q(tVar.f185020a, j0Var);
            tVar.f185021b = qVar2;
            return qVar2;
        }
    }
}
