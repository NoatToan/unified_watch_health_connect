package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.detail.view.SportPaceSegmentView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class coa extends ViewDataBinding {
    public final TextView A;
    public final SportPaceSegmentView B;
    public final TextView C;
    public final RelativeLayout D;
    public final TextView E;
    public final TextView F;

    public coa(Object obj, View view, int i, TextView textView, SportPaceSegmentView sportPaceSegmentView, TextView textView2, RelativeLayout relativeLayout, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = sportPaceSegmentView;
        this.C = textView2;
        this.D = relativeLayout;
        this.E = textView3;
        this.F = textView4;
    }
}
