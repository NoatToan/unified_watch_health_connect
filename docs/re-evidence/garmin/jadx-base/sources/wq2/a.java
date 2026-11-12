package wq2;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import hb2.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwq2/a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f186629a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f186630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f186631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f186632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f186633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f186634f;

    static {
        byte b14 = (byte) 128;
        byte b15 = (byte) 202;
        byte b16 = (byte) 0;
        f186630b = new byte[]{b14, b15, (byte) 159, (byte) 127, b16};
        f186631c = new byte[]{b16, (byte) 164, (byte) 4, b16};
        byte b17 = (byte) 1;
        f186632d = new byte[]{b14, (byte) PsExtractor.VIDEO_STREAM_MASK, b17, b17};
        f186633e = new byte[]{b14, b15};
        f186634f = new byte[]{b16};
    }

    private a() {
    }

    public static byte[] a(byte b14, byte b15) {
        byte[] bArr = f186633e;
        int length = bArr.length + 2;
        byte[] bArr2 = f186634f;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(length + bArr2.length).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.put(b14);
        byteBufferOrder.put(b15);
        byteBufferOrder.put(bArr2);
        byte[] bArrArray = byteBufferOrder.array();
        bArrArray.getClass();
        return bArrArray;
    }

    public static final byte[] b(byte[] bArr) {
        bArr.getClass();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(bArr.length + 5).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put(f186631c);
        byteBufferOrder.put((byte) bArr.length);
        byteBufferOrder.put(bArr);
        byte[] bArrArray = byteBufferOrder.array();
        bArrArray.getClass();
        return bArrArray;
    }

    public static final byte[] c(String str) {
        str.getClass();
        byte[] bArrA = d.a(str);
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(bArrA.length + 7).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put(f186632d);
        byteBufferOrder.put((byte) (bArrA.length + 2));
        byteBufferOrder.put((byte) 79);
        byteBufferOrder.put((byte) bArrA.length);
        byteBufferOrder.put(bArrA);
        byte[] bArrArray = byteBufferOrder.array();
        bArrArray.getClass();
        return bArrArray;
    }
}
