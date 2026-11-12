package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.Vo2maxDetail;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nkg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static nkg f43167b;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f43168a = BaseApplication.getContext();

    private nkg() {
    }

    public static nkg e() {
        nkg nkgVar;
        synchronized (e) {
            if (f43167b == null) {
                f43167b = new nkg();
            }
            nkgVar = f43167b;
        }
        return nkgVar;
    }

    private boolean d(Object obj, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("Track_HWHealthDataManager", "getVo2maxDetail onResult callback is null");
            return false;
        }
        if (obj != null) {
            return true;
        }
        iBaseResponseCallback.a(-1, null);
        LogUtil.j("Track_HWHealthDataManager", "getVo2maxDetail return null");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Object obj, int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        if (!d(obj, iBaseResponseCallback)) {
            LogUtil.j("Track_HWHealthDataManager", "dealHealthDataResult param is invalid.");
            return;
        }
        SparseArray sparseArray = (SparseArray) obj;
        if (sparseArray.size() <= 0) {
            LogUtil.j("Track_HWHealthDataManager", "dealHealthDataResult size = 0");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        Object obj2 = sparseArray.get(42006);
        LogUtil.d("Track_HWHealthDataManager", "getVo2maxDetail list", obj2);
        List<HiHealthData> list = (List) obj2;
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (HiHealthData hiHealthData : list) {
                Vo2maxDetail vo2maxDetail = new Vo2maxDetail();
                vo2maxDetail.setTimestamp(hiHealthData.getStartTime());
                vo2maxDetail.setVo2maxValue(hiHealthData.getIntValue());
                arrayList.add(vo2maxDetail);
            }
        }
        LogUtil.d("Track_HWHealthDataManager", "getVo2maxDetail return list", arrayList);
        Collections.sort(arrayList, new Comparator<Vo2maxDetail>() { // from class: nkg.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(Vo2maxDetail vo2maxDetail2, Vo2maxDetail vo2maxDetail3) {
                if (vo2maxDetail2.getTimestamp() == vo2maxDetail3.getTimestamp()) {
                    return 0;
                }
                return ((double) (vo2maxDetail2.getTimestamp() - vo2maxDetail3.getTimestamp())) < 1.0E-6d ? -1 : 1;
            }
        });
        if (arrayList.size() > 0) {
            iBaseResponseCallback.a(0, arrayList);
        } else {
            iBaseResponseCallback.a(-1, -1);
            LogUtil.a("Track_HWHealthDataManager", "getVo2maxDetail wrong list");
        }
    }

    public void d(long j, long j2, final IBaseResponseCallback iBaseResponseCallback) {
        synchronized (e) {
            HiDataReadOption hiDataReadOption = new HiDataReadOption();
            hiDataReadOption.setTimeInterval(j, j2);
            LogUtil.a("Track_HWHealthDataManager", "getVo2maxDetail ", Long.valueOf(j), " ", Long.valueOf(j2));
            hiDataReadOption.setType(new int[]{42006});
            hiDataReadOption.setReadType(0);
            HiHealthManager.d(this.f43168a).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: nkg.2
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    nkg.this.e(obj, i, i2, iBaseResponseCallback);
                }
            });
        }
    }

    public void b(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Track_HWHealthDataManager", "enter getLastVo2maxForMaxMet.");
        e(true, iBaseResponseCallback);
    }

    public void e(final boolean z, final IBaseResponseCallback iBaseResponseCallback) {
        synchronized (e) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            HiDataReadOption hiDataReadOption = new HiDataReadOption();
            hiDataReadOption.setStartTime(jCurrentTimeMillis);
            hiDataReadOption.setEndTime(jCurrentTimeMillis);
            hiDataReadOption.setType(new int[]{42007});
            hiDataReadOption.setReadType(0);
            HiHealthManager.d(this.f43168a).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: nkg.4
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    synchronized (nkg.e) {
                        if (iBaseResponseCallback == null) {
                            LogUtil.j("Track_HWHealthDataManager", "getLastVo2max onResult callback is null");
                            return;
                        }
                        if (obj == null) {
                            LogUtil.j("Track_HWHealthDataManager", "getLastVo2max data is null.");
                            iBaseResponseCallback.a(-1, null);
                            return;
                        }
                        SparseArray sparseArray = (SparseArray) obj;
                        if (sparseArray.size() > 0) {
                            nkg.this.e((SparseArray<Object>) sparseArray, iBaseResponseCallback, z, jCurrentTimeMillis);
                        } else {
                            LogUtil.j("Track_HWHealthDataManager", "getLastVo2max map is empty.");
                            iBaseResponseCallback.a(-1, null);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(SparseArray<Object> sparseArray, IBaseResponseCallback iBaseResponseCallback, boolean z, long j) {
        Object obj = sparseArray.get(42007);
        List<HiHealthData> list = (obj == null || !e(obj)) ? null : (List) obj;
        if (list == null || list.isEmpty()) {
            LogUtil.j("Track_HWHealthDataManager", "getLastVo2max vo2MaxTrackData is null");
            iBaseResponseCallback.a(-1, null);
        } else {
            LogUtil.d("Track_HWHealthDataManager", "getLastVo2max ", list);
            if (list.size() > 1) {
                Collections.sort(list, new Comparator<HiHealthData>() { // from class: nkg.5
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
                        long startTime = hiHealthData.getStartTime() - hiHealthData2.getStartTime();
                        if (startTime == 0) {
                            return 0;
                        }
                        return startTime > 0 ? 1 : -1;
                    }
                });
            }
            c(list, iBaseResponseCallback, z, j);
        }
    }

    private void c(List<HiHealthData> list, final IBaseResponseCallback iBaseResponseCallback, final boolean z, long j) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(list.get(list.size() - 1).getStartTime(), j);
        hiDataReadOption.setType(new int[]{42006});
        hiDataReadOption.setReadType(0);
        HiHealthManager.d(this.f43168a).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: nkg.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (obj == null) {
                    iBaseResponseCallback.a(-1, null);
                    LogUtil.j("Track_HWHealthDataManager", "getLastVo2max getVo2maxDetail return null");
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() > 0) {
                    nkg.this.b(sparseArray, iBaseResponseCallback, z);
                } else {
                    LogUtil.j("Track_HWHealthDataManager", "getLastVo2max getVo2maxDetail size = 0");
                    iBaseResponseCallback.a(-1, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SparseArray<Object> sparseArray, IBaseResponseCallback iBaseResponseCallback, boolean z) {
        Object obj = sparseArray.get(42006);
        if (obj == null) {
            LogUtil.j("Track_HWHealthDataManager", "getLastVo2max sportVo2maxList is null");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        LogUtil.d("Track_HWHealthDataManager", "getLastVo2max getVo2maxDetail list", obj);
        List list = e(obj) ? (List) obj : null;
        if (list == null || list.isEmpty()) {
            LogUtil.j("Track_HWHealthDataManager", "getLastVo2max vo2maxListSport is null");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        Collections.sort(list, new Comparator<HiHealthData>() { // from class: nkg.7
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
                long startTime = hiHealthData.getStartTime() - hiHealthData2.getStartTime();
                if (startTime == 0) {
                    return 0;
                }
                return startTime > 0 ? 1 : -1;
            }
        });
        HiHealthData hiHealthData = (HiHealthData) list.get(list.size() - 1);
        Vo2maxDetail vo2maxDetail = new Vo2maxDetail();
        vo2maxDetail.setTimestamp(hiHealthData.getEndTime());
        vo2maxDetail.setVo2maxValue(hiHealthData.getIntValue());
        LogUtil.d("Track_HWHealthDataManager", "getLastVo2max TimeStamp", Long.valueOf(hiHealthData.getStartTime()));
        if (z) {
            nkx.e().c(HiDateUtil.p(hiHealthData.getStartTime()), HiDateUtil.g(hiHealthData.getStartTime()), 0, true, iBaseResponseCallback);
        } else {
            iBaseResponseCallback.a(0, vo2maxDetail);
        }
    }

    public boolean e(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        Iterator it = ((List) obj).iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!(it.next() instanceof HiHealthData)) {
                z = false;
            }
        }
        return z;
    }

    public void c(Context context, long j, long j2, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Track_HWHealthDataManager", "getRestHeartRateData enter");
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setType(new int[]{2018});
        hiAggregateOption.setConstantsKey(new String[]{"rest_heart_rate_max"});
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setCount(1);
        HiHealthManager.d(context).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: nkg.8
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                if (iBaseResponseCallback == null) {
                    LogUtil.j("Track_HWHealthDataManager", "getRestHeartRateData onResult callback is null");
                    return;
                }
                if (list == null || list.size() <= 0) {
                    iBaseResponseCallback.a(0, Double.valueOf(0.0d));
                    LogUtil.j("Track_HWHealthDataManager", "getRestHeartRateData no data");
                } else {
                    iBaseResponseCallback.a(0, Double.valueOf(list.get(0).getDouble("rest_heart_rate_max")));
                    LogUtil.a("Track_HWHealthDataManager", "getRestHeartRateData hasData");
                }
            }
        });
    }

    public void b(Context context, long j, long j2, final IBaseResponseCallback iBaseResponseCallback) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setType(new int[]{46019});
        hiAggregateOption.setConstantsKey(new String[]{"heart_rate_last"});
        hiAggregateOption.setAggregateType(0);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setCount(1);
        HiHealthManager.d(context).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: nkg.10
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                if (iBaseResponseCallback == null) {
                    LogUtil.j("Track_HWHealthDataManager", "getLastTimeHeartRateData onResult callback is null");
                    return;
                }
                if (list == null || list.size() <= 0) {
                    iBaseResponseCallback.a(0, null);
                    LogUtil.j("Track_HWHealthDataManager", "getLastTimeHeartRateData no data");
                } else {
                    iBaseResponseCallback.a(0, list);
                    LogUtil.a("Track_HWHealthDataManager", "getLastTimeHeartRateData hasData");
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                LogUtil.a("Track_HWHealthDataManager", "onResultIntent called");
            }
        });
    }
}
