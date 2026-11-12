package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.sleep.view.widget.SleepStageProgressBarView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class nbe extends ViewDataBinding {
    public final AppCompatTextView A;
    public final TextView B;
    public final RecyclerView C;
    public final SleepStageProgressBarView D;
    public final CardView E;

    public nbe(Object obj, View view, int i, AppCompatTextView appCompatTextView, TextView textView, RecyclerView recyclerView, SleepStageProgressBarView sleepStageProgressBarView, CardView cardView) {
        super(obj, view, i);
        this.A = appCompatTextView;
        this.B = textView;
        this.C = recyclerView;
        this.D = sleepStageProgressBarView;
        this.E = cardView;
    }
}
