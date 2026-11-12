package com.xiaomi.fitness.notify.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.notify.widget.CheckBoxTextView;
import defpackage.nri;
import defpackage.p80;
import defpackage.s4j;
import defpackage.tui;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001d\u001a\u00020\u0017H\u0002R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/notify/widget/CheckBoxTextView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "titleView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "setTitleView", "(Landroid/widget/TextView;)V", "checkView", "Landroid/widget/CheckBox;", "getCheckView", "()Landroid/widget/CheckBox;", "setCheckView", "(Landroid/widget/CheckBox;)V", "setChecked", "", "isChecked", "", "setOnCheckedChangeListener", "onCheckedChangeListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setupViewAccessibility", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class CheckBoxTextView extends LinearLayout {

    @NotNull
    private CheckBox checkView;

    @NotNull
    private TextView titleView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckBoxTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setupViewAccessibility() {
        if (p80.a(ApplicationExtKt.getApplication())) {
            this.checkView.setFocusable(0);
            this.checkView.setClickable(false);
            setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.xiaomi.fitness.notify.widget.CheckBoxTextView.setupViewAccessibility.1
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                    Intrinsics.checkNotNullParameter(host, "host");
                    Intrinsics.checkNotNullParameter(info, "info");
                    super.onInitializeAccessibilityNodeInfo(host, info);
                    info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
                }
            });
            setOnClickListener(new View.OnClickListener() { // from class: iu3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CheckBoxTextView.setupViewAccessibility$lambda$0(this.f22091a, view);
                }
            });
            return;
        }
        this.checkView.setFocusable(1);
        this.checkView.setClickable(true);
        setAccessibilityDelegate(null);
        setOnClickListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViewAccessibility$lambda$0(CheckBoxTextView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkView.performClick();
    }

    @NotNull
    public final CheckBox getCheckView() {
        return this.checkView;
    }

    @NotNull
    public final TextView getTitleView() {
        return this.titleView;
    }

    public final boolean isChecked() {
        return this.checkView.isChecked();
    }

    public final void setCheckView(@NotNull CheckBox checkBox) {
        Intrinsics.checkNotNullParameter(checkBox, "<set-?>");
        this.checkView = checkBox;
    }

    public final void setChecked(boolean isChecked) {
        this.checkView.setChecked(isChecked);
    }

    public final void setOnCheckedChangeListener(@NotNull CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        Intrinsics.checkNotNullParameter(onCheckedChangeListener, "onCheckedChangeListener");
        this.checkView.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public final void setTitleView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.titleView = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckBoxTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CheckBoxTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckBoxTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s4j.j4);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(s4j.m4);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(s4j.l4, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(s4j.k4, true);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = LayoutInflater.from(context).inflate(tui.j, (ViewGroup) this, true);
        this.titleView = (TextView) viewInflate.findViewById(nri.L);
        this.checkView = (CheckBox) viewInflate.findViewById(nri.f28295k);
        this.titleView.setText(string);
        this.titleView.setSingleLine(z);
        this.titleView.setMaxLines(z ? 1 : Integer.MAX_VALUE);
        this.checkView.setChecked(z2);
        setupViewAccessibility();
    }
}
