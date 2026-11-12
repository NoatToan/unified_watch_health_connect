package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.bean.SportingItemData;
import com.xiaomi.fitness.sport_eco.view.lockscreen.ui.ValueIconUnitView;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class wu7 extends ViewDataBinding {
    public final ValueIconUnitView A;
    public final ValueIconUnitView B;
    public final ValueIconUnitView C;
    public final ValueIconUnitView D;
    public final ValueIconUnitView E;
    public final ValueIconUnitView F;
    public List<SportingItemData> G;

    public wu7(Object obj, View view, int i, ValueIconUnitView valueIconUnitView, ValueIconUnitView valueIconUnitView2, ValueIconUnitView valueIconUnitView3, ValueIconUnitView valueIconUnitView4, ValueIconUnitView valueIconUnitView5, ValueIconUnitView valueIconUnitView6) {
        super(obj, view, i);
        this.A = valueIconUnitView;
        this.B = valueIconUnitView2;
        this.C = valueIconUnitView3;
        this.D = valueIconUnitView4;
        this.E = valueIconUnitView5;
        this.F = valueIconUnitView6;
    }

    public abstract void A0(List<SportingItemData> list);
}
