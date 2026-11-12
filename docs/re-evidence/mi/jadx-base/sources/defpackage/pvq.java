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
public abstract class pvq extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final LinearLayout C;
    public final LinearLayout D;
    public final LinearLayout E;
    public final ConstraintLayout F;
    public final LinearLayout G;
    public final LinearLayout H;
    public List<SportingItemData> I;

    public pvq(Object obj, View view, int i, TextView textView, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ConstraintLayout constraintLayout, LinearLayout linearLayout4, LinearLayout linearLayout5) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = linearLayout;
        this.D = linearLayout2;
        this.E = linearLayout3;
        this.F = constraintLayout;
        this.G = linearLayout4;
        this.H = linearLayout5;
    }

    public abstract void A0(List<SportingItemData> list);
}
