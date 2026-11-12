package defpackage;

import com.huawei.health.trusport_ee.Intensity;
import com.huawei.health.trusport_ee.Sex;
import com.huawei.health.trusport_ee.SwimStyle;
import com.huawei.health.trusport_ee_jni.TruSport_EE_profile_t;
import com.huawei.health.trusport_ee_jni.TruSport_EE_result_t;
import com.huawei.health.trusport_ee_jni.TruSport_EE_sample_t;
import java.math.BigInteger;
import kotlin.Metadata;

/* JADX INFO: renamed from: imd, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004*\u00020\u0006H\u0000¢\u0006\u0002\u0010\u0007\u001a\f\u0010\b\u001a\u00020\u0006*\u00020\u0004H\u0000\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0000\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0000\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0012H\u0000\u001a\u0019\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00140\u0014*\u00020\u0015H\u0002¢\u0006\u0002\u0010\u0016\u001a\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u0018*\u00020\u0019H\u0000\u001a\u0019\u0010\u001a\u001a\n \u0005*\u0004\u0018\u00010\u001b0\u001b*\u00020\u001cH\u0000¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, d2 = {"toVersion", "Lcom/huawei/health/trusport_ee/Version;", "Lcom/huawei/health/trusport_ee_jni/TruSport_EE_version_t;", "toTruSport_EE_sex_t", "Lcom/huawei/health/trusport_ee_jni/TruSport_EE_sex_t;", "kotlin.jvm.PlatformType", "Lcom/huawei/health/trusport_ee/Sex;", "(Lcom/huawei/health/trusport_ee/Sex;)Lcom/huawei/health/trusport_ee_jni/TruSport_EE_sex_t;", "toSex", "toTruSport_EE_profile_t", "Lcom/huawei/health/trusport_ee_jni/TruSport_EE_profile_t;", "Lcom/huawei/health/trusport_ee/Profile;", "toProfile", "toResult", "Lcom/huawei/health/trusport_ee/Result;", "Lcom/huawei/health/trusport_ee_jni/TruSport_EE_result_t;", "toTruSport_EE_sample_t", "Lcom/huawei/health/trusport_ee_jni/TruSport_EE_sample_t;", "Lcom/huawei/health/trusport_ee/Sample;", "toTruSport_EE_swim_style_t", "Lcom/huawei/health/trusport_ee_jni/TruSport_EE_swim_style_t;", "Lcom/huawei/health/trusport_ee/SwimStyle;", "(Lcom/huawei/health/trusport_ee/SwimStyle;)Lcom/huawei/health/trusport_ee_jni/TruSport_EE_swim_style_t;", "toTruSport_EE_swim_sample_t", "Lcom/huawei/health/trusport_ee_jni/TruSport_EE_swim_sample_t;", "Lcom/huawei/health/trusport_ee/SwimSample;", "toTruSport_EE_Intensity_t", "Lcom/huawei/health/trusport_ee_jni/TruSport_EE_Intensity_t;", "Lcom/huawei/health/trusport_ee/Intensity;", "(Lcom/huawei/health/trusport_ee/Intensity;)Lcom/huawei/health/trusport_ee_jni/TruSport_EE_Intensity_t;", "trusport_ee_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class toVersion {
    public static final imo b(Sex sex) {
        zcp.c(sex, "");
        int i = d.e[sex.ordinal()];
        if (i == 1) {
            return imo.f37837a;
        }
        if (i == 2) {
            return imo.f37839c;
        }
        return imo.e;
    }

    public static final TruSport_EE_profile_t e(ima imaVar) {
        zcp.c(imaVar, "");
        TruSport_EE_profile_t truSport_EE_profile_t = new TruSport_EE_profile_t();
        truSport_EE_profile_t.c((short) imaVar.getD());
        truSport_EE_profile_t.b(imaVar.getF37810c());
        truSport_EE_profile_t.e(imaVar.getE());
        truSport_EE_profile_t.c(b(imaVar.getF37809b()));
        return truSport_EE_profile_t;
    }

    public static final imc a(TruSport_EE_result_t truSport_EE_result_t) {
        zcp.c(truSport_EE_result_t, "");
        return new imc(truSport_EE_result_t.a(), truSport_EE_result_t.b(), truSport_EE_result_t.e());
    }

    public static final TruSport_EE_sample_t e(img imgVar) {
        zcp.c(imgVar, "");
        TruSport_EE_sample_t truSport_EE_sample_t = new TruSport_EE_sample_t();
        imq.e(truSport_EE_sample_t);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(imgVar.getF37818b());
        zcp.b((Object) bigIntegerValueOf, "");
        truSport_EE_sample_t.a(bigIntegerValueOf);
        truSport_EE_sample_t.b(imgVar.getF37819c());
        truSport_EE_sample_t.a(imgVar.getE());
        truSport_EE_sample_t.b((short) imgVar.getD());
        return truSport_EE_sample_t;
    }

    public static final imk e(Intensity intensity) {
        zcp.c(intensity, "");
        int i = d.f37816b[intensity.ordinal()];
        if (i == 1) {
            return imk.d;
        }
        if (i == 2) {
            return imk.e;
        }
        return imk.f37825a;
    }

    /* JADX INFO: renamed from: imd$d */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f37816b;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[Sex.values().length];
            try {
                iArr[Sex.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Sex.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            e = iArr;
            int[] iArr2 = new int[SwimStyle.values().length];
            try {
                iArr2[SwimStyle.FREESTYLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SwimStyle.BREASTSTROKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SwimStyle.BACKSTROKE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SwimStyle.BUTTERFLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            d = iArr2;
            int[] iArr3 = new int[Intensity.values().length];
            try {
                iArr3[Intensity.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[Intensity.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f37816b = iArr3;
        }
    }
}
