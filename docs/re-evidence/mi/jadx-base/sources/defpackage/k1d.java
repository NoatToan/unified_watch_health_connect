package defpackage;

import com.facebook.react.bridge.WritableMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface k1d {
    String getAssetsBuiltInBundleJsonPath();

    WritableMap getBizInjectJSGlobalMap(String str);

    String getBundleFileName(String str);

    String getCommonModuleName();

    String getJSMainModulePath();

    List<String> getPreLoadBundle();

    List<cej> getReactPackages();

    boolean isEnableRN();

    boolean isSingleFullBundle();
}
