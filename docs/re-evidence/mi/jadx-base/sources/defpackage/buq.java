package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class buq extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;
    public final ImageView E;
    public final TextView F;
    public final ImageView G;
    public Map<CommonSportModel.SportTitle, String> H;

    public buq(Object obj, View view, int i, TextView textView, TextView textView2, ImageView imageView, TextView textView3, ImageView imageView2, TextView textView4, ImageView imageView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = imageView;
        this.D = textView3;
        this.E = imageView2;
        this.F = textView4;
        this.G = imageView3;
    }

    public abstract void A0(Map<CommonSportModel.SportTitle, String> map);
}
