package defpackage;

import android.util.Base64;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class z7t {
    public static boolean a(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        try {
            gbt gbtVar = new gbt();
            gbtVar.f18819b.put("Content-Type", "application/octet-stream");
            gbtVar.f18819b.put("aps_c_src", Base64.encodeToString(gbt.a().getBytes(), 2));
            gbtVar.f18819b.put("aps_c_key", Base64.encodeToString(gbt.b().getBytes(), 2));
            gbtVar.d = bArr;
            if (h7t.f19787a) {
                gbtVar.f18818a = "http://cgicol.amap.com/collection/collectData?src=baseCol&ver=v74&";
            } else {
                gbtVar.f18818a = (h7t.f19788b ? "https://" : "http://") + "cgicol.amap.com/collection/collectData?src=baseCol&ver=v74&";
            }
            hbt hbtVarA = yat.c().a(gbtVar);
            byte[] bArr2 = (hbtVarA == null || hbtVarA.f19920a != 200) ? null : hbtVarA.c;
            return bArr2 != null && "true".equals(new String(bArr2, StandardCharsets.UTF_8));
        } catch (Exception e) {
            fbt.a(e);
            return false;
        }
    }
}
