package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class pku extends CloudCommonReponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("totalCount")
    private int f45566c;

    @SerializedName("backgroundImages")
    private List<gye> e;

    public List<gye> b() {
        return this.e;
    }

    public int d() {
        return this.f45566c;
    }
}
