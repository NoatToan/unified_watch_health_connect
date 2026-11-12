package com.huawei.hms.network.file.a.k.b;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.network.file.api.RequestConfig;
import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.hms.network.file.core.util.Utils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class f {
    public static byte[] a(Object obj) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream2.writeObject(obj);
                        objectOutputStream2.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        a((Closeable) objectOutputStream2);
                        a((Closeable) byteArrayOutputStream);
                        return byteArray;
                    } catch (IOException e) {
                        e = e;
                        objectOutputStream = objectOutputStream2;
                        FLogger.logException(e);
                        a((Closeable) objectOutputStream);
                        a((Closeable) byteArrayOutputStream);
                        return new byte[0];
                    } catch (Throwable th) {
                        th = th;
                        objectOutputStream = objectOutputStream2;
                        a((Closeable) objectOutputStream);
                        a((Closeable) byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    static final class a extends ObjectInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Set<String> f15704a = new C0165a();

        @Override // java.io.ObjectInputStream
        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
            if (f15704a.contains(objectStreamClass.getName())) {
                return super.resolveClass(objectStreamClass);
            }
            String str = "resolveClass forbidden for:" + objectStreamClass.getName();
            FLogger.e("IOUtils", str);
            throw new ClassNotFoundException(str);
        }

        /* JADX INFO: renamed from: com.huawei.hms.network.file.a.k.b.f$a$a, reason: collision with other inner class name */
        class C0165a extends HashSet<String> {
            C0165a() {
                add(Collections.unmodifiableMap(Collections.EMPTY_MAP).getClass().getName());
                add(HashMap.class.getName());
                add(RequestConfig.class.getName());
            }
        }

        public a(InputStream inputStream) {
            super(inputStream);
        }
    }

    public static void a(Closeable closeable) {
        Utils.close(closeable);
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
                return;
            }
            FLogger.w("IOUtils", "db is null for:" + str, new Object[0]);
        } catch (SQLiteException e) {
            FLogger.w("IOUtils", "SqliteException for:" + str, e);
        } catch (RuntimeException e2) {
            FLogger.w("IOUtils", "RuntimeException for:" + str, e2);
        }
    }

    public static void a(Cursor cursor) {
        if (cursor == null) {
            return;
        }
        try {
            IoUtils.close(cursor);
        } catch (RuntimeException | Exception e) {
            FLogger.logException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r4v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.Closeable] */
    public static Object a(byte[] bArr) throws Throwable {
        Throwable th;
        ByteArrayInputStream byteArrayInputStream;
        Exception e;
        a aVar;
        ?? r0 = 0;
        Object object = null;
        r0 = 0;
        try {
            if (bArr == 0) {
                return null;
            }
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    aVar = new a(byteArrayInputStream);
                    try {
                        object = aVar.readObject();
                        bArr = aVar;
                    } catch (Exception e2) {
                        e = e2;
                        FLogger.logException(e);
                        bArr = aVar;
                    }
                } catch (Exception e3) {
                    e = e3;
                    aVar = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e4) {
                e = e4;
                aVar = null;
                byteArrayInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayInputStream = null;
            }
            a((Closeable) bArr);
            a((Closeable) byteArrayInputStream);
            return object;
        } catch (Throwable th4) {
            r0 = bArr;
            th = th4;
        }
        a((Closeable) r0);
        a((Closeable) byteArrayInputStream);
        throw th;
    }
}
