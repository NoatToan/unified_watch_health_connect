package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.views.view.ReactViewManager;
import com.miui.tsmclient.net.TSMAuthContants;
import defpackage.a9l;
import defpackage.cbe;
import defpackage.g9p;
import defpackage.iej;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes6.dex */
public class SafeAreaViewManager extends ReactViewManager {
    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCSafeAreaView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends cbe> getShadowNodeClass() {
        return a9l.class;
    }

    @iej(name = "edges")
    public void setEdges(SafeAreaView safeAreaView, ReadableArray readableArray) {
        EnumSet<SafeAreaViewEdges> enumSetNoneOf = EnumSet.noneOf(SafeAreaViewEdges.class);
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                String string = readableArray.getString(i);
                if ("top".equals(string)) {
                    enumSetNoneOf.add(SafeAreaViewEdges.TOP);
                } else if (TSMAuthContants.PARAM_KEY_RIGHT.equals(string)) {
                    enumSetNoneOf.add(SafeAreaViewEdges.RIGHT);
                } else if ("bottom".equals(string)) {
                    enumSetNoneOf.add(SafeAreaViewEdges.BOTTOM);
                } else if ("left".equals(string)) {
                    enumSetNoneOf.add(SafeAreaViewEdges.LEFT);
                }
            }
        }
        safeAreaView.setEdges(enumSetNoneOf);
    }

    @iej(name = "mode")
    public void setMode(SafeAreaView safeAreaView, String str) {
        if ("padding".equals(str)) {
            safeAreaView.setMode(SafeAreaViewMode.PADDING);
        } else if ("margin".equals(str)) {
            safeAreaView.setMode(SafeAreaViewMode.MARGIN);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public a9l createShadowNodeInstance() {
        return new a9l();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public SafeAreaView createViewInstance(g9p g9pVar) {
        return new SafeAreaView(g9pVar);
    }
}
