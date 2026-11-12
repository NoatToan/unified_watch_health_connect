package ld;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import e23.l;
import java.util.Arrays;
import l3.p1;
import l72.b1;
import o13.e;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.i0;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import vb.h;
import vd.f;
import vd.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\b\t\nB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lld/b;", "Lvd/d;", "Landroidx/room/d;", "delegate", "Lld/a;", "autoCloser", "<init>", "(Lvd/d;Lld/a;)V", "a", "c", "b", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements vd.d, androidx.room.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd.d f112002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ld.a f112003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f112004c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lld/b$a;", "Lvd/c;", "Lld/a;", "autoCloser", "<init>", "(Lld/a;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements vd.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ld.a f112005a;

        /* JADX INFO: renamed from: ld.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class C2147a extends q implements l<vd.c, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2147a f112006a = new C2147a();

            public C2147a() {
                super(1, vd.c.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // e23.l
            public final Boolean invoke(vd.c cVar) {
                vd.c cVar2 = cVar;
                cVar2.getClass();
                return Boolean.valueOf(cVar2.D());
            }
        }

        public a(ld.a aVar) {
            aVar.getClass();
            this.f112005a = aVar;
        }

        @Override // vd.c
        public final g C1(String str) {
            str.getClass();
            return new C2149b(str, this.f112005a);
        }

        @Override // vd.c
        public final boolean D() {
            ld.a aVar = this.f112005a;
            if (aVar.f111997i == null) {
                return false;
            }
            return ((Boolean) aVar.b(C2147a.f112006a)).booleanValue();
        }

        @Override // vd.c
        public final void F() {
            ld.a aVar = this.f112005a;
            try {
                aVar.c().F();
            } catch (Throwable th3) {
                aVar.a();
                throw th3;
            }
        }

        @Override // vd.c
        public final void G() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // vd.c
        public final Cursor I(f fVar, CancellationSignal cancellationSignal) {
            ld.a aVar = this.f112005a;
            try {
                return new c(aVar.c().I(fVar, cancellationSignal), aVar);
            } catch (Throwable th3) {
                aVar.a();
                throw th3;
            }
        }

        @Override // vd.c
        public final void I1(Object[] objArr) {
            ld.a aVar = this.f112005a;
            try {
                vd.c cVarC = aVar.c();
                cVarC.getClass();
                cVarC.I1(objArr);
                Unit unit = Unit.INSTANCE;
            } finally {
                aVar.a();
            }
        }

        @Override // vd.c
        public final Cursor J1(f fVar) {
            ld.a aVar = this.f112005a;
            try {
                return new c(aVar.c().J1(fVar), aVar);
            } catch (Throwable th3) {
                aVar.a();
                throw th3;
            }
        }

        @Override // vd.c
        public final Cursor X3(String str) {
            ld.a aVar = this.f112005a;
            try {
                return new c(aVar.c().X3(str), aVar);
            } catch (Throwable th3) {
                aVar.a();
                throw th3;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            ld.a aVar = this.f112005a;
            synchronized (aVar.f111993e) {
                try {
                    aVar.f111998j = true;
                    c2 c2Var = aVar.f111999k;
                    if (c2Var != null) {
                        c2Var.c(null);
                    }
                    aVar.f111999k = null;
                    vd.c cVar = aVar.f111997i;
                    if (cVar != null) {
                        cVar.close();
                    }
                    aVar.f111997i = null;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // vd.c
        public final void g2() {
            ld.a aVar = this.f112005a;
            try {
                aVar.c().g2();
            } catch (Throwable th3) {
                aVar.a();
                throw th3;
            }
        }

        @Override // vd.c
        public final boolean isOpen() {
            return !this.f112005a.f111998j;
        }

        @Override // vd.c
        public final boolean j4() {
            return ((Boolean) this.f112005a.b(new i0() { // from class: ld.b.a.b
                @Override // p005kotlin.jvm.internal.i0, k23.n
                public final Object get(Object obj) {
                    return Boolean.valueOf(((vd.c) obj).j4());
                }
            })).booleanValue();
        }

        @Override // vd.c
        public final void k3(String str) {
            ld.a aVar = this.f112005a;
            try {
                vd.c cVarC = aVar.c();
                cVarC.getClass();
                cVarC.k3(str);
                Unit unit = Unit.INSTANCE;
            } finally {
                aVar.a();
            }
        }

        @Override // vd.c
        public final boolean s3() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // vd.c
        public final int s4(ContentValues contentValues, Object[] objArr) {
            ld.a aVar = this.f112005a;
            try {
                vd.c cVarC = aVar.c();
                cVarC.getClass();
                return cVarC.s4(contentValues, objArr);
            } finally {
                aVar.a();
            }
        }

        @Override // vd.c
        public final void t3() {
            vd.c cVar = this.f112005a.f111997i;
            cVar.getClass();
            cVar.t3();
        }

        @Override // vd.c
        public final long v3(ContentValues contentValues) {
            ld.a aVar = this.f112005a;
            try {
                vd.c cVarC = aVar.c();
                cVarC.getClass();
                return cVarC.v3(contentValues);
            } finally {
                aVar.a();
            }
        }

        @Override // vd.c
        public final void y3() {
            ld.a aVar = this.f112005a;
            try {
                vd.c cVar = aVar.f111997i;
                cVar.getClass();
                cVar.y3();
            } finally {
                aVar.a();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lld/b$c;", "Landroid/database/Cursor;", "delegate", "Lld/a;", "autoCloser", "<init>", "(Landroid/database/Cursor;Lld/a;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Cursor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Cursor f112016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ld.a f112017b;

        public c(Cursor cursor, ld.a aVar) {
            cursor.getClass();
            aVar.getClass();
            this.f112016a = cursor;
            this.f112017b = aVar;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f112016a.close();
            this.f112017b.a();
        }

        @Override // android.database.Cursor
        public final void copyStringToBuffer(int i14, CharArrayBuffer charArrayBuffer) {
            this.f112016a.copyStringToBuffer(i14, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @e
        public final void deactivate() {
            this.f112016a.deactivate();
        }

        @Override // android.database.Cursor
        public final byte[] getBlob(int i14) {
            return this.f112016a.getBlob(i14);
        }

        @Override // android.database.Cursor
        public final int getColumnCount() {
            return this.f112016a.getColumnCount();
        }

        @Override // android.database.Cursor
        public final int getColumnIndex(String str) {
            return this.f112016a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public final int getColumnIndexOrThrow(String str) {
            return this.f112016a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public final String getColumnName(int i14) {
            return this.f112016a.getColumnName(i14);
        }

        @Override // android.database.Cursor
        public final String[] getColumnNames() {
            return this.f112016a.getColumnNames();
        }

        @Override // android.database.Cursor
        public final int getCount() {
            return this.f112016a.getCount();
        }

        @Override // android.database.Cursor
        public final double getDouble(int i14) {
            return this.f112016a.getDouble(i14);
        }

        @Override // android.database.Cursor
        public final Bundle getExtras() {
            return this.f112016a.getExtras();
        }

        @Override // android.database.Cursor
        public final float getFloat(int i14) {
            return this.f112016a.getFloat(i14);
        }

        @Override // android.database.Cursor
        public final int getInt(int i14) {
            return this.f112016a.getInt(i14);
        }

        @Override // android.database.Cursor
        public final long getLong(int i14) {
            return this.f112016a.getLong(i14);
        }

        @Override // android.database.Cursor
        public final Uri getNotificationUri() {
            return this.f112016a.getNotificationUri();
        }

        @Override // android.database.Cursor
        public final int getPosition() {
            return this.f112016a.getPosition();
        }

        @Override // android.database.Cursor
        public final short getShort(int i14) {
            return this.f112016a.getShort(i14);
        }

        @Override // android.database.Cursor
        public final String getString(int i14) {
            return this.f112016a.getString(i14);
        }

        @Override // android.database.Cursor
        public final int getType(int i14) {
            return this.f112016a.getType(i14);
        }

        @Override // android.database.Cursor
        public final boolean getWantsAllOnMoveCalls() {
            return this.f112016a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public final boolean isAfterLast() {
            return this.f112016a.isAfterLast();
        }

        @Override // android.database.Cursor
        public final boolean isBeforeFirst() {
            return this.f112016a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public final boolean isClosed() {
            return this.f112016a.isClosed();
        }

        @Override // android.database.Cursor
        public final boolean isFirst() {
            return this.f112016a.isFirst();
        }

        @Override // android.database.Cursor
        public final boolean isLast() {
            return this.f112016a.isLast();
        }

        @Override // android.database.Cursor
        public final boolean isNull(int i14) {
            return this.f112016a.isNull(i14);
        }

        @Override // android.database.Cursor
        public final boolean move(int i14) {
            return this.f112016a.move(i14);
        }

        @Override // android.database.Cursor
        public final boolean moveToFirst() {
            return this.f112016a.moveToFirst();
        }

        @Override // android.database.Cursor
        public final boolean moveToLast() {
            return this.f112016a.moveToLast();
        }

        @Override // android.database.Cursor
        public final boolean moveToNext() {
            return this.f112016a.moveToNext();
        }

        @Override // android.database.Cursor
        public final boolean moveToPosition(int i14) {
            return this.f112016a.moveToPosition(i14);
        }

        @Override // android.database.Cursor
        public final boolean moveToPrevious() {
            return this.f112016a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public final void registerContentObserver(ContentObserver contentObserver) {
            this.f112016a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f112016a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @e
        public final boolean requery() {
            return this.f112016a.requery();
        }

        @Override // android.database.Cursor
        public final Bundle respond(Bundle bundle) {
            return this.f112016a.respond(bundle);
        }

        @Override // android.database.Cursor
        public final void setExtras(Bundle bundle) {
            this.f112016a.setExtras(bundle);
        }

        @Override // android.database.Cursor
        public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f112016a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public final void unregisterContentObserver(ContentObserver contentObserver) {
            this.f112016a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f112016a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public b(vd.d dVar, ld.a aVar) {
        dVar.getClass();
        aVar.getClass();
        this.f112002a = dVar;
        this.f112003b = aVar;
        this.f112004c = new a(aVar);
        if (dVar instanceof b) {
            h.s("Failed requirement.");
            throw null;
        }
        aVar.f111990b = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f112004c.close();
    }

    @Override // vd.d
    /* JADX INFO: renamed from: getDatabaseName */
    public final String getF184330b() {
        return this.f112002a.getF184330b();
    }

    @Override // androidx.room.d
    /* JADX INFO: renamed from: getDelegate, reason: from getter */
    public final vd.d getF112024f() {
        return this.f112002a;
    }

    @Override // vd.d
    public final vd.c getWritableDatabase() {
        a aVar = this.f112004c;
        ld.a aVar2 = aVar.f112005a;
        try {
            aVar2.c().getClass();
            return aVar;
        } finally {
            aVar2.a();
        }
    }

    @Override // vd.d
    public final void setWriteAheadLoggingEnabled(boolean z14) {
        this.f112002a.setWriteAheadLoggingEnabled(z14);
    }

    /* JADX INFO: renamed from: ld.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lld/b$b;", "Lvd/g;", "", "sql", "Lld/a;", "autoCloser", "<init>", "(Ljava/lang/String;Lld/a;)V", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2149b implements g {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f112008h = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f112009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ld.a f112010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f112011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long[] f112012d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double[] f112013e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String[] f112014f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[][] f112015g;

        static {
            new a(null);
        }

        public C2149b(String str, ld.a aVar) {
            str.getClass();
            aVar.getClass();
            this.f112009a = str;
            this.f112010b = aVar;
            this.f112011c = new int[0];
            this.f112012d = new long[0];
            this.f112013e = new double[0];
            this.f112014f = new String[0];
            this.f112015g = new byte[0][];
        }

        public final void a(int i14, int i15) {
            int i16 = i15 + 1;
            int[] iArr = this.f112011c;
            if (iArr.length < i16) {
                this.f112011c = Arrays.copyOf(iArr, i16);
            }
            if (i14 == 1) {
                long[] jArr = this.f112012d;
                if (jArr.length < i16) {
                    this.f112012d = Arrays.copyOf(jArr, i16);
                    return;
                }
                return;
            }
            if (i14 == 2) {
                double[] dArr = this.f112013e;
                if (dArr.length < i16) {
                    this.f112013e = Arrays.copyOf(dArr, i16);
                    return;
                }
                return;
            }
            if (i14 == 3) {
                String[] strArr = this.f112014f;
                if (strArr.length < i16) {
                    this.f112014f = (String[]) Arrays.copyOf(strArr, i16);
                    return;
                }
                return;
            }
            if (i14 != 4) {
                return;
            }
            byte[][] bArr = this.f112015g;
            if (bArr.length < i16) {
                this.f112015g = (byte[][]) Arrays.copyOf(bArr, i16);
            }
        }

        @Override // vd.g
        public final int b2() {
            return ((Number) this.f112010b.b(new p1(13, this, new b1(16)))).intValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            o();
        }

        @Override // vd.g
        public final void execute() {
            this.f112010b.b(new p1(13, this, new b1(18)));
        }

        @Override // vd.e
        public final void h(int i14, long j8) {
            a(1, i14);
            this.f112011c[i14] = 1;
            this.f112012d[i14] = j8;
        }

        @Override // vd.e
        public final void m(double d14, int i14) {
            a(2, i14);
            this.f112011c[i14] = 2;
            this.f112013e[i14] = d14;
        }

        @Override // vd.e
        public final void o() {
            this.f112011c = new int[0];
            this.f112012d = new long[0];
            this.f112013e = new double[0];
            this.f112014f = new String[0];
            this.f112015g = new byte[0][];
        }

        @Override // vd.e
        public final void r(int i14, String str) {
            str.getClass();
            a(3, i14);
            this.f112011c[i14] = 3;
            this.f112014f[i14] = str;
        }

        @Override // vd.e
        public final void t(int i14, byte[] bArr) {
            bArr.getClass();
            a(4, i14);
            this.f112011c[i14] = 4;
            this.f112015g[i14] = bArr;
        }

        @Override // vd.e
        public final void u(int i14) {
            a(5, i14);
            this.f112011c[i14] = 5;
        }

        @Override // vd.g
        public final long y1() {
            return ((Number) this.f112010b.b(new p1(13, this, new b1(17)))).longValue();
        }

        /* JADX INFO: renamed from: ld.b$b$a */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lld/b$b$a;", "", "<init>", "()V", "", "COLUMN_TYPE_LONG", "I", "COLUMN_TYPE_DOUBLE", "COLUMN_TYPE_STRING", "COLUMN_TYPE_BLOB", "COLUMN_TYPE_NULL", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(j jVar) {
                this();
            }

            private a() {
            }
        }
    }
}
