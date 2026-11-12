package com.xiaomi.fitness.health.threetarget;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.GoalItem;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.threetarget.ShareSportTagetDayFragment;
import com.xiaomi.fitness.health.threetarget.adpter.ShareSelectBgImgListAdapter;
import com.xiaomi.fitness.health.threetarget.view.SpaceItemDecoration;
import com.xiaomi.fitness.health.threetarget.viewmodel.ShareSportTagetViewModel;
import defpackage.c0j;
import defpackage.cvb;
import defpackage.eri;
import defpackage.jui;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/ShareSportTagetDayFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/threetarget/viewmodel/ShareSportTagetViewModel;", "Lcvb;", "Landroid/os/Bundle;", "args", "", "setArguments", "(Landroid/os/Bundle;)V", "bindView", "(Lcvb;)V", "Lkotlin/Function0;", "grantCallback", "checkPermission", "(Lkotlin/jvm/functions/Function0;)V", "", "", "dataList", "Ljava/util/List;", "Lcom/xiaomi/fitness/health/threetarget/adpter/ShareSelectBgImgListAdapter;", "adapter", "Lcom/xiaomi/fitness/health/threetarget/adpter/ShareSelectBgImgListAdapter;", "Lorg/joda/time/LocalDate;", "currentLocalDate", "Lorg/joda/time/LocalDate;", "getCurrentLocalDate", "()Lorg/joda/time/LocalDate;", "setCurrentLocalDate", "(Lorg/joda/time/LocalDate;)V", "selectedPosition", "I", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nShareSportTagetDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareSportTagetDayFragment.kt\ncom/xiaomi/fitness/health/threetarget/ShareSportTagetDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n1863#2,2:192\n*S KotlinDebug\n*F\n+ 1 ShareSportTagetDayFragment.kt\ncom/xiaomi/fitness/health/threetarget/ShareSportTagetDayFragment\n*L\n97#1:192,2\n*E\n"})
public final class ShareSportTagetDayFragment extends BaseBindingFragment<ShareSportTagetViewModel, cvb> {

    @Nullable
    private ShareSelectBgImgListAdapter adapter;

    @Nullable
    private LocalDate currentLocalDate;

    @NotNull
    private List<Integer> dataList;
    private int selectedPosition;

