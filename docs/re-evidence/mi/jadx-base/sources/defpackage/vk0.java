package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.VisitorWeightViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class vk0 extends ViewDataBinding {
    public final RightArrowBindingSingleLineTextView A;
    public final RightArrowBindingSingleLineTextView B;
    public final TextView C;
    public final Button D;
    public final RightArrowBindingSingleLineTextView E;
    public final RoundImageView F;
    public final RightArrowBindingSingleLineTextView G;
    public VisitorWeightViewModel H;

    public vk0(Object obj, View view, int i, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView2, TextView textView, Button button, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView3, RoundImageView roundImageView, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView4) {
        super(obj, view, i);
        this.A = rightArrowBindingSingleLineTextView;
        this.B = rightArrowBindingSingleLineTextView2;
        this.C = textView;
        this.D = button;
        this.E = rightArrowBindingSingleLineTextView3;
        this.F = roundImageView;
        this.G = rightArrowBindingSingleLineTextView4;
    }
}
