package com.huami.treadmill.ui.linedetail;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.huami.treadmill.R;
import com.huami.treadmill.data.TdRankingItem;
import com.huami.treadmill.ui.linedetail.LineDetailActivity$upDataUserView$2;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"com/huami/treadmill/ui/linedetail/LineDetailActivity$upDataUserView$2", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "", "state", "", "onPageScrollStateChanged", "position", "", "positionOffset", "positionOffsetPixels", "onPageScrolled", "onPageSelected", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class LineDetailActivity$upDataUserView$2 implements ViewPager.OnPageChangeListener {
    public final /* synthetic */ LineDetailActivity a;

    public LineDetailActivity$upDataUserView$2(LineDetailActivity lineDetailActivity) {
        this.a = lineDetailActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LineDetailActivity lineDetailActivity, List list) {
        lineDetailActivity.B(list, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LineDetailActivity lineDetailActivity, List list) {
        lineDetailActivity.B(list, 1);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int state) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
        this.a.findViewById(R.id.me_rank).setVisibility(8);
        if (position == 0) {
            LineDetailViewModel lineDetailViewModel = this.a.viewModel;
            Objects.requireNonNull(lineDetailViewModel);
            MutableLiveData<List<TdRankingItem>> meDiligentRank = lineDetailViewModel.getMeDiligentRank();
            final LineDetailActivity lineDetailActivity = this.a;
            meDiligentRank.observe(lineDetailActivity, new Observer() { // from class: sm4
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    LineDetailActivity$upDataUserView$2.c(lineDetailActivity, (List) obj);
                }
            });
            return;
        }
        if (position != 1) {
            return;
        }
        LineDetailViewModel lineDetailViewModel2 = this.a.viewModel;
        Objects.requireNonNull(lineDetailViewModel2);
        MutableLiveData<List<TdRankingItem>> meSpeedRank = lineDetailViewModel2.getMeSpeedRank();
        final LineDetailActivity lineDetailActivity2 = this.a;
        meSpeedRank.observe(lineDetailActivity2, new Observer() { // from class: rm4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LineDetailActivity$upDataUserView$2.d(lineDetailActivity2, (List) obj);
            }
        });
    }
}
