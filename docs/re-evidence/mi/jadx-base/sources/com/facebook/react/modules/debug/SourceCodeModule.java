package com.facebook.react.modules.debug;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactContext;
import defpackage.ndj;
import defpackage.sk1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = SourceCodeModule.NAME)
public class SourceCodeModule extends BaseJavaModule {
    public static final String NAME = "SourceCode";
    private final ReactContext mReactContext;

    public SourceCodeModule(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("scriptURL", (String) sk1.d(this.mReactContext.getCatalystInstance().getSourceURL(), "No source URL loaded, have you initialised the instance?"));
        return map;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }
}
