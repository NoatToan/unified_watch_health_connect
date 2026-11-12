package ohos.ace.adapter.capability.web;

import android.view.MotionEvent;
import android.webkit.WebBackForwardList;
import com.huawei.operation.utils.Constants;
import java.util.HashMap;
import java.util.Map;
import ohos.ace.adapter.ALog;
import ohos.ace.adapter.IAceOnCallResourceMethod;
import ohos.ace.adapter.IAceOnResourceEvent;

/* JADX INFO: loaded from: classes20.dex */
public abstract class AceWebBase {
    private static final String EVENT = "event";
    private static final String LOG_TAG = "AceWebBase";
    private static final String METHOD = "method";
    private static final String PARAM_AND = "#HWJS-&-#";
    private static final String PARAM_BEGIN = "#HWJS-?-#";
    private static final String PARAM_EQUALS = "#HWJS-=-#";
    private static final String PARAM_NONE = "";
    private static final String PARAM_VALUE = "value";
    private static final String RESULT_FAIL = "fail";
    private static final String WEB_FLAG = "web@";
    private Map<String, IAceOnCallResourceMethod> callMethodMap = new HashMap();
    private final IAceOnResourceEvent callback;
    private final long id;

    private native void nativeOnObjectEvent(String str, String str2, Object obj);

    private native boolean nativeOnObjectEventWithBoolReturn(String str, String str2, Object obj);

    private native Object nativeOnObjectEventWithObjectReturn(String str, String str2, Object obj);

    /* JADX INFO: renamed from: accessBackward, reason: merged with bridge method [inline-methods] */
    public abstract String m2026x780e46b7(Map<String, String> map);

    /* JADX INFO: renamed from: accessForward, reason: merged with bridge method [inline-methods] */
    public abstract String m2027x3afab016(Map<String, String> map);

    /* JADX INFO: renamed from: accessStep, reason: merged with bridge method [inline-methods] */
    public abstract String m2013x45c9c9ad(Map<String, String> map);

    /* JADX INFO: renamed from: backgroundColor, reason: merged with bridge method [inline-methods] */
    public abstract String m2041x1748ae45(Map<String, String> map);

    /* JADX INFO: renamed from: backward, reason: merged with bridge method [inline-methods] */
    public abstract String m2024xf23573f9(Map<String, String> map);

    /* JADX INFO: renamed from: blockNetwork, reason: merged with bridge method [inline-methods] */
    public abstract String m2045x22fa53c1(Map<String, String> map);

    /* JADX INFO: renamed from: cacheMode, reason: merged with bridge method [inline-methods] */
    public abstract String m2034x80904f1d(Map<String, String> map);

    public abstract void cancel(long j, String str);

    /* JADX INFO: renamed from: changePageUrl, reason: merged with bridge method [inline-methods] */
    public abstract String m2022x4465f145(Map<String, String> map);

    public abstract void clearCache(boolean z);

    /* JADX INFO: renamed from: clearHistory, reason: merged with bridge method [inline-methods] */
    public abstract String m2018x38b44bc9(Map<String, String> map);

    public abstract void clearWebSchemeHandler();

    public abstract void closeWebMessagePort(String str);

    public abstract String[] createWebMessagePorts();

    public abstract void deleteJavaScriptRegister(String str);

    /* JADX INFO: renamed from: domStorageAccess, reason: merged with bridge method [inline-methods] */
    public abstract String m2033xbda3e5be(Map<String, String> map);

    public abstract void evaluateJavascript(String str, long j);

    public abstract void evaluateJavascriptExt(String str, long j);

    /* JADX INFO: renamed from: fileAccess, reason: merged with bridge method [inline-methods] */
    public abstract String m2036x66921db(Map<String, String> map);

    /* JADX INFO: renamed from: forward, reason: merged with bridge method [inline-methods] */
    public abstract String m2025xb521dd58(Map<String, String> map);

    /* JADX INFO: renamed from: geolocationAccess, reason: merged with bridge method [inline-methods] */
    public abstract String m2044x600dea62(Map<String, String> map);

