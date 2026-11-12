package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.gson.JsonParseException;
import com.huawei.basichealthmodel.medicine.MedicineBean;
import com.huawei.basichealthmodel.medicine.MedicineRecord;
import com.huawei.basichealthmodel.medicine.MedicinesRule;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.util.HiJsonUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bzx {
    public static int a(String str, String str2, long j) {
        int iHashCode;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int iHashCode2 = str.hashCode();
        if (TextUtils.isEmpty(str2)) {
            iHashCode = String.valueOf(((long) iHashCode2) + j).hashCode();
        } else {
            iHashCode = String.valueOf(((long) (iHashCode2 + str2.hashCode())) + j).hashCode();
        }
        return iHashCode & Integer.MAX_VALUE;
    }

    public static String b(int i) {
        return "MEDICINE_MODEL_" + i;
    }

    public static SpannableString e(String str, String str2, int i) {
        SpannableString spannableString = new SpannableString(str);
        if (!TextUtils.isEmpty(str2)) {
            int length = str2.length();
            int i2 = 0;
            while (true) {
                int iIndexOf = str.indexOf(str2, i2);
                if (iIndexOf == -1) {
                    break;
                }
                int i3 = iIndexOf + length;
                spannableString.setSpan(new ForegroundColorSpan(i), iIndexOf, i3, 17);
                i2 = i3;
            }
        }
        return spannableString;
    }

    public static String d(int i) {
        return i + "_start_time";
    }

    public static String a(int i) {
        return i + "_end_time";
    }

    public static boolean d(MedicinesRule medicinesRule) {
        return medicinesRule != null && medicinesRule.getRuleId() > 0 && medicinesRule.getSource() > 0 && medicinesRule.getStartTime() > 0 && medicinesRule.getEndTime() >= 0 && medicinesRule.getMedicineTime() >= 0 && medicinesRule.getRuleType() >= 0;
    }

    public static MedicineRecord c(MedicinesRule medicinesRule) {
        if (!d(medicinesRule)) {
            ReleaseLogUtil.d("R_HL_MedicineUtil", "initMedicineRecord rule ", medicinesRule);
            return null;
        }
        MedicineRecord medicineRecord = new MedicineRecord();
        String name = medicinesRule.getName();
        medicineRecord.setName(name);
        int medicineTime = medicinesRule.getMedicineTime();
        medicineRecord.setMedicineTime(medicineTime);
        int ruleId = medicinesRule.getRuleId();
        if (TextUtils.isEmpty(name)) {
            medicineRecord.setRecordId(ruleId + medicineTime);
        } else {
            medicineRecord.setRecordId(ruleId);
        }
        int source = medicinesRule.getSource();
        if (source != 1) {
            source = 1;
        }
        medicineRecord.setSource(source);
        medicineRecord.setDrug(medicinesRule.getDrug());
        medicineRecord.setMark(medicinesRule.getMark());
        return medicineRecord;
    }

    public static List<MedicineRecord> b(List<MedicineRecord> list) {
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_HL_MedicineUtil", "getMedicineRecordList sourceList ", list);
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<MedicineRecord> it = list.iterator();
        while (it.hasNext()) {
            MedicineRecord medicineRecordA = a(it.next());
            if (medicineRecordA != null) {
                arrayList.add(medicineRecordA);
            }
        }
        return arrayList;
    }

    private static MedicineRecord a(MedicineRecord medicineRecord) {
        if (medicineRecord == null) {
            ReleaseLogUtil.d("R_HL_MedicineUtil", "getMedicineRecord medicineRecord is null");
            return null;
        }
        if (TextUtils.isEmpty(medicineRecord.getName())) {
            MedicineBean medicineBeanC = c(medicineRecord.getDrug());
            if (medicineBeanC == null) {
                return null;
            }
            medicineRecord.setDrug(medicineBeanC.getId());
            medicineRecord.setName(medicineBeanC.getName());
            medicineRecord.setMark(medicineBeanC.getRemarks());
            medicineRecord.setSource(medicineBeanC.getSource());
        }
        String name = medicineRecord.getName();
        if (TextUtils.isEmpty(name)) {
            ReleaseLogUtil.d("R_HL_MedicineUtil", "getMedicineRecord name ", name, " medicineRecord ", medicineRecord);
            return null;
        }
        if (medicineRecord.getRecordId() <= 0) {
            medicineRecord.setRecordId(a(name, medicineRecord.getMark(), System.currentTimeMillis()));
        }
        return medicineRecord;
    }

    private static MedicineBean c(int i) {
        String strB = b(i);
        HiUserPreference hiUserPreferenceD = cbg.d(strB);
        if (hiUserPreferenceD == null) {
            ReleaseLogUtil.d("R_HL_MedicineUtil", "getMedicineBean userPreference is null key ", strB);
            return null;
        }
        try {
            return (MedicineBean) HiJsonUtil.d(hiUserPreferenceD.getValue(), MedicineBean.class);
        } catch (JsonParseException e) {
            ReleaseLogUtil.b("R_HL_MedicineUtil", "getMedicineBean exception ", ExceptionUtils.c(e));
            return null;
        }
    }
}
