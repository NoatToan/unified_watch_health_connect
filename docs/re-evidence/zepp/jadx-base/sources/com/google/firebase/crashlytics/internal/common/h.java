package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class h {
    private final String a;
    private final FileStore b;

    public h(String str, FileStore fileStore) {
        this.a = str;
        this.b = fileStore;
    }

    private File b() {
        return this.b.getCommonFile(this.a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e) {
            Logger.getLogger().e("Error creating marker: " + this.a, e);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
