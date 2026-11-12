package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class bgk extends ViewDataBinding {
    public final RoundImageView A;
    public final TextView B;

    public bgk(Object obj, View view, int i, RoundImageView roundImageView, TextView textView) {
        super(obj, view, i);
        this.A = roundImageView;
        this.B = textView;
    }
}
