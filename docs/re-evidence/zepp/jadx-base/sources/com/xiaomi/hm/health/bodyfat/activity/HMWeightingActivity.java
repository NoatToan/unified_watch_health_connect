package com.xiaomi.hm.health.bodyfat.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.HMWeightingActivity;
import com.xiaomi.hm.health.bodyfat.event.BFDeviceBatteryEvent;
import com.xiaomi.hm.health.bodyfat.event.BFDeviceWeightValueEvent;
import com.xiaomi.hm.health.bodyfat.event.EventFinishGuestPre;
import com.xiaomi.hm.health.bodyfat.event.EventSelectedUser;
import com.xiaomi.hm.health.bodyfat.event.EventWeightChanged;
import com.xiaomi.hm.health.bodyfat.event.EventWeightOverload;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoRepository;
import com.xiaomi.hm.health.bodyfat.model.WeightDataState;
import com.xiaomi.hm.health.bodyfat.property.BodyfatProperty;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.BFKeeper;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis;
import com.xiaomi.hm.health.bodyfat.utils.WeightInfoCreateHelper;
import com.xiaomi.hm.health.bodyfat.view.WeightingDynamicWeightView;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.databases.HMLocalPropertyUtil;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import de.greenrobot.event.EventBus;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONArray;
import org.json.JSONException;
import rx.Observable;
import rx.SingleSubscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes19.dex */
public class HMWeightingActivity extends BaseTitleActivity implements View.OnClickListener {
    private static final long T = 4000;
    private TextView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private WeightChooseUserFragment E;
    private WeightAdvData I;
    private WeightDataState N;
    private long O;
    private WeightingDynamicWeightView x;
    private TextView y;
    private RelativeLayout z;
    private static final String S = HMWeightingActivity.class.getSimpleName();
    public static boolean isUserWeighting = false;
    private boolean F = false;
    private boolean G = false;
    private boolean H = false;
    private List<Long> J = new ArrayList();
    private List<Long> K = new ArrayList();
    private List<Long> L = new ArrayList();
    private List<Long> M = new ArrayList();
    private int P = -1;
    private int Q = -1;
    private String R = null;

    public class a extends SingleSubscriber<JSONArray> {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(Throwable th) {
            return "访客模式匹配体重数据处理失败： " + th.getMessage();
        }

        @Override // rx.SingleSubscriber
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(JSONArray jSONArray) {
            HMLocalPropertyUtil.setLocalProperty(BodyfatProperty.PROPERTY_GUEST_WEIGHTING_TIME_SETTING, jSONArray.toString());
        }

