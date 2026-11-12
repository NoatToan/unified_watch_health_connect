package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerGenericTemplateElement;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MessengerShareContentUtility {
    public static final String ATTACHMENT = "attachment";
    public static final String ATTACHMENT_ID = "attachment_id";
    public static final String ATTACHMENT_PAYLOAD = "payload";
    public static final String ATTACHMENT_TEMPLATE_TYPE = "template";
    public static final String ATTACHMENT_TYPE = "type";
    public static final String BUTTONS = "buttons";
    public static final String BUTTON_TYPE = "type";
    public static final String BUTTON_URL_TYPE = "web_url";
    public static final String DEFAULT_ACTION = "default_action";
    public static final String ELEMENTS = "elements";
    public static final Pattern FACEBOOK_DOMAIN = Pattern.compile("^(.+)\\.(facebook\\.com)$");
    public static final String FALLBACK_URL = "fallback_url";
    public static final String IMAGE_ASPECT_RATIO = "image_aspect_ratio";
    public static final String IMAGE_RATIO_HORIZONTAL = "horizontal";
    public static final String IMAGE_RATIO_SQUARE = "square";
    public static final String IMAGE_URL = "image_url";
    public static final String MEDIA_IMAGE = "image";
    public static final String MEDIA_TYPE = "media_type";
    public static final String MEDIA_VIDEO = "video";
    public static final String MESSENGER_EXTENSIONS = "messenger_extensions";
    public static final String PREVIEW_DEFAULT = "DEFAULT";
    public static final String PREVIEW_OPEN_GRAPH = "OPEN_GRAPH";
    public static final String SHARABLE = "sharable";
    public static final String SHARE_BUTTON_HIDE = "hide";
    public static final String SUBTITLE = "subtitle";
    public static final String TEMPLATE_GENERIC_TYPE = "generic";
    public static final String TEMPLATE_MEDIA_TYPE = "media";
    public static final String TEMPLATE_OPEN_GRAPH_TYPE = "open_graph";
    public static final String TEMPLATE_TYPE = "template_type";
    public static final String TITLE = "title";
    public static final String URL = "url";
    public static final String WEBVIEW_RATIO = "webview_height_ratio";
    public static final String WEBVIEW_RATIO_COMPACT = "compact";
    public static final String WEBVIEW_RATIO_FULL = "full";
    public static final String WEBVIEW_RATIO_TALL = "tall";
    public static final String WEBVIEW_SHARE_BUTTON = "webview_share_button";

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ShareMessengerMediaTemplateContent.MediaType.values().length];
            c = iArr;
            try {
                iArr[ShareMessengerMediaTemplateContent.MediaType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[ShareMessengerGenericTemplateContent.ImageAspectRatio.values().length];
            b = iArr2;
            try {
                iArr2[ShareMessengerGenericTemplateContent.ImageAspectRatio.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr3 = new int[ShareMessengerURLActionButton.WebviewHeightRatio.values().length];
            a = iArr3;
            try {
                iArr3[ShareMessengerURLActionButton.WebviewHeightRatio.WebviewHeightRatioCompact.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ShareMessengerURLActionButton.WebviewHeightRatio.WebviewHeightRatioTall.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static void a(Bundle bundle, ShareMessengerActionButton shareMessengerActionButton, boolean z) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class) || shareMessengerActionButton == null) {
            return;
        }
        try {
            if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                e(bundle, (ShareMessengerURLActionButton) shareMessengerActionButton, z);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
        }
    }

    public static void addGenericTemplateContent(Bundle bundle, ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return;
        }
        try {
            b(bundle, shareMessengerGenericTemplateContent.getGenericTemplateElement());
            Utility.putJSONValueInBundle(bundle, ShareConstants.MESSENGER_PLATFORM_CONTENT, m(shareMessengerGenericTemplateContent));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
        }
    }

    public static void addMediaTemplateContent(Bundle bundle, ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return;
        }
        try {
            c(bundle, shareMessengerMediaTemplateContent);
            Utility.putJSONValueInBundle(bundle, ShareConstants.MESSENGER_PLATFORM_CONTENT, o(shareMessengerMediaTemplateContent));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
        }
    }

    public static void addOpenGraphMusicTemplateContent(Bundle bundle, ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return;
        }
        try {
            d(bundle, shareMessengerOpenGraphMusicTemplateContent);
            Utility.putJSONValueInBundle(bundle, ShareConstants.MESSENGER_PLATFORM_CONTENT, q(shareMessengerOpenGraphMusicTemplateContent));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
        }
    }

    private static void b(Bundle bundle, ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return;
        }
        try {
            if (shareMessengerGenericTemplateElement.getButton() != null) {
                a(bundle, shareMessengerGenericTemplateElement.getButton(), false);
            } else if (shareMessengerGenericTemplateElement.getDefaultAction() != null) {
                a(bundle, shareMessengerGenericTemplateElement.getDefaultAction(), true);
            }
            Utility.putUri(bundle, ShareConstants.IMAGE_URL, shareMessengerGenericTemplateElement.getImageUrl());
            Utility.putNonEmptyString(bundle, ShareConstants.PREVIEW_TYPE, PREVIEW_DEFAULT);
            Utility.putNonEmptyString(bundle, ShareConstants.TITLE, shareMessengerGenericTemplateElement.getTitle());
            Utility.putNonEmptyString(bundle, ShareConstants.SUBTITLE, shareMessengerGenericTemplateElement.getSubtitle());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
        }
    }

    private static void c(Bundle bundle, ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return;
        }
        try {
            a(bundle, shareMessengerMediaTemplateContent.getButton(), false);
            Utility.putNonEmptyString(bundle, ShareConstants.PREVIEW_TYPE, PREVIEW_DEFAULT);
            Utility.putNonEmptyString(bundle, ShareConstants.ATTACHMENT_ID, shareMessengerMediaTemplateContent.getAttachmentId());
            if (shareMessengerMediaTemplateContent.getMediaUrl() != null) {
                Utility.putUri(bundle, h(shareMessengerMediaTemplateContent.getMediaUrl()), shareMessengerMediaTemplateContent.getMediaUrl());
            }
            Utility.putNonEmptyString(bundle, "type", g(shareMessengerMediaTemplateContent.getMediaType()));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
        }
    }

    private static void d(Bundle bundle, ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return;
        }
        try {
            a(bundle, shareMessengerOpenGraphMusicTemplateContent.getButton(), false);
            Utility.putNonEmptyString(bundle, ShareConstants.PREVIEW_TYPE, PREVIEW_OPEN_GRAPH);
            Utility.putUri(bundle, ShareConstants.OPEN_GRAPH_URL, shareMessengerOpenGraphMusicTemplateContent.getUrl());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
        }
    }

    private static void e(Bundle bundle, ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) throws JSONException {
        String uriString;
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return;
        }
        try {
            if (z) {
                uriString = Utility.getUriString(shareMessengerURLActionButton.getUrl());
            } else {
                uriString = shareMessengerURLActionButton.getTitle() + " - " + Utility.getUriString(shareMessengerURLActionButton.getUrl());
            }
            Utility.putNonEmptyString(bundle, ShareConstants.TARGET_DISPLAY, uriString);
            Utility.putUri(bundle, ShareConstants.ITEM_URL, shareMessengerURLActionButton.getUrl());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
        }
    }

    private static String f(ShareMessengerGenericTemplateContent.ImageAspectRatio imageAspectRatio) {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return null;
        }
        if (imageAspectRatio == null) {
            return IMAGE_RATIO_HORIZONTAL;
        }
        try {
            return a.b[imageAspectRatio.ordinal()] != 1 ? IMAGE_RATIO_HORIZONTAL : "square";
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
            return null;
        }
    }

    private static String g(ShareMessengerMediaTemplateContent.MediaType mediaType) {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return null;
        }
        if (mediaType == null) {
            return "image";
        }
        try {
            return a.c[mediaType.ordinal()] != 1 ? "image" : "video";
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
            return null;
        }
    }

    private static String h(Uri uri) {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            String host = uri.getHost();
            return (Utility.isNullOrEmpty(host) || !FACEBOOK_DOMAIN.matcher(host).matches()) ? ShareConstants.IMAGE_URL : "uri";
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
            return null;
        }
    }

    private static String i(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            if (shareMessengerURLActionButton.getShouldHideWebviewShareButton()) {
                return "hide";
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
            return null;
        }
    }

    private static String j(ShareMessengerURLActionButton.WebviewHeightRatio webviewHeightRatio) {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return null;
        }
        if (webviewHeightRatio == null) {
            return WEBVIEW_RATIO_FULL;
        }
        try {
            int i = a.a[webviewHeightRatio.ordinal()];
            if (i != 1) {
                return i != 2 ? WEBVIEW_RATIO_FULL : WEBVIEW_RATIO_TALL;
            }
            return WEBVIEW_RATIO_COMPACT;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
            return null;
        }
    }

    private static JSONObject k(ShareMessengerActionButton shareMessengerActionButton) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            return l(shareMessengerActionButton, false);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
            return null;
        }
    }

    private static JSONObject l(ShareMessengerActionButton shareMessengerActionButton, boolean z) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                return s((ShareMessengerURLActionButton) shareMessengerActionButton, z);
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
            return null;
        }
    }

    private static JSONObject m(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put(TEMPLATE_TYPE, TEMPLATE_GENERIC_TYPE).put(SHARABLE, shareMessengerGenericTemplateContent.getIsSharable()).put(IMAGE_ASPECT_RATIO, f(shareMessengerGenericTemplateContent.getImageAspectRatio())).put(ELEMENTS, new JSONArray().put(n(shareMessengerGenericTemplateContent.getGenericTemplateElement())))));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
            return null;
        }
    }

    private static JSONObject n(ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            JSONObject jSONObjectPut = new JSONObject().put("title", shareMessengerGenericTemplateElement.getTitle()).put(SUBTITLE, shareMessengerGenericTemplateElement.getSubtitle()).put(IMAGE_URL, Utility.getUriString(shareMessengerGenericTemplateElement.getImageUrl()));
            if (shareMessengerGenericTemplateElement.getButton() != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(k(shareMessengerGenericTemplateElement.getButton()));
                jSONObjectPut.put(BUTTONS, jSONArray);
            }
            if (shareMessengerGenericTemplateElement.getDefaultAction() != null) {
                jSONObjectPut.put(DEFAULT_ACTION, l(shareMessengerGenericTemplateElement.getDefaultAction(), true));
            }
            return jSONObjectPut;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
            return null;
        }
    }

    private static JSONObject o(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put(TEMPLATE_TYPE, "media").put(ELEMENTS, new JSONArray().put(p(shareMessengerMediaTemplateContent)))));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
            return null;
        }
    }

    private static JSONObject p(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            JSONObject jSONObjectPut = new JSONObject().put(ATTACHMENT_ID, shareMessengerMediaTemplateContent.getAttachmentId()).put("url", Utility.getUriString(shareMessengerMediaTemplateContent.getMediaUrl())).put(MEDIA_TYPE, g(shareMessengerMediaTemplateContent.getMediaType()));
            if (shareMessengerMediaTemplateContent.getButton() != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(k(shareMessengerMediaTemplateContent.getButton()));
                jSONObjectPut.put(BUTTONS, jSONArray);
            }
            return jSONObjectPut;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
            return null;
        }
    }

    private static JSONObject q(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put(TEMPLATE_TYPE, "open_graph").put(ELEMENTS, new JSONArray().put(r(shareMessengerOpenGraphMusicTemplateContent)))));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
            return null;
        }
    }

    private static JSONObject r(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            JSONObject jSONObjectPut = new JSONObject().put("url", Utility.getUriString(shareMessengerOpenGraphMusicTemplateContent.getUrl()));
            if (shareMessengerOpenGraphMusicTemplateContent.getButton() != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(k(shareMessengerOpenGraphMusicTemplateContent.getButton()));
                jSONObjectPut.put(BUTTONS, jSONArray);
            }
            return jSONObjectPut;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
            return null;
        }
    }

    private static JSONObject s(ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
            return null;
        }
        try {
            return new JSONObject().put("type", BUTTON_URL_TYPE).put("title", z ? null : shareMessengerURLActionButton.getTitle()).put("url", Utility.getUriString(shareMessengerURLActionButton.getUrl())).put(WEBVIEW_RATIO, j(shareMessengerURLActionButton.getWebviewHeightRatio())).put(MESSENGER_EXTENSIONS, shareMessengerURLActionButton.getIsMessengerExtensionURL()).put(FALLBACK_URL, Utility.getUriString(shareMessengerURLActionButton.getFallbackUrl())).put(WEBVIEW_SHARE_BUTTON, i(shareMessengerURLActionButton));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MessengerShareContentUtility.class);
            return null;
        }
    }
}
