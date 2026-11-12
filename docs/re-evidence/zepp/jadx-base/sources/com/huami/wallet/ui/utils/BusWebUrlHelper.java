package com.huami.wallet.ui.utils;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/huami/wallet/ui/utils/BusWebUrlHelper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "isMiDevice", "", "getBusFAQWebUrl", "a", "Ljava/lang/String;", "DOOR_MI_FIT_PACKAGE_NAME", "b", "BUS_CARD_QA_URL_MI", "c", "BUS_CARD_QA_URL_MI_FIT", GoogleApiAvailabilityLight.a, "BUS_CARD_QA_URL_MI_DONG", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BusWebUrlHelper {

    @NotNull
    public static final BusWebUrlHelper INSTANCE = new BusWebUrlHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String DOOR_MI_FIT_PACKAGE_NAME = "com.xiaomi.hm.health";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String BUS_CARD_QA_URL_MI = "https://help.jr.mi.com/?app=com.mipay.wallet#/e/ESPORT_FAQ_BUS";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String BUS_CARD_QA_URL_MI_FIT = "https://api-mifit-cn.huami.com/pages/mifitBusCardHelp";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String BUS_CARD_QA_URL_MI_DONG = "https://api-mifit-cn.huami.com/pages/mifit_buscard_faq";

    private BusWebUrlHelper() {
    }

    @NotNull
    public final String getBusFAQWebUrl(@NotNull Context context, boolean isMiDevice) {
        if (!isMiDevice) {
            return Intrinsics.areEqual(context.getPackageName(), "com.xiaomi.hm.health") ? BUS_CARD_QA_URL_MI_FIT : BUS_CARD_QA_URL_MI_DONG;
        }
        context.getPackageName();
        return "https://help.jr.mi.com/?app=com.mipay.wallet#/e/ESPORT_FAQ_BUS";
    }
}
