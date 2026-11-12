package bb;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.j f17189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17191d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17194g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f17192e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f17188a = new byte[4096];

    static {
        androidx.media3.common.u.a("media3.extractor");
    }

    public i(androidx.media3.common.j jVar, long j8, long j14) {
        this.f17189b = jVar;
        this.f17191d = j8;
        this.f17190c = j14;
    }

    @Override // bb.o
    public final boolean advancePeekPosition(int i14, boolean z14) throws EOFException, InterruptedIOException {
        c(i14);
        int iD = this.f17194g - this.f17193f;
        while (iD < i14) {
            int i15 = i14;
            boolean z15 = z14;
            iD = d(this.f17192e, this.f17193f, i15, iD, z15);
            if (iD == -1) {
                return false;
            }
            this.f17194g = this.f17193f + iD;
            i14 = i15;
            z14 = z15;
        }
        this.f17193f += i14;
        return true;
    }

    public final void c(int i14) {
        int i15 = this.f17193f + i14;
        byte[] bArr = this.f17192e;
        if (i15 > bArr.length) {
            this.f17192e = Arrays.copyOf(this.f17192e, fa.z.i(bArr.length * 2, 65536 + i15, i15 + 524288));
        }
    }

    public final int d(byte[] bArr, int i14, int i15, int i16, boolean z14) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i17 = this.f17189b.read(bArr, i14 + i16, i15 - i16);
        if (i17 != -1) {
            return i16 + i17;
        }
        if (i16 == 0 && z14) {
            return -1;
        }
        vb.h.m();
        return 0;
    }

    public final void e(int i14) {
        int i15 = this.f17194g - i14;
        this.f17194g = i15;
        this.f17193f = 0;
        byte[] bArr = this.f17192e;
        byte[] bArr2 = i15 < bArr.length - 524288 ? new byte[65536 + i15] : bArr;
        System.arraycopy(bArr, i14, bArr2, 0, i15);
        this.f17192e = bArr2;
    }

    @Override // bb.o
    public final long getLength() {
        return this.f17190c;
    }

    @Override // bb.o
    public final long getPeekPosition() {
        return this.f17191d + ((long) this.f17193f);
    }

    @Override // bb.o
    public final long getPosition() {
        return this.f17191d;
    }

    @Override // bb.o
    public final int peek(byte[] bArr, int i14, int i15) throws EOFException, InterruptedIOException {
        i iVar;
        int iMin;
        c(i15);
        int i16 = this.f17194g;
        int i17 = this.f17193f;
        int i18 = i16 - i17;
        if (i18 == 0) {
            iVar = this;
            iMin = iVar.d(this.f17192e, i17, i15, 0, true);
            if (iMin == -1) {
                return -1;
            }
            iVar.f17194g += iMin;
        } else {
            iVar = this;
            iMin = Math.min(i15, i18);
        }
        System.arraycopy(iVar.f17192e, iVar.f17193f, bArr, i14, iMin);
        iVar.f17193f += iMin;
        return iMin;
    }

    @Override // bb.o
    public final boolean peekFully(byte[] bArr, int i14, int i15, boolean z14) {
        if (!advancePeekPosition(i15, z14)) {
            return false;
        }
        System.arraycopy(this.f17192e, this.f17193f - i15, bArr, i14, i15);
        return true;
    }

    @Override // androidx.media3.common.j
    public final int read(byte[] bArr, int i14, int i15) throws EOFException, InterruptedIOException {
        i iVar;
        int i16 = this.f17194g;
        int iD = 0;
        if (i16 != 0) {
            int iMin = Math.min(i16, i15);
            System.arraycopy(this.f17192e, 0, bArr, i14, iMin);
            e(iMin);
            iD = iMin;
        }
        if (iD == 0) {
            iVar = this;
            iD = iVar.d(bArr, i14, i15, 0, true);
        } else {
            iVar = this;
        }
        if (iD != -1) {
            iVar.f17191d += (long) iD;
        }
        return iD;
    }

    @Override // bb.o
    public final boolean readFully(byte[] bArr, int i14, int i15, boolean z14) throws EOFException, InterruptedIOException {
        int iMin;
        int i16 = this.f17194g;
        if (i16 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i16, i15);
            System.arraycopy(this.f17192e, 0, bArr, i14, iMin);
            e(iMin);
        }
        int iD = iMin;
        while (iD < i15 && iD != -1) {
            iD = d(bArr, i14, i15, iD, z14);
        }
        if (iD != -1) {
            this.f17191d += (long) iD;
        }
        return iD != -1;
    }

    @Override // bb.o
    public final void resetPeekPosition() {
        this.f17193f = 0;
    }

    @Override // bb.o
    public final int skip(int i14) throws EOFException, InterruptedIOException {
        i iVar;
        int iMin = Math.min(this.f17194g, i14);
        e(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f17188a;
            iVar = this;
            iMin = iVar.d(bArr, 0, Math.min(i14, bArr.length), 0, true);
        } else {
            iVar = this;
        }
        if (iMin != -1) {
            iVar.f17191d += (long) iMin;
        }
        return iMin;
    }

    @Override // bb.o
    public final void skipFully(int i14) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f17194g, i14);
        e(iMin);
        int iD = iMin;
        while (iD < i14 && iD != -1) {
            byte[] bArr = this.f17188a;
            iD = d(bArr, -iD, Math.min(i14, bArr.length + iD), iD, false);
        }
        if (iD != -1) {
            this.f17191d += (long) iD;
        }
    }

    @Override // bb.o
    public final void peekFully(byte[] bArr, int i14, int i15) {
        peekFully(bArr, i14, i15, false);
    }

    @Override // bb.o
    public final void advancePeekPosition(int i14) throws EOFException, InterruptedIOException {
        advancePeekPosition(i14, false);
    }

    @Override // bb.o
    public final void readFully(byte[] bArr, int i14, int i15) throws EOFException, InterruptedIOException {
        readFully(bArr, i14, i15, false);
    }
}
