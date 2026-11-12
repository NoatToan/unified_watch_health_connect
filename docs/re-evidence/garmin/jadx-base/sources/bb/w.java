package bb;

/* JADX INFO: loaded from: classes.dex */
public class w implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f17271a;

    public w(o oVar) {
        this.f17271a = oVar;
    }

    @Override // bb.o
    public final boolean advancePeekPosition(int i14, boolean z14) {
        return this.f17271a.advancePeekPosition(i14, true);
    }

    @Override // bb.o
    public long getLength() {
        return this.f17271a.getLength();
    }

    @Override // bb.o
    public long getPeekPosition() {
        return this.f17271a.getPeekPosition();
    }

    @Override // bb.o
    public long getPosition() {
        return this.f17271a.getPosition();
    }

    @Override // bb.o
    public final int peek(byte[] bArr, int i14, int i15) {
        return this.f17271a.peek(bArr, i14, i15);
    }

    @Override // bb.o
    public final boolean peekFully(byte[] bArr, int i14, int i15, boolean z14) {
        return this.f17271a.peekFully(bArr, i14, i15, z14);
    }

    @Override // androidx.media3.common.j
    public final int read(byte[] bArr, int i14, int i15) {
        return this.f17271a.read(bArr, i14, i15);
    }

    @Override // bb.o
    public final boolean readFully(byte[] bArr, int i14, int i15, boolean z14) {
        return this.f17271a.readFully(bArr, 0, i15, z14);
    }

    @Override // bb.o
    public final void resetPeekPosition() {
        this.f17271a.resetPeekPosition();
    }

    @Override // bb.o
    public final int skip(int i14) {
        return this.f17271a.skip(i14);
    }

    @Override // bb.o
    public final void skipFully(int i14) {
        this.f17271a.skipFully(i14);
    }

    @Override // bb.o
    public final void peekFully(byte[] bArr, int i14, int i15) {
        this.f17271a.peekFully(bArr, i14, i15);
    }

    @Override // bb.o
    public final void advancePeekPosition(int i14) {
        this.f17271a.advancePeekPosition(i14);
    }

    @Override // bb.o
    public final void readFully(byte[] bArr, int i14, int i15) {
        this.f17271a.readFully(bArr, i14, i15);
    }
}
