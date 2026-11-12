package com.mapbox.maps.plugin.logo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.logo.generated.LogoAttributeParser;
import com.mapbox.maps.plugin.logo.generated.LogoSettings;
import com.mapbox.maps.plugin.logo.generated.LogoSettingsBase;
import com.mapbox.maps.plugin.logo.generated.LogoSettingsKt;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010*\u001a\u00020$2\u0006\u0010%\u001a\u00020$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/mapbox/maps/plugin/logo/LogoViewPlugin;", "Lcom/mapbox/maps/plugin/logo/LogoPlugin;", "Lcom/mapbox/maps/plugin/logo/generated/LogoSettingsBase;", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcom/mapbox/maps/plugin/logo/LogoViewImpl;", "viewImplProvider", "<init>", "(Le23/l;)V", "", "applySettings", "()V", "Landroid/widget/FrameLayout;", "mapView", "Landroid/util/AttributeSet;", "attrs", "", "pixelRatio", "Landroid/view/View;", "bind", "(Landroid/widget/FrameLayout;Landroid/util/AttributeSet;F)Landroid/view/View;", "initialize", "view", "onPluginView", "(Landroid/view/View;)V", "Le23/l;", "Lcom/mapbox/maps/plugin/logo/LogoView;", "logoView", "Lcom/mapbox/maps/plugin/logo/LogoView;", "Lcom/mapbox/maps/plugin/logo/generated/LogoSettings;", "internalSettings", "Lcom/mapbox/maps/plugin/logo/generated/LogoSettings;", "getInternalSettings", "()Lcom/mapbox/maps/plugin/logo/generated/LogoSettings;", "setInternalSettings", "(Lcom/mapbox/maps/plugin/logo/generated/LogoSettings;)V", "", "value", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "plugin-logo_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LogoViewPlugin extends LogoSettingsBase implements LogoPlugin {
    private LogoSettings internalSettings;
    private LogoView logoView;
    private final l<Context, LogoViewImpl> viewImplProvider;

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.logo.LogoViewPlugin$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/plugin/logo/LogoViewImpl;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<Context, LogoViewImpl> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public final LogoViewImpl invoke(Context context) {
            context.getClass();
            return new LogoViewImpl(context);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LogoViewPlugin(l<? super Context, LogoViewImpl> lVar) {
        lVar.getClass();
        this.viewImplProvider = lVar;
        this.internalSettings = LogoSettingsKt.LogoSettings(LogoViewPlugin$internalSettings$1.INSTANCE);
    }

    @Override // com.mapbox.maps.plugin.logo.generated.LogoSettingsBase
    public void applySettings() {
        LogoView logoView = this.logoView;
        if (logoView == null) {
            s.m("logoView");
            throw null;
        }
        logoView.setLogoMargins((int) getInternalSettings().getMarginLeft(), (int) getInternalSettings().getMarginTop(), (int) getInternalSettings().getMarginRight(), (int) getInternalSettings().getMarginBottom());
        LogoView logoView2 = this.logoView;
        if (logoView2 == null) {
            s.m("logoView");
            throw null;
        }
        logoView2.setLogoGravity(getInternalSettings().getPosition());
        LogoView logoView3 = this.logoView;
        if (logoView3 == null) {
            s.m("logoView");
            throw null;
        }
        logoView3.setLogoEnabled(getInternalSettings().getEnabled());
        LogoView logoView4 = this.logoView;
        if (logoView4 != null) {
            logoView4.requestLayout();
        } else {
            s.m("logoView");
            throw null;
        }
    }

    @Override // com.mapbox.maps.plugin.ViewPlugin
    public View bind(FrameLayout mapView, AttributeSet attrs, float pixelRatio) {
        mapView.getClass();
        LogoAttributeParser logoAttributeParser = LogoAttributeParser.INSTANCE;
        Context context = mapView.getContext();
        context.getClass();
        setInternalSettings(logoAttributeParser.parseLogoSettings(context, attrs, pixelRatio));
        l<Context, LogoViewImpl> lVar = this.viewImplProvider;
        Context context2 = mapView.getContext();
        context2.getClass();
        LogoViewImpl logoViewImplInvoke = lVar.invoke(context2);
        logoViewImplInvoke.injectPresenter$plugin_logo_release(this);
        return logoViewImplInvoke;
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void cleanup() {
        LogoPlugin.DefaultImpls.cleanup(this);
    }

    @Override // com.mapbox.maps.plugin.logo.generated.LogoSettingsBase, com.mapbox.maps.plugin.logo.generated.LogoSettingsInterface
    public boolean getEnabled() {
        return getInternalSettings().getEnabled();
    }

    @Override // com.mapbox.maps.plugin.logo.generated.LogoSettingsBase
    public LogoSettings getInternalSettings() {
        return this.internalSettings;
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void initialize() {
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void onDelegateProvider(MapDelegateProvider mapDelegateProvider) {
        LogoPlugin.DefaultImpls.onDelegateProvider(this, mapDelegateProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mapbox.maps.plugin.ViewPlugin
    public void onPluginView(View view2) {
        view2.getClass();
        LogoView logoView = view2 instanceof LogoView ? (LogoView) view2 : null;
        if (logoView != null) {
            this.logoView = logoView;
        } else {
            h.s("The provided view needs to implement LogoContract.LogoView");
        }
    }

    @Override // com.mapbox.maps.plugin.logo.generated.LogoSettingsBase, com.mapbox.maps.plugin.logo.generated.LogoSettingsInterface
    public void setEnabled(boolean z14) {
        if (getInternalSettings().getEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setEnabled(z14).build());
            applySettings();
            LogoView logoView = this.logoView;
            if (logoView != null) {
                logoView.setLogoEnabled(z14);
            } else {
                s.m("logoView");
                throw null;
            }
        }
    }

    @Override // com.mapbox.maps.plugin.logo.generated.LogoSettingsBase
    public void setInternalSettings(LogoSettings logoSettings) {
        logoSettings.getClass();
        this.internalSettings = logoSettings;
    }

    public /* synthetic */ LogoViewPlugin(l lVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? AnonymousClass1.INSTANCE : lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LogoViewPlugin() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
