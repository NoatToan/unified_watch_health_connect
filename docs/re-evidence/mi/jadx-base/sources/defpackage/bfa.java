package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class bfa extends ViewDataBinding {
    public final Button A;
    public final TextView B;
    public final ConstraintLayout C;
    public final DataTitleSimpleView D;

    public bfa(Object obj, View view, int i, Button button, TextView textView, ConstraintLayout constraintLayout, DataTitleSimpleView dataTitleSimpleView) {
        super(obj, view, i);
        this.A = button;
        this.B = textView;
        this.C = constraintLayout;
        this.D = dataTitleSimpleView;
    }

    public static bfa A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static bfa B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (bfa) ViewDataBinding.G(layoutInflater, ivi.J, viewGroup, z, obj);
    }
}