        @Override // rx.SingleSubscriber
        public void onError(final Throwable th) {
            HMLog.warn(HMWeightingActivity.S, new Function0() { // from class: com.xiaomi.hm.health.bodyfat.activity.c
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMWeightingActivity.a.b(th);
                }
            });
        }
    }

    private void A(String str, boolean z) {
        EventBus.getDefault().post(new EventFinishGuestPre(z));
        Intent intent = new Intent();
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(BFConstant.KEY_UID, str);
        }
        if (z) {
            intent.setClass(this, GuestBodyFatDetailActivity.class);
        } else {
            intent.setClass(this, BodyFatDetailActivity.class);
        }
        intent.putExtra("IS_GUEST", z);
        intent.putExtra(BFConstant.IS_FROM_WEIGHTING, true);
        startActivity(intent);
        finish();
    }

    private void B(WeightAdvData weightAdvData) throws ParseException {
        String str = S;
        HMLog.d(str, "stable finish value = " + weightAdvData.toString(), new Object[0]);
        if (BFCallback.getHMDeviceManager().hasBound(HMDeviceSource.WEIGHT) || BFCallback.getHMDeviceManager().hasBound(HMDeviceSource.WEIGHT_SCALE2)) {
            if (weightAdvData.isPart()) {
                C(weightAdvData);
                return;
            } else {
                D(weightAdvData);
                return;
            }
        }
        if (weightAdvData.getImpedance() == 65534 && !weightAdvData.isImpedanceStable()) {
            this.x.showFatMeasuringView();
            this.x.setWeightTips("");
            this.y.setText(getString(R.string.weight_babyfat_measuring));
            this.N = WeightDataState.isStable_noFinish_measuringBf;
        }
        if (weightAdvData.isImpedanceStable()) {
            this.x.hideFatMeasuringView();
            this.N = WeightDataState.isStable_bodyfat_success;
            E(weightAdvData);
            return;
        }
        if (weightAdvData.getImpedance() != 65533) {
            if (weightAdvData.isPart()) {
                C(weightAdvData);
                return;
            }
            return;
        }
        long timestamp = weightAdvData.getTimestamp();
        if (this.L.contains(Long.valueOf(timestamp))) {
            HMLog.d(str, "failure timestamp is repeat ,return !", new Object[0]);
            b0();
            return;
        }
        this.L.add(Long.valueOf(timestamp));
        this.N = WeightDataState.isStable_bodyfat_failure;
        this.x.hideFatMeasuringView();
        this.x.setWeightTips("");
        this.y.setText(getString(R.string.weight_babyfat_measuring));
        this.I = weightAdvData;
        X(weightAdvData);
        Analytics.event(this, StatEvent.Measure_BodyFat_Fail, StatEvent.Measure_Fail);
        this.D.setVisibility(8);
    }

    private void C(WeightAdvData weightAdvData) {
        this.y.setText(R.string.small_thing_weight);
        this.x.hideFatMeasuringView();
        this.x.setWeightTips("");
        this.D.setVisibility(0);
        if (weightAdvData.isFinish()) {
            Observable.timer(1L, TimeUnit.SECONDS).observeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: rr3
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.G((Long) obj);
                }
            }, new Action1() { // from class: jr3
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    HMWeightingActivity.I((Throwable) obj);
                }
            });
        }
    }

    private void D(WeightAdvData weightAdvData) throws ParseException {
        long timestamp = weightAdvData.getTimestamp();
        if (this.K.contains(Long.valueOf(timestamp))) {
            HMLog.d(S, "timestamp is repeat ,return !", new Object[0]);
            b0();
        } else {
            this.K.add(Long.valueOf(timestamp));
            S(weightAdvData);
        }
    }

    private void E(WeightAdvData weightAdvData) throws ParseException {
        long timestamp = weightAdvData.getTimestamp();
        if (this.M.contains(Long.valueOf(timestamp))) {
            HMLog.d(S, "stableImdance timestamp is repeat ,return !", new Object[0]);
            b0();
        } else {
            this.M.add(Long.valueOf(timestamp));
            S(weightAdvData);
        }
    }

    private boolean F(WeightAdvData weightAdvData) {
        String string;
        int i;
        int i2 = this.P;
        if (i2 >= 0 && (i2 < 6 || i2 > 99)) {
            string = i2 < 6 ? getString(R.string.weighting_weight_bf_age_lt) : getString(R.string.weighting_weight_bf_age_huge);
        } else {
            string = null;
        }
        if (string == null && (i = this.Q) > 0 && (i < 90 || i > 220)) {
            string = this.Q < 90 ? getString(R.string.weighting_weight_bf_height_min) : getString(R.string.weighting_weight_bf_height_max);
        }
        if (!(string != null && BFCallback.getHMDeviceManager().hasBoundBfs() && weightAdvData != null && weightAdvData.isImpedanceStable())) {
            return false;
        }
        W(string);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(Long l) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String H(Throwable th) {
        return "识别为小物件称重、处理失败:  " + th.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I(final Throwable th) {
        HMLog.warn(S, new Function0() { // from class: qr3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMWeightingActivity.H(th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(List list, WeightAdvData weightAdvData, int i, boolean z) {
        if (z) {
            U(list, weightAdvData, i);
        } else {
            BFCallback.getAppUtils().showDeleteAllMemberDataRequestDialog(this, new WeightGrantRequestDialogLis() { // from class: mr3
                @Override // com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis
                public final void requestResult(boolean z2) {
                    this.a.L(z2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONArray K(WeightAdvData weightAdvData, String str) {
        JSONArray jSONArray = null;
        try {
            jSONArray = TextUtils.isEmpty(str) ? new JSONArray() : new JSONArray(str);
            jSONArray.put(weightAdvData.getTimestamp() / 1000);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(boolean z) {
        if (z) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M() {
        Analytics.event(this, BFCallback.getHMDeviceManager().hasBound(HMDeviceSource.WEIGHT) ? StatEvent.Weight_Scale_Fail : StatEvent.Weight_BodyFatScale_Fail, "Low");
        this.x.normalToLowpower();
        this.x.setWeightTips(getString(R.string.battery_low));
        this.z.setVisibility(0);
        this.B.setVisibility(8);
        this.C.setVisibility(8);
        this.A.setVisibility(0);
        this.A.setText(R.string.close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(Long l) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String O(Throwable th) {
        return "测量结束、关闭页面失败:  " + th.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P(final Throwable th) {
        HMLog.warn(S, new Function0() { // from class: pr3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMWeightingActivity.O(th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(DialogInterface dialogInterface, int i) {
        Z(this.R, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(WeightAdvData weightAdvData) {
        this.F = false;
        BFKeeper.setChooseUserShowing(false);
        HMLog.i(S, "onDismiss   " + this.P + " , " + this.Q, new Object[0]);
        if (F(weightAdvData) || isFinishing()) {
            return;
        }
        if (this.P <= 0) {
            finish();
        } else if (weightAdvData.isImpedanceStable()) {
            A(this.R, false);
        } else {
            Z(this.R, false);
        }
    }

    private void S(final WeightAdvData weightAdvData) {
        if (WeightInfoManager.getManager().getInfo(weightAdvData.getTimestamp()) != null) {
            HMLog.d(S, "this stable data has existed in database , return !!!", new Object[0]);
            return;
        }
        if (this.H) {
            UserInfos guest = UserInfoManager.getManager().getGuest();
            a0(guest);
            this.P = BodyParamsUtils.getWeightAge(weightAdvData.getTimestamp(), guest.getBirthday());
            this.Q = guest.getHeight().intValue();
            WeightInfoManager.getManager().setGuestWeightData(weightAdvData);
            WeightInfoRepository.INSTANCE.getInstance().addWeightInfo(z(weightAdvData));
            A(null, true);
            Observable.just(HMLocalPropertyUtil.getLocalProperty(BodyfatProperty.PROPERTY_GUEST_WEIGHTING_TIME_SETTING, "")).map(new Func1() { // from class: kr3
                @Override // rx.functions.Func1
                public final Object call(Object obj) {
                    return HMWeightingActivity.K(weightAdvData, (String) obj);
                }
            }).toSingle().subscribe(new a());
            return;
        }
        final List<UserInfos> listMatchUsers = HMWeightUtils.matchUsers(weightAdvData);
        int size = listMatchUsers == null ? 0 : listMatchUsers.size();
        String str = S;
        HMLog.d(str, "match user size = " + size, new Object[0]);
        if (listMatchUsers != null && listMatchUsers.size() == 1) {
            final int weightAge = BodyParamsUtils.getWeightAge(weightAdvData.getTimestamp(), listMatchUsers.get(0).getBirthday());
            if (!BFCallback.getHMLoginManager().isAdult(weightAge) && BFCallback.getHMLoginManager().isInNonContinental()) {
                if (!listMatchUsers.get(0).getUserId().equals(BFCallback.getHMLoginManager().getValidUid() + "")) {
                    if (BFCallback.getHMLoginManager().isAdult()) {
                        BFCallback.getAppUtils().showGrantWeightDataRequestDialog(this, listMatchUsers.get(0).getUserId(), new WeightGrantRequestDialogLis() { // from class: nr3
                            @Override // com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis
                            public final void requestResult(boolean z) {
                                this.a.J(listMatchUsers, weightAdvData, weightAge, z);
                            }
                        });
                        return;
                    } else {
                        U(listMatchUsers, weightAdvData, weightAge);
                        return;
                    }
                }
            }
            U(listMatchUsers, weightAdvData, weightAge);
            return;
        }
        if (this.G) {
            HMLog.d(str, "this weightData was abandon , return !!!", new Object[0]);
            return;
        }
        HMLog.d(str, "weightdata time = " + weightAdvData.getTimestamp() + " , lastWeight = " + WeightInfoManager.getManager().getInfo(weightAdvData.getTimestamp()), new Object[0]);
        if (WeightInfoManager.getManager().getInfo(weightAdvData.getTimestamp()) == null) {
            showChoseUserFrag(weightAdvData);
            HMLog.d(str, "post EventChooseUser ,weight : " + weightAdvData, new Object[0]);
            return;
        }
        HMLog.d(str, "match user size = " + size + " , but post event choose user already.", new Object[0]);
    }

    private void T(WeightAdvData weightAdvData, UserInfos userInfos) {
        WeightInfos weightInfos = new WeightInfos();
        weightInfos.setDevice_id(BFCallback.getHMDeviceManager().getBoundDeviceId(HMDeviceType.WEIGHT));
        weightInfos.setSync(Integer.valueOf(this.G ? -2 : 0));
        weightInfos.setSync_qqhealth(Integer.valueOf(this.G ? 1 : 0));
        weightInfos.setTimestamp(Long.valueOf(weightAdvData.getTimestamp()));
        weightInfos.setWeight(Float.valueOf(weightAdvData.getValueKg()));
        weightInfos.setType(0);
        int boundWeightDeviceSourceValue = BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue();
        weightInfos.setSource(Integer.valueOf(boundWeightDeviceSourceValue));
        long j = Long.parseLong(userInfos.getUserId());
        if (j == Long.parseLong(BFCallback.getHMPersonInfo().getUserid())) {
            j = -1;
        }
        weightInfos.setUserId(Long.valueOf(j));
        boolean z = BFCallback.getHMDeviceManager().hasBoundBfs() && weightAdvData.isImpedanceStable();
        if (z) {
            weightInfos = BodyParamsUtils.addBodyParams(weightInfos, weightAdvData, j);
        } else {
            int iIntValue = userInfos.getHeight().intValue();
            float fCalcuBMI = HMWeightUtils.calcuBMI(iIntValue, weightInfos.getWeight().floatValue());
            float fCalculateIdealWeight = BodyParamsUtils.calculateIdealWeight(iIntValue, userInfos.getGender().intValue(), BodyParamsUtils.getWeightAge(weightAdvData.getTimestamp(), userInfos.getBirthday()), weightAdvData.getValueKg());
            weightInfos.setBmi(Float.valueOf(fCalcuBMI));
            weightInfos.setHeight(Integer.valueOf(iIntValue));
            weightInfos.setSbw(Float.valueOf(fCalculateIdealWeight));
        }
        WeightInfoManager manager = WeightInfoManager.getManager();
        boolean zIsWeightMergeResult = BFCallback.getHMPersonInfo().isWeightMergeResult();
        WeightInfos latestInfo = manager.getLatestInfo(weightInfos.getUserId().longValue());
        if (weightInfos.getUserId().longValue() != 0 && zIsWeightMergeResult && latestInfo != null && weightInfos.getTimestamp().longValue() - latestInfo.getTimestamp().longValue() <= 30000 && latestInfo.getSource().intValue() == boundWeightDeviceSourceValue) {
            HMLog.i(S, "<<merge>> realtime weighting:<" + latestInfo + "><" + weightInfos + SearchCriteria.GT, new Object[0]);
            manager.deleteInfo(latestInfo);
        }
        if ("alpha".equals(BFCallback.getInstance().getChannel()) || BFCallback.getInstance().isInner()) {
            HMLog.i(S, "add weight :" + HMWeightUtils.toString(weightInfos), new Object[0]);
        }
        manager.addInfo(weightInfos);
        EventBus.getDefault().post(new EventWeightChanged(Long.parseLong(userInfos.getUserId()), 3));
        if (j == Long.parseLong(BFCallback.getHMPersonInfo().getUserid()) && BFCallback.getInstance().isLoginValid(this)) {
            weightInfos.setSync_qqhealth(0);
        }
        if (z) {
            this.R = userInfos.getUserId();
            this.P = BodyParamsUtils.getWeightAge(weightAdvData.getTimestamp(), userInfos.getBirthday());
            this.Q = userInfos.getHeight().intValue();
            if (F(weightAdvData)) {
                return;
            }
            A(userInfos.getUserId(), false);
        }
    }

    private void U(List<UserInfos> list, WeightAdvData weightAdvData, int i) {
        String str = S;
        HMLog.d(str, "matched userinfo = " + HMWeightUtils.parserUserInfos(list.get(0)), new Object[0]);
        a0(list.get(0));
        y(weightAdvData, list.get(0));
        if (this.G) {
            HMLog.d(str, "this weightData was abandon , return !!!", new Object[0]);
            return;
        }
        HMLog.d(str, "matched weight_age = " + i + " , " + weightAdvData.getImpedance() + "," + list.get(0).getHeight(), new Object[0]);
        this.R = list.get(0).getUserId();
        this.P = i;
        this.Q = list.get(0).getHeight().intValue();
        if (F(weightAdvData) || weightAdvData.isImpedanceStable()) {
            return;
        }
        Z(list.get(0).getUserId(), false);
    }

    private void V() {
        if (BFCallback.getInstance().isForeground()) {
            return;
        }
        BFCallback.getHMDeviceManager().destroyDevice(HMDeviceType.WEIGHT);
    }

    private void W(String str) {
        HMLog.d(S, "showChooseErrorDialog  ", new Object[0]);
        if (isFinishing()) {
            return;
        }
        new AlertDialogFragment.Builder(this).setNeutralButton(getString(R.string.got_it), new DialogInterface.OnClickListener() { // from class: ir3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.Q(dialogInterface, i);
            }
        }).setMessage(str).setCancelable(true).show(getSupportFragmentManager());
    }

    private void X(WeightAdvData weightAdvData) {
        this.y.setText(R.string.weighting_weight_bf_failed);
        this.z.setVisibility(0);
        if (this.H) {
            this.C.setText(R.string.weighting_weight_bf_abandon);
        } else {
            this.A.setText(R.string.weighting_weight_bf_abandon);
            this.C.setText(R.string.weighting_weight_bf_save);
        }
        V();
    }

    private void Y() {
        startActivity(new Intent(this, (Class<?>) MeasureFailureActivity.class));
    }

    private void Z(String str, boolean z) {
        Intent intent = new Intent(this, (Class<?>) WeightDetailActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(BFConstant.KEY_UID, str);
        }
        intent.putExtra("IS_GUEST", z);
        startActivity(intent);
        finish();
    }

    private void a0(UserInfos userInfos) {
        String str = S;
        HMLog.d(str, "updateView", new Object[0]);
        this.x.setWeightUnit(HMWeightUtils.toUnitStr(this, BFCallback.getUnitManager().getWeightUnit()));
        HMLog.d(str, "name = " + userInfos.getName(), new Object[0]);
        this.x.setWeightTips(userInfos.getName());
        this.y.setText("");
        this.x.setBmiNumber("");
        this.x.setBmiText("");
        this.x.setBmiStandard("");
    }

    private void b0() throws ParseException {
        WeightInfos latestInfo = WeightInfoManager.getManager().getLatestInfo();
        if (latestInfo == null) {
            HMLog.d(S, "lastWeightInfo weightInfo is null!!!", new Object[0]);
            return;
        }
        UserInfos info = UserInfoManager.getManager().getInfo(latestInfo.getUserId().longValue());
        if (info == null) {
            HMLog.d(S, "lastWeightInfo userinfos is null!!!", new Object[0]);
            return;
        }
        String name = info.getName();
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        this.x.setWeightNumber(HMWeightUtils.getWeightValueStringForDisplay(latestInfo.getWeight().floatValue(), weightUnit));
        this.x.setWeightUnit(HMWeightUtils.toUnitStr(this, weightUnit));
        this.x.setWeightTips(name);
        this.x.setMaxWeightNumber(HMWeightUtils.convertFromKg(150.0f, weightUnit));
        String str = S;
        HMLog.d(str, "score = " + latestInfo.getScore(), new Object[0]);
        HMLog.d(str, "body_fat = " + latestInfo.getBody_fat(), new Object[0]);
        if (latestInfo.getScore() == null || latestInfo.getBody_fat() == null) {
            this.x.setBmiNumber("");
            this.x.setBmiText("");
            this.x.setBmiStandard("");
        } else {
            this.x.setBmiNumber(AESEncryptionHelper.SEPARATOR);
            this.x.setBmiText(getResources().getString(R.string.body_score_label, Integer.valueOf(latestInfo.getScore().intValue())));
            this.x.setBmiStandard(getResources().getString(R.string.body_fat_label, HMWeightUtils.scaleFloatToDown(latestInfo.getBody_fat().floatValue(), 1) + "%"));
        }
        this.x.setMaxWeightNumber(HMWeightUtils.convertFromKg(150.0f, weightUnit));
    }

    private void showChoseUserFrag(final WeightAdvData weightAdvData) {
        Bundle bundle = new Bundle();
        bundle.putString(WeightAdvData.WEIGHTADVDATA_KEY, weightAdvData.toJsonString());
        bundle.putBoolean(BFConstant.FROM_BABY_WEIGHT, false);
        this.E = (WeightChooseUserFragment) Fragment.instantiate(this, WeightChooseUserFragment.class.getName(), bundle);
        this.F = true;
        BFKeeper.setChooseUserShowing(true);
        this.E.setOnDismissListener(new WeightChooseUserFragment.OnDialogDismissListener() { // from class: lr3
            @Override // com.xiaomi.hm.health.bodyfat.activity.WeightChooseUserFragment.OnDialogDismissListener
            public final void onDismiss() {
                this.a.R(weightAdvData);
            }
        });
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(android.R.id.content, this.E);
        fragmentTransactionBeginTransaction.commit();
    }

    private void y(WeightAdvData weightAdvData, UserInfos userInfos) {
        WeightInfoManager manager = WeightInfoManager.getManager();
        WeightInfos info = manager.getInfo(weightAdvData.getTimestamp());
        String str = S;
        HMLog.d(str, "weightdata time = " + weightAdvData.getTimestamp() + " , isExistWeight = " + info, new Object[0]);
        if (manager.getInfo(weightAdvData.getTimestamp()) == null) {
            T(weightAdvData, userInfos);
        } else {
            HMLog.d(str, "the data exist in database!!!", new Object[0]);
        }
    }

    private WeightInfos z(WeightAdvData weightAdvData) {
        return WeightInfoCreateHelper.INSTANCE.createWeightInfo(UserInfoManager.getManager().getGuest(), weightAdvData.getTimestamp(), weightAdvData.getValueKg(), weightAdvData.getImpedance());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.weighting_bf_save) {
            HMLog.i(S, "是否是访客模式:" + this.H, new Object[0]);
            if (this.H) {
                finish();
                return;
            } else {
                this.G = false;
                S(this.I);
                return;
            }
        }
        if (id == R.id.weighting_bf_help) {
            Y();
            return;
        }
        if (id == R.id.weighting_bf_abandon) {
            WeightAdvData weightAdvData = this.I;
            if (weightAdvData != null && !this.H) {
                this.G = true;
                S(weightAdvData);
            } else if (this.H) {
                EventBus.getDefault().post(new EventFinishGuestPre(true));
            }
            finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        setStyle(BaseTitleActivity.STYLE.NONE);
        setContentView(R.layout.activity_weighting);
        BFCallback.getInstance().eventBusDevice(true);
        EventBus.getDefault().register(this);
        this.x = (WeightingDynamicWeightView) findViewById(R.id.weight_dynamic_view);
        this.y = (TextView) findViewById(R.id.weighting_title_id);
        this.z = (RelativeLayout) findViewById(R.id.weighting_result_op_rl);
        this.A = (TextView) findViewById(R.id.weighting_bf_abandon);
        this.B = (TextView) findViewById(R.id.weighting_bf_help);
        this.C = (TextView) findViewById(R.id.weighting_bf_save);
        this.D = (TextView) findViewById(R.id.small_weight_tips);
        this.A.setOnClickListener(this);
        this.C.setOnClickListener(this);
        this.B.setOnClickListener(this);
        boolean booleanExtra = getIntent().getBooleanExtra("IS_GUEST", false);
        this.H = booleanExtra;
        if (booleanExtra) {
            this.y.setText(R.string.please_stand_on_weighing_scale);
            this.A.setVisibility(8);
        }
        BFKeeper.setChooseUserShowing(false);
        getWindow().addFlags(128);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        isUserWeighting = false;
        BFCallback.getInstance().eventBusDevice(false);
        EventBus.getDefault().unregister(this);
        WeightChooseUserFragment weightChooseUserFragment = this.E;
        if (weightChooseUserFragment != null) {
            weightChooseUserFragment.onCancel(null);
        }
        V();
        getWindow().clearFlags(128);
    }

    public void onEventMainThread(BFDeviceBatteryEvent bFDeviceBatteryEvent) {
        WeightingDynamicWeightView weightingDynamicWeightView;
        HMLog.d(S, "收到设备电量消息   " + bFDeviceBatteryEvent.getDeviceType() + " " + bFDeviceBatteryEvent.getBatteryInfo(), new Object[0]);
        if (bFDeviceBatteryEvent.getDeviceType() != HMDeviceType.WEIGHT || (weightingDynamicWeightView = this.x) == null) {
            return;
        }
        weightingDynamicWeightView.post(new Runnable() { // from class: or3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.M();
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.F) {
            HMLog.i(S, "Receive key event:" + i, new Object[0]);
            if (keyEvent.getAction() == 0 && i == 4) {
                this.E.onCancel(null);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        isUserWeighting = true;
    }

    public void onEventMainThread(EventSelectedUser eventSelectedUser) {
        String str = S;
        HMLog.d(str, "EventSelectedUser uid   " + eventSelectedUser.uid + " " + eventSelectedUser.timestamp, new Object[0]);
        UserInfos info = UserInfoManager.getManager().getInfo(eventSelectedUser.uid);
        this.P = BodyParamsUtils.getWeightAge(eventSelectedUser.timestamp, info.getBirthday());
        this.Q = info.getHeight().intValue();
        this.R = eventSelectedUser.uid + "";
        HMLog.d(str, "weight_age   " + this.P + " , " + this.Q, new Object[0]);
    }

    public void onEventMainThread(BFDeviceWeightValueEvent bFDeviceWeightValueEvent) throws ParseException {
        String str = S;
        HMLog.d(str, "HMDeviceWeightValueEvent isBound + " + bFDeviceWeightValueEvent.isBoundValue() + ", data =  " + bFDeviceWeightValueEvent.getWeightAdvData(), new Object[0]);
        if (bFDeviceWeightValueEvent.getWeightAdvData() == null || this.z.isShown()) {
            return;
        }
        if (BFKeeper.getChooseUserShowing().booleanValue()) {
            HMLog.d(str, "choose user dialog is showing ,return!", new Object[0]);
            V();
            return;
        }
        this.x.forceToNormal();
        WeightDataState weightDataState = this.N;
        WeightDataState weightDataState2 = WeightDataState.noStable_noFinish;
        if (weightDataState == weightDataState2 && !bFDeviceWeightValueEvent.getWeightAdvData().isFinish() && !bFDeviceWeightValueEvent.getWeightAdvData().isStable() && System.currentTimeMillis() - this.O > T) {
            HMLog.i(str, "last state is : noStable_noFinish , thisTime is not finish and over 4 sendconds , change finish state.", new Object[0]);
            bFDeviceWeightValueEvent.getWeightAdvData().setFinish(true);
        }
        bFDeviceWeightValueEvent.getWeightAdvData().checkTimestamp();
        long timestamp = bFDeviceWeightValueEvent.getWeightAdvData().getTimestamp();
        boolean zIsFinish = bFDeviceWeightValueEvent.getWeightAdvData().isFinish();
        String str2 = StatEvent.Weight_Scale_Fail;
        if (zIsFinish) {
            if (!bFDeviceWeightValueEvent.getWeightAdvData().isStable()) {
                HMLog.i(str, "when datastate isfinish = true, isStable = false , state = " + this.N, new Object[0]);
                WeightDataState weightDataState3 = this.N;
                if (weightDataState3 == null) {
                    return;
                }
                if (weightDataState3 == WeightDataState.isStable_noFinish_measuringBf) {
                    this.x.hideFatMeasuringView();
                }
                WeightDataState weightDataState4 = this.N;
                if (weightDataState4 == weightDataState2 || weightDataState4 == WeightDataState.isStable_noFinish) {
                    this.N = WeightDataState.noStable_isFinish;
                    if (!BFCallback.getHMDeviceManager().hasBound(HMDeviceSource.WEIGHT)) {
                        str2 = StatEvent.Weight_BodyFatScale_Fail;
                    }
                    Analytics.event(this, str2, StatEvent.Notstable);
                    Analytics.event(this, StatEvent.Measure_BodyFat_Fail, StatEvent.Measure_NotOver);
                    CustomToast.makeText(this, BFCallback.getHMDeviceManager().hasBoundBfs() ? R.string.weight_bfs_instable_left_title : R.string.weight_instable_left_title, 1, 17).show();
                    Observable.timer(2L, TimeUnit.SECONDS).observeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: sr3
                        @Override // rx.functions.Action1
                        public final void call(Object obj) {
                            this.a.N((Long) obj);
                        }
                    }, new Action1() { // from class: tr3
                        @Override // rx.functions.Action1
                        public final void call(Object obj) {
                            HMWeightingActivity.P((Throwable) obj);
                        }
                    });
                    return;
                }
                return;
            }
            HMLog.i(str, "state = " + this.N, new Object[0]);
            WeightDataState weightDataState5 = this.N;
            if (weightDataState5 == null) {
                finish();
                return;
            }
            if (weightDataState5 == weightDataState2 || weightDataState5 == WeightDataState.isStable_noFinish || weightDataState5 == WeightDataState.isStable_noFinish_measuringBf) {
                if (this.J.contains(Long.valueOf(bFDeviceWeightValueEvent.getWeightAdvData().getTimestamp()))) {
                    if (this.N == weightDataState2) {
                        HMLog.i(str, "已处理：last data is : noStable,noFinish data; but this data : isStable,isFinish ", new Object[0]);
                        return;
                    } else {
                        HMLog.i(str, "已处理：last data is : isStable,noFinish, 65534 data; but this data : isStable,isFinish ", new Object[0]);
                        return;
                    }
                }
                this.J.add(Long.valueOf(bFDeviceWeightValueEvent.getWeightAdvData().getTimestamp()));
                if (this.N == weightDataState2) {
                    HMLog.i(str, "save：last data is : noStable,noFinish data; but this data : isStable,isFinish ", new Object[0]);
                } else {
                    HMLog.i(str, "save：last data is : isStable,noFinish, 65534 data; but this data : isStable,isFinish ", new Object[0]);
                }
                this.N = WeightDataState.isStable_isFinish;
                B(bFDeviceWeightValueEvent.getWeightAdvData());
                return;
            }
            return;
        }
        if (this.x != null) {
            this.D.setVisibility(8);
            if (bFDeviceWeightValueEvent.getWeightAdvData().isOverload()) {
                HMLog.i(str, "weight data is overload, return !", new Object[0]);
                EventBus.getDefault().post(new EventWeightOverload());
                this.x.normalToOverweight();
                int type = bFDeviceWeightValueEvent.getWeightAdvData().getType();
                String unitStr = HMWeightUtils.toUnitStr(this, type);
                int weightMaxKg = (int) HMWeightUtils.getWeightMaxKg();
                HMLog.d(str + "OVER", "weightUnit " + unitStr + " unit " + type, new Object[0]);
                this.x.setWeightNumber(HMWeightUtils.getWeightValueStringForDisplay(HMWeightUtils.convertToKg((float) weightMaxKg, type), type));
                this.x.setMaxWeightNumber(HMWeightUtils.convertFromKg(150.0f, type));
                this.x.setWeightOverloadTips(getString(R.string.over_max_range_weight, new Object[]{weightMaxKg + unitStr}));
                this.y.setText(R.string.weight_overload_title);
                if (!BFCallback.getHMDeviceManager().hasBound(HMDeviceSource.WEIGHT)) {
                    str2 = StatEvent.Weight_BodyFatScale_Fail;
                }
                Analytics.event(this, str2, "OL");
                return;
            }
            if (!this.M.contains(Long.valueOf(timestamp)) && !this.L.contains(Long.valueOf(timestamp)) && !this.K.contains(Long.valueOf(timestamp))) {
                this.y.setText(getString(R.string.weight_measuring));
                HMLog.d(str, "vlaue = " + bFDeviceWeightValueEvent.getWeightAdvData().getValue(), new Object[0]);
                this.x.setWeightNumber(HMWeightUtils.getWeightValueStringForDisplay(bFDeviceWeightValueEvent.getWeightAdvData().getValueKg(), bFDeviceWeightValueEvent.getWeightAdvData().getType()));
                this.x.setWeightUnit(HMWeightUtils.toUnitStr(this, bFDeviceWeightValueEvent.getWeightAdvData().getType()));
                this.x.setMaxWeightNumber(HMWeightUtils.convertFromKg(150.0f, bFDeviceWeightValueEvent.getWeightAdvData().getType()));
                this.x.setBmiNumber("");
                this.x.setBmiText("");
                this.x.setBmiStandard("");
                if (bFDeviceWeightValueEvent.getWeightAdvData().isStable()) {
                    this.N = WeightDataState.isStable_noFinish;
                    B(bFDeviceWeightValueEvent.getWeightAdvData());
                    return;
                } else {
                    this.N = weightDataState2;
                    this.O = System.currentTimeMillis();
                    return;
                }
            }
            HMLog.i(str, "this weight data is alreay handle, return !", new Object[0]);
        }
    }
}
