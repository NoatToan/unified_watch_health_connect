package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import defpackage.l77;
import defpackage.m77;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
@KeepForSdk
public final class DynamiteModule {

    @KeepForSdk
    public static final int LOCAL = -1;

    @KeepForSdk
    public static final int NONE = 0;

    @KeepForSdk
    public static final int NO_SELECTION = 0;

    @KeepForSdk
    public static final int REMOTE = 1;
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static zzq zzk;
    private static zzr zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();

    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();

    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();

    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    public static final VersionPolicy zza = new zzl();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    public interface VersionPolicy {

        @KeepForSdk
        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z) throws LoadingException;
        }

        @KeepForSdk
        public static class SelectionResult {

            @KeepForSdk
            public int localVersion = 0;

            @KeepForSdk
            public int remoteVersion = 0;

            @KeepForSdk
            public int selection = 0;
        }

        @KeepForSdk
        SelectionResult selectModule(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb = new StringBuilder();
            sb.append("Module descriptor id '");
            sb.append(strValueOf);
            sb.append("' didn't match expected id '");
            sb.append(str);
            sb.append("'");
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Local module descriptor class for ");
            sb2.append(str);
            sb2.append(" not found.");
            return 0;
        } catch (Exception e) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage()));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0203  */
    /* JADX WARN: Code duplicated, block: B:116:0x0209  */
    /* JADX WARN: Code duplicated, block: B:119:0x0212  */
    /* JADX WARN: Code duplicated, block: B:124:0x0224 A[Catch: all -> 0x0070, TryCatch #2 {all -> 0x0070, blocks: (B:5:0x0029, B:9:0x006a, B:16:0x0078, B:19:0x007e, B:22:0x0088, B:100:0x01bd, B:101:0x01c8, B:104:0x01cb, B:105:0x01cc, B:106:0x01d4, B:124:0x0224, B:125:0x023b, B:107:0x01d5, B:109:0x01ea, B:111:0x01f9, B:122:0x021b, B:123:0x0223, B:126:0x023c, B:127:0x026c), top: B:140:0x0029, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x007e A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #2 {all -> 0x0070, blocks: (B:5:0x0029, B:9:0x006a, B:16:0x0078, B:19:0x007e, B:22:0x0088, B:100:0x01bd, B:101:0x01c8, B:104:0x01cb, B:105:0x01cc, B:106:0x01d4, B:124:0x0224, B:125:0x023b, B:107:0x01d5, B:109:0x01ea, B:111:0x01f9, B:122:0x021b, B:123:0x0223, B:126:0x023c, B:127:0x026c), top: B:140:0x0029, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0093 A[Catch: all -> 0x01b0, TryCatch #0 {, blocks: (B:25:0x008d, B:27:0x0093, B:28:0x0095, B:96:0x01b2, B:97:0x01ba), top: B:139:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0098 A[Catch: all -> 0x00eb, LoadingException -> 0x00ee, RemoteException -> 0x00f1, TRY_ENTER, TryCatch #7 {RemoteException -> 0x00f1, LoadingException -> 0x00ee, all -> 0x00eb, blocks: (B:24:0x008c, B:30:0x0098, B:32:0x009f, B:33:0x00b6, B:37:0x00bc, B:39:0x00c4, B:41:0x00c8, B:42:0x00d3, B:49:0x00de, B:57:0x0100, B:59:0x0108, B:61:0x0110, B:62:0x0118, B:56:0x00f4, B:65:0x011b, B:66:0x011c, B:67:0x0124, B:68:0x0125, B:69:0x012d, B:72:0x0130, B:73:0x0131, B:75:0x014c, B:77:0x0153, B:79:0x015b, B:85:0x0186, B:87:0x018c, B:88:0x0195, B:89:0x019d, B:80:0x016a, B:81:0x0172, B:83:0x0175, B:84:0x017e, B:90:0x019e, B:91:0x01a6, B:92:0x01a7, B:93:0x01af, B:99:0x01bc), top: B:146:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:32:0x009f A[Catch: all -> 0x00eb, LoadingException -> 0x00ee, RemoteException -> 0x00f1, TryCatch #7 {RemoteException -> 0x00f1, LoadingException -> 0x00ee, all -> 0x00eb, blocks: (B:24:0x008c, B:30:0x0098, B:32:0x009f, B:33:0x00b6, B:37:0x00bc, B:39:0x00c4, B:41:0x00c8, B:42:0x00d3, B:49:0x00de, B:57:0x0100, B:59:0x0108, B:61:0x0110, B:62:0x0118, B:56:0x00f4, B:65:0x011b, B:66:0x011c, B:67:0x0124, B:68:0x0125, B:69:0x012d, B:72:0x0130, B:73:0x0131, B:75:0x014c, B:77:0x0153, B:79:0x015b, B:85:0x0186, B:87:0x018c, B:88:0x0195, B:89:0x019d, B:80:0x016a, B:81:0x0172, B:83:0x0175, B:84:0x017e, B:90:0x019e, B:91:0x01a6, B:92:0x01a7, B:93:0x01af, B:99:0x01bc), top: B:146:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bc A[Catch: all -> 0x00eb, LoadingException -> 0x00ee, RemoteException -> 0x00f1, TRY_ENTER, TryCatch #7 {RemoteException -> 0x00f1, LoadingException -> 0x00ee, all -> 0x00eb, blocks: (B:24:0x008c, B:30:0x0098, B:32:0x009f, B:33:0x00b6, B:37:0x00bc, B:39:0x00c4, B:41:0x00c8, B:42:0x00d3, B:49:0x00de, B:57:0x0100, B:59:0x0108, B:61:0x0110, B:62:0x0118, B:56:0x00f4, B:65:0x011b, B:66:0x011c, B:67:0x0124, B:68:0x0125, B:69:0x012d, B:72:0x0130, B:73:0x0131, B:75:0x014c, B:77:0x0153, B:79:0x015b, B:85:0x0186, B:87:0x018c, B:88:0x0195, B:89:0x019d, B:80:0x016a, B:81:0x0172, B:83:0x0175, B:84:0x017e, B:90:0x019e, B:91:0x01a6, B:92:0x01a7, B:93:0x01af, B:99:0x01bc), top: B:146:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0125 A[Catch: all -> 0x00eb, LoadingException -> 0x00ee, RemoteException -> 0x00f1, TryCatch #7 {RemoteException -> 0x00f1, LoadingException -> 0x00ee, all -> 0x00eb, blocks: (B:24:0x008c, B:30:0x0098, B:32:0x009f, B:33:0x00b6, B:37:0x00bc, B:39:0x00c4, B:41:0x00c8, B:42:0x00d3, B:49:0x00de, B:57:0x0100, B:59:0x0108, B:61:0x0110, B:62:0x0118, B:56:0x00f4, B:65:0x011b, B:66:0x011c, B:67:0x0124, B:68:0x0125, B:69:0x012d, B:72:0x0130, B:73:0x0131, B:75:0x014c, B:77:0x0153, B:79:0x015b, B:85:0x0186, B:87:0x018c, B:88:0x0195, B:89:0x019d, B:80:0x016a, B:81:0x0172, B:83:0x0175, B:84:0x017e, B:90:0x019e, B:91:0x01a6, B:92:0x01a7, B:93:0x01af, B:99:0x01bc), top: B:146:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0131 A[Catch: all -> 0x00eb, LoadingException -> 0x00ee, RemoteException -> 0x00f1, TryCatch #7 {RemoteException -> 0x00f1, LoadingException -> 0x00ee, all -> 0x00eb, blocks: (B:24:0x008c, B:30:0x0098, B:32:0x009f, B:33:0x00b6, B:37:0x00bc, B:39:0x00c4, B:41:0x00c8, B:42:0x00d3, B:49:0x00de, B:57:0x0100, B:59:0x0108, B:61:0x0110, B:62:0x0118, B:56:0x00f4, B:65:0x011b, B:66:0x011c, B:67:0x0124, B:68:0x0125, B:69:0x012d, B:72:0x0130, B:73:0x0131, B:75:0x014c, B:77:0x0153, B:79:0x015b, B:85:0x0186, B:87:0x018c, B:88:0x0195, B:89:0x019d, B:80:0x016a, B:81:0x0172, B:83:0x0175, B:84:0x017e, B:90:0x019e, B:91:0x01a6, B:92:0x01a7, B:93:0x01af, B:99:0x01bc), top: B:146:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:75:0x014c A[Catch: all -> 0x00eb, LoadingException -> 0x00ee, RemoteException -> 0x00f1, TryCatch #7 {RemoteException -> 0x00f1, LoadingException -> 0x00ee, all -> 0x00eb, blocks: (B:24:0x008c, B:30:0x0098, B:32:0x009f, B:33:0x00b6, B:37:0x00bc, B:39:0x00c4, B:41:0x00c8, B:42:0x00d3, B:49:0x00de, B:57:0x0100, B:59:0x0108, B:61:0x0110, B:62:0x0118, B:56:0x00f4, B:65:0x011b, B:66:0x011c, B:67:0x0124, B:68:0x0125, B:69:0x012d, B:72:0x0130, B:73:0x0131, B:75:0x014c, B:77:0x0153, B:79:0x015b, B:85:0x0186, B:87:0x018c, B:88:0x0195, B:89:0x019d, B:80:0x016a, B:81:0x0172, B:83:0x0175, B:84:0x017e, B:90:0x019e, B:91:0x01a6, B:92:0x01a7, B:93:0x01af, B:99:0x01bc), top: B:146:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0153 A[Catch: all -> 0x00eb, LoadingException -> 0x00ee, RemoteException -> 0x00f1, TryCatch #7 {RemoteException -> 0x00f1, LoadingException -> 0x00ee, all -> 0x00eb, blocks: (B:24:0x008c, B:30:0x0098, B:32:0x009f, B:33:0x00b6, B:37:0x00bc, B:39:0x00c4, B:41:0x00c8, B:42:0x00d3, B:49:0x00de, B:57:0x0100, B:59:0x0108, B:61:0x0110, B:62:0x0118, B:56:0x00f4, B:65:0x011b, B:66:0x011c, B:67:0x0124, B:68:0x0125, B:69:0x012d, B:72:0x0130, B:73:0x0131, B:75:0x014c, B:77:0x0153, B:79:0x015b, B:85:0x0186, B:87:0x018c, B:88:0x0195, B:89:0x019d, B:80:0x016a, B:81:0x0172, B:83:0x0175, B:84:0x017e, B:90:0x019e, B:91:0x01a6, B:92:0x01a7, B:93:0x01af, B:99:0x01bc), top: B:146:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:79:0x015b A[Catch: all -> 0x00eb, LoadingException -> 0x00ee, RemoteException -> 0x00f1, TryCatch #7 {RemoteException -> 0x00f1, LoadingException -> 0x00ee, all -> 0x00eb, blocks: (B:24:0x008c, B:30:0x0098, B:32:0x009f, B:33:0x00b6, B:37:0x00bc, B:39:0x00c4, B:41:0x00c8, B:42:0x00d3, B:49:0x00de, B:57:0x0100, B:59:0x0108, B:61:0x0110, B:62:0x0118, B:56:0x00f4, B:65:0x011b, B:66:0x011c, B:67:0x0124, B:68:0x0125, B:69:0x012d, B:72:0x0130, B:73:0x0131, B:75:0x014c, B:77:0x0153, B:79:0x015b, B:85:0x0186, B:87:0x018c, B:88:0x0195, B:89:0x019d, B:80:0x016a, B:81:0x0172, B:83:0x0175, B:84:0x017e, B:90:0x019e, B:91:0x01a6, B:92:0x01a7, B:93:0x01af, B:99:0x01bc), top: B:146:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:80:0x016a A[Catch: all -> 0x00eb, LoadingException -> 0x00ee, RemoteException -> 0x00f1, TryCatch #7 {RemoteException -> 0x00f1, LoadingException -> 0x00ee, all -> 0x00eb, blocks: (B:24:0x008c, B:30:0x0098, B:32:0x009f, B:33:0x00b6, B:37:0x00bc, B:39:0x00c4, B:41:0x00c8, B:42:0x00d3, B:49:0x00de, B:57:0x0100, B:59:0x0108, B:61:0x0110, B:62:0x0118, B:56:0x00f4, B:65:0x011b, B:66:0x011c, B:67:0x0124, B:68:0x0125, B:69:0x012d, B:72:0x0130, B:73:0x0131, B:75:0x014c, B:77:0x0153, B:79:0x015b, B:85:0x0186, B:87:0x018c, B:88:0x0195, B:89:0x019d, B:80:0x016a, B:81:0x0172, B:83:0x0175, B:84:0x017e, B:90:0x019e, B:91:0x01a6, B:92:0x01a7, B:93:0x01af, B:99:0x01bc), top: B:146:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0175 A[Catch: all -> 0x00eb, LoadingException -> 0x00ee, RemoteException -> 0x00f1, TryCatch #7 {RemoteException -> 0x00f1, LoadingException -> 0x00ee, all -> 0x00eb, blocks: (B:24:0x008c, B:30:0x0098, B:32:0x009f, B:33:0x00b6, B:37:0x00bc, B:39:0x00c4, B:41:0x00c8, B:42:0x00d3, B:49:0x00de, B:57:0x0100, B:59:0x0108, B:61:0x0110, B:62:0x0118, B:56:0x00f4, B:65:0x011b, B:66:0x011c, B:67:0x0124, B:68:0x0125, B:69:0x012d, B:72:0x0130, B:73:0x0131, B:75:0x014c, B:77:0x0153, B:79:0x015b, B:85:0x0186, B:87:0x018c, B:88:0x0195, B:89:0x019d, B:80:0x016a, B:81:0x0172, B:83:0x0175, B:84:0x017e, B:90:0x019e, B:91:0x01a6, B:92:0x01a7, B:93:0x01af, B:99:0x01bc), top: B:146:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:84:0x017e A[Catch: all -> 0x00eb, LoadingException -> 0x00ee, RemoteException -> 0x00f1, TryCatch #7 {RemoteException -> 0x00f1, LoadingException -> 0x00ee, all -> 0x00eb, blocks: (B:24:0x008c, B:30:0x0098, B:32:0x009f, B:33:0x00b6, B:37:0x00bc, B:39:0x00c4, B:41:0x00c8, B:42:0x00d3, B:49:0x00de, B:57:0x0100, B:59:0x0108, B:61:0x0110, B:62:0x0118, B:56:0x00f4, B:65:0x011b, B:66:0x011c, B:67:0x0124, B:68:0x0125, B:69:0x012d, B:72:0x0130, B:73:0x0131, B:75:0x014c, B:77:0x0153, B:79:0x015b, B:85:0x0186, B:87:0x018c, B:88:0x0195, B:89:0x019d, B:80:0x016a, B:81:0x0172, B:83:0x0175, B:84:0x017e, B:90:0x019e, B:91:0x01a6, B:92:0x01a7, B:93:0x01af, B:99:0x01bc), top: B:146:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:87:0x018c A[Catch: all -> 0x00eb, LoadingException -> 0x00ee, RemoteException -> 0x00f1, TryCatch #7 {RemoteException -> 0x00f1, LoadingException -> 0x00ee, all -> 0x00eb, blocks: (B:24:0x008c, B:30:0x0098, B:32:0x009f, B:33:0x00b6, B:37:0x00bc, B:39:0x00c4, B:41:0x00c8, B:42:0x00d3, B:49:0x00de, B:57:0x0100, B:59:0x0108, B:61:0x0110, B:62:0x0118, B:56:0x00f4, B:65:0x011b, B:66:0x011c, B:67:0x0124, B:68:0x0125, B:69:0x012d, B:72:0x0130, B:73:0x0131, B:75:0x014c, B:77:0x0153, B:79:0x015b, B:85:0x0186, B:87:0x018c, B:88:0x0195, B:89:0x019d, B:80:0x016a, B:81:0x0172, B:83:0x0175, B:84:0x017e, B:90:0x019e, B:91:0x01a6, B:92:0x01a7, B:93:0x01af, B:99:0x01bc), top: B:146:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0195 A[Catch: all -> 0x00eb, LoadingException -> 0x00ee, RemoteException -> 0x00f1, TryCatch #7 {RemoteException -> 0x00f1, LoadingException -> 0x00ee, all -> 0x00eb, blocks: (B:24:0x008c, B:30:0x0098, B:32:0x009f, B:33:0x00b6, B:37:0x00bc, B:39:0x00c4, B:41:0x00c8, B:42:0x00d3, B:49:0x00de, B:57:0x0100, B:59:0x0108, B:61:0x0110, B:62:0x0118, B:56:0x00f4, B:65:0x011b, B:66:0x011c, B:67:0x0124, B:68:0x0125, B:69:0x012d, B:72:0x0130, B:73:0x0131, B:75:0x014c, B:77:0x0153, B:79:0x015b, B:85:0x0186, B:87:0x018c, B:88:0x0195, B:89:0x019d, B:80:0x016a, B:81:0x0172, B:83:0x0175, B:84:0x017e, B:90:0x019e, B:91:0x01a6, B:92:0x01a7, B:93:0x01af, B:99:0x01bc), top: B:146:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:90:0x019e A[Catch: all -> 0x00eb, LoadingException -> 0x00ee, RemoteException -> 0x00f1, TryCatch #7 {RemoteException -> 0x00f1, LoadingException -> 0x00ee, all -> 0x00eb, blocks: (B:24:0x008c, B:30:0x0098, B:32:0x009f, B:33:0x00b6, B:37:0x00bc, B:39:0x00c4, B:41:0x00c8, B:42:0x00d3, B:49:0x00de, B:57:0x0100, B:59:0x0108, B:61:0x0110, B:62:0x0118, B:56:0x00f4, B:65:0x011b, B:66:0x011c, B:67:0x0124, B:68:0x0125, B:69:0x012d, B:72:0x0130, B:73:0x0131, B:75:0x014c, B:77:0x0153, B:79:0x015b, B:85:0x0186, B:87:0x018c, B:88:0x0195, B:89:0x019d, B:80:0x016a, B:81:0x0172, B:83:0x0175, B:84:0x017e, B:90:0x019e, B:91:0x01a6, B:92:0x01a7, B:93:0x01af, B:99:0x01bc), top: B:146:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01a7 A[Catch: all -> 0x00eb, LoadingException -> 0x00ee, RemoteException -> 0x00f1, TryCatch #7 {RemoteException -> 0x00f1, LoadingException -> 0x00ee, all -> 0x00eb, blocks: (B:24:0x008c, B:30:0x0098, B:32:0x009f, B:33:0x00b6, B:37:0x00bc, B:39:0x00c4, B:41:0x00c8, B:42:0x00d3, B:49:0x00de, B:57:0x0100, B:59:0x0108, B:61:0x0110, B:62:0x0118, B:56:0x00f4, B:65:0x011b, B:66:0x011c, B:67:0x0124, B:68:0x0125, B:69:0x012d, B:72:0x0130, B:73:0x0131, B:75:0x014c, B:77:0x0153, B:79:0x015b, B:85:0x0186, B:87:0x018c, B:88:0x0195, B:89:0x019d, B:80:0x016a, B:81:0x0172, B:83:0x0175, B:84:0x017e, B:90:0x019e, B:91:0x01a6, B:92:0x01a7, B:93:0x01af, B:99:0x01bc), top: B:146:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01b2 A[Catch: all -> 0x01b0, TRY_ENTER, TryCatch #0 {, blocks: (B:25:0x008d, B:27:0x0093, B:28:0x0095, B:96:0x01b2, B:97:0x01ba), top: B:139:0x008d }] */
    /* JADX WARN: Instruction removed from duplicated block: B:124:0x0224, please report this as an issue */
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        DynamiteModule dynamiteModuleZzc;
        int i;
        Boolean bool;
        zzq zzqVarZzg;
        int iZze;
        IObjectWrapper iObjectWrapperZzh;
        Object objUnwrap;
        DynamiteModule dynamiteModule;
        zzn zznVar;
        zzr zzrVar;
        zzn zznVar2;
        boolean z;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new LoadingException("null application Context", null);
        }
        ThreadLocal threadLocal = zzg;
        zzn zznVar3 = (zzn) threadLocal.get();
        zzn zznVar4 = new zzn(null);
        threadLocal.set(zznVar4);
        ThreadLocal threadLocal2 = zzh;
        Long l = (Long) threadLocal2.get();
        long jLongValue = l.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult selectionResultSelectModule = versionPolicy.selectModule(context, str, zzi);
            int i2 = selectionResultSelectModule.localVersion;
            int i3 = selectionResultSelectModule.remoteVersion;
            StringBuilder sb = new StringBuilder();
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i3);
            int i4 = selectionResultSelectModule.selection;
            if (i4 != 0) {
                if (i4 != -1) {
                    if (i4 == 1 || selectionResultSelectModule.remoteVersion != 0) {
                        if (i4 == -1) {
                            dynamiteModuleZzc = zzc(applicationContext, str);
                        } else {
                            if (i4 == 1) {
                                throw new LoadingException("VersionPolicy returned invalid code:" + i4, null);
                            }
                            try {
                                i = selectionResultSelectModule.remoteVersion;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (zzf(context)) {
                                            throw new LoadingException("Remote loading disabled", null);
                                        }
                                        bool = zzb;
                                    }
                                    if (bool != null) {
                                        throw new LoadingException("Failed to determine which loading route to use.", null);
                                    }
                                    if (bool.booleanValue()) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Selected remote version of ");
                                        sb2.append(str);
                                        sb2.append(", version >= ");
                                        sb2.append(i);
                                        synchronized (DynamiteModule.class) {
                                            zzrVar = zzl;
                                        }
                                        if (zzrVar != null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        zznVar2 = (zzn) threadLocal.get();
                                        if (zznVar2 != null || zznVar2.zza == null) {
                                            throw new LoadingException("No result cursor", null);
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor2 = zznVar2.zza;
                                        ObjectWrapper.wrap(null);
                                        synchronized (DynamiteModule.class) {
                                            z = zze >= 2;
                                        }
                                        Context context2 = (Context) ObjectWrapper.unwrap(z ? zzrVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i, ObjectWrapper.wrap(cursor2)) : zzrVar.zze(ObjectWrapper.wrap(applicationContext2), str, i, ObjectWrapper.wrap(cursor2)));
                                        if (context2 == null) {
                                            throw new LoadingException("Failed to get module context", null);
                                        }
                                        dynamiteModule = new DynamiteModule(context2);
                                    } else {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Selected remote version of ");
                                        sb3.append(str);
                                        sb3.append(", version >= ");
                                        sb3.append(i);
                                        zzqVarZzg = zzg(context);
                                        if (zzqVarZzg != null) {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                        }
                                        iZze = zzqVarZzg.zze();
                                        if (iZze >= 3) {
                                            zznVar = (zzn) threadLocal.get();
                                            if (zznVar != null) {
                                                throw new LoadingException("No cached result cursor holder", null);
                                            }
                                            iObjectWrapperZzh = zzqVarZzg.zzi(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(zznVar.zza));
                                        } else if (iZze == 2) {
                                            iObjectWrapperZzh = zzqVarZzg.zzj(ObjectWrapper.wrap(context), str, i);
                                        } else {
                                            iObjectWrapperZzh = zzqVarZzg.zzh(ObjectWrapper.wrap(context), str, i);
                                        }
                                        objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                                        if (objUnwrap != null) {
                                            throw new LoadingException("Failed to load remote module.", null);
                                        }
                                        dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                    }
                                    dynamiteModuleZzc = dynamiteModule;
                                } catch (RemoteException e) {
                                    throw new LoadingException("Failed to load remote module.", e, null);
                                } catch (LoadingException e2) {
                                    throw e2;
                                } catch (Throwable th) {
                                    CrashUtils.addDynamiteErrorToDropBox(context, th);
                                    throw new LoadingException("Failed to load remote module.", th, null);
                                }
                            } catch (LoadingException e3) {
                                String message = e3.getMessage();
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Failed to load remote module: ");
                                sb4.append(message);
                                int i5 = selectionResultSelectModule.localVersion;
                                if (i5 == 0 || versionPolicy.selectModule(context, str, new zzo(i5, 0)).selection != -1) {
                                    throw new LoadingException("Remote load failed. No local fallback found.", e3, null);
                                }
                                dynamiteModuleZzc = zzc(applicationContext, str);
                            }
                        }
                        if (jLongValue == 0) {
                            zzh.remove();
                        } else {
                            zzh.set(l);
                        }
                        cursor = zznVar4.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        zzg.set(zznVar3);
                        return dynamiteModuleZzc;
                    }
                } else if (selectionResultSelectModule.localVersion != 0) {
                    i4 = -1;
                    if (i4 == 1) {
                    }
                    if (i4 == -1) {
                        dynamiteModuleZzc = zzc(applicationContext, str);
                    } else {
                        if (i4 == 1) {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i4, null);
                        }
                        i = selectionResultSelectModule.remoteVersion;
                        synchronized (DynamiteModule.class) {
                            if (zzf(context)) {
                                throw new LoadingException("Remote loading disabled", null);
                            }
                            bool = zzb;
                            if (bool != null) {
                                throw new LoadingException("Failed to determine which loading route to use.", null);
                            }
                            if (bool.booleanValue()) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Selected remote version of ");
                                sb5.append(str);
                                sb5.append(", version >= ");
                                sb5.append(i);
                                synchronized (DynamiteModule.class) {
                                    zzrVar = zzl;
                                    if (zzrVar != null) {
                                        throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                    }
                                    zznVar2 = (zzn) threadLocal.get();
                                    if (zznVar2 != null) {
                                    }
                                    throw new LoadingException("No result cursor", null);
                                }
                            }
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("Selected remote version of ");
                            sb6.append(str);
                            sb6.append(", version >= ");
                            sb6.append(i);
                            zzqVarZzg = zzg(context);
                            if (zzqVarZzg != null) {
                                throw new LoadingException("Failed to create IDynamiteLoader.", null);
                            }
                            iZze = zzqVarZzg.zze();
                            if (iZze >= 3) {
                                zznVar = (zzn) threadLocal.get();
                                if (zznVar != null) {
                                    throw new LoadingException("No cached result cursor holder", null);
                                }
                                iObjectWrapperZzh = zzqVarZzg.zzi(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(zznVar.zza));
                            } else if (iZze == 2) {
                                iObjectWrapperZzh = zzqVarZzg.zzj(ObjectWrapper.wrap(context), str, i);
                            } else {
                                iObjectWrapperZzh = zzqVarZzg.zzh(ObjectWrapper.wrap(context), str, i);
                            }
                            objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                            if (objUnwrap != null) {
                                throw new LoadingException("Failed to load remote module.", null);
                            }
                            dynamiteModule = new DynamiteModule((Context) objUnwrap);
                            dynamiteModuleZzc = dynamiteModule;
                        }
                    }
                    if (jLongValue == 0) {
                        zzh.remove();
                    } else {
                        zzh.set(l);
                    }
                    cursor = zznVar4.zza;
                    if (cursor != null) {
                        cursor.close();
                    }
                    zzg.set(zznVar3);
                    return dynamiteModuleZzc;
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectionResultSelectModule.localVersion + " and remote version is " + selectionResultSelectModule.remoteVersion + ".", null);
        } catch (Throwable th2) {
            if (jLongValue == 0) {
                zzh.remove();
            } else {
                zzh.set(l);
            }
            Cursor cursor3 = zznVar4.zza;
            if (cursor3 != null) {
                cursor3.close();
            }
            zzg.set(zznVar3);
            throw th2;
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:141:0x0194 */
    /* JADX WARN: Code duplicated, block: B:106:0x0162 A[Catch: all -> 0x00e2, TRY_LEAVE, TryCatch #1 {all -> 0x00e2, blocks: (B:3:0x0002, B:64:0x00d7, B:66:0x00dd, B:73:0x00f8, B:101:0x0157, B:106:0x0162, B:122:0x0199, B:123:0x019c, B:117:0x0191, B:71:0x00e6, B:125:0x019e, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00d4, B:21:0x0049, B:45:0x00a0, B:48:0x00a3, B:55:0x00bb, B:63:0x00d6, B:61:0x00c1), top: B:131:0x0002, inners: #4, #10 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00af A[Catch: all -> 0x0036, TryCatch #8 {, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b8, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004e, B:27:0x0052, B:31:0x005c, B:33:0x0064, B:36:0x006b, B:43:0x0097, B:44:0x009f, B:39:0x0072, B:41:0x0078, B:42:0x0089, B:47:0x00a2, B:50:0x00a5, B:51:0x00af, B:17:0x003e), top: B:136:0x0026, inners: #11 }] */
    public static int zza(Context context, String str, boolean z) {
        Throwable th;
        RemoteException e;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                Cursor cursor2 = null;
                int iZzg = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else if (classLoader != null) {
                                try {
                                    zzd(classLoader);
                                } catch (LoadingException unused) {
                                }
                                bool = Boolean.TRUE;
                            } else {
                                if (!zzf(context)) {
                                    return 0;
                                }
                                if (zzd) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                } else {
                                    Boolean bool2 = Boolean.TRUE;
                                    if (bool2.equals(null)) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        try {
                                            int iZzb = zzb(context, str, z, true);
                                            String str2 = zzc;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader classLoaderZza = zzb.zza();
                                                if (classLoaderZza == null) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        m77.a();
                                                        String str3 = zzc;
                                                        Preconditions.checkNotNull(str3);
                                                        classLoaderZza = l77.a(str3, ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        String str4 = zzc;
                                                        Preconditions.checkNotNull(str4);
                                                        classLoaderZza = new zzc(str4, ClassLoader.getSystemClassLoader());
                                                    }
                                                }
                                                zzd(classLoaderZza);
                                                declaredField.set(null, classLoaderZza);
                                                zzb = bool2;
                                                return iZzb;
                                            }
                                            return iZzb;
                                        } catch (LoadingException unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        }
                                    }
                                }
                            }
                            zzb = bool;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String string = e2.toString();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to load module via V2: ");
                        sb.append(string);
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzb(context, str, z, false);
                    } catch (LoadingException e3) {
                        String message = e3.getMessage();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        return 0;
                    }
                }
                zzq zzqVarZzg = zzg(context);
                try {
                    if (zzqVarZzg != null) {
                        try {
                            int iZze = zzqVarZzg.zze();
                            if (iZze >= 3) {
                                zzn zznVar = (zzn) zzg.get();
                                if (zznVar == null || (cursor = zznVar.zza) == null) {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzqVarZzg.zzk(ObjectWrapper.wrap(context), str, z, ((Long) zzh.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i = cursor3.getInt(0);
                                                cursor2 = (i <= 0 || !zze(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iZzg = i;
                                            } else if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                        } catch (RemoteException e4) {
                                            e = e4;
                                            cursor2 = cursor3;
                                            String message2 = e.getMessage();
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("Failed to retrieve remote module version: ");
                                            sb3.append(message2);
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    } else if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                } else {
                                    iZzg = cursor.getInt(0);
                                }
                            } else {
                                iZzg = iZze == 2 ? zzqVarZzg.zzg(ObjectWrapper.wrap(context), str, z) : zzqVarZzg.zzf(ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (RemoteException e5) {
                            e = e5;
                        }
                    }
                    return iZzg;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00d9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private static int zzb(Context context, String str, boolean z, boolean z2) throws Throwable {
        Throwable th;
        Exception e;
        ?? r0 = 0;
        ?? r1 = 0;
        ?? r2 = 0;
        ?? r3 = 0;
        try {
            try {
                boolean z3 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) zzh.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z4 = false;
                            int i = cursorQuery.getInt(0);
                            if (i > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        zzc = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            zze = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (cursorQuery.getInt(columnIndex2) == 0) {
                                                z3 = false;
                                            }
                                            zzd = z3;
                                            z4 = z3;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                if (zze(cursorQuery)) {
                                    cursorQuery = null;
                                }
                            }
                            if (z2 && z4) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", r2 == true ? 1 : 0);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        if (e instanceof LoadingException) {
                            throw e;
                        }
                        throw new LoadingException("V2 version check failed: " + e.getMessage(), e, r1 == true ? 1 : 0);
                    }
                }
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", r3 == true ? 1 : 0);
            } catch (Throwable th3) {
                th = th3;
                r0 = context;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
        } catch (Throwable th4) {
            th = th4;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
    }

    private static DynamiteModule zzc(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context);
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        zzp zzpVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzr(iBinder);
            }
            zzl = zzrVar;
        } catch (ClassNotFoundException e) {
            e = e;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (InstantiationException e3) {
            e = e3;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = (zzn) zzg.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    private static boolean zzf(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean z = false;
        if (zzf == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            zzf = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                zzd = true;
            }
        }
        return z;
    }

    private static zzq zzg(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    zzk = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
            }
            return null;
        }
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @KeepForSdk
    public IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }
}
