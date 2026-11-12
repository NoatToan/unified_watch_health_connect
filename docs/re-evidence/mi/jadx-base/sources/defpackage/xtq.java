package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.view.widget.RunningSportMusicView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class xtq extends ViewDataBinding {
    public final FrameLayout A;
    public final RunningSportMusicView B;
    public final FrameLayout C;
    public final TextView D;
    public final buq E;
    public final TextView F;
    public List<SportingItemData> G;
    public Map<CommonSportModel.SportTitle, String> H;

    public xtq(Object obj, View view, int i, FrameLayout frameLayout, RunningSportMusicView runningSportMusicView, FrameLayout frameLayout2, TextView textView, buq buqVar, TextView textView2) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = runningSportMusicView;
        this.C = frameLayout2;
        this.D = textView;
        this.E = buqVar;
        this.F = textView2;
    }

    public abstract void A0(List<SportingItemData> list);

    public abstract void B0(Map<CommonSportModel.SportTitle, String> map);
}
