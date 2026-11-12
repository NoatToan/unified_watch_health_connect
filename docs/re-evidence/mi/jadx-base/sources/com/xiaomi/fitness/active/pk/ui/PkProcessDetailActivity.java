package com.xiaomi.fitness.active.pk.ui;

import android.app.ActivityOptions;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.active.pk.ActivePkViewModel;
import com.xiaomi.fitness.active.pk.PkConstants;
import com.xiaomi.fitness.active.pk.net.model.DailyGoalItem;
import com.xiaomi.fitness.active.pk.net.model.GetPkSportRecordsResult;
import com.xiaomi.fitness.active.pk.net.model.PkRecordDetail;
import com.xiaomi.fitness.active.pk.net.model.PkScoreItem;
import com.xiaomi.fitness.active.pk.net.model.UserInfo;
import com.xiaomi.fitness.active.pk.net.model.UserPkDetail;
import com.xiaomi.fitness.active.pk.ui.PkProcessDetailActivity;
import com.xiaomi.fitness.active.pk.ui.recyclerview.OpponentSportRecordAdapter;
import com.xiaomi.fitness.active.pk.util.ActiveGoalUtils;
import com.xiaomi.fitness.active.pk.util.ImageUtils;
import com.xiaomi.fitness.active.pk.util.PkBarChartUtil;
import com.xiaomi.fitness.active.pk.util.PkLogger;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.av6;
import defpackage.bui;
import defpackage.fni;
import defpackage.hyh;
import defpackage.ozi;
import defpackage.pxh;
import defpackage.ryh;
import defpackage.zr3;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import miuix.popupwidget.widget.GuidePopupWindow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 G2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001GB\t\b\u0007¢\u0006\u0004\bF\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u0019\u0010 \u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b \u0010\u0017J'\u0010&\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010(H\u0014¢\u0006\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010:\u001a\b\u0012\u0002\b\u0003\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010.R\u0016\u0010?\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010B¨\u0006H"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/PkProcessDetailActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/active/pk/ActivePkViewModel;", "Lhyh;", "", "requestDataFromNetwork", "()V", "updateTodayZeroStamp", "initPkRuleEntrance", "updateHistoricalPkRecordsEntrance", "updateOpponentSportRecordList", "Lcom/xiaomi/fitness/active/pk/net/model/GetPkSportRecordsResult;", "result", "refreshSportRecordAdapter", "(Lcom/xiaomi/fitness/active/pk/net/model/GetPkSportRecordsResult;)V", "updateTitleAndPkCurrentScoreComparisonAndBarChart", "Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;", "pkRecordDetail", "", "pkStatus", "setEstimatedCheckoutTime", "(Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;I)V", "setPkWithOpponentText", "(Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;)V", "setHeaderScoreComparison", "setEverydayScoreCard", "setExtraBonusInfoIconClickListener", "pkCode", "set7DaysScoreBarchart", "loadBundle", "fillActiveGoalDetailView", "showActiveGoalDialog", "refreshPkRecordDetail", "", "isOwn", "", "Lcom/xiaomi/fitness/active/pk/net/model/DailyGoalItem;", "goalList", "refreshActiveGoal", "(ZLjava/util/List;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", PkConstants.PARAM_PK_ID, "J", PkConstants.PARAM_PK_UID, "Lpxh;", "activeGoalDetailBinding", "Lpxh;", "Landroid/view/View;", "activeGoalDetailView", "Landroid/view/View;", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/OpponentSportRecordAdapter;", "oppoSportRecordsAdapter", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/OpponentSportRecordAdapter;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mActiveGoalDetailDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mSportRecordsResult", "Lcom/xiaomi/fitness/active/pk/net/model/GetPkSportRecordsResult;", "todayZeroStamp", "pkStartsTomorrow", "Z", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPkProcessDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PkProcessDetailActivity.kt\ncom/xiaomi/fitness/active/pk/ui/PkProcessDetailActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,425:1\n1863#2,2:426\n*S KotlinDebug\n*F\n+ 1 PkProcessDetailActivity.kt\ncom/xiaomi/fitness/active/pk/ui/PkProcessDetailActivity\n*L\n409#1:426,2\n*E\n"})
public final class PkProcessDetailActivity extends Hilt_PkProcessDetailActivity<ActivePkViewModel, hyh> {
    public static final int DEFAULT_RECORD_COUNT_FROM_PER_NETWORK_REQUEST = 20;

