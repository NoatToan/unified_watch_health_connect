package com.xiaomi.hm.health.healthdata.utils.headset;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.databases.model.HmProperty;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0002J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\nR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0016\u0010\u001a\u001a\u00020\u00188B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000e8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001e¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/healthdata/utils/headset/HeadsetSyncTimeKeeper;", "", "", "time", "", "timeZone", "", "e", "Lkotlin/Pair;", "b", "Ljava/util/Calendar;", "calendar", "setHearingHealthSyncTime", "getHearingHealthTime", "", "a", "Ljava/lang/String;", "TAG", "PROPERTY_SYNC_TIME", "c", "KEY_SYNC_TIME_HEARING_STATICS_INFO", GoogleApiAvailabilityLight.a, "KEY_SYNC_TIMEZONE_HEARING_STATICS_INFO", "KEY_SUFFIX", "Lcom/xiaomi/hm/health/databases/model/Device;", "()Lcom/xiaomi/hm/health/databases/model/Device;", "device", "", "()Z", "isSupportHearingHealthFeature", "()Ljava/lang/String;", "mac", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HeadsetSyncTimeKeeper {

    @NotNull
    public static final HeadsetSyncTimeKeeper INSTANCE = new HeadsetSyncTimeKeeper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "HeadsetKeeper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String PROPERTY_SYNC_TIME = "huami.mifit.user.settings.synctime";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_SYNC_TIME_HEARING_STATICS_INFO = "hearing_health_info_time";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_SYNC_TIMEZONE_HEARING_STATICS_INFO = "hearing_health_info_timezone";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_SUFFIX = "hearing_health";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Calendar a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Calendar calendar) {
            super(0);
            this.a = calendar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "get HearingHealth Time sync time is : " + this.a.getTime();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "No bound device for HearingHealth time";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "get invalid HearingHealth Time";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "No bound device for hearing health info";
        }
    }

    private HeadsetSyncTimeKeeper() {
    }

    private final Device a() {
        return HMDeviceManager.getInstance().getDeviceBound(HMDeviceType.HEADSET);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0015  */
    private final Pair<Long, Integer> b() throws JSONException {
        Pair<Long, Integer> pair;
        String str = "";
        String property = DeviceXFunctionsKt.getPropertyStoreApi().getProperty("huami.mifit.user.settings.synctime", "");
        if (property != null) {
            if (!(property.length() > 0)) {
                property = null;
            }
            if (property == null) {
                pair = null;
            } else {
                JSONObject jSONObject = new JSONObject(property);
                String strC = INSTANCE.c();
                if (strC != null) {
                    String str2 = strC + "_hearing_health";
                    if (str2 != null) {
                        str = str2;
                    }
                }
                if (jSONObject.has(str)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    pair = new Pair<>(Long.valueOf(jSONObject2.optLong(KEY_SYNC_TIME_HEARING_STATICS_INFO)), Integer.valueOf(jSONObject2.optInt(KEY_SYNC_TIMEZONE_HEARING_STATICS_INFO)));
                } else {
                    pair = new Pair<>(0L, null);
                }
            }
        } else {
            pair = null;
        }
        return pair == null ? new Pair<>(0L, null) : pair;
    }

    private final String c() {
        return HMDeviceManager.getInstance().getBoundDeviceAddress(HMDeviceType.HEADSET);
    }

    private final boolean d() {
        return HMDevicePropertyCache.INSTANCE.getInstance().getFeature(HMDeviceType.HEADSET).hasHeadset(2);
    }

    private final void e(long time, int timeZone) {
        String strC = c();
        if (strC == null) {
            return;
        }
        if (!(strC.length() > 0)) {
            strC = null;
        }
        if (strC == null) {
            return;
        }
        try {
            String str = strC + "_hearing_health";
            String property = DeviceXFunctionsKt.getPropertyStoreApi().getProperty("huami.mifit.user.settings.synctime", "");
            JSONObject jSONObject = property == null || property.length() == 0 ? new JSONObject() : new JSONObject(property);
            JSONObject jSONObject2 = jSONObject.has(str) ? jSONObject.getJSONObject(str) : new JSONObject();
            jSONObject2.put(KEY_SYNC_TIME_HEARING_STATICS_INFO, time);
            jSONObject2.put(KEY_SYNC_TIMEZONE_HEARING_STATICS_INFO, timeZone);
            jSONObject.put(str, jSONObject2);
            HMDaoManager.getInstance().getHmPropertyDao().insertOrReplace(new HmProperty("huami.mifit.user.settings.synctime", jSONObject.toString(), 1));
        } catch (Exception e2) {
            HMLog.info(TAG, new d(e2));
        }
    }

    @NotNull
    public final synchronized Calendar getHearingHealthTime() {
        Calendar calendar;
        long jLongValue;
        calendar = Calendar.getInstance();
        if (d()) {
            Pair<Long, Integer> pairB = b();
            if (pairB.getFirst().longValue() == 0 || pairB.getFirst().longValue() > System.currentTimeMillis()) {
                HMLog.info(TAG, c.a);
                jLongValue = a().getDevice_bind_time().longValue();
            } else {
                jLongValue = pairB.getFirst().longValue();
            }
            Integer second = pairB.getSecond();
            TimeZone timezone = second == null ? null : ProfileUtils.getTimezone((byte) second.intValue());
            if (timezone == null) {
                timezone = calendar.getTimeZone();
            }
            calendar.clear();
            calendar.setTimeInMillis(jLongValue);
            calendar.setTimeZone(timezone);
            HMLog.info(TAG, new a(calendar));
        } else {
            HMLog.info(TAG, b.a);
        }
        return calendar;
    }

    public final synchronized void setHearingHealthSyncTime(@NotNull Calendar calendar) {
        if (d()) {
            long timeInMillis = calendar.getTimeInMillis();
            int timezoneKey = ProfileUtils.getTimezoneKey(calendar.getTimeZone());
            if (timeInMillis > System.currentTimeMillis()) {
                timeInMillis = a().getDevice_bind_time().longValue();
                timezoneKey = a().getTime_zone().intValue();
            }
            e(timeInMillis, timezoneKey);
        } else {
            HMLog.info(TAG, e.a);
        }
    }
}
