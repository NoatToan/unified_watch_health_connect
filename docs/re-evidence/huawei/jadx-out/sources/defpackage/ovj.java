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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes13.dex */
public class ovj extends BaseCalculator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PluginAchieveAdapter f44864c = getPluginAchieveAdapter();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f44863b = BaseApplication.getContext();

    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(final int i) {
        if (this.f44864c == null || this.f44863b == null) {
            LogUtil.j("PLGACHIEVE_JumpRopeCalculator", "compute: mAchieveAdapter or mContext is null");
            return;
        }
        LogUtil.a("PLGACHIEVE_JumpRopeCalculator", "compute: start");
        this.f44864c.fetchSequenceDataBySportType(this.f44863b, oxi.a(i, true), oxi.a(i, false), 283, new AchieveCallback() { // from class: ovl
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public final void onResponse(int i2, Object obj) {
                this.f44867b.a(i, i2, obj);
            }
        });
    }

    /* synthetic */ void a(int i, int i2, Object obj) {
        List<HiHealthData> list;
        LogUtil.a("PLGACHIEVE_JumpRopeCalculator", "compute: ret -> " + i2);
        if (njy.b(obj, HiHealthData.class)) {
            list = (List) obj;
        } else {
            LogUtil.j("PLGACHIEVE_JumpRopeCalculator", "compute: data is not list");
            list = null;
        }
        insertData(i, EnumAnnualType.REPORT_JUMP_ROPE.value(), e(list));
        LogUtil.a("PLGACHIEVE_JumpRopeCalculator", "compute: end");
    }

    private Map<Integer, String> e(List<HiHealthData> list) {
        int iIntValue;
        long jLongValue;
        HiTrackMetaData hiTrackMetaData;
        HashMap map = new HashMap(2);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        long j = 0;
        if (!njy.e(list)) {
            HashMap<Long, Integer> map2 = new HashMap<>(2);
            for (HiHealthData hiHealthData : list) {
                try {
                    hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
                } catch (JsonSyntaxException e) {
                    LogUtil.e("PLGACHIEVE_JumpRopeCalculator", "computeJumpRopeData: exception -> " + e.getMessage());
                    hiTrackMetaData = null;
                }
                if (hiTrackMetaData == null || oxe.e(hiTrackMetaData)) {
                    LogUtil.j("PLGACHIEVE_JumpRopeCalculator", "computeJumpRopeData: Invalid data -> " + hiTrackMetaData);
                } else {
                    i++;
                    int iB = b(hiTrackMetaData);
                    j += (long) iB;
                    long jP = HiDateUtil.p(hiHealthData.getStartTime());
                    if (!arrayList.contains(Long.valueOf(jP))) {
                        arrayList.add(Long.valueOf(jP));
                    }
                    e(jP, iB, map2);
                }
            }
            Pair<Integer, Long> pairC = c(map2);
            iIntValue = ((Integer) pairC.first).intValue();
            jLongValue = ((Long) pairC.second).longValue();
        } else {
            LogUtil.j("PLGACHIEVE_JumpRopeCalculator", "computeJumpRopeData: jumpRopeDataList is null");
            iIntValue = 0;
            jLongValue = 0;
        }
        map.put(10063, String.valueOf(i));
        map.put(10064, String.valueOf(j));
        map.put(10065, String.valueOf(iIntValue));
        map.put(10066, String.valueOf(jLongValue));
        map.put(10067, String.valueOf(owj.c(arrayList)));
        return map;
    }

    private int b(HiTrackMetaData hiTrackMetaData) {
        if (hiTrackMetaData.getTotalSteps() > 0) {
            return hiTrackMetaData.getTotalSteps();
        }
        Map<String, String> extendTrackMap = hiTrackMetaData.getExtendTrackMap();
        if (extendTrackMap == null || !extendTrackMap.containsKey("skipNum")) {
            return 0;
        }
        return qrs.a(extendTrackMap.get("skipNum"));
    }

    private void e(long j, int i, HashMap<Long, Integer> map) {
        if (map.containsKey(Long.valueOf(j))) {
            Integer num = map.get(Long.valueOf(j));
            map.put(Long.valueOf(j), Integer.valueOf((num == null ? 0 : num.intValue()) + i));
        } else {
            map.put(Long.valueOf(j), Integer.valueOf(i));
        }
    }

    private Pair<Integer, Long> c(HashMap<Long, Integer> map) {
        Optional<Map.Entry<Long, Integer>> optionalMax = map.entrySet().stream().max(Comparator.comparingInt(new ToIntFunction() { // from class: ovr
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((Integer) ((Map.Entry) obj).getValue()).intValue();
            }
        }));
        if (optionalMax.isPresent()) {
            Map.Entry<Long, Integer> entry = optionalMax.get();
            return new Pair<>(entry.getValue(), entry.getKey());
        }
        LogUtil.j("PLGACHIEVE_JumpRopeCalculator", "computeJumpRopeData: !isPresent");
        return new Pair<>(0, 0L);
    }
}
