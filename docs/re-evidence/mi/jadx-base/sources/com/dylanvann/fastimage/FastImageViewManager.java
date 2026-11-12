package com.dylanvann.fastimage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import defpackage.ba9;
import defpackage.ca9;
import defpackage.e0b;
import defpackage.e4f;
import defpackage.fa9;
import defpackage.g9p;
import defpackage.iej;
import defpackage.rok;
import defpackage.wqk;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
class FastImageViewManager extends SimpleViewManager<b> implements ca9 {
    static final String REACT_CLASS = "FastImageView";
    static final String REACT_ON_LOAD_START_EVENT = "onFastImageLoadStart";
    static final String REACT_ON_PROGRESS_EVENT = "onFastImageProgress";
    private static final Map<String, List<b>> VIEWS_FOR_URLS = new WeakHashMap();
    private rok requestManager = null;

    private static Activity getActivityFromContext(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof g9p)) {
            return null;
        }
        Context baseContext = ((g9p) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        if (!(baseContext instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext2 = ((ContextWrapper) baseContext).getBaseContext();
        if (baseContext2 instanceof Activity) {
            return (Activity) baseContext2;
        }
        return null;
    }

    private static boolean isActivityDestroyed(Activity activity) {
        return activity.isDestroyed() || activity.isFinishing();
    }

    private static boolean isValidContextForGlide(Context context) {
        Activity activityFromContext = getActivityFromContext(context);
        if (activityFromContext == null) {
            return false;
        }
        return !isActivityDestroyed(activityFromContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return e4f.a().b(REACT_ON_LOAD_START_EVENT, e4f.d("registrationName", REACT_ON_LOAD_START_EVENT)).b(REACT_ON_PROGRESS_EVENT, e4f.d("registrationName", REACT_ON_PROGRESS_EVENT)).b("onFastImageLoad", e4f.d("registrationName", "onFastImageLoad")).b("onFastImageError", e4f.d("registrationName", "onFastImageError")).b("onFastImageLoadEnd", e4f.d("registrationName", "onFastImageLoadEnd")).a();
    }

    public float getGranularityPercentage() {
        return 0.5f;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public void onProgress(String str, long j, long j2) {
        List<b> list = VIEWS_FOR_URLS.get(str);
        if (list != null) {
            for (b bVar : list) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putInt("loaded", (int) j);
                writableNativeMap.putInt(SportDataTypeKt.DIMEN_TOTAL, (int) j2);
                ((RCTEventEmitter) ((g9p) bVar.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(bVar.getId(), REACT_ON_PROGRESS_EVENT, writableNativeMap);
            }
        }
    }

    @iej(name = "defaultSource")
    public void setDefaultSource(b bVar, String str) {
        bVar.f(wqk.b().c(bVar.getContext(), str));
    }

    @iej(name = "resizeMode")
    public void setResizeMode(b bVar, String str) {
        bVar.setScaleType(fa9.f(str));
    }

    @iej(name = "source")
    public void setSource(b bVar, ReadableMap readableMap) {
        bVar.g(readableMap);
    }

    @iej(customType = "Color", name = "tintColor")
    public void setTintColor(b bVar, Integer num) {
        if (num == null) {
            bVar.clearColorFilter();
        } else {
            bVar.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(g9p g9pVar) {
        if (isValidContextForGlide(g9pVar)) {
            this.requestManager = com.bumptech.glide.a.u(g9pVar);
        }
        return new b(g9pVar);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(b bVar) {
        super.onAfterUpdateTransaction(bVar);
        bVar.e(this, this.requestManager, VIEWS_FOR_URLS);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(b bVar) {
        bVar.a(this.requestManager);
        e0b e0bVar = bVar.d;
        if (e0bVar != null) {
            String string = e0bVar.toString();
            ba9.c(string);
            Map<String, List<b>> map = VIEWS_FOR_URLS;
            List<b> list = map.get(string);
            if (list != null) {
                list.remove(bVar);
                if (list.size() == 0) {
                    map.remove(string);
                }
            }
        }
        super.onDropViewInstance(bVar);
    }
}
