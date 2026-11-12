package defpackage;

import android.content.Context;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.health.baseapi.hiaiengine.HiAiIntelligentSleepApi;
import com.huawei.health.baseapi.hiaiengine.IntelligentResultListener;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.phoneprocess.mgr.hwintelligentmgr.HiAiScreenListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes11.dex */
public class mwk extends EngineLogicBaseManager {
    private static volatile mwk d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HiAiScreenListener f42572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IntelligentResultListener f42573b;
    private SendCallback f;
    private eet h;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReference<mwj> f42571c = new AtomicReference<>(null);

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
    }

    public boolean d(mwj mwjVar) {
        if (mwjVar == null) {
            return false;
        }
        return ((mwjVar.e() == 0 && mwjVar.i() == 0 && mwjVar.g() == 0) || mwjVar.f() == 0) ? false : true;
    }

    private mwk(Context context) {
        super(context);
        this.f42572a = new HiAiScreenListener();
        this.h = new eet();
        this.f42573b = new IntelligentResultListener() { // from class: mwk.2
            @Override // com.huawei.health.baseapi.hiaiengine.IntelligentResultListener
            public void onResult(boolean z, boolean z2, boolean z3, boolean z4, long j) {
                ReleaseLogUtil.d("DEVMGR_HiWearEngineIntelligentManager", "receive intelligent query result ", "isLastUsed :", Boolean.valueOf(z), ", isEye :", Boolean.valueOf(z2), ", isMovement :", Boolean.valueOf(z3), ", isLight :", Boolean.valueOf(z4), ", timeStamp :", Long.valueOf(j));
                if (z || z2 || z3 || z4) {
                    mwk.this.e(1);
                } else {
                    mwk.this.e(2);
                }
                mwk.this.a(z, z2, z3, z4, j);
            }

            @Override // com.huawei.health.baseapi.hiaiengine.IntelligentResultListener
            public void onNotSupportResult() {
                mwk.this.e(0);
            }
        };
        this.f = new SendCallback() { // from class: mwk.3
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                ReleaseLogUtil.d("DEVMGR_HiWearEngineIntelligentManager", "sendCommand errCode:", Integer.valueOf(i));
                boolean zC = mwi.a().c();
                LogUtil.a("HiWearEngineIntelligentManager", "sendCommandToDevice isSupportNewVersion: ", Boolean.valueOf(zC));
                if (zC) {
                    if (i == 207) {
                        mwe.a().b();
                    }
                    mwj mwjVar = (mwj) mwk.f42571c.get();
                    if (mwk.this.d(mwjVar)) {
                        mwe.a().a(mwjVar);
                    }
                    mwe.a().l();
                }
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a("HiWearEngineIntelligentManager", "mSendCallback onFileTransferReport transferWay: ", str);
            }
        };
        ddr.e().initHiAiEngine();
    }

    public static mwk e() {
        mwk mwkVar;
        synchronized (e) {
            LogUtil.a("HiWearEngineIntelligentManager", "getInstance()");
            if (d == null) {
                d = new mwk(BaseApplication.getContext());
            }
            mwkVar = d;
        }
        return mwkVar;
    }

    private static void j() {
        if (d == null) {
            LogUtil.j("HiWearEngineIntelligentManager", "current instance is null");
            return;
        }
        synchronized (e) {
            d = null;
        }
    }

    public static void c(DeviceInfo deviceInfo) {
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            ReleaseLogUtil.e("DEVMGR_HiWearEngineIntelligentManager", "startIntelligentManager device is disconnected.");
        } else if (!a(deviceInfo) && !CommonUtil.av()) {
            ReleaseLogUtil.e("DEVMGR_HiWearEngineIntelligentManager", "startIntelligentManager not SupportCheckMobileLight and emui < 11.0");
            j();
        } else {
            e();
        }
    }

    public void c() {
        ReleaseLogUtil.d("DEVMGR_HiWearEngineIntelligentManager", " registerQueryScreenState enter ");
        this.f42572a.b(new HiAiScreenListener.ScreenStateListener() { // from class: mwk.4
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwintelligentmgr.HiAiScreenListener.ScreenStateListener
            public void onScreenOn() {
                ReleaseLogUtil.d("DEVMGR_HiWearEngineIntelligentManager", " listenQueryScreenState ON ");
                mwe.a().l();
            }

            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwintelligentmgr.HiAiScreenListener.ScreenStateListener
            public void onScreenOff() {
                ReleaseLogUtil.d("DEVMGR_HiWearEngineIntelligentManager", " listenQueryScreenState OFF ");
            }

            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwintelligentmgr.HiAiScreenListener.ScreenStateListener
            public void onUserPresent() {
                ReleaseLogUtil.d("DEVMGR_HiWearEngineIntelligentManager", " listenQueryScreenState User press button ");
            }
        });
    }

    public void g() {
        ReleaseLogUtil.d("DEVMGR_HiWearEngineIntelligentManager", " unRegisterQueryScreenState enter mHiAiScreenListener ", this.f42572a);
        HiAiScreenListener hiAiScreenListener = this.f42572a;
        if (hiAiScreenListener != null) {
            hiAiScreenListener.b();
        }
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        ReleaseLogUtil.d("DEVMGR_HiWearEngineIntelligentManager", "onReceiveDeviceCommand errorCode ", Integer.valueOf(i));
        if (xiuVar != null) {
            byte[] bArrB = xiuVar.b();
            if (bArrB == null || bArrB.length <= 1) {
                ReleaseLogUtil.e("DEVMGR_HiWearEngineIntelligentManager", "data illegal");
                return;
            } else {
                a(bArrB);
                return;
            }
        }
        ReleaseLogUtil.e("DEVMGR_HiWearEngineIntelligentManager", "onReceiveDeviceCommand Message is null");
    }

    public void a(byte[] bArr) {
        if (bArr == null || bArr.length <= 1) {
            ReleaseLogUtil.e("DEVMGR_HiWearEngineIntelligentManager", "data illegal");
            return;
        }
        String strE = eeq.e(bArr);
        LogUtil.a("HiWearEngineIntelligentManager", "receiveMessageData info is ", strE);
        e(strE);
    }

    private void e(String str) {
        try {
            List<eew> listE = this.h.b(str).e();
            if (listE != null && !listE.isEmpty()) {
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                for (eew eewVar : listE) {
                    int iB = CommonUtil.b(eewVar.e(), 16);
                    String strB = eewVar.b();
                    if (iB == 2) {
                        if (!eeq.d(10000).equals(strB)) {
                            LogUtil.a("HiWearEngineIntelligentManager", "device vision = ", strB);
                        }
                    } else if (iB == 1) {
                        z = true;
                    } else if (iB != 3) {
                        LogUtil.j("HiWearEngineIntelligentManager", "handleSecondLevelMessageTlv type is ", Integer.valueOf(iB));
                    } else if (CommonUtil.v(strB) == 1) {
                        LogUtil.a("HiWearEngineIntelligentManager", "handleSecondLevelMessageTlv enter or out sleep");
                        z2 = true;
                    } else if (CommonUtil.v(strB) == 2) {
                        LogUtil.a("HiWearEngineIntelligentManager", "handleSecondLevelMessageTlv checkApp");
                        z3 = true;
                    } else {
                        LogUtil.j("HiWearEngineIntelligentManager", "handleSecondLevelMessageTlv value is ", strB);
                    }
                }
                if (z && z2) {
                    a();
                }
                if (z3) {
                    b();
                    return;
                }
                return;
            }
            ReleaseLogUtil.e("DEVMGR_HiWearEngineIntelligentManager", "handleBtProxyMessage tlv error");
        } catch (eeu unused) {
            ReleaseLogUtil.a("DEVMGR_HiWearEngineIntelligentManager", "handleBtProxyMessage error");
        }
    }

    public void a() {
        c();
        mwe.a().c(true);
        h();
    }

    public void b() {
        c();
        mwe.a().c(true);
        if (!mwe.a().k() || mwe.a().i()) {
            return;
        }
        ReleaseLogUtil.d("DEVMGR_HiWearEngineIntelligentManager", "handleCheckAppCommand is over one hour");
        h();
    }

    public void h() {
        ReleaseLogUtil.d("DEVMGR_HiWearEngineIntelligentManager", "startHiAiIntelligentSleepApi enter");
        if (i()) {
            boolean zD = ScreenUtil.d();
            ReleaseLogUtil.d("DEVMGR_HiWearEngineIntelligentManager", "startHiAiIntelligentSleepApi isScreenOn :", Boolean.valueOf(zD));
            if (zD) {
                this.f42573b.onResult(false, false, false, true, System.currentTimeMillis());
                return;
            } else if (!CommonUtil.av()) {
                this.f42573b.onResult(false, false, false, false, 0L);
                return;
            } else {
                f();
                return;
            }
        }
        if (CommonUtil.av()) {
            f();
        } else {
            ReleaseLogUtil.e("DEVMGR_HiWearEngineIntelligentManager", "startHiAiIntelligentSleepApi is not EMUI11.0");
        }
    }

    private void f() {
        HiAiIntelligentSleepApi hiAiIntelligentSleepApi = ddr.e().getHiAiIntelligentSleepApi();
        if (hiAiIntelligentSleepApi == null) {
            ReleaseLogUtil.e("DEVMGR_HiWearEngineIntelligentManager", "startHiAiIntelligentSleepApi mHiAiIntelligentSleepApi is null");
            this.f42573b.onResult(false, false, false, false, 0L);
            mge.c("recordSleep");
        } else {
            ReleaseLogUtil.d("DEVMGR_HiWearEngineIntelligentManager", "HiAI plugin exist");
            hiAiIntelligentSleepApi.startQuery(this.f42573b);
        }
    }

    private static boolean a(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HiWearEngineIntelligentManager", "isSupportCheckMobileLight deviceInfo is null");
            return false;
        }
        boolean zD = eey.d(deviceInfo, MachineControlPointResponse.OP_CODE_EXTENSION_SET_STEP_COUNT);
        ReleaseLogUtil.d("DEVMGR_HiWearEngineIntelligentManager", "isSupportCheckMobileLight: ", Boolean.valueOf(zD));
        return zD;
    }

    private static boolean i() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HiWearEngineIntelligentManager");
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.j("HiWearEngineIntelligentManager", "isSupportCheckMobileLight connectMainDevices is null or empty");
            return false;
        }
        return a(deviceList.get(0));
    }

    private byte[] c(boolean z, boolean z2, boolean z3, boolean z4, long j) {
        ReleaseLogUtil.d("DEVMGR_HiWearEngineIntelligentManager", "enter getNewPayLoadData 2.0");
        StringBuilder sb = new StringBuilder();
        sb.append(eeq.c(1L));
        sb.append(eeq.d(2));
        sb.append(eeq.d(1));
        sb.append(e(z));
        sb.append(eeq.d(3));
        sb.append(eeq.d(1));
        sb.append(e(z2));
        sb.append(eeq.d(4));
        sb.append(eeq.d(1));
        sb.append(e(z4));
        sb.append(eeq.d(5));
        sb.append(eeq.d(4));
        sb.append(eeq.c(j));
        if (i()) {
            sb.append(eeq.d(6));
            sb.append(eeq.d(1));
            sb.append(e(z3));
        }
        d(sb);
        String string = sb.toString();
        LogUtil.a("HiWearEngineIntelligentManager", "getNewPayLoadData mobileIsUseHexTlv :", string);
        return eeq.c(string);
    }

    private void d(StringBuilder sb) {
        mwj mwjVarJ = mwe.a().j();
        if (mwjVarJ.f() > 0) {
            mwg mwgVarB = mwe.a().b(mwjVarJ);
            if (!mwe.a().d(Math.max(Math.max(mwgVarB.e(), mwgVarB.c()), mwgVarB.j()))) {
                String str = eeq.d(mwgVarB.e()) + eeq.d(mwgVarB.c()) + eeq.d(mwgVarB.j());
                sb.append(eeq.d(7));
                sb.append(eeq.d(3));
                sb.append(str);
            }
        }
        f42571c.set(mwjVarJ);
        List<mwg> listD = mwe.a().d();
        List<mwg> listG = mwe.a().g();
        if (CollectionUtils.a(listD) || CollectionUtils.a(listG)) {
            LogUtil.a("HiWearEngineIntelligentManager", "assembleSleepSensorTLV one of the lists is empty, skip matching");
            return;
        }
        d(listD, listG);
        ArrayList<mwg> arrayList = new ArrayList();
        if (!CollectionUtils.a(listD)) {
            arrayList.addAll(listD);
        }
        if (!CollectionUtils.a(listG)) {
            arrayList.addAll(listG);
        }
        if (CollectionUtils.a(arrayList)) {
            return;
        }
        arrayList.sort(new Comparator() { // from class: mwq
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((mwg) obj2).b(), ((mwg) obj).b());
            }
        });
        LogUtil.a("HiWearEngineIntelligentManager", "enter getNewPayLoadData hiaiSleepRecordList size: ", Integer.valueOf(arrayList.size()));
        StringBuilder sb2 = new StringBuilder(16);
        for (mwg mwgVar : arrayList) {
            b(sb2, mwgVar);
            a(sb2, mwgVar);
        }
        sb.append(eeq.d(137));
        sb.append(eeq.b(sb2.toString().length() / 2));
        sb.append(sb2.toString());
        mwe.a().m();
        for (mwg mwgVar2 : arrayList) {
            if (mwgVar2.d() == 1) {
                mwe.a().a(mwgVar2.b(), 1);
            }
        }
    }

    public void d(List<mwg> list, List<mwg> list2) {
        if (CollectionUtils.a(list) || CollectionUtils.a(list2)) {
            return;
        }
        Set set = (Set) list.stream().map(new Function() { // from class: mwo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(((mwg) obj).b());
            }
        }).collect(Collectors.toSet());
        Set set2 = (Set) list2.stream().map(new Function() { // from class: mwo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(((mwg) obj).b());
            }
        }).collect(Collectors.toSet());
        final HashSet hashSet = new HashSet(set);
        hashSet.retainAll(set2);
        if (hashSet.isEmpty()) {
            list.clear();
            list2.clear();
        } else {
            list.removeIf(new Predicate() { // from class: mwr
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return mwk.a(hashSet, (mwg) obj);
                }
            });
            list2.removeIf(new Predicate() { // from class: mwp
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return mwk.e(hashSet, (mwg) obj);
                }
            });
        }
    }

    static /* synthetic */ boolean a(Set set, mwg mwgVar) {
        return !set.contains(Long.valueOf(mwgVar.b()));
    }

    static /* synthetic */ boolean e(Set set, mwg mwgVar) {
        return !set.contains(Long.valueOf(mwgVar.b()));
    }

    private void b(StringBuilder sb, mwg mwgVar) {
        LogUtil.a("HiWearEngineIntelligentManager", "getScreenAiSleepData enter");
        if (mwgVar.d() == 0) {
            LogUtil.j("HiWearEngineIntelligentManager", "getScreenAiSleepData Illegal data");
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(eeq.d(11));
        sb2.append(eeq.d(1));
        sb2.append(eeq.d(6));
        sb2.append(eeq.d(12));
        int iD = mwgVar.d();
        sb2.append(eeq.d(1));
        sb2.append(eeq.d(iD));
        sb2.append(eeq.d(13));
        long jB = mwgVar.b();
        sb2.append(eeq.d(4));
        sb2.append(eeq.c(jB));
        sb.append(eeq.d(138));
        sb.append(eeq.d(sb2.toString().length() / 2));
        sb.append(sb2.toString());
    }

    private void a(StringBuilder sb, mwg mwgVar) {
        LogUtil.a("HiWearEngineIntelligentManager", "getSensorAiSleepData enter");
        if (mwgVar == null || mwe.a().d(mwgVar.a())) {
            LogUtil.j("HiWearEngineIntelligentManager", "getSensorAiSleepData Illegal data");
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(eeq.d(11));
        sb2.append(eeq.d(1));
        sb2.append(eeq.d(7));
        sb2.append(eeq.d(12));
        String str = eeq.d(mwgVar.e()) + eeq.d(mwgVar.c()) + eeq.d(mwgVar.j());
        sb2.append(eeq.d(str.length() / 2));
        sb2.append(str);
        sb2.append(eeq.d(13));
        long jB = mwgVar.b();
        sb2.append(eeq.d(4));
        sb2.append(eeq.c(jB));
        sb.append(eeq.d(138));
        sb.append(eeq.d(sb2.toString().length() / 2));
        sb.append(sb2.toString());
    }

    private byte[] e(boolean z, boolean z2, boolean z3, boolean z4, long j) {
        ReleaseLogUtil.d("DEVMGR_HiWearEngineIntelligentManager", "enter getPayLoadData 1.0");
        String str = eeq.c(1L) + eeq.d(2) + eeq.d(1) + e(z) + eeq.d(3) + eeq.d(1) + e(z2) + eeq.d(4) + eeq.d(1) + e(z4) + eeq.d(5) + eeq.d(4) + eeq.c(j);
        if (i()) {
            str = str + eeq.d(6) + eeq.d(1) + e(z3);
        }
        LogUtil.a("HiWearEngineIntelligentManager", "getPayLoadData mobileIsUseHexTlv :", str);
        return eeq.c(str);
    }

    private String e(boolean z) {
        return eeq.d(z ? 1 : 0);
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.INTELLIGENT_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "hw.watch.health.p2p";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return OfflineMapWearEngineManager.WEAR_FINGERPRINT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, boolean z2, boolean z3, boolean z4, long j) {
        xiu.c cVar = new xiu.c();
        try {
            boolean zC = mwi.a().c();
            LogUtil.a("HiWearEngineIntelligentManager", "sendCommandToDevice isSupportNewVersion: ", Boolean.valueOf(zC));
            if (zC) {
                f42571c.set(null);
                cVar.a(c(z, z2, z4, z3, j));
            } else {
                cVar.a(e(z, z2, z4, z3, j));
            }
        } catch (yin unused) {
            ReleaseLogUtil.a("DEVMGR_HiWearEngineIntelligentManager", "sendMessage WearEngineException");
        }
        sendComand(cVar.c(), this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        HashMap map = new HashMap(16);
        map.put("status", Integer.valueOf(i));
        String strValue = AnalyticsValue.INTELLIGENT_AWARENESS_STATUS_21300037.value();
        lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
        LogUtil.a("HiWearEngineIntelligentManager", "BI intelligent phone status click event finish, value: ", strValue, ", typeMap: ", map.toString());
    }
}
