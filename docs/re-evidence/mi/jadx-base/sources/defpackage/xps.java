package defpackage;

import com.amap.api.col.p0003sl.et;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.BaseOverlay;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class xps extends BaseOverlay {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public et f39342b;
    public WeakReference<IGlOverlayLayer> c;

    public xps(IGlOverlayLayer iGlOverlayLayer, et etVar, String str) {
        super(str);
        this.c = new WeakReference<>(iGlOverlayLayer);
        this.f39342b = etVar;
    }
}
