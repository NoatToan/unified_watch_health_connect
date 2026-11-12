package com.facebook.internal.logging.dumpsys;

import android.annotation.SuppressLint;
import android.util.DisplayMetrics;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.m;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper;", "", "Landroid/webkit/WebView;", ViewHierarchyConstants.VIEW_KEY, "", "handle", "Ljava/io/PrintWriter;", "writer", "dump", "", "Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper$WebViewData;", "a", "Ljava/util/Set;", "webViews", "", "", "b", "Ljava/util/Map;", "webViewHTMLs", "<init>", "()V", "Companion", "WebViewData", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"NewApi", "StringFormatUse", "DefaultLocale", "BadMethodUse-java.lang.String.length"})
public final class WebViewDumpHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String GET_WEBVIEW_HTML_JS_SCRIPT = "(function() {  try {    const leftOf = %d;    const topOf = %d;    const density = %f;    const elements = Array.from(document.querySelectorAll('body, body *'));    for (const el of elements) {      const rect = el.getBoundingClientRect();      const left = Math.round(leftOf + rect.left * density);      const top = Math.round(topOf + rect.top * density);      const width = Math.round(rect.width * density);      const height = Math.round(rect.height * density);      el.setAttribute('data-rect', `${left},${top},${width},${height}`);      const style = window.getComputedStyle(el);      const hidden = style.display === 'none' || style.visibility !== 'visible' || el.getAttribute('hidden') === 'true';      const disabled = el.disabled || el.getAttribute('aria-disabled') === 'true';      const focused = el === document.activeElement;      if (hidden || disabled || focused) {        el.setAttribute('data-flag', `${hidden ? 'H' : ''}${disabled ? 'D' : ''}${focused ? 'F' : ''}`);      } else {        el.removeAttribute('data-flag');      }    }    document.activeElement.setAttribute('focused', 'true');    const doc = document.cloneNode(true);    for (const el of Array.from(doc.querySelectorAll('script, link'))) {      el.remove();    }    for (const el of Array.from(doc.querySelectorAll('*'))) {      el.removeAttribute('class');    }    return doc.getElementsByTagName('body')[0].outerHTML.trim();  } catch (e) {    return 'Failed: ' + e;  }})();";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Set<WebViewData> webViews = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<String, String> webViewHTMLs = new LinkedHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper$Companion;", "", "Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper$WebViewData;", "data", "", "html", "a", "GET_WEBVIEW_HTML_JS_SCRIPT", "Ljava/lang/String;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String a(WebViewData data, String html) {
            String strReplace$default = m.replace$default(m.replace$default(m.replace$default(html, "\\u003C", SearchCriteria.LT, false, 4, (Object) null), "\\n", "", false, 4, (Object) null), "\\\"", "\"", false, 4, (Object) null);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format("<html id=\"%s\" data-rect=\"%d,%d,%d,%d\">%s</html>", Arrays.copyOf(new Object[]{data.getKey(), Integer.valueOf(data.getLeft()), Integer.valueOf(data.getTop()), Integer.valueOf(data.getWidth()), Integer.valueOf(data.getHeight()), strReplace$default.substring(1, strReplace$default.length() - 1)}, 6));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0011\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper$WebViewData;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "key", "", LogUtil.I, "c", "()I", "left", GoogleApiAvailabilityLight.a, "top", "e", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "Landroid/webkit/WebView;", "webView", "<init>", "(Landroid/webkit/WebView;)V", "g", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class WebViewData {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int left;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int top;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int width;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final int height;
        private static final int[] f = new int[2];

        public WebViewData(@NotNull WebView webView) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            this.key = String.format("%s{%s}", Arrays.copyOf(new Object[]{webView.getClass().getName(), Integer.toHexString(webView.hashCode())}, 2));
            int[] iArr = f;
            webView.getLocationOnScreen(iArr);
            this.left = iArr[0];
            this.top = iArr[1];
            this.width = webView.getWidth();
            this.height = webView.getHeight();
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getLeft() {
            return this.left;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getTop() {
            return this.top;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getWidth() {
            return this.width;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "html", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 5, 1})
    public static final class a<T> implements ValueCallback {
        public final /* synthetic */ WebViewData b;

        public a(WebViewData webViewData) {
            this.b = webViewData;
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onReceiveValue(String str) {
            WebViewDumpHelper.this.webViewHTMLs.put(this.b.getKey(), str);
        }
    }

    public final void dump(@NotNull PrintWriter writer) {
        try {
            for (WebViewData webViewData : this.webViews) {
                String str = this.webViewHTMLs.get(webViewData.getKey());
                if (str != null) {
                    writer.print("WebView HTML for ");
                    writer.print(webViewData);
                    writer.println(":");
                    writer.println(INSTANCE.a(webViewData, str));
                }
            }
        } catch (Exception unused) {
        }
        this.webViews.clear();
        this.webViewHTMLs.clear();
    }

    public final void handle(@NotNull WebView view) {
        WebViewData webViewData = new WebViewData(view);
        this.webViews.add(webViewData);
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        view.evaluateJavascript(String.format(GET_WEBVIEW_HTML_JS_SCRIPT, Arrays.copyOf(new Object[]{Integer.valueOf(webViewData.getLeft()), Integer.valueOf(webViewData.getTop()), Float.valueOf(displayMetrics.scaledDensity)}, 3)), new a(webViewData));
    }
}
