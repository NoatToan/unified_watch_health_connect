package ka;

import androidx.media3.common.audio.AudioProcessor;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f103702d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Ascii.FS, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, UnsignedBytes.MAX_POWER_OF_TWO, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f103703e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, Ascii.VT, -103, 87, 83, 1, Ascii.DLE, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteBuffer f103704a = AudioProcessor.f8121a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f103706c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f103705b = 2;

    public static void a(ByteBuffer byteBuffer, long j8, int i14, int i15, boolean z14) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z14 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j8);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i14);
        byteBuffer.putInt(0);
        byteBuffer.put(UnsignedBytes.checkedCast(i15));
    }
}
