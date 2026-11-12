package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class ffg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("dataDetails")
    private List<String> f33990a;

    @SerializedName("dataType")
    private String e;

    public String toString() {
        return "MainTargetSubDataDetail{mDataType=" + this.e + ", mDataDetailsList=" + this.f33990a + "}";
    }
}
