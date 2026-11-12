package defpackage;

import com.huawei.haf.dynamic.DynamicDexOptimizer;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
final class bat {
    static void e(baj bajVar, List<String> list, File file, boolean z) {
        if (bajVar.m()) {
            File fileE = bbf.a().e(bajVar);
            if (DynamicDexOptimizer.e(list, file, fileE, false)) {
                return;
            }
            bau.c(new a(bajVar, fileE));
        }
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final baj f911c;
        private final File d;

        a(baj bajVar, File file) {
            this.f911c = bajVar;
            this.d = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (DynamicDexOptimizer.b(this.d)) {
                return;
            }
            File fileD = bbf.a().d(this.f911c);
            if (fileD.exists()) {
                DynamicDexOptimizer.a(fileD, this.d);
            }
        }
    }
}
