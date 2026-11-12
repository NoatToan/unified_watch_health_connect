package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.DeviceImageView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class dm6 extends ViewDataBinding {
    public final DeviceImageView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final NestedScrollView F;

    public dm6(Object obj, View view, int i, DeviceImageView deviceImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = deviceImageView;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = nestedScrollView;
    }
}
