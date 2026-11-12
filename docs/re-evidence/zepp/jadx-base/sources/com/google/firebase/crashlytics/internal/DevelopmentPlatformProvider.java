package com.google.firebase.crashlytics.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class DevelopmentPlatformProvider {
    private static final String c = "Unity";
    private static final String d = "Flutter";
    private static final String e = "com.google.firebase.crashlytics.unity_version";
    private static final String f = "flutter_assets";
    private final Context a;

    @Nullable
    private b b = null;

    public class b {

        @Nullable
        private final String a;

        @Nullable
        private final String b;

        private b() {
            int resourcesIdentifier = CommonUtils.getResourcesIdentifier(DevelopmentPlatformProvider.this.a, DevelopmentPlatformProvider.e, "string");
            if (resourcesIdentifier == 0) {
                if (!DevelopmentPlatformProvider.this.c(DevelopmentPlatformProvider.f)) {
                    this.a = null;
                    this.b = null;
                    return;
                } else {
                    this.a = DevelopmentPlatformProvider.d;
                    this.b = null;
                    Logger.getLogger().v("Development platform is: Flutter");
                    return;
                }
            }
            this.a = DevelopmentPlatformProvider.c;
            String string = DevelopmentPlatformProvider.this.a.getResources().getString(resourcesIdentifier);
            this.b = string;
            Logger.getLogger().v("Unity Editor version is: " + string);
        }
    }

    public DevelopmentPlatformProvider(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        String[] list;
        try {
            return (this.a.getAssets() == null || (list = this.a.getAssets().list(str)) == null || list.length <= 0) ? false : true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b d() {
        if (this.b == null) {
            this.b = new b();
        }
        return this.b;
    }

    public static boolean isUnity(Context context) {
        return CommonUtils.getResourcesIdentifier(context, e, "string") != 0;
    }

    @Nullable
    public String getDevelopmentPlatform() {
        return d().a;
    }

    @Nullable
    public String getDevelopmentPlatformVersion() {
        return d().b;
    }
}
