package com.loc;

import android.util.Base64;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes18.dex */
public final class ca {
    public static boolean a(byte[] bArr) {
        String str;
        if (bArr == null) {
            return false;
        }
        byte[] bArr2 = null;
        try {
            dh dhVar = new dh();
            dhVar.b.put("Content-Type", "application/octet-stream");
            dhVar.b.put("aps_c_src", Base64.encodeToString(("lc_" + ((int) dd.a())).getBytes(), 2));
            dhVar.b.put("aps_c_key", Base64.encodeToString((dd.c() + "*" + dd.f()).getBytes(), 2));
            dhVar.d = bArr;
            if (br.a) {
                str = "http://aps.testing.amap.com/collection/collectData?src=baseCol&ver=v74&";
            } else {
                str = (br.b ? "https://" : "http://") + "cgicol.amap.com/collection/collectData?src=baseCol&ver=v74&";
            }
            dhVar.a = str;
            di diVarA = cu.a().a(dhVar);
            if (diVarA != null && diVarA.a == 200) {
                bArr2 = diVarA.c;
            }
            return bArr2 != null && "true".equals(new String(bArr2, StandardCharsets.UTF_8));
        } catch (Exception e) {
            df.a(e);
            return false;
        }
    }
}
