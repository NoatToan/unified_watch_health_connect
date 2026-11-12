package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class dl0 extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final RightArrowBindingSingleLineTextView C;
    public final Button D;

    public dl0(Object obj, View view, int i, TextView textView, ImageView imageView, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView, Button button) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = rightArrowBindingSingleLineTextView;
        this.D = button;
    }
}
