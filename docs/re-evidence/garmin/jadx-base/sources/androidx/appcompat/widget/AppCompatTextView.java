package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    private final e mBackgroundTintHelper;
    private k mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<j7.b> mPrecomputedTextFuture;
    private a mSuperCaller;
    private final v mTextClassifierHelper;
    private final w mTextHelper;

    public interface a {
        void a(int i14);

        void b(int i14);

        void c(int i14, float f14);
    }

    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void a(int i14) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i14) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void c(int i14, float f14) {
        }
    }

    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void a(int i14) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i14);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void b(int i14) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i14);
        }
    }

    public class d extends c {
        public d() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void c(int i14, float f14) {
            AppCompatTextView.super.setLineHeight(i14, f14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        t0.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        r0.a(getContext(), this);
        e eVar = new e(this);
        this.mBackgroundTintHelper = eVar;
        eVar.d(attributeSet, i14);
        w wVar = new w(this);
        this.mTextHelper = wVar;
        wVar.f(attributeSet, i14);
        wVar.b();
        this.mTextClassifierHelper = new v(this);
        getEmojiTextViewHelper().c(attributeSet, i14);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<j7.b> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                p7.e.b(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private k getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new k(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.a();
        }
        w wVar = this.mTextHelper;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return p7.e.c(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        if (this.mSuperCaller == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.mSuperCaller = new d();
            } else {
                this.mSuperCaller = new c();
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public j7.b.a getTextMetricsParamsCompat() {
        return new j7.b.a(getTextMetricsParams());
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            m7.a.a(editorInfo, getText());
        }
        l.a(this, inputConnectionOnCreateInputConnection, editorInfo);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 < 30 || i14 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        super.onLayout(z14, i14, i15, i16, i17);
        w wVar = this.mTextHelper;
        if (wVar != null) {
            wVar.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i14, int i15) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i14, i15);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        super.onTextChanged(charSequence, i14, i15, i16);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z14) {
        super.setAllCaps(z14);
        getEmojiTextViewHelper().d(z14);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i14, int i15, int i16, int i17) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i14, i15, i16, i17);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i14) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i14);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i14) {
        super.setAutoSizeTextTypeWithDefaults(i14);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i14) {
        super.setBackgroundResource(i14);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.f(i14);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w wVar = this.mTextHelper;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w wVar = this.mTextHelper;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i14, int i15, int i16, int i17) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i14 != 0 ? j.a.a(context, i14) : null, i15 != 0 ? j.a.a(context, i15) : null, i16 != 0 ? j.a.a(context, i16) : null, i17 != 0 ? j.a.a(context, i17) : null);
        w wVar = this.mTextHelper;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i14, int i15, int i16, int i17) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i14 != 0 ? j.a.a(context, i14) : null, i15 != 0 ? j.a.a(context, i15) : null, i16 != 0 ? j.a.a(context, i16) : null, i17 != 0 ? j.a.a(context, i17) : null);
        w wVar = this.mTextHelper;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z14) {
        getEmojiTextViewHelper().e(z14);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i14) {
        getSuperCaller().a(i14);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i14) {
        getSuperCaller().b(i14);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i14, float f14) {
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 34) {
            getSuperCaller().c(i14, f14);
        } else if (i15 >= 34) {
            p7.e.a.a(this, i14, f14);
        } else {
            p7.e.a(this, Math.round(TypedValue.applyDimension(i14, f14, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(j7.b bVar) {
        p7.e.b(this, bVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.h(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.i(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i14) {
        super.setTextAppearance(context, i14);
        w wVar = this.mTextHelper;
        if (wVar != null) {
            wVar.g(i14, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<j7.b> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(j7.b.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.f97450b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i14 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i14 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i14 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i14 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i14 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i14 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i14 = 7;
            }
        }
        setTextDirection(i14);
        getPaint().set(aVar.f97449a);
        setBreakStrategy(aVar.f97451c);
        setHyphenationFrequency(aVar.f97452d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i14, float f14) {
        super.setTextSize(i14, f14);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i14) {
        Typeface typefaceCreate;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i14 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            c7.n nVar = c7.h.f25197a;
            if (context == null) {
                vb.h.s("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i14);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i14);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i14) {
        p7.e.a(this, i14);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w wVar = this.mTextHelper;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w wVar = this.mTextHelper;
        if (wVar != null) {
            wVar.b();
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }
}
