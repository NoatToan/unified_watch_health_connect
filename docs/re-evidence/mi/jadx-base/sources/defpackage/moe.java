package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.view.lockscreen.ui.ValueIconUnitView;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class moe extends ViewDataBinding {
    public final LinearLayout A;
    public final ValueIconUnitView B;
    public final ValueIconUnitView C;
    public final ValueIconUnitView D;
    public final ValueIconUnitView E;
    public final ValueIconUnitView F;
    public final ValueIconUnitView G;
    public final LinearLayout H;
    public final LinearLayout I;
    public List<SportingItemData> J;

    public moe(Object obj, View view, int i, LinearLayout linearLayout, ValueIconUnitView valueIconUnitView, ValueIconUnitView valueIconUnitView2, ValueIconUnitView valueIconUnitView3, ValueIconUnitView valueIconUnitView4, ValueIconUnitView valueIconUnitView5, ValueIconUnitView valueIconUnitView6, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = valueIconUnitView;
        this.C = valueIconUnitView2;
        this.D = valueIconUnitView3;
        this.E = valueIconUnitView4;
        this.F = valueIconUnitView5;
        this.G = valueIconUnitView6;
        this.H = linearLayout2;
        this.I = linearLayout3;
    }

    public abstract void A0(List<SportingItemData> list);
}
