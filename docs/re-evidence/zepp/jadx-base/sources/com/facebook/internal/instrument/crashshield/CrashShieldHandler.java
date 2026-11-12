package com.facebook.internal.instrument.crashshield;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.ExceptionAnalyzer;
import com.facebook.internal.instrument.InstrumentData;
import com.huami.passport.Configs;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0001H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0001H\u0007J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007J\b\u0010\f\u001a\u00020\u0002H\u0007J\b\u0010\r\u001a\u00020\u0002H\u0007J\b\u0010\u000e\u001a\u00020\tH\u0007J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007R:\u0010\u0015\u001a&\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00010\u0001 \u0011*\u0012\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00120\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/facebook/internal/instrument/crashshield/CrashShieldHandler;", "", "", "enable", WatchFaceApi.CUSTOMIZABLE_DISABLE, "", "e", "o", "handleThrowable", "", "isObjectCrashing", "methodFinished", Configs.Params.RESET, "resetCrashingObjects", "isDebug", "scheduleCrashInDebug", "", "kotlin.jvm.PlatformType", "", "a", "Ljava/util/Set;", "crashingObjects", "b", "Z", Constants.ENABLED, "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class CrashShieldHandler {

    @NotNull
    public static final CrashShieldHandler INSTANCE = new CrashShieldHandler();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final Set<Object> crashingObjects = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static boolean enabled;

    private CrashShieldHandler() {
    }

    @JvmStatic
    @VisibleForTesting
    public static final void disable() {
        enabled = false;
    }

    @JvmStatic
    public static final void enable() {
        enabled = true;
    }

    @JvmStatic
    public static final void handleThrowable(@Nullable Throwable e, @NotNull Object o) {
        if (enabled) {
            crashingObjects.add(o);
            if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                ExceptionAnalyzer.execute(e);
                InstrumentData.Builder.build(e, InstrumentData.Type.CrashShield).save();
            }
            scheduleCrashInDebug(e);
        }
    }

    @JvmStatic
    @VisibleForTesting
    public static final boolean isDebug() {
        return false;
    }

    @JvmStatic
    public static final boolean isObjectCrashing(@NotNull Object o) {
        return crashingObjects.contains(o);
    }

    @JvmStatic
    public static final void methodFinished(@Nullable Object o) {
    }

    @JvmStatic
    public static final void reset() {
        resetCrashingObjects();
    }

    @JvmStatic
    public static final void resetCrashingObjects() {
        crashingObjects.clear();
    }

    @JvmStatic
    @VisibleForTesting
    public static final void scheduleCrashInDebug(@Nullable final Throwable e) {
        if (isDebug()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.internal.instrument.crashshield.CrashShieldHandler.scheduleCrashInDebug.1
                @Override // java.lang.Runnable
                public void run() {
                    throw new RuntimeException(e);
                }
            });
        }
    }
}
