package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class pch extends CloudCommonReponse {

    @SerializedName("aiConfigInfos")
    private List<pcj> e;

    public List<pcj> a() {
        return this.e;
    }
}
