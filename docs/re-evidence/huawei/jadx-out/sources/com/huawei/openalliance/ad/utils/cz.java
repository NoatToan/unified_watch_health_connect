package com.huawei.openalliance.ad.utils;

import com.huawei.openalliance.ad.hw;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes12.dex */
public class cz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20581a = "cz";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static Serializable b(String str) {
        Throwable th;
        cx cxVar;
        String str2;
        String str3;
        ?? r0;
        ?? r1;
        ?? B = dg.b(str);
        ?? r2 = 0;
        serializable = null;
        r2 = 0;
        Serializable serializable = null;
        try {
            if (B != 0) {
                return null;
            }
            try {
                B = new ByteArrayInputStream(ar.a(str));
                try {
                    cxVar = new cx(B);
                    try {
                        Object object = cxVar.readObject();
                        r1 = B;
                        if (object instanceof Serializable) {
                            serializable = (Serializable) object;
                            r1 = B;
                        }
                    } catch (UnsupportedEncodingException unused) {
                        str2 = f20581a;
                        str3 = "fail to get Serializable UnsupportedEncodingException";
                        r0 = B;
                        hw.d(str2, str3);
                        r1 = r0;
                    } catch (IOException unused2) {
                        str2 = f20581a;
                        str3 = "fail to get Serializable IOException";
                        r0 = B;
                        hw.d(str2, str3);
                        r1 = r0;
                    } catch (ClassNotFoundException unused3) {
                        str2 = f20581a;
                        str3 = "fail to get Serializable ClassNotFoundException";
                        r0 = B;
                        hw.d(str2, str3);
                        r1 = r0;
                    }
                } catch (UnsupportedEncodingException unused4) {
                    cxVar = null;
                } catch (IOException unused5) {
                    cxVar = null;
                } catch (ClassNotFoundException unused6) {
                    cxVar = null;
                } catch (Throwable th2) {
                    th = th2;
                    df.a((Closeable) r2);
                    df.a((Closeable) B);
                    throw th;
                }
            } catch (UnsupportedEncodingException unused7) {
                cxVar = null;
                B = 0;
            } catch (IOException unused8) {
                cxVar = null;
                B = 0;
            } catch (ClassNotFoundException unused9) {
                cxVar = null;
                B = 0;
            } catch (Throwable th3) {
                th = th3;
                B = 0;
            }
            df.a((Closeable) cxVar);
            df.a((Closeable) r1);
            return serializable;
        } catch (Throwable th4) {
            r2 = str;
            th = th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static boolean a(Serializable serializable, String str) throws Throwable {
        ?? r5;
        Closeable closeable;
        Closeable closeable2;
        String str2;
        String str3;
        Closeable closeable3 = null;
        try {
            try {
                File file = new File(str);
                if (!file.getParentFile().exists() && !ai.g(file.getParentFile())) {
                    hw.c(f20581a, "writeObject, mkdir failed");
                }
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    try {
                        objectOutputStream.writeObject(serializable);
                        df.a(fileOutputStream);
                        df.a(objectOutputStream);
                        return true;
                    } catch (FileNotFoundException unused) {
                        closeable3 = objectOutputStream;
                        closeable2 = closeable3;
                        closeable3 = fileOutputStream;
                        str2 = f20581a;
                        str3 = "write file FileNotFoundException";
                        serializable = closeable2;
                        hw.c(str2, str3);
                        df.a(closeable3);
                        df.a((Closeable) serializable);
                        return false;
                    } catch (IOException unused2) {
                        closeable3 = objectOutputStream;
                        closeable = closeable3;
                        closeable3 = fileOutputStream;
                        str2 = f20581a;
                        str3 = "write file IOException";
                        serializable = closeable;
                        hw.c(str2, str3);
                        df.a(closeable3);
                        df.a((Closeable) serializable);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        closeable3 = objectOutputStream;
                        r5 = closeable3;
                        closeable3 = fileOutputStream;
                        df.a(closeable3);
                        df.a((Closeable) r5);
                        throw th;
                    }
                } catch (FileNotFoundException unused3) {
                } catch (IOException unused4) {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                r5 = serializable;
                th = th3;
            }
        } catch (FileNotFoundException unused5) {
            closeable2 = null;
        } catch (IOException unused6) {
            closeable = null;
        } catch (Throwable th4) {
            th = th4;
            r5 = 0;
        }
    }

    public static String a(Serializable serializable) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        if (serializable == null) {
            return "";
        }
        ObjectOutputStream objectOutputStream2 = null;
        byte[] byteArray = null;
        objectOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(serializable);
                        objectOutputStream.flush();
                        byteArray = byteArrayOutputStream.toByteArray();
                    } catch (IOException unused) {
                        hw.d(f20581a, "fail to get sequence");
                    }
                } catch (IOException unused2) {
                    objectOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    df.a(objectOutputStream2);
                    df.a(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream;
                objectOutputStream2 = objectOutputStream;
            }
        } catch (IOException unused3) {
            byteArrayOutputStream = null;
            objectOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        df.a(objectOutputStream);
        df.a(byteArrayOutputStream);
        return ar.a(byteArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0047: MOVE (r4 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:30:0x0047 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    public static Serializable a(String str) throws Throwable {
        ?? r1;
        cx cxVar;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        String str2;
        String str3;
        String str4;
        FileInputStream fileInputStream4 = null;
        serializable = null;
        serializable = null;
        Serializable serializable = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    cxVar = new cx(fileInputStream);
                    try {
                        Object object = cxVar.readObject();
                        if (object instanceof Serializable) {
                            serializable = (Serializable) object;
                        }
                    } catch (FileNotFoundException unused) {
                        hw.d(f20581a, "read file FileNotFoundException");
                    } catch (IOException unused2) {
                        str3 = f20581a;
                        str4 = "read file IOException";
                        hw.c(str3, str4);
                    } catch (ClassNotFoundException unused3) {
                        str3 = f20581a;
                        str4 = "read file ClassNotFoundException";
                        hw.c(str3, str4);
                    }
                } catch (FileNotFoundException unused4) {
                    cxVar = null;
                } catch (IOException unused5) {
                    cxVar = null;
                } catch (ClassNotFoundException unused6) {
                    cxVar = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream3 = fileInputStream;
                    str2 = null;
                    fileInputStream4 = fileInputStream3;
                    r1 = str2;
                    df.a((Closeable) fileInputStream4);
                    df.a((Closeable) r1);
                    throw th;
                }
            } catch (Throwable th2) {
                fileInputStream3 = fileInputStream2;
                str2 = str;
                th = th2;
            }
        } catch (FileNotFoundException unused7) {
            cxVar = null;
            fileInputStream = null;
        } catch (IOException unused8) {
            cxVar = null;
            fileInputStream = null;
        } catch (ClassNotFoundException unused9) {
            cxVar = null;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            r1 = 0;
            df.a((Closeable) fileInputStream4);
            df.a((Closeable) r1);
            throw th;
        }
        df.a((Closeable) fileInputStream);
        df.a((Closeable) cxVar);
        return serializable;
    }
}
