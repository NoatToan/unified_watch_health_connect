package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class czf extends CloudCommonReponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("toDoContentList")
    private List<ikw> f31522a;

    public List<ikw> d() {
        return this.f31522a;
    }
}
