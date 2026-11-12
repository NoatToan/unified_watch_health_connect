package defpackage;

import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import com.huawei.hms.network.embedded.j;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;

/* JADX INFO: loaded from: classes12.dex */
public class nyh {
    private static final int[] e = new int[0];

    public static int[] a(int i, int i2, int i3, String str) {
        int[] iArr = e;
        if (i == 264) {
            return a(i2, i3);
        }
        if (i == 265) {
            return c(i2, i3);
        }
        if (i == 273) {
            return b(i2);
        }
        if (i == 274) {
            return e(i2, str);
        }
        if (i != 281) {
            return i != 283 ? iArr : b(i2, i3);
        }
        return c(i2);
    }

    private static int[] e(int i, String str) {
        if (i == 0) {
            return str.equals("291") ? nyq.e : nyq.d;
        }
        if (i == 4) {
            return str.equals("291") ? nyq.g : nyq.f43964a;
        }
        return e;
    }

    private static int[] b(int i) {
        if (i == 0) {
            return nyj.f43950c;
        }
        if (i == 4) {
            return nyj.d;
        }
        return e;
    }

    private static int[] c(int i, int i2) {
        if (i == 0) {
            return e(i2);
        }
        if (i == 4) {
            if (i2 == 0) {
                return nym.h;
            }
            if (i2 == 2) {
                return nym.f;
            }
            return nym.f43952a;
        }
        if (i == 8) {
            return nym.g;
        }
        if (i == 9) {
            return nym.i;
        }
        if (i == 10) {
            return nym.n;
        }
        return e;
    }

    private static int[] c(int i) {
        if (i == 0) {
            return nyu.f43976c;
        }
        if (i == 2) {
            return nyu.e;
        }
        if (i == 3) {
            return nyu.f43974a;
        }
        return e;
    }

    private static int[] a(int i, int i2) {
        if (i == 0) {
            return f(i2);
        }
        if (i == 1) {
            return nyp.t;
        }
        if (i == 2) {
            if (i2 == 0) {
                return nyp.m;
            }
            return nyp.i;
        }
        if (i == 3) {
            if (i2 == 2) {
                return nyp.k;
            }
            return nyp.n;
        }
        if (i == 4) {
            if (i2 == 0) {
                return nyp.j;
            }
            if (i2 == 2) {
                return nyp.h;
            }
            return nyp.g;
        }
        if (i == 8) {
            return nyp.f;
        }
        if (i == 9) {
            return nyp.o;
        }
        if (i == 10) {
            return nyp.y;
        }
        return e;
    }

    public static int[] d(int i) {
        if (i == 0) {
            return nyp.p;
        }
        if (i == 2) {
            return nyp.r;
        }
        return nyp.l;
    }

    private static int[] f(int i) {
        if (i == 0) {
            return nyp.d;
        }
        if (i == 2) {
            return nyp.f43963c;
        }
        LogUtil.a(j.h, "getTreadmillArray, return default itemArray, targetType is ", Integer.valueOf(i));
        return nyp.f43962b;
    }

    private static int[] e(int i) {
        if (i == 0) {
            return nym.f43954c;
        }
        if (i == 2) {
            return nym.f43953b;
        }
        LogUtil.a(j.h, "getIndoorBikeTargetArray, return default itemArray, targetType is ", Integer.valueOf(i));
        return nym.e;
    }

    private static int[] b(int i, int i2) {
        if (i2 != 0) {
            if (i2 != 5 && i2 != 6) {
                if (i2 == 7) {
                    return nyo.f43958a;
                }
                if (i2 == 8) {
                    return i(i);
                }
                if (i2 != 10 && i2 != 11) {
                    return e;
                }
            }
            return nyo.f43960c;
        }
        return nyo.j;
    }

    private static int[] i(int i) {
        if (i == 5) {
            return nyo.f43959b;
        }
        if (i == 6) {
            return nyo.e;
        }
        return nyo.d;
    }

    public static SportDetailChartDataType[] e(int i, boolean z, boolean z2, String str) {
        if (i == 264) {
            if (z) {
                return nyp.f43961a;
            }
            if (z2) {
                return nyp.v;
            }
            return nyp.e;
        }
        if (i == 265) {
            return nym.d;
        }
        if (i == 273) {
            return nyj.f43948a;
        }
        if (i != 274) {
            return new SportDetailChartDataType[0];
        }
        return str.equals("291") ? nyq.f43965b : nyq.f43966c;
    }

    public static SportDetailChartDataType[] e(int i, boolean z, String str) {
        if (i == 264) {
            return z ? nyp.s : nyp.q;
        }
        if (i == 265) {
            return nym.d;
        }
        if (i == 273) {
            return nyj.f43948a;
        }
        if (i != 274) {
            return new SportDetailChartDataType[0];
        }
        return str.equals("291") ? nyq.f43965b : nyq.f43966c;
    }

    public static int a(int i, boolean z) {
        if (i == 264) {
            return z ? R.drawable.ic_treadmill_connected : R.drawable.ic_treadmill_disconnect;
        }
        if (i == 265) {
            return z ? R.drawable.ic_dynamic_bicycle_connected : R.drawable.ic_dynamic_bicycle_disconnect;
        }
        if (i == 273) {
            return z ? R.drawable.ic_cross_trainer_connected : R.drawable.ic_cross_trainer_disconnect;
        }
        if (i == 274) {
            return z ? R.drawable.ic_rowing_machine_connected : R.drawable.ic_rowing_machine_disconnect;
        }
        if (i == 281) {
            return z ? R.drawable.ic_walking_machine_connected : R.drawable.ic_walking_machine_disconnect;
        }
        if (i != 283) {
            return R.drawable.ic_treadmill_connected;
        }
        return z ? R.drawable.ic_skipping_connected : R.drawable.ic_skipping_disconnect;
    }

    public static int a(int i) {
        if (i == 264) {
            return R.drawable.icon_being_connected;
        }
        if (i == 265) {
            return R.drawable.ic_dynamic_bicycle_ing;
        }
        if (i == 273) {
            return R.drawable.ic_cross_trainer_ing;
        }
        if (i == 274) {
            return R.drawable.ic_rowing_machine_ing;
        }
        if (i == 281) {
            return R.drawable.ic_walking_machine_ing;
        }
        if (i == 283) {
            return R.drawable.ic_skipping_ing;
        }
        return R.drawable.icon_being_connected;
    }

    public static int b(int i, boolean z) {
        if (i == 264) {
            return z ? R.string.IDS_open_heart_rate_run_title : R.string.IDS_close_heart_rate_run_title;
        }
        if (i != 265) {
            return R.string.IDS_open_heart_rate_run_title;
        }
        return z ? R.string.IDS_open_heart_rate_ride_title : R.string.IDS_close_heart_rate_ride_title;
    }

    public static int e(int i, boolean z) {
        if (i == 264) {
            return z ? R.string.IDS_open_heart_rate_run_msg : R.string.IDS_close_heart_rate_run_msg;
        }
        if (i != 265) {
            return R.string.IDS_open_heart_rate_run_msg;
        }
        return z ? R.string.IDS_open_heart_rate_ride_msg : R.string.IDS_close_heart_rate_ride_msg;
    }
}
