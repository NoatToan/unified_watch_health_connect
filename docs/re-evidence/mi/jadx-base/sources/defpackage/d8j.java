package defpackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class d8j implements cej {
    @Override // defpackage.cej
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNGestureHandlerModule(reactApplicationContext));
    }

    @Override // defpackage.cej
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNGestureHandlerRootViewManager(), new RNGestureHandlerButtonViewManager());
    }
}
