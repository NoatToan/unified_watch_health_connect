package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.fitness.banner.export.v2.BannerItemV2;
import com.fitness.banner.export.view.MultipleStyleBannerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class j76 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final MultipleStyleBannerView B;
    public BannerItemV2 C;

    public j76(Object obj, View view, int i, ConstraintLayout constraintLayout, MultipleStyleBannerView multipleStyleBannerView) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = multipleStyleBannerView;
    }
}
