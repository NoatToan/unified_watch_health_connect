package zd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.webkit.CookieManager;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.lib.networking.exceptions.WebViewNotAvailableException;
import com.garmin.subscriptions.ui.InAppPurchaseActivity;
import com.garmin.subscriptions.ui.InAppPurchaseTwaActivity;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import r22.z1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzd0/u1;", "", "Lcy2/i;", "purchaseDelegate", "La80/b;", "subscriptionPreferences", "Lr22/z1;", "themeDelegate", "<init>", "(Lcy2/i;La80/b;Lr22/z1;)V", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cy2.i f204176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a80.b f204177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f204178c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f204179a;

        static {
            int[] iArr = new int[c22.l.values().length];
            try {
                iArr[c22.l.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c22.l.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c22.l.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f204179a = iArr;
        }
    }

    public u1(cy2.i iVar, a80.b bVar, z1 z1Var) {
        iVar.getClass();
        bVar.getClass();
        z1Var.getClass();
        this.f204176a = iVar;
        this.f204177b = bVar;
        this.f204178c = z1Var;
    }

    public static cy2.c a(c22.l lVar, Resources resources) {
        c22.s1 s1Var = c22.s1.f23251a;
        Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
        s1Var.getClass();
        contextC.getClass();
        Locale localeA = hb2.h.a(contextC);
        localeA.getClass();
        String strD = c22.s1.d(localeA);
        gg1.v0.T.getClass();
        String strB = gg1.v0.a.b().b();
        boolean zE = e(lVar, resources);
        String str = zE ? "/web-data/uac/styles/gcm_uac20_dark.css" : "/web-data/uac/styles/gcm_uac20_light.css";
        String str2 = zE ? "/web-data/uac/styles/gcm_uac20_upc_dark.css" : "/web-data/uac/styles/gcm_uac20_upc_light.css";
        String str3 = zE ? "gcmDarkThemeV2" : "gcmLightThemeV2";
        String str4 = str2;
        String strConcat = strB.concat(str);
        String strConcat2 = strB.concat(str4);
        Boolean bool = Boolean.FALSE;
        return new cy2.c(strD, strConcat, strConcat2, str3, "gcm", bool, bool);
    }

    public static Intent b(u1 u1Var, Activity activity, String str, String str2, c80.d1 d1Var, int i14) {
        cy2.j eVar;
        if ((i14 & 8) != 0) {
            u1Var.getClass();
            d1Var = c80.d1.UAC;
        }
        c22.l lVarA = u1Var.f204178c.a();
        Resources resources = activity.getResources();
        resources.getClass();
        c22.s1 s1Var = c22.s1.f23251a;
        Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
        s1Var.getClass();
        contextC.getClass();
        Locale localeA = hb2.h.a(contextC);
        localeA.getClass();
        String strD = c22.s1.d(localeA);
        gg1.v0.T.getClass();
        String strB = gg1.v0.a.b().b();
        boolean zE = e(lVarA, resources);
        String str3 = zE ? "/web-data/uac/styles/gcm_plus_dark.css" : "/web-data/uac/styles/gcm_plus_light.css";
        String str4 = zE ? "/web-data/uac/styles/gcm_plus_upc_dark.css" : "/web-data/uac/styles/gcm_plus_upc_light.css";
        String str5 = zE ? "gcmDarkThemeV2" : "gcmLightThemeV2";
        String str6 = str4;
        String strConcat = strB.concat(str3);
        String strConcat2 = strB.concat(str6);
        Boolean bool = Boolean.FALSE;
        cy2.c cVar = new cy2.c(strD, strConcat, strConcat2, str5, "gcm", bool, bool);
        u1Var.getClass();
        u1Var.getClass();
        activity.getClass();
        str.getClass();
        d1Var.getClass();
        cy2.i iVar = u1Var.f204176a;
        int i15 = c80.d1.a.f25353a[d1Var.ordinal()];
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            eVar = new cy2.j.e(str, str2, null, null, 12, null);
        } else {
            if (i15 != 4) {
                lc.u0.r();
                return null;
            }
            eVar = new cy2.j.f(str, str2);
        }
        return xx2.d.a(activity, iVar, eVar, new cy2.g(new ub1.h(), Integer.valueOf(activity.getColor(R.color.gcm_background)), null, null, 12, null), cVar);
    }

    public static Intent c(u1 u1Var, Activity activity, String str, String str2, c80.d1 d1Var, cy2.f fVar) {
        cy2.j aVar;
        c22.l lVarA = u1Var.f204178c.a();
        Resources resources = activity.getResources();
        resources.getClass();
        cy2.c cVarA = a(lVarA, resources);
        u1Var.getClass();
        u1Var.getClass();
        activity.getClass();
        str.getClass();
        str2.getClass();
        d1Var.getClass();
        cy2.i iVar = u1Var.f204176a;
        int i14 = c80.d1.a.f25353a[d1Var.ordinal()];
        if (i14 == 1) {
            aVar = new cy2.j.a(str, null, 2, null);
        } else if (i14 == 2) {
            aVar = new cy2.j.d(str, null, str2, 2, null);
        } else if (i14 == 3) {
            aVar = new cy2.j.b(str, str2);
        } else {
            if (i14 != 4) {
                lc.u0.r();
                return null;
            }
            aVar = new cy2.j.c(str, null, 2, null);
        }
        return xx2.d.a(activity, iVar, aVar, new cy2.g(new ub1.h(), Integer.valueOf(activity.getColor(R.color.gcm_background)), fVar, null, 8, null), cVarA);
    }

    public static Intent d(u1 u1Var, Activity activity) throws WebViewNotAvailableException {
        c22.l lVarA = u1Var.f204178c.a();
        Resources resources = activity.getResources();
        resources.getClass();
        cy2.c cVarA = a(lVarA, resources);
        u1Var.getClass();
        u1Var.getClass();
        activity.getClass();
        cy2.i iVar = u1Var.f204176a;
        ub1.h hVar = new ub1.h();
        Integer numValueOf = Integer.valueOf(activity.getColor(R.color.gcm_background));
        String string = activity.getString(R.string.lbl_close);
        string.getClass();
        String string2 = activity.getString(R.string.lbl_emergency_info);
        Boolean bool = null;
        cy2.g gVar = new cy2.g(hVar, numValueOf, new cy2.f(R.drawable.close_x_thick, string, Integer.valueOf(activity.getColor(R.color.icon_1)), string2, null, 16, null), bool, 8, null);
        xx2.b bVar = xx2.b.f192586a;
        cy2.j.C1217j c1217j = new cy2.j.C1217j();
        xx2.b.f192586a.getClass();
        Logger logger = xx2.b.f192588c;
        by2.d dVar = xx2.b.f192587b;
        if (dVar == null) {
            vb.h.z("SubscriptionManager is not initialized");
            return null;
        }
        yx2.a aVar = dVar.f22254a;
        if (aVar == null) {
            org.apache.commons.lang3.e.w("This API is only supported for single user mode.");
            return null;
        }
        try {
            ve2.e eVar = aVar.f200044b;
            CookieManager.getInstance();
            xx2.d.f192590a.getClass();
            if (!xx2.d.f192592c.compareAndSet(false, true)) {
                logger.warn("UAC component is already in use! Doing nothing.");
                vb.h.z("UAC component is already in use");
                return null;
            }
            if (p005kotlin.jvm.internal.s.g(gVar.f56837d, Boolean.FALSE) || r.d.a(activity, p13.j0.f134944a) == null) {
                logger.debug("Custom Tabs is not available, launching purchase flow using WebView activity");
                InAppPurchaseActivity.f52722l.getClass();
                return InAppPurchaseActivity.a.a(activity, eVar, iVar, c1217j, gVar, cVarA);
            }
            logger.debug("Custom Tabs is available, launching purchase flow using Trusted Web Activity");
            InAppPurchaseTwaActivity.f52748r.getClass();
            return InAppPurchaseTwaActivity.a.a(activity, eVar, iVar, c1217j, cVarA, gVar.f56835b, null, null);
        } catch (Exception unused) {
            logger.warn("Android WebView is disabled, not installed or being updated");
            throw new WebViewNotAvailableException("Android WebView is disabled, not installed or being updated");
        }
    }

    public static boolean e(c22.l lVar, Resources resources) {
        int i14 = a.f204179a[lVar.ordinal()];
        if (i14 == 1) {
            return false;
        }
        if (i14 != 2) {
            if (i14 != 3) {
                lc.u0.r();
                return false;
            }
            if ((resources.getConfiguration().uiMode & 48) != 32) {
                return false;
            }
        }
        return true;
    }
}
