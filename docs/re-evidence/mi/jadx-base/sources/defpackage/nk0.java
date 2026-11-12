package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.model.UserManageViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nk0 extends ViewDataBinding {
    public final RightArrowBindingSingleLineTextView A;
    public final RightArrowBindingSingleLineTextView B;
    public final RightArrowBindingSingleLineTextView C;
    public final TextView D;
    public final RightArrowBindingSingleLineTextView E;
    public final RoundImageView F;
    public final Button G;
    public final RightArrowBindingSingleLineTextView H;
    public UserManageViewModel I;

    public nk0(Object obj, View view, int i, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView2, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView3, TextView textView, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView4, RoundImageView roundImageView, Button button, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView5) {
        super(obj, view, i);
        this.A = rightArrowBindingSingleLineTextView;
        this.B = rightArrowBindingSingleLineTextView2;
        this.C = rightArrowBindingSingleLineTextView3;
        this.D = textView;
        this.E = rightArrowBindingSingleLineTextView4;
        this.F = roundImageView;
        this.G = button;
        this.H = rightArrowBindingSingleLineTextView5;
    }
}
