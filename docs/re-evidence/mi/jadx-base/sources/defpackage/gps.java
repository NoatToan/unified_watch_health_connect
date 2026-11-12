package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* JADX INFO: loaded from: classes5.dex */
public final class gps {
    public static final pbt h = new pbt("SliceMetadataManager");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tbs f19222b;
    public final String c;
    public final int d;
    public final long e;
    public final String f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f19221a = new byte[8192];
    public int g = -1;

    public gps(tbs tbsVar, String str, int i, long j, String str2) {
        this.f19222b = tbsVar;
        this.c = str;
        this.d = i;
        this.e = j;
        this.f = str2;
    }

    public final int a() throws IOException {
        File fileZ = this.f19222b.z(this.c, this.d, this.e, this.f);
        if (!fileZ.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(fileZ);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new ugs("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final eps b() throws IOException {
        File fileZ = this.f19222b.z(this.c, this.d, this.e, this.f);
        if (!fileZ.exists()) {
            throw new ugs("Slice checkpoint file does not exist.");
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(fileZ);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                throw new ugs("Slice checkpoint file corrupt.");
            }
            try {
                int i = Integer.parseInt(properties.getProperty("fileStatus"));
                String property = properties.getProperty("fileName");
                long j = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                long j2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                int i2 = Integer.parseInt(properties.getProperty("previousChunk"));
                this.g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                return new tcs(i, property, j, j2, i2);
            } catch (NumberFormatException e) {
                throw new ugs("Slice checkpoint file corrupt.", e);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final File c() {
        return new File(n(), String.format("%s-NAM.dat", Integer.valueOf(this.g)));
    }

    public final void d(InputStream inputStream, long j) throws IOException {
        int i;
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                i = inputStream.read(this.f19221a);
                if (i > 0) {
                    randomAccessFile.write(this.f19221a, 0, i);
                }
            } while (i >= 0);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e(long j, byte[] bArr, int i, int i2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(c().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void g(String str, long j, long j2, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File fileY = this.f19222b.y(this.c, this.d, this.e, this.f);
            if (fileY.exists()) {
                fileY.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileY);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void i(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void j(byte[] bArr) throws IOException {
        this.g++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(n(), String.format("%s-LFH.dat", Integer.valueOf(this.g))));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new ugs("Could not write metadata file.", e);
        }
    }

    public final void k(byte[] bArr, InputStream inputStream) throws IOException {
        this.g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr);
            int i = inputStream.read(this.f19221a);
            while (i > 0) {
                fileOutputStream.write(this.f19221a, 0, i);
                i = inputStream.read(this.f19221a);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void l(byte[] bArr, int i, int i2) throws IOException {
        this.g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr, 0, i2);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean m() {
        File fileZ = this.f19222b.z(this.c, this.d, this.e, this.f);
        if (!fileZ.exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(fileZ);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null) {
                    return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                h.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            h.b("Could not read checkpoint while checking if extraction finished. %s", e);
            return false;
        }
    }

    public final File n() {
        File fileA = this.f19222b.A(this.c, this.d, this.e, this.f);
        if (!fileA.exists()) {
            fileA.mkdirs();
        }
        return fileA;
    }

    public final File o() throws IOException {
        File fileZ = this.f19222b.z(this.c, this.d, this.e, this.f);
        fileZ.getParentFile().mkdirs();
        fileZ.createNewFile();
        return fileZ;
    }
}
