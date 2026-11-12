package com.danikula.videocache;

import com.danikula.videocache.file.DiskUsage;
import com.danikula.videocache.file.FileNameGenerator;
import com.danikula.videocache.headers.HeaderInjector;
import com.danikula.videocache.sourcestorage.SourceInfoStorage;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
class a {
    public final File a;
    public final FileNameGenerator b;
    public final DiskUsage c;
    public final SourceInfoStorage d;
    public final HeaderInjector e;

    public a(File file, FileNameGenerator fileNameGenerator, DiskUsage diskUsage, SourceInfoStorage sourceInfoStorage, HeaderInjector headerInjector) {
        this.a = file;
        this.b = fileNameGenerator;
        this.c = diskUsage;
        this.d = sourceInfoStorage;
        this.e = headerInjector;
    }

    public File a(String str) {
        return new File(this.a, this.b.generate(str));
    }
}
