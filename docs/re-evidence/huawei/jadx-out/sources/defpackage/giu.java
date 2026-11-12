package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class giu implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("actionId")
    private String f35230b;

    public giu(String str) {
        this.f35230b = str;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.ac();
    }
}
