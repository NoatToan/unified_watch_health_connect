package com.huami.bloodoxygen.ui.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.p008lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.bloodoxygen.core.koin.BloodOxygenConfig;
import com.huami.bloodoxygen.core.koin.BloodOxygenKoinScopeKt;
import com.huami.bloodoxygen.ui.base.HomeBaseFragment;
import com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel;
import com.huami.bloodoxygen.ui.databinding.BoUiLayoutHomeFragmentBinding;
import com.huami.bloodoxygen.ui.dto.TimeMode;
import com.huami.bloodoxygen.ui.utils.DataUtils;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0013\u001a\u00020\u0012H&R\u001d\u0010\u0019\u001a\u00020\u00148D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001b¨\u0006!"}, d2 = {"Lcom/huami/bloodoxygen/ui/base/HomeBaseFragment;", "Landroidx/fragment/app/Fragment;", "", "b", "c", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "", "time", "detailFragment", "Lcom/huami/bloodoxygen/ui/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "Lcom/huami/bloodoxygen/ui/databinding/BoUiLayoutHomeFragmentBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "getViewBinding", "()Lcom/huami/bloodoxygen/ui/databinding/BoUiLayoutHomeFragmentBinding;", "viewBinding", "Ljava/util/Date;", "Ljava/util/Date;", "startDate", "<init>", "()V", "Companion", "PagerAdapter", "ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class HomeBaseFragment extends Fragment {

    @NotNull
    private static final String d = "HomeBaseFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding = FragmentViewBindingKt.viewBinding(new HomeBaseFragment$special$$inlined$viewBinding$1(new InflateViewBinder(BoUiLayoutHomeFragmentBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Date startDate;
    public static final /* synthetic */ KProperty<Object>[] c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(HomeBaseFragment.class), "viewBinding", "getViewBinding()Lcom/huami/bloodoxygen/ui/databinding/BoUiLayoutHomeFragmentBinding;"))};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/huami/bloodoxygen/ui/base/HomeBaseFragment$PagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "getCount", "a", LogUtil.I, "pagerCount", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Lcom/huami/bloodoxygen/ui/base/HomeBaseFragment;Landroidx/fragment/app/FragmentManager;I)V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public final class PagerAdapter extends FragmentStatePagerAdapter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int pagerCount;

        public PagerAdapter(FragmentManager fragmentManager, int i) {
            super(fragmentManager, 1);
            this.pagerCount = i;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount, reason: from getter */
        public int getPagerCount() {
            return this.pagerCount;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        @NotNull
        public Fragment getItem(int position) {
            return HomeBaseFragment.this.detailFragment(DataUtils.INSTANCE.getTimeFromStartByOffset(HomeBaseFragment.this.timeMode(), HomeBaseFragment.this.startDate, position));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/androidx/viewmodel/ViewModelOwner;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ViewModelOwner> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelOwner invoke() {
            return ViewModelOwner.INSTANCE.from(HomeBaseFragment.this.requireActivity(), HomeBaseFragment.this.requireActivity());
        }
    }

    public HomeBaseFragment() {
        Date registerDate = ((BloodOxygenConfig) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).getRegisterDate();
        this.startDate = registerDate == null ? new Date() : registerDate;
    }

    private final void b() {
        int totalPageCount = DataUtils.INSTANCE.getTotalPageCount(timeMode(), this.startDate);
        ViewPager viewPager = getViewBinding().viewpager;
        viewPager.setAdapter(new PagerAdapter(getChildFragmentManager(), totalPageCount));
        viewPager.setOffscreenPageLimit(0);
    }

    private final void c() {
        if (getActivity() == null) {
            return;
        }
        ((BloodOxygenDetailActivitySharedDataViewModel) ScopeExtKt.getViewModel$default(BloodOxygenKoinScopeKt.getBloodOxygenKoinScope(), null, new a(), Reflection.getOrCreateKotlinClass(BloodOxygenDetailActivitySharedDataViewModel.class), null, null, 8, null)).getTimestampToPagePositionLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: c84
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HomeBaseFragment.d(this.a, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(HomeBaseFragment homeBaseFragment, Long l) {
        homeBaseFragment.getViewBinding().viewpager.setCurrentItem(DataUtils.INSTANCE.getDifferFromRegisterDay(new Date(l.longValue()), homeBaseFragment.startDate, homeBaseFragment.timeMode()), true);
    }

    @NotNull
    public abstract Fragment detailFragment(long time);

    @NotNull
    public final BoUiLayoutHomeFragmentBinding getViewBinding() {
        return (BoUiLayoutHomeFragmentBinding) this.viewBinding.getValue(this, c[0]);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return getViewBinding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        b();
        c();
    }

    @NotNull
    public abstract TimeMode timeMode();
}
