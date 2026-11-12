package cn.hutool.core.io.file;

import cn.hutool.core.io.IORuntimeException;
import defpackage.au3;
import defpackage.cid;
import defpackage.jm9;
import defpackage.qk1;
import defpackage.tt3;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class FileWriter extends FileWrapper {
    private static final long serialVersionUID = 1;

    public FileWriter(File file, Charset charset) {
        super(file, charset);
        checkFile();
    }

    private void checkFile() throws IORuntimeException {
        qk1.u(this.file, "File to write content is null !", new Object[0]);
        if (this.file.exists() && !this.file.isFile()) {
            throw new IORuntimeException("File [{}] is not a file !", this.file.getAbsoluteFile());
        }
    }

    public static FileWriter create(File file, Charset charset) {
        return new FileWriter(file, charset);
    }

    private void printNewLine(PrintWriter printWriter, LineSeparator lineSeparator) {
        if (lineSeparator == null) {
            printWriter.println();
        } else {
            printWriter.print(lineSeparator.getValue());
        }
    }

    public File append(String str) throws IORuntimeException {
        return write(str, true);
    }

    public <T> File appendLines(Collection<T> collection) throws IORuntimeException {
        return writeLines(collection, true);
    }

    public BufferedOutputStream getOutputStream() throws IORuntimeException {
        try {
            return new BufferedOutputStream(new FileOutputStream(jm9.J(this.file)));
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public PrintWriter getPrintWriter(boolean z) throws IORuntimeException {
        return new PrintWriter(getWriter(z));
    }

    public BufferedWriter getWriter(boolean z) throws IORuntimeException {
        try {
            return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(jm9.J(this.file), z), this.charset));
        } catch (Exception e) {
            throw new IORuntimeException(e);
        }
    }

    public File write(String str, boolean z) throws IORuntimeException {
        BufferedWriter writer = null;
        try {
            try {
                writer = getWriter(z);
                writer.write(str);
                writer.flush();
                cid.a(writer);
                return this.file;
            } catch (IOException e) {
                throw new IORuntimeException(e);
            }
        } catch (Throwable th) {
            cid.a(writer);
            throw th;
        }
    }

    public File writeFromStream(InputStream inputStream) throws IORuntimeException {
        return writeFromStream(inputStream, true);
    }

    public <T> File writeLines(Collection<T> collection) throws IORuntimeException {
        return writeLines(collection, false);
    }

    public File writeMap(Map<?, ?> map, String str, boolean z) throws IORuntimeException {
        return writeMap(map, null, str, z);
    }

    public static FileWriter create(File file) {
        return new FileWriter(file);
    }

    public File append(byte[] bArr, int i, int i2) throws IORuntimeException {
        return write(bArr, i, i2, true);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0032  */
    public File writeFromStream(InputStream inputStream, boolean z) throws Throwable {
        Throwable th;
        IOException e;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(jm9.J(this.file));
                try {
                    cid.b(inputStream, fileOutputStream);
                    cid.a(fileOutputStream);
                    if (z) {
                        cid.a(inputStream);
                    }
                    return this.file;
                } catch (IOException e2) {
                    e = e2;
                    throw new IORuntimeException(e);
                }
            } catch (Throwable th2) {
                th = th2;
                cid.a(null);
                if (z) {
                    cid.a(inputStream);
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th3) {
            th = th3;
            cid.a(null);
            if (z) {
                cid.a(inputStream);
            }
            throw th;
        }
    }

    public <T> File writeLines(Collection<T> collection, boolean z) throws IORuntimeException {
        return writeLines(collection, null, z);
    }

    public File writeMap(Map<?, ?> map, LineSeparator lineSeparator, String str, boolean z) throws IORuntimeException {
        if (str == null) {
            str = " = ";
        }
        PrintWriter printWriter = getPrintWriter(z);
        try {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                if (entry != null) {
                    printWriter.print(tt3.y("{}{}{}", entry.getKey(), str, entry.getValue()));
                    printNewLine(printWriter, lineSeparator);
                    printWriter.flush();
                }
            }
            if (printWriter != null) {
                printWriter.close();
            }
            return this.file;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (printWriter != null) {
                    try {
                        printWriter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public FileWriter(File file, String str) {
        this(file, au3.a(str));
    }

    public <T> File writeLines(Collection<T> collection, LineSeparator lineSeparator, boolean z) throws IORuntimeException {
        PrintWriter printWriter = getPrintWriter(z);
        try {
            for (T t : collection) {
                if (t != null) {
                    printWriter.print(t.toString());
                    printNewLine(printWriter, lineSeparator);
                    printWriter.flush();
                }
            }
            if (printWriter != null) {
                printWriter.close();
            }
            return this.file;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (printWriter != null) {
                    try {
                        printWriter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public FileWriter(String str, Charset charset) {
        this(jm9.o(str), charset);
    }

    public FileWriter(String str, String str2) {
        this(jm9.o(str), au3.a(str2));
    }

    public FileWriter(File file) {
        this(file, FileWrapper.DEFAULT_CHARSET);
    }

    public FileWriter(String str) {
        this(str, FileWrapper.DEFAULT_CHARSET);
    }

    public File write(String str) throws IORuntimeException {
        return write(str, false);
    }

    public File write(byte[] bArr, int i, int i2) throws IORuntimeException {
        return write(bArr, i, i2, false);
    }

    public File write(byte[] bArr, int i, int i2, boolean z) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(jm9.J(this.file), z);
                try {
                    fileOutputStream2.write(bArr, i, i2);
                    fileOutputStream2.flush();
                    cid.a(fileOutputStream2);
                    return this.file;
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    throw new IORuntimeException(e);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    cid.a(fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
