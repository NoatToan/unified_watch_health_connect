package com.huami.step.ui;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chenenyu.router.annotation.Route;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.hmchartui.ui.CommonTabActivity;
import com.huami.hmchartui.ui.CommonTabFragment;
import com.huami.hmchartui.utils.Constant;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.analytics.helper.ActivityTrackHelper;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.step.R;
import com.huami.step.koin.KoinExtKt;
import com.huami.step.koin.StepHollywoodApi;
import com.huami.step.model.TimeIndex;
import com.huami.step.ui.StepInfoActivity;
import com.huami.step.utils.ExtensionUtilsKt;
import com.huami.step.viewmodel.ShareStepViewModel;
import com.huami.step.viewmodel.StepStageViewModel;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.analytics.internal.utils.Const;
import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes14.dex */
@Route({RouterHelper.STEP_PATH})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0016R\u001d\u0010\u0018\u001a\u00020\u00138F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u001d\u0010'\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/huami/step/ui/StepInfoActivity;", "Lcom/huami/hmchartui/ui/CommonTabActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "", "getTitleText", "", "type", "onActionClick", "timeType", "Lcom/huami/hmchartui/ui/CommonTabFragment;", "createTabFragment", "Landroidx/fragment/app/Fragment;", "createNoSlideFragment", "onTabSelectChanged", "", "b", "Lkotlin/Lazy;", "getUserId", "()Ljava/lang/String;", "userId", "Lcom/huami/mifit/analytics/helper/ActivityTrackHelper;", "c", GoogleApiAvailabilityLight.b, "()Lcom/huami/mifit/analytics/helper/ActivityTrackHelper;", "activityTrackHelper", "Lcom/huami/step/viewmodel/ShareStepViewModel;", GoogleApiAvailabilityLight.a, "o", "()Lcom/huami/step/viewmodel/ShareStepViewModel;", "shareViewModel", "Lcom/huami/step/viewmodel/StepStageViewModel;", "e", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/step/viewmodel/StepStageViewModel;", "stageViewModel", "f", LogUtil.I, "mTimeType", "<init>", "()V", "Companion", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepInfoActivity extends CommonTabActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String g = "keyFrom";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy activityTrackHelper = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy shareViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy stageViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int mTimeType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R\u001c\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/huami/step/ui/StepInfoActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "userId", "", "from", "Landroid/content/Intent;", "launchStepDetail", "keyFrom", "Ljava/lang/String;", "getKeyFrom", "()Ljava/lang/String;", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Intent launchStepDetail$default(Companion companion, Context context, String str, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return companion.launchStepDetail(context, str, i);
        }

        @NotNull
        public final String getKeyFrom() {
            return StepInfoActivity.g;
        }

        @NotNull
        public final Intent launchStepDetail(@NotNull Context context, @NotNull String userId, int from) {
            Intent intent = new Intent(context, (Class<?>) StepInfoActivity.class);
            intent.putExtra(StepInfoActivity.INSTANCE.getKeyFrom(), from);
            intent.putExtra(Constant.USER_ID, userId);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/mifit/analytics/helper/ActivityTrackHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ActivityTrackHelper> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.step.ui.StepInfoActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0606a extends Lambda implements Function1<Long, Unit> {
            public static final C0606a a = new C0606a();

            public C0606a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(l.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                Analytics.recordEvent(new CalculationEventBuilder("PAGEDURATION", j).addExtra(Const.PARAM_ACTIVITY_NAME, "HEALTH_STEP"));
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ActivityTrackHelper invoke() {
            return new ActivityTrackHelper(C0606a.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            String stringExtra = StepInfoActivity.this.getIntent().getStringExtra(Constant.USER_ID);
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StepInfoActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.step.ui.StepInfoActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.shareViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ShareStepViewModel>() { // from class: com.huami.step.ui.StepInfoActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.step.viewmodel.ShareStepViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ShareStepViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(ShareStepViewModel.class), function0, objArr);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.step.ui.StepInfoActivity$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.stageViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<StepStageViewModel>() { // from class: com.huami.step.ui.StepInfoActivity$special$$inlined$viewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.step.viewmodel.StepStageViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final StepStageViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(StepStageViewModel.class), function1, objArr3);
            }
        });
        this.mTimeType = 16;
    }

    private final ActivityTrackHelper n() {
        return (ActivityTrackHelper) this.activityTrackHelper.getValue();
    }

    private final ShareStepViewModel o() {
        return (ShareStepViewModel) this.shareViewModel.getValue();
    }

    private final StepStageViewModel p() {
        return (StepStageViewModel) this.stageViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(StepInfoActivity stepInfoActivity, Integer num) {
        if (num != null && num.intValue() == 0) {
            stepInfoActivity.setMenuIcon(R.drawable.ic_share_20);
        } else {
            stepInfoActivity.setMenuIcon(0);
        }
    }

    @Override // com.huami.hmchartui.ui.CommonTabActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.hmchartui.ui.CommonTabActivity
    @Nullable
    public Fragment createNoSlideFragment() {
        return StepNoSlideFragment.INSTANCE.newInstance(getUserId());
    }

    @Override // com.huami.hmchartui.ui.CommonTabActivity
    @NotNull
    public CommonTabFragment createTabFragment(int timeType) {
        return StepTimeFragment.INSTANCE.newInstance(getUserId(), timeType);
    }

    @Override // com.huami.hmchartui.ui.CommonTabActivity
    @NotNull
    public CharSequence getTitleText() {
        return getString(R.string.step_text_title);
    }

    @NotNull
    public final String getUserId() {
        return (String) this.userId.getValue();
    }

    @Override // com.huami.hmchartui.ui.CommonTabActivity
    public void onActionClick(int type) {
        if (type == 0) {
            Fragment fragment = getFragments().get(this.mTimeType);
            if (fragment instanceof StepTimeFragment) {
                o().getShareClick().setValue(new TimeIndex(this.mTimeType, ((StepTimeFragment) fragment).getCurrentItem()));
            }
        }
    }

    @Override // com.huami.hmchartui.ui.CommonTabActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App);
        super.onCreate(savedInstanceState);
        if (getIntent().getIntExtra(g, 0) == 16) {
            Analytics.event(this, StatEvent.EventId.MINE_PERFORMANCE_NOTIFICATION_CLICKNUM);
        }
        ExtensionUtilsKt.identifiedEvent(new CountEventBuilder("HEALTH_STEP_V"));
        if (KoinExtKt.getHollywoodApi() == null) {
            o().getShareIconVisible().observe(this, new Observer() { // from class: pg7
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    StepInfoActivity.q(this.a, (Integer) obj);
                }
            });
            return;
        }
        StepHollywoodApi hollywoodApi = KoinExtKt.getHollywoodApi();
        if (hollywoodApi == null) {
            return;
        }
        hollywoodApi.getChildStepData(getUserId());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        n().onActivityPaused();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        n().onActivityResumed();
    }

    @Override // com.huami.hmchartui.ui.CommonTabActivity
    public void onTabSelectChanged(int timeType) {
        switch (timeType) {
            case 16:
                this.mTimeType = 16;
                ExtensionUtilsKt.identifiedEvent(new CountEventBuilder("HEALTH_STEP_DAY_C"));
                break;
            case 17:
                this.mTimeType = 17;
                ExtensionUtilsKt.identifiedEvent(new CountEventBuilder("HEALTH_STEP_WEEK_C"));
                break;
            case 18:
                this.mTimeType = 18;
                ExtensionUtilsKt.identifiedEvent(new CountEventBuilder("HEALTH_STEP_MONTH_C"));
                break;
            case 19:
                this.mTimeType = 19;
                ExtensionUtilsKt.identifiedEvent(new CountEventBuilder("HEALTH_STEP_YEAR_C"));
                break;
        }
        Fragment fragment = getFragments().get(this.mTimeType);
        if (fragment instanceof StepTimeFragment) {
            StepTimeFragment stepTimeFragment = (StepTimeFragment) fragment;
            o().getGetShareIconStatus().setValue(new TimeIndex(this.mTimeType, stepTimeFragment.getCurrentItem()));
            p().getStageStatus().setValue(new TimeIndex(this.mTimeType, stepTimeFragment.getCurrentItem()));
        }
    }
}
