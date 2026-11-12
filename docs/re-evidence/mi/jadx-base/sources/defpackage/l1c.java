package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class l1c extends ViewDataBinding {
    public final AppCompatImageView A;

    public l1c(Object obj, View view, int i, AppCompatImageView appCompatImageView) {
        super(obj, view, i);
        this.A = appCompatImageView;
    }

    public static l1c A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static l1c B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (l1c) ViewDataBinding.G(layoutInflater, jui.d5, viewGroup, z, obj);
    }
}
