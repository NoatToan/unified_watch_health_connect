package ohos.ace.plugin.webviewplugin.androidasset;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes46.dex */
public class AndroidAssetPlugin {
    private static final String ANDROID_VIRTUAL_ASSET_PREFIX = "file:///android_asset/";
    private static final String LOG_TAG = "AndroidAssetPlugin";
    private final Context context;

    protected final native void nativeInit();

    public AndroidAssetPlugin(Context context) {
        this.context = context;
        nativeInit();
    }

    public boolean existsVirtualAsset(String str) {
        if (!str.startsWith(ANDROID_VIRTUAL_ASSET_PREFIX)) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.context.getAssets().open(str.substring(22));
            if (inputStreamOpen == null) {
                return true;
            }
            inputStreamOpen.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
