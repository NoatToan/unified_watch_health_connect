package defpackage;

import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.healthcloud.plugintrack.ui.map.datapreprocess.MapDataPreprocessor;
import com.huawei.hwfoundationmodel.trackmodel.MarkPoint;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jrj extends jrk implements MapDataPreprocessor {
    private static final String i = "Track_MarkerPointPreprocessor";

    public jrj(List<MotionData> list, MotionPathSimplify motionPathSimplify) {
        super(list, motionPathSimplify);
    }

    @Override // defpackage.jrk, com.huawei.healthcloud.plugintrack.ui.map.datapreprocess.MapDataPreprocessor
    public List<jrp> preprocess() {
        List<jrp> listPreprocess = super.preprocess();
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            listPreprocess.get(i2).d(izt.d((List<MarkPoint>) this.h.get(i2).requestMarkPointList(), false));
        }
        LogUtil.a(i, "checkOutput ", listPreprocess.toString());
        return listPreprocess;
    }
}
