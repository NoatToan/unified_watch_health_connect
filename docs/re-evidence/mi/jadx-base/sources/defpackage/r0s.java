package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r0s extends ViewDataBinding {
    public final ProgressBar A;

    public r0s(Object obj, View view, int i, ProgressBar progressBar) {
        super(obj, view, i);
        this.A = progressBar;
    }

    public static r0s A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static r0s B0(LayoutInflater layoutInflater, Object obj) {
        return (r0s) ViewDataBinding.G(layoutInflater, vvi.f37274a, null, false, obj);
    }
}
