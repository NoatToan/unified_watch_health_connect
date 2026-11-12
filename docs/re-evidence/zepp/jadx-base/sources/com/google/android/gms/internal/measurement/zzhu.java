package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzhu<T> {

    @Nullable
    private static volatile y1 h = null;
    private static volatile boolean i = false;
    public static final /* synthetic */ int zzc = 0;
    public final zzhr a;
    public final String b;
    private final T c;
    private volatile int d = -1;
    private volatile T e;
    private final boolean f;
    private static final Object g = new Object();
    private static final AtomicReference<Collection<zzhu<?>>> j = new AtomicReference<>();
    private static final zzhw k = new zzhw(zzhl.zza, null);
    private static final AtomicInteger l = new AtomicInteger();

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzhu(zzhr zzhrVar, String str, Object obj, boolean z, zzht zzhtVar) {
        if (zzhrVar.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.a = zzhrVar;
        this.b = str;
        this.c = obj;
        this.f = true;
    }

    public static void b() {
        l.incrementAndGet();
    }

    @Deprecated
    public static void zzd(final Context context) {
        synchronized (g) {
            y1 y1Var = h;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (y1Var == null || y1Var.a() != context) {
                zzha.b();
                zzhv.b();
                t1.d();
                h = new p1(context, zzif.zza(new zzib() { // from class: com.google.android.gms.internal.measurement.zzhm
                    @Override // com.google.android.gms.internal.measurement.zzib
                    public final Object zza() {
                        zzhz zzhzVarZzc;
                        zzhz zzhzVarZzc2;
                        Context contextCreateDeviceProtectedStorageContext = context;
                        int i2 = zzhu.zzc;
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                            return zzhz.zzc();
                        }
                        if (zzgw.zza() && !contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                            contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                        }
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                zzhzVarZzc = file.exists() ? zzhz.zzd(file) : zzhz.zzc();
                            } catch (RuntimeException e) {
                                Log.e("HermeticFileOverrides", "no data dir", e);
                                zzhzVarZzc = zzhz.zzc();
                            }
                            if (zzhzVarZzc.zzb()) {
                                File file2 = (File) zzhzVarZzc.zza();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        HashMap map = new HashMap();
                                        HashMap map2 = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                Log.e("HermeticFileOverrides", line.length() != 0 ? "Invalid: ".concat(line) : new String("Invalid: "));
                                            } else {
                                                String str3 = new String(strArrSplit[0]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map2.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map2.put(str4, strDecode2);
                                                    }
                                                }
                                                if (!map.containsKey(str3)) {
                                                    map.put(str3, new HashMap());
                                                }
                                                ((Map) map.get(str3)).put(strDecode, strDecode2);
                                            }
                                        }
                                        String string = file2.toString();
                                        StringBuilder sb = new StringBuilder(string.length() + 7);
                                        sb.append("Parsed ");
                                        sb.append(string);
                                        Log.i("HermeticFileOverrides", sb.toString());
                                        zzhi zzhiVar = new zzhi(map);
                                        bufferedReader.close();
                                        zzhzVarZzc2 = zzhz.zzd(zzhiVar);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable unused) {
                                        }
                                        throw th;
                                    }
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } else {
                                zzhzVarZzc2 = zzhz.zzc();
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            return zzhzVarZzc2;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    }
                }));
                l.incrementAndGet();
            }
        }
    }

    public abstract T a(Object obj);

    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6 A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:22:0x0067, B:21:0x0061, B:49:0x00de, B:51:0x00ee, B:53:0x0102, B:54:0x0105, B:55:0x0109, B:37:0x00b6, B:39:0x00bc, B:43:0x00ce, B:45:0x00d4, B:48:0x00dc, B:42:0x00cc, B:24:0x006c, B:26:0x0072, B:28:0x0080, B:32:0x00a5, B:34:0x00af, B:30:0x0097, B:56:0x010e, B:57:0x0113, B:58:0x0114), top: B:65:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:22:0x0067, B:21:0x0061, B:49:0x00de, B:51:0x00ee, B:53:0x0102, B:54:0x0105, B:55:0x0109, B:37:0x00b6, B:39:0x00bc, B:43:0x00ce, B:45:0x00d4, B:48:0x00dc, B:42:0x00cc, B:24:0x006c, B:26:0x0072, B:28:0x0080, B:32:0x00a5, B:34:0x00af, B:30:0x0097, B:56:0x010e, B:57:0x0113, B:58:0x0114), top: B:65:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:22:0x0067, B:21:0x0061, B:49:0x00de, B:51:0x00ee, B:53:0x0102, B:54:0x0105, B:55:0x0109, B:37:0x00b6, B:39:0x00bc, B:43:0x00ce, B:45:0x00d4, B:48:0x00dc, B:42:0x00cc, B:24:0x006c, B:26:0x0072, B:28:0x0080, B:32:0x00a5, B:34:0x00af, B:30:0x0097, B:56:0x010e, B:57:0x0113, B:58:0x0114), top: B:65:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4 A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:22:0x0067, B:21:0x0061, B:49:0x00de, B:51:0x00ee, B:53:0x0102, B:54:0x0105, B:55:0x0109, B:37:0x00b6, B:39:0x00bc, B:43:0x00ce, B:45:0x00d4, B:48:0x00dc, B:42:0x00cc, B:24:0x006c, B:26:0x0072, B:28:0x0080, B:32:0x00a5, B:34:0x00af, B:30:0x0097, B:56:0x010e, B:57:0x0113, B:58:0x0114), top: B:65:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dc A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:22:0x0067, B:21:0x0061, B:49:0x00de, B:51:0x00ee, B:53:0x0102, B:54:0x0105, B:55:0x0109, B:37:0x00b6, B:39:0x00bc, B:43:0x00ce, B:45:0x00d4, B:48:0x00dc, B:42:0x00cc, B:24:0x006c, B:26:0x0072, B:28:0x0080, B:32:0x00a5, B:34:0x00af, B:30:0x0097, B:56:0x010e, B:57:0x0113, B:58:0x0114), top: B:65:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:22:0x0067, B:21:0x0061, B:49:0x00de, B:51:0x00ee, B:53:0x0102, B:54:0x0105, B:55:0x0109, B:37:0x00b6, B:39:0x00bc, B:43:0x00ce, B:45:0x00d4, B:48:0x00dc, B:42:0x00cc, B:24:0x006c, B:26:0x0072, B:28:0x0080, B:32:0x00a5, B:34:0x00af, B:30:0x0097, B:56:0x010e, B:57:0x0113, B:58:0x0114), top: B:65:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0102 A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:22:0x0067, B:21:0x0061, B:49:0x00de, B:51:0x00ee, B:53:0x0102, B:54:0x0105, B:55:0x0109, B:37:0x00b6, B:39:0x00bc, B:43:0x00ce, B:45:0x00d4, B:48:0x00dc, B:42:0x00cc, B:24:0x006c, B:26:0x0072, B:28:0x0080, B:32:0x00a5, B:34:0x00af, B:30:0x0097, B:56:0x010e, B:57:0x0113, B:58:0x0114), top: B:65:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0105 A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:22:0x0067, B:21:0x0061, B:49:0x00de, B:51:0x00ee, B:53:0x0102, B:54:0x0105, B:55:0x0109, B:37:0x00b6, B:39:0x00bc, B:43:0x00ce, B:45:0x00d4, B:48:0x00dc, B:42:0x00cc, B:24:0x006c, B:26:0x0072, B:28:0x0080, B:32:0x00a5, B:34:0x00af, B:30:0x0097, B:56:0x010e, B:57:0x0113, B:58:0x0114), top: B:65:0x0016 }] */
    public final T zzb() {
        r1 r1VarA;
        Object objZzb;
        T tA;
        String str;
        String strB;
        zzhz<zzhi> zzhzVarZza;
        String strZza;
        if (!this.f) {
            Objects.requireNonNull(this.b, "flagName must not be null");
        }
        int i2 = l.get();
        if (this.d < i2) {
            synchronized (this) {
                if (this.d < i2) {
                    y1 y1Var = h;
                    if (y1Var == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    boolean z = this.a.f;
                    String strB2 = t1.a(y1Var.a()).zzb("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
                    if (strB2 == null || !zzgv.zzc.matcher(strB2).matches()) {
                        if (this.a.b == null) {
                            Context contextA = y1Var.a();
                            String str2 = this.a.a;
                            r1VarA = zzhv.a(contextA, null);
                        } else if (zzhj.zza(y1Var.a(), this.a.b)) {
                            boolean z2 = this.a.h;
                            r1VarA = zzha.zza(y1Var.a().getContentResolver(), this.a.b);
                        } else {
                            r1VarA = null;
                        }
                        if (r1VarA != null && (objZzb = r1VarA.zzb(zzc())) != null) {
                            tA = a(objZzb);
                        }
                        if (tA == null) {
                            if (this.a.e) {
                                tA = null;
                            } else {
                                t1 t1VarA = t1.a(y1Var.a());
                                if (this.a.e) {
                                    str = null;
                                } else {
                                    str = this.b;
                                }
                                strB = t1VarA.zzb(str);
                                if (strB != null) {
                                    tA = a(strB);
                                } else {
                                    tA = null;
                                }
                            }
                            if (tA == null) {
                                tA = this.c;
                            }
                        }
                        zzhzVarZza = y1Var.b().zza();
                        if (zzhzVarZza.zzb()) {
                            zzhi zzhiVarZza = zzhzVarZza.zza();
                            zzhr zzhrVar = this.a;
                            strZza = zzhiVarZza.zza(zzhrVar.b, null, zzhrVar.d, this.b);
                            if (strZza == null) {
                                tA = this.c;
                            } else {
                                tA = a(strZza);
                            }
                        }
                        this.e = tA;
                        this.d = i2;
                    } else if (Log.isLoggable("PhenotypeFlag", 3)) {
                        String strValueOf = String.valueOf(zzc());
                        Log.d("PhenotypeFlag", strValueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(strValueOf) : new String("Bypass reading Phenotype values for flag: "));
                    }
                    tA = null;
                    if (tA == null) {
                        if (this.a.e) {
                            t1 t1VarA2 = t1.a(y1Var.a());
                            if (this.a.e) {
                                str = null;
                            } else {
                                str = this.b;
                            }
                            strB = t1VarA2.zzb(str);
                            if (strB != null) {
                                tA = a(strB);
                            } else {
                                tA = null;
                            }
                        } else {
                            tA = null;
                        }
                        if (tA == null) {
                            tA = this.c;
                        }
                    }
                    zzhzVarZza = y1Var.b().zza();
                    if (zzhzVarZza.zzb()) {
                        zzhi zzhiVarZza2 = zzhzVarZza.zza();
                        zzhr zzhrVar2 = this.a;
                        strZza = zzhiVarZza2.zza(zzhrVar2.b, null, zzhrVar2.d, this.b);
                        if (strZza == null) {
                            tA = this.c;
                        } else {
                            tA = a(strZza);
                        }
                    }
                    this.e = tA;
                    this.d = i2;
                }
            }
        }
        return this.e;
    }

    public final String zzc() {
        String str = this.a.d;
        return this.b;
    }
}
