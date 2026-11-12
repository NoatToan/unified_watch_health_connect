package com.xiaomi.hm.health.utils;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.util.ThirdPartUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/utils/ProductionUtil;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "initPackageName", "", "a", "Ljava/lang/String;", "PRODUCTION_ZEPP", "b", "PRODUCTION_AMAZFIT", "c", "APP_NAME_ZEPP", GoogleApiAvailabilityLight.a, "APP_NAME_AMAZFIT", "e", "SOCIAL_ZEPP", "f", "SOCIAL_AMAZFIT", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ProductionUtil {

    @NotNull
    public static final ProductionUtil INSTANCE = new ProductionUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String PRODUCTION_ZEPP = "midong";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String PRODUCTION_AMAZFIT = "amazfit";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String APP_NAME_ZEPP = "com.huami.midong";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String APP_NAME_AMAZFIT = "com.huami.app.amazfit";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String SOCIAL_ZEPP = "watch";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String SOCIAL_AMAZFIT = "amazfit";

    private ProductionUtil() {
    }

    @JvmStatic
    public static final void initPackageName(@NotNull Context context) {
        String str = "amazfit";
        if (!Intrinsics.areEqual("midong", "midong")) {
            if (Intrinsics.areEqual("midong", "amazfit")) {
                Cloud.SysParams.setAppName("com.huami.app.amazfit");
            }
            HMAppConfig.init(context, Long.parseLong(ThirdPartUtil.getXiaomiId()), Cloud.SysParams.APP_NAME, str);
        }
        Cloud.SysParams.setAppName("com.huami.midong");
        str = "watch";
        HMAppConfig.init(context, Long.parseLong(ThirdPartUtil.getXiaomiId()), Cloud.SysParams.APP_NAME, str);
    }
}
