package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.browser.customtabs.CustomTabsService;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/facebook/internal/CustomTabUtils;", "", "", "getDefaultRedirectURI", "developerDefinedRedirectURI", "getValidRedirectURI", "getChromePackage", "", "a", "[Ljava/lang/String;", "CHROME_PACKAGES", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class CustomTabUtils {

    @NotNull
    public static final CustomTabUtils INSTANCE = new CustomTabUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String[] CHROME_PACKAGES = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private CustomTabUtils() {
    }

    @JvmStatic
    @Nullable
    public static final String getChromePackage() {
        if (CrashShieldHandler.isObjectCrashing(CustomTabUtils.class)) {
            return null;
        }
        try {
            Context applicationContext = FacebookSdk.getApplicationContext();
            List<ResolveInfo> listQueryIntentServices = applicationContext.getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
            if (listQueryIntentServices != null) {
                HashSet hashSet = ArraysKt___ArraysKt.toHashSet(CHROME_PACKAGES);
                Iterator<ResolveInfo> it2 = listQueryIntentServices.iterator();
                while (it2.hasNext()) {
                    ServiceInfo serviceInfo = it2.next().serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CustomTabUtils.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final String getDefaultRedirectURI() {
        if (CrashShieldHandler.isObjectCrashing(CustomTabUtils.class)) {
            return null;
        }
        try {
            return Validate.CUSTOM_TAB_REDIRECT_URI_PREFIX + FacebookSdk.getApplicationContext().getPackageName();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CustomTabUtils.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final String getValidRedirectURI(@NotNull String developerDefinedRedirectURI) {
        if (CrashShieldHandler.isObjectCrashing(CustomTabUtils.class)) {
            return null;
        }
        try {
            if (Validate.hasCustomTabRedirectActivity(FacebookSdk.getApplicationContext(), developerDefinedRedirectURI)) {
                return developerDefinedRedirectURI;
            }
            return Validate.hasCustomTabRedirectActivity(FacebookSdk.getApplicationContext(), getDefaultRedirectURI()) ? getDefaultRedirectURI() : "";
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CustomTabUtils.class);
            return null;
        }
    }
}
