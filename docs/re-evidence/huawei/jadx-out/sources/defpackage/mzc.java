package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.common.util.GmsVersion;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class mzc extends EngineLogicBaseManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42728a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f42729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42730c;
    private IBaseResponseCallback d;
    private DeviceInfo e;
    private AtomicInteger f;
    private List<Integer> g;
    private List<mvi> h;
    private boolean i;
    private List<mva> j;
    private ExtendHandler k;
    private eet m;
    private long n;
    private long o;

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
    }

    class e implements Handler.Callback {
        private e() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            LogUtil.j("DataDictionarySyncManager", "SyncMgsHandler handleMessage msg: ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                mzc.this.k.removeMessages(1);
                mzc mzcVar = mzc.this;
                mzcVar.a(mzcVar.c());
                return true;
            }
            if (i == 3) {
                mzc.this.e();
                return true;
            }
            if (i == 4) {
                mzc.this.g();
                return true;
            }
            LogUtil.j("DataDictionarySyncManager", "SyncMgsHandler default");
            return false;
        }
    }

    protected mzc(Context context) {
        super(context);
        this.m = new eet();
        this.i = false;
        this.f42730c = false;
        this.o = 0L;
        this.n = 0L;
        this.g = new CopyOnWriteArrayList();
        this.h = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.f42729b = new e();
        this.f = new AtomicInteger(0);
        this.k = HandlerCenter.b(this.f42729b, "DataDictionarySyncManager");
    }

    public void e(DeviceInfo deviceInfo, mzh mzhVar, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("DataDictionarySyncManager", "initSyncData callback is null");
            return;
        }
        if (deviceInfo == null) {
            LogUtil.j("DataDictionarySyncManager", "initSyncData deviceInfo is null");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        if (deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("DataDictionarySyncManager", "initSyncData device is not connected");
            iBaseResponseCallback.a(-1, null);
        }
        if (this.i) {
            return;
        }
        this.g.clear();
        if (mzhVar == null) {
            return;
        }
        this.f.set(0);
        int iA = mzhVar.a();
        LogUtil.a("DataDictionarySyncManager", "initSyncData deviceInfo:", CommonUtil.n(deviceInfo.getDeviceIdentify()), " syncType:", Integer.valueOf(iA));
        mvc.d();
        if (iA == -1) {
            a(deviceInfo);
            this.f42730c = false;
        } else {
            e(deviceInfo, mzhVar);
            this.f42730c = true;
        }
        for (Integer num : this.g) {
            num.intValue();
            LogUtil.a("DataDictionarySyncManager", "to be synchronized:", num);
        }
        if (this.g.size() == 0) {
            iBaseResponseCallback.a(0, null);
            return;
        }
        this.e = deviceInfo;
        LogUtil.a("DataDictionarySyncManager", "initSyncData id:", this.g.get(0));
        c(iBaseResponseCallback);
    }

    private void a(DeviceInfo deviceInfo) {
        for (Map.Entry<Integer, Integer> entry : mvc.c().entrySet()) {
            Integer value = entry.getValue();
            if (eey.d(deviceInfo, value.intValue())) {
                this.g.add(entry.getKey());
            } else {
                LogUtil.a("DataDictionarySyncManager", "initSyncData capability:", value, " not support");
            }
        }
    }

    private void e(DeviceInfo deviceInfo, mzh mzhVar) {
        Iterator<mvh> it = mzhVar.c().iterator();
        while (it.hasNext()) {
            int iB = it.next().b();
            LogUtil.a("DataDictionarySyncManager", "addSingleSyncList dictTypeId:", Integer.valueOf(iB));
            int iD = mvc.d(iB);
            if (eey.d(deviceInfo, iD)) {
                this.g.add(Integer.valueOf(iB));
            } else {
                LogUtil.a("DataDictionarySyncManager", "initSyncData capability:", Integer.valueOf(iD), " not support");
            }
        }
    }

    public static mzc d() {
        return b.f42736c;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        byte[] bArrB = xiuVar.b();
        cpl.d("DataDictionarySyncManager", bArrB, "start ");
        if (bArrB == null) {
            return;
        }
        byte b2 = bArrB[0];
        if (b2 == 1) {
            LogUtil.a("DataDictionarySyncManager", "tlv ");
            a(bArrB, deviceInfo);
        } else if (b2 == 2) {
            LogUtil.a("DataDictionarySyncManager", "Json ");
        } else if (b2 == 3) {
            LogUtil.a("DataDictionarySyncManager", "PB ");
        } else {
            a(bArrB, deviceInfo);
        }
    }

    private void a(byte[] bArr, DeviceInfo deviceInfo) {
        String strSubstring = eeq.e(bArr).substring(2);
        if (TextUtils.isEmpty(strSubstring) || strSubstring.length() <= 4) {
            return;
        }
        LogUtil.a("DataDictionarySyncManager", "TLV:", strSubstring);
        try {
            ees eesVarB = this.m.b(strSubstring);
            List<eew> listE = eesVarB.e();
            if (listE != null && listE.size() >= 2) {
                d(CommonUtil.v(listE.get(0).e()), listE.get(0).b(), eesVarB, deviceInfo);
                if (CommonUtil.ap()) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.n;
                    lng.c("DataSyncSpeed", "Point DataDict dataSize: " + bArr.length + ", duration: " + jCurrentTimeMillis + ", transferSpeed: " + ((((double) bArr.length) * 1.0d) / (jCurrentTimeMillis * 1024)));
                }
            }
        } catch (eeu unused) {
            LogUtil.e("DataDictionarySyncManager", "processTlvData TlvException");
            xjt.n("processTlvData TlvException");
        }
    }

    private void d(int i, String str, ees eesVar, DeviceInfo deviceInfo) {
        if (i == 1) {
            if (CommonUtil.v(str) == 1) {
                mva mvaVar = (mva) e(1, eesVar);
                if (mvaVar == null) {
                    return;
                }
                mvaVar.e(deviceInfo);
                d(mvaVar);
                return;
            }
            LogUtil.j("DataDictionarySyncManager", "processTlvData unrecognized message type");
            xjt.n("processTlvData unrecognized message type");
        }
    }

    private void d(mva mvaVar) {
        LogUtil.j("DataDictionarySyncManager", "processDataSync enter");
        if (a(mvaVar)) {
            d(true, mvaVar);
        } else {
            if (b(mvaVar)) {
                return;
            }
            c(mvaVar);
        }
    }

    private boolean b(mva mvaVar) {
        boolean z;
        Iterator<mva> it = this.j.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            mva next = it.next();
            if (next.c() != null && next.c().get(0) != null) {
                if (next.a() == mvaVar.a() && next.c().get(0).c() == mvaVar.c().get(0).c()) {
                    if (mvaVar.a() == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA.value()) {
                        if (next.c().get(0).e() == mvaVar.c().get(0).e()) {
                            LogUtil.j("DataDictionarySyncManager", "checkRepeatMsg Cache and real-time data are equal.");
                        }
                    }
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            this.j.add(mvaVar);
            f();
        }
        return z;
    }

    private boolean a(mva mvaVar) {
        if (mvaVar == null) {
            return true;
        }
        if (mvaVar.a() != -1) {
            return mvaVar.c() == null || mvaVar.c().size() <= 0;
        }
        LogUtil.a("DataDictionarySyncManager", "parsePointData data is null or valid");
        return true;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.DATA_DICTIONARY_SYNC_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "hw.watch.health.filesync";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return OfflineMapWearEngineManager.WEAR_FINGERPRINT;
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        if (this.i) {
            return;
        }
        this.d = iBaseResponseCallback;
        this.i = true;
        synchronized (f42728a) {
            this.h.clear();
        }
        this.k.sendEmptyMessage(4);
    }

    private void e(int i, long j, long j2) {
        ReleaseLogUtil.d("R_DataDictionarySyncManager", "syncData startTime:", Long.valueOf(j), ",endTime:", Long.valueOf(j2), " ,digitTypeId: ", Integer.valueOf(i));
        if (j > j2) {
            ReleaseLogUtil.e("R_DataDictionarySyncManager", "syncData cancel,valid time");
            h();
            e();
        } else {
            mvi mviVar = (mvi) e(4, Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2));
            if (mviVar == null) {
                return;
            }
            b(mviVar);
        }
    }

    private void b(mvi mviVar) {
        synchronized (f42728a) {
            this.h.add(mviVar);
        }
        c(mviVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        pingComand(new PingCallback() { // from class: mzc.2
            @Override // com.huawei.health.deviceconnect.callback.PingCallback
            public void onPingResult(int i) {
                LogUtil.a("DataDictionarySyncManager", "pingDevice onPingResult:", Integer.valueOf(i));
            }
        }, getWearPkgName());
        this.k.sendEmptyMessage(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        int iB = b();
        if (iB == -1) {
            DeviceInfo deviceInfo = this.e;
            LogUtil.j("DataDictionarySyncManager", "syncId is invalid, No data needs to be synchronized:", deviceInfo != null ? deviceInfo.getDeviceName() : "");
            if (CommonUtil.ap()) {
                lng.c("DataSyncSpeed", "Point Data-Dict sync duration: " + (System.currentTimeMillis() - this.o));
            }
            i();
            IBaseResponseCallback iBaseResponseCallback = this.d;
            this.d = null;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, null);
                return;
            } else {
                ReleaseLogUtil.e("R_DataDictionarySyncManager", "callback is null.");
                return;
            }
        }
        d(iB);
    }

    private void c(mvi mviVar) {
        if (mviVar == null) {
            return;
        }
        if (!j()) {
            h();
            e();
            return;
        }
        LogUtil.a("DataDictionarySyncManager", " send command start ");
        xiu xiuVar = (xiu) e(7, mviVar);
        if (xiuVar == null) {
            return;
        }
        if (CommonUtil.ap()) {
            this.n = System.currentTimeMillis();
        }
        sendComand(xiuVar, new SendCallback() { // from class: mzc.4
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                LogUtil.a("DataDictionarySyncManager", "sendCommand onSendResult:", Integer.valueOf(i));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a("DataDictionarySyncManager", "sendCommand onSendProgress", Long.valueOf(j));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a("DataDictionarySyncManager", "sendComand onFileTransferReport transferWay: ", str);
            }
        });
    }

    private boolean j() {
        if (a() <= 0) {
            LogUtil.a("DataDictionarySyncManager", "startSyncData retry count is 0");
            return false;
        }
        ExtendHandler extendHandler = this.k;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(1, 10000L);
        }
        return true;
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static mzc f42736c = new mzc(BaseApplication.getContext());
    }

    private void c(final mva mvaVar) {
        LogUtil.a("DataDictionarySyncManager", "enter processSaveToHiHealth");
        e(3, mvaVar, new HiDataOperateListener() { // from class: mzc.1
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                ReleaseLogUtil.d("R_DataDictionarySyncManager", "saveDataToHiHealth onResult type:", Integer.valueOf(i));
                if (i == 0) {
                    if (!mvs.d(mzc.this.f42730c) || mvaVar.a() != DicDataTypeUtil.DataType.ACTIVE_HOUR.value()) {
                        mzc.this.i(mvaVar);
                    } else {
                        mzc.this.c(mvaVar.a());
                    }
                    mzc.this.h(mvaVar);
                    mzc mzcVar = mzc.this;
                    Boolean bool = (Boolean) mzcVar.e(6, mvaVar, mzcVar.c());
                    if (bool == null) {
                        return;
                    }
                    if (!bool.booleanValue() && mzc.this.f.incrementAndGet() >= 3) {
                        mja.b();
                        mzc.this.f.set(0);
                    }
                    mzc.this.d(bool.booleanValue(), mvaVar);
                    return;
                }
                LogUtil.j("DataDictionarySyncManager", "processInsertToHiHealth error:", Integer.valueOf(i));
                mzc.this.d(true, mvaVar);
            }
        });
        LogUtil.a("DataDictionarySyncManager", "insertDicData healthData:", Integer.valueOf(mvaVar.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(mva mvaVar) {
        LogUtil.a("DataDictionarySyncManager", "syncCloud mIsSampleEvent: ", Boolean.valueOf(this.f42730c));
        if (this.f42730c && this.g.size() == 1) {
            b(mvaVar.a());
        } else {
            if (eey.d(mvaVar.e(), 127) || mvaVar.a() != DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value()) {
                return;
            }
            LogUtil.a("DataDictionarySyncManager", "old device bloodPressure SyncCloud");
            b(mvaVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(final int i) {
        final String strD = DfxUtils.d(Thread.currentThread(), null);
        ThreadPoolManager.c().execute(new Runnable() { // from class: mzc.5
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("DataDictionarySyncManager", "syncCloud start");
                HiSyncOption hiSyncOption = new HiSyncOption();
                hiSyncOption.setSyncModel(2);
                hiSyncOption.setSyncAction(0);
                hiSyncOption.setSyncDataType(20000);
                hiSyncOption.setSyncMethod(2);
                hiSyncOption.setSyncScope(1);
                hiSyncOption.setStackTrace(strD);
                HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
                LogUtil.a("DataDictionarySyncManager", "syncCloud end");
                if (CommonUtil.ap()) {
                    mzc.this.e(hiSyncOption, i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final int i) {
        HandlerCenter.a().d(new Runnable() { // from class: mze
            @Override // java.lang.Runnable
            public final void run() {
                this.f42741a.b(i);
            }
        }, mvs.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HiSyncOption hiSyncOption, int i) {
        String hiLinkDeviceId;
        DeviceInfo deviceInfo = this.e;
        if (deviceInfo == null) {
            hiLinkDeviceId = "";
        } else {
            hiLinkDeviceId = deviceInfo.getHiLinkDeviceId();
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("dev_manufacturer", Build.MANUFACTURER);
        linkedHashMap.put("sync_minute", String.valueOf(lsl.n(System.currentTimeMillis())));
        linkedHashMap.put(CrashHianalyticsData.STACK_TRACE, hiSyncOption.getStackTrace());
        linkedHashMap.put("dataType", String.valueOf(hiSyncOption.getSyncDataType()));
        linkedHashMap.put("hiLinkDeviceId", String.valueOf(hiLinkDeviceId));
        linkedHashMap.put("dictType", String.valueOf(i));
        LogUtil.a("DataDictionarySyncManager", "setSyncBi biMap: " + linkedHashMap);
        OpAnalyticsUtil.getInstance().setEvent(OperationKey.HEALTH_APP_SYNC_CLOUD_TRIGGERED_2129029.value(), linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(mva mvaVar) {
        if (mvaVar == null || mvaVar.c() == null || mvaVar.c().isEmpty()) {
            return;
        }
        mvb mvbVar = mvaVar.c().get(mvaVar.c().size() - 1);
        long jD = mvs.d(mvaVar.e().getDeviceIdentify(), mvaVar.a(), GmsVersion.VERSION_LONGHORN, "DataDictionarySyncManager");
        if (mvbVar.d() > jD) {
            mvs.c(mvaVar.e().getDeviceIdentify(), mvaVar.a(), mvbVar.d(), GmsVersion.VERSION_LONGHORN, "DataDictionarySyncManager");
        } else if (mvbVar.d() != 0 || mvbVar.c() <= jD) {
            LogUtil.j("DataDictionarySyncManager", "Point Sync Do not save any time");
        } else {
            mvs.c(mvaVar.e().getDeviceIdentify(), mvaVar.a(), mvbVar.c(), GmsVersion.VERSION_LONGHORN, "DataDictionarySyncManager");
        }
        if (mvbVar.e() == 0) {
            return;
        }
        mvs.c(mvaVar.e().getDeviceIdentify(), mvaVar.a(), mvbVar.e(), 4000000, "DataDictionarySyncManager");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z, mva mvaVar) {
        LogUtil.a("DataDictionarySyncManager", "enter processNextData isFinish:", Boolean.valueOf(z));
        if (z) {
            if (this.g.contains(Integer.valueOf(mvaVar.a()))) {
                this.f.set(0);
                h();
            } else {
                ReleaseLogUtil.d("R_DataDictionarySyncManager", "processNextData DictionaryInfo DigitTypeId Not in the current queue");
            }
            e();
            return;
        }
        g(mvaVar);
        c(c());
    }

    private int b() {
        Optional<Integer> optionalFindFirst = this.g.stream().findFirst();
        int iIntValue = optionalFindFirst.isPresent() ? optionalFindFirst.get().intValue() : -1;
        ReleaseLogUtil.d("R_DataDictionarySyncManager", "checkSyncDataIdList validId:", Integer.valueOf(iIntValue));
        return iIntValue;
    }

    private int a() {
        mvi mviVarC = c();
        if (mviVarC == null) {
            return -1;
        }
        return mviVarC.e();
    }

    private void d(final int i) {
        LogUtil.a("DataDictionarySyncManager", "processReadHiHealth readHiHeathList digitTypeId:", Integer.valueOf(i));
        mja.b();
        e(2, Integer.valueOf(i), this.e, new HiDataReadResultListener() { // from class: mzc.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                LogUtil.a("DataDictionarySyncManager", "onResult errorCode:", Integer.valueOf(i2), ", object:", obj);
                if (obj == null) {
                    LogUtil.j("DataDictionarySyncManager", "object is null");
                    mzc.this.h();
                    mzc.this.e();
                    return;
                }
                LogUtil.a("DataDictionarySyncManager", "appendToExistData onResult() object:", obj);
                if (obj instanceof SparseArray) {
                    SparseArray sparseArray = (SparseArray) obj;
                    if (sparseArray.size() > 0) {
                        mzc.this.e(i, (SparseArray<HiHealthData>) sparseArray);
                        return;
                    } else {
                        LogUtil.j("DataDictionarySyncManager", "sparseArray size is zero");
                        mzc.this.e(i, (SparseArray<HiHealthData>) sparseArray);
                        return;
                    }
                }
                LogUtil.j("DataDictionarySyncManager", "sparseArray !instanceof");
                mzc.this.e(i, (SparseArray<HiHealthData>) null);
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
                LogUtil.a("DataDictionarySyncManager", "onResultIntent intentType:", Integer.valueOf(i2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, SparseArray<HiHealthData> sparseArray) {
        long jMax;
        long jD = mvs.d(this.e.getDeviceIdentify(), i, 4000000, "DataDictionarySyncManager");
        long jD2 = mvs.d(this.e.getDeviceIdentify(), i, GmsVersion.VERSION_LONGHORN, "DataDictionarySyncManager");
        LogUtil.a("DataDictionarySyncManager", "processReadHiHealthData modifyTime:", Long.valueOf(jD), " ,pointEndTime:", Long.valueOf(jD2));
        long jMax2 = Math.max(jD, jD2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (sparseArray == null) {
            LogUtil.j("DataDictionarySyncManager", "processReadHiHealthData readHiHeathList is null");
            e(i, jMax2 != 0 ? jMax2 + 1000 : 0L, jCurrentTimeMillis);
            return;
        }
        if (sparseArray.size() == 0) {
            LogUtil.j("DataDictionarySyncManager", "processReadData readData is empty");
            e(i, jMax2 != 0 ? jMax2 + 1000 : 0L, jCurrentTimeMillis);
            return;
        }
        Parcelable parcelable = sparseArray.get(i);
        if (parcelable instanceof List) {
            List list = (List) parcelable;
            mvs.c(i, list);
            HiHealthData hiHealthData = (HiHealthData) list.get(list.size() - 1);
            if (i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA.value()) {
                jMax = Math.max(jMax2, hiHealthData.getStartTime());
            } else {
                jMax = Math.max(jMax2, hiHealthData.getEndTime());
            }
            e(i, jMax + 1000, jCurrentTimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(mvi mviVar) {
        mvi mviVarC = c();
        if (mviVarC != null) {
            mviVarC.a(mviVarC.e() - 1);
        }
        c(mviVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (f42728a) {
            List<Integer> list = this.g;
            if (list != null && !list.isEmpty()) {
                list.remove(0);
                List<mvi> list2 = this.h;
                if (list2.isEmpty()) {
                    return;
                }
                list2.clear();
                this.j.clear();
                f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public mvi c() {
        synchronized (f42728a) {
            ArrayList arrayList = new ArrayList(this.h);
            if (arrayList.isEmpty()) {
                return null;
            }
            LogUtil.a("DataDictionarySyncManager", "getCacheInfo mSyncDataIdList:", Integer.valueOf(arrayList.size()), ",mSyncCacheList:", this.h);
            return (mvi) arrayList.get(0);
        }
    }

    private void g(mva mvaVar) {
        long jE = e(mvaVar);
        synchronized (f42728a) {
            if (this.h.isEmpty()) {
                return;
            }
            LogUtil.a("DataDictionarySyncManager", "updateCacheInfo nextStartTime:", Long.valueOf(jE));
            this.h.get(0).d(jE + 1000);
            this.h.get(0).a(3);
        }
    }

    private long e(mva mvaVar) {
        if (mvaVar != null && mvaVar.c() != null) {
            mvb mvbVar = mvaVar.c().get(mvaVar.c().size() - 1);
            if (mvbVar != null) {
                long jD = mvbVar.d();
                if (jD == 0) {
                    jD = mvbVar.c();
                }
                long jE = mvbVar.e();
                if (jE != 0) {
                    LogUtil.a("DataDictionarySyncManager", "exist modifyTime:", Long.valueOf(jE));
                    jD = Math.max(jD, jE);
                }
                LogUtil.a("DataDictionarySyncManager", "getLastTimeFromData lastTime:", Long.valueOf(jD));
                return jD;
            }
        }
        return 0L;
    }

    private void f() {
        if (this.k == null) {
            return;
        }
        LogUtil.j("DataDictionarySyncManager", "removeRetryMsg");
        this.k.removeTasksAndMessages();
    }

    private void i() {
        this.i = false;
        this.j.clear();
    }

    public void a(long j) {
        this.o = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T e(int i, Object... objArr) {
        return (T) mvp.a().execute(i, objArr);
    }
}
