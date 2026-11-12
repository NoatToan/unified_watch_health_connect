package vu1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTPagerTitleNavigationStrip;
import com.garmin.android.apps.connectmobile.view.InfiniteViewPager;
import java.util.ArrayList;
import kotlin.w3;
import p005kotlin.Metadata;
import r22.b0;
import r22.w0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvu1/x;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class x extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InfiniteViewPager f180389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f180390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FBTPagerTitleNavigationStrip f180391c;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fbt_date_infinite_view_pager_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.infinite_view_pager);
        viewFindViewById.getClass();
        this.f180389a = (InfiniteViewPager) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.pager_title_strip);
        viewFindViewById2.getClass();
        this.f180391c = (FBTPagerTitleNavigationStrip) viewFindViewById2;
        b0 b0VarV6 = v6();
        this.f180390b = b0VarV6;
        InfiniteViewPager infiniteViewPager = this.f180389a;
        if (infiniteViewPager != null) {
            infiniteViewPager.setAdapter((w0) b0VarV6);
        } else {
            p005kotlin.jvm.internal.s.m("viewPager");
            throw null;
        }
    }

    public final void u6(ArrayList arrayList) {
        FBTPagerTitleNavigationStrip fBTPagerTitleNavigationStrip = this.f180391c;
        if (fBTPagerTitleNavigationStrip == null) {
            p005kotlin.jvm.internal.s.m("pagerTitleStrip");
            throw null;
        }
        ComposeView composeView = fBTPagerTitleNavigationStrip.getComposeView();
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(892456952, true, new bp0.b(5, arrayList)));
    }

    public abstract b0 v6();
}
