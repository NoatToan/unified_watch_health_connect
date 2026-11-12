package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public class zt1 extends he {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public he[] f41644b;

    public class a implements Enumeration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f41645a = 0;

        public a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f41645a < zt1.this.f41644b.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            he[] heVarArr = zt1.this.f41644b;
            int i = this.f41645a;
            this.f41645a = i + 1;
            return heVarArr[i];
        }
    }

    public zt1(byte[] bArr) {
        super(bArr);
    }

    public static zt1 u(te teVar) {
        he[] heVarArr = new he[teVar.size()];
        Enumeration enumerationU = teVar.u();
        int i = 0;
        while (enumerationU.hasMoreElements()) {
            heVarArr[i] = (he) enumerationU.nextElement();
            i++;
        }
        return new zt1(heVarArr);
    }

    public static byte[] x(he[] heVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != heVarArr.length; i++) {
            try {
                byteArrayOutputStream.write(((qg5) heVarArr[i]).r());
            } catch (IOException e) {
                throw new IllegalArgumentException("exception converting octets " + e.toString());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(heVarArr[i].getClass().getName() + " found in input should only contain DEROctetString");
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.c(36);
        keVar.c(128);
        Enumeration enumerationW = w();
        while (enumerationW.hasMoreElements()) {
            keVar.j((hd) enumerationW.nextElement());
        }
        keVar.c(0);
        keVar.c(0);
    }

    @Override // defpackage.re
    public int i() throws IOException {
        Enumeration enumerationW = w();
        int i = 0;
        while (enumerationW.hasMoreElements()) {
            i += ((hd) enumerationW.nextElement()).toASN1Primitive().i();
        }
        return i + 4;
    }

    @Override // defpackage.re
    public boolean k() {
        return true;
    }

    @Override // defpackage.he
    public byte[] r() {
        return this.f19967a;
    }

    public final Vector v() {
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            byte[] bArr = this.f19967a;
            if (i >= bArr.length) {
                return vector;
            }
            int i2 = i + 1000;
            int length = (i2 > bArr.length ? bArr.length : i2) - i;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, i, bArr2, 0, length);
            vector.addElement(new qg5(bArr2));
            i = i2;
        }
    }

    public Enumeration w() {
        return this.f41644b == null ? v().elements() : new a();
    }

    public zt1(he[] heVarArr) {
        super(x(heVarArr));
        this.f41644b = heVarArr;
    }
}
