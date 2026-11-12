package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.bean.SportingItemData;
import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import com.xiaomi.fitness.sport_eco.view.lockscreen.ui.LockUnderView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class nx7 extends ViewDataBinding {
    public final TextView A;
    public final LinearLayout B;
    public final LockUnderView C;
    public final wu7 D;
    public final yu7 E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public List<SportingItemData> I;
    public Map<CommonSportModel.SportTitle, String> J;

    public nx7(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, LockUnderView lockUnderView, wu7 wu7Var, yu7 yu7Var, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = linearLayout;
        this.C = lockUnderView;
        this.D = wu7Var;
        this.E = yu7Var;
        this.F = textView2;
        this.G = textView3;
        this.H = textView4;
    }

    public Map<CommonSportModel.SportTitle, String> A0() {
        return this.J;
    }

    public abstract void B0(List<SportingItemData> list);

    public abstract void C0(Map<CommonSportModel.SportTitle, String> map);
}
