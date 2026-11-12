package com.google.android.gms.internal.fitness;

import com.google.android.gms.internal.fitness.zzfo;
import com.google.android.gms.internal.fitness.zzfr;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfr<MessageType extends zzfo<MessageType, BuilderType>, BuilderType extends zzfr<MessageType, BuilderType>> implements zzij {
    public abstract BuilderType zza(MessageType messagetype);

    @Override // com.google.android.gms.internal.fitness.zzij
    public final /* synthetic */ zzij zza(zzik zzikVar) {
        if (zzbu().getClass().isInstance(zzikVar)) {
            return zza((zzfo) zzikVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // 
    /* JADX INFO: renamed from: zzap, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();
}
