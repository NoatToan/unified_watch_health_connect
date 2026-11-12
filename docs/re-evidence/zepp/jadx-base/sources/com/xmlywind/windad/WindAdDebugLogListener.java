package com.xmlywind.windad;

/* JADX INFO: loaded from: classes22.dex */
public interface WindAdDebugLogListener {

    public enum WindAdLogLevel {
        WindLogLevelError,
        WindLogLevelWarning,
        WindLogLevelInformation,
        WindLogLevelDebug
    }

    void windAdDebugLog(String str, WindAdLogLevel windAdLogLevel);
}
