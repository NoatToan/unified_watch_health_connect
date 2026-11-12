package defpackage;

import com.huawei.wisesecurity.ucs.credential.outer.GrsCapability;
import com.huawei.wisesecurity.ucs_credential.o;

/* JADX INFO: loaded from: classes20.dex */
public class yrd implements o {
    public GrsCapability d;

    @Override // com.huawei.wisesecurity.ucs_credential.o
    public String b() {
        return c("HA");
    }

    @Override // com.huawei.wisesecurity.ucs_credential.o
    public String a(String str, String str2) {
        return c("CDN") + "tsms/" + str + "/" + str2;
    }

    public final String c(String str) {
        String strSynGetGrsUrl = this.d.synGetGrsUrl("com.huawei.tsms", str);
        yqi.a("OuterGrsUrlImpl", "synGetGrsUrl : {0}", strSynGetGrsUrl);
        return strSynGetGrsUrl;
    }

    @Override // com.huawei.wisesecurity.ucs_credential.o
    public String a() {
        return c("ROOT") + "/tsms/v2/credentials";
    }

    public yrd(GrsCapability grsCapability) {
        this.d = grsCapability;
    }
}
