package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes7.dex */
public abstract class pxh extends ViewDataBinding {
    public final ryh A;

    public pxh(Object obj, View view, int i, ryh ryhVar) {
        super(obj, view, i);
        this.A = ryhVar;
    }

    public static pxh A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static pxh B0(LayoutInflater layoutInflater, Object obj) {
        return (pxh) ViewDataBinding.G(layoutInflater, bui.e, null, false, obj);
    }
}
