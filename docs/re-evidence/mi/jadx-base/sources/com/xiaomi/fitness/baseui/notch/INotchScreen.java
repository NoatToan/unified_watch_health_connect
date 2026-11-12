package com.xiaomi.fitness.baseui.notch;

import android.app.Activity;
import android.graphics.Rect;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\r\u000e\u000f\u0010J\u001a\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H&J\u001a\u0010\u0007\u001a\u00020\b2\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H&J$\u0010\t\u001a\u00020\b2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/baseui/notch/INotchScreen;", "", "hasNotch", "", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "setDisplayInNotch", "", "getNotchRect", LifecycleConstantKt.TYPE_ACTIVITY, "callback", "Lcom/xiaomi/fitness/baseui/notch/INotchScreen$NotchSizeCallback;", "NotchSizeCallback", "HasNotchCallback", "NotchScreenCallback", "NotchScreenInfo", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface INotchScreen {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/baseui/notch/INotchScreen$HasNotchCallback;", "", "onResult", "", "hasNotch", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface HasNotchCallback {
        void onResult(boolean hasNotch);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/baseui/notch/INotchScreen$NotchScreenCallback;", "", "onResult", "", "notchScreenInfo", "Lcom/xiaomi/fitness/baseui/notch/INotchScreen$NotchScreenInfo;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface NotchScreenCallback {
        void onResult(@Nullable NotchScreenInfo notchScreenInfo);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/baseui/notch/INotchScreen$NotchScreenInfo;", "", "<init>", "()V", "hasNotch", "", "getHasNotch", "()Z", "setHasNotch", "(Z)V", "notchRects", "", "Landroid/graphics/Rect;", "getNotchRects", "()Ljava/util/List;", "setNotchRects", "(Ljava/util/List;)V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotchScreenInfo {
        private boolean hasNotch;

        @Nullable
        private List<Rect> notchRects;

        public final boolean getHasNotch() {
            return this.hasNotch;
        }

        @Nullable
        public final List<Rect> getNotchRects() {
            return this.notchRects;
        }

        public final void setHasNotch(boolean z) {
            this.hasNotch = z;
        }

        public final void setNotchRects(@Nullable List<Rect> list) {
            this.notchRects = list;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/baseui/notch/INotchScreen$NotchSizeCallback;", "", "onResult", "", "notchRects", "", "Landroid/graphics/Rect;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface NotchSizeCallback {
        void onResult(@Nullable List<Rect> notchRects);
    }

    void getNotchRect(@Nullable WeakReference<Activity> activity, @Nullable NotchSizeCallback callback);

    boolean hasNotch(@Nullable WeakReference<Activity> activityWeakReference);

    void setDisplayInNotch(@Nullable WeakReference<Activity> activityWeakReference);
}
