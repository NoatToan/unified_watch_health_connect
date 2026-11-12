package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class gdq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("hotPathOperationInfo")
    private gdr f34944a;

    @SerializedName("motionPathStartTime")
    private Long d;

    @SerializedName("timeZone")
    private String e;

    public Long b() {
        return this.d;
    }

    public gdr d() {
        return this.f34944a;
    }

    public String toString() {
        return "HotPathParticipateHistory{motionPathStartTime=" + this.d + ", timeZone='" + this.e + "', hotPathOperationInfo=" + this.f34944a + '}';
    }
}
