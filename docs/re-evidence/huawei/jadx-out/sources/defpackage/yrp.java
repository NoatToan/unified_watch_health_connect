package defpackage;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.wisesecurity.ucs_credential.o;

/* JADX INFO: loaded from: classes20.dex */
public class yrp implements o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GrsClient f53783c;

    @Override // com.huawei.wisesecurity.ucs_credential.o
    public String b() {
        return a("HA");
    }

    @Override // com.huawei.wisesecurity.ucs_credential.o
    public String a(String str, String str2) {
        return a("CDN") + "tsms/" + str + "/" + str2;
    }

    public final String a(String str) {
        String strSynGetGrsUrl = this.f53783c.synGetGrsUrl("com.huawei.tsms", str);
        yqi.a("InnerGrsUrlImpl", "synGetGrsUrl : {0}", strSynGetGrsUrl);
        return strSynGetGrsUrl;
    }

    @Override // com.huawei.wisesecurity.ucs_credential.o
    public String a() {
        return a("ROOT") + "/tsms/v2/credentials";
    }

    public yrp(Context context, String str) {
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setSerCountry(str);
        this.f53783c = new GrsClient(context, grsBaseInfo);
    }
}
