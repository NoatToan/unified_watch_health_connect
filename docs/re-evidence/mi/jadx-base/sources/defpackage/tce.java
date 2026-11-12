package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class tce extends ViewDataBinding {
    public final HealthBannerCardSetView A;
    public final RecyclerView B;
    public final RecyclerView C;
    public final CardUnderstandView D;

    public tce(Object obj, View view, int i, HealthBannerCardSetView healthBannerCardSetView, RecyclerView recyclerView, RecyclerView recyclerView2, CardUnderstandView cardUnderstandView) {
        super(obj, view, i);
        this.A = healthBannerCardSetView;
        this.B = recyclerView;
        this.C = recyclerView2;
        this.D = cardUnderstandView;
    }
}
