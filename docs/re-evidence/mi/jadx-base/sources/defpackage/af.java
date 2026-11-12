package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1Exception;

/* JADX INFO: loaded from: classes3.dex */
public class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f940b;
    public final byte[][] c;

    public af(InputStream inputStream) {
        this(inputStream, zio.c(inputStream));
    }

    public gd a(int i) throws IOException {
        if (i == 4) {
            return new au1(this);
        }
        if (i == 8) {
            return new ag5(this);
        }
        if (i == 16) {
            return new eu1(this);
        }
        if (i == 17) {
            return new iu1(this);
        }
        throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(i));
    }

    public gd b() throws IOException {
        int i = this.f939a.read();
        if (i == -1) {
            return null;
        }
        e(false);
        int iY = rd.y(this.f939a, i);
        boolean z = (i & 32) != 0;
        int iP = rd.p(this.f939a, this.f940b);
        if (iP < 0) {
            if (!z) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            af afVar = new af(new l7d(this.f939a, this.f940b), this.f940b);
            if ((i & 64) != 0) {
                return new ut1(iY, afVar);
            }
            return (i & 128) != 0 ? new mu1(true, iY, afVar) : afVar.a(iY);
        }
        ky5 ky5Var = new ky5(this.f939a, iP);
        if ((i & 64) != 0) {
            return new sf5(z, iY, ky5Var.c());
        }
        if ((i & 128) != 0) {
            return new mu1(z, iY, new af(ky5Var));
        }
        if (!z) {
            if (iY == 4) {
                return new rg5(ky5Var);
            }
            try {
                return rd.d(iY, ky5Var, this.c);
            } catch (IllegalArgumentException e) {
                throw new ASN1Exception("corrupted stream detected", e);
            }
        }
        if (iY == 4) {
            return new au1(new af(ky5Var));
        }
        if (iY == 8) {
            return new ag5(new af(ky5Var));
        }
        if (iY == 16) {
            return new zg5(new af(ky5Var));
        }
        if (iY == 17) {
            return new dh5(new af(ky5Var));
        }
        throw new IOException("unknown tag " + iY + " encountered");
    }

    public pe c(boolean z, int i) throws IOException {
        if (!z) {
            return new hh5(false, i, new pg5(((ky5) this.f939a).c()));
        }
        id idVarD = d();
        if (this.f939a instanceof l7d) {
            return idVarD.c() == 1 ? new ku1(true, i, idVarD.b(0)) : new ku1(false, i, wt1.a(idVarD));
        }
        return idVarD.c() == 1 ? new hh5(true, i, idVarD.b(0)) : new hh5(false, i, cg5.a(idVarD));
    }

    public id d() throws IOException {
        id idVar = new id();
        while (true) {
            gd gdVarB = b();
            if (gdVarB == null) {
                return idVar;
            }
            if (gdVarB instanceof d7d) {
                idVar.a(((d7d) gdVarB).getLoadedObject());
            } else {
                idVar.a(gdVarB.toASN1Primitive());
            }
        }
    }

    public final void e(boolean z) {
        InputStream inputStream = this.f939a;
        if (inputStream instanceof l7d) {
            ((l7d) inputStream).d(z);
        }
    }

    public af(InputStream inputStream, int i) {
        this.f939a = inputStream;
        this.f940b = i;
        this.c = new byte[11][];
    }
}
