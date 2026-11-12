package com.xiaomi.fitness.relative.home;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.GoalItem;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.log.TalkbackLogger;
import com.xiaomi.fitness.health.threetarget.RainbowExKt;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetView;
import com.xiaomi.fitness.homepage.util.HealthDataUtil;
import com.xiaomi.fitness.homepage.view.DataHeaderTargetItemView;
import com.xiaomi.fitness.relative.home.RelativeDataHeaderView;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.qxi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ]2\u00020\u0001:\u0001]B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010B\u001a\u00020CH\u0014J\b\u0010D\u001a\u00020\tH\u0002J\u0016\u0010E\u001a\u00020C2\u0006\u0010F\u001a\u0002062\u0006\u0010@\u001a\u00020AJ\b\u0010G\u001a\u00020CH\u0002J\b\u0010H\u001a\u00020CH\u0002J\u001a\u0010I\u001a\u00020C2\b\u0010J\u001a\u0004\u0018\u00010\"2\u0006\u0010K\u001a\u00020LH\u0002J\u0010\u0010M\u001a\u00020C2\u0006\u0010K\u001a\u00020LH\u0002J,\u0010N\u001a\u00020C2\b\u0010O\u001a\u0004\u0018\u00010P2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020C0R2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020C0RJ\u0010\u0010T\u001a\u00020C2\b\u0010O\u001a\u0004\u0018\u00010PJ\u000e\u0010U\u001a\u00020C2\u0006\u0010V\u001a\u00020WJ\u000e\u0010X\u001a\u00020C2\u0006\u0010V\u001a\u00020WJ\u0010\u0010Y\u001a\u00020C2\u0006\u0010K\u001a\u00020LH\u0002J\u0018\u0010Z\u001a\u00020P2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010K\u001a\u00020LH\u0002J\u0018\u0010[\u001a\u00020P2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010K\u001a\u00020LH\u0002J\u0018\u0010\\\u001a\u00020P2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010K\u001a\u00020LH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u0003X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u001c\u0010*\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00105\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010=\"\u0004\b>\u0010?R\u000e\u0010@\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006^"}, d2 = {"Lcom/xiaomi/fitness/relative/home/RelativeDataHeaderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "contentView", "Landroid/view/View;", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "rootContainer", "Landroid/view/ViewGroup;", "getRootContainer", "()Landroid/view/ViewGroup;", "setRootContainer", "(Landroid/view/ViewGroup;)V", "targetContainer", "Landroid/widget/RelativeLayout;", "getTargetContainer", "()Landroid/widget/RelativeLayout;", "setTargetContainer", "(Landroid/widget/RelativeLayout;)V", "targetView", "Lcom/xiaomi/fitness/health/threetarget/model/ThreeTargetView;", "getTargetView", "()Lcom/xiaomi/fitness/health/threetarget/model/ThreeTargetView;", "setTargetView", "(Lcom/xiaomi/fitness/health/threetarget/model/ThreeTargetView;)V", "targetFirstItem", "Lcom/xiaomi/fitness/homepage/view/DataHeaderTargetItemView;", "getTargetFirstItem", "()Lcom/xiaomi/fitness/homepage/view/DataHeaderTargetItemView;", "setTargetFirstItem", "(Lcom/xiaomi/fitness/homepage/view/DataHeaderTargetItemView;)V", "targetSecondItem", "getTargetSecondItem", "setTargetSecondItem", "targetThirdItem", "getTargetThirdItem", "setTargetThirdItem", "homeHeaderView", "Lcom/xiaomi/fitness/relative/home/RelativeHomeHeaderView;", "getHomeHeaderView", "()Lcom/xiaomi/fitness/relative/home/RelativeHomeHeaderView;", "setHomeHeaderView", "(Lcom/xiaomi/fitness/relative/home/RelativeHomeHeaderView;)V", "talkbackStr", "Ljava/lang/StringBuffer;", "goalReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "getGoalReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "setGoalReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;)V", "isFemale", "", "()Z", "setFemale", "(Z)V", "relativeUid", "", "onFinishInflate", "", "createContentView", "bindGoalReport", "report", "initTalkbackStr", "setTargetViewTalkback", "bindTargetItem", "targetItem", "item", "Lcom/xiaomi/fit/fitness/export/data/aggregation/GoalItem;", "appendNewItemStr", "bindTitleData", "title", "", "addMenuClick", "Lkotlin/Function0;", "backClick", "setTitle", "setAddDevListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "setBackListener", "appendCalorieItemStr", "getGoalUnitStr", "getItemTypeName", "getUnitStr", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RelativeDataHeaderView extends LinearLayout {

    @NotNull
    public static final String TAG = "DataHeaderView";

    @NotNull
    private View contentView;

    @Nullable
    private DailyGoalReport goalReport;

    @Nullable
    private RelativeHomeHeaderView homeHeaderView;
    private boolean isFemale;
    public Context mContext;
    private long relativeUid;

    @Nullable
    private ViewGroup rootContainer;

    @Nullable
    private StringBuffer talkbackStr;
    public RelativeLayout targetContainer;

    @Nullable
    private DataHeaderTargetItemView targetFirstItem;

    @Nullable
    private DataHeaderTargetItemView targetSecondItem;

    @Nullable
    private DataHeaderTargetItemView targetThirdItem;

    @Nullable
    private ThreeTargetView targetView;

    public RelativeDataHeaderView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isFemale = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).isFemale();
        this.relativeUid = -1L;
        this.contentView = LayoutInflater.from(context).inflate(jui.p8, this);
    }

    private final void appendCalorieItemStr(GoalItem item) {
        int achievedValue = item.getAchievedValue();
        int goalValue = item.getGoalValue();
        String unitStr = getUnitStr(ApplicationExtKt.getApplication(), item);
        if (unitStr == null) {
            unitStr = "";
        }
        String goalUnitStr = getGoalUnitStr(ApplicationExtKt.getApplication(), item);
        String string = ResourceExtKt.getString(c0j.Eq, getItemTypeName(ApplicationExtKt.getApplication(), item), Integer.valueOf(achievedValue), unitStr, Integer.valueOf(goalValue), goalUnitStr);
        StringBuffer stringBuffer = this.talkbackStr;
        if (stringBuffer != null) {
            stringBuffer.append(string);
        }
    }

    private final void appendNewItemStr(GoalItem item) {
        int achievedValue = item.getAchievedValue();
        int goalValue = item.getGoalValue();
        String unitStr = getUnitStr(ApplicationExtKt.getApplication(), item);
        if (unitStr == null) {
            unitStr = "";
        }
        String goalUnitStr = getGoalUnitStr(ApplicationExtKt.getApplication(), item);
        String string = ResourceExtKt.getString(c0j.Fq, getItemTypeName(ApplicationExtKt.getApplication(), item), Integer.valueOf(achievedValue), unitStr, Integer.valueOf(goalValue), goalUnitStr);
        StringBuffer stringBuffer = this.talkbackStr;
        if (stringBuffer != null) {
            stringBuffer.append(string);
        }
    }

    private final void bindTargetItem(DataHeaderTargetItemView targetItem, GoalItem item) {
        String string = getContext().getString(c0j.Xm, String.valueOf(item.getAchievedValue()), String.valueOf(item.getGoalValue()));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (targetItem != null) {
            int targetImg = RainbowExKt.getTargetImg(item);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            targetItem.g(targetImg, string, getUnitStr(context, item));
        }
        Logger.d(TAG, "bindTargetItem one time");
        if (item.getType() == 2) {
            appendCalorieItemStr(item);
        } else {
            appendNewItemStr(item);
        }
    }

    private final View createContentView() {
        Trace.beginSection("DataHeaderView.createContentView");
        this.rootContainer = (ViewGroup) this.contentView.findViewById(eri.te);
        setTargetContainer((RelativeLayout) this.contentView.findViewById(eri.Td));
        this.targetView = (ThreeTargetView) this.contentView.findViewById(eri.ni);
        this.homeHeaderView = (RelativeHomeHeaderView) this.contentView.findViewById(eri.Q5);
        this.targetFirstItem = (DataHeaderTargetItemView) this.contentView.findViewById(eri.d5);
        this.targetSecondItem = (DataHeaderTargetItemView) this.contentView.findViewById(eri.Oe);
        this.targetThirdItem = (DataHeaderTargetItemView) this.contentView.findViewById(eri.Qi);
        HealthDataUtil healthDataUtil = HealthDataUtil.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        healthDataUtil.cardZoom(context, getTargetContainer(), new Function1() { // from class: tgk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeDataHeaderView.createContentView$lambda$0(this.f34677a, (ActivityOptions) obj);
            }
        });
        Trace.endSection();
        return this.contentView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createContentView$lambda$0(RelativeDataHeaderView this$0, ActivityOptions activityOptions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HealthDataUtil.INSTANCE.intentSportRTarget(this$0.getContext(), activityOptions, this$0.relativeUid);
        return Unit.INSTANCE;
    }

    private final String getGoalUnitStr(Context context, GoalItem item) {
        int type = item.getType();
        if (type == 1) {
            String quantityString = context.getResources().getQuantityString(qxi.u, item.getGoalValue());
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            return quantityString;
        }
        if (type == 2) {
            String quantityString2 = context.getResources().getQuantityString(qxi.common_unit_calorie, item.getGoalValue());
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            return quantityString2;
        }
        if (type == 3) {
            String quantityString3 = context.getResources().getQuantityString(qxi.common_unit_time, item.getGoalValue());
            Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
            return quantityString3;
        }
        if (type != 4) {
            return "";
        }
        String quantityString4 = context.getResources().getQuantityString(qxi.P1, item.getGoalValue());
        Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
        return quantityString4;
    }

    private final String getItemTypeName(Context context, GoalItem item) {
        int type = item.getType();
        if (type == 1) {
            return ExtUtilKt.getString(c0j.u7);
        }
        if (type == 2) {
            return ExtUtilKt.getString(c0j.g7);
        }
        if (type != 3) {
            return type != 4 ? "" : ExtUtilKt.getString(c0j.m7);
        }
        return ExtUtilKt.getString(c0j.t7);
    }

    private final String getUnitStr(Context context, GoalItem item) {
        int type = item.getType();
        if (type == 1) {
            String quantityString = context.getResources().getQuantityString(qxi.u, item.getAchievedValue());
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            return quantityString;
        }
        if (type == 2) {
            String quantityString2 = context.getResources().getQuantityString(qxi.common_unit_calorie, item.getAchievedValue());
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            return quantityString2;
        }
        if (type == 3) {
            String quantityString3 = context.getResources().getQuantityString(qxi.common_unit_time, item.getAchievedValue());
            Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
            return quantityString3;
        }
        if (type != 4) {
            return "";
        }
        String quantityString4 = context.getResources().getQuantityString(qxi.P1, item.getAchievedValue());
        Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
        return quantityString4;
    }

    private final void initTalkbackStr() {
        this.talkbackStr = new StringBuffer();
    }

    private final void setTargetViewTalkback() {
        getTargetContainer().setContentDescription(String.valueOf(this.talkbackStr));
        TalkbackLogger.INSTANCE.d(TAG, "rainbow three target talkback=" + ((Object) this.talkbackStr), new Object[0]);
    }

    public final void bindGoalReport(@NotNull DailyGoalReport report, long relativeUid) {
        Intrinsics.checkNotNullParameter(report, "report");
        DailyGoalReport dailyGoalReport = this.goalReport;
        if (dailyGoalReport == null || !Intrinsics.areEqual(report, dailyGoalReport)) {
            this.goalReport = report;
        }
        getTargetContainer().setVisibility(0);
        this.relativeUid = relativeUid;
        Logger.d(TAG, report.toString());
        initTalkbackStr();
        ThreeTargetView threeTargetView = this.targetView;
        if (threeTargetView != null) {
            threeTargetView.x(report, true);
        }
        List<GoalItem> listGoalList = report.goalList();
        List<GoalItem> list = listGoalList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i == 0 && (!list.isEmpty())) {
                bindTargetItem(this.targetFirstItem, listGoalList.get(i));
            }
            if (i == 1 && listGoalList.size() >= 2) {
                bindTargetItem(this.targetSecondItem, listGoalList.get(i));
            }
            if (i == 2 && listGoalList.size() >= 3) {
                bindTargetItem(this.targetThirdItem, listGoalList.get(i));
            }
        }
        setTargetViewTalkback();
    }

    public final void bindTitleData(@Nullable String title, @NotNull Function0<Unit> addMenuClick, @NotNull Function0<Unit> backClick) {
        Intrinsics.checkNotNullParameter(addMenuClick, "addMenuClick");
        Intrinsics.checkNotNullParameter(backClick, "backClick");
        RelativeHomeHeaderView relativeHomeHeaderView = this.homeHeaderView;
        if (relativeHomeHeaderView != null) {
            relativeHomeHeaderView.bindData(title, addMenuClick, backClick);
        }
    }

    @Nullable
    public final DailyGoalReport getGoalReport() {
        return this.goalReport;
    }

    @Nullable
    public final RelativeHomeHeaderView getHomeHeaderView() {
        return this.homeHeaderView;
    }

    @NotNull
    public final Context getMContext() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    @Nullable
    public final ViewGroup getRootContainer() {
        return this.rootContainer;
    }

    @NotNull
    public final RelativeLayout getTargetContainer() {
        RelativeLayout relativeLayout = this.targetContainer;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetContainer");
        return null;
    }

    @Nullable
    public final DataHeaderTargetItemView getTargetFirstItem() {
        return this.targetFirstItem;
    }

    @Nullable
    public final DataHeaderTargetItemView getTargetSecondItem() {
        return this.targetSecondItem;
    }

    @Nullable
    public final DataHeaderTargetItemView getTargetThirdItem() {
        return this.targetThirdItem;
    }

    @Nullable
    public final ThreeTargetView getTargetView() {
        return this.targetView;
    }

    /* JADX INFO: renamed from: isFemale, reason: from getter */
    public final boolean getIsFemale() {
        return this.isFemale;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        createContentView();
    }

    public final void setAddDevListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        RelativeHomeHeaderView relativeHomeHeaderView = this.homeHeaderView;
        if (relativeHomeHeaderView != null) {
            relativeHomeHeaderView.setMenuClickListener(listener);
        }
    }

    public final void setBackListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        RelativeHomeHeaderView relativeHomeHeaderView = this.homeHeaderView;
        if (relativeHomeHeaderView != null) {
            relativeHomeHeaderView.setBackClickListener(listener);
        }
    }

    public final void setFemale(boolean z) {
        this.isFemale = z;
    }

    public final void setGoalReport(@Nullable DailyGoalReport dailyGoalReport) {
        this.goalReport = dailyGoalReport;
    }

    public final void setHomeHeaderView(@Nullable RelativeHomeHeaderView relativeHomeHeaderView) {
        this.homeHeaderView = relativeHomeHeaderView;
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void setRootContainer(@Nullable ViewGroup viewGroup) {
        this.rootContainer = viewGroup;
    }

    public final void setTargetContainer(@NotNull RelativeLayout relativeLayout) {
        Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
        this.targetContainer = relativeLayout;
    }

    public final void setTargetFirstItem(@Nullable DataHeaderTargetItemView dataHeaderTargetItemView) {
        this.targetFirstItem = dataHeaderTargetItemView;
    }

    public final void setTargetSecondItem(@Nullable DataHeaderTargetItemView dataHeaderTargetItemView) {
        this.targetSecondItem = dataHeaderTargetItemView;
    }

    public final void setTargetThirdItem(@Nullable DataHeaderTargetItemView dataHeaderTargetItemView) {
        this.targetThirdItem = dataHeaderTargetItemView;
    }

    public final void setTargetView(@Nullable ThreeTargetView threeTargetView) {
        this.targetView = threeTargetView;
    }

    public final void setTitle(@Nullable String title) {
        RelativeHomeHeaderView relativeHomeHeaderView = this.homeHeaderView;
        if (relativeHomeHeaderView != null) {
            relativeHomeHeaderView.setTitle(title);
        }
    }
}
