package defpackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.uimanager.ViewManager;
import com.miot.rn.plugin.reactpackage.fixbug.statusbar.FixStatusBarModule;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class qw9 extends x1f {
    @Override // defpackage.x1f, defpackage.f4q, defpackage.cej
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return super.createViewManagers(reactApplicationContext);
    }

    @Override // defpackage.x1f, defpackage.f4q
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return StatusBarModule.NAME.equals(str) ? new FixStatusBarModule(reactApplicationContext) : super.getModule(str, reactApplicationContext);
    }
}
