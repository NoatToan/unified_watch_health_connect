package com.huawei.hms.ads.dynamicloader;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.huawei.hms.ads.uiengineloader.ab;
import com.huawei.hms.ads.uiengineloader.af;
import com.huawei.hms.ads.uiengineloader.m;
import com.huawei.hms.ads.uiengineloader.n;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class e extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f12788c = "DynamicContext";
    private static final ThreadLocal<ApplicationInfo> d = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final PackageInfo f12789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f12790b;
    private final ClassLoader e;
    private final Resources f;
    private final Resources g;

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
        super.getApplicationContext().unregisterComponentCallbacks(componentCallbacks);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
        super.getApplicationContext().registerComponentCallbacks(componentCallbacks);
    }

    @Override // com.huawei.hms.ads.dynamicloader.a, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (Arrays.asList("connectivity", "location", "wifi", "user").contains(str)) {
            return getBaseContext().getSystemService(str);
        }
        Arrays.asList("sensor").contains(str);
        return super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources = this.g;
        return resources == null ? this.f : resources;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public String getPackageName() {
        PackageInfo packageInfo = this.f12789a;
        if (packageInfo != null) {
            String str = packageInfo.packageName;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return super.getPackageName();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        return this.e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ApplicationInfo getApplicationInfo() {
        ThreadLocal<ApplicationInfo> threadLocal = d;
        return threadLocal.get() != null ? threadLocal.get() : super.getApplicationInfo();
    }

    private String b() {
        return this.f12790b;
    }

    private Resources a(String str) {
        this.f12789a.applicationInfo.publicSourceDir = str;
        this.f12789a.applicationInfo.sourceDir = str;
        try {
            return getBaseContext().getPackageManager().getResourcesForApplication(this.f12789a.applicationInfo);
        } catch (PackageManager.NameNotFoundException e) {
            af.c(f12788c, "NameNotFoundException:" + e.getLocalizedMessage());
            return null;
        }
    }

    private PackageInfo a() {
        return this.f12789a;
    }

    public e(Context context, String str, int i) {
        super(context);
        PackageInfo packageArchiveInfo = getBaseContext().getPackageManager().getPackageArchiveInfo(str, 128);
        this.f12789a = packageArchiveInfo;
        this.e = ((ab.a() && m.a(context)) ? new m() : new n()).a(context, str, i, packageArchiveInfo);
        this.g = a(str);
        this.f = context.getResources();
        this.f12790b = str;
        af.b(f12788c, "Create dynamicContext success.");
    }
}
