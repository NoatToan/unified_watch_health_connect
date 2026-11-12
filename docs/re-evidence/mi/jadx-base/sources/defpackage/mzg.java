package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class mzg extends ViewDataBinding {
    public final NumberPicker A;
    public final TextView B;

    public mzg(Object obj, View view, int i, NumberPicker numberPicker, TextView textView) {
        super(obj, view, i);
        this.A = numberPicker;
        this.B = textView;
    }

    @Deprecated
    public static mzg A0(LayoutInflater layoutInflater, Object obj) {
        return (mzg) ViewDataBinding.G(layoutInflater, tui.g, null, false, obj);
    }
}
