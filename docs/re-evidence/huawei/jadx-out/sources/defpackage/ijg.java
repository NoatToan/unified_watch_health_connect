package defpackage;

import com.huawei.health.taskplatform.task.BaseTask;
import com.huawei.taskplatform.TaskEnum;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes31.dex */
public class ijg {
    public static BaseTask d(String str) {
        TaskEnum taskEnumFromTaskId = TaskEnum.fromTaskId(str);
        if (taskEnumFromTaskId == null) {
            ReleaseLogUtil.e("R_TaskPlatform_TaskFactory", "createTask taskEnum null", str);
            return null;
        }
        switch (AnonymousClass4.f37711b[taskEnumFromTaskId.ordinal()]) {
            case 1:
                return new iin(taskEnumFromTaskId);
            case 2:
                return new iiq(taskEnumFromTaskId);
            case 3:
                return new ijc(taskEnumFromTaskId);
            case 4:
                return new ijf(taskEnumFromTaskId);
            case 5:
                return new ijb(taskEnumFromTaskId);
            case 6:
                return new iis(taskEnumFromTaskId);
            case 7:
                return new ijj(taskEnumFromTaskId);
            case 8:
                return new iio(taskEnumFromTaskId);
            case 9:
                return new iiz(taskEnumFromTaskId);
            case 10:
                return new iiw(taskEnumFromTaskId);
            case 11:
                return new iiu(taskEnumFromTaskId);
            case 12:
                return new ijd(taskEnumFromTaskId);
            case 13:
                return new iit(taskEnumFromTaskId);
            case 14:
                return new iji(taskEnumFromTaskId);
            default:
                ReleaseLogUtil.e("R_TaskPlatform_TaskFactory", "createTask other taskID", str);
                return null;
        }
    }

    /* JADX INFO: renamed from: ijg$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f37711b;

        static {
            int[] iArr = new int[TaskEnum.values().length];
            f37711b = iArr;
            try {
                iArr[TaskEnum.ACTIVITY_CALORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37711b[TaskEnum.ACTIVITY_HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37711b[TaskEnum.EXERCISE_DURATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37711b[TaskEnum.STEPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37711b[TaskEnum.SLEEP_DURATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37711b[TaskEnum.BEDTIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37711b[TaskEnum.WAKEUP_TIME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37711b[TaskEnum.AVG_DAILY_PRESSURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37711b[TaskEnum.DECOMP_AND_RELAX.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37711b[TaskEnum.DRINK_WATER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37711b[TaskEnum.CALORIES_INTAKE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37711b[TaskEnum.TAKE_MEDICINE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f37711b[TaskEnum.BLOOD_PRESS_MEASURE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f37711b[TaskEnum.WEIGHT_MEASURE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }
}
