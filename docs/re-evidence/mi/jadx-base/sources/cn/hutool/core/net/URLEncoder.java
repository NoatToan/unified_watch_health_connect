package cn.hutool.core.net;

import defpackage.m7c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.BitSet;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class URLEncoder implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean encodeSpaceAsPlus;
    private final BitSet safeCharacters;
    public static final URLEncoder DEFAULT = createDefault();
    public static final URLEncoder PATH_SEGMENT = createPathSegment();
    public static final URLEncoder QUERY = createQuery();
    public static final URLEncoder ALL = createAll();

    public URLEncoder() {
        this(new BitSet(256));
        for (char c = 'a'; c <= 'z'; c = (char) (c + 1)) {
            addSafeCharacter(c);
        }
        for (char c2 = 'A'; c2 <= 'Z'; c2 = (char) (c2 + 1)) {
            addSafeCharacter(c2);
        }
        for (char c3 = '0'; c3 <= '9'; c3 = (char) (c3 + 1)) {
            addSafeCharacter(c3);
        }
    }

    public static URLEncoder createAll() {
        URLEncoder uRLEncoder = new URLEncoder();
        uRLEncoder.addSafeCharacter('*');
        uRLEncoder.addSafeCharacter('-');
        uRLEncoder.addSafeCharacter('.');
        uRLEncoder.addSafeCharacter('_');
        return uRLEncoder;
    }

    public static URLEncoder createDefault() {
        URLEncoder uRLEncoder = new URLEncoder();
        uRLEncoder.addSafeCharacter('-');
        uRLEncoder.addSafeCharacter('.');
        uRLEncoder.addSafeCharacter('_');
        uRLEncoder.addSafeCharacter('~');
        uRLEncoder.addSafeCharacter('!');
        uRLEncoder.addSafeCharacter(Typography.dollar);
        uRLEncoder.addSafeCharacter(Typography.amp);
        uRLEncoder.addSafeCharacter('\'');
        uRLEncoder.addSafeCharacter('(');
        uRLEncoder.addSafeCharacter(')');
        uRLEncoder.addSafeCharacter('*');
        uRLEncoder.addSafeCharacter('+');
        uRLEncoder.addSafeCharacter(',');
        uRLEncoder.addSafeCharacter(';');
        uRLEncoder.addSafeCharacter('=');
        uRLEncoder.addSafeCharacter(AbstractJsonLexerKt.COLON);
        uRLEncoder.addSafeCharacter('@');
        uRLEncoder.addSafeCharacter('/');
        return uRLEncoder;
    }

    public static URLEncoder createPathSegment() {
        URLEncoder uRLEncoder = new URLEncoder();
        uRLEncoder.addSafeCharacter('-');
        uRLEncoder.addSafeCharacter('.');
        uRLEncoder.addSafeCharacter('_');
        uRLEncoder.addSafeCharacter('~');
        uRLEncoder.addSafeCharacter('!');
        uRLEncoder.addSafeCharacter(Typography.dollar);
        uRLEncoder.addSafeCharacter(Typography.amp);
        uRLEncoder.addSafeCharacter('\'');
        uRLEncoder.addSafeCharacter('(');
        uRLEncoder.addSafeCharacter(')');
        uRLEncoder.addSafeCharacter('*');
        uRLEncoder.addSafeCharacter('+');
        uRLEncoder.addSafeCharacter(',');
        uRLEncoder.addSafeCharacter(';');
        uRLEncoder.addSafeCharacter('=');
        uRLEncoder.addSafeCharacter('@');
        return uRLEncoder;
    }

    public static URLEncoder createQuery() {
        URLEncoder uRLEncoder = new URLEncoder();
        uRLEncoder.setEncodeSpaceAsPlus(true);
        uRLEncoder.addSafeCharacter('*');
        uRLEncoder.addSafeCharacter('-');
        uRLEncoder.addSafeCharacter('.');
        uRLEncoder.addSafeCharacter('_');
        uRLEncoder.addSafeCharacter('=');
        uRLEncoder.addSafeCharacter(Typography.amp);
        return uRLEncoder;
    }

    public void addSafeCharacter(char c) {
        this.safeCharacters.set(c);
    }

    public String encode(String str, Charset charset) {
        StringBuilder sb = new StringBuilder(str.length());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, charset);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (this.safeCharacters.get(cCharAt)) {
                sb.append(cCharAt);
            } else if (this.encodeSpaceAsPlus && cCharAt == ' ') {
                sb.append('+');
            } else {
                try {
                    outputStreamWriter.write(cCharAt);
                    outputStreamWriter.flush();
                    for (byte b2 : byteArrayOutputStream.toByteArray()) {
                        sb.append('%');
                        m7c.a(sb, b2, false);
                    }
                    byteArrayOutputStream.reset();
                } catch (IOException unused) {
                    byteArrayOutputStream.reset();
                }
            }
        }
        return sb.toString();
    }

    public void removeSafeCharacter(char c) {
        this.safeCharacters.clear(c);
    }

    public void setEncodeSpaceAsPlus(boolean z) {
        this.encodeSpaceAsPlus = z;
    }

    private URLEncoder(BitSet bitSet) {
        this.encodeSpaceAsPlus = false;
        this.safeCharacters = bitSet;
    }
}
