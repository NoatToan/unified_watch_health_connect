package defpackage;

import com.google.accompanist.insets.WindowInsets;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ew8 {
    public static int a(WindowInsets.Type _this) {
        return (_this.getAnimationInProgress() ? _this.getAnimatedInsets() : _this.getLayoutInsets()).getBottom();
    }

    public static int b(WindowInsets.Type _this) {
        return (_this.getAnimationInProgress() ? _this.getAnimatedInsets() : _this.getLayoutInsets()).getLeft();
    }

    public static int c(WindowInsets.Type _this) {
        return (_this.getAnimationInProgress() ? _this.getAnimatedInsets() : _this.getLayoutInsets()).getRight();
    }

    public static int d(WindowInsets.Type _this) {
        return (_this.getAnimationInProgress() ? _this.getAnimatedInsets() : _this.getLayoutInsets()).getTop();
    }
}
