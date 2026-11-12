package defpackage;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class kyn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f39629b;
    private kyc e;

    private boolean c(int i, String str) {
        return i > 0 && str != null;
    }

    private kyn() {
        this.e = new kyc();
    }

    static class b {
        private static final kyn d = new kyn();
    }

    public static kyn d(Context context) {
        b.d.e(context);
        return b.d;
    }

    private void e(Context context) {
        if (context == null || this.f39629b != null) {
            return;
        }
        this.f39629b = context.getApplicationContext();
    }

    public kym e(int i, int i2, int i3, String str) {
        return b(i, i2, i3, str);
    }

    private kym b(int i, int i2, int i3, String str) {
        if (!c(i, str)) {
            LogUtil.j("Debug_StoreClient", "getOwnerClient app <= 0 or device = null", cpl.e(str));
            return null;
        }
        int iE = kxi.e(this.f39629b, i2, i3);
        if (iE <= 0) {
            LogUtil.j("Debug_StoreClient", "getOwnerClient who <= 0 ower = ", Integer.valueOf(i3), ",app = ", Integer.valueOf(i));
            return null;
        }
        String strA = kyf.a(Integer.toString(i), Integer.toString(iE), str);
        kym kymVarB = this.e.b(strA);
        if (kymVarB != null) {
            return kymVarB;
        }
        int iC = kxi.c(this.f39629b, str);
        if (iC <= 0) {
            LogUtil.j("Debug_StoreClient", "getOwnerClient device <= 0 deviceUUID error ", cpl.e(str));
            return null;
        }
        kym kymVarD = d(i, iE, iC);
        if (kymVarD == null) {
            LogUtil.j("Debug_StoreClient", "getOwnerClient hiHealthContext = null key error ");
            return null;
        }
        this.e.b(strA, kymVarD);
        kyj.c().b(iE, iC);
        return kymVarD;
    }

    public kym d(int i, int i2, int i3) {
        return a(i, i2, i3);
    }

    private kym a(int i, int i2, int i3) {
        if (i < 0 || i2 < 0 || i3 < 0) {
            LogUtil.j("Debug_StoreClient", "getUserClient app < 0 or device < 0 or who < 0");
            return new kym();
        }
        String strA = kyf.a(Integer.toString(i), Integer.toString(i2), Integer.toString(i3));
        kym kymVarB = this.e.b(strA);
        if (kymVarB != null) {
            return kymVarB;
        }
        int iA = kwt.b().a(i2, i3, i);
        if (iA <= 0) {
            LogUtil.j("Debug_StoreClient", "getUserClient client <= 0 key = ", strA);
            return new kym();
        }
        kym kymVar = new kym(i, i3, i2, iA);
        this.e.b(strA, kymVar);
        kyj.c().b(i2, i3);
        return kymVar;
    }

    public int e(int i, int i2, int i3) {
        return b(i, i2, i3);
    }

    private int b(int i, int i2, int i3) {
        if (i < 0 || i2 < 0 || i3 < 0) {
            LogUtil.j("Debug_StoreClient", "getAllClientID app < 0 or device < 0 or who < 0");
            return 0;
        }
        String strA = kyf.a(Integer.toString(i), Integer.toString(i2), Integer.toString(i3));
        kym kymVarB = this.e.b(strA);
        if (kymVarB != null) {
            return kymVarB.c();
        }
        int iA = kwt.b().a(i2, i3, i);
        if (iA <= 0) {
            LogUtil.j("Debug_StoreClient", "getAllClientID client <= 0 key = ", strA);
            return 0;
        }
        this.e.b(strA, new kym(i, i3, i2, iA));
        kyj.c().b(i2, i3);
        return iA;
    }

    public kym e(int i, int i2, String str) {
        return a(i, i2, str);
    }

    private kym a(int i, int i2, String str) {
        if (i < 0 || i2 < 0 || str == null) {
            LogUtil.j("Debug_StoreClient", "getReadHiHealthContext app < 0 or device = null or who < 0");
            return null;
        }
        String strA = kyf.a(Integer.toString(i), Integer.toString(i2), str);
        kym kymVarB = this.e.b(strA);
        if (kymVarB != null) {
            return kymVarB;
        }
        int iC = kxi.c(this.f39629b, str);
        if (iC <= 0) {
            LogUtil.j("Debug_StoreClient", "getReadHiHealthContext device <= 0 deviceUUID error ");
            return null;
        }
        kym kymVarD = d(i, i2, iC);
        if (kymVarD == null) {
            LogUtil.j("Debug_StoreClient", "getReadHiHealthContext hiHealthContext = null key error ");
            return null;
        }
        this.e.b(strA, kymVarD);
        kyj.c().b(i2, iC);
        return kymVarD;
    }

    public void a() {
        this.e.e();
    }

    public static int b(kyn kynVar, int i, int i2, int i3, int i4) {
        kym kymVarD;
        if (i == 0) {
            kymVarD = kynVar.d(0, i3, 0);
        } else if (i == 1) {
            kymVarD = kynVar.d(i2, i3, 0);
        } else {
            kymVarD = i != 2 ? null : kynVar.d(0, i3, i4);
        }
        if (kymVarD == null) {
            ReleaseLogUtil.e("Debug_StoreClient", "getStatClient statClient is null,writeStatType is ", Integer.valueOf(i), ",app is ", Integer.valueOf(i2), ", userID ", Integer.valueOf(i3), ", deviceID ", Integer.valueOf(i4));
            return 0;
        }
        return kymVarD.c();
    }
}
