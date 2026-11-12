package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class abe extends ViewDataBinding {
    public final NumberPickerView A;
    public final TextView B;

    public abe(Object obj, View view, int i, NumberPickerView numberPickerView, TextView textView) {
        super(obj, view, i);
        this.A = numberPickerView;
        this.B = textView;
    }
}
