package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.d;
import com.xiaomi.mipush.sdk.q;
import com.xiaomi.push.i;
import com.xiaomi.push.ib;
import com.xiaomi.push.iq;
import com.xiaomi.push.ir;
import com.xiaomi.push.is;
import com.xiaomi.push.iw;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import com.xiaomi.push.jc;
import com.xiaomi.push.jd;
import com.xiaomi.push.je;
import com.xiaomi.push.jg;
import com.xiaomi.push.ji;
import com.xiaomi.push.jk;
import com.xiaomi.push.jm;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class v4s {
    public static <T extends jm<T, ?>> ix a(Context context, T t, ib ibVar) {
        return b(context, t, ibVar, !ibVar.equals(ib.Registration), context.getPackageName(), bas.c(context).d());
    }

    public static <T extends jm<T, ?>> ix b(Context context, T t, ib ibVar, boolean z, String str, String str2) {
        return c(context, t, ibVar, z, str, str2, true);
    }

    public static <T extends jm<T, ?>> ix c(Context context, T t, ib ibVar, boolean z, String str, String str2, boolean z2) {
        byte[] bArrE = i.e(t);
        if (bArrE == null) {
            x9s.o("invoke convertThriftObjectToBytes method, return null.");
            return null;
        }
        ix ixVar = new ix();
        if (z) {
            String strT = bas.c(context).t();
            if (TextUtils.isEmpty(strT)) {
                x9s.o("regSecret is empty, return null");
                return null;
            }
            try {
                bArrE = hxs.c(ecs.b(strT), bArrE);
            } catch (Exception unused) {
                x9s.D("encryption error. ");
            }
        }
        iq iqVar = new iq();
        iqVar.f173a = 5L;
        iqVar.f174a = "fakeid";
        ixVar.a(iqVar);
        ixVar.a(ByteBuffer.wrap(bArrE));
        ixVar.a(ibVar);
        ixVar.b(z2);
        ixVar.b(str);
        ixVar.a(z);
        ixVar.a(str2);
        return ixVar;
    }

    public static jm d(Context context, ix ixVar) {
        byte[] bArrM753a;
        if (ixVar.m755b()) {
            byte[] bArrJ = gxs.j(context, ixVar, d.ASSEMBLE_PUSH_FCM);
            if (bArrJ == null) {
                bArrJ = ecs.b(bas.c(context).t());
            }
            try {
                bArrM753a = hxs.b(bArrJ, ixVar.m753a());
            } catch (Exception e) {
                throw new q("the aes decrypt failed.", e);
            }
        } else {
            bArrM753a = ixVar.m753a();
        }
        jm jmVarE = e(ixVar.a(), ixVar.f253b);
        if (jmVarE != null) {
            i.d(jmVarE, bArrM753a);
        }
        return jmVarE;
    }

    public static jm e(ib ibVar, boolean z) {
        switch (e5s.f16297a[ibVar.ordinal()]) {
            case 1:
                return new jc();
            case 2:
                return new ji();
            case 3:
                return new jg();
            case 4:
                return new jk();
            case 5:
                return new je();
            case 6:
                return new ir();
            case 7:
                return new iw();
            case 8:
                return new jd();
            case 9:
                if (z) {
                    return new ja();
                }
                is isVar = new is();
                isVar.a(true);
                return isVar;
            case 10:
                return new iw();
            default:
                return null;
        }
    }

    public static <T extends jm<T, ?>> ix f(Context context, T t, ib ibVar, boolean z, String str, String str2) {
        return c(context, t, ibVar, z, str, str2, false);
    }
}
