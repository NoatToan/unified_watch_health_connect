package defpackage;

import android.view.View;
import android.widget.EditText;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ivb extends ViewDataBinding {
    public final EditText A;
    public final EditText B;
    public final RightArrowSingleLineTextView C;

    public ivb(Object obj, View view, int i, EditText editText, EditText editText2, RightArrowSingleLineTextView rightArrowSingleLineTextView) {
        super(obj, view, i);
        this.A = editText;
        this.B = editText2;
        this.C = rightArrowSingleLineTextView;
    }
}
