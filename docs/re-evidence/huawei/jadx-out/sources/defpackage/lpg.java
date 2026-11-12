package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes37.dex */
public class lpg extends CloudCommonReponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("fileUploadList")
    private List<lpa> f40593c;

    public List<lpa> c() {
        return this.f40593c;
    }
}
