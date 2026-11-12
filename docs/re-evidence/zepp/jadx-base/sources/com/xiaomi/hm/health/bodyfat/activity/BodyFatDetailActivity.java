package com.xiaomi.hm.health.bodyfat.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.text.TextUtilsCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.chenenyu.router.annotation.Route;
import com.google.android.material.badge.BadgeDrawable;
import com.huami.lib.view.text.UnitTextView;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.BodyFatDetailActivity;
import com.xiaomi.hm.health.bodyfat.fragment.AdultBodyIndexFragment;
import com.xiaomi.hm.health.bodyfat.fragment.ChildBodyIndexFragment;
import com.xiaomi.hm.health.bodyfat.fragment.HeartRatePressureFragment;
import com.xiaomi.hm.health.bodyfat.fragment.RecentBodyChangeFragment;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoRepository;
import com.xiaomi.hm.health.bodyfat.model.WeightInfoWithoutOwner;
import com.xiaomi.hm.health.bodyfat.share.WeightShare;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.BFKeeper;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.BodyFatTimeUtils;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.ConstraintUtil;
import com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import com.xiaomi.hm.health.bodyfat.utils.Utils;
import com.xiaomi.hm.health.bodyfat.view.PopWindowNoOwnerData;
import com.xiaomi.hm.health.bodyfat.view.SDAdaptiveTextView;
import com.xiaomi.hm.health.bodyfat.view.SlidingConflictScrollView;
import com.xiaomi.hm.health.bodyfat.view.WeightLoadingStatus;
import com.xiaomi.hm.health.bodyfat.view.WeightUserQuickPicker;
import com.xiaomi.hm.health.bodyfat.viewmodel.BodyFatDetailsViewModel;
import com.xiaomi.hm.health.bodyfat.viewmodel.WeightDetailViewModel;
import com.xiaomi.hm.health.bodyfat.viewmodel.WeightRecordWithoutOwnerViewModel;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Route({RouterHelper.BODY_SCORE_PATH})
public class BodyFatDetailActivity extends WeightResultActivity implements View.OnClickListener {
    private static final String Z = BodyFatDetailActivity.class.getSimpleName();
    private static final int m0 = 2;
    private RelativeLayout L;
    private TextView M;
    private UnitTextView N;
    private LinearLayout O;
    private TextView P;
    private RelativeLayout Q;
    private WeightLoadingStatus R;
    private BodyFatDetailsViewModel S;
    private AdultBodyIndexFragment T;
    private ChildBodyIndexFragment U;
    private WeightDetailViewModel V;
    private WeightRecordWithoutOwnerViewModel W;
    private WeightUserQuickPicker X;
    private PopWindowNoOwnerData Y;

    public class a implements Observer<List<UserInfos>> {
        public a() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(List<UserInfos> list) {
            BodyFatDetailActivity.this.X.bindUsers(BodyFatDetailActivity.this.dealUserList(list));
            if (BodyFatDetailActivity.this.checkUidValid()) {
                BodyFatDetailActivity.this.X.setSelection(BodyFatDetailActivity.this.X.getSelection(BodyFatDetailActivity.this.getUid()));
            } else {
                BodyFatDetailActivity.this.X.setSelectionUser(BodyFatDetailActivity.this.S().longValue());
            }
        }
    }

    public class b implements Observer<List<WeightInfos>> {
        public b() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(List<WeightInfos> list) {
            int mCurrentIndex = BodyFatDetailActivity.this.getMCurrentIndex();
            if (mCurrentIndex < 0 || mCurrentIndex >= list.size()) {
                mCurrentIndex = list.size() == 0 ? -1 : list.size() - 1;
                BodyFatDetailActivity.this.setMCurrentIndex(mCurrentIndex);
            }
            BodyFatDetailActivity.this.refreshChart(list);
            BodyFatDetailActivity.this.f0(list.size() == 0 ? null : list.get(mCurrentIndex));
        }
    }

