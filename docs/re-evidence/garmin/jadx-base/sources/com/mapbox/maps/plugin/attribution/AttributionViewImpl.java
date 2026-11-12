package com.mapbox.maps.plugin.attribution;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import b7.g;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.maps.MapboxLogger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\bH\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\bH\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016¨\u0006\u001d"}, d2 = {"Lcom/mapbox/maps/plugin/attribution/AttributionViewImpl;", "Lcom/mapbox/maps/plugin/attribution/AttributionView;", "Landroidx/appcompat/widget/AppCompatImageView;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setAttributionMargins", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "setContentDescription", "contentDescription", "", "setEnable", "enabled", "", "setGravity", "gravity", "setIconColor", TtmlNode.ATTR_TTS_COLOR, "setViewOnClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "plugin-attribution_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AttributionViewImpl extends AppCompatImageView implements AttributionView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributionViewImpl(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        Resources resources = getResources();
        int i15 = R.drawable.mapbox_attribution_selector;
        ThreadLocal<TypedValue> threadLocal = g.f16255a;
        Drawable drawable = resources.getDrawable(i15, null);
        if (drawable != null) {
            setImageDrawable(drawable);
        }
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setContentDescription(context.getString(R.string.mapbox_attributionsDialogTitle));
    }

    @Override // com.mapbox.maps.plugin.attribution.AttributionView
    public void setAttributionMargins(int left, int top, int right, int bottom) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(left, top, right, bottom);
        layoutParams2.setMarginStart(left);
        layoutParams2.setMarginEnd(right);
    }

    @Override // android.view.View, com.mapbox.maps.plugin.attribution.AttributionView
    public void setContentDescription(CharSequence contentDescription) {
        super.setContentDescription(contentDescription);
    }

    @Override // com.mapbox.maps.plugin.attribution.AttributionView
    public void setEnable(boolean enabled) {
        int i14;
        if (enabled) {
            i14 = 0;
        } else {
            String string = getContext().getString(R.string.mapbox_warning_attribution_disabled);
            string.getClass();
            MapboxLogger.logW("MbxAttribution", string);
            i14 = 8;
        }
        setVisibility(i14);
    }

    @Override // com.mapbox.maps.plugin.attribution.AttributionView
    public void setGravity(int gravity) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        ((FrameLayout.LayoutParams) layoutParams).gravity = gravity;
    }

    @Override // com.mapbox.maps.plugin.attribution.AttributionView
    public void setIconColor(int color) {
        setImageTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{color, color}));
    }

    @Override // com.mapbox.maps.plugin.attribution.AttributionView
    public void setViewOnClickListener(View.OnClickListener listener) {
        listener.getClass();
        setOnClickListener(listener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AttributionViewImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ AttributionViewImpl(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AttributionViewImpl(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
