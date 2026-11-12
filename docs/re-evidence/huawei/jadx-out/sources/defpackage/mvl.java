package defpackage;

import android.content.Intent;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.SparseArray;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.constant.TransferFileReqType;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class mvl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42506a = new Object();
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceInfo f42507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42508c;
    private ITransferSleepAndDFXFileCallback.Stub d;
    private IBaseResponseCallback f;
    private boolean g;
    private boolean h;
    private IBaseResponseCallback i;
    private List<mvf> j;
    private mzh l;
    private long n;
    private List<Integer> o;

    private mvl() {
        this.f42508c = false;
        this.n = 0L;
        this.o = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.f = null;
        this.i = null;
        this.g = false;
        this.h = false;
        this.d = new ITransferSleepAndDFXFileCallback.Stub() { // from class: mvl.5
            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i, String str) throws RemoteException {
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i, String str, String str2) throws RemoteException {
                mvl.this.h = false;
                ReleaseLogUtil.d("R_DataDictionarySequenceManager", "onSuccess errorCode: ", Integer.valueOf(i));
                mvl.this.d(str);
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i, String str) throws RemoteException {
                ReleaseLogUtil.e("R_DataDictionarySequenceManager", "onFailure errorCode:", Integer.valueOf(i));
                mvl.this.e(i);
            }
        };
        eda.e(Integer.valueOf(DicDataTypeUtil.DataType.THIRD_WORKOUT_DETAILS.value()), new mvr());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        LogUtil.a("DataDictionarySequenceManager", "processReceiverData path: ", str);
        mvg mvgVar = (mvg) b(5, str);
        if (mvgVar == null) {
            c();
        } else {
            a(mvgVar);
        }
    }

    private void a(mvg mvgVar) {
        LogUtil.j("DataDictionarySequenceManager", "processDataSync enter");
        if (c(mvgVar)) {
            e(true, mvgVar);
        } else {
            mvgVar.a(this.f42507b);
            b(mvgVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z, mvg mvgVar) {
        LogUtil.a("DataDictionarySequenceManager", "enter processNextData isFinish:", Boolean.valueOf(z));
        if (z) {
            if (this.o.contains(Integer.valueOf(mvgVar.d()))) {
                d();
            } else {
                LogUtil.a("DataDictionarySequenceManager", "processNextData sequenceFileData DigitTypeId Not in the current queue");
            }
            c();
            return;
        }
        j(mvgVar);
        a(a());
    }

    private void b(final mvg mvgVar) {
        LogUtil.a("DataDictionarySequenceManager", "enter processSaveToHiHealth");
        b(3, mvgVar, new HiDataOperateListener() { // from class: mvl.2
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                ReleaseLogUtil.d("R_DataDictionarySequenceManager", "saveDataToHiHealth onResult type:", Integer.valueOf(i), " sequenceFileDictTypeId.: ", Integer.valueOf(mvgVar.d()));
                if (mvgVar.d() == DicDataTypeUtil.DataType.SLEEP_DETAILS.value()) {
                    mvl.this.e(i, mvgVar);
                    return;
                }
                if (i == 0) {
                    mvl.this.j();
                    mvl.this.e(mvgVar);
                    mvl mvlVar = mvl.this;
                    Boolean bool = (Boolean) mvlVar.b(6, mvgVar, mvlVar.a());
                    if (bool == null) {
                        return;
                    }
                    mvl.this.e(bool.booleanValue(), mvgVar);
                    return;
                }
                LogUtil.j("DataDictionarySequenceManager", "processInsertToHiHealth error:", Integer.valueOf(i));
                mvl.this.e(true, mvgVar);
            }
        });
        LogUtil.a("DataDictionarySequenceManager", "insertDicData healthData:", Integer.valueOf(mvgVar.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, mvg mvgVar) {
        if (i == 0) {
            j();
            if (this.l.a() == 2) {
                int i2 = i(mvgVar);
                LogUtil.a("DataDictionarySequenceManager", "onResult lastDataTime:", Integer.valueOf(i2));
                if (i2 != 0) {
                    Intent intent = new Intent();
                    intent.setAction("com.huawei.health.action.EVENT_NOFITY_SLEEP_SYNC");
                    intent.putExtra("lastDataTime", i2);
                    BroadcastManagerUtil.a(BaseApplication.getContext(), intent, LocalBroadcast.f36595c, true);
                }
            } else {
                e(mvgVar);
            }
        }
        d();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("DataDictionarySequenceManager", "syncCloudProcess mIsSampleEvent: ", Boolean.valueOf(this.g));
        if (this.g) {
            final String strD = DfxUtils.d(Thread.currentThread(), null);
            ThreadPoolManager.c().execute(new Runnable() { // from class: mvl.4
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("DataDictionarySequenceManager", "syncCloud start");
                    HiSyncOption hiSyncOption = new HiSyncOption();
                    hiSyncOption.setSyncModel(2);
                    hiSyncOption.setSyncAction(0);
                    hiSyncOption.setSyncDataType(20000);
                    hiSyncOption.setSyncMethod(2);
                    hiSyncOption.setSyncScope(1);
                    hiSyncOption.setStackTrace(strD);
                    HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
                    LogUtil.a("DataDictionarySequenceManager", "syncCloud end");
                }
            });
        }
    }

    private void a(int i, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(i, null);
        }
    }

    private int i(mvg mvgVar) {
        if (mvgVar == null || mvgVar.b() == null || mvgVar.b().isEmpty()) {
            return 0;
        }
        mvj mvjVar = mvgVar.b().get(mvgVar.b().size() - 1);
        if (mvjVar.c() == 0) {
            return 0;
        }
        if (mvjVar.c() <= mvs.d(this.f42507b.getDeviceIdentify(), mvgVar.d(), 4000000, "DataDictionarySequenceManager")) {
            return 0;
        }
        mvs.c(mvgVar.a().getDeviceIdentify(), mvgVar.d(), mvjVar.c(), 4000000, "DataDictionarySequenceManager");
        return mvjVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(mvg mvgVar) {
        if (mvgVar == null || mvgVar.b() == null || mvgVar.b().isEmpty()) {
            return;
        }
        mvj mvjVar = mvgVar.b().get(mvgVar.b().size() - 1);
        if (mvjVar.c() == 0) {
            return;
        }
        if (mvjVar.c() > mvs.d(this.f42507b.getDeviceIdentify(), mvgVar.d(), 4000000, "DataDictionarySequenceManager")) {
            mvs.c(mvgVar.a().getDeviceIdentify(), mvgVar.d(), mvjVar.c(), 4000000, "DataDictionarySequenceManager");
        }
    }

    public void d(DeviceInfo deviceInfo, mzh mzhVar, IBaseResponseCallback iBaseResponseCallback, IBaseResponseCallback iBaseResponseCallback2) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("DataDictionarySequenceManager", "startSequenceFileTask callback is null");
            return;
        }
        if (deviceInfo != null && deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("DataDictionarySequenceManager", "startSequenceFileTask device is not connected");
            a(-1, iBaseResponseCallback2);
            iBaseResponseCallback.a(-1, null);
        }
        if (this.f42508c) {
            LogUtil.j("DataDictionarySequenceManager", "startSequenceFileTask is DetailSyncing");
            return;
        }
        Object obj = e;
        synchronized (obj) {
            this.o.clear();
        }
        synchronized (f42506a) {
            this.j.clear();
        }
        if (mzhVar == null) {
            return;
        }
        int iA = mzhVar.a();
        LogUtil.a("DataDictionarySequenceManager", "initSyncData deviceInfo:", CommonUtil.n(deviceInfo.getDeviceIdentify()), " syncType:", Integer.valueOf(iA));
        mvd.c();
        if (iA == -1) {
            c(deviceInfo);
            this.g = false;
        } else {
            this.g = true;
            b(deviceInfo, mzhVar);
        }
        synchronized (obj) {
            for (Integer num : this.o) {
                num.intValue();
                LogUtil.a("DataDictionarySequenceManager", "to be synchronized:", num);
            }
            if (this.o.size() == 0) {
                a(0, iBaseResponseCallback2);
                iBaseResponseCallback.a(0, null);
                return;
            }
            this.f = iBaseResponseCallback;
            this.i = iBaseResponseCallback2;
            this.f42507b = deviceInfo;
            this.l = mzhVar;
            c();
        }
    }

    private void c(DeviceInfo deviceInfo) {
        for (Map.Entry<Integer, Integer> entry : mvd.a().entrySet()) {
            Integer value = entry.getValue();
            if (eey.d(deviceInfo, value.intValue())) {
                synchronized (e) {
                    this.o.add(entry.getKey());
                }
            } else {
                LogUtil.a("DataDictionarySequenceManager", "initSyncData capability:", value, " not support");
            }
        }
    }

    private void b(DeviceInfo deviceInfo, mzh mzhVar) {
        Iterator<mvh> it = mzhVar.c().iterator();
        while (it.hasNext()) {
            int iB = it.next().b();
            int iD = mvd.d(iB);
            if (eey.d(deviceInfo, iD)) {
                synchronized (e) {
                    this.o.add(Integer.valueOf(iB));
                }
            } else {
                LogUtil.a("DataDictionarySequenceManager", "initSyncData capability:", Integer.valueOf(iD), " not support");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        int iB = b();
        if (iB == -1) {
            LogUtil.j("DataDictionarySequenceManager", "syncId is invalid, No data needs to be synchronized");
            if (CommonUtil.ap()) {
                lng.c("DataSyncSpeed", "Sequence data-dict sync duration: " + (System.currentTimeMillis() - this.n));
            }
            h();
            IBaseResponseCallback iBaseResponseCallback = this.f;
            this.f = null;
            if (iBaseResponseCallback != null) {
                a(0, this.i);
                iBaseResponseCallback.a(0, null);
                return;
            } else {
                ReleaseLogUtil.e("R_DataDictionarySequenceManager", "callback is null.");
                xjt.n("DataDictionarySequenceManagercallback is null.");
                return;
            }
        }
        if (iB == DicDataTypeUtil.DataType.SLEEP_DETAILS.value() && this.l.a() == 1) {
            this.h = true;
            if (this.l.e() < 0) {
                c();
                return;
            }
            mvf mvfVar = new mvf();
            mvfVar.e(iB);
            mvfVar.d(this.l.d());
            mvfVar.b(this.l.e());
            a(mvfVar);
            return;
        }
        c(iB);
    }

    private void c(final int i) {
        mja.b();
        b(2, Integer.valueOf(i), this.f42507b, new HiDataReadResultListener() { // from class: mvl.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                LogUtil.a("DataDictionarySequenceManager", "onResult errorCode:", Integer.valueOf(i2), ", object:", obj);
                if (obj == null) {
                    LogUtil.j("DataDictionarySequenceManager", "object is null");
                    mvl.this.d();
                    mvl.this.c();
                } else {
                    if (obj instanceof SparseArray) {
                        SparseArray sparseArray = (SparseArray) obj;
                        if (sparseArray.size() > 0) {
                            mvl.this.d(i, (SparseArray<HiHealthData>) sparseArray);
                            return;
                        } else {
                            LogUtil.j("DataDictionarySequenceManager", "sparseArray size is zero");
                            mvl.this.d(i, (SparseArray<HiHealthData>) sparseArray);
                            return;
                        }
                    }
                    LogUtil.j("DataDictionarySequenceManager", "sparseArray !instanceof");
                    mvl.this.d(i, (SparseArray<HiHealthData>) null);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
                LogUtil.a("DataDictionarySequenceManager", "onResultIntent intentType:", Integer.valueOf(i2), ", object:", obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, SparseArray<HiHealthData> sparseArray) {
        long jD = mvs.d(this.f42507b.getDeviceIdentify(), i, 4000000, "DataDictionarySequenceManager");
        long j = jD * 1000;
        LogUtil.a("DataDictionarySequenceManager", "processReadHiHealthData modifyTime:", Long.valueOf(jD), " ,statTime: ", Long.valueOf(j));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (sparseArray == null) {
            LogUtil.j("DataDictionarySequenceManager", "processReadHiHealthData readHiHeathList is null");
            b(i, j == 0 ? 0L : j + 1000, jCurrentTimeMillis);
        } else {
            if (sparseArray.size() == 0) {
                LogUtil.j("DataDictionarySequenceManager", "processReadData readData is empty");
                b(i, j == 0 ? 0L : j + 1000, jCurrentTimeMillis);
                return;
            }
            Parcelable parcelable = sparseArray.get(i);
            if (parcelable instanceof List) {
                List list = (List) parcelable;
                mvs.c(i, list);
                b(i, Math.max(j, ((HiHealthData) list.get(list.size() - 1)).getEndTime()) + 1000, jCurrentTimeMillis);
            }
        }
    }

    private void b(int i, long j, long j2) {
        int i2 = (int) (j / 1000);
        int i3 = (int) (j2 / 1000);
        ReleaseLogUtil.d("R_DataDictionarySequenceManager", "syncData requestStartTime:", Integer.valueOf(i2), ",requestEndTime:", Integer.valueOf(i3), " ,digitTypeId: ", Integer.valueOf(i));
        if (j > j2) {
            ReleaseLogUtil.e("R_DataDictionarySequenceManager", "syncData cancel,valid time");
            d();
            c();
        } else {
            mvf mvfVar = (mvf) b(4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            if (mvfVar == null) {
                return;
            }
            d(mvfVar);
        }
    }

    private void d(mvf mvfVar) {
        synchronized (f42506a) {
            this.j.add(mvfVar);
        }
        a(mvfVar);
    }

    private void a(mvf mvfVar) {
        int iB;
        if (mvfVar == null || (iB = mvfVar.b()) == -1) {
            return;
        }
        int[] iArr = {mvfVar.a(), mvfVar.e()};
        ReleaseLogUtil.d("R_DataDictionarySequenceManager", "send Time start:", Integer.valueOf(iArr[0]), ",end:", Integer.valueOf(iArr[1]), " ,dicTypeId:", Integer.valueOf(iB));
        mhp mhpVar = new mhp();
        mhpVar.a("sequence_data");
        mhpVar.c(22);
        mhpVar.e((TransferFileReqType) null);
        mhpVar.d(this.f42507b.getDeviceIdentify());
        mhpVar.e(false);
        mhpVar.c(iArr);
        mhpVar.a(iB);
        mrj.e().a(mhpVar, this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        synchronized (e) {
            if (this.o.isEmpty()) {
                return;
            }
            this.o.remove(0);
            synchronized (f42506a) {
                List<mvf> list = this.j;
                if (list.isEmpty()) {
                    return;
                }
                list.clear();
            }
        }
    }

    private int b() {
        synchronized (e) {
            if (this.o.size() <= 0) {
                return -1;
            }
            Integer num = this.o.get(0);
            int iIntValue = num.intValue();
            ReleaseLogUtil.d("R_DataDictionarySequenceManager", "checkSyncDataIdList validId:", num);
            return iIntValue;
        }
    }

    private boolean c(mvg mvgVar) {
        if (mvgVar == null) {
            return true;
        }
        if (mvgVar.d() != -1) {
            return mvgVar.b() == null || mvgVar.b().size() <= 0;
        }
        LogUtil.a("DataDictionarySequenceManager", "parsePointData data is null or valid");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public mvf a() {
        synchronized (f42506a) {
            if (this.j.isEmpty()) {
                return null;
            }
            LogUtil.a("DataDictionarySequenceManager", "getCacheInfo mSyncDataIdList:", Integer.valueOf(this.j.size()));
            return this.j.get(0);
        }
    }

    private void j(mvg mvgVar) {
        int iD = d(mvgVar);
        synchronized (f42506a) {
            if (this.j.isEmpty()) {
                return;
            }
            LogUtil.a("DataDictionarySequenceManager", "updateCacheInfo nextStartTime:", Integer.valueOf(iD));
            this.j.get(0).d(iD + 1);
        }
    }

    private int d(mvg mvgVar) {
        if (mvgVar == null || mvgVar.b() == null) {
            return 0;
        }
        mvj mvjVar = mvgVar.b().get(mvgVar.b().size() - 1);
        if (mvjVar == null) {
            return 0;
        }
        int iC = mvjVar.c();
        return iC == 0 ? mvjVar.e() : iC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (i == 144001) {
            if (this.h) {
                LogUtil.a("DataDictionarySequenceManager", "mIsSleepSingleSync is true");
                IBaseResponseCallback iBaseResponseCallback = this.i;
                this.i = null;
                a(i, iBaseResponseCallback);
                this.h = false;
            }
            LogUtil.j("DataDictionarySequenceManager", "onFailure no file to sync next");
            d();
            c();
            return;
        }
        this.h = false;
        IBaseResponseCallback iBaseResponseCallback2 = this.f;
        this.f = null;
        if (iBaseResponseCallback2 == null) {
            LogUtil.j("DataDictionarySequenceManager", "callback is null.");
            xjt.n("callback is null.");
        } else {
            a(i, this.i);
            iBaseResponseCallback2.a(i, "");
        }
    }

    private void h() {
        this.f42508c = false;
        synchronized (e) {
            this.o.clear();
        }
        synchronized (f42506a) {
            this.j.clear();
        }
    }

    public void b(long j) {
        this.n = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T b(int i, Object... objArr) {
        return (T) mvt.d().execute(i, objArr);
    }

    public static mvl e() {
        return e.f42514c;
    }

    static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static mvl f42514c = new mvl();
    }
}
