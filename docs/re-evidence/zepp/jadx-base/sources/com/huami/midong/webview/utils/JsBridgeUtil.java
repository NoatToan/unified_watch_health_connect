package com.huami.midong.webview.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.webkit.WebView;
import com.huami.midong.webview.event.JsNavigateEvent;
import com.huami.watch.ota.UpdateUtils;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes11.dex */
public class JsBridgeUtil {
    public static final String CALLBACK_ID_FORMAT = "JAVA_CB_%s";
    private static final String EMPTY_STR = "";
    private static final String HM_FETCH_QUEUE = "hm://return/_fetchQueue/";
    public static final String HM_OVERRIDE_SCHEMA = "hm://";
    public static final String HM_RETURN_DATA = "hm://return/";
    private static final String INVOKE_JS_PREFLIX = "javascript:HM_JsBridge.";
    public static final String JAVASCRIPT_STR = "javascript:";
    public static final String JS_FETCH_QUEUE_FROM_JAVA = "javascript:HM_JsBridge._fetchQueue();";
    public static final String JS_HANDLE_MESSAGE_FROM_JAVA = "javascript:HM_JsBridge._handleMessageFromNative('%s');";
    private static final String SPLIT_MARK = "/";
    private static final String TAG = "JsBridgeUtil";
    public static final String UNDERLINE_STR = "_";

    /* JADX WARN: Code duplicated, block: B:44:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String assetFile2Str(Context context, String str) throws Throwable {
        InputStream inputStreamOpen;
        String line;
        InputStream inputStream = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
                    StringBuilder sb = new StringBuilder();
                    do {
                        line = bufferedReader.readLine();
                        if (line != null && !line.matches("^\\s*\\/\\/.*")) {
                            sb.append(line);
                        }
                    } while (line != null);
                    bufferedReader.close();
                    inputStreamOpen.close();
                    String string = sb.toString();
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return string;
                } catch (Exception e2) {
                    e = e2;
                    Log.e(TAG, e.getMessage(), e, new Object[0]);
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpen;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            inputStreamOpen = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static String getCleanUrl(String str) {
        return (TextUtils.isEmpty(str) || !str.contains(UpdateUtils.CMD_FILTER)) ? str : str.split(UpdateUtils.CMD_FILTER)[0];
    }

    public static String getDataFromReturnUrl(String str) {
        if (str.startsWith(HM_FETCH_QUEUE)) {
            return str.replace(HM_FETCH_QUEUE, "");
        }
        String[] strArrSplit = str.replace("hm://return/", "").split("/");
        if (strArrSplit.length < 2) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
        }
        return sb.toString();
    }

    public static String getFunctionFromReturnUrl(String str) {
        String[] strArrSplit = str.replace("hm://return/", "").split("/");
        if (strArrSplit.length >= 1) {
            return strArrSplit[0];
        }
        return null;
    }

    public static boolean isJsBridgeUrl(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("hm://");
    }

    public static boolean isPackageInstalled(String str, PackageManager packageManager) {
        try {
            packageManager.getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static String navigateTo(Context context, String str) {
        RxBus.get().post(new JsNavigateEvent(str));
        return "";
    }

    public static String parseFunctionName(String str) {
        return str.replace(INVOKE_JS_PREFLIX, "").replaceAll("\\(.*\\);", "");
    }

    private static void startActivity(Context context, Intent intent) {
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void webViewLoadJs(WebView webView, String str) {
        webView.loadUrl("javascript:" + (("var newscript = document.createElement(\"script\");newscript.src=\"" + str + "\";") + "document.scripts[0].parentNode.insertBefore(newscript,document.scripts[0]);"));
    }

    public static void webViewLoadLocalJs(WebView webView, String str) throws Throwable {
        webView.loadUrl("javascript:" + assetFile2Str(webView.getContext(), str));
    }
}
