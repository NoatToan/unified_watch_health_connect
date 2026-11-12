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
public abstract class mvq extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final LinearLayout C;
    public final LinearLayout D;
    public final LinearLayout E;
    public final ConstraintLayout F;
    public final LinearLayout G;
    public List<SportingItemData> H;

    public mvq(Object obj, View view, int i, TextView textView, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ConstraintLayout constraintLayout, LinearLayout linearLayout4) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = linearLayout;
        this.D = linearLayout2;
        this.E = linearLayout3;
        this.F = constraintLayout;
        this.G = linearLayout4;
    }

    public abstract void A0(List<SportingItemData> list);
}