    public class c implements Observer<WeightInfoWithoutOwner> {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BodyFatDetailActivity.this.Y == null) {
                    BodyFatDetailActivity.this.Y = new PopWindowNoOwnerData(BodyFatDetailActivity.this);
                }
                int titleBarHeightDefault = BodyFatDetailActivity.this.getTitleBarHeightDefault() + BaseTitleActivity.getStatusBarHeight(BodyFatDetailActivity.this);
                if (BodyFatDetailActivity.this.getRight2().getWindowToken() != null) {
                    if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                        BodyFatDetailActivity.this.Y.showAtLocation(BodyFatDetailActivity.this.getRight2(), BadgeDrawable.TOP_START, 0, titleBarHeightDefault);
                    } else {
                        BodyFatDetailActivity.this.Y.showAtLocation(BodyFatDetailActivity.this.getRight2(), BadgeDrawable.TOP_END, 0, titleBarHeightDefault);
                    }
                }
            }
        }

        public c() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(WeightInfoWithoutOwner weightInfoWithoutOwner) {
            if (ExtentionUtilsKt.millsToSecond(weightInfoWithoutOwner.getCreateTime(), false) > ((Long) BFKeeper.getValue(BFKeeper.WITHOUT_OWNER_REMIND_TIME, 0L)).longValue()) {
                BodyFatDetailActivity.this.getRight2().post(new a());
            }
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ SDAdaptiveTextView a;

        public d(SDAdaptiveTextView sDAdaptiveTextView) {
            this.a = sDAdaptiveTextView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.setText(R.string.card_intro_body_sorce_info);
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (BodyFatDetailActivity.this.Y != null && BodyFatDetailActivity.this.Y.isShowing()) {
                BodyFatDetailActivity.this.Y.dismiss();
            }
            BodyFatDetailActivity.this.startActivity(new Intent(BodyFatDetailActivity.this, (Class<?>) WeightRecordWithoutOwnerActivity.class));
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BodyFatDetailActivity bodyFatDetailActivity = BodyFatDetailActivity.this;
            bodyFatDetailActivity.startActivity(WeightDetailActivity.getIntentWithParams(bodyFatDetailActivity, String.valueOf(bodyFatDetailActivity.getUid()), false, false));
        }
    }

    private WeightShare P() {
        if (this.S.getSelectWeightInfo().getValue() == null) {
            return null;
        }
        String unitStr = HMWeightUtils.toUnitStr(getApplicationContext(), BFCallback.getUnitManager().getWeightUnit());
        WeightShare weightShare = new WeightShare();
        weightShare.setUserid(getUid());
        weightShare.setWeightUnitStr(unitStr);
        weightShare.setWeightTime(this.S.getSelectWeightInfo().getValue().getTimestamp().longValue());
        float fFloatValue = this.S.getSelectWeightInfo().getValue().getWeight().floatValue();
        WeightInfos latestInfoBeforeTime = WeightInfoRepository.INSTANCE.getInstance().getLatestInfoBeforeTime(getUid(), this.S.getSelectWeightInfo().getValue().getTimestamp().longValue());
        float fFloatValue2 = latestInfoBeforeTime != null ? fFloatValue - latestInfoBeforeTime.getWeight().floatValue() : 0.0f;
        weightShare.setType(1);
        weightShare.setCompareValue(String.valueOf(fFloatValue2));
        weightShare.setWeightValue(HMWeightUtils.getWeightValueStringForDisplay(fFloatValue, BFCallback.getUnitManager().getWeightUnit()));
        if (this.S.getSelectWeightInfo().getValue().getBody_fat() != null) {
            weightShare.setBodyFat(String.valueOf(HMWeightUtils.scaleFloatToDown(this.S.getSelectWeightInfo().getValue().getBody_fat().floatValue(), 1)));
        } else {
            weightShare.setBodyFat("--");
        }
        String string = getString(R.string.empty_value);
        if (this.T.isAdded()) {
            string = this.T.getShareShapeStr();
        }
        weightShare.setFigure(string);
        weightShare.setScore(this.S.getSelectWeightInfo().getValue().getScore() == null ? 0 : this.S.getSelectWeightInfo().getValue().getScore().intValue());
        HMLog.d(Z, "weightShare : " + weightShare.toString(), new Object[0]);
        return weightShare;
    }

    private void Q(int i) {
        WeightInfos weightInfos;
        List<WeightInfos> bodyFatInfosAsc = WeightInfoManager.getManager().getBodyFatInfosAsc(getUid());
        if (bodyFatInfosAsc == null || bodyFatInfosAsc.size() <= 0 || i >= bodyFatInfosAsc.size() || (weightInfos = bodyFatInfosAsc.get(i)) == null) {
            return;
        }
        f0(weightInfos);
    }

    private boolean R(int i, int i2) {
        int count = getMData() != null ? getMData().getCount() : 0;
        SlidingConflictScrollView slidingConflictScrollView = (SlidingConflictScrollView) findViewById(R.id.scroll_view_bodyfat);
        if (i < 6 || i > 99) {
            slidingConflictScrollView.scrollTo(0, 0);
            slidingConflictScrollView.setScrollable(true);
            this.N.setValue("--", "");
            this.O.setVisibility(8);
            this.P.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, ContextCompat.getDrawable(this, R.drawable.bf3_littil_baby), (Drawable) null, (Drawable) null);
            this.P.setText(i < 6 ? R.string.bodyfat_3_empty_too_young : R.string.bodyfat_3_empty_too_old);
            this.P.setVisibility(0);
            this.P.setTag(Boolean.TRUE);
            b0();
            this.M.setVisibility(4);
            return false;
        }
        if (i2 > 220 || i2 < 90) {
            slidingConflictScrollView.scrollTo(0, 0);
            slidingConflictScrollView.setScrollable(true);
            this.N.setValue("--", "");
            this.O.setVisibility(8);
            this.P.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, ContextCompat.getDrawable(this, R.drawable.bf3_littil_baby), (Drawable) null, (Drawable) null);
            this.P.setText(i2 < 90 ? R.string.bodyfat_3_empty_too_short : R.string.bodyfat_3_empty_too_high);
            this.P.setVisibility(0);
            this.P.setTag(Boolean.TRUE);
            b0();
            this.M.setVisibility(4);
            return false;
        }
        if (count > 0) {
            slidingConflictScrollView.setScrollable(true);
            this.O.setVisibility(0);
            this.M.setVisibility(0);
            this.P.setVisibility(8);
            this.P.setTag(Boolean.FALSE);
            b0();
            return true;
        }
        slidingConflictScrollView.scrollTo(0, 0);
        slidingConflictScrollView.setScrollable(true);
        this.N.setValue("--", "");
        this.O.setVisibility(8);
        this.P.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, ContextCompat.getDrawable(this, R.drawable.bf3_baby_error), (Drawable) null, (Drawable) null);
        this.P.setText(R.string.bodyfat_3_empty_no_data);
        this.P.setVisibility(0);
        this.P.setTag(Boolean.TRUE);
        b0();
        this.M.setVisibility(4);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Long S() {
        return Long.valueOf(Utils.INSTANCE.toLongValue(BFCallback.getHMPersonInfo().getUserid(), 0L));
    }

    private boolean T(Intent intent) {
        long longValue = Utils.INSTANCE.toLongValue(intent.getStringExtra(BFConstant.KEY_UID), 0L);
        UserInfos info = UserInfoManager.getManager().getInfo(longValue);
        if (info == null) {
            this.V.getUid().setValue(S());
            info = UserInfoManager.getManager().getInfo(getUid());
        } else {
            this.V.getUid().setValue(Long.valueOf(longValue));
        }
        this.S.setUserInfos(info);
        HMLog.d(Z, "uid = " + getUid(), new Object[0]);
        return true;
    }

    private void U() {
        this.N.setVisibility(4);
    }

    private void V(Bundle bundle) {
        if (bundle == null) {
            RecentBodyChangeFragment.Companion companion = RecentBodyChangeFragment.INSTANCE;
            RecentBodyChangeFragment recentBodyChangeFragmentNewInstance = companion.newInstance(17);
            RecentBodyChangeFragment recentBodyChangeFragmentNewInstance2 = companion.newInstance(18);
            RecentBodyChangeFragment recentBodyChangeFragmentNewInstance3 = companion.newInstance(19);
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            if (BFCallback.getInstance().enableMiDongFlavor()) {
                fragmentTransactionBeginTransaction.add(R.id.hr_pressure_container, new HeartRatePressureFragment());
            }
            fragmentTransactionBeginTransaction.add(R.id.weight_change_container, recentBodyChangeFragmentNewInstance).add(R.id.bodyfat_change_container, recentBodyChangeFragmentNewInstance2).add(R.id.muscle_change_container, recentBodyChangeFragmentNewInstance3).commit();
        }
    }

    private void W() {
        BodyFatDetailsViewModel bodyFatDetailsViewModel = (BodyFatDetailsViewModel) ViewModelProviders.of(this).get(BodyFatDetailsViewModel.class);
        this.S = bodyFatDetailsViewModel;
        bodyFatDetailsViewModel.getSelectWeightInfo().observe(this, new Observer() { // from class: i30
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.Z((WeightInfos) obj);
            }
        });
        WeightDetailViewModel weightDetailViewModel = (WeightDetailViewModel) ViewModelProviders.of(this).get(WeightDetailViewModel.class);
        this.V = weightDetailViewModel;
        weightDetailViewModel.getUserInfos().observe(this, new a());
        this.V.getBodyfatInfos().observe(this, new b());
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            WeightRecordWithoutOwnerViewModel weightRecordWithoutOwnerViewModel = (WeightRecordWithoutOwnerViewModel) ViewModelProviders.of(this).get(WeightRecordWithoutOwnerViewModel.class);
            this.W = weightRecordWithoutOwnerViewModel;
            weightRecordWithoutOwnerViewModel.getLatestWeightInfoRecords().observe(this, new c());
            this.W.getLatestWeightInfoRecord();
        }
    }

    private boolean X() {
        return Locale.getDefault() == Locale.JAPAN || Locale.getDefault() == Locale.JAPANESE || Locale.getDefault().getLanguage() == Locale.JAPANESE.getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(View view, UserInfos userInfos, int i) {
        if (userInfos != null) {
            if (Long.parseLong(userInfos.getUserId()) == getLAST_USER_ID()) {
                Analytics.recordEvent(new CountEventBuilder(StatEvent.BF_OPERATION).setValue("ManageMembers"));
                goToFamilyManagerActivity();
                return;
            }
            Analytics.recordEvent(new CountEventBuilder(StatEvent.BF_VIEW_CLICK_MANAGER_NUM));
            resetCurrentIndex();
            this.V.getUid().setValue(Long.valueOf(Utils.INSTANCE.toLongValue(getUserList().get(i).getUserId(), 0L)));
            this.S.setUserInfos(getUserList().get(i));
            this.X.setSelection(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(WeightInfos weightInfos) {
        UserInfos info = UserInfoManager.getManager().getInfo(getUid());
        if (info == null) {
            return;
        }
        setTitleText(info.getName());
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        int weightAge = BodyParamsUtils.getWeightAge(weightInfos == null ? System.currentTimeMillis() : weightInfos.getTimestamp().longValue(), info.getBirthday());
        boolean zR = R(weightAge, ((weightInfos == null || weightInfos.getHeight() == null) ? info.getHeight() : weightInfos.getHeight()).intValue());
        c0(zR);
        getRightImage().setEnabled(zR);
        getRightImage().setImageAlpha(zR ? 255 : 120);
        if (zR) {
            if (weightInfos == null) {
                U();
                return;
            }
            String string = HMWeightUtils.getWeightValueStringForDisplay(weightInfos.getWeight().floatValue(), weightUnit) + " " + BFCallback.getUnitManager().getWeightUnitString(weightUnit);
            if (BFCallback.getInstance().enableMiDongFlavor()) {
                setSubTitleText(BodyFatTimeUtils.INSTANCE.formatDateTime_no_y((Context) this, weightInfos.getTimestamp().longValue(), false));
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                String string2 = "";
                if (BFCallback.getInstance().isInner() || BFCallback.getInstance().getChannel().equals("alpha")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("(阻抗: ");
                    sb2.append(weightInfos.getImpedance());
                    sb2.append(BodyParamsUtils.bodyParamValid(weightInfos) ? "" : ",计算有误");
                    sb2.append(")");
                    string2 = sb2.toString();
                }
                sb.append(string2);
                string = sb.toString();
            } else {
                if (HMWeightUtils.length(info.getName()) > 18) {
                    setTitleText(info.getName().substring(0, 8) + ".. " + TimeUtils.formatDateTime_no_y((Context) this, weightInfos.getTimestamp().longValue(), false));
                } else {
                    setTitleText(info.getName() + " " + TimeUtils.formatDateTime_no_y((Context) this, weightInfos.getTimestamp().longValue(), false));
                }
                d0();
            }
            this.M.setText(string);
            if (HMWeightUtils.isAgeMatch(weightAge)) {
                getSupportFragmentManager().beginTransaction().replace(R.id.body_index_container, this.U).commit();
            } else {
                getSupportFragmentManager().beginTransaction().replace(R.id.body_index_container, this.T).commit();
            }
            if (weightInfos.getSource() == null) {
                U();
            } else {
                e0(weightInfos.getScore());
                checkGoalFinish(weightInfos);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a0(int i, int i2, int i3) {
        return i + " , " + i2 + " , " + i3;
    }

    private void b0() {
        if (this.P.getVisibility() != 0) {
            int i = R.id.bf_empty_rl;
            findViewById(i).setVisibility(8);
            ConstraintUtil.ConstraintBegin constraintBeginBegin = new ConstraintUtil((ConstraintLayout) findViewById(R.id.bodyfat_content)).begin();
            constraintBeginBegin.Top_toBottomOf(i, R.id.layout_body_params_all_id);
            constraintBeginBegin.Top_toBottomOf(R.id.card_status, i);
            constraintBeginBegin.commit();
            return;
        }
        int i2 = R.id.bf_empty_rl;
        findViewById(i2).setVisibility(0);
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            return;
        }
        ConstraintUtil.ConstraintBegin constraintBeginBegin2 = new ConstraintUtil((ConstraintLayout) findViewById(R.id.bodyfat_content)).begin();
        int i3 = R.id.card_status;
        constraintBeginBegin2.Top_toBottomOf(i3, R.id.layout_body_params_all_id);
        constraintBeginBegin2.Top_toBottomOf(i2, i3);
        constraintBeginBegin2.commit();
    }

    private void c0(boolean z) {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.holdbaby_weight_ll);
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.manual_weight_ll);
        if (z) {
            relativeLayout.setEnabled(true);
            relativeLayout.setAlpha(1.0f);
            relativeLayout2.setEnabled(true);
            relativeLayout2.setAlpha(1.0f);
            return;
        }
        relativeLayout.setEnabled(false);
        relativeLayout.setAlpha(0.4f);
        relativeLayout2.setEnabled(false);
        relativeLayout2.setAlpha(0.4f);
    }

    private void d0() {
        String time;
        BFCallback.IHMDeviceManager hMDeviceManager = BFCallback.getHMDeviceManager();
        HMDeviceType hMDeviceType = HMDeviceType.WEIGHT;
        if (hMDeviceManager.hasBound(hMDeviceType)) {
            Calendar boundDeviceSyncTime = BFCallback.getHMDeviceManager().getBoundDeviceSyncTime(hMDeviceType);
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(1);
            int i2 = calendar.get(2) + 1;
            int i3 = calendar.get(5);
            final int i4 = boundDeviceSyncTime.get(1);
            final int i5 = boundDeviceSyncTime.get(2) + 1;
            final int i6 = boundDeviceSyncTime.get(5);
            HMLog.info(Z, new Function0() { // from class: k30
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BodyFatDetailActivity.a0(i4, i5, i6);
                }
            });
            if (i4 > i) {
                return;
            }
            if (i4 < i) {
                time = TimeUtils.formatDateTime(this, boundDeviceSyncTime.getTime());
            } else {
                long timeInMillis = boundDeviceSyncTime.getTimeInMillis();
                time = (i2 == i5 && i6 == i3) ? TimeUtils.formatTime(this, timeInMillis) : TimeUtils.formatDate_no_y((Context) this, timeInMillis, false);
            }
            setSubTitleText(getString(R.string.weight_sync_time, new Object[]{time}));
        }
    }

    private void e0(Integer num) {
        this.N.setVisibility(0);
        String string = num == null ? getString(R.string.empty_value) : String.valueOf(num);
        this.N.setValues(string, "");
        this.N.setTag(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(WeightInfos weightInfos) {
        this.S.getSelectWeightInfo().setValue(weightInfos);
    }

    private void initView() {
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            getTitleTextView().setTextSize(16.0f);
            getTitleTextView().setCompoundDrawablePadding(5);
            findViewById(R.id.jp_body_fat_hint_text).setVisibility(X() ? 0 : 8);
        }
        this.Q = (RelativeLayout) findViewById(R.id.body_fat_rl);
        this.R = (WeightLoadingStatus) findViewById(R.id.loading_status);
        if (HMWeightUtils.isShowGuestEntrance()) {
            int i = R.id.statistic_ll;
            findViewById(i).setVisibility(0);
            findViewById(i).setOnClickListener(this);
            findViewById(R.id.statistic_iv).setBackgroundResource(R.drawable.guest_selector);
            ((TextView) findViewById(R.id.statistic_tv)).setText(R.string.guest);
            findViewById(R.id.delete_ll).setVisibility(8);
        } else {
            findViewById(R.id.delete_ll).setVisibility(4);
            findViewById(R.id.statistic_ll).setVisibility(4);
        }
        ((ImageView) findViewById(R.id.record_iv)).setImageResource(R.drawable.statistics_icon_selector);
        ((ImageView) findViewById(R.id.holdbaby_iv)).setImageResource(R.drawable.delete_selector);
        ((TextView) findViewById(R.id.record_tv)).setText(R.string.statistic);
        ((TextView) findViewById(R.id.holdbaby_tv)).setText(R.string.delete_weight);
        findViewById(R.id.manual_weight_ll).setOnClickListener(this);
        findViewById(R.id.holdbaby_weight_ll).setOnClickListener(this);
        this.P = (TextView) findViewById(R.id.bf_empty_tv);
        this.O = (LinearLayout) findViewById(R.id.layout_body_params_all_id);
        this.M = (TextView) findViewById(R.id.mid_data_tv);
        this.N = (UnitTextView) findViewById(R.id.score_value_tv);
        this.L = (RelativeLayout) findViewById(R.id.chart_container);
        SDAdaptiveTextView sDAdaptiveTextView = (SDAdaptiveTextView) findViewById(R.id.card_status_introduce);
        TextView textView = (TextView) findViewById(R.id.card_status_title);
        sDAdaptiveTextView.post(new d(sDAdaptiveTextView));
        textView.setText(R.string.body_score_desc);
        WeightUserQuickPicker weightUserQuickPicker = (WeightUserQuickPicker) findViewById(R.id.user_picker);
        this.X = weightUserQuickPicker;
        weightUserQuickPicker.setOnUserItemClickListener(new WeightUserQuickPicker.OnUserItemClickListener() { // from class: j30
            @Override // com.xiaomi.hm.health.bodyfat.view.WeightUserQuickPicker.OnUserItemClickListener
            public final void onClick(View view, UserInfos userInfos, int i2) {
                this.a.Y(view, userInfos, i2);
            }
        });
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            setRight2ImageResWithTint(R.drawable.icon_data, ContextCompat.getColor(this, R.color.s1));
            getRight2().setOnClickListener(new e());
            this.M.setOnClickListener(new f());
        }
    }

    public static void launchBodyFatDetails(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) BodyFatDetailActivity.class);
        intent.putExtra(BFConstant.KEY_UID, str);
        context.startActivity(intent);
    }

    @Override // com.xiaomi.hm.health.bodyfat.activity.WeightResultActivity
    @NotNull
    public ViewGroup getMyChartContainer() {
        return this.L;
    }

    @Override // com.xiaomi.hm.health.bodyfat.activity.WeightResultActivity
    public int getType() {
        return getTYPE_BODYFAT();
    }

    @Override // com.xiaomi.hm.health.bodyfat.activity.WeightResultActivity
    public long getUid() {
        return (this.V.getUid().getValue() == null ? S() : this.V.getUid().getValue()).longValue();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        UserInfos info = UserInfoManager.getManager().getInfo(getUid());
        if (info == null) {
            return;
        }
        WeightInfos value = this.S.getSelectWeightInfo().getValue();
        int iIntValue = info.getHeight().intValue();
        if (value != null) {
            if (value.getHeight() != null) {
                iIntValue = value.getHeight().intValue();
            }
            int weightAge = BodyParamsUtils.getWeightAge(value.getTimestamp().longValue(), info.getBirthday());
            HMLog.d(Z, "height = " + iIntValue + " , weightAge = " + weightAge, new Object[0]);
        } else {
            HMLog.d(Z, "wInfos is null.", new Object[0]);
        }
        int id = view.getId();
        if (id == R.id.statistic_ll) {
            if (HMWeightUtils.isShowGuestEntrance()) {
                AddGuestActivity.INSTANCE.startMe(this, 2);
            }
        } else {
            if (id == R.id.holdbaby_weight_ll) {
                if (this.S.getSelectWeightInfo().getValue() != null) {
                    if (checkDelete()) {
                        showDelDialog(this.S.getSelectWeightInfo().getValue());
                        return;
                    } else {
                        CustomToast.makeText(getApplicationContext(), R.string.cannot_delete, 1).show();
                        return;
                    }
                }
                return;
            }
            if (id == R.id.manual_weight_ll) {
                Analytics.recordEvent(new CountEventBuilder(StatEvent.BF_OPERATION).setValue(StatEvent.BF_OPERATION_STATICS_TYPE));
                Intent intent = new Intent(this, (Class<?>) BodyFatStatisticActivity.class);
                intent.putExtra("UID", getUid());
                startActivity(intent);
            }
        }
    }

    @Override // com.xiaomi.hm.health.bodyfat.activity.WeightResultActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_bodyfat_detail);
        BFTitleStyleKt.setBackAndShareTitleStyle(this);
        W();
        isWifiConfig();
        initView();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.BF_VIEW_NUM));
        this.T = new AdultBodyIndexFragment();
        this.U = new ChildBodyIndexFragment();
        if (T(getIntent())) {
            processGdprLaw();
        }
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            getTitleTextView().setTextSize(16.0f);
            getTitleTextView().setCompoundDrawablePadding(5);
            findViewById(R.id.divider).setVisibility(0);
        }
        V(bundle);
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            return;
        }
        Analytics.recordEvent(new CountEventBuilder("DETAIL_FAT_V").setAnonymous(false).setIdentified(true));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        T(intent);
        resetCurrentIndex();
        WeightUserQuickPicker weightUserQuickPicker = this.X;
        weightUserQuickPicker.setSelection(weightUserQuickPicker.getSelection(getUid()));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onShareClicked(View view) {
        WeightShare weightShareP;
        String string;
        super.onShareClicked(view);
        RecentBodyChangeFragment recentBodyChangeFragment = (RecentBodyChangeFragment) getSupportFragmentManager().findFragmentById(R.id.weight_change_container);
        if (recentBodyChangeFragment == null || (weightShareP = P()) == null) {
            return;
        }
        String str = Z;
        HMLog.d(str, "weightShare : " + weightShareP.toString(), new Object[0]);
        float shareValue = recentBodyChangeFragment.getShareValue();
        HMLog.d(str, "change : " + shareValue, new Object[0]);
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        if (shareValue == 0.0f) {
            string = getString(R.string.share_bf_change_no);
        } else {
            String str2 = HMWeightUtils.getWeightValueStringForDisplay(Math.abs(shareValue), weightUnit) + BFCallback.getUnitManager().getWeightUnitString(weightUnit);
            string = shareValue > 0.0f ? getString(R.string.share_bf_change_more, new Object[]{str2}) : getString(R.string.share_bf_change_less, new Object[]{str2});
        }
        String str3 = string;
        if (this.S.getSelectWeightInfo().getValue() != null) {
            BFCallback.getInstance().shareBodyFat(this, weightShareP, getUid(), this.S.getSelectWeightInfo().getValue().getTimestamp().longValue(), str3);
        }
    }

    @Override // com.xiaomi.hm.health.bodyfat.activity.WeightResultActivity
    public void onTouchPosition(int i) {
        setMCurrentIndex(i);
        HMLog.d(Z, "onTouchPosition = " + getMCurrentIndex(), new Object[0]);
        if (getMCurrentIndex() == -1) {
            f0(WeightInfoManager.getManager().getLatestBdfatInfo(getUid()));
        } else {
            Q(getMCurrentIndex());
        }
    }

    @Override // com.xiaomi.hm.health.bodyfat.activity.WeightResultActivity
    public void updateByGdpr() {
        resetCurrentIndex();
        this.V.getUid().setValue(S());
    }
}
