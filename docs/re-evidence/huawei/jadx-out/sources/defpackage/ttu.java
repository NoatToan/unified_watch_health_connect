package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;

/* JADX INFO: loaded from: classes43.dex */
public class ttu extends ttq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("reqSource")
    private int f49662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.KAKA_TASK_RULE)
    private int f49663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("taskScenarios")
    private int f49664c;

    @SerializedName("appVersion")
    private String d;

    @SerializedName("taskId")
    private String e;

    public void a(String str) {
        this.e = str;
    }

    public void c(int i) {
        this.f49664c = i;
    }

    public void e(int i) {
        this.f49663b = i;
    }

    public void a(int i) {
        this.f49662a = i;
    }
}
