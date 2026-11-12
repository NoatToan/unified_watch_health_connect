package com.huami.worldclock.manager;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.huami.worldclock.bean.WorldClockBean;
import com.xiaomi.hm.health.bt.profile.worldclock.WorldTime;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/worldclock/manager/TransformHelper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/util/Locale;", "locale", "Lcom/huami/worldclock/bean/WorldClockBean;", "worldClockBean", "", "index", "Lcom/xiaomi/hm/health/bt/profile/worldclock/WorldTime;", "worldClockBeanToWorldTime", "worldTime", "worldTimeToWorldClockBean", "", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class TransformHelper {

    @NotNull
    public static final TransformHelper INSTANCE = new TransformHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "TransformHelper";

    private TransformHelper() {
    }

    @NotNull
    public final WorldTime worldClockBeanToWorldTime(@NotNull Context context, @NotNull Locale locale, @NotNull WorldClockBean worldClockBean, int index) {
        int i;
        TimeZone timeZone = TimeZone.getTimeZone(worldClockBean.getIdentifier());
        WorldClockStrResHelper worldClockStrResHelper = WorldClockStrResHelper.INSTANCE;
        int city = worldClockStrResHelper.getCity(context, worldClockBean);
        WorldTime worldTime = new WorldTime();
        worldTime.setTimeZone(timeZone.getRawOffset());
        worldTime.setCity(worldClockStrResHelper.getLocaleStringResource(context, locale, city));
        worldTime.setCountry("");
        boolean zUseDaylightTime = timeZone.useDaylightTime();
        if (!zUseDaylightTime) {
            i = 0;
        } else {
            if (!zUseDaylightTime) {
                throw new NoWhenBranchMatchedException();
            }
            TimeZoneHelper timeZoneHelper = TimeZoneHelper.INSTANCE;
            worldTime.setDaylightDuration(timeZoneHelper.getDaylightDuration(worldClockBean.getIdentifier()));
            worldTime.setOffsetTransitionDateTime(timeZoneHelper.getOffsetTransitionDateTime(worldClockBean.getIdentifier()));
            boolean zInDaylightTime = timeZone.inDaylightTime(new Date());
            if (zInDaylightTime) {
                i = 1;
            } else {
                if (zInDaylightTime) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 2;
            }
        }
        worldTime.setDaylightState(i);
        worldTime.setIndex(index);
        worldTime.setCityCode(worldClockBean.getCityCode());
        worldTime.setDisplay(index != 255);
        worldClockBean.setDaylightState(worldTime.getDaylightState());
        worldClockBean.setOffsetTransitionDateTime(worldTime.getOffsetTransitionDateTime());
        return worldTime;
    }

    @Nullable
    public final WorldClockBean worldTimeToWorldClockBean(@NotNull WorldTime worldTime, @Nullable Context context) {
        List<WorldClockBean> listManagerTimeZonesData;
        Object next;
        if (context == null || (listManagerTimeZonesData = TimeZonesJsonHelper.INSTANCE.managerTimeZonesData(context)) == null) {
            return null;
        }
        Iterator<T> it2 = listManagerTimeZonesData.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.areEqual(worldTime.getCityCode(), ((WorldClockBean) next).getCityCode()));
        WorldClockBean worldClockBean = (WorldClockBean) next;
        if (worldClockBean == null) {
            return null;
        }
        return worldClockBean.copy((255 & 1) != 0 ? worldClockBean.cityCN : null, (255 & 2) != 0 ? worldClockBean.city : null, (255 & 4) != 0 ? worldClockBean.mainCity : false, (255 & 8) != 0 ? worldClockBean.identifier : null, (255 & 16) != 0 ? worldClockBean.cityCode : null, (255 & 32) != 0 ? worldClockBean.daylightState : 0, (255 & 64) != 0 ? worldClockBean.offsetTransitionDateTime : 0L, (255 & 128) != 0 ? worldClockBean.isShow : false);
    }
}
