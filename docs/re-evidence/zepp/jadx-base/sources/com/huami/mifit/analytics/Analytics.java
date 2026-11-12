package com.huami.mifit.analytics;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.bean.BaseEvent;
import com.huami.mifit.analytics.bean.CalculationEvent;
import com.huami.mifit.analytics.bean.CountEvent;
import com.huami.mifit.analytics.bean.ExceptionEvent;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.analytics.builder.EventBuilder;
import com.huami.mifit.analytics.builder.ExceptionEventBuilder;
import com.huami.mifit.analytics.function.BooleanSupplier;
import com.huami.mifit.analytics.function.Consumer;
import com.huami.mifit.analytics.function.Function;
import com.huami.mifit.analytics.function.Supplier;
import com.huami.mifit.analytics.log.Logger;
import com.huami.tools.analytics.EventBuilders;
import com.huami.tools.analytics.HitEvent;
import com.huami.tools.analytics.HuamiAnalytics;
import com.huami.tools.analytics.Tracker;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class Analytics {
    private static final String a = "Analytics";

    @VisibleForTesting
    public static boolean b = false;

    @VisibleForTesting
    public static boolean c = false;
    private static Config d = null;
    private static boolean e = false;
    private static volatile Logger f;
    private static String g;
    private static boolean h;

    private static void A() {
        if (t() && !e) {
            String huamiAnonymousAppIdForStaging = d.isDebug() ? d.getHuamiAnonymousAppIdForStaging() : d.getHuamiAnonymousAppIdForProduction();
            String huamiIdentifiedAppIdForStaging = d.isDebug() ? d.getHuamiIdentifiedAppIdForStaging() : d.getHuamiIdentifiedAppIdForProduction();
            String huamiRealTimeAppIdForStaging = d.isDebug() ? d.getHuamiRealTimeAppIdForStaging() : d.getHuamiRealTimeAppIdForProduction();
            HuamiAnalytics huamiAnalytics = HuamiAnalytics.get();
            huamiAnalytics.enable(false);
            final boolean zInitializeAnonymousTracker = huamiAnalytics.initializeAnonymousTracker(huamiAnonymousAppIdForStaging, d.getChannel());
            final boolean zInitializeIdentifiedTracker = huamiAnalytics.initializeIdentifiedTracker(huamiIdentifiedAppIdForStaging, d.getChannel());
            final boolean zInitializeTimerTracker = huamiAnalytics.initializeTimerTracker(huamiRealTimeAppIdForStaging, d.getChannel());
            if (!zInitializeAnonymousTracker || !zInitializeIdentifiedTracker || !zInitializeTimerTracker) {
                w().w(a, new Supplier() { // from class: xc
                    @Override // com.huami.mifit.analytics.function.Supplier
                    public final Object get() {
                        return Analytics.L(zInitializeAnonymousTracker, zInitializeIdentifiedTracker, zInitializeTimerTracker);
                    }
                });
                return;
            }
            x().setDebug(d.isDebug());
            y().setDebug(d.isDebug());
            z().setDebug(d.isDebug());
            Tracker trackerX = x();
            final Function<String, String> hmStatAnonymousTrackerUploadHostMapper = d.getHmStatAnonymousTrackerUploadHostMapper();
            Objects.requireNonNull(hmStatAnonymousTrackerUploadHostMapper);
            trackerX.setUploadHostMapper(new com.huami.tools.analytics.internal.function.Function() { // from class: hd
                @Override // com.huami.tools.analytics.internal.function.Function
                public final Object apply(Object obj) {
                    return (String) hmStatAnonymousTrackerUploadHostMapper.apply((String) obj);
                }
            });
            Tracker trackerY = y();
            final Function<String, String> hmStatIdentifiedTrackerUploadHostMapper = d.getHmStatIdentifiedTrackerUploadHostMapper();
            Objects.requireNonNull(hmStatIdentifiedTrackerUploadHostMapper);
            trackerY.setUploadHostMapper(new com.huami.tools.analytics.internal.function.Function() { // from class: hd
                @Override // com.huami.tools.analytics.internal.function.Function
                public final Object apply(Object obj) {
                    return (String) hmStatIdentifiedTrackerUploadHostMapper.apply((String) obj);
                }
            });
            Tracker trackerZ = z();
            final Function<String, String> hmStatIdentifiedTrackerUploadHostMapper2 = d.getHmStatIdentifiedTrackerUploadHostMapper();
            Objects.requireNonNull(hmStatIdentifiedTrackerUploadHostMapper2);
            trackerZ.setUploadHostMapper(new com.huami.tools.analytics.internal.function.Function() { // from class: hd
                @Override // com.huami.tools.analytics.internal.function.Function
                public final Object apply(Object obj) {
                    return (String) hmStatIdentifiedTrackerUploadHostMapper2.apply((String) obj);
                }
            });
            e = true;
            w().i(a, new Supplier() { // from class: yc
                @Override // com.huami.mifit.analytics.function.Supplier
                public final Object get() {
                    return Analytics.J();
                }
            });
            String str = g;
            if (str != null) {
                d0(str);
                g = null;
                w().v(a, new Supplier() { // from class: zc
                    @Override // com.huami.mifit.analytics.function.Supplier
                    public final Object get() {
                        return Analytics.K();
                    }
                });
            }
        }
    }

    @VisibleForTesting
    public static boolean B(@NonNull CalculationEvent calculationEvent) {
        String str = calculationEvent.id;
        return str == null || str.isEmpty();
    }

    @VisibleForTesting
    public static boolean C(@NonNull CountEvent countEvent) {
        String str = countEvent.id;
        return str == null || str.isEmpty();
    }

    @VisibleForTesting
    public static boolean D(@NonNull BaseEvent baseEvent) {
        if (baseEvent instanceof CountEvent) {
            return C((CountEvent) baseEvent);
        }
        if (baseEvent instanceof CalculationEvent) {
            return B((CalculationEvent) baseEvent);
        }
        if (baseEvent instanceof ExceptionEvent) {
            return E((ExceptionEvent) baseEvent);
        }
        return true;
    }

    @VisibleForTesting
    public static boolean E(@NonNull ExceptionEvent exceptionEvent) {
        String str = exceptionEvent.message;
        return ((str != null && !str.isEmpty()) || (exceptionEvent.throwable != null)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object F() {
        return "初始化统计包装库尚未初始化";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object G() {
        return "关闭统计功能";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H(int i, String str, Throwable th, Supplier supplier) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object I(Config config) {
        return String.format(Locale.CHINA, "初始化统计包装库，debug: %s , channel: %s", Boolean.valueOf(config.isDebug()), config.getChannel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object J() {
        return "初始化了华米统计";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object K() {
        return "初始化华米统计后，给追踪器设置了uid";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object L(boolean z, boolean z2, boolean z3) {
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[3];
        objArr[0] = z ? "成功" : "失败";
        objArr[1] = z2 ? "成功" : "失败";
        objArr[2] = z3 ? "成功" : "失败";
        return String.format(locale, "初始化华米统计失败，匿名通道初始化%s，实名通道初始化%s, 实时打点初始化%s", objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object M(ExceptionEvent exceptionEvent) {
        Locale locale = Locale.CHINA;
        Object[] objArr = new Object[2];
        objArr[0] = exceptionEvent.message;
        Throwable th = exceptionEvent.throwable;
        objArr[1] = th != null ? th.getMessage() : null;
        return String.format(locale, "记录异常事件, 描述: %s , 堆栈摘要: %s", objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object N(String str, String str2, String str3) {
        return String.format(Locale.CHINA, "%s , %s , %s", str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object O(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("用户登陆时记录一下用户id");
        sb.append(str != null ? "，id非空" : "，id为空");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object P() {
        return "用户注销时清除记录的用户id";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object Q(String str) {
        return "AndroidManifest配置的渠道：" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object R(String str) {
        return "记录页面结束：" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object S(String str, Map map) {
        return "记录页面结束：" + str + "，参数：" + map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object T(String str) {
        return "记录页面开始：" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object U(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V(Logger logger, int i, String str, Throwable th, final Object obj) {
        logger.log(i, str, th, new Supplier() { // from class: ld
            @Override // com.huami.mifit.analytics.function.Supplier
            public final Object get() {
                return Analytics.U(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object W(boolean z) {
        Locale locale = Locale.CHINA;
        Object[] objArr = new Object[1];
        objArr[0] = z ? "开启" : "关闭";
        return String.format(locale, "%s了华米统计", objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object X() {
        return "尚未初始化华米统计，暂存uid";
    }

    private static void Y(BaseEvent baseEvent) {
        String str;
        String strValueOf;
        Map<String, String> map;
        String str2;
        final String str3;
        final String str4;
        if (c) {
            if (baseEvent instanceof ExceptionEvent) {
                final ExceptionEvent exceptionEvent = (ExceptionEvent) baseEvent;
                w().v(a, new Supplier() { // from class: kd
                    @Override // com.huami.mifit.analytics.function.Supplier
                    public final Object get() {
                        return Analytics.M(exceptionEvent);
                    }
                });
                return;
            }
            if (baseEvent instanceof CountEvent) {
                CountEvent countEvent = (CountEvent) baseEvent;
                str = countEvent.id;
                strValueOf = countEvent.value;
                map = countEvent.extras;
                str2 = "计次";
            } else {
                if (!(baseEvent instanceof CalculationEvent)) {
                    return;
                }
                CalculationEvent calculationEvent = (CalculationEvent) baseEvent;
                str = calculationEvent.id;
                strValueOf = String.valueOf(calculationEvent.value);
                map = calculationEvent.extras;
                str2 = "计算";
            }
            final String str5 = String.format(Locale.CHINA, "记录%s事件 %s", str2, str);
            if (strValueOf == null || strValueOf.isEmpty()) {
                str3 = "无值";
            } else {
                str3 = "取值: " + strValueOf;
            }
            if (map == null || map.isEmpty()) {
                str4 = "无键值对参数";
            } else {
                str4 = "键值对参数: " + map;
            }
            w().v(a, new Supplier() { // from class: uc
                @Override // com.huami.mifit.analytics.function.Supplier
                public final Object get() {
                    return Analytics.N(str5, str3, str4);
                }
            });
        }
    }

    private static void Z(HitEvent hitEvent) {
        if (h) {
            y().record(hitEvent);
        } else {
            x().record(hitEvent);
        }
    }

    @VisibleForTesting
    public static void a0(@NonNull CalculationEvent calculationEvent) {
        HitEvent hitEventBuild = EventBuilders.newCalculationEventBuilder().setId(calculationEvent.id).setValue(calculationEvent.value).setExtras(calculationEvent.extras).build();
        Z(hitEventBuild);
        if (calculationEvent.isRealTimeRecord) {
            z().record(hitEventBuild);
        }
    }

    @VisibleForTesting
    public static void b0(@NonNull CountEvent countEvent) {
        HitEvent hitEventBuild = EventBuilders.newCountEventBuilder().setId(countEvent.id).setValue(countEvent.value).setExtras(countEvent.extras).build();
        Z(hitEventBuild);
        if (countEvent.isRealTimeRecord) {
            z().record(hitEventBuild);
        }
    }

    @VisibleForTesting
    public static void c0(@NonNull ExceptionEvent exceptionEvent) {
        HitEvent hitEventBuild = EventBuilders.newExceptionEventBuilder().setDescription(exceptionEvent.message).setException(exceptionEvent.throwable).build();
        Z(hitEventBuild);
        if (exceptionEvent.isRealTimeRecord) {
            z().record(hitEventBuild);
        }
    }

    private static void d0(@Nullable String str) {
        if (!e) {
            g = str;
            w().v(a, new Supplier() { // from class: ad
                @Override // com.huami.mifit.analytics.function.Supplier
                public final Object get() {
                    return Analytics.X();
                }
            });
        }
        y().setUid(str);
        z().setUid(str);
    }

    public static void disable() {
        w().i(a, new Supplier() { // from class: cd
            @Override // com.huami.mifit.analytics.function.Supplier
            public final Object get() {
                return Analytics.G();
            }
        });
        b = false;
        setOnMiStat(false);
        setOnHmStat(false);
    }

    public static void enable() {
        if (t()) {
            b = true;
            A();
            setOnHmStat(true);
            v();
        }
    }

    @Deprecated
    public static void event(String str) {
        recordEvent(new CountEventBuilder(str));
    }

    @Deprecated
    public static void exception(Context context, String str) {
        recordEvent(new ExceptionEventBuilder(str));
    }

    @NonNull
    public static String getHmStatAnonymousId(@NonNull Context context) {
        return HuamiAnalytics.getAnonymousId(context);
    }

    @NonNull
    public static String getHmStatAnonymousTrackerOriginalUploadHost() {
        return x().getOriginalUploadHost();
    }

    @NonNull
    public static String getHmStatIdentifiedTrackerOriginalUploadHost() {
        return y().getOriginalUploadHost();
    }

    @Deprecated
    public static void init(@NonNull Context context, boolean z, @NonNull String str, @NonNull BooleanSupplier booleanSupplier) {
    }

    public static void init(@NonNull final Config config) {
        w().i(a, new Supplier() { // from class: jd
            @Override // com.huami.mifit.analytics.function.Supplier
            public final Object get() {
                return Analytics.I(config);
            }
        });
        d = config;
        setOnMiStat(false);
        A();
        setOnHmStat(false);
    }

    public static boolean isEnabled() {
        return b;
    }

    public static void onLogin(@Nullable final String str) {
        w().i(a, new Supplier() { // from class: nd
            @Override // com.huami.mifit.analytics.function.Supplier
            public final Object get() {
                return Analytics.O(str);
            }
        });
        d0(str);
        h = true;
        v();
    }

    public static void onLogout() {
        w().i(a, new Supplier() { // from class: dd
            @Override // com.huami.mifit.analytics.function.Supplier
            public final Object get() {
                return Analytics.P();
            }
        });
        d0(null);
        h = false;
        v();
    }

    public static String readMetaDataChannel(Context context) {
        final String string;
        try {
            string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("hm_channel");
        } catch (Exception e2) {
            e2.printStackTrace();
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            string = StatEvent.VALUE_NORMAL;
        }
        w().i(a, new Supplier() { // from class: od
            @Override // com.huami.mifit.analytics.function.Supplier
            public final Object get() {
                return Analytics.Q(string);
            }
        });
        return string;
    }

    public static void recordEvent(@Nullable CountEventBuilder countEventBuilder) {
        u(countEventBuilder, new Consumer() { // from class: ed
            @Override // com.huami.mifit.analytics.function.Consumer
            public final void accept(Object obj) {
                Analytics.b0((CountEvent) obj);
            }
        });
    }

    public static void recordPageEnd(final String str) {
        w().d(a, new Supplier() { // from class: pd
            @Override // com.huami.mifit.analytics.function.Supplier
            public final Object get() {
                return Analytics.R(str);
            }
        });
        x().recordPageEnd(str);
    }

    public static void recordPageStart(final String str) {
        w().d(a, new Supplier() { // from class: md
            @Override // com.huami.mifit.analytics.function.Supplier
            public final Object get() {
                return Analytics.T(str);
            }
        });
        x().recordPageStart(str);
    }

    public static void setLogger(@Nullable final Logger logger) {
        synchronized (Analytics.class) {
            f = logger;
            if (logger != null) {
                HuamiAnalytics.setLogger(new com.huami.tools.analytics.Logger() { // from class: gd
                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void d(String str, Object obj) {
                        ur4.a(this, str, obj);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void e(String str, Object obj) {
                        ur4.b(this, str, obj);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void e(String str, Throwable th) {
                        ur4.c(this, str, th);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void e(String str, Throwable th, Object obj) {
                        ur4.d(this, str, th, obj);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void i(String str, Object obj) {
                        ur4.e(this, str, obj);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public final void log(int i, String str, Throwable th, Object obj) {
                        Analytics.V(logger, i, str, th, obj);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void v(String str, Object obj) {
                        ur4.f(this, str, obj);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void w(String str, Object obj) {
                        ur4.g(this, str, obj);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void w(String str, Throwable th) {
                        ur4.h(this, str, th);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void w(String str, Throwable th, Object obj) {
                        ur4.i(this, str, th, obj);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void wtf(String str, Object obj) {
                        ur4.j(this, str, obj);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void wtf(String str, Throwable th) {
                        ur4.k(this, str, th);
                    }

                    @Override // com.huami.tools.analytics.Logger
                    public /* synthetic */ void wtf(String str, Throwable th, Object obj) {
                        ur4.l(this, str, th, obj);
                    }
                });
            } else {
                HuamiAnalytics.setLogger(null);
            }
        }
    }

    public static void setOnHmStat(final boolean z) {
        c = z;
        if (HuamiAnalytics.get().isEnabled() != z) {
            HuamiAnalytics.get().enable(z);
            x().enableAutoTrackPage(false);
            y().enableAutoTrackPage(z);
            w().i(a, new Supplier() { // from class: wc
                @Override // com.huami.mifit.analytics.function.Supplier
                public final Object get() {
                    return Analytics.W(z);
                }
            });
        }
    }

    @Deprecated
    public static void setOnMiStat(boolean z) {
    }

    private static boolean t() {
        if (d == null) {
            w().d(a, new Supplier() { // from class: bd
                @Override // com.huami.mifit.analytics.function.Supplier
                public final Object get() {
                    return Analytics.F();
                }
            });
        }
        return d != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public static <E extends BaseEvent> void u(@Nullable EventBuilder<E> eventBuilder, @NonNull Consumer<E> consumer) {
        if (b && eventBuilder != null) {
            BaseEvent baseEventBuild = eventBuilder.build();
            if (D(baseEventBuild)) {
                return;
            }
            Y(baseEventBuild);
            if (c) {
                consumer.accept(baseEventBuild);
            }
        }
    }

    private static void v() {
        if (h) {
            x().enableAutoTrackPage(false);
            y().enableAutoTrackPage(true);
        } else {
            x().enableAutoTrackPage(true);
            y().enableAutoTrackPage(false);
        }
    }

    @NonNull
    private static Logger w() {
        if (f == null) {
            synchronized (Analytics.class) {
                if (f == null) {
                    f = new Logger() { // from class: fd
                        @Override // com.huami.mifit.analytics.log.Logger
                        public /* synthetic */ void d(String str, Supplier supplier) {
                            wr4.a(this, str, supplier);
                        }

                        @Override // com.huami.mifit.analytics.log.Logger
                        public /* synthetic */ void e(String str, Supplier supplier) {
                            wr4.b(this, str, supplier);
                        }

                        @Override // com.huami.mifit.analytics.log.Logger
                        public /* synthetic */ void e(String str, Throwable th) {
                            wr4.c(this, str, th);
                        }

                        @Override // com.huami.mifit.analytics.log.Logger
                        public /* synthetic */ void e(String str, Throwable th, Supplier supplier) {
                            wr4.d(this, str, th, supplier);
                        }

                        @Override // com.huami.mifit.analytics.log.Logger
                        public /* synthetic */ void i(String str, Supplier supplier) {
                            wr4.e(this, str, supplier);
                        }

                        @Override // com.huami.mifit.analytics.log.Logger
                        public final void log(int i, String str, Throwable th, Supplier supplier) {
                            Analytics.H(i, str, th, supplier);
                        }

                        @Override // com.huami.mifit.analytics.log.Logger
                        public /* synthetic */ void v(String str, Supplier supplier) {
                            wr4.f(this, str, supplier);
                        }

                        @Override // com.huami.mifit.analytics.log.Logger
                        public /* synthetic */ void w(String str, Supplier supplier) {
                            wr4.g(this, str, supplier);
                        }

                        @Override // com.huami.mifit.analytics.log.Logger
                        public /* synthetic */ void w(String str, Throwable th) {
                            wr4.h(this, str, th);
                        }

                        @Override // com.huami.mifit.analytics.log.Logger
                        public /* synthetic */ void w(String str, Throwable th, Supplier supplier) {
                            wr4.i(this, str, th, supplier);
                        }

                        @Override // com.huami.mifit.analytics.log.Logger
                        public /* synthetic */ void wtf(String str, Supplier supplier) {
                            wr4.j(this, str, supplier);
                        }

                        @Override // com.huami.mifit.analytics.log.Logger
                        public /* synthetic */ void wtf(String str, Throwable th) {
                            wr4.k(this, str, th);
                        }

                        @Override // com.huami.mifit.analytics.log.Logger
                        public /* synthetic */ void wtf(String str, Throwable th, Supplier supplier) {
                            wr4.l(this, str, th, supplier);
                        }
                    };
                }
            }
        }
        return f;
    }

    private static Tracker x() {
        return HuamiAnalytics.get().getAnonymousTracker();
    }

    private static Tracker y() {
        return HuamiAnalytics.get().getIdentifiedTracker();
    }

    private static Tracker z() {
        return HuamiAnalytics.get().getTimerTracker();
    }

    @Deprecated
    public static void event(Context context, String str) {
        event(str);
    }

    @Deprecated
    public static void exception(Context context, Exception exc) {
        recordEvent(new ExceptionEventBuilder(exc));
    }

    public static void recordEvent(@Nullable CalculationEventBuilder calculationEventBuilder) {
        u(calculationEventBuilder, new Consumer() { // from class: tc
            @Override // com.huami.mifit.analytics.function.Consumer
            public final void accept(Object obj) {
                Analytics.a0((CalculationEvent) obj);
            }
        });
    }

    @Deprecated
    public static void event(Context context, String str, String str2) {
        recordEvent(new CountEventBuilder(str).setValue(str2));
    }

    @Deprecated
    public static void recordEvent(@Nullable ExceptionEventBuilder exceptionEventBuilder) {
        u(exceptionEventBuilder, new Consumer() { // from class: id
            @Override // com.huami.mifit.analytics.function.Consumer
            public final void accept(Object obj) {
                Analytics.c0((ExceptionEvent) obj);
            }
        });
    }

    public static void recordPageEnd(final String str, final Map<String, String> map) {
        w().d(a, new Supplier() { // from class: vc
            @Override // com.huami.mifit.analytics.function.Supplier
            public final Object get() {
                return Analytics.S(str, map);
            }
        });
        x().recordPageEnd(str, map);
    }

    @Deprecated
    public static void event(Context context, String str, Map<String, String> map) {
        recordEvent(new CountEventBuilder(str).putExtras(map));
    }

    @Deprecated
    public static void event(Context context, String str, String str2, String str3) {
        recordEvent(new CountEventBuilder(str).addExtra(str2, str3));
    }

    @Deprecated
    public static void event(Context context, String str, Map<String, String> map, int i) {
        recordEvent(new CalculationEventBuilder(str, i).putExtras(map));
    }

    @Deprecated
    public static void event(Context context, String str, String str2, String str3, int i) {
        recordEvent(new CalculationEventBuilder(str, i).addExtra(str2, str3));
    }
}
