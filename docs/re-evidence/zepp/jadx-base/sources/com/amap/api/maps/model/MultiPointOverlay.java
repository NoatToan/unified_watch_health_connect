package com.amap.api.maps.model;

import android.text.TextUtils;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MultiPointOverlay extends BaseOverlay {
    public IMultiPointOverlay a;
    private WeakReference<IGlOverlayLayer> glOverlayLayerRef;
    private MultiPointOverlayOptions options;

    public MultiPointOverlay(IMultiPointOverlay iMultiPointOverlay) {
        super("");
        this.a = iMultiPointOverlay;
    }

    private void a() {
        IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
        if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
            return;
        }
        iGlOverlayLayer.updateOption(this.overlayName, this.options);
    }

    public void destroy() {
        try {
            IMultiPointOverlay iMultiPointOverlay = this.a;
            if (iMultiPointOverlay != null) {
                iMultiPointOverlay.destroy(true);
                return;
            }
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.removeOverlay(this.overlayName);
            }
        } catch (Throwable unused) {
        }
    }

    public void remove() {
        try {
            IMultiPointOverlay iMultiPointOverlay = this.a;
            if (iMultiPointOverlay != null) {
                iMultiPointOverlay.remove(true);
                return;
            }
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.removeOverlay(this.overlayName);
            }
        } catch (Throwable unused) {
        }
    }

    public void setAnchor(float f, float f2) {
        IMultiPointOverlay iMultiPointOverlay = this.a;
        if (iMultiPointOverlay != null) {
            iMultiPointOverlay.setAnchor(f, f2);
            return;
        }
        MultiPointOverlayOptions multiPointOverlayOptions = this.options;
        if (multiPointOverlayOptions != null) {
            multiPointOverlayOptions.anchor(f, f2);
            a();
        }
    }

    public void setEnable(boolean z) {
        IMultiPointOverlay iMultiPointOverlay = this.a;
        if (iMultiPointOverlay != null) {
            iMultiPointOverlay.setVisible(z);
            return;
        }
        MultiPointOverlayOptions multiPointOverlayOptions = this.options;
        if (multiPointOverlayOptions != null) {
            multiPointOverlayOptions.setEnable(z);
            a();
        }
    }

    public void setItems(List<MultiPointItem> list) {
        IMultiPointOverlay iMultiPointOverlay = this.a;
        if (iMultiPointOverlay != null) {
            iMultiPointOverlay.addItems(list);
            return;
        }
        MultiPointOverlayOptions multiPointOverlayOptions = this.options;
        if (multiPointOverlayOptions != null) {
            multiPointOverlayOptions.setMultiPointItems(list);
            a();
        }
    }

    public MultiPointOverlay(IGlOverlayLayer iGlOverlayLayer, MultiPointOverlayOptions multiPointOverlayOptions, String str) {
        super(str);
        this.glOverlayLayerRef = new WeakReference<>(iGlOverlayLayer);
        this.options = multiPointOverlayOptions;
    }
}
