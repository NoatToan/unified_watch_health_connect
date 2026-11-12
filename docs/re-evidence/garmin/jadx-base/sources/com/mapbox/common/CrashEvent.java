package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class CrashEvent implements Serializable {
    private final String appStartDate;
    private final HashMap<String, String> customData;
    private final boolean isSilent;
    private final String threadDetails;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public CrashEvent(boolean z14, String str, String str2, HashMap<String, String> map) {
        this.isSilent = z14;
        this.threadDetails = str;
        this.appStartDate = str2;
        this.customData = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CrashEvent crashEvent = (CrashEvent) obj;
        return this.isSilent == crashEvent.isSilent && Objects.equals(this.threadDetails, crashEvent.threadDetails) && Objects.equals(this.appStartDate, crashEvent.appStartDate) && Objects.equals(this.customData, crashEvent.customData);
    }

    public String getAppStartDate() {
        return this.appStartDate;
    }

    public HashMap<String, String> getCustomData() {
        return this.customData;
    }

    public boolean getIsSilent() {
        return this.isSilent;
    }

    public String getThreadDetails() {
        return this.threadDetails;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isSilent), this.threadDetails, this.appStartDate, this.customData);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[isSilent: ");
        sb3.append(RecordUtils.fieldToString(Boolean.valueOf(this.isSilent)));
        sb3.append(", threadDetails: ");
        com.google.protobuf.a.k(this.threadDetails, ", appStartDate: ", sb3);
        com.google.protobuf.a.k(this.appStartDate, ", customData: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.customData));
        sb3.append("]");
        return sb3.toString();
    }
}
