package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ssq extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final ImageView D;
    public final TextView E;
    public final ImageView F;
    public Map<CommonSportModel.SportTitle, String> G;

    public ssq(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, ImageView imageView, TextView textView4, ImageView imageView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = imageView;
        this.E = textView4;
        this.F = imageView2;
    }

    public abstract void A0(Map<CommonSportModel.SportTitle, String> map);
}
