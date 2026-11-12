package defpackage;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.entity.digitalkey.RetryPolicy;

/* JADX INFO: loaded from: classes3.dex */
public class d1t extends CommonResponseInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("data")
    public RetryPolicy f14978a;

    public RetryPolicy a() {
        return this.f14978a;
    }
}
