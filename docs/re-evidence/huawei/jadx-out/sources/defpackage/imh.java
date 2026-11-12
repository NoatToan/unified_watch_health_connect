package defpackage;

import android.util.Log;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.trusport_ee.Activity;
import com.huawei.health.trusport_ee.Intensity;
import com.huawei.health.trusport_ee_jni.TruSport_EE_instance_t;
import com.huawei.health.trusport_ee_jni.TruSport_EE_profile_t;
import com.huawei.health.trusport_ee_jni.TruSport_EE_result_t;
import com.huawei.health.trusport_ee_jni.TruSport_EE_sample_t;
import com.huawei.openalliance.ad.constant.VastAttribute;
import java.math.BigInteger;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes32.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 92\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\r\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J\r\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0017J\r\u0010\u0018\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020$J\u0010\u0010%\u001a\u0004\u0018\u00010 2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0018\u0010&\u001a\u0004\u0018\u00010 2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001bJ\b\u0010(\u001a\u0004\u0018\u00010 J\u0018\u0010)\u001a\u0004\u0018\u00010 2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u001bJ\u0015\u0010,\u001a\u0004\u0018\u00010\u00152\u0006\u0010-\u001a\u00020\u001b¢\u0006\u0002\u0010.J\u001e\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00101\u001a\u000202J\u0010\u00103\u001a\u00020\n2\u0006\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u00020\n2\u0006\u00107\u001a\u000208H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/huawei/health/trusport_ee/TruSportEe;", "", "<init>", "()V", "instanceSwig", "Lcom/huawei/health/trusport_ee_jni/TruSport_EE_instance_t;", "getJniVersion", "Lcom/huawei/health/trusport_ee/Version;", "getVersion", "setProfile", "", "profile", "Lcom/huawei/health/trusport_ee/Profile;", "getProfile", "setHrMax", "hrMax", "", "getHrMax", "()Ljava/lang/Integer;", "setVo2Max", "vo2max", "", "getVo2Max", "()Ljava/lang/Float;", "getRee", "setActivity", "timestamp", "", "activity", "Lcom/huawei/health/trusport_ee/Activity;", "getActivity", "pushSample", "Lcom/huawei/health/trusport_ee/Result;", "sample", "Lcom/huawei/health/trusport_ee/Sample;", "pushSwimSample", "Lcom/huawei/health/trusport_ee/SwimSample;", "updateEe", "updateIdleEeFromSteps", IndoorEquipManagerApi.KEY_STEP_COUNT, "getCurrentEe", "analyseExternalEe", "energyExpenditure", "duration", "stepGoalToEeGoal", "stepGoal", "(J)Ljava/lang/Float;", "eeGoalToDuration", "eeGoal", "intensity", "Lcom/huawei/health/trusport_ee/Intensity;", "printLog", "msg", "", "handleError", VastAttribute.ERROR, "Lcom/huawei/health/trusport_ee_jni/TruSport_EE_error_t;", "Companion", "trusport_ee_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class imh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f37822c = new a(null);
    private final TruSport_EE_instance_t e;

    private final void b(String str) {
    }

    public imh() {
        TruSport_EE_instance_t truSport_EE_instance_t = new TruSport_EE_instance_t();
        this.e = truSport_EE_instance_t;
        b("Initializing TruSportEe instance");
        imm immVarD = imq.d(truSport_EE_instance_t);
        zcp.e(immVarD);
        a(immVarD);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/health/trusport_ee/TruSportEe$Companion;", "", "<init>", "()V", "TAG", "", "trusport_ee_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(zcm zcmVar) {
            this();
        }
    }

    static {
        try {
            System.loadLibrary("trusport_ee_jni");
        } catch (UnsatisfiedLinkError unused) {
            Log.e("TruSportEe", "Error loading shared library!");
        }
    }

    public final void d(ima imaVar) {
        zcp.c(imaVar, "");
        b("Setting profile: profile=" + imaVar);
        TruSport_EE_profile_t truSport_EE_profile_tE = toVersion.e(imaVar);
        imm immVarC = imq.c(this.e, truSport_EE_profile_tE);
        zcp.e(immVarC);
        a(immVarC);
        if (truSport_EE_profile_tE != null) {
            truSport_EE_profile_tE.a();
        }
    }

    public final void d(float f) {
        b("Setting vo2max: vo2max=" + f);
        imm immVarA = imq.a(this.e, f);
        zcp.e(immVarA);
        a(immVarA);
    }

    public final void d(long j, Activity activity) {
        zcp.c(activity, "");
        b("Setting activity: timestamp=" + j + ", activity=" + activity);
        iml imlVarC = toTruSport_Activity_t.c(activity);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j);
        zcp.b((Object) bigIntegerValueOf, "");
        imm immVarB = imq.b(this.e, bigIntegerValueOf, imlVarC);
        zcp.e(immVarB);
        a(immVarB);
    }

    public final imc d(img imgVar) {
        zcp.c(imgVar, "");
        b("Pushing sample: sample=" + imgVar);
        TruSport_EE_sample_t truSport_EE_sample_tE = toVersion.e(imgVar);
        TruSport_EE_result_t truSport_EE_result_t = new TruSport_EE_result_t();
        imm immVarD = imq.d(this.e, truSport_EE_sample_tE, truSport_EE_result_t);
        zcp.e(immVarD);
        a(immVarD);
        imc imcVarA = toVersion.a(truSport_EE_result_t);
        if (truSport_EE_sample_tE != null) {
            truSport_EE_sample_tE.d();
        }
        truSport_EE_result_t.c();
        b("    Ret: " + imcVarA);
        return imcVarA;
    }

    public final imc a(long j) {
        b("Updating EE: timestamp=" + j);
        TruSport_EE_result_t truSport_EE_result_t = new TruSport_EE_result_t();
        TruSport_EE_instance_t truSport_EE_instance_t = this.e;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j);
        zcp.b((Object) bigIntegerValueOf, "");
        imm immVarB = imq.b(truSport_EE_instance_t, bigIntegerValueOf, truSport_EE_result_t);
        zcp.e(immVarB);
        a(immVarB);
        imc imcVarA = toVersion.a(truSport_EE_result_t);
        truSport_EE_result_t.c();
        b("    Ret: " + imcVarA);
        return imcVarA;
    }

    public final imc d(long j, long j2) {
        b("Updating Idle EE from steps: timestamp=" + j + ", stepCount=" + j2);
        TruSport_EE_result_t truSport_EE_result_t = new TruSport_EE_result_t();
        TruSport_EE_instance_t truSport_EE_instance_t = this.e;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j);
        zcp.b((Object) bigIntegerValueOf, "");
        imm immVarC = imq.c(truSport_EE_instance_t, bigIntegerValueOf, j2, truSport_EE_result_t);
        zcp.e(immVarC);
        a(immVarC);
        imc imcVarA = toVersion.a(truSport_EE_result_t);
        truSport_EE_result_t.c();
        b("    Ret: " + imcVarA);
        return imcVarA;
    }

    public final imc c() {
        b("Getting current EE");
        TruSport_EE_result_t truSport_EE_result_t = new TruSport_EE_result_t();
        imm immVarA = imq.a(this.e, truSport_EE_result_t);
        zcp.e(immVarA);
        a(immVarA);
        imc imcVarA = toVersion.a(truSport_EE_result_t);
        truSport_EE_result_t.c();
        b("    Ret: " + imcVarA);
        return imcVarA;
    }

    public final Float b(long j) {
        b("Estimating EE from steps: " + j);
        imi imiVarD = imq.d();
        zcp.b((Object) imiVarD, "");
        imm immVarA = imq.a(this.e, j, imiVarD);
        zcp.e(immVarA);
        a(immVarA);
        float fB = imq.b(imiVarD);
        imq.e(imiVarD);
        b("    Ret: " + fB);
        return Float.valueOf(fB);
    }

    public final long c(float f, Activity activity, Intensity intensity) {
        zcp.c(activity, "");
        zcp.c(intensity, "");
        b("Estimating activity duration from EE: eeGoal=" + f + ", activity=" + activity + ", intensity=" + intensity);
        imj imjVarC = imq.c();
        zcp.b((Object) imjVarC, "");
        imm immVarE = imq.e(this.e, f, toTruSport_Activity_t.c(activity), toVersion.e(intensity), imjVarC);
        zcp.e(immVarE);
        a(immVarE);
        long jD = imq.d(imjVarC);
        imq.a(imjVarC);
        b("    Ret: " + jD);
        return jD;
    }

    private final void a(imm immVar) {
        if (zcp.b(immVar, imm.x)) {
            return;
        }
        Log.e("TruSportEe", "TruSport EE failure: " + immVar);
        throw new imf(immVar.toString());
    }
}
