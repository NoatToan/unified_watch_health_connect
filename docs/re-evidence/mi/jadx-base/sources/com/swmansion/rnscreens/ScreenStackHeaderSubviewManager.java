package com.swmansion.rnscreens;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import com.miui.tsmclient.net.TSMAuthContants;
import defpackage.cbe;
import defpackage.g9p;
import defpackage.iej;
import defpackage.ndj;

/* JADX INFO: loaded from: classes6.dex */
@ndj(name = ScreenStackHeaderSubviewManager.REACT_CLASS)
public class ScreenStackHeaderSubviewManager extends ReactViewManager {
    protected static final String REACT_CLASS = "RNSScreenStackHeaderSubview";

    public static class b extends cbe {
        public b() {
        }

        @Override // defpackage.pej, defpackage.oej
        public void setLocalData(Object obj) {
            ScreenStackHeaderSubview.a aVar = (ScreenStackHeaderSubview.a) obj;
            setStyleWidth(aVar.f10682a);
            setStyleHeight(aVar.f10683b);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @iej(name = "type")
    public void setType(ScreenStackHeaderSubview screenStackHeaderSubview, String str) {
        if ("left".equals(str)) {
            screenStackHeaderSubview.setType(ScreenStackHeaderSubview.Type.LEFT);
            return;
        }
        if ("center".equals(str)) {
            screenStackHeaderSubview.setType(ScreenStackHeaderSubview.Type.CENTER);
        } else if ("title".equals(str)) {
            screenStackHeaderSubview.setType(ScreenStackHeaderSubview.Type.TITLE);
        } else if (TSMAuthContants.PARAM_KEY_RIGHT.equals(str)) {
            screenStackHeaderSubview.setType(ScreenStackHeaderSubview.Type.RIGHT);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public cbe createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return new b();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public ReactViewGroup createViewInstance(g9p g9pVar) {
        return new ScreenStackHeaderSubview(g9pVar);
    }
}
