package com.xiaomi.fitness.baseui.notch;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.RomUtils;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\"\u0010\n\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\n\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/baseui/notch/NotchScreenManager;", "", "<init>", "()V", "notchScreen", "Lcom/xiaomi/fitness/baseui/notch/INotchScreen;", "setDisplayInNotch", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "getNotchInfo", "Ljava/lang/ref/WeakReference;", "notchScreenCallback", "Lcom/xiaomi/fitness/baseui/notch/INotchScreen$NotchScreenCallback;", "getNotchScreen", "Companion", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotchScreenManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final NotchScreenManager instance = new NotchScreenManager();

    @Nullable
    private final INotchScreen notchScreen = getNotchScreen();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/baseui/notch/NotchScreenManager$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/baseui/notch/NotchScreenManager;", "getInstance", "()Lcom/xiaomi/fitness/baseui/notch/NotchScreenManager;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NotchScreenManager getInstance() {
            return NotchScreenManager.instance;
        }
    }

    private NotchScreenManager() {
    }

    private final INotchScreen getNotchScreen() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new AndroidPNotchScreen();
        }
        RomUtils romUtils = RomUtils.INSTANCE;
        if (romUtils.isHuawei()) {
            return new HuaweiNotchScreen();
        }
        if (romUtils.isOppo()) {
            return new OppoNotchScreen();
        }
        if (romUtils.isVivo()) {
            return new VivoNotchScreen();
        }
        if (RomUtils.isXiaomi()) {
            return new MiNotchScreen();
        }
        return null;
    }

    public final void getNotchInfo(@Nullable WeakReference<Activity> activity, @Nullable final INotchScreen.NotchScreenCallback notchScreenCallback) {
        final INotchScreen.NotchScreenInfo notchScreenInfo = new INotchScreen.NotchScreenInfo();
        INotchScreen iNotchScreen = this.notchScreen;
        if (iNotchScreen != null && iNotchScreen.hasNotch(activity)) {
            this.notchScreen.getNotchRect(activity, new INotchScreen.NotchSizeCallback() { // from class: com.xiaomi.fitness.baseui.notch.NotchScreenManager.getNotchInfo.1
                @Override // com.xiaomi.fitness.baseui.notch.INotchScreen.NotchSizeCallback
                public void onResult(List<Rect> notchRects) {
                    if (notchRects != null && notchRects.size() > 0) {
                        notchScreenInfo.setHasNotch(true);
                        notchScreenInfo.setNotchRects(notchRects);
                    }
                    INotchScreen.NotchScreenCallback notchScreenCallback2 = notchScreenCallback;
                    Intrinsics.checkNotNull(notchScreenCallback2);
                    notchScreenCallback2.onResult(notchScreenInfo);
                }
            });
        } else if (notchScreenCallback != null) {
            notchScreenCallback.onResult(notchScreenInfo);
        }
    }

    public final void setDisplayInNotch(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        INotchScreen iNotchScreen = this.notchScreen;
        if (iNotchScreen != null) {
            iNotchScreen.setDisplayInNotch(new WeakReference<>(activity));
        }
    }
}