    public abstract WebBackForwardList getBackForwardEntries();

    public abstract int getContentHeight();

    public abstract String getDefaultUserAgent();

    /* JADX INFO: renamed from: getHitTest, reason: merged with bridge method [inline-methods] */
    public abstract String m2017x78633d9f(Map<String, String> map);

    public abstract String getOriginalUrl();

    public abstract String getTitle();

    public abstract String getUrl();

    public abstract String getUserAgentString();

    public abstract void goBackOrForward(int i);

    /* JADX INFO: renamed from: horizontalScrollBarAccess, reason: merged with bridge method [inline-methods] */
    public abstract String m2039x916fdb87(Map<String, String> map);

    /* JADX INFO: renamed from: imageAccess, reason: merged with bridge method [inline-methods] */
    public abstract String m2035x437cb87c(Map<String, String> map);

    /* JADX INFO: renamed from: javascriptAccess, reason: merged with bridge method [inline-methods] */
    public abstract String m2031xb9708c9(Map<String, String> map);

    /* JADX INFO: renamed from: loadData, reason: merged with bridge method [inline-methods] */
    public abstract String m2012x82dd604e(Map<String, String> map);

    public abstract void loadUrl(String str, Map<String, String> map);

    /* JADX INFO: renamed from: mediaPlayGestureAccess, reason: merged with bridge method [inline-methods] */
    public abstract String m2042xda3517a4(Map<String, String> map);

    /* JADX INFO: renamed from: minFontSize, reason: merged with bridge method [inline-methods] */
    public abstract String m2038xce837228(Map<String, String> map);

    /* JADX INFO: renamed from: mixedMode, reason: merged with bridge method [inline-methods] */
    public abstract String m2032xfab77c5f(Map<String, String> map);

    /* JADX INFO: renamed from: onActive, reason: merged with bridge method [inline-methods] */
    public abstract String m2028x14efed02(Map<String, String> map);

    public abstract void onActivityPause();

    public abstract void onActivityResume();

    /* JADX INFO: renamed from: onInactive, reason: merged with bridge method [inline-methods] */
    public abstract String m2029xd7dc5661(Map<String, String> map);

    public abstract int onWebMessagePortEvent(long j, String str);

    public abstract int onWebMessagePortEventExt(long j, String str);

    /* JADX INFO: renamed from: onlineImageAccess, reason: merged with bridge method [inline-methods] */
    public abstract String m2043x9d218103(Map<String, String> map);

    public abstract String pageDown(boolean z);

    /* JADX INFO: renamed from: pagePathInvalid, reason: merged with bridge method [inline-methods] */
    public abstract String m2023x7525aa4(Map<String, String> map);

    public abstract void pageUp(boolean z);

    public abstract int postMessageEvent(String str, String str2);

    public abstract int postMessageEventExt(String str, String str2);

    public abstract String postUrl(String str, byte[] bArr);

    public abstract void postWebMessage(String str, String[] strArr, String str2);

    public abstract void registerJavaScriptProxy(String str, String[] strArr, String[] strArr2, String str2);

    public abstract void release();

    /* JADX INFO: renamed from: reload, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract String m2014x8b6330c(Map<String, String> map);

    /* JADX INFO: renamed from: requestFocus, reason: merged with bridge method [inline-methods] */
    public abstract String m2019xfba0b528(Map<String, String> map);

    /* JADX INFO: renamed from: routerBack, reason: merged with bridge method [inline-methods] */
    public abstract String m2021x817987e6(Map<String, String> map);

    public abstract String scrollBy(Map<String, String> map);

    public abstract String scrollTo(Map<String, String> map);

    /* JADX INFO: renamed from: setNestedScrollExt, reason: merged with bridge method [inline-methods] */
    public abstract String m2051x6cd24802(Map<String, String> map);

    public abstract void setTouchEvent(MotionEvent motionEvent);

    public abstract void setUserAgentString(String str);

    public abstract void setWebDebuggingAccess(boolean z);

