package com.mapbox.maps.plugin.attribution;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.mapbox.maps.plugin.attribution.generated.AttributionAttributeParser;
import com.mapbox.maps.plugin.attribution.generated.AttributionSettings;
import com.mapbox.maps.plugin.attribution.generated.AttributionSettingsBase;
import com.mapbox.maps.plugin.attribution.generated.AttributionSettingsKt;
import com.mapbox.maps.plugin.delegates.MapAttributionDelegate;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\"\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\fJ\u0017\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010\u0013J\u000f\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010\fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u00102R\"\u00104\u001a\u0002038\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/mapbox/maps/plugin/attribution/AttributionPluginImpl;", "Lcom/mapbox/maps/plugin/attribution/AttributionPlugin;", "Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettingsBase;", "Landroid/view/View$OnClickListener;", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcom/mapbox/maps/plugin/attribution/AttributionViewImpl;", "viewImplProvider", "<init>", "(Le23/l;)V", "", "applySettings", "()V", "Lcom/mapbox/maps/plugin/delegates/MapAttributionDelegate;", "getMapAttributionDelegate", "()Lcom/mapbox/maps/plugin/delegates/MapAttributionDelegate;", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "", "contentDescription", "setContentDescription", "(Ljava/lang/CharSequence;)V", "Lcom/mapbox/maps/plugin/attribution/AttributionDialogManager;", "dialogManager", "setCustomAttributionDialogManager", "(Lcom/mapbox/maps/plugin/attribution/AttributionDialogManager;)V", "Landroid/widget/FrameLayout;", "mapView", "Landroid/util/AttributeSet;", "attrs", "", "pixelRatio", "bind", "(Landroid/widget/FrameLayout;Landroid/util/AttributeSet;F)Landroid/view/View;", "initialize", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "delegateProvider", "onDelegateProvider", "(Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;)V", "view", "onPluginView", "onStop", "Le23/l;", "Lcom/mapbox/maps/plugin/attribution/AttributionView;", "attributionView", "Lcom/mapbox/maps/plugin/attribution/AttributionView;", "mapAttributionDelegate", "Lcom/mapbox/maps/plugin/delegates/MapAttributionDelegate;", "Lcom/mapbox/maps/plugin/attribution/AttributionDialogManager;", "Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings;", "internalSettings", "Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings;", "getInternalSettings", "()Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings;", "setInternalSettings", "(Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings;)V", "plugin-attribution_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AttributionPluginImpl extends AttributionSettingsBase implements AttributionPlugin, View.OnClickListener {
    private AttributionView attributionView;
    private AttributionDialogManager dialogManager;
    private AttributionSettings internalSettings;
    private MapAttributionDelegate mapAttributionDelegate;
    private final l<Context, AttributionViewImpl> viewImplProvider;

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.attribution.AttributionPluginImpl$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/plugin/attribution/AttributionViewImpl;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<Context, AttributionViewImpl> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public final AttributionViewImpl invoke(Context context) {
            context.getClass();
            return new AttributionViewImpl(context, null, 0, 6, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttributionPluginImpl(l<? super Context, AttributionViewImpl> lVar) {
        lVar.getClass();
        this.viewImplProvider = lVar;
        this.internalSettings = AttributionSettingsKt.AttributionSettings(AttributionPluginImpl$internalSettings$1.INSTANCE);
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsBase
    public void applySettings() {
        AttributionView attributionView = this.attributionView;
        if (attributionView == null) {
            s.m("attributionView");
            throw null;
        }
        attributionView.setGravity(getInternalSettings().getPosition());
        AttributionView attributionView2 = this.attributionView;
        if (attributionView2 == null) {
            s.m("attributionView");
            throw null;
        }
        attributionView2.setEnable(getInternalSettings().getEnabled());
        AttributionView attributionView3 = this.attributionView;
        if (attributionView3 == null) {
            s.m("attributionView");
            throw null;
        }
        attributionView3.setIconColor(getInternalSettings().getIconColor());
        AttributionView attributionView4 = this.attributionView;
        if (attributionView4 == null) {
            s.m("attributionView");
            throw null;
        }
        attributionView4.setAttributionMargins((int) getInternalSettings().getMarginLeft(), (int) getInternalSettings().getMarginTop(), (int) getInternalSettings().getMarginRight(), (int) getInternalSettings().getMarginBottom());
        AttributionView attributionView5 = this.attributionView;
        if (attributionView5 != null) {
            attributionView5.requestLayout();
        } else {
            s.m("attributionView");
            throw null;
        }
    }

    @Override // com.mapbox.maps.plugin.ViewPlugin
    public View bind(FrameLayout mapView, AttributeSet attrs, float pixelRatio) {
        mapView.getClass();
        AttributionAttributeParser attributionAttributeParser = AttributionAttributeParser.INSTANCE;
        Context context = mapView.getContext();
        context.getClass();
        setInternalSettings(attributionAttributeParser.parseAttributionSettings(context, attrs, pixelRatio));
        Context context2 = mapView.getContext();
        context2.getClass();
        this.dialogManager = new AttributionDialogManagerImpl(context2);
        l<Context, AttributionViewImpl> lVar = this.viewImplProvider;
        Context context3 = mapView.getContext();
        context3.getClass();
        return lVar.invoke(context3);
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void cleanup() {
        AttributionPlugin.DefaultImpls.cleanup(this);
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsBase
    public AttributionSettings getInternalSettings() {
        return this.internalSettings;
    }

    @Override // com.mapbox.maps.plugin.attribution.AttributionPlugin
    public MapAttributionDelegate getMapAttributionDelegate() {
        MapAttributionDelegate mapAttributionDelegate = this.mapAttributionDelegate;
        if (mapAttributionDelegate != null) {
            return mapAttributionDelegate;
        }
        s.m("mapAttributionDelegate");
        throw null;
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void initialize() {
        applySettings();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v14) {
        if (getInternalSettings().getClickable()) {
            AttributionDialogManager attributionDialogManager = this.dialogManager;
            if (attributionDialogManager == null) {
                s.m("dialogManager");
                throw null;
            }
            MapAttributionDelegate mapAttributionDelegate = this.mapAttributionDelegate;
            if (mapAttributionDelegate != null) {
                attributionDialogManager.showAttribution(mapAttributionDelegate);
            } else {
                s.m("mapAttributionDelegate");
                throw null;
            }
        }
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void onDelegateProvider(MapDelegateProvider delegateProvider) {
        delegateProvider.getClass();
        this.mapAttributionDelegate = delegateProvider.getMapAttributionDelegate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mapbox.maps.plugin.ViewPlugin
    public void onPluginView(View view2) {
        view2.getClass();
        AttributionView attributionView = view2 instanceof AttributionView ? (AttributionView) view2 : null;
        if (attributionView == null) {
            h.s("The provided view needs to implement AttributionView");
        } else {
            this.attributionView = attributionView;
            attributionView.setViewOnClickListener(this);
        }
    }

    @Override // com.mapbox.maps.plugin.LifecyclePlugin
    public void onStart() {
        AttributionPlugin.DefaultImpls.onStart(this);
    }

    @Override // com.mapbox.maps.plugin.LifecyclePlugin
    public void onStop() {
        AttributionDialogManager attributionDialogManager = this.dialogManager;
        if (attributionDialogManager != null) {
            attributionDialogManager.onStop();
        } else {
            s.m("dialogManager");
            throw null;
        }
    }

    @Override // com.mapbox.maps.plugin.attribution.AttributionPlugin
    public void setContentDescription(CharSequence contentDescription) {
        AttributionView attributionView = this.attributionView;
        if (attributionView != null) {
            if (attributionView != null) {
                attributionView.setContentDescription(contentDescription);
            } else {
                s.m("attributionView");
                throw null;
            }
        }
    }

    @Override // com.mapbox.maps.plugin.attribution.AttributionPlugin
    public void setCustomAttributionDialogManager(AttributionDialogManager dialogManager) {
        dialogManager.getClass();
        this.dialogManager = dialogManager;
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsBase
    public void setInternalSettings(AttributionSettings attributionSettings) {
        attributionSettings.getClass();
        this.internalSettings = attributionSettings;
    }

    public /* synthetic */ AttributionPluginImpl(l lVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? AnonymousClass1.INSTANCE : lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttributionPluginImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
