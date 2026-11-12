package defpackage;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.b;
import com.xiaomi.push.ib;
import com.xiaomi.push.il;
import com.xiaomi.push.ja;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class vvf implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        if (y0t.t()) {
            return;
        }
        if (lzs.t(b.f13638a) != null || k8s.a(b.f13638a).mo66a()) {
            ja jaVar = new ja();
            jaVar.b(bas.c(b.f13638a).d());
            jaVar.c(il.ClientInfoUpdate.f125a);
            jaVar.a(gbs.a());
            jaVar.a(new HashMap());
            String strT = lzs.t(b.f13638a);
            String str = "";
            if (!TextUtils.isEmpty(strT)) {
                str = "" + qcs.b(strT);
            }
            String strX = lzs.x(b.f13638a);
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strX)) {
                str = str + "," + strX;
            }
            if (!TextUtils.isEmpty(str)) {
                jaVar.m763a().put("imei_md5", str);
            }
            k8s.a(b.f13638a).d(jaVar.m763a());
            int iC = lzs.c();
            if (iC >= 0) {
                jaVar.m763a().put("space_id", Integer.toString(iC));
            }
            d6s.c(b.f13638a).y(jaVar, ib.Notification, false, null);
        }
    }
}
