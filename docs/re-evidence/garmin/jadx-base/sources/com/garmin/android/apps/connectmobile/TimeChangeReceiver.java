package com.garmin.android.apps.connectmobile;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.settings.locale.LocaleUpdateWorker;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes7.dex */
public class TimeChangeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        DateTimeZone dateTimeZoneForTimeZone;
        ea2.a aVar;
        int i14 = gt2.c.f79010a;
        gt2.b.f79005a.h("TimeChangeReceiver").debug("Calling TimeChangeReceiver.onReceive()");
        TimeZone timeZone = TimeZone.getDefault();
        c22.j0 j0Var = c22.j0.f23099a;
        timeZone.getClass();
        try {
            dateTimeZoneForTimeZone = DateTimeZone.forTimeZone(timeZone);
            dateTimeZoneForTimeZone.getClass();
        } catch (IllegalArgumentException e4) {
            e4.getMessage();
            String[] availableIDs = TimeZone.getAvailableIDs(timeZone.getRawOffset());
            Date date = new Date();
            availableIDs.getClass();
            int length = availableIDs.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    int rawOffset = timeZone.getRawOffset();
                    int iAbs = (int) (Math.abs(timeZone.getRawOffset()) / ((double) DateTimeConstants.MILLIS_PER_HOUR));
                    int iAbs2 = (int) ((Math.abs(timeZone.getRawOffset()) / ((double) DateTimeConstants.MILLIS_PER_MINUTE)) % ((double) 60));
                    p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                    SimpleTimeZone simpleTimeZone = new SimpleTimeZone(rawOffset, String.format(Locale.ROOT, "GMT%c%02d:%02d", Arrays.copyOf(new Object[]{Character.valueOf(timeZone.getRawOffset() >= 0 ? '+' : '-'), Integer.valueOf(iAbs), Integer.valueOf(iAbs2)}, 3)));
                    simpleTimeZone.getID();
                    dateTimeZoneForTimeZone = DateTimeZone.forTimeZone(simpleTimeZone);
                    dateTimeZoneForTimeZone.getClass();
                    break;
                }
                TimeZone timeZone2 = TimeZone.getTimeZone(availableIDs[i15]);
                if (timeZone2.hasSameRules(timeZone) && timeZone.inDaylightTime(date) == timeZone2.inDaylightTime(date)) {
                    try {
                        DateTimeZone dateTimeZoneForTimeZone2 = DateTimeZone.forTimeZone(timeZone2);
                        timeZone2.getID();
                        dateTimeZoneForTimeZone2.getClass();
                        dateTimeZoneForTimeZone = dateTimeZoneForTimeZone2;
                        break;
                    } catch (IllegalArgumentException unused) {
                        continue;
                        i15++;
                    }
                }
                i15++;
            }
        }
        DateTimeZone.setDefault(dateTimeZoneForTimeZone);
        try {
            hk0.p.f();
            for (DeviceProfile deviceProfile : hk0.p.d()) {
                hk0.a aVarG = hk0.a.g(context);
                String macAddress = deviceProfile.getMacAddress();
                aVarG.getClass();
                if (!TextUtils.isEmpty(macAddress) && (aVar = (ea2.a) hk0.s.a().getCapability(macAddress, ea2.a.class)) != null) {
                    aVar.setCurrentTime(null);
                }
            }
            if (intent.getAction().equals("android.intent.action.TIMEZONE_CHANGED")) {
                LocaleUpdateWorker.f43431l.getClass();
                LocaleUpdateWorker.a.a(context);
                pj1.a.f137878b.getClass();
                pj1.a aVar2 = (pj1.a) pj1.a.f137879c.getValue();
                Context applicationContext = context.getApplicationContext();
                aVar2.getClass();
                applicationContext.getClass();
                ge1.b.T(aVar2.f137880a, null, null, new pj1.d(applicationContext, aVar2, null), 3);
            }
        } catch (Throwable unused2) {
            gt2.b.f79005a.h("TimeChangeReceiver").warn("GFDIService is not initialized, maybe it's because TimeChangeReceiver.onReceive() is executed before Application.onCreate()");
        }
    }
}
