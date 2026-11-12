package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public final class DynamiteModule {

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static Boolean b = null;

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static String c = null;

    @GuardedBy("DynamiteModule.class")
    private static boolean d = false;

    @GuardedBy("DynamiteModule.class")
    private static int e = -1;

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static zzq i;

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static zzr j;
    private final Context a;
    private static final ThreadLocal<l> f = new ThreadLocal<>();
    private static final ThreadLocal<Long> g = new c();
    private static final VersionPolicy.IVersions h = new d();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new e();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new f();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new g();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new h();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new i();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new j();

    @NonNull
    public static final VersionPolicy zza = new k();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @Nullable
        @GuardedBy("DynamiteLoaderClassLoader.class")
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

        public interface IVersions {
            int zza(@NonNull Context context, @NonNull String str);

            int zzb(@NonNull Context context, @NonNull String str, boolean z) throws LoadingException;
        }

        public static class SelectionResult {

            @KeepForSdk
            public int localVersion = 0;

            @KeepForSdk
            public int remoteVersion = 0;

            @KeepForSdk
            public int selection = 0;
        }

        @NonNull
        @KeepForSdk
        SelectionResult selectModule(@NonNull Context context, @NonNull String str, @NonNull IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c6  */
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
    private static int a(Context context, String str, boolean z) throws Throwable {
        Throwable th;
        Exception e2;
        ?? r0 = 0;
        ?? r1 = 0;
        ?? r2 = 0;
        ?? r3 = 0;
        try {
            try {
                boolean z2 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(g.get().longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z3 = false;
                            int i2 = cursorQuery.getInt(0);
                            if (i2 > 0) {
                                synchronized (DynamiteModule.class) {
                                    c = cursorQuery.getString(2);
                                    int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        e = cursorQuery.getInt(columnIndex);
                                    }
                                    int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader");
                                    if (columnIndex2 >= 0) {
                                        if (cursorQuery.getInt(columnIndex2) == 0) {
                                            z2 = false;
                                        }
                                        d = z2;
                                        z3 = z2;
                                    }
                                }
                                if (d(cursorQuery)) {
                                    cursorQuery = null;
                                }
                            }
                            if (z3) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", r2 == true ? 1 : 0);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i2;
                        }
                    } catch (Exception e3) {
                        e2 = e3;
                        if (e2 instanceof LoadingException) {
                            throw e2;
                        }
                        throw new LoadingException("V2 version check failed", e2, r1 == true ? 1 : 0);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", r3 == true ? 1 : 0);
            } catch (Throwable th2) {
                th = th2;
                r0 = context;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (Exception e4) {
            e2 = e4;
        } catch (Throwable th3) {
            th = th3;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
    }

    private static DynamiteModule b(Context context, String str) {
        String strValueOf = String.valueOf(str);
        Log.i("DynamiteModule", strValueOf.length() != 0 ? "Selected local version of ".concat(strValueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    private static void c(ClassLoader classLoader) throws LoadingException {
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
            j = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2, zzpVar);
        }
    }

    private static boolean d(Cursor cursor) {
        l lVar = f.get();
        if (lVar == null || lVar.a != null) {
            return false;
        }
        lVar.a = cursor;
        return true;
    }

    @Nullable
    private static zzq e(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = i;
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
                    i = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e2) {
                String strValueOf = String.valueOf(e2.getMessage());
                Log.e("DynamiteModule", strValueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(strValueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    @KeepForSdk
    public static int getLocalVersion(@NonNull Context context, @NonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String strValueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", strValueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(strValueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(@NonNull Context context, @NonNull String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:131:0x02b0 A[Catch: all -> 0x0305, TryCatch #3 {all -> 0x0305, blocks: (B:3:0x0025, B:7:0x0083, B:12:0x008b, B:15:0x0091, B:26:0x00b3, B:103:0x0233, B:104:0x023e, B:106:0x0240, B:108:0x0242, B:109:0x024a, B:131:0x02b0, B:132:0x02c9, B:111:0x024c, B:113:0x025e, B:115:0x0269, B:117:0x0270, B:119:0x0281, B:129:0x02a7, B:130:0x02af, B:114:0x0263, B:133:0x02ca, B:134:0x0304), top: B:146:0x0025, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0091 A[Catch: all -> 0x0305, TRY_LEAVE, TryCatch #3 {all -> 0x0305, blocks: (B:3:0x0025, B:7:0x0083, B:12:0x008b, B:15:0x0091, B:26:0x00b3, B:103:0x0233, B:104:0x023e, B:106:0x0240, B:108:0x0242, B:109:0x024a, B:131:0x02b0, B:132:0x02c9, B:111:0x024c, B:113:0x025e, B:115:0x0269, B:117:0x0270, B:119:0x0281, B:129:0x02a7, B:130:0x02af, B:114:0x0263, B:133:0x02ca, B:134:0x0304), top: B:146:0x0025, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x009b  */
    /* JADX WARN: Code duplicated, block: B:19:0x009f  */
    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb A[Catch: all -> 0x0232, LoadingException -> 0x023f, RemoteException -> 0x0241, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0241, LoadingException -> 0x023f, all -> 0x0232, blocks: (B:27:0x00b5, B:31:0x00bb, B:33:0x00c2, B:34:0x00ea, B:38:0x00f0, B:40:0x00f8, B:42:0x00fc, B:43:0x0107, B:50:0x0114, B:52:0x011a, B:54:0x0141, B:56:0x0149, B:57:0x0150, B:58:0x0158, B:53:0x012e, B:61:0x015b, B:62:0x015c, B:63:0x0164, B:64:0x0165, B:65:0x016d, B:68:0x0170, B:69:0x0171, B:71:0x019f, B:73:0x01a6, B:75:0x01ae, B:81:0x01e7, B:83:0x01ed, B:93:0x0214, B:94:0x021c, B:76:0x01bd, B:77:0x01c5, B:79:0x01c8, B:80:0x01d8, B:95:0x021d, B:96:0x0225, B:97:0x0226, B:98:0x022e, B:101:0x0231), top: B:153:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2 A[Catch: all -> 0x0232, LoadingException -> 0x023f, RemoteException -> 0x0241, TryCatch #7 {RemoteException -> 0x0241, LoadingException -> 0x023f, all -> 0x0232, blocks: (B:27:0x00b5, B:31:0x00bb, B:33:0x00c2, B:34:0x00ea, B:38:0x00f0, B:40:0x00f8, B:42:0x00fc, B:43:0x0107, B:50:0x0114, B:52:0x011a, B:54:0x0141, B:56:0x0149, B:57:0x0150, B:58:0x0158, B:53:0x012e, B:61:0x015b, B:62:0x015c, B:63:0x0164, B:64:0x0165, B:65:0x016d, B:68:0x0170, B:69:0x0171, B:71:0x019f, B:73:0x01a6, B:75:0x01ae, B:81:0x01e7, B:83:0x01ed, B:93:0x0214, B:94:0x021c, B:76:0x01bd, B:77:0x01c5, B:79:0x01c8, B:80:0x01d8, B:95:0x021d, B:96:0x0225, B:97:0x0226, B:98:0x022e, B:101:0x0231), top: B:153:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f0 A[Catch: all -> 0x0232, LoadingException -> 0x023f, RemoteException -> 0x0241, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0241, LoadingException -> 0x023f, all -> 0x0232, blocks: (B:27:0x00b5, B:31:0x00bb, B:33:0x00c2, B:34:0x00ea, B:38:0x00f0, B:40:0x00f8, B:42:0x00fc, B:43:0x0107, B:50:0x0114, B:52:0x011a, B:54:0x0141, B:56:0x0149, B:57:0x0150, B:58:0x0158, B:53:0x012e, B:61:0x015b, B:62:0x015c, B:63:0x0164, B:64:0x0165, B:65:0x016d, B:68:0x0170, B:69:0x0171, B:71:0x019f, B:73:0x01a6, B:75:0x01ae, B:81:0x01e7, B:83:0x01ed, B:93:0x0214, B:94:0x021c, B:76:0x01bd, B:77:0x01c5, B:79:0x01c8, B:80:0x01d8, B:95:0x021d, B:96:0x0225, B:97:0x0226, B:98:0x022e, B:101:0x0231), top: B:153:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0165 A[Catch: all -> 0x0232, LoadingException -> 0x023f, RemoteException -> 0x0241, TryCatch #7 {RemoteException -> 0x0241, LoadingException -> 0x023f, all -> 0x0232, blocks: (B:27:0x00b5, B:31:0x00bb, B:33:0x00c2, B:34:0x00ea, B:38:0x00f0, B:40:0x00f8, B:42:0x00fc, B:43:0x0107, B:50:0x0114, B:52:0x011a, B:54:0x0141, B:56:0x0149, B:57:0x0150, B:58:0x0158, B:53:0x012e, B:61:0x015b, B:62:0x015c, B:63:0x0164, B:64:0x0165, B:65:0x016d, B:68:0x0170, B:69:0x0171, B:71:0x019f, B:73:0x01a6, B:75:0x01ae, B:81:0x01e7, B:83:0x01ed, B:93:0x0214, B:94:0x021c, B:76:0x01bd, B:77:0x01c5, B:79:0x01c8, B:80:0x01d8, B:95:0x021d, B:96:0x0225, B:97:0x0226, B:98:0x022e, B:101:0x0231), top: B:153:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0171 A[Catch: all -> 0x0232, LoadingException -> 0x023f, RemoteException -> 0x0241, TryCatch #7 {RemoteException -> 0x0241, LoadingException -> 0x023f, all -> 0x0232, blocks: (B:27:0x00b5, B:31:0x00bb, B:33:0x00c2, B:34:0x00ea, B:38:0x00f0, B:40:0x00f8, B:42:0x00fc, B:43:0x0107, B:50:0x0114, B:52:0x011a, B:54:0x0141, B:56:0x0149, B:57:0x0150, B:58:0x0158, B:53:0x012e, B:61:0x015b, B:62:0x015c, B:63:0x0164, B:64:0x0165, B:65:0x016d, B:68:0x0170, B:69:0x0171, B:71:0x019f, B:73:0x01a6, B:75:0x01ae, B:81:0x01e7, B:83:0x01ed, B:93:0x0214, B:94:0x021c, B:76:0x01bd, B:77:0x01c5, B:79:0x01c8, B:80:0x01d8, B:95:0x021d, B:96:0x0225, B:97:0x0226, B:98:0x022e, B:101:0x0231), top: B:153:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x019f A[Catch: all -> 0x0232, LoadingException -> 0x023f, RemoteException -> 0x0241, TryCatch #7 {RemoteException -> 0x0241, LoadingException -> 0x023f, all -> 0x0232, blocks: (B:27:0x00b5, B:31:0x00bb, B:33:0x00c2, B:34:0x00ea, B:38:0x00f0, B:40:0x00f8, B:42:0x00fc, B:43:0x0107, B:50:0x0114, B:52:0x011a, B:54:0x0141, B:56:0x0149, B:57:0x0150, B:58:0x0158, B:53:0x012e, B:61:0x015b, B:62:0x015c, B:63:0x0164, B:64:0x0165, B:65:0x016d, B:68:0x0170, B:69:0x0171, B:71:0x019f, B:73:0x01a6, B:75:0x01ae, B:81:0x01e7, B:83:0x01ed, B:93:0x0214, B:94:0x021c, B:76:0x01bd, B:77:0x01c5, B:79:0x01c8, B:80:0x01d8, B:95:0x021d, B:96:0x0225, B:97:0x0226, B:98:0x022e, B:101:0x0231), top: B:153:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01a6 A[Catch: all -> 0x0232, LoadingException -> 0x023f, RemoteException -> 0x0241, TryCatch #7 {RemoteException -> 0x0241, LoadingException -> 0x023f, all -> 0x0232, blocks: (B:27:0x00b5, B:31:0x00bb, B:33:0x00c2, B:34:0x00ea, B:38:0x00f0, B:40:0x00f8, B:42:0x00fc, B:43:0x0107, B:50:0x0114, B:52:0x011a, B:54:0x0141, B:56:0x0149, B:57:0x0150, B:58:0x0158, B:53:0x012e, B:61:0x015b, B:62:0x015c, B:63:0x0164, B:64:0x0165, B:65:0x016d, B:68:0x0170, B:69:0x0171, B:71:0x019f, B:73:0x01a6, B:75:0x01ae, B:81:0x01e7, B:83:0x01ed, B:93:0x0214, B:94:0x021c, B:76:0x01bd, B:77:0x01c5, B:79:0x01c8, B:80:0x01d8, B:95:0x021d, B:96:0x0225, B:97:0x0226, B:98:0x022e, B:101:0x0231), top: B:153:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01ae A[Catch: all -> 0x0232, LoadingException -> 0x023f, RemoteException -> 0x0241, TryCatch #7 {RemoteException -> 0x0241, LoadingException -> 0x023f, all -> 0x0232, blocks: (B:27:0x00b5, B:31:0x00bb, B:33:0x00c2, B:34:0x00ea, B:38:0x00f0, B:40:0x00f8, B:42:0x00fc, B:43:0x0107, B:50:0x0114, B:52:0x011a, B:54:0x0141, B:56:0x0149, B:57:0x0150, B:58:0x0158, B:53:0x012e, B:61:0x015b, B:62:0x015c, B:63:0x0164, B:64:0x0165, B:65:0x016d, B:68:0x0170, B:69:0x0171, B:71:0x019f, B:73:0x01a6, B:75:0x01ae, B:81:0x01e7, B:83:0x01ed, B:93:0x0214, B:94:0x021c, B:76:0x01bd, B:77:0x01c5, B:79:0x01c8, B:80:0x01d8, B:95:0x021d, B:96:0x0225, B:97:0x0226, B:98:0x022e, B:101:0x0231), top: B:153:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01bd A[Catch: all -> 0x0232, LoadingException -> 0x023f, RemoteException -> 0x0241, TryCatch #7 {RemoteException -> 0x0241, LoadingException -> 0x023f, all -> 0x0232, blocks: (B:27:0x00b5, B:31:0x00bb, B:33:0x00c2, B:34:0x00ea, B:38:0x00f0, B:40:0x00f8, B:42:0x00fc, B:43:0x0107, B:50:0x0114, B:52:0x011a, B:54:0x0141, B:56:0x0149, B:57:0x0150, B:58:0x0158, B:53:0x012e, B:61:0x015b, B:62:0x015c, B:63:0x0164, B:64:0x0165, B:65:0x016d, B:68:0x0170, B:69:0x0171, B:71:0x019f, B:73:0x01a6, B:75:0x01ae, B:81:0x01e7, B:83:0x01ed, B:93:0x0214, B:94:0x021c, B:76:0x01bd, B:77:0x01c5, B:79:0x01c8, B:80:0x01d8, B:95:0x021d, B:96:0x0225, B:97:0x0226, B:98:0x022e, B:101:0x0231), top: B:153:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01c8 A[Catch: all -> 0x0232, LoadingException -> 0x023f, RemoteException -> 0x0241, TryCatch #7 {RemoteException -> 0x0241, LoadingException -> 0x023f, all -> 0x0232, blocks: (B:27:0x00b5, B:31:0x00bb, B:33:0x00c2, B:34:0x00ea, B:38:0x00f0, B:40:0x00f8, B:42:0x00fc, B:43:0x0107, B:50:0x0114, B:52:0x011a, B:54:0x0141, B:56:0x0149, B:57:0x0150, B:58:0x0158, B:53:0x012e, B:61:0x015b, B:62:0x015c, B:63:0x0164, B:64:0x0165, B:65:0x016d, B:68:0x0170, B:69:0x0171, B:71:0x019f, B:73:0x01a6, B:75:0x01ae, B:81:0x01e7, B:83:0x01ed, B:93:0x0214, B:94:0x021c, B:76:0x01bd, B:77:0x01c5, B:79:0x01c8, B:80:0x01d8, B:95:0x021d, B:96:0x0225, B:97:0x0226, B:98:0x022e, B:101:0x0231), top: B:153:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01d8 A[Catch: all -> 0x0232, LoadingException -> 0x023f, RemoteException -> 0x0241, TryCatch #7 {RemoteException -> 0x0241, LoadingException -> 0x023f, all -> 0x0232, blocks: (B:27:0x00b5, B:31:0x00bb, B:33:0x00c2, B:34:0x00ea, B:38:0x00f0, B:40:0x00f8, B:42:0x00fc, B:43:0x0107, B:50:0x0114, B:52:0x011a, B:54:0x0141, B:56:0x0149, B:57:0x0150, B:58:0x0158, B:53:0x012e, B:61:0x015b, B:62:0x015c, B:63:0x0164, B:64:0x0165, B:65:0x016d, B:68:0x0170, B:69:0x0171, B:71:0x019f, B:73:0x01a6, B:75:0x01ae, B:81:0x01e7, B:83:0x01ed, B:93:0x0214, B:94:0x021c, B:76:0x01bd, B:77:0x01c5, B:79:0x01c8, B:80:0x01d8, B:95:0x021d, B:96:0x0225, B:97:0x0226, B:98:0x022e, B:101:0x0231), top: B:153:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01ed A[Catch: all -> 0x0232, LoadingException -> 0x023f, RemoteException -> 0x0241, TRY_LEAVE, TryCatch #7 {RemoteException -> 0x0241, LoadingException -> 0x023f, all -> 0x0232, blocks: (B:27:0x00b5, B:31:0x00bb, B:33:0x00c2, B:34:0x00ea, B:38:0x00f0, B:40:0x00f8, B:42:0x00fc, B:43:0x0107, B:50:0x0114, B:52:0x011a, B:54:0x0141, B:56:0x0149, B:57:0x0150, B:58:0x0158, B:53:0x012e, B:61:0x015b, B:62:0x015c, B:63:0x0164, B:64:0x0165, B:65:0x016d, B:68:0x0170, B:69:0x0171, B:71:0x019f, B:73:0x01a6, B:75:0x01ae, B:81:0x01e7, B:83:0x01ed, B:93:0x0214, B:94:0x021c, B:76:0x01bd, B:77:0x01c5, B:79:0x01c8, B:80:0x01d8, B:95:0x021d, B:96:0x0225, B:97:0x0226, B:98:0x022e, B:101:0x0231), top: B:153:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0202  */
    /* JADX WARN: Code duplicated, block: B:90:0x020d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0214 A[Catch: all -> 0x0232, LoadingException -> 0x023f, RemoteException -> 0x0241, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0241, LoadingException -> 0x023f, all -> 0x0232, blocks: (B:27:0x00b5, B:31:0x00bb, B:33:0x00c2, B:34:0x00ea, B:38:0x00f0, B:40:0x00f8, B:42:0x00fc, B:43:0x0107, B:50:0x0114, B:52:0x011a, B:54:0x0141, B:56:0x0149, B:57:0x0150, B:58:0x0158, B:53:0x012e, B:61:0x015b, B:62:0x015c, B:63:0x0164, B:64:0x0165, B:65:0x016d, B:68:0x0170, B:69:0x0171, B:71:0x019f, B:73:0x01a6, B:75:0x01ae, B:81:0x01e7, B:83:0x01ed, B:93:0x0214, B:94:0x021c, B:76:0x01bd, B:77:0x01c5, B:79:0x01c8, B:80:0x01d8, B:95:0x021d, B:96:0x0225, B:97:0x0226, B:98:0x022e, B:101:0x0231), top: B:153:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x021d A[Catch: all -> 0x0232, LoadingException -> 0x023f, RemoteException -> 0x0241, TryCatch #7 {RemoteException -> 0x0241, LoadingException -> 0x023f, all -> 0x0232, blocks: (B:27:0x00b5, B:31:0x00bb, B:33:0x00c2, B:34:0x00ea, B:38:0x00f0, B:40:0x00f8, B:42:0x00fc, B:43:0x0107, B:50:0x0114, B:52:0x011a, B:54:0x0141, B:56:0x0149, B:57:0x0150, B:58:0x0158, B:53:0x012e, B:61:0x015b, B:62:0x015c, B:63:0x0164, B:64:0x0165, B:65:0x016d, B:68:0x0170, B:69:0x0171, B:71:0x019f, B:73:0x01a6, B:75:0x01ae, B:81:0x01e7, B:83:0x01ed, B:93:0x0214, B:94:0x021c, B:76:0x01bd, B:77:0x01c5, B:79:0x01c8, B:80:0x01d8, B:95:0x021d, B:96:0x0225, B:97:0x0226, B:98:0x022e, B:101:0x0231), top: B:153:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0226 A[Catch: all -> 0x0232, LoadingException -> 0x023f, RemoteException -> 0x0241, TryCatch #7 {RemoteException -> 0x0241, LoadingException -> 0x023f, all -> 0x0232, blocks: (B:27:0x00b5, B:31:0x00bb, B:33:0x00c2, B:34:0x00ea, B:38:0x00f0, B:40:0x00f8, B:42:0x00fc, B:43:0x0107, B:50:0x0114, B:52:0x011a, B:54:0x0141, B:56:0x0149, B:57:0x0150, B:58:0x0158, B:53:0x012e, B:61:0x015b, B:62:0x015c, B:63:0x0164, B:64:0x0165, B:65:0x016d, B:68:0x0170, B:69:0x0171, B:71:0x019f, B:73:0x01a6, B:75:0x01ae, B:81:0x01e7, B:83:0x01ed, B:93:0x0214, B:94:0x021c, B:76:0x01bd, B:77:0x01c5, B:79:0x01c8, B:80:0x01d8, B:95:0x021d, B:96:0x0225, B:97:0x0226, B:98:0x022e, B:101:0x0231), top: B:153:0x00b5 }] */
    @NonNull
    @KeepForSdk
    public static DynamiteModule load(@NonNull Context context, @NonNull VersionPolicy versionPolicy, @NonNull String str) throws LoadingException {
        int i2;
        Boolean bool;
        zzq zzqVarE;
        int iZze;
        IObjectWrapper iObjectWrapperZzh;
        DynamiteModule dynamiteModule;
        l lVar;
        Cursor cursor;
        zzr zzrVar;
        l lVar2;
        Boolean boolValueOf;
        IObjectWrapper iObjectWrapperZze;
        Cursor cursor2;
        ThreadLocal<l> threadLocal = f;
        l lVar3 = threadLocal.get();
        l lVar4 = new l(null);
        threadLocal.set(lVar4);
        ThreadLocal<Long> threadLocal2 = g;
        long jLongValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult selectionResultSelectModule = versionPolicy.selectModule(context, str, h);
            int i3 = selectionResultSelectModule.localVersion;
            int i4 = selectionResultSelectModule.remoteVersion;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i3);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i4);
            Log.i("DynamiteModule", sb.toString());
            int i5 = selectionResultSelectModule.selection;
            if (i5 != 0) {
                if (i5 != -1) {
                    if (i5 == 1 || selectionResultSelectModule.remoteVersion != 0) {
                        if (i5 == -1) {
                            DynamiteModule dynamiteModuleB = b(context, str);
                            if (jLongValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(Long.valueOf(jLongValue));
                            }
                            cursor2 = lVar4.a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(lVar3);
                            return dynamiteModuleB;
                        }
                        if (i5 == 1) {
                            StringBuilder sb2 = new StringBuilder(47);
                            sb2.append("VersionPolicy returned invalid code:");
                            sb2.append(i5);
                            throw new LoadingException(sb2.toString(), null);
                        }
                        try {
                            i2 = selectionResultSelectModule.remoteVersion;
                            try {
                                synchronized (DynamiteModule.class) {
                                    bool = b;
                                }
                                if (bool != null) {
                                    throw new LoadingException("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 51);
                                    sb3.append("Selected remote version of ");
                                    sb3.append(str);
                                    sb3.append(", version >= ");
                                    sb3.append(i2);
                                    Log.i("DynamiteModule", sb3.toString());
                                    synchronized (DynamiteModule.class) {
                                        zzrVar = j;
                                    }
                                    if (zzrVar != null) {
                                        throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                    }
                                    lVar2 = threadLocal.get();
                                    if (lVar2 != null || lVar2.a == null) {
                                        throw new LoadingException("No result cursor", null);
                                    }
                                    Context applicationContext = context.getApplicationContext();
                                    Cursor cursor3 = lVar2.a;
                                    ObjectWrapper.wrap(null);
                                    synchronized (DynamiteModule.class) {
                                        boolValueOf = Boolean.valueOf(e >= 2);
                                    }
                                    if (boolValueOf.booleanValue()) {
                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        iObjectWrapperZze = zzrVar.zzf(ObjectWrapper.wrap(applicationContext), str, i2, ObjectWrapper.wrap(cursor3));
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        iObjectWrapperZze = zzrVar.zze(ObjectWrapper.wrap(applicationContext), str, i2, ObjectWrapper.wrap(cursor3));
                                    }
                                    Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapperZze);
                                    if (context2 == null) {
                                        throw new LoadingException("Failed to get module context", null);
                                    }
                                    dynamiteModule = new DynamiteModule(context2);
                                } else {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 51);
                                    sb4.append("Selected remote version of ");
                                    sb4.append(str);
                                    sb4.append(", version >= ");
                                    sb4.append(i2);
                                    Log.i("DynamiteModule", sb4.toString());
                                    zzqVarE = e(context);
                                    if (zzqVarE != null) {
                                        throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                    }
                                    iZze = zzqVarE.zze();
                                    if (iZze >= 3) {
                                        lVar = threadLocal.get();
                                        if (lVar != null) {
                                            throw new LoadingException("No cached result cursor holder", null);
                                        }
                                        iObjectWrapperZzh = zzqVarE.zzi(ObjectWrapper.wrap(context), str, i2, ObjectWrapper.wrap(lVar.a));
                                    } else if (iZze == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        iObjectWrapperZzh = zzqVarE.zzj(ObjectWrapper.wrap(context), str, i2);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        iObjectWrapperZzh = zzqVarE.zzh(ObjectWrapper.wrap(context), str, i2);
                                    }
                                    if (ObjectWrapper.unwrap(iObjectWrapperZzh) != null) {
                                        throw new LoadingException("Failed to load remote module.", null);
                                    }
                                    dynamiteModule = new DynamiteModule((Context) ObjectWrapper.unwrap(iObjectWrapperZzh));
                                }
                                if (jLongValue == 0) {
                                    threadLocal2.remove();
                                } else {
                                    threadLocal2.set(Long.valueOf(jLongValue));
                                }
                                cursor = lVar4.a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                threadLocal.set(lVar3);
                                return dynamiteModule;
                            } catch (RemoteException e2) {
                                throw new LoadingException("Failed to load remote module.", e2, null);
                            } catch (LoadingException e3) {
                                throw e3;
                            } catch (Throwable th) {
                                CrashUtils.addDynamiteErrorToDropBox(context, th);
                                throw new LoadingException("Failed to load remote module.", th, null);
                            }
                        } catch (LoadingException e4) {
                            String strValueOf = String.valueOf(e4.getMessage());
                            Log.w("DynamiteModule", strValueOf.length() != 0 ? "Failed to load remote module: ".concat(strValueOf) : new String("Failed to load remote module: "));
                            int i6 = selectionResultSelectModule.localVersion;
                            if (i6 == 0 || versionPolicy.selectModule(context, str, new m(i6, 0)).selection != -1) {
                                throw new LoadingException("Remote load failed. No local fallback found.", e4, null);
                            }
                            DynamiteModule dynamiteModuleB2 = b(context, str);
                            if (jLongValue == 0) {
                                g.remove();
                            } else {
                                g.set(Long.valueOf(jLongValue));
                            }
                            Cursor cursor4 = lVar4.a;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            f.set(lVar3);
                            return dynamiteModuleB2;
                        }
                    }
                } else if (selectionResultSelectModule.localVersion != 0) {
                    i5 = -1;
                    if (i5 == 1) {
                    }
                    if (i5 == -1) {
                        DynamiteModule dynamiteModuleB3 = b(context, str);
                        if (jLongValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(jLongValue));
                        }
                        cursor2 = lVar4.a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(lVar3);
                        return dynamiteModuleB3;
                    }
                    if (i5 == 1) {
                        StringBuilder sb5 = new StringBuilder(47);
                        sb5.append("VersionPolicy returned invalid code:");
                        sb5.append(i5);
                        throw new LoadingException(sb5.toString(), null);
                    }
                    i2 = selectionResultSelectModule.remoteVersion;
                    synchronized (DynamiteModule.class) {
                        bool = b;
                        if (bool != null) {
                            throw new LoadingException("Failed to determine which loading route to use.", null);
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 51);
                            sb6.append("Selected remote version of ");
                            sb6.append(str);
                            sb6.append(", version >= ");
                            sb6.append(i2);
                            Log.i("DynamiteModule", sb6.toString());
                            synchronized (DynamiteModule.class) {
                                zzrVar = j;
                                if (zzrVar != null) {
                                    throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                }
                                lVar2 = threadLocal.get();
                                if (lVar2 != null) {
                                }
                                throw new LoadingException("No result cursor", null);
                            }
                        }
                        StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 51);
                        sb7.append("Selected remote version of ");
                        sb7.append(str);
                        sb7.append(", version >= ");
                        sb7.append(i2);
                        Log.i("DynamiteModule", sb7.toString());
                        zzqVarE = e(context);
                        if (zzqVarE != null) {
                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                        }
                        iZze = zzqVarE.zze();
                        if (iZze >= 3) {
                            lVar = threadLocal.get();
                            if (lVar != null) {
                                throw new LoadingException("No cached result cursor holder", null);
                            }
                            iObjectWrapperZzh = zzqVarE.zzi(ObjectWrapper.wrap(context), str, i2, ObjectWrapper.wrap(lVar.a));
                        } else if (iZze == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            iObjectWrapperZzh = zzqVarE.zzj(ObjectWrapper.wrap(context), str, i2);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            iObjectWrapperZzh = zzqVarE.zzh(ObjectWrapper.wrap(context), str, i2);
                        }
                        if (ObjectWrapper.unwrap(iObjectWrapperZzh) != null) {
                            throw new LoadingException("Failed to load remote module.", null);
                        }
                        dynamiteModule = new DynamiteModule((Context) ObjectWrapper.unwrap(iObjectWrapperZzh));
                        if (jLongValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(jLongValue));
                        }
                        cursor = lVar4.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(lVar3);
                        return dynamiteModule;
                    }
                }
            }
            int i7 = selectionResultSelectModule.localVersion;
            int i8 = selectionResultSelectModule.remoteVersion;
            StringBuilder sb8 = new StringBuilder(String.valueOf(str).length() + 92);
            sb8.append("No acceptable module ");
            sb8.append(str);
            sb8.append(" found. Local version is ");
            sb8.append(i7);
            sb8.append(" and remote version is ");
            sb8.append(i8);
            sb8.append(".");
            throw new LoadingException(sb8.toString(), null);
        } catch (Throwable th2) {
            if (jLongValue == 0) {
                g.remove();
            } else {
                g.set(Long.valueOf(jLongValue));
            }
            Cursor cursor5 = lVar4.a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f.set(lVar3);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009b A[Catch: all -> 0x00a6, TryCatch #3 {, blocks: (B:9:0x0025, B:11:0x002d, B:13:0x0033, B:43:0x00a4, B:15:0x0037, B:16:0x003a, B:17:0x003d, B:19:0x0041, B:22:0x004a, B:24:0x0052, B:27:0x0059, B:34:0x0083, B:35:0x008b, B:30:0x0060, B:32:0x0066, B:33:0x0075, B:38:0x008e, B:41:0x0091, B:42:0x009b), top: B:131:0x0025, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0166 A[Catch: all -> 0x01c7, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x01c7, blocks: (B:3:0x0002, B:56:0x00d3, B:59:0x00da, B:68:0x0100, B:90:0x0158, B:94:0x0166, B:119:0x01c0, B:120:0x01c3, B:114:0x01b8, B:62:0x00e0, B:64:0x00f2, B:66:0x00fc, B:65:0x00f7, B:123:0x01c6, B:4:0x0003, B:7:0x0008, B:8:0x0024, B:54:0x00d0, B:36:0x008c, B:39:0x008f, B:47:0x00a8, B:55:0x00d2, B:53:0x00ae), top: B:132:0x0002, inners: #1, #2 }] */
    public static int zza(@NonNull Context context, @NonNull String str, boolean z) {
        Throwable th;
        RemoteException e2;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = b;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader != null) {
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else {
                                    try {
                                        c(classLoader);
                                    } catch (LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                }
                            } else if (d) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            } else {
                                Boolean bool2 = Boolean.TRUE;
                                if (bool2.equals(null)) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                } else {
                                    try {
                                        int iA = a(context, str, z);
                                        String str2 = c;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader classLoaderZza = zzb.zza();
                                            if (classLoaderZza == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    String str3 = c;
                                                    Preconditions.checkNotNull(str3);
                                                    classLoaderZza = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = c;
                                                    Preconditions.checkNotNull(str4);
                                                    classLoaderZza = new b(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            c(classLoaderZza);
                                            declaredField.set(null, classLoaderZza);
                                            b = bool2;
                                            return iA;
                                        }
                                        return iA;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            b = bool;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        String string = e3.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(string);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                }
                boolean zBooleanValue = bool.booleanValue();
                int iZzf = 0;
                if (zBooleanValue) {
                    try {
                        return a(context, str, z);
                    } catch (LoadingException e4) {
                        String strValueOf = String.valueOf(e4.getMessage());
                        Log.w("DynamiteModule", strValueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(strValueOf) : new String("Failed to retrieve remote module version: "));
                        return 0;
                    }
                }
                zzq zzqVarE = e(context);
                try {
                    if (zzqVarE != null) {
                        try {
                            int iZze = zzqVarE.zze();
                            if (iZze >= 3) {
                                l lVar = f.get();
                                if (lVar == null || (cursor = lVar.a) == null) {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzqVarE.zzk(ObjectWrapper.wrap(context), str, z, g.get().longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i2 = cursor3.getInt(0);
                                                cursor2 = (i2 <= 0 || !d(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iZzf = i2;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e5) {
                                            e2 = e5;
                                            cursor2 = cursor3;
                                            String strValueOf2 = String.valueOf(e2.getMessage());
                                            Log.w("DynamiteModule", strValueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(strValueOf2) : new String("Failed to retrieve remote module version: "));
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
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iZzf = cursor.getInt(0);
                                }
                            } else if (iZze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iZzf = zzqVarE.zzg(ObjectWrapper.wrap(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iZzf = zzqVarE.zzf(ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (RemoteException e6) {
                            e2 = e6;
                        }
                    }
                    return iZzf;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    @NonNull
    @KeepForSdk
    public Context getModuleContext() {
        return this.a;
    }

    @NonNull
    @KeepForSdk
    public IBinder instantiate(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String strValueOf = String.valueOf(str);
            throw new LoadingException(strValueOf.length() != 0 ? "Failed to instantiate module class: ".concat(strValueOf) : new String("Failed to instantiate module class: "), e2, null);
        }
    }
}
