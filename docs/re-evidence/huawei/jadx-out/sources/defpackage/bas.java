package defpackage;

import android.content.Context;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
final class bas implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f906a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection<baj> f907c;
    private final Collection<File> d;

    bas(Context context, Collection<baj> collection, Collection<File> collection2) {
        this.f906a = context;
        this.f907c = collection == null ? Collections.EMPTY_LIST : collection;
        this.d = collection2 == null ? Collections.EMPTY_LIST : collection2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f907c.isEmpty()) {
            ProcessUtil.a();
            for (baj bajVar : this.f907c) {
                LogUtil.b("Bundle_DeleteTask", bajVar.f(), " need uninstalled, try delete its files");
                FileUtils.d(bbf.a().i(bajVar));
            }
        }
        Iterator<baj> it = baq.a().c(this.f906a).iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        for (File file : this.d) {
            LogUtil.b("Bundle_DeleteTask", file.getName(), " is obsolete directory, try delete it.");
            FileUtils.d(file);
        }
    }

    private static void a(baj bajVar) {
        File fileI = bbf.a().i(bajVar);
        final File fileC = bbf.a().c(bajVar);
        final File fileA = bbf.a().a(bajVar);
        final String name = fileI.getName();
        File[] fileArrListFiles = fileI.listFiles(new FileFilter() { // from class: bas.4
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                if (!file.isDirectory() || file.equals(fileC)) {
                    return false;
                }
                LogUtil.b("Bundle_DeleteTask", name, "_", file.getName(), " has been installed.");
                return fileA.exists();
            }
        });
        if (fileArrListFiles != null) {
            if (fileArrListFiles.length <= 1) {
                return;
            }
            Arrays.sort(fileArrListFiles, new e());
            for (int i = 1; i < fileArrListFiles.length; i++) {
                LogUtil.b("Bundle_DeleteTask", name, "_", fileArrListFiles[i].getName(), " is redundant, try delete it.");
                FileUtils.d(fileArrListFiles[i]);
            }
        }
    }

    static Collection<baj> e(Context context) {
        Collection<baj> collectionC = baq.a().c(context);
        ArrayList arrayList = new ArrayList(collectionC.size());
        for (baj bajVar : collectionC) {
            if (bbf.a().h(bajVar).exists() && FileUtils.b(bbf.a().a(bajVar))) {
                arrayList.add(bajVar);
            }
        }
        return arrayList;
    }

    static Collection<File> d(String str, Context context, bba bbaVar, boolean z) {
        final File fileC = bbf.a().c();
        File[] fileArrListFiles = fileC.getParentFile().listFiles(new FileFilter() { // from class: bas.5
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return file.isDirectory() && !file.equals(fileC);
            }
        });
        if (CollectionUtils.d(fileArrListFiles)) {
            return Collections.EMPTY_LIST;
        }
        if (z) {
            if (fileArrListFiles.length > 1) {
                Arrays.sort(fileArrListFiles, new e());
            }
            e(str, context, bbaVar, new bbf(fileArrListFiles[0]));
        }
        return Arrays.asList(fileArrListFiles);
    }

    private static void e(String str, Context context, bba bbaVar, bbf bbfVar) {
        bbf bbfVarA = bbf.a();
        for (baj bajVar : baq.a().c(context)) {
            if (!bbfVarA.a(bajVar).exists() && bbfVar.a(bajVar).exists() && !bbfVar.h(bajVar).exists()) {
                try {
                    bbaVar.b(bbfVar.d(bajVar), bajVar);
                    File fileC = bbfVarA.c(bajVar);
                    if (fileC.delete() && bbfVar.c(bajVar).renameTo(fileC)) {
                        LogUtil.b(str, bajVar.f(), File.separator, bajVar.h(), " is verify ok, try reuse it.");
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    static class e implements Comparator<File> {
        private e() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            if (file.lastModified() < file2.lastModified()) {
                return 1;
            }
            return file.lastModified() == file2.lastModified() ? 0 : -1;
        }
    }
}
