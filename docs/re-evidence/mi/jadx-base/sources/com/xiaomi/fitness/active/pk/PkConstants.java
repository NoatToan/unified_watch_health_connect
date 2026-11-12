package com.xiaomi.fitness.active.pk;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u0005H\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/active/pk/PkConstants;", "", "<init>", "()V", "PARAM_INVITE_ID", "", "PARAM_INVITER_UID", "PARAM_SOURCE", "PARAM_PK_ID", "PARAM_PK_UID", "HOST_OPERATION_STAGING", "HOST_OPERATION", "pkInvitationUrlPattern", "getInvitePkUrl", PkConstants.PARAM_INVITE_ID, "", "getOperationHost", "getRegionStr", "region", "getRegionParamToReport", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PkConstants {

    @NotNull
    private static final String HOST_OPERATION = "https://%swatch.iot.mi.com";

    @NotNull
    private static final String HOST_OPERATION_STAGING = "https://st-watch.iot.mi.com";

    @NotNull
    public static final PkConstants INSTANCE = new PkConstants();

    @NotNull
    public static final String PARAM_INVITER_UID = "inviterUid";

    @NotNull
    public static final String PARAM_INVITE_ID = "inviteId";

    @NotNull
    public static final String PARAM_PK_ID = "pkId";

    @NotNull
    public static final String PARAM_PK_UID = "pkUid";

    @NotNull
    public static final String PARAM_SOURCE = "source";

    @NotNull
    private static final String pkInvitationUrlPattern = "%s/activity-competition.html?inviteId=%s&locale=%s&region=%s";

    private PkConstants() {
    }

    private final String getOperationHost() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isStaging()) {
            return HOST_OPERATION_STAGING;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{getRegionStr(lowerCase)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final String getRegionParamToReport(String region) {
        return Intrinsics.areEqual(region, "cn") ? "" : region;
    }

    private final String getRegionStr(String region) {
        if (Intrinsics.areEqual(region, "cn")) {
            return "";
        }
        return region + ".";
    }

    @NotNull
    public final String getInvitePkUrl(long inviteId) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String operationHost = getOperationHost();
        String strValueOf = String.valueOf(inviteId);
        String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = String.format(pkInvitationUrlPattern, Arrays.copyOf(new Object[]{operationHost, strValueOf, currentLocale$default, getRegionParamToReport(lowerCase)}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
