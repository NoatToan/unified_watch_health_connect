package com.xiaomi.fitness.common.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ToastCompat;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u0005J\u0016\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nJ\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u0005J8\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\fH\u0007J6\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\fH\u0007J\u0006\u0010 \u001a\u00020\u0017J\b\u0010!\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/common/utils/ToastCompat;", "", "<init>", "()V", "DURATION_SHORT", "", "DURATION_LONG", "sToast", "Landroid/widget/Toast;", "sLastCharSequence", "", "sLastShowTime", "", "sLastShowDuration", "DEFAULT_DURATION", "DEFAULT_DUP_DELAY", "DEFAULT_MODE", "MSG_CANCEL", "sHandler", "Landroid/os/Handler;", "sInitialized", "", "showLong", "", "context", "Landroid/content/Context;", "text", "showShort", "show", "duration", "mode", "dupDelay", BroadcastsKt.SILENT_PUSHING_CANCEL, "init", "Mode", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nToastCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToastCompat.kt\ncom/xiaomi/fitness/common/utils/ToastCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
public final class ToastCompat {
    public static final long DEFAULT_DUP_DELAY = 0;
    public static final int DEFAULT_DURATION = 3500;
    public static final int DEFAULT_MODE = 2;
    public static final int DURATION_LONG = 3500;
    public static final int DURATION_SHORT = 2000;

    @NotNull
    public static final ToastCompat INSTANCE = new ToastCompat();
    private static final int MSG_CANCEL = 0;

    @Nullable
    private static Handler sHandler;
    private static boolean sInitialized;

    @Nullable
    private static CharSequence sLastCharSequence;
    private static int sLastShowDuration;
    private static long sLastShowTime;

    @Nullable
    private static Toast sToast;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/common/utils/ToastCompat$Mode;", "", "<init>", "()V", "REUSE", "", "NEW", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Mode {

        @NotNull
        public static final Mode INSTANCE = new Mode();
        public static final int NEW = 2;
        public static final int REUSE = 1;

        private Mode() {
        }
    }

    private ToastCompat() {
    }

    private final void init() {
        if (sInitialized) {
            return;
        }
        sHandler = new Handler(new Handler.Callback() { // from class: ngp
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return ToastCompat.init$lambda$2(message);
            }
        });
        sInitialized = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean init$lambda$2(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what != 0) {
            return false;
        }
        INSTANCE.cancel();
        return false;
    }

    public static /* synthetic */ void show$default(ToastCompat toastCompat, Context context, int i, int i2, int i3, long j, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 3500;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = 2;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            j = 0;
        }
        toastCompat.show(context, i, i5, i6, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$1(int i, int i2, CharSequence text, Context appContext, long j, Context context) {
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(appContext, "$appContext");
        Intrinsics.checkNotNullParameter(context, "$context");
        if (i < 100 || i > 3500) {
            throw new IllegalArgumentException("Invalid duration, duration should between 100 and 3500".toString());
        }
        ToastCompat toastCompat = INSTANCE;
        toastCompat.init();
        if (i2 == 1) {
            if (!TextUtils.equals(sLastCharSequence, text) || sLastShowTime + ((long) sLastShowDuration) + j < System.currentTimeMillis()) {
                toastCompat.show(context, text, i, 2, j);
                return;
            }
            return;
        }
        if (i2 != 2) {
            return;
        }
        toastCompat.cancel();
        sLastCharSequence = text;
        sLastShowDuration = i;
        sLastShowTime = System.currentTimeMillis();
        sToast = i <= 2000 ? Toast.makeText(appContext, text, 0) : Toast.makeText(appContext, text, 1);
        if (i != 2000 && i != 3500) {
            Handler handler = sHandler;
            Intrinsics.checkNotNull(handler);
            handler.sendEmptyMessageDelayed(0, i);
        }
        Toast toast = sToast;
        Intrinsics.checkNotNull(toast);
        toast.show();
    }

    public final void cancel() {
        Handler handler = sHandler;
        if (handler != null) {
            Intrinsics.checkNotNull(handler);
            handler.removeMessages(0);
        }
        Toast toast = sToast;
        if (toast != null) {
            Intrinsics.checkNotNull(toast);
            toast.cancel();
            sToast = null;
        }
    }

    @JvmOverloads
    public final void show(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        show$default(this, context, i, 0, 0, 0L, 28, (Object) null);
    }

    public final void showLong(@NotNull Context context, @NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        show$default(this, context, text, 3500, 0, 0L, 24, (Object) null);
    }

    public final void showShort(@NotNull Context context, @NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        show$default(this, context, text, 2000, 0, 0L, 24, (Object) null);
    }

    public static /* synthetic */ void show$default(ToastCompat toastCompat, Context context, CharSequence charSequence, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 3500;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = 2;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            j = 0;
        }
        toastCompat.show(context, charSequence, i4, i5, j);
    }

    @JvmOverloads
    public final void show(@NotNull Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        show$default(this, context, i, i2, 0, 0L, 24, (Object) null);
    }

    public final void showLong(@NotNull Context context, int text) {
        Intrinsics.checkNotNullParameter(context, "context");
        CharSequence text2 = context.getText(text);
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        showLong(context, text2);
    }

    public final void showShort(@NotNull Context context, int text) {
        Intrinsics.checkNotNullParameter(context, "context");
        CharSequence text2 = context.getText(text);
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        showShort(context, text2);
    }

    @JvmOverloads
    public final void show(@NotNull Context context, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(context, "context");
        show$default(this, context, i, i2, i3, 0L, 16, (Object) null);
    }

    @JvmOverloads
    public final void show(@NotNull Context context, @NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        show$default(this, context, text, 0, 0, 0L, 28, (Object) null);
    }

    @JvmOverloads
    public final void show(@NotNull Context context, @NotNull CharSequence text, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        show$default(this, context, text, i, 0, 0L, 24, (Object) null);
    }

    @JvmOverloads
    public final void show(@NotNull Context context, @NotNull CharSequence text, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        show$default(this, context, text, i, i2, 0L, 16, (Object) null);
    }

    @JvmOverloads
    public final void show(@NotNull Context context, int text, int duration, int mode, long dupDelay) {
        Intrinsics.checkNotNullParameter(context, "context");
        CharSequence text2 = context.getText(text);
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        show(context, text2, duration, mode, dupDelay);
    }

    @JvmOverloads
    public final void show(@NotNull final Context context, @NotNull final CharSequence text, final int duration, final int mode, final long dupDelay) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        final Context safeContext = ApplicationExtKt.getSafeContext(context);
        ExecutorHelper.INSTANCE.runInMain(new Runnable() { // from class: ogp
            @Override // java.lang.Runnable
            public final void run() {
                ToastCompat.show$lambda$1(duration, mode, text, safeContext, dupDelay, context);
            }
        });
    }
}
