package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vbk {
    private static volatile boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f50899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50901c;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;

    private vbk() {
        x();
    }

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final vbk f50904c = new vbk();
    }

    public static vbk c() {
        return a.f50904c;
    }

    private void x() {
        this.g = DicDataTypeUtil.DataType.BODY_TEMPERATURE_SET.value();
        this.m = DicDataTypeUtil.DataType.SKIN_TEMPERATURE_SET.value();
        this.f50900b = DicDataTypeUtil.DataType.HIGH_BODY_TEMPERATURE_ALARM_SET.value();
        this.f50901c = DicDataTypeUtil.DataType.LOW_BODY_TEMPERATURE_ALARM_SET.value();
        this.f50899a = DicDataTypeUtil.DataType.BODY_TEMPERATURE.value();
        this.f = DicDataTypeUtil.DataType.SKIN_TEMPERATURE.value();
        this.i = DicDataTypeUtil.DataType.HIGH_BODY_TEMPERATURE_ALARM.value();
        this.j = DicDataTypeUtil.DataType.LOW_BODY_TEMPERATURE_ALARM.value();
        this.n = DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE_ALARM.value();
        this.p = DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE.value();
        this.s = DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE_SET.value();
        this.k = DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE_ALARM_SET.value();
        this.e = DicDataTypeUtil.DataType.MAX_BODY_TEMPERATURE.value();
        this.h = DicDataTypeUtil.DataType.MIN_BODY_TEMPERATURE.value();
        this.r = DicDataTypeUtil.DataType.MAX_SUSPECTED_HIGH_TEMPERATURE.value();
        this.q = DicDataTypeUtil.DataType.MIN_SUSPECTED_HIGH_TEMPERATURE.value();
        this.o = DicDataTypeUtil.DataType.MAX_SKIN_TEMPERATURE.value();
        this.l = DicDataTypeUtil.DataType.MIN_SKIN_TEMPERATURE.value();
    }

    public int h() {
        return this.g;
    }

    public int m() {
        return this.m;
    }

    public int d() {
        return this.f50900b;
    }

    public int b() {
        return this.f50901c;
    }

    public int a() {
        return this.f50899a;
    }

    public int l() {
        return this.f;
    }

    public int g() {
        return this.j;
    }

    public int o() {
        return this.n;
    }

    public int q() {
        return this.p;
    }

    public int p() {
        return this.s;
    }

    public int t() {
        return this.k;
    }

    public int f() {
        return this.i;
    }

    public int i() {
        return this.e;
    }

    public int j() {
        return this.h;
    }

    public int k() {
        return this.o;
    }

    public int n() {
        return this.l;
    }

    public int s() {
        return this.r;
    }

    public int r() {
        return this.q;
    }

    public void c(int[] iArr, HiDataReadOption hiDataReadOption, IBaseResponseCallback iBaseResponseCallback) {
        d(iArr, hiDataReadOption, iBaseResponseCallback, false);
    }

    public void d(int[] iArr, HiDataReadOption hiDataReadOption, IBaseResponseCallback iBaseResponseCallback, boolean z) {
        boolean z2;
        if (hiDataReadOption == null) {
            LogUtil.e("TemperatureDataManager", "getPointData option is null");
            return;
        }
        String strC = qrk.c(hiDataReadOption.getStartTime());
        SparseArray<Object> sparseArrayD = (z && d) ? vbj.d(iArr, strC) : new SparseArray<>();
        if (z && d && sparseArrayD.size() > 0) {
            List<HiHealthData> listE = e(iArr, sparseArrayD);
            LogUtil.a("TemperatureDataManager", "cacheData allList size ", Integer.valueOf(listE.size()));
            if (njy.e(listE)) {
                iBaseResponseCallback.a(-1, null);
            } else {
                iBaseResponseCallback.a(0, listE);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new e(sparseArrayD, strC, iArr, z2, z, iBaseResponseCallback, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int[] iArr, boolean z, boolean z2) {
        if (z && z2 && d) {
            vbj.d(iArr);
            ObserverManagerUtil.e("REFRESH_TEMPERATURE_CHART", new Object[0]);
            d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HiHealthData> e(int[] iArr, SparseArray<Object> sparseArray) {
        ArrayList arrayList = new ArrayList(16);
        for (int i : iArr) {
            Object obj = sparseArray.get(i);
            if (obj instanceof List) {
                List list = (List) obj;
                LogUtil.a("TemperatureDataManager", "getBodyAndSkinData type ", Integer.valueOf(i), " list size ", Integer.valueOf(list.size()));
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("TemperatureDataManager", "getWarningData callback is null");
            return;
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setSortOrder(1);
        int[] iArr = {this.j, this.i, this.n};
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(System.currentTimeMillis());
        c(iArr, hiDataReadOption, iBaseResponseCallback);
    }

    public void e(long j, long j2, float f, IBaseResponseCallback iBaseResponseCallback) {
        b(this.f50899a, j, j2, f, iBaseResponseCallback);
        v();
    }

    private void v() {
        LogUtil.a("TemperatureDataManager", "bodyTemperatureSyncCloudAfterInsert");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.BODY_TEMPERATURE_SET.value()));
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataTypes(arrayList);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    public void b(int i, long j, long j2, float f, IBaseResponseCallback iBaseResponseCallback) {
        HiHealthData hiHealthData = new HiHealthData(i);
        hiHealthData.setStartTime(j);
        hiHealthData.setEndTime(j2);
        hiHealthData.setValue(f);
        a(hiHealthData, iBaseResponseCallback);
    }

    private void a(final HiHealthData hiHealthData, final IBaseResponseCallback iBaseResponseCallback) {
        HiHealthManager.d(BaseApplication.getContext()).fetchManualDataClient(new HiDataClientListener() { // from class: vbk.1
            @Override // com.huawei.hihealth.data.listener.HiDataClientListener
            public void onResult(List<HiHealthClient> list) {
                if (iBaseResponseCallback == null) {
                    return;
                }
                if (njy.e(list)) {
                    LogUtil.j("TemperatureDataManager", "clientList is empty");
                    iBaseResponseCallback.a(100001, false);
                    return;
                }
                HiHealthClient hiHealthClient = list.get(0);
                if (hiHealthClient == null) {
                    LogUtil.j("TemperatureDataManager", "client is null");
                    iBaseResponseCallback.a(100001, false);
                    return;
                }
                String deviceUuid = hiHealthClient.getDeviceUuid();
                LogUtil.a("TemperatureDataManager", "deviceUuid = ", deviceUuid);
                hiHealthData.setDeviceUuid(deviceUuid);
                HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
                hiDataInsertOption.addData(hiHealthData);
                vbk.this.e(hiDataInsertOption, iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HiDataInsertOption hiDataInsertOption, final IBaseResponseCallback iBaseResponseCallback) {
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: vbp
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                vbk.d(iBaseResponseCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void d(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        if (obj == null || i != 0) {
            LogUtil.j("TemperatureDataManager", "insertData fail errorCode = ", Integer.valueOf(i));
            iBaseResponseCallback.a(100001, false);
        } else {
            LogUtil.a("TemperatureDataManager", "insertData success");
            iBaseResponseCallback.a(0, obj);
        }
    }

    public void b(Context context, List<HiTimeInterval> list, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("TemperatureDataManager", "deleteTemperatureData");
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
        hiDataDeleteOption.setTimes(list);
        hiDataDeleteOption.setTypes(new int[]{this.f50899a});
        HiHealthManager.d(context).deleteHiHealthData(hiDataDeleteOption, new HiDataOperateListener() { // from class: vbi
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                vbk.a(iBaseResponseCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void a(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        LogUtil.a("TemperatureDataManager", "deleteTemperatureData errorCode ", Integer.valueOf(i));
        if (iBaseResponseCallback == null) {
            LogUtil.j("TemperatureDataManager", "deleteTemperatureData callback is null");
        } else if (i == 0) {
            iBaseResponseCallback.a(0, Integer.valueOf(i));
        } else {
            iBaseResponseCallback.a(100001, Integer.valueOf(i));
        }
    }

    public void e(Context context, List<HiTimeInterval> list, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("TemperatureDataManager", "deleteTemperatureWarningData");
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
        hiDataDeleteOption.setTimes(list);
        hiDataDeleteOption.setTypes(new int[]{this.i, this.j, this.n});
        HiHealthManager.d(context).deleteHiHealthData(hiDataDeleteOption, new HiDataOperateListener() { // from class: vbo
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                vbk.c(iBaseResponseCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void c(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        LogUtil.a("TemperatureDataManager", "deleteTemperatureData errorCode ", Integer.valueOf(i));
        if (iBaseResponseCallback == null) {
            LogUtil.j("TemperatureDataManager", "deleteTemperatureData callback is null");
        } else if (i == 0) {
            iBaseResponseCallback.a(0, Integer.valueOf(i));
        } else {
            iBaseResponseCallback.a(100001, Integer.valueOf(i));
        }
    }

    public static void e(boolean z) {
        d = z;
    }

    static final class e implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<vbk> f50905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f50906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SparseArray<Object> f50907c;
        private final IBaseResponseCallback d;
        private final boolean e;
        private final String g;
        private final int[] j;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        e(SparseArray<Object> sparseArray, String str, int[] iArr, boolean z, boolean z2, IBaseResponseCallback iBaseResponseCallback, vbk vbkVar) {
            this.f50905a = new WeakReference<>(vbkVar);
            this.d = iBaseResponseCallback;
            this.j = iArr;
            this.e = z2;
            this.f50906b = z;
            this.g = str;
            this.f50907c = sparseArray;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            WeakReference<vbk> weakReference;
            vbk vbkVar;
            if (this.d == null || (weakReference = this.f50905a) == null || (vbkVar = weakReference.get()) == null) {
                return;
            }
            if (!(obj instanceof SparseArray)) {
                LogUtil.j("TemperatureDataManager", "getTemperatureData convert fail, data = ", Boolean.valueOf(obj == null));
                vbkVar.a(this.j, this.e, this.f50906b);
                this.d.a(-1, null);
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray.size() <= 0) {
                LogUtil.j("TemperatureDataManager", "existOxygenRemindData map is null");
                vbkVar.a(this.j, this.e, this.f50906b);
                this.d.a(-1, null);
                return;
            }
            if (this.e && vbk.d) {
                boolean unused = vbk.d = false;
                if (!vbj.a(this.j, this.f50907c, sparseArray)) {
                    LogUtil.a("TemperatureDataManager", "getPointData same cache");
                    return;
                }
                vbj.b(this.j, this.g, sparseArray);
                if (this.f50906b) {
                    LogUtil.a("TemperatureDataManager", "has return cache before, need to refresh chart");
                    ObserverManagerUtil.e("REFRESH_TEMPERATURE_CHART", new Object[0]);
                }
            }
            List listE = vbkVar.e(this.j, (SparseArray<Object>) sparseArray);
            LogUtil.a("TemperatureDataManager", "getBodyAndSkinData allList size ", Integer.valueOf(listE.size()));
            if (njy.e(listE)) {
                vbkVar.a(this.j, this.e, this.f50906b);
                this.d.a(-1, null);
            } else {
                this.d.a(0, listE);
            }
        }
    }
}
