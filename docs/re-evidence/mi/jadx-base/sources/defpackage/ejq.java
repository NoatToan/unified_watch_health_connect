package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ejq extends ViewDataBinding {
    public final Guideline A;
    public final TextView B;
    public final NumberPickerView C;
    public final TextView D;
    public final TextView E;

    public ejq(Object obj, View view, int i, Guideline guideline, TextView textView, NumberPickerView numberPickerView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = guideline;
        this.B = textView;
        this.C = numberPickerView;
        this.D = textView2;
        this.E = textView3;
    }
}
