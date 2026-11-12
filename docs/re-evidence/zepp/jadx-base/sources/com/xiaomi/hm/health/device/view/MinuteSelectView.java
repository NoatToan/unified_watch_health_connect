package com.xiaomi.hm.health.device.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.view.MinuteSelectView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0001+B'\b\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\t¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014R*\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0018\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R*\u0010\u001b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R*\u0010\u001e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R*\u0010%\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/device/view/MinuteSelectView;", "Landroid/widget/LinearLayout;", "Landroid/util/AttributeSet;", "attrs", "", "e", "f", "c", GoogleApiAvailabilityLight.a, "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "value", "a", LogUtil.I, "getMin", "()I", "setMin", "(I)V", "min", "b", "getMax", "setMax", "max", "getStep", "setStep", "step", "getCurrent", "setCurrent", "current", "", "Ljava/lang/String;", "getTip", "()Ljava/lang/String;", "setTip", "(Ljava/lang/String;)V", "tip", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MinuteSelectView extends LinearLayout {
    private static final int f = 10;
    private static final int g = 120;
    private static final int h = 5;
    private static final int i = 30;

    @NotNull
    private static final String j = "";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int min;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int max;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int step;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int current;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private String tip;

    @JvmOverloads
    public MinuteSelectView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public MinuteSelectView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ MinuteSelectView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    private final void c() {
        int i2 = this.max;
        int i3 = this.current;
        int i4 = i2 - i3;
        int i5 = this.step;
        if (i4 >= i5) {
            setCurrent(i3 + i5);
        }
        requestLayout();
    }

    private final void d() {
        int i2 = this.current;
        int i3 = i2 - this.min;
        int i4 = this.step;
        if (i3 >= i4) {
            setCurrent(i2 - i4);
        }
        requestLayout();
    }

    private final void e(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.MinuteSelectView);
        setMin(typedArrayObtainStyledAttributes.getInt(R.styleable.MinuteSelectView_min, 10));
        setMax(typedArrayObtainStyledAttributes.getInt(R.styleable.MinuteSelectView_max, 120));
        setStep(typedArrayObtainStyledAttributes.getInt(R.styleable.MinuteSelectView_step, 5));
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.MinuteSelectView_tip);
        if (string == null) {
            string = "";
        }
        setTip(string);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void f() {
        findViewById(R.id.select_asc).setOnClickListener(new View.OnClickListener() { // from class: p75
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MinuteSelectView.g(this.a, view);
            }
        });
        findViewById(R.id.select_desc).setOnClickListener(new View.OnClickListener() { // from class: o75
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MinuteSelectView.h(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(MinuteSelectView minuteSelectView, View view) {
        minuteSelectView.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(MinuteSelectView minuteSelectView, View view) {
        minuteSelectView.d();
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final int getCurrent() {
        return this.current;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public final int getStep() {
        return this.step;
    }

    @NotNull
    public final String getTip() {
        return this.tip;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        ((TextView) findViewById(R.id.result_text)).setText(String.valueOf(this.current));
        ((TextView) findViewById(R.id.select_tip)).setText(this.tip);
    }

    public final void setCurrent(int i2) {
        this.current = i2;
        requestLayout();
    }

    public final void setMax(int i2) {
        this.max = i2;
        requestLayout();
    }

    public final void setMin(int i2) {
        this.min = i2;
        requestLayout();
    }

    public final void setStep(int i2) {
        this.step = i2;
        requestLayout();
    }

    public final void setTip(@NotNull String str) {
        this.tip = str;
        requestLayout();
    }

    @JvmOverloads
    public MinuteSelectView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.min = 10;
        this.max = 120;
        this.step = 5;
        this.current = 30;
        this.tip = "";
        View.inflate(context, R.layout.view_minute_select, this);
        e(attributeSet);
        f();
    }
}
