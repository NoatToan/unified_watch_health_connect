package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.openalliance.ad.constant.RewardMethods;

/* JADX INFO: loaded from: classes8.dex */
public class gfz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("title")
    private String f35047b;

    @SerializedName("aiDeclare")
    private String d;

    @SerializedName(RewardMethods.SHOW_CLOSE)
    private boolean e;

    public String a() {
        return this.f35047b;
    }

    public boolean b() {
        return this.e;
    }
}
