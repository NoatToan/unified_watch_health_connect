package defpackage;

import android.content.Context;
import com.xiaomi.push.i;
import com.xiaomi.push.ib;
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

/* JADX INFO: loaded from: classes11.dex */
public class dgs {
    public static jm a(Context context, ix ixVar) {
        if (ixVar.m755b()) {
            return null;
        }
        byte[] bArrM753a = ixVar.m753a();
        jm jmVarB = b(ixVar.a(), ixVar.f253b);
        if (jmVarB != null) {
            i.d(jmVarB, bArrM753a);
        }
        return jmVarB;
    }

    public static jm b(ib ibVar, boolean z) {
        switch (igs.f21124a[ibVar.ordinal()]) {
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
}
