package com.xiaomi.hm.health.lab.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.multidex.MultiDexExtractor;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.rainbow.ListTile;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.lab.R;
import com.xiaomi.hm.health.lab.activity.BehaviorTaggingSwimmingActivity;
import com.xiaomi.hm.health.lab.init.LabCallbackInit;
import com.xiaomi.hm.health.lab.init.LabEventAccountStatus;
import com.xiaomi.hm.health.lab.init.LabEventBluetooth;
import com.xiaomi.hm.health.lab.init.LabEventListener;
import com.xiaomi.hm.health.lab.init.LabEventManager;
import com.xiaomi.hm.health.lab.init.LabHMDeviceConnectionEvent;
import com.xiaomi.hm.health.lab.utils.TaggingFileUtils;
import com.xiaomi.hm.health.lab.webapi.HMUploadDeviceLogAPI;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;
import org.apache.http.Header;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class BehaviorTaggingSwimmingActivity extends BaseTitleActivity {
    private static final int P = -1;
    private static final int Q = 0;
    private static final int R = 1;
    private boolean A;
    private Button B;
    private File C;
    private File D;
    private ProgressBar E;
    private TextView F;
    private f G;
    private g H;
    private LoadingDialog I;
    private TextView J;
    private int K = 100;
    private int L = 10;
    private ExecutorService M = Executors.newSingleThreadExecutor();
    private boolean N = false;
    private Runnable O = new a();
    private HMMiLiProDevice x;
    private boolean y;
    private ListTile z;

    public class RequestSimpleHttpResponseHandler extends IHMSimpleHttpResponseHandler {
        public RequestSimpleHttpResponseHandler() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c() {
            return "RequestSimpleHttpResponseHandler";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d(String str) {
            return "url: " + str;
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            super.onCancel(i);
            BehaviorTaggingSwimmingActivity.this.G.sendEmptyMessage(20);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            BehaviorTaggingSwimmingActivity.this.G.sendEmptyMessage(20);
        }

        public void onProgress(int i, int i2) {
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            if (webResponse == null || !webResponse.success()) {
                BehaviorTaggingSwimmingActivity.this.G.sendEmptyMessage(20);
                return;
            }
            HMLog.info("HMUploadDeviceLogAPI", new Function0() { // from class: jt
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BehaviorTaggingSwimmingActivity.RequestSimpleHttpResponseHandler.c();
                }
            });
            if (webResponse.data != null) {
                try {
                    final String strOptString = new JSONObject(webResponse.data).optString("putURI");
                    HMLog.info("HMUploadDeviceLogAPI", new Function0() { // from class: it
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BehaviorTaggingSwimmingActivity.RequestSimpleHttpResponseHandler.d(strOptString);
                        }
                    });
                    BehaviorTaggingSwimmingActivity behaviorTaggingSwimmingActivity = BehaviorTaggingSwimmingActivity.this;
                    behaviorTaggingSwimmingActivity.W(strOptString, behaviorTaggingSwimmingActivity.C);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TaggingFileUtils.archiveDir(FileUtils.getLogRootDir(BehaviorTaggingSwimmingActivity.this), BehaviorTaggingSwimmingActivity.this.C);
            HMUploadDeviceLogAPI.uploadLogFileBlockNew(BehaviorTaggingSwimmingActivity.this.getApplicationContext(), "", "android swim behavior tagging", "", BehaviorTaggingSwimmingActivity.this.C, BehaviorTaggingSwimmingActivity.this.new RequestSimpleHttpResponseHandler());
        }
    }

    public class b extends HMCallback<Integer> {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(Integer num) {
            BehaviorTaggingSwimmingActivity.this.hideLoadingDialog();
            if (num.intValue() != 1) {
                BehaviorTaggingSwimmingActivity.this.z.setChecked(false);
            } else {
                BehaviorTaggingSwimmingActivity.this.z.setChecked(true);
            }
        }
    }

    public class c implements LabEventListener {
        public c() {
        }

        @Override // com.xiaomi.hm.health.lab.init.LabEventListener
        public void onEvent(LabEventAccountStatus labEventAccountStatus) {
        }

        @Override // com.xiaomi.hm.health.lab.init.LabEventListener
        public void onEvent(LabEventBluetooth labEventBluetooth) {
        }

        @Override // com.xiaomi.hm.health.lab.init.LabEventListener
        public void onEvent(LabHMDeviceConnectionEvent labHMDeviceConnectionEvent) {
            BehaviorTaggingSwimmingActivity.this.N(labHMDeviceConnectionEvent);
        }
    }

    public class d extends HMCallback {
        public final /* synthetic */ boolean a;

        public d(boolean z) {
            this.a = z;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            BehaviorTaggingSwimmingActivity.this.hideLoadingDialog();
            if (z) {
                IconToast.showSuccess(BehaviorTaggingSwimmingActivity.this.getApplicationContext(), this.a ? R.string.open_device_switch_success : R.string.close_device_switch_success);
            } else {
                BehaviorTaggingSwimmingActivity.this.z.setChecked(!this.a);
                IconToast.showError(BehaviorTaggingSwimmingActivity.this.getApplicationContext(), this.a ? R.string.open_device_switch_fail : R.string.close_device_switch_fail);
            }
        }
    }

    public class e extends AsyncHttpResponseHandler {
        public e() {
        }

        @Override // com.loopj.android.http.AsyncHttpResponseHandler
        public void onFailure(int i, Header[] headerArr, byte[] bArr, Throwable th) {
            BehaviorTaggingSwimmingActivity.this.G.sendEmptyMessage(20);
        }

        @Override // com.loopj.android.http.AsyncHttpResponseHandler
        public void onSuccess(int i, Header[] headerArr, byte[] bArr) {
            BehaviorTaggingSwimmingActivity.this.G.sendEmptyMessage(i == 200 ? 11 : 20);
        }
    }

    public static class f extends Handler {
        private static final int b = 0;
        private static final int c = 1;
        private static final int d = 2;
        private static final int e = 10;
        private static final int f = 11;
        private static final int g = 20;
        private WeakReference<BehaviorTaggingSwimmingActivity> a;

        private f(BehaviorTaggingSwimmingActivity behaviorTaggingSwimmingActivity) {
            this.a = new WeakReference<>(behaviorTaggingSwimmingActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            BehaviorTaggingSwimmingActivity behaviorTaggingSwimmingActivity = this.a.get();
            if (behaviorTaggingSwimmingActivity != null) {
                int i = message.what;
                if (i == 0) {
                    behaviorTaggingSwimmingActivity.R();
                    return;
                }
                if (i == 1) {
                    behaviorTaggingSwimmingActivity.F(((Integer) message.obj).intValue());
                    return;
                }
                if (i == 2) {
                    behaviorTaggingSwimmingActivity.C();
                    return;
                }
                if (i == 10) {
                    behaviorTaggingSwimmingActivity.S();
                } else if (i == 11) {
                    behaviorTaggingSwimmingActivity.D();
                } else {
                    if (i != 20) {
                        return;
                    }
                    behaviorTaggingSwimmingActivity.E();
                }
            }
        }
    }

    public class g implements IHMDataCallback {
        private g() {
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onProgress(Progress progress) {
            Message messageObtainMessage = BehaviorTaggingSwimmingActivity.this.G.obtainMessage();
            messageObtainMessage.what = 1;
            messageObtainMessage.obj = Integer.valueOf(progress.getPercent());
            BehaviorTaggingSwimmingActivity.this.G.sendMessage(messageObtainMessage);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onStart() {
            BehaviorTaggingSwimmingActivity.this.G.sendEmptyMessage(0);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onStop(Object obj, HMDeviceError hMDeviceError) {
            BehaviorTaggingSwimmingActivity.this.G.sendEmptyMessage(2);
        }
    }

    private void B() {
        LabEventManager.getInstance().clearLabEventListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        this.G.sendEmptyMessage(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        hideLoadingDialog();
        this.E.setVisibility(8);
        this.F.setVisibility(8);
        this.B.setVisibility(0);
        O();
        IconToast.showSuccess(getApplicationContext(), R.string.lab_upload_success);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        hideLoadingDialog();
        this.E.setVisibility(8);
        this.F.setVisibility(8);
        this.B.setVisibility(0);
        O();
        IconToast.showSuccess(getApplicationContext(), R.string.lab_upload_fail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(int i) {
        int i2 = this.L;
        if (i <= i2) {
            i = i2;
        }
        this.E.setProgress(i);
    }

    private void G() {
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            T();
        } else {
            IconToast.showError(getApplicationContext(), R.string.no_network_connection);
        }
    }

    private void H() {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) LabCallbackInit.getInitCallBack().getDevice(HMDeviceType.MILI);
        this.x = hMMiLiProDevice;
        if (hMMiLiProDevice == null) {
            this.y = false;
            this.z.setChecked(false);
        } else if (hMMiLiProDevice.isConnected()) {
            this.y = true;
            U();
        }
    }

    private void I() {
        LabEventManager.getInstance().setOnLabEventBluetoothListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        if (this.y) {
            G();
        } else {
            P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(String str) {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, str);
        this.I = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(false);
        this.I.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(CompoundButton compoundButton, boolean z) {
        if (this.y) {
            V(z);
        } else {
            P();
            compoundButton.setChecked(!z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(String str, File file) {
        HMUploadDeviceLogAPI.uploadZipFile(getApplicationContext(), str, file, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(LabHMDeviceConnectionEvent labHMDeviceConnectionEvent) {
        if (labHMDeviceConnectionEvent.getDeviceType() == HMDeviceType.MILI) {
            if (labHMDeviceConnectionEvent.isConnected()) {
                this.y = true;
                U();
            } else {
                this.y = false;
                O();
            }
        }
    }

    private void O() {
        File file = this.D;
        if (file != null && file.exists()) {
            this.D.delete();
        }
        File file2 = this.C;
        if (file2 == null || !file2.exists()) {
            return;
        }
        this.C.delete();
    }

    private void P() {
        IconToast.showError(getApplicationContext(), R.string.device_connect_failed);
    }

    private void Q(final String str) {
        runOnUiThread(new Runnable() { // from class: ft
            @Override // java.lang.Runnable
            public final void run() {
                this.a.K(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        this.B.setVisibility(8);
        this.E.setVisibility(0);
        this.F.setVisibility(0);
        this.E.setProgress(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        Q(getString(R.string.lab_uploading));
        this.M.execute(this.O);
    }

    private void T() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFilesDir().getAbsoluteFile());
        String str = File.separator;
        sb.append(str);
        sb.append("log_");
        sb.append(new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date()));
        sb.append(MultiDexExtractor.EXTRACTED_SUFFIX);
        this.C = new File(sb.toString());
        File file = new File(FileUtils.getLogRootDir(this) + str + TaggingFileUtils.createDeviceSwimmingLogFilePath(LabCallbackInit.getInitCallBack().getBoundDeviceName(HMDeviceType.MILI)));
        this.D = file;
        this.x.getDeviceLog(file, this.H);
    }

    private void U() {
        Q(getString(R.string.fetch_device_switch_loading));
        this.x.getSwimLogSwitch(new b());
        if (this.A) {
            return;
        }
        this.z.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: et
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.L(compoundButton, z);
            }
        });
        this.A = true;
    }

    private void V(boolean z) {
        Q(getString(z ? R.string.open_device_switch_loading : R.string.close_device_switch_loading));
        this.x.enableSwimLog(z, new d(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(final String str, final File file) {
        new Handler(getMainLooper()).post(new Runnable() { // from class: gt
            @Override // java.lang.Runnable
            public final void run() {
                this.a.M(str, file);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideLoadingDialog() {
        LoadingDialog loadingDialog = this.I;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.I.dismiss();
    }

    private void initView() {
        Button button = (Button) findViewById(R.id.btn_upload);
        this.B = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: dt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.J(view);
            }
        });
        ListTile listTile = (ListTile) findViewById(R.id.device_log_collection);
        this.z = listTile;
        listTile.setChecked(false);
        if (this.N) {
            this.z.setVisibility(8);
        }
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.task_pb);
        this.E = progressBar;
        progressBar.setMax(this.K);
        this.F = (TextView) findViewById(R.id.task_uploading);
        this.J = (TextView) findViewById(R.id.lab_swimming_announce);
        if (LabCallbackInit.getInitCallBack().hasBoundWatch()) {
            this.J.setText(R.string.device_log_watch_collection_announce);
        } else {
            this.J.setText(R.string.device_log_band_collection_announce);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        LabCallbackInit.getInitCallBack().registerEventListener(true);
        I();
        setContentView(R.layout.behavior_mark_activity_swimming);
        UIHelper.setUnifyTitleStyle(this, getString(R.string.action_swim), null);
        this.G = new f();
        this.H = new g();
        this.N = getIntent().getBooleanExtra(BehaviorsActivity.KEY_IS_GT3, false);
        initView();
        H();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LabCallbackInit.getInitCallBack().registerEventListener(false);
        this.G.removeCallbacksAndMessages(null);
        this.G = null;
        B();
    }
}
