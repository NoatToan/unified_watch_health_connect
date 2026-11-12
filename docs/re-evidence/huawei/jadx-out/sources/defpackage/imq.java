package defpackage;

import com.huawei.health.trusport_ee_jni.TruSport_EE_instance_t;
import com.huawei.health.trusport_ee_jni.TruSport_EE_profile_t;
import com.huawei.health.trusport_ee_jni.TruSport_EE_result_t;
import com.huawei.health.trusport_ee_jni.TruSport_EE_sample_t;
import com.huawei.health.trusport_ee_jni.trusport_eeConstants;
import com.huawei.health.trusport_ee_jni.trusport_eeJNI;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes32.dex */
public class imq implements trusport_eeConstants {
    public static imm d(TruSport_EE_instance_t truSport_EE_instance_t) {
        return imm.b(trusport_eeJNI.TruSport_EE_Init(TruSport_EE_instance_t.c(truSport_EE_instance_t), truSport_EE_instance_t));
    }

    public static imm c(TruSport_EE_instance_t truSport_EE_instance_t, TruSport_EE_profile_t truSport_EE_profile_t) {
        return imm.b(trusport_eeJNI.TruSport_EE_SetProfile(TruSport_EE_instance_t.c(truSport_EE_instance_t), truSport_EE_instance_t, TruSport_EE_profile_t.b(truSport_EE_profile_t), truSport_EE_profile_t));
    }

    public static imm a(TruSport_EE_instance_t truSport_EE_instance_t, float f) {
        return imm.b(trusport_eeJNI.TruSport_EE_SetVo2Max(TruSport_EE_instance_t.c(truSport_EE_instance_t), truSport_EE_instance_t, f));
    }

    public static imm b(TruSport_EE_instance_t truSport_EE_instance_t, BigInteger bigInteger, iml imlVar) {
        return imm.b(trusport_eeJNI.TruSport_EE_SetActivity(TruSport_EE_instance_t.c(truSport_EE_instance_t), truSport_EE_instance_t, bigInteger, imlVar.d()));
    }

    public static imm e(TruSport_EE_sample_t truSport_EE_sample_t) {
        return imm.b(trusport_eeJNI.TruSport_EE_InitSample(TruSport_EE_sample_t.e(truSport_EE_sample_t), truSport_EE_sample_t));
    }

    public static imm d(TruSport_EE_instance_t truSport_EE_instance_t, TruSport_EE_sample_t truSport_EE_sample_t, TruSport_EE_result_t truSport_EE_result_t) {
        return imm.b(trusport_eeJNI.TruSport_EE_PushSample(TruSport_EE_instance_t.c(truSport_EE_instance_t), truSport_EE_instance_t, TruSport_EE_sample_t.e(truSport_EE_sample_t), truSport_EE_sample_t, TruSport_EE_result_t.b(truSport_EE_result_t), truSport_EE_result_t));
    }

    public static imm b(TruSport_EE_instance_t truSport_EE_instance_t, BigInteger bigInteger, TruSport_EE_result_t truSport_EE_result_t) {
        return imm.b(trusport_eeJNI.TruSport_EE_UpdateEe(TruSport_EE_instance_t.c(truSport_EE_instance_t), truSport_EE_instance_t, bigInteger, TruSport_EE_result_t.b(truSport_EE_result_t), truSport_EE_result_t));
    }

    public static imm c(TruSport_EE_instance_t truSport_EE_instance_t, BigInteger bigInteger, long j, TruSport_EE_result_t truSport_EE_result_t) {
        return imm.b(trusport_eeJNI.TruSport_EE_UpdateIdleEeFromSteps(TruSport_EE_instance_t.c(truSport_EE_instance_t), truSport_EE_instance_t, bigInteger, j, TruSport_EE_result_t.b(truSport_EE_result_t), truSport_EE_result_t));
    }

    public static imm a(TruSport_EE_instance_t truSport_EE_instance_t, TruSport_EE_result_t truSport_EE_result_t) {
        return imm.b(trusport_eeJNI.TruSport_EE_GetCurrentEe(TruSport_EE_instance_t.c(truSport_EE_instance_t), truSport_EE_instance_t, TruSport_EE_result_t.b(truSport_EE_result_t), truSport_EE_result_t));
    }

    public static imm a(TruSport_EE_instance_t truSport_EE_instance_t, long j, imi imiVar) {
        return imm.b(trusport_eeJNI.TruSport_EE_StepGoalToEeGoal(TruSport_EE_instance_t.c(truSport_EE_instance_t), truSport_EE_instance_t, j, imi.c(imiVar)));
    }

    public static imm e(TruSport_EE_instance_t truSport_EE_instance_t, float f, iml imlVar, imk imkVar, imj imjVar) {
        return imm.b(trusport_eeJNI.TruSport_EE_EeGoalToDuration(TruSport_EE_instance_t.c(truSport_EE_instance_t), truSport_EE_instance_t, f, imlVar.d(), imkVar.a(), imj.a(imjVar)));
    }

    public static float a() {
        return trusport_eeJNI.TRUSPORT_EE_EMPTY_SPEED_get();
    }

    public static float e() {
        return trusport_eeJNI.TRUSPORT_EE_EMPTY_STEP_RATE_get();
    }

    public static short b() {
        return trusport_eeJNI.TRUSPORT_EE_EMPTY_HR_get();
    }

    public static imi d() {
        long jNew_preal_t = trusport_eeJNI.new_preal_t();
        if (jNew_preal_t == 0) {
            return null;
        }
        return new imi(jNew_preal_t, false);
    }

    public static void e(imi imiVar) {
        trusport_eeJNI.delete_preal_t(imi.c(imiVar));
    }

    public static float b(imi imiVar) {
        return trusport_eeJNI.preal_t_value(imi.c(imiVar));
    }

    public static imj c() {
        long jNew_puint32_t = trusport_eeJNI.new_puint32_t();
        if (jNew_puint32_t == 0) {
            return null;
        }
        return new imj(jNew_puint32_t, false);
    }

    public static void a(imj imjVar) {
        trusport_eeJNI.delete_puint32_t(imj.a(imjVar));
    }

    public static long d(imj imjVar) {
        return trusport_eeJNI.puint32_t_value(imj.a(imjVar));
    }
}
