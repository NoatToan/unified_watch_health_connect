package com.amap.api.col.p0003sl;

import android.util.Base64;
import com.huawei.hms.network.base.common.trans.FileBinary;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class mm {
    public static boolean a(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        try {
            nt ntVar = new nt();
            ntVar.f3238b.put("Content-Type", FileBinary.HEAD_VALUE_CONTENT_TYPE_OCTET_STREAM);
            ntVar.f3238b.put("aps_c_src", Base64.encodeToString(nt.a().getBytes(), 2));
            ntVar.f3238b.put("aps_c_key", Base64.encodeToString(nt.b().getBytes(), 2));
            ntVar.d = bArr;
            if (md.f3187a) {
                ntVar.f3237a = "http://cgicol.amap.com/collection/collectData?src=baseCol&ver=v74&";
            } else {
                ntVar.f3237a = (md.f3188b ? "https://" : "http://").concat("cgicol.amap.com/collection/collectData?src=baseCol&ver=v74&");
            }
            nu nuVarA = nh.b().a(ntVar);
            byte[] bArr2 = (nuVarA == null || nuVarA.f3240a != 200) ? null : nuVarA.f3242c;
            return bArr2 != null && "true".equals(new String(bArr2, StandardCharsets.UTF_8));
        } catch (Exception e) {
            ns.a(e);
            return false;
        }
    }
}
