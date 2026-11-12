package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.DurationTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class lce extends ViewDataBinding {
    public final DurationTextView A;
    public final AppCompatImageView B;
    public final RecyclerView C;
    public final LinearLayout D;
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;

    public lce(Object obj, View view, int i, DurationTextView durationTextView, AppCompatImageView appCompatImageView, RecyclerView recyclerView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = durationTextView;
        this.B = appCompatImageView;
        this.C = recyclerView;
        this.D = linearLayout;
        this.E = linearLayout2;
        this.F = textView;
        this.G = textView2;
    }
}
