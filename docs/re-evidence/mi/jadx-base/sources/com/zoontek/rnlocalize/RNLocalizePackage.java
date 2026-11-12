package com.zoontek.rnlocalize;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.zoontek.rnlocalize.RNLocalizePackage;
import defpackage.f4q;
import defpackage.odj;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/zoontek/rnlocalize/RNLocalizePackage;", "Lf4q;", "", "name", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lcom/facebook/react/bridge/NativeModule;", "getModule", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;", "Lodj;", "getReactModuleInfoProvider", "()Lodj;", "<init>", "()V", "react-native-localize_release"}, k = 1, mv = {2, 0, 0})
public final class RNLocalizePackage extends f4q {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map getReactModuleInfoProvider$lambda$0() {
        HashMap map = new HashMap();
        map.put(RNLocalizeModuleImpl.NAME, new ReactModuleInfo(RNLocalizeModuleImpl.NAME, RNLocalizeModuleImpl.NAME, false, false, true, false, false));
        return map;
    }

    @Override // defpackage.f4q
    @Nullable
    public NativeModule getModule(@NotNull String name, @NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Intrinsics.areEqual(name, RNLocalizeModuleImpl.NAME)) {
            return new RNLocalizeModule(reactContext);
        }
        return null;
    }

    @Override // defpackage.f4q
    @NotNull
    public odj getReactModuleInfoProvider() {
        return new odj() { // from class: t8j
            @Override // defpackage.odj
            public final Map a() {
                return RNLocalizePackage.getReactModuleInfoProvider$lambda$0();
            }
        };
    }
}
