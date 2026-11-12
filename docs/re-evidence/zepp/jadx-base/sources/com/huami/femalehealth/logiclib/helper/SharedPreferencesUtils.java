package com.huami.femalehealth.logiclib.helper;

import android.content.Context;
import android.content.SharedPreferences;
import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \\2\u00020\u0001:\u0002\\]B\u0017\u0012\u0006\u0010Y\u001a\u00020X\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\bZ\u0010[R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR+\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u001b\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\"\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R+\u0010&\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u000f\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R+\u0010*\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u000f\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013R+\u0010.\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u000f\u001a\u0004\b,\u0010\u0018\"\u0004\b-\u0010\u001aR+\u00102\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u000f\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001aR+\u00106\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u000f\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R+\u0010:\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010\u000f\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010!R+\u0010>\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010\u000f\u001a\u0004\b<\u0010\u0018\"\u0004\b=\u0010\u001aR+\u0010B\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010\u000f\u001a\u0004\b@\u0010\u001f\"\u0004\bA\u0010!R+\u0010F\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010\u000f\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010!R+\u0010J\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010\u000f\u001a\u0004\bH\u0010\u0011\"\u0004\bI\u0010\u0013R/\u0010O\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010\u000f\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010NR+\u0010S\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010\u000f\u001a\u0004\bQ\u0010\u0011\"\u0004\bR\u0010\u0013R+\u0010W\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010\u000f\u001a\u0004\bU\u0010\u0011\"\u0004\bV\u0010\u0013¨\u0006^"}, d2 = {"Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;", "", "", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "userId", "Landroid/content/SharedPreferences;", "b", "Landroid/content/SharedPreferences;", "preferences", "", "<set-?>", "c", "Lkotlin/properties/ReadWriteProperty;", "getSyncTime", "()J", "setSyncTime", "(J)V", "syncTime", "", GoogleApiAvailabilityLight.a, "getFirstTime", "()Z", "setFirstTime", "(Z)V", "firstTime", "", "e", "getPeriodLen", "()I", "setPeriodLen", "(I)V", "periodLen", "f", "getCycleLen", "setCycleLen", "cycleLen", "g", "getLastMenstruationTime", "setLastMenstruationTime", "lastMenstruationTime", "h", "getEnablePredict", "setEnablePredict", "enablePredict", "i", "getAppNotify", "setAppNotify", "appNotify", z.j, "getAppBeforeMenstruationDay", "setAppBeforeMenstruationDay", "appBeforeMenstruationDay", hl.k, "getAppBeforeOvulationDay", "setAppBeforeOvulationDay", "appBeforeOvulationDay", "l", "getHwNotify", "setHwNotify", "hwNotify", "m", "getHwBeforeMenstruationDay", "setHwBeforeMenstruationDay", "hwBeforeMenstruationDay", GoogleApiAvailabilityLight.b, "getHwBeforeOvulationDay", "setHwBeforeOvulationDay", "hwBeforeOvulationDay", "o", "getUserLastCheckIncrementTime", "setUserLastCheckIncrementTime", "userLastCheckIncrementTime", b.r, "getLastTimeZoneId", "setLastTimeZoneId", "(Ljava/lang/String;)V", "lastTimeZoneId", DTransferConstants.SEARCH_KEY, "getDeviceDateRangeMin", "setDeviceDateRangeMin", "deviceDateRangeMin", "r", "getDeviceDateRangeMax", "setDeviceDateRangeMax", "deviceDateRangeMax", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Companion", "SharedPreferenceDelegates", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public class SharedPreferencesUtils {

    @NotNull
    public static final String SP_PREFIX = "FemaleHealth_";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SharedPreferences preferences;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty syncTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty firstTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty periodLen;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty cycleLen;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty lastMenstruationTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty enablePredict;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty appNotify;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty appBeforeMenstruationDay;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty appBeforeOvulationDay;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty hwNotify;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty hwBeforeMenstruationDay;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty hwBeforeOvulationDay;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty userLastCheckIncrementTime;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty lastTimeZoneId;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty deviceDateRangeMin;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty deviceDateRangeMax;
    public static final /* synthetic */ KProperty<Object>[] s = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SharedPreferencesUtils.class), "syncTime", "getSyncTime()J")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SharedPreferencesUtils.class), "firstTime", "getFirstTime()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SharedPreferencesUtils.class), "periodLen", "getPeriodLen()I")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SharedPreferencesUtils.class), "cycleLen", "getCycleLen()I")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SharedPreferencesUtils.class), "lastMenstruationTime", "getLastMenstruationTime()J")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SharedPreferencesUtils.class), "enablePredict", "getEnablePredict()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SharedPreferencesUtils.class), "appNotify", "getAppNotify()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SharedPreferencesUtils.class), "appBeforeMenstruationDay", "getAppBeforeMenstruationDay()I")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SharedPreferencesUtils.class), "appBeforeOvulationDay", "getAppBeforeOvulationDay()I")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SharedPreferencesUtils.class), "hwNotify", "getHwNotify()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SharedPreferencesUtils.class), "hwBeforeMenstruationDay", "getHwBeforeMenstruationDay()I")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SharedPreferencesUtils.class), "hwBeforeOvulationDay", "getHwBeforeOvulationDay()I")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SharedPreferencesUtils.class), "userLastCheckIncrementTime", "getUserLastCheckIncrementTime()J")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SharedPreferencesUtils.class), "lastTimeZoneId", "getLastTimeZoneId()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SharedPreferencesUtils.class), "deviceDateRangeMin", "getDeviceDateRangeMin()J")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SharedPreferencesUtils.class), "deviceDateRangeMax", "getDeviceDateRangeMax()J"))};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0007J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0002\u0010\u0003\u001a\u00020\tJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u000bJ \u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\rJ,\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f0\u00042\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils$SharedPreferenceDelegates;", "", "", "defaultValue", "Lkotlin/properties/ReadWriteProperty;", "Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;", "e", "", "g", "", "a", "", "c", "", hl.k, "", "i", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class SharedPreferenceDelegates {

        @NotNull
        public static final SharedPreferenceDelegates a = new SharedPreferenceDelegates();

        private SharedPreferenceDelegates() {
        }

        public static /* synthetic */ ReadWriteProperty b(SharedPreferenceDelegates sharedPreferenceDelegates, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return sharedPreferenceDelegates.a(z);
        }

        public static /* synthetic */ ReadWriteProperty d(SharedPreferenceDelegates sharedPreferenceDelegates, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = 0.0f;
            }
            return sharedPreferenceDelegates.c(f);
        }

        public static /* synthetic */ ReadWriteProperty f(SharedPreferenceDelegates sharedPreferenceDelegates, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return sharedPreferenceDelegates.e(i);
        }

        public static /* synthetic */ ReadWriteProperty h(SharedPreferenceDelegates sharedPreferenceDelegates, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 0;
            }
            return sharedPreferenceDelegates.g(j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ReadWriteProperty j(SharedPreferenceDelegates sharedPreferenceDelegates, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = null;
            }
            return sharedPreferenceDelegates.i(set);
        }

        public static /* synthetic */ ReadWriteProperty l(SharedPreferenceDelegates sharedPreferenceDelegates, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return sharedPreferenceDelegates.k(str);
        }

        @NotNull
        public final ReadWriteProperty<SharedPreferencesUtils, Boolean> a(final boolean defaultValue) {
            return new ReadWriteProperty<SharedPreferencesUtils, Boolean>() { // from class: com.huami.femalehealth.logiclib.helper.SharedPreferencesUtils$SharedPreferenceDelegates$boolean$1
                @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
                public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                    return getValue((SharedPreferencesUtils) obj, (KProperty<?>) kProperty);
                }

                @Override // kotlin.properties.ReadWriteProperty
                public /* bridge */ /* synthetic */ void setValue(SharedPreferencesUtils sharedPreferencesUtils, KProperty kProperty, Boolean bool) {
                    setValue(sharedPreferencesUtils, (KProperty<?>) kProperty, bool.booleanValue());
                }

                @NotNull
                public Boolean getValue(@NotNull SharedPreferencesUtils thisRef, @NotNull KProperty<?> property) {
                    return Boolean.valueOf(thisRef.preferences.getBoolean(property.getName(), defaultValue));
                }

                public void setValue(@NotNull SharedPreferencesUtils thisRef, @NotNull KProperty<?> property, boolean value) {
                    thisRef.preferences.edit().putBoolean(property.getName(), value).apply();
                }
            };
        }

        @NotNull
        public final ReadWriteProperty<SharedPreferencesUtils, Float> c(final float defaultValue) {
            return new ReadWriteProperty<SharedPreferencesUtils, Float>() { // from class: com.huami.femalehealth.logiclib.helper.SharedPreferencesUtils$SharedPreferenceDelegates$float$1
                @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
                public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                    return getValue((SharedPreferencesUtils) obj, (KProperty<?>) kProperty);
                }

                @Override // kotlin.properties.ReadWriteProperty
                public /* bridge */ /* synthetic */ void setValue(SharedPreferencesUtils sharedPreferencesUtils, KProperty kProperty, Float f) {
                    setValue(sharedPreferencesUtils, (KProperty<?>) kProperty, f.floatValue());
                }

                @NotNull
                public Float getValue(@NotNull SharedPreferencesUtils thisRef, @NotNull KProperty<?> property) {
                    return Float.valueOf(thisRef.preferences.getFloat(property.getName(), defaultValue));
                }

                public void setValue(@NotNull SharedPreferencesUtils thisRef, @NotNull KProperty<?> property, float value) {
                    thisRef.preferences.edit().putFloat(property.getName(), value).apply();
                }
            };
        }

        @NotNull
        public final ReadWriteProperty<SharedPreferencesUtils, Integer> e(final int defaultValue) {
            return new ReadWriteProperty<SharedPreferencesUtils, Integer>() { // from class: com.huami.femalehealth.logiclib.helper.SharedPreferencesUtils$SharedPreferenceDelegates$int$1
                @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
                public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                    return getValue((SharedPreferencesUtils) obj, (KProperty<?>) kProperty);
                }

                @Override // kotlin.properties.ReadWriteProperty
                public /* bridge */ /* synthetic */ void setValue(SharedPreferencesUtils sharedPreferencesUtils, KProperty kProperty, Integer num) {
                    setValue(sharedPreferencesUtils, (KProperty<?>) kProperty, num.intValue());
                }

                @NotNull
                public Integer getValue(@NotNull SharedPreferencesUtils thisRef, @NotNull KProperty<?> property) {
                    return Integer.valueOf(thisRef.preferences.getInt(property.getName(), defaultValue));
                }

                public void setValue(@NotNull SharedPreferencesUtils thisRef, @NotNull KProperty<?> property, int value) {
                    thisRef.preferences.edit().putInt(property.getName(), value).apply();
                }
            };
        }

        @NotNull
        public final ReadWriteProperty<SharedPreferencesUtils, Long> g(final long defaultValue) {
            return new ReadWriteProperty<SharedPreferencesUtils, Long>() { // from class: com.huami.femalehealth.logiclib.helper.SharedPreferencesUtils$SharedPreferenceDelegates$long$1
                @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
                public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                    return getValue((SharedPreferencesUtils) obj, (KProperty<?>) kProperty);
                }

                @Override // kotlin.properties.ReadWriteProperty
                public /* bridge */ /* synthetic */ void setValue(SharedPreferencesUtils sharedPreferencesUtils, KProperty kProperty, Long l) {
                    setValue(sharedPreferencesUtils, (KProperty<?>) kProperty, l.longValue());
                }

                @NotNull
                public Long getValue(@NotNull SharedPreferencesUtils thisRef, @NotNull KProperty<?> property) {
                    return Long.valueOf(thisRef.preferences.getLong(property.getName(), defaultValue));
                }

                public void setValue(@NotNull SharedPreferencesUtils thisRef, @NotNull KProperty<?> property, long value) {
                    thisRef.preferences.edit().putLong(property.getName(), value).apply();
                }
            };
        }

        @NotNull
        public final ReadWriteProperty<SharedPreferencesUtils, Set<String>> i(@Nullable final Set<String> defaultValue) {
            return new ReadWriteProperty<SharedPreferencesUtils, Set<? extends String>>() { // from class: com.huami.femalehealth.logiclib.helper.SharedPreferencesUtils$SharedPreferenceDelegates$setString$1
                @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
                public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                    return getValue((SharedPreferencesUtils) obj, (KProperty<?>) kProperty);
                }

                @Override // kotlin.properties.ReadWriteProperty
                public /* bridge */ /* synthetic */ void setValue(SharedPreferencesUtils sharedPreferencesUtils, KProperty kProperty, Set<? extends String> set) {
                    setValue2(sharedPreferencesUtils, (KProperty<?>) kProperty, (Set<String>) set);
                }

                @Nullable
                public Set<String> getValue(@NotNull SharedPreferencesUtils thisRef, @NotNull KProperty<?> property) {
                    return thisRef.preferences.getStringSet(property.getName(), defaultValue);
                }

                /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
                public void setValue2(@NotNull SharedPreferencesUtils thisRef, @NotNull KProperty<?> property, @Nullable Set<String> value) {
                    thisRef.preferences.edit().putStringSet(property.getName(), value).apply();
                }
            };
        }

        @NotNull
        public final ReadWriteProperty<SharedPreferencesUtils, String> k(@Nullable final String defaultValue) {
            return new ReadWriteProperty<SharedPreferencesUtils, String>() { // from class: com.huami.femalehealth.logiclib.helper.SharedPreferencesUtils$SharedPreferenceDelegates$string$1
                @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
                public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                    return getValue((SharedPreferencesUtils) obj, (KProperty<?>) kProperty);
                }

                @Override // kotlin.properties.ReadWriteProperty
                public /* bridge */ /* synthetic */ void setValue(SharedPreferencesUtils sharedPreferencesUtils, KProperty kProperty, String str) {
                    setValue2(sharedPreferencesUtils, (KProperty<?>) kProperty, str);
                }

                @Nullable
                public String getValue(@NotNull SharedPreferencesUtils thisRef, @NotNull KProperty<?> property) {
                    return thisRef.preferences.getString(property.getName(), defaultValue);
                }

                /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
                public void setValue2(@NotNull SharedPreferencesUtils thisRef, @NotNull KProperty<?> property, @Nullable String value) {
                    thisRef.preferences.edit().putString(property.getName(), value).apply();
                }
            };
        }
    }

    public SharedPreferencesUtils(@NotNull Context context, @NotNull String str) {
        this.userId = str;
        this.preferences = context.getSharedPreferences(Intrinsics.stringPlus(SP_PREFIX, str), 0);
        SharedPreferenceDelegates sharedPreferenceDelegates = SharedPreferenceDelegates.a;
        this.syncTime = sharedPreferenceDelegates.g(0L);
        this.firstTime = sharedPreferenceDelegates.a(true);
        this.periodLen = sharedPreferenceDelegates.e(5);
        this.cycleLen = sharedPreferenceDelegates.e(28);
        this.lastMenstruationTime = sharedPreferenceDelegates.g(0L);
        this.enablePredict = sharedPreferenceDelegates.a(false);
        this.appNotify = sharedPreferenceDelegates.a(false);
        this.appBeforeMenstruationDay = sharedPreferenceDelegates.e(1);
        this.appBeforeOvulationDay = sharedPreferenceDelegates.e(1);
        this.hwNotify = sharedPreferenceDelegates.a(false);
        this.hwBeforeMenstruationDay = sharedPreferenceDelegates.e(1);
        this.hwBeforeOvulationDay = sharedPreferenceDelegates.e(1);
        this.userLastCheckIncrementTime = sharedPreferenceDelegates.g(0L);
        this.lastTimeZoneId = sharedPreferenceDelegates.k(null);
        this.deviceDateRangeMin = sharedPreferenceDelegates.g(DateHelper.offsetDayGetCalendar$default(DateHelper.INSTANCE, -150, 0L, true, 2, null).getTimeInMillis());
        this.deviceDateRangeMax = sharedPreferenceDelegates.g(System.currentTimeMillis());
    }

    public final int getAppBeforeMenstruationDay() {
        return ((Number) this.appBeforeMenstruationDay.getValue(this, s[7])).intValue();
    }

    public final int getAppBeforeOvulationDay() {
        return ((Number) this.appBeforeOvulationDay.getValue(this, s[8])).intValue();
    }

    public final boolean getAppNotify() {
        return ((Boolean) this.appNotify.getValue(this, s[6])).booleanValue();
    }

    public final int getCycleLen() {
        return ((Number) this.cycleLen.getValue(this, s[3])).intValue();
    }

    public final long getDeviceDateRangeMax() {
        return ((Number) this.deviceDateRangeMax.getValue(this, s[15])).longValue();
    }

    public final long getDeviceDateRangeMin() {
        return ((Number) this.deviceDateRangeMin.getValue(this, s[14])).longValue();
    }

    public final boolean getEnablePredict() {
        return ((Boolean) this.enablePredict.getValue(this, s[5])).booleanValue();
    }

    public final boolean getFirstTime() {
        return ((Boolean) this.firstTime.getValue(this, s[1])).booleanValue();
    }

    public final int getHwBeforeMenstruationDay() {
        return ((Number) this.hwBeforeMenstruationDay.getValue(this, s[10])).intValue();
    }

    public final int getHwBeforeOvulationDay() {
        return ((Number) this.hwBeforeOvulationDay.getValue(this, s[11])).intValue();
    }

    public final boolean getHwNotify() {
        return ((Boolean) this.hwNotify.getValue(this, s[9])).booleanValue();
    }

    public final long getLastMenstruationTime() {
        return ((Number) this.lastMenstruationTime.getValue(this, s[4])).longValue();
    }

    @Nullable
    public final String getLastTimeZoneId() {
        return (String) this.lastTimeZoneId.getValue(this, s[13]);
    }

    public final int getPeriodLen() {
        return ((Number) this.periodLen.getValue(this, s[2])).intValue();
    }

    public final long getSyncTime() {
        return ((Number) this.syncTime.getValue(this, s[0])).longValue();
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final long getUserLastCheckIncrementTime() {
        return ((Number) this.userLastCheckIncrementTime.getValue(this, s[12])).longValue();
    }

    public final void setAppBeforeMenstruationDay(int i) {
        this.appBeforeMenstruationDay.setValue(this, s[7], Integer.valueOf(i));
    }

    public final void setAppBeforeOvulationDay(int i) {
        this.appBeforeOvulationDay.setValue(this, s[8], Integer.valueOf(i));
    }

    public final void setAppNotify(boolean z) {
        this.appNotify.setValue(this, s[6], Boolean.valueOf(z));
    }

    public final void setCycleLen(int i) {
        this.cycleLen.setValue(this, s[3], Integer.valueOf(i));
    }

    public final void setDeviceDateRangeMax(long j) {
        this.deviceDateRangeMax.setValue(this, s[15], Long.valueOf(j));
    }

    public final void setDeviceDateRangeMin(long j) {
        this.deviceDateRangeMin.setValue(this, s[14], Long.valueOf(j));
    }

    public final void setEnablePredict(boolean z) {
        this.enablePredict.setValue(this, s[5], Boolean.valueOf(z));
    }

    public final void setFirstTime(boolean z) {
        this.firstTime.setValue(this, s[1], Boolean.valueOf(z));
    }

    public final void setHwBeforeMenstruationDay(int i) {
        this.hwBeforeMenstruationDay.setValue(this, s[10], Integer.valueOf(i));
    }

    public final void setHwBeforeOvulationDay(int i) {
        this.hwBeforeOvulationDay.setValue(this, s[11], Integer.valueOf(i));
    }

    public final void setHwNotify(boolean z) {
        this.hwNotify.setValue(this, s[9], Boolean.valueOf(z));
    }

    public final void setLastMenstruationTime(long j) {
        this.lastMenstruationTime.setValue(this, s[4], Long.valueOf(j));
    }

    public final void setLastTimeZoneId(@Nullable String str) {
        this.lastTimeZoneId.setValue(this, s[13], str);
    }

    public final void setPeriodLen(int i) {
        this.periodLen.setValue(this, s[2], Integer.valueOf(i));
    }

    public final void setSyncTime(long j) {
        this.syncTime.setValue(this, s[0], Long.valueOf(j));
    }

    public final void setUserLastCheckIncrementTime(long j) {
        this.userLastCheckIncrementTime.setValue(this, s[12], Long.valueOf(j));
    }
}
