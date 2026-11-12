package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class lde extends ViewDataBinding {
    public final SportsDeviceListView A;
    public final HealthBannerCardSetView B;
    public final RecyclerView C;
    public final RecyclerView D;
    public final CardUnderstandView E;

    public lde(Object obj, View view, int i, SportsDeviceListView sportsDeviceListView, HealthBannerCardSetView healthBannerCardSetView, RecyclerView recyclerView, RecyclerView recyclerView2, CardUnderstandView cardUnderstandView) {
        super(obj, view, i);
        this.A = sportsDeviceListView;
        this.B = healthBannerCardSetView;
        this.C = recyclerView;
        this.D = recyclerView2;
        this.E = cardUnderstandView;
    }
}
