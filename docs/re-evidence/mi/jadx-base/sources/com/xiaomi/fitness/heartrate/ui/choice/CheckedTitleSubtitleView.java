package com.xiaomi.fitness.heartrate.ui.choice;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import defpackage.fri;
import defpackage.lui;
import defpackage.o4j;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\bJ\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\bJ\u0010\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/choice/CheckedTitleSubtitleView;", "Landroid/widget/FrameLayout;", "Landroid/widget/Checkable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mTvTitle", "Landroid/widget/TextView;", "mTvSummary", "mRadioButton", "Landroid/widget/RadioButton;", "setTitle", "", "id", "title", "", "setSummary", "summary", "setChecked", "checked", "", "isChecked", "toggle", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckedTitleSubtitleView extends FrameLayout implements Checkable {

    @NotNull
    private final RadioButton mRadioButton;

    @NotNull
    private final TextView mTvSummary;

    @NotNull
    private final TextView mTvTitle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckedTitleSubtitleView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.mRadioButton.isChecked();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        this.mRadioButton.setChecked(checked);
    }

    public final void setSummary(int id) {
        this.mTvSummary.setText(id);
    }

    public final void setTitle(int id) {
        this.mTvTitle.setText(id);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.mRadioButton.toggle();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckedTitleSubtitleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setSummary(@Nullable String summary) {
        this.mTvSummary.setText(summary);
    }

    public final void setTitle(@Nullable String title) {
        this.mTvTitle.setText(title);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckedTitleSubtitleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CheckedTitleSubtitleView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckedTitleSubtitleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o4j.S);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(o4j.U);
        String string2 = typedArrayObtainStyledAttributes.getString(o4j.V);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(o4j.T, false);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = LayoutInflater.from(context).inflate(lui.j, (ViewGroup) this, true);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        this.mTvTitle = (TextView) viewInflate.findViewById(fri.H);
        this.mTvSummary = (TextView) viewInflate.findViewById(fri.G);
        RadioButton radioButton = (RadioButton) viewInflate.findViewById(fri.f18131b);
        this.mRadioButton = radioButton;
        radioButton.setClickable(false);
        radioButton.setFocusable(false);
        setTitle(string);
        setSummary(string2);
        setChecked(z);
    }
}
