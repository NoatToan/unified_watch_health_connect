package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wrz extends CloudCommonReponse {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("notifications")
    private List<wrv> f52389b;

    @SerializedName("hasMore")
    private int d;

    public int c() {
        if (CollectionUtils.a(this.f52389b)) {
            return 0;
        }
        return this.f52389b.size();
    }
}
