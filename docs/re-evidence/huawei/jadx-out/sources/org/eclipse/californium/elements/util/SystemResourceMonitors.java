package org.eclipse.californium.elements.util;

import defpackage.aaex;
import java.io.File;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes46.dex */
public class SystemResourceMonitors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f44511a = aaex.a((Class<?>) SystemResourceMonitors.class);

    public interface SystemResourceCheckReady {
        void ready(boolean z);
    }

    public interface SystemResourceMonitor {
        void checkForUpdate(SystemResourceCheckReady systemResourceCheckReady);
    }

    public static abstract class FileMonitor implements SystemResourceMonitor {
        private final File file;
        private volatile b values;

        protected abstract void update(b bVar, SystemResourceCheckReady systemResourceCheckReady);

        public static class b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final long f44512c;
            private final long e;

            private b(long j, long j2) {
                this.e = j;
                this.f44512c = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean e(b bVar) {
                return (this.e == bVar.e && this.f44512c == bVar.f44512c) ? false : true;
            }
        }

        public FileMonitor(String str) {
            this(new File(str));
        }

        public FileMonitor(File file) {
            this.file = file;
            this.values = readMonitoredValues();
        }

        private b readMonitoredValues() {
            return new b(this.file.lastModified(), this.file.length());
        }

        @Override // org.eclipse.californium.elements.util.SystemResourceMonitors.SystemResourceMonitor
        public void checkForUpdate(SystemResourceCheckReady systemResourceCheckReady) {
            b monitoredValues = readMonitoredValues();
            if (this.values.e(monitoredValues)) {
                try {
                    SystemResourceMonitors.f44511a.info("File {} changed!", this.file);
                    update(monitoredValues, systemResourceCheckReady);
                    return;
                } catch (RuntimeException e) {
                    ready(monitoredValues);
                    throw e;
                }
            }
            SystemResourceMonitors.f44511a.info("File {} unchanged.", this.file);
            systemResourceCheckReady.ready(false);
        }

        protected void ready(b bVar) {
            if (bVar != null) {
                this.values = bVar;
            }
        }
    }
}
