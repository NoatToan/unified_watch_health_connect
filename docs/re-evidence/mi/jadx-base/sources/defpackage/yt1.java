package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public class yt1 extends ge {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ge[] f40507b;

    public class a implements Enumeration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40508a = 0;

        public a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f40508a < yt1.this.f40507b.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            ge[] geVarArr = yt1.this.f40507b;
            int i = this.f40508a;
            this.f40508a = i + 1;
            return geVarArr[i];
        }
    }

    public yt1(byte[] bArr) {
        super(bArr);
    }

    public static yt1 u(se seVar) {
        ge[] geVarArr = new ge[seVar.size()];
        Enumeration enumerationU = seVar.u();
        int i = 0;
        while (enumerationU.hasMoreElements()) {
            geVarArr[i] = (ge) enumerationU.nextElement();
            i++;
        }
        return new yt1(geVarArr);
    }

    public static byte[] x(ge[] geVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != geVarArr.length; i++) {
            try {
                byteArrayOutputStream.write(((pg5) geVarArr[i]).r());
            } catch (IOException e) {
                throw new IllegalArgumentException("exception converting octets " + e.toString());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(geVarArr[i].getClass().getName() + " found in input should only contain DEROctetString");
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.c(36);
        oeVar.c(128);
        Enumeration enumerationW = w();
        while (enumerationW.hasMoreElements()) {
            oeVar.j((gd) enumerationW.nextElement());
        }
        oeVar.c(0);
        oeVar.c(0);
    }

    @Override // defpackage.pe
    public int i() throws IOException {
        Enumeration enumerationW = w();
        int i = 0;
        while (enumerationW.hasMoreElements()) {
            i += ((gd) enumerationW.nextElement()).toASN1Primitive().i();
        }
        return i + 4;
    }

    @Override // defpackage.pe
    public boolean k() {
        return true;
    }

    @Override // defpackage.ge
    public byte[] r() {
        return this.f18874a;
    }

    public final Vector v() {
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            byte[] bArr = this.f18874a;
            if (i >= bArr.length) {
                return vector;
            }
            int i2 = i + 1000;
            int length = (i2 > bArr.length ? bArr.length : i2) - i;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, i, bArr2, 0, length);
            vector.addElement(new pg5(bArr2));
            i = i2;
        }
    }

    public Enumeration w() {
        return this.f40507b == null ? v().elements() : new a();
    }

    public yt1(ge[] geVarArr) {
        super(x(geVarArr));
        this.f40507b = geVarArr;
    }
}
