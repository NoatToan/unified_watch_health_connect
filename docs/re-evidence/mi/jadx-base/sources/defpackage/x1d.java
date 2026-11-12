package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class x1d extends adm {
    public static final Pattern c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f38573a = bu3.c.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f38574b = bu3.f4607b.newDecoder();

    @Override // defpackage.adm
    public Metadata b(mtf mtfVar, ByteBuffer byteBuffer) {
        String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strC == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = c.matcher(strC);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strE = fk1.e(strGroup);
                strE.hashCode();
                if (strE.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strE.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }

    public final String c(ByteBuffer byteBuffer) {
        try {
            String string = this.f38573a.decode(byteBuffer).toString();
            this.f38573a.reset();
            byteBuffer.rewind();
            return string;
        } catch (CharacterCodingException unused) {
            this.f38573a.reset();
            byteBuffer.rewind();
            try {
                return this.f38574b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f38574b.reset();
                byteBuffer.rewind();
            }
        } catch (Throwable th) {
            this.f38573a.reset();
            byteBuffer.rewind();
            throw th;
        }
    }
}
