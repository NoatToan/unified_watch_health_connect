package com.google.android.gms.internal.fitness;

import com.google.android.gms.internal.fitness.zzgv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class q2<T extends zzgv<T>> {
    private static final q2 d = new q2(true);
    public final y3<T, Object> a;
    private boolean b;
    private boolean c;

    private q2() {
        this.a = y3.g(16);
    }

    public static int e(zzkg zzkgVar, int i, Object obj) {
        int iZzr = zzgk.zzr(i);
        if (zzkgVar == zzkg.zzade) {
            zzhc.e((zzik) obj);
            iZzr <<= 1;
        }
        return iZzr + m(zzkgVar, obj);
    }

    private final Object f(T t) {
        Object obj = this.a.get(t);
        if (!(obj instanceof zzhl)) {
            return obj;
        }
        return zzhl.zzce();
    }

    public static void g(zzgk zzgkVar, zzkg zzkgVar, int i, Object obj) throws IOException {
        if (zzkgVar == zzkg.zzade) {
            zzik zzikVar = (zzik) obj;
            zzhc.e(zzikVar);
            zzgkVar.writeTag(i, 3);
            zzikVar.zzb(zzgkVar);
            zzgkVar.writeTag(i, 4);
        }
        zzgkVar.writeTag(i, zzkgVar.zzdy());
        switch (p2.b[zzkgVar.ordinal()]) {
            case 1:
                zzgkVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzgkVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzgkVar.zza(((Long) obj).longValue());
                break;
            case 4:
                zzgkVar.zza(((Long) obj).longValue());
                break;
            case 5:
                zzgkVar.zzn(((Integer) obj).intValue());
                break;
            case 6:
                zzgkVar.zzc(((Long) obj).longValue());
                break;
            case 7:
                zzgkVar.zzq(((Integer) obj).intValue());
                break;
            case 8:
                zzgkVar.zza(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzik) obj).zzb(zzgkVar);
                break;
            case 10:
                zzgkVar.zzb((zzik) obj);
                break;
            case 11:
                if (!(obj instanceof zzfx)) {
                    zzgkVar.zzl((String) obj);
                } else {
                    zzgkVar.zza((zzfx) obj);
                }
                break;
            case 12:
                if (!(obj instanceof zzfx)) {
                    byte[] bArr = (byte[]) obj;
                    zzgkVar.e(bArr, 0, bArr.length);
                } else {
                    zzgkVar.zza((zzfx) obj);
                }
                break;
            case 13:
                zzgkVar.zzo(((Integer) obj).intValue());
                break;
            case 14:
                zzgkVar.zzq(((Integer) obj).intValue());
                break;
            case 15:
                zzgkVar.zzc(((Long) obj).longValue());
                break;
            case 16:
                zzgkVar.zzp(((Integer) obj).intValue());
                break;
            case 17:
                zzgkVar.zzb(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof zzhb)) {
                    zzgkVar.zzn(((Integer) obj).intValue());
                } else {
                    zzgkVar.zzn(((zzhb) obj).zzc());
                }
                break;
        }
    }

    private final void i(T t, Object obj) {
        if (!t.zzbn()) {
            j(t.zzbl(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                j(t.zzbl(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzhl) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0014  */
    private static void j(zzkg zzkgVar, Object obj) {
        zzhc.a(obj);
        boolean z = true;
        switch (p2.a[zzkgVar.zzdx().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof zzfx) && !(obj instanceof byte[])) {
                    z = false;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof zzhb)) {
                    z = false;
                }
                break;
            case 9:
                if (!(obj instanceof zzik) && !(obj instanceof zzhl)) {
                    z = false;
                }
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static int l(zzgv<?> zzgvVar, Object obj) {
        zzkg zzkgVarZzbl = zzgvVar.zzbl();
        int iZzc = zzgvVar.zzc();
        if (!zzgvVar.zzbn()) {
            return e(zzkgVarZzbl, iZzc, obj);
        }
        int iE = 0;
        if (zzgvVar.zzbo()) {
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                iE += m(zzkgVarZzbl, it2.next());
            }
            return zzgk.zzr(iZzc) + iE + zzgk.zzz(iE);
        }
        Iterator it3 = ((List) obj).iterator();
        while (it3.hasNext()) {
            iE += e(zzkgVarZzbl, iZzc, it3.next());
        }
        return iE;
    }

    private static int m(zzkg zzkgVar, Object obj) {
        switch (p2.b[zzkgVar.ordinal()]) {
            case 1:
                return zzgk.zzc(((Double) obj).doubleValue());
            case 2:
                return zzgk.zzc(((Float) obj).floatValue());
            case 3:
                return zzgk.zzd(((Long) obj).longValue());
            case 4:
                return zzgk.zze(((Long) obj).longValue());
            case 5:
                return zzgk.zzs(((Integer) obj).intValue());
            case 6:
                return zzgk.zzg(((Long) obj).longValue());
            case 7:
                return zzgk.zzv(((Integer) obj).intValue());
            case 8:
                return zzgk.zzb(((Boolean) obj).booleanValue());
            case 9:
                return zzgk.zzd((zzik) obj);
            case 10:
                return obj instanceof zzhl ? zzgk.zza((zzhl) obj) : zzgk.zzc((zzik) obj);
            case 11:
                return obj instanceof zzfx ? zzgk.zzb((zzfx) obj) : zzgk.zzm((String) obj);
            case 12:
                return obj instanceof zzfx ? zzgk.zzb((zzfx) obj) : zzgk.zzb((byte[]) obj);
            case 13:
                return zzgk.zzt(((Integer) obj).intValue());
            case 14:
                return zzgk.zzw(((Integer) obj).intValue());
            case 15:
                return zzgk.zzh(((Long) obj).longValue());
            case 16:
                return zzgk.zzu(((Integer) obj).intValue());
            case 17:
                return zzgk.zzf(((Long) obj).longValue());
            case 18:
                return obj instanceof zzhb ? zzgk.zzx(((zzhb) obj).zzc()) : zzgk.zzx(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static <T extends zzgv<T>> boolean n(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzbm() == zzkj.MESSAGE) {
            if (key.zzbn()) {
                Iterator it2 = ((List) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    if (!((zzik) it2.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof zzik)) {
                    if (value instanceof zzhl) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((zzik) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static <T extends zzgv<T>> q2<T> o() {
        return d;
    }

    private final void q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzhl) {
            value = zzhl.zzce();
        }
        if (key.zzbn()) {
            Object objF = f(key);
            if (objF == null) {
                objF = new ArrayList();
            }
            Iterator it2 = ((List) value).iterator();
            while (it2.hasNext()) {
                ((List) objF).add(s(it2.next()));
            }
            this.a.put(key, objF);
            return;
        }
        if (key.zzbm() != zzkj.MESSAGE) {
            this.a.put(key, s(value));
            return;
        }
        Object objF2 = f(key);
        if (objF2 == null) {
            this.a.put(key, s(value));
        } else {
            this.a.put(key, objF2 instanceof zziq ? key.zza((zziq) objF2, (zziq) value) : key.zza(((zzik) objF2).zzbt(), (zzik) value).zzca());
        }
    }

    private static int r(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzbm() != zzkj.MESSAGE || key.zzbn() || key.zzbo()) {
            return l(key, value);
        }
        return value instanceof zzhl ? zzgk.zzb(entry.getKey().zzc(), (zzhl) value) : zzgk.zzb(entry.getKey().zzc(), (zzik) value);
    }

    private static Object s(Object obj) {
        if (obj instanceof zziq) {
            return ((zziq) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final Iterator<Map.Entry<T, Object>> a() {
        return this.c ? new x2(this.a.p().iterator()) : this.a.p().iterator();
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        for (int i = 0; i < this.a.n(); i++) {
            if (!n(this.a.h(i))) {
                return false;
            }
        }
        Iterator it2 = this.a.o().iterator();
        while (it2.hasNext()) {
            if (!n((Map.Entry) it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        q2 q2Var = new q2();
        for (int i = 0; i < this.a.n(); i++) {
            Map.Entry<K, Object> entryH = this.a.h(i);
            q2Var.i((zzgv) entryH.getKey(), entryH.getValue());
        }
        Iterator it2 = this.a.o().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            q2Var.i((zzgv) entry.getKey(), entry.getValue());
        }
        q2Var.c = this.c;
        return q2Var;
    }

    public final Iterator<Map.Entry<T, Object>> d() {
        return this.c ? new x2(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q2) {
            return this.a.equals(((q2) obj).a);
        }
        return false;
    }

    public final void h(q2<T> q2Var) {
        for (int i = 0; i < q2Var.a.n(); i++) {
            q(q2Var.a.h(i));
        }
        Iterator it2 = q2Var.a.o().iterator();
        while (it2.hasNext()) {
            q((Map.Entry) it2.next());
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void k() {
        if (this.b) {
            return;
        }
        this.a.j();
        this.b = true;
    }

    public final int p() {
        int iR = 0;
        for (int i = 0; i < this.a.n(); i++) {
            iR += r(this.a.h(i));
        }
        Iterator it2 = this.a.o().iterator();
        while (it2.hasNext()) {
            iR += r((Map.Entry) it2.next());
        }
        return iR;
    }

    private q2(boolean z) {
        this(y3.g(0));
        k();
    }

    private q2(y3<T, Object> y3Var) {
        this.a = y3Var;
        k();
    }
}
