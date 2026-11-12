package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class aep implements Serializable, Externalizable {
    private static final long serialVersionUID = 1;
    public byte[] d;

    public aep() {
    }

    public aep(byte[] bArr) {
        this.d = bArr;
    }

    protected Object readResolve() {
        try {
            return aek.a(this.d);
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to JDK deserialize `JsonNode` value: " + e.getMessage(), e);
        }
    }

    public static aep a(Object obj) {
        try {
            return new aep(aek.b(obj));
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to JDK serialize `" + obj.getClass().getSimpleName() + "` value: " + e.getMessage(), e);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(this.d.length);
        objectOutput.write(this.d);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        this.d = a(objectInput, objectInput.readInt());
    }

    private byte[] a(ObjectInput objectInput, int i) throws IOException {
        if (i <= 100000) {
            byte[] bArr = new byte[i];
            objectInput.readFully(bArr, 0, i);
            return bArr;
        }
        xx xxVar = new xx(100000);
        try {
            byte[] bArrF = xxVar.f();
            while (true) {
                int i2 = 0;
                do {
                    int iMin = Math.min(bArrF.length - i2, i);
                    objectInput.readFully(bArrF, 0, iMin);
                    i -= iMin;
                    i2 += iMin;
                    if (i == 0) {
                        byte[] bArrB = xxVar.b(i2);
                        xxVar.close();
                        return bArrB;
                    }
                } while (i2 != bArrF.length);
                bArrF = xxVar.e();
            }
        } catch (Throwable th) {
            try {
                xxVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
