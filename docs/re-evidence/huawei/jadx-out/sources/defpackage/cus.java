package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.group.constants.GroupActivityBo;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cus extends CloudCommonReponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("totalCount")
    private int f31329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("pageNo")
    private int f31330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private int f31331c;

    @SerializedName("groupActivityList")
    private List<GroupActivityBo> d;

    @SerializedName("currentTime")
    private String e;

    public List<GroupActivityBo> b() {
        return this.d;
    }
}
