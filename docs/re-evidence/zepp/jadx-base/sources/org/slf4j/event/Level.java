package org.slf4j.event;

import com.google.firebase.perf.FirebasePerformance;
import org.cybergarage.upnp.std.av.server.ContentDirectory;

/* JADX INFO: loaded from: classes23.dex */
public enum Level {
    ERROR(40, ContentDirectory.ERROR),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, FirebasePerformance.HttpMethod.TRACE);

    private int levelInt;
    private String levelStr;

    Level(int i, String str) {
        this.levelInt = i;
        this.levelStr = str;
    }

    public int toInt() {
        return this.levelInt;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.levelStr;
    }
}
