package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.fitness.banner.export.view.AnnouncementBannerView;
import com.xiaomi.fitness.homepage.view.DataHeaderV2View;
import com.xiaomi.fitness.widget.view.HomeHeaderTabTitleView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes9.dex */
public abstract class i5a extends ViewDataBinding {
    public final AnnouncementBannerView A;
    public final LinearLayout B;
    public final DataHeaderV2View C;
    public final HomeHeaderTabTitleView D;
    public final RecyclerView E;
    public final RecyclerView F;
    public final NestedScrollView G;
    public final SpringBackLayout H;

    public i5a(Object obj, View view, int i, AnnouncementBannerView announcementBannerView, LinearLayout linearLayout, DataHeaderV2View dataHeaderV2View, HomeHeaderTabTitleView homeHeaderTabTitleView, RecyclerView recyclerView, RecyclerView recyclerView2, NestedScrollView nestedScrollView, SpringBackLayout springBackLayout) {
        super(obj, view, i);
        this.A = announcementBannerView;
        this.B = linearLayout;
        this.C = dataHeaderV2View;
        this.D = homeHeaderTabTitleView;
        this.E = recyclerView;
        this.F = recyclerView2;
        this.G = nestedScrollView;
        this.H = springBackLayout;
    }
}
