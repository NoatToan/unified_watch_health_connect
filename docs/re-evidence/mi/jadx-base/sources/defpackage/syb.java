package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class syb extends ViewDataBinding {
    public final LinearLayout A;
    public final RightArrowSingleLineTextView B;

    public syb(Object obj, View view, int i, LinearLayout linearLayout, RightArrowSingleLineTextView rightArrowSingleLineTextView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = rightArrowSingleLineTextView;
    }
}
