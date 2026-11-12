package com.xiaomi.hm.health.bodyfat.activity;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.BabyWeightActivity;
import com.xiaomi.hm.health.bodyfat.delegate.ScaleToolUtilsDelegate;
import com.xiaomi.hm.health.bodyfat.event.BFDeviceBatteryEvent;
import com.xiaomi.hm.health.bodyfat.event.BFDeviceWeightValueEvent;
import com.xiaomi.hm.health.bodyfat.event.BFEventBluetooth;
import com.xiaomi.hm.health.bodyfat.event.EventWeightChanged;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.model.WeightDataState;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.BFKeeper;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.ScaleSettingUpdateUtil;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis;
import com.xiaomi.hm.health.bodyfat.viewmodel.BabyWeightViewModel;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import de.greenrobot.event.EventBus;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class BabyWeightActivity extends BaseTitleActivity {
    private static final String m0 = "Weight-BabyWeightActivity";
    private static final String n0 = "SCALE_BABY";
    private static final int o0 = 1;
    private static final int p0 = 16;
    private static final int q0 = 17;
    private static final float r0 = 1.0f;
    private static final int s0 = 16;
    private TextView A;
    private TextView B;
    private ImageView C;
    private RelativeLayout D;
    private View E;
    private TextView F;
    private float J;
    private float K;
    private String N;
    private int O;
    private LoadingDialog P;
    private BabyWeightViewModel Q;
    private WeightAdvData V;
    private WeightAdvData W;
    private WeightDataState X;
    private Context x;
    private TextView y;
    private TextView z;
    private boolean G = false;
    private boolean H = false;
    private boolean I = false;
    private boolean L = false;
    private boolean M = false;
    private float R = 0.0f;
    private boolean S = false;
    private Handler T = new e(this);
    private float U = 0.0f;
    private List<Long> Y = new ArrayList();
    private List<Long> Z = new ArrayList();

    public class a implements Observer<Boolean> {
        public a() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                BabyWeightActivity.this.Q.weightMatchUsers();
            } else if (BabyWeightActivity.this.Q.getWeightAdvData() != null) {
                BabyWeightActivity babyWeightActivity = BabyWeightActivity.this;
                babyWeightActivity.n0(babyWeightActivity.Q.getWeightAdvData());
            }
        }
    }

    public class b implements Observer<List<UserInfos>> {
        public b() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(List<UserInfos> list) {
            if (list.size() == 1) {
                BabyWeightActivity.this.startActivity(WeightDetailActivity.getIntentWithParams(BabyWeightActivity.this, list.get(0).getUserId(), false, false));
            } else if (BabyWeightActivity.this.Q.getWeightAdvData() != null) {
                BabyWeightActivity babyWeightActivity = BabyWeightActivity.this;
                babyWeightActivity.showChoseUserFrag(babyWeightActivity.Q.getWeightAdvData());
            }
        }
    }

    public class c implements Animator.AnimatorListener {
        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(ValueAnimator valueAnimator) {
            BabyWeightActivity.this.C.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BabyWeightActivity.this.S = false;
            BabyWeightActivity.this.C.setX(BabyWeightActivity.this.R);
            BabyWeightActivity.this.C.setImageAlpha(0);
            if (BFCallback.getHMDeviceManager().hasBoundBfs()) {
                BabyWeightActivity.this.C.setBackgroundResource(R.drawable.baby_weight_adult_with_baby_bfs);
            } else {
                BabyWeightActivity.this.C.setBackgroundResource(R.drawable.baby_weight_adult_with_baby);
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xiaomi.hm.health.bodyfat.activity.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.b(valueAnimator);
                }
            });
            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfFloat.setDuration(700L);
            valueAnimatorOfFloat.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class d implements Animator.AnimatorListener {
        public d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(ValueAnimator valueAnimator) {
            BabyWeightActivity.this.C.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BabyWeightActivity.this.S = false;
            BabyWeightActivity.this.C.setX(BabyWeightActivity.this.R);
            BabyWeightActivity.this.C.setImageAlpha(0);
            BabyWeightActivity.this.C.setBackgroundResource(R.drawable.baby_weight_icon);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xiaomi.hm.health.bodyfat.activity.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.b(valueAnimator);
                }
            });
            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfFloat.setDuration(700L);
            valueAnimatorOfFloat.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static class e extends Handler {
        private final WeakReference<BabyWeightActivity> a;

        public e(BabyWeightActivity babyWeightActivity) {
            this.a = new WeakReference<>(babyWeightActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                float f = this.a.get().U;
                int i2 = this.a.get().O;
                this.a.get().A.setText(HMWeightUtils.getWeightValueStringForDisplay(HMWeightUtils.convertToKg(f, i2), i2));
                this.a.get().B.setText(this.a.get().N);
                return;
            }
            if (i == 16) {
                this.a.get().h0();
            } else if (i == 17) {
                this.a.get().h0();
                this.a.get().L();
            }
        }
    }

    private String K() {
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            this.B.setText("");
            return getString(R.string.empty_value);
        }
        this.B.setText(this.N);
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumFractionDigits(1);
        return numberInstance.format(0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        WeightAdvData weightAdvData;
        float fAbs = Math.abs(HMWeightUtils.scaleWeight(this.K - this.J));
        if (this.V.getValue() > this.W.getValue()) {
            weightAdvData = this.V;
            e0(this.W);
        } else {
            weightAdvData = this.W;
            e0(this.V);
        }
        j0(weightAdvData);
        long timestamp = this.V.getTimestamp() > this.W.getTimestamp() ? this.V.getTimestamp() : this.W.getTimestamp();
        HMLog.d(m0, "baby weight " + fAbs, new Object[0]);
        weightAdvData.setTimestamp(timestamp + 1000);
        weightAdvData.setValue(fAbs);
        if (HMWeightUtils.convertToKg(fAbs, this.O) < 1.0f) {
            r0(weightAdvData);
        } else {
            f0(weightAdvData);
        }
        i0();
    }

    private void M(WeightAdvData weightAdvData) {
        if (this.G) {
            this.G = false;
            this.H = true;
            HMLog.d(m0, "adult weight " + weightAdvData.getValue(), new Object[0]);
            this.V = weightAdvData;
            this.J = weightAdvData.getValue();
            this.U = 0.0f;
            this.T.sendEmptyMessage(16);
            return;
        }
        if (this.H) {
            if (weightAdvData.getTimestamp() == this.V.getTimestamp()) {
                HMLog.d(m0, "value of withbaby is the same as adult", new Object[0]);
                this.U = 0.0f;
                this.T.sendEmptyMessage(1);
                return;
            }
            this.M = true;
            this.W = weightAdvData;
            HMLog.d(m0, "adult with baby weight " + weightAdvData.getValue(), new Object[0]);
            this.K = weightAdvData.getValue();
            this.G = false;
            this.H = false;
            this.I = true;
            this.T.sendEmptyMessage(17);
        }
    }

    private void N(WeightAdvData weightAdvData) {
        O();
        long timestamp = weightAdvData.getTimestamp();
        if (!weightAdvData.isFinish()) {
            int type = weightAdvData.getType();
            this.O = type;
            this.N = HMWeightUtils.toUnitStr(this.x, type);
            if (weightAdvData.isOverload()) {
                HMLog.d(m0, "isOverload = " + weightAdvData.isOverload(), new Object[0]);
                o0(this.O);
                return;
            }
            this.U = weightAdvData.getValue();
            this.T.sendEmptyMessage(1);
            if (!weightAdvData.isStable()) {
                this.X = WeightDataState.noStable_noFinish;
                return;
            } else {
                this.X = WeightDataState.isStable_noFinish;
                M(weightAdvData);
                return;
            }
        }
        if (!weightAdvData.isStable()) {
            HMLog.d(m0, "when data state isFinish = true, isStable = false , state = " + this.X, new Object[0]);
            WeightDataState weightDataState = this.X;
            if (weightDataState == WeightDataState.noStable_noFinish || weightDataState == WeightDataState.isStable_noFinish) {
                this.X = WeightDataState.noStable_isFinish;
                Analytics.recordEvent(new CountEventBuilder(StatEvent.BABY_WEIGHT_WEIGHT_FAILURE).setValue(StatEvent.WEIGHT_FAILURE_NOT_STABLE));
                if (this.Z.contains(Long.valueOf(timestamp))) {
                    HMLog.d(m0, "toast is showed,return !", new Object[0]);
                    return;
                }
                this.Z.add(Long.valueOf(timestamp));
            }
            this.A.setText(K());
            return;
        }
        HMLog.i(m0, "state = " + this.X, new Object[0]);
        WeightDataState weightDataState2 = this.X;
        WeightDataState weightDataState3 = WeightDataState.noStable_noFinish;
        if (weightDataState2 == weightDataState3 || weightDataState2 == WeightDataState.isStable_noFinish_measuringBf) {
            if (this.Y.contains(Long.valueOf(weightAdvData.getTimestamp()))) {
                if (this.X == weightDataState3) {
                    HMLog.i(m0, "已处理：last data is : noStable,noFinish data; but this data : isStable,isFinish ", new Object[0]);
                } else {
                    HMLog.i(m0, "已处理：last data is : isStable,noFinish, 65534 data; but this data : isStable,isFinish ", new Object[0]);
                }
                this.A.setText(K());
                return;
            }
            this.Y.add(Long.valueOf(weightAdvData.getTimestamp()));
            if (this.X == weightDataState3) {
                HMLog.i(m0, "save：last data is : noStable,noFinish data; but this data : isStable,isFinish ", new Object[0]);
            } else {
                HMLog.i(m0, "save：last data is : isStable,noFinish, 65534 data; but this data : isStable,isFinish ", new Object[0]);
            }
            M(weightAdvData);
        }
    }

    private void O() {
        this.F.setVisibility(8);
        this.E.setVisibility(0);
    }

    private void P() {
        this.x = this;
        HMLog.d(m0, "need reminder " + BFKeeper.getNeedBabyWeightRemind(), new Object[0]);
        this.M = false;
        this.G = true;
        this.H = false;
        BFCallback.getInstance().eventBusDevice(true);
        EventBus.getDefault().register(this);
        BabyWeightViewModel babyWeightViewModel = (BabyWeightViewModel) ViewModelProviders.of(this).get(BabyWeightViewModel.class);
        this.Q = babyWeightViewModel;
        babyWeightViewModel.getHasChild().observe(this, new a());
        this.Q.getMatchUser().observe(this, new b());
    }

    private void Q(WeightAdvData weightAdvData, long j) {
        WeightInfos fromWeightData = HMWeightUtils.parseFromWeightData(weightAdvData, j, 2);
        HMLog.d(m0, "weightInfo = " + HMWeightUtils.toString(fromWeightData), new Object[0]);
        WeightInfoManager.getManager().addInfo(fromWeightData);
        EventBus.getDefault().post(new EventWeightChanged(j, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String R(WeightAdvData weightAdvData) {
        return "baby weight get smaller weight : " + weightAdvData.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String S(List list) {
        return "matched user size =  " + list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String T() {
        return "baby weight get smaller weight match 1 user";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.BABY_WEIGHT_WEIGHT_FAILURE).setValue(StatEvent.WEIGHT_FAILURE_LOW_ELEC));
        this.F.setText(R.string.battery_low);
        this.F.setVisibility(0);
        this.E.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(ValueAnimator valueAnimator) {
        this.C.setX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(ValueAnimator valueAnimator) {
        this.C.setX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X() {
        BFKeeper.setChooseUserShowing(false);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(WeightAdvData weightAdvData, DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this, (Class<?>) WeightMemberDetailActivity.class);
        intent.putExtra(BFConstant.KET_ADD_NEW, true);
        intent.putExtra(BFConstant.KET_ADD_NEW_WEIGHT_HAVED, true);
        intent.putExtra(WeightAdvData.WEIGHTADVDATA_KEY, weightAdvData.toJsonString());
        intent.putExtra(BFConstant.KET_ADD_NEW_BABY, true);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(boolean z) {
        if (!z) {
            finish();
            return;
        }
        this.L = true;
        if (BFKeeper.getNeedBabyWeightRemind()) {
            q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(DialogInterface dialogInterface, int i) {
        g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(WeightAdvData weightAdvData, DialogInterface dialogInterface, int i) {
        f0(weightAdvData);
    }

    private void e0(final WeightAdvData weightAdvData) {
        HMLog.info(m0, new Function0() { // from class: wl
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return BabyWeightActivity.R(weightAdvData);
            }
        });
        final List<UserInfos> listMatchUsers = HMWeightUtils.matchUsers(weightAdvData);
        HMLog.info(m0, new Function0() { // from class: xl
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return BabyWeightActivity.S(listMatchUsers);
            }
        });
        if (listMatchUsers.size() == 1) {
            HMLog.info(m0, new Function0() { // from class: yl
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return BabyWeightActivity.T();
                }
            });
            Analytics.recordEvent(new CountEventBuilder(StatEvent.BABY_WEIGHT_WEIGHT_SUCCESS).setValue("1"));
            Q(weightAdvData, Long.parseLong(listMatchUsers.get(0).getUserId()));
        }
    }

    private void f0(WeightAdvData weightAdvData) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.BABY_WEIGHT_WEIGHT_SUCCESS).setValue("0"));
        this.Q.hasChildFamily(weightAdvData);
    }

    private void g0() {
        this.X = null;
        this.W = null;
        this.V = null;
        this.Y.clear();
        this.Z.clear();
        this.G = true;
        this.H = false;
        this.I = false;
        this.M = false;
        this.U = 0.0f;
        h0();
        this.A.setText(K());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        if (this.S) {
            return;
        }
        this.S = true;
        if (this.G) {
            k0();
        } else if (this.H) {
            l0();
        } else if (this.I) {
            m0();
        }
        this.S = false;
        this.A.setVisibility(0);
        this.B.setVisibility(0);
        this.D.setVisibility(0);
    }

    private void i0() {
        if (BFCallback.getInstance().isForeground()) {
            return;
        }
        BFCallback.getHMDeviceManager().destroyDevice(HMDeviceType.WEIGHT);
    }

    private void initView() {
        this.y = (TextView) findViewById(R.id.baby_weight_title);
        this.z = (TextView) findViewById(R.id.baby_weight_content);
        this.A = (TextView) findViewById(R.id.baby_weight_value);
        this.B = (TextView) findViewById(R.id.baby_weight_value_unit);
        this.D = (RelativeLayout) findViewById(R.id.baby_weight_img_layout);
        this.C = (ImageView) findViewById(R.id.baby_weight_img_body);
        this.E = findViewById(R.id.baby_weight_value_area);
        TextView textView = (TextView) findViewById(R.id.tips_tv);
        this.F = textView;
        textView.setVisibility(8);
        this.N = HMWeightUtils.toUnitStr(this.x, BFCallback.getUnitManager().getWeightUnit());
        this.A.setText(K());
        h0();
    }

    private void j0(WeightAdvData weightAdvData) {
        HMLog.d(m0, "start delete bigWeight , data = " + weightAdvData.toString(), new Object[0]);
        List<UserInfos> listMatchUsers = HMWeightUtils.matchUsers(weightAdvData);
        UserInfos userInfos = new UserInfos();
        if (listMatchUsers != null && listMatchUsers.size() == 1) {
            userInfos = listMatchUsers.get(0);
        }
        if (WeightInfoManager.getManager().getInfo(weightAdvData.getTimestamp()) != null) {
            HMLog.i(m0, "the data exist in database!!!", new Object[0]);
            return;
        }
        WeightInfos weightInfos = new WeightInfos();
        weightInfos.setDevice_id(weightAdvData.getDeviceId());
        weightInfos.setSync(-2);
        weightInfos.setType(0);
        weightInfos.setWeight(Float.valueOf(weightAdvData.getValueKg()));
        weightInfos.setUserId(Long.valueOf(userInfos.getUserId() == null ? "0" : userInfos.getUserId()));
        weightInfos.setTimestamp(Long.valueOf(weightAdvData.getTimestamp()));
        WeightInfoManager.getManager().addInfo(weightInfos);
        HMLog.d(m0, "add bigWeight , data = " + HMWeightUtils.toString(weightInfos), new Object[0]);
    }

    private void k0() {
        this.S = false;
        if (BFCallback.getHMDeviceManager().hasBoundBfs()) {
            this.C.setBackgroundResource(R.drawable.baby_weight_adult_bfs);
        } else {
            this.C.setBackgroundResource(R.drawable.baby_weight_adult);
        }
        this.y.setText(getString(R.string.baby_weight_adult_weight_title));
        this.z.setVisibility(0);
        this.z.setText(getString(R.string.baby_weight_adult_weight_content));
    }

    private void l0() {
        float x = this.C.getX();
        this.R = x;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(x, 0.0f - x);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zl
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.V(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(700L);
        valueAnimatorOfFloat.start();
        this.z.setVisibility(0);
        this.y.setText(getString(R.string.baby_weight_baby_weight_title));
        this.z.setText(getString(R.string.baby_weight_baby_weight_content));
    }

    private void m0() {
        float x = this.C.getX();
        this.R = x;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(x, 0.0f - x);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vl
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.W(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new d());
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(700L);
        valueAnimatorOfFloat.start();
        this.A.setText(HMWeightUtils.getWeightValueStringForDisplay(HMWeightUtils.convertToKg(Math.abs(HMWeightUtils.scaleWeight(this.K - this.J)), this.O), this.O));
        this.y.setText(getString(R.string.baby_weight));
        this.z.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(final WeightAdvData weightAdvData) {
        String weightValueStringForDisplay = HMWeightUtils.getWeightValueStringForDisplay(HMWeightUtils.convertToKg(weightAdvData.getValue(), weightAdvData.getType()), weightAdvData.getType());
        new AlertDialogFragment.Builder(this).setCancelable(false).setTitle(getString(R.string.generate_baby_weight_title, new Object[]{weightValueStringForDisplay + this.N})).setMessage(R.string.generate_baby_weight_message).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: bm
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.Y(dialogInterface, i);
            }
        }).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: dm
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.Z(weightAdvData, dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void o0(int i) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.BABY_WEIGHT_WEIGHT_FAILURE).setValue(StatEvent.WEIGHT_FAILURE_OVER_WEIGHT));
        this.F.setVisibility(0);
        this.F.setText(getString(R.string.over_max_range_weight, new Object[]{HMWeightUtils.getWeightMaxWithUnitText(i)}));
        this.E.setVisibility(8);
    }

    private void p0() {
        this.L = false;
        BFCallback.getAppUtils().showGrantWeightDataRequestDialog(this, "baby", new WeightGrantRequestDialogLis() { // from class: gm
            @Override // com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis
            public final void requestResult(boolean z) {
                this.a.a0(z);
            }
        });
    }

    private void q0() {
        new AlertDialogFragment.Builder(this).setCancelable(false).setMessage(R.string.baby_weight_warning_content).setNegativeButton(R.string.never_reminder, new DialogInterface.OnClickListener() { // from class: em
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BFKeeper.setShowBabyWeightRemind(true);
            }
        }).setPositiveButton(R.string.got_it, (DialogInterface.OnClickListener) null).show(getSupportFragmentManager());
    }

    private void r0(final WeightAdvData weightAdvData) {
        String weightValueStringForDisplay = HMWeightUtils.getWeightValueStringForDisplay(HMWeightUtils.convertToKg(weightAdvData.getValue(), weightAdvData.getType()), weightAdvData.getType());
        new AlertDialogFragment.Builder(this).setCancelable(false).setTitle(getString(R.string.baby_weight_too_small_weight, new Object[]{weightValueStringForDisplay + this.N})).setMessage(R.string.baby_weight_confirm_isbaby).setNegativeButton(R.string.re_weight, new DialogInterface.OnClickListener() { // from class: am
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.c0(dialogInterface, i);
            }
        }).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: cm
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.d0(weightAdvData, dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        HMLog.d(m0, "receive activity result " + i + " - data : " + intent, new Object[0]);
        super.onActivityResult(i, i2, intent);
        if (i != 16 || intent == null) {
            return;
        }
        long longExtra = intent.getLongExtra("UID", Long.parseLong(BFCallback.getHMPersonInfo().getUserid()));
        HMLog.d(m0, "uid = " + longExtra, new Object[0]);
        Intent intent2 = new Intent();
        intent2.putExtra("UID", longExtra);
        setResult(-1, intent2);
        finish();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_baby_weight);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.scale_measuring_bg_end_color));
        BFTitleStyleKt.setUnifyTitleStyle(this, getString(R.string.hold_baby_weight), null);
        p0();
        P();
        initView();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.BABY_WEIGHT_VIEW_NUM));
        getWindow().addFlags(128);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        BFCallback.getInstance().eventBusDevice(false);
        i0();
        getWindow().clearFlags(128);
        ScaleSettingUpdateUtil.INSTANCE.exitBabyWeightMode();
        HMLog.d(m0, "onDestroy", new Object[0]);
    }

    public void onEventMainThread(BFDeviceWeightValueEvent bFDeviceWeightValueEvent) {
        HMLog.i(m0, "抱婴称重页面收到体重event :" + bFDeviceWeightValueEvent.getWeightAdvData().toString(), new Object[0]);
        if (this.L) {
            if (bFDeviceWeightValueEvent.isBoundValue()) {
                HMLog.d(m0, "is Bound weight ,return !", new Object[0]);
                return;
            }
            if (this.M) {
                HMLog.d(m0, "is isWeightingFinish  ,return !", new Object[0]);
                return;
            }
            WeightAdvData weightAdvData = bFDeviceWeightValueEvent.getWeightAdvData();
            if (weightAdvData != null) {
                weightAdvData.checkTimestamp();
                N(weightAdvData);
            }
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onRightFuncClicked() {
        ScaleToolUtilsDelegate.getInstance().getToolUtil().addToMyTools(n0);
        CustomToast.showShort(getApplicationContext(), R.string.tool_add_success);
        showRightFunc(false);
    }

    public void showChoseUserFrag(WeightAdvData weightAdvData) {
        Bundle bundle = new Bundle();
        bundle.putString(WeightAdvData.WEIGHTADVDATA_KEY, weightAdvData.toJsonString());
        bundle.putBoolean(BFConstant.FROM_BABY_WEIGHT, true);
        WeightChooseUserFragment weightChooseUserFragment = new WeightChooseUserFragment();
        weightChooseUserFragment.setArguments(bundle);
        BFKeeper.setChooseUserShowing(true);
        weightChooseUserFragment.setOnDismissListener(new WeightChooseUserFragment.OnDialogDismissListener() { // from class: fm
            @Override // com.xiaomi.hm.health.bodyfat.activity.WeightChooseUserFragment.OnDialogDismissListener
            public final void onDismiss() {
                this.a.X();
            }
        });
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(R.id.family_container, weightChooseUserFragment);
        fragmentTransactionBeginTransaction.commit();
    }

    public void onEventMainThread(BFDeviceBatteryEvent bFDeviceBatteryEvent) {
        TextView textView;
        HMLog.d(m0, "收到设备电量消息   " + bFDeviceBatteryEvent.getDeviceType() + " " + bFDeviceBatteryEvent.getBatteryInfo(), new Object[0]);
        if (bFDeviceBatteryEvent.getDeviceType() != HMDeviceType.WEIGHT || (textView = this.F) == null) {
            return;
        }
        textView.post(new Runnable() { // from class: hm
            @Override // java.lang.Runnable
            public final void run() {
                this.a.U();
            }
        });
    }

    public void onEventMainThread(BFEventBluetooth bFEventBluetooth) {
        HMLog.d(m0, "收到蓝牙连接状态信息 " + bFEventBluetooth.isOn, new Object[0]);
        if (bFEventBluetooth.isOn || this.I) {
            return;
        }
        O();
        this.A.setText(K());
    }
}
