package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.device.manager.ui.bind.BindViewModel;
import com.xiaomi.fitness.ubox.export.DeviceIconView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class i16 extends ViewDataBinding {
    public final LinearLayout A;
    public final TextView B;
    public final TextView C;
    public final ScrollView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final DeviceIconView H;
    public final CheckBox I;
    public final TextView J;
    public final TextView K;
    public BindViewModel L;
    public DeviceInfo M;

    public i16(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, TextView textView2, ScrollView scrollView, TextView textView3, TextView textView4, TextView textView5, DeviceIconView deviceIconView, CheckBox checkBox, TextView textView6, TextView textView7) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = textView;
        this.C = textView2;
        this.D = scrollView;
        this.E = textView3;
        this.F = textView4;
        this.G = textView5;
        this.H = deviceIconView;
        this.I = checkBox;
        this.J = textView6;
        this.K = textView7;
    }
}
