package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class g3 extends i3 {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private g3() {
        super(null);
    }

    public /* synthetic */ g3(f3 f3Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.i3
    public final void a(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) w4.k(obj, j);
        if (list instanceof zzkm) {
            objUnmodifiableList = ((zzkm) list).zze();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof w3) && (list instanceof zzke)) {
                zzke zzkeVar = (zzke) list;
                if (zzkeVar.zzc()) {
                    zzkeVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        w4.x(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.measurement.i3
    public final <E> void b(Object obj, Object obj2, long j) {
        List list;
        List list2;
        List listZzd;
        List list3 = (List) w4.k(obj2, j);
        int size = list3.size();
        List list4 = (List) w4.k(obj, j);
        if (list4.isEmpty()) {
            if (list4 instanceof zzkm) {
                listZzd = new zzkl(size);
            } else {
                listZzd = ((list4 instanceof w3) && (list4 instanceof zzke)) ? ((zzke) list4).zzd(size) : new ArrayList(size);
            }
            w4.x(obj, j, listZzd);
            list2 = listZzd;
        } else {
            if (c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                w4.x(obj, j, arrayList);
                list = arrayList;
            } else if (list4 instanceof zzmg) {
                zzkl zzklVar = new zzkl(list4.size() + size);
                zzklVar.addAll(zzklVar.size(), (zzmg) list4);
                w4.x(obj, j, zzklVar);
                list = zzklVar;
            } else if ((list4 instanceof w3) && (list4 instanceof zzke)) {
                zzke zzkeVar = (zzke) list4;
                if (!zzkeVar.zzc()) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    zzke<E> zzkeVarZzd = zzkeVar.zzd(list4.size() + size);
                    w4.x(obj, j, zzkeVarZzd);
                    list2 = zzkeVarZzd;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        w4.x(obj, j, list3);
    }
}
