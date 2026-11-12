package nz2;

import com.jcraft.jzlib.GZIPException;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f128417k;

    public e(int i14, int i15, int i16, h.a aVar) throws GZIPException {
        this.f128417k = false;
        int iD = -2;
        if (i15 >= 9 && i15 <= 15) {
            if (aVar == h.f128428a) {
                i15 *= -1;
            } else if (aVar == h.f128429b) {
                i15 += 16;
            } else if (aVar != h.f128430c) {
            }
            this.f128417k = false;
            d dVar = new d(this);
            this.f128464i = dVar;
            iD = dVar.d(i14, i15, i16);
        }
        if (iD == 0) {
            return;
        }
        n23.j.p(iD, this.f128463h);
        throw null;
    }

    public e(int i14) {
        this(i14, 15);
    }

    public e(int i14, boolean z14) {
        this(i14, 15, z14);
    }

    public e(int i14, int i15) {
        this(i14, i15, false);
    }

    public e(int i14, int i15, boolean z14) throws GZIPException {
        this.f128417k = false;
        d dVar = new d(this);
        this.f128464i = dVar;
        int iD = dVar.d(i14, z14 ? -i15 : i15, 8);
        if (iD == 0) {
            return;
        }
        n23.j.p(iD, this.f128463h);
        throw null;
    }

    public e() {
        this.f128417k = false;
    }

    public e(int i14, int i15, int i16) throws GZIPException {
        this.f128417k = false;
        d dVar = new d(this);
        this.f128464i = dVar;
        int iD = dVar.d(i14, i15, i16);
        if (iD == 0) {
            return;
        }
        n23.j.p(iD, this.f128463h);
        throw null;
    }
}
