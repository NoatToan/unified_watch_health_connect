package com.xiaomi.fitness.health.threetarget;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.base.BasicDataFragment;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.health.threetarget.SportTargetFragment;
import com.xiaomi.fitness.health.threetarget.viewmodel.DataRegularTargetViewModel;
import com.xiaomi.fitness.login.NeedLoginAspect;
import com.xiaomi.fitness.login.annotation.NeedLogin;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.statistics.OneTrackReportAspect;
import com.xiaomi.fitness.statistics.export.annotation.OneTrackReport;
import com.xiaomi.fitness.user.info.export.GoalPageManager;
import com.xiaomi.fitness.user.info.export.GoalPageManagerExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import com.xiaomi.fitness.util.HealthBundleKey;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.a4i;
import defpackage.c0j;
import defpackage.eri;
import defpackage.fai;
import defpackage.jui;
import defpackage.nrd;
import defpackage.nwi;
import defpackage.s69;
import defpackage.t4o;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0014J\u0006\u0010\u0013\u001a\u00020\fJ\u0014\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\bH\u0014J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000eH\u0002J\b\u0010\u001f\u001a\u00020\fH\u0003J\b\u0010 \u001a\u00020\fH\u0002J\b\u0010!\u001a\u00020\fH\u0015J\b\u0010\"\u001a\u00020\fH\u0016J\u0010\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\bH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00158TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/SportTargetFragment;", "Lcom/xiaomi/fitness/base/BasicDataFragment;", "Lcom/xiaomi/fitness/health/threetarget/BaseTargetChartFragment;", "<init>", "()V", "mRegularTargetViewModel", "Lcom/xiaomi/fitness/health/threetarget/viewmodel/DataRegularTargetViewModel;", "contentResourceId", "", "getContentResourceId", "()I", "initContentView", "", "contentView", "Landroid/view/View;", "expandBundle", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "setTabType", "setListener", "className", "", "getClassName", "()Ljava/lang/String;", "getClassChild", "Ljava/lang/Class;", "position", "getClassChildName", "onImgShareClick", "view", "showPopupMenu", "goTargetManager", "goTargetGuideManager", "onInvisible", "onShowCalendar", "showImgMore", "visibility", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportTargetFragment extends BasicDataFragment<BaseTargetChartFragment> {
    private static /* synthetic */ Annotation ajc$anno$0;
    private static /* synthetic */ Annotation ajc$anno$1;
    private static /* synthetic */ nrd.a ajc$tjp_0;
    private static /* synthetic */ nrd.a ajc$tjp_1;

    @Nullable
    private DataRegularTargetViewModel mRegularTargetViewModel;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        s69 s69Var = new s69("SportTargetFragment.kt", SportTargetFragment.class);
        ajc$tjp_0 = s69Var.h("method-execution", s69Var.g("12", "goTargetManager", "com.xiaomi.fitness.health.threetarget.SportTargetFragment", "", "", "", "void"), 103);
        ajc$tjp_1 = s69Var.h("method-execution", s69Var.g("4", "onInvisible", "com.xiaomi.fitness.health.threetarget.SportTargetFragment", "", "", "", "void"), 0);
    }

    private final void goTargetGuideManager() {
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getTargetDataUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), getString(c0j.cm), false, false, null, false, null, false, 252, null);
    }

    @NeedLogin
    private final void goTargetManager() throws Throwable {
        nrd nrdVarB = s69.b(ajc$tjp_0, this, this);
        NeedLoginAspect needLoginAspectAspectOf = NeedLoginAspect.aspectOf();
        fai faiVarC = new t4o(new Object[]{this, nrdVarB}).c(69648);
        Annotation annotation = ajc$anno$0;
        if (annotation == null) {
            annotation = SportTargetFragment.class.getDeclaredMethod("goTargetManager", new Class[0]).getAnnotation(NeedLogin.class);
            ajc$anno$0 = annotation;
        }
        needLoginAspectAspectOf.aroundNeedLogin(faiVarC, (NeedLogin) annotation);
    }

    public static final /* synthetic */ void goTargetManager_aroundBody0(SportTargetFragment sportTargetFragment, nrd nrdVar) {
        SetPageManager setPageManageExtKt = SetPageManageExtKt.getInstance(SetPageManager.INSTANCE);
        FragmentActivity mActivity = sportTargetFragment.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        setPageManageExtKt.startGoalManagerActivity(mActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initContentView$lambda$0(SportTargetFragment this$0, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.bindTitleBarAlphaView(localDate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showImgMore$lambda$2(SportTargetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.48.0.1.31237"), "name", "activity_page_share_btn");
        Intent intent = new Intent(this$0.getMActivity(), (Class<?>) ShareSportTargetActivity.class);
        intent.putExtra(ShareSportTargetActivity.sDate, this$0.getCurrentLocalDate());
        this$0.startActivity(intent);
    }

    private final void showPopupMenu(View view) {
        a4i a4iVar = new a4i(requireContext(), view);
        a4iVar.f(nwi.n);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: q4o
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return SportTargetFragment.showPopupMenu$lambda$1(this.f31101a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPopupMenu$lambda$1(SportTargetFragment this$0, MenuItem menuItem) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == eri.si) {
            this$0.goTargetManager();
            return true;
        }
        if (itemId != eri.qi) {
            return true;
        }
        this$0.goTargetGuideManager();
        return true;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void expandBundle(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.putBoolean(HealthBundleKey.BUNDLE_PARAMS_CALENDAR_THREE_CIRCLE_FLAG, true);
        bundle.putBoolean("switch_day_week_month", false);
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    @NotNull
    public Class<?> getClassChild(int position) {
        return TargetChartFragment.class;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    @Nullable
    public String getClassChildName(int position) {
        return "TargetChartFragment";
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    @NotNull
    public String getClassName() {
        String name = SportTargetFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public int getContentResourceId() {
        return jui.q;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void initContentView(@Nullable View contentView) {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            GoalPageManagerExtKt.getInstance(GoalPageManager.INSTANCE).goFirstGuidPageFromRaindow(null);
        }
        Logger.d(BaseFragment.TAG, "initContentView");
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        DataRegularTargetViewModel dataRegularTargetViewModel = (DataRegularTargetViewModel) new ViewModelProvider(mActivity).get(DataRegularTargetViewModel.class);
        this.mRegularTargetViewModel = dataRegularTargetViewModel;
        Intrinsics.checkNotNull(dataRegularTargetViewModel);
        MutableLiveData<LocalDate> currentSelectedDate = dataRegularTargetViewModel.getCurrentSelectedDate();
        FragmentActivity mActivity2 = getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        currentSelectedDate.observe(mActivity2, new SportTargetFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: s4o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportTargetFragment.initContentView$lambda$0(this.f33294a, (LocalDate) obj);
            }
        }));
        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).getUserInfoFromWeb();
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment, com.xiaomi.fitness.base.BaseDataFragment.a
    public /* bridge */ /* synthetic */ void onDateChanged(LocalDate localDate) {
        super.onDateChanged(localDate);
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment, com.xiaomi.fitness.base.BaseDataFragment.a
    public /* bridge */ /* synthetic */ void onDeviceListChanged(List list) {
        super.onDeviceListChanged(list);
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment, defpackage.eah
    public void onImgShareClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        showPopupMenu(view);
        view.setContentDescription(getString(c0j.V9));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    @OneTrackReport(args = {"name", "activity_detail_page", "title", "活力指标"}, tip = "56.4.5.1.21797")
    public void onInvisible() throws Throwable {
        OneTrackReportAspect oneTrackReportAspectAspectOf;
        Annotation annotation;
        nrd nrdVarB = s69.b(ajc$tjp_1, this, this);
        try {
            super.onInvisible();
            oneTrackReportAspectAspectOf = OneTrackReportAspect.aspectOf();
            Annotation annotation2 = ajc$anno$1;
            if (annotation2 == null) {
                Method declaredMethod = SportTargetFragment.class.getDeclaredMethod("onInvisible", new Class[0]);
            }
        } finally {
            oneTrackReportAspectAspectOf = OneTrackReportAspect.aspectOf();
            annotation = ajc$anno$1;
            if (annotation == null) {
                annotation = SportTargetFragment.class.getDeclaredMethod("onInvisible", new Class[0]).getAnnotation(OneTrackReport.class);
                ajc$anno$1 = annotation;
            }
            oneTrackReportAspectAspectOf.oneTrackReportPageView(nrdVarB, (OneTrackReport) annotation);
        }
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment, defpackage.eah
    public void onShowCalendar() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tip", "56.48.1.1.31238");
        linkedHashMap.put("name", "activity_page_dateSwitch");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.toMap(linkedHashMap));
        super.onShowCalendar();
    }

    public final void setListener() {
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void setTabType() {
        setTabType(2);
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void showImgMore(int visibility) {
        ConfigPreference configPreference = ConfigPreference.INSTANCE;
        Logger.i("SportTargetFragment", "showImgMore " + configPreference.getIS_SPORT_TARGET_SHARE_SHOW());
        if (configPreference.getIS_SPORT_TARGET_SHARE_SHOW()) {
            TitleBarAlphaView titleBarAlphaView = getTitleBarAlphaView();
            if (titleBarAlphaView != null) {
                titleBarAlphaView.setRealShareBtnVisible(0);
            }
        } else {
            TitleBarAlphaView titleBarAlphaView2 = getTitleBarAlphaView();
            if (titleBarAlphaView2 != null) {
                titleBarAlphaView2.setRealShareBtnVisible(8);
            }
        }
        TitleBarAlphaView titleBarAlphaView3 = getTitleBarAlphaView();
        if (titleBarAlphaView3 != null) {
            titleBarAlphaView3.setRealShareBtnClick(new View.OnClickListener() { // from class: r4o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportTargetFragment.showImgMore$lambda$2(this.f32187a, view);
                }
            }, false);
        }
    }
}
