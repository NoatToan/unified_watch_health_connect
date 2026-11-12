package com.huami.treadmill.ui.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.R;
import com.huami.treadmill.ui.component.CollapsibleTextView;
import com.loc.z;
import com.squareup.picasso.u;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001*\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010E\u001a\u00020D\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F\u0012\b\b\u0002\u0010H\u001a\u00020\u0007¢\u0006\u0004\bI\u0010JJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J0\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0014J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0018R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0018\u0010%\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0018\u0010'\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001bR\u0016\u0010)\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001eR\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R$\u0010.\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00106\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00109\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00103\"\u0004\b8\u00105R$\u0010:\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010/\"\u0004\b;\u00101R(\u0010@\u001a\u0004\u0018\u00010\r2\b\u0010%\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010C\u001a\u0004\u0018\u00010\r2\b\u0010'\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?¨\u0006K"}, d2 = {"Lcom/huami/treadmill/ui/component/CollapsibleTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "expanded", "", "c", u.q, "", "left", "top", "right", "bottom", "onLayout", "", "str", "setFullString", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "a", LogUtil.I, "mSuffixColor", "b", "mCollapsedLines", "Z", "mSuffixTrigger", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "mText", "e", "Landroid/view/View$OnClickListener;", "mCustomClickListener", "f", "mShouldInitLayout", "g", "mExpanded", "h", "mCollapsedText", "i", "mExpandedText", z.j, "mClickListener", "com/huami/treadmill/ui/component/CollapsibleTextView$mClickSpanListener$1", hl.k, "Lcom/huami/treadmill/ui/component/CollapsibleTextView$mClickSpanListener$1;", "mClickSpanListener", "isExpanded", "()Z", "setExpanded", "(Z)V", "getSuffixColor", "()I", "setSuffixColor", "(I)V", "suffixColor", "getCollapsedLines", "setCollapsedLines", "collapsedLines", "isSuffixTrigger", "setSuffixTrigger", "getCollapsedText", "()Ljava/lang/String;", "setCollapsedText", "(Ljava/lang/String;)V", "collapsedText", "getExpandedText", "setExpandedText", "expandedText", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class CollapsibleTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int mSuffixColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mCollapsedLines;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean mSuffixTrigger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String mText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener mCustomClickListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean mShouldInitLayout;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean mExpanded;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private String mCollapsedText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private String mExpandedText;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final View.OnClickListener mClickListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final CollapsibleTextView$mClickSpanListener$1 mClickSpanListener;

    @JvmOverloads
    public CollapsibleTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public CollapsibleTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.huami.treadmill.ui.component.CollapsibleTextView$mClickSpanListener$1] */
    @JvmOverloads
    public CollapsibleTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSuffixColor = -16776961;
        this.mCollapsedLines = 1;
        this.mShouldInitLayout = true;
        this.mCollapsedText = "...Show All";
        this.mExpandedText = " Hide";
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ww0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollapsibleTextView.e(this.a, view);
            }
        };
        this.mClickListener = onClickListener;
        this.mClickSpanListener = new ClickableSpan() { // from class: com.huami.treadmill.ui.component.CollapsibleTextView$mClickSpanListener$1
            @Override // android.text.style.ClickableSpan
            public void onClick(@NotNull View widget) {
                if (this.a.mSuffixTrigger) {
                    CollapsibleTextView collapsibleTextView = this.a;
                    collapsibleTextView.mExpanded = !collapsibleTextView.mExpanded;
                    CollapsibleTextView collapsibleTextView2 = this.a;
                    collapsibleTextView2.c(collapsibleTextView2.mExpanded);
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(@NotNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.CollapsibleTextView, i, 0);
        this.mSuffixColor = typedArrayObtainStyledAttributes.getColor(R.styleable.CollapsibleTextView_suffixColor, -16776961);
        this.mCollapsedLines = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsibleTextView_collapsedLines, 1);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.CollapsibleTextView_collapsedText);
        this.mCollapsedText = string;
        if (TextUtils.isEmpty(string)) {
            this.mCollapsedText = "...Show All";
        }
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.CollapsibleTextView_expandedText);
        this.mExpandedText = string2;
        if (TextUtils.isEmpty(string2)) {
            this.mExpandedText = " Hide";
        }
        this.mSuffixTrigger = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CollapsibleTextView_suffixTrigger, false);
        this.mText = getText() == null ? null : getText().toString();
        setMovementMethod(LinkMovementMethod.getInstance());
        super.setOnClickListener(onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(boolean expanded) {
        String str;
        int i;
        int i2;
        if (TextUtils.isEmpty(this.mText)) {
            return;
        }
        String strSubstring = this.mText;
        if (expanded) {
            str = this.mExpandedText;
        } else {
            if (this.mCollapsedLines - 1 < 0) {
                throw new RuntimeException("CollapsedLines must equal or greater than 1");
            }
            int lineEnd = getLayout().getLineEnd(this.mCollapsedLines - 1);
            String str2 = this.mCollapsedText;
            int length = (lineEnd - str2.length()) - 1;
            if (length > 0) {
                lineEnd = length;
            }
            TextPaint paint = getPaint();
            int measuredWidth = this.mCollapsedLines * ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            while (true) {
                Objects.requireNonNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                if (paint.measureText(Intrinsics.stringPlus(strSubstring.substring(0, lineEnd), str2)) <= measuredWidth) {
                    break;
                } else {
                    lineEnd--;
                }
            }
            strSubstring = strSubstring.substring(0, lineEnd);
            str = str2;
        }
        final SpannableString spannableString = new SpannableString(Intrinsics.stringPlus(strSubstring, str));
        int i3 = 3;
        if (this.mSuffixTrigger) {
            CollapsibleTextView$mClickSpanListener$1 collapsibleTextView$mClickSpanListener$1 = this.mClickSpanListener;
            int length2 = strSubstring.length();
            if (expanded) {
                i2 = 0;
            } else {
                if (expanded) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 3;
            }
            spannableString.setSpan(collapsibleTextView$mClickSpanListener$1, length2 + i2, strSubstring.length() + str.length(), 33);
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.mSuffixColor);
        int length3 = strSubstring.length();
        if (expanded) {
            i = 0;
        } else {
            if (expanded) {
                throw new NoWhenBranchMatchedException();
            }
            i = 3;
        }
        spannableString.setSpan(foregroundColorSpan, length3 + i, strSubstring.length() + str.length(), 33);
        if (!expanded) {
            UnderlineSpan underlineSpan = new UnderlineSpan();
            int length4 = strSubstring.length();
            if (expanded) {
                i3 = 0;
            } else if (expanded) {
                throw new NoWhenBranchMatchedException();
            }
            spannableString.setSpan(underlineSpan, length4 + i3, strSubstring.length() + str.length(), 0);
        }
        post(new Runnable() { // from class: xw0
            @Override // java.lang.Runnable
            public final void run() {
                CollapsibleTextView.d(this.a, spannableString);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(CollapsibleTextView collapsibleTextView, SpannableString spannableString) {
        collapsibleTextView.setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(CollapsibleTextView collapsibleTextView, View view) {
        if (!collapsibleTextView.mSuffixTrigger) {
            boolean z = !collapsibleTextView.mExpanded;
            collapsibleTextView.mExpanded = z;
            collapsibleTextView.c(z);
        }
        View.OnClickListener onClickListener = collapsibleTextView.mCustomClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    /* JADX INFO: renamed from: getCollapsedLines, reason: from getter */
    public final int getMCollapsedLines() {
        return this.mCollapsedLines;
    }

    @Nullable
    /* JADX INFO: renamed from: getCollapsedText, reason: from getter */
    public final String getMCollapsedText() {
        return this.mCollapsedText;
    }

    @Nullable
    /* JADX INFO: renamed from: getExpandedText, reason: from getter */
    public final String getMExpandedText() {
        return this.mExpandedText;
    }

    /* JADX INFO: renamed from: getSuffixColor, reason: from getter */
    public final int getMSuffixColor() {
        return this.mSuffixColor;
    }

    /* JADX INFO: renamed from: isExpanded, reason: from getter */
    public final boolean getMExpanded() {
        return this.mExpanded;
    }

    /* JADX INFO: renamed from: isSuffixTrigger, reason: from getter */
    public final boolean getMSuffixTrigger() {
        return this.mSuffixTrigger;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (!this.mShouldInitLayout || getLineCount() <= this.mCollapsedLines) {
            return;
        }
        this.mShouldInitLayout = false;
        c(this.mExpanded);
    }

    public final void setCollapsedLines(int i) {
        this.mCollapsedLines = i;
        this.mShouldInitLayout = true;
        setText(this.mText);
    }

    public final void setCollapsedText(@Nullable String str) {
        this.mCollapsedText = str;
        c(this.mExpanded);
    }

    public final void setExpanded(boolean z) {
        if (this.mExpanded != z) {
            this.mExpanded = z;
            c(z);
        }
    }

    public final void setExpandedText(@Nullable String str) {
        this.mExpandedText = str;
        c(this.mExpanded);
    }

    public final void setFullString(@NotNull String str) {
        this.mText = str;
        this.mShouldInitLayout = true;
        setText(str);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener l) {
        this.mCustomClickListener = l;
    }

    public final void setSuffixColor(int i) {
        this.mSuffixColor = i;
        c(this.mExpanded);
    }

    public final void setSuffixTrigger(boolean z) {
        this.mSuffixTrigger = z;
        c(this.mExpanded);
    }

    public /* synthetic */ CollapsibleTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
