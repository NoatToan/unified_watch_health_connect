package com.huawei.hwcloudjs.d.a;

import com.huawei.hwcloudjs.f.h;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes37.dex */
public class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17078a = "SerializedObject";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17079b;

    public T b() throws Throwable {
        Throwable th;
        e eVar;
        FileInputStream fileInputStream;
        Closeable closeable = (T) null;
        try {
            try {
                fileInputStream = new FileInputStream(this.f17079b);
                try {
                    eVar = new e(fileInputStream);
                    try {
                        closeable = (T) eVar.readObject();
                    } catch (IOException | Exception unused) {
                        com.huawei.hwcloudjs.f.d.b(f17078a, "read file error ", true);
                    }
                } catch (IOException | Exception unused2) {
                    eVar = null;
                } catch (Throwable th2) {
                    eVar = null;
                    closeable = (T) fileInputStream;
                    th = th2;
                    h.a(closeable);
                    h.a(eVar);
                    throw th;
                }
            } catch (Throwable th3) {
                FileInputStream fileInputStream2 = fileInputStream;
                th = th3;
                closeable = (T) fileInputStream2;
            }
        } catch (IOException | Exception unused3) {
            fileInputStream = null;
            eVar = null;
        } catch (Throwable th4) {
            th = th4;
            eVar = null;
        }
        h.a(fileInputStream);
        h.a(eVar);
        return (T) closeable;
    }

    public boolean a(T t) throws Throwable {
        Closeable closeable;
        FileOutputStream fileOutputStream;
        Closeable closeable2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(this.f17079b);
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    try {
                        objectOutputStream.writeObject(t);
                        h.a(fileOutputStream);
                        h.a(objectOutputStream);
                        return true;
                    } catch (IOException unused) {
                        closeable2 = objectOutputStream;
                        com.huawei.hwcloudjs.f.d.b(f17078a, "read file error ", true);
                        h.a(fileOutputStream);
                        h.a(closeable2);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        closeable2 = fileOutputStream;
                        closeable = objectOutputStream;
                        h.a(closeable2);
                        h.a(closeable);
                        throw th;
                    }
                } catch (IOException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = closeable2;
                closeable2 = fileOutputStream;
            }
        } catch (IOException unused3) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
        }
    }

    public long a() {
        return new File(this.f17079b).lastModified();
    }

    public f(String str) {
        this.f17079b = str;
    }
}
