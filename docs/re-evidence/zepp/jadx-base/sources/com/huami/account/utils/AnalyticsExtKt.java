package com.huami.account.utils;

import com.huami.account.AccountStatEvent;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000¨\u0006\u0007"}, d2 = {"", "provider", "", "success", "code", "", "analyticsLoginResult", "accountui_release"}, k = 2, mv = {1, 5, 1})
public final class AnalyticsExtKt {
    public static final void analyticsLoginResult(@NotNull String str, boolean z, @NotNull String str2) {
        if (Intrinsics.areEqual("wechat", str)) {
            Analytics.recordEvent(new CountEventBuilder("Login_Result").setValue(z ? "WeixinSuccess" : "WeixinFail"));
        } else if (Intrinsics.areEqual("xiaomi", str)) {
            Analytics.recordEvent(new CountEventBuilder("Login_Result").setValue(z ? "XiaomiSuccess" : "XiaomiFail"));
        }
        Analytics.recordEvent(new CountEventBuilder(AccountStatEvent.EVENT_SIGN_IN_RESULT).putExtras(r.mapOf(TuplesKt.to("Result", z ? "Success" : "Fail"), TuplesKt.to("Source", str), TuplesKt.to("Code", str2))));
    }
}
