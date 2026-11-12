package defpackage;

import com.xiaomi.fitness.account.HrZone;
import com.xiaomi.fitness.account.HrZoneLevel;
import com.xiaomi.fitness.detail.model.HrmZoneLevel;
import com.xiaomi.fitness.detail.util.HrmUtil;

/* JADX INFO: loaded from: classes8.dex */
public class mfc {
    public static int a(int i) {
        HrZoneLevel hrZone = new HrZone().getHrZone(i);
        HrmZoneLevel hrmZoneLevel = HrmUtil.getHrmZoneLevel(i, hrZone);
        if (hrZone == HrZoneLevel.Extreme) {
            if (hrmZoneLevel == HrmZoneLevel.Bo) {
                return x44.a(dki.K);
            }
            return hrmZoneLevel == HrmZoneLevel.Zhong ? x44.a(dki.M) : x44.a(dki.L);
        }
        if (hrZone == HrZoneLevel.Anaerobic) {
            if (hrmZoneLevel == HrmZoneLevel.Bo) {
                return x44.a(dki.H);
            }
            return hrmZoneLevel == HrmZoneLevel.Zhong ? x44.a(dki.J) : x44.a(dki.I);
        }
        if (hrZone == HrZoneLevel.Aerobic) {
            if (hrmZoneLevel == HrmZoneLevel.Bo) {
                return x44.a(dki.E);
            }
            return hrmZoneLevel == HrmZoneLevel.Zhong ? x44.a(dki.G) : x44.a(dki.F);
        }
        if (hrZone == HrZoneLevel.FatBurning) {
            if (hrmZoneLevel == HrmZoneLevel.Bo) {
                return x44.a(dki.N);
            }
            return hrmZoneLevel == HrmZoneLevel.Zhong ? x44.a(dki.P) : x44.a(dki.O);
        }
        if (hrmZoneLevel == HrmZoneLevel.Bo) {
            return x44.a(dki.Q);
        }
        return hrmZoneLevel == HrmZoneLevel.Zhong ? x44.a(dki.S) : x44.a(dki.R);
    }
}
