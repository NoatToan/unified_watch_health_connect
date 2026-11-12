package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.view;

import am.j;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import c22.q1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import fb1.c;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import vb.h;
import vg1.z0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/view/ExpandableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getCollapsedText", "()Ljava/lang/CharSequence;", "", "getAvailableTextWidth", "()F", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ExpandableTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q1 f39202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f39203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39204f;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        int[] iArr = vw0.a.f180560b;
        int i15 = context.obtainStyledAttributes(attributeSet, iArr, i14, 0).getInt(0, 3);
        this.f39199a = i15;
        String string = context.obtainStyledAttributes(attributeSet, iArr, i14, 0).getString(1);
        string = string == null ? "" : string;
        this.f39200b = string;
        String string2 = context.getString(R.string.mct_ellipsis_more, string);
        string2.getClass();
        this.f39201c = string2;
        setEllipsize(null);
        setMaxLines(0);
        if (i15 >= 1) {
            setOnClickListener(new z0(this, 5));
        } else {
            h.s(j.h(i15, "mMaxNumCollapsedLines should not be < 1 but was "));
            throw null;
        }
    }

    private final float getAvailableTextWidth() {
        return ((getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight()) * getMaxLines();
    }

    private final CharSequence getCollapsedText() {
        int lineEnd = getLayout().getLineEnd(getMaxLines() - 1);
        int i14 = lineEnd >= 1 ? lineEnd : 1;
        SpannableString spannableStringD = d(getText().subSequence(0, i14));
        float availableTextWidth = getAvailableTextWidth();
        while (i14 > 0 && getPaint().measureText(spannableStringD, 0, spannableStringD.length()) > availableTextWidth) {
            i14--;
            spannableStringD = d(getText().subSequence(0, i14));
        }
        return spannableStringD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setExpandableText$lambda$0(ExpandableTextView expandableTextView) {
        if (expandableTextView.f39204f) {
            return;
        }
        int lineCount = expandableTextView.getLineCount();
        int i14 = expandableTextView.f39199a;
        if (lineCount > i14) {
            while (true) {
                int i15 = i14 - 1;
                int lineStart = expandableTextView.getLayout().getLineStart(i15);
                if (i14 == 1 || ((expandableTextView.f39203e == null || !s.g(expandableTextView.getText().subSequence(lineStart, expandableTextView.getText().length()).toString(), String.valueOf(expandableTextView.f39203e))) && expandableTextView.getText().subSequence(lineStart, expandableTextView.getLayout().getLineEnd(i15)).length() > 0)) {
                    break;
                } else {
                    i14 = i15;
                }
            }
            expandableTextView.setMaxLines(i14);
            expandableTextView.setText(expandableTextView.getCollapsedText());
        }
    }

    public final SpannableString d(CharSequence charSequence) {
        q1 q1Var = this.f39202d;
        String str = this.f39203e;
        String strN = (q1Var == null || str == null || !s.g(w.i0(charSequence).toString(), w.i0(q1Var.subSequence(0, w.H(q1Var, str.toString(), 0, false, 6)).toString()).toString())) ? this.f39201c : c.n(StringUtils.SPACE, this.f39200b);
        SpannableString spannableString = new SpannableString(((Object) w.i0(charSequence)) + strN);
        spannableString.setSpan(new StyleSpan(1), spannableString.length() - strN.length(), spannableString.length(), 33);
        return spannableString;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/view/ExpandableTextView$a;", "", "<init>", "()V", "", "DURATION_PER_LINE", "I", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ExpandableTextView(Context context, AttributeSet attributeSet, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
