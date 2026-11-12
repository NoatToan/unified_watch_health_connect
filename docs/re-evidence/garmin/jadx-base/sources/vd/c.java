package vd;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface c extends Closeable {
    g C1(String str);

    boolean D();

    void F();

    void G();

    Cursor I(f fVar, CancellationSignal cancellationSignal);

    void I1(Object[] objArr);

    Cursor J1(f fVar);

    Cursor X3(String str);

    void g2();

    boolean isOpen();

    boolean j4();

    void k3(String str);

    default void o0() {
        F();
    }

    boolean s3();

    int s4(ContentValues contentValues, Object[] objArr);

    void t3();

    long v3(ContentValues contentValues);

    void y3();
}
