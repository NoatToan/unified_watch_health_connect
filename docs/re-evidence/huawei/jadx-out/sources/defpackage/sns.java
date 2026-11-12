package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.utils.CloudParamKeys;

/* JADX INFO: loaded from: classes43.dex */
public class sns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("laterVersionFlagDisabled")
    private boolean f48436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("clientVersions")
    private String f48437b;

    @SerializedName(CloudParamKeys.CLIENT_TYPE)
    private int e;

    public String toString() {
        return "ClientVersionInfo{clientType=" + this.e + ", clientVersions='" + this.f48437b + "', LaterVersionFlagDisabled='" + this.f48436a + "'}";
    }
}
