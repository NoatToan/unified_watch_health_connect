package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class feu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("dataType")
    private String f33966b;

    @SerializedName("taskId")
    private String d;

    @SerializedName("dataDetails")
    private List<String> e;

    public String toString() {
        return "CustomTaskDetail{mTaskId=" + this.d + ", mDataType=" + this.f33966b + ", mDataDetailList=" + this.e + "}";
    }
}
