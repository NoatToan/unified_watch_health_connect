package com.google.android.gms.internal.fitness;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfx implements Serializable, Iterable<Byte> {
    private static final d2 b;
    private static final Comparator<zzfx> c;
    public static final zzfx zzub = new h2(zzhc.zzyl);
    private int a = 0;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        x1 x1Var = null;
        b = w1.a() ? new g2(x1Var) : new c2(x1Var);
        c = new z1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(byte b2) {
        return b2 & 255;
    }

    public static int e(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static f2 g(int i) {
        return new f2(i, null);
    }

    public static zzfx zzk(String str) {
        return new h2(str.getBytes(zzhc.a));
    }

    public abstract void b(zzfu zzfuVar) throws IOException;

    public abstract boolean equals(Object obj);

    public abstract byte f(int i);

    public final int hashCode() {
        int iZzb = this.a;
        if (iZzb == 0) {
            int size = size();
            iZzb = zzb(size, 0, size);
            if (iZzb == 0) {
                iZzb = 1;
            }
            this.a = iZzb;
        }
        return iZzb;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new x1(this);
    }

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        objArr[2] = size() <= 50 ? l4.a(this) : String.valueOf(l4.a(zzd(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract String zza(Charset charset);

    public final String zzav() {
        return size() == 0 ? "" : zza(zzhc.a);
    }

    public abstract boolean zzaw();

    public final int zzax() {
        return this.a;
    }

    public abstract int zzb(int i, int i2, int i3);

    public abstract zzfx zzd(int i, int i2);

    public abstract byte zzj(int i);
}
