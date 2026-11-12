package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.play.core.splitinstall.internal.zzah;
import com.google.android.play.core.splitinstall.internal.zzak;
import com.google.android.play.core.splitinstall.internal.zzam;
import com.google.android.play.core.splitinstall.internal.zzan;
import com.google.android.play.core.splitinstall.internal.zzao;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.zzbe;
import com.google.android.play.core.splitinstall.zzx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes14.dex */
public class SplitCompat {
    public static final /* synthetic */ int zza = 0;
    private static final AtomicReference zzb = new AtomicReference(null);
    private final zze zzc;
    private final zzbe zzd;
    private final Set zze = new HashSet();
    private final zza zzf;

    private SplitCompat(Context context) {
        try {
            zze zzeVar = new zze(context);
            this.zzc = zzeVar;
            this.zzf = new zza(zzeVar);
            this.zzd = new zzbe(context);
        } catch (PackageManager.NameNotFoundException e4) {
            throw new zzbh("Failed to initialize FileStorage", e4);
        }
    }

    public static boolean install(Context context) {
        return zzi(context, false);
    }

    public static boolean installActivity(Context context) {
        if (zzj()) {
            return false;
        }
        SplitCompat splitCompat = (SplitCompat) zzb.get();
        if (splitCompat != null) {
            return splitCompat.zzf.zzb(context, splitCompat.zzf());
        }
        if (context.getApplicationContext() != null) {
            install(context.getApplicationContext());
        }
        return install(context);
    }

    public static boolean zzd(Context context) {
        return zzi(context, true);
    }

    public static boolean zze() {
        return zzb.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set zzf() {
        HashSet hashSet;
        synchronized (this.zze) {
            hashSet = new HashSet(this.zze);
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg(Set set) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zze.zzl(this.zzc.zzg((String) it.next()));
        }
        this.zzd.zzb();
    }

    private final synchronized void zzh(Context context, boolean z14) {
        ZipFile zipFile;
        try {
            if (z14) {
                this.zzc.zzk();
            } else {
                zzd.zza().execute(new zzq(this));
            }
            String packageName = context.getPackageName();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                Set<zzt> setZzj = this.zzc.zzj();
                Set setZza = this.zzd.zza();
                HashSet hashSet = new HashSet();
                Iterator it = setZzj.iterator();
                while (it.hasNext()) {
                    String strZzb = ((zzt) it.next()).zzb();
                    if (arrayList.contains(strZzb) || setZza.contains(com.google.android.play.core.splitinstall.zzs.zzb(strZzb))) {
                        hashSet.add(strZzb);
                        it.remove();
                    }
                }
                if (z14) {
                    zzg(hashSet);
                } else if (!hashSet.isEmpty()) {
                    zzd.zza().execute(new zzr(this, hashSet));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it3 = setZzj.iterator();
                while (it3.hasNext()) {
                    String strZzb2 = ((zzt) it3.next()).zzb();
                    if (!com.google.android.play.core.splitinstall.zzs.zze(strZzb2)) {
                        hashSet2.add(strZzb2);
                    }
                }
                for (String str : arrayList) {
                    if (!com.google.android.play.core.splitinstall.zzs.zze(str)) {
                        hashSet2.add(str);
                    }
                }
                HashSet<zzt> hashSet3 = new HashSet(setZzj.size());
                for (zzt zztVar : setZzj) {
                    String strZzb3 = zztVar.zzb();
                    int i14 = com.google.android.play.core.splitinstall.zzs.zza;
                    if (strZzb3.startsWith("config.") || hashSet2.contains(com.google.android.play.core.splitinstall.zzs.zzb(zztVar.zzb()))) {
                        hashSet3.add(zztVar);
                    }
                }
                zzn zznVar = new zzn(this.zzc);
                zzan zzanVarZza = zzao.zza();
                ClassLoader classLoader = context.getClassLoader();
                if (z14) {
                    zzanVarZza.zza(classLoader, zznVar.zzc());
                } else {
                    Iterator it4 = hashSet3.iterator();
                    while (it4.hasNext()) {
                        Set setZzb = zznVar.zzb((zzt) it4.next());
                        if (setZzb == null) {
                            it4.remove();
                        } else {
                            zzanVarZza.zza(classLoader, setZzb);
                        }
                    }
                }
                HashSet hashSet4 = new HashSet();
                for (zzt zztVar2 : hashSet3) {
                    try {
                        zipFile = new ZipFile(zztVar2.zza());
                        try {
                            ZipEntry entry = zipFile.getEntry("classes.dex");
                            zipFile.close();
                            if (entry == null || zzanVarZza.zzb(classLoader, this.zzc.zza(zztVar2.zzb()), zztVar2.zza(), z14)) {
                                hashSet4.add(zztVar2.zza());
                            } else {
                                "split was not installed ".concat(zztVar2.zza().toString());
                            }
                        } catch (IOException e4) {
                            e = e4;
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (IOException e14) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e14);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            throw e;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        zipFile = null;
                    }
                }
                this.zzf.zza(context, hashSet4);
                HashSet hashSet5 = new HashSet();
                for (zzt zztVar3 : hashSet3) {
                    if (hashSet4.contains(zztVar3.zza())) {
                        zztVar3.zzb();
                        hashSet5.add(zztVar3.zzb());
                    } else {
                        zztVar3.zzb();
                    }
                }
                synchronized (this.zze) {
                    this.zze.addAll(hashSet5);
                }
            } catch (PackageManager.NameNotFoundException e16) {
                throw new IOException("Cannot load data for application '" + packageName + "'", e16);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private static boolean zzi(Context context, boolean z14) {
        boolean z15;
        final Context context2;
        if (zzj()) {
            return false;
        }
        AtomicReference atomicReference = zzb;
        SplitCompat splitCompat = new SplitCompat(context);
        while (true) {
            if (!atomicReference.compareAndSet(null, splitCompat)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    z15 = false;
                    break;
                }
            } else {
                z15 = true;
                break;
            }
        }
        SplitCompat splitCompat2 = (SplitCompat) zzb.get();
        if (z15) {
            context2 = context;
            com.google.android.play.core.splitinstall.zzo.INSTANCE.zzb(new zzak(context2, zzd.zza(), new zzam(context, splitCompat2.zzc, new zzah()), splitCompat2.zzc, new zzs()));
            com.google.android.play.core.splitinstall.zzr.zzb(new zzp(splitCompat2));
            zzd.zza().execute(new Runnable() { // from class: com.google.android.play.core.splitcompat.zzo
                @Override // java.lang.Runnable
                public final void run() {
                    Context context3 = context2;
                    int i14 = SplitCompat.zza;
                    try {
                        zzx.zzg(context3).zzc(true);
                    } catch (SecurityException unused) {
                    }
                }
            });
        } else {
            context2 = context;
        }
        try {
            splitCompat2.zzh(context2, z14);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean zzj() {
        return false;
    }
}
