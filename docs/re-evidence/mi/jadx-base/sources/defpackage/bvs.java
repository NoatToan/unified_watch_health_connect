package defpackage;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.entity.digitalkey.NotificationTokenInfo;

/* JADX INFO: loaded from: classes3.dex */
public class bvs extends CommonResponseInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("data")
    public NotificationTokenInfo f4662a;

    public NotificationTokenInfo a() {
        return this.f4662a;
    }
}
