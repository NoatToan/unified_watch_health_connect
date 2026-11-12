package ve2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import d53.w;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import o13.t;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p13.t0;
import p13.u;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lve2/l;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/q;", "oAuthClientConfig", "", "isAPKForChinaMarket", "Lwe2/g;", "ssoPortalConfig", "isAppDebugBuild", "Lnc2/d;", "integrityTokenProvider", "clientHasLimitedConnectAPIAccess", "<init>", "(Landroid/content/Context;Lve2/q;ZLwe2/g;ZLnc2/d;Z)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"Recycle"})
public final /* data */ class l {
    public final String A;
    public final String B;
    public final String C;
    public final LinkedHashSet<e> D;
    public final boolean E;
    public final HashSet<String> F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final HashMap<String, String> M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f177760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f177761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f177762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final we2.g f177763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f177764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nc2.d f177765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f177766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f177767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TypedArray f177768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f177769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f177770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f177771l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f177772m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f177773n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f177774o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f177775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f177776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f177777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f177778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f177779t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f177780u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f177781v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f177782w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f177783x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f177784y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f177785z;

    /* JADX WARN: Code duplicated, block: B:146:0x0596  */
    /* JADX WARN: Code duplicated, block: B:22:0x00cb  */
    public l(Context context, q qVar, boolean z14, we2.g gVar, boolean z15, nc2.d dVar, boolean z16) {
        boolean z17;
        boolean z18;
        String str;
        context.getClass();
        qVar.getClass();
        p pVar = qVar.f177844b;
        o oVar = qVar.f177845c;
        p pVar2 = qVar.f177843a;
        dVar.getClass();
        this.f177760a = context;
        this.f177761b = qVar;
        this.f177762c = z14;
        this.f177763d = gVar;
        this.f177764e = z15;
        this.f177765f = dVar;
        this.f177766g = z16;
        this.f177767h = o13.m.b(new vd1.c(1));
        this.f177772m = true;
        this.f177773n = true;
        this.f177774o = true;
        this.f177775p = true;
        this.f177784y = 70;
        this.f177785z = "";
        this.B = "";
        this.C = "";
        this.H = true;
        this.J = true;
        this.K = true;
        if (p005kotlin.jvm.internal.s.g(Build.MANUFACTURER, "JUnit")) {
            return;
        }
        nd2.c.f125412a = z15;
        Resources resources = context.getResources();
        String string = resources.getString(R.string.systemAccountPackageName);
        string.getClass();
        this.C = string;
        String string2 = resources.getString(R.string.systemAccountName);
        string2.getClass();
        this.B = string2;
        String string3 = resources.getString(R.string.ssoTheme);
        string3.getClass();
        if (string3.equals("DARK")) {
            z17 = true;
        } else {
            if (!string3.equals("LIGHT")) {
                vb.h.s("mobile_auth_config.xml specifies and invalid 'ssoTheme' value, valid values DARK, LIGHT (case sensitive)");
                throw null;
            }
            z17 = false;
        }
        this.f177774o = z17;
        String string4 = resources.getString(R.string.ssoScreenOrientation);
        int iHashCode = string4.hashCode();
        if (iHashCode == -77725029) {
            if (string4.equals("LANDSCAPE")) {
                z18 = false;
                this.f177775p = z18;
                if (pVar2 != null) {
                    vb.h.s("'OAuthClientConfig.itConfig' is required");
                    throw null;
                }
                str = pVar2.f177816a;
                if (str != null) {
                }
                vb.h.s("'OAuthClientConfig.itConfig.idLoggingOnly' cannot be null or blank");
                throw null;
            }
            vb.h.s("mobile_auth_config.xml specifies and invalid 'ssoScreenOrientation' value, valid values PORTRAIT, LANDSCAPE (case sensitive)");
            throw null;
        }
        if (iHashCode == 1511893915 && string4.equals("PORTRAIT")) {
            z18 = true;
            this.f177775p = z18;
            if (pVar2 != null) {
                vb.h.s("'OAuthClientConfig.itConfig' is required");
                throw null;
            }
            str = pVar2.f177816a;
            if (str != null || w.J(str)) {
                vb.h.s("'OAuthClientConfig.itConfig.idLoggingOnly' cannot be null or blank");
                throw null;
            }
            if (oVar != null && pVar == null) {
                vb.h.s("'OAuthClientConfig.diConfig' cannot be null when 'OAuthClientConfig.gcConfig' is not null");
                throw null;
            }
            String[] stringArray = resources.getStringArray(R.array.ssoStyleEnv);
            stringArray.getClass();
            for (String str2 : stringArray) {
                str2.getClass();
                List listW = w.W(str2, new String[]{","});
                if (listW.size() != 2) {
                    vb.h.x(am.j.m("mobile_auth_config.xml 'ssoStyleEnv' entry '", str2, "' is not in the correct format, expected format 'environment name,https://example.com/style.css'"));
                    throw null;
                }
                String str3 = (String) listW.get(0);
                if (w.J(str3)) {
                    vb.h.s(am.j.m("mobile_auth_config.xml 'ssoStyleEnv' entry '", str2, "' contains a blank environment name"));
                    throw null;
                }
                try {
                    e.valueOf(str3);
                    String str4 = (String) listW.get(1);
                    try {
                        new URL(str4);
                    } catch (Throwable th3) {
                        com.nimbusds.jose.shaded.gson.internal.a.v(p6.b.i("mobile_auth_config.xml 'ssoStyleEnv' entry '", str2, "' contains an invalid URL '", str4, "'\n"), o13.g.b(th3));
                        throw null;
                    }
                } catch (IllegalArgumentException unused) {
                    vb.h.s(e0.g("mobile_auth_config.xml 'ssoStyleEnv' entry '", str2, "' contains an invalid environment name '", str3, "', see 'GarminEnvironment.kt' for valid values"));
                    throw null;
                }
            }
            String[] stringArray2 = resources.getStringArray(R.array.ssoAppSupportedEnvironments);
            stringArray2.getClass();
            if (g()) {
                w13.c cVar = e.f177718r;
                ArrayList arrayList = new ArrayList();
                for (Object obj : cVar) {
                    we2.g gVar2 = this.f177763d;
                    gVar2.getClass();
                    if (gVar2.a((e) obj) != null) {
                        arrayList.add(obj);
                    }
                }
                this.D = new LinkedHashSet<>(arrayList);
                String packageName = context.getPackageName();
                packageName.getClass();
                if (w.z(packageName, "com.garmin.di.sso.sampleapp", false)) {
                    int iA = t0.a(stringArray.length);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
                    for (String str5 : stringArray) {
                        str5.getClass();
                        List listW2 = w.W(str5, new String[]{","});
                        o13.p pVar3 = new o13.p(listW2.get(0), listW2.get(1));
                        linkedHashMap.put(pVar3.f128594a, pVar3.f128595b);
                    }
                    this.M = new HashMap<>(linkedHashMap);
                    ((Logger) this.f177767h.getValue()).warn("Sample app is configured for SSO Portal. For MFA CAS & Portal testing, read the `mobile_auth_config.xml` file's CSS definitions. They are: " + this.M);
                }
            } else {
                if (stringArray.length == 0) {
                    vb.h.x("mobile_auth_config.xml is missing 'ssoStyleEnv' entries");
                    throw null;
                }
                if (stringArray2.length == 0) {
                    vb.h.x("mobile_auth_config.xml is missing 'ssoAppSupportedEnvironments' entries");
                    throw null;
                }
                if (stringArray.length != stringArray2.length) {
                    vb.h.x("mobile_auth_config.xml 'ssoStyleEnv' and 'ssoAppSupportedEnvironments' must have matching number of entries");
                    throw null;
                }
                for (String str6 : stringArray) {
                    str6.getClass();
                    String str7 = (String) w.W(str6, new String[]{","}).get(0);
                    if (!u.z(stringArray2, str7)) {
                        vb.h.s(e0.g("mobile_auth_config.xml 'ssoStyleEnv' entry '", str6, "' environment '", str7, "' does not have a matching entry in 'ssoAppSupportedEnvironments'"));
                        throw null;
                    }
                }
                for (String str8 : stringArray2) {
                    str8.getClass();
                    e eVarValueOf = e.valueOf(str8);
                    if (oVar != null && oVar.a(eVarValueOf) == null) {
                        vb.h.s(am.j.m("mobile_auth_config.xml contains 'ssoAppSupportedEnvironments' [", str8, "], but not a matching 'OAuth1GCConsumerConfig' entry"));
                        throw null;
                    }
                    if (pVar != null && pVar.a(eVarValueOf) == null) {
                        vb.h.s(am.j.m("mobile_auth_config.xml contains 'ssoAppSupportedEnvironments' [", str8, "], but not a matching DI 'OAuth2ClientConfig' entry"));
                        throw null;
                    }
                    if (pVar2.a(eVarValueOf) == null) {
                        vb.h.s(am.j.m("mobile_auth_config.xml contains 'ssoAppSupportedEnvironments' [", str8, "], but not a matching IT 'OAuth2ClientConfig' entry"));
                        throw null;
                    }
                }
                int iA2 = t0.a(stringArray.length);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 < 16 ? 16 : iA2);
                for (String str9 : stringArray) {
                    str9.getClass();
                    List listW3 = w.W(str9, new String[]{","});
                    o13.p pVar4 = new o13.p(listW3.get(0), listW3.get(1));
                    linkedHashMap2.put(pVar4.f128594a, pVar4.f128595b);
                }
                this.M = new HashMap<>(linkedHashMap2);
                ArrayList arrayList2 = new ArrayList(stringArray2.length);
                for (String str10 : stringArray2) {
                    str10.getClass();
                    arrayList2.add(e.valueOf(str10));
                }
                this.D = new LinkedHashSet<>(arrayList2);
            }
            int integer = resources.getInteger(R.integer.ssoBackgroundImageBlurOpacityPercent);
            if (50 > integer || integer >= 86) {
                vb.h.s(e0.f(integer, "mobile_auth_config.xml specifies 'ssoBackgroundImageBlurOpacityPercent' value '", "', valid values 50-85"));
                throw null;
            }
            String hexString = Integer.toHexString((integer * 255) / 100);
            hexString.getClass();
            Locale locale = Locale.ENGLISH;
            locale.getClass();
            String upperCase = hexString.toUpperCase(locale);
            upperCase.getClass();
            this.f177784y = Color.parseColor("#" + upperCase + (this.f177774o ? "000000" : "FFFFFF"));
            this.f177768i = resources.obtainTypedArray(R.array.ssoBackgroundImageResIds);
            this.f177769j = d53.u.q(context.getString(R.string.ssoShouldShowCreateAccountOptIn), BooleanUtils.TRUE, true);
            this.f177770k = d53.u.q(context.getString(R.string.ssoShouldShowSignInMinimumAge), BooleanUtils.TRUE, true);
            this.f177771l = d53.u.q(context.getString(R.string.ssoShouldShowCreateAccountMinimumAge), BooleanUtils.TRUE, true);
            this.f177772m = d53.u.q(context.getString(R.string.ssoShowPassword), BooleanUtils.TRUE, true);
            this.f177773n = d53.u.q(context.getString(R.string.ssoAllowUserToChangeAuthDomain), BooleanUtils.TRUE, true);
            this.f177776q = d53.u.q(context.getString(R.string.ssoUseBackgroundImageOnPrivacyConsentScreen), BooleanUtils.TRUE, true);
            this.f177777r = d53.u.q(context.getString(R.string.ssoBlurBackgroundImageOnPrivacyConsentScreen), BooleanUtils.TRUE, true);
            this.f177778s = d53.u.q(context.getString(R.string.ssoUseBackgroundImageOnLegalScreen), BooleanUtils.TRUE, true);
            this.f177779t = d53.u.q(context.getString(R.string.ssoBlurBackgroundImageOnLegalScreen), BooleanUtils.TRUE, true);
            this.f177780u = d53.u.q(context.getString(R.string.ssoUseBackgroundImageOnSignInScreen), BooleanUtils.TRUE, true);
            this.f177781v = d53.u.q(context.getString(R.string.ssoBlurBackgroundImageOnSignInScreen), BooleanUtils.TRUE, true);
            this.f177782w = d53.u.q(context.getString(R.string.ssoUseBackgroundImageOnCreateAccountScreen), BooleanUtils.TRUE, true);
            this.f177783x = d53.u.q(context.getString(R.string.ssoBlurBackgroundImageOnCreateAccountScreen), BooleanUtils.TRUE, true);
            String string5 = resources.getString(R.string.ssoApplicationName);
            string5.getClass();
            this.f177785z = d53.u.v(string5, StringUtils.SPACE, "", false);
            this.A = resources.getString(R.string.ssoPrivacyPolicyEnumName);
            this.E = d53.u.q(context.getString(R.string.ssoLaunchLegalHttpsLinksExternally), BooleanUtils.TRUE, true);
            String[] stringArray3 = resources.getStringArray(R.array.ssoAppConsentIDs);
            stringArray3.getClass();
            HashSet<String> hashSet = new HashSet<>(t0.a(stringArray3.length));
            u.c0(stringArray3, hashSet);
            this.F = hashSet;
            this.G = d53.u.q(context.getString(R.string.ssoStatusBarOverride), BooleanUtils.TRUE, true);
            this.H = d53.u.q(context.getString(R.string.ssoStatusBarIconDark), BooleanUtils.TRUE, true);
            this.I = d53.u.q(context.getString(R.string.ssoNavigationBarOverride), BooleanUtils.TRUE, true);
            this.J = d53.u.q(context.getString(R.string.ssoNavigationBarLightMode), BooleanUtils.TRUE, true);
            this.K = d53.u.q(context.getString(R.string.ssoWindowFlagSecure), BooleanUtils.TRUE, true);
            this.L = d53.u.q(context.getString(R.string.ssoShouldShowCreateAccountWarningScreen), BooleanUtils.TRUE, true);
            StringBuilder sb3 = new StringBuilder(com.airbnb.lottie.animation.keyframe.a.h("\nisAppDebugBuild=", this.f177764e));
            sb3.append("\nisAPKForChinaMarket=" + this.f177762c);
            TypedArray typedArray = this.f177768i;
            if (typedArray == null) {
                p005kotlin.jvm.internal.s.m("backgroundImageResIds");
                throw null;
            }
            sb3.append("\nnbrBGImages=" + typedArray.length());
            sb3.append("\ncssURLs=" + this.M);
            sb3.append("\nisDarkTheme=" + this.f177774o);
            if (this.f177764e) {
                sb3.append("\nsystemAccountName=" + this.B);
                sb3.append("\nsystemAccountPackageName=" + this.C);
                sb3.append("\nwindowFlagSecure=" + this.K);
                LinkedHashSet<e> linkedHashSet = this.D;
                if (linkedHashSet == null) {
                    p005kotlin.jvm.internal.s.m("appSupportedEnvironments");
                    throw null;
                }
                sb3.append("\nappSupportedEnvironments=" + linkedHashSet);
                sb3.append("\noAuthClientConfig=" + this.f177761b);
                we2.g gVar3 = this.f177763d;
                if (gVar3 != null) {
                    sb3.append("\nssoPortalConfig=" + gVar3);
                }
            }
            ((Logger) this.f177767h.getValue()).debug(sb3.toString());
            return;
        }
        vb.h.s("mobile_auth_config.xml specifies and invalid 'ssoScreenOrientation' value, valid values PORTRAIT, LANDSCAPE (case sensitive)");
        throw null;
    }

    public final dd2.b a(e eVar) {
        eVar.getClass();
        o oVar = this.f177761b.f177845c;
        if (oVar != null) {
            return oVar.a(eVar);
        }
        return null;
    }

    public final sc2.l b(e eVar) {
        eVar.getClass();
        p pVar = this.f177761b.f177844b;
        if (pVar != null) {
            return pVar.a(eVar);
        }
        return null;
    }

    public final sc2.l c(e eVar) {
        eVar.getClass();
        p pVar = this.f177761b.f177843a;
        if (pVar != null) {
            return pVar.a(eVar);
        }
        return null;
    }

    public final String d() {
        String str;
        p pVar = this.f177761b.f177843a;
        return (pVar == null || (str = pVar.f177816a) == null) ? PrivacyUpdateRequestError.UNKNOWN : str;
    }

    public final String e() {
        we2.g gVar = this.f177763d;
        if (gVar != null) {
            return this.f177774o ? gVar.f184858c : gVar.f184857b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f177760a.equals(lVar.f177760a) && this.f177761b.equals(lVar.f177761b) && this.f177762c == lVar.f177762c && p005kotlin.jvm.internal.s.g(this.f177763d, lVar.f177763d) && this.f177764e == lVar.f177764e && this.f177765f.equals(lVar.f177765f) && this.f177766g == lVar.f177766g;
    }

    public final URL f(e eVar) {
        we2.f fVarA;
        eVar.getClass();
        we2.g gVar = this.f177763d;
        if (gVar == null || (fVarA = gVar.a(eVar)) == null) {
            return null;
        }
        return this.f177774o ? fVarA.f184855b : fVarA.f184854a;
    }

    public final boolean g() {
        return this.f177763d != null;
    }

    public final int hashCode() {
        int iG = q6.f.g((this.f177761b.hashCode() + (this.f177760a.hashCode() * 31)) * 31, 31, this.f177762c);
        we2.g gVar = this.f177763d;
        return Boolean.hashCode(this.f177766g) + ((this.f177765f.hashCode() + q6.f.g((iG + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.f177764e)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MobileAuthConfig(context=");
        sb3.append(this.f177760a);
        sb3.append(", oAuthClientConfig=");
        sb3.append(this.f177761b);
        sb3.append(", isAPKForChinaMarket=");
        sb3.append(this.f177762c);
        sb3.append(", ssoPortalConfig=");
        sb3.append(this.f177763d);
        sb3.append(", isAppDebugBuild=");
        sb3.append(this.f177764e);
        sb3.append(", integrityTokenProvider=");
        sb3.append(this.f177765f);
        sb3.append(", clientHasLimitedConnectAPIAccess=");
        return hb.a.k(sb3, this.f177766g, ")");
    }
}
