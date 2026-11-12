package defpackage;

import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class njz {
    public static int e(float f, List<njg> list) {
        if (f > 360.0f) {
            ReleaseLogUtil.a("Track_AbnormalSkipUtil", "avgSkipSpeed SKIP_SPEED_ABNORMAL", Float.valueOf(f));
            return 1;
        }
        if (njy.e(list)) {
            return 0;
        }
        for (njg njgVar : list) {
            if (njgVar != null && njgVar.c() > 360) {
                ReleaseLogUtil.a("Track_AbnormalSkipUtil", "list SKIP_SPEED_ABNORMAL", Integer.valueOf(njgVar.c()));
                return 1;
            }
        }
        return 0;
    }
}
