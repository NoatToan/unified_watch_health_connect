package com.xiaomi.xms.wearable.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.xms.wearable.widget.ExpandableTextView;
import defpackage.d5j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 E2\u00020\u0001:\u0001EB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\u000bJ\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\rJ\u0006\u0010-\u001a\u00020+J\u0018\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0007H\u0014J\u0012\u00101\u001a\u00020\u001d2\b\u00102\u001a\u0004\u0018\u000103H\u0017J\u0010\u00104\u001a\u00020+2\u0006\u00105\u001a\u000206H\u0002J\u001f\u00107\u001a\u000206\"\b\b\u0000\u00108*\u00020\r2\u0006\u00109\u001a\u0002H8H\u0002¢\u0006\u0002\u0010:J\u001a\u0010;\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0007H\u0002J\u0010\u0010>\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\rH\u0002J8\u0010?\u001a\u00020@2\u0006\u0010=\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00072\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010C2\u000e\u0010D\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010CH\u0002R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006F"}, d2 = {"Lcom/xiaomi/xms/wearable/widget/ExpandableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mOriginText", "", "mExpandedText", "Landroid/text/SpannableStringBuilder;", "mFoldedText", "mMeasuredWidth", "mFoldedHeight", "mFoldAnimator", "Landroid/animation/Animator;", "mExpandedHeight", "mExpandAnimator", "mFoldedLines", "mSuffixTextColor", "mFoldedSuffix", "Landroid/text/SpannableString;", "mExpandedSuffix", "canFold", "", "isFolded", "mDuration", "", "isAnimating", "value", "layoutHeight", "getLayoutHeight$annotations", "()V", "getLayoutHeight", "()I", "setLayoutHeight", "(I)V", "setExpandableText", "", "text", "toggleExpand", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "buildExpandableText", "originLayout", "Landroid/text/Layout;", "createStaticLayout", "T", "source", "(Ljava/lang/CharSequence;)Landroid/text/Layout;", "createClickedSpannableString", "charSequence", StatConstants.PARAM_START, "createSpannableStringBuilder", "createAnimation", "Landroid/animation/ObjectAnimator;", StatConstants.PARAM_END, "startCallback", "Lkotlin/Function0;", "endCallback", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExpandableTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpandableTextView.kt\ncom/xiaomi/xms/wearable/widget/ExpandableTextView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
public final class ExpandableTextView extends AppCompatTextView {

    @NotNull
    public static final String DEFAULT_ACTION_TEXT_EXPAND = "展开";

    @NotNull
    public static final String DEFAULT_ACTION_TEXT_FOLD = "收起";
    public static final int DEFAULT_DURATION_TIME = 300;
    public static final int DEFAULT_EXPANDABLE_LINES = 4;

    @NotNull
    public static final String TAG = "ExpandableTextView";
    private boolean canFold;
    private boolean isAnimating;
    private boolean isFolded;
    private int layoutHeight;
    private final long mDuration;

    @Nullable
    private Animator mExpandAnimator;
    private int mExpandedHeight;

    @NotNull
    private SpannableString mExpandedSuffix;

    @NotNull
    private SpannableStringBuilder mExpandedText;

    @Nullable
    private Animator mFoldAnimator;
    private int mFoldedHeight;
    private final int mFoldedLines;

    @NotNull
    private SpannableString mFoldedSuffix;

    @NotNull
    private SpannableStringBuilder mFoldedText;
    private int mMeasuredWidth;

    @Nullable
    private CharSequence mOriginText;
    private final int mSuffixTextColor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String ELLIPSIS_STRING = new String(new char[]{Typography.ellipsis});
    private static final int DEFAULT_SUFFIX_TEXT_COLOR = Color.rgb(255, 97, 46);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/xms/wearable/widget/ExpandableTextView$Companion;", "", "<init>", "()V", "TAG", "", "ELLIPSIS_STRING", "getELLIPSIS_STRING", "()Ljava/lang/String;", "DEFAULT_EXPANDABLE_LINES", "", "DEFAULT_DURATION_TIME", "DEFAULT_SUFFIX_TEXT_COLOR", "getDEFAULT_SUFFIX_TEXT_COLOR", "()I", "DEFAULT_ACTION_TEXT_FOLD", "DEFAULT_ACTION_TEXT_EXPAND", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDEFAULT_SUFFIX_TEXT_COLOR() {
            return ExpandableTextView.DEFAULT_SUFFIX_TEXT_COLOR;
        }

        @NotNull
        public final String getELLIPSIS_STRING() {
            return ExpandableTextView.ELLIPSIS_STRING;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mExpandedText = createSpannableStringBuilder("");
        this.mFoldedText = createSpannableStringBuilder("");
        this.canFold = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d5j.E4);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.mOriginText = typedArrayObtainStyledAttributes.getString(d5j.G4);
        this.mDuration = typedArrayObtainStyledAttributes.getInt(d5j.F4, 300);
        this.mFoldedLines = typedArrayObtainStyledAttributes.getInt(d5j.I4, 4);
        this.mSuffixTextColor = typedArrayObtainStyledAttributes.getColor(d5j.K4, DEFAULT_SUFFIX_TEXT_COLOR);
        String string = typedArrayObtainStyledAttributes.getString(d5j.J4);
        string = string == null ? DEFAULT_ACTION_TEXT_EXPAND : string;
        String str = ELLIPSIS_STRING;
        this.mFoldedSuffix = createClickedSpannableString(str + string, str.length());
        String string2 = typedArrayObtainStyledAttributes.getString(d5j.H4);
        this.mExpandedSuffix = createClickedSpannableString$default(this, string2 == null ? DEFAULT_ACTION_TEXT_FOLD : string2, 0, 2, null);
        setHighlightColor(Color.argb(0, 0, 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void buildExpandableText(Layout originLayout) {
        if (TextUtils.isEmpty(this.mOriginText)) {
            return;
        }
        CharSequence charSequence = this.mOriginText;
        Intrinsics.checkNotNull(charSequence);
        SpannableStringBuilder spannableStringBuilderAppend = createSpannableStringBuilder(charSequence).append((CharSequence) this.mExpandedSuffix);
        this.mExpandedText = spannableStringBuilderAppend;
        int height = createStaticLayout(spannableStringBuilderAppend).getHeight() + getPaddingTop() + getPaddingBottom();
        this.mExpandedHeight = height;
        Logger.d(TAG, "build ExpandedText:" + height + ", " + ((Object) this.mExpandedText));
        int lineEnd = originLayout.getLineEnd(this.mFoldedLines + (-1));
        CharSequence charSequence2 = this.mOriginText;
        Intrinsics.checkNotNull(charSequence2);
        CharSequence charSequenceSubSequence = charSequence2.subSequence(0, lineEnd);
        SpannableStringBuilder spannableStringBuilderAppend2 = createSpannableStringBuilder(charSequenceSubSequence).append((CharSequence) this.mFoldedSuffix);
        while (true) {
            Intrinsics.checkNotNull(spannableStringBuilderAppend2);
            if (createStaticLayout(spannableStringBuilderAppend2).getLineCount() <= this.mFoldedLines) {
                Intrinsics.checkNotNull(spannableStringBuilderAppend2);
                SpannableStringBuilder spannableStringBuilderCreateSpannableStringBuilder = createSpannableStringBuilder(spannableStringBuilderAppend2);
                this.mFoldedText = spannableStringBuilderCreateSpannableStringBuilder;
                int height2 = createStaticLayout(spannableStringBuilderCreateSpannableStringBuilder).getHeight() + getPaddingTop() + getPaddingBottom();
                this.mFoldedHeight = height2;
                Logger.d(TAG, "build FoldedText:" + height2 + ", " + ((Object) this.mFoldedText) + " ");
                this.mFoldAnimator = createAnimation(this.mExpandedHeight, this.mFoldedHeight, null, new Function0() { // from class: wi8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ExpandableTextView.buildExpandableText$lambda$1(this.f38000a);
                    }
                });
                this.mExpandAnimator = createAnimation(this.mFoldedHeight, this.mExpandedHeight, new Function0() { // from class: xi8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ExpandableTextView.buildExpandableText$lambda$2(this.f39152a);
                    }
                }, null);
                return;
            }
            charSequenceSubSequence = charSequenceSubSequence.subSequence(0, charSequenceSubSequence.length() - 1);
            spannableStringBuilderAppend2 = createSpannableStringBuilder(charSequenceSubSequence).append((CharSequence) this.mFoldedSuffix);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildExpandableText$lambda$1(ExpandableTextView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setText(this$0.mFoldedText);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildExpandableText$lambda$2(ExpandableTextView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setText(this$0.mExpandedText);
        return Unit.INSTANCE;
    }

    private final ObjectAnimator createAnimation(int start, int end, final Function0<Unit> startCallback, final Function0<Unit> endCallback) {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "layoutHeight", start, end);
        objectAnimatorOfInt.setDuration(this.mDuration);
        objectAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.xiaomi.xms.wearable.widget.ExpandableTextView.createAnimation.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                ExpandableTextView.this.isAnimating = false;
                Function0<Unit> function0 = endCallback;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                ExpandableTextView.this.isAnimating = true;
                Function0<Unit> function0 = startCallback;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        Intrinsics.checkNotNull(objectAnimatorOfInt);
        return objectAnimatorOfInt;
    }

    private final SpannableString createClickedSpannableString(CharSequence charSequence, int start) {
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new ClickableSpan() { // from class: com.xiaomi.xms.wearable.widget.ExpandableTextView$createClickedSpannableString$1$1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                this.this$0.toggleExpand();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(this.this$0.mSuffixTextColor);
                ds.setUnderlineText(false);
            }
        }, start, charSequence.length(), 34);
        return spannableString;
    }

    public static /* synthetic */ SpannableString createClickedSpannableString$default(ExpandableTextView expandableTextView, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return expandableTextView.createClickedSpannableString(charSequence, i);
    }

    private final SpannableStringBuilder createSpannableStringBuilder(CharSequence charSequence) {
        return new SpannableStringBuilder(charSequence);
    }

    private final <T extends CharSequence> Layout createStaticLayout(T source) {
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(source, 0, source.length(), getPaint(), this.mMeasuredWidth).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(getIncludeFontPadding()).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).build();
        Intrinsics.checkNotNull(staticLayoutBuild);
        return staticLayoutBuild;
    }

    public static /* synthetic */ void getLayoutHeight$annotations() {
    }

    public final int getLayoutHeight() {
        return this.layoutHeight;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        CharSequence charSequence;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int i = this.mMeasuredWidth;
        if ((i == 0 || i != getMeasuredWidth()) && !this.isAnimating) {
            Logger.d(TAG, "width " + this.mMeasuredWidth + " changed to " + getMeasuredWidth() + " , " + this.canFold);
            this.mMeasuredWidth = getMeasuredWidth();
            if (!this.canFold || (charSequence = this.mOriginText) == null) {
                return;
            }
            setExpandableText(charSequence);
        }
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        CharSequence text = getText();
        Integer numValueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if (!(text instanceof Spanned) || ((numValueOf == null || numValueOf.intValue() != 1) && (numValueOf == null || numValueOf.intValue() != 0))) {
            return super.onTouchEvent(event);
        }
        int offsetForHorizontal = getLayout().getOffsetForHorizontal(getLayout().getLineForVertical((int) ((event.getY() - getTotalPaddingTop()) + getScrollY())), (int) ((event.getX() - getTotalPaddingLeft()) + getScrollX()));
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        Intrinsics.checkNotNull(clickableSpanArr);
        if (!(!(clickableSpanArr.length == 0))) {
            return super.onTouchEvent(event);
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            clickableSpanArr[0].onClick(this);
        }
        return true;
    }

    public final void setExpandableText(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.mOriginText = text;
        if (this.mMeasuredWidth <= 0) {
            return;
        }
        Layout layoutCreateStaticLayout = createStaticLayout(text);
        boolean z = layoutCreateStaticLayout.getLineCount() > this.mFoldedLines;
        this.canFold = z;
        this.isFolded = z;
        if (!z) {
            setText(this.mOriginText);
        } else {
            buildExpandableText(layoutCreateStaticLayout);
            setText(this.isFolded ? this.mFoldedText : this.mExpandedText);
        }
    }

    public final void setLayoutHeight(int i) {
        this.layoutHeight = i;
        Logger.d(TAG, "set layoutHeight: " + i);
        getLayoutParams().height = i;
        requestLayout();
    }

    public final void toggleExpand() {
        if (!this.canFold || this.isAnimating) {
            return;
        }
        boolean z = !this.isFolded;
        this.isFolded = z;
        if (z) {
            Animator animator = this.mFoldAnimator;
            if (animator != null) {
                animator.start();
                return;
            }
            return;
        }
        Animator animator2 = this.mExpandAnimator;
        if (animator2 != null) {
            animator2.start();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
