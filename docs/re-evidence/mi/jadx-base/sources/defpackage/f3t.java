package defpackage;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.entity.digitalkey.DisplayInformationInfo;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes3.dex */
public class f3t extends CommonResponseInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(TSMAuthContants.PARAM_DISPLAY_INFORMATION)
    public DisplayInformationInfo f17375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(TSMAuthContants.PARAM_PAYLOAD)
    public qzs f17376b;

    @SerializedName("expiration")
    public String c;

    public DisplayInformationInfo a() {
        return this.f17375a;
    }

    public qzs c() {
        return this.f17376b;
    }
}
