package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.text.Cue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.Output {
    private float bottomPaddingFraction;
    private List<Cue> cues;
    private final List<SubtitlePainter> painters;
    private CaptionStyleCompat style;
    private float textSize;
    private int textSizeType;

    public CanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.painters = new ArrayList();
        this.cues = Collections.EMPTY_LIST;
        this.textSizeType = 0;
        this.textSize = 0.0533f;
        this.style = CaptionStyleCompat.DEFAULT;
        this.bottomPaddingFraction = 0.08f;
    }

    private static Cue repositionVerticalCue(Cue cue) {
        Cue.Builder textAlignment = cue.buildUpon().setPosition(-3.4028235E38f).setPositionAnchor(Integer.MIN_VALUE).setTextAlignment(null);
        int i14 = cue.lineType;
        float f14 = cue.line;
        if (i14 == 0) {
            textAlignment.setLine(1.0f - f14, 0);
        } else {
            textAlignment.setLine((-f14) - 1.0f, 1);
        }
        int i15 = cue.lineAnchor;
        if (i15 == 0) {
            textAlignment.setLineAnchor(2);
        } else if (i15 == 2) {
            textAlignment.setLineAnchor(0);
        }
        return textAlignment.build();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<Cue> list = this.cues;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i14 = paddingBottom - paddingTop;
        float fResolveTextSize = SubtitleViewUtils.resolveTextSize(this.textSizeType, this.textSize, height, i14);
        if (fResolveTextSize <= 0.0f) {
            return;
        }
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            Cue cueRepositionVerticalCue = list.get(i15);
            if (cueRepositionVerticalCue.verticalType != Integer.MIN_VALUE) {
                cueRepositionVerticalCue = repositionVerticalCue(cueRepositionVerticalCue);
            }
            this.painters.get(i15).draw(cueRepositionVerticalCue, this.style, fResolveTextSize, SubtitleViewUtils.resolveTextSize(cueRepositionVerticalCue.textSizeType, cueRepositionVerticalCue.textSize, height, i14), this.bottomPaddingFraction, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.Output
    public void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f14, int i14, float f15) {
        this.cues = list;
        this.style = captionStyleCompat;
        this.textSize = f14;
        this.textSizeType = i14;
        this.bottomPaddingFraction = f15;
        while (this.painters.size() < list.size()) {
            this.painters.add(new SubtitlePainter(getContext()));
        }
        invalidate();
    }

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }
}
