package com.xiaomi.fitness.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.miui.circulate.device.api.Column;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0014¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/widget/SwitchButtonBindingTwoLineTextView;", "Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setupViewAccessibility", "", "Companion", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SwitchButtonBindingTwoLineTextView extends SwitchButtonTwoLineTextView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0007J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\tH\u0007J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\tH\u0007J\u001a\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\tH\u0007J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0019H\u0007¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/widget/SwitchButtonBindingTwoLineTextView$Companion;", "", "<init>", "()V", "setIcon", "", "view", "Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "icon", "", "iconDrawable", "Landroid/graphics/drawable/Drawable;", "url", "", "setTitle", "title", "titleRes", "setSubtitle", "subtitleRes", Column.SUBTITLE, "remindText", "text", "textRes", "setSwitchOn", "switchOn", "", "setEnable", "isEnabled", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void remindText(@NotNull SwitchButtonTwoLineTextView view, @Nullable String text) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setRemindText(text);
        }

        @JvmStatic
        public final void setEnable(@NotNull SwitchButtonTwoLineTextView view, boolean isEnabled) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setEnable(isEnabled);
        }

        @JvmStatic
        public final void setIcon(@NotNull SwitchButtonTwoLineTextView view, int icon) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setIcon(icon);
        }

        @JvmStatic
        public final void setSubtitle(@NotNull SwitchButtonTwoLineTextView view, int subtitleRes) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setSubtitle(subtitleRes);
        }

        @JvmStatic
        public final void setSwitchOn(@NotNull SwitchButtonTwoLineTextView view, boolean switchOn) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setSwitch(switchOn);
        }

        @JvmStatic
        public final void setTitle(@NotNull SwitchButtonTwoLineTextView view, @Nullable String title) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setTitle(title);
        }

        @JvmStatic
        public final void remindText(@NotNull SwitchButtonTwoLineTextView view, int textRes) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setRemindText(textRes);
        }

        @JvmStatic
        public final void setIcon(@NotNull SwitchButtonTwoLineTextView view, @Nullable Drawable iconDrawable) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setIcon(iconDrawable);
        }

        @JvmStatic
        public final void setSubtitle(@NotNull SwitchButtonTwoLineTextView view, @Nullable String subtitle) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setSubtitle(subtitle);
        }

        @JvmStatic
        public final void setTitle(@NotNull SwitchButtonTwoLineTextView view, int titleRes) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setTitle(titleRes);
        }

        @JvmStatic
        public final void setIcon(@NotNull SwitchButtonTwoLineTextView view, @Nullable String url) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setIcon(url);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwitchButtonBindingTwoLineTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @JvmStatic
    public static final void remindText(@NotNull SwitchButtonTwoLineTextView switchButtonTwoLineTextView, int i) {
        INSTANCE.remindText(switchButtonTwoLineTextView, i);
    }

    @JvmStatic
    public static final void setEnable(@NotNull SwitchButtonTwoLineTextView switchButtonTwoLineTextView, boolean z) {
        INSTANCE.setEnable(switchButtonTwoLineTextView, z);
    }

    @JvmStatic
    public static final void setIcon(@NotNull SwitchButtonTwoLineTextView switchButtonTwoLineTextView, int i) {
        INSTANCE.setIcon(switchButtonTwoLineTextView, i);
    }

    @JvmStatic
    public static final void setSubtitle(@NotNull SwitchButtonTwoLineTextView switchButtonTwoLineTextView, int i) {
        INSTANCE.setSubtitle(switchButtonTwoLineTextView, i);
    }

    @JvmStatic
    public static final void setSwitchOn(@NotNull SwitchButtonTwoLineTextView switchButtonTwoLineTextView, boolean z) {
        INSTANCE.setSwitchOn(switchButtonTwoLineTextView, z);
    }

    @JvmStatic
    public static final void setTitle(@NotNull SwitchButtonTwoLineTextView switchButtonTwoLineTextView, int i) {
        INSTANCE.setTitle(switchButtonTwoLineTextView, i);
    }

    @Override // com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView
    public void setupViewAccessibility() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwitchButtonBindingTwoLineTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @JvmStatic
    public static final void remindText(@NotNull SwitchButtonTwoLineTextView switchButtonTwoLineTextView, @Nullable String str) {
        INSTANCE.remindText(switchButtonTwoLineTextView, str);
    }

    @JvmStatic
    public static final void setIcon(@NotNull SwitchButtonTwoLineTextView switchButtonTwoLineTextView, @Nullable Drawable drawable) {
        INSTANCE.setIcon(switchButtonTwoLineTextView, drawable);
    }

    @JvmStatic
    public static final void setSubtitle(@NotNull SwitchButtonTwoLineTextView switchButtonTwoLineTextView, @Nullable String str) {
        INSTANCE.setSubtitle(switchButtonTwoLineTextView, str);
    }

    @JvmStatic
    public static final void setTitle(@NotNull SwitchButtonTwoLineTextView switchButtonTwoLineTextView, @Nullable String str) {
        INSTANCE.setTitle(switchButtonTwoLineTextView, str);
    }

    public /* synthetic */ SwitchButtonBindingTwoLineTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @JvmStatic
    public static final void setIcon(@NotNull SwitchButtonTwoLineTextView switchButtonTwoLineTextView, @Nullable String str) {
        INSTANCE.setIcon(switchButtonTwoLineTextView, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwitchButtonBindingTwoLineTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
