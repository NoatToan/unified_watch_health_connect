package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class DownloadOptions implements Serializable {
    private final String localPath;
    private final int memoryThreshold;
    private HttpRequest request;
    private boolean resume;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public DownloadOptions(HttpRequest httpRequest, String str) {
        this.request = httpRequest;
        this.localPath = str;
        this.resume = false;
        this.memoryThreshold = 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadOptions downloadOptions = (DownloadOptions) obj;
        return Objects.equals(this.request, downloadOptions.request) && Objects.equals(this.localPath, downloadOptions.localPath) && this.resume == downloadOptions.resume && this.memoryThreshold == downloadOptions.memoryThreshold;
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public int getMemoryThreshold() {
        return this.memoryThreshold;
    }

    public HttpRequest getRequest() {
        return this.request;
    }

    public boolean getResume() {
        return this.resume;
    }

    public int hashCode() {
        return Objects.hash(this.request, this.localPath, Boolean.valueOf(this.resume), Integer.valueOf(this.memoryThreshold));
    }

    public void setRequest(HttpRequest httpRequest) {
        this.request = httpRequest;
    }

    public void setResume(boolean z14) {
        this.resume = z14;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[request: ");
        sb3.append(RecordUtils.fieldToString(this.request));
        sb3.append(", localPath: ");
        com.google.protobuf.a.k(this.localPath, ", resume: ", sb3);
        sb3.append(RecordUtils.fieldToString(Boolean.valueOf(this.resume)));
        sb3.append(", memoryThreshold: ");
        sb3.append(RecordUtils.fieldToString(Integer.valueOf(this.memoryThreshold)));
        sb3.append("]");
        return sb3.toString();
    }

    public DownloadOptions(HttpRequest httpRequest, String str, boolean z14, int i14) {
        this.request = httpRequest;
        this.localPath = str;
        this.resume = z14;
        this.memoryThreshold = i14;
    }
}
