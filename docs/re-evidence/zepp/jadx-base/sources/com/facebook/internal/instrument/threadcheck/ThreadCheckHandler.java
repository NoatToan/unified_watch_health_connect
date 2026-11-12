package com.facebook.internal.instrument.threadcheck;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import com.facebook.internal.instrument.InstrumentData;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0007J$\u0010\t\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J$\u0010\n\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J,\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/facebook/internal/instrument/threadcheck/ThreadCheckHandler;", "", "", "enable", "Ljava/lang/Class;", "clazz", "", "methodName", "methodDesc", "uiThreadViolationDetected", "workerThreadViolationDetected", "annotation", "a", "Ljava/lang/String;", "TAG", "", "b", "Z", Constants.ENABLED, "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ThreadCheckHandler {

    @NotNull
    public static final ThreadCheckHandler INSTANCE = new ThreadCheckHandler();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = ThreadCheckHandler.class.getCanonicalName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static boolean enabled;

    private ThreadCheckHandler() {
    }

    private final void a(String annotation, Class<?> clazz, String methodName, String methodDesc) {
        if (enabled) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, "%s annotation violation detected in %s.%s%s. Current looper is %s and main looper is %s.", Arrays.copyOf(new Object[]{annotation, clazz.getName(), methodName, methodDesc, Looper.myLooper(), Looper.getMainLooper()}, 6));
            Exception exc = new Exception();
            Log.e(TAG, str, exc);
            InstrumentData.Builder.build(exc, InstrumentData.Type.ThreadCheck).save();
        }
    }

    @JvmStatic
    public static final void enable() {
        enabled = true;
    }

    @JvmStatic
    public static final void uiThreadViolationDetected(@NotNull Class<?> clazz, @NotNull String methodName, @NotNull String methodDesc) {
        INSTANCE.a("@UiThread", clazz, methodName, methodDesc);
    }

    @JvmStatic
    public static final void workerThreadViolationDetected(@NotNull Class<?> clazz, @NotNull String methodName, @NotNull String methodDesc) {
        INSTANCE.a("@WorkerThread", clazz, methodName, methodDesc);
    }
}
