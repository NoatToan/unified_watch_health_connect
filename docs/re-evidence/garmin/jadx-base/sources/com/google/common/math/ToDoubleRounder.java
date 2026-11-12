package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.lang.Comparable;
import java.lang.Number;
import java.math.RoundingMode;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
abstract class ToDoubleRounder<X extends Number & Comparable<X>> {

    /* JADX INFO: renamed from: com.google.common.math.ToDoubleRounder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[RoundingMode.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UNNECESSARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public abstract X minus(X x14, X x15);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:72:0x0103  */
    /* JADX WARN: Code duplicated, block: B:75:0x010a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0119  */
    /* JADX WARN: Code duplicated, block: B:81:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0122  */
    /* JADX WARN: Code duplicated, block: B:85:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x012a  */
    public final double roundToDouble(X x14, RoundingMode roundingMode) {
        Number x15;
        int iCompareTo;
        int[] iArr;
        double dNextDown;
        Number x16;
        double dNextUp;
        int iCompareTo2;
        int i14;
        boolean z14;
        Preconditions.checkNotNull(x14, "x");
        Preconditions.checkNotNull(roundingMode, "mode");
        double dRoundToDoubleArbitrarily = roundToDoubleArbitrarily(x14);
        if (Double.isInfinite(dRoundToDoubleArbitrarily)) {
            switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return ((double) sign(x14)) * Double.MAX_VALUE;
                case 5:
                    return dRoundToDoubleArbitrarily == Double.POSITIVE_INFINITY ? Double.MAX_VALUE : Double.NEGATIVE_INFINITY;
                case 6:
                    return dRoundToDoubleArbitrarily == Double.POSITIVE_INFINITY ? Double.POSITIVE_INFINITY : -1.7976931348623157E308d;
                case 7:
                    break;
                case 8:
                    throw new ArithmeticException(x14 + " cannot be represented precisely as a double");
                default:
                    x15 = toX(dRoundToDoubleArbitrarily, RoundingMode.UNNECESSARY);
                    iCompareTo = ((Comparable) x14).compareTo(x15);
                    iArr = AnonymousClass1.$SwitchMap$java$math$RoundingMode;
                    switch (iArr[roundingMode.ordinal()]) {
                        case 1:
                            if (sign(x14) >= 0) {
                                if (iCompareTo < 0) {
                                    return DoubleUtils.nextDown(dRoundToDoubleArbitrarily);
                                }
                            } else if (iCompareTo > 0) {
                                return Math.nextUp(dRoundToDoubleArbitrarily);
                            }
                        case 2:
                        case 3:
                        case 4:
                            if (iCompareTo >= 0) {
                                dNextUp = Math.nextUp(dRoundToDoubleArbitrarily);
                                if (dNextUp != Double.POSITIVE_INFINITY) {
                                    x16 = toX(dNextUp, RoundingMode.CEILING);
                                    iCompareTo2 = ((Comparable) minus(x14, x15)).compareTo(minus(x16, x14));
                                    if (iCompareTo2 >= 0) {
                                        if (iCompareTo2 <= 0) {
                                            i14 = iArr[roundingMode.ordinal()];
                                            if (i14 != 2) {
                                                if (i14 != 3) {
                                                    if (i14 == 4) {
                                                        h.q("impossible");
                                                        return 0.0d;
                                                    }
                                                    if (sign(x14) >= 0) {
                                                    }
                                                } else if (sign(x14) >= 0) {
                                                }
                                            } else if ((Double.doubleToRawLongBits(dRoundToDoubleArbitrarily) & 1) == 0) {
                                            }
                                        }
                                        return dNextUp;
                                    }
                                    return dRoundToDoubleArbitrarily;
                                }
                            } else {
                                dNextDown = DoubleUtils.nextDown(dRoundToDoubleArbitrarily);
                                if (dNextDown != Double.NEGATIVE_INFINITY) {
                                    Number x17 = toX(dNextDown, RoundingMode.FLOOR);
                                    x16 = x15;
                                    x15 = x17;
                                    dNextUp = dRoundToDoubleArbitrarily;
                                    dRoundToDoubleArbitrarily = dNextDown;
                                    iCompareTo2 = ((Comparable) minus(x14, x15)).compareTo(minus(x16, x14));
                                    if (iCompareTo2 >= 0) {
                                        if (iCompareTo2 <= 0) {
                                            i14 = iArr[roundingMode.ordinal()];
                                            if (i14 != 2) {
                                                if (i14 != 3) {
                                                    if (i14 == 4) {
                                                        h.q("impossible");
                                                        return 0.0d;
                                                    }
                                                    if (sign(x14) >= 0) {
                                                    }
                                                } else if (sign(x14) >= 0) {
                                                }
                                            } else if ((Double.doubleToRawLongBits(dRoundToDoubleArbitrarily) & 1) == 0) {
                                            }
                                        }
                                        return dNextUp;
                                    }
                                    return dRoundToDoubleArbitrarily;
                                }
                            }
                        case 5:
                            if (iCompareTo < 0) {
                                return DoubleUtils.nextDown(dRoundToDoubleArbitrarily);
                            }
                            break;
                        case 6:
                            if (iCompareTo > 0) {
                                return Math.nextUp(dRoundToDoubleArbitrarily);
                            }
                            break;
                        case 7:
                            if (sign(x14) >= 0) {
                                if (iCompareTo > 0) {
                                    return Math.nextUp(dRoundToDoubleArbitrarily);
                                }
                            } else if (iCompareTo < 0) {
                                return DoubleUtils.nextDown(dRoundToDoubleArbitrarily);
                            }
                        case 8:
                            if (iCompareTo == 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            MathPreconditions.checkRoundingUnnecessary(z14);
                            return dRoundToDoubleArbitrarily;
                        default:
                            h.q("impossible");
                            return 0.0d;
                    }
                    break;
            }
        } else {
            x15 = toX(dRoundToDoubleArbitrarily, RoundingMode.UNNECESSARY);
            iCompareTo = ((Comparable) x14).compareTo(x15);
            iArr = AnonymousClass1.$SwitchMap$java$math$RoundingMode;
            switch (iArr[roundingMode.ordinal()]) {
                case 1:
                    if (sign(x14) >= 0) {
                        if (iCompareTo < 0) {
                            return DoubleUtils.nextDown(dRoundToDoubleArbitrarily);
                        }
                    } else if (iCompareTo > 0) {
                        return Math.nextUp(dRoundToDoubleArbitrarily);
                    }
                case 2:
                case 3:
                case 4:
                    if (iCompareTo >= 0) {
                        dNextUp = Math.nextUp(dRoundToDoubleArbitrarily);
                        if (dNextUp != Double.POSITIVE_INFINITY) {
                            x16 = toX(dNextUp, RoundingMode.CEILING);
                            iCompareTo2 = ((Comparable) minus(x14, x15)).compareTo(minus(x16, x14));
                            if (iCompareTo2 >= 0) {
                                if (iCompareTo2 <= 0) {
                                    i14 = iArr[roundingMode.ordinal()];
                                    if (i14 != 2) {
                                        if (i14 != 3) {
                                            if (i14 == 4) {
                                                h.q("impossible");
                                                return 0.0d;
                                            }
                                            if (sign(x14) >= 0) {
                                            }
                                        } else if (sign(x14) >= 0) {
                                        }
                                    } else if ((Double.doubleToRawLongBits(dRoundToDoubleArbitrarily) & 1) == 0) {
                                    }
                                }
                                return dNextUp;
                            }
                            return dRoundToDoubleArbitrarily;
                        }
                    } else {
                        dNextDown = DoubleUtils.nextDown(dRoundToDoubleArbitrarily);
                        if (dNextDown != Double.NEGATIVE_INFINITY) {
                            Number x18 = toX(dNextDown, RoundingMode.FLOOR);
                            x16 = x15;
                            x15 = x18;
                            dNextUp = dRoundToDoubleArbitrarily;
                            dRoundToDoubleArbitrarily = dNextDown;
                            iCompareTo2 = ((Comparable) minus(x14, x15)).compareTo(minus(x16, x14));
                            if (iCompareTo2 >= 0) {
                                if (iCompareTo2 <= 0) {
                                    i14 = iArr[roundingMode.ordinal()];
                                    if (i14 != 2) {
                                        if (i14 != 3) {
                                            if (i14 == 4) {
                                                h.q("impossible");
                                                return 0.0d;
                                            }
                                            if (sign(x14) >= 0) {
                                            }
                                        } else if (sign(x14) >= 0) {
                                        }
                                    } else if ((Double.doubleToRawLongBits(dRoundToDoubleArbitrarily) & 1) == 0) {
                                    }
                                }
                                return dNextUp;
                            }
                            return dRoundToDoubleArbitrarily;
                        }
                    }
                case 5:
                    if (iCompareTo < 0) {
                        return DoubleUtils.nextDown(dRoundToDoubleArbitrarily);
                    }
                    break;
                case 6:
                    if (iCompareTo > 0) {
                        return Math.nextUp(dRoundToDoubleArbitrarily);
                    }
                    break;
                case 7:
                    if (sign(x14) >= 0) {
                        if (iCompareTo > 0) {
                            return Math.nextUp(dRoundToDoubleArbitrarily);
                        }
                    } else if (iCompareTo < 0) {
                        return DoubleUtils.nextDown(dRoundToDoubleArbitrarily);
                    }
                case 8:
                    if (iCompareTo == 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    MathPreconditions.checkRoundingUnnecessary(z14);
                    return dRoundToDoubleArbitrarily;
                default:
                    h.q("impossible");
                    return 0.0d;
            }
        }
        return dRoundToDoubleArbitrarily;
    }

    public abstract double roundToDoubleArbitrarily(X x14);

    public abstract int sign(X x14);

    public abstract X toX(double d14, RoundingMode roundingMode);
}
