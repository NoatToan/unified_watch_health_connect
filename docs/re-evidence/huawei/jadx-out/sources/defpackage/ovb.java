package defpackage;

import android.content.Context;
import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.BaseCalculator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class ovb extends BaseCalculator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PluginAchieveAdapter f44834c = getPluginAchieveAdapter();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f44833b = BaseApplication.getContext();

    private float d(float f) {
        if (f == Float.MIN_VALUE || f == Float.MAX_VALUE) {
            return 0.0f;
        }
        return f;
    }

    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(final int i) {
        if (this.f44834c == null || this.f44833b == null) {
            LogUtil.j("PLGACHIEVE_ClimbHillCalculator", "compute: mAchieveAdapter or mContext is null");
            return;
        }
        LogUtil.a("PLGACHIEVE_ClimbHillCalculator", "compute: start");
        this.f44834c.fetchSequenceDataBySportType(this.f44833b, oxi.a(i, true), oxi.a(i, false), 260, new AchieveCallback() { // from class: ouz
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public final void onResponse(int i2, Object obj) {
                this.e.b(i, i2, obj);
            }
        });
    }

    /* synthetic */ void b(int i, int i2, Object obj) {
        List<HiHealthData> list;
        LogUtil.a("PLGACHIEVE_ClimbHillCalculator", "compute: ret -> " + i2);
        if (njy.b(obj, HiHealthData.class)) {
            list = (List) obj;
        } else {
            LogUtil.j("PLGACHIEVE_ClimbHillCalculator", "compute: data is not list");
            list = null;
        }
        insertData(i, EnumAnnualType.REPORT_CLIMB_HILL.value(), c(list));
        LogUtil.a("PLGACHIEVE_ClimbHillCalculator", "compute: end");
    }

    public Map<Integer, String> c(List<HiHealthData> list) {
        int totalDistance;
        String strValueOf;
        String strValueOf2;
        HiTrackMetaData hiTrackMetaData;
        HashMap map = new HashMap(2);
        int i = 0;
        float f = 0.0f;
        long j = 0;
        HiTrackMetaData hiTrackMetaData2 = null;
        if (!njy.e(list)) {
            totalDistance = 0;
            long startTime = 0;
            HiTrackMetaData hiTrackMetaData3 = null;
            float f2 = 0.0f;
            for (HiHealthData hiHealthData : list) {
                try {
                    hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
                } catch (JsonSyntaxException e) {
                    LogUtil.e("PLGACHIEVE_ClimbHillCalculator", "computeClimbHillData: exception -> " + e.getMessage());
                    hiTrackMetaData = null;
                }
                if (hiTrackMetaData != null && hiTrackMetaData.getSportType() == 260) {
                    if (oxe.e(hiTrackMetaData)) {
                        LogUtil.j("PLGACHIEVE_ClimbHillCalculator", "computeClimbHillData: Invalid data -> " + hiTrackMetaData);
                    } else {
                        i++;
                        totalDistance += hiTrackMetaData.getTotalDistance();
                        float fD = d(hiTrackMetaData.getMaxAlti());
                        f += fD;
                        if (fD >= f2) {
                            startTime = hiHealthData.getStartTime();
                            hiTrackMetaData3 = hiTrackMetaData;
                            f2 = fD;
                        }
                    }
                }
            }
            hiTrackMetaData2 = hiTrackMetaData3;
            j = startTime;
        } else {
            LogUtil.j("PLGACHIEVE_ClimbHillCalculator", "computeClimbHillData: climbHillDataList is null");
            totalDistance = 0;
        }
        map.put(10051, String.valueOf(i));
        map.put(10052, String.valueOf(totalDistance));
        map.put(10053, String.valueOf(f));
        map.put(10055, String.valueOf(j));
        String strValueOf3 = "0";
        if (hiTrackMetaData2 == null) {
            strValueOf = "0";
        } else {
            strValueOf = String.valueOf(hiTrackMetaData2.getTotalDistance());
        }
        map.put(10056, strValueOf);
        if (hiTrackMetaData2 != null) {
            strValueOf3 = String.valueOf(oxi.c(hiTrackMetaData2.getTotalTime()));
        }
        map.put(10057, strValueOf3);
        String strValueOf4 = "0.0";
        if (hiTrackMetaData2 == null) {
            strValueOf2 = "0.0";
        } else {
            strValueOf2 = String.valueOf(d(hiTrackMetaData2.getMaxAlti()));
        }
        map.put(10054, strValueOf2);
        if (hiTrackMetaData2 != null) {
            strValueOf4 = String.valueOf(d(hiTrackMetaData2.getCreepingWave()) / 10.0f);
        }
        map.put(10058, strValueOf4);
        return map;
    }
}
