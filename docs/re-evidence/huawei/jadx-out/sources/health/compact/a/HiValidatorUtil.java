package health.compact.a;

import android.text.TextUtils;
import com.huawei.hihealth.HiHealthData;

/* JADX INFO: loaded from: classes2.dex */
public class HiValidatorUtil {
    public static boolean a(int i) {
        return i < 94371840;
    }

    public static boolean b(double d) {
        return d - 2160000.0d < 1.0E-6d;
    }

    public static boolean b(float f) {
        return f > 0.0f;
    }

    public static boolean b(int i) {
        return i < 500;
    }

    public static boolean c(int i) {
        return i < 65536;
    }

    public static boolean d(double d) {
        return d - 1500.0d < 1.0E-6d;
    }

    public static boolean d(int i) {
        return i < 450000;
    }

    public static boolean e(double d) {
        return d > 0.0d;
    }

    public static boolean e(int i) {
        return i > 0;
    }

    public static boolean f(int i) {
        return i >= 0 && i <= 150000;
    }

    private static boolean h(int i) {
        return i >= 1 && i <= 99;
    }

    public static boolean b(int i, double d) {
        if (i == 2) {
            return b((int) d) && e(d);
        }
        if (i == 4) {
            return c((int) d) && e(d);
        }
        if (i != 5) {
            return e(d) && c(d);
        }
        return d(d) && e(d);
    }

    public static boolean b(int i, HiHealthData hiHealthData) {
        double value = hiHealthData.getValue();
        if (i == 2) {
            return b((int) value) && e(value);
        }
        if (i != 901) {
            if (i != 2106) {
                if (i == 2109) {
                    return k(value);
                }
                if (i == 4) {
                    return c((int) value) && e(value);
                }
                if (i == 5) {
                    return d(value) && e(value);
                }
                if (i == 7) {
                    return h((int) value);
                }
                if (i == 8) {
                    return f((int) value);
                }
                switch (i) {
                    case 2008:
                    case 2009:
                    case 2010:
                    case 2011:
                    case 2012:
                    case 2013:
                    case 2014:
                    case 2015:
                        break;
                    default:
                        switch (i) {
                            case 2034:
                                return e(value) && !TextUtils.isEmpty(hiHealthData.getMetaData()) && c(value);
                            case 2035:
                            case 2036:
                            case 2037:
                                break;
                            default:
                                switch (i) {
                                    case 2101:
                                    case 2102:
                                        break;
                                    case 2103:
                                        return n(value);
                                    default:
                                        return e(value) && c(value);
                                }
                                break;
                        }
                        return !TextUtils.isEmpty(hiHealthData.getMetaData());
                }
            }
            return g(value);
        }
        return j(value);
    }

    public static boolean c(int i, double d) {
        if (i == 40005) {
            return b(d) && e(d);
        }
        if (i == 40008) {
            return f((int) d);
        }
        switch (i) {
            case 40002:
                break;
            case 40003:
                return a((int) d) && e(d);
            default:
                switch (i) {
                    case 40011:
                    case 40012:
                    case 40013:
                        break;
                    default:
                        switch (i) {
                            case 47401:
                                return o(d);
                            case 47402:
                                return l(d);
                            case 47403:
                                return f(d);
                            case 47404:
                                return h(d);
                            case 47405:
                                return m(d);
                            case 47406:
                                return i(d);
                            default:
                                return true;
                        }
                }
                break;
        }
        return d((int) d) && e(d);
    }

    public static boolean d(int i, double d) {
        switch (i) {
            case 61001:
            case 61002:
                return a(d);
            default:
                return true;
        }
    }

    public static boolean a(double d) {
        return Double.compare(d, 0.0d) == 0 || Double.compare(d, 10.0d) == 0 || Double.compare(d, 20.0d) == 0 || Double.compare(d, 30.0d) == 0 || Double.compare(d, 40.0d) == 0 || Double.compare(d, 50.0d) == 0;
    }

    public static boolean g(double d) {
        return Double.compare(d, 1.0d) >= 0 && Double.compare(d, 33.0d) <= 0;
    }

    public static boolean n(double d) {
        return Double.compare(d, 0.0d) > 0 && Double.compare(d, 100.0d) <= 0;
    }

    public static boolean k(double d) {
        return Double.compare(d, 0.0d) > 0;
    }

    public static boolean c(double d) {
        return Double.compare(d, Double.MAX_VALUE) <= 0;
    }

    public static boolean o(double d) {
        return Double.compare(d, 0.0d) >= 0 && Double.compare(d, 1000.0d) <= 0;
    }

    public static boolean l(double d) {
        return Double.compare(d, 0.0d) >= 0 && Double.compare(d, 10.0d) <= 0;
    }

    public static boolean f(double d) {
        return Double.compare(d, 0.0d) >= 0 && Double.compare(d, 10.0d) <= 0;
    }

    public static boolean h(double d) {
        return Double.compare(d, 0.0d) >= 0 && Double.compare(d, Double.MAX_VALUE) <= 0;
    }

    public static boolean m(double d) {
        return Double.compare(d, 0.0d) >= 0 && Double.compare(d, Double.MAX_VALUE) <= 0;
    }

    public static boolean i(double d) {
        return Double.compare(d, 0.0d) >= 0 && Double.compare(d, Double.MAX_VALUE) <= 0;
    }

    public static boolean j(double d) {
        return Double.compare(d, 0.0d) >= 0 && ((int) d) <= 450000;
    }
}
