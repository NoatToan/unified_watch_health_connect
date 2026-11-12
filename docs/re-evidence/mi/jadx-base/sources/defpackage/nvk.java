package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.rn.settings.viewmodel.DeviceUpdateViewModel;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nvk extends ViewDataBinding {
    public final ConstraintLayout A;
    public final LinearLayoutCompat B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final ProgressBar F;
    public final TextView G;
    public DeviceUpdateViewModel H;

    public nvk(Object obj, View view, int i, ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, TextView textView, TextView textView2, TextView textView3, ProgressBar progressBar, TextView textView4) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = linearLayoutCompat;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
        this.F = progressBar;
        this.G = textView4;
    }
}
