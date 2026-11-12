package com.xiaomi.hm.health.device.watchskinstore.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.watchskinstore.PayChannelBo;
import com.xiaomi.hm.health.device.watchskinstore.WatchSkinHelper;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchResult;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinBean;
import com.xiaomi.hm.health.device.watchskinstore.ui.WatchSkinOrderActivity;
import io.reactivex.functions.Consumer;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes12.dex */
public class WatchSkinOrderActivity extends BaseWatchSkinActivity {
    private static final String I = "WatchSkinOrderActivity";
    public static final String KEY_DEVICE = "device";
    public static final String KEY_SKIN = "watchSkin";
    private TextView A;
    private TextView B;
    private RadioButton C;
    private RadioButton D;
    private TextView E;
    private TextView F;
    private WatchSkinBean G;
    private final Lazy<DeviceUtilsApi> H = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private ImageView z;

    private void E() {
        this.D.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xk8
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.F(compoundButton, z);
            }
        });
        this.C.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: yk8
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.G(compoundButton, z);
            }
        });
        this.F.setOnClickListener(new View.OnClickListener() { // from class: sk8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.H(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(CompoundButton compoundButton, boolean z) {
        this.C.setChecked(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(CompoundButton compoundButton, boolean z) {
        this.D.setChecked(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(View view) {
        T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        showLoadingDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(WatchResult watchResult) {
        hideLoadingDialog();
        HMLog.d(I, "支付结果:" + watchResult, new Object[0]);
        int code = watchResult.getCode();
        if (code == -2 || "6001".equals(Integer.valueOf(code))) {
            CustomToast.showShort(this, R.string.cancel);
        } else {
            if (!watchResult.isSuccessful()) {
                IconToast.showError(this, R.string.pay_failed);
                return;
            }
            IconToast.showSuccess(this, R.string.pay_success);
            setResult(-1);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String K() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(Throwable th) {
        HMLog.error(I, "", th, new Function0() { // from class: tk8
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return WatchSkinOrderActivity.K();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WatchResult M() throws Exception {
        return WatchSkinHelper.generateOrderAndPay(this, this.G, this.C.isChecked() ? PayChannelBo.WECHAT : PayChannelBo.ALI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N(Boolean bool) throws Exception {
        HMLog.d(I, "获取READ_PHONE_STATE权限:" + bool, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String O() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P(Throwable th) throws Exception {
        HMLog.warn(I, th, new Function0() { // from class: el8
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return WatchSkinOrderActivity.O();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q(Boolean bool) throws Exception {
        HMLog.d(I, "获取READ_PHONE_NUMBERS权限" + bool, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String R() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S(Throwable th) throws Exception {
        HMLog.warn(I, th, new Function0() { // from class: fl8
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return WatchSkinOrderActivity.R();
            }
        });
    }

    private void T() {
        if (this.C.isChecked() && !WatchSkinHelper.checkWechatInstalled(this)) {
            CustomToast.showShort(this, R.string.tr_install_weixin_tips);
        } else if (this.H.getValue().checkPermission("android.permission.READ_PHONE_STATE")) {
            Observable.fromCallable(new Callable() { // from class: dl8
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.M();
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Action0() { // from class: uk8
                @Override // rx.functions.Action0
                public final void call() {
                    this.a.I();
                }
            }).subscribe(new Action1() { // from class: vk8
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.J((WatchResult) obj);
                }
            }, new Action1() { // from class: wk8
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    WatchSkinOrderActivity.L((Throwable) obj);
                }
            });
        }
    }

    private void U() {
        RxPermissions rxPermissions = new RxPermissions(this);
        if (!this.H.getValue().checkPermission("android.permission.READ_PHONE_STATE")) {
            rxPermissions.request("android.permission.READ_PHONE_STATE").subscribe(new Consumer() { // from class: zk8
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    WatchSkinOrderActivity.N((Boolean) obj);
                }
            }, new Consumer() { // from class: cl8
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    WatchSkinOrderActivity.P((Throwable) obj);
                }
            });
        }
        if (this.H.getValue().checkPermission("android.permission.READ_PHONE_NUMBERS")) {
            return;
        }
        rxPermissions.request("android.permission.READ_PHONE_NUMBERS").subscribe(new Consumer() { // from class: al8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                WatchSkinOrderActivity.Q((Boolean) obj);
            }
        }, new Consumer() { // from class: bl8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                WatchSkinOrderActivity.S((Throwable) obj);
            }
        });
    }

    private void V(String str) {
        String string = getString(R.string.watch_skin_total_price, new Object[]{str});
        SpannableString spannableString = new SpannableString(string);
        int iIndexOf = string.indexOf("￥");
        if (iIndexOf != -1) {
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FF6000")), iIndexOf, spannableString.length(), 33);
        }
        this.E.setText(spannableString);
    }

    public static void launchWatchSkinOrderActivity(Activity activity, HMDeviceSource hMDeviceSource, WatchSkinBean watchSkinBean, int i) {
        if (activity == null) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) WatchSkinOrderActivity.class);
        intent.putExtra("device", hMDeviceSource);
        intent.putExtra(KEY_SKIN, watchSkinBean);
        activity.startActivityForResult(intent, i);
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public int containerId() {
        return R.id.layout_container;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public int createLayout() {
        return R.layout.activity_watch_skin_order;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public int errorContainerId() {
        return R.id.error_container;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public void initData() {
        setTitleText(R.string.watch_skin_order_title);
        Intent intent = getIntent();
        WatchSkinBean watchSkinBean = intent == null ? null : (WatchSkinBean) intent.getSerializableExtra(KEY_SKIN);
        this.G = watchSkinBean;
        if (watchSkinBean == null) {
            finish();
            return;
        }
        WatchSkinHelper.loadImage(this, this.z, watchSkinBean.getImage());
        this.A.setText(this.G.getName());
        String strValueOf = String.valueOf(this.G.getPrice());
        this.B.setText(getString(R.string.watch_skin_price, new Object[]{strValueOf}));
        V(strValueOf);
        U();
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public void initView() {
        this.z = (ImageView) findViewById(R.id.skin_iv);
        this.A = (TextView) findViewById(R.id.skin_name_tv);
        this.B = (TextView) findViewById(R.id.skin_price_tv);
        this.E = (TextView) findViewById(R.id.skin_total_price_tv);
        this.F = (TextView) findViewById(R.id.skin_buy_tv);
        this.D = (RadioButton) findViewById(R.id.skin_alipay_rb);
        this.C = (RadioButton) findViewById(R.id.skin_wx_rb);
        E();
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public void loadData(boolean z) {
    }
}
