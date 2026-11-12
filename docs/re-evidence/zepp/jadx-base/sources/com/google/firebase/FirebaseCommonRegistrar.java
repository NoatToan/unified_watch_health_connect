package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatInfo;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.KotlinDetector;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.huami.passport.Configs;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    private static final String a = "fire-android";
    private static final String b = "fire-core";
    private static final String c = "device-name";
    private static final String d = "device-model";
    private static final String e = "device-brand";
    private static final String f = "android-target-sdk";
    private static final String g = "android-min-sdk";
    private static final String h = "android-platform";
    private static final String i = "android-installer";
    private static final String j = "kotlin";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 16 && context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return Configs.Params.TV;
        }
        if (i2 >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (i2 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return (i2 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
        }
        return "auto";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : "";
    }

    private static String i(String str) {
        return str.replace(StringUtil.SPACE, '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DefaultUserAgentPublisher.component());
        arrayList.add(DefaultHeartBeatInfo.component());
        arrayList.add(LibraryVersionComponent.create(a, String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(LibraryVersionComponent.create(b, "20.0.0"));
        arrayList.add(LibraryVersionComponent.create(c, i(Build.PRODUCT)));
        arrayList.add(LibraryVersionComponent.create(d, i(Build.DEVICE)));
        arrayList.add(LibraryVersionComponent.create(e, i(Build.BRAND)));
        arrayList.add(LibraryVersionComponent.fromContext(f, new LibraryVersionComponent.VersionExtractor() { // from class: l72
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.e((Context) obj);
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext(g, new LibraryVersionComponent.VersionExtractor() { // from class: m72
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.f((Context) obj);
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext(h, new LibraryVersionComponent.VersionExtractor() { // from class: n72
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.g((Context) obj);
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext(i, new LibraryVersionComponent.VersionExtractor() { // from class: k72
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.h((Context) obj);
            }
        }));
        String strDetectVersion = KotlinDetector.detectVersion();
        if (strDetectVersion != null) {
            arrayList.add(LibraryVersionComponent.create(j, strDetectVersion));
        }
        return arrayList;
    }
}
