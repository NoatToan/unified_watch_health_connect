package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p62 extends RecyclerView.n {
    public int c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f30050a = new Paint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f30051b = new Path();
    public int d = 0;
    public int e = 0;

    public abstract void c(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar, RecyclerView.Adapter<?> adapter);

    public void d(Canvas canvas, RectF rectF, Path path, Drawable drawable) {
        int iSaveLayerAlpha = canvas.saveLayerAlpha(rectF, 255);
        canvas.clipPath(path);
        drawable.mutate().setBounds(new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        drawable.mutate().draw(canvas);
        canvas.restoreToCount(iSaveLayerAlpha);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.onDraw(canvas, recyclerView, zVar);
        c(canvas, recyclerView, zVar, recyclerView.getAdapter());
    }
}
