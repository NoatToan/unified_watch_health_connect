package com.airbnb.lottie.parser.moshi;

import defpackage.aud;
import defpackage.csd;
import defpackage.gsd;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public abstract class JsonReader implements Closeable {
    public static final String[] g = new String[128];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f5704b = new int[32];
    public String[] c = new String[32];
    public int[] d = new int[32];
    public boolean e;
    public boolean f;

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f5705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Options f5706b;

        public a(String[] strArr, Options options) {
            this.f5705a = strArr;
            this.f5706b = options;
        }

        public static a a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i = 0; i < strArr.length; i++) {
                    JsonReader.y(buffer, strArr[i]);
                    buffer.readByte();
                    byteStringArr[i] = buffer.readByteString();
                }
                return new a((String[]) strArr.clone(), Options.of(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            g[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static JsonReader m(BufferedSource bufferedSource) {
        return new com.airbnb.lottie.parser.moshi.a(bufferedSource);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void y(BufferedSink bufferedSink, String str) throws IOException {
        String str2;
        String[] strArr = g;
        bufferedSink.writeByte(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        bufferedSink.writeUtf8(str, i, i2);
                    }
                    bufferedSink.writeUtf8(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    bufferedSink.writeUtf8(str, i, i2);
                }
                bufferedSink.writeUtf8(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            bufferedSink.writeUtf8(str, i, length);
        }
        bufferedSink.writeByte(34);
    }

    public final gsd D(String str) throws gsd {
        throw new gsd(str + " at path " + getPath());
    }

    public abstract void b() throws IOException;

    public abstract void beginObject() throws IOException;

    public abstract void c() throws IOException;

    public abstract boolean d() throws IOException;

    public abstract void endObject() throws IOException;

    public final String getPath() {
        return aud.a(this.f5703a, this.f5704b, this.c, this.d);
    }

    public abstract boolean l() throws IOException;

    public abstract Token n() throws IOException;

    public abstract double nextDouble() throws IOException;

    public abstract int nextInt() throws IOException;

    public abstract String nextName() throws IOException;

    public abstract String nextString() throws IOException;

    public final void o(int i) {
        int i2 = this.f5703a;
        int[] iArr = this.f5704b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new csd("Nesting too deep at " + getPath());
            }
            this.f5704b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.c;
            this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.d;
            this.d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f5704b;
        int i3 = this.f5703a;
        this.f5703a = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int p(a aVar) throws IOException;

    public abstract void s() throws IOException;

    public abstract void skipValue() throws IOException;
}
