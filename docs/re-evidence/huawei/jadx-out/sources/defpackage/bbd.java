package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.os.FileFilterUtils;
import com.huawei.haf.common.os.FileLockHelper;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.security.SecurityUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import health.compact.a.LogUtil;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import ohos.ace.plugin.taskmanagerplugin.EventType;

/* JADX INFO: loaded from: classes22.dex */
final class bbd implements Closeable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f933c;
    private final File d;
    private final FileLockHelper e;

    bbd(File file, File file2) throws IOException {
        this.d = file;
        this.f933c = file2;
        this.e = FileLockHelper.d(new File(file2, "ModuleLib.lock"));
    }

    List<File> c(baj bajVar, boolean z) throws IOException {
        if (!this.e.b()) {
            throw new IllegalStateException("ModuleLibExtractor was closed");
        }
        File[] fileArrListFiles = this.f933c.listFiles(new FileFilterUtils.FileNotEqualsCollectFilter("ModuleLib.lock"));
        if (!z) {
            return a(fileArrListFiles, bajVar);
        }
        return c(fileArrListFiles, bajVar);
    }

    private List<File> c(File[] fileArr, baj bajVar) throws IOException {
        b(fileArr, bajVar.b().c());
        ZipFile zipFile = new ZipFile(this.d);
        try {
            return b(zipFile, bajVar);
        } finally {
            FileUtils.a(zipFile);
        }
    }

    private List<File> b(ZipFile zipFile, baj bajVar) throws IOException {
        String str = String.format(Locale.ENGLISH, "lib/%s/", bajVar.b().a());
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        ArrayList arrayList = new ArrayList(bajVar.b().c().size());
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            String name = zipEntryNextElement.getName();
            if (name.startsWith(str) && name.endsWith(".so")) {
                String strSubstring = name.substring(name.lastIndexOf(47) + 1);
                baj.a.C0012a c0012aD = d(strSubstring, bajVar.b().c());
                if (c0012aD == null) {
                    throw new IOException(String.format(Locale.ENGLISH, "Failed to find %s in module-info", strSubstring));
                }
                File file = new File(this.f933c, strSubstring);
                if (file.exists()) {
                    if (e(c0012aD, file)) {
                        arrayList.add(file);
                    } else {
                        FileUtils.j(file);
                        if (file.exists()) {
                            LogUtil.e("Bundle_LibExtractor", "Failed to delete corrupted lib file ", bbf.a(file));
                        }
                    }
                }
                if (!d(file, c0012aD, zipFile, zipEntryNextElement)) {
                    throw new IOException("Could not create lib file " + bbf.a(file));
                }
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    private boolean d(File file, baj.a.C0012a c0012a, ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        File fileCreateTempFile = File.createTempFile("tmp-" + c0012a.c(), "", bbf.a().e());
        boolean zE = false;
        int i = 0;
        while (i < 3 && !zE) {
            i++;
            try {
                InputStream inputStream = zipFile.getInputStream(zipEntry);
                try {
                    FileUtils.d(inputStream, fileCreateTempFile);
                    if (!fileCreateTempFile.renameTo(file)) {
                        LogUtil.e("Bundle_LibExtractor", "Failed to rename ", bbf.a(fileCreateTempFile), " to ", bbf.a(file));
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException unused) {
                LogUtil.e("Bundle_LibExtractor", "Failed to extract so :", c0012a.c(), ", attempts times : ", Integer.valueOf(i));
            }
            zE = e(c0012a, file);
            if (zE) {
                LogUtil.b("Bundle_LibExtractor", "Extraction ", zE ? "succeeded" : EventType.FAILED, " '", bbf.a(file), "': length ", Long.valueOf(file.length()));
                break;
            }
            FileUtils.j(file);
            if (file.exists()) {
                LogUtil.e("Bundle_LibExtractor", "Failed to delete extracted lib that has been corrupted ", bbf.a(file));
            }
        }
        FileUtils.j(fileCreateTempFile);
        return zE;
    }

    private boolean e(baj.a.C0012a c0012a, File file) {
        FileUtils.f(file);
        if (c0012a.d() != file.length()) {
            return false;
        }
        String strD = SecurityUtils.d(file);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.e("Bundle_LibExtractor", "checkLibSha256, get ", c0012a.c(), " sha-256 fail.");
            return true;
        }
        if (c0012a.b().equals(strD)) {
            return true;
        }
        LogUtil.e("Bundle_LibExtractor", "Failed to check ", c0012a.c(), " sha-256, excepted ", c0012a.b(), " but ", strD);
        return false;
    }

    private void b(File[] fileArr, List<baj.a.C0012a> list) {
        if (CollectionUtils.d(fileArr)) {
            return;
        }
        for (File file : fileArr) {
            if (d(file.getName(), list) == null) {
                FileUtils.e(file);
            }
        }
    }

    private baj.a.C0012a d(String str, List<baj.a.C0012a> list) {
        for (baj.a.C0012a c0012a : list) {
            if (c0012a.c().equals(str)) {
                return c0012a;
            }
        }
        return null;
    }

    private List<File> a(File[] fileArr, baj bajVar) throws IOException {
        try {
            return d(fileArr, bajVar.b().c());
        } catch (IOException unused) {
            return c(fileArr, bajVar);
        }
    }

    private List<File> d(File[] fileArr, List<baj.a.C0012a> list) throws IOException {
        if (CollectionUtils.d(fileArr)) {
            throw new IOException("Missing extracted lib file '" + bbf.a(this.f933c) + "'");
        }
        if (fileArr.length != list.size()) {
            throw new IOException("Unknown lib file present '" + bbf.a(this.f933c) + "'");
        }
        ArrayList arrayList = new ArrayList(fileArr.length);
        for (baj.a.C0012a c0012a : list) {
            File fileA = a(c0012a, fileArr);
            if (fileA == null) {
                throw new IOException(String.format(Locale.ENGLISH, "Invalid extracted lib: file %s is not existing!", c0012a.c()));
            }
            if (!e(c0012a, fileA)) {
                throw new IOException("Invalid extracted lib : file sha-256 is unmatched!");
            }
            arrayList.add(fileA);
        }
        LogUtil.b("Bundle_LibExtractor", "Existing lib files loaded, num=", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private File a(baj.a.C0012a c0012a, File[] fileArr) {
        for (File file : fileArr) {
            if (c0012a.c().equals(file.getName())) {
                return file;
            }
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.e.close();
    }
}
