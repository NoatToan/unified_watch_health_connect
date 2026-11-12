package af1;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laf1/o;", "", "<init>", "()V", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f3110a = new o();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3111a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f3072e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.f3073f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.f3074g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.f3075h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.f3076i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.f3077j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e.f3078k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f3111a = iArr;
        }
    }

    private o() {
    }

    /* JADX WARN: Code duplicated, block: B:107:0x019a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    public static double a(int i14, boolean z14, qe1.i iVar, e eVar) {
        qe1.c female;
        qe1.f recreational;
        Long lValueOf;
        qe1.e male;
        qe1.f recreational2;
        qe1.c female2;
        qe1.d intermediate;
        qe1.e male2;
        qe1.d intermediate2;
        qe1.c female3;
        qe1.m trained;
        qe1.e male3;
        qe1.m trained2;
        qe1.c female4;
        qe1.n wellTrained;
        qe1.e male4;
        qe1.n wellTrained2;
        qe1.c female5;
        qe1.b expert;
        qe1.e male5;
        qe1.b expert2;
        qe1.c female6;
        qe1.l superior;
        qe1.e male6;
        qe1.l superior2;
        qe1.c female7;
        qe1.a elite;
        qe1.e male7;
        qe1.a elite2;
        qe1.c female8;
        qe1.f recreational3;
        qe1.e male8;
        qe1.f recreational4;
        qe1.c female9;
        qe1.d intermediate3;
        qe1.e male9;
        qe1.d intermediate4;
        qe1.c female10;
        qe1.m trained3;
        qe1.e male10;
        qe1.m trained4;
        qe1.c female11;
        qe1.n wellTrained3;
        qe1.e male11;
        qe1.n wellTrained4;
        qe1.c female12;
        qe1.b expert3;
        qe1.e male12;
        qe1.b expert4;
        qe1.c female13;
        qe1.l superior3;
        qe1.e male13;
        qe1.l superior4;
        qe1.c female14;
        qe1.a elite3;
        qe1.e male14;
        qe1.a elite4;
        Long lValueOf2 = 240L;
        eVar.getClass();
        o13.p<Double, Double> pVar = eVar.f3085d;
        int[] iArr = a.f3111a;
        switch (iArr[eVar.ordinal()]) {
            case 1:
                if (!z14) {
                    if (iVar == null || (female = iVar.getFemale()) == null || (recreational = female.getRecreational()) == null) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(recreational.getMax());
                    }
                } else if (iVar == null || (male = iVar.getMale()) == null || (recreational2 = male.getRecreational()) == null) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(recreational2.getMax());
                }
                break;
            case 2:
                if (!z14) {
                    if (iVar == null || (female2 = iVar.getFemale()) == null || (intermediate = female2.getIntermediate()) == null) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(intermediate.getMax());
                    }
                } else if (iVar == null || (male2 = iVar.getMale()) == null || (intermediate2 = male2.getIntermediate()) == null) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(intermediate2.getMax());
                }
                break;
            case 3:
                if (!z14) {
                    if (iVar == null || (female3 = iVar.getFemale()) == null || (trained = female3.getTrained()) == null) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(trained.getMax());
                    }
                } else if (iVar == null || (male3 = iVar.getMale()) == null || (trained2 = male3.getTrained()) == null) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(trained2.getMax());
                }
                break;
            case 4:
                if (!z14) {
                    if (iVar == null || (female4 = iVar.getFemale()) == null || (wellTrained = female4.getWellTrained()) == null) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(wellTrained.getMax());
                    }
                } else if (iVar == null || (male4 = iVar.getMale()) == null || (wellTrained2 = male4.getWellTrained()) == null) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(wellTrained2.getMax());
                }
                break;
            case 5:
                if (!z14) {
                    if (iVar == null || (female5 = iVar.getFemale()) == null || (expert = female5.getExpert()) == null) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(expert.getMax());
                    }
                } else if (iVar == null || (male5 = iVar.getMale()) == null || (expert2 = male5.getExpert()) == null) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(expert2.getMax());
                }
                break;
            case 6:
                if (!z14) {
                    if (iVar == null || (female6 = iVar.getFemale()) == null || (superior = female6.getSuperior()) == null) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(superior.getMax());
                    }
                } else if (iVar == null || (male6 = iVar.getMale()) == null || (superior2 = male6.getSuperior()) == null) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(superior2.getMax());
                }
                break;
            case 7:
                if (!z14) {
                    if (iVar == null || (female7 = iVar.getFemale()) == null || (elite = female7.getElite()) == null) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(elite.getMax());
                    }
                } else if (iVar == null || (male7 = iVar.getMale()) == null || (elite2 = male7.getElite()) == null) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(elite2.getMax());
                }
                break;
            default:
                lValueOf = lValueOf2;
                break;
        }
        switch (iArr[eVar.ordinal()]) {
            case 1:
                if (!z14) {
                    if (iVar == null || (female8 = iVar.getFemale()) == null || (recreational3 = female8.getRecreational()) == null) {
                        lValueOf2 = null;
                    } else {
                        lValueOf2 = Long.valueOf(recreational3.getMin());
                    }
                } else if (iVar == null || (male8 = iVar.getMale()) == null || (recreational4 = male8.getRecreational()) == null) {
                    lValueOf2 = null;
                } else {
                    lValueOf2 = Long.valueOf(recreational4.getMin());
                }
                break;
            case 2:
                if (!z14) {
                    if (iVar == null || (female9 = iVar.getFemale()) == null || (intermediate3 = female9.getIntermediate()) == null) {
                        lValueOf2 = null;
                    } else {
                        lValueOf2 = Long.valueOf(intermediate3.getMin());
                    }
                } else if (iVar == null || (male9 = iVar.getMale()) == null || (intermediate4 = male9.getIntermediate()) == null) {
                    lValueOf2 = null;
                } else {
                    lValueOf2 = Long.valueOf(intermediate4.getMin());
                }
                break;
            case 3:
                if (!z14) {
                    if (iVar == null || (female10 = iVar.getFemale()) == null || (trained3 = female10.getTrained()) == null) {
                        lValueOf2 = null;
                    } else {
                        lValueOf2 = Long.valueOf(trained3.getMin());
                    }
                } else if (iVar == null || (male10 = iVar.getMale()) == null || (trained4 = male10.getTrained()) == null) {
                    lValueOf2 = null;
                } else {
                    lValueOf2 = Long.valueOf(trained4.getMin());
                }
                break;
            case 4:
                if (!z14) {
                    if (iVar == null || (female11 = iVar.getFemale()) == null || (wellTrained3 = female11.getWellTrained()) == null) {
                        lValueOf2 = null;
                    } else {
                        lValueOf2 = Long.valueOf(wellTrained3.getMin());
                    }
                } else if (iVar == null || (male11 = iVar.getMale()) == null || (wellTrained4 = male11.getWellTrained()) == null) {
                    lValueOf2 = null;
                } else {
                    lValueOf2 = Long.valueOf(wellTrained4.getMin());
                }
                break;
            case 5:
                if (!z14) {
                    if (iVar == null || (female12 = iVar.getFemale()) == null || (expert3 = female12.getExpert()) == null) {
                        lValueOf2 = null;
                    } else {
                        lValueOf2 = Long.valueOf(expert3.getMin());
                    }
                } else if (iVar == null || (male12 = iVar.getMale()) == null || (expert4 = male12.getExpert()) == null) {
                    lValueOf2 = null;
                } else {
                    lValueOf2 = Long.valueOf(expert4.getMin());
                }
                break;
            case 6:
                if (!z14) {
                    if (iVar == null || (female13 = iVar.getFemale()) == null || (superior3 = female13.getSuperior()) == null) {
                        lValueOf2 = null;
                    } else {
                        lValueOf2 = Long.valueOf(superior3.getMin());
                    }
                } else if (iVar == null || (male13 = iVar.getMale()) == null || (superior4 = male13.getSuperior()) == null) {
                    lValueOf2 = null;
                } else {
                    lValueOf2 = Long.valueOf(superior4.getMin());
                }
                break;
            case 7:
                if (!z14) {
                    if (iVar == null || (female14 = iVar.getFemale()) == null || (elite3 = female14.getElite()) == null) {
                        lValueOf2 = null;
                    } else {
                        lValueOf2 = Long.valueOf(elite3.getMin());
                    }
                } else if (iVar == null || (male14 = iVar.getMale()) == null || (elite4 = male14.getElite()) == null) {
                    lValueOf2 = null;
                } else {
                    lValueOf2 = Long.valueOf(elite4.getMin());
                }
                break;
        }
        j23.l lVar = new j23.l(lValueOf2 != null ? (int) lValueOf2.longValue() : 0, lValueOf != null ? (int) lValueOf.longValue() : PsExtractor.VIDEO_STREAM_MASK);
        int i15 = iArr[eVar.ordinal()];
        double d14 = (i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4) ? 5.0d : 10.0d;
        if (lValueOf2 != null && i14 == ((int) lValueOf2.longValue())) {
            return pVar.f128595b.doubleValue();
        }
        if (lValueOf != null && i14 == ((int) lValueOf.longValue())) {
            return pVar.f128594a.doubleValue();
        }
        int i16 = lVar.f96796a;
        double d15 = i14 - i16;
        int i17 = lVar.f96797b;
        double dDoubleValue = ((((double) 1) - (d15 / ((double) (i17 - i16)))) / d14) + pVar.f128594a.doubleValue();
        if (i17 <= i16) {
            return 0.0d;
        }
        return dDoubleValue;
    }

    public static String b(String str) {
        return (str == null || e.valueOf(str) == e.f3080m || e.valueOf(str) == e.f3079l) ? "" : str;
    }

    public static int c(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static ArrayList d(List list) {
        Integer num;
        Integer num2;
        int iIntValue = (list == null || (num2 = (Integer) h0.o0(list)) == null) ? 235 : num2.intValue();
        int iIntValue2 = (list == null || (num = (Integer) h0.t0(list)) == null) ? 0 : num.intValue();
        int i14 = iIntValue - iIntValue2;
        ArrayList arrayList = new ArrayList();
        int iB = MathKt.b(((double) ((i14 / 2) + iIntValue2)) / 5.0d) * 5;
        int i15 = iIntValue - iB;
        int i16 = iB - iIntValue2;
        if (i14 <= 3) {
            if (iB - 2 > iIntValue2) {
                iB = iIntValue2 + 1;
            }
            arrayList.addAll(x.k(Integer.valueOf(iB - 2), Integer.valueOf(iB - 1), Integer.valueOf(iB), Integer.valueOf(iB + 1), Integer.valueOf(iB + 2)));
            return arrayList;
        }
        int i17 = 10;
        if (i15 <= 10 && i16 <= 10) {
            if (iB - 10 > iIntValue2) {
                iB = iIntValue2 + 5;
            }
            arrayList.addAll(x.k(Integer.valueOf(iB - 10), Integer.valueOf(iB - 5), Integer.valueOf(iB), Integer.valueOf(iB + 5), Integer.valueOf(iB + 10)));
            return arrayList;
        }
        while (true) {
            int i18 = i17 / 2;
            if (i15 < i18 && i16 < i18) {
                return arrayList;
            }
            int i19 = iB - i17;
            if (i19 < 0) {
                arrayList.addAll(x.k(Integer.valueOf(iIntValue2), Integer.valueOf(iB - (i16 / 2)), Integer.valueOf(iB), Integer.valueOf((i15 / 2) + iB), Integer.valueOf(iIntValue)));
                return arrayList;
            }
            if (i15 <= i17 && i16 <= i17) {
                arrayList.addAll(x.k(Integer.valueOf(i19), Integer.valueOf(iB - i18), Integer.valueOf(iB), Integer.valueOf(i18 + iB), Integer.valueOf(iB + i17)));
                return arrayList;
            }
            i17 *= 2;
        }
    }
}
