package com.google.androidbrowserhelper.trusted.splashscreens;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import androidx.browser.trusted.i;
import com.google.androidbrowserhelper.trusted.ChromeLegacyUtils;
import java.util.HashMap;
import java.util.Map;
import r.e;

/* JADX INFO: loaded from: classes14.dex */
class SystemBarColorPredictor {
    private Map<String, SupportedFeatures> mSupportedFeaturesCache = new HashMap();

    public static class SupportedFeatures {
        public final boolean colorSchemeCustomization;
        public final boolean navbarColorCustomization;

        private SupportedFeatures(boolean z14, boolean z15) {
            this.navbarColorCustomization = z14;
            this.colorSchemeCustomization = z15;
        }
    }

    private static int getExpectedColorScheme(Context context, i iVar) {
        Bundle extras = iVar.f5327b.a().f148677a.getExtras();
        Integer num = extras == null ? null : (Integer) extras.get("androidx.browser.customtabs.extra.COLOR_SCHEME");
        if (num == null || num.intValue() == 0) {
            return (context.getResources().getConfiguration().uiMode & 48) == 32 ? 2 : 1;
        }
        return num.intValue();
    }

    private SupportedFeatures getSupportedFeatures(Context context, String str) {
        SupportedFeatures supportedFeatures = this.mSupportedFeaturesCache.get(str);
        if (supportedFeatures != null) {
            return supportedFeatures;
        }
        if (ChromeLegacyUtils.supportsNavbarAndColorCustomization(context.getPackageManager(), str)) {
            boolean z14 = true;
            SupportedFeatures supportedFeatures2 = new SupportedFeatures(z14, z14);
            this.mSupportedFeaturesCache.put(str, supportedFeatures2);
            return supportedFeatures2;
        }
        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(new Intent().setAction("android.support.customtabs.action.CustomTabsService").setPackage(str), 64);
        SupportedFeatures supportedFeatures3 = new SupportedFeatures(hasCategory(resolveInfoResolveService, "androidx.browser.customtabs.category.NavBarColorCustomization"), hasCategory(resolveInfoResolveService, "androidx.browser.customtabs.category.ColorSchemeCustomization"));
        this.mSupportedFeaturesCache.put(str, supportedFeatures3);
        return supportedFeatures3;
    }

    private static boolean hasCategory(ResolveInfo resolveInfo, String str) {
        IntentFilter intentFilter;
        return (resolveInfo == null || (intentFilter = resolveInfo.filter) == null || !intentFilter.hasCategory(str)) ? false : true;
    }

    private boolean providerSupportsColorSchemeParams(Context context, String str) {
        return getSupportedFeatures(context, str).colorSchemeCustomization;
    }

    private boolean providerSupportsNavBarColorCustomization(Context context, String str) {
        return getSupportedFeatures(context, str).navbarColorCustomization;
    }

    public Integer getExpectedNavbarColor(Context context, String str, i iVar) {
        Intent intent = iVar.f5327b.a().f148677a;
        if (!providerSupportsNavBarColorCustomization(context, str)) {
            return ChromeLegacyUtils.usesWhiteNavbar(str) ? -1 : null;
        }
        if (providerSupportsColorSchemeParams(context, str)) {
            return e.a(getExpectedColorScheme(context, iVar), intent).f148634c;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        return (Integer) extras.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR");
    }

    public Integer getExpectedStatusBarColor(Context context, String str, i iVar) {
        Intent intent = iVar.f5327b.a().f148677a;
        if (providerSupportsColorSchemeParams(context, str)) {
            return e.a(getExpectedColorScheme(context, iVar), intent).f148632a;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        return (Integer) extras.get("android.support.customtabs.extra.TOOLBAR_COLOR");
    }
}
