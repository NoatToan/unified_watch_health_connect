package health.compact.a;

import com.huawei.health.provider.cursor.BaseStatisticsHealthCursor;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class StatisticsSportHealthCursor extends BaseStatisticsHealthCursor {
    public StatisticsSportHealthCursor(Map<String, Object> map) {
        super(map);
    }

    @Override // com.huawei.health.provider.cursor.HealthCursor
    public void addColumnName() {
        addColumnName("start_time");
        addColumnName("end_time");
        addColumnName("steps_sum");
        addColumnName("steps_max");
        addColumnName("steps_max_day");
        addColumnName("distances_sum");
        addColumnName(ParsedFieldTag.CALORIES_SUM);
        addColumnName("duration_sum");
        addColumnName("walk_steps_sum");
        addColumnName("walk_distances_sum");
        addColumnName("walk_calories_sum");
        addColumnName("walk_uration_um");
        addColumnName("step_goal");
        addColumnName("support_version");
        addColumnName("is_browse_mode");
        addColumnName("is_oversea");
        addColumnName("is_authorized");
        addColumnName("app_authorized");
        addColumnName("run_steps_sum");
        addColumnName("run_distances_sum");
        addColumnName("run_calories_sum");
        addColumnName("run_duration_sum");
        addColumnName("climb_steps_sum");
        addColumnName("climb_distances_sum");
        addColumnName("climb_calories_sum");
        addColumnName("climb_duration_sum");
        addColumnName("cycle_steps_sum");
        addColumnName("cycle_distances_sum");
        addColumnName("cycle_calories_sum");
        addColumnName("cycle_duration_sum");
        addColumnName("app_ability_set");
    }

    @Override // com.huawei.health.provider.cursor.HealthCursor
    public void addData() {
        if (this.mDataMap == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(String.valueOf(this.mDataMap.get("time")));
        arrayList.add(String.valueOf(this.mDataMap.get("time")));
        arrayList.add(String.valueOf(this.mDataMap.get("step")));
        ArrayList arrayListA = a(arrayList, 2);
        arrayListA.add(String.valueOf(this.mDataMap.get("distance")));
        arrayListA.add(String.valueOf(this.mDataMap.get("carior")));
        arrayListA.add(String.valueOf(this.mDataMap.get("duration")));
        arrayListA.add(String.valueOf(this.mDataMap.get("step")));
        arrayListA.add(String.valueOf(this.mDataMap.get("distance")));
        arrayListA.add(String.valueOf(this.mDataMap.get("carior")));
        arrayListA.add(String.valueOf(this.mDataMap.get("duration")));
        arrayListA.add(String.valueOf(this.mDataMap.get("step_goal")));
        arrayListA.add(String.valueOf(this.mDataMap.get("support_version")));
        arrayListA.add(String.valueOf(this.mDataMap.get("is_browse_mode")));
        arrayListA.add(String.valueOf(this.mDataMap.get("is_oversea")));
        arrayListA.add(String.valueOf(this.mDataMap.get("is_authorized")));
        arrayListA.add(String.valueOf(this.mDataMap.get("app_authorized")));
        ArrayList arrayListA2 = a(arrayListA, 12);
        arrayListA2.add("1");
        addRowData(arrayListA2);
    }

    private ArrayList a(ArrayList arrayList, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(null);
        }
        return arrayList;
    }
}
