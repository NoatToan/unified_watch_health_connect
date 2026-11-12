package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.fm;
import com.xiaomi.push.i;
import com.xiaomi.push.ib;
import com.xiaomi.push.il;
import com.xiaomi.push.is;
import com.xiaomi.push.iv;
import com.xiaomi.push.iw;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import com.xiaomi.push.jm;
import com.xiaomi.push.jr;

/* JADX INFO: loaded from: classes11.dex */
public class sls {
    public static int a(Context context, int i) {
        int iA = xys.a(context);
        if (-1 == iA) {
            return -1;
        }
        return (i * (iA == 0 ? 13 : 11)) / 10;
    }

    public static int b(ib ibVar) {
        return mss.a(ibVar.a());
    }

    public static int c(jm jmVar, ib ibVar) {
        int iA;
        int iB;
        switch (vls.f37013a[ibVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return mss.a(ibVar.a());
            case 11:
                iA = mss.a(ibVar.a());
                if (jmVar != null) {
                    try {
                        if (jmVar instanceof is) {
                            String str = ((is) jmVar).f210d;
                            if (!TextUtils.isEmpty(str) && mss.b(mss.i(str)) != -1) {
                                iB = mss.b(mss.i(str));
                                return iB;
                            }
                        } else if (jmVar instanceof ja) {
                            String str2 = ((ja) jmVar).f269d;
                            if (!TextUtils.isEmpty(str2)) {
                                if (mss.b(mss.i(str2)) != -1) {
                                    iA = mss.b(mss.i(str2));
                                }
                                if (il.UploadTinyData.equals(mss.i(str2))) {
                                    return -1;
                                }
                            }
                        }
                    } catch (Exception unused) {
                        x9s.D("PERF_ERROR : parse Notification type error");
                        return iA;
                    }
                }
                return iA;
            case 12:
                iA = mss.a(ibVar.a());
                if (jmVar != null) {
                    try {
                        if (jmVar instanceof iw) {
                            String strB = ((iw) jmVar).b();
                            if (!TextUtils.isEmpty(strB) && fm.a(strB) != -1) {
                                iA = fm.a(strB);
                            }
                        } else if (jmVar instanceof iv) {
                            String strA = ((iv) jmVar).a();
                            if (!TextUtils.isEmpty(strA) && fm.a(strA) != -1) {
                                iB = fm.a(strA);
                                return iB;
                            }
                        }
                    } catch (Exception unused2) {
                        x9s.D("PERF_ERROR : parse Command type error");
                    }
                }
                return iA;
            default:
                return -1;
        }
    }

    public static void d(String str, Context context, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        int iA = a(context, i2);
        if (i != mss.b(il.UploadTinyData)) {
            oss.a(context.getApplicationContext()).c(str, i, 1L, iA);
        }
    }

    public static void e(String str, Context context, ix ixVar, int i) {
        ib ibVarA;
        if (context == null || ixVar == null || (ibVarA = ixVar.a()) == null) {
            return;
        }
        int iB = b(ibVarA);
        if (i <= 0) {
            byte[] bArrE = i.e(ixVar);
            i = bArrE != null ? bArrE.length : 0;
        }
        d(str, context, iB, i);
    }

    public static void f(String str, Context context, jm jmVar, ib ibVar, int i) {
        d(str, context, c(jmVar, ibVar), i);
    }

    public static void g(String str, Context context, byte[] bArr) {
        if (context == null || bArr == null || bArr.length <= 0) {
            return;
        }
        ix ixVar = new ix();
        try {
            i.d(ixVar, bArr);
            e(str, context, ixVar, bArr.length);
        } catch (jr unused) {
            x9s.o("fail to convert bytes to container");
        }
    }
}
