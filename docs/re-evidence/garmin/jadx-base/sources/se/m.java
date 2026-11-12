package se;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lse/m;", "Lse/l;", "<init>", "()V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f158738b = new m();

    private m() {
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
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f14 = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new oe.m(bounds, f14);
    }
}
