package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;

/* JADX INFO: loaded from: classes12.dex */
public class obd extends oaw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("capabilities")
    private int f44035a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.MEDAL_ID)
    private String f44036c;

    @SerializedName("resourceType")
    private int d;

    @SerializedName("action")
    private int e;

    public int b() {
        return this.f44035a;
    }

    public String i() {
        return this.f44036c;
    }
}
