package defpackage;

import android.content.Context;
import android.os.Build;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hihealthservice.store.merge.HiDataBusinessMerge;
import com.huawei.hihealthservice.store.merge.HiDataCoreSessionMerge;
import com.huawei.hihealthservice.store.merge.HiDataPointMerge;
import com.huawei.hihealthservice.store.merge.HiDataSessionMerge;
import com.huawei.hihealthservice.store.merge.HiDicHealthDataMerge;
import com.huawei.hihealthservice.store.merge.HiHealthDataPointMerge;
import com.huawei.hihealthservice.store.merge.HiHealthDataPointStressMerge;
import com.huawei.hihealthservice.store.merge.HiHealthDataSessionMerge;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lfx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f40060b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HiDataPointMerge f40061a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HiDataCoreSessionMerge f40062c;
    private HiDataBusinessMerge d;
    private HiDataSessionMerge e;
    private HiHealthDataSessionMerge f;
    private HiHealthDataPointStressMerge g;
    private HiHealthDataPointMerge h;
    private lfy i;
    private lfr j;
    private kyj k;
    private kyn n;
    private HiHealthDictManager o;

    private boolean b(int i) {
        return i != 7 && i >= 20001 && i < 22099;
    }

    /* synthetic */ lfx(AnonymousClass1 anonymousClass1) {
        this();
    }

    private lfx() {
        this.k = kyj.c();
        this.n = kyn.d(f40060b);
        this.i = lfy.a(f40060b);
        this.j = lfr.a();
        this.h = new HiHealthDataPointMerge(f40060b);
        this.f40062c = new HiDataCoreSessionMerge(f40060b);
        this.e = new HiDataSessionMerge(f40060b);
        this.f = new HiHealthDataSessionMerge(f40060b);
        this.f40061a = new HiDataPointMerge(f40060b);
        this.g = new HiHealthDataPointStressMerge(f40060b);
        this.d = new HiDataBusinessMerge(f40060b);
        this.o = HiHealthDictManager.a(f40060b);
    }

    static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final lfx f40063c = new lfx(null);
    }

    public static lfx b(Context context) {
        if (context != null) {
            f40060b = context.getApplicationContext();
        }
        return e.f40063c;
    }

    public int c(List<HiHealthData> list, int i) throws Throwable {
        if (b(list, i)) {
            LogUtil.j("HiH_HiHlhDtInsHlp", "saveBackgroundSyncHealthDetailData datas is null or who <= 0");
            return 7;
        }
        LogUtil.d("HiH_HiHlhDtInsHlp", "saveBackgroundSyncHealthDetailData() datas size is = ", Integer.valueOf(list.size()));
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<Integer> listC = this.k.c(i);
        if (HiCommonUtil.b(listC)) {
            LogUtil.e("HiH_HiHlhDtInsHlp", "saveBackgroundSyncHealthDetailData() null or clients ||clients.isEmpty ()");
            return 10;
        }
        List<HiHealthData> listA = ljq.a(f40060b, list);
        List<HiHealthData> listB = ljq.b(f40060b, list);
        int iC = c(listA, i, listC);
        int iC2 = c(listB, i, listC);
        if (iC2 != 0) {
            iC = iC2;
        }
        LogUtil.d("HiH_HiHlhDtInsHlp", "saveBackgroundSyncHealthDetailData() end totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return iC;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x010e  */
    private int c(List<HiHealthData> list, int i, List<Integer> list2) throws Throwable {
        boolean zB;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        try {
            zB = !ljq.h(f40060b, list.get(0).getType()) ? ljq.b(f40060b, list.get(0).getType()) : false;
            try {
                try {
                    int i2 = 4;
                    if (e(list)) {
                        ArrayList arrayList = new ArrayList(10);
                        ArrayList arrayList2 = new ArrayList(10);
                        for (HiHealthData hiHealthData : list) {
                            hiHealthData.setSyncStatus(1);
                            if (hiHealthData.getType() == 2002) {
                                arrayList.add(hiHealthData);
                            } else {
                                arrayList2.add(hiHealthData);
                            }
                        }
                        int i3 = !b(arrayList, list2) ? 4 : 0;
                        if (b(arrayList2, list2)) {
                            i2 = i3;
                        }
                    } else {
                        int i4 = 0;
                        int i5 = 0;
                        while (i5 < list.size()) {
                            HiHealthData hiHealthData2 = list.get(i5);
                            int clientId = hiHealthData2.getClientId();
                            hiHealthData2.setSyncStatus(1);
                            hiHealthData2.setLastDataFlag(i5 == list.size() - 1);
                            hiHealthData2.setMergedStatus(999);
                            if (!a(hiHealthData2, clientId, list2, i, 0)) {
                                i4 = 4;
                            }
                            liq.d(i5, false);
                            i5++;
                        }
                        i2 = i4;
                    }
                    if (zB) {
                        ljq.g(f40060b, list.get(0).getType());
                    }
                    if (zB) {
                        ljq.c(f40060b, list.get(0).getType());
                    }
                    return i2;
                } catch (Exception e2) {
                    e = e2;
                    ReleaseLogUtil.e("HiH_HiHlhDtInsHlp", "saveBackgroundSyncHealthDetailData Exception", LogAnonymous.b(e));
                    if (!zB) {
                        return 11;
                    }
                    ljq.c(f40060b, list.get(0).getType());
                    return 11;
                }
            } catch (Throwable th) {
                th = th;
                if (zB) {
                    ljq.c(f40060b, list.get(0).getType());
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            zB = false;
            if (zB) {
                ljq.c(f40060b, list.get(0).getType());
            }
            throw th;
        }
    }

    private boolean e(List<HiHealthData> list) {
        return list.get(0).getType() == 2002 || list.get(0).getType() == 2018;
    }

    private boolean b(List<HiHealthData> list, int i) {
        return HiCommonUtil.b(list) || i <= 0;
    }

    private boolean b(List<HiHealthData> list, List<Integer> list2) {
        if (list.isEmpty()) {
            return true;
        }
        int type = list.get(0).getType();
        long startTime = list.get(list.size() - 1).getStartTime();
        long startTime2 = list.get(0).getStartTime();
        if (AnonymousClass1.d[HiHealthDataType.d(type).ordinal()] != 1) {
            return false;
        }
        if (type < 2019 || (2022 <= type && 2033 >= type)) {
            return this.h.c(list, startTime, startTime2, list2);
        }
        return false;
    }

    /* JADX INFO: renamed from: lfx$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            d = iArr;
            try {
                iArr[HiHealthDataType.Category.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[HiHealthDataType.Category.SESSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[HiHealthDataType.Category.SEQUENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[HiHealthDataType.Category.SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[HiHealthDataType.Category.REALTIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[HiHealthDataType.Category.STAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[HiHealthDataType.Category.CONFIG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                d[HiHealthDataType.Category.CONFIGSTAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                d[HiHealthDataType.Category.BUSINESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public boolean a(HiHealthData hiHealthData, int i, List<Integer> list, int i2, int i3) {
        if (hiHealthData == null || list == null) {
            ReleaseLogUtil.e("HiH_HiHlhDtInsHlp", "saveOneDetailData null error");
            return false;
        }
        return c(hiHealthData, i, list, i2, i3);
    }

    private boolean c(HiHealthData hiHealthData, int i, List<Integer> list, int i2, int i3) {
        int type = hiHealthData.getType();
        switch (AnonymousClass1.d[HiHealthDataType.d(hiHealthData.getType()).ordinal()]) {
            case 1:
                if (this.o.e(type) == 0) {
                    return a(hiHealthData, i, list);
                }
                return c(hiHealthData, i, list, type);
            case 2:
                return e(i, hiHealthData, list, type);
            case 3:
                return this.i.b(hiHealthData, i, list);
            case 4:
                if (type == 10010) {
                    return this.i.c(hiHealthData, i3, i2);
                }
                if (this.o.a(type) != null) {
                    return this.i.d(hiHealthData, i, list);
                }
                return this.i.c(type, hiHealthData, i, list, this.h);
            case 5:
                return true;
            case 6:
                if (this.o.e(type) == 2) {
                    return this.i.e(hiHealthData, i3, i2);
                }
                return this.i.c(hiHealthData, i3, i2);
            case 7:
                return this.j.c(hiHealthData, i, list);
            case 8:
                return this.j.a(hiHealthData, i3, i2);
            case 9:
                return this.d.merge(hiHealthData, i, list);
            default:
                ReleaseLogUtil.d("HiH_HiHlhDtInsHlp", "saveOneDetailDataSync category default");
                return false;
        }
    }

    private boolean c(HiHealthData hiHealthData, int i, List<Integer> list, int i2) {
        if (i2 < 2000) {
            if (i2 >= 901 && i2 <= 906) {
                return this.f40061a.b(hiHealthData, i, 0);
            }
            return this.f40061a.merge(hiHealthData, i, list);
        }
        if (HiHealthDataType.f(i2)) {
            return this.h.merge(hiHealthData, i, list);
        }
        if (HiHealthDataType.t(i2)) {
            return this.g.merge(hiHealthData, i, list);
        }
        LogUtil.j("HiH_HiHlhDtInsHlp", "type is invalid");
        return false;
    }

    public boolean a(HiHealthData hiHealthData, int i, List<Integer> list) {
        if (hiHealthData == null || list == null) {
            return false;
        }
        HiDicHealthDataMerge hiDicHealthDataMerge = new HiDicHealthDataMerge(f40060b);
        if (!hiDicHealthDataMerge.e(hiHealthData)) {
            LogUtil.j("HiH_HiHlhDtInsHlp", "hiDicHealthDataMerge init failed!");
            return false;
        }
        int iE = this.o.e(hiHealthData.getType());
        if (iE == 0) {
            return hiDicHealthDataMerge.d(hiHealthData, i, list);
        }
        if (iE != 1) {
            LogUtil.j("HiH_HiHlhDtInsHlp", "This type is not supported merge! type is ", Integer.valueOf(hiHealthData.getType()));
        }
        return false;
    }

    private boolean e(int i, HiHealthData hiHealthData, List<Integer> list, int i2) {
        if (i2 <= 21000) {
            return this.e.merge(hiHealthData, i, list);
        }
        if (i2 <= 22099) {
            return this.f.merge(hiHealthData, i, list);
        }
        return this.f40062c.merge(hiHealthData, i, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int c(List<HiHealthData> list, kym kymVar, int i) {
        int i2;
        int i3;
        int i4;
        if (list == null) {
            return 10;
        }
        if (kymVar == null) {
            LogUtil.j("HiH_HiHlhDtInsHlp", "saveHealthDetailData fail hiHealthContext = null");
            return 10;
        }
        int i5 = kymVar.i();
        int iD = kymVar.d();
        int iC = kymVar.c();
        int iH = kymVar.h();
        ReleaseLogUtil.d("HiH_HiHlhDtInsHlp", "saveHlhDtlDt devId=", Integer.valueOf(iD), ",CID=", Integer.valueOf(iC), ",devTp=", Integer.valueOf(iH));
        List<Integer> listA = kymVar.a();
        if (listA == null || listA.isEmpty()) {
            LogUtil.j("HiH_HiHlhDtInsHlp", "saveHealthDetailData() fail null or clients ||clients.isEmpty ()");
            return 10;
        }
        int iB = kyn.b(this.n, i, kymVar.b(), i5, iD);
        this.i.e(list);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i7 >= list.size()) {
                break;
            }
            HiHealthData hiHealthData = list.get(i7);
            if (lkh.c(hiHealthData.getType())) {
                i2 = i7;
                i3 = iD;
                i4 = i6;
            } else {
                hiHealthData.setUserId(i5);
                hiHealthData.setAppId(kymVar.b());
                hiHealthData.setDeviceId(iD);
                hiHealthData.setClientId(iC);
                hiHealthData.setLastDataFlag(i7 != list.size() - 1 ? i6 : 1);
                hiHealthData.setMergedStatus(i6);
                b(i5, iH, hiHealthData);
                i2 = i7;
                i3 = iD;
                i4 = i6;
                if (!a(hiHealthData, iC, listA, i5, iB)) {
                    ReleaseLogUtil.e("HiH_HiHlhDtInsHlp", "saveOneDetailData fail sTm=", Long.valueOf(hiHealthData.getStartTime()), ",tp=", Integer.valueOf(hiHealthData.getType()));
                    i8 = 4;
                }
                if (lkh.f(hiHealthData.getType())) {
                    lkd.d().h(hiHealthData);
                }
            }
            i7 = i2 + 1;
            i6 = i4;
            iD = i3;
        }
        int i9 = i6;
        kymVar.c(1);
        if (i8 == 0) {
            c(list, iH, list.get(i9).getDeviceUuid());
        }
        kwt.b().c(kymVar);
        if (lgp.j()) {
            lgp.a(i5, iC);
        }
        return i8;
    }

    private void b(int i, int i2, HiHealthData hiHealthData) {
        long day = hiHealthData.getDay();
        if (hiHealthData.getType() == 40002) {
            kuk kukVarD = liq.d(f40060b, i, (int) day, 40002);
            if (i2 == 32) {
                if (System.currentTimeMillis() - (kukVarD == null ? hiHealthData.getStartTime() : kukVarD.d()) > 600000) {
                    return;
                }
            }
            double dL = kukVarD == null ? 0.0d : kukVarD.l();
            double value = hiHealthData.getValue() - dL;
            if (value > 5000.0d) {
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(8);
                linkedHashMap.put("errorCode", String.valueOf(1008));
                linkedHashMap.put("deviceType", String.valueOf(i2));
                linkedHashMap.put("brand", String.valueOf(Build.BRAND));
                linkedHashMap.put("isHw", String.valueOf(CommonUtil.bg()));
                linkedHashMap.put("localStep", String.valueOf(dL));
                linkedHashMap.put("date", String.valueOf(day));
                linkedHashMap.put("stepGap", String.valueOf(value));
                ljv.d(f40060b).c(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap, false);
            }
        }
    }

    private void c(List<HiHealthData> list, int i, String str) {
        if (i == 32 || i == 1 || i == 30) {
            LogUtil.a("HiH_HiHlhDtInsHlp", "doExerciseIntensitySync do not need exercise intensity sync");
            return;
        }
        Iterator<HiHealthData> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (b(it.next().getType())) {
                z = true;
            }
        }
        if (z) {
            HiBroadcastUtil.e(f40060b, 8, str);
        }
    }
}
