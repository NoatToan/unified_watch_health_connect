package com.huami.sleep.daysleep.daydetail.ui;

import android.content.ComponentCallbacks;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.viewpager.widget.ViewPager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.daydetail.adapter.SportInfoViewPageAdapter;
import com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepDetailViewModel;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.sleephome.viewmodel.SleepHomeViewModel;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.util.SleepStatusAnalytics;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.huami.sleep.view.WrapContentHeightViewPager;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.dataprocess.SportDay;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@FlowPreview
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0017J\b\u0010\u000f\u001a\u00020\u0002H\u0016J$\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\"R\u001d\u0010)\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010-\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b\u001e\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00065"}, d2 = {"Lcom/huami/sleep/daysleep/daydetail/ui/SleepDetailFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "initData", "b", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, GoogleApiAvailabilityLight.a, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "hidden", "onHiddenChanged", "onDestroy", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "onStart", "Lcom/huami/sleep/daysleep/daydetail/adapter/SportInfoViewPageAdapter;", "a", "Lcom/huami/sleep/daysleep/daydetail/adapter/SportInfoViewPageAdapter;", "mAdapter", "Lcom/huami/sleep/view/WrapContentHeightViewPager;", "Lcom/huami/sleep/view/WrapContentHeightViewPager;", "mViewPager", "", "c", LogUtil.I, "mCurrentIndex", "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "mPosBitmap", "Lcom/huami/sleep/sleephome/viewmodel/SleepHomeViewModel;", "e", "Lkotlin/Lazy;", "getMSleepHomeViewModel", "()Lcom/huami/sleep/sleephome/viewmodel/SleepHomeViewModel;", "mSleepHomeViewModel", "Lcom/huami/sleep/daysleep/daydetail/viewmodel/DaySleepDetailViewModel;", "f", "()Lcom/huami/sleep/daysleep/daydetail/viewmodel/DaySleepDetailViewModel;", "mViewModel", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "g", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "mPagerListener", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepDetailFragment extends Fragment {
    public static final int AM_1 = 1;
    public static final int AM_6 = 6;
    public static final int BEYOND_END_VALID_INTO_TIME = 1810;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int DP_POINT = 5;
    public static final int DP_REGION = 30;
    public static final int END_VALID_DP_COUNT = 300;
    public static final int END_VALID_INTO_TIME = 1800;
    public static final int END_VALID_LABEL_DP_COUNT = 270;
    public static final int END_VALID_LABEL_TIME = 1740;
    public static final int HALF_DP_REGION = 15;
    public static final int HALF_HOUR_MINUTES = 30;
    public static final int HOUR_MINUTES = 60;
    public static final int INTO_TIME_POINT = 10;
    public static final int SLEEP_DURATION_HOUR_GOOD = 7;
    public static final int SLEEP_DURATION_HOUR_SHORT = 5;
    public static final int SLEEP_QS_GOOD_COUNT = 4;
    public static final int START_VALID_DP_COUNT = 30;
    public static final int START_VALID_INTO_TIME = 1200;
    public static final int START_VALID_LABEL_TIME = 1260;
    public static final int WAKE_SLEEP_DURATION = 14;
    public static final int WAKE_SLEEP_LESS = 3;
    public static final int WAKE_SLEEP_LIGHT = 2;
    public static final int WHOLE_DAY_MINUTES = 1440;

    @NotNull
    private static final String h = "SleepDetailFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private SportInfoViewPageAdapter mAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private WrapContentHeightViewPager mViewPager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mCurrentIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Bitmap mPosBitmap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepHomeViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ViewPager.OnPageChangeListener mPagerListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0016\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0016\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0016\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0016\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0016\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0016\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0016\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0016\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0016\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\tR\u0016\u0010\u0017\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\tR\u0016\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\tR\u0016\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\tR\u0016\u0010\u001a\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\tR\u0016\u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\tR\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\tR\u0016\u0010\u001f\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\tR\u0016\u0010 \u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\tR\u0016\u0010!\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\t¨\u0006$"}, d2 = {"Lcom/huami/sleep/daysleep/daydetail/ui/SleepDetailFragment$Companion;", "", "", "userId", "key", "Lcom/huami/sleep/daysleep/daydetail/ui/SleepDetailFragment;", "newInstance", "", "AM_1", LogUtil.I, "AM_6", "BEYOND_END_VALID_INTO_TIME", "DP_POINT", "DP_REGION", "END_VALID_DP_COUNT", "END_VALID_INTO_TIME", "END_VALID_LABEL_DP_COUNT", "END_VALID_LABEL_TIME", "HALF_DP_REGION", "HALF_HOUR_MINUTES", "HOUR_MINUTES", "INTO_TIME_POINT", "SLEEP_DURATION_HOUR_GOOD", "SLEEP_DURATION_HOUR_SHORT", "SLEEP_QS_GOOD_COUNT", "START_VALID_DP_COUNT", "START_VALID_INTO_TIME", "START_VALID_LABEL_TIME", "TAG", "Ljava/lang/String;", "WAKE_SLEEP_DURATION", "WAKE_SLEEP_LESS", "WAKE_SLEEP_LIGHT", "WHOLE_DAY_MINUTES", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepDetailFragment newInstance(@NotNull String userId, @Nullable String key) {
            SleepDetailFragment sleepDetailFragment = new SleepDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key", key);
            bundle.putString("user_id", userId);
            sleepDetailFragment.setArguments(bundle);
            return sleepDetailFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "current key = " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ NullPointerException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NullPointerException nullPointerException) {
            super(0);
            this.a = nullPointerException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onHiddenChanged mCurrentIndex = " + SleepDetailFragment.this.mCurrentIndex;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepDetailFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.daysleep.daydetail.ui.SleepDetailFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mSleepHomeViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SleepHomeViewModel>() { // from class: com.huami.sleep.daysleep.daydetail.ui.SleepDetailFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.sleephome.viewmodel.SleepHomeViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SleepHomeViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SleepHomeViewModel.class), function0, objArr);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.daysleep.daydetail.ui.SleepDetailFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DaySleepDetailViewModel>() { // from class: com.huami.sleep.daysleep.daydetail.ui.SleepDetailFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DaySleepDetailViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(DaySleepDetailViewModel.class), function1, objArr3);
            }
        });
        this.mPagerListener = new ViewPager.OnPageChangeListener() { // from class: com.huami.sleep.daysleep.daydetail.ui.SleepDetailFragment$mPagerListener$1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                this.a.mCurrentIndex = position;
                this.a.getMSleepHomeViewModel().setDayCurrentIndex(position);
                this.a.b();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        try {
            String dateString = TimeShowUtilsKt.toDateString(SleepTimeUtil.INSTANCE.getTimeFromRegisterDay(this.mCurrentIndex, TimeMode.DAY));
            HMLog.debug(h, new a(dateString));
            SportDay.fromString(dateString);
            c().checkDayDatas(dateString);
            KoinExtKt.getSleepDayPageChangeListener().onMainSelected(dateString);
        } catch (NullPointerException e) {
            e.printStackTrace();
            HMLog.info(h, new b(e));
        }
    }

    private final DaySleepDetailViewModel c() {
        return (DaySleepDetailViewModel) this.mViewModel.getValue();
    }

    private final void d(View view) {
        WrapContentHeightViewPager wrapContentHeightViewPager = (WrapContentHeightViewPager) view.findViewById(R.id.viewpager);
        this.mViewPager = wrapContentHeightViewPager;
        if (wrapContentHeightViewPager == null) {
            return;
        }
        wrapContentHeightViewPager.setAdapter(this.mAdapter);
        wrapContentHeightViewPager.addOnPageChangeListener(this.mPagerListener);
        wrapContentHeightViewPager.setCurrentItem(this.mCurrentIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepHomeViewModel getMSleepHomeViewModel() {
        return (SleepHomeViewModel) this.mSleepHomeViewModel.getValue();
    }

    private final void initData() {
        String string;
        String string2;
        DaySleepDetailViewModel daySleepDetailViewModelC = c();
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("user_id")) == null) {
            string = "";
        }
        daySleepDetailViewModelC.setUserId(string);
        DaySleepDetailViewModel daySleepDetailViewModelC2 = c();
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("key")) != null) {
            str = string2;
        }
        this.mCurrentIndex = daySleepDetailViewModelC2.getIndex(str);
        this.mAdapter = new SportInfoViewPageAdapter(getChildFragmentManager(), c().getCount());
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.slp3_arrow_pos);
        this.mPosBitmap = bitmapDecodeResource;
        SportInfoViewPageAdapter sportInfoViewPageAdapter = this.mAdapter;
        if (sportInfoViewPageAdapter == null) {
            return;
        }
        sportInfoViewPageAdapter.setmPosBitmap(bitmapDecodeResource);
        sportInfoViewPageAdapter.setUserId(c().getUserId());
    }

    private final void initView() {
        b();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
        initView();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.fragment_sleep_detail, container, false);
        d(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Bitmap bitmap = this.mPosBitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.mPosBitmap.recycle();
        this.mPosBitmap = null;
    }

    @Override // androidx.fragment.app.Fragment
    @ExperimentalCoroutinesApi
    public void onHiddenChanged(boolean hidden) {
        SportInfoViewPageAdapter sportInfoViewPageAdapter;
        super.onHiddenChanged(hidden);
        HMLog.info(h, new c());
        if (hidden || !isAdded() || this.mCurrentIndex < 0) {
            return;
        }
        b();
        WrapContentHeightViewPager wrapContentHeightViewPager = this.mViewPager;
        Object objInstantiateItem = null;
        if (wrapContentHeightViewPager != null && (sportInfoViewPageAdapter = this.mAdapter) != null) {
            objInstantiateItem = sportInfoViewPageAdapter.instantiateItem((ViewGroup) wrapContentHeightViewPager, this.mCurrentIndex);
        }
        if (objInstantiateItem == null) {
            return;
        }
        DaySleepChartFragment daySleepChartFragment = (DaySleepChartFragment) objInstantiateItem;
        if (daySleepChartFragment.isVisible()) {
            daySleepChartFragment.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Analytics.event(getActivity(), SleepStatusAnalytics.EventId.SLP_POSITION_DRAG);
    }
}
