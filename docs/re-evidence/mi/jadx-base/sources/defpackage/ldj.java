package defpackage;

import com.facebook.react.a;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class ldj implements cej {
    public abstract List<NativeModule> a(ReactApplicationContext reactApplicationContext, a aVar);

    @Override // defpackage.cej
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        throw new RuntimeException("ReactInstancePackage must be passed in the ReactInstanceManager.");
    }
}
