package defpackage;

import android.content.Context;
import android.util.Pair;
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
import health.compact.a.HiDateUtil;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes13.dex */
public class ous extends BaseCalculator {
    private final PluginAchieveAdapter e = getPluginAchieveAdapter();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f44822b = BaseApplication.getContext();

    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(final int i) {
        if (this.e == null || this.f44822b == null) {
            LogUtil.j("PLGACHIEVE_BadmintonCalculator", "compute: mAchieveAdapter or mContext is null");
            return;
        }
        LogUtil.a("PLGACHIEVE_BadmintonCalculator", "compute: start");
        this.e.fetchSequenceDataBySportType(this.f44822b, oxi.a(i, true), oxi.a(i, false), 129, new AchieveCallback() { // from class: ouw
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public final void onResponse(int i2, Object obj) {
                this.d.a(i, i2, obj);
            }
        });
    }

    /* synthetic */ void a(int i, int i2, Object obj) {
        List<HiHealthData> list;
        LogUtil.a("PLGACHIEVE_BadmintonCalculator", "compute: ret -> " + i2);
        if (njy.b(obj, HiHealthData.class)) {
            list = (List) obj;
        } else {
            LogUtil.j("PLGACHIEVE_BadmintonCalculator", "compute: data is not list");
            list = null;
        }
        insertData(i, EnumAnnualType.REPORT_BADMINTON.value(), c(list));
        LogUtil.a("PLGACHIEVE_BadmintonCalculator", "compute: end");
    }

    private Map<Integer, String> c(List<HiHealthData> list) {
        long jLongValue;
        long jLongValue2;
        HiTrackMetaData hiTrackMetaData;
        HashMap map = new HashMap(2);
        int i = 0;
        long totalTime = 0;
        if (!njy.e(list)) {
            HashMap<Long, Long> map2 = new HashMap<>(2);
            for (HiHealthData hiHealthData : list) {
                try {
                    hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
                } catch (JsonSyntaxException e) {
                    LogUtil.e("PLGACHIEVE_BadmintonCalculator", "computeBadmintonData: exception -> " + e.getMessage());
                    hiTrackMetaData = null;
                }
                if (hiTrackMetaData == null || oxe.e(hiTrackMetaData)) {
                    LogUtil.j("PLGACHIEVE_BadmintonCalculator", "computeBadmintonData: Invalid data -> " + hiTrackMetaData);
                } else {
                    i++;
                    totalTime += hiTrackMetaData.getTotalTime();
                    e(hiHealthData.getStartTime(), hiTrackMetaData.getTotalTime(), map2);
                }
            }
            Pair<Long, Long> pairC = c(map2);
            jLongValue = ((Long) pairC.first).longValue();
            jLongValue2 = ((Long) pairC.second).longValue();
        } else {
            LogUtil.j("PLGACHIEVE_BadmintonCalculator", "computeBadmintonData: badmintonDataList is null");
            jLongValue = 0;
            jLongValue2 = 0;
        }
        map.put(10059, String.valueOf(i));
        map.put(10060, String.valueOf(oxi.c(totalTime)));
        map.put(10061, String.valueOf(oxi.c(jLongValue)));
        map.put(10062, String.valueOf(jLongValue2));
        return map;
    }

    private void e(long j, long j2, HashMap<Long, Long> map) {
        long jP = HiDateUtil.p(j);
        if (map.containsKey(Long.valueOf(jP))) {
            Long l = map.get(Long.valueOf(jP));
            map.put(Long.valueOf(jP), Long.valueOf((l == null ? 0L : l.longValue()) + j2));
        } else {
            map.put(Long.valueOf(jP), Long.valueOf(j2));
        }
    }

    private Pair<Long, Long> c(HashMap<Long, Long> map) {
        Optional<Map.Entry<Long, Long>> optionalMax = map.entrySet().stream().max(Comparator.comparingLong(new ToLongFunction() { // from class: ouu
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((Long) ((Map.Entry) obj).getValue()).longValue();
            }
        }));
        if (optionalMax.isPresent()) {
            Map.Entry<Long, Long> entry = optionalMax.get();
            return new Pair<>(entry.getValue(), entry.getKey());
        }
        LogUtil.j("PLGACHIEVE_BadmintonCalculator", "computeBadmintonData: !isPresent");
        return new Pair<>(0L, 0L);
    }
}
