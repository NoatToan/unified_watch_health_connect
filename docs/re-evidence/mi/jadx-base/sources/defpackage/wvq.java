package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.view.widget.GpsSignalView;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class wvq extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final LinearLayout C;
    public final GpsSignalView D;
    public final TextView E;
    public final ImageView F;
    public final TextView G;
    public final TextView H;
    public Map<CommonSportModel.SportTitle, String> I;

    public wvq(Object obj, View view, int i, TextView textView, TextView textView2, LinearLayout linearLayout, GpsSignalView gpsSignalView, TextView textView3, ImageView imageView, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = linearLayout;
        this.D = gpsSignalView;
        this.E = textView3;
        this.F = imageView;
        this.G = textView4;
        this.H = textView5;
    }

    public abstract void A0(Map<CommonSportModel.SportTitle, String> map);
}
