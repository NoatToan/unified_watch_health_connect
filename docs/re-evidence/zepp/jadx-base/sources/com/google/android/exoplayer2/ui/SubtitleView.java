package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Dimension;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SubtitleView extends FrameLayout implements TextOutput {
    public static final float DEFAULT_BOTTOM_PADDING_FRACTION = 0.08f;
    public static final float DEFAULT_TEXT_SIZE_FRACTION = 0.0533f;
    public static final int VIEW_TYPE_CANVAS = 1;
    public static final int VIEW_TYPE_WEB = 2;
    private List<Cue> a;
    private CaptionStyleCompat b;
    private int c;
    private float d;
    private float e;
    private boolean f;
    private boolean g;
    private int h;
    private a i;
    private View j;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewType {
    }

    public interface a {
        void a(List<Cue> cues, CaptionStyleCompat style, float defaultTextSize, int defaultTextSizeType, float bottomPaddingFraction);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private Cue a(Cue cue) {
        Cue.Builder builderBuildUpon = cue.buildUpon();
        if (!this.f) {
            c0.e(builderBuildUpon);
        } else if (!this.g) {
            c0.f(builderBuildUpon);
        }
        return builderBuildUpon.build();
    }

    private void b(int textSizeType, float textSize) {
        this.c = textSizeType;
        this.d = textSize;
        c();
    }

    private void c() {
        this.i.a(getCuesWithStylingPreferencesApplied(), this.b, this.d, this.c, this.e);
    }

    private List<Cue> getCuesWithStylingPreferencesApplied() {
        if (this.f && this.g) {
            return this.a;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (int i = 0; i < this.a.size(); i++) {
            arrayList.add(a(this.a.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (Util.SDK_INT < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private CaptionStyleCompat getUserCaptionStyle() {
        if (Util.SDK_INT < 19 || isInEditMode()) {
            return CaptionStyleCompat.DEFAULT;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? CaptionStyleCompat.DEFAULT : CaptionStyleCompat.createFromCaptionStyle(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T view) {
        removeView(this.j);
        View view2 = this.j;
        if (view2 instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view2).g();
        }
        this.j = view;
        this.i = view;
        addView(view);
    }

    @Override // com.google.android.exoplayer2.text.TextOutput
    public void onCues(List<Cue> cues) {
        setCues(cues);
    }

    public void setApplyEmbeddedFontSizes(boolean applyEmbeddedFontSizes) {
        this.g = applyEmbeddedFontSizes;
        c();
    }

    public void setApplyEmbeddedStyles(boolean applyEmbeddedStyles) {
        this.f = applyEmbeddedStyles;
        c();
    }

    public void setBottomPaddingFraction(float bottomPaddingFraction) {
        this.e = bottomPaddingFraction;
        c();
    }

    public void setCues(@Nullable List<Cue> cues) {
        if (cues == null) {
            cues = Collections.emptyList();
        }
        this.a = cues;
        c();
    }

    public void setFixedTextSize(@Dimension int unit, float size) {
        Context context = getContext();
        b(2, TypedValue.applyDimension(unit, size, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void setFractionalTextSize(float fractionOfHeight) {
        setFractionalTextSize(fractionOfHeight, false);
    }

    public void setStyle(CaptionStyleCompat style) {
        this.b = style;
        c();
    }

    public void setUserDefaultStyle() {
        setStyle(getUserCaptionStyle());
    }

    public void setUserDefaultTextSize() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setViewType(int viewType) {
        if (this.h == viewType) {
            return;
        }
        if (viewType == 1) {
            setView(new CanvasSubtitleOutput(getContext()));
        } else {
            if (viewType != 2) {
                throw new IllegalArgumentException();
            }
            setView(new WebViewSubtitleOutput(getContext()));
        }
        this.h = viewType;
    }

    public SubtitleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.a = Collections.emptyList();
        this.b = CaptionStyleCompat.DEFAULT;
        this.c = 0;
        this.d = 0.0533f;
        this.e = 0.08f;
        this.f = true;
        this.g = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.i = canvasSubtitleOutput;
        this.j = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.h = 1;
    }

    public void setFractionalTextSize(float f, boolean z) {
        b(z ? 1 : 0, f);
    }
}