    public abstract boolean setWebSchemeHandler(String str);

    public abstract void start(long j, String str, String str2);

    public abstract void startDownload(long j, String str);

    /* JADX INFO: renamed from: stopLoading, reason: merged with bridge method [inline-methods] */
    public abstract String m2015xcba29c6b(Map<String, String> map);

    /* JADX INFO: renamed from: textZoomRatio, reason: merged with bridge method [inline-methods] */
    public abstract String m2037xc9558b3a(Map<String, String> map);

    /* JADX INFO: renamed from: touchCancel, reason: merged with bridge method [inline-methods] */
    public abstract String m2049xe994d079(Map<String, String> map);

    /* JADX INFO: renamed from: touchDown, reason: merged with bridge method [inline-methods] */
    public abstract String m2046xa0cf945c(Map<String, String> map);

    /* JADX INFO: renamed from: touchMove, reason: merged with bridge method [inline-methods] */
    public abstract String m2048x26a8671a(Map<String, String> map);

    /* JADX INFO: renamed from: touchUp, reason: merged with bridge method [inline-methods] */
    public abstract String m2047x63bbfdbb(Map<String, String> map);

    /* JADX INFO: renamed from: updateLayout, reason: merged with bridge method [inline-methods] */
    public abstract String m2050xa9e5dea3(Map<String, String> map);

    /* JADX INFO: renamed from: updateUrl, reason: merged with bridge method [inline-methods] */
    public abstract String m2020xbe8d1e87(Map<String, String> map);

    /* JADX INFO: renamed from: updateWebLayout, reason: merged with bridge method [inline-methods] */
    public abstract String m2010xfd048d90(Map<String, String> map);

    /* JADX INFO: renamed from: verticalScrollBarAccess, reason: merged with bridge method [inline-methods] */
    public abstract String m2040x545c44e6(Map<String, String> map);

    /* JADX INFO: renamed from: zoom, reason: merged with bridge method [inline-methods] */
    public abstract String m2016x8e8f05ca(Map<String, String> map);

    /* JADX INFO: renamed from: zoomAccess, reason: merged with bridge method [inline-methods] */
    public abstract String m2030x48aa9f6a(Map<String, String> map);

    public abstract String zoomIn();

    public abstract String zoomOut();

    public AceWebBase(long j, IAceOnResourceEvent iAceOnResourceEvent) {
        this.id = j;
        this.callback = iAceOnResourceEvent;
        callMethodMapPutXWardMethod();
        callMethodMapPutLoadMethod();
        callMethodMapPutXactive();
        callMethodMapPutPageChange();
        callMethodMapWebPlugin();
        callMethodMapWebAtrribute();
    }

