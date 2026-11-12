package com.swmansion.rnscreens;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.e4f;
import defpackage.g9p;
import defpackage.iej;
import defpackage.ndj;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@ndj(name = ScreenViewManager.REACT_CLASS)
public class ScreenViewManager extends ViewGroupManager<Screen> {
    protected static final String REACT_CLASS = "RNSScreen";

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return e4f.d("topDismissed", e4f.d("registrationName", "onDismissed"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @iej(defaultFloat = 0.0f, name = AppStateModule.APP_STATE_ACTIVE)
    public void setActive(Screen screen, float f) {
        screen.setActive(f != 0.0f);
    }

    @iej(name = "stackAnimation")
    public void setStackAnimation(Screen screen, String str) {
        if (str == null || "default".equals(str)) {
            screen.setStackAnimation(Screen.StackAnimation.DEFAULT);
        } else if ("none".equals(str)) {
            screen.setStackAnimation(Screen.StackAnimation.NONE);
        } else if ("fade".equals(str)) {
            screen.setStackAnimation(Screen.StackAnimation.FADE);
        }
    }

    @iej(name = "stackPresentation")
    public void setStackPresentation(Screen screen, String str) {
        if ("push".equals(str)) {
            screen.setStackPresentation(Screen.StackPresentation.PUSH);
            return;
        }
        if ("modal".equals(str) || "containedModal".equals(str)) {
            screen.setStackPresentation(Screen.StackPresentation.MODAL);
            return;
        }
        if ("transparentModal".equals(str) || "containedTransparentModal".equals(str)) {
            screen.setStackPresentation(Screen.StackPresentation.TRANSPARENT_MODAL);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Unknown presentation type " + str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Screen createViewInstance(g9p g9pVar) {
        return new Screen(g9pVar);
    }
}
