package defpackage;

import android.content.Context;
import com.huawei.openalliance.ad.constant.ParamConstants;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/braintreepayments/api/ConfigurationCache;", "", "sharedPreferences", "Lcom/braintreepayments/api/BraintreeSharedPreferences;", "(Lcom/braintreepayments/api/BraintreeSharedPreferences;)V", "getConfiguration", "", "cacheKey", "currentTimeMillis", "", "saveConfiguration", "", "configuration", "Lcom/braintreepayments/api/Configuration;", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ti {
    private static volatile ti d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sw f49144a;
    public static final c e = new c(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f49143c = TimeUnit.MINUTES.toMillis(5);

    public ti(sw swVar) {
        zcp.c(swVar, "");
        this.f49144a = swVar;
    }

    public final String e(String str) {
        zcp.c(str, "");
        return c(str, System.currentTimeMillis());
    }

    public final String c(String str, long j) {
        zcp.c(str, "");
        String str2 = str + "_timestamp";
        if (!this.f49144a.e(str2) || j - this.f49144a.a(str2) >= f49143c) {
            return null;
        }
        return this.f49144a.b(str, "");
    }

    public final void b(tf tfVar, String str) {
        zcp.c(tfVar, "");
        b(tfVar, str, System.currentTimeMillis());
    }

    public final void b(tf tfVar, String str, long j) {
        zcp.c(tfVar, "");
        this.f49144a.e(str, tfVar.getG(), str + "_timestamp", j);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/braintreepayments/api/ConfigurationCache$Companion;", "", "()V", "INSTANCE", "Lcom/braintreepayments/api/ConfigurationCache;", "TIME_TO_LIVE", "", "getInstance", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class c {
        private c() {
        }

        public final ti c(Context context) {
            ti tiVar;
            zcp.c(context, "");
            ti tiVar2 = ti.d;
            if (tiVar2 != null) {
                return tiVar2;
            }
            synchronized (this) {
                tiVar = ti.d;
                if (tiVar == null) {
                    sw swVarC = sw.c(context);
                    zcp.b((Object) swVarC, "");
                    tiVar = new ti(swVarC);
                    c cVar = ti.e;
                    ti.d = tiVar;
                }
            }
            return tiVar;
        }

        public /* synthetic */ c(zcm zcmVar) {
            this();
        }
    }
}
