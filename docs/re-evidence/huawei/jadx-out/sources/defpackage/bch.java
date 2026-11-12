package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteException;

/* JADX INFO: loaded from: classes23.dex */
public class bch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f973a = new Object();

    public static int a(Context context) {
        bcw.c("ClearAllDBInfo", "clearTag");
        synchronized (f973a) {
            try {
                try {
                    try {
                        if (bce.b() == null) {
                            bcw.c("ClearAllDBInfo", "getContext is null: set context");
                            if (context == null) {
                                bcw.d("ClearAllDBInfo", "clearAllInfo context is null");
                                return -1;
                            }
                            bce.e(context);
                        }
                        new bck().c();
                        new bcg().e();
                        new bcj().c();
                        return 0;
                    } catch (Exception e) {
                        bcw.d("ClearAllDBInfo", "clearAllInfo Exception = " + e.toString());
                        return -1;
                    }
                } catch (SQLiteException unused) {
                    bcw.d("ClearAllDBInfo", "clearAllInfo SQLiteException");
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int d(Context context) {
        bcw.c("ClearAllDBInfo", "clearAllPrepareInfo");
        synchronized (f973a) {
            try {
                try {
                    try {
                        if (bce.b() == null) {
                            bcw.c("ClearAllDBInfo", "clearAllPrepareInfo getContext is null: set context");
                            if (context == null) {
                                bcw.d("ClearAllDBInfo", "clearAllPrepareInfo context is null");
                                return -1;
                            }
                            bce.e(context);
                        }
                        bbx.e(context).a();
                        return 0;
                    } catch (SQLiteException unused) {
                        bcw.d("ClearAllDBInfo", "clearAllPrepareInfo SQLiteException");
                        return -2;
                    }
                } catch (Exception e) {
                    bcw.d("ClearAllDBInfo", "clearAllPrepareInfo Exception = " + e.toString());
                    return -1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
