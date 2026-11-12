package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class wiq extends ViewDataBinding {
    public final LinearLayout A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final NumberPickerView E;
    public final TextView F;

    public wiq(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, NumberPickerView numberPickerView, TextView textView4) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = numberPickerView;
        this.F = textView4;
    }
}
