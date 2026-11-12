package defpackage;

import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.ViewfinderView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class pfk extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final TextView C;
    public final SurfaceView D;
    public final ImageView E;
    public final TextView F;
    public final ViewfinderView G;

    public pfk(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, SurfaceView surfaceView, ImageView imageView2, TextView textView3, ViewfinderView viewfinderView) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = textView2;
        this.D = surfaceView;
        this.E = imageView2;
        this.F = textView3;
        this.G = viewfinderView;
    }
}
