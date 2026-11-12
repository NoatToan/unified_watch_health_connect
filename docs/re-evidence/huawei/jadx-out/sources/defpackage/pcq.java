package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;

/* JADX INFO: loaded from: classes41.dex */
public class pcq extends CloudCommonReponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("percentRank")
    private double f45177c;

    @SerializedName("topRank")
    private int d;

    public int e() {
        return this.d;
    }
}
