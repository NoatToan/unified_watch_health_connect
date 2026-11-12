package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gdb extends CloudCommonReponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("userFeedbackInfos")
    private List<gdt> f34917a;

    @SerializedName("totalSize")
    private int e;

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        return "GetFeedbackInfosRsp{userFeedbackInfos=" + this.f34917a + ", totalSize=" + this.e + '}';
    }
}
