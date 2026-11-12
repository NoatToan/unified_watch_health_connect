package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class en6 extends ViewDataBinding {
    public final CardView A;
    public final ImageView B;

    public en6(Object obj, View view, int i, CardView cardView, ImageView imageView) {
        super(obj, view, i);
        this.A = cardView;
        this.B = imageView;
    }
}
