package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
import miuix.animation.Folme;

/* JADX INFO: loaded from: classes3.dex */
public class zvq {

    public static class a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f41732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f41733b;

        public a(int i, float f) {
            this.f41733b = i;
            this.f41732a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            float[] fArr;
            Path path = new Path();
            RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
            int i = this.f41733b;
            if (i == 2) {
                float f = this.f41732a;
                fArr = new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
            } else if (i == 4) {
                float f2 = this.f41732a;
                fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f2, f2, f2, f2};
            } else if (i == 1) {
                float f3 = this.f41732a;
                fArr = new float[]{f3, f3, f3, f3, f3, f3, f3, f3};
            } else {
                fArr = null;
            }
            if (fArr != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                outline.setAlpha(0.0f);
                outline.setConvexPath(path);
            }
        }
    }

    public static a c(int i, float f) {
        return new a(i, f);
    }

    public static void d(RecyclerView.d0 d0Var, final int i, final float f, boolean z, long j) {
        final View view = d0Var.itemView;
        if (!z) {
            e(view, i, f);
            return;
        }
        Runnable runnable = new Runnable() { // from class: yvq
            @Override // java.lang.Runnable
            public final void run() {
                zvq.e(view, i, f);
            }
        };
        if (j <= 0) {
            j = 100;
        }
        view.postDelayed(runnable, j);
    }

    public static void e(View view, int i, float f) {
        if (Folme.isInDraggingState(view)) {
            return;
        }
        if (i == 2 || i == 4 || i == 1) {
            view.setOutlineProvider(c(i, f));
            view.setClipToOutline(true);
        } else {
            view.setOutlineProvider(null);
            view.setClipToOutline(false);
        }
    }
}
