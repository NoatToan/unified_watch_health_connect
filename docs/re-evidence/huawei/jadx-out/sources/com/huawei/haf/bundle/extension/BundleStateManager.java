package com.huawei.haf.bundle.extension;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleSetting;
import com.huawei.haf.store.ExtendSharedPreferences;
import com.huawei.haf.store.SharedStoreManager;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleStateManager implements AppBundleSetting {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f5811a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f5812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5813c;
    private String d;
    private String e;

    private ExtendSharedPreferences f() {
        ExtendSharedPreferences extendSharedPreferencesD = SharedStoreManager.d("app_bundle_info");
        if (!this.f5812b) {
            extendSharedPreferencesD.edit().remove("user_agreed_module_set").apply();
            this.f5812b = true;
        }
        return extendSharedPreferencesD;
    }

    private void e(String str, boolean z) {
        ExtendSharedPreferences extendSharedPreferencesF = f();
        if (z) {
            extendSharedPreferencesF.addStringSet("installed_module_set", str);
        } else {
            extendSharedPreferencesF.removeStringSet("installed_module_set", str);
        }
    }

    private void c(String str, boolean z) {
        ExtendSharedPreferences extendSharedPreferencesF = f();
        if (z) {
            extendSharedPreferencesF.addStringSet("force_agreed_module_set", str);
        } else {
            extendSharedPreferencesF.removeStringSet("force_agreed_module_set", str);
        }
    }

    public Set<String> d() {
        ExtendSharedPreferences extendSharedPreferencesF = f();
        HashSet hashSet = new HashSet();
        Set<String> stringSet = extendSharedPreferencesF.getStringSet("installed_module_set", null);
        if (stringSet != null) {
            hashSet.addAll(stringSet);
        }
        Set<String> stringSet2 = extendSharedPreferencesF.getStringSet("force_agreed_module_set", null);
        if (stringSet2 != null) {
            hashSet.addAll(stringSet2);
        }
        return hashSet;
    }

    @Override // com.huawei.haf.bundle.AppBundleSetting
    public void setAllowAutoUpdateModule(boolean z) {
        f().edit().putBoolean("auto_update_enable", z).apply();
    }

    @Override // com.huawei.haf.bundle.AppBundleSetting
    public boolean isAllowAutoUpdateModule() {
        return f().getBoolean("auto_update_enable", true);
    }

    @Override // com.huawei.haf.bundle.AppBundleSetting
    public void setAllowUsingMobileUpdateModule(boolean z) {
        f().edit().putBoolean("use_mobile_update_enable", z).apply();
    }

    @Override // com.huawei.haf.bundle.AppBundleSetting
    public boolean isAllowUsingMobileUpdateModule() {
        return f().getBoolean("use_mobile_update_enable", false);
    }

    @Override // com.huawei.haf.bundle.AppBundleSetting
    public void setAllowDownloadModule(Context context, String str, boolean z) {
        if (!z) {
            c(str, z);
        } else {
            if (!AppBundle.c().isBundleModule(str) || AppBundle.c().isBuiltInModule(context, str)) {
                return;
            }
            c(str, z);
        }
    }

    @Override // com.huawei.haf.bundle.AppBundleSetting
    public void updateModuleState(Context context, String str, boolean z) {
        if (!z) {
            e(str, z);
        } else if (AppBundle.c().isBundleModule(str)) {
            e(str, z);
        }
    }

    @Override // com.huawei.haf.bundle.AppBundleSetting
    public boolean isAllowDownloadModule(Context context, String str) {
        if (!AppBundle.c().isBundleModule(str) || AppBundle.c().isBuiltInModule(context, str)) {
            return true;
        }
        return f().containsStringSet("force_agreed_module_set", str);
    }

    @Override // com.huawei.haf.bundle.AppBundleSetting
    public void setTestEnvironment(String str, boolean z, String str2) {
        this.d = str;
        this.f5811a = z;
        this.e = str2;
        this.f5813c = (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) ? false : true;
    }

    public boolean a() {
        return this.f5813c;
    }

    public boolean b() {
        if (a()) {
            return this.f5811a;
        }
        return true;
    }

    public String c() {
        if (a()) {
            return this.d;
        }
        return null;
    }

    public String e() {
        if (a()) {
            return this.e;
        }
        return null;
    }
}
