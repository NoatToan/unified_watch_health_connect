package com.xiaomi.hm.health.model.account;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.keeper.HMKeeperConstant;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0012\u001a\u00020\u000f8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0014\u001a\u00020\u000f8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/model/account/HMCalendarConfig;", "", "", "toJson", "", "saveAndUpload", HMCalendarConfig.KEY_CALENDAR, "Ljava/lang/String;", "getCalendar", "()Ljava/lang/String;", "setCalendar", "(Ljava/lang/String;)V", "startDayOfWeek", "getStartDayOfWeek", "setStartDayOfWeek", "", "getStartDayOfWeekIndex", "()I", "startDayOfWeekIndex", "getCalendarIndex", "calendarIndex", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMCalendarConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int INDEX_FRI = 5;
    public static final int INDEX_HEBREW = 2;
    public static final int INDEX_ISLAMIC = 3;
    public static final int INDEX_LUNAR = 1;
    public static final int INDEX_MON = 1;
    public static final int INDEX_SAT = 6;
    public static final int INDEX_SOLAR = 0;
    public static final int INDEX_SUN = 7;
    public static final int INDEX_THUR = 4;
    public static final int INDEX_TUES = 2;
    public static final int INDEX_WED = 3;

    @NotNull
    public static final String KEY = "huami.mifit.user.settings.identify.week_start_or_calendar";

    @NotNull
    private static final String KEY_CALENDAR = "calendar";

    @NotNull
    private static final String KEY_START_DAY_OF_WEEK = "start_day_of_week";

    @NotNull
    public static final String TAG = "HMCalendarConfig";

    @NotNull
    public static final String VALUE_FRI = "fri";

    @NotNull
    public static final String VALUE_HEBREW = "hebrew";

    @NotNull
    public static final String VALUE_ISLAMIC = "islamic";

    @NotNull
    public static final String VALUE_LUNAR = "lunar";

    @NotNull
    public static final String VALUE_MON = "mon";

    @NotNull
    public static final String VALUE_SAT = "sat";

    @NotNull
    public static final String VALUE_SOLAR = "solar";

    @NotNull
    public static final String VALUE_SUN = "sun";

    @NotNull
    public static final String VALUE_THUR = "thur";

    @NotNull
    public static final String VALUE_TUES = "tues";

    @NotNull
    public static final String VALUE_WED = "wed";

    @NotNull
    private static final Lazy<PropertyStoreApi> propertyStoreApiLazy;

    @NotNull
    private String calendar;

    @NotNull
    private String startDayOfWeek;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0016\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0016\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0016\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0016\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0016\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0016\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0016\u0010\u0019\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0016\u0010\u001b\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0016\u0010\u001c\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0016\u0010\u001d\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013R\u0016\u0010\u001e\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0016\u0010\u001f\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013R\u0016\u0010 \u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0013R\u0016\u0010!\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0013R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/model/account/HMCalendarConfig$Companion;", "", "Lcom/xiaomi/hm/health/model/account/HMCalendarConfig;", "fromJson", "", "INDEX_FRI", LogUtil.I, "INDEX_HEBREW", "INDEX_ISLAMIC", "INDEX_LUNAR", "INDEX_MON", "INDEX_SAT", "INDEX_SOLAR", "INDEX_SUN", "INDEX_THUR", "INDEX_TUES", "INDEX_WED", "", "KEY", "Ljava/lang/String;", HMKeeperConstant.KEY_CALENDAR, "KEY_START_DAY_OF_WEEK", "TAG", "VALUE_FRI", "VALUE_HEBREW", "VALUE_ISLAMIC", "VALUE_LUNAR", "VALUE_MON", "VALUE_SAT", "VALUE_SOLAR", "VALUE_SUN", "VALUE_THUR", "VALUE_TUES", "VALUE_WED", "Lkotlin/Lazy;", "Lcom/huami/devicex/injection/data/PropertyStoreApi;", "propertyStoreApiLazy", "Lkotlin/Lazy;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final HMCalendarConfig fromJson() {
            final String property = ((PropertyStoreApi) HMCalendarConfig.propertyStoreApiLazy.getValue()).getProperty(HMCalendarConfig.KEY, "");
            HMLog.info(HMCalendarConfig.TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.model.account.HMCalendarConfig$Companion$fromJson$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "config: " + property;
                }
            });
            HMCalendarConfig hMCalendarConfig = new HMCalendarConfig(HMCalendarConfig.VALUE_SOLAR, HMCalendarConfig.VALUE_MON);
            try {
                JSONObject jSONObject = new JSONObject(property);
                hMCalendarConfig.setCalendar(jSONObject.optString(HMCalendarConfig.KEY_CALENDAR, HMCalendarConfig.VALUE_LUNAR));
                hMCalendarConfig.setStartDayOfWeek(jSONObject.optString(HMCalendarConfig.KEY_START_DAY_OF_WEEK, HMCalendarConfig.VALUE_MON));
            } catch (Exception e) {
                HMLog.info(HMCalendarConfig.TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.model.account.HMCalendarConfig$Companion$fromJson$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "fromJson exception " + e.getMessage();
                    }
                });
            }
            return hMCalendarConfig;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Koin koin = GlobalContext.INSTANCE.get();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Scope rootScope = koin.getScopeRegistry().getRootScope();
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        propertyStoreApiLazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<PropertyStoreApi>() { // from class: com.xiaomi.hm.health.model.account.HMCalendarConfig$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.devicex.injection.data.PropertyStoreApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PropertyStoreApi invoke() {
                return rootScope.get(Reflection.getOrCreateKotlinClass(PropertyStoreApi.class), objArr, objArr2);
            }
        });
    }

    public HMCalendarConfig(@NotNull String str, @NotNull String str2) {
        this.calendar = str;
        this.startDayOfWeek = str2;
    }

    @JvmStatic
    @NotNull
    public static final HMCalendarConfig fromJson() {
        return INSTANCE.fromJson();
    }

    @NotNull
    public final String getCalendar() {
        return this.calendar;
    }

    public final int getCalendarIndex() {
        return Intrinsics.areEqual(this.calendar, VALUE_LUNAR) ? 1 : 0;
    }

    @NotNull
    public final String getStartDayOfWeek() {
        return this.startDayOfWeek;
    }

    public final int getStartDayOfWeekIndex() {
        String str = this.startDayOfWeek;
        if (Intrinsics.areEqual(str, VALUE_SUN)) {
            return 7;
        }
        return Intrinsics.areEqual(str, VALUE_SAT) ? 6 : 1;
    }

    public final void saveAndUpload() {
        Lazy<PropertyStoreApi> lazy = propertyStoreApiLazy;
        lazy.getValue().setProperty(KEY, toJson());
        lazy.getValue().postPropertiesToServer(true);
    }

    public final void setCalendar(@NotNull String str) {
        this.calendar = str;
    }

    public final void setStartDayOfWeek(@NotNull String str) {
        this.startDayOfWeek = str;
    }

    @Nullable
    public final String toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(KEY_CALENDAR, this.calendar);
            jSONObject.put(KEY_START_DAY_OF_WEEK, this.startDayOfWeek);
            return jSONObject.toString();
        } catch (Exception e) {
            HMLog.info(TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.model.account.HMCalendarConfig.toJson.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "toJson exception " + e.getMessage();
                }
            });
            return null;
        }
    }
}
