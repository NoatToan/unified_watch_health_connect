package com.huami.heartrate.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chenenyu.router.annotation.Route;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.heartrate.R;
import com.huami.heartrate.databinding.HeartRateActivityHeartRateBinding;
import com.huami.heartrate.koin.KoinExtKt;
import com.huami.heartrate.koin.ScopeKt;
import com.huami.heartrate.model.TimeIndex;
import com.huami.heartrate.model.UserOfHeartRate;
import com.huami.heartrate.ui.HeartRateActivity;
import com.huami.heartrate.utils.ExtensionUtilsKt;
import com.huami.heartrate.utils.HeartRateAnalyticsHelperKt;
import com.huami.heartrate.viewmodel.ShareHeartRateViewModel;
import com.huami.heartrate.viewmodel.UserInfoViewModel;
import com.huami.mifit.analytics.helper.ActivityTrackHelper;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.loc.z;
import com.xiaomi.hm.health.timeutil.TimeUtils;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Route({RouterHelper.HEART_RATE_PATH})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\f\u0010\n\u001a\u00020\t*\u00020\tH\u0002J\u0014\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\u000f\u001a\u00020\u0002H\u0014J\b\u0010\u0010\u001a\u00020\u0002H\u0014R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u001d\u0010-\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010,R\u001f\u00100\u001a\u0004\u0018\u00010.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b*\u0010/¨\u00064"}, d2 = {"Lcom/huami/heartrate/ui/HeartRateActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", hl.k, GoogleApiAvailabilityLight.b, "l", "", SleepAnalysisFragment.TIME_MODE, com.google.android.exoplayer2.text.ttml.b.r, "Landroidx/fragment/app/FragmentTransaction;", "e", DTransferConstants.SEARCH_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "onPause", "Lcom/huami/heartrate/databinding/HeartRateActivityHeartRateBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", z.j, "()Lcom/huami/heartrate/databinding/HeartRateActivityHeartRateBinding;", "viewBinding", "b", LogUtil.I, "timeType", "Lcom/huami/heartrate/viewmodel/ShareHeartRateViewModel;", "c", "Lkotlin/Lazy;", "h", "()Lcom/huami/heartrate/viewmodel/ShareHeartRateViewModel;", "shareViewModel", "Lcom/huami/heartrate/viewmodel/UserInfoViewModel;", GoogleApiAvailabilityLight.a, "i", "()Lcom/huami/heartrate/viewmodel/UserInfoViewModel;", "userInfoViewModel", "Landroid/util/SparseArray;", "Landroidx/fragment/app/Fragment;", "Landroid/util/SparseArray;", "fragments", "Lcom/huami/heartrate/model/UserOfHeartRate;", "f", "g", "()Lcom/huami/heartrate/model/UserOfHeartRate;", "currentUser", "Lcom/huami/mifit/analytics/helper/ActivityTrackHelper;", "()Lcom/huami/mifit/analytics/helper/ActivityTrackHelper;", "activityTrackHelper", "<init>", "()V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] h;

    @NotNull
    private static final String i = "extra_user_id";

    @NotNull
    private static final String j = "extra_user_register_time";

    @NotNull
    private static final String k = "extra_user_age";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding = ActivityViewBindingsKt.viewBinding(new HeartRateActivity$special$$inlined$viewBinding$1(new InflateViewBinder(HeartRateActivityHeartRateBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int timeType = 16;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy shareViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ShareHeartRateViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.heartrate.ui.HeartRateActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return this.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.heartrate.ui.HeartRateActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            return this.getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy userInfoViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(UserInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.heartrate.ui.HeartRateActivity$special$$inlined$viewModels$default$4
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return this.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.heartrate.ui.HeartRateActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            return this.getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SparseArray<Fragment> fragments = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy currentUser = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy activityTrackHelper = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/mifit/analytics/helper/ActivityTrackHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ActivityTrackHelper> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ActivityTrackHelper invoke() {
            return HeartRateAnalyticsHelperKt.getActivityTrackHelper();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/heartrate/model/UserOfHeartRate;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<UserOfHeartRate> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserOfHeartRate invoke() {
            String string;
            Bundle extras = HeartRateActivity.this.getIntent().getExtras();
            String str = "";
            if (extras != null && (string = extras.getString("extra_user_id")) != null) {
                str = string;
            }
            Long lValueOf = extras == null ? null : Long.valueOf(extras.getLong(HeartRateActivity.j, ExtensionUtilsKt.millsToSecond(System.currentTimeMillis())));
            return new UserOfHeartRate(str, lValueOf == null ? ExtensionUtilsKt.millsToSecond(System.currentTimeMillis()) : lValueOf.longValue(), extras != null ? extras.getInt(HeartRateActivity.k, 0) : 0);
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[5];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(HeartRateActivity.class), "viewBinding", "getViewBinding()Lcom/huami/heartrate/databinding/HeartRateActivityHeartRateBinding;"));
        h = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    private final FragmentTransaction e(FragmentTransaction fragmentTransaction) {
        SparseArray<Fragment> sparseArray = this.fragments;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.keyAt(i2);
            fragmentTransaction.add(R.id.dataContainer, sparseArray.valueAt(i2));
        }
        return fragmentTransaction;
    }

    private final ActivityTrackHelper f() {
        return (ActivityTrackHelper) this.activityTrackHelper.getValue();
    }

    private final UserOfHeartRate g() {
        return (UserOfHeartRate) this.currentUser.getValue();
    }

    private final ShareHeartRateViewModel h() {
        return (ShareHeartRateViewModel) this.shareViewModel.getValue();
    }

    private final UserInfoViewModel i() {
        return (UserInfoViewModel) this.userInfoViewModel.getValue();
    }

    private final HeartRateActivityHeartRateBinding j() {
        return (HeartRateActivityHeartRateBinding) this.viewBinding.getValue(this, h[0]);
    }

    private final void k() {
        i().getUserInfoLiveData().setValue(g());
        ScopeKt.getOrCreateHeartRateScope(g());
    }

    private final void l() {
        this.fragments.clear();
        SparseArray<Fragment> sparseArray = this.fragments;
        DateContainerFragment.Companion companion = DateContainerFragment.INSTANCE;
        sparseArray.put(16, companion.newInstance(16));
        this.fragments.put(17, companion.newInstance(17));
        this.fragments.put(18, companion.newInstance(18));
        this.fragments.put(19, companion.newInstance(19));
        q(e(getSupportFragmentManager().beginTransaction()), 16).commit();
        j().heartRateTab.tabGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: cy3
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                HeartRateActivity.m(this.a, radioGroup, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(HeartRateActivity heartRateActivity, RadioGroup radioGroup, int i2) {
        if (i2 == R.id.tab_day) {
            heartRateActivity.timeType = 16;
            heartRateActivity.p(16);
        } else if (i2 == R.id.tab_week) {
            heartRateActivity.timeType = 17;
            heartRateActivity.p(17);
        } else if (i2 == R.id.tab_month) {
            heartRateActivity.timeType = 18;
            heartRateActivity.p(18);
        } else if (i2 == R.id.tab_year) {
            heartRateActivity.timeType = 19;
            heartRateActivity.p(19);
        }
        Fragment fragment = heartRateActivity.fragments.get(heartRateActivity.timeType);
        if (fragment instanceof DateContainerFragment) {
            heartRateActivity.h().getGetShareIconStatus().setValue(new TimeIndex(heartRateActivity.timeType, ((DateContainerFragment) fragment).getCurrentItem()));
        }
    }

    private final void n() {
        String time;
        Calendar syncTime = KoinExtKt.getHeartRateDataDelegate().getSyncTime();
        if (syncTime == null) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(1);
        int i3 = calendar.get(2) + 1;
        int i4 = calendar.get(5);
        int i5 = syncTime.get(1);
        int i6 = syncTime.get(2) + 1;
        int i7 = syncTime.get(5);
        if (i5 > i2) {
            return;
        }
        if (i5 < i2) {
            time = TimeUtils.formatDateTime(getApplicationContext(), syncTime.getTime());
        } else {
            long timeInMillis = syncTime.getTimeInMillis();
            time = (i3 == i6 && i7 == i4) ? TimeUtils.formatTime(getApplicationContext(), timeInMillis) : TimeUtils.formatDate_no_y(getApplicationContext(), timeInMillis, false);
        }
        j().tvTitleBar.setSubtitle(getString(R.string.heart_rate_sync_time, new Object[]{time}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(HeartRateActivity heartRateActivity, View view) {
        heartRateActivity.finish();
    }

    private final void p(int timeMode) {
        q(getSupportFragmentManager().beginTransaction(), timeMode).commit();
    }

    private final FragmentTransaction q(FragmentTransaction fragmentTransaction, int i2) {
        SparseArray<Fragment> sparseArray = this.fragments;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            int iKeyAt = sparseArray.keyAt(i3);
            Fragment fragmentValueAt = sparseArray.valueAt(i3);
            if (iKeyAt != i2) {
                fragmentTransaction.hide(fragmentValueAt);
                fragmentTransaction.setMaxLifecycle(fragmentValueAt, Lifecycle.State.STARTED);
            } else {
                fragmentTransaction.show(fragmentValueAt);
                fragmentTransaction.setMaxLifecycle(fragmentValueAt, Lifecycle.State.RESUMED);
            }
        }
        return fragmentTransaction;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(j().getRoot());
        if (KoinExtKt.isHollywood()) {
            j().tvTitleBar.setBackgroundColor(ContextCompat.getColor(this, R.color.heart_rate_hol_activity_bg));
        }
        j().tvTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: by3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeartRateActivity.o(this.a, view);
            }
        });
        k();
        n();
        l();
        HeartRateAnalyticsHelperKt.recordEnterHeartRateActivityEvent();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ActivityTrackHelper activityTrackHelperF = f();
        if (activityTrackHelperF == null) {
            return;
        }
        activityTrackHelperF.onActivityPaused();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ActivityTrackHelper activityTrackHelperF = f();
        if (activityTrackHelperF == null) {
            return;
        }
        activityTrackHelperF.onActivityResumed();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/heartrate/ui/HeartRateActivity$Companion;", "", "", "userId", "", "registerTime", "", "userAge", "Landroid/os/Bundle;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/heartrate/model/UserOfHeartRate;", "currentUser", "", WebConstant.QueryParam.LAUNCH, "EXTRA_USER_AGE", "Ljava/lang/String;", "EXTRA_USER_ID", "EXTRA_USER_REGISTER_TIME", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Bundle a(String userId, long registerTime, int userAge) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_user_id", userId);
            bundle.putLong(HeartRateActivity.j, registerTime);
            bundle.putInt(HeartRateActivity.k, userAge);
            return bundle;
        }

        public final void launch(@NotNull Context context, @NotNull UserOfHeartRate currentUser) {
            Intent intent = new Intent(context, (Class<?>) HeartRateActivity.class);
            intent.putExtras(HeartRateActivity.INSTANCE.a(currentUser.getUserId(), currentUser.getRegisterTime(), currentUser.getUserAge()));
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }

        public final void launch(@NotNull Context context, @NotNull String userId, long registerTime, int userAge) {
            Intent intent = new Intent(context, (Class<?>) HeartRateActivity.class);
            intent.putExtras(HeartRateActivity.INSTANCE.a(userId, registerTime, userAge));
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }
}
