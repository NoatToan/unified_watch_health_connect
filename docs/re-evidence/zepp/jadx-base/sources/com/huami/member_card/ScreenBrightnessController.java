package com.huami.member_card;

import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004R\u001e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/member_card/ScreenBrightnessController;", "", "", "brightness", "", "a", "lightUp", "lightDown", "Ljava/lang/ref/WeakReference;", "Landroid/view/Window;", "Ljava/lang/ref/WeakReference;", "window", "b", "F", "defaultScreenBrightness", "<init>", "(Ljava/lang/ref/WeakReference;)V", "member_card_release"}, k = 1, mv = {1, 5, 1})
public final class ScreenBrightnessController {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WeakReference<Window> window;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float defaultScreenBrightness;

    public ScreenBrightnessController(@NotNull WeakReference<Window> weakReference) {
        this.window = weakReference;
        this.defaultScreenBrightness = 0.5f;
        Window window = weakReference.get();
        if (window == null) {
            return;
        }
        this.defaultScreenBrightness = window.getAttributes().screenBrightness;
    }

    private final void a(float brightness) {
        Window window = this.window.get();
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = brightness;
        window.setAttributes(attributes);
    }

    public final void lightDown() {
        a(this.defaultScreenBrightness);
    }

    public final void lightUp() {
        a(1.0f);
    }
}
