package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes5.dex */
public abstract class xp4 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final TextView B;
    public final View C;

    public xp4(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, View view2) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = textView;
        this.C = view2;
    }

    public static xp4 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static xp4 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (xp4) ViewDataBinding.G(layoutInflater, sti.course_catalog_item, viewGroup, z, obj);
    }
}
