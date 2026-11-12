package b;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.room.w0;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f13809a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13810b = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static l f13811c;

    public static void a(g gVar) {
        x.a aVar = x.f13833e;
        w0 w0Var = new w0(14);
        aVar.getClass();
        x xVar = new x(0, 0, 0, w0Var, null);
        w0 w0Var2 = new w0(14);
        aVar.getClass();
        x xVar2 = new x(f13809a, f13810b, 0, w0Var2, null);
        gVar.getClass();
        View decorView = gVar.getWindow().getDecorView();
        decorView.getClass();
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean zBooleanValue = xVar.f13837d.invoke(resources).booleanValue();
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean zBooleanValue2 = xVar2.f13837d.invoke(resources2).booleanValue();
        l nVar = f13811c;
        if (nVar == null) {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 35) {
                nVar = new p();
            } else if (i14 >= 30) {
                nVar = new o();
            } else {
                nVar = i14 >= 29 ? new n() : new l();
            }
            f13811c = nVar;
        }
        l lVar = nVar;
        Window window = gVar.getWindow();
        window.getClass();
        lVar.b(xVar, xVar2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = gVar.getWindow();
        window2.getClass();
        lVar.a(window2);
    }
}
