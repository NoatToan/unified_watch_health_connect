package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.mi.health.sport.AmapRealTimePathView;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class rvq extends ViewDataBinding {
    public final LinearLayout A;
    public final AmapRealTimePathView B;
    public final ConstraintLayout C;
    public final wvq D;
    public final View E;
    public Map<CommonSportModel.SportTitle, String> F;

    public rvq(Object obj, View view, int i, LinearLayout linearLayout, AmapRealTimePathView amapRealTimePathView, ConstraintLayout constraintLayout, wvq wvqVar, View view2) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = amapRealTimePathView;
        this.C = constraintLayout;
        this.D = wvqVar;
        this.E = view2;
    }
}
