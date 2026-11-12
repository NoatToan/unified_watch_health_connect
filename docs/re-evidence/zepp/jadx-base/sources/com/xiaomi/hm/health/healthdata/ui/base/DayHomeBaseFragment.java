package com.xiaomi.hm.health.healthdata.ui.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.p008lifecycle.Observer;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.R;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.ui.base.DayHomeBaseFragment;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.DataDetailBaseViewModel;
import com.xiaomi.hm.health.healthdata.ui.vo.eventbus.EventAddDataSuccess;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.healthdata.utils.HealthDataUtils;
import com.xiaomi.hm.health.training.ui.widget.WrapContentHeightViewPager;
import com.xiaomi.hm.health.view.pager.CacheFragmentStatePagerAdapter;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H&J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/base/DayHomeBaseFragment;", "Landroidx/fragment/app/Fragment;", "", "c", GoogleApiAvailabilityLight.a, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroy", "", "time", "dayDetailFragment", "Lcom/xiaomi/hm/health/healthdata/ui/vo/eventbus/EventAddDataSuccess;", "event", "onEventMainThread", "Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/DataDetailBaseViewModel;", "a", "Lkotlin/Lazy;", "b", "()Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/DataDetailBaseViewModel;", "baseViewModel", "<init>", "()V", "Companion", "PagerAdapter", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class DayHomeBaseFragment extends Fragment {

    @NotNull
    private static final String b = "DayHomeBaseFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy baseViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/base/DayHomeBaseFragment$PagerAdapter;", "Lcom/xiaomi/hm/health/view/pager/CacheFragmentStatePagerAdapter;", "", "position", "Landroidx/fragment/app/Fragment;", "createItem", "getCount", "g", LogUtil.I, "pagerCount", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Lcom/xiaomi/hm/health/healthdata/ui/base/DayHomeBaseFragment;Landroidx/fragment/app/FragmentManager;I)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public final class PagerAdapter extends CacheFragmentStatePagerAdapter {

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final int pagerCount;

        public PagerAdapter(FragmentManager fragmentManager, int i) {
            super(fragmentManager);
            this.pagerCount = i;
        }

        @Override // com.xiaomi.hm.health.view.pager.CacheFragmentStatePagerAdapter
        @NotNull
        public Fragment createItem(int position) {
            return DayHomeBaseFragment.this.dayDetailFragment(HealthDataTimeUtils.INSTANCE.getTimeFromRegisterDay(position, TimeMode.DAY));
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount, reason: from getter */
        public int getPagerCount() {
            return this.pagerCount;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "pageCount:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Integer a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Integer num) {
            super(0);
            this.a = num;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "dayDefaultPagePos:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ EventAddDataSuccess a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EventAddDataSuccess eventAddDataSuccess) {
            super(0);
            this.a = eventAddDataSuccess;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Add data success time:" + this.a.getTime();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DayHomeBaseFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.healthdata.ui.base.DayHomeBaseFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.baseViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DataDetailBaseViewModel>() { // from class: com.xiaomi.hm.health.healthdata.ui.base.DayHomeBaseFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.healthdata.ui.viewmodel.DataDetailBaseViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DataDetailBaseViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(DataDetailBaseViewModel.class), function0, objArr);
            }
        });
    }

    private final DataDetailBaseViewModel b() {
        return (DataDetailBaseViewModel) this.baseViewModel.getValue();
    }

    private final void c() {
        int totalPageCount = HealthDataUtils.INSTANCE.getTotalPageCount(TimeMode.DAY);
        HMLog.info(b, new a(totalPageCount));
        View view = getView();
        ((WrapContentHeightViewPager) (view == null ? null : view.findViewById(R.id.viewpager))).setAdapter(new PagerAdapter(getChildFragmentManager(), totalPageCount));
    }

    private final void d() {
        b().getDayDefaultPagePosLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: i31
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DayHomeBaseFragment.e(this.a, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(DayHomeBaseFragment dayHomeBaseFragment, Integer num) {
        HMLog.info(b, new b(num));
        View view = dayHomeBaseFragment.getView();
        ((WrapContentHeightViewPager) (view == null ? null : view.findViewById(R.id.viewpager))).setCurrentItem(num.intValue());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public abstract Fragment dayDetailFragment(long time);

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(com.huami.watch.hmwatchmanager.R.layout.fragment_data_detail_viewpager, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull EventAddDataSuccess event) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        CustomToast.makeText(context, getString(com.huami.watch.hmwatchmanager.R.string.save_success), 0).show();
        HMLog.info(b, new c(event));
        int differFromRegisterDay = HealthDataTimeUtils.INSTANCE.getDifferFromRegisterDay(event.getTime(), TimeMode.DAY);
        View view = getView();
        ((WrapContentHeightViewPager) (view == null ? null : view.findViewById(R.id.viewpager))).setCurrentItem(differFromRegisterDay);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EventBus.getDefault().register(this);
        c();
        d();
    }
}
