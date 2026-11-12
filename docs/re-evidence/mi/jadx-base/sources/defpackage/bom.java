package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class bom extends ViewDataBinding {
    public final MaterialCardView A;
    public final AppCompatTextView B;

    public bom(Object obj, View view, int i, MaterialCardView materialCardView, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.A = materialCardView;
        this.B = appCompatTextView;
    }

    public static bom A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static bom B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (bom) ViewDataBinding.G(layoutInflater, jui.s8, viewGroup, z, obj);
    }
}
