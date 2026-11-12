package com.huawei.health.h5pro.webkit;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.media3.common.MimeTypes;
import com.bumptech.glide.Glide;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.webkit.trustlist.H5ProTrustListChecker;
import com.huawei.hms.network.base.common.trans.FileBinary;
import com.huawei.openalliance.ad.constant.MetaCreativeType;
import com.huawei.openalliance.ad.constant.MimeType;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes7.dex */
public class ResourceUtil {
    public static boolean d(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("h5proresource://");
    }

    public static boolean d(WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        String str = string.split("\\?")[0];
        return !string.contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE) && string.startsWith("http") && (str.endsWith("png") || str.endsWith("jpg") || str.endsWith("webp") || str.endsWith(MetaCreativeType.GIF)) && webResourceRequest.getMethod().equals("GET") && !string.contains("h5.health.huawei.com/h5pro/com.huawei.health.h5");
    }

    public static boolean b(WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        return !TextUtils.isEmpty(string) && string.contains("needCache=true");
    }

    public static boolean e(WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        return !TextUtils.isEmpty(string) && string.contains("needProxy=false");
    }

    private static String h(String str) {
        String str2 = str.split("\\?")[0];
        if (str2.endsWith("png")) {
            return "image/png";
        }
        if (str2.endsWith("jpg")) {
            return MimeType.JPG;
        }
        if (str2.endsWith("webp")) {
            return MimeTypes.IMAGE_WEBP;
        }
        return "";
    }

    public static WebResourceResponse c(WebResourceRequest webResourceRequest) {
        return c(webResourceRequest, "");
    }

    public static WebResourceResponse c(WebResourceRequest webResourceRequest, String str) {
        String string = webResourceRequest.getUrl().toString();
        try {
            URL url = new URL(string);
            if (TextUtils.isEmpty(str)) {
                str = h(string);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(6000);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            WebResourceResponse webResourceResponse = new WebResourceResponse(str, "UTF-8", httpURLConnection.getInputStream());
            HashMap map = new HashMap();
            map.put("Access-Control-Allow-Origin", "*");
            webResourceResponse.setResponseHeaders(map);
            return webResourceResponse;
        } catch (IOException e) {
            LogUtil.e("H5PRO_ResourceUtil", "native get fail:", e.getMessage());
            return null;
        }
    }

    static boolean e(String str) {
        return GeneralUtil.isSafePath(str) && str.startsWith(ResourceType.FONTS.urlPrefix);
    }

    static boolean a(String str) {
        return GeneralUtil.isSafePath(str) && str.startsWith(ResourceType.VIDEO.urlPrefix);
    }

    static boolean c(String str) {
        return GeneralUtil.isSafePath(str) && str.startsWith(ResourceType.IMAGE.urlPrefix);
    }

    static boolean b(String str) {
        return GeneralUtil.isSafePath(str) && str.startsWith(ResourceType.AUDIO.urlPrefix);
    }

    public static WebResourceResponse e(H5ProAppInfo h5ProAppInfo, String str, String str2, Context context) {
        if (!H5ProTrustListChecker.isTrusted(h5ProAppInfo, str)) {
            return null;
        }
        if (e(str2)) {
            return b(str2, ResourceType.FONTS, context);
        }
        if (a(str2)) {
            return b(str2, ResourceType.VIDEO, context);
        }
        if (c(str2)) {
            return b(str2, ResourceType.IMAGE, context);
        }
        if (b(str2)) {
            return b(str2, ResourceType.AUDIO, context);
        }
        return null;
    }

    private static WebResourceResponse b(String str, ResourceType resourceType, Context context) {
        InputStream fileInputStream;
        if (TextUtils.isEmpty(str)) {
            LogUtil.w("H5PRO_ResourceUtil", "getWebResourceResponse: url is empty");
            return null;
        }
        String strReplace = str.replace(resourceType.urlPrefix, "");
        if (!GeneralUtil.isSafePath(strReplace)) {
            LogUtil.w("H5PRO_ResourceUtil", "getWebResourceResponse: invalid path");
            return null;
        }
        if (resourceType == ResourceType.FONTS) {
            strReplace = j(strReplace);
        }
        if (strReplace.contains("#")) {
            strReplace = strReplace.replace("#", "%23");
        }
        String mimeType = GeneralUtil.getMimeType(strReplace);
        if (TextUtils.isEmpty(mimeType)) {
            mimeType = resourceType.defMimeType;
        }
        try {
            if (strReplace.startsWith("content://")) {
                fileInputStream = context.getContentResolver().openInputStream(Uri.parse(strReplace));
            } else {
                fileInputStream = new FileInputStream(strReplace);
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(mimeType, "UTF-8", fileInputStream);
            HashMap map = new HashMap();
            map.put("Cache-Control", "no-cache");
            map.put("Access-Control-Allow-Origin", "*");
            webResourceResponse.setResponseHeaders(map);
            return webResourceResponse;
        } catch (FileNotFoundException e) {
            LogUtil.w("H5PRO_ResourceUtil", "getWebResourceResponse: " + e.getMessage());
            return null;
        }
    }

    private static String j(String str) {
        File[] fileArrListFiles;
        File file = new File("/system/fonts");
        if (TextUtils.isEmpty(str) || !file.exists() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return "";
        }
        for (File file2 : fileArrListFiles) {
            if (file2 != null && str.equalsIgnoreCase(file2.getName())) {
                return file2.getAbsolutePath();
            }
        }
        return "";
    }

    enum ResourceType {
        IMAGE("image", "image/png"),
        VIDEO("video", "video/mp4"),
        AUDIO("audio", MimeTypes.AUDIO_MPEG),
        FONTS("fonts", FileBinary.HEAD_VALUE_CONTENT_TYPE_OCTET_STREAM);

        private final String defMimeType;
        private final String urlPrefix;

        ResourceType(String str, String str2) {
            this.urlPrefix = "h5proresource://" + str + File.separator;
            this.defMimeType = str2;
        }
    }

    public static WebResourceResponse d(String str, WebView webView) {
        try {
            WebResourceResponse webResourceResponse = new WebResourceResponse(h(str), "UTF-8", new FileInputStream(Glide.with(webView).asFile().load(str).submit().get()));
            HashMap map = new HashMap();
            map.put("Access-Control-Allow-Origin", "*");
            webResourceResponse.setResponseHeaders(map);
            return webResourceResponse;
        } catch (FileNotFoundException e) {
            LogUtil.e("H5PRO_ResourceUtil", "loadImage: FileNotFoundException->" + e.getMessage());
            return null;
        } catch (InterruptedException e2) {
            LogUtil.e("H5PRO_ResourceUtil", "loadImage: InterruptedException->" + e2.getMessage());
            return null;
        } catch (ExecutionException e3) {
            LogUtil.e("H5PRO_ResourceUtil", "loadImage: ExecutionException->" + e3.getMessage());
            return null;
        }
    }
}
