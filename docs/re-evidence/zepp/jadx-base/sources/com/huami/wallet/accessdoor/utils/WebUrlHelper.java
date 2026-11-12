package com.huami.wallet.accessdoor.utils;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0016\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0016\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0016\u0010\u0013\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/huami/wallet/accessdoor/utils/WebUrlHelper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "isMiDevice", "", "getFAQWebUrl", "a", "Ljava/lang/String;", "DOOR_MI_FIT_PACKAGE_NAME", "b", "DOOR_CARD_QA_URL_MI", "c", "DOOR_CARD_QA_URL_SELF_BRAND_MiFit", GoogleApiAvailabilityLight.a, "DOOR_CARD_QA_URL_SELF_BRAND_MI_DONG", "DOOR_CARD_SUPPORT_RANGE", "LIN_LI_LIN_WAI_DOOR_CARD_SUPPORT_RANGE", "XIANG_YUN_MEN_DOOR_CARD_SUPPORT_RANGE", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class WebUrlHelper {

    @NotNull
    public static final String DOOR_CARD_SUPPORT_RANGE = "https://api.huami.com/t/b6791";

    @NotNull
    public static final WebUrlHelper INSTANCE = new WebUrlHelper();

    @NotNull
    public static final String LIN_LI_LIN_WAI_DOOR_CARD_SUPPORT_RANGE = "https://api.huami.com/t/nfc.access.card.1";

    @NotNull
    public static final String XIANG_YUN_MEN_DOOR_CARD_SUPPORT_RANGE = "https://api.huami.com/t/nfc.access.card.2";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String DOOR_MI_FIT_PACKAGE_NAME = "com.xiaomi.hm.health";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String DOOR_CARD_QA_URL_MI = "https://help.jr.mi.com/?app=com.mipay.wallet#/e/ESPORT_FAQ_DOOR";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String DOOR_CARD_QA_URL_SELF_BRAND_MiFit = "https://api-mifit-cn.huami.com/pages/mifitAccessCardHelp";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String DOOR_CARD_QA_URL_SELF_BRAND_MI_DONG = "https://api-mifit-cn.huami.com/pages/mifit_doorcard_faq";

    private WebUrlHelper() {
    }

    @NotNull
    public final String getFAQWebUrl(@NotNull Context context, boolean isMiDevice) {
        if (isMiDevice) {
            return DOOR_CARD_QA_URL_MI;
        }
        return Intrinsics.areEqual(context.getPackageName(), "com.xiaomi.hm.health") ? DOOR_CARD_QA_URL_SELF_BRAND_MiFit : DOOR_CARD_QA_URL_SELF_BRAND_MI_DONG;
    }
}
