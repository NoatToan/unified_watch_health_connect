package com.huawei.hihealthservice.sync.dataswitch;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcloudmodel.model.unite.MenstrualBasic;
import com.huawei.hwcloudmodel.model.unite.MenstrualTotal;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kuk;
import defpackage.kym;
import defpackage.kyn;
import defpackage.lik;
import defpackage.njy;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class MenstrualStatSwitch {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f12598c;

    public MenstrualStatSwitch(Context context) {
        if (context != null) {
            this.f12598c = context.getApplicationContext();
        } else {
            this.f12598c = BaseApplication.getContext();
        }
    }

    public List<MenstrualTotal> a(List<HiHealthData> list) {
        if (njy.e(list)) {
            return new ArrayList(1);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            MenstrualTotal menstrualTotal = new MenstrualTotal();
            menstrualTotal.setTimeZone(hiHealthData.getTimeZone());
            menstrualTotal.setGenerateTime(Long.valueOf(hiHealthData.getLong("modified_time")));
            menstrualTotal.setRecordDay(Integer.valueOf(HiDateUtil.d(hiHealthData.getStartTime())));
            menstrualTotal.setDataSource(2);
            menstrualTotal.setDeviceCode(0L);
            menstrualTotal.setMenstrualBasic(c(hiHealthData));
            arrayList.add(menstrualTotal);
        }
        return arrayList;
    }

    private MenstrualBasic c(HiHealthData hiHealthData) {
        MenstrualBasic menstrualBasic = new MenstrualBasic();
        menstrualBasic.setStatus(Integer.valueOf(hiHealthData.getInt("menstrual_status")));
        menstrualBasic.setSubStatus(Integer.valueOf(hiHealthData.getInt("menstrual_sub_status")));
        menstrualBasic.setManualOperation(Integer.valueOf(hiHealthData.getInt("menstrual_manual_operation")));
        menstrualBasic.setDysmenorrhea(Integer.valueOf(hiHealthData.getInt("menstrual_dysmenorrhea")));
        if (menstrualBasic.getDysmenorrhea().intValue() > 10) {
            menstrualBasic.setDysmenorrhea(3);
        }
        menstrualBasic.setMenstrualQuantity(Integer.valueOf(hiHealthData.getInt("menstrual_quantity")));
        if (menstrualBasic.getMenstrualQuantity().intValue() > 10) {
            menstrualBasic.setMenstrualQuantity(3);
        }
        menstrualBasic.setPhysicalStatus(Integer.valueOf(hiHealthData.getInt("menstrual_physical")));
        return menstrualBasic;
    }

    public List<kuk> c(MenstrualTotal menstrualTotal, int i) {
        if (menstrualTotal == null || menstrualTotal.getDeviceCode().longValue() != 0) {
            LogUtil.j("MenstrualStatSwitch", "cloudMenstrualStatToLocal menstrualTotal null or deviceCode not 0");
            return null;
        }
        kym kymVarD = kyn.d(this.f12598c).d(0, i, 0);
        if (kymVarD == null) {
            return null;
        }
        List<kuk> listE = e(menstrualTotal.getMenstrualBasic());
        if (njy.e(listE)) {
            return null;
        }
        int iIntValue = menstrualTotal.getRecordDay().intValue();
        int iC = kymVarD.c();
        String timeZone = menstrualTotal.getTimeZone();
        long jLongValue = menstrualTotal.getGenerateTime().longValue();
        for (kuk kukVar : listE) {
            kukVar.a(iC);
            kukVar.b(iIntValue);
            kukVar.c(timeZone);
            kukVar.i(1);
            kukVar.a(jLongValue);
        }
        return listE;
    }

    private List<kuk> e(MenstrualBasic menstrualBasic) {
        if (menstrualBasic == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(6);
        int iIntValue = menstrualBasic.getStatus().intValue();
        Integer subStatus = menstrualBasic.getSubStatus();
        Integer manualOperation = menstrualBasic.getManualOperation();
        int iIntValue2 = menstrualBasic.getDysmenorrhea().intValue();
        int iIntValue3 = menstrualBasic.getMenstrualQuantity().intValue();
        int iIntValue4 = menstrualBasic.getPhysicalStatus().intValue();
        if (iIntValue >= 0) {
            arrayList.add(lik.d(47401, iIntValue, 0));
        }
        if (subStatus != null && subStatus.intValue() >= 0) {
            arrayList.add(lik.d(47405, subStatus.intValue(), 0));
        }
        if (manualOperation != null && manualOperation.intValue() >= 0) {
            arrayList.add(lik.d(47406, manualOperation.intValue(), 0));
        }
        if (iIntValue2 >= 0) {
            arrayList.add(lik.d(47403, iIntValue2, 0));
        }
        if (iIntValue3 >= 0) {
            arrayList.add(lik.d(47402, iIntValue3, 0));
        }
        if (iIntValue4 >= 0) {
            arrayList.add(lik.d(47404, iIntValue4, 0));
        }
        return arrayList;
    }
}
