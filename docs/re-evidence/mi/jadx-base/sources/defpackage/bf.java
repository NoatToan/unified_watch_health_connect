package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Exception;

/* JADX INFO: loaded from: classes3.dex */
public class bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f4136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4137b;
    public final byte[][] c;

    public bf(InputStream inputStream) {
        this(inputStream, yio.c(inputStream));
    }

    public hd a(int i) throws IOException {
        if (i == 4) {
            return new bu1(this);
        }
        if (i == 8) {
            return new bg5(this);
        }
        if (i == 16) {
            return new fu1(this);
        }
        if (i == 17) {
            return new ju1(this);
        }
        throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(i));
    }

    public hd b() throws IOException {
        int i = this.f4136a.read();
        if (i == -1) {
            return null;
        }
        e(false);
        int iY = ud.y(this.f4136a, i);
        boolean z = (i & 32) != 0;
        int iP = ud.p(this.f4136a, this.f4137b);
        if (iP < 0) {
            if (!z) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            bf bfVar = new bf(new m7d(this.f4136a, this.f4137b), this.f4137b);
            if ((i & 64) != 0) {
                return new vt1(iY, bfVar);
            }
            return (i & 128) != 0 ? new nu1(true, iY, bfVar) : bfVar.a(iY);
        }
        ly5 ly5Var = new ly5(this.f4136a, iP);
        if ((i & 64) != 0) {
            return new tf5(z, iY, ly5Var.c());
        }
        if ((i & 128) != 0) {
            return new nu1(z, iY, new bf(ly5Var));
        }
        if (!z) {
            if (iY == 4) {
                return new sg5(ly5Var);
            }
            try {
                return ud.d(iY, ly5Var, this.c);
            } catch (IllegalArgumentException e) {
                throw new ASN1Exception("corrupted stream detected", e);
            }
        }
        if (iY == 4) {
            return new bu1(new bf(ly5Var));
        }
        if (iY == 8) {
            return new bg5(new bf(ly5Var));
        }
        if (iY == 16) {
            return new ah5(new bf(ly5Var));
        }
        if (iY == 17) {
            return new eh5(new bf(ly5Var));
        }
        throw new IOException("unknown tag " + iY + " encountered");
    }

    public re c(boolean z, int i) throws IOException {
        if (!z) {
            return new ih5(false, i, new qg5(((ly5) this.f4136a).c()));
        }
        jd jdVarD = d();
        if (this.f4136a instanceof m7d) {
            return jdVarD.c() == 1 ? new lu1(true, i, jdVarD.b(0)) : new lu1(false, i, xt1.a(jdVarD));
        }
        return jdVarD.c() == 1 ? new ih5(true, i, jdVarD.b(0)) : new ih5(false, i, dg5.a(jdVarD));
    }

    public jd d() throws IOException {
        jd jdVar = new jd();
        while (true) {
            hd hdVarB = b();
            if (hdVarB == null) {
                return jdVar;
            }
            jdVar.a(hdVarB instanceof e7d ? ((e7d) hdVarB).getLoadedObject() : hdVarB.toASN1Primitive());
        }
    }

    public final void e(boolean z) {
        InputStream inputStream = this.f4136a;
        if (inputStream instanceof m7d) {
            ((m7d) inputStream).d(z);
        }
    }

    public bf(InputStream inputStream, int i) {
        this.f4136a = inputStream;
        this.f4137b = i;
        this.c = new byte[11][];
    }
}
