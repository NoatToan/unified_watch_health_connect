package com.xiaomi.fitness.health.threetarget;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.baseui.calendar.view.DayThreeCircleFiveLineCalendarView;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.calendar.MonthReportModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.data.bean.GoalMonthlyStatisticsData;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.threetarget.ShareSportTagetMonthFragment;
import com.xiaomi.fitness.health.threetarget.viewmodel.ShareSportTagetViewModel;
import com.xiaomi.fitness.util.TargetUtil;
import defpackage.c0j;
import defpackage.cdp;
import defpackage.eri;
import defpackage.fvb;
import defpackage.jui;
import defpackage.qxi;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/ShareSportTagetMonthFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/threetarget/viewmodel/ShareSportTagetViewModel;", "Lfvb;", "Landroid/os/Bundle;", "args", "", "setArguments", "(Landroid/os/Bundle;)V", "bindView", "(Lfvb;)V", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "list", "Lcom/xiaomi/fitness/common/calendar/MonthReportModel;", "createReportMap", "(Ljava/util/List;)Lcom/xiaomi/fitness/common/calendar/MonthReportModel;", "Lkotlin/Function0;", "grantCallback", "checkPermission", "(Lkotlin/jvm/functions/Function0;)V", "Lorg/joda/time/LocalDate;", "currentLocalDate", "Lorg/joda/time/LocalDate;", "getCurrentLocalDate", "()Lorg/joda/time/LocalDate;", "setCurrentLocalDate", "(Lorg/joda/time/LocalDate;)V", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ShareSportTagetMonthFragment extends BaseBindingFragment<ShareSportTagetViewModel, fvb> {

    @Nullable
    private LocalDate currentLocalDate;

    public ShareSportTagetMonthFragment() {
        super(jui.G3, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(fvb this_bindView, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        this_bindView.A.initAccountInfo(accountCoreInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$13(final ShareSportTagetMonthFragment this$0, final fvb this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ShareSportTagetViewModel shareSportTagetViewModel = (ShareSportTagetViewModel) this$0.getMViewModel();
        ShareSportTagetViewModel.Companion companion = ShareSportTagetViewModel.INSTANCE;
        ShareSportTagetViewModel.ontrackClick$default(shareSportTagetViewModel, companion.getSTypeDownload(), companion.getSPageTypeMonth(), null, 4, null);
        this$0.checkPermission(new Function0() { // from class: d9m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareSportTagetMonthFragment.bindView$lambda$13$lambda$12(this.f15273a, this_bindView);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$13$lambda$12(final ShareSportTagetMonthFragment this$0, fvb this_bindView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            PageState.DefaultImpls.showLoading$default(this$0, null, 0, false, 3, null);
            ShareSportTagetViewModel shareSportTagetViewModel = (ShareSportTagetViewModel) this$0.getMViewModel();
            ConstraintLayout bgView = this_bindView.C;
            Intrinsics.checkNotNullExpressionValue(bgView, "bgView");
            LifecycleOwner viewLifecycleOwner = this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            shareSportTagetViewModel.saveSharePic(mActivity, bgView, viewLifecycleOwner, new Function0() { // from class: g9m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareSportTagetMonthFragment.bindView$lambda$13$lambda$12$lambda$11$lambda$10(this.f18758a);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$13$lambda$12$lambda$11$lambda$10(ShareSportTagetMonthFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        ToastUtil.showShortToast(c0j.Vc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$17(final ShareSportTagetMonthFragment this$0, final fvb this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ShareSportTagetViewModel shareSportTagetViewModel = (ShareSportTagetViewModel) this$0.getMViewModel();
        ShareSportTagetViewModel.Companion companion = ShareSportTagetViewModel.INSTANCE;
        ShareSportTagetViewModel.ontrackClick$default(shareSportTagetViewModel, companion.getSTypeWX(), companion.getSPageTypeMonth(), null, 4, null);
        this$0.checkPermission(new Function0() { // from class: y8m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareSportTagetMonthFragment.bindView$lambda$17$lambda$16(this.f39934a, this_bindView);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$17$lambda$16(final ShareSportTagetMonthFragment this$0, fvb this_bindView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            ShareSportTagetViewModel shareSportTagetViewModel = (ShareSportTagetViewModel) this$0.getMViewModel();
            ConstraintLayout bgView = this_bindView.C;
            Intrinsics.checkNotNullExpressionValue(bgView, "bgView");
            LifecycleOwner viewLifecycleOwner = this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            ShareSportTagetViewModel.shareToWX$default(shareSportTagetViewModel, mActivity, bgView, viewLifecycleOwner, false, new Function0() { // from class: n8m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareSportTagetMonthFragment.bindView$lambda$17$lambda$16$lambda$15$lambda$14(this.f27661a);
                }
            }, 8, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$17$lambda$16$lambda$15$lambda$14(ShareSportTagetMonthFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$21(final ShareSportTagetMonthFragment this$0, final fvb this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ShareSportTagetViewModel shareSportTagetViewModel = (ShareSportTagetViewModel) this$0.getMViewModel();
        ShareSportTagetViewModel.Companion companion = ShareSportTagetViewModel.INSTANCE;
        ShareSportTagetViewModel.ontrackClick$default(shareSportTagetViewModel, companion.getSTypeWXFriend(), companion.getSPageTypeMonth(), null, 4, null);
        this$0.checkPermission(new Function0() { // from class: z8m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareSportTagetMonthFragment.bindView$lambda$21$lambda$20(this.f41029a, this_bindView);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$21$lambda$20(final ShareSportTagetMonthFragment this$0, fvb this_bindView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            ShareSportTagetViewModel shareSportTagetViewModel = (ShareSportTagetViewModel) this$0.getMViewModel();
            ConstraintLayout bgView = this_bindView.C;
            Intrinsics.checkNotNullExpressionValue(bgView, "bgView");
            LifecycleOwner viewLifecycleOwner = this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            shareSportTagetViewModel.shareToWX(mActivity, bgView, viewLifecycleOwner, true, new Function0() { // from class: e9m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareSportTagetMonthFragment.bindView$lambda$21$lambda$20$lambda$19$lambda$18(this.f16424a);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$21$lambda$20$lambda$19$lambda$18(ShareSportTagetMonthFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$25(final ShareSportTagetMonthFragment this$0, final fvb this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ShareSportTagetViewModel shareSportTagetViewModel = (ShareSportTagetViewModel) this$0.getMViewModel();
        ShareSportTagetViewModel.Companion companion = ShareSportTagetViewModel.INSTANCE;
        ShareSportTagetViewModel.ontrackClick$default(shareSportTagetViewModel, companion.getSTypeMore(), companion.getSPageTypeDay(), null, 4, null);
        this$0.checkPermission(new Function0() { // from class: h9m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareSportTagetMonthFragment.bindView$lambda$25$lambda$24(this.f19840a, this_bindView);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$25$lambda$24(final ShareSportTagetMonthFragment this$0, fvb this_bindView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        if (this$0.getMActivity() != null) {
            ShareSportTagetViewModel shareSportTagetViewModel = (ShareSportTagetViewModel) this$0.getMViewModel();
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ConstraintLayout bgView = this_bindView.C;
            Intrinsics.checkNotNullExpressionValue(bgView, "bgView");
            shareSportTagetViewModel.shareMore(fragmentActivityRequireActivity, bgView, new Function0() { // from class: a9m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareSportTagetMonthFragment.bindView$lambda$25$lambda$24$lambda$23$lambda$22(this.f804a);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$25$lambda$24$lambda$23$lambda$22(ShareSportTagetMonthFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$4(ShareSportTagetMonthFragment this$0, fvb this_bindView, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNull(list);
        MonthReportModel monthReportModelCreateReportMap = this$0.createReportMap(list);
        LocalDate localDate = this$0.currentLocalDate;
        Intrinsics.checkNotNull(localDate);
        this_bindView.I.setLine(TimeDateUtil.getMonthLocalDateCalendar(localDate).size() / 7);
        cdp cdpVarCreateUserInfoTargetModel = TargetUtil.INSTANCE.createUserInfoTargetModel();
        DayThreeCircleFiveLineCalendarView dayThreeCircleFiveLineCalendarView = this_bindView.I;
        LocalDate localDate2 = this$0.currentLocalDate;
        Intrinsics.checkNotNull(localDate2);
        dayThreeCircleFiveLineCalendarView.j(localDate2, TargetUtil.createThreeCircleMap(monthReportModelCreateReportMap.getReportMap()), cdpVarCreateUserInfoTargetModel);
        int iReachCount = ((ShareSportTagetViewModel) this$0.getMViewModel()).reachCount(list);
        this_bindView.J.setText(ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.f0, iReachCount, Integer.valueOf(iReachCount)));
        LocalDate localDate3 = this$0.currentLocalDate;
        if (localDate3 != null) {
            this_bindView.K.setText(TimeUtils.formatDate(ApplicationExtKt.getApplication().getString(c0j.Uc), Long.valueOf(localDate3.toDateTimeAtCurrentTime().getMillis())));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$6(fvb this_bindView, Drawable drawable) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        if (drawable != null) {
            this_bindView.C.setBackgroundDrawable(drawable);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$9$lambda$7(ShareSportTagetMonthFragment this$0, fvb this_bindView, GoalMonthlyStatisticsData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialogForce();
        this_bindView.H.setText(String.valueOf(it.getTotalCalorie()));
        this_bindView.P.setText(String.valueOf(it.getTotalStep()));
        String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.e0, (int) it.getChickenleg(), Float.valueOf(it.getChickenleg()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String string = ApplicationExtKt.getApplication().getResources().getString(c0j.Sc, Integer.valueOf(it.getCalorieRankPercent()));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this_bindView.F.setText(this$0.getString(c0j.Tc, quantityString, string));
        this_bindView.H.setText(String.valueOf(it.getTotalCalorie()));
        this_bindView.P.setText(String.valueOf(it.getTotalStep()));
        this_bindView.G.setText(ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.common_unit_calorie, (int) it.getTotalCalorie()));
        this_bindView.O.setText(ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.common_unit_step, it.getTotalStep()));
        String quantityString2 = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.g0, (int) it.getStepKilometres(), Float.valueOf(it.getStepKilometres()));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        String string2 = ApplicationExtKt.getApplication().getResources().getString(c0j.Sc, Integer.valueOf(it.getStepRankPercent()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this_bindView.N.setText(this$0.getString(c0j.Tc, quantityString2, string2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$9$lambda$8(ShareSportTagetMonthFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$29(ShareSportTagetMonthFragment this$0, final Function0 grantCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(grantCallback, "$grantCallback");
        PermissionExtKt.permission(this$0, "android.permission.WRITE_EXTERNAL_STORAGE", this$0.getString(c0j.pq), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: o8m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetMonthFragment.checkPermission$lambda$29$lambda$28(grantCallback, (PermissionBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$29$lambda$28(final Function0 grantCallback, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(grantCallback, "$grantCallback");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: b9m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetMonthFragment.checkPermission$lambda$29$lambda$28$lambda$26(grantCallback, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: c9m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetMonthFragment.checkPermission$lambda$29$lambda$28$lambda$27((String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$29$lambda$28$lambda$26(Function0 grantCallback, String it) {
        Intrinsics.checkNotNullParameter(grantCallback, "$grantCallback");
        Intrinsics.checkNotNullParameter(it, "it");
        grantCallback.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$29$lambda$28$lambda$27(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(BaseFragment.TAG, "ShareSportTagetDayFragment checkPermission denied");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final fvb fvbVar) {
        Intrinsics.checkNotNullParameter(fvbVar, "<this>");
        setActionBarDisplayable(false);
        fvbVar.A.setTime(TimeDateUtil.getDateYYYYMMLocalFormat(this.currentLocalDate));
        ((ShareSportTagetViewModel) getMViewModel()).getXiaomiCoreInfo().observe(getViewLifecycleOwner(), new ShareSportTagetMonthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: p8m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetMonthFragment.bindView$lambda$1(fvbVar, (AccountCoreInfo) obj);
            }
        }));
        ((ShareSportTagetViewModel) getMViewModel()).loadAccountInfo();
        LocalDate localDate = this.currentLocalDate;
        if (localDate != null) {
            ShareSportTagetViewModel shareSportTagetViewModel = (ShareSportTagetViewModel) getMViewModel();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            shareSportTagetViewModel.fetchMonthData(localDate, viewLifecycleOwner);
        }
        ((ShareSportTagetViewModel) getMViewModel()).getMonthLiveData().observe(getViewLifecycleOwner(), new ShareSportTagetMonthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: q8m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetMonthFragment.bindView$lambda$4(this.f31232a, fvbVar, (List) obj);
            }
        }));
        ((ShareSportTagetViewModel) getMViewModel()).loadMothBgImg(new Function1() { // from class: r8m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetMonthFragment.bindView$lambda$6(fvbVar, (Drawable) obj);
            }
        });
        LocalDate localDate2 = this.currentLocalDate;
        if (localDate2 != null) {
            ((ShareSportTagetViewModel) getMViewModel()).loadMothStaticsDataFromNet(localDate2, new Function1() { // from class: s8m
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ShareSportTagetMonthFragment.bindView$lambda$9$lambda$7(this.f33408a, fvbVar, (GoalMonthlyStatisticsData) obj);
                }
            }, new Function1() { // from class: t8m
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ShareSportTagetMonthFragment.bindView$lambda$9$lambda$8(this.f34455a, (String) obj);
                }
            });
        }
        ViewExtKt.clickWithTrigger$default(fvbVar.D.findViewById(eri.k4), 0L, new Function1() { // from class: u8m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetMonthFragment.bindView$lambda$13(this.f35524a, fvbVar, (View) obj);
            }
        }, 1, null);
        View viewFindViewById = fvbVar.D.findViewById(eri.Cp);
        ViewExtKt.clickWithTrigger$default(viewFindViewById, 0L, new Function1() { // from class: v8m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetMonthFragment.bindView$lambda$17(this.f36625a, fvbVar, (View) obj);
            }
        }, 1, null);
        View viewFindViewById2 = fvbVar.D.findViewById(eri.Bp);
        ViewExtKt.clickWithTrigger$default(viewFindViewById2, 0L, new Function1() { // from class: w8m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetMonthFragment.bindView$lambda$21(this.f37725a, fvbVar, (View) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(fvbVar.D.findViewById(eri.Tb), 0L, new Function1() { // from class: x8m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetMonthFragment.bindView$lambda$25(this.f38864a, fvbVar, (View) obj);
            }
        }, 1, null);
        boolean z = !AppUtil.INSTANCE.isPlayChannel();
        Intrinsics.checkNotNull(viewFindViewById);
        ViewExtKt.setVisible(viewFindViewById, z);
        Intrinsics.checkNotNull(viewFindViewById2);
        ViewExtKt.setVisible(viewFindViewById2, z);
    }

    public final void checkPermission(@NotNull final Function0<Unit> grantCallback) {
        Intrinsics.checkNotNullParameter(grantCallback, "grantCallback");
        if (Build.VERSION.SDK_INT >= 29 || PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
            grantCallback.invoke();
        } else {
            new Function0() { // from class: f9m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareSportTagetMonthFragment.checkPermission$lambda$29(this.f17573a, grantCallback);
                }
            }.invoke();
        }
    }

    @NotNull
    public final MonthReportModel createReportMap(@NotNull List<DailyGoalReport> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.isEmpty()) {
            return new MonthReportModel(-1L, linkedHashMap);
        }
        long time = list.get(0).getTime();
        for (DailyGoalReport dailyGoalReport : list) {
            linkedHashMap.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(dailyGoalReport.getTime())), dailyGoalReport);
            if (dailyGoalReport.getTime() < time) {
                time = dailyGoalReport.getTime();
            }
        }
        return new MonthReportModel(TimeDateUtil.getFirstDayOfMonthTime(time), linkedHashMap);
    }

    @Nullable
    public final LocalDate getCurrentLocalDate() {
        return this.currentLocalDate;
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if (args != null) {
            Serializable serializable = args.getSerializable(ShareSportTargetActivity.sDate);
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type org.joda.time.LocalDate");
            this.currentLocalDate = (LocalDate) serializable;
        }
    }

    public final void setCurrentLocalDate(@Nullable LocalDate localDate) {
        this.currentLocalDate = localDate;
    }
}
