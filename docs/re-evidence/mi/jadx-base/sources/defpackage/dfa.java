package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class dfa extends ViewDataBinding {
    public final DataTitleSimpleView A;
    public final SportDetailItemView B;
    public final SportDetailItemView C;
    public final LinearLayout D;

    public dfa(Object obj, View view, int i, DataTitleSimpleView dataTitleSimpleView, SportDetailItemView sportDetailItemView, SportDetailItemView sportDetailItemView2, LinearLayout linearLayout) {
        super(obj, view, i);
        this.A = dataTitleSimpleView;
        this.B = sportDetailItemView;
        this.C = sportDetailItemView2;
        this.D = linearLayout;
    }

    public static dfa A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static dfa B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (dfa) ViewDataBinding.G(layoutInflater, ivi.K, viewGroup, z, obj);
    }
}
