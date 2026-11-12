package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.eui;
import defpackage.zqi;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001$B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016J\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0002J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0007H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateCustomTouchView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onVibrateIntensityChangeListener", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateCustomTouchView$OnVibrateIntensityChangeListener;", "currentIntensity", "areaHigh", "Landroid/view/View;", "getAreaHigh", "()Landroid/view/View;", "areaMid", "getAreaMid", "areaLow", "getAreaLow", "canCustom", "", "setOnVibrateIntensityChangeListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCanCustom", "enabled", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "getEventArea", "x", "y", "invokeIntensity", "intensity", "OnVibrateIntensityChangeListener", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VibrateCustomTouchView extends ConstraintLayout {

    @NotNull
    private final View areaHigh;

    @NotNull
    private final View areaLow;

    @NotNull
    private final View areaMid;
    private boolean canCustom;
    private int currentIntensity;

    @Nullable
    private OnVibrateIntensityChangeListener onVibrateIntensityChangeListener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateCustomTouchView$OnVibrateIntensityChangeListener;", "", "onIntensityChange", "", "intensity", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnVibrateIntensityChangeListener {
        void onIntensityChange(int intensity);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VibrateCustomTouchView(@NotNull Context context, @NotNull AttributeSet attrs) {
        this(context, attrs, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    private final int getEventArea(int x, int y) {
        if (x < 0 || x > this.areaHigh.getWidth() || y < 0 || y > getHeight()) {
            return 1;
        }
        if (y > 0 && y < this.areaHigh.getHeight()) {
            return 4;
        }
        if (y < this.areaHigh.getHeight() || y >= this.areaHigh.getHeight() + this.areaMid.getHeight()) {
            return (y < this.areaHigh.getHeight() + this.areaMid.getHeight() || y >= getHeight()) ? 1 : 2;
        }
        return 3;
    }

    private final void invokeIntensity(int intensity) {
        if (this.currentIntensity != intensity) {
            this.currentIntensity = intensity;
            OnVibrateIntensityChangeListener onVibrateIntensityChangeListener = this.onVibrateIntensityChangeListener;
            if (onVibrateIntensityChangeListener != null) {
                onVibrateIntensityChangeListener.onIntensityChange(intensity);
            }
        }
    }

    @NotNull
    public final View getAreaHigh() {
        return this.areaHigh;
    }

    @NotNull
    public final View getAreaLow() {
        return this.areaLow;
    }

    @NotNull
    public final View getAreaMid() {
        return this.areaMid;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        if (!this.canCustom) {
            return false;
        }
        Integer numValueOf = event != null ? Integer.valueOf(event.getActionMasked()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            invokeIntensity(getEventArea((int) event.getX(), (int) event.getY()));
            return true;
        }
        if (numValueOf == null || numValueOf.intValue() != 2) {
            invokeIntensity(1);
            return super.onTouchEvent(event);
        }
        int eventArea = getEventArea((int) event.getX(), (int) event.getY());
        if (this.currentIntensity != 1) {
            invokeIntensity(eventArea);
        }
        return true;
    }

    public final void setCanCustom(boolean enabled) {
        this.canCustom = enabled;
    }

    public final void setOnVibrateIntensityChangeListener(@NotNull OnVibrateIntensityChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onVibrateIntensityChangeListener = listener;
    }

    public /* synthetic */ VibrateCustomTouchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VibrateCustomTouchView(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.currentIntensity = 1;
        this.canCustom = true;
        View viewInflate = View.inflate(context, eui.a2, this);
        this.areaHigh = viewInflate.findViewById(zqi.A);
        this.areaMid = viewInflate.findViewById(zqi.C);
        this.areaLow = viewInflate.findViewById(zqi.B);
    }
}
