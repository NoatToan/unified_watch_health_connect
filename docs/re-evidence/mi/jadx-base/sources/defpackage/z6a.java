package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.DeviceImageView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class z6a extends ViewDataBinding {
    public final DeviceImageView A;
    public final NestedScrollView B;
    public final Button C;
    public final TextView D;
    public final Button E;

    public z6a(Object obj, View view, int i, DeviceImageView deviceImageView, NestedScrollView nestedScrollView, Button button, TextView textView, Button button2) {
        super(obj, view, i);
        this.A = deviceImageView;
        this.B = nestedScrollView;
        this.C = button;
        this.D = textView;
        this.E = button2;
    }
}
