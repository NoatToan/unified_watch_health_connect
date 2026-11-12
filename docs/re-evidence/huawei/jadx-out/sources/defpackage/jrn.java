package defpackage;

import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.healthcloud.plugintrack.ui.map.datapreprocess.MapDataPreprocessor;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jrn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f38939b = "Track_PreprocessorPicker";

    public static MapDataPreprocessor e(List<MotionData> list, MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify.requestTrackType() == 8) {
            return new jri(list, motionPathSimplify);
        }
        if (motionPathSimplify.requestSportType() == 512) {
            return new jrk(list, motionPathSimplify);
        }
        for (MotionData motionData : list) {
            if (njy.b(motionData.requestMarkPointList())) {
                LogUtil.a(f38939b, "pick MarkerPointPreprocessor");
                return new jrj(list, motionPathSimplify);
            }
            if (njy.b(motionData.getPaceList())) {
                LogUtil.a(f38939b, "pick PaceMapLineDataPreprocessor");
                return new jro(list, motionPathSimplify);
            }
            if (!njy.e(motionData.requestSegmentList())) {
                LogUtil.a(f38939b, "pick SegmentLineDataPreprocessor");
                return new jrq(list, motionPathSimplify);
            }
        }
        LogUtil.a(f38939b, "pick LineDataPreprocessor");
        return new jrk(list, motionPathSimplify);
    }
}
