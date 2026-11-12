package com.xiaomi.hm.health.training.ui.widget;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.huami.lib.view.ViewUtils;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.devicelib.DeviceCenter;
import com.xiaomi.hm.health.devicelib.DeviceHrEvent;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.utils.HeartRateIntervalUtils;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingHrIndicatorView extends View {
    private String A;
    private String B;
    private String C;
    private boolean D;
    private boolean E;
    private BroadcastReceiver F;
    private int a;
    private float b;
    private float c;
    private RectF d;
    private RectF e;
    private int f;
    private int g;
    private Paint h;
    private Paint i;
    private Paint j;
    private Paint k;
    private Paint l;
    private float m;
    private float n;
    private Paint o;
    private float p;
    private float q;
    private Context r;
    private DeviceHrEvent s;
    private int t;
    private int u;
    private String[] v;
    private int[] w;
    private String x;
    private String y;
    private String z;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
                if (intExtra == 10 || intExtra == 12) {
                    TrainingHrIndicatorView.this.D = TrainingHrIndicatorView.isBluetoothEnable();
                    TrainingHrIndicatorView.this.postInvalidate();
                }
            }
        }
    }

    public TrainingHrIndicatorView(Context context) {
        this(context, null);
    }

    private void b(Context context) {
        float fDp2px = ViewUtils.dp2px(context, this.a);
        this.b = fDp2px;
        this.c = fDp2px * 2.0f;
        this.v = new String[]{getResources().getString(R.string.hr_section_rest), getResources().getString(R.string.hr_section_warm_up), getResources().getString(R.string.hr_section_fat_burn), getResources().getString(R.string.hr_section_heart_lung_strengthen), getResources().getString(R.string.hr_section_stamina_strengthen), getResources().getString(R.string.hr_section_anaerobic_limit)};
        this.w = context.getResources().getIntArray(R.array.hr_section_colors);
        this.d = new RectF();
        this.e = new RectF();
        Paint paint = new Paint();
        this.h = paint;
        paint.setAntiAlias(true);
        this.h.setStyle(Paint.Style.STROKE);
        this.h.setColor(ContextCompat.getColor(context, R.color.ring_progress_bg));
        this.h.setStrokeWidth(this.b);
        Paint paint2 = new Paint();
        this.i = paint2;
        paint2.setAntiAlias(true);
        this.i.setColor(ContextCompat.getColor(context, R.color.ring_progress_view_bg));
        this.i.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.j = paint3;
        paint3.setAntiAlias(true);
        this.j.setStyle(Paint.Style.STROKE);
        this.j.setStrokeWidth(this.b);
        Paint paint4 = new Paint();
        this.k = paint4;
        paint4.setAntiAlias(true);
        this.k.setStyle(Paint.Style.STROKE);
        this.k.setStrokeWidth(this.c);
        Paint paint5 = new Paint();
        this.l = paint5;
        paint5.setTypeface(TypefaceManager.get().getTypeface(context, Font.KM));
        this.l.setAntiAlias(true);
        this.l.setStyle(Paint.Style.FILL);
        this.l.setTextSize(ViewUtils.sp2px(context, 24.0f));
        this.l.setColor(ContextCompat.getColor(context, R.color.white));
        this.l.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetricsInt fontMetricsInt = this.l.getFontMetricsInt();
        int i = fontMetricsInt.top;
        int i2 = fontMetricsInt.bottom;
        this.n = ((ViewUtils.dp2px(context, 24.0f) + (ViewUtils.dp2px(context, 21.0f) / 2.0f)) + ((i2 - i) / 2)) - i2;
        Paint paint6 = new Paint();
        this.o = paint6;
        paint6.setAntiAlias(true);
        this.o.setStyle(Paint.Style.FILL);
        this.o.setTextSize(ViewUtils.sp2px(context, 9.0f));
        this.o.setColor(ContextCompat.getColor(context, R.color.white80));
        this.o.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetricsInt fontMetricsInt2 = this.o.getFontMetricsInt();
        int i3 = fontMetricsInt2.top;
        int i4 = fontMetricsInt2.bottom;
        this.q = ((ViewUtils.dp2px(context, 46.0f) + (ViewUtils.dp2px(context, 13.0f) / 2.0f)) + ((i4 - i3) / 2)) - i4;
        this.y = context.getString(R.string.training_playing_hr_default);
        this.B = context.getString(R.string.training_playing_hr_exception_bluetooth_off);
        DeviceCenter deviceCenter = DeviceCenter.getInstance();
        if (deviceCenter.hasBoundHrDevice()) {
            if (DeviceCenter.isMiliWatch(deviceCenter.getBoundDevice(HMDeviceType.MILI))) {
                this.A = context.getString(R.string.watch_disconnected);
                this.C = context.getString(R.string.training_playing_hr_exception_watch_not_tight);
                this.z = context.getString(R.string.training_playing_hr_exception_low_battery);
                return;
            } else {
                this.A = context.getString(R.string.miband_disconnected);
                this.C = context.getString(R.string.training_playing_hr_exception_band_not_tight);
                this.z = context.getString(R.string.training_playing_hr_exception_low_battery_for_band);
                return;
            }
        }
        if (deviceCenter.hasBoundWatch()) {
            this.A = context.getString(R.string.watch_disconnected);
            this.C = context.getString(R.string.training_playing_hr_exception_watch_not_tight);
            this.z = context.getString(R.string.training_playing_hr_exception_low_battery);
        } else {
            this.A = context.getString(R.string.training_playing_hr_exception_device_disconnect);
            this.C = context.getString(R.string.training_playing_hr_exception_device_not_tight);
            this.z = context.getString(R.string.training_playing_hr_exception_low_battery);
        }
    }

    private void c() {
        getContext().registerReceiver(this.F, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    public static boolean isBluetoothEnable() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        getContext().unregisterReceiver(this.F);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        String str;
        super.onDraw(canvas);
        canvas.drawColor(0);
        float f = this.f / 2;
        int i = this.g;
        canvas.drawCircle(f, i / 2, (i / 2) - this.b, this.i);
        RectF rectF = this.d;
        float f2 = this.b;
        rectF.top = f2 / 2.0f;
        rectF.left = f2 / 2.0f;
        int i2 = this.f;
        rectF.right = i2 - (f2 / 2.0f);
        int i3 = this.g;
        rectF.bottom = i3 - (f2 / 2.0f);
        RectF rectF2 = this.e;
        float f3 = this.c;
        rectF2.top = f3 / 2.0f;
        rectF2.left = f3 / 2.0f;
        rectF2.right = i2 - (f3 / 2.0f);
        rectF2.bottom = i3 - (f3 / 2.0f);
        canvas.drawArc(rectF, -90.0f, 360.0f, false, this.h);
        this.u = HeartRateIntervalUtils.getHrInterval(this.t);
        if (this.E) {
            for (int i4 = 1; i4 <= 5; i4++) {
                if (this.u == i4) {
                    this.k.setColor(this.w[i4]);
                    canvas.drawArc(this.e, ((i4 - 1) * 56) + 131, 54.0f, false, this.k);
                } else {
                    this.j.setColor(this.w[i4]);
                    canvas.drawArc(this.d, ((i4 - 1) * 56) + 131, 54.0f, false, this.j);
                }
            }
            boolean zIsHRValueValid = HeartRateIntervalUtils.isHRValueValid(this.t);
            canvas.drawText(zIsHRValueValid ? String.format(this.x, Integer.valueOf(this.t)) : this.y, this.m, this.n, this.l);
            if (this.s.isSuccess()) {
                str = this.t == 0 ? this.C : zIsHRValueValid ? this.v[this.u] : "";
            } else if (this.s.isLowBattery()) {
                str = this.z;
            } else if (this.s.isDisconnected()) {
                str = this.D ? this.A : this.B;
            } else {
                str = this.s.isTimeout() ? this.C : this.y;
            }
            canvas.drawText(str, this.p, this.q, this.o);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f = View.MeasureSpec.getSize(i);
        this.g = View.MeasureSpec.getSize(i2);
        int i3 = this.f;
        this.m = i3 / 2;
        this.p = i3 / 2;
    }

    public void setHr(DeviceHrEvent deviceHrEvent) {
        if (deviceHrEvent != null) {
            this.s = deviceHrEvent;
            this.t = deviceHrEvent.getHr();
            invalidate();
        }
    }

    public void setShowContent(boolean z) {
        this.E = z;
        postInvalidate();
    }

    public TrainingHrIndicatorView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrainingHrIndicatorView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 4;
        DeviceHrEvent deviceHrEvent = new DeviceHrEvent(-1);
        this.s = deviceHrEvent;
        this.t = deviceHrEvent.getHr();
        this.x = "%1d";
        this.D = false;
        this.E = false;
        this.F = new a();
        this.r = context;
        b(context);
        this.D = isBluetoothEnable();
    }
}
