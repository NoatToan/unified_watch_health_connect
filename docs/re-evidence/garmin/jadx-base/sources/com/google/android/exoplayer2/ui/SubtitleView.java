package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class SubtitleView extends FrameLayout implements Player.Listener {
    public static final float DEFAULT_BOTTOM_PADDING_FRACTION = 0.08f;
    public static final float DEFAULT_TEXT_SIZE_FRACTION = 0.0533f;
    public static final int VIEW_TYPE_CANVAS = 1;
    public static final int VIEW_TYPE_WEB = 2;
    private boolean applyEmbeddedFontSizes;
    private boolean applyEmbeddedStyles;
    private float bottomPaddingFraction;
    private List<Cue> cues;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private View innerSubtitleView;
    private Output output;
    private CaptionStyleCompat style;
    private int viewType;

    public interface Output {
        void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f14, int i14, float f15);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewType {
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.cues = Collections.EMPTY_LIST;
        this.style = CaptionStyleCompat.DEFAULT;
        this.defaultTextSizeType = 0;
        this.defaultTextSize = 0.0533f;
        this.bottomPaddingFraction = 0.08f;
        this.applyEmbeddedStyles = true;
        this.applyEmbeddedFontSizes = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.output = canvasSubtitleOutput;
        this.innerSubtitleView = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.viewType = 1;
    }

    private List<Cue> getCuesWithStylingPreferencesApplied() {
        if (this.applyEmbeddedStyles && this.applyEmbeddedFontSizes) {
            return this.cues;
        }
        ArrayList arrayList = new ArrayList(this.cues.size());
        for (int i14 = 0; i14 < this.cues.size(); i14++) {
            arrayList.add(removeEmbeddedStyling(this.cues.get(i14)));
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

    private Cue removeEmbeddedStyling(Cue cue) {
        Cue.Builder builderBuildUpon = cue.buildUpon();
        if (!this.applyEmbeddedStyles) {
            SubtitleViewUtils.removeAllEmbeddedStyling(builderBuildUpon);
        } else if (!this.applyEmbeddedFontSizes) {
            SubtitleViewUtils.removeEmbeddedFontSizes(builderBuildUpon);
        }
        return builderBuildUpon.build();
    }

    private void setTextSize(int i14, float f14) {
        this.defaultTextSizeType = i14;
        this.defaultTextSize = f14;
        updateOutput();
    }

    private <T extends View & Output> void setView(T t7) {
        removeView(this.innerSubtitleView);
        View view2 = this.innerSubtitleView;
        if (view2 instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view2).destroy();
        }
        this.innerSubtitleView = t7;
        this.output = t7;
        addView(t7);
    }

    private void updateOutput() {
        this.output.update(getCuesWithStylingPreferencesApplied(), this.style, this.defaultTextSize, this.defaultTextSizeType, this.bottomPaddingFraction);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onCues(List<Cue> list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z14) {
        this.applyEmbeddedFontSizes = z14;
        updateOutput();
    }

    public void setApplyEmbeddedStyles(boolean z14) {
        this.applyEmbeddedStyles = z14;
        updateOutput();
    }

    public void setBottomPaddingFraction(float f14) {
        this.bottomPaddingFraction = f14;
        updateOutput();
    }

    public void setCues(List<Cue> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.cues = list;
        updateOutput();
    }

    public void setFixedTextSize(int i14, float f14) {
        Context context = getContext();
        setTextSize(2, TypedValue.applyDimension(i14, f14, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void setFractionalTextSize(float f14) {
        setFractionalTextSize(f14, false);
    }

    public void setStyle(CaptionStyleCompat captionStyleCompat) {
        this.style = captionStyleCompat;
        updateOutput();
    }

    public void setUserDefaultStyle() {
        setStyle(getUserCaptionStyle());
    }

    public void setUserDefaultTextSize() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setViewType(int i14) {
        if (this.viewType == i14) {
            return;
        }
        if (i14 == 1) {
            setView(new CanvasSubtitleOutput(getContext()));
        } else {
            if (i14 != 2) {
                vb.h.w();
                return;
            }
            setView(new WebViewSubtitleOutput(getContext()));
        }
        this.viewType = i14;
    }

    public void setFractionalTextSize(float f14, boolean z14) {
        setTextSize(z14 ? 1 : 0, f14);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }
}
