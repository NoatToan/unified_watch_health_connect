package org.apache.commons.io;

import java.io.File;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public class FileCleaner {
    public static final FileCleaningTracker a = new FileCleaningTracker();

    @Deprecated
    public static synchronized void exitWhenFinished() {
        a.exitWhenFinished();
    }

    public static FileCleaningTracker getInstance() {
        return a;
    }

    @Deprecated
    public static int getTrackCount() {
        return a.getTrackCount();
    }

    @Deprecated
    public static void track(File file, Object obj) {
        a.track(file, obj);
    }

    @Deprecated
    public static void track(File file, Object obj, FileDeleteStrategy fileDeleteStrategy) {
        a.track(file, obj, fileDeleteStrategy);
    }

    @Deprecated
    public static void track(String str, Object obj) {
        a.track(str, obj);
    }

    @Deprecated
    public static void track(String str, Object obj, FileDeleteStrategy fileDeleteStrategy) {
        a.track(str, obj, fileDeleteStrategy);
    }
}
