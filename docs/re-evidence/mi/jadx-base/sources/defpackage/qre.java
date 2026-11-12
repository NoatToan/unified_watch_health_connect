package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class qre extends rlo implements Serializable, ore {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.c = 0;
        this.f32685a = null;
        this.f32686b = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(a());
    }

    @Override // defpackage.ore
    public long a() {
        long j = this.f32686b;
        rlo.b[] bVarArr = this.f32685a;
        if (bVarArr != null) {
            for (rlo.b bVar : bVarArr) {
                if (bVar != null) {
                    j += bVar.f32688a;
                }
            }
        }
        return j;
    }

    @Override // defpackage.ore
    public void add(long j) {
        int length;
        rlo.b bVar;
        rlo.b[] bVarArr = this.f32685a;
        if (bVarArr == null) {
            long j2 = this.f32686b;
            if (c(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = rlo.d.get();
        boolean zA = true;
        if (iArr != null && bVarArr != null && (length = bVarArr.length) >= 1 && (bVar = bVarArr[(length - 1) & iArr[0]]) != null) {
            long j3 = bVar.f32688a;
            zA = bVar.a(j3, j3 + j);
            if (zA) {
                return;
            }
        }
        g(j, iArr, zA);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return a();
    }

    @Override // defpackage.rlo
    public final long e(long j, long j2) {
        return j + j2;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return a();
    }

    @Override // defpackage.ore
    public void increment() {
        add(1L);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) a();
    }

    @Override // java.lang.Number
    public long longValue() {
        return a();
    }

    public String toString() {
        return Long.toString(a());
    }
}
