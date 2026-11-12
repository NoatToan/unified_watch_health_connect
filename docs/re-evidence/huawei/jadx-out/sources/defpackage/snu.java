package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class snu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("displayOrder")
    private int f48439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("audioWorkoutList")
    private List<sni> f48440c;

    @SerializedName(ParsedFieldTag.TASK_MODIFY_TIME)
    private long d;

    @SerializedName("name")
    private String e;

    public String toString() {
        return "Topic{name='" + this.e + "', displayOrder=" + this.f48439b + ", modifyTime=" + this.d + ", audioWorkoutList=" + this.f48440c + '}';
    }
}
