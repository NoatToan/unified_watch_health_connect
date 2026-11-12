package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class kjq extends ViewDataBinding {
    public final Guideline A;
    public final LinearLayout B;
    public final TextView C;
    public final NumberPickerView D;
    public final NumberPickerView E;
    public final NumberPickerView F;
    public final TextView G;
    public final TextView H;

    public kjq(Object obj, View view, int i, Guideline guideline, LinearLayout linearLayout, TextView textView, NumberPickerView numberPickerView, NumberPickerView numberPickerView2, NumberPickerView numberPickerView3, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = guideline;
        this.B = linearLayout;
        this.C = textView;
        this.D = numberPickerView;
        this.E = numberPickerView2;
        this.F = numberPickerView3;
        this.G = textView2;
        this.H = textView3;
    }
}
