package com.xiaomi.hm.health.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huami.account.api.model.HMWebAccess;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.homepage.status.card.EventBusToListener;
import java.util.Calendar;

/* JADX INFO: loaded from: classes21.dex */
public class TimeChangedReceiver extends BroadcastReceiver {
    public static final String ACTION_SUMMARY_WINTER = "com.huami.android.intent.action.DAYLIGHT_CHANGED";
    private static final String b = "TimeChangedReceiver";
    private static long c = 0;
    private static int d = -1;
    private long a = 60000;

    public class a extends HMCallback {
        public final /* synthetic */ Calendar a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean onUIThread, final Calendar val$calendar) {
            super(onUIThread);
            this.a = val$calendar;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            HMLog.i(TimeChangedReceiver.b, "setDateTime time:" + this.a.getTime() + ",ret:" + result, new Object[0]);
        }
    }

    private static void a(final Calendar calendar) {
        HMLog.d(b, "setDateTime", new Object[0]);
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        if (hMDeviceManager == null) {
            return;
        }
        HMDeviceType hMDeviceType = HMDeviceType.EARBUD;
        if (hMDeviceManager.hasBound(hMDeviceType)) {
            setDeviceDateTime(hMDeviceType, calendar);
        }
        if (HMDeviceConfig.hasFeatureProDevice()) {
            setDeviceDateTime(HMDeviceType.MILI, calendar);
        }
    }

    public static void setDeviceDateTime(HMDeviceType deviceType, Calendar calendar) {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(deviceType);
        if (device == null || !device.isConnected()) {
            return;
        }
        device.setDateTime(calendar, new a(false, calendar));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        HMLog.i(b, "onReceive:" + intent, new Object[0]);
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        EventBusToListener.onEventMainThread(action);
        Calendar calendar = Calendar.getInstance();
        int rawOffset = calendar.getTimeZone().getRawOffset();
        long timeInMillis = calendar.getTimeInMillis();
        if (action.equals("android.intent.action.TIMEZONE_CHANGED")) {
            if (d != rawOffset) {
                a(Calendar.getInstance());
                d = rawOffset;
                return;
            }
            return;
        }
        if (!action.equals("android.intent.action.TIME_SET")) {
            if (!action.equals("android.intent.action.DATE_CHANGED") || Math.abs(timeInMillis - c) <= this.a) {
                return;
            }
            a(Calendar.getInstance());
            c = timeInMillis;
            return;
        }
        TimeUnitHelper.checkTimeUnit();
        if (Math.abs(timeInMillis - c) > this.a) {
            a(Calendar.getInstance());
            HMWebAccess.setHadFreshToken(false);
            c = timeInMillis;
        }
    }
}
