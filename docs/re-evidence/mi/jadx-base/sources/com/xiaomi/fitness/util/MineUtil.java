package com.xiaomi.fitness.util;

import android.content.Context;
import android.content.res.Configuration;
import com.mi.health.course.export.data.AidongVipUserInfo;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.m0j;
import defpackage.pji;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/util/MineUtil;", "", "<init>", "()V", "LINK_XIAOMI_TV_PAYMENT", "", "mDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getMedalImgRatio", "", "medalClass", "", "isSystemNightMode", "", "context", "Landroid/content/Context;", "getAidongMemberPlanStatus", "userInfo", "Lcom/mi/health/course/export/data/AidongVipUserInfo;", "goToAidongMemberPaymentPage", "", "isPlayChannel", "()Z", "isGlobalRegion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MineUtil {

    @NotNull
    private static final String LINK_XIAOMI_TV_PAYMENT = "http://h5-test.sys.tv.mi.com/lubanActivity/index.html?id=553";

    @Nullable
    private static CommonDialog<?> mDialog;

    @NotNull
    public static final MineUtil INSTANCE = new MineUtil();
    private static final boolean isPlayChannel = AppUtil.INSTANCE.isPlayChannel();
    private static final boolean isGlobalRegion = !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE));

    private MineUtil() {
    }

    @NotNull
    public final String getAidongMemberPlanStatus(@NotNull AidongVipUserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        if (!userInfo.isVip()) {
            return ResourceExtKt.getString(m0j.g);
        }
        if (userInfo.getServerTime() >= userInfo.getDueTime()) {
            return ResourceExtKt.getString(m0j.e);
        }
        return ResourceExtKt.getString(m0j.f, TimeDateUtil.getDateYYYYMMddLocalFormat(userInfo.getDueTime() * ((long) 1000)));
    }

    public final float getMedalImgRatio(int medalClass) {
        if (medalClass != 1) {
            return medalClass != 3 ? 1.0f : 1.03f;
        }
        return 1.25f;
    }

    public final void goToAidongMemberPaymentPage() {
        WebViewUtilKt.startWebView$default(LINK_XIAOMI_TV_PAYMENT, ResourceExtKt.getString(m0j.J), false, false, Integer.valueOf(pji.d), false, null, false, 236, null);
    }

    public final boolean isGlobalRegion() {
        return isGlobalRegion;
    }

    public final boolean isPlayChannel() {
        return isPlayChannel;
    }

    public final boolean isSystemNightMode(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "getConfiguration(...)");
        return (configuration.uiMode & 48) == 32;
    }
}
