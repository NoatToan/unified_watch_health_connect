package com.google.android.gms.internal.gcm;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
final class zzs {
    private final ConcurrentHashMap<zzt, List<Throwable>> zzdt = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> zzdu = new ReferenceQueue<>();

    public final List<Throwable> zzd(Throwable th3, boolean z14) {
        Reference<? extends Throwable> referencePoll = this.zzdu.poll();
        while (referencePoll != null) {
            this.zzdt.remove(referencePoll);
            referencePoll = this.zzdu.poll();
        }
        List<Throwable> list = this.zzdt.get(new zzt(th3, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> listPutIfAbsent = this.zzdt.putIfAbsent(new zzt(th3, this.zzdu), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}
