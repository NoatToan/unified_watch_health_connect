package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.huawei.agconnect.apms.Agent;
import com.huawei.openalliance.ad.constant.ParamConstants;
import java.lang.reflect.Field;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\tH\u0002J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J5\u0010\u0016\u001a\u00020\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\b\u001cJ\u0014\u0010\u001d\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u001e\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u001f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010 \u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/braintreepayments/api/DeviceInspector;", "", "()V", "appHelper", "Lcom/braintreepayments/api/AppHelper;", "signatureVerifier", "Lcom/braintreepayments/api/SignatureVerifier;", "(Lcom/braintreepayments/api/AppHelper;Lcom/braintreepayments/api/SignatureVerifier;)V", "dropInVersion", "", "getDropInVersion", "()Ljava/lang/String;", "isDeviceEmulator", "", "()Z", "getAPIVersion", "getAppName", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "getAppVersion", "getApplicationInfo", "Landroid/content/pm/ApplicationInfo;", "getDeviceMetadata", "Lcom/braintreepayments/api/DeviceMetadata;", "configuration", "Lcom/braintreepayments/api/Configuration;", "sessionId", "integration", "getDeviceMetadata$BraintreeCore_release", "getPackageInfo", "isPayPalInstalled", "isVenmoAppSwitchAvailable", "isVenmoInstalled", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class to {
    public static final d d = new d(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sd f49415b;
    private final up e;

    public to(sd sdVar, up upVar) {
        zcp.c(sdVar, "");
        zcp.c(upVar, "");
        this.f49415b = sdVar;
        this.e = upVar;
    }

    public to() {
        this(new sd(), new up());
    }

    public final tk e(Context context, tf tfVar, String str, String str2) {
        return new tk(context != null ? context.getPackageName() : null, d(context), "4.49.1", b(), "braintreeclientsdk", Build.MANUFACTURER, Build.MODEL, c(), tfVar != null ? tfVar.getK() : null, "mobile-native", str2, d(), a(context), tfVar != null ? tfVar.getAl() : null, Agent.OS_NAME, str);
    }

    public final boolean e(Context context) {
        return this.f49415b.c(context, "com.venmo");
    }

    private final boolean d() {
        if (!zes.d("google_sdk", Build.PRODUCT, true) && !zes.d("sdk", Build.PRODUCT, true) && !zes.d("Genymotion", Build.MANUFACTURER, true)) {
            String str = Build.FINGERPRINT;
            zcp.b((Object) str, "");
            if (!zes.b((CharSequence) str, (CharSequence) "generic", false, 2, (Object) null)) {
                return false;
            }
        }
        return true;
    }

    private final String d(Context context) {
        PackageManager packageManager;
        ApplicationInfo applicationInfoB = b(context);
        if (applicationInfoB == null) {
            return "ApplicationNameUnknown";
        }
        String strValueOf = String.valueOf((context == null || (packageManager = context.getPackageManager()) == null) ? null : packageManager.getApplicationLabel(applicationInfoB));
        return strValueOf == null ? "ApplicationNameUnknown" : strValueOf;
    }

    private final ApplicationInfo b(Context context) {
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    return packageManager.getApplicationInfo(context.getPackageName(), 0);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return null;
    }

    private final String a(Context context) {
        String strC = c(context);
        return strC == null ? "VersionUnknown" : strC;
    }

    private final String c(Context context) {
        if (context == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final String b() {
        return "Android API " + Build.VERSION.SDK_INT;
    }

    private final String c() {
        return d.b();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\b\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/braintreepayments/api/DeviceInspector$Companion;", "", "()V", "PAYPAL_APP_PACKAGE", "", "VENMO_APP_PACKAGE", "VENMO_APP_SWITCH_ACTIVITY", "VENMO_BASE_64_ENCODED_SIGNATURE", "getVENMO_BASE_64_ENCODED_SIGNATURE$annotations", "venmoIntent", "Landroid/content/Intent;", "getVenmoIntent", "()Landroid/content/Intent;", "getDropInVersion", "getDropInVersion$BraintreeCore_release", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class d {
        private d() {
        }

        public final String b() {
            try {
                Field field = Class.forName("com.braintreepayments.api.dropin.BuildConfig").getField("VERSION_NAME");
                field.setAccessible(true);
                return (String) field.get(zcv.b(String.class));
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
                return null;
            }
        }

        public /* synthetic */ d(zcm zcmVar) {
            this();
        }
    }
}
