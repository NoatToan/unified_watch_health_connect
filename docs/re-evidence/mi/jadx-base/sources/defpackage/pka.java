package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.relative.view.TargetRItemView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class pka extends ViewDataBinding {
    public final DataTitleSimpleView A;
    public final LinearLayout B;
    public final TargetRItemView C;
    public final TargetRItemView D;

    public pka(Object obj, View view, int i, DataTitleSimpleView dataTitleSimpleView, LinearLayout linearLayout, TargetRItemView targetRItemView, TargetRItemView targetRItemView2) {
        super(obj, view, i);
        this.A = dataTitleSimpleView;
        this.B = linearLayout;
        this.C = targetRItemView;
        this.D = targetRItemView2;
    }

    public static pka A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static pka B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (pka) ViewDataBinding.G(layoutInflater, jui.Q1, viewGroup, z, obj);
    }
}
