package defpackage;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.dylanvann.fastimage.b;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes4.dex */
public class da9 implements pok<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15301a;

    public da9(String str) {
        this.f15301a = str;
    }

    public static WritableMap c(Drawable drawable) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", drawable.getIntrinsicWidth());
        writableNativeMap.putInt("height", drawable.getIntrinsicHeight());
        return writableNativeMap;
    }

    @Override // defpackage.pok
    public boolean a(GlideException glideException, Object obj, e0p<Drawable> e0pVar, boolean z) {
        ba9.c(this.f15301a);
        if (!(e0pVar instanceof b6d)) {
            return false;
        }
        b bVar = (b) ((b6d) e0pVar).i();
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((g9p) bVar.getContext()).getJSModule(RCTEventEmitter.class);
        int id = bVar.getId();
        rCTEventEmitter.receiveEvent(id, "onFastImageError", new WritableNativeMap());
        rCTEventEmitter.receiveEvent(id, "onFastImageLoadEnd", new WritableNativeMap());
        return false;
    }

    @Override // defpackage.pok
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Drawable drawable, Object obj, e0p<Drawable> e0pVar, DataSource dataSource, boolean z) {
        if (!(e0pVar instanceof b6d)) {
            return false;
        }
        b bVar = (b) ((b6d) e0pVar).i();
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((g9p) bVar.getContext()).getJSModule(RCTEventEmitter.class);
        int id = bVar.getId();
        rCTEventEmitter.receiveEvent(id, "onFastImageLoad", c(drawable));
        rCTEventEmitter.receiveEvent(id, "onFastImageLoadEnd", new WritableNativeMap());
        return false;
    }
}
