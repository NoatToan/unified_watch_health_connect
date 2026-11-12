package defpackage;

import android.content.Context;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.ParamConstants;
import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\u000eR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/braintreepayments/api/UUIDHelper;", "", "()V", "formattedUUID", "", "getFormattedUUID", "()Ljava/lang/String;", "getInstallationGUID", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "braintreeSharedPreferences", "Lcom/braintreepayments/api/BraintreeSharedPreferences;", "getInstallationGUID$BraintreeCore_release", "getPersistentUUID", "getPersistentUUID$BraintreeCore_release", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class va {
    public static final d e = new d(null);

    public final String c() {
        String string = UUID.randomUUID().toString();
        zcp.b((Object) string, "");
        return zes.a(string, Constants.LINK, "", false, 4, (Object) null);
    }

    public final String c(Context context) {
        sw swVarC = sw.c(context);
        zcp.b((Object) swVarC, "");
        return c(swVarC);
    }

    public final String c(sw swVar) {
        zcp.c(swVar, "");
        String strB = swVar.b("InstallationGUID", null);
        if (strB == null) {
            strB = UUID.randomUUID().toString();
            swVar.a("InstallationGUID", strB);
        }
        zcp.b((Object) strB, "");
        return strB;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/braintreepayments/api/UUIDHelper$Companion;", "", "()V", "BRAINTREE_UUID_KEY", "", "INSTALL_GUID", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(zcm zcmVar) {
            this();
        }
    }
}
