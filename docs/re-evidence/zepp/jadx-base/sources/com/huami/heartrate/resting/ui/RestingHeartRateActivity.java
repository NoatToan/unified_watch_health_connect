package com.huami.heartrate.resting.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.heartrate.R;
import com.huami.heartrate.databinding.HeartRateActivityRestingBinding;
import com.huami.heartrate.resting.ui.RestingHeartRateActivity;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.huami.mifit.analytics.Analytics;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import java.util.Locale;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0002$\u000eB\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\u000b\u001a\u00020\u0002H\u0014J\b\u0010\f\u001a\u00020\u0002H\u0014R\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001c\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001e\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 ¨\u0006%"}, d2 = {"Lcom/huami/heartrate/resting/ui/RestingHeartRateActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "i", hl.k, "", "position", GoogleApiAvailabilityLight.a, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStart", "onDestroy", "Lcom/huami/heartrate/databinding/HeartRateActivityRestingBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "h", "()Lcom/huami/heartrate/databinding/HeartRateActivityRestingBinding;", "viewBinding", "", "b", "Lkotlin/Lazy;", "f", "()Ljava/lang/String;", "extraUserId", "c", "e", "()I", "extraUserAge", "g", "selectedPosition", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "mOnPageChangeListener", "<init>", "()V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class RestingHeartRateActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] f;

    @NotNull
    private static final String g = "EXTRA_USER_ID";

    @NotNull
    private static final String h = "EXTRA_USER_AGE";

    @NotNull
    private static final String i = "EXTRA_SELECTED_DATE";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding = ActivityViewBindingsKt.viewBinding(new RestingHeartRateActivity$special$$inlined$viewBinding$1(new InflateViewBinder(HeartRateActivityRestingBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy extraUserId = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy extraUserAge = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy selectedPosition = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ViewPager.OnPageChangeListener mOnPageChangeListener = new ViewPager.SimpleOnPageChangeListener() { // from class: com.huami.heartrate.resting.ui.RestingHeartRateActivity$mOnPageChangeListener$1
        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            this.a.k();
            this.a.d(position);
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/huami/heartrate/resting/ui/RestingHeartRateActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "userId", "", "userAge", "", "selectedDateTimeInMillis", "", WebConstant.QueryParam.LAUNCH, RestingHeartRateActivity.i, "Ljava/lang/String;", RestingHeartRateActivity.h, RestingHeartRateActivity.g, "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, @NotNull String userId, int userAge, long selectedDateTimeInMillis) {
            Intent intent = new Intent(context, (Class<?>) RestingHeartRateActivity.class);
            intent.putExtra(RestingHeartRateActivity.g, userId);
            intent.putExtra(RestingHeartRateActivity.h, userAge);
            intent.putExtra(RestingHeartRateActivity.i, selectedDateTimeInMillis);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"com/huami/heartrate/resting/ui/RestingHeartRateActivity$a", "Landroidx/fragment/app/FragmentPagerAdapter;", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "getCount", "a", LogUtil.I, "pageCount", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Lcom/huami/heartrate/resting/ui/RestingHeartRateActivity;Landroidx/fragment/app/FragmentManager;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
    public final class a extends FragmentPagerAdapter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int pageCount;

        public a(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.pageCount = HrRestingChartFragment.getMonthCount();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount, reason: from getter */
        public int getPageCount() {
            return this.pageCount;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NotNull
        public Fragment getItem(int position) {
            return HrRestingChartFragment.newInstance(position, RestingHeartRateActivity.this.f(), RestingHeartRateActivity.this.e());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return RestingHeartRateActivity.this.getIntent().getIntExtra(RestingHeartRateActivity.h, 0);
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
            return RestingHeartRateActivity.this.getIntent().getStringExtra(RestingHeartRateActivity.g);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Integer> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return HrRestingChartFragment.getDatePosition(RestingHeartRateActivity.this.getIntent().getLongExtra(RestingHeartRateActivity.i, System.currentTimeMillis()));
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[4];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(RestingHeartRateActivity.class), "viewBinding", "getViewBinding()Lcom/huami/heartrate/databinding/HeartRateActivityRestingBinding;"));
        f = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int position) {
        PagerAdapter adapter = h().viewPager.getAdapter();
        if (position < (adapter == null ? 0 : adapter.getPageCount()) - 1) {
            Analytics.event(this, "Chart_ViewMonthAgoRestingHeart");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int e() {
        return ((Number) this.extraUserAge.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String f() {
        return (String) this.extraUserId.getValue();
    }

    private final int g() {
        return ((Number) this.selectedPosition.getValue()).intValue();
    }

    private final HeartRateActivityRestingBinding h() {
        return (HeartRateActivityRestingBinding) this.viewBinding.getValue(this, f[0]);
    }

    private final void i() {
        a aVar = new a(getSupportFragmentManager());
        ViewPager viewPager = h().viewPager;
        viewPager.setAdapter(aVar);
        viewPager.setCurrentItem(g());
        viewPager.addOnPageChangeListener(this.mOnPageChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(RestingHeartRateActivity restingHeartRateActivity, View view) {
        restingHeartRateActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        h().tvTitleBar.setTitle(getString(R.string.heart_rate_rest_format, new Object[]{HMDataFormatKt.getFormatTime$default(HrRestingChartFragment.getSelectedMonthCalendar(h().viewPager.getCurrentItem()).getTime(), HMPattern.YEAR_ABBR_MONTH, (Locale) null, 2, (Object) null)}));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(h().getRoot());
        h().tvTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: ie6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RestingHeartRateActivity.j(this.a, view);
            }
        });
        i();
        k();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        h().viewPager.removeOnPageChangeListener(this.mOnPageChangeListener);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        Analytics.event(this, "Chart_RestingHeart");
    }
}
