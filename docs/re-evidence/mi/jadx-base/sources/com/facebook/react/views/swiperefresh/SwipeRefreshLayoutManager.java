package com.facebook.react.views.swiperefresh;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.e4f;
import defpackage.g9p;
import defpackage.ibk;
import defpackage.iej;
import defpackage.ndj;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = SwipeRefreshLayoutManager.REACT_CLASS)
public class SwipeRefreshLayoutManager extends ViewGroupManager<ReactSwipeRefreshLayout> {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";

    public class a implements SwipeRefreshLayout.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g9p f7556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReactSwipeRefreshLayout f7557b;

        public a(g9p g9pVar, ReactSwipeRefreshLayout reactSwipeRefreshLayout) {
            this.f7556a = g9pVar;
            this.f7557b = reactSwipeRefreshLayout;
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void onRefresh() {
            ((UIManagerModule) this.f7556a.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new ibk(this.f7557b.getId()));
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return e4f.a().b("topRefresh", e4f.d("registrationName", "onRefresh")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return e4f.d("SIZE", e4f.e("DEFAULT", 1, "LARGE", 0));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @iej(customType = "ColorArray", name = "colors")
    public void setColors(ReactSwipeRefreshLayout reactSwipeRefreshLayout, ReadableArray readableArray) {
        if (readableArray == null) {
            reactSwipeRefreshLayout.setColorSchemeColors(new int[0]);
            return;
        }
        int[] iArr = new int[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            iArr[i] = readableArray.getInt(i);
        }
        reactSwipeRefreshLayout.setColorSchemeColors(iArr);
    }

    @iej(defaultBoolean = true, name = "enabled")
    public void setEnabled(ReactSwipeRefreshLayout reactSwipeRefreshLayout, boolean z) {
        reactSwipeRefreshLayout.setEnabled(z);
    }

    @iej(customType = "Color", defaultInt = 0, name = "progressBackgroundColor")
    public void setProgressBackgroundColor(ReactSwipeRefreshLayout reactSwipeRefreshLayout, int i) {
        reactSwipeRefreshLayout.setProgressBackgroundColorSchemeColor(i);
    }

    @iej(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(ReactSwipeRefreshLayout reactSwipeRefreshLayout, float f) {
        reactSwipeRefreshLayout.setProgressViewOffset(f);
    }

    @iej(name = "refreshing")
    public void setRefreshing(ReactSwipeRefreshLayout reactSwipeRefreshLayout, boolean z) {
        reactSwipeRefreshLayout.setRefreshing(z);
    }

    @iej(name = MediaStoreUtil.MediaInfo.SIZE)
    public void setSize(ReactSwipeRefreshLayout reactSwipeRefreshLayout, Dynamic dynamic) {
        if (dynamic.isNull()) {
            reactSwipeRefreshLayout.setSize(1);
            return;
        }
        if (dynamic.getType() == ReadableType.Number) {
            reactSwipeRefreshLayout.setSize(dynamic.asInt());
            return;
        }
        if (dynamic.getType() != ReadableType.String) {
            throw new IllegalArgumentException("Size must be 'default' or 'large'");
        }
        String strAsString = dynamic.asString();
        if (strAsString.equals("default")) {
            reactSwipeRefreshLayout.setSize(1);
        } else {
            if (strAsString.equals("large")) {
                reactSwipeRefreshLayout.setSize(0);
                return;
            }
            throw new IllegalArgumentException("Size must be 'default' or 'large', received: " + strAsString);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(g9p g9pVar, ReactSwipeRefreshLayout reactSwipeRefreshLayout) {
        reactSwipeRefreshLayout.setOnRefreshListener(new a(g9pVar, reactSwipeRefreshLayout));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactSwipeRefreshLayout createViewInstance(g9p g9pVar) {
        return new ReactSwipeRefreshLayout(g9pVar);
    }
}
