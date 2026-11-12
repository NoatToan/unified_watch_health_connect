package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class ubo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private int f49897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("pageNo")
    private int f49898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("moreFavoritesUrl")
    private String f49899c;

    @SerializedName("priority")
    private int d;

    @SerializedName("resultCode")
    private int e;

    @SerializedName("sleepAudios")
    private List<ubs> g;

    @SerializedName("resultDesc")
    private String i;

    @SerializedName("totalCount")
    private int j;

    public int c() {
        return this.d;
    }

    public String d() {
        return this.f49899c;
    }

    public int a() {
        return this.e;
    }

    public List<ubs> e() {
        return this.g;
    }

    public String toString() {
        return "SleepFavoritesModel{mPageSize=" + this.f49897a + ", mPageNo=" + this.f49898b + ", mResultCode=" + this.e + ", mResultDesc='" + this.i + "', mTotalCount=" + this.j + ", mSleepAudios=" + this.g + ", mMoreFavoritesUrl='" + this.f49899c + "'}";
    }
}
