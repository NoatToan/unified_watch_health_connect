package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class vyw extends CloudCommonReponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("shoppingInfoItems")
    private List<vzg> f51717c = new ArrayList();

    @SerializedName("pagination")
    private vzd e = new vzd();

    public List<vzg> d() {
        return this.f51717c;
    }

    public vzd a() {
        return this.e;
    }
}
