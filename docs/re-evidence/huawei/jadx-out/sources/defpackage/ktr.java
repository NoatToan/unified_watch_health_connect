package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiDataDeleteProOption;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiDataSourceFetchOption;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSampleConfigProcessOption;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.IAggregateListener;
import com.huawei.hihealth.IAggregateListenerEx;
import com.huawei.hihealth.ICommonListener;
import com.huawei.hihealth.IDataClientListener;
import com.huawei.hihealth.IDataOperateListener;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealth.IDeleteListenerEx;
import com.huawei.hihealth.IMultiDataClientListener;
import com.huawei.hihealth.data.constant.HiErrorCode;
import com.huawei.hihealthservice.InsertExecutor;
import com.huawei.hihealthservice.runnable.SingleRunnable;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes10.dex */
public final class ktr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f39463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InsertExecutor f39464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile ExecutorService f39465c;
    private Context d;
    private volatile ExecutorService e;

    private ktr() {
        this.f39463a = new Object();
    }

    static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final ktr f39468c = new ktr();
    }

    public static ktr b() {
        return e.f39468c;
    }

    public void c(Context context, InsertExecutor insertExecutor) {
        if (this.d != null) {
            LogUtil.a("HiH_HiHealthApiManager", "already initialized");
            return;
        }
        if (context == null || insertExecutor == null) {
            LogUtil.e("HiH_HiHealthApiManager", "context or executor is null");
            throw new IllegalArgumentException("context or executor is null");
        }
        this.d = context.getApplicationContext();
        this.f39464b = insertExecutor;
        insertExecutor.execute(new SingleRunnable() { // from class: ktr.1
            @Override // com.huawei.hihealthservice.runnable.SingleRunnable
            public void doRun() {
                try {
                    LogUtil.a("HiH_HiHealthApiManager", "getCurrentAppId, appId=", Integer.valueOf(ktx.c().b(ktr.this.d.getPackageName())), ", cost :", Long.valueOf(System.currentTimeMillis() - System.currentTimeMillis()));
                } catch (RemoteException e2) {
                    ReleaseLogUtil.a("HiH_HiHealthApiManager", "initialize ex = ", e2.getMessage());
                }
            }
        });
    }

    public void b(HiDataInsertOption hiDataInsertOption, IDataOperateListener iDataOperateListener, boolean z, boolean z2) throws RemoteException {
        kti ktiVar = new kti(this.d);
        if (ktiVar.e(hiDataInsertOption, iDataOperateListener, z, z2)) {
            if (z) {
                a().execute(ktiVar);
            } else {
                this.f39464b.execute(ktiVar);
            }
        }
    }

    public void d(IDataOperateListener iDataOperateListener) throws RemoteException {
        ksy ksyVar = new ksy(this.d);
        List<Integer> listB = liq.b();
        List<Integer> listC = liq.c();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(listB);
        arrayList.addAll(listC);
        if (ksyVar.c(arrayList, iDataOperateListener)) {
            this.f39464b.execute(ksyVar);
        }
    }

    public void e(HiDataDeleteOption hiDataDeleteOption, IDataOperateListener iDataOperateListener, boolean z, boolean z2) throws RemoteException {
        kte kteVar = new kte(this.d);
        if (kteVar.e(hiDataDeleteOption, iDataOperateListener, kth.b(z2).d((Integer) 0).c((Integer) 0).e((Integer) 0).d())) {
            if (z) {
                kteVar.run();
            } else {
                this.f39464b.execute(kteVar);
            }
        }
    }

    public void c(HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener, boolean z) throws RemoteException {
        ktm ktmVar = new ktm(this.d);
        if (!ktmVar.d(hiDataReadOption, iDataReadResultListener, kth.b(z).a((Integer) 0).d())) {
            LogUtil.j("HiH_HiHealthApiManager", "readHiHealthData initialize fail");
        } else {
            ktmVar.run();
        }
    }

    public void b(HiAggregateOption hiAggregateOption, IAggregateListener iAggregateListener, boolean z) throws RemoteException {
        ktd ktdVar = new ktd(this.d);
        if (!ktdVar.b(hiAggregateOption, iAggregateListener, kth.b(z).d())) {
            LogUtil.j("HiH_HiHealthApiManager", "aggregateHiHealthData initialize fail");
        } else {
            ktdVar.run();
        }
    }

    public void a(List list, IAggregateListenerEx iAggregateListenerEx, boolean z) throws RemoteException {
        ktc ktcVar = new ktc(this.d);
        if (!ktcVar.c(list, iAggregateListenerEx, z)) {
            LogUtil.j("HiH_HiHealthApiManager", "aggregateHiHealthDataEx initialize fail");
        } else {
            ktcVar.run();
        }
    }

    public void c(ICommonListener iCommonListener, boolean z) throws RemoteException {
        kug kugVar = new kug(this.d);
        if (!kugVar.e(iCommonListener, z)) {
            LogUtil.j("HiH_HiHealthApiManager", "fetchUserData initialize fail");
        } else {
            kugVar.run();
        }
    }

    public void a(HiAccountInfo hiAccountInfo, ICommonListener iCommonListener) throws RemoteException {
        ktt kttVar = new ktt(this.d);
        if (!kttVar.a(hiAccountInfo, iCommonListener)) {
            LogUtil.j("HiH_HiHealthApiManager", "hiLogin initialize fail");
        } else {
            e().execute(kttVar);
            this.e.shutdown();
        }
    }

    public void a(ICommonListener iCommonListener) throws RemoteException {
        ktw ktwVar = new ktw(this.d);
        if (!ktwVar.d(iCommonListener)) {
            LogUtil.j("HiH_HiHealthApiManager", "hiLogout initialize fail");
        } else {
            e().execute(ktwVar);
            this.e.shutdown();
        }
    }

    private ExecutorService a() {
        if (this.f39465c == null || this.f39465c.isShutdown()) {
            synchronized (this.f39463a) {
                if (this.f39465c == null || this.f39465c.isShutdown()) {
                    this.f39465c = Executors.newSingleThreadExecutor();
                }
            }
        }
        return this.f39465c;
    }

    private ExecutorService e() {
        if (this.e == null || this.e.isShutdown()) {
            synchronized (this.f39463a) {
                if (this.e == null || this.e.isShutdown()) {
                    this.e = Executors.newSingleThreadExecutor();
                }
            }
        }
        return this.e;
    }

    public void e(HiDataReadOption hiDataReadOption, ICommonListener iCommonListener, boolean z) throws RemoteException {
        kuf kufVar = new kuf(this.d);
        if (!kufVar.c(hiDataReadOption, iCommonListener, z)) {
            LogUtil.j("HiH_HiHealthApiManager", "fetchSportTypeList initialize fail");
        } else {
            kufVar.run();
        }
    }

    public void a(HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener, boolean z) throws RemoteException {
        kuc kucVar = new kuc(this.d);
        if (!kucVar.b(hiDataReadOption, iDataReadResultListener, z)) {
            LogUtil.j("HiH_HiHealthApiManager", "fetchSequenceDataBySportType initialize fail");
        } else {
            kucVar.run();
        }
    }

    public void b(HiDataReadProOption hiDataReadProOption, IDataReadResultListener iDataReadResultListener, boolean z) throws RemoteException {
        kuc kucVar = new kuc(this.d);
        if (!kucVar.c(hiDataReadProOption, iDataReadResultListener, z)) {
            LogUtil.j("HiH_HiHealthApiManager", "fetchSequenceDataProBySportType initialize fail");
        } else {
            kucVar.run();
        }
    }

    public void b(HiSportStatDataAggregateOption hiSportStatDataAggregateOption, IAggregateListener iAggregateListener, boolean z) throws RemoteException {
        kty ktyVar = new kty(this.d);
        if (!ktyVar.b(hiSportStatDataAggregateOption, iAggregateListener, z)) {
            LogUtil.j("HiH_HiHealthApiManager", "aggregateSportStatData initialize fail");
        } else {
            ktyVar.run();
        }
    }

    public void a(HiDataSourceFetchOption hiDataSourceFetchOption, IDataClientListener iDataClientListener, boolean z) throws RemoteException {
        ktk ktkVar = new ktk(this.d);
        if (!ktkVar.d(hiDataSourceFetchOption, iDataClientListener, z)) {
            LogUtil.j("HiH_HiHealthApiManager", "fetchDataSource initialize fail");
        } else {
            ktkVar.run();
        }
    }

    public void e(HiDataReadProOption hiDataReadProOption, IDataReadResultListener iDataReadResultListener, boolean z) throws RemoteException {
        if (hiDataReadProOption == null) {
            ReleaseLogUtil.a("HiH_HiHealthApiManager", "readProOption is null ");
            ktu.b(iDataReadResultListener, null, 7, 2);
            return;
        }
        ktm ktmVar = new ktm(this.d);
        if (!ktmVar.d(hiDataReadProOption.getDataReadOption(), iDataReadResultListener, kth.b(z).d(hiDataReadProOption.getPackageName()).a(Integer.valueOf(hiDataReadProOption.getSequenceDataType())).b(hiDataReadProOption.getDataFilter()).a(hiDataReadProOption.getMetadataFilter()).c(hiDataReadProOption.isLastDayDetail()).b(hiDataReadProOption.isGroupByTime()).d())) {
            LogUtil.j("HiH_HiHealthApiManager", "readHiHealthData initialize fail");
        } else {
            ktmVar.run();
        }
    }

    public void d(List list, IDataReadResultListener iDataReadResultListener, boolean z) throws RemoteException {
        ktf ktfVar = new ktf(this.d);
        if (!ktfVar.b(list, iDataReadResultListener, z)) {
            LogUtil.j("HiH_HiHealthApiManager", "readHiHealthDataEx initialize fail");
        } else {
            ktfVar.run();
        }
    }

    public void d(HiDataAggregateProOption hiDataAggregateProOption, IAggregateListener iAggregateListener, boolean z) throws RemoteException {
        if (hiDataAggregateProOption == null) {
            ReleaseLogUtil.a("HiH_HiHealthApiManager", "aggregateProOption is null ");
            ktu.e(iAggregateListener, null, 7, 2);
            return;
        }
        ktd ktdVar = new ktd(this.d);
        if (!ktdVar.b(hiDataAggregateProOption.getAggregateOption(), iAggregateListener, kth.b(z).d(hiDataAggregateProOption.getPackageName()).b(hiDataAggregateProOption.getDataFilter()).d(hiDataAggregateProOption.getWithoutDefaultZero()).d())) {
            LogUtil.j("HiH_HiHealthApiManager", "aggregateHiHealthData initialize fail");
        } else {
            ktdVar.run();
        }
    }

    public void b(List<HiDataAggregateProOption> list, IAggregateListenerEx iAggregateListenerEx, boolean z) throws RemoteException {
        ksz kszVar = new ksz(this.d);
        if (!kszVar.c(list, iAggregateListenerEx, z)) {
            LogUtil.j("HiH_HiHealthApiManager", "aggregateHiHealthDataEx initialize fail");
        } else {
            kszVar.run();
        }
    }

    public void e(HiDataDeleteProOption hiDataDeleteProOption, IDataOperateListener iDataOperateListener, boolean z, boolean z2) throws RemoteException {
        if (hiDataDeleteProOption == null) {
            ReleaseLogUtil.a("HiH_HiHealthApiManager", "deleteProOption is null ");
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(HiErrorCode.c(7));
            ktu.d(iDataOperateListener, 7, arrayList);
            return;
        }
        kte kteVar = new kte(this.d);
        if (kteVar.e(hiDataDeleteProOption.getDataDeleteOption(), iDataOperateListener, kth.b(z2).d(hiDataDeleteProOption.getPackageName()).d(hiDataDeleteProOption.getDeleteType()).c(hiDataDeleteProOption.getDeleteLevel()).e(hiDataDeleteProOption.getDeviceUuid()).e(hiDataDeleteProOption.getDeleteInterval()).d())) {
            if (z) {
                kteVar.run();
            } else {
                this.f39464b.execute(kteVar);
            }
        }
    }

    public void e(List<HiDataDeleteProOption> list, IDeleteListenerEx iDeleteListenerEx, boolean z, boolean z2) throws RemoteException {
        ktg ktgVar = new ktg(this.d);
        if (!ktgVar.c(list, iDeleteListenerEx, z2)) {
            LogUtil.j("HiH_HiHealthApiManager", "deleteHiHealthDataProEx initialize fail");
        } else if (z) {
            ktgVar.run();
        } else {
            this.f39464b.execute(ktgVar);
        }
    }

    public void e(List<HiSampleConfig> list, IDataOperateListener iDataOperateListener, boolean z) throws RemoteException {
        kub kubVar = new kub(this.d);
        if (!kubVar.a(list, iDataOperateListener, z)) {
            LogUtil.j("HiH_HiHealthApiManager", "sampleConfigSetOperation initialize fail");
        } else {
            this.f39464b.execute(kubVar);
        }
    }

    public void e(HiSampleConfigProcessOption hiSampleConfigProcessOption, IDataReadResultListener iDataReadResultListener, boolean z) throws RemoteException {
        ktz ktzVar = new ktz(this.d);
        if (!ktzVar.c(hiSampleConfigProcessOption, iDataReadResultListener, z)) {
            LogUtil.j("HiH_HiHealthApiManager", "sampleConfigGetOperation initialize fail");
        } else {
            ktzVar.run();
        }
    }

    public void c(HiSampleConfigProcessOption hiSampleConfigProcessOption, IDataOperateListener iDataOperateListener, boolean z) throws RemoteException {
        kua kuaVar = new kua(this.d);
        if (!kuaVar.e(hiSampleConfigProcessOption, iDataOperateListener, z)) {
            LogUtil.j("HiH_HiHealthApiManager", "sampleConfigDeleteOperation initialize fail");
        } else {
            this.f39464b.execute(kuaVar);
        }
    }

    public void b(int i, HiTimeInterval hiTimeInterval, final IDataClientListener iDataClientListener) throws RemoteException {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(i));
        d(arrayList, hiTimeInterval, true, new IMultiDataClientListener.Stub() { // from class: ktr.5
            @Override // com.huawei.hihealth.IMultiDataClientListener
            public void onMultiTypeResult(Map map) throws RemoteException {
            }

            @Override // com.huawei.hihealth.IMultiDataClientListener
            public void onMergeTypeResult(List list) throws RemoteException {
                iDataClientListener.onResult(list);
            }
        });
    }

    public void d(List list, HiTimeInterval hiTimeInterval, boolean z, IMultiDataClientListener iMultiDataClientListener) throws RemoteException {
        kts ktsVar = new kts(this.d);
        if (!ktsVar.d(list, hiTimeInterval, z, iMultiDataClientListener)) {
            LogUtil.j("HiH_HiHealthApiManager", "fetchDataSourceByTypes initialize fail");
        } else {
            ktsVar.run();
        }
    }
}
