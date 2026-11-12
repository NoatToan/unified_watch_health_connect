package com.garmin.android.apps.connectmobile.golf.truswing.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.garmin.android.apps.connectmobile.golf.truswing.model.h;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class SwingSeekBar extends SeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f36009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f36010b;

    public SwingSeekBar(Context context) {
        super(context);
    }

    public final void a(Canvas canvas, ArrayList arrayList, int i14) {
        int height;
        int height2;
        int thumbOffset = getThumbOffset() / 2;
        int width = getWidth() - getThumbOffset();
        if (i14 == 1) {
            ArrayList arrayList2 = this.f36010b;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                height = getThumbOffset() + thumbOffset;
                height2 = getHeight() - height;
            } else {
                height2 = getHeight() / 2;
                height = thumbOffset;
            }
        } else {
            height = 0;
            height2 = 0;
        }
        if (i14 == 2) {
            height = getHeight() / 2;
            height2 = getHeight() - thumbOffset;
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            h hVar = (h) arrayList.get(i15);
            int i16 = (int) ((hVar.f35933b * width) / 100.0f);
            int i17 = hVar.f35932a;
            Paint paint = new Paint();
            paint.setColor(getContext().getColor(i17));
            Rect rect = new Rect();
            rect.set(i16 - 3, height, i16 + 3, height2);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        ArrayList arrayList = this.f36009a;
        if (arrayList != null && !arrayList.isEmpty()) {
            a(canvas, this.f36009a, 1);
        }
        ArrayList arrayList2 = this.f36010b;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            a(canvas, this.f36010b, 2);
        }
        super.onDraw(canvas);
    }

    public SwingSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwingSeekBar(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
    }
}