    public ShareSportTagetDayFragment() {
        super(jui.F3, 0, true);
        this.dataList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$10(cvb this_bindView, DailyGoalReport dailyGoalReport) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        List<GoalItem> listGoalList = dailyGoalReport.goalList();
        for (GoalItem goalItem : listGoalList) {
            int type = goalItem.getType();
            if (type == 1) {
                this_bindView.L.setData(RainbowExKt.getTargetImg(goalItem), RainbowExKt.getTargetOnlyName$default(goalItem, ApplicationExtKt.getApplication(), false, 2, null), goalItem.getAchievedValue(), RainbowExKt.getTargetModelUnit(goalItem));
            } else if (type != 2) {
                this_bindView.I.setData(RainbowExKt.getTargetImg(goalItem), RainbowExKt.getTargetOnlyName$default(goalItem, ApplicationExtKt.getApplication(), false, 2, null), goalItem.getAchievedValue(), RainbowExKt.getTargetModelUnit(goalItem));
            } else {
                this_bindView.H.setData(RainbowExKt.getTargetImg(goalItem), RainbowExKt.getTargetOnlyName$default(goalItem, ApplicationExtKt.getApplication(), false, 2, null), goalItem.getAchievedValue(), RainbowExKt.getTargetModelUnit(goalItem));
            }
        }
        this_bindView.M.y(listGoalList, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$14(final ShareSportTagetDayFragment this$0, final cvb this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ShareSportTagetViewModel shareSportTagetViewModel = (ShareSportTagetViewModel) this$0.getMViewModel();
        ShareSportTagetViewModel.Companion companion = ShareSportTagetViewModel.INSTANCE;
        shareSportTagetViewModel.ontrackClick(companion.getSTypeDownload(), companion.getSPageTypeDay(), String.valueOf(this$0.selectedPosition + 1));
        this$0.checkPermission(new Function0() { // from class: k8m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareSportTagetDayFragment.bindView$lambda$14$lambda$13(this.f23599a, this_bindView);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$14$lambda$13(final ShareSportTagetDayFragment this$0, cvb this_bindView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            PageState.DefaultImpls.showLoading$default(this$0, null, 0, false, 3, null);
            ShareSportTagetViewModel shareSportTagetViewModel = (ShareSportTagetViewModel) this$0.getMViewModel();
            ConstraintLayout bgView = this_bindView.D;
            Intrinsics.checkNotNullExpressionValue(bgView, "bgView");
            LifecycleOwner viewLifecycleOwner = this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            shareSportTagetViewModel.saveSharePic(mActivity, bgView, viewLifecycleOwner, new Function0() { // from class: s7m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareSportTagetDayFragment.bindView$lambda$14$lambda$13$lambda$12$lambda$11(this.f33383a);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$14$lambda$13$lambda$12$lambda$11(ShareSportTagetDayFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        ToastUtil.showShortToast(c0j.Vc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$18(final ShareSportTagetDayFragment this$0, final cvb this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ShareSportTagetViewModel shareSportTagetViewModel = (ShareSportTagetViewModel) this$0.getMViewModel();
        ShareSportTagetViewModel.Companion companion = ShareSportTagetViewModel.INSTANCE;
        shareSportTagetViewModel.ontrackClick(companion.getSTypeWX(), companion.getSPageTypeDay(), String.valueOf(this$0.selectedPosition + 1));
        this$0.checkPermission(new Function0() { // from class: a8m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareSportTagetDayFragment.bindView$lambda$18$lambda$17(this.f771a, this_bindView);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$18$lambda$17(final ShareSportTagetDayFragment this$0, cvb this_bindView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            ShareSportTagetViewModel shareSportTagetViewModel = (ShareSportTagetViewModel) this$0.getMViewModel();
            ConstraintLayout bgView = this_bindView.D;
            Intrinsics.checkNotNullExpressionValue(bgView, "bgView");
            LifecycleOwner viewLifecycleOwner = this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            ShareSportTagetViewModel.shareToWX$default(shareSportTagetViewModel, mActivity, bgView, viewLifecycleOwner, false, new Function0() { // from class: e8m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareSportTagetDayFragment.bindView$lambda$18$lambda$17$lambda$16$lambda$15(this.f16388a);
                }
            }, 8, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$18$lambda$17$lambda$16$lambda$15(ShareSportTagetDayFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$2(cvb this_bindView, Drawable drawable) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        if (drawable != null) {
            this_bindView.G.setImageDrawable(drawable);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$22(final ShareSportTagetDayFragment this$0, final cvb this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ShareSportTagetViewModel shareSportTagetViewModel = (ShareSportTagetViewModel) this$0.getMViewModel();
        ShareSportTagetViewModel.Companion companion = ShareSportTagetViewModel.INSTANCE;
        shareSportTagetViewModel.ontrackClick(companion.getSTypeWXFriend(), companion.getSPageTypeDay(), String.valueOf(this$0.selectedPosition + 1));
        this$0.checkPermission(new Function0() { // from class: j8m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareSportTagetDayFragment.bindView$lambda$22$lambda$21(this.f22531a, this_bindView);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$22$lambda$21(final ShareSportTagetDayFragment this$0, cvb this_bindView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            ShareSportTagetViewModel shareSportTagetViewModel = (ShareSportTagetViewModel) this$0.getMViewModel();
            ConstraintLayout bgView = this_bindView.D;
            Intrinsics.checkNotNullExpressionValue(bgView, "bgView");
            LifecycleOwner viewLifecycleOwner = this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            shareSportTagetViewModel.shareToWX(mActivity, bgView, viewLifecycleOwner, true, new Function0() { // from class: l8m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareSportTagetDayFragment.bindView$lambda$22$lambda$21$lambda$20$lambda$19(this.f24784a);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$22$lambda$21$lambda$20$lambda$19(ShareSportTagetDayFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$26(final ShareSportTagetDayFragment this$0, final cvb this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ShareSportTagetViewModel shareSportTagetViewModel = (ShareSportTagetViewModel) this$0.getMViewModel();
        ShareSportTagetViewModel.Companion companion = ShareSportTagetViewModel.INSTANCE;
        shareSportTagetViewModel.ontrackClick(companion.getSTypeMore(), companion.getSPageTypeDay(), String.valueOf(this$0.selectedPosition + 1));
        this$0.checkPermission(new Function0() { // from class: c8m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareSportTagetDayFragment.bindView$lambda$26$lambda$25(this.f5052a, this_bindView);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$26$lambda$25(final ShareSportTagetDayFragment this$0, cvb this_bindView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        if (this$0.getMActivity() != null) {
            ShareSportTagetViewModel shareSportTagetViewModel = (ShareSportTagetViewModel) this$0.getMViewModel();
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ConstraintLayout bgView = this_bindView.D;
            Intrinsics.checkNotNullExpressionValue(bgView, "bgView");
            shareSportTagetViewModel.shareMore(fragmentActivityRequireActivity, bgView, new Function0() { // from class: f8m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareSportTagetDayFragment.bindView$lambda$26$lambda$25$lambda$24$lambda$23(this.f17535a);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$26$lambda$25$lambda$24$lambda$23(ShareSportTagetDayFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$6$lambda$5(ShareSportTagetDayFragment this$0, final cvb this_bindView, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        this$0.selectedPosition = i;
        ((ShareSportTagetViewModel) this$0.getMViewModel()).loadDayBgImg(i, new Function1() { // from class: d8m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetDayFragment.bindView$lambda$6$lambda$5$lambda$4(this_bindView, (Drawable) obj);
            }
        });
        this_bindView.K.scrollToPosition(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$6$lambda$5$lambda$4(cvb this_bindView, Drawable drawable) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        if (drawable != null) {
            this_bindView.G.setImageDrawable(drawable);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$7(cvb this_bindView, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        this_bindView.A.initAccountInfo(accountCoreInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$30(ShareSportTagetDayFragment this$0, final Function0 grantCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(grantCallback, "$grantCallback");
        PermissionExtKt.permission(this$0, "android.permission.WRITE_EXTERNAL_STORAGE", this$0.getString(c0j.pq), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: b8m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetDayFragment.checkPermission$lambda$30$lambda$29(grantCallback, (PermissionBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$30$lambda$29(final Function0 grantCallback, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(grantCallback, "$grantCallback");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: h8m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetDayFragment.checkPermission$lambda$30$lambda$29$lambda$27(grantCallback, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: i8m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetDayFragment.checkPermission$lambda$30$lambda$29$lambda$28((String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$30$lambda$29$lambda$27(Function0 grantCallback, String it) {
        Intrinsics.checkNotNullParameter(grantCallback, "$grantCallback");
        Intrinsics.checkNotNullParameter(it, "it");
        grantCallback.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$30$lambda$29$lambda$28(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(BaseFragment.TAG, "ShareSportTagetDayFragment checkPermission denied");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final cvb cvbVar) {
        Intrinsics.checkNotNullParameter(cvbVar, "<this>");
        setActionBarDisplayable(false);
        for (int i = 0; i < 8; i++) {
            this.dataList.add(Integer.valueOf(i));
        }
        ((ShareSportTagetViewModel) getMViewModel()).loadDayBgImg(this.selectedPosition, new Function1() { // from class: m8m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetDayFragment.bindView$lambda$2(cvbVar, (Drawable) obj);
            }
        });
        FragmentActivity mActivity = getMActivity();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), (mActivity == null || !UIUtils.INSTANCE.isTabletAndLandscape(mActivity)) ? 1 : 2);
        gridLayoutManager.setOrientation(0);
        cvbVar.K.setLayoutManager(gridLayoutManager);
        FragmentActivity mActivity2 = getMActivity();
        if (mActivity2 != null) {
            this.adapter = new ShareSelectBgImgListAdapter(mActivity2, this.dataList, new Function1() { // from class: t7m
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ShareSportTagetDayFragment.bindView$lambda$6$lambda$5(this.f34424a, cvbVar, ((Integer) obj).intValue());
                }
            });
        }
        cvbVar.K.addItemDecoration(new SpaceItemDecoration());
        cvbVar.K.setAdapter(this.adapter);
        cvbVar.A.setTime(TimeDateUtil.getDateYYYYMMddLocalFormat(this.currentLocalDate));
        ((ShareSportTagetViewModel) getMViewModel()).getXiaomiCoreInfo().observe(getViewLifecycleOwner(), new ShareSportTagetDayFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: u7m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetDayFragment.bindView$lambda$7(cvbVar, (AccountCoreInfo) obj);
            }
        }));
        ((ShareSportTagetViewModel) getMViewModel()).loadAccountInfo();
        LocalDate localDate = this.currentLocalDate;
        if (localDate != null) {
            ((ShareSportTagetViewModel) getMViewModel()).fetchDayData(localDate);
        }
        ((ShareSportTagetViewModel) getMViewModel()).getDayDataLiveData().observe(getViewLifecycleOwner(), new ShareSportTagetDayFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: v7m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetDayFragment.bindView$lambda$10(cvbVar, (DailyGoalReport) obj);
            }
        }));
        ViewExtKt.clickWithTrigger$default(cvbVar.E.findViewById(eri.k4), 0L, new Function1() { // from class: w7m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetDayFragment.bindView$lambda$14(this.f37696a, cvbVar, (View) obj);
            }
        }, 1, null);
        View viewFindViewById = cvbVar.E.findViewById(eri.Cp);
        ViewExtKt.clickWithTrigger$default(cvbVar.E.findViewById(eri.Cp), 0L, new Function1() { // from class: x7m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetDayFragment.bindView$lambda$18(this.f38790a, cvbVar, (View) obj);
            }
        }, 1, null);
        View viewFindViewById2 = cvbVar.E.findViewById(eri.Bp);
        ViewExtKt.clickWithTrigger$default(cvbVar.E.findViewById(eri.Bp), 0L, new Function1() { // from class: y7m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetDayFragment.bindView$lambda$22(this.f39896a, cvbVar, (View) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(cvbVar.E.findViewById(eri.Tb), 0L, new Function1() { // from class: z7m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareSportTagetDayFragment.bindView$lambda$26(this.f40990a, cvbVar, (View) obj);
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
            new Function0() { // from class: g8m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareSportTagetDayFragment.checkPermission$lambda$30(this.f18728a, grantCallback);
                }
            }.invoke();
        }
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
