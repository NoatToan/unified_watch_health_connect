package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.bean.SportingItemData;
import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class sz7 extends ViewDataBinding {
    public final FrameLayout A;
    public final TextView B;
    public final ssq C;
    public final TextView D;
    public List<SportingItemData> E;
    public Map<CommonSportModel.SportTitle, String> F;

    public sz7(Object obj, View view, int i, FrameLayout frameLayout, TextView textView, ssq ssqVar, TextView textView2) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = textView;
        this.C = ssqVar;
        this.D = textView2;
    }

    public abstract void A0(List<SportingItemData> list);

    public abstract void B0(Map<CommonSportModel.SportTitle, String> map);
}
