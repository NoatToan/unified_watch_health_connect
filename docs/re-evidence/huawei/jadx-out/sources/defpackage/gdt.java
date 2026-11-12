package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;

/* JADX INFO: loaded from: classes29.dex */
public class gdt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("pathId")
    private String f34949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.TASK_MODIFY_TIME)
    private long f34950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("huid")
    private long f34951c;

    @SerializedName("feedbackDescription")
    private String d;

    @SerializedName("createTime")
    private long e;

    public String toString() {
        return "UserFeedbackInfo{pathId='" + this.f34949a + "', huid=" + this.f34951c + ", feedbackDescription='" + this.d + "', createTime=" + this.e + ", modifyTime=" + this.f34950b + '}';
    }
}
