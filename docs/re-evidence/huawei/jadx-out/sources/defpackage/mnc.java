package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.RequestResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.mgr.ephemerismanager.callback.BtBaseResponseCallback;
import com.huawei.hwdevice.phoneprocess.receiver.NetworkConnectReceiver;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.IoUtils;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes2.dex */
public class mnc implements ParserInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static mnc f41970c;
    private HandlerThread g;
    private Handler j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f41969a = new byte[0];
    private static final Object d = new Object();
    private Map<String, mne> e = new HashMap(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f41971b = new BroadcastReceiver() { // from class: mnc.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("HwEphemerisManager", "mConnectStateChangedReceiver context is null: ", Boolean.valueOf(context == null), " action is ", intent == null ? Constants.NULL : intent.getAction());
            if (context == null || intent == null || TextUtils.isEmpty(intent.getAction()) || !"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                return;
            }
            DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
            if (deviceInfo == null) {
                LogUtil.j("HwEphemerisManager", "mConnectStateChangedReceiver deviceInfo is null");
                return;
            }
            int deviceConnectState = deviceInfo.getDeviceConnectState();
            LogUtil.a("HwEphemerisManager", "mConnectStateChangedReceiver status is ", Integer.valueOf(deviceConnectState));
            if (deviceConnectState == 2) {
                mnc.this.b(deviceInfo.getDeviceIdentify());
            } else {
                if (deviceConnectState != 3) {
                    return;
                }
                mnc.this.a(deviceInfo);
            }
        }
    };
    private BtBaseResponseCallback f = new BtBaseResponseCallback() { // from class: mnc.1
        @Override // com.huawei.hwdevice.phoneprocess.mgr.ephemerismanager.callback.BtBaseResponseCallback
        public void onSuccess(Object obj, String str) {
            mne mneVar = (mne) mnc.this.e.get(str);
            if (mneVar == null) {
                LogUtil.j("HwEphemerisManager", "FileCallback onSuccess EphemerisDownloadInfo is null");
                return;
            }
            LogUtil.a("HwEphemerisManager", "mFileCallback download success");
            mneVar.d(3);
            mneVar.e(false);
            mnc.this.a(mneVar);
        }

        @Override // com.huawei.hwdevice.phoneprocess.mgr.ephemerismanager.callback.BtBaseResponseCallback
        public void onFailure(int i, String str, String str2) throws Throwable {
            mne mneVar = (mne) mnc.this.e.get(str2);
            if (mneVar == null) {
                LogUtil.j("HwEphemerisManager", "FileCallback onFailure EphemerisDownloadInfo is null");
                return;
            }
            if (mneVar.h() >= 3) {
                LogUtil.a("HwEphemerisManager", "download retry finish");
                mnc.this.d(mneVar);
                return;
            }
            if (mneVar.j() > mneVar.c().size() - 1) {
                mnc.this.d(mneVar);
                return;
            }
            mneVar.a(mneVar.j() + 1);
            if (mneVar.j() == mneVar.c().size()) {
                mneVar.a(0);
                mneVar.d(mneVar.h() + 1);
                if (mneVar.h() >= 3) {
                    LogUtil.a("HwEphemerisManager", "download retry finish done");
                    mnc.this.d(mneVar);
                    return;
                }
            }
            try {
                mnc.this.d(mneVar.c().get(mneVar.j()), mnc.this.f, str2);
            } catch (IndexOutOfBoundsException e) {
                LogUtil.e("HwEphemerisManager", "onFailure find IndexOutOfBoundsException,", ExceptionUtils.c(e));
                xjt.t("onFailure find IndexOutOfBoundsException");
            }
        }
    };
    private eet h = new eet();

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (mgb.e(mgb.d(str))) {
            LogUtil.a("HwEphemerisManager", "Device :" + str + " Connection successful, PluginWearAbility downloading");
            try {
                AppBundle.d().preDownloadPlugins(BaseApplication.getContext(), Collections.singletonList("PluginWearAbility"), true, true);
            } catch (IllegalArgumentException unused) {
                ReleaseLogUtil.a("Track_HwEphemerisManager", "isDownloadPluginWearAbility IllegalArgumentException");
                xjt.t("isDownloadPluginWearAbility DownloadPlugins IllegalArgumentException");
            }
        }
    }

    private mnc() {
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.f41971b, intentFilter, LocalBroadcast.f36595c, null);
        HandlerThread handlerThread = new HandlerThread("HwEphemerisManager");
        this.g = handlerThread;
        handlerThread.start();
        a aVar = new a(this.g.getLooper());
        this.j = aVar;
        NetworkConnectReceiver.d(aVar);
    }

    private void c(mne mneVar) {
        mneVar.c(false);
        mneVar.e(false);
        mneVar.b(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(mne mneVar) {
        mneVar.c(true);
        mneVar.e(true);
    }

    public static mnc e() {
        mnc mncVar;
        synchronized (d) {
            if (f41970c == null) {
                f41970c = new mnc();
            }
            mncVar = f41970c;
        }
        return mncVar;
    }

    public void c() {
        BaseApplication.getContext().unregisterReceiver(this.f41971b);
        d();
        a();
    }

    private static void d() {
        synchronized (d) {
            f41970c = null;
        }
    }

    private void a() {
        HandlerThread handlerThread = this.g;
        if (handlerThread != null) {
            handlerThread.quit();
            this.g = null;
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            if (message == null) {
                LogUtil.j("HwEphemerisManager", "MyHandler but message is null");
                return;
            }
            super.handleMessage(message);
            if (!(message.obj instanceof String)) {
                str = "";
            } else {
                str = (String) message.obj;
            }
            mne mneVar = (mne) mnc.this.e.get(str);
            if (mneVar == null) {
                LogUtil.j("HwEphemerisManager", "handleMessage ephemerisInfo is null");
                return;
            }
            int i = message.what;
            LogUtil.a("HwEphemerisManager", "handleMessage message:", Integer.valueOf(i), " waitTime is ", Long.valueOf(mneVar.n()));
            if (i == 1) {
                mnc.this.b(mneVar);
                return;
            }
            if (i == 2) {
                mnc.this.i(mneVar);
                mnc.this.e(mneVar);
                mneVar.c(false);
            } else if (i == 4) {
                e(mneVar);
            } else if (i == 100) {
                c(mneVar);
            } else {
                if (i != 400) {
                    return;
                }
                mnc.this.a(mneVar.d());
            }
        }

        private void c(mne mneVar) {
            boolean zL = mneVar.l();
            boolean zO = mneVar.o();
            int iB = mneVar.b();
            LogUtil.a("HwEphemerisManager", "network connected, isDownloading:", Boolean.valueOf(zL), ";mIsNeedDownload:", Boolean.valueOf(zO), ";currentNetworkConnectedRetryTimes:", Integer.valueOf(iB));
            if (zL) {
                mneVar.e(2);
                return;
            }
            if (zO && iB < 3) {
                sendMessageDelayed(mnc.this.e(1, mneVar.d().getDeviceIdentify()), mneVar.n());
                mneVar.c(true);
                mnc.this.e(mneVar);
                mneVar.c(false);
                mneVar.b(mneVar.b() + 1);
            }
        }

        private void e(mne mneVar) {
            mneVar.e(3);
            if (mnc.this.j != null) {
                mnc.this.j.removeMessages(1, mneVar.d().getDeviceIdentify());
            }
            mneVar.c(false);
            mnc.this.b(mneVar);
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            LogUtil.j("HwEphemerisManager", "getResult data is null.");
            return;
        }
        byte b2 = bArr[1];
        cpl.d("HwEphemerisManager", bArr, "getResult dataInfos[1]: ", Integer.valueOf(b2), "; dataInfos is ");
        if (b2 == 1) {
            e(bArr, deviceInfo);
        } else {
            if (b2 != 2) {
                return;
            }
            b(bArr, deviceInfo);
        }
    }

    private void e(byte[] bArr, DeviceInfo deviceInfo) {
        mja.b();
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("HwEphemerisManager", "parseOperatorRequest messageHex is null");
            return;
        }
        if (strE.length() < 4) {
            LogUtil.j("HwEphemerisManager", "parseOperatorRequest messageHex.length() < SERVICE_AND_COMMAND_LENGTH");
            return;
        }
        mne mneVar = this.e.containsKey(deviceInfo.getDeviceIdentify()) ? this.e.get(deviceInfo.getDeviceIdentify()) : null;
        if (mneVar == null) {
            mneVar = new mne();
        }
        mneVar.e(deviceInfo);
        b(deviceInfo, mneVar, strE.substring(4, strE.length()));
    }

    private void f(mne mneVar) {
        this.j.removeMessages(400, mneVar.d().getDeviceIdentify());
        this.j.sendMessageDelayed(e(400, mneVar.d().getDeviceIdentify()), 120000L);
    }

    private void b(DeviceInfo deviceInfo, mne mneVar, String str) {
        try {
            Iterator<ees> it = this.h.b(str).b().iterator();
            while (it.hasNext()) {
                String strB = "";
                int iV = 0;
                for (eew eewVar : it.next().e()) {
                    int iV2 = CommonUtil.v(eewVar.e());
                    if (iV2 == 2) {
                        iV = CommonUtil.v(eewVar.b());
                        ReleaseLogUtil.d("Track_HwEphemerisManager", "operation info is ", Integer.valueOf(iV));
                    } else if (iV2 == 3) {
                        mneVar.a(CommonUtil.x(eewVar.b()) * 1000);
                        strB = eewVar.b();
                        LogUtil.a("HwEphemerisManager", "operation request time is ", Long.valueOf(mneVar.i()));
                    }
                }
                if (iV == 1) {
                    a(deviceInfo);
                    f(mneVar);
                }
                if (iV == 1 && !this.e.containsKey(deviceInfo.getDeviceIdentify())) {
                    if (!f()) {
                        d(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, deviceInfo);
                        ReleaseLogUtil.e("Track_HwEphemerisManager", "can't download, no network");
                        return;
                    } else {
                        this.e.put(deviceInfo.getDeviceIdentify(), mneVar);
                        d(100000, deviceInfo);
                        c(mneVar);
                        d(deviceInfo);
                    }
                } else if (iV != 2 && !this.e.containsKey(deviceInfo.getDeviceIdentify())) {
                    LogUtil.j("HwEphemerisManager", "parseEphemerisTlvs info:", Integer.valueOf(iV));
                } else {
                    ReleaseLogUtil.e("Track_HwEphemerisManager", "parseEphemerisTlvs The task already exists.");
                    d(strB, mneVar);
                }
            }
        } catch (eeu unused) {
            LogUtil.e("HwEphemerisManager", "COMMAND_ID_OPERATOR_REQUEST find TlvException");
            xjt.t("COMMAND_ID_OPERATOR_REQUEST find TlvException");
        }
    }

    private boolean f() {
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            return false;
        }
        if (!PowerKitManager.a().b()) {
            return true;
        }
        ReleaseLogUtil.e("Track_HwEphemerisManager", "can't download! user is sleeping");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return;
        }
        LogUtil.a("HwEphemerisManager", "clearMapItem enter.");
        this.e.remove(deviceInfo.getDeviceIdentify());
        moa.b(deviceInfo, false);
        mnk.b().remove(deviceInfo.getDeviceIdentify());
    }

    private void b(byte[] bArr, DeviceInfo deviceInfo) {
        mne mneVar = this.e.get(deviceInfo.getDeviceIdentify());
        if (mneVar == null) {
            LogUtil.j("HwEphemerisManager", "parseEphemerisParam ephemerisInfo is null");
            return;
        }
        mneVar.e(1);
        a(mneVar);
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE)) {
            a(deviceInfo);
            LogUtil.j("HwEphemerisManager", "parseEphemerisParam messageHex is null");
            return;
        }
        if (strE.length() < 4) {
            a(deviceInfo);
            LogUtil.j("HwEphemerisManager", "parseEphemerisParam messageHex.length() < SERVICE_AND_COMMAND_LENGTH");
            return;
        }
        String strSubstring = strE.substring(4, strE.length());
        mmy mmyVar = new mmy();
        try {
            Iterator<ees> it = this.h.b(strSubstring).b().iterator();
            while (it.hasNext()) {
                a(it.next(), mmyVar, deviceInfo);
            }
            ReleaseLogUtil.d("Track_HwEphemerisManager", "start DownLoad.");
            a(mmyVar, mneVar, deviceInfo);
        } catch (eeu unused) {
            LogUtil.e("HwEphemerisManager", "COMMAND_ID_PARAMETER_CONSULT find TlvException");
            if (CommonUtil.ap()) {
                xjt.t("COMMAND_ID_PARAMETER_CONSULT find TlvException");
            }
        }
    }

    private void a(ees eesVar, mmy mmyVar, DeviceInfo deviceInfo) {
        String strD;
        mne mneVar = this.e.get(deviceInfo.getDeviceIdentify());
        if (mneVar == null) {
            LogUtil.j("HwEphemerisManager", "parseEphemerisTlv ephemerisInfo is null.");
            return;
        }
        for (eew eewVar : eesVar.e()) {
            try {
                int iV = CommonUtil.v(eewVar.e());
                if (iV == 4) {
                    long jX = CommonUtil.x(eewVar.b()) * 1000;
                    LogUtil.a("HwEphemerisManager", "Consultation deviceTime is", Long.valueOf(jX));
                    if (mneVar.n() < 30000 || mneVar.n() > 250000) {
                        d(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, deviceInfo);
                    } else {
                        mneVar.b(jX);
                    }
                } else if (iV == 5) {
                    mmyVar.a(CommonUtil.v(eewVar.b()));
                    LogUtil.a("HwEphemerisManager", "DownloadVersion:", Integer.valueOf(mmyVar.d()));
                } else if (iV != 6) {
                    LogUtil.j("HwEphemerisManager", "parseEphemerisTlv unknown command.");
                } else {
                    if (eewVar.b() != null) {
                        strD = eeq.d(eewVar.b());
                        mmyVar.a(d(strD));
                    } else {
                        strD = null;
                    }
                    LogUtil.a("HwEphemerisManager", "value(): ", eewVar.b(), "SonyUrlConfigId :", strD);
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("HwEphemerisManager", "parseEphemerisTlv find NumberFormatException");
                xjt.t("parseEphemerisTlv find NumberFormatException");
            }
        }
        b(eesVar, mneVar);
    }

    private void b(ees eesVar, mne mneVar) {
        Iterator<ees> it = eesVar.b().iterator();
        while (it.hasNext()) {
            for (eew eewVar : it.next().e()) {
                try {
                    if (CommonUtil.v(eewVar.e()) != 3) {
                        LogUtil.j("HwEphemerisManager", "parserTlvFather tlv father default case");
                    } else {
                        String strD = eeq.d(eewVar.b());
                        LogUtil.a("HwEphemerisManager", "Consultation is", strD);
                        mneVar.c().add(strD);
                    }
                } catch (NumberFormatException unused) {
                    LogUtil.e("HwEphemerisManager", "parserTlvFather NumberFormatException");
                    xjt.t("parserTlvFather NumberFormatException");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message e(int i, String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = str;
        return messageObtain;
    }

    private void a(mmy mmyVar, mne mneVar, DeviceInfo deviceInfo) {
        mneVar.c(mmyVar.d());
        LogUtil.a("HwEphemerisManager", "mDownloadVersion:", Integer.valueOf(mneVar.g()), " DownloadVersion:", Integer.valueOf(mmyVar.d()), " mIsDownloading:", Boolean.valueOf(mneVar.l()), " mUrls is Empty: ", Boolean.valueOf(mneVar.c().isEmpty()));
        int iD = mmyVar.d();
        if (iD == 0) {
            if (mneVar.c().isEmpty()) {
                a(deviceInfo);
                return;
            }
            Handler handler = this.j;
            if (handler == null) {
                LogUtil.j("HwEphemerisManager", "dealParam mHandler is null");
                return;
            }
            handler.sendMessageDelayed(e(1, mneVar.d().getDeviceIdentify()), mneVar.n());
            LogUtil.a("HwEphemerisManager", "downloadFile() send timeout timer sWaitTime is ", Long.valueOf(mneVar.n()));
            if (mneVar.l()) {
                mneVar.e(2);
                return;
            } else {
                this.j.removeMessages(2, mneVar.d().getDeviceIdentify());
                this.j.sendMessage(e(2, mneVar.d().getDeviceIdentify()));
                return;
            }
        }
        if (iD == 1 || iD == 2) {
            if (mneVar.l()) {
                mneVar.e(2);
                return;
            } else {
                mneVar.c(true);
                d(mmyVar, mneVar);
                return;
            }
        }
        if (iD == 3) {
            if (mneVar.l()) {
                mneVar.e(2);
                return;
            } else {
                mneVar.c(true);
                b(mmyVar, mneVar);
                return;
            }
        }
        mneVar.e(5);
        b(mneVar);
    }

    private void b(mmy mmyVar, final mne mneVar) {
        final List<String> listC = mmyVar.c();
        if (listC == null || listC.isEmpty()) {
            LogUtil.j("HwEphemerisManager", "dealEphDownloadExt but config id list is empty");
        } else {
            mit.b("HwEphemerisManager", new Runnable() { // from class: mnc.5
                @Override // java.lang.Runnable
                public void run() {
                    ilf.b().setContext(BaseApplication.getContext());
                    ilf.b().setSerCountry(GRSManager.c(BaseApplication.getContext()).getCommonCountryCode());
                    ile ephRequest = ilf.b().getEphRequest(listC);
                    if (ephRequest == null || !ephRequest.g()) {
                        LogUtil.j("HwEphemerisManager", "dealEphDownloadExt requestInfo is null or data is invalid.");
                        mnc.this.e(1, mneVar);
                        return;
                    }
                    synchronized (mnz.c()) {
                        mneVar.a().clear();
                    }
                    mneVar.e(2);
                    mnb.d(ephRequest, new IBaseResponseCallback() { // from class: mnc.5.4
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i, Object obj) {
                            mnb.a();
                            mnc.this.e(i, mneVar);
                        }
                    }, mneVar);
                }
            });
        }
    }

    private void d(mmy mmyVar, final mne mneVar) {
        final List<String> listC = mmyVar.c();
        if (listC == null || listC.isEmpty()) {
            LogUtil.j("HwEphemerisManager", "dealEphDownload but config id list is empty");
        } else {
            mit.b("HwEphemerisManager", new Runnable() { // from class: mnc.2
                @Override // java.lang.Runnable
                public void run() {
                    String noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("getNewBatchPluginUrl", GRSManager.c(BaseApplication.getContext()).getCommonCountryCode());
                    LogUtil.a("HwEphemerisManager", "grsUrl:", noCheckUrl);
                    ArrayList arrayList = new ArrayList(16);
                    for (String str : listC) {
                        LogUtil.a("HwEphemerisManager", "dealEphDownload url:", str);
                        arrayList.add(noCheckUrl + str);
                    }
                    synchronized (mnz.c()) {
                        mneVar.a().clear();
                    }
                    mneVar.e(2);
                    mnb.d(arrayList, new IBaseResponseCallback() { // from class: mnc.2.3
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i, Object obj) {
                            mnc.this.e(i, mneVar);
                        }
                    }, mneVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, mne mneVar) {
        LogUtil.a("HwEphemerisManager", "dealSonyDownload tag:", Integer.valueOf(i), " mHandler is ", Boolean.valueOf(this.j == null));
        if (i == 0) {
            if (mneVar.g() == 2) {
                Handler handler = this.j;
                if (handler != null) {
                    handler.sendMessage(e(4, mneVar.d().getDeviceIdentify()));
                    return;
                }
                return;
            }
            mneVar.e(3);
        } else {
            mneVar.e(4);
        }
        Handler handler2 = this.j;
        if (handler2 != null) {
            handler2.removeMessages(1, mneVar.d().getDeviceIdentify());
        }
        mneVar.c(false);
        b(mneVar);
        ReleaseLogUtil.d("Track_HwEphemerisManager", "DownLoad completed");
    }

    private void d(DeviceInfo deviceInfo) {
        String str = eeq.d(129) + eeq.d(0);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(31);
        deviceCommand.setCommandID(2);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("HwEphemerisManager", "5.31.2 parameterConsult send");
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private List<String> d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwEphemerisManager", "sonyUrlConfigId is null.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(16);
        String[] strArrSplit = str.split(";");
        if (strArrSplit.length > 0) {
            arrayList.addAll(Arrays.asList(strArrSplit));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(mne mneVar) {
        synchronized (f41969a) {
            mneVar.e(2);
            mneVar.d(0);
            int size = mneVar.c().size();
            LogUtil.a("HwEphemerisManager", "downloadFile mUrls size is:", Integer.valueOf(size), ";mIndex is:", Integer.valueOf(mneVar.j()));
            if (mneVar.j() < size) {
                try {
                    d(mneVar.c().get(mneVar.j()), this.f, mneVar.d().getDeviceIdentify());
                } catch (IndexOutOfBoundsException unused) {
                    LogUtil.e("HwEphemerisManager", "downloadFile find IndexOutOfBoundsException");
                    xjt.t("downloadFile find IndexOutOfBoundsException");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(mne mneVar) {
        mneVar.e(4);
        b(mneVar);
    }

    private void d(String str, mne mneVar) {
        String str2 = eeq.d(2) + eeq.d(1) + eeq.d(2);
        String str3 = eeq.d(3) + eeq.d(str.length() / 2) + str;
        String str4 = eeq.d(4) + eeq.d(1) + eeq.d(mneVar.e());
        String str5 = eeq.d(129) + eeq.b((str2.length() / 2) + (str3.length() / 2) + (str4.length() / 2)) + str2 + str3 + str4;
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(31);
        deviceCommand.setCommandID(1);
        deviceCommand.setDataContent(eeq.c(str5));
        deviceCommand.setDataLen(eeq.c(str5).length);
        deviceCommand.setmIdentify(mneVar.d().getDeviceIdentify());
        ReleaseLogUtil.d("Track_HwEphemerisManager", "5.31.1,downloadState is ", Integer.valueOf(mneVar.e()));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(mne mneVar) {
        ReleaseLogUtil.d("Track_HwEphemerisManager", "sendFileStatus downloadState is ", Integer.valueOf(mneVar.e()));
        String str = eeq.d(1) + eeq.d(1) + eeq.d(mneVar.e());
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(31);
        deviceCommand.setCommandID(3);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        deviceCommand.setmIdentify(mneVar.d().getDeviceIdentify());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
        this.j.removeMessages(400, mneVar.d().getDeviceIdentify());
        if (mneVar.e() == 5 || mneVar.e() == 4) {
            a(mneVar.d());
        }
    }

    private void d(int i, DeviceInfo deviceInfo) {
        byte[] bArrE = new cqj().j(127, i).e();
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(31);
        deviceCommand.setCommandID(1);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(mne mneVar) {
        mneVar.b(30000L);
        mneVar.a(0L);
        mneVar.a(0);
        mneVar.c().clear();
        Handler handler = this.j;
        if (handler != null) {
            handler.removeMessages(1, mneVar.d().getDeviceIdentify());
        } else {
            LogUtil.j("HwEphemerisManager", "initMaintenance find handler is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [javax.net.ssl.HttpsURLConnection] */
    public void d(String str, BtBaseResponseCallback btBaseResponseCallback, String str2) throws Throwable {
        Throwable th;
        URISyntaxException e;
        HttpsURLConnection httpsURLConnection;
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            try {
                try {
                    boolean zIsEmpty = TextUtils.isEmpty(str);
                    ?? H = str;
                    if (!zIsEmpty && str.equals(i())) {
                        H = str;
                        H = h();
                    }
                    H = str;
                    LogUtil.a("HwEphemerisManager", (Object[]) new Object[]{"requestFile fileUrl is ", H});
                    if (new URI(H).getHost() == null) {
                        LogUtil.j("HwEphemerisManager", "requestFile url is error");
                        return;
                    }
                    URLConnection uRLConnectionOpenConnection = new URL(H).openConnection();
                    boolean z = uRLConnectionOpenConnection instanceof HttpsURLConnection;
                    LogUtil.a("HwEphemerisManager", "isInstance is ", Boolean.valueOf(z));
                    if (z) {
                        httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                        try {
                            b(httpsURLConnection, btBaseResponseCallback, str2);
                            httpsURLConnection2 = httpsURLConnection;
                        } catch (MalformedURLException unused) {
                            LogUtil.e("HwEphemerisManager", "requestFile find MalformedURLException callback:", Boolean.valueOf(btBaseResponseCallback == null));
                            if (btBaseResponseCallback != null) {
                                btBaseResponseCallback.onFailure(0, null, str2);
                            }
                            if (httpsURLConnection == null) {
                                return;
                            }
                            httpsURLConnection.disconnect();
                            return;
                        } catch (SSLHandshakeException unused2) {
                            httpsURLConnection2 = httpsURLConnection;
                            LogUtil.e("HwEphemerisManager", "requestFile find SSLHandshakeException");
                            if (httpsURLConnection2 == null) {
                                return;
                            }
                            httpsURLConnection2.disconnect();
                            return;
                        } catch (IOException unused3) {
                            LogUtil.e("HwEphemerisManager", "requestFile find IOException callback: ", Boolean.valueOf(btBaseResponseCallback == null));
                            if (btBaseResponseCallback != null) {
                                btBaseResponseCallback.onFailure(0, null, str2);
                            }
                            if (httpsURLConnection == null) {
                                return;
                            }
                            httpsURLConnection.disconnect();
                            return;
                        } catch (URISyntaxException e2) {
                            e = e2;
                            httpsURLConnection2 = httpsURLConnection;
                            LogUtil.e("HwEphemerisManager", "requestFile find URISyntaxException:", ExceptionUtils.c(e));
                            if (httpsURLConnection2 == null) {
                                return;
                            }
                            httpsURLConnection2.disconnect();
                            return;
                        }
                    }
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (str != 0) {
                        str.disconnect();
                    }
                    throw th;
                }
            } catch (MalformedURLException unused4) {
                httpsURLConnection = null;
            } catch (IOException unused5) {
                httpsURLConnection = null;
            } catch (URISyntaxException e3) {
                e = e3;
            } catch (SSLHandshakeException unused6) {
            }
        } catch (Throwable th3) {
            th = th3;
            str = 0;
        }
    }

    private void b(HttpsURLConnection httpsURLConnection, BtBaseResponseCallback btBaseResponseCallback, String str) throws Throwable {
        FileOutputStream fileOutputStreamOpenOutputStream;
        mne mneVar = this.e.get(str);
        if (mneVar == null) {
            LogUtil.j("HwEphemerisManager", "broadcomNetConnect currentInfo is null");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                httpsURLConnection.setHostnameVerifier(lqs.e);
                httpsURLConnection.setRequestProperty("Charset", "UTF-8");
                httpsURLConnection.setConnectTimeout(300000);
                httpsURLConnection.setReadTimeout(300000);
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.connect();
                RequestResult requestResult = new RequestResult(httpsURLConnection);
                LogUtil.a("HwEphemerisManager", "broadcomNetConnect result：", Integer.valueOf(requestResult.getStatusCode()));
                if (requestResult.getStatusCode() == 200) {
                    byte[] bArrAsByte = requestResult.asByte();
                    String str2 = BaseApplication.getContext().getFilesDir() + File.separator + (nio.c(mneVar.d().getDeviceIdentify()) + "gpslocation.dat");
                    cpl.d("HwEphemerisManager", bArrAsByte, "requestFile path is ", str2, "; requestFile data: ");
                    File file = new File(str2);
                    if (!file.exists()) {
                        LogUtil.a("HwEphemerisManager", "requestFile flag:", Boolean.valueOf(file.createNewFile()));
                    }
                    fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file);
                    try {
                        fileOutputStreamOpenOutputStream.write(bArrAsByte, 0, bArrAsByte.length);
                        mneVar.e(3);
                        fileOutputStreamOpenOutputStream.close();
                        xji.a(file.getPath(), "S2", 0);
                        b(mneVar);
                        LogUtil.a("HwEphemerisManager", "requestFile send status callback:", Boolean.valueOf(btBaseResponseCallback == null));
                        if (btBaseResponseCallback != null) {
                            btBaseResponseCallback.onSuccess(null, str);
                        }
                        fileOutputStream = fileOutputStreamOpenOutputStream;
                    } catch (IOException unused) {
                        fileOutputStream = fileOutputStreamOpenOutputStream;
                        LogUtil.e("HwEphemerisManager", "broadcomNetConnect find IOException");
                        IoUtils.c(fileOutputStream);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        IoUtils.c(fileOutputStreamOpenOutputStream);
                        throw th;
                    }
                } else if (btBaseResponseCallback != null) {
                    btBaseResponseCallback.onFailure(0, null, str);
                }
                IoUtils.c(fileOutputStream);
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStreamOpenOutputStream = null;
        }
    }

    public Map<String, mne> b() {
        return this.e;
    }

    private String i() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("domainbroadoldurl") + "/7day/v6/latest/lto.dat";
    }

    private String h() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("domainbroadnewurl") + "/7day/v6/latest/lto.dat";
    }
}
