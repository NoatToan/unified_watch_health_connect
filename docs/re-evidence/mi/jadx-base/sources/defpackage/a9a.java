package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingNumberVM;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a9a extends ViewDataBinding {
    public final RightArrowBindingSingleLineTextView A;
    public final RightArrowBindingSingleLineTextView B;
    public final RightArrowBindingSingleLineTextView C;
    public View.OnClickListener D;
    public IntervalTrainingNumberVM E;

    public a9a(Object obj, View view, int i, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView2, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView3) {
        super(obj, view, i);
        this.A = rightArrowBindingSingleLineTextView;
        this.B = rightArrowBindingSingleLineTextView2;
        this.C = rightArrowBindingSingleLineTextView3;
    }

    public abstract void setOnClick(View.OnClickListener onClickListener);
}
