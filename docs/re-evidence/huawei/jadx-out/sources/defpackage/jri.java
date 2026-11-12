package defpackage;

import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSportType;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class jri extends jrk {
    private static final Map<Integer, Integer> i;
    private static final Map<Integer, Integer> j;

    static {
        HashMap map = new HashMap(16);
        j = map;
        HashMap map2 = new HashMap(16);
        i = map2;
        map.put(Integer.valueOf(FitnessSportType.HW_FITNESS_SPORT_ALL), 258);
        map.put(227, 258);
        map.put(258, 258);
        map.put(Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE), 258);
        map.put(264, 258);
        map.put(259, 259);
        map2.put(258, Integer.valueOf(d));
        map2.put(259, Integer.valueOf(e));
    }

    public jri(List<MotionData> list, MotionPathSimplify motionPathSimplify) {
        super(list, motionPathSimplify);
    }

    @Override // defpackage.jrk, com.huawei.healthcloud.plugintrack.ui.map.datapreprocess.MapDataPreprocessor
    public List<jrp> preprocess() {
        ArrayList arrayList = new ArrayList();
        jrp jrpVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            MotionData motionData = this.h.get(i3);
            if (motionData != null) {
                int sportType = motionData.getSportType();
                Map<Integer, Integer> map = j;
                if (!Objects.equals(map.get(Integer.valueOf(sportType)), map.get(Integer.valueOf(i2)))) {
                    jrpVar = new jrp();
                    jrpVar.c(sportType);
                    arrayList.add(jrpVar);
                    i2 = sportType;
                }
                Map<Long, double[]> lbsDataMap = motionData.getLbsDataMap();
                e(lbsDataMap);
                a(lbsDataMap, jrpVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e((jrp) it.next());
        }
        return arrayList;
    }

    @Override // defpackage.jrk
    protected int b(int i2, int i3) {
        if (i3 == 2) {
            return qre.e(R.color.pause_line);
        }
        return i.getOrDefault(j.get(Integer.valueOf(i2)), Integer.valueOf(f38935c)).intValue();
    }
}
