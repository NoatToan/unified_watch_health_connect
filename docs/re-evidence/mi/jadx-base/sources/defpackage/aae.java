package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import com.xiaomi.fitness.widget.view.CardStyleSetView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class aae extends ViewDataBinding {
    public final HealthBannerCardSetView A;
    public final CardStyleSetView B;
    public final RecyclerView C;
    public final RecyclerView D;
    public final RecyclerView E;
    public final RecyclerView F;
    public final RecyclerView G;
    public final CardUnderstandView H;

    public aae(Object obj, View view, int i, HealthBannerCardSetView healthBannerCardSetView, CardStyleSetView cardStyleSetView, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4, RecyclerView recyclerView5, CardUnderstandView cardUnderstandView) {
        super(obj, view, i);
        this.A = healthBannerCardSetView;
        this.B = cardStyleSetView;
        this.C = recyclerView;
        this.D = recyclerView2;
        this.E = recyclerView3;
        this.F = recyclerView4;
        this.G = recyclerView5;
        this.H = cardUnderstandView;
    }
}
