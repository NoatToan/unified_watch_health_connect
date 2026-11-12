package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class qjq extends ViewDataBinding {
    public final TextView A;
    public final LinearLayout B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final NumberPickerView F;

    public qjq(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3, TextView textView4, NumberPickerView numberPickerView) {
        super(obj, view, i);
        this.A = textView;
        this.B = linearLayout;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = numberPickerView;
    }
}
