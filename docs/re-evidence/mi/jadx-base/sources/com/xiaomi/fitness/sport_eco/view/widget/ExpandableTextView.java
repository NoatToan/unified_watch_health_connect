package com.xiaomi.fitness.sport_eco.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.passport.ui.internal.MenuBuilder;
import defpackage.e1j;
import defpackage.v4j;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000*\u0001\u0010\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/widget/ExpandableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "moreText", "", "lessText", "ellipsizeText", "oriCharSequence", "textWatcher", "com/xiaomi/fitness/sport_eco/view/widget/ExpandableTextView$textWatcher$1", "Lcom/xiaomi/fitness/sport_eco/view/widget/ExpandableTextView$textWatcher$1;", "lessLines", "expandTextColor", "expandTextSize", "", "showLess", "", "showMore", "setTextSpan", "span", "Landroid/text/SpannableStringBuilder;", "genClickSpan", "text", "spanText", "more", "", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExpandableTextView extends AppCompatTextView {

    @NotNull
    private final String ellipsizeText;
    private final int expandTextColor;
    private final float expandTextSize;
    private final int lessLines;

    @NotNull
    private final String lessText;

    @NotNull
    private final String moreText;

    @Nullable
    private String oriCharSequence;

    @NotNull
    private final ExpandableTextView$textWatcher$1 textWatcher;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ExpandableTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final SpannableStringBuilder genClickSpan(String text, String spanText, final boolean more) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) text, spanText, 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.xiaomi.fitness.sport_eco.view.widget.ExpandableTextView.genClickSpan.1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                if (more) {
                    ExpandableTextView.this.showMore();
                } else {
                    ExpandableTextView.this.showLess();
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(ExpandableTextView.this.expandTextColor);
                ds.setUnderlineText(false);
            }
        }, iLastIndexOf$default, spanText.length() + iLastIndexOf$default, 0);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.expandTextSize), iLastIndexOf$default, spanText.length() + iLastIndexOf$default, 33);
        return spannableStringBuilder;
    }

    private final void setTextSpan(SpannableStringBuilder span) {
        removeTextChangedListener(this.textWatcher);
        setText(span);
        addTextChangedListener(this.textWatcher);
    }

    public final void showLess() {
        String str;
        Logger.d(com.xiaomi.xms.wearable.widget.ExpandableTextView.TAG, "showLess: layout = " + getLayout());
        if (this.lessLines >= getLineCount() || getLayout() == null || (str = this.oriCharSequence) == null) {
            return;
        }
        int lineEnd = getLayout().getLineEnd(this.lessLines - 1);
        CharSequence charSequenceSubSequence = str.subSequence(0, (lineEnd - this.ellipsizeText.length()) - this.moreText.length());
        String str2 = ((Object) charSequenceSubSequence) + this.ellipsizeText + this.moreText;
        Logger.d(com.xiaomi.xms.wearable.widget.ExpandableTextView.TAG, "showLess: lineEndIndex = " + lineEnd + "; expandLen = " + this.moreText.length() + "; res = " + str2);
        setTextSpan(genClickSpan(str2, this.moreText, true));
    }

    public final void showMore() {
        String str;
        if (getLayout() == null || (str = this.oriCharSequence) == null) {
            return;
        }
        String str2 = str + this.lessText;
        Logger.d(com.xiaomi.xms.wearable.widget.ExpandableTextView.TAG, "showMore:  res = " + str2);
        setTextSpan(genClickSpan(str2, this.lessText, false));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ExpandableTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.text.TextWatcher, com.xiaomi.fitness.sport_eco.view.widget.ExpandableTextView$textWatcher$1] */
    @JvmOverloads
    public ExpandableTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.moreText = ResourceExtKt.getString(e1j.common_more);
        this.lessText = " " + ResourceExtKt.getString(e1j.c3);
        ?? r0 = new TextWatcher() { // from class: com.xiaomi.fitness.sport_eco.view.widget.ExpandableTextView$textWatcher$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                this.this$0.oriCharSequence = s != null ? s.toString() : null;
                Logger.d(com.xiaomi.xms.wearable.widget.ExpandableTextView.TAG, "onTextChanged: ori = " + this.this$0.oriCharSequence);
                this.this$0.showLess();
            }
        };
        this.textWatcher = r0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v4j.b1, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.lessLines = typedArrayObtainStyledAttributes.getInt(v4j.d1, 2);
        this.expandTextColor = typedArrayObtainStyledAttributes.getColor(v4j.e1, MenuBuilder.CATEGORY_MASK);
        this.expandTextSize = typedArrayObtainStyledAttributes.getDimension(v4j.f1, getTextSize());
        String string = typedArrayObtainStyledAttributes.getString(v4j.c1);
        this.ellipsizeText = string == null ? new String(new char[]{Typography.ellipsis, ' '}) : string;
        typedArrayObtainStyledAttributes.recycle();
        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(0);
        addTextChangedListener(r0);
    }

    public /* synthetic */ ExpandableTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
