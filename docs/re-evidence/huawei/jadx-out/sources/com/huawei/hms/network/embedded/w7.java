package com.huawei.hms.network.embedded;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public abstract class w7 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Reader f15565a;

    public abstract long v();

    @Nullable
    public abstract o7 w();

    public abstract db x();

    public final String y() throws IOException {
        db dbVarX = x();
        try {
            String strA = dbVarX.a(f8.a(dbVarX, z()));
            if (dbVarX != null) {
                dbVarX.close();
            }
            return strA;
        } catch (Throwable th) {
            if (dbVarX != null) {
                try {
                    dbVarX.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final Reader u() {
        Reader reader = this.f15565a;
        if (reader != null) {
            return reader;
        }
        b bVar = new b(x(), z());
        this.f15565a = bVar;
        return bVar;
    }

    public final byte[] t() throws IOException {
        long jV = v();
        if (jV > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jV);
        }
        db dbVarX = x();
        try {
            byte[] bArrQ = dbVarX.q();
            if (dbVarX != null) {
                dbVarX.close();
            }
            if (jV == -1 || jV == bArrQ.length) {
                return bArrQ;
            }
            throw new IOException("Content-Length (" + jV + ") and stream length (" + bArrQ.length + ") disagree");
        } catch (Throwable th) {
            if (dbVarX != null) {
                try {
                    dbVarX.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final InputStream s() {
        return x().m();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        f8.a(x());
    }

    private Charset z() {
        o7 o7VarW = w();
        return o7VarW != null ? o7VarW.a(StandardCharsets.UTF_8) : StandardCharsets.UTF_8;
    }

    public class a extends w7 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o7 f15566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f15567c;
        public final /* synthetic */ db d;

        @Override // com.huawei.hms.network.embedded.w7
        public db x() {
            return this.d;
        }

        @Override // com.huawei.hms.network.embedded.w7
        @Nullable
        public o7 w() {
            return this.f15566b;
        }

        @Override // com.huawei.hms.network.embedded.w7
        public long v() {
            return this.f15567c;
        }

        public a(o7 o7Var, long j, db dbVar) {
            this.f15566b = o7Var;
            this.f15567c = j;
            this.d = dbVar;
        }
    }

    public static w7 a(@Nullable o7 o7Var, byte[] bArr) {
        return a(o7Var, bArr.length, new bb().write(bArr));
    }

    public static final class b extends Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final db f15568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Charset f15569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15570c;

        @Nullable
        public Reader d;

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            if (this.f15570c) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.d;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.f15568a.m(), f8.a(this.f15568a, this.f15569b));
                this.d = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f15570c = true;
            Reader reader = this.d;
            if (reader != null) {
                reader.close();
            } else {
                this.f15568a.close();
            }
        }

        public b(db dbVar, Charset charset) {
            this.f15568a = dbVar;
            this.f15569b = charset;
        }
    }

    public static w7 a(@Nullable o7 o7Var, String str) {
        Charset charsetA = StandardCharsets.UTF_8;
        if (o7Var != null && (charsetA = o7Var.a()) == null) {
            charsetA = StandardCharsets.UTF_8;
            o7Var = o7.b(o7Var + "; charset=utf-8");
        }
        bb bbVarA = new bb().a(str, charsetA);
        return a(o7Var, bbVarA.B(), bbVarA);
    }

    public static w7 a(@Nullable o7 o7Var, eb ebVar) {
        return a(o7Var, ebVar.j(), new bb().a(ebVar));
    }

    public static w7 a(@Nullable o7 o7Var, long j, db dbVar) {
        if (dbVar != null) {
            return new a(o7Var, j, dbVar);
        }
        throw new NullPointerException("source == null");
    }
}
