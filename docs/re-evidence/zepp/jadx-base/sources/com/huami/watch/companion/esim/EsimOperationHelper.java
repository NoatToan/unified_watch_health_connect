package com.huami.watch.companion.esim;

import android.content.Context;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.esim.EsimOperationHelper;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DoLooper;
import com.huami.watch.util.Rx;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
public class EsimOperationHelper extends AbsEsimOperation {
    public static final String ACTION_ESIM_OPERATION = "esim_operation_action";
    public static final String CARRIER_DIANXIN = "dianxin";
    public static final String CARRIER_LIANTONG = "liantong";
    public static final String CARRIER_LIANTONG_GZH = "liantong_gzh";
    public static final String CARRIER_QR = "qr";
    public static final String CARRIER_YIDONG = "yidong";
    private static EsimOperationHelper e;
    private Transporter b;
    private SimResult c;
    private OperationCallBack d;

    public EsimOperationHelper(Context context) {
        init(context);
    }

    public static EsimOperationHelper getInstance(Context context) {
        if (e == null) {
            e = new EsimOperationHelper(context);
        }
        return e;
    }

    private void o(final Context context) {
        if (this.b == null) {
            Transporter transporter = Transporter.get(context, "com.huami.watch.companion");
            this.b = transporter;
            transporter.addDataListener(new Transporter.DataListener() { // from class: or1
                @Override // com.huami.watch.transport.Transporter.DataListener
                public final void onDataReceived(TransportDataItem transportDataItem) {
                    this.a.t(context, transportDataItem);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DoLooper.Result p() throws Exception {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q(String str) {
        return "type:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String r() {
        return this.c.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String s(String str) {
        return "carrierType:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(Context context, TransportDataItem transportDataItem) {
        if (ACTION_ESIM_OPERATION.equals(transportDataItem.getAction())) {
            DataBundle data = transportDataItem.getData();
            final String string = data.getString("type");
            String string2 = data.getString(AbsEsimOperation.KEY_RESPONSE_DATA, "");
            int i = data.getInt(AbsEsimOperation.KEY_RESPONSE_CODE, 1);
            HMLog.info(AbsEsimOperation.TAG, new Function0() { // from class: wr1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EsimOperationHelper.q(string);
                }
            });
            if (AbsEsimOperation.TYPE_SEND_REQUEST.equals(string)) {
                try {
                    handlerHttpRequest(data);
                    return;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            SimResult simResult = this.c;
            if (simResult != null) {
                simResult.setType(string);
                SimResult simResult2 = this.c;
                simResult2.finish = true;
                simResult2.success = true;
                simResult2.setInfo(string2);
                this.c.setState(i);
                HMLog.info(AbsEsimOperation.TAG, new Function0() { // from class: tr1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.a.r();
                    }
                });
            }
            SimResult simResult3 = this.c;
            if (simResult3 != null && this.d != null) {
                if (simResult3.getState() == 0) {
                    this.d.onSuccess(string);
                } else {
                    String info = this.c.getInfo();
                    if (info == null) {
                        info = "";
                    }
                    this.d.onFailure(string, info);
                }
            }
            if (AbsEsimOperation.TYPE_DOWNLOAD_STATUS.equals(string)) {
                final String string3 = data.getString(AbsEsimOperation.KEY_CARRIER_TYPE, "");
                HMLog.info(AbsEsimOperation.TAG, new Function0() { // from class: vr1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EsimOperationHelper.s(string3);
                    }
                });
                if (this.c.getState() == 0) {
                    Analytics.event(context, string3 + "_successful");
                    return;
                }
                Analytics.event(context, string3 + "_failed", string2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String u(int i) {
        return "Send with retry,times:" + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String v(DataTransportResult dataTransportResult) {
        return "Send fail and delay retry:" + dataTransportResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(DataBundle dataBundle, int i) {
        sendWithRetry(dataBundle, i + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(final DataBundle dataBundle, final int i, final DataTransportResult dataTransportResult) {
        if (dataTransportResult.getResultCode() != 0) {
            HMLog.info(AbsEsimOperation.TAG, new Function0() { // from class: ur1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EsimOperationHelper.v(dataTransportResult);
                }
            });
            Rx.delayIo(new Runnable() { // from class: rr1
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.w(dataBundle, i);
                }
            }, 15L, TimeUnit.SECONDS);
        }
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void cancelDownloadProfile(boolean z) {
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void continueDownloadProfile(@NotNull String str, boolean z) {
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void deleteProfile(@NotNull String str) {
        this.c = new SimResult();
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("type", "delete");
        dataBundle.putString(AbsEsimOperation.KEY_ICCID, str);
        send(dataBundle);
    }

    public void doLoop(int i, int i2) {
        this.c = new SimResult();
        DoLooper.doLoop(new DoLooper.Function() { // from class: qr1
            @Override // com.huami.watch.util.DoLooper.Function
            public final Object apply() {
                return this.a.p();
            }
        }, i, i2);
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void getProfileList(boolean z) {
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("type", AbsEsimOperation.TYPE_PROFILE_LIST);
        dataBundle.putBoolean(AbsEsimOperation.KEY_SYNC_NOTIFICATION, z);
        send(dataBundle);
        doLoop(100, 30);
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public SimResult getResult() {
        return this.c;
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void init(@NotNull Context context) {
        super.init(context);
        o(context.getApplicationContext());
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public boolean isConnected(@NotNull Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (currentDevice != null && DeviceUtil.isSupportESim(currentDevice)) {
            return currentDevice.isConnected();
        }
        return false;
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void needInputPinCode(@NotNull String str, boolean z) {
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void requestSimInfo() {
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("type", AbsEsimOperation.TYPE_SIM_INFO);
        send(dataBundle);
        doLoop(200, 60);
    }

    public void send(DataBundle dataBundle) {
        this.b.send(ACTION_ESIM_OPERATION, dataBundle);
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void sendNotification() {
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("type", AbsEsimOperation.TYPE_SEND_NOTIFICATION);
        send(dataBundle);
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void sendWithRetry(@NotNull final DataBundle dataBundle, final int i) {
        if (i > 11) {
            return;
        }
        HMLog.info(AbsEsimOperation.TAG, new Function0() { // from class: sr1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EsimOperationHelper.u(i);
            }
        });
        this.b.send(ACTION_ESIM_OPERATION, dataBundle, new Transporter.DataSendResultCallback() { // from class: pr1
            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public final void onResultBack(DataTransportResult dataTransportResult) {
                this.a.x(dataBundle, i, dataTransportResult);
            }
        });
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void setOperationCallback(@NotNull OperationCallBack operationCallBack) {
        this.d = operationCallBack;
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void setProfileName(@NotNull String str, @NotNull String str2) {
        this.c = new SimResult();
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("type", AbsEsimOperation.TYPE_SET_NAME);
        dataBundle.putString(AbsEsimOperation.KEY_ICCID, str);
        dataBundle.putString("name", str2);
        send(dataBundle);
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void showQr() {
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("type", AbsEsimOperation.TYPE_SHOW_QR);
        dataBundle.putInt(AbsEsimOperation.KEY_CARRIER_TYPE, 0);
        send(dataBundle);
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void startDownloadProfile(@NotNull String str, @NotNull String str2, boolean z) {
        startDownloadProfile(str, str2, null, z);
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void stop() {
        SimResult simResult = this.c;
        if (simResult != null) {
            simResult.finish = true;
        }
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public Boolean supportEPin() {
        return Boolean.FALSE;
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void switchProfileState(@NotNull String str, boolean z) {
        this.c = new SimResult();
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("type", AbsEsimOperation.TYPE_SWITCH_PROFILE_STATE);
        dataBundle.putString(AbsEsimOperation.KEY_ICCID, str);
        dataBundle.putBoolean("state", z);
        send(dataBundle);
    }

    @Override // com.huami.watch.companion.esim.AbsEsimOperation
    public void startDownloadProfile(@NotNull String str, @NotNull String str2, @Nullable String str3, boolean z) {
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(AbsEsimOperation.KEY_REQUEST_URL, str);
        dataBundle.putString("type", AbsEsimOperation.TYPE_DOWNLOAD_PROFILE);
        dataBundle.putString(AbsEsimOperation.KEY_CARRIER_TYPE, str2);
        send(dataBundle);
        if (z) {
            doLoop(2000, 300);
        }
    }
}
