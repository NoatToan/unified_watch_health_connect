package qe;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.view.j;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import oe.l;
import oe.m;
import oe.o;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqe/g;", "", "<init>", "()V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f144518a = new g();

    private g() {
    }

    public static oe.d a(m mVar, FoldingFeature foldingFeature) {
        oe.d.b bVar;
        oe.c.C2494c c2494c;
        mVar.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type == 1) {
            oe.d.b.f131211b.getClass();
            bVar = oe.d.b.f131212c;
        } else {
            if (type != 2) {
                return null;
            }
            oe.d.b.f131211b.getClass();
            bVar = oe.d.b.f131213d;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c2494c = oe.c.C2494c.f131204b;
        } else {
            if (state != 2) {
                return null;
            }
            c2494c = oe.c.C2494c.f131205c;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        me.b bVar2 = new me.b(bounds);
        Rect rectC = mVar.f131240a.c();
        if (bVar2.a() == 0 && bVar2.b() == 0) {
            return null;
        }
        if (bVar2.b() != rectC.width() && bVar2.a() != rectC.height()) {
            return null;
        }
        if (bVar2.b() < rectC.width() && bVar2.a() < rectC.height()) {
            return null;
        }
        if (bVar2.b() == rectC.width() && bVar2.a() == rectC.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        bounds2.getClass();
        return new oe.d(new me.b(bounds2), bVar, c2494c);
    }

    public static l b(Context context, WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        o oVar = new o(null, 1, null);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            return c(oVar.b(context), windowLayoutInfo);
        }
        if (i14 >= 29 && (context instanceof Activity)) {
            return c(oVar.a((Activity) context), windowLayoutInfo);
        }
        org.apache.commons.lang3.e.w("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        return null;
    }

    public static l c(m mVar, WindowLayoutInfo windowLayoutInfo) {
        oe.d dVarA;
        mVar.getClass();
        windowLayoutInfo.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayListL = j.l(displayFeatures);
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                f144518a.getClass();
                dVarA = a(mVar, foldingFeature);
            } else {
                dVarA = null;
            }
            if (dVarA != null) {
                arrayListL.add(dVarA);
            }
        }
        return new l(arrayListL);
    }
}
