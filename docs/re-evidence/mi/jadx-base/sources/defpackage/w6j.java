package defpackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.reactnativecommunity.viewpager.ReactViewPagerManager;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class w6j implements cej {
    @Override // defpackage.cej
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // defpackage.cej
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new ReactViewPagerManager());
    }
}
