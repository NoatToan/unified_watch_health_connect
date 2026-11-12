package wd;

import android.database.sqlite.SQLiteProgram;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwd/g;", "Lvd/e;", "Landroid/database/sqlite/SQLiteProgram;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteProgram;)V", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class g implements vd.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f184355a;

    public g(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.f184355a = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f184355a.close();
    }

    @Override // vd.e
    public final void h(int i14, long j8) {
        this.f184355a.bindLong(i14, j8);
    }

    @Override // vd.e
    public final void m(double d14, int i14) {
        this.f184355a.bindDouble(i14, d14);
    }

    @Override // vd.e
    public final void o() {
        this.f184355a.clearBindings();
    }

    @Override // vd.e
    public final void r(int i14, String str) {
        str.getClass();
        this.f184355a.bindString(i14, str);
    }

    @Override // vd.e
    public final void t(int i14, byte[] bArr) {
        bArr.getClass();
        this.f184355a.bindBlob(i14, bArr);
    }

    @Override // vd.e
    public final void u(int i14) {
        this.f184355a.bindNull(i14);
    }
}
