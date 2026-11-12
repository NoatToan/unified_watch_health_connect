package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginfitnessadvice.course.EssenceVideoInfo;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class pdg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("resultCode")
    private int f45188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("totalCount")
    private int f45189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("essenceVideos")
    private List<EssenceVideoInfo> f45190c;

    @SerializedName("resultDesc")
    private String d;

    public String toString() {
        return "EssenceVideoResourceRsp{resultCode=" + this.f45188a + ", resultDesc='" + this.d + "', totalCount=" + this.f45189b + ", essenceVideos=" + this.f45190c + '}';
    }
}
