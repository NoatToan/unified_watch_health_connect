package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class aag implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f829b;
    public final File c;
    public final RandomAccessFile d;
    public final FileChannel e;
    public final FileLock f;

    public class a implements FileFilter {
        public a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    public static class b extends File {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f831a;

        public b(File file, String str) {
            super(file, str);
            this.f831a = -1L;
        }
    }

    public aag(File file, File file2) throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor(");
        sb.append(file.getPath());
        sb.append(", ");
        sb.append(file2.getPath());
        sb.append(")");
        this.f828a = file;
        this.c = file2;
        this.f829b = m(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.e = channel;
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Blocking on lock ");
                sb2.append(file3.getPath());
                this.f = channel.lock();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(file3.getPath());
                sb3.append(" locked");
            } catch (IOException e) {
                e = e;
                b(this.e);
                throw e;
            } catch (Error e2) {
                e = e2;
                b(this.e);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                b(this.e);
                throw e;
            }
        } catch (IOException e4) {
            e = e4;
            b(this.d);
            throw e;
        } catch (Error e5) {
            e = e5;
            b(this.d);
            throw e;
        } catch (RuntimeException e6) {
            e = e6;
            b(this.d);
            throw e;
        }
    }

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static void c(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        StringBuilder sb = new StringBuilder();
        sb.append("Extracting ");
        sb.append(fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Renaming to ");
                sb2.append(file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    b(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            b(inputStream);
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    public static SharedPreferences d(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    public static long l(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    public static long m(File file) throws IOException {
        long jC = f1s.c(file);
        return jC == -1 ? jC - 1 : jC;
    }

    public static boolean n(Context context, File file, long j, String str) {
        SharedPreferences sharedPreferencesD = d(context);
        if (sharedPreferencesD.getLong(str + "timestamp", -1L) == l(file)) {
            if (sharedPreferencesD.getLong(str + "crc", -1L) == j) {
                return false;
            }
        }
        return true;
    }

    public static void y(Context context, String str, long j, long j2, List<b> list) {
        SharedPreferences.Editor editorEdit = d(context).edit();
        editorEdit.putLong(str + "timestamp", j);
        editorEdit.putLong(str + "crc", j2);
        editorEdit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (b bVar : list) {
            editorEdit.putLong(str + "dex.crc." + i, bVar.f831a);
            editorEdit.putLong(str + "dex.time." + i, bVar.lastModified());
            i++;
        }
        editorEdit.commit();
    }

    public final void a() {
        File[] fileArrListFiles = this.c.listFiles(new a());
        if (fileArrListFiles == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to list secondary dex dir content (");
            sb.append(this.c.getPath());
            sb.append(").");
            return;
        }
        for (File file : fileArrListFiles) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Trying to delete old file ");
            sb2.append(file.getPath());
            sb2.append(" of size ");
            sb2.append(file.length());
            if (file.delete()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Deleted old file ");
                sb3.append(file.getPath());
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Failed to delete old file ");
                sb4.append(file.getPath());
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f.release();
        this.e.close();
        this.d.close();
    }

    public List<? extends File> o(Context context, String str, boolean z) throws IOException {
        List<b> listS;
        List<b> listP;
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor.load(");
        sb.append(this.f828a.getPath());
        sb.append(", ");
        sb.append(z);
        sb.append(", ");
        sb.append(str);
        sb.append(")");
        if (!this.f.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z && !n(context, this.f828a, this.f829b, str)) {
            try {
                listP = p(context, str);
            } catch (IOException unused) {
                listS = s();
                y(context, str, l(this.f828a), this.f829b, listS);
                listP = listS;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("load found ");
            sb2.append(listP.size());
            sb2.append(" secondary dex files");
            return listP;
        }
        listS = s();
        y(context, str, l(this.f828a), this.f829b, listS);
        listP = listS;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("load found ");
        sb3.append(listP.size());
        sb3.append(" secondary dex files");
        return listP;
    }

    public final List<b> p(Context context, String str) throws IOException {
        String str2 = this.f828a.getName() + ".classes";
        SharedPreferences sharedPreferencesD = d(context);
        int i = sharedPreferencesD.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + (-1));
        int i2 = 2;
        while (i2 <= i) {
            b bVar = new b(this.c, str2 + i2 + ".zip");
            if (!bVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
            bVar.f831a = m(bVar);
            long j = sharedPreferencesD.getLong(str + "dex.crc." + i2, -1L);
            long j2 = sharedPreferencesD.getLong(str + "dex.time." + i2, -1L);
            long jLastModified = bVar.lastModified();
            if (j2 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesD;
                if (j == bVar.f831a) {
                    arrayList.add(bVar);
                    i2++;
                    sharedPreferencesD = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j2 + ", modification time: " + jLastModified + ", expected crc: " + j + ", file crc: " + bVar.f831a);
        }
        return arrayList;
    }

    public final List<b> s() throws IOException {
        String str = this.f828a.getName() + ".classes";
        a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f828a);
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("classes");
            int i = 2;
            sb.append(2);
            sb.append(".dex");
            ZipEntry entry = zipFile.getEntry(sb.toString());
            while (entry != null) {
                b bVar = new b(this.c, str + i + ".zip");
                arrayList.add(bVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Extraction is needed for file ");
                sb2.append(bVar);
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    c(zipFile, entry, bVar, str);
                    try {
                        bVar.f831a = m(bVar);
                        z = true;
                    } catch (IOException unused) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Failed to read crc from ");
                        sb3.append(bVar.getAbsolutePath());
                        z = false;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Extraction ");
                    sb4.append(z ? "succeeded" : "failed");
                    sb4.append(" '");
                    sb4.append(bVar.getAbsolutePath());
                    sb4.append("': length ");
                    sb4.append(bVar.length());
                    sb4.append(" - crc: ");
                    sb4.append(bVar.f831a);
                    if (!z) {
                        bVar.delete();
                        if (bVar.exists()) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Failed to delete corrupted secondary dex '");
                            sb5.append(bVar.getPath());
                            sb5.append("'");
                        }
                    }
                }
                if (!z) {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
                i++;
                entry = zipFile.getEntry("classes" + i + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }
}
