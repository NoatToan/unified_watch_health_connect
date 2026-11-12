package com.xiaomi.hm.health.bodyfat.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.WeightConnectActivity;
import com.xiaomi.hm.health.bodyfat.delegate.ScaleToolUtilsDelegate;
import com.xiaomi.hm.health.bodyfat.event.BFDeviceConnectionEvent;
import com.xiaomi.hm.health.bodyfat.event.EventSelectedUser;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMWeightDevice;
import com.xiaomi.hm.health.bt.profile.weight.OFMeasurement;
import com.xiaomi.hm.health.databases.model.UserInfos;
import de.greenrobot.event.EventBus;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes19.dex */
public class WeightConnectActivity extends BaseTitleActivity {
    private static final String D = "com.xiaomi.hm.health.bodyfat.activity.WeightConnectActivity";
    private static final String E = "SCALE_BALANCE";
    private AlertDialogFragment y;
    private boolean z;
    private boolean x = false;
    private boolean A = true;
    public boolean B = false;
    public long C = 0;

    public class a extends HMCallback<OFMeasurement> {
        public final /* synthetic */ OneFootFragment a;

        public a(OneFootFragment oneFootFragment) {
            this.a = oneFootFragment;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(OFMeasurement oFMeasurement) {
            super.onData(oFMeasurement);
            HMLog.d(WeightConnectActivity.D, "ofMeasurement.getTime() = " + oFMeasurement.getTime(), new Object[0]);
            WeightConnectActivity weightConnectActivity = WeightConnectActivity.this;
            BFTitleStyleKt.setTitleStyle(weightConnectActivity, null, null, BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(weightConnectActivity, R.color.scale_measuring_bg_end_color), false);
            WeightConnectActivity.this.F(this.a);
            this.a.updateView(oFMeasurement.getTime() / 1000.0f);
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            HMLog.d(WeightConnectActivity.D, "onfinish " + z, new Object[0]);
            if (z) {
                if (WeightConnectActivity.this.z) {
                    this.a.jumpToOneFootDetail();
                } else {
                    this.a.showChoseUserFrag();
                }
            }
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onStart() {
            super.onStart();
            WeightConnectActivity.this.A = false;
            HMLog.d(WeightConnectActivity.D, "showConnected start", new Object[0]);
            WeightConnectActivity.this.J();
        }
    }

    public class b extends HMCallback {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(DialogInterface dialogInterface, int i) {
        BFTitleStyleKt.setTitleStyle(this, null, null, BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.pale_grey_two), true);
        G();
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(DialogInterface dialogInterface) {
        this.y = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(Long l) {
        I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String D(Throwable th) {
        return "展示等待测量页面失败:  " + th.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(final Throwable th) {
        HMLog.warn(D, new Function0() { // from class: sr8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WeightConnectActivity.D(th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, fragment).commitAllowingStateLoss();
    }

    private void G() {
        this.C = System.currentTimeMillis();
        F(new WeightConnectingFragment());
    }

    private synchronized void H() {
        if (this.y != null) {
            return;
        }
        if (this.B) {
            return;
        }
        AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(this).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: qr8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.z(dialogInterface, i);
            }
        }).setPositiveButton(getString(R.string.retry), new DialogInterface.OnClickListener() { // from class: pr8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.A(dialogInterface, i);
            }
        }).setMessage(R.string.retry_connect_weight).setCancelable(false).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: rr8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.a.B(dialogInterface);
            }
        }).create();
        this.y = alertDialogFragmentCreate;
        alertDialogFragmentCreate.show(getSupportFragmentManager());
    }

