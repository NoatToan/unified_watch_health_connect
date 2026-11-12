package com.xiaomi.hm.health.running.calori;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.viewpager.widget.ViewPager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.utils.UtilsKt;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.running.SportEnergyAdapter;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001e\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001f\u0010\u001f\u001a\u0004\u0018\u00010\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u001e¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/running/calori/CaloriItemFragment;", "Landroidx/fragment/app/Fragment;", "", "position", "", GoogleApiAvailabilityLight.a, "count", "e", "currentPos", "f", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "Lcom/xiaomi/hm/health/running/calori/CaloriViewModel;", "b", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/running/calori/CaloriViewModel;", "mViewModel", "Lcom/xiaomi/hm/health/running/calori/SportFilterType;", "c", "Lcom/xiaomi/hm/health/running/calori/SportFilterType;", CaloriActivity.ARG_FILTER_TYPE, "Landroidx/viewpager/widget/ViewPager;", "()Landroidx/viewpager/widget/ViewPager;", "viewPager", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CaloriItemFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private SportFilterType filterType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewPager;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportFilterType.values().length];
            iArr[SportFilterType.DAY.ordinal()] = 1;
            iArr[SportFilterType.WEEK.ordinal()] = 2;
            iArr[SportFilterType.MONTH.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroidx/viewpager/widget/ViewPager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ViewPager> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewPager invoke() {
            return (ViewPager) UtilsKt.findViewById(CaloriItemFragment.this, R.id.sport_energy_content);
        }
    }

    public CaloriItemFragment() {
        super(R.layout.fragment_calori_item);
        this.TAG = CaloriItemFragment.class.getSimpleName();
        this.mViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(CaloriViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.running.calori.CaloriItemFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.running.calori.CaloriItemFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        this.filterType = SportFilterType.DAY;
        this.viewPager = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new a());
    }

    private final CaloriViewModel b() {
        return (CaloriViewModel) this.mViewModel.getValue();
    }

    private final ViewPager c() {
        return (ViewPager) this.viewPager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int position) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.filterType.ordinal()];
        if (i == 1) {
            b().setCurrentDayPosition(position);
        } else if (i == 2) {
            b().setCurrentWeekPosition(position);
        } else {
            if (i != 3) {
                return;
            }
            b().setCurrentMonthPosition(position);
        }
    }

    private final void e(int count) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.filterType.ordinal()];
        if (i == 1) {
            f(b().getCurrentDayPosition(), count);
        } else if (i == 2) {
            f(b().getCurrentWeekPosition(), count);
        } else {
            if (i != 3) {
                return;
            }
            f(b().getCurrentMonthPosition(), count);
        }
    }

    private final void f(int currentPos, int count) {
        if (currentPos < 0 || currentPos >= count) {
            ViewPager viewPagerC = c();
            if (viewPagerC == null) {
                return;
            }
            viewPagerC.setCurrentItem(count - 1);
            return;
        }
        ViewPager viewPagerC2 = c();
        if (viewPagerC2 == null) {
            return;
        }
        viewPagerC2.setCurrentItem(currentPos);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if ((arguments == null ? null : arguments.get(CaloriActivity.ARG_FILTER_TYPE)) instanceof SportFilterType) {
            Bundle arguments2 = getArguments();
            Object obj = arguments2 != null ? arguments2.get(CaloriActivity.ARG_FILTER_TYPE) : null;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.xiaomi.hm.health.running.calori.SportFilterType");
            this.filterType = (SportFilterType) obj;
        }
        SportEnergyAdapter sportEnergyAdapter = new SportEnergyAdapter(getChildFragmentManager(), this.filterType);
        ViewPager viewPagerC = c();
        if (viewPagerC != null) {
            viewPagerC.setAdapter(sportEnergyAdapter);
        }
        ViewPager viewPagerC2 = c();
        if (viewPagerC2 != null) {
            viewPagerC2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.xiaomi.hm.health.running.calori.CaloriItemFragment.onViewCreated.1
                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int state) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int position) {
                    CaloriItemFragment.this.d(position);
                }
            });
        }
        e(sportEnergyAdapter.getPagerCount());
    }
}
