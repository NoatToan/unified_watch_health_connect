package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.cz;
import com.xiaomi.push.dk;
import com.xiaomi.push.dl;
import com.xiaomi.push.dm;
import com.xiaomi.push.dp;
import com.xiaomi.push.dq;
import com.xiaomi.push.dt;
import com.xiaomi.push.dv;
import com.xiaomi.push.dw;
import com.xiaomi.push.dx;
import com.xiaomi.push.dz;
import com.xiaomi.push.eb;
import com.xiaomi.push.ed;
import com.xiaomi.push.ee;
import com.xiaomi.push.ef;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes22.dex */
public class aa {
    public static <T extends ef<T, ?>> dq a(Context context, T t, cz czVar) {
        return a(context, t, czVar, !czVar.equals(cz.Registration), context.getPackageName(), a.m3457a(context).m3458a());
    }

    public static <T extends ef<T, ?>> dq a(Context context, T t, cz czVar, boolean z, String str, String str2) {
        return a(context, t, czVar, z, str, str2, true);
    }

    public static <T extends ef<T, ?>> dq a(Context context, T t, cz czVar, boolean z, String str, String str2, boolean z2) {
        String str3;
        byte[] bArrA = ee.a(t);
        if (bArrA != null) {
            dq dqVar = new dq();
            if (z) {
                String strD = a.m3457a(context).d();
                if (TextUtils.isEmpty(strD)) {
                    str3 = "regSecret is empty, return null";
                } else {
                    try {
                        bArrA = com.xiaomi.channel.commonutils.android.b.b(com.xiaomi.push.aa.m3487a(strD), bArrA);
                    } catch (Exception unused) {
                        com.xiaomi.channel.commonutils.logger.b.d("encryption error. ");
                    }
                }
            }
            dk dkVar = new dk();
            dkVar.a = 5L;
            dkVar.f98a = "fakeid";
            dqVar.a(dkVar);
            dqVar.a(ByteBuffer.wrap(bArrA));
            dqVar.a(czVar);
            dqVar.b(z2);
            dqVar.b(str);
            dqVar.a(z);
            dqVar.a(str2);
            return dqVar;
        }
        str3 = "invoke convertThriftObjectToBytes method, return null.";
        com.xiaomi.channel.commonutils.logger.b.m3434a(str3);
        return null;
    }

    public static ef a(Context context, dq dqVar) {
        byte[] bArrM3707a;
        if (dqVar.m3709b()) {
            byte[] bArrA = g.a(context, dqVar, c.ASSEMBLE_PUSH_FCM);
            if (bArrA == null) {
                bArrA = com.xiaomi.push.aa.m3487a(a.m3457a(context).d());
            }
            try {
                bArrM3707a = com.xiaomi.channel.commonutils.android.b.a(bArrA, dqVar.m3707a());
            } catch (Exception e) {
                throw new o("the aes decrypt failed.", e);
            }
        } else {
            bArrM3707a = dqVar.m3707a();
        }
        ef efVarB = b(dqVar.a(), dqVar.f125b);
        if (efVarB != null) {
            ee.a(efVarB, bArrM3707a);
        }
        return efVarB;
    }

    public static <T extends ef<T, ?>> dq b(Context context, T t, cz czVar, boolean z, String str, String str2) {
        return a(context, t, czVar, z, str, str2, false);
    }

    private static ef b(cz czVar, boolean z) {
        switch (f.a[czVar.ordinal()]) {
            case 1:
                return new dv();
            case 2:
                return new eb();
            case 3:
                return new dz();
            case 4:
                return new ed();
            case 5:
                return new dx();
            case 6:
                return new dl();
            case 7:
                return new dp();
            case 8:
                return new dw();
            case 9:
                if (z) {
                    return new dt();
                }
                dm dmVar = new dm();
                dmVar.a(true);
                return dmVar;
            case 10:
                return new dp();
            default:
                return null;
        }
    }
}
