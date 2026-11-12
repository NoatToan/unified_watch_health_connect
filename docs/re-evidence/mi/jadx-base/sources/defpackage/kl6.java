package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class kl6 extends ViewDataBinding {
    public final AppCompatCheckedTextView A;
    public final TextView B;
    public final ConstraintLayout C;

    public kl6(Object obj, View view, int i, AppCompatCheckedTextView appCompatCheckedTextView, TextView textView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = appCompatCheckedTextView;
        this.B = textView;
        this.C = constraintLayout;
    }

    public static kl6 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static kl6 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (kl6) ViewDataBinding.G(layoutInflater, eui.D1, viewGroup, z, obj);
    }
}
