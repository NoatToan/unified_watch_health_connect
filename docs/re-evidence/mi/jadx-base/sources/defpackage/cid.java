package defpackage;

import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.io.IORuntimeException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class cid extends hug {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static long b(InputStream inputStream, OutputStream outputStream) throws IORuntimeException {
        return c(inputStream, outputStream, 8192);
    }

    public static long c(InputStream inputStream, OutputStream outputStream, int i) throws IORuntimeException {
        return d(inputStream, outputStream, i, null);
    }

    public static long d(InputStream inputStream, OutputStream outputStream, int i, wio wioVar) throws IORuntimeException {
        qk1.u(inputStream, "InputStream is null !", new Object[0]);
        qk1.u(outputStream, "OutputStream is null !", new Object[0]);
        if (i <= 0) {
            i = 8192;
        }
        byte[] bArr = new byte[i];
        if (wioVar != null) {
            wioVar.start();
        }
        long j = 0;
        while (true) {
            try {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    break;
                }
                outputStream.write(bArr, 0, i2);
                j += (long) i2;
                if (wioVar != null) {
                    wioVar.a(j);
                }
            } catch (IOException e) {
                throw new IORuntimeException(e);
            }
        }
        outputStream.flush();
        if (wioVar != null) {
            wioVar.finish();
        }
        return j;
    }

    public static BufferedReader e(InputStream inputStream, Charset charset) {
        if (inputStream == null) {
            return null;
        }
        return new BufferedReader(charset == null ? new InputStreamReader(inputStream) : new InputStreamReader(inputStream, charset));
    }

    public static BufferedReader f(Reader reader) {
        if (reader == null) {
            return null;
        }
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    public static y99 g(InputStream inputStream, boolean z) throws IORuntimeException {
        y99 y99Var;
        if (inputStream instanceof FileInputStream) {
            try {
                y99Var = new y99(inputStream.available());
            } catch (IOException e) {
                throw new IORuntimeException(e);
            }
        } else {
            y99Var = new y99();
        }
        try {
            b(inputStream, y99Var);
            return y99Var;
        } finally {
            if (z) {
                a(inputStream);
            }
        }
    }

    public static String h(InputStream inputStream, Charset charset) throws IORuntimeException {
        return lio.F0(k(inputStream), charset);
    }

    public static String i(Reader reader) throws IORuntimeException {
        return j(reader, true);
    }

    public static String j(Reader reader, boolean z) throws IORuntimeException {
        StringBuilder sbA0 = lio.A0();
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        while (-1 != reader.read(charBufferAllocate)) {
            try {
                try {
                    sbA0.append(charBufferAllocate.flip().toString());
                } catch (IOException e) {
                    throw new IORuntimeException(e);
                }
            } catch (Throwable th) {
                if (z) {
                    a(reader);
                }
                throw th;
            }
        }
        if (z) {
            a(reader);
        }
        return sbA0.toString();
    }

    public static byte[] k(InputStream inputStream) throws IORuntimeException {
        return l(inputStream, true);
    }

    public static byte[] l(InputStream inputStream, boolean z) throws IORuntimeException {
        try {
            if (!(inputStream instanceof FileInputStream)) {
                return g(inputStream, z).a();
            }
            try {
                int iAvailable = inputStream.available();
                byte[] bArr = new byte[iAvailable];
                int i = inputStream.read(bArr);
                if (i != iAvailable) {
                    throw new IOException(tt3.y("File length is [{}] but read [{}]!", Integer.valueOf(iAvailable), Integer.valueOf(i)));
                }
                if (z) {
                    a(inputStream);
                }
                return bArr;
            } catch (IOException e) {
                throw new IORuntimeException(e);
            }
        } catch (Throwable th) {
            if (z) {
                a(inputStream);
            }
            throw th;
        }
    }

    public static void m(Reader reader, dge dgeVar) throws IORuntimeException {
        qk1.t(reader);
        qk1.t(dgeVar);
        BufferedReader bufferedReaderF = f(reader);
        while (true) {
            try {
                String line = bufferedReaderF.readLine();
                if (line == null) {
                    return;
                } else {
                    dgeVar.a(line);
                }
            } catch (IOException e) {
                throw new IORuntimeException(e);
            }
        }
    }

    public static <T> T n(bnq bnqVar, Class<T> cls) throws UtilException, IORuntimeException {
        if (bnqVar == null) {
            throw new IllegalArgumentException("The InputStream must not be null");
        }
        try {
            return (T) bnqVar.readObject();
        } catch (IOException e) {
            throw new IORuntimeException(e);
        } catch (ClassNotFoundException e2) {
            throw new UtilException(e2);
        }
    }

    public static <T> T o(InputStream inputStream) throws UtilException, IORuntimeException {
        return (T) p(inputStream, null);
    }

    public static <T> T p(InputStream inputStream, Class<T> cls) throws UtilException, IORuntimeException {
        try {
            return (T) n(inputStream instanceof bnq ? (bnq) inputStream : new bnq(inputStream, new Class[0]), cls);
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public static BufferedInputStream q(InputStream inputStream) {
        qk1.u(inputStream, "InputStream must be not null!", new Object[0]);
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream);
    }

    public static FileInputStream r(File file) {
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new IORuntimeException(e);
        }
    }

    public static void s(OutputStream outputStream, boolean z, Serializable... serializableArr) throws IORuntimeException {
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                objectOutputStream = outputStream instanceof ObjectOutputStream ? (ObjectOutputStream) outputStream : new ObjectOutputStream(outputStream);
                for (Serializable serializable : serializableArr) {
                    if (serializable != null) {
                        objectOutputStream.writeObject(serializable);
                    }
                }
                objectOutputStream.flush();
                if (z) {
                    a(objectOutputStream);
                }
            } catch (IOException e) {
                throw new IORuntimeException(e);
            }
        } catch (Throwable th) {
            if (z) {
                a(objectOutputStream);
            }
            throw th;
        }
    }
}
