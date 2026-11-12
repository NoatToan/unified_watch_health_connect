package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.view.justdance.PlayerData;

/* JADX INFO: loaded from: classes10.dex */
public abstract class kpn extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final View G;
    public PlayerData H;

    public kpn(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view2) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = textView5;
        this.G = view2;
    }
}
