package com.xiaomi.hm.health.training.ui.widget;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import com.google.android.material.timepicker.TimeModel;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public class RealTimeHrView extends View {
    private static final String A = "Train-RealTimeHrView";
    private static final int B = 0;
    private static final int C = 1;
    private static final int D = 2;
    private static final int E = 3;
    private static final int F = 4;
    private static final int G = 5;
    private CharSequence[] a;
    private int[] b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private Paint i;
    private Paint j;
    private Paint k;
    private Paint l;
    private Paint m;

    @Px
    private int n;

    @Px
    private int o;

    @ColorInt
    private int p;

    @ColorInt
    private final int q;
    private final RectF r;
    private final RectF s;
    private int t;
    private int u;
    private boolean v;
    private DescriptionText w;
    private HrDetectState x;
    private boolean y;
    private final BroadcastReceiver z;

    public static class DescriptionText {
        public String bluetoothOff;
        public String deviceDisconnected;
        public String deviceNotTight;
        public String lowBattery;
    }

    public enum HrDetectState {
        SUCCESS,
        DISCONNECTED,
        LOW_BATTERY,
        TIMEOUT
    }

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, @NonNull Intent intent) {
            if (TextUtils.equals(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
                if (intExtra == 10 || intExtra == 12) {
                    RealTimeHrView.this.v = RealTimeHrView.j();
                    RealTimeHrView.this.postInvalidate();
                }
            }
        }
    }

    public RealTimeHrView(Context context) {
        super(context);
        this.p = 1275068416;
        this.q = 419430400;
        this.r = new RectF();
        this.s = new RectF();
        this.v = false;
        this.z = new a();
        f(null);
    }

    private static float d(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    private int e(int i) {
        if (i <= this.g) {
            return 0;
        }
        if (i <= this.f) {
            return 1;
        }
        if (i <= this.e) {
            return 2;
        }
        if (i <= this.d) {
            return 3;
        }
        return i <= this.c ? 4 : 5;
    }

    private void f(@Nullable AttributeSet attributeSet) {
        m(attributeSet);
        i();
        h();
        g();
    }

    private void g() {
        Paint.FontMetricsInt fontMetricsInt = this.l.getFontMetricsInt();
        int i = fontMetricsInt.top;
        int i2 = fontMetricsInt.bottom;
        this.t = (int) (((d(getContext(), 24.0f) + (d(getContext(), 21.0f) / 2.0f)) + ((i2 - i) / 2)) - i2);
        Paint.FontMetricsInt fontMetricsInt2 = this.m.getFontMetricsInt();
        int i3 = fontMetricsInt2.top;
        int i4 = fontMetricsInt2.bottom;
        this.u = (int) (((d(getContext(), 46.0f) + (d(getContext(), 13.0f) / 2.0f)) + ((i4 - i3) / 2)) - i4);
    }

    @NonNull
    private String getDescriptionText() {
        DescriptionText descriptionText;
        String string;
        HrDetectState hrDetectState = this.x;
        if (hrDetectState == HrDetectState.SUCCESS) {
            int i = this.h;
            if (i == 0) {
                DescriptionText descriptionText2 = this.w;
                if (descriptionText2 == null) {
                    return "";
                }
                string = descriptionText2.deviceNotTight;
            } else {
                if (!k(i)) {
                    return "";
                }
                int iE = e(this.h);
                CharSequence[] charSequenceArr = this.a;
                if (charSequenceArr == null || iE < 0 || iE >= charSequenceArr.length) {
                    return "";
                }
                string = charSequenceArr[iE].toString();
            }
        } else if (hrDetectState == HrDetectState.LOW_BATTERY) {
            DescriptionText descriptionText3 = this.w;
            if (descriptionText3 == null) {
                return "";
            }
            string = descriptionText3.lowBattery;
        } else if (hrDetectState == HrDetectState.DISCONNECTED) {
            if (this.v) {
                DescriptionText descriptionText4 = this.w;
                if (descriptionText4 == null) {
                    return "";
                }
                string = descriptionText4.deviceDisconnected;
            } else {
                DescriptionText descriptionText5 = this.w;
                if (descriptionText5 == null) {
                    return "";
                }
                string = descriptionText5.bluetoothOff;
            }
        } else {
            if (hrDetectState != HrDetectState.TIMEOUT || (descriptionText = this.w) == null) {
                return "";
            }
            string = descriptionText.deviceNotTight;
        }
        return string;
    }

    private void h() {
        Paint paint = new Paint();
        this.i = paint;
        paint.setAntiAlias(true);
        this.i.setColor(this.p);
        this.i.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.j = paint2;
        paint2.setAntiAlias(true);
        this.j.setStyle(Paint.Style.STROKE);
        this.j.setStrokeWidth(this.n);
        Paint paint3 = new Paint();
        this.k = paint3;
        paint3.setAntiAlias(true);
        this.k.setStyle(Paint.Style.STROKE);
        this.k.setStrokeWidth(this.o);
        Paint paint4 = new Paint();
        this.l = paint4;
        paint4.setTypeface(TypefaceManager.get().getTypeface(getContext(), Font.KM));
        this.l.setAntiAlias(true);
        this.l.setStyle(Paint.Style.FILL);
        this.l.setTextSize(o(getContext(), 24.0f));
        this.l.setColor(Color.parseColor("#CCFFFFFF"));
        this.l.setTextAlign(Paint.Align.CENTER);
        Paint paint5 = new Paint();
        this.m = paint5;
        paint5.setAntiAlias(true);
        this.m.setStyle(Paint.Style.FILL);
        this.m.setTextSize(o(getContext(), 9.0f));
        this.m.setColor(Color.parseColor("#CCFFFFFF"));
        this.m.setTextAlign(Paint.Align.CENTER);
    }

    private void i() {
        int iD = (int) d(getContext(), 4.0f);
        this.n = iD;
        this.o = iD * 2;
        this.b = new int[]{-1118224, -8960, -16128, -25556, -30704, -39339};
        this.v = j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    private static boolean k(int i) {
        return i >= 30 && i <= 240;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object l() {
        return String.format(Locale.getDefault(), "热身放松心率: %d, 脂肪燃烧: %d, 心肺强化: %d, 耐力强化: %d, 无氧极限: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(this.d), Integer.valueOf(this.c));
    }

    private void m(@Nullable AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.RealTimeHrView);
            try {
                this.a = typedArrayObtainStyledAttributes.getTextArray(R.styleable.RealTimeHrView_rthv_entries);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.RealTimeHrView_rthv_colors, 0);
                if (resourceId > 0) {
                    this.b = getContext().getResources().getIntArray(resourceId);
                }
                this.p = typedArrayObtainStyledAttributes.getColor(R.styleable.RealTimeHrView_rthv_circle_bg_color, this.p);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    private void n(int i, int i2) {
        this.r.setEmpty();
        RectF rectF = this.r;
        int i3 = this.n;
        rectF.top = i3 / 2;
        rectF.left = i3 / 2;
        rectF.right = i - (i3 / 2);
        rectF.bottom = i2 - (i3 / 2);
        this.s.setEmpty();
        RectF rectF2 = this.s;
        int i4 = this.o;
        rectF2.top = i4 / 2;
        rectF2.left = i4 / 2;
        rectF2.right = i - (i4 / 2);
        rectF2.bottom = i2 - (i4 / 2);
    }

    private static float o(Context context, float f) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getContext().registerReceiver(this.z, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getContext().unregisterReceiver(this.z);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float width = getWidth() / 2;
        int height = getHeight() / 2;
        canvas.drawCircle(width, height, height - this.n, this.i);
        this.j.setColor(419430400);
        canvas.drawArc(this.r, -90.0f, 360.0f, false, this.j);
        if (this.y) {
            if (this.b != null) {
                int iE = e(this.h);
                for (int i = 1; i <= 5; i++) {
                    if (iE == i) {
                        this.k.setColor(this.b[i]);
                        canvas.drawArc(this.s, ((i - 1) * 56) + 131, 54.0f, false, this.k);
                    } else {
                        this.j.setColor(this.b[i]);
                        canvas.drawArc(this.r, ((i - 1) * 56) + 131, 54.0f, false, this.j);
                    }
                }
            }
            canvas.drawText(k(this.h) ? String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(this.h)) : "--", width, this.t, this.l);
            canvas.drawText(getDescriptionText(), width, this.u, this.m);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        n(i, i2);
    }

    public void setDescriptionText(@Nullable DescriptionText descriptionText) {
        this.w = descriptionText;
        postInvalidate();
    }

    public void setDrawContent(boolean z) {
        this.y = z;
        postInvalidate();
    }

    public void setHr(int i, @Nullable HrDetectState hrDetectState) {
        this.h = i;
        this.x = hrDetectState;
        postInvalidate();
    }

    public void setUserAge(int i) {
        float f = 220 - i;
        this.c = (int) (0.9f * f);
        this.d = (int) (0.8f * f);
        this.e = (int) (0.7f * f);
        this.f = (int) (0.6f * f);
        this.g = (int) (f * 0.5f);
        Loggers.getLogger().d(A, new Supplier() { // from class: c76
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return this.a.l();
            }
        });
        postInvalidate();
    }

    public RealTimeHrView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = 1275068416;
        this.q = 419430400;
        this.r = new RectF();
        this.s = new RectF();
        this.v = false;
        this.z = new a();
        f(attributeSet);
    }

    public RealTimeHrView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = 1275068416;
        this.q = 419430400;
        this.r = new RectF();
        this.s = new RectF();
        this.v = false;
        this.z = new a();
        f(attributeSet);
    }

    @RequiresApi(api = 21)
    public RealTimeHrView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.p = 1275068416;
        this.q = 419430400;
        this.r = new RectF();
        this.s = new RectF();
        this.v = false;
        this.z = new a();
        f(attributeSet);
    }
}
