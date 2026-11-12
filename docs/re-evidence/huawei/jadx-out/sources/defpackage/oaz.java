package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class oaz extends oaw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("action")
    private int f44024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("deviceId")
    private String f44025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("language")
    private String f44026c;

    @SerializedName("country")
    private String d;

    @SerializedName("capabilities")
    private List<Integer> e;

    @SerializedName("timestamp")
    private long g;

    @SerializedName(ParsedFieldTag.MEDAL_ID)
    private String i;

    public int b() {
        return this.f44024a;
    }

    public long g() {
        return this.g;
    }

    public List<Integer> i() {
        return this.e;
    }

    public String j() {
        return this.i;
    }
}
