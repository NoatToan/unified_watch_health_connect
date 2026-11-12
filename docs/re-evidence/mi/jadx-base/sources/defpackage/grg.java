package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class grg extends ViewDataBinding {
    public final AppCompatImageView A;

    public grg(Object obj, View view, int i, AppCompatImageView appCompatImageView) {
        super(obj, view, i);
        this.A = appCompatImageView;
    }

    public static grg A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static grg B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (grg) ViewDataBinding.G(layoutInflater, sui.F0, viewGroup, z, obj);
    }
}
