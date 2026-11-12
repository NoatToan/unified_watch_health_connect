package com.xiaomi.hm.health.bodyfat.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.chenenyu.router.annotation.Route;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.listener.IScrollListener;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.LineJoinStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.view.weightfigure.WeightFigureView;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.event.EventFromServerWeightInfos;
import com.xiaomi.hm.health.bodyfat.event.EventOneFootChanged;
import com.xiaomi.hm.health.bodyfat.event.EventWeightChanged;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.model.Birthday;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.BFTransToChartUtil;
import com.xiaomi.hm.health.bodyfat.utils.BodyFatTimeUtils;
import com.xiaomi.hm.health.bodyfat.utils.ConstraintUtil;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.OneFootUtils;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import com.xiaomi.hm.health.bodyfat.view.SDAdaptiveTextView;
import com.xiaomi.hm.health.bodyfat.view.WeightLoadingStatus;
import com.xiaomi.hm.health.bodyfat.view.WeightUserQuickPicker;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import de.greenrobot.event.EventBus;
import defpackage.jc4;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes19.dex */
@Route({RouterHelper.BALANCE_PATH})
public class OneFootDetailActivity extends BaseTitleActivity implements View.OnClickListener {
    public static final String IS_GUEST = "IS_GUEST";
    private static final String W = OneFootDetailActivity.class.getSimpleName();
    private static final long X = -1000;
    private static final int Y = 6;
    private static final int Z = 178;
    private static final int m0 = 127;
    private static final int n0 = 51;
    private static final int o0 = 17;
    private static final int p0 = 0;
    private ChartProvider C;
    private ChartDataList D;
    private WeightUserQuickPicker E;
    private WeightFigureView F;
    private RelativeLayout G;
    private TextView H;
    private View I;
    private TextView J;
    private TextView K;
    private View L;
    private RelativeLayout M;
    private RelativeLayout N;
    private RelativeLayout O;
    private boolean P;
    private long U;
    private WeightInfos V;
    private Context x = this;
    private long y = -1;
    private List<UserInfos> z = new ArrayList();
    private List<Long> A = new ArrayList();
    private int B = -1;
    private ViewGroup Q = null;
    private ViewGroup R = null;
    private WeightLoadingStatus S = null;
    private boolean T = true;

    public class a extends Subscriber<Void> {
        public final /* synthetic */ long f;
        public final /* synthetic */ UserInfos g;

        public a(long j, UserInfos userInfos) {
            this.f = j;
            this.g = userInfos;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c(Throwable th) {
            return "同步数据失败： " + th.getMessage();
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Void r1) {
            OneFootDetailActivity.this.startLoading();
        }

        @Override // rx.Observer
        public void onCompleted() {
            OneFootDetailActivity.this.S();
            int oftInfosCount = WeightInfoManager.getManager().getOftInfosCount(this.f);
            OneFootDetailActivity.this.B = oftInfosCount == 0 ? 0 : oftInfosCount - 1;
            OneFootDetailActivity.this.T(this.g);
        }

        @Override // rx.Observer
        public void onError(final Throwable th) {
            HMLog.warn(OneFootDetailActivity.W, new Function0() { // from class: com.xiaomi.hm.health.bodyfat.activity.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OneFootDetailActivity.a.c(th);
                }
            });
            OneFootDetailActivity.this.R();
        }
    }

    public class b extends HMWeightUtils.SyncCallback {
        public final /* synthetic */ Subscriber a;

