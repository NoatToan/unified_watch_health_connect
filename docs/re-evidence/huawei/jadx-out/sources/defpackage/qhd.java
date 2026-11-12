package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;

/* JADX INFO: loaded from: classes15.dex */
public class qhd extends CloudCommonReponse {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("activeWeek")
    qhe f46228b;

    @SerializedName("perfectMonth")
    qhe d;

    @SerializedName("perfectWeek")
    qhe e;

    public qhe e() {
        return this.f46228b;
    }

    public qhe d() {
        return this.e;
    }

    public qhe a() {
        return this.d;
    }
}
