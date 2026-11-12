package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qdv implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("queryMode")
    private int f46035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("hasDetails")
    private boolean f46036c;

    @SerializedName("domains")
    private List<String> d;

    @SerializedName("weekStartDay")
    private int e;

    public qdv() {
        this.d = new ArrayList();
        this.e = 1;
        this.f46035b = 1;
    }

    public qdv(List<String> list, boolean z) {
        this.d = new ArrayList();
        this.e = 1;
        this.f46035b = 1;
        this.f46036c = z;
        a(list);
    }

    public qdv(List<String> list, boolean z, int i) {
        this.d = new ArrayList();
        this.f46035b = 1;
        this.f46036c = z;
        this.e = i;
        a(list);
    }

    private void a(List<String> list) {
        if (CollectionUtils.a(list)) {
            return;
        }
        this.d = list;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataStat/highlights/getHighlights";
    }
}