        public b(Subscriber subscriber) {
            this.a = subscriber;
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils.SyncCallback
        public void onCancel() {
            OneFootDetailActivity.this.T = true;
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils.SyncCallback
        public void onFailure() {
            this.a.onError(new Throwable());
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils.SyncCallback
        public void onStart() {
            OneFootDetailActivity.this.T = false;
            this.a.onNext(null);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils.SyncCallback
        public void onSuccess() {
            this.a.onCompleted();
        }
    }

    public class c extends ChartProvider.StatisChartProvider {
        public final /* synthetic */ long a;

        public c(long j) {
            this.a = j;
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartContainer */
        public ViewGroup getChartContainerViewGroup() {
            return OneFootDetailActivity.this.G;
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartDataList */
        public ChartDataList getDataList() {
            return OneFootDetailActivity.this.D;
        }

        @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
        public Index getCurrentIndex() {
            int size = WeightInfoManager.getManager().getLatestOftInfos(this.a).size();
            if (OneFootDetailActivity.this.B < 0) {
                OneFootDetailActivity.this.B = size == 0 ? 0 : size - 1;
            }
            return new Index(OneFootDetailActivity.this.B, new BaseIndex(OneFootDetailActivity.this.B));
        }

        @Override // com.huami.chart.chart.IChartProvider
        public DrawConfig getDrawConfig() {
            return OneFootDetailActivity.this.H();
        }

        @Override // com.huami.chart.chart.IChartProvider
        public RenderConfig getRenderConfig() {
            return OneFootDetailActivity.this.I();
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ long a;

        public class a implements IScrollListener {
            public a() {
            }

            @Override // com.huami.chart.listener.IScrollListener
            public /* synthetic */ void offset(float f) {
                jc4.a(this, f);
            }

            @Override // com.huami.chart.listener.IScrollListener
            public void onScrollCurrentIndex(Index index) {
            }

            @Override // com.huami.chart.listener.IScrollListener
            public void onStartIndex(Index index) {
            }

            @Override // com.huami.chart.listener.IScrollListener
            public void onStopIndex(Index index) {
                HMLog.d(OneFootDetailActivity.W, "onScrollStopCurrentIndex " + index, new Object[0]);
                if (OneFootDetailActivity.this.P) {
                    OneFootDetailActivity.this.P = false;
                    return;
                }
                OneFootDetailActivity.this.B = index.getDataIndex();
                if (OneFootDetailActivity.this.B == -1) {
                    return;
                }
                UserInfos info = UserInfoManager.getManager().getInfo(d.this.a);
                List<WeightInfos> latestOftInfos = WeightInfoManager.getManager().getLatestOftInfos(d.this.a);
                if (latestOftInfos == null || latestOftInfos.size() <= 0 || index.getDataIndex() >= latestOftInfos.size()) {
                    return;
                }
                OneFootDetailActivity.this.U(latestOftInfos.get(index.getDataIndex()), info, index.getDataIndex());
            }
        }

        public d(long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            OneFootDetailActivity.this.C.getChart().setIScrollListener(new a());
        }
    }

    private boolean G(int i) {
        if (i >= 20 && i <= 69) {
            this.L.setVisibility(0);
            this.I.setVisibility(8);
            W();
            return true;
        }
        this.J.setText("--");
        this.L.setVisibility(8);
        String quantityString = getResources().getQuantityString(R.plurals.too_young_for_calculate, 20, 20);
        String quantityString2 = getResources().getQuantityString(R.plurals.too_old_for_calculate, 69, 69);
        TextView textView = this.H;
        if (i >= 20) {
            quantityString = quantityString2;
        }
        textView.setText(quantityString);
        this.I.setVisibility(0);
        W();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DrawConfig H() {
        return new DrawConfig.Builder(this.x).setDataMarginTop(ChartUtil.dp2px(this.x, 20.0f)).setDataWidth(ChartUtil.dp2px(this.x, 58.8f)).setCanvasHeight(this.G.getMeasuredHeight()).setCanvasWidth(this.G.getMeasuredWidth()).setDataMarginBottom(ChartUtil.dp2px(this.x, 10.0f)).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RenderConfig I() {
        int color = ContextCompat.getColor(this, R.color.weight_curve_shadow_origin_color);
        return new RenderConfig.Builder().setLineJoinStyle(new LineJoinStyle.Builder(this.x).setLineJointColor(ContextCompat.getColor(this, R.color.weight_curve_line_dot_color)).setLineJointStyle(8).setLineJointSize(ChartUtil.dp2px(this.x, 1.5f)).create()).setLineStyle(new LineStyle.Builder(this.x).setLineStyle(4).setLineWidth(ChartUtil.dp2px(this.x, 1.6f)).setLineColor(ContextCompat.getColor(this.x, R.color.weight_curve_line_color)).setShadowColors(new int[]{color, ColorUtils.setAlphaComponent(color, 178), ColorUtils.setAlphaComponent(color, 127), ColorUtils.setAlphaComponent(color, 51), ColorUtils.setAlphaComponent(color, 17), ColorUtils.setAlphaComponent(color, 0), 0}).create()).create();
    }

    private void J(boolean z) {
        if (z) {
            this.O.setEnabled(true);
            this.O.setAlpha(1.0f);
        } else {
            this.O.setEnabled(false);
            this.O.setAlpha(0.4f);
        }
    }

    private long K(Intent intent) {
        long j;
        long j2 = Long.parseLong(BFCallback.getHMPersonInfo().getUserid());
        try {
            j = Long.parseLong(intent.getStringExtra(BFConstant.KEY_UID));
        } catch (Exception unused) {
            j = j2;
        }
        return !L(j) ? j2 : j;
    }

    private boolean L(long j) {
        return UserInfoManager.getManager().getInfo(j) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String M(Float f) {
        int iIntValue = f.intValue();
        return getResources().getQuantityString(R.plurals.one_foot_time_seconds, iIntValue, Integer.valueOf(iIntValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit N(String[] strArr, Float f, Integer num) {
        this.K.setText(getString(R.string.one_foot_score_level, new Object[]{strArr[num.intValue()]}));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(WeightInfos weightInfos, DialogInterface dialogInterface, int i) {
        boolean z;
        Analytics.event(this.x, StatEvent.WEIGHT_DEL);
        try {
            HMLog.d(W, "delete weight : " + weightInfos, new Object[0]);
            WeightInfoManager.getManager().deleteInfo(weightInfos);
            z = true;
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        if (z) {
            EventBus.getDefault().post(new EventWeightChanged(this.y, 5));
            int i2 = this.B;
            if (i2 == 0) {
                this.B = 0;
            } else {
                this.B = i2 - 1;
            }
            HMLog.d(W, "del after mCurrentIndex = " + this.B, new Object[0]);
            WeightInfos oftRecordByIndex = WeightInfoManager.getManager().getOftRecordByIndex(this.y, this.B);
            this.P = true;
            refreshChartView(this.y, true);
            U(oftRecordByIndex, UserInfoManager.getManager().getInfo(this.y), this.B);
            EventBus.getDefault().post(new EventOneFootChanged());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(long j, Subscriber subscriber) {
        WeightInfoManager.getManager().syncInfosWithServer(j, new b(subscriber));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(View view, UserInfos userInfos, int i) {
        if (userInfos != null) {
            this.P = true;
            HMLog.d(W, "select user = " + userInfos.getName(), new Object[0]);
            if (Long.parseLong(userInfos.getUserId()) == X) {
                Analytics.event(this.x, StatEvent.WEIGHT_DETAIL, "ManageMembers");
                goToFamilyManagerActivity();
            } else {
                this.y = Long.parseLong(this.z.get(i).getUserId());
                a0(this.z.get(i));
            }
            this.E.setSelection(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        this.R.setVisibility(4);
        this.Q.setVisibility(4);
        this.G.setVisibility(4);
        this.S.setVisibility(0);
        this.S.loadingFailed();
        X(false);
        getRightImage().setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        this.R.setVisibility(0);
        this.Q.setVisibility(0);
        this.G.setVisibility(0);
        this.S.setVisibility(4);
        this.S.stopLoading();
        X(true);
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            getRightImage().setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(UserInfos userInfos) {
        if (this.y != Long.parseLong(userInfos.getUserId())) {
            return;
        }
        refreshChartView(this.y, true);
        int oftInfosCount = WeightInfoManager.getManager().getOftInfosCount(this.y) - 1;
        if (oftInfosCount >= 0) {
            U(WeightInfoManager.getManager().getLatestOftInfos(this.y).get(oftInfosCount), userInfos, oftInfosCount);
        } else {
            this.J.setText("--");
            this.L.setVisibility(8);
            this.I.setVisibility(0);
            this.H.setText(R.string.oft_has_no_data);
            V(userInfos, null);
            W();
        }
        J(oftInfosCount >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(WeightInfos weightInfos, UserInfos userInfos, int i) {
        this.V = weightInfos;
        V(userInfos, weightInfos);
        int age = Birthday.fromStr(userInfos.getBirthday()).getAge();
        ChartDataList chartDataList = this.D;
        float sumValue = chartDataList != null ? chartDataList.getDataByDataIndex(i).getSumValue() : 0.0f;
        if (G(age)) {
            float[] maxTimeArray = OneFootUtils.getMaxTimeArray(age, userInfos.getGender().intValue());
            final String[] oneFootFigureLables = HMWeightUtils.getOneFootFigureLables(this.x);
            int[] mifitOneFootScoreColors = HMWeightUtils.getMifitOneFootScoreColors(this.x);
            this.F.setValues(maxTimeArray, mifitOneFootScoreColors, oneFootFigureLables, mifitOneFootScoreColors);
            this.F.setInitValue(sumValue >= maxTimeArray[maxTimeArray.length + (-2)] ? HMWeightUtils.elasticValue(sumValue, maxTimeArray[maxTimeArray.length - 2], maxTimeArray[maxTimeArray.length - 1]) : sumValue);
            this.F.setValueIndexListener(new Function2() { // from class: dk5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return this.a.N(oneFootFigureLables, (Float) obj, (Integer) obj2);
                }
            });
        }
        this.J.setText(String.format(Locale.getDefault(), "%.1f", Float.valueOf(sumValue)));
    }

    private void V(UserInfos userInfos, WeightInfos weightInfos) {
        if (userInfos != null) {
            if (weightInfos == null) {
                if (HMWeightUtils.length(userInfos.getName()) <= 18) {
                    setTitleText(userInfos.getName());
                    return;
                }
                setTitleText(userInfos.getName().substring(0, 8) + "..");
                return;
            }
            if (HMWeightUtils.length(userInfos.getName()) > 18) {
                setTitleText(userInfos.getName().substring(0, 8) + ".. " + BodyFatTimeUtils.INSTANCE.formatDateTime_no_y((Context) this, weightInfos.getTimestamp().longValue(), false));
                return;
            }
            setTitleText(userInfos.getName() + " " + BodyFatTimeUtils.INSTANCE.formatDateTime_no_y((Context) this, weightInfos.getTimestamp().longValue(), false));
        }
    }

    private void W() {
        if (this.I.getVisibility() == 0) {
            ConstraintUtil.ConstraintBegin constraintBeginBegin = new ConstraintUtil((ConstraintLayout) findViewById(R.id.constraint_layout)).begin();
            int i = R.id.card_status;
            constraintBeginBegin.Top_toBottomOf(i, R.id.line_split2);
            constraintBeginBegin.Top_toBottomOf(R.id.weight_body_type_ll, i);
            constraintBeginBegin.commit();
            LinearLayout linearLayout = (LinearLayout) findViewById(i);
            View childAt = linearLayout.getChildAt(0);
            if (childAt instanceof TextView) {
                return;
            }
            linearLayout.removeViewAt(0);
            linearLayout.addView(childAt, linearLayout.getChildCount());
            return;
        }
        ConstraintUtil.ConstraintBegin constraintBeginBegin2 = new ConstraintUtil((ConstraintLayout) findViewById(R.id.constraint_layout)).begin();
        int i2 = R.id.weight_body_type_ll;
        constraintBeginBegin2.Top_toBottomOf(i2, R.id.line_split2);
        int i3 = R.id.card_status;
        constraintBeginBegin2.Top_toBottomOf(i3, i2);
        constraintBeginBegin2.commit();
        LinearLayout linearLayout2 = (LinearLayout) findViewById(i3);
        int childCount = linearLayout2.getChildCount() - 1;
        View childAt2 = linearLayout2.getChildAt(childCount);
        if (childAt2 instanceof TextView) {
            return;
        }
        linearLayout2.removeViewAt(childCount);
        linearLayout2.addView(childAt2, 0);
    }

    private void X(boolean z) {
        this.M.setEnabled(z);
        this.N.setEnabled(z);
        this.O.setEnabled(z);
        this.M.setAlpha(z ? 1.0f : 0.4f);
        this.N.setAlpha(z ? 1.0f : 0.4f);
        this.O.setAlpha(z ? 1.0f : 0.4f);
    }

    private void Y() {
        String weightDeviceSyncTimeForDisplay = HMWeightUtils.getWeightDeviceSyncTimeForDisplay(this);
        if (TextUtils.isEmpty(weightDeviceSyncTimeForDisplay)) {
            return;
        }
        setSubTitleText(getString(R.string.weight_sync_time, new Object[]{weightDeviceSyncTimeForDisplay}));
    }

    private void Z() {
        final WeightInfos weightInfos = this.V;
        HMLog.d(W, "del time = " + ((Object) DateFormat.format("yyyy-MM-dd HH:mm:ss", weightInfos.getTimestamp().longValue())), new Object[0]);
        new AlertDialogFragment.Builder(this).setCancelable(true).setMessage(R.string.one_foot_delete_title).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: ak5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.O(weightInfos, dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void a0(UserInfos userInfos) {
        final long j = Long.parseLong(userInfos.getUserId());
        this.P = true;
        if (this.A.contains(Long.valueOf(j))) {
            startLoading();
        } else {
            this.A.add(Long.valueOf(j));
            Observable.create(new Observable.OnSubscribe() { // from class: ek5
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.P(j, (Subscriber) obj);
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Subscriber) new a(j, userInfos));
        }
    }

    private void b0() {
        this.z.clear();
        UserInfos info = UserInfoManager.getManager().getInfo(-1L);
        String str = W;
        HMLog.d(str, "selfUser = " + HMWeightUtils.parserUserInfos(info), new Object[0]);
        this.z.add(0, info);
        List<UserInfos> allInfosNotWithSelf = UserInfoManager.getManager().getAllInfosNotWithSelf();
        HMLog.i(str, "familyUserList size = " + (allInfosNotWithSelf == null ? 0 : allInfosNotWithSelf.size()), new Object[0]);
        if (allInfosNotWithSelf != null && allInfosNotWithSelf.size() > 0) {
            this.z.addAll(allInfosNotWithSelf);
        }
        for (int i = 0; i < 6; i++) {
            UserInfos userInfos = new UserInfos();
            userInfos.setName(getString(R.string.family_manager));
            userInfos.setUserId(String.valueOf(X - ((long) i)));
            if (i == 0) {
                List<UserInfos> list = this.z;
                list.add(list.size(), userInfos);
            } else if (i < 4) {
                this.z.add(0, userInfos);
            } else {
                this.z.add(userInfos);
            }
        }
        HMLog.d(W, "userlist.size() = " + this.z.size(), new Object[0]);
        this.E.bindUsers(this.z);
        WeightUserQuickPicker weightUserQuickPicker = this.E;
        weightUserQuickPicker.setSelection(weightUserQuickPicker.getSelection(this.y));
        this.E.setOnUserItemClickListener(new WeightUserQuickPicker.OnUserItemClickListener() { // from class: bk5
            @Override // com.xiaomi.hm.health.bodyfat.view.WeightUserQuickPicker.OnUserItemClickListener
            public final void onClick(View view, UserInfos userInfos2, int i2) {
                this.a.Q(view, userInfos2, i2);
            }
        });
    }

    private boolean checkDelete() {
        return WeightInfoManager.getManager().getOftInfosCount(this.y) > 1;
    }

    private void goToFamilyManagerActivity() {
        if (UserInfoManager.getManager().getAllInfosCount() - 1 > 0) {
            startActivity(new Intent(this, (Class<?>) FamilyListActivity.class));
            return;
        }
        Intent intent = new Intent(this, (Class<?>) WeightMemberDetailActivity.class);
        intent.putExtra(BFConstant.KET_ADD_NEW, true);
        startActivity(intent);
    }

    private void initView() {
        this.E = (WeightUserQuickPicker) findViewById(R.id.user_picker);
        this.G = (RelativeLayout) findViewById(R.id.chart_container);
        this.H = (TextView) findViewById(R.id.tx_no_score);
        this.I = findViewById(R.id.rl_no_score);
        this.J = (TextView) findViewById(R.id.one_foot_value_tv);
        this.L = findViewById(R.id.rl_has_score);
        this.K = (TextView) findViewById(R.id.tx_score_level);
        int i = R.id.delete_ll;
        this.O = (RelativeLayout) findViewById(i);
        int i2 = R.id.measure_ll;
        this.M = (RelativeLayout) findViewById(i2);
        int i3 = R.id.guest_ll;
        this.N = (RelativeLayout) findViewById(i3);
        findViewById(i).setOnClickListener(this);
        findViewById(i3).setOnClickListener(this);
        findViewById(i2).setOnClickListener(this);
        this.R = (ViewGroup) findViewById(R.id.weight_rl);
        this.S = (WeightLoadingStatus) findViewById(R.id.loading_status);
        this.Q = (ViewGroup) findViewById(R.id.weight_body_type_ll);
        WeightFigureView weightFigureView = (WeightFigureView) findViewById(R.id.one_foot_figure_view);
        this.F = weightFigureView;
        weightFigureView.setThumbDarkStyle(this);
        this.F.setLanguageNormal(Language.isChinese());
        this.F.setCenterLabel(true);
        this.F.setLabelTextSize(12.0f);
        this.F.setScaleTextSize(11.0f);
        this.F.setScaleTextColor(ContextCompat.getColor(this, R.color.s2));
        this.F.setTypeface(TypefaceManager.get().getTypeface(this.x, Font.KM));
        this.F.setListener(new Function1() { // from class: ck5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.M((Float) obj);
            }
        });
        this.C = new ChartProvider(this.x, true);
        if (!BFCallback.getHMDeviceManager().isSupportOneFoot()) {
            findViewById(i3).setVisibility(8);
            findViewById(i2).setVisibility(8);
        }
        TextView textView = (TextView) findViewById(R.id.card_status_title);
        SDAdaptiveTextView sDAdaptiveTextView = (SDAdaptiveTextView) findViewById(R.id.card_status_introduce);
        textView.setText(R.string.card_intro_balance_title);
        sDAdaptiveTextView.setText(R.string.card_intro_balance_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLoading() {
        this.R.setVisibility(4);
        this.Q.setVisibility(4);
        this.G.setVisibility(4);
        this.S.setVisibility(0);
        this.S.startLoading();
        X(false);
        getRightImage().setVisibility(4);
    }

    public static void startMe(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) OneFootDetailActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(BFConstant.KEY_UID, str);
        }
        context.startActivity(intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.delete_ll) {
            if (checkDelete()) {
                Z();
                return;
            } else {
                CustomToast.makeText(getApplicationContext(), R.string.cannot_delete, 1).show();
                return;
            }
        }
        if (view.getId() == R.id.measure_ll) {
            WeightConnectActivity.startMe(this, false);
        } else if (view.getId() == R.id.guest_ll) {
            AddGuestActivity.INSTANCE.startMe(this, 1);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        HMLog.d(W, "onCreate", new Object[0]);
        setContentView(R.layout.activity_one_foot_detail);
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            BFTitleStyleKt.setTitleStyle(this, null, null, BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this.x, R.color.scale_detail_bg_end_color), true);
        } else {
            BFTitleStyleKt.setTitleStyle(this, null, null, BaseTitleActivity.STYLE.BACK_DOUBLE_TITLE_SHARE, ContextCompat.getColor(this.x, R.color.scale_detail_bg_end_color), true);
            getRightImage().setVisibility(8);
        }
        setBaseTitleColor(ContextCompat.getColor(this, R.color.weight_detail_title_color), ContextCompat.getColor(this, R.color.weight_detail_sub_title_color));
        initView();
        Y();
        this.y = K(getIntent());
        EventBus.getDefault().register(this);
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            return;
        }
        Analytics.recordEvent(new CountEventBuilder("DETAIL_BALANCE_V").setAnonymous(false).setIdentified(true));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(EventFromServerWeightInfos eventFromServerWeightInfos) {
        long userId = eventFromServerWeightInfos.getUserId();
        boolean zIsSuccess = eventFromServerWeightInfos.isSuccess();
        this.A.remove(Long.valueOf(userId));
        if (this.T && zIsSuccess) {
            S();
            T(UserInfoManager.getManager().getInfo(eventFromServerWeightInfos.getUserId()));
        }
        this.T = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        HMLog.d(W, "OnNewIntent", new Object[0]);
        super.onNewIntent(intent);
        this.y = K(intent);
        this.B = -1;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.U = System.currentTimeMillis() - this.U;
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            return;
        }
        Analytics.recordEvent(new CalculationEventBuilder("DETAIL_BALANCE_T", this.U).setAnonymous(true).setIdentified(true).addExtra("time", String.valueOf(this.U)));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!L(this.y)) {
            this.y = Long.parseLong(BFCallback.getHMPersonInfo().getUserid());
            this.B = -1;
        }
        T(UserInfoManager.getManager().getInfo(this.y));
        b0();
        this.U = System.currentTimeMillis();
    }

    public void refreshChartView(long j, boolean z) {
        HMLog.d(W, "refreshChartView", new Object[0]);
        this.D = BFTransToChartUtil.getInstance().createOfmtWeightData(j);
        this.C.createChart(new c(j), true, true, true);
        this.G.post(new d(j));
    }
}
