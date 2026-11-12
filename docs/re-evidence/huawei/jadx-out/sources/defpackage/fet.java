package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class fet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("dimensionId")
    private String f33964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("dataType")
    private String f33965c;

    @SerializedName("dataDetails")
    private List<String> d;

    public String toString() {
        return "DimensionDetail{mDimensionId=" + this.f33964b + ", mDataType=" + this.f33965c + ", mDataDetailList=" + this.d + "}";
    }
}
