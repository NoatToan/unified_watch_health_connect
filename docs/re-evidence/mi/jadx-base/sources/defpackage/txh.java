package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class txh extends ViewDataBinding {
    public final RoundImageView A;
    public final TextView B;
    public final TextView C;

    public txh(Object obj, View view, int i, RoundImageView roundImageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = roundImageView;
        this.B = textView;
        this.C = textView2;
    }
}
