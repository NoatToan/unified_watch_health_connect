package com.huawei.hms.network.embedded;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class r6 implements Closeable, Flushable {
    public static final int h = 201105;
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8 f15280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l8 f15281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15282c;
    public int d;
    public int e;
    public int f;
    public int g;

    public int z() {
        int i2;
        synchronized (this) {
            i2 = this.e;
        }
        return i2;
    }

    public long y() {
        return this.f15281b.v();
    }

    public boolean x() {
        return this.f15281b.x();
    }

    public void w() throws IOException {
        this.f15281b.w();
    }

    public int v() {
        int i2;
        synchronized (this) {
            i2 = this.f;
        }
        return i2;
    }

    public void u() throws IOException {
        this.f15281b.t();
    }

    public File t() {
        return this.f15281b.u();
    }

    public void s() throws IOException {
        this.f15281b.s();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f15281b.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15281b.close();
    }

    public void b(t7 t7Var) throws IOException {
        this.f15281b.d(a(t7Var.k()));
    }

    public void a(v7 v7Var, v7 v7Var2) {
        l8.d dVarS;
        e eVar = new e(v7Var2);
        try {
            dVarS = ((d) v7Var.s()).f15292b.s();
            if (dVarS != null) {
                try {
                    eVar.a(dVarS);
                    dVarS.c();
                } catch (IOException unused) {
                    a(dVarS);
                }
            }
        } catch (IOException unused2) {
            dVarS = null;
        }
    }

    public void a(k8 k8Var) {
        synchronized (this) {
            this.g++;
            if (k8Var.f15008a != null) {
                this.e++;
            } else if (k8Var.f15009b != null) {
                this.f++;
            }
        }
    }

    @Nullable
    public v7 a(t7 t7Var) {
        try {
            l8.f fVarC = this.f15281b.c(a(t7Var.k()));
            if (fVarC == null) {
                return null;
            }
            try {
                e eVar = new e(fVarC.e(0));
                v7 v7VarA = eVar.a(fVarC);
                if (eVar.a(t7Var, v7VarA)) {
                    return v7VarA;
                }
                f8.a(v7VarA.s());
                return null;
            } catch (IOException unused) {
                f8.a(fVarC);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @Nullable
    public j8 a(v7 v7Var) {
        l8.d dVarB;
        String strH = v7Var.H().h();
        if (j9.a(v7Var.H().h())) {
            try {
                b(v7Var.H());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!strH.equals("GET") || i9.c(v7Var)) {
            return null;
        }
        e eVar = new e(v7Var);
        try {
            dVarB = this.f15281b.b(a(v7Var.H().k()));
            if (dVarB == null) {
                return null;
            }
            try {
                eVar.a(dVarB);
                return new c(dVarB);
            } catch (IOException unused2) {
                a(dVarB);
                return null;
            }
        } catch (IOException unused3) {
            dVarB = null;
        }
    }

    public int F() {
        int i2;
        synchronized (this) {
            i2 = this.f15282c;
        }
        return i2;
    }

    public static final class e {
        public static final String k = ma.f().a() + "-Sent-Millis";
        public static final String l = ma.f().a() + "-Received-Millis";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j7 f15297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f15298c;
        public final r7 d;
        public final int e;
        public final String f;
        public final j7 g;

        @Nullable
        public final i7 h;
        public final long i;
        public final long j;

        public boolean a(t7 t7Var, v7 v7Var) {
            return this.f15296a.equals(t7Var.k().toString()) && this.f15298c.equals(t7Var.h()) && i9.a(v7Var, this.f15297b, t7Var);
        }

        public void a(l8.d dVar) throws IOException {
            cb cbVarA = ob.a(dVar.a(0));
            cbVarA.a(this.f15296a).writeByte(10);
            cbVarA.a(this.f15298c).writeByte(10);
            cbVarA.a(this.f15297b.d()).writeByte(10);
            int iD = this.f15297b.d();
            for (int i = 0; i < iD; i++) {
                cbVarA.a(this.f15297b.a(i)).a(": ").a(this.f15297b.b(i)).writeByte(10);
            }
            cbVarA.a(new o9(this.d, this.e, this.f).toString()).writeByte(10);
            cbVarA.a(this.g.d() + 2).writeByte(10);
            int iD2 = this.g.d();
            for (int i2 = 0; i2 < iD2; i2++) {
                cbVarA.a(this.g.a(i2)).a(": ").a(this.g.b(i2)).writeByte(10);
            }
            cbVarA.a(k).a(": ").a(this.i).writeByte(10);
            cbVarA.a(l).a(": ").a(this.j).writeByte(10);
            if (a()) {
                cbVarA.writeByte(10);
                cbVarA.a(this.h.a().a()).writeByte(10);
                a(cbVarA, this.h.d());
                a(cbVarA, this.h.b());
                cbVarA.a(this.h.f().a()).writeByte(10);
            }
            cbVarA.close();
        }

        public v7 a(l8.f fVar) {
            String strA = this.g.a("Content-Type");
            String strA2 = this.g.a("Content-Length");
            return new v7.a().a(new t7.a().c(this.f15296a).a(this.f15298c, (u7) null).a(this.f15297b).a()).a(this.d).a(this.e).a(this.f).a(this.g).a(new d(fVar, strA, strA2)).a(this.h).b(this.i).a(this.j).a();
        }

        private boolean a() {
            return this.f15296a.startsWith("https://");
        }

        private void a(cb cbVar, List<Certificate> list) throws IOException {
            try {
                cbVar.a(list.size()).writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    cbVar.a(eb.e(list.get(i).getEncoded()).b()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        private List<Certificate> a(db dbVar) throws IOException {
            int iA = r6.a(dbVar);
            if (iA == -1) {
                return Collections.EMPTY_LIST;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iA);
                for (int i = 0; i < iA; i++) {
                    String strN = dbVar.n();
                    bb bbVar = new bb();
                    bbVar.a(eb.a(strN));
                    arrayList.add(certificateFactory.generateCertificate(bbVar.m()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        public e(zb zbVar) throws IOException {
            try {
                db dbVarA = ob.a(zbVar);
                this.f15296a = dbVarA.n();
                this.f15298c = dbVarA.n();
                j7.a aVar = new j7.a();
                int iA = r6.a(dbVarA);
                for (int i = 0; i < iA; i++) {
                    aVar.b(dbVarA.n());
                }
                this.f15297b = aVar.a();
                o9 o9VarA = o9.a(dbVarA.n());
                this.d = o9VarA.f15151a;
                this.e = o9VarA.f15152b;
                this.f = o9VarA.f15153c;
                j7.a aVar2 = new j7.a();
                int iA2 = r6.a(dbVarA);
                for (int i2 = 0; i2 < iA2; i2++) {
                    aVar2.b(dbVarA.n());
                }
                String str = k;
                String strC = aVar2.c(str);
                String str2 = l;
                String strC2 = aVar2.c(str2);
                aVar2.d(str);
                aVar2.d(str2);
                this.i = strC != null ? Long.parseLong(strC) : 0L;
                this.j = strC2 != null ? Long.parseLong(strC2) : 0L;
                this.g = aVar2.a();
                if (a()) {
                    String strN = dbVarA.n();
                    if (strN.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strN + "\"");
                    }
                    this.h = i7.a(!dbVarA.i() ? y7.a(dbVarA.n()) : y7.SSL_3_0, x6.a(dbVarA.n()), a(dbVarA), a(dbVarA));
                } else {
                    this.h = null;
                }
                zbVar.close();
            } catch (Throwable th) {
                zbVar.close();
                throw th;
            }
        }

        public e(v7 v7Var) {
            this.f15296a = v7Var.H().k().toString();
            this.f15297b = i9.e(v7Var);
            this.f15298c = v7Var.H().h();
            this.d = v7Var.F();
            this.e = v7Var.w();
            this.f = v7Var.B();
            this.g = v7Var.y();
            this.h = v7Var.x();
            this.i = v7Var.I();
            this.j = v7Var.G();
        }
    }

    public int E() {
        int i2;
        synchronized (this) {
            i2 = this.d;
        }
        return i2;
    }

    public Iterator<String> D() throws IOException {
        return new b();
    }

    public class a implements n8 {
        @Override // com.huawei.hms.network.embedded.n8
        public void b(t7 t7Var) throws IOException {
            r6.this.b(t7Var);
        }

        @Override // com.huawei.hms.network.embedded.n8
        public void a(v7 v7Var, v7 v7Var2) {
            r6.this.a(v7Var, v7Var2);
        }

        @Override // com.huawei.hms.network.embedded.n8
        public void a(k8 k8Var) {
            r6.this.a(k8Var);
        }

        @Override // com.huawei.hms.network.embedded.n8
        public void a() {
            r6.this.C();
        }

        @Override // com.huawei.hms.network.embedded.n8
        @Nullable
        public v7 a(t7 t7Var) throws IOException {
            return r6.this.a(t7Var);
        }

        @Override // com.huawei.hms.network.embedded.n8
        @Nullable
        public j8 a(v7 v7Var) throws IOException {
            return r6.this.a(v7Var);
        }

        public a() {
        }
    }

    public void C() {
        synchronized (this) {
            this.f++;
        }
    }

    public long B() throws IOException {
        return this.f15281b.A();
    }

    public class b implements Iterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<l8.f> f15284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f15285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15286c;

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f15286c) {
                throw new IllegalStateException("remove() before next()");
            }
            this.f15284a.remove();
        }

        @Override // java.util.Iterator
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f15285b;
            this.f15285b = null;
            this.f15286c = true;
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f15285b != null) {
                return true;
            }
            this.f15286c = false;
            while (this.f15284a.hasNext()) {
                try {
                    l8.f next = this.f15284a.next();
                    try {
                        continue;
                        this.f15285b = ob.a(next.e(0)).n();
                        if (next != null) {
                            next.close();
                        }
                        return true;
                    } catch (Throwable th) {
                        if (next != null) {
                            try {
                                next.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        public b() throws IOException {
            this.f15284a = r6.this.f15281b.B();
        }
    }

    public int A() {
        int i2;
        synchronized (this) {
            i2 = this.g;
        }
        return i2;
    }

    public static class d extends w7 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l8.f f15292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final db f15293c;

        @Nullable
        public final String d;

        @Nullable
        public final String e;

        @Override // com.huawei.hms.network.embedded.w7
        public db x() {
            return this.f15293c;
        }

        public class a extends hb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l8.f f15294b;

            @Override // com.huawei.hms.network.embedded.hb, com.huawei.hms.network.embedded.zb, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, com.huawei.hms.network.embedded.yb
            public void close() throws IOException {
                this.f15294b.close();
                super.close();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zb zbVar, l8.f fVar) {
                super(zbVar);
                this.f15294b = fVar;
            }
        }

        @Override // com.huawei.hms.network.embedded.w7
        public o7 w() {
            String str = this.d;
            if (str != null) {
                return o7.b(str);
            }
            return null;
        }

        @Override // com.huawei.hms.network.embedded.w7
        public long v() {
            try {
                String str = this.e;
                if (str != null) {
                    return Long.parseLong(str);
                }
            } catch (NumberFormatException unused) {
            }
            return -1L;
        }

        public d(l8.f fVar, String str, String str2) {
            this.f15292b = fVar;
            this.d = str;
            this.e = str2;
            this.f15293c = ob.a(new a(fVar.e(1), fVar));
        }
    }

    private void a(@Nullable l8.d dVar) {
        if (dVar != null) {
            try {
                dVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public final class c implements j8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l8.d f15287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public yb f15288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public yb f15289c;
        public boolean d;

        public class a extends gb {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r6 f15290b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l8.d f15291c;

            @Override // com.huawei.hms.network.embedded.gb, com.huawei.hms.network.embedded.yb, java.lang.AutoCloseable, java.nio.channels.Channel
            public void close() throws IOException {
                synchronized (r6.this) {
                    if (c.this.d) {
                        return;
                    }
                    c.this.d = true;
                    r6.this.f15282c++;
                    super.close();
                    this.f15291c.c();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(yb ybVar, r6 r6Var, l8.d dVar) {
                super(ybVar);
                this.f15290b = r6Var;
                this.f15291c = dVar;
            }
        }

        @Override // com.huawei.hms.network.embedded.j8
        public void abort() {
            synchronized (r6.this) {
                if (this.d) {
                    return;
                }
                this.d = true;
                r6.this.d++;
                f8.a(this.f15288b);
                try {
                    this.f15287a.a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.j8
        public yb a() {
            return this.f15289c;
        }

        public c(l8.d dVar) {
            this.f15287a = dVar;
            yb ybVarA = dVar.a(1);
            this.f15288b = ybVarA;
            this.f15289c = new a(ybVarA, r6.this, dVar);
        }
    }

    public static String a(m7 m7Var) {
        return eb.d(m7Var.toString()).f().d();
    }

    public static int a(db dbVar) throws IOException {
        try {
            long jP = dbVar.p();
            String strN = dbVar.n();
            if (jP >= 0 && jP <= 2147483647L && strN.isEmpty()) {
                return (int) jP;
            }
            throw new IOException("expected an int but was \"" + jP + strN + "\"");
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public r6(File file, long j2, ea eaVar) {
        this.f15280a = new a();
        this.f15281b = l8.a(eaVar, file, h, 2, j2);
    }

    public r6(File file, long j2) {
        this(file, j2, ea.f14737a);
    }
}
