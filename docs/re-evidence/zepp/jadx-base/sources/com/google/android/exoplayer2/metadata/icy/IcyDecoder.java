package com.google.android.exoplayer2.metadata.icy;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class IcyDecoder extends SimpleMetadataDecoder {
    private static final Pattern c = Pattern.compile("(.+?)='(.*?)';", 32);
    private static final String d = "streamtitle";
    private static final String e = "streamurl";
    private final CharsetDecoder a = Charsets.UTF_8.newDecoder();
    private final CharsetDecoder b = Charsets.ISO_8859_1.newDecoder();

    @Nullable
    private String a(ByteBuffer data) {
        try {
            String string = this.a.decode(data).toString();
            this.a.reset();
            data.rewind();
            return string;
        } catch (CharacterCodingException unused) {
            this.a.reset();
            data.rewind();
            try {
                return this.b.decode(data).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.b.reset();
                data.rewind();
            }
        } catch (Throwable th) {
            this.a.reset();
            data.rewind();
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    public Metadata decode(MetadataInputBuffer inputBuffer, ByteBuffer buffer) {
        String strA = a(buffer);
        byte[] bArr = new byte[buffer.limit()];
        buffer.get(bArr);
        String str = null;
        if (strA == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = c.matcher(strA);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String lowerCase = Ascii.toLowerCase(strGroup);
                lowerCase.hashCode();
                if (lowerCase.equals(e)) {
                    str2 = strGroup2;
                } else if (lowerCase.equals(d)) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }
}
