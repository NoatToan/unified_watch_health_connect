package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: loaded from: classes3.dex */
public class iug implements b1s {
    public static final byte[] c = {63};
    public static final String d = String.valueOf('?');
    public static final char[] e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Charset f22100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22101b;

    public iug(Charset charset, boolean z) {
        this.f22100a = charset;
        this.f22101b = z;
    }

    public final CharsetDecoder a() {
        if (this.f22101b) {
            CharsetDecoder charsetDecoderNewDecoder = this.f22100a.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            return charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).replaceWith(d);
        }
        CharsetDecoder charsetDecoderNewDecoder2 = this.f22100a.newDecoder();
        CodingErrorAction codingErrorAction2 = CodingErrorAction.REPORT;
        return charsetDecoderNewDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2);
    }

    @Override // defpackage.b1s
    public String decode(byte[] bArr) throws IOException {
        return a().decode(ByteBuffer.wrap(bArr)).toString();
    }
}
