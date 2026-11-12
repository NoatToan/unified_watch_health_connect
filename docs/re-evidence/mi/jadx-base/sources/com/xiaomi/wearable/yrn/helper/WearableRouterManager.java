package com.xiaomi.wearable.yrn.helper;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.common.CommonBaseActivity;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.map.export.MapDynamicUtils;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.wearable.yrn.helper.WearableRouterManager;
import com.xiaomi.wearable.yrn.internal.UrlUtils;
import defpackage.lwr;
import java.io.Serializable;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rJ\u0018\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J,\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J,\u0010\u0016\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J@\u0010\u0017\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J$\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u001aJ\u001e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070 H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/wearable/yrn/helper/WearableRouterManager;", "", "<init>", "()V", "TAG", "", "openPage", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "appName", "pageName", "params", "", "url", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", AccountInteractActivity.KEY_REQUEST_CODE, "", "extractPathSegment", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "handleOpenPage", "openNativePage", "pageClass", "transitionAnimate", "", "backToPage", "instance", "isToRoot", "preLoadHandle", "callback", "Lkotlin/Function0;", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWearableRouterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearableRouterManager.kt\ncom/xiaomi/wearable/yrn/helper/WearableRouterManager\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,291:1\n29#2:292\n29#2:303\n774#3:293\n865#3,2:294\n774#3:296\n865#3,2:297\n216#4,2:299\n216#4,2:301\n*S KotlinDebug\n*F\n+ 1 WearableRouterManager.kt\ncom/xiaomi/wearable/yrn/helper/WearableRouterManager\n*L\n83#1:292\n267#1:303\n96#1:293\n96#1:294,2\n113#1:296\n113#1:297,2\n175#1:299,2\n219#1:301,2\n*E\n"})
public final class WearableRouterManager {

    @NotNull
    public static final WearableRouterManager INSTANCE = new WearableRouterManager();

    @NotNull
    private static final String TAG = "RouterManager";

    private WearableRouterManager() {
    }

    public static /* synthetic */ void backToPage$default(WearableRouterManager wearableRouterManager, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        wearableRouterManager.backToPage(str, str2, z);
    }

