package com.huawei.hms.ads.dynamicloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.huawei.hms.ads.uiengineloader.ad;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends e {
    @Override // android.content.ContextWrapper, android.content.Context
    public final String getPackageResourcePath() {
        return ((e) this).f12790b;
    }

    @Override // com.huawei.hms.ads.dynamicloader.e, android.content.ContextWrapper, android.content.Context
    public final String getPackageName() {
        return getApplicationInfo().packageName;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getPackageCodePath() {
        return ((e) this).f12790b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getFilesDir() {
        return new File(ad.c(((e) this).f12790b));
    }

    @Override // com.huawei.hms.ads.dynamicloader.e, android.content.ContextWrapper, android.content.Context
    public final ApplicationInfo getApplicationInfo() {
        return ((e) this).f12789a.applicationInfo;
    }

    private void a() {
        ((e) this).f12789a.applicationInfo.processName = getBaseContext().getApplicationInfo().processName;
    }

    public i(Context context, String str, int i) {
        super(context, str, i);
        ((e) this).f12789a.applicationInfo.processName = getBaseContext().getApplicationInfo().processName;
    }
}
