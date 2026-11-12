package defpackage;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.databind.JavaType;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes21.dex */
public class zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f54325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final yo[] f54326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final MatchStrength f54327c;
    protected final MatchStrength d;

    private zn(yo[] yoVarArr, MatchStrength matchStrength, MatchStrength matchStrength2, int i) {
        this.f54326b = yoVarArr;
        this.d = matchStrength;
        this.f54327c = matchStrength2;
        this.f54325a = i;
    }

    public zn a(JavaType javaType) {
        int length = this.f54326b.length;
        yo[] yoVarArr = new yo[length];
        for (int i = 0; i < length; i++) {
            yoVarArr[i] = this.f54326b[i].a(javaType);
        }
        return new zn(yoVarArr, this.d, this.f54327c, this.f54325a);
    }

    public c c(byte[] bArr, int i, int i2) throws IOException {
        return c(new d(bArr, i, i2));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        yo[] yoVarArr = this.f54326b;
        int length = yoVarArr.length;
        if (length > 0) {
            sb.append(yoVarArr[0].getFactory().getFormatName());
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(this.f54326b[i].getFactory().getFormatName());
            }
        }
        sb.append(']');
        return sb.toString();
    }

    private c c(d dVar) throws IOException {
        yo yoVar = null;
        MatchStrength matchStrength = null;
        for (yo yoVar2 : this.f54326b) {
            dVar.reset();
            MatchStrength matchStrengthA = yoVar2.getFactory().a(dVar);
            if (matchStrengthA != null && matchStrengthA.ordinal() >= this.f54327c.ordinal() && (yoVar == null || matchStrength.ordinal() < matchStrengthA.ordinal())) {
                if (matchStrengthA.ordinal() >= this.d.ordinal()) {
                    yoVar = yoVar2;
                    matchStrength = matchStrengthA;
                    break;
                }
                yoVar = yoVar2;
                matchStrength = matchStrengthA;
            }
        }
        return dVar.b(yoVar, matchStrength);
    }

    protected static class d extends InputAccessor.b {
        public d(byte[] bArr, int i, int i2) {
            super(bArr, i, i2);
        }

        public c b(yo yoVar, MatchStrength matchStrength) {
            return new c(this.f4079b, this.e, this.f4078a, this.d - this.f4078a, yoVar, matchStrength);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final int f54328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final int f54329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final byte[] f54330c;
        protected final MatchStrength d;
        protected final yo e;
        protected final InputStream i;

        protected c(InputStream inputStream, byte[] bArr, int i, int i2, yo yoVar, MatchStrength matchStrength) {
            this.i = inputStream;
            this.f54330c = bArr;
            this.f54329b = i;
            this.f54328a = i2;
            this.e = yoVar;
            this.d = matchStrength;
        }

        public boolean a() {
            return this.e != null;
        }

        public yo d() {
            return this.e;
        }

        public JsonParser c() throws IOException {
            yo yoVar = this.e;
            if (yoVar == null) {
                return null;
            }
            JsonFactory factory = yoVar.getFactory();
            if (this.i == null) {
                return factory.createParser(this.f54330c, this.f54329b, this.f54328a);
            }
            return factory.createParser(b());
        }

        public InputStream b() {
            if (this.i == null) {
                return new ByteArrayInputStream(this.f54330c, this.f54329b, this.f54328a);
            }
            return new xe(null, this.i, this.f54330c, this.f54329b, this.f54328a);
        }
    }
}
