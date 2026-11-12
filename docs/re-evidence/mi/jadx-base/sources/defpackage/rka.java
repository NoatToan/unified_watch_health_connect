package defpackage;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class rka extends ViewDataBinding {
    public final CardView A;
    public final View B;
    public final NestedScrollView C;

    public rka(Object obj, View view, int i, CardView cardView, View view2, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = cardView;
        this.B = view2;
        this.C = nestedScrollView;
    }
}
