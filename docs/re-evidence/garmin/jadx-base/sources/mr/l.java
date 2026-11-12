package mr;

import java.util.List;
import org.koin.java.KoinJavaComponent;
import ps.a1;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120278a;

        static {
            int[] iArr = new int[jr.v.values().length];
            try {
                iArr[jr.v.CHARTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jr.v.GEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jr.v.GASES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[jr.v.GASES_CCR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[jr.v.INTERVALS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[jr.v.LAPS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[jr.v.MATCHES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[jr.v.OVERVIEW.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[jr.v.ROUNDS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[jr.v.STATS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[jr.v.DIVES.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[jr.v.RUNS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[jr.v.ROUTES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[jr.v.SONGS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[jr.v.SPLITS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[jr.v.WAVES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[jr.v.DIVE_INTERVALS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f120278a = iArr;
        }
    }

    public static final boolean a(jr.u uVar, ps.r rVar, boolean z14, ps.p pVar, boolean z15) {
        a1 metadataDTO;
        ps.k0 diveInfoDTO;
        ps.k0 diveInfoDTO2;
        uVar.getClass();
        jr.v vVarD = uVar.d();
        List<ps.j0> listF = null;
        switch (vVarD == null ? -1 : a.f120278a[vVarD.ordinal()]) {
            case 1:
                if (rVar == null || (metadataDTO = rVar.getMetadataDTO()) == null) {
                    return false;
                }
                return p005kotlin.jvm.internal.s.g(metadataDTO.getHasChartData(), Boolean.TRUE);
            case 2:
                return oe2.f.J(rVar) || z14;
            case 3:
                if (rVar != null && (diveInfoDTO = rVar.getDiveInfoDTO()) != null) {
                    listF = diveInfoDTO.f();
                }
                return (listF == null || listF.isEmpty()) ? false : true;
            case 4:
                if (rVar != null && (diveInfoDTO2 = rVar.getDiveInfoDTO()) != null) {
                    listF = diveInfoDTO2.f();
                }
                return (listF == null || listF.isEmpty()) ? false : true;
            case 5:
                return b(rVar) && c(pVar, z15);
            case 6:
                return !b(rVar) && c(pVar, z15);
            case 7:
                boolean zC = c(pVar, z15);
                ss.e.f160596a.getClass();
                return zC && oe2.f.E(rVar) && ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("gaming_2_improvements_enabled");
            case 8:
            case 9:
            case 10:
                return true;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return c(pVar, z15);
            default:
                return false;
        }
    }

    public static final boolean b(ps.r rVar) {
        a1 metadataDTO;
        Boolean boolI;
        if (rVar == null || (metadataDTO = rVar.getMetadataDTO()) == null || (boolI = metadataDTO.getHasIntensityIntervals()) == null) {
            return false;
        }
        return boolI.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0022  */
    public static final boolean c(ps.p pVar, boolean z14) {
        boolean z15;
        if ((pVar != null ? pVar.g() : null) != null) {
            z15 = true;
        } else {
            if ((pVar != null ? pVar.i() : null) != null) {
                z15 = true;
            } else {
                if ((pVar != null ? pVar.h() : null) != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
        }
        return !z14 && z15;
    }
}
