package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class vhw implements IRequest {

    @SerializedName("foodIds")
    private final List<String> d;

    public vhw(List<String> list) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        arrayList.clear();
        arrayList.addAll(list);
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/healthExpansion/food/list";
    }
}
