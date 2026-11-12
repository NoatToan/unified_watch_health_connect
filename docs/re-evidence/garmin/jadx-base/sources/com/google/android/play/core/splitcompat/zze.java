package com.google.android.play.core.splitcompat;

import am.j;
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zze {
    private final long zza;
    private final Context zzb;
    private File zzc;

    public zze(Context context) {
        this.zzb = context;
        this.zza = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public static void zzl(File file) throws IOException {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                zzl(file2);
            }
        }
        if (!file.exists() || file.delete()) {
            return;
        }
        h.C(j.m("Failed to delete '", file.getAbsolutePath(), "'"));
    }

    public static void zzm(File file) {
        file.setWritable(false, true);
        file.setWritable(false, false);
    }

    public static boolean zzp(File file) {
        return !file.canWrite();
    }

    private static File zzq(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        h.s("split ID cannot be placed in target directory");
        return null;
    }

    private final File zzr() throws IOException {
        File file = new File(zzw(), "native-libraries");
        zzu(file);
        return file;
    }

    private final File zzs(String str) throws IOException {
        File fileZzq = zzq(zzr(), str);
        zzu(fileZzq);
        return fileZzq;
    }

    private final File zzt() throws IOException {
        File file = new File(zzw(), "verified-splits");
        zzu(file);
        return file;
    }

    private static File zzu(File file) throws IOException {
        if (!file.exists()) {
            file.mkdirs();
            if (!file.isDirectory()) {
                h.C("Unable to create directory: ".concat(String.valueOf(file.getAbsolutePath())));
                return null;
            }
        } else if (!file.isDirectory()) {
            h.s("File input must be directory when it exists.");
            return null;
        }
        return file;
    }

    private final File zzv() throws IOException {
        if (this.zzc == null) {
            Context context = this.zzb;
            if (context == null) {
                h.z("context must be non-null to populate null filesDir");
                return null;
            }
            this.zzc = context.getFilesDir();
        }
        File file = new File(this.zzc, "splitcompat");
        zzu(file);
        return file;
    }

    private final File zzw() throws IOException {
        File file = new File(zzv(), Long.toString(this.zza));
        zzu(file);
        return file;
    }

    private static String zzx(String str) {
        return String.valueOf(str).concat(".apk");
    }

    public final File zza(String str) throws IOException {
        File file = new File(zzw(), "dex");
        zzu(file);
        File fileZzq = zzq(file, str);
        zzu(fileZzq);
        return fileZzq;
    }

    public final File zzb() throws IOException {
        File file = new File(zzw(), "unverified-splits");
        zzu(file);
        return file;
    }

    public final File zzc(String str, String str2) {
        return zzq(zzs(str), str2);
    }

    public final File zzd() {
        return new File(zzw(), "lock.tmp");
    }

    public final File zze(String str) {
        return zzq(zzb(), zzx(str));
    }

    public final File zzf(File file) {
        return zzq(zzt(), file.getName());
    }

    public final File zzg(String str) {
        return zzq(zzt(), zzx(str));
    }

    public final List zzh() {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = zzr().listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    public final Set zzi(String str) {
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = zzs(str).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    public final Set zzj() {
        File fileZzt = zzt();
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = fileZzt.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && file.getName().endsWith(".apk") && zzp(file)) {
                    String name = file.getName();
                    hashSet.add(new zzb(file, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public final void zzk() throws IOException {
        File fileZzv = zzv();
        String[] list = fileZzv.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.zza))) {
                    File file = new File(fileZzv, str);
                    file.toString();
                    zzl(file);
                }
            }
        }
    }

    public final void zzn(String str) {
        zzl(zzs(str));
    }

    public final void zzo(File file) {
        if (file.getParentFile().getParentFile().equals(zzr())) {
            zzl(file);
        } else {
            h.z("File to remove is not a native library");
        }
    }
}
