package x22;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.InfiniteViewPager;
import com.garmin.android.apps.connectmobile.view.pager.PagerTitleNavigationStrip;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r22.b0;
import r22.w0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx22/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InfiniteViewPager f188526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f188527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PagerTitleNavigationStrip f188528c;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.date_infinite_view_pager_fragment_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.infinite_view_pager);
        viewFindViewById.getClass();
        this.f188526a = (InfiniteViewPager) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.pager_title_strip);
        viewFindViewById2.getClass();
        this.f188528c = (PagerTitleNavigationStrip) viewFindViewById2;
        this.f188527b = u6();
        w6().setAdapter((w0) v6());
        PagerTitleNavigationStrip pagerTitleNavigationStrip = this.f188528c;
        if (pagerTitleNavigationStrip != null) {
            pagerTitleNavigationStrip.findViewById(R.id.separator).setVisibility(8);
        } else {
            s.m("pagerTitleStrip");
            throw null;
        }
    }

    public abstract b0 u6();

    public final b0 v6() {
        b0 b0Var = this.f188527b;
        if (b0Var != null) {
            return b0Var;
        }
        s.m("adapter");
        throw null;
    }

    public final InfiniteViewPager w6() {
        InfiniteViewPager infiniteViewPager = this.f188526a;
        if (infiniteViewPager != null) {
            return infiniteViewPager;
        }
        s.m("viewPager");
        throw null;
    }
}
