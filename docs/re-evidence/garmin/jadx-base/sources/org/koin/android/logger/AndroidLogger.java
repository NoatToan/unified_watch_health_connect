package org.koin.android.logger;

import com.google.firebase.messaging.Constants;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0016¨\u0006\u000b"}, d2 = {"Lorg/koin/android/logger/AndroidLogger;", "Lorg/koin/core/logger/Logger;", "level", "Lorg/koin/core/logger/Level;", "<init>", "(Lorg/koin/core/logger/Level;)V", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "", "msg", "", "Lorg/koin/core/logger/MESSAGE;", "koin-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidLogger extends Logger {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Level.values().length];
            try {
                iArr[Level.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Level.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Level.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Level.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AndroidLogger(Level level, int i14, j jVar) {
        this((i14 & 1) != 0 ? Level.INFO : level);
    }

    @Override // org.koin.core.logger.Logger
    public void display(Level level, String msg) {
        level.getClass();
        msg.getClass();
        int i14 = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLogger(Level level) {
        super(level);
        level.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
