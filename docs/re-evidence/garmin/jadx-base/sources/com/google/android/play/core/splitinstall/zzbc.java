package com.google.android.play.core.splitinstall;

import am.j;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.splitinstall.internal.zzbr;
import com.google.android.play.core.splitinstall.internal.zzbu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
final class zzbc {
    private static final com.google.android.play.core.splitinstall.internal.zzu zzb = new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallService");
    private static final Intent zzc = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    com.google.android.play.core.splitinstall.internal.zzaf zza;
    private final String zzd;

    public zzbc(Context context, String str) {
        this.zzd = str;
        if (zzbu.zza(context)) {
            this.zza = new com.google.android.play.core.splitinstall.internal.zzaf(zzbr.zza(context), zzb, "SplitInstallService", zzc, zzak.zza, null);
        }
    }

    public static /* bridge */ /* synthetic */ Bundle zzb(com.google.android.play.core.splitinstall.internal.zzn zznVar) {
        Bundle bundleZzo = zzo();
        bundleZzo.putParcelableArrayList("event_timestamps", new ArrayList<>(zznVar.zza()));
        return bundleZzo;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzm(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("language", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzn(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle zzo() {
        return j.e(11004, "playcore_version_code");
    }

    private static Task zzp() {
        zzb.zzb("onError(%d)", -14);
        return Tasks.forException(new SplitInstallException(-14));
    }

    public final Task zzc(int i14) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("cancelInstall(%d)", Integer.valueOf(i14));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzas(this, taskCompletionSource, i14, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task zzd(List list) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("deferredInstall(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzan(this, taskCompletionSource, list, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task zze(List list) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("deferredLanguageInstall(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzao(this, taskCompletionSource, list, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task zzf(List list) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("deferredLanguageUninstall(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzap(this, taskCompletionSource, list, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task zzg(List list) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("deferredUninstall(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzam(this, taskCompletionSource, list, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task zzh(int i14) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("getSessionState(%d)", Integer.valueOf(i14));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzaq(this, taskCompletionSource, i14, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task zzi() {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("getSessionStates", new Object[0]);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzar(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task zzj(Collection collection, Collection collection2, com.google.android.play.core.splitinstall.internal.zzn zznVar) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("startInstall(%s,%s)", collection, collection2);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzal(this, taskCompletionSource, collection, collection2, zznVar, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
