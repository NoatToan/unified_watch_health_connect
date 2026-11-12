package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.view.CardUnderstandView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class z8e extends ViewDataBinding {
    public final RecyclerView A;
    public final SportsDeviceListView B;
    public final CardUnderstandView C;

    public z8e(Object obj, View view, int i, RecyclerView recyclerView, SportsDeviceListView sportsDeviceListView, CardUnderstandView cardUnderstandView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = sportsDeviceListView;
        this.C = cardUnderstandView;
    }
}
