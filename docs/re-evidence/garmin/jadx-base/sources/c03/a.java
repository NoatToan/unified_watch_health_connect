package c03;

import android.database.Cursor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc03/a;", "Ld03/c;", "Landroid/database/Cursor;", "cursor", "<init>", "(Landroid/database/Cursor;)V", "sqldelight-android-driver_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class a implements d03.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cursor f22410a;

    public a(Cursor cursor) {
        cursor.getClass();
        this.f22410a = cursor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f22410a.close();
    }

    @Override // d03.c
    public final String getString(int i14) {
        Cursor cursor = this.f22410a;
        if (cursor.isNull(i14)) {
            return null;
        }
        return cursor.getString(i14);
    }

    @Override // d03.c
    public final boolean next() {
        return this.f22410a.moveToNext();
    }
}
