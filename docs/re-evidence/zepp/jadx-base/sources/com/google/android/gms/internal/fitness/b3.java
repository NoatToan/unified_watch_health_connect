package com.google.android.gms.internal.fitness;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class b3 extends z2 {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private b3() {
        super();
    }

    private static <E> List<E> e(Object obj, long j) {
        return (List) s4.G(obj, j);
    }

    @Override // com.google.android.gms.internal.fitness.z2
    public final void a(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) s4.G(obj, j);
        if (list instanceof zzhr) {
            objUnmodifiableList = ((zzhr) list).zzci();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof s3) && (list instanceof zzhh)) {
                zzhh zzhhVar = (zzhh) list;
                if (zzhhVar.zzaq()) {
                    zzhhVar.zzar();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        s4.g(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.fitness.z2
    public final <E> void b(Object obj, Object obj2, long j) {
        List list;
        List list2;
        List listZzae;
        List listE = e(obj2, j);
        int size = listE.size();
        List listE2 = e(obj, j);
        if (listE2.isEmpty()) {
            if (listE2 instanceof zzhr) {
                listZzae = new zzhs(size);
            } else {
                listZzae = ((listE2 instanceof s3) && (listE2 instanceof zzhh)) ? ((zzhh) listE2).zzae(size) : new ArrayList(size);
            }
            s4.g(obj, j, listZzae);
            list2 = listZzae;
        } else {
            if (c.isAssignableFrom(listE2.getClass())) {
                ArrayList arrayList = new ArrayList(listE2.size() + size);
                arrayList.addAll(listE2);
                s4.g(obj, j, arrayList);
                list = arrayList;
            } else if (listE2 instanceof zzjt) {
                zzhs zzhsVar = new zzhs(listE2.size() + size);
                zzhsVar.addAll((zzjt) listE2);
                s4.g(obj, j, zzhsVar);
                list = zzhsVar;
            } else if ((listE2 instanceof s3) && (listE2 instanceof zzhh)) {
                zzhh zzhhVar = (zzhh) listE2;
                if (!zzhhVar.zzaq()) {
                    list2 = listE2;
                    list2 = listE2;
                    list2 = listE2;
                    zzhh<E> zzhhVarZzae = zzhhVar.zzae(listE2.size() + size);
                    s4.g(obj, j, zzhhVarZzae);
                    list2 = zzhhVarZzae;
                }
            }
            list2 = list;
        }
        list2 = listE2;
        list2 = listE2;
        list2 = listE2;
        list2 = listE2;
        list2 = listE2;
        list2 = listE2;
        int size2 = list2.size();
        int size3 = listE.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(listE);
        }
        if (size2 > 0) {
            listE = list2;
        }
        s4.g(obj, j, listE);
    }
}
