package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class itb extends ViewDataBinding {
    public final DividerView A;
    public final RightArrowSingleLineTextView B;
    public final TextView C;

    public itb(Object obj, View view, int i, DividerView dividerView, RightArrowSingleLineTextView rightArrowSingleLineTextView, TextView textView) {
        super(obj, view, i);
        this.A = dividerView;
        this.B = rightArrowSingleLineTextView;
        this.C = textView;
    }

    public static itb A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static itb B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (itb) ViewDataBinding.G(layoutInflater, jui.h3, viewGroup, z, obj);
    }
}
