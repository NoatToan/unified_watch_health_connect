package cn.hutool.core.io.file;

import cn.hutool.core.io.IORuntimeException;
import defpackage.au3;
import defpackage.cid;
import defpackage.dge;
import defpackage.jm9;
import defpackage.tt3;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FileReader extends FileWrapper {
    private static final long serialVersionUID = 1;

    public interface a<T> {
        T a(BufferedReader bufferedReader) throws IOException;
    }

    public FileReader(File file, Charset charset) {
        super(file, charset);
        checkFile();
    }

    private void checkFile() throws IORuntimeException {
        if (!this.file.exists()) {
            throw new IORuntimeException("File not exist: " + this.file);
        }
        if (this.file.isFile()) {
            return;
        }
        throw new IORuntimeException("Not a file:" + this.file);
    }

    public static FileReader create(File file, Charset charset) {
        return new FileReader(file, charset);
    }

    public BufferedInputStream getInputStream() throws IORuntimeException {
        try {
            return new BufferedInputStream(new FileInputStream(this.file));
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public BufferedReader getReader() throws IORuntimeException {
        return cid.e(getInputStream(), this.charset);
    }

    public <T> T read(a<T> aVar) throws IORuntimeException {
        BufferedReader bufferedReaderV = null;
        try {
            try {
                bufferedReaderV = jm9.v(this.file, this.charset);
                T tA = aVar.a(bufferedReaderV);
                cid.a(bufferedReaderV);
                return tA;
            } catch (IOException e) {
                throw new IORuntimeException(e);
            }
        } catch (Throwable th) {
            cid.a(bufferedReaderV);
            throw th;
        }
    }

    public byte[] readBytes() throws Throwable {
        long length = this.file.length();
        if (length >= 2147483647L) {
            throw new IORuntimeException("File is larger then max array size");
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(this.file);
                try {
                    int i = fileInputStream2.read(bArr);
                    if (i < length) {
                        throw new IOException(tt3.y("File length is [{}] but read [{}]!", Long.valueOf(length), Integer.valueOf(i)));
                    }
                    cid.a(fileInputStream2);
                    return bArr;
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    throw new IORuntimeException(e);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    cid.a(fileInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void readLines(dge dgeVar) throws IORuntimeException {
        BufferedReader bufferedReaderV = null;
        try {
            bufferedReaderV = jm9.v(this.file, this.charset);
            cid.m(bufferedReaderV, dgeVar);
        } finally {
            cid.a(bufferedReaderV);
        }
    }

    public String readString() throws IORuntimeException {
        return new String(readBytes(), this.charset);
    }

    public long writeToStream(OutputStream outputStream) throws IORuntimeException {
        return writeToStream(outputStream, false);
    }

    public static FileReader create(File file) {
        return new FileReader(file);
    }

    public long writeToStream(OutputStream outputStream, boolean z) throws IORuntimeException {
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(this.file);
                try {
                    long jB = cid.b(fileInputStream, outputStream);
                    fileInputStream.close();
                    if (z) {
                        cid.a(outputStream);
                    }
                    return jB;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e) {
                throw new IORuntimeException(e);
            }
        } catch (Throwable th4) {
            if (z) {
                cid.a(outputStream);
            }
            throw th4;
        }
    }

    public FileReader(File file, String str) {
        this(file, au3.a(str));
    }

    public FileReader(String str, Charset charset) {
        this(jm9.o(str), charset);
    }

    public FileReader(String str, String str2) {
        this(jm9.o(str), au3.a(str2));
    }

    public FileReader(File file) {
        this(file, FileWrapper.DEFAULT_CHARSET);
    }

    public <T extends Collection<String>> T readLines(T t) throws IORuntimeException {
        BufferedReader bufferedReaderV = null;
        try {
            try {
                bufferedReaderV = jm9.v(this.file, this.charset);
                while (true) {
                    String line = bufferedReaderV.readLine();
                    if (line == null) {
                        cid.a(bufferedReaderV);
                        return t;
                    }
                    t.add(line);
                    cid.a(bufferedReaderV);
                    throw th;
                }
            } catch (IOException e) {
                throw new IORuntimeException(e);
            }
        } catch (Throwable th) {
            cid.a(bufferedReaderV);
            throw th;
        }
    }

    public FileReader(String str) {
        this(str, FileWrapper.DEFAULT_CHARSET);
    }

    public List<String> readLines() throws IORuntimeException {
        return (List) readLines(new ArrayList());
    }
}
