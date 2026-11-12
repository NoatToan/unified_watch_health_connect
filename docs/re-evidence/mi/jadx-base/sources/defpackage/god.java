package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class god extends ViewDataBinding {
    public final LinearLayout A;
    public final TextView B;
    public final AppCompatTextView C;

    public god(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = textView;
        this.C = appCompatTextView;
    }

    public static god A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static god B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (god) ViewDataBinding.G(layoutInflater, jui.o6, viewGroup, z, obj);
    }
}
