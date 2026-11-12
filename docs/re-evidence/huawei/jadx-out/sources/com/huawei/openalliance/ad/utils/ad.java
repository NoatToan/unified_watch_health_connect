package com.huawei.openalliance.ad.utils;

import com.huawei.openalliance.ad.hw;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ad {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f20392b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20391a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Comparator<File> f20393c = new Comparator<File>() { // from class: com.huawei.openalliance.ad.utils.ad.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            if (file.lastModified() < file2.lastModified()) {
                return -1;
            }
            return file.lastModified() == file2.lastModified() ? 0 : 1;
        }
    };

    public void a(File file, long j, List<File> list) {
        if (file == null || !file.exists() || !file.isDirectory() || j <= 0) {
            return;
        }
        this.f20392b = j;
        hw.b("DirCleaner", "cleanDir total: sizeToClean: %s", Long.valueOf(j));
        a(file, list);
    }

    private void a(File file, List<File> list) {
        int i = this.f20391a + 1;
        this.f20391a = i;
        if (i > 10) {
            hw.b("DirCleaner", "exceeds max depth");
            return;
        }
        if (file.isDirectory()) {
            if (hw.a()) {
                hw.a("DirCleaner", "clean dir: %s", ds.a(ai.h(file)));
            }
            File[] fileArrListFiles = file.listFiles();
            if (bm.a(fileArrListFiles)) {
                return;
            }
            List<File> listAsList = Arrays.asList(fileArrListFiles);
            Collections.sort(listAsList, this.f20393c);
            for (File file2 : listAsList) {
                if (file2.isDirectory()) {
                    a(file2);
                } else {
                    if (hw.a()) {
                        hw.a("DirCleaner", "clean file: %s", ds.a(ai.h(file)));
                    }
                    if (bm.a(list) || !list.contains(file2)) {
                        this.f20392b -= file2.length();
                        ai.a(file2);
                        if (this.f20392b <= 0) {
                            return;
                        }
                    } else {
                        hw.b("DirCleaner", "white list file, skip clean");
                    }
                }
            }
        }
    }

    private void a(File file) {
        a(file, null);
    }
}