    @Nullable
    private pxh activeGoalDetailBinding;

    @Nullable
    private View activeGoalDetailView;

    @Nullable
    private CommonDialog<?> mActiveGoalDetailDialog;

    @Nullable
    private GetPkSportRecordsResult mSportRecordsResult;
    private OpponentSportRecordAdapter oppoSportRecordsAdapter;
    private long pkId;
    private boolean pkStartsTomorrow;
    private long pkUid;
    private long todayZeroStamp;

    @NotNull
    private static String TAG = "PkProcessDetailActivity";

    private final void fillActiveGoalDetailView() {
        pxh pxhVarA0 = pxh.A0(getLayoutInflater());
        this.activeGoalDetailBinding = pxhVarA0;
        Intrinsics.checkNotNull(pxhVarA0);
        this.activeGoalDetailView = pxhVarA0.getRoot();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        View view = this.activeGoalDetailView;
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initPkRuleEntrance() {
        ((hyh) getMBinding()).k0.C.setText(ozi.N);
        ((hyh) getMBinding()).k0.A.setImageResource(fni.w);
        new zr3(getApplication(), ((hyh) getMBinding()).k0.getRoot()) { // from class: com.xiaomi.fitness.active.pk.ui.PkProcessDetailActivity.initPkRuleEntrance.1
            @Override // defpackage.zr3
            public void onCardZoomTriggered(ActivityOptions activityOptions) {
                PkProcessDetailActivity.this.startActivity(new Intent(PkProcessDetailActivity.this, (Class<?>) PkRuleActivity.class));
            }
        }.setRadius(ExtUtilsKt.getDp(Float.valueOf(15.0f)));
    }

    private final void loadBundle() {
        Bundle extras = getIntent().getExtras();
        this.pkId = extras != null ? extras.getLong(PkConstants.PARAM_PK_ID) : 0L;
        Bundle extras2 = getIntent().getExtras();
        long j = extras2 != null ? extras2.getLong(PkConstants.PARAM_PK_UID) : 0L;
        this.pkUid = j;
        PkLogger.INSTANCE.i("PkProcessActivity", "pkId " + this.pkId + ",pkUid " + j, new Object[0]);
        if (this.pkId <= 0 || this.pkUid <= 0) {
            finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    private final void refreshActiveGoal(boolean isOwn, List<DailyGoalItem> goalList) {
        ryh ryhVar;
        TextView textView;
        ryh ryhVar2;
        TextView textView2;
        ryh ryhVar3;
        ryh ryhVar4;
        ryh ryhVar5;
        ryh ryhVar6;
        if (ArrayUtils.isEmpty(goalList)) {
            return;
        }
        pxh pxhVar = this.activeGoalDetailBinding;
        TextView textView3 = null;
        if (isOwn) {
            if (pxhVar == null || (ryhVar6 = pxhVar.A) == null) {
                textView = null;
            } else {
                textView = ryhVar6.J;
            }
        } else if (pxhVar == null || (ryhVar = pxhVar.A) == null) {
            textView = null;
        } else {
            textView = ryhVar.F;
        }
        if (isOwn) {
            if (pxhVar == null || (ryhVar5 = pxhVar.A) == null) {
                textView2 = null;
            } else {
                textView2 = ryhVar5.K;
            }
        } else if (pxhVar == null || (ryhVar2 = pxhVar.A) == null) {
            textView2 = null;
        } else {
            textView2 = ryhVar2.G;
        }
        if (isOwn) {
            if (pxhVar != null && (ryhVar4 = pxhVar.A) != null) {
                textView3 = ryhVar4.L;
            }
        } else if (pxhVar != null && (ryhVar3 = pxhVar.A) != null) {
            textView3 = ryhVar3.H;
        }
        Intrinsics.checkNotNull(goalList);
        for (DailyGoalItem dailyGoalItem : goalList) {
            int field = dailyGoalItem.getField();
            int iconWithGoalField = ActiveGoalUtils.INSTANCE.getIconWithGoalField(field);
            long target = dailyGoalItem.getTarget();
            TextView textView4 = field != 1 ? field != 2 ? textView3 : textView : textView2;
            if (textView4 != null) {
                textView4.setText(String.valueOf(target));
            }
            int i = isOwn ? iconWithGoalField : 0;
            if (isOwn) {
                iconWithGoalField = 0;
            }
            if (textView4 != null) {
                textView4.setCompoundDrawablesWithIntrinsicBounds(i, 0, iconWithGoalField, 0);
            }
        }
    }

    private final void refreshPkRecordDetail(PkRecordDetail pkRecordDetail) {
        ryh ryhVar;
        ryh ryhVar2;
        TextView textView;
        ryh ryhVar3;
        ryh ryhVar4;
        TextView textView2;
        if (pkRecordDetail == null) {
            return;
        }
        UserPkDetail oppPkDetail = pkRecordDetail.getOppPkDetail();
        Intrinsics.checkNotNull(oppPkDetail);
        UserInfo userInfo = oppPkDetail.getUserInfo();
        Intrinsics.checkNotNull(userInfo);
        UserPkDetail ownPkDetail = pkRecordDetail.getOwnPkDetail();
        Intrinsics.checkNotNull(ownPkDetail);
        UserInfo userInfo2 = ownPkDetail.getUserInfo();
        Intrinsics.checkNotNull(userInfo2);
        String nickName = userInfo.getNickName();
        if (nickName == null) {
            nickName = "";
        }
        String icon = userInfo.getIcon();
        if (icon == null) {
            icon = "";
        }
        pxh pxhVar = this.activeGoalDetailBinding;
        if (pxhVar != null && (ryhVar4 = pxhVar.A) != null && (textView2 = ryhVar4.I) != null) {
            textView2.setText(nickName);
        }
        RoundImageView roundImageView = null;
        if (!TextUtils.isEmpty(icon)) {
            ImageUtils imageUtils = ImageUtils.INSTANCE;
            pxh pxhVar2 = this.activeGoalDetailBinding;
            imageUtils.loadAvatar((pxhVar2 == null || (ryhVar3 = pxhVar2.A) == null) ? null : ryhVar3.D, icon);
        }
        refreshActiveGoal(false, userInfo.getGoalList());
        Logger.d(TAG, "refreshUserDataInfo oppo goalList=" + userInfo.getGoalList());
        String string = getString(ozi.G);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String icon2 = userInfo2.getIcon();
        String str = icon2 != null ? icon2 : "";
        pxh pxhVar3 = this.activeGoalDetailBinding;
        if (pxhVar3 != null && (ryhVar2 = pxhVar3.A) != null && (textView = ryhVar2.M) != null) {
            textView.setText(string);
        }
        if (!TextUtils.isEmpty(str)) {
            ImageUtils imageUtils2 = ImageUtils.INSTANCE;
            pxh pxhVar4 = this.activeGoalDetailBinding;
            if (pxhVar4 != null && (ryhVar = pxhVar4.A) != null) {
                roundImageView = ryhVar.E;
            }
            imageUtils2.loadAvatar(roundImageView, str);
        }
        refreshActiveGoal(true, userInfo2.getGoalList());
        Logger.d(TAG, "refreshUserDataInfo own goalList=" + userInfo2.getGoalList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshSportRecordAdapter(GetPkSportRecordsResult result) {
        this.mSportRecordsResult = result;
        Logger.d(TAG, "refreshSportRecordAdapter mSportRecordsResult=" + result);
        String str = TAG;
        GetPkSportRecordsResult getPkSportRecordsResult = this.mSportRecordsResult;
        OpponentSportRecordAdapter opponentSportRecordAdapter = null;
        Logger.d(str, "refreshSportRecordAdapter hasMore=" + (getPkSportRecordsResult != null ? Boolean.valueOf(getPkSportRecordsResult.getHasMore()) : null));
        RelativeLayout sportRecordView = ((hyh) getMBinding()).o0;
        Intrinsics.checkNotNullExpressionValue(sportRecordView, "sportRecordView");
        ViewExtKt.visible(sportRecordView);
        AppCompatImageView rightArrow = ((hyh) getMBinding()).j0.B;
        Intrinsics.checkNotNullExpressionValue(rightArrow, "rightArrow");
        ViewExtKt.gone(rightArrow);
        ((hyh) getMBinding()).j0.C.setText(getString(ozi.J));
        ((hyh) getMBinding()).j0.A.setImageResource(fni.d);
        OpponentSportRecordAdapter opponentSportRecordAdapter2 = this.oppoSportRecordsAdapter;
        if (opponentSportRecordAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oppoSportRecordsAdapter");
            opponentSportRecordAdapter2 = null;
        }
        opponentSportRecordAdapter2.updateOppoSportRecordResult(this.mSportRecordsResult);
        OpponentSportRecordAdapter opponentSportRecordAdapter3 = this.oppoSportRecordsAdapter;
        if (opponentSportRecordAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oppoSportRecordsAdapter");
        } else {
            opponentSportRecordAdapter = opponentSportRecordAdapter3;
        }
        if (opponentSportRecordAdapter.getItemCount() == 0) {
            RelativeLayout sportRecordView2 = ((hyh) getMBinding()).o0;
            Intrinsics.checkNotNullExpressionValue(sportRecordView2, "sportRecordView");
            ViewExtKt.gone(sportRecordView2);
        } else {
            RelativeLayout sportRecordView3 = ((hyh) getMBinding()).o0;
            Intrinsics.checkNotNullExpressionValue(sportRecordView3, "sportRecordView");
            ViewExtKt.visible(sportRecordView3);
        }
    }

    private final void requestDataFromNetwork() {
        updateTodayZeroStamp();
        updateHistoricalPkRecordsEntrance();
        updateTitleAndPkCurrentScoreComparisonAndBarChart();
        updateOpponentSportRecordList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void set7DaysScoreBarchart(PkRecordDetail pkRecordDetail, int pkCode) {
        ((hyh) getMBinding()).A.updateScoreList(PkBarChartUtil.INSTANCE.convertPkRecordDetailToChartItem(pkRecordDetail), pkCode == 0, pkRecordDetail.getPkStartTime());
        refreshPkRecordDetail(pkRecordDetail);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setEstimatedCheckoutTime(PkRecordDetail pkRecordDetail, int pkStatus) {
        PkBarChartUtil pkBarChartUtil = PkBarChartUtil.INSTANCE;
        TextView estimatedCheckoutTime = ((hyh) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(estimatedCheckoutTime, "estimatedCheckoutTime");
        pkBarChartUtil.updatePkStatusTextView(estimatedCheckoutTime, pkStatus, pkRecordDetail);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setEverydayScoreCard(PkRecordDetail pkRecordDetail) {
        UserInfo userInfo;
        UserPkDetail oppPkDetail = pkRecordDetail.getOppPkDetail();
        String nickName = (oppPkDetail == null || (userInfo = oppPkDetail.getUserInfo()) == null) ? null : userInfo.getNickName();
        if (nickName == null || StringsKt__StringsKt.isBlank(nickName)) {
            nickName = getString(ozi.I);
        }
        ((hyh) getMBinding()).X.setMaxWidth(((((hyh) getMBinding()).getRoot().getMeasuredWidth() - ExtUtilsKt.getDp(Float.valueOf(184.63f))) - ((hyh) getMBinding()).Q.getMeasuredWidth()) - ((hyh) getMBinding()).I.getMeasuredWidth());
        ((hyh) getMBinding()).X.setText(nickName);
        ((hyh) getMBinding()).Q.setText(getString(ozi.G));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setExtraBonusInfoIconClickListener() {
        ((hyh) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: gzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PkProcessDetailActivity.setExtraBonusInfoIconClickListener$lambda$7(this.f19496a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setExtraBonusInfoIconClickListener$lambda$7(PkProcessDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this$0.getApplication());
        int i = bui.i;
        RelativeLayout relativeLayout = ((hyh) this$0.getMBinding()).i0;
        Intrinsics.checkNotNull(relativeLayout, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewInflate = layoutInflaterFrom.inflate(i, (ViewGroup) relativeLayout, false);
        GuidePopupWindow guidePopupWindow = new GuidePopupWindow(this$0.getApplication());
        guidePopupWindow.n(viewInflate, new ViewGroup.LayoutParams(ExtUtilsKt.getDp(Float.valueOf(208.67f)), -2));
        guidePopupWindow.k(8);
        guidePopupWindow.w(((hyh) this$0.getMBinding()).G, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setHeaderScoreComparison(PkRecordDetail pkRecordDetail) {
        UserInfo userInfo;
        TextView textView = ((hyh) getMBinding()).c0;
        UserPkDetail oppPkDetail = pkRecordDetail.getOppPkDetail();
        textView.setText((oppPkDetail == null || (userInfo = oppPkDetail.getUserInfo()) == null) ? null : userInfo.getNickName());
        ((hyh) getMBinding()).T.setText(getString(ozi.G));
        UserPkDetail ownPkDetail = pkRecordDetail.getOwnPkDetail();
        long totalScore = ownPkDetail != null ? ownPkDetail.getTotalScore() : 0L;
        UserPkDetail oppPkDetail2 = pkRecordDetail.getOppPkDetail();
        long totalScore2 = oppPkDetail2 != null ? oppPkDetail2.getTotalScore() : 0L;
        if (this.pkStartsTomorrow) {
            AppCompatImageView opponentLeadCrown = ((hyh) getMBinding()).b0;
            Intrinsics.checkNotNullExpressionValue(opponentLeadCrown, "opponentLeadCrown");
            ViewExtKt.gone(opponentLeadCrown);
            AppCompatImageView myLeadCrown = ((hyh) getMBinding()).R;
            Intrinsics.checkNotNullExpressionValue(myLeadCrown, "myLeadCrown");
            ViewExtKt.gone(myLeadCrown);
            ImageView myLeadingHighlight = ((hyh) getMBinding()).S;
            Intrinsics.checkNotNullExpressionValue(myLeadingHighlight, "myLeadingHighlight");
            ViewExtKt.gone(myLeadingHighlight);
            ImageView oppoLeadingHighlight = ((hyh) getMBinding()).Y;
            Intrinsics.checkNotNullExpressionValue(oppoLeadingHighlight, "oppoLeadingHighlight");
            ViewExtKt.gone(oppoLeadingHighlight);
        } else {
            if (totalScore2 > totalScore) {
                ImageView oppoLeadingHighlight2 = ((hyh) getMBinding()).Y;
                Intrinsics.checkNotNullExpressionValue(oppoLeadingHighlight2, "oppoLeadingHighlight");
                ViewExtKt.visible(oppoLeadingHighlight2);
                ImageView myLeadingHighlight2 = ((hyh) getMBinding()).S;
                Intrinsics.checkNotNullExpressionValue(myLeadingHighlight2, "myLeadingHighlight");
                ViewExtKt.gone(myLeadingHighlight2);
                AppCompatImageView opponentLeadCrown2 = ((hyh) getMBinding()).b0;
                Intrinsics.checkNotNullExpressionValue(opponentLeadCrown2, "opponentLeadCrown");
                ViewExtKt.visible(opponentLeadCrown2);
                AppCompatImageView myLeadCrown2 = ((hyh) getMBinding()).R;
                Intrinsics.checkNotNullExpressionValue(myLeadCrown2, "myLeadCrown");
                ViewExtKt.gone(myLeadCrown2);
            }
            if (totalScore2 < totalScore) {
                ImageView myLeadingHighlight3 = ((hyh) getMBinding()).S;
                Intrinsics.checkNotNullExpressionValue(myLeadingHighlight3, "myLeadingHighlight");
                ViewExtKt.visible(myLeadingHighlight3);
                ImageView oppoLeadingHighlight3 = ((hyh) getMBinding()).Y;
                Intrinsics.checkNotNullExpressionValue(oppoLeadingHighlight3, "oppoLeadingHighlight");
                ViewExtKt.gone(oppoLeadingHighlight3);
                AppCompatImageView opponentLeadCrown3 = ((hyh) getMBinding()).b0;
                Intrinsics.checkNotNullExpressionValue(opponentLeadCrown3, "opponentLeadCrown");
                ViewExtKt.gone(opponentLeadCrown3);
                AppCompatImageView myLeadCrown3 = ((hyh) getMBinding()).R;
                Intrinsics.checkNotNullExpressionValue(myLeadCrown3, "myLeadCrown");
                ViewExtKt.visible(myLeadCrown3);
            }
        }
        PkBarChartUtil pkBarChartUtil = PkBarChartUtil.INSTANCE;
        UserPkDetail ownPkDetail2 = pkRecordDetail.getOwnPkDetail();
        Map<Long, PkScoreItem> mapConvertPkScoreListToMap = pkBarChartUtil.convertPkScoreListToMap(ownPkDetail2 != null ? ownPkDetail2.getPkScoreList() : null);
        UserPkDetail oppPkDetail3 = pkRecordDetail.getOppPkDetail();
        Map<Long, PkScoreItem> mapConvertPkScoreListToMap2 = pkBarChartUtil.convertPkScoreListToMap(oppPkDetail3 != null ? oppPkDetail3.getPkScoreList() : null);
        PkScoreItem pkScoreItem = mapConvertPkScoreListToMap.get(Long.valueOf(this.todayZeroStamp));
        PkScoreItem pkScoreItem2 = mapConvertPkScoreListToMap2.get(Long.valueOf(this.todayZeroStamp));
        String string = getString(ozi.Z, "0");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(ozi.Z, "--");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        ((hyh) getMBinding()).a0.setText(this.pkStartsTomorrow ? "--" : String.valueOf(totalScore2));
        ((hyh) getMBinding()).P.setText(this.pkStartsTomorrow ? "--" : String.valueOf(totalScore));
        if (this.pkStartsTomorrow) {
            ((hyh) getMBinding()).W.setText(string2);
            ((hyh) getMBinding()).g0.setText(string2);
            return;
        }
        if (pkScoreItem != null) {
            ((hyh) getMBinding()).W.setText(getString(ozi.Z, String.valueOf(pkScoreItem.getScore())));
        } else {
            ((hyh) getMBinding()).W.setText(string);
        }
        if (pkScoreItem2 != null) {
            ((hyh) getMBinding()).g0.setText(getString(ozi.Z, String.valueOf(pkScoreItem2.getScore())));
        } else {
            ((hyh) getMBinding()).g0.setText(string);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setPkWithOpponentText(PkRecordDetail pkRecordDetail) {
        String string;
        UserInfo userInfo;
        UserPkDetail oppPkDetail = pkRecordDetail.getOppPkDetail();
        if (oppPkDetail == null || (userInfo = oppPkDetail.getUserInfo()) == null || (string = userInfo.getNickName()) == null) {
            string = getString(ozi.I);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        String string2 = getString(ozi.c0, string);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        ((hyh) getMBinding()).m0.setText(string2);
    }

    private final void showActiveGoalDialog() {
        CommonDialog<?> commonDialog = this.mActiveGoalDetailDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            if (this.mActiveGoalDetailDialog == null) {
                this.mActiveGoalDetailDialog = new CommonDialog.c("active_goal_detail").setCustomView(this.activeGoalDetailView).setDialogTitle(ozi.h).setPositiveText(ozi.q).setCancelable(true).create();
            }
            CommonDialog<?> commonDialog2 = this.mActiveGoalDetailDialog;
            Intrinsics.checkNotNull(commonDialog2 != null ? commonDialog2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.active.pk.ui.PkProcessDetailActivity.showActiveGoalDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                    Intrinsics.checkNotNullParameter(dialog, "dialog");
                    super.onDialogClick(dialogName, dialog, which);
                }
            }) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
            CommonDialog<?> commonDialog3 = this.mActiveGoalDetailDialog;
            if (commonDialog3 != null) {
                commonDialog3.showIfNeed(getSupportFragmentManager());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateHistoricalPkRecordsEntrance() {
        ActivePkViewModel.queryHasUserHistoryStatusLiveData$default((ActivePkViewModel) getMViewModel(), Long.valueOf(this.pkUid), 0, 2, null).observe(this, new PkProcessDetailActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hzh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PkProcessDetailActivity.updateHistoricalPkRecordsEntrance$lambda$0(this.f20623a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit updateHistoricalPkRecordsEntrance$lambda$0(final PkProcessDetailActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            View root = ((hyh) this$0.getMBinding()).h0.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewExtKt.visible(root);
            ((hyh) this$0.getMBinding()).h0.C.setText(ozi.f29846r);
            ((hyh) this$0.getMBinding()).h0.A.setImageResource(fni.c);
            final Application application = this$0.getApplication();
            final View root2 = ((hyh) this$0.getMBinding()).h0.getRoot();
            new zr3(application, root2) { // from class: com.xiaomi.fitness.active.pk.ui.PkProcessDetailActivity$updateHistoricalPkRecordsEntrance$1$1
                @Override // defpackage.zr3
                public void onCardZoomTriggered(ActivityOptions activityOptions) {
                    PkProcessDetailActivity pkProcessDetailActivity = this.this$0;
                    Intent intent = new Intent(this.this$0, (Class<?>) PkHistoryDetailActivity.class);
                    intent.putExtra(PkConstants.PARAM_PK_UID, this.this$0.pkUid);
                    pkProcessDetailActivity.startActivity(intent);
                }
            }.setRadius(ExtUtilsKt.getDp(Float.valueOf(15.0f)));
        } else {
            View root3 = ((hyh) this$0.getMBinding()).h0.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
            ViewExtKt.gone(root3);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateOpponentSportRecordList() {
        if (this.pkStartsTomorrow) {
            RelativeLayout sportRecordView = ((hyh) getMBinding()).o0;
            Intrinsics.checkNotNullExpressionValue(sportRecordView, "sportRecordView");
            ViewExtKt.gone(sportRecordView);
            return;
        }
        RelativeLayout sportRecordView2 = ((hyh) getMBinding()).o0;
        Intrinsics.checkNotNullExpressionValue(sportRecordView2, "sportRecordView");
        ViewExtKt.visible(sportRecordView2);
        ActivePkViewModel.sendGetPkSportRecordResultRequestOnce$default((ActivePkViewModel) getMViewModel(), this.pkId, this.pkUid, 20, null, 8, null);
        ((ActivePkViewModel) getMViewModel()).getPkSportRecordResultLiveData().observe(this, new PkProcessDetailActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: bzh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PkProcessDetailActivity.updateOpponentSportRecordList$lambda$1(this.f4749a, (GetPkSportRecordsResult) obj);
            }
        }));
        OpponentSportRecordAdapter opponentSportRecordAdapter = new OpponentSportRecordAdapter();
        opponentSportRecordAdapter.setOnPreload(new Function0() { // from class: czh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PkProcessDetailActivity.updateOpponentSportRecordList$lambda$3$lambda$2(this.f14889a);
            }
        });
        this.oppoSportRecordsAdapter = opponentSportRecordAdapter;
        ((hyh) getMBinding()).e0.setLayoutManager(new LinearLayoutManager(getApplication()));
        RecyclerView recyclerView = ((hyh) getMBinding()).e0;
        OpponentSportRecordAdapter opponentSportRecordAdapter2 = this.oppoSportRecordsAdapter;
        if (opponentSportRecordAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oppoSportRecordsAdapter");
            opponentSportRecordAdapter2 = null;
        }
        recyclerView.setAdapter(opponentSportRecordAdapter2);
        ((hyh) getMBinding()).e0.setOverScrollMode(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateOpponentSportRecordList$lambda$1(PkProcessDetailActivity this$0, GetPkSportRecordsResult getPkSportRecordsResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshSportRecordAdapter(getPkSportRecordsResult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit updateOpponentSportRecordList$lambda$3$lambda$2(PkProcessDetailActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ActivePkViewModel.sendGetPkSportRecordResultRequestOnce$default((ActivePkViewModel) this$0.getMViewModel(), this$0.pkId, this$0.pkUid, 20, null, 8, null);
        Logger.d(TAG, "updateOpponentSportRecordList preload once");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateTitleAndPkCurrentScoreComparisonAndBarChart() {
        setActionBarDisplayable(false);
        ((hyh) getMBinding()).i0.bringToFront();
        ((hyh) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: dzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PkProcessDetailActivity.updateTitleAndPkCurrentScoreComparisonAndBarChart$lambda$4(this.f16092a, view);
            }
        });
        ((hyh) getMBinding()).C.setContentDescription(getString(ozi.f29843a));
        ((hyh) getMBinding()).N.setOnClickListener(new View.OnClickListener() { // from class: ezh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PkProcessDetailActivity.updateTitleAndPkCurrentScoreComparisonAndBarChart$lambda$5(this.f17222a, view);
            }
        });
        ((hyh) getMBinding()).N.setContentDescription(getString(ozi.h));
        ((ActivePkViewModel) getMViewModel()).queryUserPkRecordDetailLiveData(this.pkId, this.pkUid).observe(this, new PkProcessDetailActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fzh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PkProcessDetailActivity.updateTitleAndPkCurrentScoreComparisonAndBarChart$lambda$6(this.f18394a, (PkRecordDetail) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTitleAndPkCurrentScoreComparisonAndBarChart$lambda$4(PkProcessDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lambda$onCreate$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTitleAndPkCurrentScoreComparisonAndBarChart$lambda$5(PkProcessDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showActiveGoalDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit updateTitleAndPkCurrentScoreComparisonAndBarChart$lambda$6(PkProcessDetailActivity this$0, PkRecordDetail pkRecordDetail) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (pkRecordDetail == null) {
            ((hyh) this$0.getMBinding()).X.setText(this$0.getString(ozi.I));
            return Unit.INSTANCE;
        }
        int pkStatus = PkBarChartUtil.INSTANCE.getPkStatus(pkRecordDetail);
        this$0.pkStartsTomorrow = pkStatus == 0;
        this$0.setEstimatedCheckoutTime(pkRecordDetail, pkStatus);
        this$0.setPkWithOpponentText(pkRecordDetail);
        this$0.setHeaderScoreComparison(pkRecordDetail);
        this$0.setEverydayScoreCard(pkRecordDetail);
        this$0.set7DaysScoreBarchart(pkRecordDetail, pkStatus);
        return Unit.INSTANCE;
    }

    private final void updateTodayZeroStamp() {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        this.todayZeroStamp = TimeDateUtil.changZeroOfTheDay(localDateNow);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return bui.l;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.active.pk.ui.Hilt_PkProcessDetailActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadBundle();
        fillActiveGoalDetailView();
        setExtraBonusInfoIconClickListener();
        initPkRuleEntrance();
        requestDataFromNetwork();
    }
}
