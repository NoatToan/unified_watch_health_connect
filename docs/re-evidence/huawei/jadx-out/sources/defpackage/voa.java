package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class voa extends CloudCommonReponse {

    @SerializedName("authRelations")
    private List<voc> e;

    public List<voc> a() {
        return this.e;
    }
}
