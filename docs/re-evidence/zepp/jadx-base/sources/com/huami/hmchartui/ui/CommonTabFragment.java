package com.huami.hmchartui.ui;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.hmchartui.R;
import com.huami.hmchartui.utils.CommonExtensionUtilsKt;
import com.huami.hmchartui.utils.CommonTimeUtils;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\u000bH&J\u0018\u0010\u000f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH&J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000b¨\u0006\u0015"}, d2 = {"Lcom/huami/hmchartui/ui/CommonTabFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "getTimeType", "", "getRegisterDate", "time", "position", "createContentFragment", "onViewPageSelected", "getCurrentItem", "setCurrentItem", "<init>", "()V", "hmchartui_release"}, k = 1, mv = {1, 5, 1})
public abstract class CommonTabFragment extends Fragment {
    public CommonTabFragment() {
        super(R.layout.fragment_common_tab);
    }

    private final void initView() {
        int differFromRegisterDay$default = CommonTimeUtils.getDifferFromRegisterDay$default(CommonTimeUtils.INSTANCE, 0L, new Date(CommonExtensionUtilsKt.secondToMills(getRegisterDate())), Integer.valueOf(getTimeType()), 1, null) + 1;
        View view = getView();
        ((ViewPager2) (view == null ? null : view.findViewById(R.id.viewpager))).setAdapter(new FragmentStateAdapter(differFromRegisterDay$default, this) { // from class: com.huami.hmchartui.ui.CommonTabFragment.initView.1
            public final /* synthetic */ int a;
            public final /* synthetic */ CommonTabFragment b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
                this.b = this;
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            @NotNull
            public Fragment createFragment(int position) {
                return this.b.createContentFragment(CommonTimeUtils.INSTANCE.getTimeFromRegisterDay(position, this.b.getTimeType(), CommonExtensionUtilsKt.secondToMills(this.b.getRegisterDate())), position);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            /* JADX INFO: renamed from: getItemCount, reason: from getter */
            public int getPagerCount() {
                return this.a;
            }
        });
        View view2 = getView();
        ((ViewPager2) (view2 == null ? null : view2.findViewById(R.id.viewpager))).setOffscreenPageLimit(1);
        View view3 = getView();
        ((ViewPager2) (view3 == null ? null : view3.findViewById(R.id.viewpager))).setCurrentItem(differFromRegisterDay$default - 1, false);
        View view4 = getView();
        ((ViewPager2) (view4 != null ? view4.findViewById(R.id.viewpager) : null)).registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.huami.hmchartui.ui.CommonTabFragment.initView.2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                CommonTabFragment.this.onViewPageSelected(position);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public abstract Fragment createContentFragment(long time, int position);

    public final int getCurrentItem() {
        View view = getView();
        return ((ViewPager2) (view == null ? null : view.findViewById(R.id.viewpager))).getCurrentItem();
    }

    public abstract long getRegisterDate();

    public abstract int getTimeType();

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    public void onViewPageSelected(int position) {
    }

    public final void setCurrentItem(long time) {
        int differFromRegisterDay = CommonTimeUtils.INSTANCE.getDifferFromRegisterDay(time, new Date(CommonExtensionUtilsKt.secondToMills(getRegisterDate())), Integer.valueOf(getTimeType()));
        View view = getView();
        RecyclerView.Adapter adapter = ((ViewPager2) (view == null ? null : view.findViewById(R.id.viewpager))).getAdapter();
        Integer numValueOf = adapter == null ? null : Integer.valueOf(adapter.getPagerCount());
        if (numValueOf != null) {
            if (differFromRegisterDay >= 0 && differFromRegisterDay < numValueOf.intValue()) {
                View view2 = getView();
                ((ViewPager2) (view2 != null ? view2.findViewById(R.id.viewpager) : null)).setCurrentItem(differFromRegisterDay, false);
            }
        }
    }
}
