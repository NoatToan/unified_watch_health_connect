package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class snm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("hasMore")
    private boolean f48421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("audioWorkoutList")
    private List<sni> f48422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("resultCode")
    private String f48423c;

    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private int d;

    @SerializedName("recommendMore")
    private List<snv> e;

    @SerializedName("resultDesc")
    private String f;

    @SerializedName("topicBackLargeImgUrl")
    private String g;

    @SerializedName("topicBackImgUrl")
    private String h;

    @SerializedName("topicDesc")
    private String i;

    @SerializedName("subTitle")
    private String j;

    @SerializedName("total")
    private int k;

    @SerializedName("topicName")
    private String l;

    public String c() {
        return this.l;
    }

    public String d() {
        return this.f48423c;
    }

    public String b() {
        return this.f;
    }

    public int a() {
        return this.k;
    }

    public List<sni> e() {
        return this.f48422b;
    }

    public String toString() {
        return "AudioWorkoutByTopicIdRsp{resultCode='" + this.f48423c + "', resultDesc='" + this.f + "', total=" + this.k + ", pageSize=" + this.d + ", hasMore=" + this.f48421a + ", topicName=" + this.l + ", topicDesc=" + this.i + ", subTitle=" + this.j + ", topicBackImgUrl=" + this.h + ", topicBackLargeImgUrl=" + this.g + ", audioWorkoutList=" + this.f48422b + ", recommendMore=" + this.e + '}';
    }
}
