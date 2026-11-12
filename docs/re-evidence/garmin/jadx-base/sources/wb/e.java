package wb;

import androidx.media3.common.ParserException;
import bb.o;
import fa.r;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f183832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f183833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f183834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f183835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f183836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f183837f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f183838g = new r(255);

    public final boolean a(o oVar, boolean z14) throws ParserException, EOFException {
        boolean zPeekFully;
        boolean zPeekFully2;
        this.f183832a = 0;
        this.f183833b = 0L;
        this.f183834c = 0;
        this.f183835d = 0;
        this.f183836e = 0;
        r rVar = this.f183838g;
        rVar.D(27);
        try {
            zPeekFully = oVar.peekFully(rVar.f70054a, 0, 27, z14);
        } catch (EOFException e4) {
            if (!z14) {
                throw e4;
            }
            zPeekFully = false;
        }
        if (zPeekFully && rVar.w() == 1332176723) {
            if (rVar.u() == 0) {
                this.f183832a = rVar.u();
                this.f183833b = rVar.j();
                rVar.l();
                rVar.l();
                rVar.l();
                int iU = rVar.u();
                this.f183834c = iU;
                this.f183835d = iU + 27;
                rVar.D(iU);
                try {
                    zPeekFully2 = oVar.peekFully(rVar.f70054a, 0, this.f183834c, z14);
                } catch (EOFException e14) {
                    if (!z14) {
                        throw e14;
                    }
                    zPeekFully2 = false;
                }
                if (zPeekFully2) {
                    for (int i14 = 0; i14 < this.f183834c; i14++) {
                        int iU2 = rVar.u();
                        this.f183837f[i14] = iU2;
                        this.f183836e += iU2;
                    }
                    return true;
                }
            } else if (!z14) {
                throw ParserException.createForUnsupportedContainerFeature("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(o oVar, long j8) {
        boolean zPeekFully;
        fa.a.a(oVar.getPosition() == oVar.getPeekPosition());
        r rVar = this.f183838g;
        rVar.D(4);
        while (true) {
            if (j8 != -1 && oVar.getPosition() + 4 >= j8) {
                break;
            }
            try {
                zPeekFully = oVar.peekFully(rVar.f70054a, 0, 4, true);
            } catch (EOFException unused) {
                zPeekFully = false;
            }
            if (!zPeekFully) {
                break;
            }
            rVar.G(0);
            if (rVar.w() == 1332176723) {
                oVar.resetPeekPosition();
                return true;
            }
            oVar.skipFully(1);
        }
        do {
            if (j8 != -1 && oVar.getPosition() >= j8) {
                break;
            }
        } while (oVar.skip(1) != -1);
        return false;
    }
}
