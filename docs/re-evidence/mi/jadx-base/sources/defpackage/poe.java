package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class poe extends ViewDataBinding {
    public final ProgressBar A;
    public final RelativeLayout B;
    public final TextView C;
    public final TextView D;
    public final RelativeLayout E;
    public final TextView F;
    public final TextView G;
    public Map<CommonSportModel.SportTitle, String> H;

    public poe(Object obj, View view, int i, ProgressBar progressBar, RelativeLayout relativeLayout, TextView textView, TextView textView2, RelativeLayout relativeLayout2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = progressBar;
        this.B = relativeLayout;
        this.C = textView;
        this.D = textView2;
        this.E = relativeLayout2;
        this.F = textView3;
        this.G = textView4;
    }

    public abstract void A0(Map<CommonSportModel.SportTitle, String> map);
}
