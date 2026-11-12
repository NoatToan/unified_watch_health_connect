package defpackage;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class kca extends ViewDataBinding {
    public final CardView A;
    public final NestedScrollView B;
    public final CardView C;

    public kca(Object obj, View view, int i, CardView cardView, NestedScrollView nestedScrollView, CardView cardView2) {
        super(obj, view, i);
        this.A = cardView;
        this.B = nestedScrollView;
        this.C = cardView2;
    }
}
