package defpackage;

import android.content.Context;
import com.huawei.hms.network.embedded.r1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class yqw {
    public String b() {
        return "Last-Query-Time_ucscomponent_ucscomponent.jws";
    }

    public boolean b(Context context) {
        long jB = yqk.b(b(), 0L, context);
        yqi.a("LocalCDNFile", "lastQueryTime is " + jB, new Object[0]);
        return System.currentTimeMillis() - jB > 432000000;
    }

    public Map c(Context context) {
        HashMap map = new HashMap();
        String strE = yqk.e("ETag_ucscomponent", "", context);
        String strE2 = yqk.e("Last-Modified_ucscomponent", "", context);
        map.put("ETag", strE);
        map.put(r1.b.o, strE2);
        return map;
    }
}
