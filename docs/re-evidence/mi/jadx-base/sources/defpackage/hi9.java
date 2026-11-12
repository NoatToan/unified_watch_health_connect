package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.feedback.history.HistoryDetail;
import com.xiaomi.fitness.feedback.history.HistoryDetailViewModel;

/* JADX INFO: loaded from: classes8.dex */
public abstract class hi9 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public HistoryDetailViewModel E;
    public HistoryDetail F;

    public hi9(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = textView4;
    }
}
