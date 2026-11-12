package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.braintreepayments.api.Authorization;
import com.braintreepayments.api.ConfigurationLoaderCallback;
import com.braintreepayments.api.NetworkResponseCallback;
import com.huawei.openalliance.ad.constant.ParamConstants;
import java.util.Arrays;
import kotlin.Metadata;
import org.json.JSONException;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J \u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/braintreepayments/api/ConfigurationLoader;", "", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "httpClient", "Lcom/braintreepayments/api/BraintreeHttpClient;", "(Landroid/content/Context;Lcom/braintreepayments/api/BraintreeHttpClient;)V", "configurationCache", "Lcom/braintreepayments/api/ConfigurationCache;", "(Lcom/braintreepayments/api/BraintreeHttpClient;Lcom/braintreepayments/api/ConfigurationCache;)V", "getCachedConfiguration", "Lcom/braintreepayments/api/Configuration;", "authorization", "Lcom/braintreepayments/api/Authorization;", "configUrl", "", "loadConfiguration", "", ParamConstants.Param.CALLBACK, "Lcom/braintreepayments/api/ConfigurationLoaderCallback;", "saveConfigurationToCache", "configuration", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class tn {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f49377c = new b(null);
    private final su d;
    private final ti e;

    public tn(su suVar, ti tiVar) {
        zcp.c(suVar, "");
        zcp.c(tiVar, "");
        this.d = suVar;
        this.e = tiVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tn(Context context, su suVar) {
        this(suVar, ti.e.c(context));
        zcp.c(context, "");
        zcp.c(suVar, "");
    }

    public final void b(final Authorization authorization, final ConfigurationLoaderCallback configurationLoaderCallback) {
        zcp.c(authorization, "");
        zcp.c(configurationLoaderCallback, "");
        yzc yzcVar = null;
        if (authorization instanceof ty) {
            configurationLoaderCallback.onResult(null, new st(((ty) authorization).getE(), null, 2, null), null);
            return;
        }
        final String string = Uri.parse(authorization.getF50627c()).buildUpon().appendQueryParameter("configVersion", "3").build().toString();
        zcp.b((Object) string, "");
        tf tfVarD = d(authorization, string);
        if (tfVarD != null) {
            configurationLoaderCallback.onResult(tfVarD, null, null);
            yzcVar = yzc.e;
        }
        if (yzcVar == null) {
            this.d.a(string, null, authorization, 1, new NetworkResponseCallback() { // from class: tl
                @Override // com.braintreepayments.api.NetworkResponseCallback
                public final void onResult(tv tvVar, Exception exc) {
                    tn.c(this.f49308c, authorization, string, configurationLoaderCallback, tvVar, exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(tn tnVar, Authorization authorization, String str, ConfigurationLoaderCallback configurationLoaderCallback, tv tvVar, Exception exc) {
        zcp.c(tnVar, "");
        zcp.c(authorization, "");
        zcp.c(str, "");
        zcp.c(configurationLoaderCallback, "");
        if (tvVar != null) {
            try {
                tf tfVarE = tf.f49044c.e(tvVar.getE());
                tnVar.e(tfVarE, authorization, str);
                configurationLoaderCallback.onResult(tfVarE, null, tvVar.getD());
                return;
            } catch (JSONException e) {
                configurationLoaderCallback.onResult(null, e, null);
                return;
            }
        }
        if (exc != null) {
            zda zdaVar = zda.f53987b;
            String str2 = String.format("Request for configuration has failed: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
            zcp.b((Object) str2, "");
            configurationLoaderCallback.onResult(null, new tm(str2, exc), null);
        }
    }

    private final void e(tf tfVar, Authorization authorization, String str) {
        this.e.b(tfVar, f49377c.c(authorization, str));
    }

    private final tf d(Authorization authorization, String str) {
        try {
            return tf.f49044c.e(this.e.e(f49377c.c(authorization, str)));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¨\u0006\b"}, d2 = {"Lcom/braintreepayments/api/ConfigurationLoader$Companion;", "", "()V", "createCacheKey", "", "authorization", "Lcom/braintreepayments/api/Authorization;", "configUrl", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(Authorization authorization, String str) {
            byte[] bytes = (str + authorization.getE()).getBytes(zel.h);
            zcp.b((Object) bytes, "");
            String strEncodeToString = Base64.encodeToString(bytes, 0);
            zcp.b((Object) strEncodeToString, "");
            return strEncodeToString;
        }

        public /* synthetic */ b(zcm zcmVar) {
            this();
        }
    }
}
