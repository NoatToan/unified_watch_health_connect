package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.eco.device.manager.ui.EcoDeviceDetail;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zt7 extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public EcoDeviceDetail F;

    public zt7(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
    }
}
