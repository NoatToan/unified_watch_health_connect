package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.relative.view.TargetRItemView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class jka extends ViewDataBinding {
    public final DataTitleSimpleView A;
    public final LinearLayout B;
    public final TargetRItemView C;
    public final TargetRItemView D;

    public jka(Object obj, View view, int i, DataTitleSimpleView dataTitleSimpleView, LinearLayout linearLayout, TargetRItemView targetRItemView, TargetRItemView targetRItemView2) {
        super(obj, view, i);
        this.A = dataTitleSimpleView;
        this.B = linearLayout;
        this.C = targetRItemView;
        this.D = targetRItemView2;
    }

    public static jka A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static jka B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (jka) ViewDataBinding.G(layoutInflater, jui.N1, viewGroup, z, obj);
    }
}
