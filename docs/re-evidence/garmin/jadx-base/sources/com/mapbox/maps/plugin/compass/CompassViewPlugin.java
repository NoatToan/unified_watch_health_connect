package com.mapbox.maps.plugin.compass;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.motion.a;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.plugin.InvalidPluginConfigurationException;
import com.mapbox.maps.plugin.Plugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import com.mapbox.maps.plugin.animation.MapAnimationOwnerRegistry;
import com.mapbox.maps.plugin.compass.generated.CompassAttributeParser;
import com.mapbox.maps.plugin.compass.generated.CompassSettings;
import com.mapbox.maps.plugin.compass.generated.CompassSettingsBase;
import com.mapbox.maps.plugin.compass.generated.CompassSettingsKt;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import e23.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\u0001ZB'\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010\u0018J\u0017\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010\u0018J\u000f\u0010,\u001a\u00020\rH\u0016¢\u0006\u0004\b,\u0010\u0018J7\u00103\u001a\u00020\r2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\r2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\r2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\rH\u0016¢\u0006\u0004\b:\u0010\u0018R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010\u000fR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\"\u0010M\u001a\u00020L8\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u0002050S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR$\u0010Y\u001a\u00020\u00102\u0006\u0010V\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bW\u0010\u0015\"\u0004\bX\u0010\u0013¨\u0006["}, d2 = {"Lcom/mapbox/maps/plugin/compass/CompassViewPlugin;", "Lcom/mapbox/maps/plugin/compass/CompassPlugin;", "Lcom/mapbox/maps/plugin/compass/generated/CompassSettingsBase;", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcom/mapbox/maps/plugin/compass/CompassViewImpl;", "viewImplProvider", "Landroid/animation/ValueAnimator;", "fadeAnimator", "<init>", "(Le23/l;Landroid/animation/ValueAnimator;)V", "", "bearing", "", "update", "(D)V", "", "withAnimator", "updateVisibility", "(Z)V", "shouldHideCompass", "()Z", "isFacingNorth", "applySettings", "()V", "Landroid/widget/FrameLayout;", "mapView", "Landroid/util/AttributeSet;", "attrs", "", "pixelRatio", "Landroid/view/View;", "bind", "(Landroid/widget/FrameLayout;Landroid/util/AttributeSet;F)Landroid/view/View;", "view", "onPluginView", "(Landroid/view/View;)V", "initialize", "cleanup", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "delegateProvider", "onDelegateProvider", "(Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;)V", "onStart", "onStop", "Lcom/mapbox/geojson/Point;", TtmlNode.CENTER, "zoom", "pitch", "Lcom/mapbox/maps/EdgeInsets;", "padding", "onCameraMove", "(Lcom/mapbox/geojson/Point;DDDLcom/mapbox/maps/EdgeInsets;)V", "Lcom/mapbox/maps/plugin/compass/OnCompassClickListener;", "onClickListener", "addCompassClickListener", "(Lcom/mapbox/maps/plugin/compass/OnCompassClickListener;)V", "removeCompassClickListener", "onCompassClicked", "Le23/l;", "Landroid/animation/ValueAnimator;", "Lcom/mapbox/maps/plugin/compass/CompassView;", "compassView", "Lcom/mapbox/maps/plugin/compass/CompassView;", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "mapCameraManager", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "D", "getBearing$plugin_compass_release", "()D", "setBearing$plugin_compass_release", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "animationPlugin", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "isHidden", "Z", "Lcom/mapbox/maps/plugin/compass/generated/CompassSettings;", "internalSettings", "Lcom/mapbox/maps/plugin/compass/generated/CompassSettings;", "getInternalSettings", "()Lcom/mapbox/maps/plugin/compass/generated/CompassSettings;", "setInternalSettings", "(Lcom/mapbox/maps/plugin/compass/generated/CompassSettings;)V", "Ljava/util/concurrent/CopyOnWriteArraySet;", "compassClickListeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "value", "getEnabled", "setEnabled", "enabled", "Companion", "plugin-compass_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CompassViewPlugin extends CompassSettingsBase implements CompassPlugin {

    @Deprecated
    private static final long BEARING_NORTH_ANIMATION_DURATION = 300;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final double DEFAULT_BEARING = 0.0d;

    @Deprecated
    private static final long TIME_FADE_ANIMATION = 500;

    @Deprecated
    private static final long TIME_WAIT_IDLE = 500;
    private CameraAnimationsPlugin animationPlugin;
    private double bearing;
    private final CopyOnWriteArraySet<OnCompassClickListener> compassClickListeners;
    private CompassView compassView;
    private final ValueAnimator fadeAnimator;
    private CompassSettings internalSettings;
    private boolean isHidden;
    private MapCameraManagerDelegate mapCameraManager;
    private final l<Context, CompassViewImpl> viewImplProvider;

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.compass.CompassViewPlugin$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/plugin/compass/CompassViewImpl;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<Context, CompassViewImpl> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public final CompassViewImpl invoke(Context context) {
            context.getClass();
            return new CompassViewImpl(context, null, 0, 6, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompassViewPlugin(l<? super Context, ? extends CompassViewImpl> lVar, @SuppressLint({"Recycle"}) ValueAnimator valueAnimator) {
        lVar.getClass();
        valueAnimator.getClass();
        this.viewImplProvider = lVar;
        this.fadeAnimator = valueAnimator;
        this.internalSettings = CompassSettingsKt.CompassSettings(CompassViewPlugin$internalSettings$1.INSTANCE);
        this.compassClickListeners = new CopyOnWriteArraySet<>();
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(500L);
        valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.mapbox.maps.plugin.compass.CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.getClass();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                animator.getClass();
                CompassView compassView = this.this$0.compassView;
                if (compassView != null) {
                    compassView.setCompassVisible(false);
                } else {
                    s.m("compassView");
                    throw null;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                animator.getClass();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                animator.getClass();
            }
        });
        valueAnimator.addUpdateListener(new a(this, 2));
    }

    private final boolean isFacingNorth() {
        CompassView compassView = this.compassView;
        if (compassView == null) {
            s.m("compassView");
            throw null;
        }
        if (Math.abs(compassView.getCompassRotation()) >= 359.0d) {
            return true;
        }
        CompassView compassView2 = this.compassView;
        if (compassView2 != null) {
            return ((double) Math.abs(compassView2.getCompassRotation())) <= 1.0d;
        }
        s.m("compassView");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(CompassViewPlugin compassViewPlugin, ValueAnimator valueAnimator) {
        compassViewPlugin.getClass();
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        if (fFloatValue < compassViewPlugin.getInternalSettings().getOpacity()) {
            CompassView compassView = compassViewPlugin.compassView;
            if (compassView != null) {
                compassView.setCompassAlpha(fFloatValue);
            } else {
                s.m("compassView");
                throw null;
            }
        }
    }

    private final boolean shouldHideCompass() {
        return getInternalSettings().getFadeWhenFacingNorth() && isFacingNorth();
    }

    private final void update(double bearing) {
        this.bearing = bearing;
        CompassView compassView = this.compassView;
        if (compassView == null) {
            s.m("compassView");
            throw null;
        }
        compassView.setCompassRotation(-((float) bearing));
        updateVisibility$default(this, false, 1, null);
    }

    private final void updateVisibility(boolean withAnimator) {
        CompassView compassView = this.compassView;
        if (compassView == null) {
            s.m("compassView");
            throw null;
        }
        if (compassView.isCompassEnabled()) {
            if (!shouldHideCompass()) {
                this.isHidden = false;
                this.fadeAnimator.cancel();
                CompassView compassView2 = this.compassView;
                if (compassView2 == null) {
                    s.m("compassView");
                    throw null;
                }
                compassView2.setCompassVisible(true);
                CompassView compassView3 = this.compassView;
                if (compassView3 != null) {
                    compassView3.setCompassAlpha(getInternalSettings().getOpacity());
                    return;
                } else {
                    s.m("compassView");
                    throw null;
                }
            }
            if (this.isHidden) {
                return;
            }
            this.isHidden = true;
            if (withAnimator) {
                this.fadeAnimator.start();
                return;
            }
            CompassView compassView4 = this.compassView;
            if (compassView4 == null) {
                s.m("compassView");
                throw null;
            }
            compassView4.setCompassVisible(false);
            CompassView compassView5 = this.compassView;
            if (compassView5 != null) {
                compassView5.setCompassAlpha(0.0f);
            } else {
                s.m("compassView");
                throw null;
            }
        }
    }

    public static /* synthetic */ void updateVisibility$default(CompassViewPlugin compassViewPlugin, boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z14 = true;
        }
        compassViewPlugin.updateVisibility(z14);
    }

    @Override // com.mapbox.maps.plugin.compass.CompassPlugin
    public void addCompassClickListener(OnCompassClickListener onClickListener) {
        onClickListener.getClass();
        this.compassClickListeners.add(onClickListener);
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsBase
    public void applySettings() {
        int iIntValue;
        setEnabled(getInternalSettings().getEnabled());
        CompassView compassView = this.compassView;
        if (compassView == null) {
            s.m("compassView");
            throw null;
        }
        compassView.setCompassGravity(getInternalSettings().getPosition());
        ImageHolder image = getInternalSettings().getImage();
        if (image != null) {
            Context context = ((CompassViewImpl) compassView).getContext();
            Bitmap bitmap = image.getBitmap();
            if (bitmap != null) {
                compassView.setCompassImage(new BitmapDrawable(context.getResources(), bitmap));
            }
            Integer drawableId = image.getDrawableId();
            if (drawableId != null && (iIntValue = drawableId.intValue()) != -1) {
                Drawable drawableA = j.a.a(context, iIntValue);
                drawableA.getClass();
                compassView.setCompassImage(drawableA);
            }
        }
        compassView.setCompassRotation(getInternalSettings().getRotation());
        compassView.setCompassEnabled(getInternalSettings().getEnabled());
        compassView.setCompassAlpha(getInternalSettings().getOpacity());
        compassView.setCompassMargins((int) getInternalSettings().getMarginLeft(), (int) getInternalSettings().getMarginTop(), (int) getInternalSettings().getMarginRight(), (int) getInternalSettings().getMarginBottom());
        update(this.bearing);
        compassView.requestLayout();
    }

    @Override // com.mapbox.maps.plugin.ViewPlugin
    public View bind(FrameLayout mapView, AttributeSet attrs, float pixelRatio) {
        mapView.getClass();
        CompassAttributeParser compassAttributeParser = CompassAttributeParser.INSTANCE;
        Context context = mapView.getContext();
        context.getClass();
        setInternalSettings(compassAttributeParser.parseCompassSettings(context, attrs, pixelRatio));
        l<Context, CompassViewImpl> lVar = this.viewImplProvider;
        Context context2 = mapView.getContext();
        context2.getClass();
        CompassViewImpl compassViewImplInvoke = lVar.invoke(context2);
        compassViewImplInvoke.injectPresenter$plugin_compass_release(this);
        return compassViewImplInvoke;
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void cleanup() {
        this.compassClickListeners.clear();
        this.fadeAnimator.cancel();
        CompassView compassView = this.compassView;
        if (compassView != null) {
            compassView.setCompassEnabled(false);
        } else {
            s.m("compassView");
            throw null;
        }
    }

    /* JADX INFO: renamed from: getBearing$plugin_compass_release, reason: from getter */
    public final double getBearing() {
        return this.bearing;
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsBase, com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public boolean getEnabled() {
        return getInternalSettings().getEnabled();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsBase
    public CompassSettings getInternalSettings() {
        return this.internalSettings;
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void initialize() {
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.MapCameraPlugin
    public void onCameraMove(Point center, double zoom, double pitch, double bearing, EdgeInsets padding) {
        center.getClass();
        padding.getClass();
        update(bearing);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0048  */
    /* JADX WARN: Code duplicated, block: B:15:0x0073  */
    /* JADX WARN: Code duplicated, block: B:8:0x0044  */
    @Override // com.mapbox.maps.plugin.compass.CompassPlugin
    public void onCompassClicked() {
        MapCameraManagerDelegate mapCameraManagerDelegate;
        Double dValueOf = Double.valueOf(0.0d);
        if (getInternalSettings().getClickable()) {
            CameraAnimationsPlugin cameraAnimationsPlugin = this.animationPlugin;
            if (cameraAnimationsPlugin != null) {
                CameraOptions cameraOptionsBuild = new CameraOptions.Builder().bearing(dValueOf).build();
                cameraOptionsBuild.getClass();
                MapAnimationOptions.Companion companion = MapAnimationOptions.INSTANCE;
                MapAnimationOptions.Builder builder = new MapAnimationOptions.Builder();
                builder.owner(MapAnimationOwnerRegistry.COMPASS);
                builder.duration(300L);
                Unit unit = Unit.INSTANCE;
                if (CameraAnimationsPlugin.DefaultImpls.flyTo$default(cameraAnimationsPlugin, cameraOptionsBuild, builder.build(), null, 4, null) == null) {
                    mapCameraManagerDelegate = this.mapCameraManager;
                    if (mapCameraManagerDelegate != null) {
                        s.m("mapCameraManager");
                        throw null;
                    }
                    CameraOptions cameraOptionsBuild2 = new CameraOptions.Builder().bearing(dValueOf).build();
                    cameraOptionsBuild2.getClass();
                    mapCameraManagerDelegate.setCamera(cameraOptionsBuild2);
                    Unit unit2 = Unit.INSTANCE;
                }
            } else {
                mapCameraManagerDelegate = this.mapCameraManager;
                if (mapCameraManagerDelegate != null) {
                    s.m("mapCameraManager");
                    throw null;
                }
                CameraOptions cameraOptionsBuild3 = new CameraOptions.Builder().bearing(dValueOf).build();
                cameraOptionsBuild3.getClass();
                mapCameraManagerDelegate.setCamera(cameraOptionsBuild3);
                Unit unit3 = Unit.INSTANCE;
            }
            Iterator<T> it = this.compassClickListeners.iterator();
            while (it.hasNext()) {
                ((OnCompassClickListener) it.next()).onCompassClick();
            }
        }
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void onDelegateProvider(MapDelegateProvider delegateProvider) throws InvalidPluginConfigurationException {
        delegateProvider.getClass();
        MapCameraManagerDelegate mapCameraManagerDelegate = delegateProvider.getMapCameraManagerDelegate();
        this.mapCameraManager = mapCameraManagerDelegate;
        if (mapCameraManagerDelegate == null) {
            s.m("mapCameraManager");
            throw null;
        }
        this.bearing = mapCameraManagerDelegate.getCameraState().getBearing();
        CameraAnimationsPlugin cameraAnimationsPlugin = (CameraAnimationsPlugin) delegateProvider.getMapPluginProviderDelegate().getPlugin(Plugin.MAPBOX_CAMERA_PLUGIN_ID);
        if (cameraAnimationsPlugin == null) {
            throw new InvalidPluginConfigurationException("Can't look up an instance of plugin, is it available on the clazz path and loaded through the map?");
        }
        this.animationPlugin = cameraAnimationsPlugin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mapbox.maps.plugin.ViewPlugin
    public void onPluginView(View view2) {
        view2.getClass();
        CompassView compassView = view2 instanceof CompassView ? (CompassView) view2 : null;
        if (compassView == null) {
            h.s("The provided view needs to implement CompassContract.CompassView");
        } else {
            this.compassView = compassView;
            updateVisibility(false);
        }
    }

    @Override // com.mapbox.maps.plugin.LifecyclePlugin
    public void onStart() {
        update(this.bearing);
    }

    @Override // com.mapbox.maps.plugin.LifecyclePlugin
    public void onStop() {
        this.fadeAnimator.cancel();
    }

    @Override // com.mapbox.maps.plugin.compass.CompassPlugin
    public void removeCompassClickListener(OnCompassClickListener onClickListener) {
        onClickListener.getClass();
        this.compassClickListeners.remove(onClickListener);
    }

    public final void setBearing$plugin_compass_release(double d14) {
        this.bearing = d14;
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsBase, com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setEnabled(boolean z14) {
        setInternalSettings(getInternalSettings().toBuilder().setEnabled(z14).build());
        CompassView compassView = this.compassView;
        if (compassView == null) {
            s.m("compassView");
            throw null;
        }
        compassView.setCompassEnabled(z14);
        update(this.bearing);
        if (!z14 || shouldHideCompass()) {
            CompassView compassView2 = this.compassView;
            if (compassView2 == null) {
                s.m("compassView");
                throw null;
            }
            compassView2.setCompassAlpha(0.0f);
            CompassView compassView3 = this.compassView;
            if (compassView3 != null) {
                compassView3.setCompassVisible(false);
                return;
            } else {
                s.m("compassView");
                throw null;
            }
        }
        CompassView compassView4 = this.compassView;
        if (compassView4 == null) {
            s.m("compassView");
            throw null;
        }
        compassView4.setCompassAlpha(getInternalSettings().getOpacity());
        CompassView compassView5 = this.compassView;
        if (compassView5 != null) {
            compassView5.setCompassVisible(true);
        } else {
            s.m("compassView");
            throw null;
        }
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsBase
    public void setInternalSettings(CompassSettings compassSettings) {
        compassSettings.getClass();
        this.internalSettings = compassSettings;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/compass/CompassViewPlugin$Companion;", "", "()V", "BEARING_NORTH_ANIMATION_DURATION", "", "DEFAULT_BEARING", "", "TIME_FADE_ANIMATION", "TIME_WAIT_IDLE", "plugin-compass_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CompassViewPlugin(l lVar, ValueAnimator valueAnimator, int i14, j jVar) {
        lVar = (i14 & 1) != 0 ? AnonymousClass1.INSTANCE : lVar;
        if ((i14 & 2) != 0) {
            valueAnimator = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimator.getClass();
        }
        this(lVar, valueAnimator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompassViewPlugin() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
