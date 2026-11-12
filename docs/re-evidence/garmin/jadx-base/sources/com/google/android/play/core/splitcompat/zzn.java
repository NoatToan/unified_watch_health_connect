package com.google.android.play.core.splitcompat;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p6.b;

/* JADX INFO: loaded from: classes14.dex */
public final class zzn {
    private static final Pattern zza = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    private final zze zzb;

    public zzn(zze zzeVar) {
        this.zzb = zzeVar;
    }

    public static /* bridge */ /* synthetic */ Set zza(zzn zznVar, Set set, zzt zztVar, ZipFile zipFile) {
        HashSet hashSet = new HashSet();
        zznVar.zzf(zztVar, set, new zzj(zznVar, hashSet, zztVar, zipFile));
        return hashSet;
    }

    private static void zze(zzt zztVar, zzk zzkVar) throws IllegalAccessException, IOException, InvocationTargetException {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(zztVar.zza());
            try {
                String strZzb = zztVar.zzb();
                HashMap map = new HashMap();
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    Matcher matcher = zza.matcher(zipEntryNextElement.getName());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("NativeLibraryExtractor: split '");
                        sb3.append(strZzb);
                        sb3.append("' has native library '");
                        sb3.append(strGroup2);
                        sb3.append("' for ABI '");
                        sb3.append(strGroup);
                        sb3.append("'");
                        Set hashSet = (Set) map.get(strGroup);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(strGroup, hashSet);
                        }
                        hashSet.add(new zzm(zipEntryNextElement, strGroup2));
                    }
                }
                HashMap map2 = new HashMap();
                for (String str : Build.SUPPORTED_ABIS) {
                    if (map.containsKey(str)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("NativeLibraryExtractor: there are native libraries for supported ABI ");
                        sb4.append(str);
                        sb4.append("; will use this ABI");
                        for (zzm zzmVar : (Set) map.get(str)) {
                            if (map2.containsKey(zzmVar.zza)) {
                                String str2 = zzmVar.zza;
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("NativeLibraryExtractor: skipping library ");
                                sb5.append(str2);
                                sb5.append(" for ABI ");
                                sb5.append(str);
                                sb5.append("; already present for a better ABI");
                            } else {
                                map2.put(zzmVar.zza, zzmVar);
                                String str3 = zzmVar.zza;
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("NativeLibraryExtractor: using library ");
                                sb6.append(str3);
                                sb6.append(" for ABI ");
                                sb6.append(str);
                            }
                        }
                    } else {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("NativeLibraryExtractor: there are no native libraries for supported ABI ");
                        sb7.append(str);
                    }
                }
                zzkVar.zza(zipFile, new HashSet(map2.values()));
                zipFile.close();
            } catch (IOException e4) {
                e = e4;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e14) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e14);
                    }
                }
                throw e;
            }
        } catch (IOException e15) {
            e = e15;
            zipFile = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(zzt zztVar, Set set, zzl zzlVar) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzm zzmVar = (zzm) it.next();
            File fileZzc = this.zzb.zzc(zztVar.zzb(), zzmVar.zza);
            boolean z14 = false;
            if (fileZzc.exists() && fileZzc.length() == zzmVar.zzb.getSize() && zze.zzp(fileZzc)) {
                z14 = true;
            }
            zzlVar.zza(zzmVar, fileZzc, z14);
        }
    }

    public final Set zzb(zzt zztVar) throws IllegalAccessException, IOException, InvocationTargetException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        zze(zztVar, new zzh(this, zztVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    public final Set zzc() throws IllegalAccessException, IOException, InvocationTargetException {
        Set<zzt> setZzj = this.zzb.zzj();
        for (String str : this.zzb.zzh()) {
            Iterator it = setZzj.iterator();
            do {
                if (!it.hasNext()) {
                    StringBuilder sb3 = new StringBuilder("NativeLibraryExtractor: extracted split '");
                    sb3.append(str);
                    sb3.append("' has no corresponding split; deleting");
                    this.zzb.zzn(str);
                    break;
                }
            } while (!((zzt) it.next()).zzb().equals(str));
        }
        HashSet hashSet = new HashSet();
        for (zzt zztVar : setZzj) {
            HashSet hashSet2 = new HashSet();
            zze(zztVar, new zzi(this, hashSet2, zztVar));
            for (File file : this.zzb.zzi(zztVar.zzb())) {
                if (!hashSet2.contains(file)) {
                    String absolutePath = file.getAbsolutePath();
                    String strZzb = zztVar.zzb();
                    String absolutePath2 = zztVar.zza().getAbsolutePath();
                    StringBuilder sbI = b.i("NativeLibraryExtractor: file '", absolutePath, "' found in split '", strZzb, "' that is not in the split file '");
                    sbI.append(absolutePath2);
                    sbI.append("'; removing");
                    this.zzb.zzo(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }
}
