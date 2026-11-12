package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DurationTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class lbe extends ViewDataBinding {
    public final DurationTextView A;
    public final AppCompatImageView B;
    public final ConstraintLayout C;
    public final TextView D;
    public final TextView E;

    public lbe(Object obj, View view, int i, DurationTextView durationTextView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = durationTextView;
        this.B = appCompatImageView;
        this.C = constraintLayout;
        this.D = textView;
        this.E = textView2;
    }
}
