package com.xiaomi.hm.health.ui.sportfitness.manager;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.ui.sportfitness.model.ExerciseInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class ExerciseInfoManager {
    private static final String d = "ExerciseInfoManager";
    private static volatile ExerciseInfoManager e;
    private List<String> a;
    private Map<String, List<ExerciseInfo>> b;
    private String c;

    private ExerciseInfoManager() {
    }

    public static ExerciseInfoManager getInstance() {
        if (e == null) {
            synchronized (ExerciseInfoManager.class) {
                if (e == null) {
                    e = new ExerciseInfoManager();
                }
            }
        }
        return e;
    }

    public void deInitChartData() {
        this.b = null;
        this.a = null;
    }

    public String getEarliestReqDate() {
        return this.c;
    }

    public List<ExerciseInfo> getExerciseInfosByKey(String range) {
        Map<String, List<ExerciseInfo>> map = this.b;
        if (map == null) {
            return null;
        }
        return map.get(range);
    }

    public String getRangeByPosition(int pos) {
        List<String> list = this.a;
        String str = (list == null || list.size() <= pos) ? "" : this.a.get(pos);
        HMLog.d(d, "pos=" + pos + ",range=" + str, new Object[0]);
        return str;
    }

    public List<String> getRanges() {
        return this.a;
    }

    public void setEarliestReqDate(String earliestReqDate) {
        this.c = earliestReqDate;
    }

    public void setExerCharDataMap(String range, List<ExerciseInfo> list) {
        boolean z;
        if (this.b == null) {
            this.b = new HashMap();
            this.a = new ArrayList();
        }
        Iterator<ExerciseInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            HMLog.d(d, "setExerCharDataMap exerciseInfo =" + it2.next(), new Object[0]);
        }
        Iterator<String> it3 = this.a.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z = false;
                break;
            } else if (it3.next().equals(range)) {
                z = true;
                break;
            }
        }
        if (!z) {
            this.a.add(range);
        }
        Iterator<String> it4 = this.a.iterator();
        while (it4.hasNext()) {
            HMLog.d(d, "setExerCharDataMap range =" + it4.next(), new Object[0]);
        }
        this.b.put(range, list);
    }

    public void setRanges(List<String> ranges) {
        this.a = ranges;
    }
}
