package defpackage;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.entity.digitalkey.GenerateSessionInfo;

/* JADX INFO: loaded from: classes3.dex */
public class vns extends CommonResponseInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("data")
    public GenerateSessionInfo f37073a;

    public GenerateSessionInfo a() {
        return this.f37073a;
    }
}
