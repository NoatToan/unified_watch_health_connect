package defpackage;

import android.os.FileObserver;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.haf.common.os.FileFilterUtils;
import com.huawei.haf.common.os.FileUtils;
import health.compact.a.DfxMonitorCenter;
import health.compact.a.LogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes22.dex */
final class bbi extends FileObserver {
    private static final Map<String, bbi> d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final baj f938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f939c;

    private bbi(baj bajVar, List<File> list, long j) {
        super(list, 524);
        this.f938b = bajVar;
        this.f939c = j;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.endsWith(".so") || str.endsWith(".apk")) {
            c(new b(i, str), 0L);
        }
    }

    private void c(Runnable runnable, long j) {
        DfxMonitorCenter.b(runnable, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [baj] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public void a(String str, int i) {
        IllegalStateException e;
        File fileEndsWith;
        File fileA = bbf.a().a(this.f938b);
        try {
            fileEndsWith = str.endsWith(".so");
            try {
                if (fileEndsWith != 0) {
                    new File(bbf.a().b(this.f938b), str);
                    a(this.f938b, this.f939c, (List<File>) null);
                } else if (str.endsWith(".apk")) {
                    bbf.a().d(this.f938b);
                    c(this.f938b, this.f939c, null);
                }
                try {
                    fileEndsWith = this.f938b;
                    b(fileEndsWith, fileA, this.f939c, 0L);
                } catch (IllegalStateException e2) {
                    e = e2;
                    fileEndsWith = fileA;
                    a(fileEndsWith, str, i);
                    Map<String, bbi> map = d;
                    if (map.isEmpty()) {
                        return;
                    }
                    map.clear();
                    LogUtil.d("Bundle_FileObserver", "Detected attacks and sabotage, ex=", LogUtil.c(e));
                    FileUtils.b(fileA);
                    LogUtil.e("Bundle_FileObserver", "!!! === exit by app kill self === !!!");
                    c(new b(0, null), 1000L);
                }
            } catch (IllegalStateException e3) {
                e = e3;
            }
        } catch (IllegalStateException e4) {
            e = e4;
            fileEndsWith = 0;
        }
    }

    private void a(File file, String str, int i) {
        if (LogUtil.c()) {
            return;
        }
        if (file.exists()) {
            LogUtil.b("Bundle_FileObserver", "module=", this.f938b.f(), ", path=", str, ", event=", Integer.valueOf(i), ", write=", Boolean.valueOf(file.canWrite()), ", read=", Boolean.valueOf(file.canRead()), ", execute=", Boolean.valueOf(file.canExecute()), ", length=", Long.valueOf(file.length()), ", time=", Long.valueOf(file.lastModified()));
            return;
        }
        LogUtil.b("Bundle_FileObserver", "module=", this.f938b.f(), ", path=", str, ", event=", Integer.valueOf(i));
    }

    static void d(baj bajVar) throws bbq {
        Map<String, bbi> map = d;
        if (map.containsKey(bajVar.f())) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        long jLastModified = bbf.a().a(bajVar).lastModified();
        try {
            c(bajVar, jLastModified, arrayList);
            a(bajVar, jLastModified, arrayList);
            bbi bbiVar = new bbi(bajVar, arrayList, jLastModified);
            map.put(bajVar.f(), bbiVar);
            bbiVar.startWatching();
        } catch (IllegalStateException e) {
            throw new bbq(-27, e);
        }
    }

    static void e(baj bajVar) {
        bbi bbiVarRemove = d.remove(bajVar.f());
        if (bbiVarRemove != null) {
            bbiVarRemove.stopWatching();
        }
    }

    public static boolean b(baj bajVar) {
        File fileA = bbf.a().a(bajVar);
        if (!fileA.exists()) {
            return false;
        }
        long jLastModified = fileA.lastModified();
        try {
            c(bajVar, jLastModified, null);
            a(bajVar, jLastModified, (List<File>) null);
            return true;
        } catch (IllegalStateException e) {
            LogUtil.e("Bundle_FileObserver", "verify module ", bajVar.f(), " fail. ex=", LogUtil.c(e));
            FileUtils.b(fileA);
            return false;
        }
    }

    private static void c(baj bajVar, long j, List<File> list) {
        b(bajVar, bbf.a().d(bajVar), j, bajVar.g());
        if (list != null) {
            list.add(bbf.a().c(bajVar));
        }
    }

    private static void a(baj bajVar, long j, List<File> list) {
        if (bajVar.o()) {
            File fileB = bbf.a().b(bajVar);
            List<baj.a.C0012a> listC = bajVar.b().c();
            File[] fileArrListFiles = fileB.listFiles(new FileFilterUtils.FileNotEqualsCollectFilter("ModuleLib.lock"));
            if (fileArrListFiles != null && fileArrListFiles.length != listC.size()) {
                throw new IllegalStateException(bajVar.f() + " exist unknown or missing file present.");
            }
            for (baj.a.C0012a c0012a : listC) {
                b(bajVar, new File(fileB, c0012a.c()), j, c0012a.d());
            }
            if (list != null) {
                list.add(fileB);
            }
        }
    }

    private static void b(baj bajVar, File file, long j, long j2) {
        if ((j2 <= 0 || !file.canWrite()) && file.length() == j2 && file.lastModified() == j) {
            return;
        }
        throw new IllegalStateException(bajVar.f() + " file '" + file.getName() + "' has been illegally modified or deleted.");
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f941c;
        private final int d;

        b(int i, String str) {
            this.f941c = str;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.f941c;
            if (str != null) {
                bbi.this.a(str, this.d);
            } else {
                Process.killProcess(Process.myPid());
            }
        }
    }
}
