package defpackage;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.entity.digitalkey.GetMailboxConfigurationInfo;

/* JADX INFO: loaded from: classes3.dex */
public class hss extends CommonResponseInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("data")
    public GetMailboxConfigurationInfo f20417a;

    public GetMailboxConfigurationInfo a() {
        return this.f20417a;
    }
}