    private void I() {
        if (getSupportFragmentManager().findFragmentById(R.id.fl_container) instanceof WeightConnectedFragment) {
            return;
        }
        F(new WeightConnectedFragment());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        long jCurrentTimeMillis = (500 - System.currentTimeMillis()) + this.C;
        if (jCurrentTimeMillis <= 0) {
            I();
        } else {
            Observable.timer(jCurrentTimeMillis, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: tr8
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.C((Long) obj);
                }
            }, new Action1() { // from class: ur8
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    WeightConnectActivity.E((Throwable) obj);
                }
            });
        }
    }

    private void K() {
        ((HMWeightDevice) BFCallback.getHMDeviceManager().getDevice(HMDeviceType.WEIGHT)).startOneFootMeasure(new a(new OneFootFragment()), this.A);
    }

    private void L() {
        ((HMWeightDevice) BFCallback.getHMDeviceManager().getDevice(HMDeviceType.WEIGHT)).stopOneFootMeasure(new b());
    }

    public static void startMe(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) WeightConnectActivity.class);
        intent.putExtra("IS_GUEST", z);
        context.startActivity(intent);
    }

    private void w() {
        BFCallback.IHMDeviceManager hMDeviceManager = BFCallback.getHMDeviceManager();
        HMDeviceType hMDeviceType = HMDeviceType.WEIGHT;
        HMBaseDevice device = hMDeviceManager.getDevice(hMDeviceType);
        if (device == null || !device.isConnected()) {
            HMLog.d(D, "weight need connecting...", new Object[0]);
            BFCallback.getHMDeviceManager().createDevice(hMDeviceType);
            this.x = false;
            return;
        }
        HMLog.d(D, "weight isConnected = " + device.isConnected(), new Object[0]);
        enterOneFootMeasure();
        this.x = true;
    }

    private void x() {
        AlertDialogFragment alertDialogFragment = this.y;
        if (alertDialogFragment == null) {
            return;
        }
        alertDialogFragment.dismiss();
    }

    private void y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(DialogInterface dialogInterface, int i) {
        finish();
    }

    public void enterOneFootMeasure() {
        K();
    }

    public void exitOneFootMeasure() {
        L();
        finish();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            BFTitleStyleKt.setUnifyTitleStyle(this, null, null);
        } else {
            BFTitleStyleKt.setTitleStyle(this, null, null, BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.pale_grey_two), true);
        }
        setContentView(R.layout.activity_weight_connect);
        y();
        this.z = getIntent().getBooleanExtra("IS_GUEST", false);
        BFCallback.getInstance().eventBusConnect(true);
        EventBus.getDefault().register(this);
        G();
        w();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BFCallback.getInstance().eventBusConnect(false);
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(BFDeviceConnectionEvent bFDeviceConnectionEvent) {
        HMLog.d(D, "连接状态：" + bFDeviceConnectionEvent.toString(), new Object[0]);
        if (bFDeviceConnectionEvent.getDeviceType() != HMDeviceType.WEIGHT) {
            return;
        }
        if (bFDeviceConnectionEvent.isConnected() && !this.x && (getSupportFragmentManager().findFragmentById(R.id.fl_container) instanceof WeightConnectingFragment)) {
            x();
            this.x = true;
            enterOneFootMeasure();
        } else if (!bFDeviceConnectionEvent.isDisconnected() && !bFDeviceConnectionEvent.isConnectingTimeout()) {
            if (bFDeviceConnectionEvent.isConnecting()) {
                this.x = false;
            }
        } else {
            H();
            this.x = false;
            if (BFCallback.getInstance().isForeground()) {
                return;
            }
            BFCallback.getHMDeviceManager().destroyDevice(bFDeviceConnectionEvent.getDeviceType());
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onRightFuncClicked() {
        ScaleToolUtilsDelegate.getInstance().getToolUtil().addToMyTools(E);
        Toast.makeText(getApplicationContext(), R.string.tool_add_success, 1).show();
        showRightFunc(false);
    }

    public void onEventMainThread(EventSelectedUser eventSelectedUser) {
        String str = D;
        HMLog.d(str, "EventSelectedUser uid   " + eventSelectedUser.uid + " " + eventSelectedUser.timestamp, new Object[0]);
        UserInfos info = UserInfoManager.getManager().getInfo(eventSelectedUser.uid);
        StringBuilder sb = new StringBuilder();
        sb.append(" UserInfos   ");
        sb.append(info.getName());
        HMLog.d(str, sb.toString(), new Object[0]);
        CustomToast.showShort(this, info.getName());
        OneFootDetailActivity.startMe(this, String.valueOf(eventSelectedUser.uid));
        finish();
    }
}
