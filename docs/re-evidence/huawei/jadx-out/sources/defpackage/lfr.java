package defpackage;

import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiConfigDataType;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lfr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kwm f40045b;
    private kwn e;

    private lfr() {
        this.f40045b = kwm.d();
        this.e = kwn.e();
    }

    static class d {
        private static final lfr d = new lfr();
    }

    public static lfr a() {
        return d.d;
    }

    public boolean c(HiHealthData hiHealthData, int i, List<Integer> list) {
        if (hiHealthData != null && list != null) {
            int type = hiHealthData.getType();
            if (!HiConfigDataType.f(type)) {
                LogUtil.d("HiH_HiHealthSaveData", "not support the type=", Integer.valueOf(type));
                return false;
            }
            Object[] objArrE = HiConfigDataType.e(HiConfigDataType.a(type).intValue());
            Object obj = objArrE[1];
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            Object obj2 = objArrE[2];
            Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
            if (num == null || num2 == null) {
                LogUtil.j("HiH_HiHealthSaveData", "not set tableName or merge policy");
            } else {
                return e(hiHealthData, i, list, lke.d(num.intValue()), num2.intValue());
            }
        }
        return false;
    }

    private boolean e(HiHealthData hiHealthData, int i, List<Integer> list, String str, int i2) {
        if (i2 == 1 || i2 == 2) {
            return d(hiHealthData, i, list, str, i2);
        }
        if (i2 == 3) {
            return true;
        }
        if (i2 != 4) {
            return false;
        }
        return c(hiHealthData, i, str);
    }

    private boolean c(HiHealthData hiHealthData, int i, String str) {
        return this.f40045b.a(str, hiHealthData, i, 0);
    }

    private boolean d(HiHealthData hiHealthData, int i, List<Integer> list, String str, int i2) {
        List<HiHealthData> listB = this.f40045b.b(str, hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), list);
        if (listB == null || listB.isEmpty()) {
            return this.f40045b.b(str, hiHealthData, i, 0) > 0;
        }
        Iterator<HiHealthData> it = listB.iterator();
        while (true) {
            if (it.hasNext()) {
                HiHealthData next = it.next();
                if (next.getClientId() == i) {
                    next.setValue(hiHealthData.getValue());
                    next.putInt("merged", 0);
                    next.setSyncStatus(hiHealthData.getSyncStatus());
                    break;
                }
            } else {
                hiHealthData.setClientId(i);
                hiHealthData.putInt("merged", 0);
                listB.add(hiHealthData);
                break;
            }
        }
        if (1 == i2) {
            e(listB);
        } else {
            c(listB);
        }
        HiHealthData hiHealthData2 = listB.get(0);
        boolean zA = this.f40045b.a(str, hiHealthData2, hiHealthData2.getClientId(), 0);
        for (int i3 = 1; i3 < listB.size(); i3++) {
            HiHealthData hiHealthData3 = listB.get(i3);
            if (hiHealthData.getInt("merged") == 0) {
                boolean zA2 = this.f40045b.a(str, hiHealthData3, hiHealthData3.getClientId(), 1);
                LogUtil.d("HiH_HiHealthSaveData", "pointDataMerge() insertOrUpdatePointData unmerge change = ", Boolean.valueOf(zA2));
                if (!zA2) {
                    zA = false;
                }
            }
        }
        return zA;
    }

    public boolean a(HiHealthData hiHealthData, int i, int i2) {
        if (hiHealthData == null || i <= 0) {
            LogUtil.j("HiH_HiHealthSaveData", "insertConfigStatData() statClient <= 0");
            return false;
        }
        int type = hiHealthData.getType();
        if (!HiConfigDataType.i(type)) {
            LogUtil.j("HiH_HiHealthSaveData", "not support stattype=", Integer.valueOf(type));
            return false;
        }
        Integer numC = HiConfigDataType.c(type);
        Integer num = HiConfigDataType.c(numC.intValue(), 7) instanceof Integer ? (Integer) HiConfigDataType.c(numC.intValue(), 7) : null;
        if (num == null) {
            return false;
        }
        LogUtil.a("HiH_HiHealthSaveData", "insertConfigStatData() type =", Integer.valueOf(type), ",time = ", Long.valueOf(hiHealthData.getStartTime()), ",statClient = ", Integer.valueOf(i), ",who is ", Integer.valueOf(i2));
        kuk kukVar = new kuk();
        kukVar.c(hiHealthData.getStartTime());
        kukVar.h(i2);
        kukVar.i(hiHealthData.getSyncStatus());
        kukVar.e(hiHealthData.getInt("hihealth_type"));
        kukVar.d(hiHealthData.getType());
        kukVar.f(hiHealthData.getPointUnit());
        kukVar.c(hiHealthData.getValue());
        kukVar.a(i);
        kukVar.a(hiHealthData.getModifiedTime());
        return this.e.b(lke.d(num.intValue()), kukVar);
    }

    private void e(List<HiHealthData> list) {
        Collections.sort(list, new b());
    }

    private void c(List<HiHealthData> list) {
        Collections.sort(list, new e());
    }

    static class b implements Comparator<HiHealthData>, Serializable {
        private static final long serialVersionUID = -6004164342177470050L;

        private b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
            return Double.compare(hiHealthData2.getValue(), hiHealthData.getValue());
        }
    }

    static class e implements Comparator<HiHealthData>, Serializable {
        private static final long serialVersionUID = -5980122579597294901L;

        private e() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
            return Double.compare(hiHealthData.getValue(), hiHealthData2.getValue());
        }
    }

    public boolean d(long j, long j2, int[] iArr, List<Integer> list) {
        int iA;
        if (iArr != null && list != null) {
            if (!HiConfigDataType.f(iArr[0])) {
                LogUtil.j("HiH_HiHealthSaveData", "deleteConfigDataTypes not support type");
                return false;
            }
            int iIntValue = HiConfigDataType.a(iArr[0]).intValue();
            Integer num = HiConfigDataType.c(iIntValue, 1) instanceof Integer ? (Integer) HiConfigDataType.c(iIntValue, 1) : null;
            if (num == null) {
                LogUtil.j("HiH_HiHealthSaveData", "statdata not set tablename");
                return false;
            }
            String strD = lke.d(num.intValue());
            kwm kwmVarD = kwm.d();
            List<HiHealthData> listE = kwmVarD.e(strD, j, j2, iArr, list);
            LogUtil.d("HiH_HiHealthSaveData", "deleteConfigDataTypes()");
            if (listE == null || listE.isEmpty()) {
                LogUtil.j("HiH_HiHealthSaveData", "deleteConfigDataTypes() hiHealthDatas = null");
            } else {
                for (HiHealthData hiHealthData : listE) {
                    if (hiHealthData.getSyncStatus() == 0) {
                        iA = kwmVarD.b(strD, hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), hiHealthData.getClientId());
                    } else {
                        iA = kwmVarD.a(strD, hiHealthData.getDataId(), 2, 2);
                    }
                    if (iA <= 0) {
                        LogUtil.j("HiH_HiHealthSaveData", "deleteConfigDataTypes() result <= 0");
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
