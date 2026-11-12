package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class axq extends ViewDataBinding {
    public final TextView A;
    public final LinearLayout B;
    public final ImageView C;
    public final LinearLayout D;
    public final LinearLayout E;
    public final LinearLayout F;
    public final LinearLayout G;
    public final LinearLayout H;
    public final ConstraintLayout I;
    public List<SportingItemData> J;

    public axq(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = linearLayout;
        this.C = imageView;
        this.D = linearLayout2;
        this.E = linearLayout3;
        this.F = linearLayout4;
        this.G = linearLayout5;
        this.H = linearLayout6;
        this.I = constraintLayout;
    }

    public abstract void A0(List<SportingItemData> list);
}
