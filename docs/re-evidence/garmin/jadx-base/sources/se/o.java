package se;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lse/o;", "Lse/l;", "<init>", "()V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f158740b = new o();

    private o() {
    }

    @Override // se.l
    public final oe.m a(Activity activity, g gVar) {
        b bVar;
        gVar.getClass();
        b.f158724a.getClass();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            bVar = e.f158728b;
        } else {
            bVar = i14 >= 29 ? d.f158727b : c.f158726b;
        }
        return new oe.m(new me.b(bVar.a(activity)), gVar.a(activity));
    }

    @Override // se.l
    public final oe.m b(Context context, g gVar) {
        gVar.getClass();
        f.f158729a.getClass();
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            return a((Activity) baseContext, gVar);
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            vb.h.s("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        k kVar = k.f158735a;
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        kVar.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new oe.m(new Rect(0, 0, point.x, point.y), gVar.a(context));
    }
}
