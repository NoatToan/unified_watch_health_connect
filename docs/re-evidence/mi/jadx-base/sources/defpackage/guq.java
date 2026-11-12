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
public abstract class guq extends ViewDataBinding {
    public final FrameLayout A;
    public final TextView B;
    public final TextView C;
    public final kuq D;
    public final TextView E;
    public List<SportingItemData> F;
    public Map<CommonSportModel.SportTitle, String> G;

    public guq(Object obj, View view, int i, FrameLayout frameLayout, TextView textView, TextView textView2, kuq kuqVar, TextView textView3) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = textView;
        this.C = textView2;
        this.D = kuqVar;
        this.E = textView3;
    }

    public abstract void A0(List<SportingItemData> list);

    public abstract void B0(Map<CommonSportModel.SportTitle, String> map);
}
