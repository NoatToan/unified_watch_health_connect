package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.lang.ref.WeakReference;
import java.util.Map;
import net.openid.appauth.connectivity.ConnectionBuilder;

/* JADX INFO: loaded from: classes12.dex */
public final class ode {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44186c;
    private String d;
    private String e;
    private final SharedPreferences f;
    private final Context g;
    private Uri h;
    private Uri i;
    private Uri j;
    private String l;
    private String m;
    private final Resources n;
    private int o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static WeakReference<ode> f44185b = new WeakReference<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f44184a = new Object();

    private ode(Context context, int i) {
        this.g = context;
        this.f = context.getSharedPreferences(NetworkService.Constants.CONFIG_SERVICE, 0);
        this.n = context.getResources();
        this.o = i;
        try {
            j();
        } catch (d e) {
            this.f44186c = e.getMessage();
            ocq.e("Configuration", "readConfiguration mConfigError: " + this.f44186c);
        }
    }

    public static ode e(Context context, int i) {
        ode odeVar;
        synchronized (f44184a) {
            odeVar = f44185b.get();
            if (odeVar == null) {
                odeVar = new ode(context, i);
                f44185b = new WeakReference<>(odeVar);
            }
        }
        return odeVar;
    }

    public boolean h() {
        String strO = o();
        String str = this.d;
        return (str == null || str.equals(strO)) ? false : true;
    }

    public boolean i() {
        return this.f44186c == null;
    }

    public void a() {
        this.f.edit().putString("lastHash", this.d).apply();
    }

    public String e() {
        return this.e;
    }

    public String f() {
        return this.l;
    }

    public Uri g() {
        return this.i;
    }

    public Uri d() {
        return this.h;
    }

    public ConnectionBuilder b() {
        return zrr.f54554a;
    }

    private String o() {
        return this.f.getString("lastHash", null);
    }

    public void j() throws d {
        obg obgVarE = obe.d().e(this.g, this.o);
        if (obgVarE == null) {
            throw new d("refreshCarrierConfig, refresh failed");
        }
        this.m = oco.d(this.g, this.o);
        this.e = obgVarE.a();
        ocq.e("Configuration", "CarrierConfigInfo mClientId = " + this.e);
        ocq.e("Configuration", "CarrierConfigInfo getRedirectUrl = " + obgVarE.f());
        this.i = d(obgVarE.f());
        this.l = obgVarE.d();
        this.h = d(obgVarE.c());
        this.d = String.valueOf((this.m + this.e + this.i + this.l + this.h).hashCode());
        if (!k()) {
            throw new d("redirect_uri is not handled by any activity in this app!");
        }
        ocq.e("Configuration", "refreshCarrierConfig, refresh success");
    }

    public void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            this.e = map.get("client_id");
            this.i = d(map.get(CommonConstant.ReqAccessTokenParam.REDIRECT_URI));
            this.l = map.get("scope");
            this.j = d(map.get("oidc_url"));
            this.d = String.valueOf((this.e + this.i + this.l).hashCode());
            if (TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.i.toString()) || TextUtils.isEmpty(this.l)) {
                ocq.c("Configuration", "empty config, return");
            } else {
                this.f44186c = null;
            }
        } catch (d unused) {
            ocq.c("Configuration", "refreshConfiguration, refresh fail");
        }
    }

    public Uri c() {
        return this.j;
    }

    private Uri d(String str) throws d {
        try {
            return Uri.parse(str);
        } catch (Throwable th) {
            throw new d("Transfer failed, " + th.toString());
        }
    }

    private boolean k() {
        Intent intent = new Intent();
        intent.setPackage(this.g.getPackageName());
        intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(this.i);
        return !this.g.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public static final class d extends Exception {
        d(String str) {
            super(str);
        }
    }
}
