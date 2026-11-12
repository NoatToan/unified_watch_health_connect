package org.acra.startup;

import java.io.File;

/* JADX INFO: loaded from: classes23.dex */
public class Report {
    private final File a;
    private final boolean b;
    private boolean c = false;
    private boolean d = false;

    public Report(File file, boolean z) {
        this.a = file;
        this.b = z;
    }

    public boolean a() {
        return this.d;
    }

    public void approve() {
        this.d = true;
    }

    public boolean b() {
        return this.c;
    }

    public void delete() {
        this.c = true;
    }

    public File getFile() {
        return this.a;
    }

    public boolean isApproved() {
        return this.b;
    }
}
