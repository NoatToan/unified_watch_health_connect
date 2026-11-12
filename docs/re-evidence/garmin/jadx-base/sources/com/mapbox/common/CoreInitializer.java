package com.mapbox.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.mapbox.common.core.module.CommonSingletonModuleProvider;
import com.mapbox.maps.MapboxConstants;
import d53.u;
import d53.w;
import java.io.File;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/mapbox/common/CoreInitializer;", "Lzd/b;", "Lcom/mapbox/common/MapboxSDKCommon;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "setupSqlite", "(Landroid/content/Context;)V", "create", "(Landroid/content/Context;)Lcom/mapbox/common/MapboxSDKCommon;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CoreInitializer implements zd.b<MapboxSDKCommon> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String SQLITE_TMPDIR_VAR_NAME = "SQLITE_TMPDIR";

    public static final SystemInformation createSystemInformation() {
        return INSTANCE.createSystemInformation();
    }

    private final void setupSqlite(Context context) throws ErrnoException {
        String str = Os.getenv(SQLITE_TMPDIR_VAR_NAME);
        if (str == null || w.J(str)) {
            Os.setenv(SQLITE_TMPDIR_VAR_NAME, context.getCacheDir().getAbsolutePath(), true);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // zd.b
    public MapboxSDKCommon create(Context context) throws ErrnoException {
        context.getClass();
        setupSqlite(context);
        MapboxSDKCommon mapboxSDKCommonInvoke = MapboxSDKCommon.INSTANCE.invoke(context);
        CommonSingletonModuleProvider.INSTANCE.getLoaderInstance().load(MapboxConstants.CORE_SHARED_LIBRARY_NAME);
        Log.info("Using Mapbox Common SDK v" + Version.getCommonSDKVersionString() + CoreConstants.LEFT_PARENTHESIS_CHAR + Version.getCommonSDKRevisionString() + CoreConstants.RIGHT_PARENTHESIS_CHAR, "common");
        String accessToken = MapboxOptions.getAccessToken();
        if (w.J(accessToken)) {
            Log.info("Telemetry service not started, missing token", "telemetry");
            return mapboxSDKCommonInvoke;
        }
        MapboxOptions.setAccessToken(accessToken);
        return mapboxSDKCommonInvoke;
    }

    @Override // zd.b
    public List<Class<? extends zd.b<?>>> dependencies() {
        return j0.f134944a;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/mapbox/common/CoreInitializer$Companion;", "", "()V", "SQLITE_TMPDIR_VAR_NAME", "", "createSystemInformation", "Lcom/mapbox/common/SystemInformation;", "isEmulator", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private final boolean isEmulator() {
            String str = Build.BRAND;
            str.getClass();
            if (u.y(str, "generic", false)) {
                String str2 = Build.DEVICE;
                str2.getClass();
                if (u.y(str2, "generic", false)) {
                    return true;
                }
            }
            String str3 = Build.FINGERPRINT;
            str3.getClass();
            if (u.y(str3, "generic", false) || u.y(str3, PrivacyUpdateRequestError.UNKNOWN, false)) {
                return true;
            }
            String str4 = Build.HARDWARE;
            str4.getClass();
            if (w.z(str4, "goldfish", false) || w.z(str4, "ranchu", false)) {
                return true;
            }
            String str5 = Build.MODEL;
            str5.getClass();
            if (w.z(str5, "google_sdk", false) || w.z(str5, "Emulator", false) || w.z(str5, "Android SDK built for x86", false)) {
                return true;
            }
            String str6 = Build.MANUFACTURER;
            str6.getClass();
            if (w.z(str6, "Genymotion", false)) {
                return true;
            }
            String str7 = Build.PRODUCT;
            str7.getClass();
            return w.z(str7, "sdk_google", false) || w.z(str7, "google_sdk", false) || w.z(str7, "sdk", false) || w.z(str7, "sdk_x86", false) || w.z(str7, "vbox86p", false) || w.z(str7, "emulator", false) || w.z(str7, "simulator", false);
        }

        public final SystemInformation createSystemInformation() {
            String str;
            String str2;
            String strValueOf;
            PackageInfo packageInfo;
            Context context = MapboxSDKCommon.INSTANCE.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0)) == null) {
                str = PrivacyUpdateRequestError.UNKNOWN;
                str2 = str;
                strValueOf = str2;
            } else {
                String string = packageManager.getApplicationLabel(packageInfo.applicationInfo).toString();
                String str3 = packageInfo.versionName;
                if (str3 == null) {
                    str3 = "";
                }
                str = string;
                strValueOf = String.valueOf(packageInfo.versionCode);
                str2 = str3;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String str4 = applicationInfo != null ? applicationInfo.packageName : null;
            String str5 = str4 == null ? PrivacyUpdateRequestError.UNKNOWN : str4;
            String str6 = Build.DEVICE;
            String str7 = str6 == null ? "" : str6;
            String[] strArr = Build.SUPPORTED_ABIS;
            strArr.getClass();
            String str8 = (String) p13.u.H(strArr);
            String str9 = str8 == null ? "" : str8;
            String str10 = Build.MODEL;
            String str11 = (str10 == null || w.J(str10)) ? "" : str10;
            File filesDir = context.getFilesDir();
            String absolutePath = filesDir != null ? filesDir.getAbsolutePath() : null;
            String str12 = absolutePath == null ? "" : absolutePath;
            File cacheDir = context.getCacheDir();
            String absolutePath2 = cacheDir != null ? cacheDir.getAbsolutePath() : null;
            return new SystemInformation(Platform.ANDROID, "Android", Build.VERSION.RELEASE.toString(), str, str5, str2, strValueOf, str7, str9, str11, str12, !isEmulator(), absolutePath2 == null ? "" : absolutePath2);
        }

        private Companion() {
        }
    }
}
