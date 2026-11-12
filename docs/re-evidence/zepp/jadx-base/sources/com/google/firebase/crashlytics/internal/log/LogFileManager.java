package com.google.firebase.crashlytics.internal.log;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class LogFileManager {
    private static final String c = "userlog";
    private static final b d = new b();
    public static final int e = 65536;
    private final FileStore a;
    private com.google.firebase.crashlytics.internal.log.a b;

    public static final class b implements com.google.firebase.crashlytics.internal.log.a {
        private b() {
        }

        @Override // com.google.firebase.crashlytics.internal.log.a
        public byte[] a() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.log.a
        public void b() {
        }

        @Override // com.google.firebase.crashlytics.internal.log.a
        public void c(long j, String str) {
        }

        @Override // com.google.firebase.crashlytics.internal.log.a
        public void d() {
        }

        @Override // com.google.firebase.crashlytics.internal.log.a
        public String e() {
            return null;
        }
    }

    public LogFileManager(FileStore fileStore) {
        this.a = fileStore;
        this.b = d;
    }

    private File a(String str) {
        return this.a.getSessionFile(str, c);
    }

    public void b(File file, int i) {
        this.b = new com.google.firebase.crashlytics.internal.log.b(file, i);
    }

    public void clearLog() {
        this.b.b();
    }

    public byte[] getBytesForLog() {
        return this.b.a();
    }

    @Nullable
    public String getLogString() {
        return this.b.e();
    }

    public final void setCurrentSession(String str) {
        this.b.d();
        this.b = d;
        if (str == null) {
            return;
        }
        b(a(str), 65536);
    }

    public void writeToLog(long j, String str) {
        this.b.c(j, str);
    }

    public LogFileManager(FileStore fileStore, String str) {
        this(fileStore);
        setCurrentSession(str);
    }
}
