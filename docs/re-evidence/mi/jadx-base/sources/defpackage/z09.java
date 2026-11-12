package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.fitness.banner.export.view.MultipleStyleBannerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class z09 extends ViewDataBinding {
    public final MultipleStyleBannerView A;

    public z09(Object obj, View view, int i, MultipleStyleBannerView multipleStyleBannerView) {
        super(obj, view, i);
        this.A = multipleStyleBannerView;
    }

    public static z09 A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static z09 B0(LayoutInflater layoutInflater, Object obj) {
        return (z09) ViewDataBinding.G(layoutInflater, ovi.f29737k, null, false, obj);
    }
}
