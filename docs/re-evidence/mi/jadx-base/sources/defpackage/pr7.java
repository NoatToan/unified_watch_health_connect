package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.eco.device.manager.ui.bind.RopeSkippingDevice;

/* JADX INFO: loaded from: classes8.dex */
public abstract class pr7 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final ImageView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public RopeSkippingDevice F;

    public pr7(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = imageView;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
    }
}
