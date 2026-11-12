package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;

/* JADX INFO: loaded from: classes31.dex */
public class gwx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("dailyTaskCard")
    private gwr f36161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("taskCode")
    private String f36162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.TASK_TYPE)
    private int f36163c;

    @SerializedName("taskId")
    private int d;

    public int c() {
        return this.d;
    }

    public int e() {
        return this.f36163c;
    }

    public String d() {
        return this.f36162b;
    }

    public gwr a() {
        return this.f36161a;
    }
}
