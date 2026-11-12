package com.garmin.android.apps.connectmobile.map;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c22.b;
import c22.r2;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.map.MapOptionsContainer;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import v22.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR.\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R.\u0010\u001c\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R.\u0010 \u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R.\u0010$\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R.\u0010(\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R*\u0010.\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u000fR*\u00102\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010\u000fR*\u00106\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010*\u001a\u0004\b4\u0010,\"\u0004\b5\u0010\u000fR*\u00108\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010*\u001a\u0004\b8\u0010,\"\u0004\b9\u0010\u000fR*\u0010:\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010*\u001a\u0004\b:\u0010,\"\u0004\b;\u0010\u000f¨\u0006<"}, d2 = {"Lcom/garmin/android/apps/connectmobile/map/MapOptionsContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "enabled", "", "setRecenterMapButtonEnabled", "(Z)V", "Lc22/r2;", "value", "p", "Lc22/r2;", "getMapSettingsClickListener", "()Lc22/r2;", "setMapSettingsClickListener", "(Lc22/r2;)V", "mapSettingsClickListener", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getMapLegendClickListener", "setMapLegendClickListener", "mapLegendClickListener", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "getRecenterMapClickListener", "setRecenterMapClickListener", "recenterMapClickListener", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "getToggle3DClickListener", "setToggle3DClickListener", "toggle3DClickListener", "v", "getCompassClickListener", "setCompassClickListener", "compassClickListener", "w", "Z", "getShowMapOptions", "()Z", "setShowMapOptions", "showMapOptions", "x", "getShowNewMapButtons", "setShowNewMapButtons", "showNewMapButtons", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "getHasGCMaps3DSubscription", "setHasGCMaps3DSubscription", "hasGCMaps3DSubscription", "z", "isEditing", "setEditing", "is3dEnabled", "set3dEnabled", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MapOptionsContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f38735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f38736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f38737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f38738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f38739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f38740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f38741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f38742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f38743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f38744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final FloatingActionButton f38745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f38746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final FloatingActionButton f38747m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f38748n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f38749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public r2 mapSettingsClickListener;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public r2 mapLegendClickListener;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public r2 recenterMapClickListener;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public r2 toggle3DClickListener;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public r2 compassClickListener;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public boolean showMapOptions;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public boolean showNewMapButtons;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public boolean hasGCMaps3DSubscription;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public boolean isEditing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapOptionsContainer(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.map_options_container, (ViewGroup) this, true);
        viewInflate.getClass();
        this.f38735a = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.map_types_button);
        viewFindViewById.getClass();
        this.f38736b = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.toggle_3d_button);
        viewFindViewById2.getClass();
        FloatingActionButton floatingActionButton = (FloatingActionButton) viewFindViewById2;
        this.f38745k = floatingActionButton;
        View viewFindViewById3 = viewInflate.findViewById(R.id.compass);
        viewFindViewById3.getClass();
        this.f38748n = viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.compass_courses);
        viewFindViewById4.getClass();
        this.f38749o = viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.toggle_3d_container);
        viewFindViewById5.getClass();
        this.f38746l = viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.toggle_3d_button_courses);
        viewFindViewById6.getClass();
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) viewFindViewById6;
        this.f38747m = floatingActionButton2;
        View viewFindViewById7 = viewInflate.findViewById(R.id.map_options);
        viewFindViewById7.getClass();
        this.f38737c = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = viewInflate.findViewById(R.id.map_settings_button);
        viewFindViewById8.getClass();
        this.f38738d = viewFindViewById8;
        View viewFindViewById9 = viewInflate.findViewById(R.id.map_options_divider);
        viewFindViewById9.getClass();
        this.f38739e = viewFindViewById9;
        View viewFindViewById10 = viewInflate.findViewById(R.id.map_legend_button);
        viewFindViewById10.getClass();
        this.f38740f = viewFindViewById10;
        View viewFindViewById11 = viewInflate.findViewById(R.id.map_settings_tooltip);
        viewFindViewById11.getClass();
        this.f38741g = viewFindViewById11;
        View viewFindViewById12 = viewInflate.findViewById(R.id.map_settings_tooltip_text_view);
        viewFindViewById12.getClass();
        this.f38742h = (TextView) viewFindViewById12;
        View viewFindViewById13 = viewInflate.findViewById(R.id.recenter_container);
        viewFindViewById13.getClass();
        this.f38743i = viewFindViewById13;
        View viewFindViewById14 = viewInflate.findViewById(R.id.recenter_button);
        viewFindViewById14.getClass();
        this.f38744j = viewFindViewById14;
        if (b.e(context)) {
            viewFindViewById.getLayoutParams().width = MathKt.c(b.c(context, viewFindViewById.getResources().getDimension(R.dimen.icon_medium), 1.5f));
            viewFindViewById.getLayoutParams().height = MathKt.c(b.c(context, viewFindViewById.getResources().getDimension(R.dimen.icon_medium), 1.5f));
            viewFindViewById8.getLayoutParams().width = MathKt.c(b.c(context, viewFindViewById8.getResources().getDimension(R.dimen.icon_medium), 1.5f));
            viewFindViewById8.getLayoutParams().height = MathKt.c(b.c(context, viewFindViewById8.getResources().getDimension(R.dimen.icon_medium), 1.5f));
            viewFindViewById10.getLayoutParams().width = MathKt.c(b.c(context, viewFindViewById10.getResources().getDimension(R.dimen.icon_medium), 1.5f));
            viewFindViewById10.getLayoutParams().height = MathKt.c(b.c(context, viewFindViewById10.getResources().getDimension(R.dimen.icon_medium), 1.5f));
            viewFindViewById14.getLayoutParams().width = MathKt.c(b.c(context, viewFindViewById14.getResources().getDimension(R.dimen.icon_medium), 1.5f));
            viewFindViewById14.getLayoutParams().height = MathKt.c(b.c(context, viewFindViewById14.getResources().getDimension(R.dimen.icon_medium), 1.5f));
            floatingActionButton.getLayoutParams().width = MathKt.c(b.c(context, floatingActionButton.getResources().getDimension(R.dimen.icon_medium), 1.5f));
            floatingActionButton.getLayoutParams().height = MathKt.c(b.c(context, floatingActionButton.getResources().getDimension(R.dimen.icon_medium), 1.5f));
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
            floatingActionButton.setScaleType(scaleType);
            floatingActionButton2.getLayoutParams().width = MathKt.c(b.c(context, floatingActionButton2.getResources().getDimension(R.dimen.icon_medium), 1.5f));
            floatingActionButton2.getLayoutParams().height = MathKt.c(b.c(context, floatingActionButton2.getResources().getDimension(R.dimen.icon_medium), 1.5f));
            floatingActionButton2.setScaleType(scaleType);
            viewFindViewById3.getLayoutParams().width = MathKt.c(b.c(context, viewFindViewById3.getResources().getDimension(R.dimen.icon_medium), 1.5f));
            viewFindViewById3.getLayoutParams().height = MathKt.c(b.c(context, viewFindViewById3.getResources().getDimension(R.dimen.icon_medium), 1.5f));
            viewFindViewById4.getLayoutParams().width = MathKt.c(b.c(context, viewFindViewById4.getResources().getDimension(R.dimen.icon_medium), 1.5f));
            viewFindViewById4.getLayoutParams().height = MathKt.c(b.c(context, viewFindViewById4.getResources().getDimension(R.dimen.icon_medium), 1.5f));
        }
    }

    public final void a(float f14) {
        float f15 = -f14;
        View view2 = this.f38748n;
        view2.setRotation(f15);
        View view3 = this.f38749o;
        view3.setRotation(f15);
        if (f14 == 0.0f) {
            final int i14 = 0;
            view2.animate().alpha(0.0f).withEndAction(new Runnable(this) { // from class: qw0.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MapOptionsContainer f148322b;

                {
                    this.f148322b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            this.f148322b.f38748n.setVisibility(8);
                            break;
                        default:
                            this.f148322b.f38749o.setVisibility(8);
                            break;
                    }
                }
            }).start();
            final int i15 = 1;
            view3.animate().alpha(0.0f).withEndAction(new Runnable(this) { // from class: qw0.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MapOptionsContainer f148322b;

                {
                    this.f148322b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            this.f148322b.f38748n.setVisibility(8);
                            break;
                        default:
                            this.f148322b.f38749o.setVisibility(8);
                            break;
                    }
                }
            }).start();
            return;
        }
        if (view2.getVisibility() == 8) {
            view2.setVisibility(0);
            view2.animate().alpha(1.0f).start();
            view3.setVisibility(0);
            view3.animate().alpha(1.0f).start();
        }
    }

    public final void b() {
        e.v(this.f38735a, this.showMapOptions);
        e.v(this.f38736b, !this.showNewMapButtons);
        boolean z14 = false;
        e.v(this.f38745k, this.hasGCMaps3DSubscription && !this.showNewMapButtons);
        e.v(this.f38737c, this.showNewMapButtons);
        e.v(this.f38739e, this.mapLegendClickListener != null);
        e.v(this.f38740f, this.mapLegendClickListener != null);
        e.v(this.f38743i, this.recenterMapClickListener != null);
        e.v(this.f38744j, this.recenterMapClickListener != null);
        e.v(this.f38746l, this.showNewMapButtons && this.hasGCMaps3DSubscription);
        if (this.showNewMapButtons && this.hasGCMaps3DSubscription && !this.isEditing) {
            z14 = true;
        }
        e.v(this.f38747m, z14);
        e.v(this.f38748n, !this.showNewMapButtons);
        e.v(this.f38749o, this.showNewMapButtons);
    }

    public final r2 getCompassClickListener() {
        return this.compassClickListener;
    }

    public final boolean getHasGCMaps3DSubscription() {
        return this.hasGCMaps3DSubscription;
    }

    public final r2 getMapLegendClickListener() {
        return this.mapLegendClickListener;
    }

    public final r2 getMapSettingsClickListener() {
        return this.mapSettingsClickListener;
    }

    public final r2 getRecenterMapClickListener() {
        return this.recenterMapClickListener;
    }

    public final boolean getShowMapOptions() {
        return this.showMapOptions;
    }

    public final boolean getShowNewMapButtons() {
        return this.showNewMapButtons;
    }

    public final r2 getToggle3DClickListener() {
        return this.toggle3DClickListener;
    }

    public final void set3dEnabled(boolean z14) {
        FloatingActionButton floatingActionButton = this.f38747m;
        FloatingActionButton floatingActionButton2 = this.f38745k;
        if (z14) {
            floatingActionButton2.setImageResource(R.drawable.map_2d);
            floatingActionButton.setImageResource(R.drawable.map_2d);
        } else {
            floatingActionButton2.setImageResource(R.drawable.map_3d);
            floatingActionButton.setImageResource(R.drawable.map_3d);
        }
    }

    public final void setCompassClickListener(r2 r2Var) {
        this.compassClickListener = r2Var;
        this.f38748n.setOnClickListener(r2Var);
        this.f38749o.setOnClickListener(r2Var);
        b();
    }

    public final void setEditing(boolean z14) {
        this.isEditing = z14;
        b();
    }

    public final void setHasGCMaps3DSubscription(boolean z14) {
        this.hasGCMaps3DSubscription = z14;
        b();
    }

    public final void setMapLegendClickListener(r2 r2Var) {
        this.mapLegendClickListener = r2Var;
        this.f38740f.setOnClickListener(r2Var);
        b();
    }

    public final void setMapSettingsClickListener(r2 r2Var) {
        this.mapSettingsClickListener = r2Var;
        this.f38736b.setOnClickListener(r2Var);
        this.f38738d.setOnClickListener(r2Var);
        b();
    }

    public final void setRecenterMapButtonEnabled(boolean enabled) {
        this.f38744j.setEnabled(enabled);
    }

    public final void setRecenterMapClickListener(r2 r2Var) {
        this.recenterMapClickListener = r2Var;
        this.f38744j.setOnClickListener(r2Var);
        b();
    }

    public final void setShowMapOptions(boolean z14) {
        this.showMapOptions = z14;
        b();
    }

    public final void setShowNewMapButtons(boolean z14) {
        this.showNewMapButtons = z14;
        b();
    }

    public final void setToggle3DClickListener(r2 r2Var) {
        this.toggle3DClickListener = r2Var;
        this.f38745k.setOnClickListener(r2Var);
        this.f38747m.setOnClickListener(r2Var);
        b();
    }

    public final void setTooltip(boolean z14) {
        e.v(this.f38741g, z14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapOptionsContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapOptionsContainer(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapOptionsContainer(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ MapOptionsContainer(Context context, AttributeSet attributeSet, int i14, int i15, int i16, j jVar) {
        this(context, (i16 & 2) != 0 ? null : attributeSet, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? 0 : i15);
    }
}
