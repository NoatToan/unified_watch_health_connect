package com.huawei.hihealthservice.store.merge;

import android.content.Context;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import defpackage.kwc;
import defpackage.kwt;
import defpackage.kwu;
import defpackage.kwy;
import defpackage.ljn;
import defpackage.ljx;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class HiDataCoreSessionMerge implements HiMergeCommon {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kwu f12540b;
    private Context d;
    private List<Long> e = new ArrayList(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<Long, Integer> f12541c = new HashMap(16);

    public HiDataCoreSessionMerge(Context context) {
        this.d = context;
        this.f12540b = kwu.c(context);
    }

    @Override // com.huawei.hihealthservice.store.merge.HiMergeCommon
    public boolean merge(HiHealthData hiHealthData, int i, List<Integer> list) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(i));
        List<HiHealthData> listD = this.f12540b.d(hiHealthData.getStartTime(), hiHealthData.getEndTime(), arrayList);
        if (HiCommonUtil.b(listD) && hiHealthData.getSyncStatus() != 2) {
            if (hiHealthData.getMergedStatus() == 999) {
                this.f12540b.b(hiHealthData, i, 0);
            } else {
                this.f12540b.b(hiHealthData, i, hiHealthData.getMergedStatus());
            }
        } else if (HiCommonUtil.b(listD) || listD.get(0).getType() != hiHealthData.getType() || !Objects.equals(listD.get(0).getMetaData(), hiHealthData.getMetaData())) {
            if (hiHealthData.getSyncStatus() == 1 && (hiHealthData.getType() == 22105 || hiHealthData.getType() == 22106 || hiHealthData.getType() == 22107)) {
                if (kwc.b(hiHealthData.getType(), listD.get(0).getType()) > 0) {
                    if (hiHealthData.getMergedStatus() == 999) {
                        this.f12540b.a(hiHealthData, i, 0);
                    } else {
                        this.f12540b.a(hiHealthData, i, hiHealthData.getMergedStatus());
                    }
                }
            } else if (hiHealthData.getSyncStatus() != 2) {
                if (hiHealthData.getMergedStatus() == 999) {
                    this.f12540b.a(hiHealthData, i, 0);
                } else {
                    this.f12540b.a(hiHealthData, i, hiHealthData.getMergedStatus());
                }
            } else if (hiHealthData.getLastDataFlag()) {
                ReleaseLogUtil.d("HiH_HiDtaCoreSesnMrg", "delete hihealthdata sesseionData");
            }
        }
        long jO = HiDateUtil.o(hiHealthData.getStartTime());
        if (!this.e.contains(Long.valueOf(jO))) {
            this.e.add(Long.valueOf(jO));
            this.f12541c.put(Long.valueOf(jO), Integer.valueOf(hiHealthData.getMergedStatus()));
        }
        if (!hiHealthData.getLastDataFlag()) {
            return true;
        }
        for (Long l : this.e) {
            if (!b(l, list, this.f12541c.get(l).intValue())) {
                ReleaseLogUtil.d("HiH_HiDtaCoreSesnMrg", "mergeCoreSleepData false");
            }
        }
        ReleaseLogUtil.d("HiH_HiDtaCoreSesnMrg", "HiDataCoreSessionMerge merge end");
        this.e.clear();
        return true;
    }

    private boolean b(Long l, List<Integer> list, int i) {
        ReleaseLogUtil.d("HiH_HiDtaCoreSesnMrg", "mergeCoreSleepData startTime ", l);
        List<HiHealthData> listE = this.f12540b.e(c(l), list, 22100, 22199);
        if (HiCommonUtil.b(listE)) {
            ReleaseLogUtil.d("HiH_HiDtaCoreSesnMrg", "oldCoreSleepDatas isNullEmpty");
            return false;
        }
        List<HiHealthData> listA = a(listE);
        List<HiHealthData> listD = d(listA);
        if (!HiCommonUtil.b(listD)) {
            ReleaseLogUtil.d("HiH_HiDtaCoreSesnMrg", "Date=", Integer.valueOf(HiDateUtil.d(listD.get(0).getStartTime())), ",coreSleepVersion=", listD.get(0).getMetaData(), ",sz=", Integer.valueOf(listD.size()));
            listA = listD;
        }
        listE.removeAll(listA);
        for (HiHealthData hiHealthData : listE) {
            if (hiHealthData.getInt("merged") == 0) {
                if (i != 999) {
                    hiHealthData.setSyncStatus(0);
                }
                if (!this.f12540b.d(hiHealthData, hiHealthData.getClientId(), 1)) {
                    return false;
                }
            }
        }
        HashMap map = new HashMap(16);
        for (HiHealthData hiHealthData2 : listA) {
            if (map.containsKey(Long.valueOf(hiHealthData2.getStartTime()))) {
                List list2 = (List) map.get(Long.valueOf(hiHealthData2.getStartTime()));
                if (list2 != null) {
                    list2.add(hiHealthData2);
                    map.put(Long.valueOf(hiHealthData2.getStartTime()), list2);
                }
            } else {
                ArrayList arrayList = new ArrayList(10);
                arrayList.add(hiHealthData2);
                map.put(Long.valueOf(hiHealthData2.getStartTime()), arrayList);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            Collections.sort((List) entry.getValue(), new ljn.a());
            HiHealthData hiHealthData3 = (HiHealthData) ((List) entry.getValue()).get(0);
            if (hiHealthData3.getInt("merged") == 1) {
                if (i != 999) {
                    hiHealthData3.setSyncStatus(0);
                }
                this.f12540b.d(hiHealthData3, hiHealthData3.getClientId(), 0);
            }
            for (int i2 = 1; i2 < ((List) entry.getValue()).size(); i2++) {
                HiHealthData hiHealthData4 = (HiHealthData) ((List) entry.getValue()).get(i2);
                if (hiHealthData4.getInt("merged") == 0) {
                    if (i != 999) {
                        hiHealthData4.setSyncStatus(0);
                    }
                    if (!this.f12540b.d(hiHealthData4, hiHealthData4.getClientId(), 1)) {
                        return false;
                    }
                }
            }
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            kwt.b().k(it.next().intValue());
        }
        return true;
    }

    private HiDataReadOption c(Long l) {
        long jO = HiDateUtil.o(l.longValue());
        long jM = HiDateUtil.m(l.longValue());
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(jO);
        hiDataReadOption.setEndTime(jM);
        return hiDataReadOption;
    }

    private List<HiHealthData> d(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(10);
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData.getType() == 22105) {
                arrayList2.add(hiHealthData);
            } else if (ljx.c(hiHealthData) == 5) {
                arrayList.add(hiHealthData);
            }
        }
        if (HiCommonUtil.b(arrayList)) {
            return arrayList;
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:49:0x00e1  */
    private List<HiHealthData> a(List<HiHealthData> list) {
        int iB;
        byte b2;
        List<HiHealthData> arrayList = new ArrayList<>(10);
        List<HiHealthData> arrayList2 = new ArrayList<>(10);
        List<HiHealthData> arrayList3 = new ArrayList<>(10);
        List<HiHealthData> arrayList4 = new ArrayList<>(10);
        List<HiHealthData> arrayList5 = new ArrayList<>(10);
        List<HiHealthData> arrayList6 = new ArrayList<>(10);
        List<HiHealthData> arrayList7 = new ArrayList<>(10);
        List<HiHealthData> arrayList8 = new ArrayList<>(10);
        ArrayList arrayList9 = new ArrayList(10);
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null && (iB = b(hiHealthData, 0)) != 0) {
                List<ProductMapInfo> listC = ProductMap.c("deviceId", String.valueOf(iB));
                if (HiCommonUtil.b(listC)) {
                    ReleaseLogUtil.d("HiH_HiDtaCoreSesnMrg", "productInfoList is null");
                    b(arrayList7, arrayList8, hiHealthData);
                } else {
                    Iterator<ProductMapInfo> it = listC.iterator();
                    if (it.hasNext()) {
                        ProductMapInfo next = it.next();
                        String strE = next != null ? next.e() : null;
                        if (strE == null) {
                            ReleaseLogUtil.d("HiH_HiDtaCoreSesnMrg", "deviceCategory is null");
                            b(arrayList7, arrayList8, hiHealthData);
                        } else {
                            strE.hashCode();
                            switch (strE) {
                                case "001":
                                    b2 = 0;
                                    break;
                                case "00E":
                                    b2 = 1;
                                    break;
                                case "011":
                                    b2 = 2;
                                    break;
                                case "054":
                                    b2 = 3;
                                    break;
                                case "06D":
                                    b2 = 4;
                                    break;
                                case "06E":
                                    b2 = 5;
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            if (b2 == 0) {
                                arrayList9.add(hiHealthData);
                            } else if (b2 == 1 || b2 == 2) {
                                b(arrayList3, arrayList4, hiHealthData);
                            } else if (b2 == 3) {
                                b(arrayList5, arrayList6, hiHealthData);
                            } else if (b2 == 4 || b2 == 5) {
                                b(arrayList, arrayList2, hiHealthData);
                            } else {
                                ReleaseLogUtil.d("HiH_HiDtaCoreSesnMrg", "deviceCategory is error ", strE);
                                b(arrayList7, arrayList8, hiHealthData);
                            }
                        }
                    }
                }
            }
        }
        ReleaseLogUtil.d("HiH_HiDtaCoreSesnMrg", "Date is ", Integer.valueOf(HiDateUtil.d(list.get(0).getStartTime())), ", allCoreSleep ", Integer.valueOf(list.size()), ", wearDevCore ", Integer.valueOf(arrayList.size()), ", wearDevNoon ", Integer.valueOf(arrayList2.size()), ", phoneCore ", Integer.valueOf(arrayList3.size()), ", phoneNoon ", Integer.valueOf(arrayList4.size()), ", pillowCore ", Integer.valueOf(arrayList5.size()), ", pillowNoon ", Integer.valueOf(arrayList6.size()), ", otherCore ", Integer.valueOf(arrayList7.size()), ", otherNoon ", Integer.valueOf(arrayList8.size()), ", manualSleep ", Integer.valueOf(arrayList9.size()));
        if (!HiCommonUtil.b(arrayList)) {
            arrayList.addAll(arrayList2);
            return arrayList;
        }
        if (!HiCommonUtil.b(arrayList5)) {
            arrayList5.addAll(arrayList6);
            return arrayList5;
        }
        if (!HiCommonUtil.b(arrayList3)) {
            arrayList3.addAll(arrayList4);
            return arrayList3;
        }
        if (!HiCommonUtil.b(arrayList9)) {
            return arrayList9;
        }
        if (!HiCommonUtil.b(arrayList2)) {
            return arrayList2;
        }
        if (!HiCommonUtil.b(arrayList6)) {
            return arrayList6;
        }
        if (!HiCommonUtil.b(arrayList4)) {
            return arrayList4;
        }
        if (HiCommonUtil.b(arrayList7)) {
            return !HiCommonUtil.b(arrayList8) ? arrayList8 : new ArrayList(0);
        }
        arrayList7.addAll(arrayList8);
        return arrayList7;
    }

    private void b(List<HiHealthData> list, List<HiHealthData> list2, HiHealthData hiHealthData) {
        if (hiHealthData.getType() == 22105) {
            list2.add(hiHealthData);
        } else {
            list.add(hiHealthData);
        }
    }

    private int b(HiHealthData hiHealthData, int i) {
        HiDeviceInfo hiDeviceInfoB = kwy.b(this.d).b(kwt.b().c(hiHealthData.getClientId()));
        return hiDeviceInfoB == null ? i : hiDeviceInfoB.getDeviceType();
    }
}
