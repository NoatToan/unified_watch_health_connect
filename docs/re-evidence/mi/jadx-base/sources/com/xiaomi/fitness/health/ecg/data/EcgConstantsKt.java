package com.xiaomi.fitness.health.ecg.data;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003\u001a\b\u0010\u000b\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"OAUTH_HLW_APP_ID", "", "PARAM_REPORT", "", "DEBUG_HOST", "ONLINE_HOST", "BETA_HOST", "environmentCode", "", "getHlwUrl", "type", "getHlwHost", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcgConstantsKt {

    @NotNull
    private static final String BETA_HOST = "https://api.995120.cn/static/hm505/mihealth-h5-beta";

    @NotNull
    private static final String DEBUG_HOST = "https://api-test.995120.cn/mihealth-h5";
    public static final long OAUTH_HLW_APP_ID = 2882303761520200290L;

    @NotNull
    private static final String ONLINE_HOST = "https://api.995120.cn/static/hm505/mihealth-h5";

    @NotNull
    public static final String PARAM_REPORT = "ecg_report";
    private static int environmentCode;

    private static final String getHlwHost() {
        int i = environmentCode;
        if (i == 0) {
            return ONLINE_HOST;
        }
        if (i != 1) {
            return i != 2 ? ONLINE_HOST : DEBUG_HOST;
        }
        return BETA_HOST;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final String getHlwUrl(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        String hlwHost = getHlwHost();
        switch (type.hashCode()) {
            case -1061932154:
                if (type.equals("ecg_report_detail")) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format("%s/authentication?toUrl=%s", Arrays.copyOf(new Object[]{hlwHost, "report"}, 2));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    return str;
                }
                break;
            case -859114102:
                if (type.equals("month_report_list")) {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String str2 = String.format("%s/authentication?toUrl=%s", Arrays.copyOf(new Object[]{hlwHost, "monthList"}, 2));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                    return str2;
                }
                break;
            case -673830069:
                if (type.equals("service_purchase")) {
                    StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                    String str3 = String.format("%s/authentication?toUrl=%s", Arrays.copyOf(new Object[]{hlwHost, "service"}, 2));
                    Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                    return str3;
                }
                break;
            case -139180229:
                if (type.equals("submit_report")) {
                    StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                    String str4 = String.format("%s/authentication?toUrl=%s", Arrays.copyOf(new Object[]{hlwHost, "ECGQuality"}, 2));
                    Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                    return str4;
                }
                break;
            case 137128189:
                if (type.equals("wechat_pay_referer")) {
                    return environmentCode == 2 ? "https://api-test.995120.cn" : "https://api.995120.cn";
                }
                break;
            case 404793140:
                if (type.equals("oauth_redirect_url")) {
                    StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                    String str5 = String.format("%s/authentication/", Arrays.copyOf(new Object[]{hlwHost}, 1));
                    Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                    return str5;
                }
                break;
        }
        return getHlwHost();
    }
}
