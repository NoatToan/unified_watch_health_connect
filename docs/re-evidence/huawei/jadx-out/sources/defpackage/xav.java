package defpackage;

import com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.ThirdPartyDataType;

/* JADX INFO: loaded from: classes20.dex */
public class xav {
    public static void e(ThirdPartyDataType.Platform platform, ThirdPartyDataType.DataType dataType, long j) {
        lua.e("THIRD_PARTY_SERVICE", ThirdPartyDataType.b(platform, dataType), j);
    }

    public static long a(ThirdPartyDataType.Platform platform, ThirdPartyDataType.DataType dataType) {
        return lua.c("THIRD_PARTY_SERVICE", ThirdPartyDataType.b(platform, dataType), 0L);
    }
}
