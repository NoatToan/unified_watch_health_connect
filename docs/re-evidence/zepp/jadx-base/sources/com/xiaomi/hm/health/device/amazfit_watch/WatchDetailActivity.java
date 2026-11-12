package com.xiaomi.hm.health.device.amazfit_watch;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.bind.BindServiceApi;
import com.xiaomi.hm.health.device.bind.IUnbindListener;
import com.xiaomi.hm.health.device.bind.UnbindError;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import de.greenrobot.event.EventBus;
import java.util.Calendar;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class WatchDetailActivity extends BaseTitleActivity implements IUnbindListener {
    private static final String F = "WatchDetailActivity";
    private TextView x = null;
    private LoadingDialog y = null;
    private boolean z = false;
    private LoadingDialog A = null;
    private HMDeviceType B = null;
    private final DeviceManagerApi C = ManagerFunctionsKt.getDeviceManagerApi();
    private final Lazy<DeviceTimeStoreApi> D = KoinJavaComponent.inject(DeviceTimeStoreApi.class);
    private final Lazy<BindServiceApi> E = KoinJavaComponent.inject(BindServiceApi.class);

    public class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((BindServiceApi) WatchDetailActivity.this.E.getValue()).unbind(WatchDetailActivity.this.C.getBindInfo(HMDeviceType.WATCH), WatchDetailActivity.this);
            Analytics.event(WatchDetailActivity.this, StatEvent.UNBIND_AMAZFIT_OUT, this.a ? StatEvent.UNBIND_OUT_CONFIRM_BY_SYNC_DATA_SUCCESS : StatEvent.UNBIND_OUT_CONFIRM_BY_DISCONNECTED);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ boolean a;

        public b(boolean z) {
            this.a = z;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            if (this.a) {
                return;
            }
            Analytics.event(WatchDetailActivity.this, StatEvent.UNBIND_AMAZFIT_OUT, StatEvent.UNBIND_OUT_CANCEL_BY_SYNC_DATA_FAILED);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WatchDetailActivity.this.u();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WatchDetailActivity.this.t(false);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WatchDetailActivity.this.t(true);
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ boolean a;

        public f(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WatchDetailActivity.this.y != null) {
                WatchDetailActivity.this.y.dismiss();
                WatchDetailActivity.this.y = null;
            }
            if (this.a) {
                WatchDetailActivity.this.setResult(-1);
                WatchDetailActivity.this.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        if (NetUtil.isNetworkConnected(this)) {
            w();
        } else {
            IconToast.showError(this, getString(R.string.not_connect_network));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(boolean z) {
        if (z) {
            DeviceManagerApi deviceManagerApi = this.C;
            HMDeviceType hMDeviceType = HMDeviceType.WATCH;
            deviceManagerApi.unbindDevice(hMDeviceType);
            if (this.B == hMDeviceType && ManagerFunctionsKt.getDeviceManagerApi().isSupportSensorHub()) {
                ManagerFunctionsKt.getDeviceManagerApi().saveBaseStep();
                this.C.checkforBindSensorhub();
                DeviceXFunctionsKt.getPropertyStoreApi().setHasShowSensorhubTips(true);
            }
            EventBus.getDefault().postSticky(new HMDeviceBindEvent(false, hMDeviceType));
            LoadingDialog loadingDialog = this.y;
            if (loadingDialog != null) {
                loadingDialog.setSuccess(getString(R.string.device_unbind_success));
            }
        } else {
            LoadingDialog loadingDialog2 = this.y;
            if (loadingDialog2 != null) {
                loadingDialog2.setFailed(getString(R.string.device_unbind_failed));
            }
        }
        this.x.postDelayed(new f(z), 1500L);
        Analytics.event(this, StatEvent.UNBIND_AMAZFIT_OUT, z ? "Success" : "Fail");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.device_unbinding));
        this.y = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(false);
    }

    private void v(boolean z) {
        new AlertDialogFragment.Builder(this).setMessage(z ? getString(R.string.device_unbind_confirm, new Object[]{ConfigHelperKt.getDeviceDesc(this, this.C.getBoundDeviceSource(HMDeviceType.WATCH))}) : getString(R.string.amazfit_watch_unbind_confirm_failed)).setCancelable(true).setNegativeButton(R.string.cancel, new b(z)).setPositiveButton(z ? R.string.device_unbind : R.string.device_unbind_continue, new a(z)).create().show(getSupportFragmentManager());
    }

    private void w() {
        DeviceTimeStoreApi value = this.D.getValue();
        HMDeviceType hMDeviceType = HMDeviceType.WATCH;
        Calendar boundDeviceSyncTime = value.getBoundDeviceSyncTime(hMDeviceType);
        Calendar calendar = Calendar.getInstance();
        boundDeviceSyncTime.add(12, 1);
        if (boundDeviceSyncTime.compareTo(calendar) > 0) {
            v(true);
        } else {
            this.z = true;
            this.C.startSyncData(hMDeviceType);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_watch_detail);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.pale_grey_two), true);
        TextView textView = (TextView) findViewById(R.id.right_btn);
        this.x = textView;
        textView.setText(R.string.unbind);
        this.x.setOnClickListener(new View.OnClickListener() { // from class: je8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(view);
            }
        });
        TextView textView2 = (TextView) findViewById(R.id.left_btn);
        textView2.setText(R.string.cancel);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: ie8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.i(view);
            }
        });
        EventBus.getDefault().register(this);
        this.B = this.C.getMajorDeviceType();
        HMDeviceSource boundDeviceSource = this.C.getBoundDeviceSource(HMDeviceType.WATCH);
        ImageView imageView = (ImageView) findViewById(R.id.un_bind_device_img);
        if (boundDeviceSource == HMDeviceSource.WATCH_AMAZFIT || boundDeviceSource == HMDeviceSource.WATCH_AMAZFIT_QOG) {
            imageView.setImageResource(R.drawable.img_amazfitwatch);
        } else if (boundDeviceSource == HMDeviceSource.WATCH_EVEREST) {
            imageView.setImageResource(R.drawable.img_bind_everest);
        } else if (boundDeviceSource == HMDeviceSource.WATCH_EVEREST_2S) {
            imageView.setImageResource(R.drawable.img_bind_everest_2s);
        }
        ((TextView) $(R.id.sub_title_tv)).setText(getString(ManagerFunctionsKt.getDeviceManagerApi().isSupportSensorHub() ? R.string.unbind_mili_support_sensorhub_tips : R.string.unbind_mili_tips, new Object[]{ConfigHelperKt.getDeviceDesc(this, boundDeviceSource)}));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LoadingDialog loadingDialog = this.y;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
            this.y = null;
        }
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(HMDeviceSyncDataEvent hMDeviceSyncDataEvent) {
        HMLog.d(F, "HMDeviceSyncDataEvent:" + hMDeviceSyncDataEvent, new Object[0]);
        if (hMDeviceSyncDataEvent.getDeviceType() == HMDeviceType.WATCH && this.z) {
            if ((hMDeviceSyncDataEvent.isStart() || hMDeviceSyncDataEvent.isProgress()) && this.A == null) {
                LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.device_data_syncing));
                this.A = loadingDialogShowDialog;
                loadingDialogShowDialog.setCancelable(false);
            } else if (hMDeviceSyncDataEvent.isStop()) {
                this.z = false;
                LoadingDialog loadingDialog = this.A;
                if (loadingDialog != null) {
                    loadingDialog.dismiss();
                    this.A = null;
                }
                v(hMDeviceSyncDataEvent.getResult());
            }
        }
    }

    @Override // com.xiaomi.hm.health.device.bind.IUnbindListener
    public void onUnbindFailure(UnbindError unbindError, HMDeviceType hMDeviceType) {
        this.x.post(new d());
    }

    @Override // com.xiaomi.hm.health.device.bind.IUnbindListener
    public void onUnbindStart(HMDeviceType hMDeviceType) {
        this.x.post(new c());
    }

    @Override // com.xiaomi.hm.health.device.bind.IUnbindListener
    public void onUnbindSuccess(HMDeviceType hMDeviceType) {
        this.x.post(new e());
    }
}
