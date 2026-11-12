package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.ui.DeviceDetail;

/* JADX INFO: loaded from: classes8.dex */
public abstract class z76 extends ViewDataBinding {
    public final Guideline A;
    public final ImageView B;
    public final ImageView C;
    public final TextView D;
    public final TextView E;
    public DeviceDetail F;

    public z76(Object obj, View view, int i, Guideline guideline, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = guideline;
        this.B = imageView;
        this.C = imageView2;
        this.D = textView;
        this.E = textView2;
    }
}
