package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.ubox.export.DeviceIconView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class wg6 extends ViewDataBinding {
    public final Button A;
    public final DeviceIconView B;
    public final Button C;
    public final CheckBox D;
    public final ConstraintLayout E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final NestedScrollView H;

    public wg6(Object obj, View view, int i, Button button, DeviceIconView deviceIconView, Button button2, CheckBox checkBox, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = button;
        this.B = deviceIconView;
        this.C = button2;
        this.D = checkBox;
        this.E = constraintLayout;
        this.F = appCompatTextView;
        this.G = appCompatTextView2;
        this.H = nestedScrollView;
    }
}
