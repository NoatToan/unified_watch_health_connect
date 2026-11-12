package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;

/* JADX INFO: loaded from: classes19.dex */
public class vog extends CloudCommonReponse {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("codeCreatedUserId")
    private Long f51403b;

    @SerializedName("userAccount")
    private String d;

    public Long d() {
        return this.f51403b;
    }
}
