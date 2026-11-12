package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;

/* JADX INFO: loaded from: classes10.dex */
public class lzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("errorCode")
    private int f41181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("appName")
    private String f41182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("installStatus")
    private int f41183c;

    @SerializedName("downloadProgress")
    private int d;

    @SerializedName("batteryLevel")
    private int e;

    @SerializedName("preInstalled")
    private int f;

    @SerializedName("packageName")
    private String g;

    @SerializedName("pkgMode")
    private int h;

    @SerializedName("type")
    private int i;

    @SerializedName(ParsedFieldTag.TASK_MODIFY_TIME)
    private long j;

    @SerializedName("version")
    private String l;

    @SerializedName("versionCode")
    private int m;

    public String d() {
        return this.g;
    }
}
