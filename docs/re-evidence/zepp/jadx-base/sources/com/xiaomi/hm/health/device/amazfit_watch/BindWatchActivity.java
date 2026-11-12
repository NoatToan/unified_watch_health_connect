package com.xiaomi.hm.health.device.amazfit_watch;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.amazfit_watch.BindWatchActivity;
import com.xiaomi.hm.health.device.bind.BindServiceApi;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.webapi.device.HMWebBindInfo;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes20.dex */
public class BindWatchActivity extends BaseTitleActivity {
    public static final int BIND_AMAZFIT = 0;
    public static final int BIND_AMAZFIT_QOG = 3;
    public static final int BIND_EVEREST = 1;
    public static final int BIND_EVEREST_S = 2;
    public static final String BIND_EXTRA = "bind_extra";
    public static final String DEVICE_EXTRA = "device";
    private static final int E = 3101;
    private static final int F = 3091;
    private static final String G = "db_device";
    private static final String H = "BindWatchActivity";
    private LoadingDialog A;
    private TextView x;
    private ImageView y;
    private Device z = null;
    private final Lazy<DeviceRepositoryApi> B = KoinJavaComponent.inject(DeviceRepositoryApi.class);
    private final Lazy<BindServiceApi> C = KoinJavaComponent.inject(BindServiceApi.class);
    private final Lazy<DeviceManagerApi> D = KoinJavaComponent.inject(DeviceManagerApi.class);

    public class a extends IHMHttpResponseHandler {
        public final /* synthetic */ HMHttpResponseData a;

        public a(HMHttpResponseData hMHttpResponseData) {
            this.a = hMHttpResponseData;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            HMLog.d(BindWatchActivity.H, "bindWatchDeviceToServer:" + hMHttpResponseData, new Object[0]);
            this.a.copy(hMHttpResponseData);
        }
    }

    public class b implements LoadingDialog.OnAnimEndListener {
        public final /* synthetic */ Device a;

        public b(Device device) {
            this.a = device;
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onAnimEnd(LoadingDialog loadingDialog) {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onDismiss(LoadingDialog loadingDialog) {
            BindWatchActivity.this.finish();
            ((BindServiceApi) BindWatchActivity.this.C.getValue()).doNext(BindWatchActivity.this, this.a, null, true);
        }
    }

    private void initView() {
        this.x = (TextView) findViewById(R.id.title_tv);
        this.y = (ImageView) findViewById(R.id.bind_watch_img);
        TextView textView = (TextView) findViewById(R.id.left_btn);
        textView.setText(R.string.not_bind_now);
        TextView textView2 = (TextView) findViewById(R.id.right_btn);
        textView2.setText(R.string.bind_watch);
        textView.setOnClickListener(new View.OnClickListener() { // from class: cy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.x(view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: by
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.y(view);
            }
        });
    }

    private void s(final Device device) {
        Observable.fromCallable(new Callable() { // from class: dy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.t(device);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Action0() { // from class: ey
            @Override // rx.functions.Action0
            public final void call() {
                this.a.u();
            }
        }).subscribe(new Action1() { // from class: fy
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.v((Device) obj);
            }
        }, new Action1() { // from class: gy
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                BindWatchActivity.w((Throwable) obj);
            }
        });
    }

    public static void start(Context context, Device device) {
        Intent intent = new Intent(context, (Class<?>) BindWatchActivity.class);
        intent.putExtra("db_device", device);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Device t(Device device) throws Exception {
        HMLog.d(H, "doInBackground", new Object[0]);
        HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
        HMWebBindInfo hMWebBindInfoCreateBindInfo = HMWebBindInfo.createBindInfo(device.getDevice_type().intValue(), device.getDevice_source().intValue(), device.getDevice_id(), device.getFirmware_version(), HMAppConfig.getVersionName(), device.getDevice_address(), System.currentTimeMillis());
        hMWebBindInfoCreateBindInfo.setEnableMultiDevice(true);
        int activeStatus = this.D.getValue().getActiveStatus(HMDeviceType.fromValue(device.getDevice_type().intValue()));
        hMWebBindInfoCreateBindInfo.setActiveStatus(activeStatus);
        HMLog.d(H, "bindDevice:" + device.getDevice_source(), new Object[0]);
        HMWatchDeviceWebAPI.bindWatch(hMWebBindInfoCreateBindInfo, new a(hMHttpResponseData), true);
        if (!hMHttpResponseData.isSuccess()) {
            return null;
        }
        device.setActiveStatus(Integer.valueOf(activeStatus));
        device.setStatus(1);
        device.setDevice_bind_time(Long.valueOf(hMWebBindInfoCreateBindInfo.getBindTime()));
        this.B.getValue().insertOrReplace(device);
        return device;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.device_binding));
        this.A = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(Device device) {
        if (device == null) {
            this.A.setFailed(getString(R.string.amazfit_watch_bind_failed));
        } else {
            this.A.setSuccess(getString(R.string.device_bind_success), 1500, new b(device));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        if (!NetUtil.isNetworkConnected(this)) {
            IconToast.showError(this, getString(R.string.not_connect_network));
            return;
        }
        try {
            if (getPackageManager().getPackageInfo(getPackageName(), 16384).versionCode < (GlobalConfig.get().isBuildPlay() ? F : E)) {
                IconToast.showError(this, R.string.low_version_code);
                return;
            }
        } catch (Exception unused) {
        }
        Device device = this.z;
        if (device != null) {
            s(device);
        }
    }

    private void z(HMDeviceSource hMDeviceSource) {
        ((TextView) findViewById(R.id.sub_title_tv)).setText(getString(R.string.bind_amazfit_device_tips, new Object[]{getString(R.string.amazfit_watch_app)}));
        this.x.setText(getString(R.string.bind_amazfit_device, new Object[]{ConfigHelperKt.getDeviceDesc(this, hMDeviceSource)}));
        this.D.getValue().updateDeviceImg(this.y, hMDeviceSource);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_bind_watch);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.pale_grey_two), true);
        initView();
        Intent intent = getIntent();
        if (intent.hasExtra("db_device")) {
            this.z = (Device) intent.getSerializableExtra("db_device");
        }
        Device device = this.z;
        if (device != null) {
            z(HMDeviceSource.fromValue(device.getDevice_source().intValue()));
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LoadingDialog loadingDialog = this.A;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.A.dismiss();
    }

    public static void start(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) BindWatchActivity.class);
        intent.putExtra(BIND_EXTRA, i);
        context.startActivity(intent);
    }
}
