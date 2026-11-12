package defpackage;

import com.google.common.hash.ElementTypesAreNonnullByDefault;
import com.google.common.hash.LongAddable;
import com.google.common.hash.Striped64;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
final class aou extends Striped64 implements Serializable, LongAddable {
    private static final long serialVersionUID = 7249069246863182397L;

    @Override // com.google.common.hash.Striped64
    public final long fn(long j, long j2) {
        return j + j2;
    }

    @Override // com.google.common.hash.LongAddable
    public void add(long j) {
        int length;
        Striped64.a aVar;
        Striped64.a[] aVarArr = this.cells;
        if (aVarArr == null) {
            long j2 = this.base;
            if (casBase(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = threadHashCode.get();
        boolean zE = true;
        if (iArr != null && aVarArr != null && (length = aVarArr.length) >= 1 && (aVar = aVarArr[(length - 1) & iArr[0]]) != null) {
            long j3 = aVar.f4576b;
            zE = aVar.e(j3, j3 + j);
            if (zE) {
                return;
            }
        }
        retryUpdate(j, iArr, zE);
    }

    @Override // com.google.common.hash.LongAddable
    public void increment() {
        add(1L);
    }

    @Override // com.google.common.hash.LongAddable
    public long sum() {
        long j = this.base;
        Striped64.a[] aVarArr = this.cells;
        if (aVarArr != null) {
            for (Striped64.a aVar : aVarArr) {
                if (aVar != null) {
                    j += aVar.f4576b;
                }
            }
        }
        return j;
    }

    public String toString() {
        return Long.toString(sum());
    }

    @Override // java.lang.Number
    public long longValue() {
        return sum();
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) sum();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return sum();
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return sum();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(sum());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.busy = 0;
        this.cells = null;
        this.base = objectInputStream.readLong();
    }
}
