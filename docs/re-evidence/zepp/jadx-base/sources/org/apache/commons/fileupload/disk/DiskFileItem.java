package org.apache.commons.fileupload.disk;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemHeaders;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.ParameterParser;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.DeferredFileOutputStream;

/* JADX INFO: loaded from: classes23.dex */
public class DiskFileItem implements FileItem {
    public static final String DEFAULT_CHARSET = "ISO-8859-1";
    public static final String SERIALIZABLE_PROPERTY = DiskFileItem.class.getName() + ".serializable";
    private static final String m = UUID.randomUUID().toString().replace('-', '_');
    private static final AtomicInteger n = new AtomicInteger(0);
    private static final long serialVersionUID = 2237570099615271025L;
    private String a;
    private final String b;
    private boolean c;
    private final String d;
    private long e = -1;
    private final int f;
    private final File g;
    private byte[] h;
    private transient DeferredFileOutputStream i;
    private transient File j;
    private File k;
    private FileItemHeaders l;

    public DiskFileItem(String str, String str2, boolean z, String str3, int i, File file) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.f = i;
        this.g = file;
    }

    private static String a() {
        int andIncrement = n.getAndIncrement();
        String string = Integer.toString(andIncrement);
        if (andIncrement >= 100000000) {
            return string;
        }
        return ("00000000" + string).substring(string.length());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        String str = SERIALIZABLE_PROPERTY;
        if (!Boolean.getBoolean(str)) {
            throw new IllegalStateException("Property " + str + " is not true, rejecting to deserialize a DiskFileItem.");
        }
        objectInputStream.defaultReadObject();
        File file = this.g;
        if (file != null) {
            if (!file.isDirectory()) {
                throw new IOException(String.format("The repository [%s] is not a directory", this.g.getAbsolutePath()));
            }
            if (this.g.getPath().contains("\u0000")) {
                throw new IOException(String.format("The repository [%s] contains a null character", this.g.getPath()));
            }
        }
        OutputStream outputStream = getOutputStream();
        byte[] bArr = this.h;
        if (bArr != null) {
            outputStream.write(bArr);
        } else {
            IOUtils.copy(new FileInputStream(this.k), outputStream);
            this.k.delete();
            this.k = null;
        }
        outputStream.close();
        this.h = null;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        if (this.i.isInMemory()) {
            this.h = get();
        } else {
            this.h = null;
            this.k = this.i.getFile();
        }
        objectOutputStream.defaultWriteObject();
    }

    @Override // org.apache.commons.fileupload.FileItem
    public void delete() {
        this.h = null;
        File storeLocation = getStoreLocation();
        if (storeLocation == null || !storeLocation.exists()) {
            return;
        }
        storeLocation.delete();
    }

    public void finalize() {
        File file = this.i.getFile();
        if (file == null || !file.exists()) {
            return;
        }
        file.delete();
    }

    @Override // org.apache.commons.fileupload.FileItem
    public byte[] get() throws Throwable {
        BufferedInputStream bufferedInputStream;
        if (isInMemory()) {
            if (this.h == null) {
                this.h = this.i.getData();
            }
            return this.h;
        }
        byte[] bArr = new byte[(int) getSize()];
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(this.i.getFile()));
            try {
                bufferedInputStream.read(bArr);
                try {
                    bufferedInputStream.close();
                    return bArr;
                } catch (IOException unused) {
                    return bArr;
                }
            } catch (IOException unused2) {
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream2 = bufferedInputStream;
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            bufferedInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public String getCharSet() {
        ParameterParser parameterParser = new ParameterParser();
        parameterParser.setLowerCaseNames(true);
        return parameterParser.parse(getContentType(), ';').get("charset");
    }

    @Override // org.apache.commons.fileupload.FileItem
    public String getContentType() {
        return this.b;
    }

    @Override // org.apache.commons.fileupload.FileItem
    public String getFieldName() {
        return this.a;
    }

    @Override // org.apache.commons.fileupload.FileItemHeadersSupport
    public FileItemHeaders getHeaders() {
        return this.l;
    }

    @Override // org.apache.commons.fileupload.FileItem
    public InputStream getInputStream() throws IOException {
        if (!isInMemory()) {
            return new FileInputStream(this.i.getFile());
        }
        if (this.h == null) {
            this.h = this.i.getData();
        }
        return new ByteArrayInputStream(this.h);
    }

    @Override // org.apache.commons.fileupload.FileItem
    public String getName() {
        return Streams.checkFileName(this.d);
    }

    @Override // org.apache.commons.fileupload.FileItem
    public OutputStream getOutputStream() throws IOException {
        if (this.i == null) {
            this.i = new DeferredFileOutputStream(this.f, getTempFile());
        }
        return this.i;
    }

    @Override // org.apache.commons.fileupload.FileItem
    public long getSize() {
        long j = this.e;
        if (j >= 0) {
            return j;
        }
        byte[] bArr = this.h;
        if (bArr != null) {
            return bArr.length;
        }
        return this.i.isInMemory() ? this.i.getData().length : this.i.getFile().length();
    }

    public File getStoreLocation() {
        DeferredFileOutputStream deferredFileOutputStream = this.i;
        if (deferredFileOutputStream == null) {
            return null;
        }
        return deferredFileOutputStream.getFile();
    }

    @Override // org.apache.commons.fileupload.FileItem
    public String getString(String str) throws UnsupportedEncodingException {
        return new String(get(), str);
    }

    public File getTempFile() {
        if (this.j == null) {
            File file = this.g;
            if (file == null) {
                file = new File(System.getProperty("java.io.tmpdir"));
            }
            this.j = new File(file, String.format("upload_%s_%s.tmp", m, a()));
        }
        return this.j;
    }

    @Override // org.apache.commons.fileupload.FileItem
    public boolean isFormField() {
        return this.c;
    }

    @Override // org.apache.commons.fileupload.FileItem
    public boolean isInMemory() {
        if (this.h != null) {
            return true;
        }
        return this.i.isInMemory();
    }

    @Override // org.apache.commons.fileupload.FileItem
    public void setFieldName(String str) {
        this.a = str;
    }

    @Override // org.apache.commons.fileupload.FileItem
    public void setFormField(boolean z) {
        this.c = z;
    }

    @Override // org.apache.commons.fileupload.FileItemHeadersSupport
    public void setHeaders(FileItemHeaders fileItemHeaders) {
        this.l = fileItemHeaders;
    }

    public String toString() {
        return String.format("name=%s, StoreLocation=%s, size=%s bytes, isFormField=%s, FieldName=%s", getName(), getStoreLocation(), Long.valueOf(getSize()), Boolean.valueOf(isFormField()), getFieldName());
    }

    @Override // org.apache.commons.fileupload.FileItem
    public void write(File file) throws Exception {
        BufferedOutputStream bufferedOutputStream;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        if (isInMemory()) {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(get());
                    fileOutputStream2.close();
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            File storeLocation = getStoreLocation();
            if (storeLocation == null) {
                throw new FileUploadException("Cannot write uploaded file to disk!");
            }
            this.e = storeLocation.length();
            if (storeLocation.renameTo(file)) {
                return;
            }
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(storeLocation));
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    try {
                        IOUtils.copy(bufferedInputStream2, bufferedOutputStream);
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused) {
                        }
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (bufferedOutputStream == null) {
                            throw th;
                        }
                        try {
                            bufferedOutputStream.close();
                            throw th;
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedOutputStream = null;
                }
            } catch (Throwable th5) {
                th = th5;
                bufferedOutputStream = null;
            }
        }
    }

    @Override // org.apache.commons.fileupload.FileItem
    public String getString() throws Throwable {
        byte[] bArr = get();
        String charSet = getCharSet();
        if (charSet == null) {
            charSet = "ISO-8859-1";
        }
        try {
            return new String(bArr, charSet);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }
}
