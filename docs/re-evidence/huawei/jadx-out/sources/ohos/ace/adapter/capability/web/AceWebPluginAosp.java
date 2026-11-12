package ohos.ace.adapter.capability.web;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import ohos.ace.adapter.ALog;

/* JADX INFO: loaded from: classes20.dex */
public class AceWebPluginAosp extends AceWebPluginBase {
    private static final String ANDROID_VIRTUAL_ASSET_PREFIX = "file:///android_asset/";
    private static final String ARKUIX_PATH_MARKER = "files/arkui-x/";
    private static final String HTTP = "http://";
    private static final String HTTPS = "https://";
    private static final String INCOGNITO_MODE = "incognitoMode";
    private static final long INVALID_CREATE_ID = -1;
    private static final String LOG_TAG = "AceWebPluginAosp";
    private static final String RESOURCE_TYPE = "web";
    private static final String RICH_TEXT_INIT = "richTextInit";
    private static final String WEBVIEW_HEIGHT = "height";
    private static final String WEBVIEW_LEFT = "left";
    private static final String WEBVIEW_PAGE_URL = "pageUrl";
    private static final String WEBVIEW_SRC = "src";
    private static final String WEBVIEW_TOP = "top";
    private static final String WEBVIEW_WIDTH = "width";
    private AceWeb aceWeb;
    private Context context;
    private WebDataBaseManager dataBase;
    private final AtomicLong nextMapid = new AtomicLong(0);
    private final View rootView;

    private AceWebPluginAosp(Context context, View view) {
        this.context = context;
        this.rootView = view;
        this.dataBase = WebDataBaseManager.getInstance(context);
    }

    @Override // ohos.ace.adapter.capability.web.AceWebPluginBase
    public long getAtomicId() {
        return this.nextMapid.getAndIncrement();
    }

    public static AceWebPluginAosp createRegister(Context context, View view) {
        return new AceWebPluginAosp(context, view);
    }

    @Override // ohos.ace.adapter.capability.web.AceWebPluginBase, ohos.ace.adapter.AceResourcePlugin
    public long create(Map<String, String> map) {
        if (map.isEmpty() || !map.containsKey("web")) {
            ALog.e(LOG_TAG, "Params doesn't contain web");
            return -1L;
        }
        try {
            long j = Long.parseLong(map.get("web"));
            String str = map.get(WEBVIEW_SRC);
            String str2 = map.get(WEBVIEW_PAGE_URL);
            this.aceWeb = new AceWeb(j, this.context, this.rootView, getEventCallback());
            String str3 = map.get(INCOGNITO_MODE);
            boolean z = true;
            if (Integer.parseInt(map.get(RICH_TEXT_INIT)) != 1) {
                z = false;
            }
            addResource(j, this.aceWeb, z);
            this.aceWeb.initWeb();
            this.aceWeb.setIncognitoMode(String.valueOf(str3));
            this.aceWeb.setPageUrl(str2);
            this.aceWeb.loadUrl(toAndroidAssetUrl(str));
            int physicalPixels = toPhysicalPixels(Double.parseDouble(map.get("width")));
            int physicalPixels2 = toPhysicalPixels(Double.parseDouble(map.get("height")));
            int physicalPixels3 = toPhysicalPixels(Double.parseDouble(map.get("top")));
            int physicalPixels4 = toPhysicalPixels(Double.parseDouble(map.get("left")));
            validateVirtualDisplayDimensions(physicalPixels, physicalPixels2);
            float f = physicalPixels;
            float f2 = physicalPixels2;
            float f3 = physicalPixels4;
            float f4 = physicalPixels3;
            FrameLayout.LayoutParams layoutParamsBuildLayoutParams = this.aceWeb.buildLayoutParams(f, f2, f3, f4);
            this.aceWeb.setWebLayout(f, f2, f3, f4);
            this.aceWeb.addWebToSurface(layoutParamsBuildLayoutParams);
            addResourceStatic(z);
            return j;
        } catch (NumberFormatException unused) {
            ALog.e(LOG_TAG, "NumberFormatException");
            return -1L;
        }
    }

    private void validateVirtualDisplayDimensions(int i, int i2) {
        DisplayMetrics displayMetrics = this.context.getResources().getDisplayMetrics();
        if (i > displayMetrics.widthPixels || i2 > displayMetrics.heightPixels) {
            ALog.w(LOG_TAG, "Creating the webview size: [" + i + ", " + i2 + "] may result in problemsIt is larger than the device screen size: [" + displayMetrics.widthPixels + ", " + displayMetrics.heightPixels + "].");
        }
        ALog.w(LOG_TAG, "Creating a webview size is less than the the device screen size");
    }

    public void setWebDebuggingAccess(boolean z) {
        this.aceWeb.setWebDebuggingAccess(z);
    }

    private int toPhysicalPixels(double d) {
        return (int) Math.round(d * ((double) 1.0f));
    }

    private String toAndroidAssetUrl(String str) {
        int iIndexOf;
        if (str != null && !str.startsWith("http://") && !str.startsWith("https://") && (iIndexOf = str.indexOf(ARKUIX_PATH_MARKER)) != -1) {
            String str2 = ANDROID_VIRTUAL_ASSET_PREFIX + str.substring(iIndexOf + 6);
            if (existsVirtualAsset(str2)) {
                return str2;
            }
        }
        return str;
    }

    private boolean existsVirtualAsset(String str) {
        if (str == null || !str.startsWith(ANDROID_VIRTUAL_ASSET_PREFIX)) {
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

    public boolean existHttpAuthCredentials() {
        return this.dataBase.existHttpAuthCredentials();
    }

    public void deleteHttpAuthCredentials() {
        this.dataBase.deleteAllAuthCredentials();
    }

    public void saveHttpAuthCredentials(String str, String str2, String str3, String str4) {
        this.dataBase.saveHttpAuthCredential(str, str2, str3, str4);
    }

    public Object getHttpAuthCredentials(String str, String str2) {
        return this.dataBase.getHttpAuthCredential(str, str2);
    }

    public boolean getZoomAccess() {
        AceWeb aceWeb = this.aceWeb;
        if (aceWeb != null) {
            return aceWeb.getZoomAccess();
        }
        return true;
    }
}
