package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes14.dex */
class zzbq extends zzbo implements List {
    final /* synthetic */ zzbr zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbq(zzbr zzbrVar, Object obj, List list, zzbo zzboVar) {
        super(zzbrVar, obj, list, zzboVar);
        this.zzf = zzbrVar;
    }

    @Override // java.util.List
    public final void add(int i14, Object obj) {
        zzb();
        boolean zIsEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i14, obj);
        this.zzf.zzb++;
        if (zIsEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i14, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.zzb).addAll(i14, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        this.zzf.zzb += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        zza();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i14) {
        zzb();
        return ((List) this.zzb).get(i14);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzbp(this);
    }

    @Override // java.util.List
    public final Object remove(int i14) {
        zzb();
        Object objRemove = ((List) this.zzb).remove(i14);
        this.zzf.zzb--;
        zzc();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i14, Object obj) {
        zzb();
        return ((List) this.zzb).set(i14, obj);
    }

    @Override // java.util.List
    public final List subList(int i14, int i15) {
        zzb();
        List listSubList = ((List) this.zzb).subList(i14, i15);
        zzbo zzboVar = this.zzc;
        if (zzboVar == null) {
            zzboVar = this;
        }
        return this.zzf.zzm(this.zza, listSubList, zzboVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i14) {
        zzb();
        return new zzbp(this, i14);
    }
}
