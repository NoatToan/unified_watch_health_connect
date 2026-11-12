package xd;

import android.database.Cursor;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.u;
import java.io.IOException;
import java.util.Arrays;
import lc.u0;
import oe2.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;
import vd.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lxd/c;", "Lud/c;", "Lvd/c;", "db", "", "sql", "<init>", "(Lvd/c;Ljava/lang/String;)V", "a", JWKParameterNames.RSA_EXPONENT, "b", "d", "c", "Lxd/c$b;", "Lxd/c$c;", "Lxd/c$d;", "Lxd/c$e;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c implements ud.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f189969d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd.c f189970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f189971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f189972c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxd/c$b;", "Lxd/c;", "Lud/c;", "Lvd/c;", "db", "", "sql", "delegate", "<init>", "(Lvd/c;Ljava/lang/String;Lxd/c;)V", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f189980e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vd.c cVar, String str, c cVar2) {
            super(cVar, str, null);
            cVar.getClass();
            str.getClass();
            cVar2.getClass();
            this.f189980e = cVar2;
        }

        @Override // ud.c
        public final boolean J0() {
            c cVar = this.f189980e;
            boolean zJ0 = cVar.J0();
            boolean zQ = u.q(cVar.M1(0), "wal", true);
            vd.c cVar2 = this.f189970a;
            if (zQ) {
                cVar2.s3();
                return zJ0;
            }
            cVar2.G();
            return zJ0;
        }

        @Override // ud.c
        public final String M1(int i14) {
            return this.f189980e.M1(i14);
        }

        @Override // ud.c
        public final boolean P3() {
            return this.f189980e.P3();
        }

        @Override // java.lang.AutoCloseable
        public final void close() throws Exception {
            this.f189980e.close();
        }

        @Override // ud.c
        public final byte[] getBlob(int i14) {
            return this.f189980e.getBlob(i14);
        }

        @Override // ud.c
        public final int getColumnCount() {
            return this.f189980e.getColumnCount();
        }

        @Override // ud.c
        public final String getColumnName(int i14) {
            return this.f189980e.getColumnName(i14);
        }

        @Override // ud.c
        public final double getDouble(int i14) {
            return this.f189980e.getDouble(i14);
        }

        @Override // ud.c
        public final long getLong(int i14) {
            return this.f189980e.getLong(i14);
        }

        @Override // ud.c
        public final void h(int i14, long j8) {
            this.f189980e.h(i14, j8);
        }

        @Override // ud.c
        public final boolean isNull(int i14) {
            return this.f189980e.isNull(i14);
        }

        @Override // ud.c
        public final void m(double d14, int i14) {
            this.f189980e.m(d14, i14);
        }

        @Override // xd.c, ud.c
        public final void o() {
            this.f189980e.o();
        }

        @Override // ud.c
        public final void q3(int i14, String str) {
            str.getClass();
            this.f189980e.q3(i14, str);
        }

        @Override // xd.c, ud.c
        public final void reset() {
            this.f189980e.reset();
        }

        @Override // ud.c
        public final void t(int i14, byte[] bArr) {
            this.f189980e.t(i14, bArr);
        }

        @Override // ud.c
        public final void u(int i14) {
            this.f189980e.u(i14);
        }
    }

    /* JADX INFO: renamed from: xd.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxd/c$c;", "Lxd/c;", "Lvd/c;", "db", "", "sql", "<init>", "(Lvd/c;Ljava/lang/String;)V", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3538c extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final g f189981e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3538c(vd.c cVar, String str) {
            super(cVar, str, null);
            cVar.getClass();
            str.getClass();
            this.f189981e = cVar.C1(str);
        }

        @Override // ud.c
        public final boolean J0() {
            a();
            this.f189981e.execute();
            return false;
        }

        @Override // ud.c
        public final String M1(int i14) {
            a();
            f.a0(21, "no row");
            throw null;
        }

        @Override // java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f189981e.close();
            this.f189972c = true;
        }

        @Override // ud.c
        public final byte[] getBlob(int i14) {
            a();
            f.a0(21, "no row");
            throw null;
        }

        @Override // ud.c
        public final int getColumnCount() {
            a();
            return 0;
        }

        @Override // ud.c
        public final String getColumnName(int i14) {
            a();
            f.a0(21, "no row");
            throw null;
        }

        @Override // ud.c
        public final double getDouble(int i14) {
            a();
            f.a0(21, "no row");
            throw null;
        }

        @Override // ud.c
        public final long getLong(int i14) {
            a();
            f.a0(21, "no row");
            throw null;
        }

        @Override // ud.c
        public final void h(int i14, long j8) {
            a();
            this.f189981e.h(i14, j8);
        }

        @Override // ud.c
        public final boolean isNull(int i14) {
            a();
            f.a0(21, "no row");
            throw null;
        }

        @Override // ud.c
        public final void m(double d14, int i14) {
            a();
            this.f189981e.m(d14, i14);
        }

        @Override // xd.c, ud.c
        public final void o() {
            a();
            this.f189981e.o();
        }

        @Override // ud.c
        public final void q3(int i14, String str) {
            str.getClass();
            a();
            this.f189981e.r(i14, str);
        }

        @Override // ud.c
        public final void t(int i14, byte[] bArr) {
            a();
            this.f189981e.t(i14, bArr);
        }

        @Override // ud.c
        public final void u(int i14) {
            a();
            this.f189981e.u(i14);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxd/c$e;", "Lxd/c;", "Lvd/c;", "db", "", "sql", "Lxd/c$a$b;", "operation", "<init>", "(Lvd/c;Ljava/lang/String;Lxd/c$a$b;)V", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a.b f189989e;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f189990a;

            static {
                int[] iArr = new int[a.b.values().length];
                try {
                    iArr[a.b.END.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.b.ROLLBACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.b.BEGIN_EXCLUSIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.b.BEGIN_IMMEDIATE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.b.BEGIN_DEFERRED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f189990a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(vd.c cVar, String str, a.b bVar) {
            super(cVar, str, null);
            cVar.getClass();
            str.getClass();
            bVar.getClass();
            this.f189989e = bVar;
        }

        @Override // ud.c
        public final boolean J0() {
            int i14 = a.f189990a[this.f189989e.ordinal()];
            vd.c cVar = this.f189970a;
            if (i14 == 1) {
                cVar.t3();
                cVar.y3();
                return false;
            }
            if (i14 == 2) {
                cVar.y3();
                return false;
            }
            if (i14 == 3) {
                cVar.F();
                return false;
            }
            if (i14 == 4) {
                cVar.g2();
                return false;
            }
            if (i14 == 5) {
                cVar.o0();
                return false;
            }
            u0.r();
            return false;
        }

        @Override // ud.c
        public final String M1(int i14) {
            a();
            f.a0(21, "no row");
            throw null;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.f189972c = true;
        }

        @Override // ud.c
        public final byte[] getBlob(int i14) {
            a();
            f.a0(21, "no row");
            throw null;
        }

        @Override // ud.c
        public final int getColumnCount() {
            a();
            return 0;
        }

        @Override // ud.c
        public final String getColumnName(int i14) {
            a();
            f.a0(21, "no row");
            throw null;
        }

        @Override // ud.c
        public final double getDouble(int i14) {
            a();
            f.a0(21, "no row");
            throw null;
        }

        @Override // ud.c
        public final long getLong(int i14) {
            a();
            f.a0(21, "no row");
            throw null;
        }

        @Override // ud.c
        public final void h(int i14, long j8) {
            a();
            f.a0(25, "column index out of range");
            throw null;
        }

        @Override // ud.c
        public final boolean isNull(int i14) {
            a();
            f.a0(21, "no row");
            throw null;
        }

        @Override // ud.c
        public final void m(double d14, int i14) {
            a();
            f.a0(25, "column index out of range");
            throw null;
        }

        @Override // ud.c
        public final void q3(int i14, String str) {
            str.getClass();
            a();
            f.a0(25, "column index out of range");
            throw null;
        }

        @Override // ud.c
        public final void t(int i14, byte[] bArr) {
            a();
            f.a0(25, "column index out of range");
            throw null;
        }

        @Override // ud.c
        public final void u(int i14) {
            a();
            f.a0(25, "column index out of range");
            throw null;
        }
    }

    private c(vd.c cVar, String str) {
        this.f189970a = cVar;
        this.f189971b = str;
    }

    public final void a() {
        if (this.f189972c) {
            f.a0(21, "statement is closed");
            throw null;
        }
    }

    @Override // ud.c
    public void o() {
        a();
    }

    @Override // ud.c
    public void reset() {
        a();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lxd/c$a;", "", "<init>", "()V", "b", "a", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxd/c$a$b;", "", "<init>", "(Ljava/lang/String;I)V", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum b {
            END,
            ROLLBACK,
            BEGIN_EXCLUSIVE,
            BEGIN_IMMEDIATE,
            BEGIN_DEFERRED
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        /* JADX INFO: renamed from: xd.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lxd/c$a$a;", "", "<init>", "()V", "a", "Lxd/c$a$a$a;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class AbstractC3536a {

            /* JADX INFO: renamed from: xd.c$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxd/c$a$a$a;", "Lxd/c$a$a;", "<init>", "()V", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class C3537a extends AbstractC3536a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C3537a f189973a = new C3537a();

                private C3537a() {
                    super(null);
                }
            }

            public /* synthetic */ AbstractC3536a(j jVar) {
                this();
            }

            private AbstractC3536a() {
            }
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lxd/c$d;", "Lxd/c;", "Lvd/c;", "db", "", "sql", "<init>", "(Lvd/c;Ljava/lang/String;)V", "a", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f189982e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long[] f189983f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public double[] f189984g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String[] f189985h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[][] f189986i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Cursor f189987j;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xd/c$d$b", "Lvd/f;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements vd.f {
            public b() {
            }

            @Override // vd.f
            public final void a(vd.e eVar) {
                d dVar = d.this;
                int length = dVar.f189982e.length;
                for (int i14 = 1; i14 < length; i14++) {
                    int i15 = dVar.f189982e[i14];
                    if (i15 == 1) {
                        eVar.h(i14, dVar.f189983f[i14]);
                    } else if (i15 == 2) {
                        eVar.m(dVar.f189984g[i14], i14);
                    } else if (i15 == 3) {
                        String str = dVar.f189985h[i14];
                        str.getClass();
                        eVar.r(i14, str);
                    } else if (i15 == 4) {
                        byte[] bArr = dVar.f189986i[i14];
                        bArr.getClass();
                        eVar.t(i14, bArr);
                    } else if (i15 == 5) {
                        eVar.u(i14);
                    }
                }
            }

            @Override // vd.f
            /* JADX INFO: renamed from: c */
            public final String getF22412a() {
                return d.this.f189971b;
            }
        }

        static {
            new a(null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(vd.c cVar, String str) {
            super(cVar, str, null);
            cVar.getClass();
            str.getClass();
            this.f189982e = new int[0];
            this.f189983f = new long[0];
            this.f189984g = new double[0];
            this.f189985h = new String[0];
            this.f189986i = new byte[0][];
        }

        public static void f(Cursor cursor, int i14) {
            if (i14 < 0 || i14 >= cursor.getColumnCount()) {
                f.a0(25, "column index out of range");
                throw null;
            }
        }

        @Override // ud.c
        public final boolean J0() {
            a();
            e();
            Cursor cursor = this.f189987j;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            h.z("Required value was null.");
            return false;
        }

        @Override // ud.c
        public final String M1(int i14) {
            a();
            Cursor cursorJ = j();
            f(cursorJ, i14);
            String string = cursorJ.getString(i14);
            string.getClass();
            return string;
        }

        public final void c(int i14, int i15) {
            int i16 = i15 + 1;
            int[] iArr = this.f189982e;
            if (iArr.length < i16) {
                this.f189982e = Arrays.copyOf(iArr, i16);
            }
            if (i14 == 1) {
                long[] jArr = this.f189983f;
                if (jArr.length < i16) {
                    this.f189983f = Arrays.copyOf(jArr, i16);
                    return;
                }
                return;
            }
            if (i14 == 2) {
                double[] dArr = this.f189984g;
                if (dArr.length < i16) {
                    this.f189984g = Arrays.copyOf(dArr, i16);
                    return;
                }
                return;
            }
            if (i14 == 3) {
                String[] strArr = this.f189985h;
                if (strArr.length < i16) {
                    this.f189985h = (String[]) Arrays.copyOf(strArr, i16);
                    return;
                }
                return;
            }
            if (i14 != 4) {
                return;
            }
            byte[][] bArr = this.f189986i;
            if (bArr.length < i16) {
                this.f189986i = (byte[][]) Arrays.copyOf(bArr, i16);
            }
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (!this.f189972c) {
                o();
                reset();
            }
            this.f189972c = true;
        }

        public final void e() {
            if (this.f189987j == null) {
                this.f189987j = this.f189970a.J1(new b());
            }
        }

        @Override // ud.c
        public final byte[] getBlob(int i14) {
            a();
            Cursor cursorJ = j();
            f(cursorJ, i14);
            byte[] blob = cursorJ.getBlob(i14);
            blob.getClass();
            return blob;
        }

        @Override // ud.c
        public final int getColumnCount() {
            a();
            e();
            Cursor cursor = this.f189987j;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // ud.c
        public final String getColumnName(int i14) {
            a();
            e();
            Cursor cursor = this.f189987j;
            if (cursor == null) {
                h.z("Required value was null.");
                return null;
            }
            f(cursor, i14);
            String columnName = cursor.getColumnName(i14);
            columnName.getClass();
            return columnName;
        }

        @Override // ud.c
        public final double getDouble(int i14) {
            a();
            Cursor cursorJ = j();
            f(cursorJ, i14);
            return cursorJ.getDouble(i14);
        }

        @Override // ud.c
        public final long getLong(int i14) {
            a();
            Cursor cursorJ = j();
            f(cursorJ, i14);
            return cursorJ.getLong(i14);
        }

        @Override // ud.c
        public final void h(int i14, long j8) {
            a();
            c(1, i14);
            this.f189982e[i14] = 1;
            this.f189983f[i14] = j8;
        }

        @Override // ud.c
        public final boolean isNull(int i14) {
            a();
            Cursor cursorJ = j();
            f(cursorJ, i14);
            return cursorJ.isNull(i14);
        }

        public final Cursor j() {
            Cursor cursor = this.f189987j;
            if (cursor != null) {
                return cursor;
            }
            f.a0(21, "no row");
            throw null;
        }

        @Override // ud.c
        public final void m(double d14, int i14) {
            a();
            c(2, i14);
            this.f189982e[i14] = 2;
            this.f189984g[i14] = d14;
        }

        @Override // xd.c, ud.c
        public final void o() {
            a();
            this.f189982e = new int[0];
            this.f189983f = new long[0];
            this.f189984g = new double[0];
            this.f189985h = new String[0];
            this.f189986i = new byte[0][];
        }

        @Override // ud.c
        public final void q3(int i14, String str) {
            str.getClass();
            a();
            c(3, i14);
            this.f189982e[i14] = 3;
            this.f189985h[i14] = str;
        }

        @Override // xd.c, ud.c
        public final void reset() {
            a();
            Cursor cursor = this.f189987j;
            if (cursor != null) {
                cursor.close();
            }
            this.f189987j = null;
        }

        @Override // ud.c
        public final void t(int i14, byte[] bArr) {
            a();
            c(4, i14);
            this.f189982e[i14] = 4;
            this.f189986i[i14] = bArr;
        }

        @Override // ud.c
        public final void u(int i14) {
            a();
            c(5, i14);
            this.f189982e[i14] = 5;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxd/c$d$a;", "", "<init>", "()V", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    public /* synthetic */ c(vd.c cVar, String str, j jVar) {
        this(cVar, str);
    }
}
