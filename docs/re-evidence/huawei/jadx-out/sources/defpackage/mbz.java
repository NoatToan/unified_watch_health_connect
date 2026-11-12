package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.BadParcelableException;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.WatchFaceInfo;
import com.huawei.hwcommonmodel.datatypes.WatchResourcesInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.DiyWatchFaceBitmapUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwpaymgr.HwPayManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.watchface.utils.callback.WatchFaceHealthResponseListener;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public class mbz extends HwBaseManager implements BluetoothDataReceiveCallback {
    private static volatile mbz f;
    private Context g;
    private int h;
    private lvb i;
    private ArrayList<WatchResourcesInfo> k;
    private final BroadcastReceiver l;
    private WatchFaceHealthResponseListener m;
    private boolean n;
    private int o;
    private Map<String, String> p;
    private mcb q;
    private ArrayList<WatchResourcesInfo> r;
    private WatchFaceInfo s;
    private eet t;
    private static final List<String> e = Arrays.asList("2174240537", "2174240579");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f41387b = Arrays.asList("Phoinix-B19F", "Phoinix-B19L", "Phoinix-B19W", "Phoinix-B19M", "Phoinix-B19F2B");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41388c = new Object();
    private static final Object d = new Object();
    private static Map<Integer, List<IBaseResponseCallback>> j = new HashMap(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static IBaseResponseCallback f41386a = null;

    private mbz(Context context) {
        super(context);
        this.p = new HashMap(0);
        this.t = new eet();
        this.s = new WatchFaceInfo();
        this.q = new mcb();
        this.n = false;
        this.h = 0;
        this.r = new ArrayList<>(20);
        this.k = new ArrayList<>(20);
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: mbz.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent == null) {
                    ReleaseLogUtil.e("R_HwWatchBtFaceManager", "mConnectStateChangedReceiver intent is null");
                    return;
                }
                LogUtil.a("HwWatchBtFaceManager", "connectedChanged mNonLocalBroadcastReceiver: intent : ", intent.getAction());
                String action = intent.getAction();
                if (action == null) {
                    return;
                }
                if (!"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                    ReleaseLogUtil.e("R_HwWatchBtFaceManager", "deviceInfo is null!");
                    return;
                }
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                    if (!(parcelableExtra instanceof DeviceInfo)) {
                        ReleaseLogUtil.e("R_HwWatchBtFaceManager", "deviceInfo is null!");
                        return;
                    }
                    DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
                    if (deviceInfo.getRelationship() != null && "followed_relationship".equals(deviceInfo.getRelationship())) {
                        ReleaseLogUtil.d("R_HwWatchBtFaceManager", "This device does not have the correspond capability.");
                        return;
                    }
                    int deviceConnectState = deviceInfo.getDeviceConnectState();
                    if (deviceConnectState == 2) {
                        mbz.this.c(deviceInfo);
                    }
                    if (mbz.this.m != null) {
                        ReleaseLogUtil.d("R_HwWatchBtFaceManager", "connectedChanged response to aar,state:", Integer.valueOf(deviceConnectState));
                        mbz.this.m.onResponse(2, deviceConnectState, Integer.valueOf(deviceInfo.getProductType()));
                    }
                    if (deviceConnectState == 2) {
                        ReleaseLogUtil.d("HwWatchBtFaceManager", "mNonLocalBroadcastReceiver is connect, clear mWatchFaceDeviceMap.");
                        mbz.this.p.clear();
                    } else {
                        LogUtil.j("HwWatchBtFaceManager", "onConnectStateChange state is not connect");
                    }
                } catch (BadParcelableException e2) {
                    ReleaseLogUtil.a("R_HwWatchBtFaceManager", "onReceive() BadParcelableException:", ExceptionUtils.c(e2));
                } catch (RuntimeException e3) {
                    ReleaseLogUtil.a("R_HwWatchBtFaceManager", "RuntimeException:", ExceptionUtils.c(e3));
                }
            }
        };
        this.l = broadcastReceiver;
        this.g = context;
        this.i = lvb.e();
        lvg.e().d("HwWatchBtFaceManager", this);
        ReleaseLogUtil.d("R_HwWatchBtFaceManager", "HwWatchBtFaceManager registerManagerCallback");
        BroadcastManagerUtil.c(this.g, broadcastReceiver, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    public static mbz a(Context context) {
        mbz mbzVar;
        synchronized (d) {
            if (f == null && context != null) {
                LogUtil.a("HwWatchBtFaceManager", "getInstance() context:", context);
                f = new mbz(BaseApplication.getContext());
            }
            mbzVar = f;
        }
        return mbzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DeviceInfo deviceInfo) {
        LogUtil.a("HwWatchBtFaceManager", "searchWatchFace to adapter wrong watch face deviceInfo.getProductType() : ", Integer.valueOf(deviceInfo.getProductType()));
        if (deviceInfo.getProductType() == 72) {
            String softVersion = deviceInfo.getSoftVersion();
            LogUtil.a("HwWatchBtFaceManager", "deviceInfo.getSoftVersion() : ", deviceInfo.getSoftVersion());
            if (TextUtils.isEmpty(softVersion)) {
                return;
            }
            if (softVersion.startsWith("4.0.0.68") || softVersion.startsWith("4.0.0.65")) {
                String deviceModel = deviceInfo.getDeviceModel();
                LogUtil.a("HwWatchBtFaceManager", "deviceInfo.getDeviceModel() : ", deviceModel);
                if (f41387b.contains(deviceModel)) {
                    this.n = true;
                    this.h = 1;
                    j();
                }
            }
        }
    }

    private void n() {
        WatchResourcesInfo next;
        boolean z;
        String watchInfoVersion;
        if (this.h != 1) {
            return;
        }
        this.h = 0;
        ArrayList<WatchResourcesInfo> arrayList = this.r;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        LogUtil.a("HwWatchBtFaceManager", "ready adapter wrong watch face : ", Integer.valueOf(arrayList.size()));
        Iterator<WatchResourcesInfo> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                z = false;
                watchInfoVersion = null;
                break;
            } else {
                next = it.next();
                if (e.contains(next.getWatchInfoId())) {
                    z = (next.getWatchInfoType() & 1) == 1;
                    watchInfoVersion = next.getWatchInfoVersion();
                    break;
                }
            }
        }
        if (watchInfoVersion == null) {
            return;
        }
        if (z) {
            LogUtil.a("HwWatchBtFaceManager", "no deal.");
            return;
        }
        LogUtil.a("HwWatchBtFaceManager", "delete wrong watchFace.");
        if (this.n) {
            LogUtil.a("HwWatchBtFaceManager", "lowestValidVersion : ", "2.1.1");
            if ("2.1.1".compareTo(watchInfoVersion) >= 0) {
                e(next, 2);
            } else {
                LogUtil.a("HwWatchBtFaceManager", "valid watch face, no operation.");
            }
        }
    }

    private static Object g() {
        Map<Integer, List<IBaseResponseCallback>> map;
        synchronized (mbz.class) {
            map = j;
        }
        return map;
    }

    private static IBaseResponseCallback f() {
        return f41386a;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 39;
    }

    private void e(byte[] bArr) {
        LogUtil.a("HwWatchBtFaceManager", "getResult():", eeq.e(bArr));
        if (bArr == null || bArr.length <= 1) {
            ReleaseLogUtil.e("R_HwWatchBtFaceManager", "data illegal");
            return;
        }
        ReleaseLogUtil.d("R_HwWatchBtFaceManager", "getResult() id commandData 1:", Byte.valueOf(bArr[1]));
        switch (bArr[1]) {
            case 1:
                c(bArr);
                break;
            case 2:
                a(bArr);
                break;
            case 3:
                b(bArr);
                break;
            case 4:
                a(bArr, 4);
                break;
            case 5:
                g(bArr);
                break;
            case 6:
                d(bArr);
                break;
            case 7:
            default:
                LogUtil.j("HwWatchBtFaceManager", "getResult nothing to do");
                break;
            case 8:
                i(bArr);
                break;
            case 9:
                h(bArr);
                break;
            case 10:
                f(bArr);
                break;
        }
    }

    private void c(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a("HwWatchBtFaceManager", "5.39.1 handleDeviceInfo ", strE);
        ReleaseLogUtil.d("R_HwWatchBtFaceManager", "5.39.1 handleDeviceInfo is ok.");
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handleDeviceInfo data is error");
            return;
        }
        try {
            List<eew> listE = this.t.b(strE.substring(4)).e();
            if (listE != null && !listE.isEmpty()) {
                for (eew eewVar : listE) {
                    e(CommonUtil.b(eewVar.e(), 16), eewVar.b());
                }
                m();
                return;
            }
            ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handleDeviceInfo tlv error");
        } catch (eeu e2) {
            ReleaseLogUtil.a("R_HwWatchBtFaceManager", "handleDeviceInfo error:", ExceptionUtils.c(e2));
        }
    }

    private void e(int i, String str) {
        this.s.setOtherWatchFaceVersion("");
        if (i == 27) {
            this.s.setSupportAestheticAlbumColor(CommonUtil.b(str, 16));
            ReleaseLogUtil.d("R_HwWatchBtFaceManager", "handleDeviceInfo SupportAestheticAlbumColor:", Integer.valueOf(this.s.getSupportAestheticAlbumColor()));
            return;
        }
        if (i != 29) {
            switch (i) {
                case 1:
                    this.s.setWatchFaceMaxVersion(eeq.d(str));
                    ReleaseLogUtil.d("R_HwWatchBtFaceManager", "handleDeviceInfo setWatchFace_MaxVersion:", this.s.getWatchFaceMaxVersion());
                    break;
                case 2:
                    this.s.setWatchFaceWidth(CommonUtil.b(str, 16));
                    ReleaseLogUtil.d("R_HwWatchBtFaceManager", "handleDeviceInfo setWatchFace_Width:", Integer.valueOf(this.s.getWatchFaceWidth()));
                    break;
                case 3:
                    this.s.setWatchFaceHeight(CommonUtil.b(str, 16));
                    ReleaseLogUtil.d("R_HwWatchBtFaceManager", "handleDeviceInfo setWatchFace_Height:", Integer.valueOf(CommonUtil.b(str, 16)));
                    break;
                case 4:
                    int iB = CommonUtil.b(str, 16);
                    ArrayList arrayList = new ArrayList(20);
                    if ((iB & 1) == 1) {
                        arrayList.add(1);
                    }
                    this.s.setWatchFaceSupportFileType(arrayList);
                    ReleaseLogUtil.d("R_HwWatchBtFaceManager", "handleDeviceInfo setWatchFace_SupportFileType:", this.s.getWatchFaceSupportFileType());
                    break;
                case 5:
                    this.s.setWatchFaceSort(CommonUtil.b(str, 16) == 1);
                    ReleaseLogUtil.d("R_HwWatchBtFaceManager", "handleDeviceInfo setWatchFace_Sort:", Boolean.valueOf(this.s.isWatchFaceSort()));
                    break;
                case 6:
                    this.s.setOtherWatchFaceVersion(eeq.d(str));
                    ReleaseLogUtil.d("R_HwWatchBtFaceManager", "handleDeviceInfo OtherThemeVersion:", this.s.getOtherWatchFaceVersion());
                    break;
                default:
                    LogUtil.j("HwWatchBtFaceManager", "handleDeviceInfoTlv default type:", Integer.valueOf(i));
                    break;
            }
            return;
        }
        this.s.setSupportAlbumFunctionExpansion(CommonUtil.b(str, 16));
        ReleaseLogUtil.d("R_HwWatchBtFaceManager", "handleDeviceInfo SupportAlbumFunctionExpansion:", Integer.valueOf(this.s.getSupportAlbumFunctionExpansion()));
    }

    private void m() {
        synchronized (g()) {
            List<IBaseResponseCallback> list = j.get(1);
            if (list != null && !list.isEmpty()) {
                Iterator<IBaseResponseCallback> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(101, null);
                }
                j.remove(1);
            } else {
                ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handleDeviceInfo callback error");
            }
        }
    }

    private void a(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a("HwWatchBtFaceManager", "5.39.2 handleFaceInfo:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handleFaceInfo data is error");
            return;
        }
        this.k.clear();
        try {
            ees eesVar = this.t.b(strE.substring(4)).b().get(0);
            LogUtil.a("HwWatchBtFaceManager", "getTlvfathers size:", Integer.valueOf(eesVar.b().size()));
            for (ees eesVar2 : eesVar.b()) {
                WatchResourcesInfo watchResourcesInfo = new WatchResourcesInfo();
                for (eew eewVar : eesVar2.e()) {
                    int iB = CommonUtil.b(eewVar.e(), 16);
                    if (iB == 3) {
                        watchResourcesInfo.setWatchInfoId(eeq.d(eewVar.b()));
                        ReleaseLogUtil.d("R_HwWatchBtFaceManager", "handleFaceInfo setWatchInfo_Id:", watchResourcesInfo.getWatchInfoId());
                    } else if (iB == 4) {
                        watchResourcesInfo.setWatchInfoVersion(eeq.d(eewVar.b()));
                        ReleaseLogUtil.d("R_HwWatchBtFaceManager", "handleFaceInfo setWatchInfo_Version:", watchResourcesInfo.getWatchInfoVersion());
                    } else if (iB == 5) {
                        watchResourcesInfo.setWatchInfoType(CommonUtil.b(eewVar.b(), 16));
                        ReleaseLogUtil.d("R_HwWatchBtFaceManager", "handleFaceInfo setWatchInfo_Type:", Integer.valueOf(watchResourcesInfo.getWatchInfoType()));
                    } else {
                        LogUtil.j("HwWatchBtFaceManager", "handleFaceInfo, nothing to do");
                    }
                }
                this.k.add(watchResourcesInfo);
            }
            k();
            n();
            l();
        } catch (eeu e2) {
            ReleaseLogUtil.a("R_HwWatchBtFaceManager", "handleFaceInfo TlvException:", ExceptionUtils.c(e2));
        } catch (IndexOutOfBoundsException e3) {
            ReleaseLogUtil.a("R_HwWatchBtFaceManager", "handleFaceInfo IndexOutOfBoundsException:", ExceptionUtils.c(e3));
        }
    }

    private void k() {
        synchronized (f41388c) {
            this.r.clear();
            this.r.addAll(this.k);
            LogUtil.a("HwWatchBtFaceManager", "handleFaceInfo End, watchFace size:", Integer.valueOf(this.r.size()));
        }
    }

    private void l() {
        synchronized (g()) {
            List<IBaseResponseCallback> list = j.get(2);
            if (list != null && !list.isEmpty()) {
                Iterator<IBaseResponseCallback> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(101, null);
                }
                j.remove(2);
            } else {
                ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handleFaceInfo callback error");
            }
        }
    }

    private void b(byte[] bArr) {
        boolean z;
        int iB;
        String strE = eeq.e(bArr);
        LogUtil.a("HwWatchBtFaceManager", "5.39.3 handleApply:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handleApply data is error");
            return;
        }
        WatchResourcesInfo watchResourcesInfo = new WatchResourcesInfo();
        int i = 0;
        boolean z2 = false;
        try {
            List<eew> listE = this.t.b(strE.substring(4)).e();
            if (listE != null && !listE.isEmpty()) {
                z = false;
                iB = 0;
                for (eew eewVar : listE) {
                    try {
                        int iB2 = CommonUtil.b(eewVar.e(), 16);
                        String strB = eewVar.b();
                        if (iB2 == 1) {
                            watchResourcesInfo.setWatchInfoId(eeq.d(strB));
                            LogUtil.a("HwWatchBtFaceManager", "handleApply setWatchInfo_Id:", watchResourcesInfo.getWatchInfoId());
                        } else if (iB2 == 2) {
                            watchResourcesInfo.setWatchInfoVersion(eeq.d(strB));
                            LogUtil.a("HwWatchBtFaceManager", "handleApply setWatchInfo_Version:", watchResourcesInfo.getWatchInfoVersion());
                        } else if (iB2 == 4) {
                            z = CommonUtil.b(strB, 16) == 1;
                            LogUtil.a("HwWatchBtFaceManager", "handleApply isNeedTransfer:", Boolean.valueOf(z));
                        } else if (iB2 == 127) {
                            iB = CommonUtil.b(strB, 16);
                            LogUtil.a("HwWatchBtFaceManager", "handleApply errorCode:", Integer.valueOf(iB));
                        } else {
                            LogUtil.j("HwWatchBtFaceManager", "handleApply, nothing to do");
                        }
                    } catch (eeu e2) {
                        e = e2;
                        i = iB;
                        ReleaseLogUtil.a("R_HwWatchBtFaceManager", "handleApply TlvException:", ExceptionUtils.c(e));
                        iB = i;
                    }
                }
                z2 = z;
            } else {
                ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handleApply tlv error");
                iB = 0;
            }
        } catch (eeu e3) {
            e = e3;
            z = false;
        }
        d(z2, iB, watchResourcesInfo.getWatchInfoId() + "_" + watchResourcesInfo.getWatchInfoVersion());
    }

    private void d(boolean z, int i, String str) {
        synchronized (g()) {
            List<IBaseResponseCallback> list = j.get(3);
            if (list != null && !list.isEmpty()) {
                LogUtil.j("HwWatchBtFaceManager", "reportForUi, callbackList isn't null");
                j.remove(3);
                if (i != 0) {
                    list.get(list.size() - 1).a(104, str);
                } else if (z) {
                    list.get(list.size() - 1).a(105, str);
                } else {
                    list.get(list.size() - 1).a(103, str);
                }
            } else {
                ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handleApply callback error");
            }
        }
    }

    private void a(byte[] bArr, int i) {
        int iB;
        String strE = eeq.e(bArr);
        LogUtil.a("HwWatchBtFaceManager", "handleErrorCode, info:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handleErrorCode data is error");
            return;
        }
        try {
            iB = CommonUtil.b(this.t.b(strE.substring(4)).e().get(0).b(), 16);
        } catch (eeu e2) {
            ReleaseLogUtil.a("R_HwWatchBtFaceManager", "handleErrorCode TlvException:", ExceptionUtils.c(e2));
            iB = 0;
        }
        LogUtil.a("HwWatchBtFaceManager", "handleErrorCode:", Integer.valueOf(iB));
        synchronized (g()) {
            List<IBaseResponseCallback> list = j.get(Integer.valueOf(i));
            if (list != null && !list.isEmpty()) {
                if (iB == 100000 && f() != null) {
                    list.get(list.size() - 1).a(101, null);
                    f().a(106, null);
                } else {
                    list.get(list.size() - 1).a(102, null);
                }
                j.remove(Integer.valueOf(i));
            } else {
                ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handleErrorCode callback error");
            }
        }
    }

    private void g(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a("HwWatchBtFaceManager", "5.39.5 handleReportStatus, info:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handleReportStatus data is error");
            return;
        }
        WatchResourcesInfo watchResourcesInfo = new WatchResourcesInfo();
        int i = 0;
        try {
            List<eew> listE = this.t.b(strE.substring(4)).e();
            if (listE != null && !listE.isEmpty()) {
                int iB = 0;
                for (eew eewVar : listE) {
                    try {
                        int iB2 = CommonUtil.b(eewVar.e(), 16);
                        String strB = eewVar.b();
                        if (iB2 == 1) {
                            watchResourcesInfo.setWatchInfoId(eeq.d(strB));
                            LogUtil.a("HwWatchBtFaceManager", "handleReportStatus setWatchInfo_Id:", watchResourcesInfo.getWatchInfoId());
                        } else if (iB2 == 2) {
                            watchResourcesInfo.setWatchInfoVersion(eeq.d(strB));
                            LogUtil.a("HwWatchBtFaceManager", "handleReportStatus setWatchInfo_Version:", watchResourcesInfo.getWatchInfoVersion());
                        } else if (iB2 == 3) {
                            iB = CommonUtil.b(strB, 16);
                            LogUtil.a("HwWatchBtFaceManager", "handleReportStatus reportType:", Integer.valueOf(iB));
                        } else if (iB2 == 4) {
                            watchResourcesInfo.setFailedNum(CommonUtil.b(strB, 16));
                            LogUtil.a("HwWatchBtFaceManager", "handleReportStatus failed num:", Integer.valueOf(watchResourcesInfo.getFailedNum()));
                        } else {
                            LogUtil.j("HwWatchBtFaceManager", "handleReportStatus, nothing to do");
                        }
                    } catch (eeu e2) {
                        e = e2;
                        i = iB;
                        ReleaseLogUtil.a("R_HwWatchBtFaceManager", "handleReportStatus TlvException:", ExceptionUtils.c(e));
                    }
                }
                i = iB;
            } else {
                ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handleReportStatus tlvList error");
            }
        } catch (eeu e3) {
            e = e3;
        }
        d(watchResourcesInfo, 100000);
        b(i, watchResourcesInfo);
    }

    private void b(int i, WatchResourcesInfo watchResourcesInfo) {
        if (f() == null) {
            c(i, watchResourcesInfo);
            return;
        }
        if (i == 1) {
            f().a(106, watchResourcesInfo);
            return;
        }
        if (i == 2) {
            f().a(107, watchResourcesInfo);
            return;
        }
        if (i == 3) {
            f().a(108, watchResourcesInfo);
        } else if (i == 4) {
            c(i, watchResourcesInfo);
        } else {
            LogUtil.j("HwWatchBtFaceManager", "reportStatusForUi error");
        }
    }

    private void c(int i, WatchResourcesInfo watchResourcesInfo) {
        if (i != 4) {
            ReleaseLogUtil.e("R_HwWatchBtFaceManager", "reportPhotoReceivedStatus, reportType not STATUS_PHOTO_RECEIVE");
            return;
        }
        LogUtil.a("HwWatchBtFaceManager", "normal watch received");
        synchronized (g()) {
            List<IBaseResponseCallback> list = j.get(Integer.valueOf(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY));
            if (list != null && !list.isEmpty()) {
                Iterator<IBaseResponseCallback> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(101, Integer.valueOf(watchResourcesInfo.getFailedNum()));
                    LogUtil.a("HwWatchBtFaceManager", "send File callback success, filed number:", Integer.valueOf(watchResourcesInfo.getFailedNum()));
                }
                j.remove(Integer.valueOf(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY));
            } else {
                ReleaseLogUtil.e("R_HwWatchBtFaceManager", "send file callback error");
            }
        }
    }

    private void d(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a("HwWatchBtFaceManager", "5.39.6 handleNameInfo:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handleNameInfo data is error");
            return;
        }
        try {
            ees eesVar = this.t.b(strE.substring(4)).b().get(0);
            LogUtil.a("HwWatchBtFaceManager", "handleNameInfo size:", Integer.valueOf(eesVar.b().size()));
            HashMap<String, WatchResourcesInfo> map = new HashMap<>(20);
            Iterator<ees> it = eesVar.b().iterator();
            while (it.hasNext()) {
                b(map, it.next());
            }
            LogUtil.a("HwWatchBtFaceManager", "handleNameInfo End, nameMap size:", Integer.valueOf(map.size()));
            b(map);
        } catch (eeu e2) {
            ReleaseLogUtil.a("R_HwWatchBtFaceManager", "handleNameInfo TlvException:", ExceptionUtils.c(e2));
        } catch (IndexOutOfBoundsException e3) {
            ReleaseLogUtil.a("R_HwWatchBtFaceManager", "handleNameInfo IndexOutOfBoundsException:", ExceptionUtils.c(e3));
        } catch (NumberFormatException e4) {
            ReleaseLogUtil.a("R_HwWatchBtFaceManager", "handleNameInfo NumberFormatException:", ExceptionUtils.c(e4));
        }
    }

    private void b(HashMap<String, WatchResourcesInfo> map, ees eesVar) {
        WatchResourcesInfo watchResourcesInfo = new WatchResourcesInfo();
        String strD = "";
        for (eew eewVar : eesVar.e()) {
            int iB = CommonUtil.b(eewVar.e(), 16);
            if (iB == 4) {
                strD = eeq.d(eewVar.b());
                LogUtil.a("HwWatchBtFaceManager", "handleNameInfo watchFaceId:", strD);
            } else if (iB == 5) {
                watchResourcesInfo.setWatchInfoName(eeq.d(eewVar.b()));
                LogUtil.a("HwWatchBtFaceManager", "handleNameInfo watchFaceName:", watchResourcesInfo.getWatchInfoName());
            } else if (iB == 6) {
                watchResourcesInfo.setWatchInfoBrief(eeq.d(eewVar.b()));
                LogUtil.a("HwWatchBtFaceManager", "handleNameInfo watchFaceBrief:", watchResourcesInfo.getWatchInfoBrief());
            } else if (iB == 7) {
                watchResourcesInfo.setWatchInfoSize(CommonUtil.b(eewVar.b(), 16));
                LogUtil.a("HwWatchBtFaceManager", "handleNameInfo watchFaceSize:", Integer.valueOf(watchResourcesInfo.getWatchInfoSize()));
            } else {
                LogUtil.j("HwWatchBtFaceManager", "handleOneTlv default:", Integer.valueOf(CommonUtil.b(eewVar.e(), 16)));
            }
        }
        LogUtil.a("HwWatchBtFaceManager", "handleNameInfo putMap, watchFaceId:", strD, "watchFaceInfo:", watchResourcesInfo.toString());
        map.put(strD, watchResourcesInfo);
    }

    private void b(HashMap<String, WatchResourcesInfo> map) {
        synchronized (g()) {
            List<IBaseResponseCallback> list = j.get(6);
            if (list != null && !list.isEmpty()) {
                list.get(list.size() - 1).a(101, map);
                j.remove(6);
            } else {
                ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handleNameInfo callback error");
            }
        }
    }

    private void i(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a("HwWatchBtFaceManager", "5.39.8 handlePhotoInfo, info:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.d("R_HwWatchBtFaceManager", "handlePhotoInfo data is error");
            return;
        }
        try {
            ees eesVarB = this.t.b(strE.substring(4));
            List<eew> listE = eesVarB.e();
            if (listE != null && !listE.isEmpty()) {
                for (eew eewVar : listE) {
                    a(CommonUtil.b(eewVar.e(), 16), eewVar.b());
                }
            } else {
                ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handlePhotoInfo tlvList error");
            }
            LogUtil.a("HwWatchBtFaceManager", "5.39.8 handlePhotoInfo struct size:", Integer.valueOf(eesVarB.b().size()));
            DeviceInfo deviceInfoC = mgg.c("HwWatchBtFaceManager");
            if (deviceInfoC != null) {
                d(deviceInfoC);
            }
            if (!eesVarB.b().isEmpty()) {
                c(eesVarB.b().get(0));
            } else {
                this.q.c(new ArrayList<>(20));
            }
        } catch (eeu e2) {
            ReleaseLogUtil.a("R_HwWatchBtFaceManager", "handlePhotoInfo TlvException:", ExceptionUtils.c(e2));
        }
        synchronized (g()) {
            List<IBaseResponseCallback> list = j.get(8);
            if (list != null && !list.isEmpty()) {
                list.get(list.size() - 1).a(101, this.q);
                j.remove(8);
            } else {
                ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handlePhotoInfo callback error");
            }
        }
    }

    private void d(DeviceInfo deviceInfo) {
        this.p.put(deviceInfo.getDeviceIdentify() + deviceInfo.getSoftVersion(), this.q.e() + Constants.LINK + this.q.i() + Constants.LINK + this.q.a() + Constants.LINK + this.q.c());
    }

    private void c(ees eesVar) {
        LogUtil.a("HwWatchBtFaceManager", "enter handleBackground");
        TreeMap treeMap = new TreeMap();
        Iterator<ees> it = eesVar.b().iterator();
        String strD = "";
        int iV = -1;
        while (it.hasNext()) {
            for (eew eewVar : it.next().e()) {
                int iV2 = CommonUtil.v(eewVar.e());
                if (iV2 == 6) {
                    iV = CommonUtil.v(eewVar.b());
                } else if (iV2 == 7) {
                    strD = eeq.d(eewVar.b());
                } else {
                    LogUtil.j("HwWatchBtFaceManager", "handleBackground error");
                }
            }
            if (iV != -1 && !TextUtils.isEmpty(strD)) {
                treeMap.put(Integer.valueOf(iV), strD);
            }
        }
        LogUtil.a("HwWatchBtFaceManager", "handleBackground map.size", Integer.valueOf(treeMap.size()));
        Iterator it2 = treeMap.keySet().iterator();
        ArrayList<String> arrayList = new ArrayList<>(20);
        while (it2.hasNext()) {
            arrayList.add((String) treeMap.get(it2.next()));
        }
        LogUtil.a("HwWatchBtFaceManager", "handleBackground backgroundList.size", Integer.valueOf(arrayList.size()));
        this.q.c(arrayList);
    }

    private void a(int i, String str) {
        if (i == 1) {
            this.q.c(CommonUtil.b(str, 16));
            LogUtil.a("HwWatchBtFaceManager", "handlePhotoInfoTlv setMaxBackgroundImages:", Integer.valueOf(this.q.e()));
            return;
        }
        if (i == 2) {
            if (CommonUtil.b(str, 16) == 1) {
                this.q.c(true);
            } else {
                this.q.c(false);
            }
            LogUtil.a("HwWatchBtFaceManager", "handlePhotoInfoTlv setSupportIntellectColor:", Boolean.valueOf(this.q.i()));
            return;
        }
        if (i == 3) {
            this.q.b(CommonUtil.b(str, 16));
            LogUtil.a("HwWatchBtFaceManager", "handlePhotoInfoTlv setBackgroundType:", Integer.valueOf(this.q.a()));
            return;
        }
        if (i == 8) {
            this.q.d(CommonUtil.b(str, 16));
            LogUtil.a("HwWatchBtFaceManager", "handlePhotoInfoTlv setPositionIndex:", Integer.valueOf(this.q.g()));
            return;
        }
        if (i == 9) {
            this.q.e(CommonUtil.b(str, 16));
            LogUtil.a("HwWatchBtFaceManager", "handlePhotoInfoTlv setStyleIndex:", Integer.valueOf(this.q.j()));
        } else if (i == 11) {
            this.q.a(CommonUtil.b(str, 16));
            LogUtil.a("HwWatchBtFaceManager", "handlePhotoInfoTlv setBackgroundImageOption:", Integer.valueOf(this.q.c()));
        } else if (i != 41) {
            LogUtil.j("HwWatchBtFaceManager", "handlePhotoInfoTlv default type:", Integer.valueOf(i));
        } else {
            this.q.g(CommonUtil.b(str, 16));
            LogUtil.a("HwWatchBtFaceManager", "handlePhotoInfoTlv setTimeSizeIndex", Integer.valueOf(this.q.h()));
        }
    }

    private void h(byte[] bArr) {
        int iB;
        int iB2;
        String strE = eeq.e(bArr);
        LogUtil.a("HwWatchBtFaceManager", "5.39.9 handlePhotoStatus ", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handlePhotoStatus data is error");
            return;
        }
        int i = 0;
        try {
            List<eew> listE = this.t.b(strE.substring(4)).e();
            if (listE != null && !listE.isEmpty()) {
                iB = 0;
                iB2 = 0;
                for (eew eewVar : listE) {
                    try {
                        int iB3 = CommonUtil.b(eewVar.e(), 16);
                        String strB = eewVar.b();
                        if (iB3 == 8) {
                            iB2 = CommonUtil.b(strB, 16);
                            LogUtil.a("HwWatchBtFaceManager", "handlePhotoStatus transferNum:", Integer.valueOf(iB2));
                        } else if (iB3 == 127) {
                            iB = CommonUtil.b(strB, 16);
                            LogUtil.a("HwWatchBtFaceManager", "handlePhotoStatus ERROR_CODE:", Integer.valueOf(iB));
                        } else {
                            LogUtil.j("HwWatchBtFaceManager", "handlePhotoStatus, nothing to do");
                        }
                    } catch (eeu e2) {
                        e = e2;
                        i = iB2;
                        ReleaseLogUtil.a("R_HwWatchBtFaceManager", "handlePhotoStatus error:", ExceptionUtils.c(e));
                        iB2 = i;
                    }
                }
                i = iB;
            } else {
                ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handlePhotoStatus tlv error");
                iB2 = 0;
            }
        } catch (eeu e3) {
            e = e3;
            iB = 0;
        }
        b(i, iB2);
    }

    private void b(int i, int i2) {
        synchronized (g()) {
            List<IBaseResponseCallback> list = j.get(Integer.valueOf(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY));
            if (list == null || list.isEmpty()) {
                ReleaseLogUtil.e("R_HwWatchBtFaceManager", "reportPhotoStatus callback error");
            } else if (i == 100000 && i2 == 0) {
                list.get(list.size() - 1).a(101, 0);
                list.remove(list.size() - 1);
            } else if (i == 100000 && i2 > 0) {
                ReleaseLogUtil.d("R_HwWatchBtFaceManager", "reportPhotoStatus need transfer num:", Integer.valueOf(i2));
                list.get(list.size() - 1).a(111, Integer.valueOf(i2));
            } else {
                ReleaseLogUtil.d("R_HwWatchBtFaceManager", "reportPhotoStatus errorCode is failed");
                list.get(list.size() - 1).a(102, null);
                list.remove(list.size() - 1);
            }
        }
    }

    private void f(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a("HwWatchBtFaceManager", "5.39.10 handleTagActivate info:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e("R_HwWatchBtFaceManager", "handleTagActivate data is error");
            return;
        }
        try {
            if ((CommonUtil.v(this.t.b(strE.substring(4)).e().get(0).e()) & 1) == 1) {
                ReleaseLogUtil.d("R_HwWatchBtFaceManager", "5.39.10 start activate tag!");
                mby.b(BaseApplication.getContext()).c();
            }
            String str = eeq.d(127) + eeq.d(4) + eeq.c(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US);
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(39);
            deviceCommand.setCommandID(10);
            deviceCommand.setDataContent(eeq.c(str));
            deviceCommand.setDataLen(eeq.c(str).length);
            this.i.c(deviceCommand);
        } catch (eeu e2) {
            ReleaseLogUtil.a("R_HwWatchBtFaceManager", "handleDeviceInfo TlvException:", ExceptionUtils.c(e2));
        }
    }

    public void b(IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("R_HwWatchBtFaceManager", "enter getDeviceInfoForUi");
        synchronized (g()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = j.get(1);
                if (list == null) {
                    ReleaseLogUtil.d("R_HwWatchBtFaceManager", "enter getDeviceInfoForUI have no callback");
                    ArrayList arrayList = new ArrayList(20);
                    arrayList.add(iBaseResponseCallback);
                    j.put(1, arrayList);
                } else {
                    ReleaseLogUtil.d("R_HwWatchBtFaceManager", "enter getDeviceInfoForUI have callback,add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        i();
    }

    private void i() {
        String str = (eeq.d(1) + eeq.d(0)) + (eeq.d(2) + eeq.d(0)) + (eeq.d(3) + eeq.d(0)) + (eeq.d(4) + eeq.d(0)) + (eeq.d(5) + eeq.d(0));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(1);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        LogUtil.a("HwWatchBtFaceManager", "getDeviceInfo, deviceCommand:", deviceCommand.toString());
        this.i.c(deviceCommand);
    }

    private void j() {
        String str = eeq.d(1) + eeq.d(0);
        int i = CommonUtil.cl() ? 2 : 1;
        if (Utils.o() && !TextUtils.equals("CN", GRSManager.c(BaseApplication.getContext()).getCommonCountryCode())) {
            i = 3;
        }
        String str2 = str + (eeq.d(6) + eeq.d(1) + eeq.d(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(2);
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        LogUtil.a("HwWatchBtFaceManager", "getDeviceWatchInfo, deviceCommand:", deviceCommand.toString());
        this.i.c(deviceCommand);
    }

    private void e(WatchResourcesInfo watchResourcesInfo, int i) {
        if (watchResourcesInfo == null) {
            ReleaseLogUtil.e("R_HwWatchBtFaceManager", "sendOperateType watchResourcesInfo == null");
            return;
        }
        String strA = eeq.a(watchResourcesInfo.getWatchInfoId());
        String str = eeq.d(1) + eeq.d(strA.length() / 2) + strA;
        String strA2 = eeq.a(watchResourcesInfo.getWatchInfoVersion());
        String str2 = str + (eeq.d(2) + eeq.d(strA2.length() / 2) + strA2) + (eeq.d(3) + eeq.d(1) + eeq.d(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(3);
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        LogUtil.a("HwWatchBtFaceManager", "sendOperateType, deviceCommand:", deviceCommand.toString());
        this.i.c(deviceCommand);
    }

    private void d(WatchResourcesInfo watchResourcesInfo, int i) {
        String strA = eeq.a(watchResourcesInfo.getWatchInfoId());
        String str = eeq.d(1) + eeq.d(strA.length() / 2) + strA;
        String strA2 = eeq.a(watchResourcesInfo.getWatchInfoVersion());
        String str2 = str + (eeq.d(2) + eeq.d(strA2.length() / 2) + strA2) + (eeq.d(127) + eeq.d(4) + eeq.c(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(5);
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        LogUtil.a("HwWatchBtFaceManager", "reportACK, deviceCommand:", deviceCommand.toString());
        this.i.c(deviceCommand);
    }

    private void c(int i) {
        String str = eeq.d(1) + eeq.d(0);
        String str2 = eeq.d(2) + eeq.d(0);
        String str3 = eeq.d(3) + eeq.d(0);
        String str4 = eeq.d(4) + eeq.d(0);
        StringBuilder sb = new StringBuilder(20);
        if ((i & 1) == 1) {
            sb.append(eeq.d(8) + eeq.d(0));
        }
        if ((i & 2) == 2) {
            sb.append(eeq.d(9) + eeq.d(0));
        }
        String str5 = str + str2 + str3 + str4 + sb.toString();
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(8);
        deviceCommand.setDataContent(eeq.c(str5));
        deviceCommand.setDataLen(eeq.c(str5).length);
        LogUtil.a("HwWatchBtFaceManager", "getPhotoWatchInfo, deviceCommand:", deviceCommand.toString());
        this.i.c(deviceCommand);
    }

    private void d(mcb mcbVar) {
        StringBuilder sb = new StringBuilder(20);
        LogUtil.a("HwWatchBtFaceManager", "makePhotoInfoCommand support aesthetic:", Integer.valueOf(this.s.getSupportAestheticAlbumColor()));
        int i = 1;
        for (int i2 = 0; i2 < mcbVar.b().size(); i2++) {
            sb.append(b(mcbVar.b().get(i2), mcbVar.d().get(i2), i));
            i++;
        }
        StringBuilder sb2 = new StringBuilder(20);
        LogUtil.a("HwWatchBtFaceManager", "makePhotoInfoCommand type:", Integer.valueOf(this.o));
        if ((this.o & 1) == 1) {
            sb2.append(eeq.d(6) + eeq.d(1) + eeq.d(mcbVar.g()));
        }
        if ((this.o & 2) == 2) {
            sb2.append(eeq.d(7) + eeq.d(1) + eeq.d(mcbVar.j()));
        }
        cqj cqjVar = new cqj();
        cqjVar.g(28, 0);
        sb2.append(eeq.e(cqjVar.e()));
        int size = mcbVar.b().size();
        String str = eeq.d(1) + eeq.d(1) + eeq.d(size);
        String str2 = size == 0 ? str + ((Object) sb2) : str + (eeq.d(130) + eeq.b(sb.length() / 2) + ((Object) sb)) + ((Object) sb2);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(9);
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        LogUtil.a("HwWatchBtFaceManager", "makePhotoInfoCommand, deviceCommand:", deviceCommand.toString());
        this.i.c(deviceCommand);
    }

    private String b(String str, String str2, int i) {
        Integer numE;
        String str3 = eeq.d(4) + eeq.d(1) + eeq.d(i);
        String str4 = eeq.d(5) + eeq.d(eeq.a(str).length() / 2) + eeq.a(str);
        cqj cqjVar = new cqj();
        cqjVar.g(21, 1);
        cqjVar.g(22, 1);
        cqjVar.g(23, 1);
        if (this.s.getSupportAlbumFunctionExpansion() == 1) {
            cqjVar.g(41, 1);
        }
        if (this.s.getSupportAestheticAlbumColor() == 1 && (numE = e(str2, new Rect(0, 0, this.s.getWatchFaceWidth(), this.s.getWatchFaceHeight()))) != null) {
            String str5 = "#01" + com.huawei.operation.utils.Utils.int2Hex(numE.intValue()).substring(1);
            LogUtil.a("HwWatchBtFaceManager", "makeSingleImageTLV smartPictureColor: ", str5);
            cqjVar.b(13, str5);
            cqjVar.g(12, 1);
        }
        String str6 = str3 + str4 + eeq.e(cqjVar.e());
        return eeq.d(131) + eeq.d(str6.length() / 2) + str6;
    }

    private Integer e(String str, Rect rect) {
        Bitmap bitmapE = qqf.e(str);
        if (bitmapE == null) {
            ReleaseLogUtil.e("R_HwWatchBtFaceManager", "getSmartPicture watchFaceBgBitmap is null");
            return null;
        }
        return Integer.valueOf(DiyWatchFaceBitmapUtils.obtainWidgetColor(bitmapE, rect));
    }

    public void e(int i) {
        ReleaseLogUtil.d("R_HwWatchBtFaceManager", "enter sendTagResult");
        String str = eeq.d(1) + eeq.d(4) + eeq.c(i);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(11);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        LogUtil.a("HwWatchBtFaceManager", "sendTagResult, deviceCommand:", deviceCommand.toString());
        this.i.c(deviceCommand);
    }

    public void a(int i) {
        ReleaseLogUtil.d("R_HwWatchBtFaceManager", "enter sendClipMessage");
        String str = eeq.d(1) + eeq.d(1) + eeq.d(i);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(13);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        LogUtil.a("HwWatchBtFaceManager", "sendClipMessage, deviceCommand:", deviceCommand.toString());
        this.i.c(deviceCommand);
    }

    public WatchFaceInfo b() {
        return this.s;
    }

    public void e(int i, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (g()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = j.get(8);
                if (list == null) {
                    ReleaseLogUtil.d("R_HwWatchBtFaceManager", "enter getWatchFacePhotoInfo have no callback");
                    ArrayList arrayList = new ArrayList(20);
                    arrayList.add(iBaseResponseCallback);
                    j.put(8, arrayList);
                } else {
                    LogUtil.a("HwWatchBtFaceManager", "enter getWatchFacePhotoInfo have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        LogUtil.a("HwWatchBtFaceManager", "getWatchFacePhotoInfo type:", Integer.valueOf(i));
        this.o = i;
        c(i);
    }

    public void c(mcb mcbVar, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("R_HwWatchBtFaceManager", "enter sendResourceToDevice");
        if (mcbVar == null) {
            iBaseResponseCallback.a(102, "");
            ReleaseLogUtil.e("R_HwWatchBtFaceManager", "sendResourceToDevice error");
            return;
        }
        synchronized (g()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = j.get(Integer.valueOf(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY));
                if (list == null) {
                    ReleaseLogUtil.d("R_HwWatchBtFaceManager", "enter sendResourceToDevice have no callback");
                    ArrayList arrayList = new ArrayList(20);
                    arrayList.add(iBaseResponseCallback);
                    j.put(Integer.valueOf(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY), arrayList);
                } else {
                    LogUtil.a("HwWatchBtFaceManager", "enter sendResourceToDevice have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        d(mcbVar);
    }

    public int a() {
        DeviceInfo deviceInfoC = mgg.c("HwWatchBtFaceManager");
        if (deviceInfoC != null && this.p != null) {
            String str = this.p.get(deviceInfoC.getDeviceIdentify() + deviceInfoC.getSoftVersion());
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split(Constants.LINK);
                if (strArrSplit.length > 0) {
                    return CommonUtil.e(strArrSplit[0], 0);
                }
            }
        }
        return 0;
    }

    public int c() {
        DeviceInfo deviceInfoC = mgg.c("HwWatchBtFaceManager");
        if (deviceInfoC != null && this.p != null) {
            String str = this.p.get(deviceInfoC.getDeviceIdentify() + deviceInfoC.getSoftVersion());
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split(Constants.LINK);
                if (strArrSplit.length > 1) {
                    return CommonUtil.e(strArrSplit[2], 2);
                }
            }
        }
        return 2;
    }

    public int d() {
        DeviceInfo deviceInfoC = mgg.c("HwWatchBtFaceManager");
        if (deviceInfoC == null || this.p == null) {
            return 1;
        }
        String str = this.p.get(deviceInfoC.getDeviceIdentify() + deviceInfoC.getSoftVersion());
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        String[] strArrSplit = str.split(Constants.LINK);
        if (strArrSplit.length > 3) {
            return CommonUtil.e(strArrSplit[3], 2);
        }
        return 1;
    }

    public boolean e() {
        DeviceInfo deviceInfoC = mgg.c("HwWatchBtFaceManager");
        if (deviceInfoC == null || this.p == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(deviceInfoC.getDeviceIdentify());
        sb.append(deviceInfoC.getSoftVersion());
        return !TextUtils.isEmpty(this.p.get(sb.toString()));
    }

    public void c(int i, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("R_HwWatchBtFaceManager", "enter setTagStatus cardState:", Integer.valueOf(i));
        HwPayManager.e().e(i, iBaseResponseCallback);
    }

    public void a(WatchFaceHealthResponseListener watchFaceHealthResponseListener) {
        ReleaseLogUtil.d("R_HwWatchBtFaceManager", "registerHealthResponseListener");
        this.m = watchFaceHealthResponseListener;
    }

    public void h() {
        ReleaseLogUtil.d("R_HwWatchBtFaceManager", "unRegisterHealthResponseListener");
        this.m = null;
    }

    private boolean d(int i, Object obj) {
        WatchFaceHealthResponseListener watchFaceHealthResponseListener = this.m;
        if (watchFaceHealthResponseListener == null) {
            return false;
        }
        watchFaceHealthResponseListener.onResponse(1, i, obj);
        return true;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        try {
            ReleaseLogUtil.d("R_HwWatchBtFaceManager", "Enter unregisterNonLocalBroadcast!");
            this.g.unregisterReceiver(this.l);
        } catch (IllegalArgumentException e2) {
            ReleaseLogUtil.a("R_HwWatchBtFaceManager", "onDestroy IllegalArgumentException:", ExceptionUtils.c(e2));
        }
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr == null) {
            ReleaseLogUtil.d("R_HwWatchBtFaceManager", "data is null");
            return;
        }
        ReleaseLogUtil.d("R_HwWatchBtFaceManager", "onDataReceived serviceId is,", Integer.valueOf(bArr[0]), "commandId is,", Integer.valueOf(bArr[1]));
        if ((mih.a(bArr) || mih.d(bArr)) && d(i, bArr)) {
            ReleaseLogUtil.d("R_HwWatchBtFaceManager", "watchface appId");
            if (mih.a(bArr, this.h)) {
                ReleaseLogUtil.d("R_HwWatchBtFaceManager", "TouchTransferCommand is true");
                e(bArr);
                return;
            }
            return;
        }
        e(bArr);
    }
}
