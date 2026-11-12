package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseDeviceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mxz extends HwBaseManager implements ParserInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f42679c;
    private c d;
    private boolean e;
    private int f;
    private long g;
    private boolean h;
    private int i;
    private List<Integer> j;
    private int k;
    private List<HiHealthData> l;
    private mye m;
    private List<myg> n;
    private myg o;
    private int p;
    private int q;
    private List<Integer> r;
    private List<HiHealthData> s;
    private int t;
    private myd v;
    private List<myf> w;
    private myf x;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final mxz f42681a = new mxz(BaseApplication.getContext());
    }

    private mxz(Context context) {
        super(context);
        this.f42679c = 0L;
        this.g = 0L;
        this.h = false;
        this.f42677a = "";
        this.v = new myd();
        this.w = new ArrayList(16);
        this.x = new myf();
        this.r = new ArrayList(16);
        this.m = new mye();
        this.n = new ArrayList(16);
        this.o = new myg();
        this.j = new ArrayList(16);
        this.f42678b = false;
        this.e = false;
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "HwStressMgr Constructor context.");
        this.d = new c(this);
        new mya().b(this);
    }

    public static mxz d() {
        return a.f42681a;
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr.length < 2) {
            ReleaseLogUtil.e("BTSYNC_HwStressMgr", "data is invalid");
            return;
        }
        LogUtil.a("HwStressMgr", "getResult :", eeq.e(bArr));
        byte b2 = bArr[1];
        if (b2 == 1) {
            b(bArr, deviceInfo);
            return;
        }
        if (b2 == 2) {
            e(bArr, deviceInfo);
            return;
        }
        if (b2 == 3) {
            d(bArr, deviceInfo);
        } else if (b2 == 4) {
            a(bArr, deviceInfo);
        } else {
            ReleaseLogUtil.e("BTSYNC_HwStressMgr", "other CommandId");
        }
    }

    class c extends Handler {
        WeakReference<mxz> d;

        c(mxz mxzVar) {
            super(Looper.getMainLooper());
            this.d = new WeakReference<>(mxzVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (this.d.get() == null) {
                ReleaseLogUtil.e("BTSYNC_HwStressMgr", "manager is null.");
                return;
            }
            ReleaseLogUtil.d("BTSYNC_HwStressMgr", "message.what :", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 0) {
                mxz.this.h = false;
                ReleaseLogUtil.e("BTSYNC_HwStressMgr", "mStressCallback is null.");
            } else if (i == 1) {
                mxz.this.g();
            } else {
                ReleaseLogUtil.e("BTSYNC_HwStressMgr", "handleMessage default.");
            }
        }
    }

    private void i() {
        this.s = new ArrayList(16);
        this.l = new ArrayList(16);
    }

    public void e() {
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "toSyncStressDetailData enter");
        mit.b("HwStressMgr", new e());
    }

    class e implements Runnable {
        private e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ReleaseLogUtil.d("BTSYNC_HwStressMgr", "SyncStressDetailDataRunnable run enter");
            mxz.this.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "syncStressDetailDataStart enter");
        LogUtil.a("HwStressMgr", "hiHealthVersionCode :", Integer.valueOf(HiHealthManager.d(BaseApplication.getContext()).getHiHealthVersionCode()));
        DeviceInfo currentDeviceInfo = HwExerciseDeviceUtil.getCurrentDeviceInfo();
        DeviceCapability capability = HwExerciseDeviceUtil.getCapability();
        if (capability != null && capability.isSupportStress()) {
            OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("syncStress", "begin sync data.");
            ReleaseLogUtil.d("BTSYNC_HwStressMgr", "support stress , begin to sync data.");
            if (currentDeviceInfo == null || currentDeviceInfo.getDeviceConnectState() != 2) {
                ReleaseLogUtil.e("BTSYNC_HwStressMgr", "no device is connected.");
                return;
            } else {
                d(currentDeviceInfo);
                return;
            }
        }
        ReleaseLogUtil.e("BTSYNC_HwStressMgr", "Capability is null or don't support stress!");
    }

    private void d(DeviceInfo deviceInfo) {
        if (this.h) {
            ReleaseLogUtil.e("BTSYNC_HwStressMgr", "mIsSyncing,please wait, return.");
            return;
        }
        j();
        this.h = true;
        this.f42679c = System.currentTimeMillis();
        long jB = b();
        this.g = jB;
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "mCurrentTime :", Long.valueOf(this.f42679c), ", mLastSyncTime :", Long.valueOf(jB));
        long j = this.g;
        if (j == 0 || this.f42679c - j > 604800000) {
            this.g = this.f42679c - 604800000;
        }
        int i = (int) (this.g / 1000);
        int i2 = (int) (this.f42679c / 1000);
        this.d.sendEmptyMessageDelayed(0, 180000L);
        myh.e(i, i2, deviceInfo);
    }

    private void b(byte[] bArr, DeviceInfo deviceInfo) {
        LogUtil.a("HwStressMgr", "enter processStressFrameIndexList(), data :", eeq.e(bArr));
        if (e(bArr) && bArr[2] == 127) {
            ReleaseLogUtil.e("BTSYNC_HwStressMgr", "processStressFrameIndexList return errorCode :", Integer.valueOf(myj.e(bArr)));
            c cVar = this.d;
            if (cVar != null) {
                cVar.removeMessages(0);
            }
            this.h = false;
            return;
        }
        myd mydVarA = myj.a(bArr);
        this.v = mydVarA;
        LogUtil.a("HwStressMgr", "mStressRecordIndexList :", mydVarA.toString());
        int iB = this.v.b();
        this.p = iB;
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "stress frameCount :", Integer.valueOf(iB));
        List<Integer> listE = this.v.e();
        this.r = listE;
        if (this.p <= 0 || njy.e(listE)) {
            ReleaseLogUtil.d("BTSYNC_HwStressMgr", "else : no stress frame index.start to sync relax data.");
            a(deviceInfo);
            return;
        }
        LogUtil.a("HwStressMgr", "stress indexList :", this.r.toString());
        int size = this.r.size();
        this.t = size;
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "mStressIndexListSize :", Integer.valueOf(size));
        this.q = 0;
        myh.b(this.r.get(0).intValue(), deviceInfo);
    }

    private void e(byte[] bArr, DeviceInfo deviceInfo) {
        LogUtil.a("HwStressMgr", "enter processStressRecordDetail(), data :", eeq.e(bArr));
        if (e(bArr) && bArr[2] == 127) {
            ReleaseLogUtil.e("BTSYNC_HwStressMgr", "processStressRecordDetail return errorCode :", Integer.valueOf(myj.e(bArr)));
            c cVar = this.d;
            if (cVar != null) {
                cVar.removeMessages(0);
            }
            this.h = false;
            return;
        }
        myf myfVarB = myj.b(bArr);
        this.x = myfVarB;
        LogUtil.a("HwStressMgr", "mStressRecordDetails :", myfVarB.toString());
        this.w.add(this.x);
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "mStressIndexProcessed :", Integer.valueOf(this.q));
        int i = this.q + 1;
        this.q = i;
        if (i < this.p && i < this.r.size()) {
            myh.b(this.r.get(this.q).intValue(), deviceInfo);
        } else {
            LogUtil.a("HwStressMgr", "mStressRecordDetailsList :", this.w.toString());
            a(deviceInfo);
        }
    }

    private void d(byte[] bArr, DeviceInfo deviceInfo) {
        LogUtil.a("HwStressMgr", "enter processRelaxFrameIndexList(), data :", eeq.e(bArr));
        if (e(bArr) && bArr[2] == 127) {
            ReleaseLogUtil.e("BTSYNC_HwStressMgr", "processRelaxFrameIndexList return errorCode :", Integer.valueOf(myj.e(bArr)));
            c cVar = this.d;
            if (cVar != null) {
                cVar.removeMessages(0);
            }
            this.h = false;
            return;
        }
        mye myeVarD = myj.d(bArr);
        this.m = myeVarD;
        LogUtil.a("HwStressMgr", "mRelaxRecordIndexList :", myeVarD.toString());
        int iA = this.m.a();
        this.f = iA;
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "relax frameCount :", Integer.valueOf(iA));
        List<Integer> listD = this.m.d();
        this.j = listD;
        if (this.f <= 0 || njy.e(listD)) {
            ReleaseLogUtil.d("BTSYNC_HwStressMgr", "no relax frame index.");
            f();
            return;
        }
        LogUtil.a("HwStressMgr", "relax indexList :", this.j.toString());
        int size = this.j.size();
        this.i = size;
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "mRelaxIndexListSize :", Integer.valueOf(size));
        this.k = 0;
        myh.a(this.j.get(0).intValue(), deviceInfo);
    }

    private void a(byte[] bArr, DeviceInfo deviceInfo) {
        LogUtil.a("HwStressMgr", "enter processRelaxRecordDetail(), data :", eeq.e(bArr));
        if (e(bArr) && bArr[2] == 127) {
            ReleaseLogUtil.e("BTSYNC_HwStressMgr", "processRelaxRecordDetail return errorCode :", Integer.valueOf(myj.e(bArr)));
            c cVar = this.d;
            if (cVar != null) {
                cVar.removeMessages(0);
            }
            this.h = false;
            return;
        }
        myg mygVarC = myj.c(bArr);
        this.o = mygVarC;
        LogUtil.a("HwStressMgr", "mRelaxRecordDetails :", mygVarC.toString());
        this.n.add(this.o);
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "mRelaxIndexProcessed :", Integer.valueOf(this.k));
        int i = this.k + 1;
        this.k = i;
        if (i < this.f && i < this.j.size()) {
            myh.a(this.j.get(this.k).intValue(), deviceInfo);
        } else {
            LogUtil.a("HwStressMgr", "mRelaxRecordDetailsList :", this.n.toString());
            f();
        }
    }

    private void a(DeviceInfo deviceInfo) {
        long jB = b();
        this.g = jB;
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "mCurrentTime :", Long.valueOf(this.f42679c), ", mLastSyncTime :", Long.valueOf(jB));
        long j = this.g;
        if (j == 0 || this.f42679c - j > 604800000) {
            this.g = this.f42679c - 604800000;
        }
        myh.c((int) (this.g / 1000), (int) (this.f42679c / 1000), deviceInfo);
    }

    public void c() {
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "hwStressMgr registerDeviceToHiHealth");
        DeviceInfo currentDeviceInfo = HwExerciseDeviceUtil.getCurrentDeviceInfo();
        if (currentDeviceInfo != null) {
            mga.h(currentDeviceInfo);
        } else {
            ReleaseLogUtil.e("BTSYNC_HwStressMgr", "hwStressMgr registerDeviceToHiHealth deviceInfo is null");
        }
    }

    private void f() {
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "saveAllDataToHiHealth enter");
        c();
        i();
        h();
    }

    private void h() {
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "saveStressDetailsListToHiHealth enter");
        List<myf> list = this.w;
        if (list != null && !list.isEmpty()) {
            ReleaseLogUtil.d("BTSYNC_HwStressMgr", "mStressRecordDetailsList.size() :", Integer.valueOf(this.w.size()));
            Iterator<myf> it = this.w.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            hiDataInsertOption.setDatas(this.s);
            HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: mxz.2
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public void onResult(int i, Object obj) {
                    LogUtil.a("HwStressMgr", "insertStressDetailsListToHiHealth onResult type :", Integer.valueOf(i), ", object :", obj);
                    if (i == 0) {
                        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "insertStressDetailsListToHiHealth success");
                        mxz.this.f42678b = true;
                    } else {
                        LogUtil.j("HwStressMgr", "insertCoreSleepStatusToHiHealth not correct object :", obj);
                        mxz.this.f42678b = false;
                    }
                    mxz.this.d.sendEmptyMessage(1);
                }
            });
            return;
        }
        this.f42678b = true;
        ReleaseLogUtil.e("BTSYNC_HwStressMgr", "saveStressDetailsListToHiHealth mRelaxRecordDetailsList is null.start save relax data.");
        this.d.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "saveRelaxDetailsListToHiHealth enter");
        List<myg> list = this.n;
        if (list != null && !list.isEmpty()) {
            ReleaseLogUtil.d("BTSYNC_HwStressMgr", "mRelaxRecordDetailsList.size() :", Integer.valueOf(this.n.size()));
            Iterator<myg> it = this.n.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            hiDataInsertOption.setDatas(this.l);
            b(hiDataInsertOption);
            return;
        }
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "saveRelaxDetailsListToHiHealth mRelaxRecordDetailsList is null!end saveToHealth.");
        this.e = true;
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "mIsSaveStressSuccess :", Boolean.valueOf(this.f42678b));
        if (this.f42678b && this.e) {
            e(this.f42679c);
        }
        c cVar = this.d;
        if (cVar != null) {
            cVar.removeMessages(0);
        }
        this.h = false;
    }

    private void b(HiDataInsertOption hiDataInsertOption) {
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: mxz.3
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("HwStressMgr", "insertRelaxDetailsListToHiHealth onResult type :", Integer.valueOf(i), ",object :", obj);
                if (i != 0) {
                    mxz.this.e = false;
                    LogUtil.j("HwStressMgr", "insertRelaxDetailsListToHiHealth not correct object :", obj);
                } else {
                    ReleaseLogUtil.d("BTSYNC_HwStressMgr", "insertRelaxDetailsListToHiHealth success");
                    mxz.this.e = true;
                    if (mxz.this.f42678b) {
                        mxz mxzVar = mxz.this;
                        mxzVar.e(mxzVar.f42679c);
                    }
                }
                if (mxz.this.d != null) {
                    mxz.this.d.removeMessages(0);
                }
                mxz.this.h = false;
            }
        });
    }

    private void c(myf myfVar) {
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "saveStressDetailData enter");
        List<myc> listA = myfVar.a();
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "list size :", Integer.valueOf(listA.size()));
        for (myc mycVar : listA) {
            long jC = mycVar.c();
            int iA = mycVar.a();
            int iE = mycVar.e();
            if (iE == 1) {
                a(2019, jC, iA);
            } else if (iE == 2) {
                a(2020, jC, iA);
            } else {
                ReleaseLogUtil.e("BTSYNC_HwStressMgr", "saveStressDetailData default");
            }
        }
    }

    private void a(int i, long j, int i2) {
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "enter addToHealthStressList(): stressType :", Integer.valueOf(i), ",stressTime :", Long.valueOf(j), ",stressScore :", Integer.valueOf(i2));
        HiHealthData hiHealthData = new HiHealthData(i);
        long j2 = j * 1000;
        hiHealthData.setTimeInterval(j2, j2);
        hiHealthData.setValue(i2);
        hiHealthData.setDeviceUuid(a());
        this.s.add(hiHealthData);
    }

    private void a(myg mygVar) {
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "saveRelaxDetailData enter");
        List<mxy> listE = mygVar.e();
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "list size :", Integer.valueOf(listE.size()));
        for (mxy mxyVar : listE) {
            int iA = mxyVar.a();
            long jC = mxyVar.c();
            int iD = mxyVar.d();
            int iE = mxyVar.e();
            if (iA == 1) {
                d(2021, jC, iD, iE);
            } else {
                ReleaseLogUtil.e("BTSYNC_HwStressMgr", "saveRelaxDetailData default");
            }
        }
    }

    private void d(int i, long j, int i2, int i3) {
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "enter addToHealthRelaxList(): relaxType :", Integer.valueOf(i), ",relaxTime :", Long.valueOf(j), "relaxLength :", Integer.valueOf(i2), ",relaxScore :", Integer.valueOf(i3));
        HiHealthData hiHealthData = new HiHealthData(i);
        long j2 = j * 1000;
        hiHealthData.setTimeInterval(j2, (((long) i2) * 60000) + j2);
        hiHealthData.setValue(i3);
        hiHealthData.setDeviceUuid(a());
        this.l.add(hiHealthData);
    }

    private long b() {
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "getLastSyncTime enter");
        return new mya().a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j) {
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "setLastSyncTime time = ", Long.valueOf(j));
        new mya().d(this, j);
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 32;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        this.h = false;
        j();
    }

    private void j() {
        ReleaseLogUtil.d("BTSYNC_HwStressMgr", "resetAllParams enter");
        c cVar = this.d;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
        }
        this.p = 0;
        this.t = 0;
        this.f = 0;
        this.i = 0;
        this.v = new myd();
        this.m = new mye();
        List<myf> list = this.w;
        if (list != null) {
            list.clear();
        }
        List<myg> list2 = this.n;
        if (list2 != null) {
            list2.clear();
        }
        this.f42678b = false;
        this.e = false;
    }

    public String a() {
        DeviceInfo currentDeviceInfo = HwExerciseDeviceUtil.getCurrentDeviceInfo();
        if (currentDeviceInfo != null) {
            this.f42677a = currentDeviceInfo.getSecurityDeviceId();
        }
        return this.f42677a;
    }

    private boolean e(byte[] bArr) {
        return bArr.length >= 3;
    }
}
