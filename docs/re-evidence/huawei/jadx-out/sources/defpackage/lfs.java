package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.store.interfaces.IDataDelete;
import com.huawei.hihealthservice.store.merge.HiDicHealthDataMerge;
import com.huawei.hihealthservice.store.merge.HiDicSequenceMerge;
import com.huawei.hihealthservice.store.merge.HiHealthDataPointMerge;
import com.huawei.hihealthservice.store.merge.HiHealthDataPointStressMerge;
import com.huawei.hwcloudmodel.model.unite.DataTimeDelCondition;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes10.dex */
public class lfs implements IDataDelete {
    private static Context d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private lfr f40046a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private lfw f40047c;
    private List<DataTimeDelCondition> e;

    /* synthetic */ lfs(AnonymousClass1 anonymousClass1) {
        this();
    }

    private lfs() {
        this.f40047c = lfw.b(d);
        this.f40046a = lfr.a();
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final lfs f40048c = new lfs(null);
    }

    public static lfs d(Context context) {
        if (context != null) {
            d = context.getApplicationContext();
        }
        return b.f40048c;
    }

    public int b(int i) throws Throwable {
        boolean zB;
        boolean z;
        boolean zB2;
        int i2;
        kwt kwtVarB = kwt.b();
        if (kwtVarB == null) {
            return 1;
        }
        int iE = kud.a().e();
        int iC = kud.a().c();
        List<Integer> listD = kwtVarB.d(iE, i);
        int iE2 = e(i, iC, iE);
        if (HiCommonUtil.b(listD) || iE2 == 10) {
            LogUtil.j("HiH_HiHealthDataDeleteStore", "deleteAllKitHealthData() clientIDs is null who = ", Integer.valueOf(i));
            return 10;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zB = !ljq.h(d, 0) ? ljq.b(d, 0) : false;
                try {
                    zB2 = !ljq.h(d, 10001) ? ljq.b(d, 10001) : false;
                    try {
                        boolean zE = e(listD);
                        boolean zD = d(iE2, i);
                        if (zE && zD) {
                            i2 = 0;
                        } else {
                            LogUtil.j("HiH_HiHealthDataDeleteStore", "deleteAllKitHealthData() delete fail ,clients = ", listD);
                            i2 = 9;
                        }
                        if (zB) {
                            ljq.g(d, 0);
                        }
                        if (zB2) {
                            ljq.g(d, 10001);
                        }
                        if (zB) {
                            ljq.c(d, 0);
                        }
                        if (zB2) {
                            ljq.c(d, 10001);
                        }
                    } catch (Exception unused) {
                        ReleaseLogUtil.a("HiH_HiHealthDataDeleteStore", "deleteAllKitHealthData Exception");
                        if (zB) {
                            ljq.c(d, 0);
                        }
                        if (zB2) {
                            ljq.c(d, 10001);
                        }
                        i2 = 11;
                    }
                } catch (Exception unused2) {
                    zB2 = false;
                } catch (Throwable th) {
                    th = th;
                    z = false;
                    if (zB) {
                        ljq.c(d, 0);
                    }
                    if (z) {
                        ljq.c(d, 10001);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused3) {
            zB = false;
            zB2 = false;
        } catch (Throwable th3) {
            th = th3;
            zB = false;
            z = false;
        }
        LogUtil.d("HiH_HiHealthDataDeleteStore", "deleteAllKitHealthData() end totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return i2;
    }

    private int e(int i, int i2, int i3) {
        kym kymVarE = kyn.d(d).e(i, i2, i3, "-1");
        if (kymVarE == null) {
            return 10;
        }
        return kyn.b(kyn.d(d), 0, i, i3, kymVarE.d());
    }

    private boolean e(List<Integer> list) {
        boolean z;
        kxe kxeVarD = kxe.d(d);
        kxc kxcVarC = kxc.c();
        if (kxeVarD.d(list) <= 0) {
            LogUtil.j("HiH_HiHealthDataDeleteStore", "deleteKitHealthPointDatas() change <= 0");
            z = false;
        } else {
            z = true;
        }
        if (kxcVarC.d(list) > 0) {
            return z;
        }
        LogUtil.j("HiH_HiHealthDataDeleteStore", "deleteKitHealthPointDatas() delete health ensitive data failed, change <= 0");
        return false;
    }

    private boolean d(int i, int i2) {
        HiAppInfo hiAppInfoC = kwi.b().c(i2);
        if (hiAppInfoC == null || !"com.huawei.health.mc".equals(hiAppInfoC.getPackageName())) {
            return true;
        }
        kww kwwVarC = kww.c(d);
        kwz kwzVarD = kwz.d();
        int iE = kwwVarC.e(47401, 47406, i);
        if (iE < 0) {
            LogUtil.j("HiH_HiHealthDataDeleteStore", "deleteKitHealthStatData fails");
        }
        int iE2 = kwzVarD.e(47401, 47406, i);
        if (iE2 < 0) {
            LogUtil.j("HiH_HiHealthDataDeleteStore", "deleteKitHealthStatData delete health ensitive stat data failed");
            iE = iE2;
        }
        return iE >= 0;
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataDelete
    public List<DataTimeDelCondition> deleteHealthData(HiDataDeleteOption hiDataDeleteOption, kym kymVar, int i) {
        int i2 = kymVar.i();
        List<Integer> listA = kymVar.a();
        int[] types = hiDataDeleteOption.getTypes();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int[] iArrA = ljq.a(d, types);
        int[] iArrE = ljq.e(d, types);
        List<DataTimeDelCondition> listE = e(hiDataDeleteOption, i2, listA, iArrA, i);
        List<DataTimeDelCondition> listE2 = e(hiDataDeleteOption, i2, listA, iArrE, i);
        ArrayList arrayList = new ArrayList(16);
        if (!HiCommonUtil.b(listE)) {
            arrayList.addAll(listE);
        }
        if (!HiCommonUtil.b(listE2)) {
            arrayList.addAll(listE2);
        }
        ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteHealthData() end totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return arrayList;
    }

    private List<DataTimeDelCondition> e(HiDataDeleteOption hiDataDeleteOption, int i, List<Integer> list, int[] iArr, int i2) {
        ArrayList arrayList = new ArrayList(16);
        if (iArr != null && iArr.length != 0) {
            for (HiTimeInterval hiTimeInterval : hiDataDeleteOption.getTimes()) {
                if (!e(hiTimeInterval, iArr, list, i, i2)) {
                    ReleaseLogUtil.e("HiH_HiHealthDataDeleteStore", "deleteHealthData() delete fail types = ", HiJsonUtil.d(iArr), ",timeInterval = ", hiTimeInterval, ",clients = ", list);
                    DataTimeDelCondition dataTimeDelCondition = new DataTimeDelCondition();
                    dataTimeDelCondition.setStartTime(Long.valueOf(hiTimeInterval.getStartTime()));
                    dataTimeDelCondition.setEndTime(Long.valueOf(hiTimeInterval.getEndTime()));
                    arrayList.add(dataTimeDelCondition);
                }
            }
            List<DataTimeDelCondition> listB = this.f40047c.b();
            if (!HiCommonUtil.b(listB)) {
                arrayList.addAll(listB);
            }
            List<DataTimeDelCondition> listB2 = b();
            if (!HiCommonUtil.b(listB2)) {
                arrayList.addAll(listB2);
            }
        }
        return arrayList;
    }

    private boolean e(HiTimeInterval hiTimeInterval, int[] iArr, List<Integer> list, int i, int i2) {
        if (iArr == null) {
            return false;
        }
        long startTime = hiTimeInterval.getStartTime();
        long endTime = hiTimeInterval.getEndTime();
        int i3 = iArr[0];
        HiHealthDataType.Category categoryD = HiHealthDataType.d(i3);
        ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteHiHealthData() category = ", categoryD);
        int i4 = AnonymousClass1.e[categoryD.ordinal()];
        if (i4 == 1) {
            if (i3 < 2000) {
                return d(startTime, endTime, iArr, list, i);
            }
            if (HiHealthDataType.h(i3)) {
                return c(startTime, endTime, iArr, list, i);
            }
            return b(startTime, endTime, iArr, list, i);
        }
        if (i4 == 2) {
            if (i3 <= 21000) {
                return this.f40047c.c(startTime, endTime, iArr, list, i);
            }
            if (i3 <= 22099) {
                return this.f40047c.d(startTime, endTime, iArr, list, i);
            }
            return this.f40047c.a(startTime, endTime, iArr, list, i);
        }
        if (i4 == 3) {
            return b(hiTimeInterval, iArr, list, i, i2);
        }
        if (i4 == 4) {
            return a(startTime, endTime, iArr, i);
        }
        if (i4 != 5) {
            return false;
        }
        return this.f40046a.d(startTime, endTime, iArr, list);
    }

    /* JADX INFO: renamed from: lfs$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            e = iArr;
            try {
                iArr[HiHealthDataType.Category.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[HiHealthDataType.Category.SESSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[HiHealthDataType.Category.SEQUENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[HiHealthDataType.Category.STAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[HiHealthDataType.Category.CONFIG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
    private boolean d(long j, long j2, int[] iArr, List<Integer> list, int i) throws Throwable {
        boolean zB;
        HiHealthData hiHealthData;
        int iD;
        kwq kwqVarE = kwq.e(d);
        List<HiHealthData> listD = kwqVarE.d(j, j2, iArr, list);
        ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deletePointDatas()");
        boolean z = false;
        if (listD == null || listD.isEmpty()) {
            LogUtil.j("HiH_HiHealthDataDeleteStore", "deletePointDatas() hiHealthDatas = null");
            return false;
        }
        ArrayList arrayList = new ArrayList(10);
        try {
            try {
                zB = !ljq.h(d, iArr[0]) ? ljq.b(d, iArr[0]) : false;
                try {
                    boolean z2 = true;
                    for (HiHealthData hiHealthData2 : listD) {
                        if (hiHealthData2.getSyncStatus() == 0) {
                            hiHealthData = hiHealthData2;
                            iD = kwqVarE.a(hiHealthData2.getStartTime(), hiHealthData2.getEndTime(), hiHealthData2.getType(), hiHealthData2.getClientId());
                        } else {
                            hiHealthData = hiHealthData2;
                            iD = kwqVarE.d(hiHealthData.getDataId(), 2, 2);
                        }
                        if (iD <= 0) {
                            ReleaseLogUtil.e("HiH_HiHealthDataDeleteStore", "deletePointDatas() change <= 0");
                            z2 = false;
                        } else {
                            HiHealthData hiHealthData3 = hiHealthData;
                            hiHealthData3.setUserId(i);
                            arrayList.add(hiHealthData3);
                        }
                    }
                    if (zB) {
                        ljq.g(d, iArr[0]);
                    }
                    if (zB) {
                        ljq.c(d, iArr[0]);
                    }
                    z = z2;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.a("HiH_HiHealthDataDeleteStore", "deletePointDatas Exception ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(d, iArr[0]);
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    ljq.c(d, iArr[0]);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                ljq.c(d, iArr[0]);
            }
            throw th;
        }
        b(arrayList);
        return z;
    }

    private boolean c(long j, long j2, int[] iArr, List<Integer> list, int i) throws Throwable {
        int[] iArrA = ljq.a(d, iArr);
        int[] iArrE = ljq.e(d, iArr);
        boolean zA = a(j, j2, iArrA, list, i);
        if (a(j, j2, iArrE, list, i)) {
            return zA;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01da  */
    /* JADX WARN: Code duplicated, block: B:78:0x01de  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ea  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0, types: [long] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kxe] */
    private boolean a(long j, long j2, int[] iArr, List<Integer> list, int i) throws Throwable {
        ?? r12;
        ArrayList arrayList;
        ?? r10;
        char c2;
        ?? r11;
        int iB;
        ?? r15 = 1;
        ?? r16 = 1;
        if (iArr == null || iArr.length == 0) {
            return true;
        }
        ArrayList arrayList2 = null;
        ?? r13 = j2;
        List<HiHealthData> listA = ljq.a(d, iArr[0]).a(j, r13, iArr, list);
        if (HiCommonUtil.b(listA)) {
            if (!HiHealthDataType.g(iArr[0])) {
                HiHealthData hiHealthData = new HiHealthData(iArr[0]);
                hiHealthData.setTimeInterval(j, j2);
                hiHealthData.setUserId(i);
                listA.add(hiHealthData);
                b(listA);
                return true;
            }
            List<kuk> listA2 = kww.c(d).a(HiDateUtil.d(j), kyn.d(d).e(0, i, 0), HiHealthDataType.b());
            if (!HiCommonUtil.b(listA2)) {
                if (this.e == null) {
                    this.e = new ArrayList(16);
                }
                this.e.add(a(j, j2, 7));
                Iterator<kuk> it = listA2.iterator();
                while (it.hasNext()) {
                    kww.c(BaseApplication.getContext()).c(it.next().a(), 2);
                }
                return true;
            }
            ReleaseLogUtil.e("HiH_HiHealthDataDeleteStore", "deleteHealthPointDatasByTypes() hiHealthDatas = null");
            return false;
        }
        ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteHealthPointDatasByTypes() hiHealthDatas size = ", Integer.valueOf(listA.size()));
        ?? B = 10;
        ArrayList arrayList3 = new ArrayList(10);
        try {
            try {
                B = !ljq.h(d, iArr[0]) ? ljq.b(d, iArr[0]) : 0;
                try {
                    r13 = 1;
                    for (HiHealthData hiHealthData2 : listA) {
                        try {
                            if (hiHealthData2.getSyncStatus() == 0) {
                                iB = ljq.a(d, hiHealthData2.getType()).b(hiHealthData2.getStartTime(), hiHealthData2.getEndTime(), hiHealthData2.getType(), hiHealthData2.getClientId());
                            } else {
                                iB = ljq.a(d, hiHealthData2.getType()).b(hiHealthData2.getDataId(), 2, 2);
                            }
                            if (iB <= 0) {
                                try {
                                    ReleaseLogUtil.e("HiH_HiHealthDataDeleteStore", "deleteHealthPointDatasByTypes() change <= 0");
                                    arrayList3 = arrayList3;
                                    r13 = 0;
                                    r13 = 0;
                                } catch (Exception e) {
                                    e = e;
                                    arrayList = arrayList3;
                                    c2 = 0;
                                    ReleaseLogUtil.a("HiH_HiHealthDataDeleteStore", "deleteHealthPointDatasByTypes Exception ", LogAnonymous.b(e));
                                    if (B != 0) {
                                        ljq.c(d, iArr[0]);
                                    }
                                    ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteHealthPointDatasByTypes returnValue=", false, ", statHealthDatas.size()=", Integer.valueOf(arrayList.size()));
                                    r11 = 0;
                                    if (HiHealthDictManager.a((Context) null).e(iArr[c2]) == 0) {
                                        c(arrayList, i);
                                    } else {
                                        a(arrayList, i);
                                    }
                                    b(arrayList);
                                    return r11;
                                } catch (Throwable th) {
                                    th = th;
                                    arrayList2 = arrayList3;
                                    r16 = r13;
                                    r10 = B;
                                    r12 = r10;
                                    r15 = r16;
                                    if (r12 != 0) {
                                        ljq.c(d, iArr[0]);
                                    }
                                    ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteHealthPointDatasByTypes returnValue=", Boolean.valueOf((boolean) r15), ", statHealthDatas.size()=", Integer.valueOf(arrayList2.size()));
                                    throw th;
                                }
                            } else {
                                hiHealthData2.setUserId(i);
                                hiHealthData2.setSyncStatus(2);
                                arrayList = arrayList3;
                                try {
                                    arrayList.add(hiHealthData2);
                                    arrayList3 = arrayList;
                                } catch (Exception e2) {
                                    e = e2;
                                    c2 = 0;
                                    ReleaseLogUtil.a("HiH_HiHealthDataDeleteStore", "deleteHealthPointDatasByTypes Exception ", LogAnonymous.b(e));
                                    if (B != 0) {
                                        ljq.c(d, iArr[0]);
                                    }
                                    ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteHealthPointDatasByTypes returnValue=", false, ", statHealthDatas.size()=", Integer.valueOf(arrayList.size()));
                                    r11 = 0;
                                    if (HiHealthDictManager.a((Context) null).e(iArr[c2]) == 0) {
                                        c(arrayList, i);
                                    } else {
                                        a(arrayList, i);
                                    }
                                    b(arrayList);
                                    return r11;
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            arrayList = arrayList3;
                        } catch (Throwable th2) {
                            th = th2;
                            arrayList2 = arrayList3;
                        }
                    }
                    arrayList = arrayList3;
                    if (B != 0) {
                        ljq.g(d, iArr[0]);
                    }
                    if (B != 0) {
                        ljq.c(d, iArr[0]);
                    }
                    ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteHealthPointDatasByTypes returnValue=", Boolean.valueOf((boolean) r13), ", statHealthDatas.size()=", Integer.valueOf(arrayList.size()));
                    c2 = 0;
                    r11 = r13;
                } catch (Exception e4) {
                    e = e4;
                    arrayList = arrayList3;
                } catch (Throwable th3) {
                    th = th3;
                    arrayList2 = arrayList3;
                    r10 = B;
                    r12 = r10;
                    r15 = r16;
                    if (r12 != 0) {
                        ljq.c(d, iArr[0]);
                    }
                    ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteHealthPointDatasByTypes returnValue=", Boolean.valueOf((boolean) r15), ", statHealthDatas.size()=", Integer.valueOf(arrayList2.size()));
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e5) {
            e = e5;
            arrayList = arrayList3;
            B = 0;
        } catch (Throwable th5) {
            th = th5;
            arrayList2 = arrayList3;
            r12 = 0;
            if (r12 != 0) {
                ljq.c(d, iArr[0]);
            }
            ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteHealthPointDatasByTypes returnValue=", Boolean.valueOf((boolean) r15), ", statHealthDatas.size()=", Integer.valueOf(arrayList2.size()));
            throw th;
        }
        if (HiHealthDictManager.a((Context) null).e(iArr[c2]) == 0) {
            c(arrayList, i);
        } else {
            a(arrayList, i);
        }
        b(arrayList);
        return r11;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x015a  */
    private boolean b(long j, long j2, int[] iArr, List<Integer> list, int i) throws Throwable {
        boolean z;
        boolean zB;
        boolean z2;
        HiHealthData hiHealthData;
        int iC;
        kxd kxdVarE = kxd.e(d);
        List<HiHealthData> listE = kxdVarE.e(j, j2, iArr, list);
        LogUtil.d("HiH_HiHealthDataDeleteStore", "deleteHealthPointStressDatas()");
        int i2 = 2;
        if (HiCommonUtil.b(listE)) {
            List<kuk> listA = kww.c(d).a(HiDateUtil.d(j), kyn.d(d).e(0, i, 0), HiHealthDataType.h());
            if (!HiCommonUtil.b(listA)) {
                if (this.e == null) {
                    this.e = new ArrayList(16);
                }
                this.e.add(a(j, j2, 11));
                Iterator<kuk> it = listA.iterator();
                while (it.hasNext()) {
                    kww.c(BaseApplication.getContext()).c(it.next().a(), 2);
                }
                return true;
            }
            ReleaseLogUtil.e("HiH_HiHealthDataDeleteStore", "deleteHealthPointStressDatas() hiHealthDatas = null");
            return false;
        }
        ArrayList arrayList = new ArrayList(10);
        try {
            zB = !ljq.h(d, iArr[0]) ? ljq.b(d, iArr[0]) : false;
            try {
                try {
                    boolean z3 = true;
                    for (HiHealthData hiHealthData2 : listE) {
                        if (hiHealthData2.getSyncStatus() == 0) {
                            hiHealthData = hiHealthData2;
                            i2 = i2;
                            try {
                                iC = kxdVarE.d(hiHealthData2.getStartTime(), hiHealthData2.getEndTime(), hiHealthData2.getType(), hiHealthData2.getClientId());
                            } catch (Exception e) {
                                e = e;
                                String strB = LogAnonymous.b(e);
                                Object[] objArr = new Object[i2];
                                objArr[0] = "deleteHealthPointStressDatas Exception ";
                                objArr[1] = strB;
                                ReleaseLogUtil.a("HiH_HiHealthDataDeleteStore", objArr);
                                if (zB) {
                                    ljq.c(d, iArr[0]);
                                }
                                z2 = false;
                                e(arrayList, i);
                                b(arrayList);
                                return z2;
                            }
                        } else {
                            hiHealthData = hiHealthData2;
                            i2 = i2;
                            iC = kxdVarE.c(hiHealthData.getDataId(), i2, i2);
                        }
                        if (iC <= 0) {
                            LogUtil.j("HiH_HiHealthDataDeleteStore", "deleteHealthPointStressDatas() change <= 0");
                            z3 = false;
                        } else {
                            HiHealthData hiHealthData3 = hiHealthData;
                            hiHealthData3.setUserId(i);
                            hiHealthData3.setSyncStatus(i2);
                            arrayList.add(hiHealthData3);
                        }
                    }
                    i2 = i2;
                    if (zB) {
                        ljq.g(d, iArr[0]);
                    }
                    if (zB) {
                        ljq.c(d, iArr[0]);
                    }
                    z2 = z3;
                } catch (Exception e2) {
                    e = e2;
                    i2 = i2;
                }
            } catch (Throwable th) {
                th = th;
                z = zB;
                if (z) {
                    ljq.c(d, iArr[0]);
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            i2 = 2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (z) {
                ljq.c(d, iArr[0]);
            }
            throw th;
        }
        e(arrayList, i);
        b(arrayList);
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x013f  */
    private boolean b(HiTimeInterval hiTimeInterval, int[] iArr, List<Integer> list, int i, int i2) throws Throwable {
        List<HiHealthData> listA;
        boolean zB;
        long startTime = hiTimeInterval.getStartTime();
        long endTime = hiTimeInterval.getEndTime();
        kws kwsVarE = kws.e(d);
        if (IntStream.of(iArr).anyMatch(new IntPredicate() { // from class: lga
            @Override // java.util.function.IntPredicate
            public final boolean test(int i3) {
                return lfs.e(i3);
            }
        })) {
            listA = kwsVarE.c(startTime, endTime, iArr, list);
        } else {
            listA = kwsVarE.a(startTime, endTime, iArr, list, i2);
        }
        if (listA == null || listA.isEmpty()) {
            ReleaseLogUtil.e("HiH_HiHealthDataDeleteStore", "deleteSequenceDatas() sequences is null");
            return i2 == 1;
        }
        try {
            zB = !ljq.h(d, iArr[0]) ? ljq.b(d, iArr[0]) : false;
            try {
                try {
                    int i3 = 0;
                    for (HiHealthData hiHealthData : listA) {
                        int iD = kwsVarE.d(hiHealthData.getDataId(), 2, 2);
                        ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteSequenceDatas result = ", Integer.valueOf(iD));
                        if (iD > 0 && (hiHealthData.getType() == 31001 || HiHealthDataType.c().contains(Integer.valueOf(hiHealthData.getType())))) {
                            ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteBusinessRelationByRelationId errorCode ", Integer.valueOf(kwl.e().b(hiHealthData.getDataId())));
                        }
                        hiHealthData.setUserId(i);
                        if (hiHealthData.getType() == DicDataTypeUtil.DataType.ELECTROCARDIOGRAM.value()) {
                            hiHealthData.setMergedStatus(2);
                            hiHealthData.setSyncStatus(2);
                        }
                        i3 = iD;
                    }
                    if (zB) {
                        ljq.g(d, iArr[0]);
                    }
                    if (zB) {
                        ljq.c(d, iArr[0]);
                    }
                    if (i3 > 0) {
                        List<Integer> listE = HiHealthDictManager.a(d).e();
                        if (!HiCommonUtil.b(listE)) {
                            for (HiHealthData hiHealthData2 : listA) {
                                if (listE.contains(Integer.valueOf(hiHealthData2.getSubType()))) {
                                    hiHealthData2.setType(hiHealthData2.getType() + hiHealthData2.getSubType());
                                }
                            }
                        }
                        b(listA, i);
                        b(listA);
                        return true;
                    }
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.a("HiH_HiHealthDataDeleteStore", "deleteSequenceDatas Exception ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(d, iArr[0]);
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (zB) {
                    ljq.c(d, iArr[0]);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            zB = false;
            if (zB) {
                ljq.c(d, iArr[0]);
            }
            throw th;
        }
        return false;
    }

    static /* synthetic */ boolean e(int i) {
        return i == DicDataTypeUtil.DataType.SLEEP_DETAILS.value();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    private boolean a(long j, long j2, int[] iArr, int i) throws Throwable {
        boolean zB;
        kww kwwVarC = kww.c(d);
        int iE = kyn.d(d).e(0, i, 0);
        if (iE <= 0) {
            ReleaseLogUtil.e("HiH_HiHealthDataDeleteStore", "deleteStatDatas stat() statClient <= 0");
            return false;
        }
        List<kuk> listA = kwwVarC.a(j, j2, iArr, Collections.singletonList(Integer.valueOf(iE)));
        if (listA == null || listA.isEmpty()) {
            ReleaseLogUtil.e("HiH_HiHealthDataDeleteStore", "deleteStatDatas() statDatas is null");
            return false;
        }
        try {
            zB = !ljq.h(d, iArr[0]) ? ljq.b(d, iArr[0]) : false;
            try {
                try {
                    Iterator<kuk> it = listA.iterator();
                    boolean z = true;
                    while (it.hasNext()) {
                        int iC = kwwVarC.c(it.next().a(), 2);
                        if (iC <= 0) {
                            ReleaseLogUtil.e("HiH_HiHealthDataDeleteStore", "deleteStatDatas() change <= 0");
                            z = false;
                        }
                        ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteStatDatas result = ", Integer.valueOf(iC));
                    }
                    if (zB) {
                        ljq.g(d, iArr[0]);
                    }
                    if (zB) {
                        ljq.c(d, iArr[0]);
                    }
                    return z;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.a("HiH_HiHealthDataDeleteStore", "deleteStatDatas Exception ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(d, iArr[0]);
                    }
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                if (zB) {
                    ljq.c(d, iArr[0]);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            zB = false;
            if (zB) {
                ljq.c(d, iArr[0]);
            }
            throw th;
        }
    }

    private void b(List<HiHealthData> list) {
        lfz lfzVarD = lfz.d(d);
        lfzVarD.prepareRealTimeHealthDataStat(list);
        lfzVarD.doRealTimeHealthDataStat();
    }

    public List<DataTimeDelCondition> b() {
        List<DataTimeDelCondition> listSubList;
        ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteCloudHealth mDeleteTimeList=" + HiJsonUtil.d(this.e));
        ArrayList arrayList = new ArrayList(16);
        if (HiCommonUtil.b(this.e)) {
            return arrayList;
        }
        int size = this.e.size();
        int i = size / 10;
        for (int i2 = 0; i2 < i + 1; i2++) {
            if (i2 == i) {
                listSubList = this.e.subList(i2 * 10, size);
            } else {
                listSubList = this.e.subList(i2 * 10, (i2 + 1) * 10);
            }
            try {
                if (!a(listSubList)) {
                    arrayList.addAll(listSubList);
                }
            } catch (lif unused) {
                ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteCloudHealth SyncException=" + HiJsonUtil.d(listSubList));
                arrayList.addAll(listSubList);
            }
        }
        this.e.clear();
        return arrayList;
    }

    private boolean a(List<DataTimeDelCondition> list) throws lif {
        ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteCloudHealth deleteDataByTime=" + HiJsonUtil.d(list));
        int i = 0;
        while (i < 2) {
            if (liq.e(d, list)) {
                ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteCloudHealth OK !  dataTimeDelConditions = ", HiJsonUtil.d(list));
                break;
            }
            ReleaseLogUtil.e("HiH_HiHealthDataDeleteStore", "deleteCloudHealth failed dataTimeDelConditions = ", HiJsonUtil.d(list), " upLoadFailCount= ", Integer.valueOf(i));
            i++;
        }
        return i < 2;
    }

    private DataTimeDelCondition a(long j, long j2, int i) {
        DataTimeDelCondition dataTimeDelCondition = new DataTimeDelCondition();
        dataTimeDelCondition.setStartTime(Long.valueOf(j));
        dataTimeDelCondition.setEndTime(Long.valueOf(j2));
        dataTimeDelCondition.setType(Integer.valueOf(i));
        dataTimeDelCondition.setDeviceCode(0L);
        return dataTimeDelCondition;
    }

    private void e(List<HiHealthData> list, int i) {
        HiHealthDataPointStressMerge hiHealthDataPointStressMerge = new HiHealthDataPointStressMerge(d);
        List<Integer> listF = kwt.b().f(i);
        if (HiCommonUtil.b(list)) {
            return;
        }
        for (HiHealthData hiHealthData : list) {
            hiHealthDataPointStressMerge.merge(hiHealthData, hiHealthData.getClientId(), listF);
        }
    }

    private void a(List<HiHealthData> list, int i) {
        HiHealthDataPointMerge hiHealthDataPointMerge = new HiHealthDataPointMerge(d);
        List<Integer> listF = kwt.b().f(i);
        if (HiCommonUtil.b(list)) {
            return;
        }
        for (HiHealthData hiHealthData : list) {
            hiHealthDataPointMerge.merge(hiHealthData, hiHealthData.getClientId(), listF);
        }
    }

    private void c(List<HiHealthData> list, int i) {
        HiDicHealthDataMerge hiDicHealthDataMerge = new HiDicHealthDataMerge(d);
        List<Integer> listF = kwt.b().f(i);
        if (HiCommonUtil.b(list)) {
            return;
        }
        for (HiHealthData hiHealthData : list) {
            if (!hiDicHealthDataMerge.e(hiHealthData)) {
                ReleaseLogUtil.e("HiH_HiHealthDataDeleteStore", "hiDicHealthDataMerge init failed!");
                return;
            }
            hiDicHealthDataMerge.d(hiHealthData, hiHealthData.getClientId(), listF);
        }
    }

    private void b(List<HiHealthData> list, int i) {
        HiDicSequenceMerge hiDicSequenceMerge = new HiDicSequenceMerge(d);
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData.getType() == DicDataTypeUtil.DataType.ELECTROCARDIOGRAM.value()) {
                hiDicSequenceMerge.merge(hiHealthData, hiHealthData.getClientId(), kwt.b().f(i));
            }
        }
    }
}
