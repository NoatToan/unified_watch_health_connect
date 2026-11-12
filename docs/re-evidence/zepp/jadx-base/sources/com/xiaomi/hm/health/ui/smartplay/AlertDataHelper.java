package com.xiaomi.hm.health.ui.smartplay;

import android.text.TextUtils;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.device.feature.notification.data.AlertDataCompat;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xiaomi.hm.health.bt.profile.alert.NotificationInfo;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0004R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/AlertDataHelper;", "", "Lcom/huami/device/feature/notification/data/AlertDataCompat;", "alertData", "Lcom/xiaomi/hm/health/bt/profile/alert/NotificationInfo;", "getNotificationInfo", "", ContactSettingItemActivity.KEY_CONTACT, HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "getCallInfo", "getHangupInfo", "", "a", LogUtil.I, "CARE", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AlertDataHelper {

    @NotNull
    public static final AlertDataHelper INSTANCE = new AlertDataHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int CARE = 128;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMAlertMode.values().length];
            iArr[HMAlertMode.ALERT_SMS.ordinal()] = 1;
            iArr[HMAlertMode.ALERT_LOVE.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AlertDataHelper() {
    }

    @NotNull
    public final NotificationInfo getCallInfo(@NotNull String contact, @NotNull String phoneNumber) {
        return new NotificationInfo(0, 3, 0, null, null, contact, null, phoneNumber, !TextUtils.isEmpty(phoneNumber) ? 1 : 0, 93, null);
    }

    @NotNull
    public final NotificationInfo getHangupInfo() {
        return new NotificationInfo(0, 3, 2, null, null, null, null, null, 0, TypedValues.PositionType.TYPE_SIZE_PERCENT, null);
    }

    @NotNull
    public final NotificationInfo getNotificationInfo(@NotNull AlertDataCompat alertData) {
        int i;
        HMAlertModeExt hMAlertModeExt = alertData.getCom.xmlywind.sdk.common.Constants.EXT java.lang.String();
        HMAlertMode mode = hMAlertModeExt.getMode();
        int i2 = mode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? 250 : CARE;
        } else {
            i = 5;
        }
        int eventId = alertData.getEventId();
        if (eventId != 0 && eventId != 1) {
            if (eventId == 2) {
                return new NotificationInfo(hMAlertModeExt.getId(), 250, alertData.getEventId(), null, null, null, null, null, 0, 504, null);
            }
            throw new IllegalArgumentException("eventId is wrong");
        }
        int id = hMAlertModeExt.getId();
        String pkg = alertData.getPkg();
        String appName = hMAlertModeExt.getAppName();
        String str = appName == null ? "" : appName;
        String title = hMAlertModeExt.getTitle();
        String str2 = title == null ? "" : title;
        String message = hMAlertModeExt.getMessage();
        return new NotificationInfo(id, i, 0, pkg, str, str2, message == null ? "" : message, null, alertData.getSupportReply(), 132, null);
    }
}
