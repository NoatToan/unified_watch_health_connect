package defpackage;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.entity.digitalkey.KeyTrackingInfo;

/* JADX INFO: loaded from: classes3.dex */
public class nxs extends CommonResponseInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("data")
    public KeyTrackingInfo f28552a;

    public KeyTrackingInfo a() {
        return this.f28552a;
    }
}
