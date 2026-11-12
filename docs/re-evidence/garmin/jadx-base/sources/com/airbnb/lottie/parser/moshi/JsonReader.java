package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import w63.e;
import w63.f;
import w63.g;
import w63.h;
import w63.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class JsonReader implements Closeable {
    private static final String[] REPLACEMENT_CHARS = new String[128];
    boolean failOnUnknown;
    boolean lenient;
    int stackSize;
    int[] scopes = new int[32];
    String[] pathNames = new String[32];
    int[] pathIndices = new int[32];

    public static final class Options {
        final w doubleQuoteSuffix;
        final String[] strings;

        private Options(String[] strArr, w wVar) {
            this.strings = strArr;
            this.doubleQuoteSuffix = wVar;
        }

        public static Options of(String... strArr) {
            try {
                h[] hVarArr = new h[strArr.length];
                e eVar = new e();
                for (int i14 = 0; i14 < strArr.length; i14++) {
                    JsonReader.string(eVar, strArr[i14]);
                    eVar.readByte();
                    hVarArr[i14] = eVar.h0(eVar.f183349b);
                }
                String[] strArr2 = (String[]) strArr.clone();
                w.f183403d.getClass();
                return new Options(strArr2, w.a.b(hVarArr));
            } catch (IOException e4) {
                vb.h.q(e4);
                return null;
            }
        }
    }

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

    static {
        for (int i14 = 0; i14 <= 31; i14++) {
            REPLACEMENT_CHARS[i14] = String.format("\\u%04x", Integer.valueOf(i14));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static JsonReader of(g gVar) {
        return new JsonUtf8Reader(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void string(f fVar, String str) {
        String str2;
        String[] strArr = REPLACEMENT_CHARS;
        fVar.writeByte(34);
        int length = str.length();
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i14 < i15) {
                        fVar.d4(i14, i15, str);
                    }
                    fVar.h1(str2);
                    i14 = i15 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i14 < i15) {
                    fVar.d4(i14, i15, str);
                }
                fVar.h1(str2);
                i14 = i15 + 1;
            }
        }
        if (i14 < length) {
            fVar.d4(i14, length, str);
        }
        fVar.writeByte(34);
    }

    public abstract void beginArray();

    public abstract void beginObject();

    public abstract void endArray();

    public abstract void endObject();

    public final String getPath() {
        return JsonScope.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
    }

    public abstract boolean hasNext();

    public abstract boolean nextBoolean();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract String nextName();

    public abstract String nextString();

    public abstract Token peek();

    public final void pushScope(int i14) {
        int i15 = this.stackSize;
        int[] iArr = this.scopes;
        if (i15 == iArr.length) {
            if (i15 == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.pathNames;
            this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.pathIndices;
            this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.scopes;
        int i16 = this.stackSize;
        this.stackSize = i16 + 1;
        iArr3[i16] = i14;
    }

    public abstract int selectName(Options options);

    public abstract void skipName();

    public abstract void skipValue();

    public final JsonEncodingException syntaxError(String str) throws JsonEncodingException {
        StringBuilder sbI = sn.a.i(str, " at path ");
        sbI.append(getPath());
        throw new JsonEncodingException(sbI.toString());
    }
}
