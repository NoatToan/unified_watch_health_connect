package p004k6;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk6/b0;", "Lk6/y;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class b0 implements y {
    @Override // p004k6.y
    public void a(Rect rect, View view2) {
        DisplayMetrics displayMetrics = view2.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Override // p004k6.y
    public final void b(Rect rect, View view2) {
        view2.getWindowVisibleDisplayFrame(rect);
    }

    @Override // p004k6.y
    public final void c(WindowManager windowManager, x xVar, WindowManager.LayoutParams layoutParams) {
        windowManager.updateViewLayout(xVar, layoutParams);
    }

    @Override // p004k6.y
    public void d(x xVar, int i14, int i15) {
    }
}
