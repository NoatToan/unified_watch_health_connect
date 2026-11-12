package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vol extends CloudCommonReponse {

    @SerializedName("memberList")
    private List<voo> d;

    public List<voo> c() {
        return this.d;
    }
}
