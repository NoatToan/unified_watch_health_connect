package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class gdi extends CloudCommonReponse {

    @SerializedName("histories")
    private List<gdq> e;

    public List<gdq> a() {
        return this.e;
    }
}
