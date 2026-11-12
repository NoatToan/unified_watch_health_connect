package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.carousel.CarouselBanner;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j9e extends ViewDataBinding {
    public final CarouselBanner A;

    public j9e(Object obj, View view, int i, CarouselBanner carouselBanner) {
        super(obj, view, i);
        this.A = carouselBanner;
    }

    public static j9e A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static j9e B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (j9e) ViewDataBinding.G(layoutInflater, ovi.v0, viewGroup, z, obj);
    }
}
