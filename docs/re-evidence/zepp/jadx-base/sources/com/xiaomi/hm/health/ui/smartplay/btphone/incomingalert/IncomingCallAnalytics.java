package com.xiaomi.hm.health.ui.smartplay.btphone.incomingalert;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.SettingType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/incomingalert/IncomingCallAnalytics;", "", "", "enable", "", "recordIncomingCallEnable", "show", "recordContactShowEvent", "", "time", "recordDelayTime", "pageOpen", "recordDelayItemClick", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;", "type", "recordUserSelect", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class IncomingCallAnalytics {

    @NotNull
    public static final IncomingCallAnalytics INSTANCE = new IncomingCallAnalytics();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SettingType.values().length];
            iArr[SettingType.BtPhone.ordinal()] = 1;
            iArr[SettingType.PhoneAlert.ordinal()] = 2;
            iArr[SettingType.None.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private IncomingCallAnalytics() {
    }

    public final void pageOpen() {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.CALL_VIEW_NUM));
    }

    public final void recordContactShowEvent(boolean show) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.CALL_SHOW_CONTACT_NAME_SWITCH).setValue(show ? "On" : "Off"));
    }

    public final void recordDelayItemClick() {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.CALL_DELAY_SETTING_VIEW_NUM));
    }

    public final void recordDelayTime(int time) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.CALL_OUT_DELAY_SETTING).setValue(time + SOAP.XMLNS));
    }

    public final void recordIncomingCallEnable(boolean enable) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.CALL_SWITCH).setValue(enable ? "On" : "Off"));
    }

    public final void recordUserSelect(@NotNull SettingType type) {
        String str;
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            str = "2";
        } else if (i == 2) {
            str = "1";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "0";
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.PHONE_CALL_SETTING).addExtra(StatEvent.PHONE_CALL_KEY_ID, str));
    }
}
