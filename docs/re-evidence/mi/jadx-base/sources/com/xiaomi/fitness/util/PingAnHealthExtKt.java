package com.xiaomi.fitness.util;

import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.export.PinganHealthConstantsKt;
import com.xiaomi.fitness.health.pinganhealth.DepartmentType;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import defpackage.c0j;
import defpackage.pni;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\n\u001a\u00020\u00012\b\b\u0001\u0010\u000b\u001a\u00020\f\u001a\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\f\u001a\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\f\u001a\u0014\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\b\b\u0001\u0010\u0010\u001a\u00020\f\u001a\u0014\u0010\u0015\u001a\u00020\u0013*\u00020\u00142\b\b\u0001\u0010\u0010\u001a\u00020\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"URL_PSYCHIATRY", "", "URL_OB_GYN", "URL_RESPIRATORY", "URL_ENDOCRINE", "URL_SPECIFIC", "URL_SLEEP", "URL_CARDIOLOGY", "URL_MY_ORDER", "URL_XIAOMI_PINGAN_AUTH_URL", "getDepartmentUrl", "departmentType", "", "getPingAnHealthCardOnlyModelList", "", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView$CardDataModel;", "depType", "getHealthVisitDoctorAndSleepBreathTemporaryStopCardModelList", "bindOneBanner", "", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "bindTwoBanners", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PingAnHealthExtKt {

    @NotNull
    public static final String URL_CARDIOLOGY = "https://account.xiaomi.com/oauth2/authorize?client_id=2882303761517261988&response_type=code&redirect_uri=https%3A%2F%2Fwww.jk.cn%2Flanding_unionlogin%3FappId%3D9226131%26redirectCode%3D009";

    @NotNull
    public static final String URL_ENDOCRINE = "https://account.xiaomi.com/oauth2/authorize?client_id=2882303761517261988&response_type=code&redirect_uri=https%3A%2F%2Fwww.jk.cn%2Flanding_unionlogin%3FappId%3D9226131%26redirectCode%3D005";

    @NotNull
    public static final String URL_MY_ORDER = "https://account.xiaomi.com/oauth2/authorize?client_id=2882303761517261988&response_type=code&redirect_uri=https%3A%2F%2Fwww.jk.cn%2Flanding_unionlogin%3FappId%3D9226131%26redirectCode%3D008";

    @NotNull
    public static final String URL_OB_GYN = "https://account.xiaomi.com/oauth2/authorize?client_id=2882303761517261988&response_type=code&redirect_uri=https%3A%2F%2Fwww.jk.cn%2Flanding_unionlogin%3FappId%3D9226131%26redirectCode%3D003";

    @NotNull
    public static final String URL_PSYCHIATRY = "https://account.xiaomi.com/oauth2/authorize?client_id=2882303761517261988&response_type=code&redirect_uri=https%3A%2F%2Fwww.jk.cn%2Flanding_unionlogin%3FappId%3D9226131%26redirectCode%3D002";

    @NotNull
    public static final String URL_RESPIRATORY = "https://account.xiaomi.com/oauth2/authorize?client_id=2882303761517261988&response_type=code&redirect_uri=https%3A%2F%2Fwww.jk.cn%2Flanding_unionlogin%3FappId%3D9226131%26redirectCode%3D004";

    @NotNull
    public static final String URL_SLEEP = "https://account.xiaomi.com/oauth2/authorize?client_id=2882303761517261988&response_type=code&redirect_uri=https%3A%2F%2Fwww.jk.cn%2Flanding_unionlogin%3FappId%3D9226131%26redirectCode%3D010";

    @NotNull
    public static final String URL_SPECIFIC = "https://account.xiaomi.com/oauth2/authorize?client_id=2882303761517261988&response_type=code&redirect_uri=https%3A%2F%2Fwww.jk.cn%2Flanding_unionlogin%3FappId%3D9226131%26redirectCode%3D007";

    @NotNull
    public static final String URL_XIAOMI_PINGAN_AUTH_URL = "https://watch.iot.mi.com/libai/pingan.html";

    public static final void bindOneBanner(@NotNull HealthBannerCardSetView healthBannerCardSetView, @DepartmentType int i) {
        Intrinsics.checkNotNullParameter(healthBannerCardSetView, "<this>");
        if (AppUtil.INSTANCE.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            ViewExtKt.gone(healthBannerCardSetView);
        } else {
            ExtUtilKt.visible(healthBannerCardSetView);
            healthBannerCardSetView.showCard(getPingAnHealthCardOnlyModelList(i));
        }
    }

    public static final void bindTwoBanners(@NotNull HealthBannerCardSetView healthBannerCardSetView, @DepartmentType int i) {
        Intrinsics.checkNotNullParameter(healthBannerCardSetView, "<this>");
        if (AppUtil.INSTANCE.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            ViewExtKt.gone(healthBannerCardSetView);
        } else {
            ExtUtilKt.visible(healthBannerCardSetView);
            healthBannerCardSetView.showCard(getHealthVisitDoctorAndSleepBreathTemporaryStopCardModelList(i));
        }
    }

    @NotNull
    public static final String getDepartmentUrl(@DepartmentType int i) {
        switch (i) {
            case 0:
                return URL_CARDIOLOGY;
            case 1:
                return URL_PSYCHIATRY;
            case 2:
                return URL_OB_GYN;
            case 3:
                return URL_RESPIRATORY;
            case 4:
                return URL_ENDOCRINE;
            case 5:
                return URL_SPECIFIC;
            case 6:
                return URL_MY_ORDER;
            case 7:
                return URL_SLEEP;
            default:
                return PinganHealthConstantsKt.PINGAN_XIAOMI_ACCOUNT;
        }
    }

    @NotNull
    public static final List<HealthBannerCardSetView.CardDataModel> getHealthVisitDoctorAndSleepBreathTemporaryStopCardModelList(@DepartmentType int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HealthBannerCardSetView.CardDataModel(ExtUtilKt.getString(c0j.po), ExtUtilKt.getString(c0j.qo), Integer.valueOf(pni.r0), i));
        if (i == 0) {
            arrayList.add(new HealthBannerCardSetView.CardDataModel(ExtUtilKt.getString(c0j.w4), ExtUtilKt.getString(c0j.oi), Integer.valueOf(pni.S0), (i * 10) + 8));
        } else if (i == 1 || i == 7) {
            arrayList.add(new HealthBannerCardSetView.CardDataModel(ExtUtilKt.getString(c0j.pi), ExtUtilKt.getString(c0j.oi), Integer.valueOf(pni.S0), (i * 10) + 8));
        }
        return arrayList;
    }

    @NotNull
    public static final List<HealthBannerCardSetView.CardDataModel> getPingAnHealthCardOnlyModelList(@DepartmentType int i) {
        return CollectionsKt__CollectionsKt.mutableListOf(new HealthBannerCardSetView.CardDataModel(ExtUtilKt.getString(c0j.po), ExtUtilKt.getString(c0j.qo), Integer.valueOf(pni.r0), i));
    }
}
