package defpackage;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class ll5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ObjectReader[] f25192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MatchStrength f25193b;
    public final MatchStrength c;
    public final int d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f25194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f25195b;
        public final int c;
        public final int d;
        public final ObjectReader e;
        public final MatchStrength f;

        public b(InputStream inputStream, byte[] bArr, int i, int i2, ObjectReader objectReader, MatchStrength matchStrength) {
            this.f25194a = inputStream;
            this.f25195b = bArr;
            this.c = i;
            this.d = i2;
            this.e = objectReader;
            this.f = matchStrength;
        }

        public JsonParser a() throws IOException {
            ObjectReader objectReader = this.e;
            if (objectReader == null) {
                return null;
            }
            JsonFactory factory = objectReader.getFactory();
            return this.f25194a == null ? factory.createParser(this.f25195b, this.c, this.d) : factory.createParser(b());
        }

        public InputStream b() {
            return this.f25194a == null ? new ByteArrayInputStream(this.f25195b, this.c, this.d) : new vqf(null, this.f25194a, this.f25195b, this.c, this.d);
        }

        public ObjectReader c() {
            return this.e;
        }

        public boolean d() {
            return this.e != null;
        }
    }

    public ll5(ObjectReader... objectReaderArr) {
        this(objectReaderArr, MatchStrength.SOLID_MATCH, MatchStrength.WEAK_MATCH, 64);
    }

    public final b a(a aVar) throws IOException {
        ObjectReader objectReader = null;
        MatchStrength matchStrength = null;
        for (ObjectReader objectReader2 : this.f25192a) {
            aVar.b();
            MatchStrength matchStrengthHasFormat = objectReader2.getFactory().hasFormat(aVar);
            if (matchStrengthHasFormat != null && matchStrengthHasFormat.ordinal() >= this.c.ordinal() && (objectReader == null || matchStrength.ordinal() < matchStrengthHasFormat.ordinal())) {
                if (matchStrengthHasFormat.ordinal() >= this.f25193b.ordinal()) {
                    objectReader = objectReader2;
                    matchStrength = matchStrengthHasFormat;
                    break;
                }
                objectReader = objectReader2;
                matchStrength = matchStrengthHasFormat;
            }
        }
        return aVar.c(objectReader, matchStrength);
    }

    public b b(InputStream inputStream) throws IOException {
        return a(new a(inputStream, new byte[this.d]));
    }

    public b c(byte[] bArr, int i, int i2) throws IOException {
        return a(new a(bArr, i, i2));
    }

    public ll5 d(DeserializationConfig deserializationConfig) {
        int length = this.f25192a.length;
        ObjectReader[] objectReaderArr = new ObjectReader[length];
        for (int i = 0; i < length; i++) {
            objectReaderArr[i] = this.f25192a[i].with(deserializationConfig);
        }
        return new ll5(objectReaderArr, this.f25193b, this.c, this.d);
    }

    public ll5 e(JavaType javaType) {
        int length = this.f25192a.length;
        ObjectReader[] objectReaderArr = new ObjectReader[length];
        for (int i = 0; i < length; i++) {
            objectReaderArr[i] = this.f25192a[i].forType(javaType);
        }
        return new ll5(objectReaderArr, this.f25193b, this.c, this.d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        ObjectReader[] objectReaderArr = this.f25192a;
        int length = objectReaderArr.length;
        if (length > 0) {
            sb.append(objectReaderArr[0].getFactory().getFormatName());
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(this.f25192a[i].getFactory().getFormatName());
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public class a extends rad.a {
        public a(InputStream inputStream, byte[] bArr) {
            super(inputStream, bArr);
        }

        public b c(ObjectReader objectReader, MatchStrength matchStrength) {
            InputStream inputStream = this.f32353a;
            byte[] bArr = this.f32354b;
            int i = this.c;
            return new b(inputStream, bArr, i, this.d - i, objectReader, matchStrength);
        }

        public a(byte[] bArr, int i, int i2) {
            super(bArr, i, i2);
        }
    }

    public ll5(ObjectReader[] objectReaderArr, MatchStrength matchStrength, MatchStrength matchStrength2, int i) {
        this.f25192a = objectReaderArr;
        this.f25193b = matchStrength;
        this.c = matchStrength2;
        this.d = i;
    }
}
