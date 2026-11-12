package com.huami.moving.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.mifit.sportlib.locate.GPSSignal;
import com.huami.moving.R;
import com.huami.moving.utils.Utils;
import com.huami.tools.analytics.DbUtils;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B!\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u0012"}, d2 = {"Lcom/huami/moving/ui/view/GpsSignalView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "", "color", "", "setTextColor", FirebaseAnalytics.Param.LEVEL, "updateSignalLevel", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class GpsSignalView extends LinearLayoutCompat {
    private static final float a = 15.0f;

    public GpsSignalView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.view_gps_signal, this);
        setOrientation(0);
        setGravity(16);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.GpsSignalView, i, 0);
        int i2 = R.styleable.GpsSignalView_android_textColor;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            ((TextView) findViewById(R.id.tv_gps)).setTextColor(typedArrayObtainStyledAttributes.getColorStateList(i2));
        }
        int i3 = R.styleable.GpsSignalView_android_textSize;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            ((TextView) findViewById(R.id.tv_gps)).setTextSize(0, typedArrayObtainStyledAttributes.getDimension(i3, 15.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
        updateSignalLevel(GPSSignal.SignalLevel.DEFAULT.getValue());
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void setTextColor(@ColorInt int color) {
        ((TextView) findViewById(R.id.tv_gps)).setTextColor(color);
    }

    public final void updateSignalLevel(int level) {
        Drawable background = ((ImageView) findViewById(R.id.gps_signal_dot_1)).getBackground();
        Objects.requireNonNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        Drawable background2 = ((ImageView) findViewById(R.id.gps_signal_dot_2)).getBackground();
        Objects.requireNonNull(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable2 = (GradientDrawable) background2;
        Drawable background3 = ((ImageView) findViewById(R.id.gps_signal_dot_3)).getBackground();
        Objects.requireNonNull(background3, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable3 = (GradientDrawable) background3;
        int i = Utils.isMidong() ? R.color.gps_signal_strong_zepp : R.color.gps_signal_strong;
        if (level == GPSSignal.SignalLevel.DEFAULT.getValue()) {
            Context context = getContext();
            int i2 = R.color.gps_signal_normal;
            gradientDrawable.setColor(ContextCompat.getColor(context, i2));
            gradientDrawable2.setColor(ContextCompat.getColor(getContext(), i2));
            gradientDrawable3.setColor(ContextCompat.getColor(getContext(), R.color.gps_signal_none));
            return;
        }
        if (level == GPSSignal.SignalLevel.STRONG.getValue()) {
            gradientDrawable.setColor(ContextCompat.getColor(getContext(), i));
            gradientDrawable2.setColor(ContextCompat.getColor(getContext(), i));
            gradientDrawable3.setColor(ContextCompat.getColor(getContext(), i));
        } else if (level == GPSSignal.SignalLevel.MIDDLE.getValue()) {
            gradientDrawable.setColor(ContextCompat.getColor(getContext(), i));
            gradientDrawable2.setColor(ContextCompat.getColor(getContext(), i));
            gradientDrawable3.setColor(ContextCompat.getColor(getContext(), R.color.gps_signal_none));
        } else {
            gradientDrawable.setColor(ContextCompat.getColor(getContext(), R.color.gps_signal_week));
            Context context2 = getContext();
            int i3 = R.color.gps_signal_none;
            gradientDrawable2.setColor(ContextCompat.getColor(context2, i3));
            gradientDrawable3.setColor(ContextCompat.getColor(getContext(), i3));
        }
    }

    public GpsSignalView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GpsSignalView(@NotNull Context context) {
        this(context, null);
    }
}
