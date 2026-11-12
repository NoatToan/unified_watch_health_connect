package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
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
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes14.dex */
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
    private static Boolean zzc = null;
    private static String zzd = null;
    private static boolean zze = false;
    private static int zzf = -1;
    private static Boolean zzg;
    private static zzp zzl;
    private static zzq zzm;
    private final Context zzk;
    private static final ThreadLocal zzh = new ThreadLocal();
    private static final ThreadLocal zzi = new zze();
    private static final VersionPolicy.IVersions zzj = new zzf();

    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzg();

    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzh();

    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzi();

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzj();

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzk();

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzl();
    public static final VersionPolicy zza = new zzm();
    public static final VersionPolicy zzb = new zzc();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public interface VersionPolicy {

        @KeepForSdk
        public interface IVersions {
            int zza(Context context, String str, boolean z14);

            int zzb(Context context, String str);
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
        SelectionResult selectModule(Context context, String str, IVersions iVersions);
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzk = context;
    }

    @KeepForSdk
    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 61);
            sb3.append("com.google.android.gms.dynamite.descriptors.");
            sb3.append(str);
            sb3.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb3.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            new StringBuilder(String.valueOf(declaredField.get(null)).length() + 50 + String.valueOf(str).length() + 1);
            return 0;
        } catch (ClassNotFoundException unused) {
            new StringBuilder(String.valueOf(str).length() + 45);
            return 0;
        } catch (Exception e4) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e4.getMessage()));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d0 A[Catch: all -> 0x0124, LoadingException -> 0x0127, RemoteException -> 0x012a, TryCatch #8 {RemoteException -> 0x012a, LoadingException -> 0x0127, all -> 0x0124, blocks: (B:37:0x00c2, B:43:0x00ce, B:45:0x00d5, B:46:0x00ef, B:50:0x00f5, B:52:0x00fd, B:54:0x0101, B:55:0x010c, B:62:0x0117, B:70:0x0139, B:72:0x0141, B:73:0x0148, B:74:0x0151, B:69:0x012d, B:77:0x0154, B:78:0x0155, B:79:0x015d, B:80:0x015e, B:81:0x0166, B:84:0x0169, B:85:0x016a, B:87:0x0188, B:89:0x018f, B:91:0x0197, B:97:0x01c2, B:99:0x01c8, B:100:0x01d0, B:101:0x01d8, B:92:0x01a6, B:93:0x01ae, B:95:0x01b1, B:96:0x01ba, B:102:0x01d9, B:103:0x01e1, B:104:0x01e2, B:105:0x01ea, B:111:0x01f7), top: B:161:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01d9 A[Catch: all -> 0x0124, LoadingException -> 0x0127, RemoteException -> 0x012a, TryCatch #8 {RemoteException -> 0x012a, LoadingException -> 0x0127, all -> 0x0124, blocks: (B:37:0x00c2, B:43:0x00ce, B:45:0x00d5, B:46:0x00ef, B:50:0x00f5, B:52:0x00fd, B:54:0x0101, B:55:0x010c, B:62:0x0117, B:70:0x0139, B:72:0x0141, B:73:0x0148, B:74:0x0151, B:69:0x012d, B:77:0x0154, B:78:0x0155, B:79:0x015d, B:80:0x015e, B:81:0x0166, B:84:0x0169, B:85:0x016a, B:87:0x0188, B:89:0x018f, B:91:0x0197, B:97:0x01c2, B:99:0x01c8, B:100:0x01d0, B:101:0x01d8, B:92:0x01a6, B:93:0x01ae, B:95:0x01b1, B:96:0x01ba, B:102:0x01d9, B:103:0x01e1, B:104:0x01e2, B:105:0x01ea, B:111:0x01f7), top: B:161:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01e2 A[Catch: all -> 0x0124, LoadingException -> 0x0127, RemoteException -> 0x012a, TryCatch #8 {RemoteException -> 0x012a, LoadingException -> 0x0127, all -> 0x0124, blocks: (B:37:0x00c2, B:43:0x00ce, B:45:0x00d5, B:46:0x00ef, B:50:0x00f5, B:52:0x00fd, B:54:0x0101, B:55:0x010c, B:62:0x0117, B:70:0x0139, B:72:0x0141, B:73:0x0148, B:74:0x0151, B:69:0x012d, B:77:0x0154, B:78:0x0155, B:79:0x015d, B:80:0x015e, B:81:0x0166, B:84:0x0169, B:85:0x016a, B:87:0x0188, B:89:0x018f, B:91:0x0197, B:97:0x01c2, B:99:0x01c8, B:100:0x01d0, B:101:0x01d8, B:92:0x01a6, B:93:0x01ae, B:95:0x01b1, B:96:0x01ba, B:102:0x01d9, B:103:0x01e1, B:104:0x01e2, B:105:0x01ea, B:111:0x01f7), top: B:161:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01ed A[Catch: all -> 0x01eb, TRY_ENTER, TryCatch #4 {, blocks: (B:38:0x00c3, B:40:0x00c9, B:41:0x00cb, B:108:0x01ed, B:109:0x01f5), top: B:157:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x023d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0243  */
    /* JADX WARN: Code duplicated, block: B:130:0x024c  */
    /* JADX WARN: Code duplicated, block: B:135:0x025e A[Catch: all -> 0x0094, TryCatch #2 {all -> 0x0094, blocks: (B:7:0x004a, B:11:0x008d, B:18:0x0099, B:22:0x00a0, B:35:0x00be, B:112:0x01f8, B:113:0x0203, B:116:0x0206, B:117:0x0207, B:118:0x020f, B:119:0x0210, B:121:0x0227, B:123:0x0235, B:133:0x0255, B:134:0x025d, B:135:0x025e, B:136:0x027d, B:137:0x027e, B:138:0x02ca), top: B:154:0x004a, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a0 A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #2 {all -> 0x0094, blocks: (B:7:0x004a, B:11:0x008d, B:18:0x0099, B:22:0x00a0, B:35:0x00be, B:112:0x01f8, B:113:0x0203, B:116:0x0206, B:117:0x0207, B:118:0x020f, B:119:0x0210, B:121:0x0227, B:123:0x0235, B:133:0x0255, B:134:0x025d, B:135:0x025e, B:136:0x027d, B:137:0x027e, B:138:0x02ca), top: B:154:0x004a, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9 A[Catch: all -> 0x01eb, TryCatch #4 {, blocks: (B:38:0x00c3, B:40:0x00c9, B:41:0x00cb, B:108:0x01ed, B:109:0x01f5), top: B:157:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce A[Catch: all -> 0x0124, LoadingException -> 0x0127, RemoteException -> 0x012a, TRY_ENTER, TryCatch #8 {RemoteException -> 0x012a, LoadingException -> 0x0127, all -> 0x0124, blocks: (B:37:0x00c2, B:43:0x00ce, B:45:0x00d5, B:46:0x00ef, B:50:0x00f5, B:52:0x00fd, B:54:0x0101, B:55:0x010c, B:62:0x0117, B:70:0x0139, B:72:0x0141, B:73:0x0148, B:74:0x0151, B:69:0x012d, B:77:0x0154, B:78:0x0155, B:79:0x015d, B:80:0x015e, B:81:0x0166, B:84:0x0169, B:85:0x016a, B:87:0x0188, B:89:0x018f, B:91:0x0197, B:97:0x01c2, B:99:0x01c8, B:100:0x01d0, B:101:0x01d8, B:92:0x01a6, B:93:0x01ae, B:95:0x01b1, B:96:0x01ba, B:102:0x01d9, B:103:0x01e1, B:104:0x01e2, B:105:0x01ea, B:111:0x01f7), top: B:161:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5 A[Catch: all -> 0x0124, LoadingException -> 0x0127, RemoteException -> 0x012a, TryCatch #8 {RemoteException -> 0x012a, LoadingException -> 0x0127, all -> 0x0124, blocks: (B:37:0x00c2, B:43:0x00ce, B:45:0x00d5, B:46:0x00ef, B:50:0x00f5, B:52:0x00fd, B:54:0x0101, B:55:0x010c, B:62:0x0117, B:70:0x0139, B:72:0x0141, B:73:0x0148, B:74:0x0151, B:69:0x012d, B:77:0x0154, B:78:0x0155, B:79:0x015d, B:80:0x015e, B:81:0x0166, B:84:0x0169, B:85:0x016a, B:87:0x0188, B:89:0x018f, B:91:0x0197, B:97:0x01c2, B:99:0x01c8, B:100:0x01d0, B:101:0x01d8, B:92:0x01a6, B:93:0x01ae, B:95:0x01b1, B:96:0x01ba, B:102:0x01d9, B:103:0x01e1, B:104:0x01e2, B:105:0x01ea, B:111:0x01f7), top: B:161:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f5 A[Catch: all -> 0x0124, LoadingException -> 0x0127, RemoteException -> 0x012a, TRY_ENTER, TryCatch #8 {RemoteException -> 0x012a, LoadingException -> 0x0127, all -> 0x0124, blocks: (B:37:0x00c2, B:43:0x00ce, B:45:0x00d5, B:46:0x00ef, B:50:0x00f5, B:52:0x00fd, B:54:0x0101, B:55:0x010c, B:62:0x0117, B:70:0x0139, B:72:0x0141, B:73:0x0148, B:74:0x0151, B:69:0x012d, B:77:0x0154, B:78:0x0155, B:79:0x015d, B:80:0x015e, B:81:0x0166, B:84:0x0169, B:85:0x016a, B:87:0x0188, B:89:0x018f, B:91:0x0197, B:97:0x01c2, B:99:0x01c8, B:100:0x01d0, B:101:0x01d8, B:92:0x01a6, B:93:0x01ae, B:95:0x01b1, B:96:0x01ba, B:102:0x01d9, B:103:0x01e1, B:104:0x01e2, B:105:0x01ea, B:111:0x01f7), top: B:161:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x015e A[Catch: all -> 0x0124, LoadingException -> 0x0127, RemoteException -> 0x012a, TryCatch #8 {RemoteException -> 0x012a, LoadingException -> 0x0127, all -> 0x0124, blocks: (B:37:0x00c2, B:43:0x00ce, B:45:0x00d5, B:46:0x00ef, B:50:0x00f5, B:52:0x00fd, B:54:0x0101, B:55:0x010c, B:62:0x0117, B:70:0x0139, B:72:0x0141, B:73:0x0148, B:74:0x0151, B:69:0x012d, B:77:0x0154, B:78:0x0155, B:79:0x015d, B:80:0x015e, B:81:0x0166, B:84:0x0169, B:85:0x016a, B:87:0x0188, B:89:0x018f, B:91:0x0197, B:97:0x01c2, B:99:0x01c8, B:100:0x01d0, B:101:0x01d8, B:92:0x01a6, B:93:0x01ae, B:95:0x01b1, B:96:0x01ba, B:102:0x01d9, B:103:0x01e1, B:104:0x01e2, B:105:0x01ea, B:111:0x01f7), top: B:161:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x016a A[Catch: all -> 0x0124, LoadingException -> 0x0127, RemoteException -> 0x012a, TryCatch #8 {RemoteException -> 0x012a, LoadingException -> 0x0127, all -> 0x0124, blocks: (B:37:0x00c2, B:43:0x00ce, B:45:0x00d5, B:46:0x00ef, B:50:0x00f5, B:52:0x00fd, B:54:0x0101, B:55:0x010c, B:62:0x0117, B:70:0x0139, B:72:0x0141, B:73:0x0148, B:74:0x0151, B:69:0x012d, B:77:0x0154, B:78:0x0155, B:79:0x015d, B:80:0x015e, B:81:0x0166, B:84:0x0169, B:85:0x016a, B:87:0x0188, B:89:0x018f, B:91:0x0197, B:97:0x01c2, B:99:0x01c8, B:100:0x01d0, B:101:0x01d8, B:92:0x01a6, B:93:0x01ae, B:95:0x01b1, B:96:0x01ba, B:102:0x01d9, B:103:0x01e1, B:104:0x01e2, B:105:0x01ea, B:111:0x01f7), top: B:161:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0188 A[Catch: all -> 0x0124, LoadingException -> 0x0127, RemoteException -> 0x012a, TryCatch #8 {RemoteException -> 0x012a, LoadingException -> 0x0127, all -> 0x0124, blocks: (B:37:0x00c2, B:43:0x00ce, B:45:0x00d5, B:46:0x00ef, B:50:0x00f5, B:52:0x00fd, B:54:0x0101, B:55:0x010c, B:62:0x0117, B:70:0x0139, B:72:0x0141, B:73:0x0148, B:74:0x0151, B:69:0x012d, B:77:0x0154, B:78:0x0155, B:79:0x015d, B:80:0x015e, B:81:0x0166, B:84:0x0169, B:85:0x016a, B:87:0x0188, B:89:0x018f, B:91:0x0197, B:97:0x01c2, B:99:0x01c8, B:100:0x01d0, B:101:0x01d8, B:92:0x01a6, B:93:0x01ae, B:95:0x01b1, B:96:0x01ba, B:102:0x01d9, B:103:0x01e1, B:104:0x01e2, B:105:0x01ea, B:111:0x01f7), top: B:161:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x018f A[Catch: all -> 0x0124, LoadingException -> 0x0127, RemoteException -> 0x012a, TryCatch #8 {RemoteException -> 0x012a, LoadingException -> 0x0127, all -> 0x0124, blocks: (B:37:0x00c2, B:43:0x00ce, B:45:0x00d5, B:46:0x00ef, B:50:0x00f5, B:52:0x00fd, B:54:0x0101, B:55:0x010c, B:62:0x0117, B:70:0x0139, B:72:0x0141, B:73:0x0148, B:74:0x0151, B:69:0x012d, B:77:0x0154, B:78:0x0155, B:79:0x015d, B:80:0x015e, B:81:0x0166, B:84:0x0169, B:85:0x016a, B:87:0x0188, B:89:0x018f, B:91:0x0197, B:97:0x01c2, B:99:0x01c8, B:100:0x01d0, B:101:0x01d8, B:92:0x01a6, B:93:0x01ae, B:95:0x01b1, B:96:0x01ba, B:102:0x01d9, B:103:0x01e1, B:104:0x01e2, B:105:0x01ea, B:111:0x01f7), top: B:161:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0197 A[Catch: all -> 0x0124, LoadingException -> 0x0127, RemoteException -> 0x012a, TryCatch #8 {RemoteException -> 0x012a, LoadingException -> 0x0127, all -> 0x0124, blocks: (B:37:0x00c2, B:43:0x00ce, B:45:0x00d5, B:46:0x00ef, B:50:0x00f5, B:52:0x00fd, B:54:0x0101, B:55:0x010c, B:62:0x0117, B:70:0x0139, B:72:0x0141, B:73:0x0148, B:74:0x0151, B:69:0x012d, B:77:0x0154, B:78:0x0155, B:79:0x015d, B:80:0x015e, B:81:0x0166, B:84:0x0169, B:85:0x016a, B:87:0x0188, B:89:0x018f, B:91:0x0197, B:97:0x01c2, B:99:0x01c8, B:100:0x01d0, B:101:0x01d8, B:92:0x01a6, B:93:0x01ae, B:95:0x01b1, B:96:0x01ba, B:102:0x01d9, B:103:0x01e1, B:104:0x01e2, B:105:0x01ea, B:111:0x01f7), top: B:161:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01a6 A[Catch: all -> 0x0124, LoadingException -> 0x0127, RemoteException -> 0x012a, TryCatch #8 {RemoteException -> 0x012a, LoadingException -> 0x0127, all -> 0x0124, blocks: (B:37:0x00c2, B:43:0x00ce, B:45:0x00d5, B:46:0x00ef, B:50:0x00f5, B:52:0x00fd, B:54:0x0101, B:55:0x010c, B:62:0x0117, B:70:0x0139, B:72:0x0141, B:73:0x0148, B:74:0x0151, B:69:0x012d, B:77:0x0154, B:78:0x0155, B:79:0x015d, B:80:0x015e, B:81:0x0166, B:84:0x0169, B:85:0x016a, B:87:0x0188, B:89:0x018f, B:91:0x0197, B:97:0x01c2, B:99:0x01c8, B:100:0x01d0, B:101:0x01d8, B:92:0x01a6, B:93:0x01ae, B:95:0x01b1, B:96:0x01ba, B:102:0x01d9, B:103:0x01e1, B:104:0x01e2, B:105:0x01ea, B:111:0x01f7), top: B:161:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x01b1 A[Catch: all -> 0x0124, LoadingException -> 0x0127, RemoteException -> 0x012a, TryCatch #8 {RemoteException -> 0x012a, LoadingException -> 0x0127, all -> 0x0124, blocks: (B:37:0x00c2, B:43:0x00ce, B:45:0x00d5, B:46:0x00ef, B:50:0x00f5, B:52:0x00fd, B:54:0x0101, B:55:0x010c, B:62:0x0117, B:70:0x0139, B:72:0x0141, B:73:0x0148, B:74:0x0151, B:69:0x012d, B:77:0x0154, B:78:0x0155, B:79:0x015d, B:80:0x015e, B:81:0x0166, B:84:0x0169, B:85:0x016a, B:87:0x0188, B:89:0x018f, B:91:0x0197, B:97:0x01c2, B:99:0x01c8, B:100:0x01d0, B:101:0x01d8, B:92:0x01a6, B:93:0x01ae, B:95:0x01b1, B:96:0x01ba, B:102:0x01d9, B:103:0x01e1, B:104:0x01e2, B:105:0x01ea, B:111:0x01f7), top: B:161:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01ba A[Catch: all -> 0x0124, LoadingException -> 0x0127, RemoteException -> 0x012a, TryCatch #8 {RemoteException -> 0x012a, LoadingException -> 0x0127, all -> 0x0124, blocks: (B:37:0x00c2, B:43:0x00ce, B:45:0x00d5, B:46:0x00ef, B:50:0x00f5, B:52:0x00fd, B:54:0x0101, B:55:0x010c, B:62:0x0117, B:70:0x0139, B:72:0x0141, B:73:0x0148, B:74:0x0151, B:69:0x012d, B:77:0x0154, B:78:0x0155, B:79:0x015d, B:80:0x015e, B:81:0x0166, B:84:0x0169, B:85:0x016a, B:87:0x0188, B:89:0x018f, B:91:0x0197, B:97:0x01c2, B:99:0x01c8, B:100:0x01d0, B:101:0x01d8, B:92:0x01a6, B:93:0x01ae, B:95:0x01b1, B:96:0x01ba, B:102:0x01d9, B:103:0x01e1, B:104:0x01e2, B:105:0x01ea, B:111:0x01f7), top: B:161:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01c8 A[Catch: all -> 0x0124, LoadingException -> 0x0127, RemoteException -> 0x012a, TryCatch #8 {RemoteException -> 0x012a, LoadingException -> 0x0127, all -> 0x0124, blocks: (B:37:0x00c2, B:43:0x00ce, B:45:0x00d5, B:46:0x00ef, B:50:0x00f5, B:52:0x00fd, B:54:0x0101, B:55:0x010c, B:62:0x0117, B:70:0x0139, B:72:0x0141, B:73:0x0148, B:74:0x0151, B:69:0x012d, B:77:0x0154, B:78:0x0155, B:79:0x015d, B:80:0x015e, B:81:0x0166, B:84:0x0169, B:85:0x016a, B:87:0x0188, B:89:0x018f, B:91:0x0197, B:97:0x01c2, B:99:0x01c8, B:100:0x01d0, B:101:0x01d8, B:92:0x01a6, B:93:0x01ae, B:95:0x01b1, B:96:0x01ba, B:102:0x01d9, B:103:0x01e1, B:104:0x01e2, B:105:0x01ea, B:111:0x01f7), top: B:161:0x00c2 }] */
    @KeepForSdk
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws Throwable {
        long j8;
        DynamiteModule dynamiteModuleZze;
        Cursor cursor;
        int i14;
        Boolean bool;
        zzp zzpVarZzg;
        int iZzi;
        IObjectWrapper iObjectWrapperZze;
        Object objUnwrap;
        zzn zznVar;
        zzq zzqVar;
        zzn zznVar2;
        boolean z14;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        byte[] bArr = null;
        if (applicationContext == null) {
            throw new LoadingException("null application Context", null);
        }
        ThreadLocal threadLocal = zzh;
        zzn zznVar3 = (zzn) threadLocal.get();
        zzn zznVar4 = new zzn(null);
        threadLocal.set(zznVar4);
        ThreadLocal threadLocal2 = zzi;
        Long l14 = (Long) threadLocal2.get();
        long jLongValue = l14.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            VersionPolicy.SelectionResult selectionResultSelectModule = versionPolicy.selectModule(context, str, zzj);
            j8 = jLongValue;
            try {
                new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(selectionResultSelectModule.localVersion).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(selectionResultSelectModule.remoteVersion).length());
                int i15 = selectionResultSelectModule.selection;
                if (i15 != 0) {
                    if (i15 != -1) {
                        if (i15 == 1 || selectionResultSelectModule.remoteVersion != 0) {
                            if (i15 == -1) {
                                DynamiteModule dynamiteModuleZze2 = zze(applicationContext, str);
                                if (j8 == 0) {
                                    threadLocal2.remove();
                                } else {
                                    threadLocal2.set(l14);
                                }
                                cursor2 = zznVar4.zza;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                threadLocal.set(zznVar3);
                                return dynamiteModuleZze2;
                            }
                            if (i15 == 1) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(i15).length() + 36);
                                sb3.append("VersionPolicy returned invalid code:");
                                sb3.append(i15);
                                throw new LoadingException(sb3.toString(), null);
                            }
                            try {
                                i14 = selectionResultSelectModule.remoteVersion;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (zzb(context)) {
                                            throw new LoadingException("Remote loading disabled", null);
                                        }
                                        bool = zzc;
                                    }
                                    if (bool != null) {
                                        throw new LoadingException("Failed to determine which loading route to use.", null);
                                    }
                                    if (bool.booleanValue()) {
                                        new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i14).length());
                                        synchronized (DynamiteModule.class) {
                                            zzqVar = zzm;
                                        }
                                        if (zzqVar != null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        zznVar2 = (zzn) threadLocal.get();
                                        if (zznVar2 != null || zznVar2.zza == null) {
                                            throw new LoadingException("No result cursor", null);
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor3 = zznVar2.zza;
                                        ObjectWrapper.wrap(null);
                                        synchronized (DynamiteModule.class) {
                                            z14 = zzf >= 2;
                                        }
                                        Context context2 = (Context) ObjectWrapper.unwrap(z14 ? zzqVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i14, ObjectWrapper.wrap(cursor3)) : zzqVar.zze(ObjectWrapper.wrap(applicationContext2), str, i14, ObjectWrapper.wrap(cursor3)));
                                        if (context2 == null) {
                                            throw new LoadingException("Failed to get module context", bArr);
                                        }
                                        dynamiteModuleZze = new DynamiteModule(context2);
                                    } else {
                                        new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i14).length());
                                        zzpVarZzg = zzg(context);
                                        if (zzpVarZzg != null) {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                        }
                                        iZzi = zzpVarZzg.zzi();
                                        if (iZzi >= 3) {
                                            zznVar = (zzn) threadLocal.get();
                                            if (zznVar != null) {
                                                throw new LoadingException("No cached result cursor holder", null);
                                            }
                                            iObjectWrapperZze = zzpVarZzg.zzk(ObjectWrapper.wrap(context), str, i14, ObjectWrapper.wrap(zznVar.zza));
                                        } else if (iZzi == 2) {
                                            iObjectWrapperZze = zzpVarZzg.zzg(ObjectWrapper.wrap(context), str, i14);
                                        } else {
                                            iObjectWrapperZze = zzpVarZzg.zze(ObjectWrapper.wrap(context), str, i14);
                                        }
                                        objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZze);
                                        if (objUnwrap != null) {
                                            throw new LoadingException("Failed to load remote module.", null);
                                        }
                                        dynamiteModuleZze = new DynamiteModule((Context) objUnwrap);
                                    }
                                    if (j8 == 0) {
                                        zzi.remove();
                                    } else {
                                        zzi.set(l14);
                                    }
                                    cursor = zznVar4.zza;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    zzh.set(zznVar3);
                                    return dynamiteModuleZze;
                                } catch (RemoteException e4) {
                                    throw new LoadingException("Failed to load remote module.", e4, null);
                                } catch (LoadingException e14) {
                                    throw e14;
                                } catch (Throwable th3) {
                                    CrashUtils.addDynamiteErrorToDropBox(context, th3);
                                    throw new LoadingException("Failed to load remote module.", th3, null);
                                }
                            } catch (LoadingException e15) {
                                new StringBuilder(String.valueOf(e15.getMessage()).length() + 30);
                                int i16 = selectionResultSelectModule.localVersion;
                                if (i16 == 0 || versionPolicy.selectModule(context, str, new zzo(i16, 0)).selection != -1) {
                                    throw new LoadingException("Remote load failed. No local fallback found.", e15, null);
                                }
                                dynamiteModuleZze = zze(applicationContext, str);
                            }
                        }
                    } else if (selectionResultSelectModule.localVersion != 0) {
                        i15 = -1;
                        if (i15 == 1) {
                        }
                        if (i15 == -1) {
                            DynamiteModule dynamiteModuleZze3 = zze(applicationContext, str);
                            if (j8 == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(l14);
                            }
                            cursor2 = zznVar4.zza;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(zznVar3);
                            return dynamiteModuleZze3;
                        }
                        if (i15 == 1) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(i15).length() + 36);
                            sb4.append("VersionPolicy returned invalid code:");
                            sb4.append(i15);
                            throw new LoadingException(sb4.toString(), null);
                        }
                        i14 = selectionResultSelectModule.remoteVersion;
                        synchronized (DynamiteModule.class) {
                            if (zzb(context)) {
                                throw new LoadingException("Remote loading disabled", null);
                            }
                            bool = zzc;
                            if (bool != null) {
                                throw new LoadingException("Failed to determine which loading route to use.", null);
                            }
                            if (bool.booleanValue()) {
                                new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i14).length());
                                synchronized (DynamiteModule.class) {
                                    zzqVar = zzm;
                                    if (zzqVar != null) {
                                        throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                    }
                                    zznVar2 = (zzn) threadLocal.get();
                                    if (zznVar2 != null) {
                                    }
                                    throw new LoadingException("No result cursor", null);
                                }
                            }
                            new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i14).length());
                            zzpVarZzg = zzg(context);
                            if (zzpVarZzg != null) {
                                throw new LoadingException("Failed to create IDynamiteLoader.", null);
                            }
                            iZzi = zzpVarZzg.zzi();
                            if (iZzi >= 3) {
                                zznVar = (zzn) threadLocal.get();
                                if (zznVar != null) {
                                    throw new LoadingException("No cached result cursor holder", null);
                                }
                                iObjectWrapperZze = zzpVarZzg.zzk(ObjectWrapper.wrap(context), str, i14, ObjectWrapper.wrap(zznVar.zza));
                            } else if (iZzi == 2) {
                                iObjectWrapperZze = zzpVarZzg.zzg(ObjectWrapper.wrap(context), str, i14);
                            } else {
                                iObjectWrapperZze = zzpVarZzg.zze(ObjectWrapper.wrap(context), str, i14);
                            }
                            objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZze);
                            if (objUnwrap != null) {
                                throw new LoadingException("Failed to load remote module.", null);
                            }
                            dynamiteModuleZze = new DynamiteModule((Context) objUnwrap);
                            if (j8 == 0) {
                                zzi.remove();
                            } else {
                                zzi.set(l14);
                            }
                            cursor = zznVar4.zza;
                            if (cursor != null) {
                                cursor.close();
                            }
                            zzh.set(zznVar3);
                            return dynamiteModuleZze;
                        }
                    }
                }
                int i17 = selectionResultSelectModule.localVersion;
                int i18 = selectionResultSelectModule.remoteVersion;
                StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i17).length() + 23 + String.valueOf(i18).length() + 1);
                sb5.append("No acceptable module ");
                sb5.append(str);
                sb5.append(" found. Local version is ");
                sb5.append(i17);
                sb5.append(" and remote version is ");
                sb5.append(i18);
                sb5.append(".");
                throw new LoadingException(sb5.toString(), null);
            } catch (Throwable th4) {
                th = th4;
                if (j8 == 0) {
                    zzi.remove();
                } else {
                    zzi.set(l14);
                }
                Cursor cursor4 = zznVar4.zza;
                if (cursor4 != null) {
                    cursor4.close();
                }
                zzh.set(zznVar3);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            j8 = jLongValue;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0166 A[Catch: all -> 0x00df, TRY_LEAVE, TryCatch #12 {all -> 0x00df, blocks: (B:3:0x0002, B:64:0x00d4, B:66:0x00da, B:74:0x00f9, B:102:0x015b, B:107:0x0166, B:123:0x01a2, B:124:0x01a5, B:118:0x0199, B:72:0x00e5, B:126:0x01a7, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00d1, B:21:0x0049, B:45:0x009f, B:48:0x00a2, B:55:0x00ba, B:63:0x00d3, B:61:0x00c0), top: B:142:0x0002, inners: #4, #8 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ae A[Catch: all -> 0x0036, TryCatch #6 {all -> 0x0036, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b7, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004f, B:27:0x0053, B:31:0x005d, B:33:0x0065, B:36:0x006c, B:43:0x0096, B:44:0x009e, B:39:0x0073, B:41:0x0079, B:42:0x0088, B:47:0x00a1, B:50:0x00a4, B:51:0x00ae, B:17:0x003e), top: B:136:0x0026, inners: #9 }] */
    public static int zza(Context context, String str, boolean z14) {
        Throwable th3;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzc;
                Cursor cursor2 = null;
                int iZzh = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        zzf(classLoader);
                                    } catch (LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!zzb(context)) {
                                        return 0;
                                    }
                                    if (zze) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iZzc = zzc(context, str, z14, true);
                                                String str2 = zzd;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderZza = zzb.zza();
                                                    if (classLoaderZza == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            String str3 = zzd;
                                                            Preconditions.checkNotNull(str3);
                                                            classLoaderZza = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                        } else {
                                                            String str4 = zzd;
                                                            Preconditions.checkNotNull(str4);
                                                            classLoaderZza = new zzd(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    zzf(classLoaderZza);
                                                    declaredField.set(null, classLoaderZza);
                                                    zzc = bool2;
                                                    return iZzc;
                                                }
                                                return iZzc;
                                            } catch (LoadingException unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                zzc = bool;
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e4) {
                        new StringBuilder(e4.toString().length() + 30);
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzc(context, str, z14, false);
                    } catch (LoadingException e14) {
                        new StringBuilder(String.valueOf(e14.getMessage()).length() + 42);
                        return 0;
                    }
                }
                zzp zzpVarZzg = zzg(context);
                if (zzpVarZzg != null) {
                    try {
                        try {
                            int iZzi = zzpVarZzg.zzi();
                            if (iZzi >= 3) {
                                zzn zznVar = (zzn) zzh.get();
                                if (zznVar == null || (cursor = zznVar.zza) == null) {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzpVarZzg.zzj(ObjectWrapper.wrap(context), str, z14, ((Long) zzi.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i14 = cursor3.getInt(0);
                                                cursor2 = (i14 <= 0 || !zzd(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iZzh = i14;
                                            } else if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                        } catch (RemoteException e15) {
                                            remoteException = e15;
                                            cursor2 = cursor3;
                                            new StringBuilder(String.valueOf(remoteException.getMessage()).length() + 42);
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th5) {
                                            th3 = th5;
                                            cursor2 = cursor3;
                                            if (cursor2 == null) {
                                                throw th3;
                                            }
                                            cursor2.close();
                                            throw th3;
                                        }
                                    } else if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                } else {
                                    iZzh = cursor.getInt(0);
                                }
                            } else {
                                iZzh = iZzi == 2 ? zzpVarZzg.zzh(ObjectWrapper.wrap(context), str, z14) : zzpVarZzg.zzf(ObjectWrapper.wrap(context), str, z14);
                            }
                        } catch (RemoteException e16) {
                            remoteException = e16;
                        }
                    } catch (Throwable th6) {
                        th3 = th6;
                    }
                }
                return iZzh;
            }
        } catch (Throwable th7) {
            CrashUtils.addDynamiteErrorToDropBox(context, th7);
            throw th7;
        }
    }

    private static boolean zzb(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzg)) {
            return true;
        }
        boolean z14 = false;
        if (zzg == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != PlatformVersion.isAtLeastQ() ? 0 : 268435456);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z14 = true;
            }
            zzg = Boolean.valueOf(z14);
            if (z14 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                zze = true;
            }
        }
        return z14;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015c A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:59:0x00ef, B:61:0x00f5, B:64:0x00fd, B:78:0x012a, B:82:0x0133, B:86:0x0139, B:87:0x0140, B:96:0x014f, B:97:0x0156, B:99:0x0158, B:101:0x015c, B:102:0x017e, B:103:0x017f), top: B:108:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x017f A[Catch: all -> 0x0141, TRY_LEAVE, TryCatch #0 {all -> 0x0141, blocks: (B:59:0x00ef, B:61:0x00f5, B:64:0x00fd, B:78:0x012a, B:82:0x0133, B:86:0x0139, B:87:0x0140, B:96:0x014f, B:97:0x0156, B:99:0x0158, B:101:0x015c, B:102:0x017e, B:103:0x017f), top: B:108:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0182  */
    /* JADX WARN: Code duplicated, block: B:126:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0147: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:92:0x0147 */
    private static int zzc(Context context, String str, boolean z14, boolean z15) throws Throwable {
        Throwable th3;
        Exception exc;
        Cursor cursor;
        MatrixCursor matrixCursor;
        Cursor cursor2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            try {
                boolean z16 = true;
                Uri uriBuild = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority("com.google.android.gms.chimera").path(true != z14 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) zzi.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z17 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i14 = 0; i14 < count; i14++) {
                                    if (!cursorQuery.moveToPosition(i14)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr4 = new Object[columnCount];
                                    for (int i15 = 0; i15 < columnCount; i15++) {
                                        int type = cursorQuery.getType(i15);
                                        if (type == 0) {
                                            objArr4[i15] = null;
                                        } else if (type == 1) {
                                            objArr4[i15] = Long.valueOf(cursorQuery.getLong(i15));
                                        } else if (type == 2) {
                                            objArr4[i15] = Double.valueOf(cursorQuery.getDouble(i15));
                                        } else if (type == 3) {
                                            objArr4[i15] = cursorQuery.getString(i15);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr4[i15] = cursorQuery.getBlob(i15);
                                        }
                                    }
                                    matrixCursor.addRow(objArr4);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th4) {
                                try {
                                    cursorQuery.close();
                                    throw th4;
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                    throw th4;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th6) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th6;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i16 = matrixCursor.getInt(0);
                            if (i16 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        zzd = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            zzf = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (matrixCursor.getInt(columnIndex2) == 0) {
                                                z16 = false;
                                            }
                                            zze = z16;
                                            z17 = z16;
                                        }
                                    } catch (Throwable th7) {
                                        throw th7;
                                    }
                                }
                                if (zzd(matrixCursor)) {
                                    matrixCursor = null;
                                }
                            }
                            if (z15 && z17) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", objArr2 == true ? 1 : 0);
                            }
                            if (matrixCursor != null) {
                                matrixCursor.close();
                            }
                            return i16;
                        }
                    } catch (Exception e4) {
                        exc = e4;
                        if (!(exc instanceof LoadingException)) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 25);
                        sb3.append("V2 version check failed: ");
                        sb3.append(message);
                        throw new LoadingException(sb3.toString(), exc, objArr == true ? 1 : 0);
                    }
                }
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", objArr3 == true ? 1 : 0);
            } catch (Throwable th8) {
                th3 = th8;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th3;
                }
                cursor2.close();
                throw th3;
            }
        } catch (Exception e14) {
            exc = e14;
            if (!(exc instanceof LoadingException)) {
                throw exc;
            }
            String message2 = exc.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + 25);
            sb4.append("V2 version check failed: ");
            sb4.append(message2);
            throw new LoadingException(sb4.toString(), exc, objArr == true ? 1 : 0);
        } catch (Throwable th9) {
            th3 = th9;
            if (cursor2 != null) {
                throw th3;
            }
            cursor2.close();
            throw th3;
        }
    }

    private static boolean zzd(Cursor cursor) {
        zzn zznVar = (zzn) zzh.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    private static DynamiteModule zze(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context);
    }

    private static void zzf(ClassLoader classLoader) throws LoadingException {
        zzq zzqVar;
        byte[] bArr = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                zzqVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
            }
            zzm = zzqVar;
        } catch (ClassNotFoundException e4) {
            e = e4;
            throw new LoadingException("Failed to instantiate dynamite loader", e, bArr);
        } catch (IllegalAccessException e14) {
            e = e14;
            throw new LoadingException("Failed to instantiate dynamite loader", e, bArr);
        } catch (InstantiationException e15) {
            e = e15;
            throw new LoadingException("Failed to instantiate dynamite loader", e, bArr);
        } catch (NoSuchMethodException e16) {
            e = e16;
            throw new LoadingException("Failed to instantiate dynamite loader", e, bArr);
        } catch (InvocationTargetException e17) {
            e = e17;
            throw new LoadingException("Failed to instantiate dynamite loader", e, bArr);
        }
    }

    private static zzp zzg(Context context) {
        zzp zzpVar;
        synchronized (DynamiteModule.class) {
            zzp zzpVar2 = zzl;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzpVar = iInterfaceQueryLocalInterface instanceof zzp ? (zzp) iInterfaceQueryLocalInterface : new zzp(iBinder);
                }
                if (zzpVar != null) {
                    zzl = zzpVar;
                    return zzpVar;
                }
            } catch (Exception e4) {
                new StringBuilder(String.valueOf(e4.getMessage()).length() + 45);
            }
            return null;
        }
    }

    @KeepForSdk
    public Context getModuleContext() {
        return this.zzk;
    }

    @KeepForSdk
    public IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzk.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e4) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e4, null);
        }
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, Throwable th3, byte[] bArr) {
            super(str, th3);
        }

        public /* synthetic */ LoadingException(String str, byte[] bArr) {
            super(str);
        }
    }
}
