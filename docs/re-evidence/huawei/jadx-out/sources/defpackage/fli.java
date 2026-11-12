package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;

/* JADX INFO: loaded from: classes29.dex */
public class fli {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("labelCategory")
    private int f34170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("description")
    private String f34171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("labelDisplayName")
    private String f34172c;

    @SerializedName("createTime")
    private long d;

    @SerializedName("labelName")
    private String e;

    @SerializedName(ParsedFieldTag.TASK_MODIFY_TIME)
    private long f;

    @SerializedName("serviceId")
    private int g;

    @SerializedName("labelThreshold")
    private flg i;

    public String e() {
        return this.e;
    }

    public flg a() {
        return this.i;
    }
}
