package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.common.base.Optional;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;
import p1.k1;

/* JADX INFO: loaded from: classes14.dex */
public final class zzjz {
    private static volatile Optional zza;

    private zzjz() {
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:75:0x014a, B:15:0x0025, B:17:0x002d, B:22:0x003d, B:24:0x0043, B:26:0x0049, B:27:0x004d, B:74:0x0145, B:76:0x014d, B:77:0x0150, B:78:0x0151, B:28:0x0051, B:30:0x0055, B:31:0x0062, B:33:0x0068, B:38:0x0079, B:40:0x007f, B:41:0x0085, B:61:0x0128, B:62:0x012b, B:70:0x013a, B:69:0x0137, B:71:0x013b, B:72:0x0140, B:73:0x0141, B:36:0x0070, B:37:0x0075), top: B:85:0x0007, inners: #5 }] */
    public static Optional zza(Context context) {
        Optional optional;
        Optional optionalAbsent;
        Optional optionalAbsent2;
        Optional optional2 = zza;
        if (optional2 != null) {
            return optional2;
        }
        synchronized (zzjz.class) {
            try {
                optional = zza;
                if (optional == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    int i14 = zzkb.zza;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        optionalAbsent2 = Optional.absent();
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        if (zzjm.zza() && !context.isDeviceProtectedStorage()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                                optionalAbsent = file.exists() ? Optional.of(file) : Optional.absent();
                            } catch (RuntimeException unused) {
                                optionalAbsent = Optional.absent();
                            }
                            if (optionalAbsent.isPresent()) {
                                File file2 = (File) optionalAbsent.get();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        k1 k1Var = new k1();
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(StringUtils.SPACE, 3);
                                            if (strArrSplit.length != 3) {
                                                new StringBuilder(line.length() + 9);
                                            } else {
                                                String str3 = new String(strArrSplit[0]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                k1 k1Var2 = (k1) k1Var.get(str3);
                                                if (k1Var2 == null) {
                                                    k1Var2 = new k1();
                                                    k1Var.put(str3, k1Var2);
                                                }
                                                k1Var2.put(strDecode, strDecode2);
                                            }
                                        }
                                        new StringBuilder(file2.toString().length() + 28 + String.valueOf(context.getPackageName()).length());
                                        zzjt zzjtVar = new zzjt(k1Var);
                                        bufferedReader.close();
                                        optionalAbsent2 = Optional.of(zzjtVar);
                                    } catch (Throwable th3) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                        }
                                        throw th3;
                                    }
                                } catch (IOException e4) {
                                    throw new RuntimeException(e4);
                                }
                            } else {
                                optionalAbsent2 = Optional.absent();
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th5) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th5;
                        }
                    } else {
                        optionalAbsent2 = Optional.absent();
                    }
                    optional = optionalAbsent2;
                    zza = optional;
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
        return optional;
    }
}
