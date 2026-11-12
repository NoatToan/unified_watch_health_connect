package com.huami.bloodoxygen.ui.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import com.amap.api.mapcore.util.hl;
import com.chenenyu.router.annotation.Route;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.ViewUtils;
import com.huami.bloodoxygen.core.koin.BloodOxygenKoinScopeKt;
import com.huami.bloodoxygen.ui.R;
import com.huami.bloodoxygen.ui.activity.AddClickSpo2ManuallyActivity;
import com.huami.bloodoxygen.ui.base.BloodOxygenDetailActivity;
import com.huami.bloodoxygen.ui.business.BloodOxygenDayHomeFragment;
import com.huami.bloodoxygen.ui.business.BloodOxygenMonthHomeFragment;
import com.huami.bloodoxygen.ui.business.BloodOxygenWeekHomeFragment;
import com.huami.bloodoxygen.ui.business.BloodOxygenYearHomeFragment;
import com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel;
import com.huami.bloodoxygen.ui.databinding.BoUiActivityDetailBinding;
import com.huami.bloodoxygen.ui.databinding.BoUiTabSelectorBinding;
import com.huami.bloodoxygen.ui.dto.TimeMode;
import com.huami.bloodoxygen.ui.vo.DetailUIConfig;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
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
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;

/* JADX INFO: loaded from: classes5.dex */
@Route({RouterHelper.SPO2_PATH})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002J\u0014\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\"\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/huami/bloodoxygen/ui/base/BloodOxygenDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "i", "h", "l", "Landroidx/fragment/app/FragmentTransaction;", "e", "Lcom/huami/bloodoxygen/ui/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, GoogleApiAvailabilityLight.b, hl.k, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lcom/huami/bloodoxygen/ui/databinding/BoUiActivityDetailBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "g", "()Lcom/huami/bloodoxygen/ui/databinding/BoUiActivityDetailBinding;", "viewBinding", "Landroid/util/SparseArray;", "Lcom/huami/bloodoxygen/ui/base/HomeBaseFragment;", "b", "Landroid/util/SparseArray;", "fragments", "Lcom/huami/bloodoxygen/ui/vo/DetailUIConfig;", "c", "Lkotlin/Lazy;", "f", "()Lcom/huami/bloodoxygen/ui/vo/DetailUIConfig;", "uiConfig", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodOxygenDetailActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding = ActivityViewBindingsKt.viewBinding(new BloodOxygenDetailActivity$special$$inlined$viewBinding$1(new InflateViewBinder(BoUiActivityDetailBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SparseArray<HomeBaseFragment> fragments = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy uiConfig = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bloodoxygen/ui/base/BloodOxygenDetailActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", WebConstant.QueryParam.LAUNCH, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) BloodOxygenDetailActivity.class));
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
            ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
            BloodOxygenDetailActivity bloodOxygenDetailActivity = BloodOxygenDetailActivity.this;
            return companion.from(bloodOxygenDetailActivity, bloodOxygenDetailActivity);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodoxygen/ui/vo/DetailUIConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<DetailUIConfig> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DetailUIConfig invoke() {
            return (DetailUIConfig) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(DetailUIConfig.class), null, null);
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BloodOxygenDetailActivity.class), "viewBinding", "getViewBinding()Lcom/huami/bloodoxygen/ui/databinding/BoUiActivityDetailBinding;"));
        d = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    private final FragmentTransaction e(FragmentTransaction fragmentTransaction) {
        SparseArray<HomeBaseFragment> sparseArray = this.fragments;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            fragmentTransaction.add(R.id.content_container, sparseArray.valueAt(i));
        }
        return fragmentTransaction;
    }

    private final DetailUIConfig f() {
        return (DetailUIConfig) this.uiConfig.getValue();
    }

    private final BoUiActivityDetailBinding g() {
        return (BoUiActivityDetailBinding) this.viewBinding.getValue(this, d[0]);
    }

    private final void h() {
        SparseArray<HomeBaseFragment> sparseArray = this.fragments;
        TimeMode timeMode = TimeMode.DAY;
        sparseArray.put(timeMode.ordinal(), new BloodOxygenDayHomeFragment());
        this.fragments.put(TimeMode.WEEK.ordinal(), new BloodOxygenWeekHomeFragment());
        this.fragments.put(TimeMode.MONTH.ordinal(), new BloodOxygenMonthHomeFragment());
        this.fragments.put(TimeMode.YEAR.ordinal(), new BloodOxygenYearHomeFragment());
        n(e(getSupportFragmentManager().beginTransaction()), timeMode).commit();
    }

    @SuppressLint({"RestrictedApi"})
    private final void i() {
        g().titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: wy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodOxygenDetailActivity.j(this.a, view);
            }
        });
        int mifitThemeColor = f().isMifitStyle() ? f().getMifitThemeColor() : ContextCompat.getColor(this, R.color.s1);
        float fDp2px = ViewUtils.dp2px(this, 23.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(fDp2px);
        gradientDrawable.setColor(mifitThemeColor);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadii(new float[]{fDp2px, fDp2px, 0.0f, 0.0f, 0.0f, 0.0f, fDp2px, fDp2px});
        gradientDrawable2.setColor(0);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(fDp2px);
        gradientDrawable3.setColor(mifitThemeColor);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setShape(0);
        gradientDrawable4.setColor(0);
        GradientDrawable gradientDrawable5 = new GradientDrawable();
        gradientDrawable5.setShape(0);
        gradientDrawable5.setCornerRadius(fDp2px);
        gradientDrawable5.setColor(mifitThemeColor);
        GradientDrawable gradientDrawable6 = new GradientDrawable();
        gradientDrawable6.setShape(0);
        gradientDrawable6.setCornerRadii(new float[]{0.0f, 0.0f, fDp2px, fDp2px, fDp2px, fDp2px, 0.0f, 0.0f});
        gradientDrawable6.setColor(0);
        BoUiTabSelectorBinding boUiTabSelectorBinding = g().uiTabSelector;
        RadioButton radioButton = boUiTabSelectorBinding.tabDay;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, gradientDrawable);
        stateListDrawable.addState(new int[]{-16842912}, gradientDrawable2);
        Unit unit = Unit.INSTANCE;
        radioButton.setBackground(stateListDrawable);
        RadioButton radioButton2 = boUiTabSelectorBinding.tabWeek;
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(new int[]{android.R.attr.state_checked}, gradientDrawable3);
        stateListDrawable2.addState(new int[]{-16842912}, gradientDrawable4);
        radioButton2.setBackground(stateListDrawable2);
        RadioButton radioButton3 = boUiTabSelectorBinding.tabMonth;
        StateListDrawable stateListDrawable3 = new StateListDrawable();
        stateListDrawable3.addState(new int[]{android.R.attr.state_checked}, gradientDrawable3);
        stateListDrawable3.addState(new int[]{-16842912}, gradientDrawable4);
        radioButton3.setBackground(stateListDrawable3);
        RadioButton radioButton4 = boUiTabSelectorBinding.tabYear;
        StateListDrawable stateListDrawable4 = new StateListDrawable();
        stateListDrawable4.addState(new int[]{android.R.attr.state_checked}, gradientDrawable5);
        stateListDrawable4.addState(new int[]{-16842912}, gradientDrawable6);
        radioButton4.setBackground(stateListDrawable4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(BloodOxygenDetailActivity bloodOxygenDetailActivity, View view) {
        bloodOxygenDetailActivity.finish();
    }

    private final void k(TimeMode timeMode) {
        n(getSupportFragmentManager().beginTransaction(), timeMode).commit();
    }

    private final void l() {
        g().uiTabSelector.tabGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: xy
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                BloodOxygenDetailActivity.m(this.a, radioGroup, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(BloodOxygenDetailActivity bloodOxygenDetailActivity, RadioGroup radioGroup, int i) {
        if (i == R.id.tab_day) {
            bloodOxygenDetailActivity.k(TimeMode.DAY);
            return;
        }
        if (i == R.id.tab_week) {
            bloodOxygenDetailActivity.k(TimeMode.WEEK);
        } else if (i == R.id.tab_month) {
            bloodOxygenDetailActivity.k(TimeMode.MONTH);
        } else if (i == R.id.tab_year) {
            bloodOxygenDetailActivity.k(TimeMode.YEAR);
        }
    }

    private final FragmentTransaction n(FragmentTransaction fragmentTransaction, TimeMode timeMode) {
        SparseArray<HomeBaseFragment> sparseArray = this.fragments;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            HomeBaseFragment homeBaseFragmentValueAt = sparseArray.valueAt(i);
            if (iKeyAt != timeMode.ordinal()) {
                fragmentTransaction.hide(homeBaseFragmentValueAt);
            } else {
                fragmentTransaction.show(homeBaseFragmentValueAt);
            }
        }
        return fragmentTransaction;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == 100 && data != null) {
            long jLongValue = Long.valueOf(data.getLongExtra(AddClickSpo2ManuallyActivity.REQUEST_RESULT, -1L)).longValue();
            if (jLongValue <= 0) {
                return;
            }
            ((BloodOxygenDetailActivitySharedDataViewModel) ScopeExtKt.getViewModel$default(BloodOxygenKoinScopeKt.getBloodOxygenKoinScope(), null, new a(), Reflection.getOrCreateKotlinClass(BloodOxygenDetailActivitySharedDataViewModel.class), null, null, 8, null)).updateTimestampToPagePosition(jLongValue);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(g().getRoot());
        i();
        h();
        l();
    }
}
