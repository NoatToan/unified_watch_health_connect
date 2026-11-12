package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b6a extends ViewDataBinding {
    public b6a(Object obj, View view, int i) {
        super(obj, view, i);
    }

    public static b6a A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static b6a B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (b6a) ViewDataBinding.G(layoutInflater, ovi.Z, viewGroup, z, obj);
    }
}
