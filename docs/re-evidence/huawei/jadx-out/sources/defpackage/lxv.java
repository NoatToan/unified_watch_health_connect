package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hwcommonmodel.fitnessdatatype.MotionGoal;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lxv {

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f41101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f41102b;
        private int d;

        private d() {
            this.d = 0;
            this.f41102b = "";
            this.f41101a = 0;
        }

        static /* synthetic */ int c(d dVar, int i) {
            int i2 = dVar.f41101a + i;
            dVar.f41101a = i2;
            return i2;
        }

        static /* synthetic */ int d(d dVar, int i) {
            int i2 = dVar.d + i;
            dVar.d = i2;
            return i2;
        }
    }

    public static byte[] c(List<MotionGoal> list) {
        String str = "";
        if (list != null && list.size() > 0) {
            String str2 = "" + eeq.d(129);
            d dVar = new d();
            for (MotionGoal motionGoal : list) {
                dVar.f41102b += eeq.d(3) + eeq.d(1) + eeq.d(motionGoal.getGoalType());
                d.d(dVar, 3);
                d.c(dVar, 3);
                d dVarA = a(motionGoal, dVar);
                int iC = c(motionGoal);
                int dutationGoal = -1;
                if (iC != -1) {
                    dVarA = d(iC, dVarA);
                }
                int iC2 = c();
                d dVarA2 = a(iC, iC2, (motionGoal.getDataType() & 4) != 0 ? motionGoal.getDutationGoal() : -1, c(iC, iC2, (motionGoal.getDataType() & 2) != 0 ? motionGoal.getCalorieGoal() : -1, dVarA));
                if ((motionGoal.getDataType() & 8) != 0) {
                    dutationGoal = motionGoal.getDutationGoal();
                }
                dVar = a(dutationGoal, dVarA2);
                dVar.f41102b = eeq.d(130) + eeq.d(dVar.f41101a) + dVar.f41102b;
                d.d(dVar, 2);
                str = str + dVar.f41102b;
            }
            String strD = eeq.d(dVar.d);
            if (dVar.d > 127) {
                strD = eeq.d((dVar.d >> 8) + 128) + eeq.d(dVar.d & 255);
            }
            str = str2 + strD + str;
        }
        return eeq.c(str);
    }

    private static int c() {
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC != null) {
            return deviceCapabilityC.getFitnessFrameType();
        }
        LogUtil.j("FitnessPackageGoal", "setGoal deviceCapability is null");
        return -1;
    }

    private static d a(MotionGoal motionGoal, d dVar) {
        dVar.f41102b += eeq.d(4) + eeq.d(1);
        if (c() == 1) {
            dVar.f41102b += eeq.d(1);
        } else {
            dVar.f41102b += eeq.d(motionGoal.getMotionType());
        }
        d.d(dVar, 3);
        d.c(dVar, 3);
        return dVar;
    }

    private static int c(MotionGoal motionGoal) {
        if ((motionGoal.getDataType() & 1) != 0) {
            return motionGoal.getStepGoal();
        }
        return -1;
    }

    private static d d(int i, d dVar) {
        dVar.f41102b += eeq.d(5) + eeq.d(4) + eeq.d(i >> 24) + eeq.d((i >> 16) & 255) + eeq.d((i >> 8) & 255) + eeq.d(i & 255);
        d.d(dVar, 6);
        d.c(dVar, 6);
        return dVar;
    }

    private static d c(int i, int i2, int i3, d dVar) {
        if (i3 != -1) {
            dVar.f41102b += eeq.d(6) + eeq.d(4) + eeq.c(i3);
            d.d(dVar, 6);
            d.c(dVar, 6);
            return dVar;
        }
        if (i2 == 1) {
            dVar.f41102b += eeq.d(6) + eeq.d(4) + eeq.c(i / 30);
            d.d(dVar, 6);
            d.c(dVar, 6);
            return dVar;
        }
        LogUtil.j("FitnessPackageGoal", "goal calorie is invalid");
        return dVar;
    }

    private static d a(int i, int i2, int i3, d dVar) {
        if (i3 != -1) {
            dVar.f41102b += eeq.d(7) + eeq.d(4) + eeq.c(i3);
            d.d(dVar, 6);
            d.c(dVar, 6);
            return dVar;
        }
        if (i2 == 1) {
            dVar.f41102b += eeq.d(7) + eeq.d(4) + eeq.c(i);
            d.d(dVar, 6);
            d.c(dVar, 6);
            return dVar;
        }
        LogUtil.j("FitnessPackageGoal", "makeGoalDistance else goalDistance:", Integer.valueOf(i3), ", dataType:", Integer.valueOf(i2));
        return dVar;
    }

    private static d a(int i, d dVar) {
        if (i != -1) {
            dVar.f41102b += eeq.d(8) + eeq.d(2) + eeq.e(i);
            d.d(dVar, 4);
            d.c(dVar, 4);
        }
        return dVar;
    }
}
