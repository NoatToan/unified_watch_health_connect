package com.facebook.internal;

import android.util.Log;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 (2\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u0012\u0010\r\u001a\u00020\u00062\n\u0010\f\u001a\u00060\nj\u0002`\u000bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J)\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f\"\u00020\u0001¢\u0006\u0004\b\r\u0010\u0011J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0001R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00060\nj\u0002`\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010%\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/facebook/internal/Logger;", "", "", "a", "", "getContents", "", "log", "string", "logString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "stringBuilder", "append", TrainingWebConst.QueryParam.VIDEO_FORMAT, "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)V", "key", "value", "appendKeyValue", "Lcom/facebook/LoggingBehavior;", "Lcom/facebook/LoggingBehavior;", "behavior", "b", "Ljava/lang/String;", "tag", "c", "Ljava/lang/StringBuilder;", "contents", "", GoogleApiAvailabilityLight.a, LogUtil.I, "getPriority", "()I", "setPriority", "(I)V", "priority", "<init>", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;)V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class Logger {

    @NotNull
    public static final String LOG_TAG_BASE = "FacebookSDK.";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LoggingBehavior behavior;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String tag;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final HashMap<String, String> e = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int priority = 3;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private StringBuilder contents = new StringBuilder();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0007J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J;\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0010\"\u00020\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u0012JC\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0010\"\u00020\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u0015J(\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R2\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0018j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/facebook/internal/Logger$Companion;", "", "", "string", "a", "original", "replace", "", "registerStringToReplace", "accessToken", "registerAccessToken", "Lcom/facebook/LoggingBehavior;", "behavior", "tag", "log", TrainingWebConst.QueryParam.VIDEO_FORMAT, "", "args", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "", "priority", "(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "LOG_TAG_BASE", "Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "stringsToReplace", "Ljava/util/HashMap;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized String a(String string) {
            String strReplace$default;
            strReplace$default = string;
            for (Map.Entry entry : Logger.e.entrySet()) {
                strReplace$default = m.replace$default(strReplace$default, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
            }
            return strReplace$default;
        }

        @JvmStatic
        public final void log(@NotNull LoggingBehavior behavior, @NotNull String tag, @NotNull String string) {
            log(behavior, 3, tag, string);
        }

        @JvmStatic
        public final synchronized void registerAccessToken(@NotNull String accessToken) {
            if (!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                registerStringToReplace(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }

        @JvmStatic
        public final synchronized void registerStringToReplace(@NotNull String original, @NotNull String replace) {
            Logger.e.put(original, replace);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void log(@NotNull LoggingBehavior behavior, @NotNull String tag, @NotNull String format, @NotNull Object... args) {
            if (FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                log(behavior, 3, tag, String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
            }
        }

        @JvmStatic
        public final void log(@NotNull LoggingBehavior behavior, int priority, @NotNull String tag, @NotNull String format, @NotNull Object... args) {
            if (FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                log(behavior, priority, tag, String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
            }
        }

        @JvmStatic
        public final void log(@NotNull LoggingBehavior behavior, int priority, @NotNull String tag, @NotNull String string) {
            if (FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
                String strA = a(string);
                if (!m.startsWith$default(tag, Logger.LOG_TAG_BASE, false, 2, null)) {
                    tag = Logger.LOG_TAG_BASE + tag;
                }
                Log.println(priority, tag, strA);
                if (behavior == LoggingBehavior.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }
    }

    public Logger(@NotNull LoggingBehavior loggingBehavior, @NotNull String str) {
        this.behavior = loggingBehavior;
        this.tag = LOG_TAG_BASE + Validate.notNullOrEmpty(str, "tag");
    }

    private final boolean a() {
        return FacebookSdk.isLoggingBehaviorEnabled(this.behavior);
    }

    @JvmStatic
    public static final void log(@NotNull LoggingBehavior loggingBehavior, int i, @NotNull String str, @NotNull String str2) {
        INSTANCE.log(loggingBehavior, i, str, str2);
    }

    @JvmStatic
    public static final void log(@NotNull LoggingBehavior loggingBehavior, int i, @NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
        INSTANCE.log(loggingBehavior, i, str, str2, objArr);
    }

    @JvmStatic
    public static final void log(@NotNull LoggingBehavior loggingBehavior, @NotNull String str, @NotNull String str2) {
        INSTANCE.log(loggingBehavior, str, str2);
    }

    @JvmStatic
    public static final void log(@NotNull LoggingBehavior loggingBehavior, @NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
        INSTANCE.log(loggingBehavior, str, str2, objArr);
    }

    @JvmStatic
    public static final synchronized void registerAccessToken(@NotNull String str) {
        INSTANCE.registerAccessToken(str);
    }

    @JvmStatic
    public static final synchronized void registerStringToReplace(@NotNull String str, @NotNull String str2) {
        INSTANCE.registerStringToReplace(str, str2);
    }

    public final void append(@NotNull StringBuilder stringBuilder) {
        if (a()) {
            this.contents.append((CharSequence) stringBuilder);
        }
    }

    public final void appendKeyValue(@NotNull String key, @NotNull Object value) {
        append("  %s:\t%s\n", key, value);
    }

    @NotNull
    public final String getContents() {
        return INSTANCE.a(this.contents.toString());
    }

    public final int getPriority() {
        return this.priority;
    }

    public final void log() {
        logString(this.contents.toString());
        this.contents = new StringBuilder();
    }

    public final void logString(@NotNull String string) {
        INSTANCE.log(this.behavior, this.priority, this.tag, string);
    }

    public final void setPriority(int i) {
        Validate.oneOf(Integer.valueOf(i), "value", 7, 3, 6, 4, 2, 5);
        setPriority(i);
    }

    public final void append(@NotNull String string) {
        if (a()) {
            this.contents.append(string);
        }
    }

    public final void append(@NotNull String format, @NotNull Object... args) {
        if (a()) {
            StringBuilder sb = this.contents;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            sb.append(String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
        }
    }
}
