package com.xiaomi.hm.health.bodyfat.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.chenenyu.router.annotation.Route;
import com.huami.lib.view.text.UnitTextView;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.tools.log.HMLog;
import com.huami.view.weightfigure.WeightFigureView;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.WeightDetailActivity;
import com.xiaomi.hm.health.bodyfat.event.EventWeightChanged;
import com.xiaomi.hm.health.bodyfat.fragment.IOnWeightSelectListener;
import com.xiaomi.hm.health.bodyfat.fragment.SelectWeightFragment;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.model.Birthday;
import com.xiaomi.hm.health.bodyfat.model.FigureSource;
import com.xiaomi.hm.health.bodyfat.model.ScoreParamsObject;
import com.xiaomi.hm.health.bodyfat.share.WeightShare;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.BodyFatTimeUtils;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.ConstraintUtil;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import com.xiaomi.hm.health.bodyfat.utils.Utils;
import com.xiaomi.hm.health.bodyfat.utils.WeightCompare;
import com.xiaomi.hm.health.bodyfat.view.SDAdaptiveTextView;
import com.xiaomi.hm.health.bodyfat.view.WeightLoadingStatus;
import com.xiaomi.hm.health.bodyfat.view.WeightUserQuickPicker;
import com.xiaomi.hm.health.bodyfat.viewmodel.WeightDetailViewModel;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import de.greenrobot.event.EventBus;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Route({RouterHelper.WEIGHT_PATH})
public class WeightDetailActivity extends WeightResultActivity implements View.OnClickListener, IOnWeightSelectListener {
    private static final String F0 = WeightDetailActivity.class.getSimpleName();
    private TextView A0;
    private ImageView B0;
    private SDAdaptiveTextView C0;
    private WeightDetailViewModel D0;
    private RelativeLayout M;
    private RelativeLayout N;
    private TextView O;
    private View P;
    private TextView Q;
    private TextView R;
    private TextView S;
    private View T;
    private LinearLayout U;
    private TextView V;
    private WeightInfos W;
    private WeightFigureView X;
    private LinearLayout Y;
    private WeightShare Z;
    private WeightUserQuickPicker m0;
    private String n0;
    private LinearLayout o0;
    private UnitTextView p0;
    private TextView q0;
    private UnitTextView r0;
    private TextView s0;
    private WeightLoadingStatus t0;
    private View u0;
    private ImageView v0;
    private TextView w0;
    private View x0;
    private UnitTextView y0;
    private WeightCompare z0;
    private Context L = this;
    private boolean E0 = true;

