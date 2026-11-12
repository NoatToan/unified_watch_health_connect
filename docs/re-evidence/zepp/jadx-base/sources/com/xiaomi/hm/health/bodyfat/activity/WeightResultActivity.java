package com.xiaomi.hm.health.bodyfat.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.format.DateFormat;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.listener.IScrollListener;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.GoalLineStyle;
import com.huami.chart.style.LineJoinStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;
import com.huami.core.device.wifi_settings.WifiRouter;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.WeightResultActivity;
import com.xiaomi.hm.health.bodyfat.event.EventWeightChanged;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoRepository;
import com.xiaomi.hm.health.bodyfat.model.Birthday;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.BFTransToChartUtil;
import com.xiaomi.hm.health.bodyfat.utils.BodyFatSp;
import com.xiaomi.hm.health.bodyfat.utils.BodyFatTimeUtils;
import com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis;
import com.xiaomi.hm.health.bodyfat.viewmodel.AchieveGoalViewModel;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.utils.Utils;
import de.greenrobot.event.EventBus;
import defpackage.jc4;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bi\u0010jJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u000eH&J\u0012\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0002J\u0006\u0010\u001b\u001a\u00020\u0002J\u0006\u0010\u001c\u001a\u00020\u0002J\u0006\u0010\u001d\u001a\u00020\u0018J\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u0014\u0010\"\u001a\u00020\u00182\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u0006\u0010#\u001a\u00020\u0002J\u000e\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0015J\u000e\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0018J\u0014\u0010)\u001a\u00020\u00022\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u001eJ\b\u0010+\u001a\u00020*H&J\b\u0010,\u001a\u00020\u0002H&J\b\u0010.\u001a\u00020-H&J\u0006\u0010/\u001a\u00020\u0002J\b\u00100\u001a\u00020\u0002H\u0014R\u0016\u00102\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00101R\u001c\u00106\u001a\u00020\u000e8\u0004@\u0004X\u0084D¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u00105R\u001c\u00108\u001a\u00020\u000e8\u0004@\u0004X\u0084D¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b7\u00105R\u001c\u0010=\u001a\u00020-8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020\u000e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b>\u00103R\u001e\u0010D\u001a\n A*\u0004\u0018\u00010@0@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\"\u0010F\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010P\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u00103\u001a\u0004\bM\u00105\"\u0004\bN\u0010OR$\u0010X\u001a\u0004\u0018\u00010Q8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020\u000e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bY\u00103R\u0016\u0010\\\u001a\u00020\u000e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b[\u00103R\u0016\u0010^\u001a\u00020\u000e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b]\u00103R\u001f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u001f0_8\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010`\u001a\u0004\ba\u0010bR\u001c\u0010d\u001a\b\u0012\u0004\u0012\u00020\u001f0_8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010`R\u0016\u0010h\u001a\u00020e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010g¨\u0006k"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/WeightResultActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "u", "Lcom/huami/chart/provider/RenderConfig;", "w", "Lcom/huami/chart/provider/DrawConfig;", "v", "", "y", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "z", "x", "", "position", "onTouchPosition", "getType", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "delWeightInfo", "showDelDialog", "", "checkDelete", "resetCurrentIndex", "isWifiConfig", "processGdprLaw", "checkUidValid", "", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "userInfos", "dealUserList", "isUserListChanged", "goToFamilyManagerActivity", "weightinfo", "checkGoalFinish", "isNormal", "scaleChart", "weightInfos", "refreshChart", "Landroid/view/ViewGroup;", "getMyChartContainer", "updateByGdpr", "", "getUid", "showScaleTokenInvalidDialog", "onDestroy", "Z", "isCheckGoal", LogUtil.I, "getTYPE_WEIGHT", "()I", Utils.TYPE_WEIGHT, "getTYPE_BODYFAT", "TYPE_BODYFAT", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "J", "getLAST_USER_ID", "()J", "LAST_USER_ID", "B", "EXTRA_DATA", "", "kotlin.jvm.PlatformType", "C", "Ljava/lang/String;", "TAG", "Lcom/huami/chart/chart/ChartProvider;", "mChartProvider", "Lcom/huami/chart/chart/ChartProvider;", "getMChartProvider", "()Lcom/huami/chart/chart/ChartProvider;", "setMChartProvider", "(Lcom/huami/chart/chart/ChartProvider;)V", LogUtil.D, "getMCurrentIndex", "setMCurrentIndex", "(I)V", "mCurrentIndex", "Lcom/huami/chart/data/ChartDataList;", "E", "Lcom/huami/chart/data/ChartDataList;", "getMData", "()Lcom/huami/chart/data/ChartDataList;", "setMData", "(Lcom/huami/chart/data/ChartDataList;)V", "mData", "F", "MIN_COUNT", "G", "MAX_COUNT", "H", "MSG_REFRESH_CHART_UI", "", "Ljava/util/List;", "getUserList", "()Ljava/util/List;", "userList", "realUsers", "Landroid/os/Handler;", "K", "Landroid/os/Handler;", "mHandler", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public abstract class WeightResultActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    private ChartDataList mData;
    public ChartProvider mChartProvider;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean isCheckGoal;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final int TYPE_WEIGHT = 17;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final int TYPE_BODYFAT = 18;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final long LAST_USER_ID = -1000;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final int EXTRA_DATA = 6;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final String TAG = getClass().getSimpleName();

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private int mCurrentIndex = -1;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final int MIN_COUNT = 7;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final int MAX_COUNT = 20;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int MSG_REFRESH_CHART_UI = 153;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    private final List<UserInfos> userList = new ArrayList();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    private final List<UserInfos> realUsers = new ArrayList();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    private final Handler mHandler = new WeightResultHandler(this, new Handler.Callback() { // from class: mt8
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return WeightResultActivity.A(this.a, message);
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.activity.WeightResultActivity$onCreate$1", f = "WeightResultActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeightResultActivity.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (HMWeightUtils.isAmazfitScale()) {
                BodyFatSp bodyFatSp = BodyFatSp.INSTANCE;
                boolean scaleWifi = bodyFatSp.getScaleWifi(WeightResultActivity.this);
                HMLog.i(WeightResultActivity.this.TAG, Intrinsics.stringPlus("是否配置了WiFi ", Boxing.boxBoolean(scaleWifi)), new Object[0]);
                if (scaleWifi) {
                    boolean scaleTokenRemind = bodyFatSp.getScaleTokenRemind(WeightResultActivity.this);
                    long scaleTokenRemindTime = bodyFatSp.getScaleTokenRemindTime(WeightResultActivity.this);
                    BodyFatTimeUtils bodyFatTimeUtils = BodyFatTimeUtils.INSTANCE;
                    int deltaDayCount = bodyFatTimeUtils.getDeltaDayCount(new Date(scaleTokenRemindTime), new Date());
                    HMLog.i(WeightResultActivity.this.TAG, "是否提示token过期 " + scaleTokenRemind + " 上次提醒token时间 " + scaleTokenRemindTime + " 跟今天相差 " + deltaDayCount + " 天", new Object[0]);
                    if (scaleTokenRemind && deltaDayCount > 0) {
                        WeightInfos latestWeightScaleWeightInfo = WeightInfoRepository.INSTANCE.getInstance().getLatestWeightScaleWeightInfo();
                        if (latestWeightScaleWeightInfo == null) {
                            return Unit.INSTANCE;
                        }
                        long jMillsToSecond = ExtentionUtilsKt.millsToSecond(latestWeightScaleWeightInfo.getTimestamp().longValue(), true);
                        int deltaDayCount2 = bodyFatTimeUtils.getDeltaDayCount(new Date(jMillsToSecond), new Date());
                        HMLog.i(WeightResultActivity.this.TAG, "最近一条称重数据时间 " + jMillsToSecond + " 跟今天相差 " + deltaDayCount2 + " 天", new Object[0]);
                        if (deltaDayCount2 >= 360) {
                            WeightResultActivity.this.showScaleTokenInvalidDialog();
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(WeightResultActivity weightResultActivity, Message message) {
        if (message.what != weightResultActivity.MSG_REFRESH_CHART_UI) {
            return true;
        }
        HMLog.v(weightResultActivity.TAG, Intrinsics.stringPlus("process onTouchPosition  ", Integer.valueOf(message.arg1)), new Object[0]);
        weightResultActivity.onTouchPosition(message.arg1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(final WeightResultActivity weightResultActivity, boolean z) {
        if (z) {
            return;
        }
        BFCallback.getAppUtils().showDeleteAllMemberDataRequestDialog(weightResultActivity, new WeightGrantRequestDialogLis() { // from class: pt8
            @Override // com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis
            public final void requestResult(boolean z2) {
                WeightResultActivity.C(this.a, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(WeightResultActivity weightResultActivity, boolean z) {
        if (z) {
            weightResultActivity.updateByGdpr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(WeightResultActivity weightResultActivity, boolean z) {
        if (z) {
            weightResultActivity.updateByGdpr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(final WeightResultActivity weightResultActivity) {
        weightResultActivity.getMChartProvider().getChart().setIScrollListener(new IScrollListener() { // from class: com.xiaomi.hm.health.bodyfat.activity.WeightResultActivity$refreshChart$1$1
            @Override // com.huami.chart.listener.IScrollListener
            public /* synthetic */ void offset(float f) {
                jc4.a(this, f);
            }

            @Override // com.huami.chart.listener.IScrollListener
            public void onScrollCurrentIndex(@NotNull Index index) {
            }

            @Override // com.huami.chart.listener.IScrollListener
            public void onStartIndex(@NotNull Index index) {
            }

            @Override // com.huami.chart.listener.IScrollListener
            public void onStopIndex(@NotNull Index index) {
                HMLog.v(this.a.TAG, Intrinsics.stringPlus("onScrollStopCurrentIndex ", index), new Object[0]);
                Message messageObtainMessage = this.a.mHandler.obtainMessage();
                messageObtainMessage.what = this.a.MSG_REFRESH_CHART_UI;
                messageObtainMessage.arg1 = index.getPosiIndex().getIndex();
                this.a.mHandler.sendMessage(messageObtainMessage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(WeightResultActivity weightResultActivity, WeightInfos weightInfos, DialogInterface dialogInterface, int i) {
        if (weightResultActivity.getType() == weightResultActivity.getTYPE_WEIGHT()) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.WEIGHT_DEL));
        } else {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.BF_VIEW_DEL_NUM).setValue(StatEvent.BF_VIEW_DEL_HAS_FAT_TYPE));
        }
        boolean z = false;
        try {
            HMLog.i(weightResultActivity.TAG, Intrinsics.stringPlus("delete weight : ", weightInfos), new Object[0]);
            WeightInfoManager.getManager().deleteInfo(weightInfos);
            if (weightResultActivity.getUid() == Long.parseLong(BFCallback.getHMPersonInfo().getUserid())) {
                HMWeightUtils.updateLoginUserWeight(weightInfos);
            }
            z = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (z) {
            EventBus.getDefault().post(new EventWeightChanged(weightResultActivity.getUid(), 5));
            if (weightResultActivity.getMCurrentIndex() > 0) {
                weightResultActivity.setMCurrentIndex(weightResultActivity.getMCurrentIndex() - 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(WeightResultActivity weightResultActivity, DialogInterface dialogInterface, int i) {
        BodyFatSp.INSTANCE.setScaleTokenRemind(weightResultActivity, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(WeightResultActivity weightResultActivity, WeightInfos weightInfos, Boolean bool) {
        AchieveWeightGoalActivity.INSTANCE.startAchieveWeightGoal(weightResultActivity, weightResultActivity.getUid(), weightInfos.getId().longValue());
    }

    private final void u() {
        getMChartProvider().createChart(new ChartProvider.StatisChartProvider() { // from class: com.xiaomi.hm.health.bodyfat.activity.WeightResultActivity$createChart$1
            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer */
            public ViewGroup getD() {
                return this.a.getMyChartContainer();
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList */
            public ChartDataList getG() {
                ChartDataList mData = this.a.getMData();
                return mData == null ? new ChartDataList(new SparseArray()) : mData;
            }

            @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
            @NotNull
            public Index getCurrentIndex() {
                ChartDataList mData = this.a.getMData();
                Integer numValueOf = mData == null ? null : Integer.valueOf(mData.getCount());
                if (this.a.getMCurrentIndex() < 0) {
                    this.a.setMCurrentIndex((numValueOf == null || numValueOf.intValue() == 0) ? 0 : numValueOf.intValue() - 1);
                }
                return new Index(this.a.getMCurrentIndex(), new BaseIndex(this.a.getMCurrentIndex()));
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                return this.a.v();
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                return this.a.w();
            }
        }, true, true, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrawConfig v() {
        return new DrawConfig.Builder(this).setDataMarginTop(ChartUtil.dp2px(this, 20.0f)).setDataWidth(ChartUtil.dp2px(this, 58.8f)).setCanvasHeight(x(getMyChartContainer())).setCanvasWidth(z(getMyChartContainer())).setDataMarginBottom(ChartUtil.dp2px(this, 15.0f)).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RenderConfig w() {
        RenderConfig.Builder lineStyle = new RenderConfig.Builder().setLineJoinStyle(new LineJoinStyle.Builder(this).setLineJointStyle(8).setLineJointColor(ContextCompat.getColor(this, R.color.weight_curve_line_dot_color)).setLineJointSize(ChartUtil.dp2px(this, 1.5f)).create()).setLineStyle(new LineStyle.Builder(this).setLineStyle(4).setLineColor(ContextCompat.getColor(this, R.color.weight_curve_line_color)).setLineWidth(getResources().getDimension(R.dimen.body_fat_curve_line_width)).setShadowColors(com.xiaomi.hm.health.bodyfat.utils.Utils.INSTANCE.getColors(this, R.array.weight_curve_shadow_colors)).create());
        if (getType() == this.TYPE_WEIGHT) {
            int weightUnit = BFCallback.getUnitManager().getWeightUnit();
            float fY = y();
            HMLog.i(this.TAG, "uid " + getUid() + " targetWeight " + fY, new Object[0]);
            lineStyle.setGoalLineStyle(new GoalLineStyle.Builder(this).setGoalLineStyle((fY > 0.0f ? 1 : (fY == 0.0f ? 0 : -1)) > 0 ? 10 : 1).setGoalLineLabelPosition(GoalLineStyle.GoalLineLabelPosition.END).setGoalLineLabelSize(ChartUtil.sp2px(this, 10.0f)).setGoalLineWidth(ChartUtil.dp2px(this, 1.5f)).setGoalLineColor(new int[]{ContextCompat.getColor(this, R.color.weight_goal_line)}).setGoalLabels(new String[]{Intrinsics.stringPlus(HMWeightUtils.getWeightValueStringForDisplay(fY, weightUnit), HMWeightUtils.toUnitStr(this, weightUnit))}).setGoalLineLabelColors(new int[]{ContextCompat.getColor(this, R.color.weight_goal_line_label)}).setGoalLabelMarginStart(ChartUtil.dp2px(this, 3.0f)).setGoals(new float[]{fY}).setGoalLineOutsideShow(true).create());
        }
        return lineStyle.create();
    }

    private final float x(View view) {
        int measuredHeight = view.getMeasuredHeight();
        int height = view.getHeight();
        if (measuredHeight == 0) {
            return height != 0 ? height : getResources().getDimension(R.dimen.size_45dp);
        }
        return measuredHeight;
    }

    private final float y() {
        UserInfos info = UserInfoManager.getManager().getInfo(getUid());
        if (info == null || info.getTargetWeight() == null) {
            return 0.0f;
        }
        return info.getTargetWeight().floatValue();
    }

    private final float z(View view) {
        int measuredWidth = view.getMeasuredWidth();
        int width = view.getWidth();
        if (measuredWidth == 0) {
            return width != 0 ? width : Resources.getSystem().getDisplayMetrics().widthPixels - getResources().getDimension(R.dimen.size_20dp);
        }
        return measuredWidth;
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final boolean checkDelete() {
        ChartDataList chartDataList = this.mData;
        return (chartDataList == null ? 0 : chartDataList.getCount()) > 1;
    }

    public final void checkGoalFinish(@NotNull final WeightInfos weightinfo) {
        if (this.isCheckGoal) {
            return;
        }
        this.isCheckGoal = true;
        if (getIntent().getBooleanExtra(BFConstant.IS_FROM_WEIGHTING, false)) {
            AchieveGoalViewModel achieveGoalViewModel = (AchieveGoalViewModel) ViewModelProviders.of(this).get(AchieveGoalViewModel.class);
            achieveGoalViewModel.isAchieveGoal().observe(this, new Observer() { // from class: nt8
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    WeightResultActivity.t(this.a, weightinfo, (Boolean) obj);
                }
            });
            achieveGoalViewModel.checkIsAchieveGoal(getUid(), weightinfo.getWeight());
        }
    }

    public final boolean checkUidValid() {
        long uid = getUid();
        Iterator<UserInfos> it2 = this.realUsers.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (com.xiaomi.hm.health.bodyfat.utils.Utils.INSTANCE.toLongValue(it2.next().getUserId(), 0L) == uid) {
                z = true;
            }
        }
        return z;
    }

    @NotNull
    public final List<UserInfos> dealUserList(@NotNull List<? extends UserInfos> userInfos) {
        this.realUsers.clear();
        this.realUsers.addAll(userInfos);
        this.userList.clear();
        this.userList.addAll(userInfos);
        int i = this.EXTRA_DATA;
        if (i > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                UserInfos userInfos2 = new UserInfos();
                userInfos2.setName(getString(R.string.family_manager));
                userInfos2.setUserId(String.valueOf(this.LAST_USER_ID - ((long) i2)));
                if (i2 == 0) {
                    List<UserInfos> list = this.userList;
                    list.add(list.size(), userInfos2);
                } else if (i2 < 4) {
                    this.userList.add(0, userInfos2);
                } else {
                    this.userList.add(userInfos2);
                }
                if (i3 >= i) {
                    break;
                }
                i2 = i3;
            }
        }
        return this.userList;
    }

    public final long getLAST_USER_ID() {
        return this.LAST_USER_ID;
    }

    @NotNull
    public final ChartProvider getMChartProvider() {
        ChartProvider chartProvider = this.mChartProvider;
        Objects.requireNonNull(chartProvider);
        return chartProvider;
    }

    public final int getMCurrentIndex() {
        return this.mCurrentIndex;
    }

    @Nullable
    public final ChartDataList getMData() {
        return this.mData;
    }

    @NotNull
    public abstract ViewGroup getMyChartContainer();

    public final int getTYPE_BODYFAT() {
        return this.TYPE_BODYFAT;
    }

    public final int getTYPE_WEIGHT() {
        return this.TYPE_WEIGHT;
    }

    public abstract int getType();

    public abstract long getUid();

    @NotNull
    public final List<UserInfos> getUserList() {
        return this.userList;
    }

    public final void goToFamilyManagerActivity() {
        if (UserInfoManager.getManager().getAllInfosCount() - 1 > 0) {
            startActivity(new Intent(this, (Class<?>) FamilyListActivity.class));
            return;
        }
        Intent intent = new Intent(this, (Class<?>) WeightMemberDetailActivity.class);
        intent.putExtra(BFConstant.KET_ADD_NEW, true);
        startActivity(intent);
    }

    public final boolean isUserListChanged(@NotNull List<? extends UserInfos> userInfos) {
        Object next;
        if (!(!this.realUsers.isEmpty()) || this.realUsers.size() != userInfos.size()) {
            return true;
        }
        for (UserInfos userInfos2 : userInfos) {
            Iterator<T> it2 = this.realUsers.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(userInfos2.getUserId(), ((UserInfos) next).getUserId()));
            UserInfos userInfos3 = (UserInfos) next;
            if (userInfos3 == null || ExtentionUtilsKt.isChange(userInfos2, userInfos3)) {
                return true;
            }
        }
        return false;
    }

    public final void isWifiConfig() {
        final HMDeviceSource boundDeviceSource = BFCallback.getHMDeviceManager().getBoundDeviceSource(HMDeviceType.WEIGHT);
        if (BFCallback.getHMDeviceManager().isSupportWifi(boundDeviceSource)) {
            BFCallback.getHMDeviceManager().wifiConfig(boundDeviceSource, new WifiRouter.WifiConfigCallBack() { // from class: com.xiaomi.hm.health.bodyfat.activity.WeightResultActivity.isWifiConfig.1
                @Override // com.huami.core.device.wifi_settings.WifiRouter.WifiConfigCallBack
                public void wifiConfigEnable(boolean isConfig) {
                    if (isConfig) {
                        return;
                    }
                    WifiRouter.INSTANCE.showConfigDialog(WeightResultActivity.this, boundDeviceSource.getValue(), -1);
                }
            });
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(savedInstanceState);
        setMChartProvider(new ChartProvider(this, true));
        e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HMLog.v(this.TAG, "onDestroy", new Object[0]);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public abstract void onTouchPosition(int position);

    public final void processGdprLaw() {
        if (BFCallback.getHMLoginManager().isInNonContinental() && !NetUtil.isNetworkConnected(this) && !BFCallback.getHMPropertyUtil().getPropertyToWeightPermission("all_member")) {
            IconToast.showError(this, R.string.not_connect_network);
            finish();
            return;
        }
        if (BFCallback.getHMLoginManager().isAdult()) {
            BFCallback.getAppUtils().showGrantWeightDataRequestDialog(this, "all_member", new WeightGrantRequestDialogLis() { // from class: qt8
                @Override // com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis
                public final void requestResult(boolean z) {
                    WeightResultActivity.B(this.a, z);
                }
            });
            return;
        }
        List<UserInfos> allInfosNotWithSelf = UserInfoManager.getManager().getAllInfosNotWithSelf();
        if (allInfosNotWithSelf == null || allInfosNotWithSelf.isEmpty()) {
            return;
        }
        Iterator<UserInfos> it2 = allInfosNotWithSelf.iterator();
        while (it2.hasNext()) {
            if (!BFCallback.getHMLoginManager().isAdult(Birthday.fromStr(it2.next().getBirthday()).getAge())) {
                BFCallback.getAppUtils().showDeleteAllMemberDataRequestDialog(this, new WeightGrantRequestDialogLis() { // from class: ot8
                    @Override // com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis
                    public final void requestResult(boolean z) {
                        WeightResultActivity.D(this.a, z);
                    }
                });
                return;
            }
        }
    }

    public final void refreshChart(@NotNull List<? extends WeightInfos> weightInfos) {
        this.mData = getType() == this.TYPE_WEIGHT ? BFTransToChartUtil.getInstance().createWeightData(weightInfos) : BFTransToChartUtil.getInstance().createBfatWeightData((List<WeightInfos>) weightInfos);
        u();
        getMyChartContainer().post(new Runnable() { // from class: rt8
            @Override // java.lang.Runnable
            public final void run() {
                WeightResultActivity.E(this.a);
            }
        });
    }

    public final void resetCurrentIndex() {
        this.mCurrentIndex = -1;
    }

    public final void scaleChart(boolean isNormal) {
        ChartDataList chartDataList = this.mData;
        if (chartDataList != null) {
            chartDataList.setShownCount(isNormal ? this.MIN_COUNT : this.MAX_COUNT);
        }
        u();
        HMChart chart = getMChartProvider().getChart() != null ? getMChartProvider().getChart() : null;
        if (chart == null) {
            return;
        }
        chart.setScaleFactorX(isNormal ? 1.0f : 0.75f);
    }

    public final void setMChartProvider(@NotNull ChartProvider chartProvider) {
        this.mChartProvider = chartProvider;
    }

    public final void setMCurrentIndex(int i) {
        this.mCurrentIndex = i;
    }

    public final void setMData(@Nullable ChartDataList chartDataList) {
        this.mData = chartDataList;
    }

    public final void showDelDialog(@NotNull final WeightInfos delWeightInfo) {
        int i;
        HMLog.i(this.TAG, Intrinsics.stringPlus("del time = ", DateFormat.format("yyyy-MM-dd HH:mm:ss", delWeightInfo.getTimestamp().longValue())), new Object[0]);
        if (getType() == this.TYPE_BODYFAT) {
            i = R.string.bodyfat_3_del_title_tips;
        } else {
            i = delWeightInfo.getBody_fat() == null ? R.string.weight_delete_title : R.string.weight_delete_with_bf;
        }
        new AlertDialogFragment.Builder(this).setCancelable(true).setMessage(i).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: lt8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                WeightResultActivity.F(this.a, delWeightInfo, dialogInterface, i2);
            }
        }).show(getSupportFragmentManager());
    }

    public final void showScaleTokenInvalidDialog() {
        BodyFatSp.INSTANCE.setScaleTokenRemindTime(this, System.currentTimeMillis());
        new AlertDialogFragment.Builder(this).setTitle(getString(R.string.tips_title_scale_wifi_outdate)).setMessage(getString(R.string.tips_content_scale_wifi_outdate)).setPositiveButton(getString(R.string.never_reminder), new DialogInterface.OnClickListener() { // from class: kt8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                WeightResultActivity.G(this.a, dialogInterface, i);
            }
        }).setNegativeButton(getString(R.string.i_know), (DialogInterface.OnClickListener) null).setCancelable(false).show(getSupportFragmentManager());
    }

    public abstract void updateByGdpr();
}
