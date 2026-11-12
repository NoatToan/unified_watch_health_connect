package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.bean.SportingItemData;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class etq extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final LinearLayout C;
    public final LinearLayout D;
    public final LinearLayout E;
    public final LinearLayout F;
    public final LinearLayout G;
    public final ConstraintLayout H;
    public List<SportingItemData> I;

    public etq(Object obj, View view, int i, TextView textView, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = linearLayout;
        this.D = linearLayout2;
        this.E = linearLayout3;
        this.F = linearLayout4;
        this.G = linearLayout5;
        this.H = constraintLayout;
    }

    public abstract void A0(List<SportingItemData> list);
}
