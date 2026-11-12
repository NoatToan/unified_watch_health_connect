package bb;

/* JADX INFO: loaded from: classes.dex */
public interface o extends androidx.media3.common.j {
    void advancePeekPosition(int i14);

    boolean advancePeekPosition(int i14, boolean z14);

    long getLength();

    long getPeekPosition();

    long getPosition();

    int peek(byte[] bArr, int i14, int i15);

    void peekFully(byte[] bArr, int i14, int i15);

    boolean peekFully(byte[] bArr, int i14, int i15, boolean z14);

    void readFully(byte[] bArr, int i14, int i15);

    boolean readFully(byte[] bArr, int i14, int i15, boolean z14);

    void resetPeekPosition();

    int skip(int i14);

    void skipFully(int i14);
}
