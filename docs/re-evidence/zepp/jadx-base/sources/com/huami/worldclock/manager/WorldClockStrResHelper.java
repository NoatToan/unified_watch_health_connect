package com.huami.worldclock.manager;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.worldclock.R;
import com.huami.worldclock.bean.WorldClockBean;
import com.huami.worldclock.bean.WorldClockCityBean;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\rJ\u001e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eR\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/worldclock/manager/WorldClockStrResHelper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/util/Locale;", "requestedLocale", "", "resourceId", "", "getLocaleStringResource", "Lcom/huami/worldclock/bean/WorldClockBean;", LargeWatchSkinActivity.KEY_BEAN, "getCity", "Lcom/huami/worldclock/bean/WorldClockCityBean;", "Ljava/util/TimeZone;", "timeZone", "timeZoneLocale", "calculateTimeZoneWithLocale", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class WorldClockStrResHelper {

    @NotNull
    public static final WorldClockStrResHelper INSTANCE = new WorldClockStrResHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "StringResHelper";

    private WorldClockStrResHelper() {
    }

    @NotNull
    public final String calculateTimeZoneWithLocale(@NotNull Context context, @NotNull TimeZone timeZone, @NotNull TimeZone timeZoneLocale) {
        String strValueOf;
        int offset = (timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) - timeZoneLocale.getOffset(Calendar.getInstance(timeZoneLocale).getTimeInMillis())) / 1000;
        int i = offset / 3600;
        int i2 = (offset % 3600) / 60;
        boolean z = i >= 0;
        if (z) {
            strValueOf = Intrinsics.stringPlus("+", Integer.valueOf(i));
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            strValueOf = String.valueOf(i);
        }
        if (i2 == 0) {
            return context.getString(R.string.world_clock_time_difference, strValueOf);
        }
        return context.getString(R.string.hour_minute, strValueOf, String.valueOf(Math.abs(i2)));
    }

    public final int getCity(@NotNull Context context, @NotNull WorldClockBean bean) {
        try {
            Resources resources = context.getResources();
            String city = bean.getCity();
            Locale locale = Locale.ENGLISH;
            if (city != null) {
                return resources.getIdentifier(Intrinsics.stringPlus("city_", city.toLowerCase(locale)), "string", context.getPackageName());
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception e) {
            HMLog.i(TAG, e.getMessage(), new Object[0]);
            return 0;
        }
    }

    @NotNull
    public final String getLocaleStringResource(@NotNull Context context, @NotNull Locale requestedLocale, int resourceId) {
        String string;
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                Configuration configuration = new Configuration(context.getResources().getConfiguration());
                configuration.setLocale(requestedLocale);
                string = context.createConfigurationContext(configuration).getText(resourceId).toString();
            } else {
                Resources resources = context.getResources();
                Configuration configuration2 = resources.getConfiguration();
                Locale locale = configuration2.locale;
                configuration2.locale = requestedLocale;
                resources.updateConfiguration(configuration2, null);
                String string2 = resources.getString(resourceId);
                configuration2.locale = locale;
                resources.updateConfiguration(configuration2, null);
                string = string2;
            }
            return string;
        } catch (Exception e) {
            HMLog.i(TAG, e.getMessage(), new Object[0]);
            return "";
        }
    }

    public final int getCity(@NotNull Context context, @NotNull WorldClockCityBean bean) {
        try {
            Resources resources = context.getResources();
            String city = bean.getCity();
            Locale locale = Locale.ENGLISH;
            if (city != null) {
                return resources.getIdentifier(Intrinsics.stringPlus("city_", city.toLowerCase(locale)), "string", context.getPackageName());
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception e) {
            HMLog.i(TAG, e.getMessage(), new Object[0]);
            return 0;
        }
    }
}
