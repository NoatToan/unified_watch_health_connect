package com.xiaomi.fitness.devicesettings.base.worldclock;

import com.xiaomi.hm.health.bt.profile.worldclock.WorldTime;
import java.time.Instant;
import java.time.zone.ZoneRules;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockUtils;", "", "<init>", "()V", "convertTimeZoneItem2WorldTime", "Lcom/xiaomi/hm/health/bt/profile/worldclock/WorldTime;", "timeZoneItem", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/TimeZoneItem;", "position", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorldClockUtils {

    @NotNull
    public static final WorldClockUtils INSTANCE = new WorldClockUtils();

    private WorldClockUtils() {
    }

    @JvmStatic
    @NotNull
    public static final WorldTime convertTimeZoneItem2WorldTime(@NotNull TimeZoneItem timeZoneItem, int position) {
        Intrinsics.checkNotNullParameter(timeZoneItem, "timeZoneItem");
        WorldTime worldTime = new WorldTime();
        worldTime.setCity(timeZoneItem.c());
        worldTime.setCityCode(timeZoneItem.d());
        worldTime.setCountry(timeZoneItem.e());
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneItem.i());
        worldTime.setTimeZone(timeZone.getRawOffset());
        worldTime.setIndex(position);
        if (timeZone.useDaylightTime()) {
            boolean zInDaylightTime = timeZone.inDaylightTime(new Date());
            if (zInDaylightTime) {
                worldTime.setDaylightState(1);
            } else {
                worldTime.setDaylightState(2);
            }
            ZoneRules rules = timeZone.toZoneId().getRules();
            worldTime.setOffsetTransitionDateTime(rules.nextTransition(Instant.now()).getDateTimeBefore().atZone(timeZone.toZoneId()).toEpochSecond());
            if (zInDaylightTime) {
                worldTime.setDaylightDuration((int) (rules.previousTransition(Instant.now()).getDuration().getSeconds() / ((long) 60)));
            } else {
                worldTime.setDaylightDuration((int) (rules.nextTransition(Instant.now()).getDuration().getSeconds() / ((long) 60)));
            }
        } else {
            worldTime.setDaylightState(0);
        }
        return worldTime;
    }
}