    private void callMethodMapWebAtrribute() {
        IAceOnCallResourceMethod iAceOnCallResourceMethod = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda16
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2030x48aa9f6a(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#zoomAccess#HWJS-?-#", iAceOnCallResourceMethod);
        IAceOnCallResourceMethod iAceOnCallResourceMethod2 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda24
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2031xb9708c9(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#javascriptAccess#HWJS-?-#", iAceOnCallResourceMethod2);
        IAceOnCallResourceMethod iAceOnCallResourceMethod3 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda25
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2038xce837228(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#minFontSize#HWJS-?-#", iAceOnCallResourceMethod3);
        IAceOnCallResourceMethod iAceOnCallResourceMethod4 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda26
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2039x916fdb87(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#horizontalScrollBarAccess#HWJS-?-#", iAceOnCallResourceMethod4);
        IAceOnCallResourceMethod iAceOnCallResourceMethod5 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda27
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2040x545c44e6(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#verticalScrollBarAccess#HWJS-?-#", iAceOnCallResourceMethod5);
        IAceOnCallResourceMethod iAceOnCallResourceMethod6 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda28
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2041x1748ae45(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#backgroundColor#HWJS-?-#", iAceOnCallResourceMethod6);
        IAceOnCallResourceMethod iAceOnCallResourceMethod7 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda29
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2042xda3517a4(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#mediaPlayGestureAccess#HWJS-?-#", iAceOnCallResourceMethod7);
        IAceOnCallResourceMethod iAceOnCallResourceMethod8 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda30
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2043x9d218103(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#onlineImageAccess#HWJS-?-#", iAceOnCallResourceMethod8);
        IAceOnCallResourceMethod iAceOnCallResourceMethod9 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda31
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2044x600dea62(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#geolocationAccess#HWJS-?-#", iAceOnCallResourceMethod9);
        IAceOnCallResourceMethod iAceOnCallResourceMethod10 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda32
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2045x22fa53c1(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#blockNetwork#HWJS-?-#", iAceOnCallResourceMethod10);
        IAceOnCallResourceMethod iAceOnCallResourceMethod11 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda17
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2032xfab77c5f(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#mixedMode#HWJS-?-#", iAceOnCallResourceMethod11);
        IAceOnCallResourceMethod iAceOnCallResourceMethod12 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda18
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2033xbda3e5be(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#domStorageAccess#HWJS-?-#", iAceOnCallResourceMethod12);
        IAceOnCallResourceMethod iAceOnCallResourceMethod13 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda19
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2034x80904f1d(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#cacheMode#HWJS-?-#", iAceOnCallResourceMethod13);
        IAceOnCallResourceMethod iAceOnCallResourceMethod14 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda20
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2035x437cb87c(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#imageAccess#HWJS-?-#", iAceOnCallResourceMethod14);
        IAceOnCallResourceMethod iAceOnCallResourceMethod15 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda21
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2036x66921db(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#fileAccess#HWJS-?-#", iAceOnCallResourceMethod15);
        IAceOnCallResourceMethod iAceOnCallResourceMethod16 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda23
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2037xc9558b3a(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#textZoomRatio#HWJS-?-#", iAceOnCallResourceMethod16);
    }

    private void callMethodMapPutXWardMethod() {
        IAceOnCallResourceMethod iAceOnCallResourceMethod = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda0
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2024xf23573f9(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#backward#HWJS-?-#", iAceOnCallResourceMethod);
        IAceOnCallResourceMethod iAceOnCallResourceMethod2 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda11
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2025xb521dd58(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#forward#HWJS-?-#", iAceOnCallResourceMethod2);
        IAceOnCallResourceMethod iAceOnCallResourceMethod3 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda22
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2026x780e46b7(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#accessBackward#HWJS-?-#", iAceOnCallResourceMethod3);
        IAceOnCallResourceMethod iAceOnCallResourceMethod4 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda33
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2027x3afab016(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#accessForward#HWJS-?-#", iAceOnCallResourceMethod4);
    }

    private void callMethodMapPutLoadMethod() {
        IAceOnCallResourceMethod iAceOnCallResourceMethod = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda8
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2010xfd048d90(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#layout#HWJS-?-#", iAceOnCallResourceMethod);
        IAceOnCallResourceMethod iAceOnCallResourceMethod2 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda9
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2011xbff0f6ef(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#reload#HWJS-?-#", iAceOnCallResourceMethod2);
        IAceOnCallResourceMethod iAceOnCallResourceMethod3 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda10
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2012x82dd604e(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#loadData#HWJS-?-#", iAceOnCallResourceMethod3);
        IAceOnCallResourceMethod iAceOnCallResourceMethod4 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda12
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2013x45c9c9ad(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#accessStep#HWJS-?-#", iAceOnCallResourceMethod4);
        IAceOnCallResourceMethod iAceOnCallResourceMethod5 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda13
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2014x8b6330c(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#refresh#HWJS-?-#", iAceOnCallResourceMethod5);
        IAceOnCallResourceMethod iAceOnCallResourceMethod6 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda14
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2015xcba29c6b(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#stop#HWJS-?-#", iAceOnCallResourceMethod6);
        IAceOnCallResourceMethod iAceOnCallResourceMethod7 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda15
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2016x8e8f05ca(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#zoom#HWJS-?-#", iAceOnCallResourceMethod7);
    }

    private void callMethodMapPutXactive() {
        IAceOnCallResourceMethod iAceOnCallResourceMethod = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda34
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2028x14efed02(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#onActive#HWJS-?-#", iAceOnCallResourceMethod);
        IAceOnCallResourceMethod iAceOnCallResourceMethod2 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda35
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2029xd7dc5661(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#onInactive#HWJS-?-#", iAceOnCallResourceMethod2);
    }

    private void callMethodMapPutPageChange() {
        IAceOnCallResourceMethod iAceOnCallResourceMethod = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda1
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2017x78633d9f(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#getHitTest#HWJS-?-#", iAceOnCallResourceMethod);
        IAceOnCallResourceMethod iAceOnCallResourceMethod2 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda2
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2018x38b44bc9(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#clearHistory#HWJS-?-#", iAceOnCallResourceMethod2);
        IAceOnCallResourceMethod iAceOnCallResourceMethod3 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda3
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2019xfba0b528(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#requestFocus#HWJS-?-#", iAceOnCallResourceMethod3);
        IAceOnCallResourceMethod iAceOnCallResourceMethod4 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda4
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2020xbe8d1e87(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#updateUrl#HWJS-?-#", iAceOnCallResourceMethod4);
        IAceOnCallResourceMethod iAceOnCallResourceMethod5 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda5
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2021x817987e6(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#routerBack#HWJS-?-#", iAceOnCallResourceMethod5);
        IAceOnCallResourceMethod iAceOnCallResourceMethod6 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda6
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2022x4465f145(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#changePageUrl#HWJS-?-#", iAceOnCallResourceMethod6);
        IAceOnCallResourceMethod iAceOnCallResourceMethod7 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda7
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2023x7525aa4(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#pagePathInvalid#HWJS-?-#", iAceOnCallResourceMethod7);
    }

    private void callMethodMapWebPlugin() {
        IAceOnCallResourceMethod iAceOnCallResourceMethod = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda36
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2046xa0cf945c(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#touchDown#HWJS-?-#", iAceOnCallResourceMethod);
        IAceOnCallResourceMethod iAceOnCallResourceMethod2 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda37
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2047x63bbfdbb(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#touchUp#HWJS-?-#", iAceOnCallResourceMethod2);
        IAceOnCallResourceMethod iAceOnCallResourceMethod3 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda38
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2048x26a8671a(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#touchMove#HWJS-?-#", iAceOnCallResourceMethod3);
        IAceOnCallResourceMethod iAceOnCallResourceMethod4 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda39
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2049xe994d079(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#touchCancel#HWJS-?-#", iAceOnCallResourceMethod4);
        IAceOnCallResourceMethod iAceOnCallResourceMethod5 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda40
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2050xa9e5dea3(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#updateLayout#HWJS-?-#", iAceOnCallResourceMethod5);
        IAceOnCallResourceMethod iAceOnCallResourceMethod6 = new IAceOnCallResourceMethod() { // from class: ohos.ace.adapter.capability.web.AceWebBase$$ExternalSyntheticLambda41
            @Override // ohos.ace.adapter.IAceOnCallResourceMethod
            public final String onCall(Map map) {
                return this.f$0.m2051x6cd24802(map);
            }
        };
        this.callMethodMap.put(WEB_FLAG + this.id + "method#HWJS-=-#setNestedScrollExt#HWJS-?-#", iAceOnCallResourceMethod6);
    }

    public Map<String, IAceOnCallResourceMethod> getCallMethod() {
        return this.callMethodMap;
    }

    public long getId() {
        return this.id;
    }

    public void firePageStarted(String str) {
        this.callback.onEvent(WEB_FLAG + this.id + "event#HWJS-=-#onPageStarted#HWJS-?-#", str);
    }

    private String makeEventHash(String str) {
        return WEB_FLAG + this.id + "event#HWJS-=-#" + str + PARAM_BEGIN;
    }

    public void fireDownloadStart(Object obj) {
        nativeOnObjectEvent(makeEventHash("onDownloadStart"), "onDownloadStart", obj);
    }

    public void fireJSInvokeMethod(Object obj) {
        nativeOnObjectEvent(makeEventHash("onJSInvokeMethod"), "onJSInvokeMethod", obj);
    }

    public void fireRunJSRecvValue(String str) {
        this.callback.onEvent(WEB_FLAG + this.id + "event#HWJS-=-#onRunJSRecvValue#HWJS-?-#", str);
    }

    public void fireRefreshHistory(Object obj) {
        nativeOnObjectEvent(makeEventHash("onRefreshAccessedHistory"), "onRefreshAccessedHistory", obj);
    }

    public void fireFullScreenEnter(Object obj) {
        nativeOnObjectEvent(makeEventHash("onFullScreenEnter"), "onFullScreenEnter", obj);
    }

    public void fireFullScreenExit(Object obj) {
        nativeOnObjectEvent(makeEventHash("onFullScreenExit"), "onFullScreenExit", obj);
    }

    public boolean fireUrlLoadIntercept(Object obj) {
        return nativeOnObjectEventWithBoolReturn(makeEventHash("onLoadIntercept"), "onLoadIntercept", obj);
    }

    public Object fireShouldInterceptRequest(Object obj) {
        return nativeOnObjectEventWithObjectReturn(makeEventHash("onInterceptRequest"), "onInterceptRequest", obj);
    }

    public boolean fireOverrideUrlLoading(Object obj) {
        return nativeOnObjectEventWithBoolReturn(makeEventHash("onOverrideUrlLoading"), "onOverrideUrlLoading", obj);
    }

    public void fireRenderExited(int i) {
        this.callback.onEvent(WEB_FLAG + this.id + "event#HWJS-=-#onRenderExited#HWJS-?-#", String.valueOf(i));
    }

    public void fireError(String str, int i, String str2) {
        String str3 = Constants.SUFFIX_URL + str + "&errorCode=" + i + "&description=" + str2;
        this.callback.onEvent(WEB_FLAG + this.id + "event#HWJS-=-#onPageError#HWJS-?-#", str3);
    }

    public void firePageVisible(String str) {
        this.callback.onEvent(WEB_FLAG + this.id + "event#HWJS-=-#onPageVisible#HWJS-?-#", str);
    }

    public void firePageFinished(String str) {
        this.callback.onEvent(WEB_FLAG + this.id + "event#HWJS-=-#onPageFinished#HWJS-?-#", str);
    }

    public void firePageChanged(int i) {
        this.callback.onEvent(WEB_FLAG + this.id + "event#HWJS-=-#onProgressChanged#HWJS-?-#", String.valueOf(i));
    }

    public void fireScrollWillStart(Object obj) {
        nativeOnObjectEvent(WEB_FLAG + this.id + "event#HWJS-=-#onWillScrollStart#HWJS-?-#", "onWillScrollStart", obj);
    }

    public void fireScrollStart(Object obj) {
        nativeOnObjectEvent(WEB_FLAG + this.id + "event#HWJS-=-#onScrollStart#HWJS-?-#", "onScrollStart", obj);
    }

    public void fireScrollChanged(Object obj) {
        nativeOnObjectEvent(WEB_FLAG + this.id + "event#HWJS-=-#onScroll#HWJS-?-#", "onScroll", obj);
    }

    public void fireScrollEnd(Object obj) {
        nativeOnObjectEvent(WEB_FLAG + this.id + "event#HWJS-=-#onScrollEnd#HWJS-?-#", "onScrollEnd", obj);
    }

    public void fireScaleChanged(Object obj) {
        nativeOnObjectEvent(WEB_FLAG + this.id + "event#HWJS-=-#onScaleChange#HWJS-?-#", "onScaleChange", obj);
    }

    public void firePageRecvTitle(String str) {
        this.callback.onEvent(WEB_FLAG + this.id + "event#HWJS-=-#onReceivedTitle#HWJS-?-#", str);
    }

    public void firePageGeoHidePermission() {
        this.callback.onEvent(WEB_FLAG + this.id + "event#HWJS-=-#onGeoHidePermission#HWJS-?-#", "origin");
    }

    public void firePageGeoPermission(Object obj) {
        nativeOnObjectEvent(WEB_FLAG + this.id + "event#HWJS-=-#onGeoPermission#HWJS-?-#", "onGeoPermission", obj);
    }

    public void firePageOnCommonDialog(String str, Object obj) {
        nativeOnObjectEvent(WEB_FLAG + this.id + "event#HWJS-=-#onCommonDialog#HWJS-?-#", str, obj);
    }

    public boolean firePageOnConsoleMessage(Object obj) {
        return nativeOnObjectEventWithBoolReturn(WEB_FLAG + this.id + "event#HWJS-=-#onConsoleMessage#HWJS-?-#", "onConsoleMessage", obj);
    }

    public boolean firePageOnShowFileChooser(Object obj) {
        return nativeOnObjectEventWithBoolReturn(WEB_FLAG + this.id + "event#HWJS-=-#onShowFileChooser#HWJS-?-#", "onShowFileChooser", obj);
    }

    public void fireErrorReceive(Object obj) {
        ALog.i(LOG_TAG, "jcz OnErrorReceive");
        nativeOnObjectEvent(WEB_FLAG + this.id + "event#HWJS-=-#onErrorReceive#HWJS-?-#", "onErrorReceive", obj);
    }

    public void fireHttpErrorReceive(Object obj) {
        nativeOnObjectEvent(WEB_FLAG + this.id + "event#HWJS-=-#onHttpErrorReceive#HWJS-?-#", "onHttpErrorReceive", obj);
    }

    public void fireHttpAuthRequestReceive(Object obj) {
        nativeOnObjectEventWithBoolReturn(WEB_FLAG + this.id + "event#HWJS-=-#onHttpAuthRequest#HWJS-?-#", "onHttpAuthRequest", obj);
    }

    public void firePermissionRequest(Object obj) {
        nativeOnObjectEventWithBoolReturn(WEB_FLAG + this.id + "event#HWJS-=-#onPermissionRequest#HWJS-?-#", "onPermissionRequest", obj);
    }

    public boolean fireJsPrompt(Object obj) {
        return nativeOnObjectEventWithBoolReturn(WEB_FLAG + this.id + "event#HWJS-=-#onPrompt#HWJS-?-#", "onPrompt", obj);
    }

    public boolean fireJsAlert(Object obj) {
        return nativeOnObjectEventWithBoolReturn(WEB_FLAG + this.id + "event#HWJS-=-#onAlert#HWJS-?-#", "onAlert", obj);
    }

    public boolean fireJsConfirm(Object obj) {
        return nativeOnObjectEventWithBoolReturn(WEB_FLAG + this.id + "event#HWJS-=-#onConfirm#HWJS-?-#", "onConfirm", obj);
    }

    public void fireRouterPush(String str) {
        this.callback.onEvent(WEB_FLAG + this.id + "event#HWJS-=-#routerPush#HWJS-?-#", str);
    }

    public boolean fireJsBeforeUnload(Object obj) {
        return nativeOnObjectEventWithBoolReturn(makeEventHash("onBeforeUnload"), "onBeforeUnload", obj);
    }

    public void firePostMessage(String str) {
        this.callback.onEvent(WEB_FLAG + this.id + "event#HWJS-=-#onMessage#HWJS-?-#", str);
    }

    public void fireSslErrorReceive(Object obj) {
        nativeOnObjectEventWithBoolReturn(WEB_FLAG + this.id + "event#HWJS-=-#onSslErrorEventReceive#HWJS-?-#", "onSslErrorEventReceive", obj);
    }

    public void fireAllSslErrorReceive(Object obj) {
        nativeOnObjectEventWithBoolReturn(WEB_FLAG + this.id + "event#HWJS-=-#onSslErrorEvent#HWJS-?-#", "onSslErrorEvent", obj);
    }
}
