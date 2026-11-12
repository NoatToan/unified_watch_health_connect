package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.notify.widget.CheckBoxTextView;
import com.xiaomi.fitness.ubox.export.DeviceIconView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.view.DividerView;
import miuix.core.widget.NestedScrollView;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class dzg extends ViewDataBinding {
    public final RecyclerView A;
    public final LinearLayout B;
    public final TextView C;
    public final DeviceIconView D;
    public final DividerView E;
    public final TextView F;
    public final SwitchButtonTwoLineTextView G;
    public final SwitchButtonTwoLineTextView H;
    public final LinearLayoutCompat I;
    public final SwitchButtonTwoLineTextView J;
    public final SwitchButtonTwoLineTextView K;
    public final LinearLayout L;
    public final CheckBoxTextView M;
    public final TextView N;
    public final NestedScrollView O;
    public final CheckBoxTextView P;
    public final TextView Q;

    public dzg(Object obj, View view, int i, RecyclerView recyclerView, LinearLayout linearLayout, TextView textView, DeviceIconView deviceIconView, DividerView dividerView, TextView textView2, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, SwitchButtonTwoLineTextView switchButtonTwoLineTextView2, LinearLayoutCompat linearLayoutCompat, SwitchButtonTwoLineTextView switchButtonTwoLineTextView3, SwitchButtonTwoLineTextView switchButtonTwoLineTextView4, LinearLayout linearLayout2, CheckBoxTextView checkBoxTextView, TextView textView3, NestedScrollView nestedScrollView, CheckBoxTextView checkBoxTextView2, TextView textView4) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = linearLayout;
        this.C = textView;
        this.D = deviceIconView;
        this.E = dividerView;
        this.F = textView2;
        this.G = switchButtonTwoLineTextView;
        this.H = switchButtonTwoLineTextView2;
        this.I = linearLayoutCompat;
        this.J = switchButtonTwoLineTextView3;
        this.K = switchButtonTwoLineTextView4;
        this.L = linearLayout2;
        this.M = checkBoxTextView;
        this.N = textView3;
        this.O = nestedScrollView;
        this.P = checkBoxTextView2;
        this.Q = textView4;
    }
}
