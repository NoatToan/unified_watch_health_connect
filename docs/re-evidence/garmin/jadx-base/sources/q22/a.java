package q22;

import java.math.BigDecimal;
import java.math.RoundingMode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq22/a;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    static {
        new a();
    }

    private a() {
    }

    public static final double a(double d14, b bVar, b bVar2) {
        double d15;
        bVar.getClass();
        bVar2.getClass();
        if (Double.isNaN(d14) || bVar2 == bVar) {
            return d14;
        }
        b bVar3 = b.FLUID_OUNCE;
        if (bVar != bVar3 || bVar2 != b.CUP) {
            if (bVar == bVar3 && bVar2 == b.MILLILITER) {
                d15 = d14 * 29.5735d;
            } else {
                if (bVar == bVar3 && bVar2 == b.LITRE) {
                    d14 *= 29.5735d;
                } else {
                    b bVar4 = b.CUP;
                    if (bVar == bVar4 && bVar2 == bVar3) {
                        d14 *= 236.588d;
                    } else if (bVar == bVar4 && bVar2 == b.MILLILITER) {
                        d15 = d14 * 236.588d;
                    } else if (bVar == bVar4 && bVar2 == b.LITRE) {
                        d14 *= 236.588d;
                    } else {
                        b bVar5 = b.MILLILITER;
                        if (bVar != bVar5 || bVar2 != bVar3) {
                            if (bVar != bVar5 || bVar2 != bVar4) {
                                if (bVar != bVar5 || bVar2 != b.LITRE) {
                                    b bVar6 = b.LITRE;
                                    if (bVar == bVar6 && bVar2 == bVar3) {
                                        d14 *= 1000.0d;
                                    } else if (bVar == bVar6 && bVar2 == bVar4) {
                                        d14 *= 1000.0d;
                                    } else {
                                        if (bVar != bVar6 || bVar2 != bVar5) {
                                            return d14;
                                        }
                                        d15 = d14 * 1000.0d;
                                    }
                                }
                            }
                        }
                    }
                    d15 = d14 / 29.5735d;
                }
                d15 = d14 / 1000.0d;
            }
            return new BigDecimal(d15).setScale(4, RoundingMode.HALF_UP).doubleValue();
        }
        d14 *= 29.5735d;
        d15 = d14 / 236.588d;
        return new BigDecimal(d15).setScale(4, RoundingMode.HALF_UP).doubleValue();
    }
}
