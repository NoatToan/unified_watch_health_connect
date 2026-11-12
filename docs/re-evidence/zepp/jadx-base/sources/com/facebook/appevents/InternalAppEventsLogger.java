package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.tools.analytics.DbUtils;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0011\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aB\u0013\b\u0016\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0019\u0010\u001dB\u001d\b\u0016\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001fB%\b\u0016\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u0019\u0010#J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\"\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J$\u0010\u000e\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002J.\u0010\u0011\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0011\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J+\u0010\u0011\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0006R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/facebook/appevents/InternalAppEventsLogger;", "", "", "eventName", "Landroid/os/Bundle;", "parameters", "", "logEvent", "", "valueToSum", "Ljava/math/BigDecimal;", "purchaseAmount", "Ljava/util/Currency;", FirebaseAnalytics.Param.CURRENCY, "logPurchaseImplicitly", "buttonText", "logEventFromSE", "logEventImplicitly", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V", "logChangedSettingsEvent", "flush", "Lcom/facebook/appevents/AppEventsLoggerImpl;", "a", "Lcom/facebook/appevents/AppEventsLoggerImpl;", "loggerImpl", "<init>", "(Lcom/facebook/appevents/AppEventsLoggerImpl;)V", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "(Landroid/content/Context;)V", "applicationId", "(Landroid/content/Context;Ljava/lang/String;)V", "activityName", "Lcom/facebook/AccessToken;", "accessToken", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class InternalAppEventsLogger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AppEventsLoggerImpl loggerImpl;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u001c\u0010\u000e\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\fH\u0007J\u001e\u0010\u0013\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007J$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/InternalAppEventsLogger$Companion;", "", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "getFlushBehavior", "Ljava/util/concurrent/Executor;", "getAnalyticsExecutor", "", "getPushNotificationsRegistrationId", "Landroid/os/Bundle;", "userData", "", "setUserData", "", "ud", "setInternalUserData", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "applicationId", "Lcom/facebook/appevents/InternalAppEventsLogger;", "createInstance", "activityName", "Lcom/facebook/AccessToken;", "accessToken", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ InternalAppEventsLogger createInstance$default(Companion companion, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.createInstance(context, str);
        }

        @JvmStatic
        @NotNull
        @JvmOverloads
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final InternalAppEventsLogger createInstance(@Nullable Context context) {
            return createInstance$default(this, context, null, 2, null);
        }

        @JvmStatic
        @NotNull
        @JvmOverloads
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final InternalAppEventsLogger createInstance(@Nullable Context context, @Nullable String applicationId) {
            return new InternalAppEventsLogger(context, applicationId);
        }

        @JvmStatic
        @NotNull
        public final Executor getAnalyticsExecutor() {
            return AppEventsLoggerImpl.INSTANCE.getAnalyticsExecutor();
        }

        @JvmStatic
        @NotNull
        public final AppEventsLogger.FlushBehavior getFlushBehavior() {
            return AppEventsLoggerImpl.INSTANCE.getFlushBehavior();
        }

        @JvmStatic
        @Nullable
        public final String getPushNotificationsRegistrationId() {
            return AppEventsLoggerImpl.INSTANCE.getPushNotificationsRegistrationId();
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.GROUP_ID})
        public final void setInternalUserData(@NotNull Map<String, String> ud) {
            UserDataStore.setInternalUd(ud);
        }

        @JvmStatic
        public final void setUserData(@Nullable Bundle userData) {
            UserDataStore.setUserDataAndHash(userData);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @NotNull
        public final InternalAppEventsLogger createInstance(@NotNull String activityName, @Nullable String applicationId, @Nullable AccessToken accessToken) {
            return new InternalAppEventsLogger(activityName, applicationId, accessToken);
        }
    }

    public InternalAppEventsLogger(@NotNull AppEventsLoggerImpl appEventsLoggerImpl) {
        this.loggerImpl = appEventsLoggerImpl;
    }

    @JvmStatic
    @NotNull
    @JvmOverloads
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final InternalAppEventsLogger createInstance(@Nullable Context context) {
        return Companion.createInstance$default(INSTANCE, context, null, 2, null);
    }

    @JvmStatic
    @NotNull
    @JvmOverloads
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final InternalAppEventsLogger createInstance(@Nullable Context context, @Nullable String str) {
        return INSTANCE.createInstance(context, str);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public static final InternalAppEventsLogger createInstance(@NotNull String str, @Nullable String str2, @Nullable AccessToken accessToken) {
        return INSTANCE.createInstance(str, str2, accessToken);
    }

    @JvmStatic
    @NotNull
    public static final Executor getAnalyticsExecutor() {
        return INSTANCE.getAnalyticsExecutor();
    }

    @JvmStatic
    @NotNull
    public static final AppEventsLogger.FlushBehavior getFlushBehavior() {
        return INSTANCE.getFlushBehavior();
    }

    @JvmStatic
    @Nullable
    public static final String getPushNotificationsRegistrationId() {
        return INSTANCE.getPushNotificationsRegistrationId();
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.GROUP_ID})
    public static final void setInternalUserData(@NotNull Map<String, String> map) {
        INSTANCE.setInternalUserData(map);
    }

    @JvmStatic
    public static final void setUserData(@Nullable Bundle bundle) {
        INSTANCE.setUserData(bundle);
    }

    public final void flush() {
        this.loggerImpl.flush();
    }

    public final void logChangedSettingsEvent(@NotNull Bundle parameters) {
        if (((parameters.getInt("previous") & 2) != 0) || FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly("fb_sdk_settings_changed", null, parameters);
        }
    }

    public final void logEvent(@Nullable String eventName, @Nullable Bundle parameters) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEvent(eventName, parameters);
        }
    }

    public final void logEventFromSE(@Nullable String eventName, @Nullable String buttonText) {
        this.loggerImpl.logEventFromSE(eventName, buttonText);
    }

    public final void logEventImplicitly(@Nullable String eventName, @Nullable BigDecimal purchaseAmount, @Nullable Currency currency, @Nullable Bundle parameters) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(eventName, purchaseAmount, currency, parameters);
        }
    }

    public final void logPurchaseImplicitly(@Nullable BigDecimal purchaseAmount, @Nullable Currency currency, @Nullable Bundle parameters) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logPurchaseImplicitly(purchaseAmount, currency, parameters);
        }
    }

    public InternalAppEventsLogger(@Nullable Context context) {
        this(new AppEventsLoggerImpl(context, (String) null, (AccessToken) null));
    }

    public InternalAppEventsLogger(@Nullable Context context, @Nullable String str) {
        this(new AppEventsLoggerImpl(context, str, (AccessToken) null));
    }

    public final void logEvent(@Nullable String eventName, double valueToSum, @Nullable Bundle parameters) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEvent(eventName, valueToSum, parameters);
        }
    }

    public final void logEventImplicitly(@Nullable String eventName) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(eventName, null, null);
        }
    }

    public InternalAppEventsLogger(@NotNull String str, @Nullable String str2, @Nullable AccessToken accessToken) {
        this(new AppEventsLoggerImpl(str, str2, accessToken));
    }

    public final void logEventImplicitly(@Nullable String eventName, @Nullable Double valueToSum, @Nullable Bundle parameters) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(eventName, valueToSum, parameters);
        }
    }

    public final void logEventImplicitly(@Nullable String eventName, @Nullable Bundle parameters) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(eventName, null, parameters);
        }
    }
}
