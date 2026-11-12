package com.xiaomi.wearable.yrn.helper;

import android.app.Activity;
import android.app.ActivityOptions;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.google.gson.Gson;
import com.mi.health.qrcode.QRCodeExportKt;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.util.PingAnHealthExtKt;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.wearable.yrn.helper.WearableRNSpecialPageChecker;
import defpackage.lp5;
import defpackage.oki;
import defpackage.v1j;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\u0002\u0010\u0013JW\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\n0\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0002¢\u0006\u0002\u0010\u0015J \u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n0\tH\u0002JW\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\n0\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0002¢\u0006\u0002\u0010\u0018J0\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\n0\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\n0\t2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J(\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\n0\t2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002JC\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u001d2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0002¢\u0006\u0002\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/xiaomi/wearable/yrn/helper/WearableRNSpecialPageChecker;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "rewriteUri", "Lkotlin/Pair;", "", "useNativeRoute", "", "typeMap", "pageClass", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "reservedFields", "", "(ZLjava/util/Map;Ljava/lang/String;Landroid/net/Uri;[Ljava/lang/String;)Lkotlin/Pair;", "parseDefault", "(Ljava/util/Map;Ljava/lang/String;Landroid/net/Uri;[Ljava/lang/String;)Lkotlin/Pair;", "routePingan", "routeSportRecordDetail", "(Ljava/lang/String;Ljava/util/Map;Landroid/net/Uri;[Ljava/lang/String;)Lkotlin/Pair;", "routeMainDeviceTab", "routeScanDevice", "routeToQRCodeScan", "getDefaultParams", "", "(Ljava/util/Map;Landroid/net/Uri;[Ljava/lang/String;)Ljava/util/Map;", "PAGE_PINGAN_ORDER", "PAGE_SPORT_RECORD", "PAGE_SCAN_DEVICE", "PAGE_MAIN_DEVICE_TAB", "PAGE_QRCODE_SCAN", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWearableRNSpecialPageChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearableRNSpecialPageChecker.kt\ncom/xiaomi/wearable/yrn/helper/WearableRNSpecialPageChecker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n1863#2,2:239\n*S KotlinDebug\n*F\n+ 1 WearableRNSpecialPageChecker.kt\ncom/xiaomi/wearable/yrn/helper/WearableRNSpecialPageChecker\n*L\n206#1:239,2\n*E\n"})
public final class WearableRNSpecialPageChecker {

    @NotNull
    private static final String PAGE_MAIN_DEVICE_TAB = "gotoDeviceTab";

    @NotNull
    private static final String PAGE_PINGAN_ORDER = "com.xiaomi.fitness.health.pingan.PinganHealthCareWebViewActivity";

    @NotNull
    private static final String PAGE_QRCODE_SCAN = "launchToQRCodeScan";

    @NotNull
    private static final String PAGE_SCAN_DEVICE = "launchToAddDevice";

    @NotNull
    private static final String PAGE_SPORT_RECORD = "com.xiaomi.fitness.detail.SportDetailFragment";

    @NotNull
    public static final WearableRNSpecialPageChecker INSTANCE = new WearableRNSpecialPageChecker();

    @NotNull
    private static final String TAG = "WearableRNSpecialPageChecker";

    private WearableRNSpecialPageChecker() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Map<String, Object> getDefaultParams(Map<String, String> typeMap, Uri uri, String[] reservedFields) {
        String queryParameter;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("_useNativeRoute", Boolean.FALSE);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        for (String str : queryParameterNames) {
            if (!ArraysKt___ArraysKt.contains(reservedFields, str) && (queryParameter = uri.getQueryParameter(str)) != null) {
                String str2 = typeMap.get(str);
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case 73679:
                            if (str2.equals("Int")) {
                                linkedHashMap.put(str, Integer.valueOf(Integer.parseInt(queryParameter)));
                            } else {
                                try {
                                    linkedHashMap.put(str, new Gson().fromJson(queryParameter, (Class) Class.forName(str2)));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            break;
                        case 2374300:
                            if (str2.equals("Long")) {
                                linkedHashMap.put(str, Long.valueOf(Long.parseLong(queryParameter)));
                            } else {
                                linkedHashMap.put(str, new Gson().fromJson(queryParameter, (Class) Class.forName(str2)));
                            }
                            break;
                        case 67973692:
                            if (str2.equals("Float")) {
                                linkedHashMap.put(str, Float.valueOf(Float.parseFloat(queryParameter)));
                            } else {
                                linkedHashMap.put(str, new Gson().fromJson(queryParameter, (Class) Class.forName(str2)));
                            }
                            break;
                        case 1729365000:
                            if (str2.equals("Boolean")) {
                                linkedHashMap.put(str, Boolean.valueOf(Boolean.parseBoolean(queryParameter)));
                            } else {
                                linkedHashMap.put(str, new Gson().fromJson(queryParameter, (Class) Class.forName(str2)));
                            }
                            break;
                        case 2052876273:
                            if (str2.equals("Double")) {
                                linkedHashMap.put(str, Double.valueOf(Double.parseDouble(queryParameter)));
                            } else {
                                linkedHashMap.put(str, new Gson().fromJson(queryParameter, (Class) Class.forName(str2)));
                            }
                            break;
                        default:
                            linkedHashMap.put(str, new Gson().fromJson(queryParameter, (Class) Class.forName(str2)));
                            break;
                    }
                } else {
                    linkedHashMap.put(str, queryParameter);
                }
            }
        }
        return linkedHashMap;
    }

    private final Pair<String, Map<String, Object>> parseDefault(Map<String, String> typeMap, String pageClass, Uri uri, String[] reservedFields) {
        return TuplesKt.to(pageClass, getDefaultParams(typeMap, uri, reservedFields));
    }

    private final Pair<String, Map<String, Object>> routeMainDeviceTab(String pageClass, Uri uri) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("_useNativeRoute", Boolean.TRUE);
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
            String queryParameter = uri.getQueryParameter("type");
            if (queryParameter == null) {
                queryParameter = "";
            }
            if (Intrinsics.areEqual(queryParameter, "other")) {
                bundle.putString(MainTab.PAGE_TYPE, "otherDevice");
            }
            MainExtKt.showMainActivity(currentActivity, null, bundle);
        } else {
            Logger.e(TAG, "没有可用的activity");
        }
        return TuplesKt.to(pageClass, linkedHashMap);
    }

    private final Pair<String, Map<String, String>> routePingan() {
        IHealthPage.Companion companion = IHealthPage.INSTANCE;
        if (HealthPageExtKt.getInstance(companion).getGrantPingan()) {
            return TuplesKt.to(PAGE_PINGAN_ORDER, MapsKt__MapsKt.mapOf(TuplesKt.to("URL", PingAnHealthExtKt.URL_MY_ORDER), TuplesKt.to(WebViewActivity.SHOW_TITLE_BAR, "false"), TuplesKt.to(WebViewActivity.TITLE_BAR_MATCH_STATUS_BAR, String.valueOf(RomUtils.isXiaomi()))));
        }
        HealthPageExtKt.getInstance(companion).setPingPanPageUrl(PingAnHealthExtKt.URL_MY_ORDER);
        return TuplesKt.to("com.xiaomi.fitness.webview.WebViewActivity", MapsKt__MapsKt.mapOf(TuplesKt.to("URL", PingAnHealthExtKt.URL_XIAOMI_PINGAN_AUTH_URL), TuplesKt.to(WebViewActivity.SHOW_TITLE_BAR, "true"), TuplesKt.to(WebViewActivity.COLLAPSE_TITLE, "true"), TuplesKt.to(WebViewActivity.SHOW_TITLE_COLOR, String.valueOf(oki.f29255a))));
    }

    private final Pair<String, Map<String, Object>> routeScanDevice(String pageClass) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("_useNativeRoute", Boolean.TRUE);
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            DeviceManagerExtKt.launchToAddDevice(currentActivity);
        } else {
            Logger.e(TAG, "没有可用的activity");
        }
        return TuplesKt.to(pageClass, linkedHashMap);
    }

    private final Pair<String, Map<String, Object>> routeSportRecordDetail(String pageClass, Map<String, String> typeMap, Uri uri, String[] reservedFields) {
        Map<String, Object> defaultParams = getDefaultParams(typeMap, uri, reservedFields);
        defaultParams.put("_useNativeRoute", Boolean.TRUE);
        Object obj = defaultParams.get("sportRecord");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fit.data.common.data.sport.SportBasicReport");
        SportBasicReport sportBasicReport = (SportBasicReport) obj;
        Bundle bundle = new Bundle();
        String sid = sportBasicReport.getSid();
        if (sid != null && !StringsKt__StringsKt.isBlank(sid)) {
            bundle.putString("did", sid);
        }
        bundle.putSerializable("local_date", Long.valueOf(sportBasicReport.getTimeStamp()));
        bundle.putLong("time_stamp", sportBasicReport.getTimeStamp());
        bundle.putSerializable("sport_report", sportBasicReport);
        bundle.putString("sport_source", "workout_tab");
        bundle.putInt("sport_type", lp5.a(sportBasicReport));
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            SportRecordApiKt.getSportRecordApi().goSportDetail(currentActivity, bundle, (ActivityOptions) null, sportBasicReport);
        }
        return TuplesKt.to(pageClass, defaultParams);
    }

    private final Pair<String, Map<String, Object>> routeToQRCodeScan(String pageClass) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("_useNativeRoute", Boolean.TRUE);
        final Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof FragmentActivity)) {
            Logger.e(TAG, "没有可用的activity");
        } else if (PermissionsUtil.shouldRequestPermission(new String[]{"android.permission.CAMERA"})) {
            final Function0 function0 = new Function0() { // from class: h8r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WearableRNSpecialPageChecker.routeToQRCodeScan$lambda$5(currentActivity);
                }
            };
            if (PermissionExtKt.supportMiuiPermissionEnable()) {
                function0.invoke();
            } else {
                PermissionsUtil.INSTANCE.showCameraPermissionDialog((FragmentActivity) currentActivity, "android.permission.CAMERA", new PermissionsUtil.PermissionAuthDialogAgreeListener() { // from class: com.xiaomi.wearable.yrn.helper.WearableRNSpecialPageChecker$routeToQRCodeScan$1$1
                    @Override // com.xiaomi.fitness.baseui.utils.PermissionsUtil.PermissionAuthDialogAgreeListener
                    public void onAuthDialogAgree(String permission) {
                        Intrinsics.checkNotNullParameter(permission, "permission");
                        function0.invoke();
                    }
                });
            }
        } else {
            QRCodeExportKt.launchToQRCodeScan$default(currentActivity, null, null, false, false, null, 31, null);
        }
        return TuplesKt.to(pageClass, linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit routeToQRCodeScan$lambda$5(final Activity activity) {
        PermissionExtKt.permission((FragmentActivity) activity, "android.permission.CAMERA", ResourceExtKt.getString(v1j.f36376a), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: i8r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WearableRNSpecialPageChecker.routeToQRCodeScan$lambda$5$lambda$4(activity, (PermissionBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit routeToQRCodeScan$lambda$5$lambda$4(final Activity activity, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: k8r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WearableRNSpecialPageChecker.routeToQRCodeScan$lambda$5$lambda$4$lambda$0(activity, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: l8r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WearableRNSpecialPageChecker.routeToQRCodeScan$lambda$5$lambda$4$lambda$3(activity, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit routeToQRCodeScan$lambda$5$lambda$4$lambda$0(Activity activity, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        QRCodeExportKt.launchToQRCodeScan$default(activity, null, null, false, false, null, 31, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit routeToQRCodeScan$lambda$5$lambda$4$lambda$3(Activity activity, final String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final FragmentActivity fragmentActivity = (FragmentActivity) activity;
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), it, fragmentActivity, null, null, null, new Function0() { // from class: j8r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WearableRNSpecialPageChecker.routeToQRCodeScan$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1(fragmentActivity, it);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit routeToQRCodeScan$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1(FragmentActivity act, String it) {
        Intrinsics.checkNotNullParameter(act, "$act");
        Intrinsics.checkNotNullParameter(it, "$it");
        PermissionsUtil.INSTANCE.showSettingDialog(act, it, false, null);
        return Unit.INSTANCE;
    }

    @NotNull
    public final String getTAG() {
        return TAG;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public final Pair<String, Map<String, Object>> rewriteUri(boolean useNativeRoute, @NotNull Map<String, String> typeMap, @NotNull String pageClass, @NotNull Uri uri, @NotNull String[] reservedFields) {
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(pageClass, "pageClass");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(reservedFields, "reservedFields");
        if (!useNativeRoute) {
            return parseDefault(typeMap, pageClass, uri, reservedFields);
        }
        switch (pageClass.hashCode()) {
            case -1554858925:
                if (pageClass.equals(PAGE_PINGAN_ORDER)) {
                    return routePingan();
                }
                break;
            case 513006425:
                if (pageClass.equals(PAGE_QRCODE_SCAN)) {
                    return routeToQRCodeScan(pageClass);
                }
                break;
            case 525416553:
                if (pageClass.equals(PAGE_SCAN_DEVICE)) {
                    return routeScanDevice(pageClass);
                }
                break;
            case 690618172:
                if (pageClass.equals(PAGE_MAIN_DEVICE_TAB)) {
                    return routeMainDeviceTab(pageClass, uri);
                }
                break;
            case 1062870724:
                if (pageClass.equals(PAGE_SPORT_RECORD)) {
                    return routeSportRecordDetail(pageClass, typeMap, uri, reservedFields);
                }
                break;
        }
        return parseDefault(typeMap, pageClass, uri, reservedFields);
    }
}
