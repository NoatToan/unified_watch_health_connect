package defpackage;

import com.google.common.cache.ElementTypesAreNonnullByDefault;
import com.google.common.cache.LongAddable;
import com.google.common.cache.Striped64;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
final class ajw extends Striped64 implements Serializable, LongAddable {
    private static final long serialVersionUID = 7249069246863182397L;

    @Override // com.google.common.cache.Striped64
    public final long fn(long j, long j2) {
        return j + j2;
    }

    @Override // com.google.common.cache.LongAddable
    public void add(long j) {
        int length;
        Striped64.c cVar;
        Striped64.c[] cVarArr = this.cells;
        if (cVarArr == null) {
            long j2 = this.base;
            if (casBase(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = threadHashCode.get();
        boolean zA = true;
        if (iArr != null && cVarArr != null && (length = cVarArr.length) >= 1 && (cVar = cVarArr[(length - 1) & iArr[0]]) != null) {
            long j3 = cVar.f4267a;
            zA = cVar.a(j3, j3 + j);
            if (zA) {
                return;
            }
        }
        retryUpdate(j, iArr, zA);
    }

    @Override // com.google.common.cache.LongAddable
    public void increment() {
        add(1L);
    }

    @Override // com.google.common.cache.LongAddable
    public long sum() {
        long j = this.base;
        Striped64.c[] cVarArr = this.cells;
        if (cVarArr != null) {
            for (Striped64.c cVar : cVarArr) {
                if (cVar != null) {
                    j += cVar.f4267a;
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
