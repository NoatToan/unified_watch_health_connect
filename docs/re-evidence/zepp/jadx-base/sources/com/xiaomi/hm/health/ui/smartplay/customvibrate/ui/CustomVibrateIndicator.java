package com.xiaomi.hm.health.ui.smartplay.customvibrate.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.VibrateController;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class CustomVibrateIndicator extends View {
    private int a;
    private int b;
    private Paint c;
    private int d;
    private int e;
    private int f;
    private List<VibrateController.DataSegment> g;

    public CustomVibrateIndicator(Context context) {
        this(context, null);
    }

    public void a(List<VibrateController.DataSegment> vibrateConfig) {
        this.g = vibrateConfig;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.c.setColor(this.f);
        canvas.drawRect(0.0f, 0.0f, this.a, this.b, this.c);
        if (this.g == null) {
            return;
        }
        float f = 0.0f;
        for (int i = 0; i < this.g.size(); i++) {
            VibrateController.DataSegment dataSegment = this.g.get(i);
            if (dataSegment.duration > 0 && (i != this.g.size() - 1 || dataSegment.duration >= 15)) {
                this.c.setColor(dataSegment.vibrate ? this.e : this.d);
                float f2 = (dataSegment.duration * this.a) / 12000.0f;
                if (i <= 0 || this.g.get(i - 1).duration > 0) {
                    canvas.drawRect(f, 0.0f, f + f2, this.b, this.c);
                } else {
                    canvas.drawRect(f - 3.0f, 0.0f, f + f2, this.b, this.c);
                }
                f += f2;
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        this.a = w;
        this.b = h;
    }

    public CustomVibrateIndicator(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomVibrateIndicator(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.c = new Paint(1);
        this.e = ContextCompat.getColor(context, R.color.dark_sky_blue_three);
        this.d = ContextCompat.getColor(context, R.color.pause_color);
        this.f = ContextCompat.getColor(context, R.color.s3);
    }
}
