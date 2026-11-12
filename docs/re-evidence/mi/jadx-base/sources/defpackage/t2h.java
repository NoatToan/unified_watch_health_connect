package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class t2h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Long f34234a = new Long(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Long f34235b = new Long(1);
    public static final Long c = new Long(-1);
    public static final Integer d = new Integer(0);
    public static final Integer e = new Integer(1);
    public static final Integer f = new Integer(-1);
    public static final Short g = new Short((short) 0);
    public static final Short h = new Short((short) 1);
    public static final Short i = new Short((short) -1);
    public static final Byte j = new Byte((byte) 0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Byte f34236k = new Byte((byte) 1);
    public static final Byte l = new Byte((byte) -1);
    public static final Double m = new Double(0.0d);
    public static final Double n = new Double(1.0d);
    public static final Double o = new Double(-1.0d);
    public static final Float p = new Float(0.0f);
    public static final Float q = new Float(1.0f);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Float f34237r = new Float(-1.0f);

    public static int a(double d2, double d3) {
        if (d2 < d3) {
            return -1;
        }
        if (d2 > d3) {
            return 1;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(d2);
        long jDoubleToLongBits2 = Double.doubleToLongBits(d3);
        if (jDoubleToLongBits == jDoubleToLongBits2) {
            return 0;
        }
        return jDoubleToLongBits < jDoubleToLongBits2 ? -1 : 1;
    }

    public static int b(float f2, float f3) {
        if (f2 < f3) {
            return -1;
        }
        if (f2 > f3) {
            return 1;
        }
        int iFloatToIntBits = Float.floatToIntBits(f2);
        int iFloatToIntBits2 = Float.floatToIntBits(f3);
        if (iFloatToIntBits == iFloatToIntBits2) {
            return 0;
        }
        return iFloatToIntBits < iFloatToIntBits2 ? -1 : 1;
    }
}
