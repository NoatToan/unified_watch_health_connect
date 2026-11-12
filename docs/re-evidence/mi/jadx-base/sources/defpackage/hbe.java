package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.detail.view.RingView;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class hbe extends ViewDataBinding {
    public final TextView A;
    public final RoundImageView B;
    public final RingView C;
    public final TextView D;

    public hbe(Object obj, View view, int i, TextView textView, RoundImageView roundImageView, RingView ringView, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = roundImageView;
        this.C = ringView;
        this.D = textView2;
    }
}
