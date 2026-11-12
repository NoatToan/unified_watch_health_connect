package com.mapbox.maps.plugin.compass;

import android.content.Context;
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
import com.garmin.android.apps.connectmobile.connectiq.x;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0015\u0010&\u001a\u00020'2\u0006\u0010$\u001a\u00020%H\u0000¢\u0006\u0002\b(J\u0010\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0017H\u0016J(\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\bH\u0016R$\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u001d8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u001d8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u000e\u0010$\u001a\u00020%X\u0082.¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/mapbox/maps/plugin/compass/CompassViewImpl;", "Lcom/mapbox/maps/plugin/compass/CompassView;", "Landroidx/appcompat/widget/AppCompatImageView;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "compassGravity", "getCompassGravity", "()I", "setCompassGravity", "(I)V", "compass", "Landroid/graphics/drawable/Drawable;", "compassImage", "getCompassImage", "()Landroid/graphics/drawable/Drawable;", "setCompassImage", "(Landroid/graphics/drawable/Drawable;)V", "", "compassRotation", "getCompassRotation", "()F", "setCompassRotation", "(F)V", "", "isCompassEnabled", "()Z", "setCompassEnabled", "(Z)V", "isCompassVisible", "setCompassVisible", "presenter", "Lcom/mapbox/maps/plugin/compass/CompassPlugin;", "injectPresenter", "", "injectPresenter$plugin_compass_release", "setCompassAlpha", "float", "setCompassMargins", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "plugin-compass_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class CompassViewImpl extends AppCompatImageView implements CompassView {
    private CompassPlugin presenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompassViewImpl(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        Resources resources = getResources();
        int i15 = R.drawable.mapbox_compass_icon;
        ThreadLocal<TypedValue> threadLocal = g.f16255a;
        Drawable drawable = resources.getDrawable(i15, null);
        if (drawable != null) {
            setCompassImage(drawable);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.compass_view_size);
        setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        setOnClickListener(new x(this, 2));
        setContentDescription(context.getString(R.string.mapbox_compassContentDescription));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(CompassViewImpl compassViewImpl, View view2) {
        compassViewImpl.getClass();
        CompassPlugin compassPlugin = compassViewImpl.presenter;
        if (compassPlugin != null) {
            if (compassPlugin != null) {
                compassPlugin.onCompassClicked();
            } else {
                s.m("presenter");
                throw null;
            }
        }
    }

    @Override // com.mapbox.maps.plugin.compass.CompassView
    public int getCompassGravity() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        return ((FrameLayout.LayoutParams) layoutParams).gravity;
    }

    @Override // com.mapbox.maps.plugin.compass.CompassView
    public Drawable getCompassImage() {
        Drawable drawable = getDrawable();
        drawable.getClass();
        return drawable;
    }

    @Override // com.mapbox.maps.plugin.compass.CompassView
    public float getCompassRotation() {
        return getRotation();
    }

    public final void injectPresenter$plugin_compass_release(CompassPlugin presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @Override // com.mapbox.maps.plugin.compass.CompassView
    public boolean isCompassEnabled() {
        return isEnabled();
    }

    @Override // com.mapbox.maps.plugin.compass.CompassView
    public boolean isCompassVisible() {
        return getVisibility() == 0;
    }

    @Override // com.mapbox.maps.plugin.compass.CompassView
    public void setCompassAlpha(float f14) {
        setAlpha(f14);
    }

    @Override // com.mapbox.maps.plugin.compass.CompassView
    public void setCompassEnabled(boolean z14) {
        if (isEnabled() != z14) {
            setEnabled(z14);
        }
    }

    @Override // com.mapbox.maps.plugin.compass.CompassView
    public void setCompassGravity(int i14) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        ((FrameLayout.LayoutParams) layoutParams).gravity = i14;
    }

    @Override // com.mapbox.maps.plugin.compass.CompassView
    public void setCompassImage(Drawable drawable) {
        drawable.getClass();
        setImageDrawable(drawable);
    }

    @Override // com.mapbox.maps.plugin.compass.CompassView
    public void setCompassMargins(int left, int top, int right, int bottom) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        ((FrameLayout.LayoutParams) layoutParams).setMargins(left, top, right, bottom);
    }

    @Override // com.mapbox.maps.plugin.compass.CompassView
    public void setCompassRotation(float f14) {
        setRotation(f14);
    }

    @Override // com.mapbox.maps.plugin.compass.CompassView
    public void setCompassVisible(boolean z14) {
        setVisibility(z14 ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompassViewImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ CompassViewImpl(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompassViewImpl(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
