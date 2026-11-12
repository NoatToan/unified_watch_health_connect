package org.koin.android.logger;

import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.logger.LoggerKt;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001c\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\f"}, d2 = {"Lorg/koin/android/logger/AndroidLogger;", "Lorg/koin/core/logger/Logger;", "", "Lorg/koin/core/logger/MESSAGE;", "msg", "Lorg/koin/core/logger/Level;", FirebaseAnalytics.Param.LEVEL, "", "c", "log", "<init>", "(Lorg/koin/core/logger/Level;)V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
public final class AndroidLogger extends Logger {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Level.values().length];
            iArr[Level.DEBUG.ordinal()] = 1;
            iArr[Level.INFO.ordinal()] = 2;
            iArr[Level.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public AndroidLogger(@NotNull Level level) {
        super(level);
    }

    private final void c(String msg, Level level) {
        int i = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
        if (i == 1) {
            Log.d(LoggerKt.KOIN_TAG, msg);
            return;
        }
        if (i == 2) {
            Log.i(LoggerKt.KOIN_TAG, msg);
        } else if (i != 3) {
            Log.e(LoggerKt.KOIN_TAG, msg);
        } else {
            Log.e(LoggerKt.KOIN_TAG, msg);
        }
    }

    @Override // org.koin.core.logger.Logger
    public void log(@NotNull Level level, @NotNull String msg) {
        if (getCom.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL java.lang.String().compareTo(level) <= 0) {
            c(msg, level);
        }
    }

    public /* synthetic */ AndroidLogger(Level level, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Level.INFO : level);
    }
}
