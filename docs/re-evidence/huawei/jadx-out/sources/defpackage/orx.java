package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.manager.model.TotalRecord;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class orx {
    private static long e;

    private static int a(Context context, PluginAchieveAdapter pluginAchieveAdapter, TotalRecord totalRecord) {
        return (context == null || pluginAchieveAdapter == null || totalRecord == null) ? -1 : 0;
    }

    public static void d(final Context context, PluginAchieveAdapter pluginAchieveAdapter, final TotalRecord totalRecord) {
        if (a(context, pluginAchieveAdapter, totalRecord) == -1) {
            return;
        }
        pluginAchieveAdapter.getSumYearData(context, 0L, pap.c(false, System.currentTimeMillis()), 21, new AchieveCallback() { // from class: orx.1
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i, Object obj) {
                orx.c(context, totalRecord, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void c(Context context, TotalRecord totalRecord, T t) {
        if (!njy.b(t, HiHealthData.class)) {
            LogUtil.j("PLGACHIEVE_TotalRecordRule", "saveAchieveSumData is null");
            return;
        }
        List<HiHealthData> list = (List) t;
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_TotalRecordRule", "saveAchieveSumData dataInfos is null,return");
            return;
        }
        int i = 0;
        int i2 = 0;
        long j = 0;
        for (HiHealthData hiHealthData : list) {
            i2 += hiHealthData.getInt("totalStep");
            j += hiHealthData.getLong("totalCalorie");
            i += hiHealthData.getInt(BleConstants.TOTAL_DISTANCE);
        }
        totalRecord.setDistance(paw.c(i));
        totalRecord.setSteps(i2);
        totalRecord.saveCalorie(j);
        long j2 = e;
        if (j2 != 0) {
            totalRecord.setStartDate(j2);
        }
        LogUtil.a("PLGACHIEVE_TotalRecordRule", "achieveRe value ==", Integer.valueOf(i2), ",sweep ==", Long.valueOf(j), ",lang ==", Integer.valueOf(i), " mStartTime", Long.valueOf(e));
        otl.b(context).a(totalRecord);
    }
}
