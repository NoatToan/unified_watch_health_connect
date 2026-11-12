package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.a {
    private final List<z> a;
    private List<Cue> b;
    private int c;
    private float d;
    private CaptionStyleCompat e;
    private float f;

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }

    private static Cue b(Cue cue) {
        Cue.Builder textAlignment = cue.buildUpon().setPosition(-3.4028235E38f).setPositionAnchor(Integer.MIN_VALUE).setTextAlignment(null);
        if (cue.lineType == 0) {
            textAlignment.setLine(1.0f - cue.line, 0);
        } else {
            textAlignment.setLine((-cue.line) - 1.0f, 1);
        }
        int i = cue.lineAnchor;
        if (i == 0) {
            textAlignment.setLineAnchor(2);
        } else if (i == 2) {
            textAlignment.setLineAnchor(0);
        }
        return textAlignment.build();
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<Cue> cues, CaptionStyleCompat style, float textSize, int textSizeType, float bottomPaddingFraction) {
        this.b = cues;
        this.e = style;
        this.d = textSize;
        this.c = textSizeType;
        this.f = bottomPaddingFraction;
        while (this.a.size() < cues.size()) {
            this.a.add(new z(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<Cue> list = this.b;
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
        int i = paddingBottom - paddingTop;
        float fH = c0.h(this.c, this.d, height, i);
        if (fH <= 0.0f) {
            return;
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Cue cueB = list.get(i2);
            if (cueB.verticalType != Integer.MIN_VALUE) {
                cueB = b(cueB);
            }
            Cue cue = cueB;
            int i3 = paddingBottom;
            this.a.get(i2).b(cue, this.e, fH, c0.h(cue.textSizeType, cue.textSize, height, i), this.f, canvas, paddingLeft, paddingTop, width, i3);
            i2++;
            size = size;
            i = i;
            paddingBottom = i3;
            width = width;
        }
    }

    public CanvasSubtitleOutput(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.a = new ArrayList();
        this.b = Collections.emptyList();
        this.c = 0;
        this.d = 0.0533f;
        this.e = CaptionStyleCompat.DEFAULT;
        this.f = 0.08f;
    }
}
