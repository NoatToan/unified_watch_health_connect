package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.transformer.ExportException;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.BaseCalculator;
import com.huawei.up.model.UserInfomation;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class owc extends BaseCalculator {
    private PluginAchieveAdapter e = getPluginAchieveAdapter();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f44903c = BaseApplication.getContext();

    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(int i) {
        c(i, i);
    }

    public void c(int i) {
        c(i - 1, i);
    }

    public void c(final int i, final int i2) {
        LogUtil.a("PLGACHIEVE_WeightCalculator", "getAnnualWeighData ENTER");
        this.e.getWeightData(this.f44903c, oxi.a(i, true), oxi.a(i2, false), new AchieveCallback() { // from class: owc.3
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i3, Object obj) {
                if (obj == null) {
                    LogUtil.a("PLGACHIEVE_WeightCalculator", "getWeightData is null,return");
                    return;
                }
                if (!njy.b(obj, HiHealthData.class)) {
                    LogUtil.a("PLGACHIEVE_WeightCalculator", "getWeightData obj type cast,return");
                    return;
                }
                try {
                    owc.this.e((List) obj, i, i2);
                } catch (ClassCastException unused) {
                    LogUtil.e("PLGACHIEVE_WeightCalculator", "getWeightData data ClassCastException");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<HiHealthData> list, int i, int i2) {
        List<HiHealthData> listB = b(list);
        if (njy.e(listB)) {
            return;
        }
        if (i == i2) {
            b(listB, i2);
        } else {
            c(c(listB, i2, i2), c(listB, i2 - 1, i2), i2);
        }
    }

    private List<HiHealthData> b(List<HiHealthData> list) {
        if (njy.e(list)) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            String metaData = hiHealthData.getMetaData();
            if (TextUtils.isEmpty(metaData) || Constants.NULL.equalsIgnoreCase(metaData) || "0".equals(metaData)) {
                arrayList.add(hiHealthData);
            }
        }
        return arrayList;
    }

    private void b(List<HiHealthData> list, int i) {
        LogUtil.a("PLGACHIEVE_WeightCalculator", "computeWeightData");
        if (njy.e(list)) {
            return;
        }
        int size = list.size();
        if (size < 3) {
            LogUtil.a("PLGACHIEVE_WeightCalculator", "computeWeightData size=", Integer.valueOf(size));
            return;
        }
        HiHealthData hiHealthData = list.get(size - 1);
        HiHealthData hiHealthData2 = list.get(0);
        double d = hiHealthData.getDouble("bodyWeight");
        double d2 = hiHealthData.getDouble("bodyWeight");
        double d3 = hiHealthData2.getDouble("bodyWeight");
        double d4 = hiHealthData.getDouble("bodyWeight");
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            double d5 = it.next().getDouble("bodyWeight");
            if (paw.b(d5, d2) > 0) {
                d2 = d5;
            }
            if (paw.b(d5, d) < 0) {
                d = d5;
            }
        }
        insertData(i, EnumAnnualType.REPORT_WEIGHT.value(), 7001, String.valueOf(d3 - d4));
        insertData(i, EnumAnnualType.REPORT_WEIGHT.value(), ExportException.ERROR_CODE_MUXING_TIMEOUT, String.valueOf(d2));
        insertData(i, EnumAnnualType.REPORT_WEIGHT.value(), ExportException.ERROR_CODE_MUXING_APPEND, String.valueOf(d));
    }

    private double c(List<HiHealthData> list, int i, int i2) {
        double d;
        double d2;
        double d3 = 0.0d;
        if (njy.e(list)) {
            return 0.0d;
        }
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        int height = userInfo != null ? userInfo.getHeight() : 0;
        long startTime = 0;
        double d4 = 0.0d;
        double d5 = 0.0d;
        double d6 = 0.0d;
        double d7 = 0.0d;
        double dMax = 0.0d;
        double d8 = 0.0d;
        int i3 = 0;
        for (HiHealthData hiHealthData : list) {
            if (String.valueOf(i).equals(oxi.b(hiHealthData.getStartTime()))) {
                double dMin = hiHealthData.getDouble("bodyWeight");
                d = d6;
                if (paw.b(dMin, 0.0d) > 0) {
                    if (startTime < hiHealthData.getStartTime()) {
                        startTime = hiHealthData.getStartTime();
                        d5 = hiHealthData.getDouble("height");
                        d2 = hiHealthData.getDouble(BleConstants.BMI);
                        d4 = dMin;
                    } else {
                        d2 = d;
                    }
                    i3++;
                    d7 += dMin;
                    double d9 = d2;
                    dMax = Math.max(dMax, dMin);
                    double d10 = d8;
                    if (d10 != 0.0d) {
                        dMin = Math.min(d10, dMin);
                    }
                    d8 = dMin;
                    d3 = 0.0d;
                    d6 = d9;
                }
            } else {
                d = d6;
            }
            d6 = d;
            d3 = 0.0d;
        }
        double d11 = d6;
        double d12 = dMax;
        double d13 = i3 == 0 ? d3 : d7 / ((double) i3);
        if (i == i2) {
            a(i, i3, d13, c(d4, d5, height, d11), d12, d8);
        }
        return d13;
    }

    private void a(int i, int i2, double d, double d2, double d3, double d4) {
        HashMap map = new HashMap(2);
        map.put(10013, String.valueOf(i2));
        map.put(10012, UnitUtil.e(d, 1, 2));
        map.put(Integer.valueOf(PrebakedEffectId.RT_LIGHTNING), UnitUtil.e(d2, 1, 1));
        map.put(Integer.valueOf(ExportException.ERROR_CODE_MUXING_TIMEOUT), String.valueOf(d3));
        map.put(Integer.valueOf(ExportException.ERROR_CODE_MUXING_APPEND), String.valueOf(d4));
        insertData(i, EnumAnnualType.REPORT_HEALTH.value(), map);
    }

    private double c(double d, double d2, int i, double d3) {
        if (paw.b(d3, 0.0d) != 0) {
            LogUtil.a("PLGACHIEVE_WeightCalculator", "getBmi bmi ", Double.valueOf(d3));
            return d3;
        }
        if (paw.b(d2, 0.0d) != 0) {
            double dC = exz.c(d, (int) d2);
            LogUtil.a("PLGACHIEVE_WeightCalculator", "getBmi weightBmi ", Double.valueOf(dC));
            return dC;
        }
        if (i == 0) {
            return d3;
        }
        double dC2 = exz.c(d, i);
        LogUtil.a("PLGACHIEVE_WeightCalculator", "getBmi userBmi ", Double.valueOf(dC2));
        return dC2;
    }

    private void c(double d, double d2, int i) {
        insertData(i, EnumAnnualType.REPORT_HEALTH.value(), PrebakedEffectId.RT_CALENDAR_DATE, UnitUtil.e(d - d2, 1, 2));
    }
}
