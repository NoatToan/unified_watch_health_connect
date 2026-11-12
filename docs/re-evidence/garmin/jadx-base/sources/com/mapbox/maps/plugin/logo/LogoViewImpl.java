package com.mapbox.maps.plugin.logo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import b7.g;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxLogger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001cJ(\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\nH\u0016R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/mapbox/maps/plugin/logo/LogoViewImpl;", "Lcom/mapbox/maps/plugin/logo/LogoView;", "Landroidx/appcompat/widget/AppCompatImageView;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "logoEnabled", "getLogoEnabled", "()Z", "setLogoEnabled", "(Z)V", "logoGravity", "getLogoGravity", "()I", "setLogoGravity", "(I)V", "presenter", "Lcom/mapbox/maps/plugin/logo/LogoPlugin;", "injectPresenter", "", "injectPresenter$plugin_logo_release", "setLogoMargins", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "plugin-logo_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LogoViewImpl extends AppCompatImageView implements LogoView {
    private LogoPlugin presenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        Resources resources = getResources();
        int i14 = R.drawable.mapbox_logo_icon;
        ThreadLocal<TypedValue> threadLocal = g.f16255a;
        Drawable drawable = resources.getDrawable(i14, null);
        if (drawable != null) {
            setImageDrawable(drawable);
        }
        float f14 = getContext().getResources().getDisplayMetrics().density;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setLogoGravity(8388691);
        int i15 = (int) (4 * f14);
        setLogoMargins(i15, i15, i15, i15);
    }

    @Override // com.mapbox.maps.plugin.logo.LogoView
    public boolean getLogoEnabled() {
        return getVisibility() == 0;
    }

    @Override // com.mapbox.maps.plugin.logo.LogoView
    public int getLogoGravity() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        return ((FrameLayout.LayoutParams) layoutParams).gravity;
    }

    public final void injectPresenter$plugin_logo_release(LogoPlugin presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @Override // com.mapbox.maps.plugin.logo.LogoView
    public void setLogoEnabled(boolean z14) {
        int i14;
        if (z14) {
            i14 = 0;
        } else {
            String string = getContext().getString(R.string.mapbox_warning_logo_disabled);
            string.getClass();
            MapboxLogger.logW("MbxLogo", string);
            i14 = 8;
        }
        setVisibility(i14);
    }

    @Override // com.mapbox.maps.plugin.logo.LogoView
    public void setLogoGravity(int i14) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        ((FrameLayout.LayoutParams) layoutParams).gravity = i14;
    }

    @Override // com.mapbox.maps.plugin.logo.LogoView
    public void setLogoMargins(int left, int top, int right, int bottom) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(left, top, right, bottom);
        layoutParams2.setMarginStart(left);
        layoutParams2.setMarginEnd(right);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoViewImpl(Context context) {
        super(context);
        context.getClass();
        Resources resources = getResources();
        int i14 = R.drawable.mapbox_logo_icon;
        ThreadLocal<TypedValue> threadLocal = g.f16255a;
        Drawable drawable = resources.getDrawable(i14, null);
        if (drawable != null) {
            setImageDrawable(drawable);
        }
        float f14 = getContext().getResources().getDisplayMetrics().density;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setLogoGravity(8388691);
        int i15 = (int) (4 * f14);
        setLogoMargins(i15, i15, i15, i15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoViewImpl(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        attributeSet.getClass();
        Resources resources = getResources();
        int i15 = R.drawable.mapbox_logo_icon;
        ThreadLocal<TypedValue> threadLocal = g.f16255a;
        Drawable drawable = resources.getDrawable(i15, null);
        if (drawable != null) {
            setImageDrawable(drawable);
        }
        float f14 = getContext().getResources().getDisplayMetrics().density;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setLogoGravity(8388691);
        int i16 = (int) (4 * f14);
        setLogoMargins(i16, i16, i16, i16);
    }
}