    public class a implements Observer<Long> {
        public a() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Long l) {
            if (BFCallback.getInstance().enableMiDongFlavor() && HMWeightUtils.isSelf(l.toString())) {
                WeightDetailActivity.this.B0.setVisibility(0);
            } else {
                WeightDetailActivity.this.B0.setVisibility(8);
            }
        }
    }

    public class b implements Observer<List<UserInfos>> {
        public b() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(List<UserInfos> list) {
            HMLog.v("getUserinfos", "uid=" + WeightDetailActivity.this.getUid(), new Object[0]);
            if (WeightDetailActivity.this.isUserListChanged(list)) {
                WeightDetailActivity.this.m0.bindUsers(WeightDetailActivity.this.dealUserList(list));
                if (WeightDetailActivity.this.checkUidValid()) {
                    WeightDetailActivity.this.m0.setSelection(WeightDetailActivity.this.m0.getSelection(WeightDetailActivity.this.getUid()));
                } else {
                    WeightDetailActivity.this.m0.setSelectionUser(WeightDetailActivity.this.S().longValue());
                }
            }
        }
    }

    public class c implements Observer<List<WeightInfos>> {
        public c() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(List<WeightInfos> list) {
            if (list == null || list.isEmpty()) {
                return;
            }
            int mCurrentIndex = WeightDetailActivity.this.getMCurrentIndex();
            if (mCurrentIndex < 0 || mCurrentIndex >= list.size()) {
                mCurrentIndex = list.size() - 1;
                WeightDetailActivity.this.setMCurrentIndex(mCurrentIndex);
            }
            WeightDetailActivity.this.j0();
            WeightDetailActivity.this.k0(list.get(mCurrentIndex));
            WeightDetailActivity.this.refreshChart(list);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WeightDetailActivity.this.C0.setText(R.string.card_status_intro);
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (HMWeightUtils.isSelf(WeightDetailActivity.this.D0.getUid().getValue() != null ? WeightDetailActivity.this.D0.getUid().getValue().toString() : "")) {
                BFCallback.getInstance().startBodyIndexDetails(view.getContext(), 0);
            }
        }
    }

    public class f implements Function1<Float, String> {
        public f() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String invoke(Float f) {
            int weightUnit = BFCallback.getUnitManager().getWeightUnit();
            return HMWeightUtils.getWeightValueStringForDisplay(HMWeightUtils.convertToKg(f.floatValue(), weightUnit), weightUnit);
        }
    }

    private void Q() {
        if (this.W != null) {
            if (checkDelete()) {
                showDelDialog(this.W);
            } else {
                CustomToast.makeText(getApplicationContext(), R.string.cannot_delete, 1).show();
            }
        }
    }

    private String R(long j) {
        return BodyFatTimeUtils.INSTANCE.formatDateYmd(this, new Date(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Long S() {
        return Long.valueOf(Utils.INSTANCE.toLongValue(BFCallback.getHMPersonInfo().getUserid(), 0L));
    }

    private void T(Intent intent) {
        long jLongValue = S().longValue();
        try {
            long longValue = Utils.INSTANCE.toLongValue(intent.getStringExtra(BFConstant.KEY_UID), 0L);
            if (UserInfoManager.getManager().getInfo(longValue) == null) {
                this.D0.getUid().setValue(Long.valueOf(jLongValue));
            } else {
                this.D0.getUid().setValue(Long.valueOf(longValue));
            }
        } catch (Exception unused) {
            this.D0.getUid().setValue(Long.valueOf(jLongValue));
        }
    }

    private int[] U(int i, int i2, int i3) {
        int[] iArr = new int[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                iArr[i4] = i3;
            } else {
                iArr[i4] = ContextCompat.getColor(getApplicationContext(), R.color.s3);
            }
        }
        return iArr;
    }

    private void V(WeightInfos weightInfos) {
        WeightShare weightShare = new WeightShare();
        this.Z = weightShare;
        if (weightInfos == null) {
            return;
        }
        weightShare.setUserid(getUid());
        this.Z.setWeightUnitStr(this.n0);
        this.Z.setWeightValue(HMWeightUtils.getWeightValueStringForDisplay(weightInfos.getWeight().floatValue(), BFCallback.getUnitManager().getWeightUnit()));
        this.Z.setWeightTime(weightInfos.getTimestamp().longValue());
        this.Z.setType(1);
        WeightInfos latestInfoBeforeTime = HMWeightUtils.getLatestInfoBeforeTime(getUid(), weightInfos.getTimestamp().longValue());
        if (latestInfoBeforeTime != null) {
            this.Z.setCompareValue(HMWeightUtils.getWeightValueStringForDisplay(weightInfos.getWeight().floatValue() - latestInfoBeforeTime.getWeight().floatValue(), BFCallback.getUnitManager().getWeightUnit()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String W(Float f2) {
        return String.format(Locale.getDefault(), "%.1f", f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(View view, UserInfos userInfos, int i) {
        if (userInfos != null) {
            if (Long.parseLong(userInfos.getUserId()) == getLAST_USER_ID()) {
                Analytics.recordEvent(new CountEventBuilder(StatEvent.WEIGHT_DETAIL).setValue("ManageMembers"));
                goToFamilyManagerActivity();
            } else {
                Analytics.recordEvent(new CountEventBuilder(StatEvent.WEIGHT_CHANGE_MEMBERS));
                resetCurrentIndex();
                this.D0.getUid().setValue(Long.valueOf(Utils.INSTANCE.toLongValue(getUserList().get(i).getUserId(), S().longValue())));
                this.m0.setSelection(i);
            }
        }
    }

    private void Y() {
        this.N.setVisibility(4);
        this.U.setVisibility(4);
        this.M.setVisibility(4);
        this.t0.setVisibility(0);
        this.t0.loadingFailed();
        c0(false);
        getRightImage().setVisibility(4);
    }

    private void Z() {
        this.N.setVisibility(0);
        this.U.setVisibility(0);
        this.M.setVisibility(0);
        this.t0.setVisibility(4);
        this.t0.stopLoading();
        c0(true);
        getRightImage().setVisibility(0);
    }

    private void a0() {
        WeightInfos latestInfo = WeightInfoManager.getManager().getLatestInfo(getUid());
        if (latestInfo != null) {
            float fFloatValue = latestInfo.getWeight().floatValue();
            if (fFloatValue < 3.0f) {
                fFloatValue = 3.0f;
            }
            new SelectWeightFragment((FragmentActivity) this.L, fFloatValue, this).showWeightSelectDialog();
            return;
        }
        UserInfos info = UserInfoManager.getManager().getInfo(getUid());
        if (info == null) {
            return;
        }
        new SelectWeightFragment((FragmentActivity) this.L, Birthday.fromStr(info.getBirthday()).getAge() <= 3 ? 8.0f : 60.0f, this).showWeightSelectDialog();
    }

    private void b0() {
        if (this.P.getVisibility() == 0) {
            ConstraintUtil.ConstraintBegin constraintBeginBegin = new ConstraintUtil((ConstraintLayout) findViewById(R.id.constraint_layout)).begin();
            int i = R.id.card_status;
            constraintBeginBegin.Top_toBottomOf(i, R.id.weight_compare_ll);
            constraintBeginBegin.Top_toBottomOf(R.id.weight_body_type_ll, i);
            constraintBeginBegin.commit();
            return;
        }
        ConstraintUtil.ConstraintBegin constraintBeginBegin2 = new ConstraintUtil((ConstraintLayout) findViewById(R.id.constraint_layout)).begin();
        int i2 = R.id.weight_body_type_ll;
        constraintBeginBegin2.Top_toBottomOf(i2, R.id.weight_compare_ll);
        constraintBeginBegin2.Top_toBottomOf(R.id.card_status, i2);
        constraintBeginBegin2.commit();
    }

    private void c0(boolean z) {
        if (z) {
            this.u0.setEnabled(true);
            this.u0.setAlpha(1.0f);
            this.x0.setEnabled(true);
            this.x0.setAlpha(1.0f);
            return;
        }
        this.u0.setEnabled(false);
        this.u0.setAlpha(0.4f);
        this.x0.setEnabled(false);
        this.x0.setAlpha(0.4f);
    }

    private void d0(float f2, float[] fArr, String[] strArr, int[] iArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= fArr.length) {
                i = i2;
                break;
            }
            if (i != fArr.length - 1) {
                if (f2 >= fArr[i] && f2 < fArr[i + 1]) {
                    break;
                }
            } else {
                i2 = i;
            }
            i++;
        }
        this.X.setValues(fArr, iArr, strArr, U(i, fArr.length, iArr[i > iArr.length + (-1) ? iArr.length - 1 : i]));
        this.X.setLanguageNormal(Language.isChinese());
        this.X.setListener(new f());
        if (f2 >= fArr[fArr.length - 2]) {
            f2 = HMWeightUtils.elasticValue(f2, fArr[fArr.length - 2], fArr[fArr.length - 1]);
        }
        this.X.setInitValue(f2);
    }

    private void e0(int i, float f2, int i2, float f3) {
        UserInfos info = UserInfoManager.getManager().getInfo(getUid());
        if (info == null) {
            return;
        }
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        boolean zIsChinese = Language.isChinese();
        int iIntValue = info.getGender().intValue();
        if (i2 == 0) {
            i2 = info.getHeight().intValue();
        }
        FigureSource weightFigureSource = HMWeightUtils.getWeightFigureSource(this, zIsChinese, iIntValue, i, i2, weightUnit);
        if (weightFigureSource == null) {
            return;
        }
        ScoreParamsObject sbwScoreObject = BodyParamsUtils.getSbwScoreObject(this, info.getGender().intValue(), i, info.getHeight().intValue(), f2, f3);
        this.y0.setValue(sbwScoreObject.getParamsValue());
        this.y0.setUnit(sbwScoreObject.getUnitValue());
        d0(HMWeightUtils.convertFromKg(f2, weightUnit), weightFigureSource.getValues(), weightFigureSource.getLabels(), weightFigureSource.getColors());
    }

    private void f0() {
        String weightDeviceSyncTimeForDisplay = HMWeightUtils.getWeightDeviceSyncTimeForDisplay(this);
        if (TextUtils.isEmpty(weightDeviceSyncTimeForDisplay)) {
            return;
        }
        setSubTitleText(getString(R.string.weight_sync_time, new Object[]{weightDeviceSyncTimeForDisplay}));
    }

    @SuppressLint({"ResourceAsColor"})
    private void g0(boolean z, UnitTextView unitTextView) {
        if (z) {
            unitTextView.setColor(ContextCompat.getColor(this, R.color.p4));
        } else {
            unitTextView.setColor(ContextCompat.getColor(this, R.color.s20));
        }
    }

    public static Intent getIntentWithParams(Context context, String str, boolean z, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) WeightDetailActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(BFConstant.KEY_UID, str);
        }
        intent.putExtra("IS_GUEST", z);
        intent.putExtra(BFConstant.IS_FROM_WEIGHTING, z2);
        return intent;
    }

    private void h0() {
        this.U.setVisibility(4);
        UserInfos info = UserInfoManager.getManager().getInfo(getUid());
        if (info != null) {
            HMLog.d(F0, "setViewDefaultValue : " + info.getWeight(), new Object[0]);
            this.O.setText(HMWeightUtils.getWeightValueStringForDisplay(info.getWeight().floatValue(), BFCallback.getUnitManager().getWeightUnit()));
            this.z0.updateCompareView(info, info.getWeight().floatValue(), HMWeightUtils.calcuBMI(info.getHeight().intValue(), info.getWeight().floatValue()));
        } else {
            this.O.setText(R.string.empty_value);
        }
        this.Y.setVisibility(8);
        this.o0.setVisibility(8);
        b0();
    }

    private void i0(int i, int i2) {
        Resources resources;
        int i3;
        if (i < 7) {
            this.P.setVisibility(0);
            this.T.setVisibility(8);
            if (Language.isChinese()) {
                resources = getResources();
                i3 = R.string.no_bmi_for_age;
            } else {
                resources = getResources();
                i3 = R.string.no_bmi_for_not_adult;
            }
            this.Q.setText(resources.getString(i3));
            this.Q.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, ContextCompat.getDrawable(this, R.drawable.bf3_baby_error), (Drawable) null, (Drawable) null);
            this.X.setVisibility(8);
            b0();
            return;
        }
        if (i2 < 100) {
            this.P.setVisibility(0);
            this.T.setVisibility(8);
            this.U.setVisibility(4);
            this.Q.setText(getResources().getString(R.string.no_bmi_for_height));
            this.Q.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, ContextCompat.getDrawable(this, R.drawable.bf3_littil_baby), (Drawable) null, (Drawable) null);
            this.X.setVisibility(8);
            b0();
            return;
        }
        String language = Locale.getDefault().getLanguage();
        HMLog.d(F0, "language = " + language, new Object[0]);
        if (Language.isChinese()) {
            this.P.setVisibility(8);
            this.T.setVisibility(0);
            this.X.setVisibility(0);
            this.X.setLanguageNormal(true);
            b0();
            return;
        }
        if (i < 18) {
            this.P.setVisibility(0);
            this.T.setVisibility(8);
            this.U.setVisibility(4);
            this.Q.setText(getResources().getString(R.string.no_bmi_for_not_adult));
            this.X.setVisibility(8);
            b0();
            return;
        }
        this.U.setVisibility(0);
        this.P.setVisibility(8);
        this.T.setVisibility(0);
        this.X.setVisibility(0);
        b0();
        if (Language.isEnglish()) {
            this.X.setLanguageNormal(true);
        } else {
            this.X.setLanguageNormal(false);
        }
    }

    private void initView() {
        this.t0 = (WeightLoadingStatus) findViewById(R.id.loading_status);
        View viewFindViewById = findViewById(R.id.statistic_ll);
        this.u0 = viewFindViewById;
        viewFindViewById.setVisibility(0);
        this.u0.setOnClickListener(this);
        this.v0 = (ImageView) findViewById(R.id.statistic_iv);
        this.w0 = (TextView) findViewById(R.id.statistic_tv);
        this.v0.setBackgroundResource(R.drawable.weight_detail_zoomin);
        this.w0.setText(R.string.zoom_in);
        int i = R.id.delete_ll;
        this.x0 = findViewById(i);
        boolean zHasBound = BFCallback.getHMDeviceManager().hasBound(HMDeviceType.WEIGHT);
        View viewFindViewById2 = findViewById(R.id.holdbaby_weight_ll);
        if (zHasBound && BFCallback.getHMLoginManager().isAdult()) {
            viewFindViewById2.setVisibility(0);
            viewFindViewById2.setOnClickListener(this);
        } else {
            viewFindViewById2.setVisibility(8);
        }
        findViewById(R.id.manual_weight_ll).setOnClickListener(this);
        View viewFindViewById3 = findViewById(i);
        this.x0 = viewFindViewById3;
        viewFindViewById3.setOnClickListener(this);
        this.N = (RelativeLayout) findViewById(R.id.weight_rl);
        this.O = (TextView) findViewById(R.id.weight_value_tv);
        this.V = (TextView) findViewById(R.id.unitTV);
        this.U = (LinearLayout) findViewById(R.id.bmi_ll);
        this.R = (TextView) findViewById(R.id.bmi_value_tv);
        this.S = (TextView) findViewById(R.id.bmi_value_tv_shape);
        this.M = (RelativeLayout) findViewById(R.id.chart_container);
        this.m0 = (WeightUserQuickPicker) findViewById(R.id.user_picker);
        this.o0 = (LinearLayout) findViewById(R.id.weight_navi_rl);
        this.p0 = (UnitTextView) findViewById(R.id.weight_change_mon_uv);
        this.q0 = (TextView) findViewById(R.id.weight_change_mon_nav_date);
        this.r0 = (UnitTextView) findViewById(R.id.weight_change_last_uv);
        this.s0 = (TextView) findViewById(R.id.weight_change_last_date);
        this.Y = (LinearLayout) findViewById(R.id.weight_body_type_ll);
        this.P = findViewById(R.id.no_bmi_ll);
        this.Q = (TextView) findViewById(R.id.no_bmi_tv);
        this.T = findViewById(R.id.has_bmi_ll);
        WeightFigureView weightFigureView = (WeightFigureView) findViewById(R.id.weight_figure_view);
        this.X = weightFigureView;
        weightFigureView.setThumbDarkStyle(this);
        this.X.setLanguageNormal(Language.isChinese());
        this.X.setCenterLabel(true);
        this.X.setLabelTextSize(12.0f);
        this.X.setScaleTextSize(11.0f);
        this.X.setScaleTextColor(ContextCompat.getColor(this, R.color.s3));
        this.X.setTypeface(TypefaceManager.get().getTypeface(this, Font.KM));
        this.X.setListener(new Function1() { // from class: yr8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WeightDetailActivity.W((Float) obj);
            }
        });
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.weight_compare_ll);
        this.z0 = new WeightCompare(this.L, (TextView) findViewById(R.id.weight_compare_title), relativeLayout, (RelativeLayout) findViewById(R.id.weight_compare_chart));
        this.y0 = (UnitTextView) findViewById(R.id.params_ideal_weight);
        this.A0 = (TextView) findViewById(R.id.card_status_title);
        this.C0 = (SDAdaptiveTextView) findViewById(R.id.card_status_introduce);
        this.A0.setText(R.string.card_status_title);
        this.C0.post(new d());
        this.S.setOnClickListener(new e());
        this.B0 = (ImageView) findViewById(R.id.iv_bmi_arrow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        HMLog.d(F0, "unit = " + weightUnit, new Object[0]);
        String unitStr = HMWeightUtils.toUnitStr(getApplicationContext(), weightUnit);
        this.n0 = unitStr;
        this.V.setText(unitStr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"StringFormatMatches"})
    public void k0(WeightInfos weightInfos) {
        int i;
        float fFloatValue;
        float f2;
        Resources resources;
        int i2;
        this.W = weightInfos;
        UserInfos info = UserInfoManager.getManager().getInfo(getUid());
        if (info == null) {
            return;
        }
        setTitleText(info.getName());
        if (weightInfos != null) {
            checkGoalFinish(weightInfos);
            V(weightInfos);
            getRightImage().setVisibility(0);
            if (BFCallback.getInstance().enableMiDongFlavor()) {
                setSubTitleText(BodyFatTimeUtils.INSTANCE.formatDateTime_no_y((Context) this, weightInfos.getTimestamp().longValue(), false));
            } else {
                if (HMWeightUtils.length(info.getName()) > 18) {
                    setTitleText(info.getName().substring(0, 8) + ".. " + TimeUtils.formatDateTime_no_y((Context) this, weightInfos.getTimestamp().longValue(), false));
                } else {
                    setTitleText(info.getName() + " " + TimeUtils.formatDateTime_no_y((Context) this, weightInfos.getTimestamp().longValue(), false));
                }
                f0();
            }
        } else {
            if (!BFCallback.getInstance().enableMiDongFlavor()) {
                f0();
            }
            if (HMWeightUtils.length(info.getName()) > 18) {
                setTitleText(info.getName().substring(0, 8) + "..");
            } else {
                setTitleText(info.getName());
            }
            getRightImage().setVisibility(4);
        }
        if (weightInfos == null) {
            h0();
            return;
        }
        int weightAge = BodyParamsUtils.getWeightAge(weightInfos.getTimestamp().longValue(), info.getBirthday());
        String str = F0;
        HMLog.d(str, "update Weight :" + HMWeightUtils.toString(weightInfos), new Object[0]);
        float fFloatValue2 = weightInfos.getWeight().floatValue();
        float f3 = fFloatValue2 <= 150.0f ? fFloatValue2 : 150.0f;
        float fConvertFromKg = HMWeightUtils.convertFromKg(f3, BFCallback.getUnitManager().getWeightUnit());
        int iIntValue = (weightInfos.getHeight() != null ? weightInfos.getHeight() : info.getHeight()).intValue();
        float fFloatValue3 = weightInfos.getSbw() != null ? weightInfos.getSbw().floatValue() : BodyParamsUtils.calculateIdealWeight(iIntValue, info.getGender().intValue(), weightAge, f3);
        i0(weightAge, iIntValue);
        e0(weightAge, f3, weightInfos.getHeight() == null ? 0 : weightInfos.getHeight().intValue(), fFloatValue3);
        HMLog.d(str, "setInitValue KG :" + f3, new Object[0]);
        HMLog.d(str, "setInitValue value = " + fConvertFromKg, new Object[0]);
        int userWeightCount = WeightInfoManager.getManager().getUserWeightCount(getUid());
        HMLog.d(str, "count = " + userWeightCount, new Object[0]);
        if (userWeightCount < 2 || HMWeightUtils.isAllDataSameDay(getUid())) {
            this.o0.setVisibility(8);
        } else {
            WeightInfos latestInfoBeforeTime = HMWeightUtils.getLatestInfoBeforeTime(getUid(), weightInfos.getTimestamp().longValue());
            if (latestInfoBeforeTime != null) {
                fFloatValue = fFloatValue2 - latestInfoBeforeTime.getWeight().floatValue();
                this.o0.setVisibility(0);
            } else {
                this.o0.setVisibility(8);
                fFloatValue = 0.0f;
            }
            if (BFCallback.getInstance().enableMiDongFlavor()) {
                g0(fFloatValue > 0.0f, this.r0);
            }
            this.s0.setCompoundDrawablesRelativeWithIntrinsicBounds(fFloatValue > 0.0f ? getResources().getDrawable(R.drawable.bf3_arrow_up) : getResources().getDrawable(R.drawable.icon_arrow_down), (Drawable) null, (Drawable) null, (Drawable) null);
            if (latestInfoBeforeTime != null) {
                this.s0.setText(getString(R.string.compare_to_last_time) + " (" + R(latestInfoBeforeTime.getTimestamp().longValue()) + ")");
            }
            this.r0.setValue(HMWeightUtils.getWeightValueStringForDisplay(Math.abs(fFloatValue), BFCallback.getUnitManager().getWeightUnit()), this.n0);
            this.Z.setCompareValue(HMWeightUtils.getWeightValueStringForDisplay(fFloatValue, BFCallback.getUnitManager().getWeightUnit()));
            HMLog.d(str, "compareMonthTargetValue  firstWeight = " + WeightInfoManager.getManager().getFirstWwightInfo(getUid()).getWeight(), new Object[0]);
            WeightInfos latestMonthCompareWeight = HMWeightUtils.getLatestMonthCompareWeight(getUid(), weightInfos.getTimestamp().longValue());
            float fFloatValue4 = latestMonthCompareWeight != null ? fFloatValue2 - latestMonthCompareWeight.getWeight().floatValue() : 0.0f;
            if (latestMonthCompareWeight != null) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(weightInfos.getTimestamp().longValue());
                SportDay sportDay = new SportDay(calendar);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(latestMonthCompareWeight.getTimestamp().longValue());
                int iOffsetDay = sportDay.offsetDay(new SportDay(calendar2));
                if (iOffsetDay == 0) {
                    this.o0.setVisibility(8);
                } else {
                    this.q0.setText(getResources().getQuantityString(R.plurals.bf3_compare_last_mon, iOffsetDay, Integer.valueOf(iOffsetDay)) + " (" + R(latestMonthCompareWeight.getTimestamp().longValue()) + ")");
                    if (BFCallback.getInstance().enableMiDongFlavor()) {
                        f2 = 0.0f;
                        g0(fFloatValue4 > 0.0f, this.p0);
                    } else {
                        f2 = 0.0f;
                    }
                    TextView textView = this.q0;
                    if (fFloatValue4 > f2) {
                        resources = getResources();
                        i2 = R.drawable.bf3_arrow_up;
                    } else {
                        resources = getResources();
                        i2 = R.drawable.icon_arrow_down;
                    }
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(resources.getDrawable(i2), (Drawable) null, (Drawable) null, (Drawable) null);
                    this.p0.setValue(HMWeightUtils.getWeightValueStringForDisplay(Math.abs(fFloatValue4), BFCallback.getUnitManager().getWeightUnit()), this.n0);
                }
            }
        }
        this.O.setText(HMWeightUtils.getWeightValueStringForDisplay(fFloatValue2, BFCallback.getUnitManager().getWeightUnit()));
        float showBmi = HMWeightUtils.getShowBmi(weightInfos, info);
        String bodyFigureDescription = HMWeightUtils.toBodyFigureDescription(getApplicationContext(), showBmi, weightAge, info.getGender().intValue());
        if (this.T.getVisibility() == 8) {
            this.Z.setBmi("--");
            this.U.setVisibility(4);
            i = 0;
        } else {
            this.U.setVisibility(0);
            this.R.setText(String.format(Locale.getDefault(), "%s %.1f", getString(R.string.bmi), Float.valueOf(showBmi)));
            this.S.setText(bodyFigureDescription);
            i = 0;
            this.Z.setBmi(String.format(Locale.getDefault(), "%.1f", Float.valueOf(HMWeightUtils.scaleFloatToDown(showBmi, 1))));
        }
        this.Z.setFigure(bodyFigureDescription);
        this.z0.updateCompareView(info, fFloatValue2, showBmi);
        this.Y.setVisibility(i);
    }

    private void startLoading() {
        this.N.setVisibility(4);
        this.U.setVisibility(4);
        this.M.setVisibility(4);
        this.t0.setVisibility(0);
        this.t0.startLoading();
        c0(false);
        getRightImage().setVisibility(4);
    }

    @Override // com.xiaomi.hm.health.bodyfat.activity.WeightResultActivity
    @NotNull
    public ViewGroup getMyChartContainer() {
        return this.M;
    }

    @Override // com.xiaomi.hm.health.bodyfat.activity.WeightResultActivity
    public int getType() {
        return getTYPE_WEIGHT();
    }

    @Override // com.xiaomi.hm.health.bodyfat.activity.WeightResultActivity
    public long getUid() {
        return (this.D0.getUid().getValue() == null ? S() : this.D0.getUid().getValue()).longValue();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.manual_weight_ll) {
            a0();
            return;
        }
        if (id == R.id.holdbaby_weight_ll) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.WEIGHT_DETAIL).setValue(StatEvent.WEIGHT_DETAIL_PARAMS_BABY_WEIGHT));
            if (HMWeightUtils.isAmazfitScale()) {
                ConnectScaleActivity.INSTANCE.launch(this, ConnectScaleActivity.getTYPE_BABY_WEIGHT());
                return;
            } else {
                startActivity(new Intent(this, (Class<?>) BabyWeightActivity.class));
                return;
            }
        }
        if (id == R.id.delete_ll) {
            Q();
            return;
        }
        if (id == R.id.statistic_ll) {
            boolean z = !this.E0;
            this.E0 = z;
            scaleChart(z);
            if (this.E0) {
                HMLog.d(F0, "点击放大.", new Object[0]);
                Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.WEIGHT_DETAIL_SCALE).setValue("Enlarge"));
                this.v0.setBackgroundResource(R.drawable.weight_detail_zoomin);
                this.w0.setText(R.string.zoom_in);
                return;
            }
            HMLog.d(F0, "点击缩小.", new Object[0]);
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.WEIGHT_DETAIL_SCALE).setValue("Narrow"));
            this.v0.setBackgroundResource(R.drawable.weight_detail_zoomout);
            this.w0.setText(R.string.zoom_out);
        }
    }

    @Override // com.xiaomi.hm.health.bodyfat.activity.WeightResultActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        HMLog.d(F0, "onCreate", new Object[0]);
        setContentView(R.layout.activity_weight_detail);
        BFTitleStyleKt.setBackAndShareTitleStyle(this);
        this.D0 = (WeightDetailViewModel) ViewModelProviders.of(this).get(WeightDetailViewModel.class);
        isWifiConfig();
        initView();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.WEIGHT_VIEW_NUM));
        T(getIntent());
        processGdprLaw();
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            getTitleTextView().setTextSize(16.0f);
            getTitleTextView().setCompoundDrawablePadding(5);
            findViewById(R.id.divider).setVisibility(0);
        } else {
            Analytics.recordEvent(new CountEventBuilder("DETAIL_WEIGHT_V").setAnonymous(false).setIdentified(true));
        }
        this.D0.getUid().observe(this, new a());
        this.D0.getUserInfos().observe(this, new b());
        this.D0.getWeightinfos().observe(this, new c());
        this.m0.setOnUserItemClickListener(new WeightUserQuickPicker.OnUserItemClickListener() { // from class: xr8
            @Override // com.xiaomi.hm.health.bodyfat.view.WeightUserQuickPicker.OnUserItemClickListener
            public final void onClick(View view, UserInfos userInfos, int i) {
                this.a.X(view, userInfos, i);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bodyfat.activity.WeightResultActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.z0.recycle();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        T(intent);
        resetCurrentIndex();
        WeightUserQuickPicker weightUserQuickPicker = this.m0;
        weightUserQuickPicker.setSelection(weightUserQuickPicker.getSelection(getUid()));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onShareClicked(View view) {
        super.onShareClicked(view);
        BFCallback.getInstance().hmShare(this.L, this.Z);
    }

    @Override // com.xiaomi.hm.health.bodyfat.activity.WeightResultActivity
    public void onTouchPosition(int i) {
        WeightInfos weightInfos;
        setMCurrentIndex(i);
        HMLog.v("onTouchPosition", "onTouchPosition = " + getMCurrentIndex(), new Object[0]);
        List<WeightInfos> infosAsc = HMWeightUtils.getInfosAsc(getUid());
        if (infosAsc == null || infosAsc.size() <= 0 || i >= infosAsc.size() || (weightInfos = infosAsc.get(i)) == null) {
            return;
        }
        k0(weightInfos);
    }

    @Override // com.xiaomi.hm.health.bodyfat.fragment.IOnWeightSelectListener
    public void onWeightSelect(float f2) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.WEIGHT_DETAIL).setValue("AddWeight"));
        WeightInfos weightInfos = new WeightInfos();
        boolean z = true;
        weightInfos.setType(1);
        weightInfos.setTimestamp(Long.valueOf(System.currentTimeMillis()));
        weightInfos.setWeight(Float.valueOf(f2));
        weightInfos.setSync(0);
        if (getUid() == Long.parseLong(BFCallback.getHMPersonInfo().getUserid())) {
            weightInfos.setUserId(-1L);
            HMPersonInfo.getInstance().getUserInfo().setWeight(f2);
            HMPersonInfo.getInstance().saveInfo(2);
        } else {
            weightInfos.setUserId(Long.valueOf(getUid()));
        }
        UserInfos info = UserInfoManager.getManager().getInfo(getUid());
        if (info == null) {
            return;
        }
        int iIntValue = info.getHeight().intValue();
        weightInfos.setHeight(Integer.valueOf(iIntValue));
        weightInfos.setDevice_id(BFCallback.getHMDeviceManager().getBoundDeviceId(HMDeviceType.WEIGHT));
        weightInfos.setSource(Integer.valueOf(BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue()));
        weightInfos.setBmi(Float.valueOf(HMWeightUtils.calcuBMI(iIntValue, f2)));
        try {
            HMLog.d(F0, "add weight :" + HMWeightUtils.toString(weightInfos), new Object[0]);
            WeightInfoManager.getManager().addInfo(weightInfos);
        } catch (Exception e2) {
            e2.printStackTrace();
            z = false;
        }
        if (z) {
            resetCurrentIndex();
            EventBus.getDefault().post(new EventWeightChanged(getUid(), 6));
        }
    }

    @Override // com.xiaomi.hm.health.bodyfat.fragment.IOnWeightSelectListener
    public void onWeightSelectCancel() {
    }

    @Override // com.xiaomi.hm.health.bodyfat.activity.WeightResultActivity
    public void updateByGdpr() {
        resetCurrentIndex();
        this.D0.getUid().setValue(S());
    }
}
