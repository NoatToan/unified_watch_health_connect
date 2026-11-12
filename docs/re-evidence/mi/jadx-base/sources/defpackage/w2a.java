package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class w2a extends ViewDataBinding {
    public final RightArrowSingleLineTextView A;
    public final ImageView B;

    public w2a(Object obj, View view, int i, RightArrowSingleLineTextView rightArrowSingleLineTextView, ImageView imageView) {
        super(obj, view, i);
        this.A = rightArrowSingleLineTextView;
        this.B = imageView;
    }
}
