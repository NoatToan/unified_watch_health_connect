package com.xiaomi.hm.health.running.calori;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.os.BundleKt;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p010navigation.Activity;
import com.chenenyu.router.annotation.Route;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.healthlabel.utils.UtilsKt;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.running.EnergyItemFragment;
import com.xiaomi.hm.health.running.calori.CaloriActivity;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Route({RouterHelper.CALORIES_PATH})
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/running/calori/CaloriActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/xiaomi/hm/health/running/EnergyItemFragment$TimeCallback;", "", "o", b.r, "initTitle", "", "type", "m", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "", "start", "setStartTime", "getStartTime", "Lcom/xiaomi/hm/health/running/calori/CaloriViewModel;", "x", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.b, "()Lcom/xiaomi/hm/health/running/calori/CaloriViewModel;", "mViewModel", "y", "J", "startTime", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CaloriActivity extends BaseTitleActivity implements EnergyItemFragment.TimeCallback {

    @NotNull
    public static final String ARG_END_TIME = "endTime";

    @NotNull
    public static final String ARG_FILTER_TYPE = "filterType";

    @NotNull
    public static final String ARG_LAST_PAGE = "lastPage";

    @NotNull
    public static final String ARG_START_TIME = "startTime";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float z = 16.0f;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(CaloriViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.running.calori.CaloriActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.running.calori.CaloriActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return this.getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private long startTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/running/calori/CaloriActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "start", "", "ARG_END_TIME", "Ljava/lang/String;", "ARG_FILTER_TYPE", "ARG_LAST_PAGE", "ARG_START_TIME", "", "titleTextSize", "F", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) CaloriActivity.class));
        }
    }

    private final void initTitle() {
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.s38), getString(R.string.health_data_calories), !UtilsKt.isDarkMode(this));
        getTitleTextView().setTextColor(ContextCompat.getColor(this, R.color.s1));
        getTitleTextView().setTextSize(16.0f);
        getTitleTextView().setTypeface(Typeface.DEFAULT_BOLD);
        getTitleTextView().setPadding(0, 0, 5, 0);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.ic_arrow_back_20_2x);
        if (drawable != null) {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(this, R.color.s1));
            getLeft().setImageDrawable(drawable);
        }
        getRightTitle().setVisibility(8);
    }

    private final void m(String type) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(StatEvent.SPORT_HEAT_C);
        countEventBuilder.addExtra("tp", type);
        Analytics.recordEvent(countEventBuilder);
    }

    private final CaloriViewModel n() {
        return (CaloriViewModel) this.mViewModel.getValue();
    }

    private final void o() {
        getWindow().setBackgroundDrawable(null);
        ((FrameLayout) findViewById(R.id.common_title_content_parent)).setBackgroundResource(R.color.s10);
    }

    private final void p() {
        findViewById(R.id.tab_year).setVisibility(8);
        ((RadioGroup) findViewById(R.id.tab_group)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: zh0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                CaloriActivity.q(this.a, radioGroup, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(CaloriActivity caloriActivity, RadioGroup radioGroup, int i) {
        if (i == R.id.tab_day) {
            caloriActivity.m("day");
            Activity.findNavController(caloriActivity, R.id.nav_host).navigate(R.id.bt_day_fragment, BundleKt.bundleOf(TuplesKt.to(ARG_FILTER_TYPE, SportFilterType.DAY)));
        } else if (i == R.id.tab_month) {
            caloriActivity.m("month");
            Activity.findNavController(caloriActivity, R.id.nav_host).navigate(R.id.bt_month_fragment, BundleKt.bundleOf(TuplesKt.to(ARG_FILTER_TYPE, SportFilterType.MONTH)));
        } else {
            if (i != R.id.tab_week) {
                return;
            }
            caloriActivity.m("week");
            Activity.findNavController(caloriActivity, R.id.nav_host).navigate(R.id.bt_week_fragment, BundleKt.bundleOf(TuplesKt.to(ARG_FILTER_TYPE, SportFilterType.WEEK)));
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.running.EnergyItemFragment.TimeCallback
    public long getStartTime() {
        return this.startTime;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caroli);
        initTitle();
        o();
        p();
        n().calculateRestCal(System.currentTimeMillis());
    }

    @Override // com.xiaomi.hm.health.running.EnergyItemFragment.TimeCallback
    public void setStartTime(long start) {
        this.startTime = start;
    }
}
