package com.xiaomi.fitness.feedback.extentions;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u001a\b\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\"\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007\u001a\u001e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"HOST_OPERATION", "", "TAG", "getHost", "getFeedbackFAQUrl", "model", "wideTagId", "", "tagId", "moduleId", "feedback_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FeedbackWebUrlsKt {

    @NotNull
    private static final String HOST_OPERATION = "https://%swatch.iot.mi.com";

    @NotNull
    private static final String TAG = "FeedbackWebUrls";

    @NotNull
    public static final String getFeedbackFAQUrl(@Nullable String str, int i, int i2) {
        String host = getHost();
        if (str == null) {
            str = "";
        }
        return host + "/html/feedback-faq/index.html?model=" + str + "&wideTagId=" + i + "&tagId=" + i2 + "&tagContent=zzz#/";
    }

    public static /* synthetic */ String getFeedbackFAQUrl$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = "";
        }
        return getFeedbackFAQUrl(str, i, i2);
    }

    private static final String getHost() {
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Logger.i(TAG, "getHost: region = " + lowerCase);
        if (Intrinsics.areEqual(lowerCase, "cn")) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{""}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{lowerCase + "."}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    @NotNull
    public static final String getFeedbackFAQUrl(int i, int i2, int i3) {
        return getHost() + "/html/feedback-faq2/index.html?wideTagId=" + i + "&tagId=" + i2 + "#/" + i3 + ".md";
    }
}