    private final String extractPathSegment(Uri uri) {
        try {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() < 2) {
                return null;
            }
            String str = pathSegments.get(pathSegments.size() - 2);
            Intrinsics.checkNotNull(pathSegments);
            return ((Object) str) + "/" + CollectionsKt___CollectionsKt.last((List<? extends Object>) pathSegments);
        } catch (Exception unused) {
            return null;
        }
    }

    private final void handleOpenPage(Activity activity, String url, int requestCode, Promise promise) {
        String lowerCase;
        List listSplit$default;
        String str;
        List listSplit$default2;
        Activity currentActivity = activity;
        String[] strArr = {"_transitionAnimate", "_rt", "_root", "_useNativeRoute", "_paramsTypes"};
        Uri uri = Uri.parse(url);
        boolean zAreEqual = Intrinsics.areEqual(uri.getQueryParameter("_rt"), "native");
        String queryParameter = uri.getQueryParameter("_transitionAnimate");
        String lowerCase2 = null;
        if (queryParameter != null) {
            lowerCase = queryParameter.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        boolean z = !Intrinsics.areEqual(lowerCase, "false");
        if (Intrinsics.areEqual(uri.getQueryParameter("_root"), "true") || Intrinsics.areEqual(uri.getQueryParameter("_root"), "1")) {
            MainTab.Companion companion = MainTab.INSTANCE;
            String strExtractPathSegment = extractPathSegment(uri);
            if (strExtractPathSegment == null) {
                strExtractPathSegment = "";
            }
            int indexByTabFragmentClass = companion.getIndexByTabFragmentClass(strExtractPathSegment);
            StringBuilder sb = new StringBuilder();
            sb.append("tabIndex:");
            sb.append(indexByTabFragmentClass);
            if (indexByTabFragmentClass == -1) {
                String path = uri.getPath();
                if (path != null && (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) path, new String[]{"/"}, false, 0, 6, (Object) null)) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listSplit$default) {
                        if (((String) obj).length() > 0) {
                            arrayList.add(obj);
                        }
                    }
                    lowerCase2 = (String) CollectionsKt___CollectionsKt.lastOrNull((List) arrayList);
                }
                if (lowerCase2 != null) {
                    indexByTabFragmentClass = MainTab.INSTANCE.getIndexByTabFragmentClass(lowerCase2);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("pageClass:");
                sb2.append(lowerCase2);
                sb2.append(",tabIndex:");
                sb2.append(indexByTabFragmentClass);
            }
            if (currentActivity == null) {
                currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
            }
            if (currentActivity != null) {
                MainExtKt.showTabWithIndex(currentActivity, indexByTabFragmentClass);
                return;
            }
            return;
        }
        if (!zAreEqual) {
            lwr.b().openPage(currentActivity, url, requestCode);
            return;
        }
        String path2 = uri.getPath();
        if (path2 == null || (listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) path2, new String[]{"/"}, false, 0, 6, (Object) null)) == null) {
            str = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listSplit$default2) {
                if (((String) obj2).length() > 0) {
                    arrayList2.add(obj2);
                }
            }
            str = (String) CollectionsKt___CollectionsKt.lastOrNull((List) arrayList2);
        }
        if (str == null) {
            throw new IllegalArgumentException("Invalid URL: missing page class name");
        }
        String queryParameter2 = uri.getQueryParameter("_paramsTypes");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (queryParameter2 != null && queryParameter2.length() != 0) {
            JSONObject jSONObject = new JSONObject(URLDecoder.decode(queryParameter2, "UTF-8"));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.getString(next));
            }
        }
        String queryParameter3 = uri.getQueryParameter("_useNativeRoute");
        if (queryParameter3 != null) {
            lowerCase2 = queryParameter3.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        }
        Pair<String, Map<String, Object>> pairRewriteUri = WearableRNSpecialPageChecker.INSTANCE.rewriteUri(Intrinsics.areEqual(lowerCase2, "true"), linkedHashMap, str, uri, strArr);
        String strComponent1 = pairRewriteUri.component1();
        Map<String, ? extends Object> map = (Map) pairRewriteUri.component2();
        if (Intrinsics.areEqual(map.get("_useNativeRoute"), Boolean.TRUE)) {
            return;
        }
        openNativePage(activity, strComponent1, map, requestCode, z);
    }

    private final void openNativePage(Activity activity, String pageClass, Map<String, ? extends Object> params, int requestCode, boolean transitionAnimate) {
        Class<?> cls;
        Activity currentActivity = activity == null ? AppManager.INSTANCE.getInstance().getCurrentActivity() : activity;
        try {
            if (currentActivity != null) {
                try {
                    Intrinsics.checkNotNull(pageClass);
                    cls = Class.forName(pageClass);
                } catch (Exception e) {
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to load fragment class: ");
                    sb.append(message);
                    cls = null;
                }
                if (cls == null || !Fragment.class.isAssignableFrom(cls)) {
                    Intent intent = new Intent();
                    Intrinsics.checkNotNull(pageClass);
                    intent.setClassName(currentActivity, pageClass);
                    intent.addFlags(268435456);
                    intent.addFlags(536870912);
                    for (Map.Entry<String, ? extends Object> entry : params.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (Parcelable.class.isAssignableFrom(value.getClass())) {
                            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.os.Parcelable");
                            intent.putExtra(key, (Parcelable) value);
                        } else if (Serializable.class.isAssignableFrom(value.getClass())) {
                            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type java.io.Serializable");
                            intent.putExtra(key, (Serializable) value);
                        } else if (value instanceof Integer) {
                            intent.putExtra(key, ((Number) value).intValue());
                        } else if (value instanceof Boolean) {
                            intent.putExtra(key, ((Boolean) value).booleanValue());
                        } else if (value instanceof Long) {
                            intent.putExtra(key, ((Number) value).longValue());
                        } else if (value instanceof Double) {
                            intent.putExtra(key, ((Number) value).doubleValue());
                        } else if (value instanceof Float) {
                            intent.putExtra(key, ((Number) value).floatValue());
                        } else {
                            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                            intent.putExtra(key, (String) value);
                        }
                    }
                    if (requestCode > 0) {
                        currentActivity.startActivityForResult(intent, requestCode);
                    } else {
                        currentActivity.startActivity(intent);
                    }
                    if (!transitionAnimate) {
                        currentActivity.overridePendingTransition(0, 0);
                    }
                } else {
                    Bundle bundle = new Bundle();
                    for (Map.Entry<String, ? extends Object> entry2 : params.entrySet()) {
                        String key2 = entry2.getKey();
                        Object value2 = entry2.getValue();
                        if (Parcelable.class.isAssignableFrom(value2.getClass())) {
                            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type android.os.Parcelable");
                            bundle.putParcelable(key2, (Parcelable) value2);
                        } else if (Serializable.class.isAssignableFrom(value2.getClass())) {
                            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type java.io.Serializable");
                            bundle.putSerializable(key2, (Serializable) value2);
                        } else if (value2 instanceof Integer) {
                            bundle.putInt(key2, ((Number) value2).intValue());
                        } else if (value2 instanceof Boolean) {
                            bundle.putBoolean(key2, ((Boolean) value2).booleanValue());
                        } else if (value2 instanceof Long) {
                            bundle.putLong(key2, ((Number) value2).longValue());
                        } else if (value2 instanceof Double) {
                            bundle.putDouble(key2, ((Number) value2).doubleValue());
                        } else {
                            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.String");
                            bundle.putString(key2, (String) value2);
                        }
                    }
                    FragmentParams.b bVar = new FragmentParams.b();
                    Intrinsics.checkNotNull(pageClass);
                    FragmentParams fragmentParamsB = bVar.d(pageClass).c(bundle).b();
                    Intent intent2 = new Intent();
                    intent2.setClass(currentActivity, CommonBaseActivity.class);
                    intent2.putExtra("fragment_param", (Parcelable) fragmentParamsB);
                    intent2.addFlags(268435456);
                    if (requestCode > 0) {
                        currentActivity.startActivityForResult(intent2, requestCode);
                    } else {
                        currentActivity.startActivity(intent2);
                    }
                    if (!transitionAnimate) {
                        currentActivity.overridePendingTransition(0, 0);
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e2) {
            String message2 = e2.getMessage();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to open native page: ");
            sb2.append(message2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openPage$lambda$0(Activity activity, String url, int i, Promise promise) {
        Intrinsics.checkNotNullParameter(url, "$url");
        INSTANCE.handleOpenPage(activity, url, i, promise);
        return Unit.INSTANCE;
    }

    private final void preLoadHandle(String url, final Function0<Unit> callback) {
        String queryParameter = Uri.parse(url).getQueryParameter("_supportCapability");
        if (queryParameter == null) {
            callback.invoke();
            return;
        }
        if (!Intrinsics.areEqual(queryParameter, "map")) {
            callback.invoke();
        } else if (AppUtil.INSTANCE.isPlayChannel()) {
            callback.invoke();
        } else {
            MapDynamicUtils.INSTANCE.checkSoLoaded(null, new Function2() { // from class: m8r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WearableRouterManager.preLoadHandle$lambda$11(callback, ((Boolean) obj).booleanValue(), (Exception) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit preLoadHandle$lambda$11(Function0 callback, boolean z, Exception exc) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        if (z) {
            callback.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void backToPage(@NotNull String instance, @Nullable String url, boolean isToRoot) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (isToRoot) {
            WearableRNPageStackControl.INSTANCE.popStackAll();
        } else if (url == null) {
            WearableRNPageStackControl.INSTANCE.popBack();
        } else {
            WearableRNPageStackControl.INSTANCE.popTopStack(url);
        }
    }

    public final void openPage(@Nullable Activity activity, @NotNull String appName, @NotNull String pageName, @Nullable Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        openPage(activity, UrlUtils.INSTANCE.generateUrl(appName, pageName, params), 0, (Promise) null);
    }

    public final void openPage(@Nullable Activity activity, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        openPage(activity, url, 0, (Promise) null);
    }

    public final void openPage(@NotNull String url, @Nullable Promise promise) {
        Intrinsics.checkNotNullParameter(url, "url");
        openPage((Activity) null, url, -1, promise);
    }

    private final void openPage(final Activity activity, final String url, final int requestCode, final Promise promise) {
        try {
            preLoadHandle(url, new Function0() { // from class: n8r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WearableRouterManager.openPage$lambda$0(activity, url, requestCode, promise);
                }
            });
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse URL: ");
            sb.append(message);
            if (promise != null) {
                promise.reject("URL_PARSE_ERROR", "Failed to parse URL: " + e.getMessage());
            }
        }
    }
}
