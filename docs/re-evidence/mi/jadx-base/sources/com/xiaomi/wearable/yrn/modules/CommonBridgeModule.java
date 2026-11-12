package com.xiaomi.wearable.yrn.modules;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.CookieManager;
import androidx.fragment.app.FragmentActivity;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.fitness.banner.export.BannerExtKt;
import com.fitness.banner.export.IBanner;
import com.fitness.banner.export.compare.ICompare;
import com.fitness.banner.export.compare.ICompareKt;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer;
import com.xiaomi.fit.fitness.sync.export.di.FitnessSyncExtKt;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.account.token.MiAccessToken;
import com.xiaomi.fitness.account.token.TokenManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.login.export.PrivacyExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.membership.export.MembershipHelper;
import com.xiaomi.fitness.membership.export.MembershipHelperExtKt;
import com.xiaomi.fitness.mine.export.IWebSync;
import com.xiaomi.fitness.pay.export.PayManagerExtKt;
import com.xiaomi.fitness.pay.export.PaymentManager;
import com.xiaomi.fitness.pay.export.PaymentOrderType;
import com.xiaomi.fitness.pay.export.data.response.MibiDeductResult;
import com.xiaomi.fitness.pay.export.data.response.MibiPayError;
import com.xiaomi.fitness.pay.export.data.response.MibiPayResult;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.bean.RNDevice;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.fitness.yrn_config.YRNConstants;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.passport.ui.onetrack.TrackConstants;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import com.xiaomi.wearable.yrn.WearableRNManager;
import com.xiaomi.wearable.yrn.env.RNEnvironmentPreference;
import com.xiaomi.wearable.yrn.export.YRNPushHandler;
import com.xiaomi.wearable.yrn.export.YRNPushHandlerExtKt;
import com.xiaomi.wearable.yrn.helper.WearableRouterManager;
import com.xiaomi.wearable.yrn.modules.CommonBridgeModule;
import com.xiaomi.wearable.yrn.views.WearableRNActivity;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import defpackage.e4f;
import defpackage.im9;
import defpackage.tur;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0098\u00012\u00020\u0001:\u0002\u0098\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J \u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J \u0010\u001b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u001a\u0010\u001c\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J$\u0010\u001d\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u001a\u0010\u001e\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020!H\u0007J8\u0010\"\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u00122\b\u0010&\u001a\u0004\u0018\u00010\u00122\b\u0010'\u001a\u0004\u0018\u00010\u0012H\u0007J\u0010\u0010(\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\b\u0010)\u001a\u00020*H\u0007J\u0010\u0010+\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010,\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010-\u001a\u00020\r2\u0006\u0010 \u001a\u00020!H\u0007J \u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u000202H\u0007J(\u00103\u001a\u00020\r2\u0006\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0007J \u00106\u001a\u00020\r2\u0006\u00104\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0007J\u0010\u00107\u001a\u00020\r2\u0006\u0010 \u001a\u00020!H\u0007J\"\u00108\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010\u00122\u0006\u00100\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0007J\u0010\u00109\u001a\u00020\r2\u0006\u0010 \u001a\u00020!H\u0007J\u0012\u0010:\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J)\u0010;\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010\u00122\b\u0010<\u001a\u0004\u0018\u00010$2\u0006\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020\rH\u0007J\u0010\u0010?\u001a\u00020\r2\u0006\u0010@\u001a\u00020\u0012H\u0007J\u0010\u0010A\u001a\u00020\r2\u0006\u0010 \u001a\u00020!H\u0007J\u0012\u0010B\u001a\u00020\r2\b\u0010@\u001a\u0004\u0018\u00010\u0012H\u0007J\b\u0010C\u001a\u00020\rH\u0007J\u0010\u0010D\u001a\u00020\r2\u0006\u0010 \u001a\u00020!H\u0007J\u0010\u0010E\u001a\u00020\r2\u0006\u0010 \u001a\u00020!H\u0007J\b\u0010F\u001a\u00020\rH\u0007J\b\u0010G\u001a\u00020\rH\u0007J\u0018\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020J2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\"\u0010K\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00150L2\b\u0010M\u001a\u0004\u0018\u00010JH\u0002J\u001a\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150O2\b\u0010P\u001a\u0004\u0018\u00010QH\u0002J\u0012\u0010R\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u0010\u0010S\u001a\u00020\r2\u0006\u0010I\u001a\u00020JH\u0007J\b\u0010T\u001a\u00020\rH\u0007J\b\u0010U\u001a\u00020\rH\u0007J\u0010\u0010V\u001a\u00020\r2\u0006\u0010W\u001a\u000202H\u0007J\u0010\u0010X\u001a\u00020\r2\u0006\u0010Y\u001a\u00020JH\u0007J\u0010\u0010Z\u001a\u00020\r2\u0006\u0010 \u001a\u00020!H\u0007J\b\u0010[\u001a\u00020\rH\u0007J\b\u0010\\\u001a\u00020\rH\u0007J\b\u0010]\u001a\u00020\rH\u0007J\b\u0010^\u001a\u00020\rH\u0007J\u0012\u0010_\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u0012\u0010`\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u001a\u0010a\u001a\u00020\r2\u0006\u0010Y\u001a\u00020J2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u0012\u0010b\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u0010\u0010c\u001a\u00020\r2\u0006\u0010 \u001a\u00020!H\u0007J\u0018\u0010d\u001a\u00020\r2\u0006\u0010e\u001a\u00020Q2\u0006\u0010f\u001a\u00020JH\u0007J \u0010g\u001a\u00020\r2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010i\u001a\u00020J2\u0006\u0010 \u001a\u00020!H\u0007J \u0010j\u001a\u00020\r2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010i\u001a\u00020J2\u0006\u0010 \u001a\u00020!H\u0007J$\u0010k\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010 \u001a\u00020!H\u0007J\u001c\u0010l\u001a\u00020\r2\b\u0010m\u001a\u0004\u0018\u00010J2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J&\u0010n\u001a\u00020\r2\b\u0010o\u001a\u0004\u0018\u00010\u00122\b\u00105\u001a\u0004\u0018\u00010\u00122\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u001c\u0010p\u001a\u00020\r2\b\u0010o\u001a\u0004\u0018\u00010\u00122\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u001a\u0010q\u001a\u00020\r2\b\u0010m\u001a\u0004\u0018\u00010J2\u0006\u0010 \u001a\u00020!H\u0007J\u001a\u0010r\u001a\u00020\r2\b\u0010m\u001a\u0004\u0018\u00010J2\u0006\u0010 \u001a\u00020!H\u0007J\u0018\u0010s\u001a\u00020\r2\u0006\u0010m\u001a\u00020J2\u0006\u0010 \u001a\u00020!H\u0007J\u001a\u0010t\u001a\u00020\r2\b\u0010u\u001a\u0004\u0018\u00010\u00122\u0006\u0010 \u001a\u00020!H\u0007J\u0010\u0010v\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\b\u0010~\u001a\u00020\rH\u0007J\u0010\u0010\u007f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\t\u0010\u0080\u0001\u001a\u00020\u0012H\u0007J\u0011\u0010\u0081\u0001\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J#\u0010\u0082\u0001\u001a\u00020\r2\u0007\u0010\u0083\u0001\u001a\u00020\u00122\u0007\u0010\u0084\u0001\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0013\u0010\u0085\u0001\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0011\u0010\u0086\u0001\u001a\u00020\r2\u0006\u0010 \u001a\u00020!H\u0007J\u0011\u0010\u0087\u0001\u001a\u00020\r2\u0006\u0010 \u001a\u00020!H\u0007J\u0011\u0010\u0088\u0001\u001a\u00020\r2\u0006\u0010 \u001a\u00020!H\u0007J\u001c\u0010\u0089\u0001\u001a\u00020\r2\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010Q2\u0006\u0010 \u001a\u00020!H\u0007J\u0016\u0010\u008b\u0001\u001a\u00030\u008c\u00012\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0002J\u0016\u0010\u008f\u0001\u001a\u00030\u008c\u00012\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u0002J\u0012\u0010\u0091\u0001\u001a\u00020\r2\u0007\u0010\u0092\u0001\u001a\u00020\u0012H\u0007J\u0012\u0010\u0093\u0001\u001a\u00020\r2\u0007\u0010\u0094\u0001\u001a\u000202H\u0007J\t\u0010\u0095\u0001\u001a\u00020\rH\u0007J\u0011\u0010\u0096\u0001\u001a\u00020\r2\u0006\u0010P\u001a\u00020QH\u0007J\t\u0010\u0097\u0001\u001a\u00020\rH\u0007R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010w\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\bw\u0010xR$\u0010z\u001a\u0002022\u0006\u0010y\u001a\u0002028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}¨\u0006\u0099\u0001"}, d2 = {"Lcom/xiaomi/wearable/yrn/modules/CommonBridgeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "fitnessSyncer", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer;", "getFitnessSyncer", "()Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer;", "fitnessSyncer$delegate", "Lkotlin/Lazy;", "initialize", "", "application", "mUiHandler", "Landroid/os/Handler;", "getName", "", "getConstants", "", "", "shouldOpenUrl", "instance", "url", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "openUri", "back", "backTo", "backToRoot", "getCurrentSenseStack", "callback", "Lcom/facebook/react/bridge/Callback;", "shouldOpenOperationsPage", "type", "", "source", "contentSource", "exposeSource", "promGetAllRnVersion", "getAllRnVersion", "Lcom/facebook/react/bridge/WritableArray;", "getUserInfo", "getUserProfile", "getHttpUA", "updateLoginInfo", "sid", "domain", "forceLogin", "", "setCookie", "name", "value", "getCookie", "getAllCookie", "removeCookie", "removeAllCookies", "openChangePasswordPageWithCallback", "updateToken", "serverTime", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/facebook/react/bridge/Callback;)V", TrackConstants.LOGOUT, "setUserAgent", "agent", "getUserAgent", "appendUserAgent", "openLoginPage", "currentServer", "currentRegion", "exportLog", "pageLoadFinished", "stat", "props", "Lcom/facebook/react/bridge/ReadableMap;", "convertReadableMapToMap", "", "readableMap", "convertReadableArrayToList", "", "readableArray", "Lcom/facebook/react/bridge/ReadableArray;", "getStatInfo", "statDynamicProperty", "openSysAppSettings", "openWifiSettings", "resetApp", "openShadowAccount", "destroyBridgeAndRestart", q.f13857a, "isNotificationOpened", "EnableHomeBack", "exitApp", "hideSystemUIBar", "showSystemUIBar", "getLocation", "requestLocation", "addGeoFence", "removeGeoFence", "getSupportPayList", "intentToPay", "skuList", "trackBundle", "pay", "payParams", "optionsMap", PaymentOrderType.DEDUCT, "share", "shareCustom", "map", "setSharedValue", "key", "getSharedValue", "SaveImage", "CaptureScreen", "showPictureSelect", "isAppInstalled", "packageName", "promIsPopShowed", "isPopShowed", "()Ljava/lang/String;", "dev", "isDev", "()Z", "setDev", "(Z)V", "rnInitModuleLoadFinish", "promIsDev", "getHostMode", "promGetHostMode", "unzip", "filePath", "targetPath", "startRequestLocation", "checkerUserPrivacySetting", "getSyncWebStatus", "openSyncWeb", "getDeviceList", "models", "convertDeviceModel", "Lcom/facebook/react/bridge/WritableMap;", "deviceModel", "Lcom/xiaomi/fitness/rn/export/RNDeviceModel;", "convertEcoDeviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "openPluginDevice", "did", "syncDeviceAll", "manualForce", "syncVipFromRN", "setABGroupId", "refreshUserProfile", "Companion", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCommonBridgeModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonBridgeModule.kt\ncom/xiaomi/wearable/yrn/modules/CommonBridgeModule\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1058:1\n216#2,2:1059\n32#3,2:1061\n1863#4,2:1063\n1863#4,2:1065\n1#5:1067\n*S KotlinDebug\n*F\n+ 1 CommonBridgeModule.kt\ncom/xiaomi/wearable/yrn/modules/CommonBridgeModule\n*L\n270#1:1059,2\n742#1:1061,2\n966#1:1063,2\n976#1:1065,2\n*E\n"})
public final class CommonBridgeModule extends ReactContextBaseJavaModule {

    @NotNull
    private static final String TAG = "CommonBridgeModule";

    @NotNull
    private final ReactApplicationContext application;

    /* JADX INFO: renamed from: fitnessSyncer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fitnessSyncer;

    @NotNull
    private final Handler mUiHandler;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.yrn.modules.CommonBridgeModule$getUserInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.yrn.modules.CommonBridgeModule$getUserInfo$1", f = "CommonBridgeModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Promise $promise;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.wearable.yrn.modules.CommonBridgeModule$getUserInfo$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.wearable.yrn.modules.CommonBridgeModule$getUserInfo$1$1", f = "CommonBridgeModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Promise $promise;
            final /* synthetic */ WritableMap $userInfo;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08981(Promise promise, WritableMap writableMap, Continuation<? super C08981> continuation) {
                super(2, continuation);
                this.$promise = promise;
                this.$userInfo = writableMap;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08981(this.$promise, this.$userInfo, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$promise.resolve(this.$userInfo);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C08981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.wearable.yrn.modules.CommonBridgeModule$getUserInfo$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.wearable.yrn.modules.CommonBridgeModule$getUserInfo$1$2", f = "CommonBridgeModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Exception $e;
            final /* synthetic */ Promise $promise;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Promise promise, Exception exc, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$promise = promise;
                this.$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$promise, this.$e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$promise.reject("GET_USER_INFO_ERROR", this.$e.getMessage());
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Promise promise, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$promise = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$promise, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                WritableMap writableMapCreateMap = Arguments.createMap();
                if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                    Logger.i(CommonBridgeModule.TAG, "getUserInfo: start get account info");
                    MiAccessToken serviceToken$default = TokenManager.DefaultImpls.getServiceToken$default(AccountManagerExtKt.getInstance(TokenManager.INSTANCE), null, false, 3, 3, null);
                    if ((serviceToken$default != null ? serviceToken$default.getUserId() : null) != null) {
                        String userId = serviceToken$default.getUserId();
                        Intrinsics.checkNotNull(userId);
                        writableMapCreateMap.putString("userId", userId);
                    }
                    if ((serviceToken$default != null ? serviceToken$default.getSecurity() : null) != null) {
                        String security = serviceToken$default.getSecurity();
                        Intrinsics.checkNotNull(security);
                        writableMapCreateMap.putString("ssecurity", security);
                    }
                    if ((serviceToken$default != null ? serviceToken$default.getCUserId() : null) != null) {
                        String cUserId = serviceToken$default.getCUserId();
                        Intrinsics.checkNotNull(cUserId);
                        writableMapCreateMap.putString("cUserId", cUserId);
                    }
                    if ((serviceToken$default != null ? serviceToken$default.getServiceToken() : null) != null) {
                        String serviceToken = serviceToken$default.getServiceToken();
                        Intrinsics.checkNotNull(serviceToken);
                        writableMapCreateMap.putString("serviceToken", serviceToken);
                    }
                    if ((serviceToken$default != null ? Boxing.boxLong(serviceToken$default.getTimeDiff()) : null) != null) {
                        writableMapCreateMap.putInt("timeDiff", (int) serviceToken$default.getTimeDiff());
                    }
                    Logger.i(CommonBridgeModule.TAG, "getUserInfo: end get account info (" + ((serviceToken$default != null ? serviceToken$default.getServiceToken() : null) != null) + ")");
                } else {
                    Logger.i(CommonBridgeModule.TAG, "getUserInfo: account not login");
                }
                AnyExtKt.main$default(null, new C08981(this.$promise, writableMapCreateMap, null), 1, null);
            } catch (Exception e) {
                Logger.e(CommonBridgeModule.TAG, "getUserInfo exception", e);
                AnyExtKt.main$default(null, new AnonymousClass2(this.$promise, e, null), 1, null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.yrn.modules.CommonBridgeModule$syncVipFromRN$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.yrn.modules.CommonBridgeModule$syncVipFromRN$1", f = "CommonBridgeModule.kt", i = {}, l = {1039}, m = "invokeSuspend", n = {}, s = {})
    public static final class C34921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C34921(Continuation<? super C34921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C34921(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MembershipHelper membershipHelperExtKt = MembershipHelperExtKt.getInstance(MembershipHelper.INSTANCE);
                this.label = 1;
                if (membershipHelperExtKt.getVipInfo(true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonBridgeModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.fitnessSyncer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: p54
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommonBridgeModule.fitnessSyncer_delegate$lambda$0();
            }
        });
        this.application = reactContext;
        this.mUiHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void back$lambda$4(String str) {
        WearableRouterManager wearableRouterManager = WearableRouterManager.INSTANCE;
        if (str == null) {
            str = "";
        }
        WearableRouterManager.backToPage$default(wearableRouterManager, str, null, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void backTo$lambda$5(String str, String str2) {
        WearableRouterManager wearableRouterManager = WearableRouterManager.INSTANCE;
        if (str == null) {
            str = "";
        }
        WearableRouterManager.backToPage$default(wearableRouterManager, str, str2, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void backToRoot$lambda$6(String str) {
        WearableRouterManager wearableRouterManager = WearableRouterManager.INSTANCE;
        if (str == null) {
            str = "";
        }
        WearableRouterManager.backToPage$default(wearableRouterManager, str, null, true, 2, null);
    }

    private final WritableMap convertDeviceModel(RNDeviceModel deviceModel) {
        String model;
        String productName;
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (deviceModel == null) {
            Intrinsics.checkNotNull(writableMapCreateMap);
            return writableMapCreateMap;
        }
        writableMapCreateMap.putString("did", deviceModel.getDid());
        Product product = deviceModel.getDeviceInfo().getProduct();
        String str = "";
        if (product == null || (model = product.getModel()) == null) {
            model = "";
        }
        writableMapCreateMap.putString("model", model);
        Product product2 = deviceModel.getDeviceInfo().getProduct();
        if (product2 != null && (productName = product2.getProductName()) != null) {
            str = productName;
        }
        writableMapCreateMap.putString("name", str);
        RNDevice rNDevice = (RNDevice) deviceModel.getDeviceInfo().device;
        writableMapCreateMap.putInt("status", rNDevice != null ? rNDevice.getStatus() : -1);
        Logger.d(TAG, "convertDeviceModel " + writableMapCreateMap);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    private final WritableMap convertEcoDeviceModel(EcoDeviceModel deviceModel) {
        String model;
        String productName;
        WritableMap writableMapCreateMap = Arguments.createMap();
        Logger.d(TAG, "convertDeviceModel " + (deviceModel != null ? Integer.valueOf(deviceModel.getDeviceStatus()) : null));
        if (deviceModel == null) {
            Intrinsics.checkNotNull(writableMapCreateMap);
            return writableMapCreateMap;
        }
        writableMapCreateMap.putString("did", deviceModel.getDid());
        Product product = deviceModel.getDeviceInfo().getProduct();
        String str = "";
        if (product == null || (model = product.getModel()) == null) {
            model = "";
        }
        writableMapCreateMap.putString("model", model);
        Product product2 = deviceModel.getDeviceInfo().getProduct();
        if (product2 != null && (productName = product2.getProductName()) != null) {
            str = productName;
        }
        writableMapCreateMap.putString("name", str);
        EcoDevice ecoDevice = (EcoDevice) deviceModel.getDeviceInfo().device;
        writableMapCreateMap.putInt("status", ecoDevice != null ? ecoDevice.getStatus() : -1);
        Logger.d(TAG, "convertDeviceModel " + writableMapCreateMap);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    private final List<Object> convertReadableArrayToList(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        if (readableArray == null) {
            return arrayList;
        }
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableType type = readableArray.getType(i);
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    arrayList.add(null);
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i)));
                    break;
                case 3:
                    double d = readableArray.getDouble(i);
                    int i2 = (int) d;
                    arrayList.add(d == ((double) i2) ? Integer.valueOf(i2) : Double.valueOf(d));
                    break;
                case 4:
                    arrayList.add(readableArray.getString(i));
                    break;
                case 5:
                    arrayList.add(convertReadableArrayToList(readableArray.getArray(i)));
                    break;
                case 6:
                    arrayList.add(convertReadableMapToMap(readableArray.getMap(i)));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return arrayList;
    }

    private final Map<String, Object> convertReadableMapToMap(ReadableMap readableMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (readableMap == null) {
            return linkedHashMap;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        Intrinsics.checkNotNullExpressionValue(readableMapKeySetIteratorKeySetIterator, "keySetIterator(...)");
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            ReadableType type = readableMap.getType(strNextKey);
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    linkedHashMap.put(strNextKey, null);
                    break;
                case 2:
                    linkedHashMap.put(strNextKey, Boolean.valueOf(readableMap.getBoolean(strNextKey)));
                    break;
                case 3:
                    double d = readableMap.getDouble(strNextKey);
                    int i = (int) d;
                    linkedHashMap.put(strNextKey, d == ((double) i) ? Integer.valueOf(i) : Double.valueOf(d));
                    break;
                case 4:
                    linkedHashMap.put(strNextKey, readableMap.getString(strNextKey));
                    break;
                case 5:
                    linkedHashMap.put(strNextKey, convertReadableArrayToList(readableMap.getArray(strNextKey)));
                    break;
                case 6:
                    linkedHashMap.put(strNextKey, convertReadableMapToMap(readableMap.getMap(strNextKey)));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deduct$lambda$15(Callback callback, boolean z, int i, MibiDeductResult result) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(result, "result");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(Constants.KEY_MARKET_DEDUCT_ID, result.getMarketDeductId());
        writableMapCreateMap.putString("orderId", result.getOrderId());
        writableMapCreateMap.putString(Constants.KEY_CHARGE_STATUS, result.getChargeStatus());
        writableMapCreateMap.putInt(Constants.KEY_PAY_STATUS, result.getPayStatus());
        writableMapCreateMap.putInt(Constants.KEY_DEDUCT_SIGN_STATUS, result.getDeductSignStatus());
        callback.invoke(Boolean.valueOf(z), Integer.valueOf(i), writableMapCreateMap);
        Logger.i(TAG, "pay success: " + z + ", code: " + i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessSyncer fitnessSyncer_delegate$lambda$0() {
        return FitnessSyncExtKt.getInstance(FitnessSyncer.INSTANCE);
    }

    private final FitnessSyncer getFitnessSyncer() {
        return (FitnessSyncer) this.fitnessSyncer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserProfile$lambda$9(Promise promise, UserProfile userProfile, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(promise, "$promise");
        Intrinsics.checkNotNullParameter(userProfile, "$userProfile");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("name", accountCoreInfo != null ? accountCoreInfo.getUserName() : null);
        writableMapCreateMap.putString("icon", accountCoreInfo != null ? accountCoreInfo.getAvatarAddress() : null);
        writableMapCreateMap.putString("sex", userProfile.getSex());
        writableMapCreateMap.putString(MedicalIdSPContract.PREF_BIRTHDAY, userProfile.getBirth());
        writableMapCreateMap.putDouble("height", userProfile.getHeight());
        writableMapCreateMap.putDouble("weight", userProfile.getWeight());
        writableMapCreateMap.putString("region", userProfile.getRegion());
        promise.resolve(writableMapCreateMap);
        Logger.i(TAG, "getUserProfile");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initialize$lambda$1(boolean z) {
        Logger.i(TAG, "account change state: " + z);
        if (!z) {
            YRNPushHandlerExtKt.getInstance(YRNPushHandler.INSTANCE).clearMessages();
        }
        WearableRNManager.INSTANCE.sendJSEvent(z ? "USER_ACCOUNT_LOGIN" : "USER_ACCOUNT_LOGOUT", null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openUri$lambda$3(String url, Promise promise) {
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(promise, "$promise");
        WearableRouterManager.INSTANCE.openPage(url, promise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pay$lambda$13(Callback callback, boolean z, MibiPayError errorMsg, MibiPayResult mibiPayResult) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        callback.invoke(Boolean.valueOf(z), Integer.valueOf(errorMsg.getCode()), errorMsg.getMsg());
        Logger.i(TAG, "pay success:" + z + ", errorMsg:" + errorMsg);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shouldOpenUrl$lambda$2(String url, Promise promise) {
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(promise, "$promise");
        WearableRouterManager.INSTANCE.openPage(url, promise);
    }

    private final void startRequestLocation(Callback callback) {
    }

    @ReactMethod
    public final void CaptureScreen(@Nullable ReadableMap map, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @ReactMethod
    public final void EnableHomeBack() {
    }

    @ReactMethod
    public final void SaveImage(@Nullable ReadableMap map, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @ReactMethod
    public final void addGeoFence(@NotNull ReadableMap config, @Nullable Callback callback) {
        Intrinsics.checkNotNullParameter(config, "config");
    }

    @ReactMethod
    public final void appendUserAgent(@Nullable String agent) {
    }

    @ReactMethod
    public final void back(@Nullable final String instance, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.mUiHandler.post(new Runnable() { // from class: w54
            @Override // java.lang.Runnable
            public final void run() {
                CommonBridgeModule.back$lambda$4(instance);
            }
        });
        Logger.i(TAG, "back " + instance);
    }

    @ReactMethod
    public final void backTo(@Nullable final String instance, @Nullable final String url, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.mUiHandler.post(new Runnable() { // from class: u54
            @Override // java.lang.Runnable
            public final void run() {
                CommonBridgeModule.backTo$lambda$5(instance, url);
            }
        });
        Logger.i(TAG, "backTo " + instance + " " + url);
    }

    @ReactMethod
    public final void backToRoot(@Nullable final String instance, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.mUiHandler.post(new Runnable() { // from class: t54
            @Override // java.lang.Runnable
            public final void run() {
                CommonBridgeModule.backToRoot$lambda$6(instance);
            }
        });
    }

    @ReactMethod
    public final void checkerUserPrivacySetting(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (RegionPreference.INSTANCE.getPRIVACY_AGREE()) {
            if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                callback.invoke(Boolean.TRUE);
                return;
            } else {
                callback.invoke(Boolean.FALSE);
                CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
                return;
            }
        }
        callback.invoke(Boolean.FALSE);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            PrivacyExtKt.showPrivacyActivity$default(currentActivity, null, null, 6, null);
        }
    }

    @ReactMethod
    public final void currentRegion(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry());
    }

    @ReactMethod
    public final void currentServer(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        callback.invoke(lowerCase);
    }

    @ReactMethod
    public final void deduct(@NotNull String payParams, @NotNull ReadableMap optionsMap, @NotNull final Callback callback) {
        Intrinsics.checkNotNullParameter(payParams, "payParams");
        Intrinsics.checkNotNullParameter(optionsMap, "optionsMap");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (fragmentActivity == null) {
            return;
        }
        String string = optionsMap.getString("channel");
        if (string == null) {
            string = "WXPAYDEDUCT";
        }
        PayManagerExtKt.getInstance(PaymentManager.INSTANCE).signDeduct(fragmentActivity, string, payParams, new Function3() { // from class: v54
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return CommonBridgeModule.deduct$lambda$15(callback, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), (MibiDeductResult) obj3);
            }
        });
    }

    @ReactMethod
    public final void destroyBridgeAndRestart(@NotNull ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
    }

    @ReactMethod
    public final void exitApp() {
    }

    @ReactMethod
    public final void exportLog() {
    }

    @ReactMethod
    public final void getAllCookie(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            callback.invoke(CookieManager.getInstance().getCookie(""));
        } catch (Exception e) {
            Logger.e(TAG, "getAllCookie exception", e);
            callback.invoke(null);
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @NotNull
    public final WritableArray getAllRnVersion() {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        HashMap<String, YRNBundleInfo> mapB = tur.a().b(WearableRNManager.INSTANCE.appName());
        Intrinsics.checkNotNull(mapB);
        Iterator<Map.Entry<String, YRNBundleInfo>> it = mapB.entrySet().iterator();
        while (it.hasNext()) {
            YRNBundleInfo value = it.next().getValue();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("version", value.getVersion());
            writableMapCreateMap.putString(RnReportConst.ApiReport.PARAM_MODULE, value.getModule());
            writableMapCreateMap.putString("maketime", value.getMaketime());
            writableMapCreateMap.putString("md5", value.getMd5());
            writableMapCreateMap.putString("bundlePath", value.getBundlePath());
            writableMapCreateMap.putInt("maxNativeApiLevel", value.getMaxNativeApiLevel());
            writableMapCreateMap.putInt("maxCommonJSApiLevel", value.getMaxCommonJSApiLevel());
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        Logger.i(TAG, "getAllRnVersion:" + writableArrayCreateArray);
        Intrinsics.checkNotNull(writableArrayCreateArray);
        return writableArrayCreateArray;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @NotNull
    public Map<String, Object> getConstants() {
        HashMap mapB = e4f.b();
        Intrinsics.checkNotNullExpressionValue(mapB, "newHashMap(...)");
        ReactApplicationContext reactApplicationContext = this.application;
        String packageName = reactApplicationContext.getPackageName();
        try {
            boolean zEquals = StringsKt__StringsJVMKt.equals(Build.MANUFACTURER, "Xiaomi", true);
            mapB.put("AppName", "");
            mapB.put("AppKey", "");
            mapB.put("AppVersion", "");
            mapB.put("AppVersionCode", "");
            mapB.put("OsName", YRNConstants.PLATFORM);
            String str = Build.VERSION.RELEASE;
            if (str == null) {
                str = "";
            }
            mapB.put("OsVersion", str);
            String str2 = Build.VERSION.INCREMENTAL;
            if (str2 == null) {
                str2 = "";
            }
            mapB.put("OsIncremental", str2);
            String str3 = Build.BRAND;
            if (str3 == null) {
                str3 = "";
            }
            mapB.put("OSBrand", str3);
            mapB.put("IsMiui", Boolean.valueOf(zEquals));
            mapB.put("PackageName", packageName);
            String str4 = Build.MODEL;
            if (str4 == null) {
                str4 = "";
            }
            mapB.put("DeviceModel", str4);
            mapB.put("IMEI", "");
            mapB.put("OAID", "");
            mapB.put("DeviceId", "");
            mapB.put("UA_pixels", reactApplicationContext.getResources().getDisplayMetrics().widthPixels + "x" + reactApplicationContext.getResources().getDisplayMetrics().heightPixels);
            String property = System.getProperty("http.agent");
            if (property == null) {
                property = "";
            }
            mapB.put("UserAgent", property);
            mapB.put("IDFA", "");
            mapB.put("StatusBarHeight", Integer.valueOf(UIUtils.INSTANCE.getStatusBarHeight(this.application)));
            mapB.put("SplitBundlePath", WearableRNManager.INSTANCE.bundleRootPath());
            Boolean bool = Boolean.FALSE;
            mapB.put("alipay", bool);
            mapB.put("mipay", bool);
            mapB.put("unionmipay", bool);
            mapB.put("wxpay", bool);
            mapB.put("ucashier", bool);
            mapB.put("unioncloudpay", bool);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Logger.d(TAG, "getConstants:" + mapB);
        return mapB;
    }

    @ReactMethod
    public final void getCookie(@NotNull String name, @NotNull String domain, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            String cookie = CookieManager.getInstance().getCookie(domain);
            if (cookie != null) {
                for (String str : StringsKt__StringsKt.split$default((CharSequence) cookie, new String[]{";"}, false, 0, 6, (Object) null)) {
                    if (StringsKt__StringsJVMKt.startsWith$default(StringsKt__StringsKt.trim((CharSequence) str).toString(), name + "=", false, 2, null)) {
                        String strSubstring = StringsKt__StringsKt.trim((CharSequence) str).toString().substring(name.length() + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        callback.invoke(strSubstring);
                        return;
                    }
                }
            }
            callback.invoke(null);
        } catch (Exception e) {
            Logger.e(TAG, "getCookie exception", e);
            callback.invoke(null);
        }
    }

    @ReactMethod
    public final void getCurrentSenseStack(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @ReactMethod
    public final void getDeviceList(@Nullable ReadableArray models, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList<Object> arrayList = models != null ? models.toArrayList() : null;
        WritableArray writableArrayCreateArray = Arguments.createArray();
        RNDeviceManager.Companion companion = RNDeviceManager.INSTANCE;
        Logger.d(TAG, "convertDeviceModel " + RNDeviceManagerExtKt.getInstance(companion).getDeviceSize() + "  ecoSize:" + EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceSize() + ",modelList:" + arrayList);
        for (RNDeviceModel rNDeviceModel : RNDeviceManagerExtKt.getInstance(companion).getDeviceModels()) {
            if ((arrayList != null && arrayList.isEmpty()) || (arrayList != null && arrayList.contains(DeviceModelExtKt.getModel(rNDeviceModel)))) {
                if (!Intrinsics.areEqual(DeviceModelExtKt.getModel(rNDeviceModel), "yunmai.scales.ms3001")) {
                    writableArrayCreateArray.pushMap(convertDeviceModel(rNDeviceModel));
                }
            }
        }
        for (EcoDeviceModel ecoDeviceModel : EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModels()) {
            if ((arrayList != null && arrayList.isEmpty()) || (arrayList != null && arrayList.contains(EcoDeviceModelExtKt.getModel(ecoDeviceModel)))) {
                writableArrayCreateArray.pushMap(convertEcoDeviceModel(ecoDeviceModel));
            }
        }
        callback.invoke(writableArrayCreateArray);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @NotNull
    public final String getHostMode() {
        return RNEnvironmentPreference.INSTANCE.getRN_ENVIRONMENT();
    }

    @ReactMethod
    public final void getHttpUA(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @ReactMethod
    public final void getLocation(@Nullable Callback callback) {
        requestLocation(callback);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void getSharedValue(@Nullable String key, @Nullable Callback callback) {
    }

    @ReactMethod
    public final void getStatInfo(@Nullable Callback callback) {
    }

    @ReactMethod
    public final void getSupportPayList(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @ReactMethod
    public final void getSyncWebStatus(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        RegionPreference regionPreference = RegionPreference.INSTANCE;
        Logger.w(TAG, "getSyncWeb:" + regionPreference.getSyncWeb());
        callback.invoke(Boolean.valueOf(regionPreference.getSyncWeb()));
    }

    @ReactMethod
    public final void getUserAgent(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @ReactMethod
    public final void getUserInfo(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        AnyExtKt.io$default(null, new AnonymousClass1(promise, null), 1, null);
    }

    @ReactMethod
    public final void getUserProfile(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        UserInfoManager.Companion companion = UserInfoManager.INSTANCE;
        final UserProfile userProfile$default = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(companion), false, 1, null);
        UserInfoManager.getAccountCoreInfo$default(AccountManagerExtKt.getInstance(companion), false, new Function1() { // from class: y54
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CommonBridgeModule.getUserProfile$lambda$9(promise, userProfile$default, (AccountCoreInfo) obj);
            }
        }, 1, null);
    }

    @ReactMethod
    public final void hideSystemUIBar() {
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        Logger.i(TAG, "register account change");
        AccountManagerExtKt.getInstance(AccountManager.INSTANCE).addAccountListener(new Function1() { // from class: r54
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CommonBridgeModule.initialize$lambda$1(((Boolean) obj).booleanValue());
            }
        });
    }

    @ReactMethod
    public final void intentToPay(@NotNull ReadableArray skuList, @NotNull ReadableMap trackBundle) {
        ReadableArray skuList2 = skuList;
        Intrinsics.checkNotNullParameter(skuList2, "skuList");
        Intrinsics.checkNotNullParameter(trackBundle, "trackBundle");
        Activity currentActivity = getCurrentActivity();
        WearableRNActivity wearableRNActivity = currentActivity instanceof WearableRNActivity ? (WearableRNActivity) currentActivity : null;
        if (wearableRNActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = skuList.size();
        int i = 0;
        while (i < size) {
            ReadableMap map = skuList2.getMap(i);
            if (map != null) {
                PaymentManager payManagerExtKt = PayManagerExtKt.getInstance(PaymentManager.INSTANCE);
                String string = map.getString("spuId");
                Integer numValueOf = Integer.valueOf(map.getInt("spuVersion"));
                String string2 = map.getString("skuId");
                Long lValueOf = Long.valueOf(map.getInt(Constants.KEY_PRICE));
                long j = map.getInt("quantity");
                String string3 = map.getString("productId");
                if (string3 == null) {
                    string3 = "";
                }
                String string4 = map.getString("skuName");
                arrayList.add(payManagerExtKt.buildSkuObject(string, numValueOf, string2, lValueOf, j, string3, string4 == null ? "" : string4));
            }
            i++;
            skuList2 = skuList;
        }
        Bundle bundle = new Bundle();
        Iterator<Map.Entry<String, Object>> entryIterator = trackBundle.getEntryIterator();
        Intrinsics.checkNotNullExpressionValue(entryIterator, "getEntryIterator(...)");
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            String key = next.getKey();
            Object value = next.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
            bundle.putInt(key, ((Integer) value).intValue());
        }
        PaymentManager.DefaultImpls.intentToPay$default(PayManagerExtKt.getInstance(PaymentManager.INSTANCE), wearableRNActivity, arrayList, 0, false, false, false, false, 0, null, bundle, null, 1532, null);
    }

    @ReactMethod
    public final void isAppInstalled(@Nullable String packageName, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean isDev() {
        return true;
    }

    @ReactMethod
    public final void isNotificationOpened(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @NotNull
    public final String isPopShowed() {
        return "";
    }

    @ReactMethod
    public final void logout() {
        AccountManagerExtKt.getInstance(AccountManager.INSTANCE).logout();
    }

    @ReactMethod
    public final void openChangePasswordPageWithCallback(@Nullable Callback callback) {
    }

    @ReactMethod
    public final void openLoginPage() {
    }

    @ReactMethod
    public final void openPluginDevice(@NotNull String did) {
        Object next;
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(TAG, "openPluginDevice：" + did);
        Iterator it = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModels().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((EcoDeviceModel) next).getDid(), did));
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) next;
        if (ecoDeviceModel == null) {
            RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).openPlugin(did);
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            String mac = EcoDeviceModelExtKt.getMac(ecoDeviceModel);
            if (mac == null) {
                mac = "";
            }
            ElectronicScaleManagerExtKt.launchToElectronicScaleMainActivity$default(currentActivity, did, mac, false, 4, null);
        }
    }

    @ReactMethod
    public final void openSyncWeb(@NotNull final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof FragmentActivity)) {
            Logger.e(TAG, "没有可用的activity");
        } else {
            TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).showCloudSyncDialog((FragmentActivity) currentActivity, new IWebSync() { // from class: com.xiaomi.wearable.yrn.modules.CommonBridgeModule.openSyncWeb.1
                @Override // com.xiaomi.fitness.mine.export.IWebSync
                public void onPrivacyNotAgree() {
                    IWebSync.DefaultImpls.onPrivacyNotAgree(this);
                }

                @Override // com.xiaomi.fitness.mine.export.IWebSync
                public void onWebSyncAccepted() {
                    callback.invoke(Boolean.TRUE);
                }

                @Override // com.xiaomi.fitness.mine.export.IWebSync
                public void onWebSyncDenied() {
                    callback.invoke(Boolean.FALSE);
                }
            });
        }
    }

    @ReactMethod
    public final void openSysAppSettings() {
        Intent intent = new Intent("android.settings.SETTINGS");
        intent.setFlags(268435456);
        this.application.startActivity(intent);
    }

    @ReactMethod
    public final void openUri(@NotNull String instance, @NotNull final String url, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.mUiHandler.post(new Runnable() { // from class: q54
            @Override // java.lang.Runnable
            public final void run() {
                CommonBridgeModule.openUri$lambda$3(url, promise);
            }
        });
    }

    @ReactMethod
    public final void openWifiSettings() {
        Intent intent = new Intent("android.settings.WIFI_SETTINGS");
        intent.setFlags(268435456);
        this.application.startActivity(intent);
    }

    @ReactMethod
    public final void pageLoadFinished() {
    }

    @ReactMethod
    public final void pay(@NotNull String payParams, @NotNull ReadableMap optionsMap, @NotNull final Callback callback) {
        Intrinsics.checkNotNullParameter(payParams, "payParams");
        Intrinsics.checkNotNullParameter(optionsMap, "optionsMap");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (fragmentActivity == null) {
            return;
        }
        String string = optionsMap.getString("channel");
        if (string == null) {
            string = "WXPAY";
        }
        PaymentManager.DefaultImpls.payChannel$default(PayManagerExtKt.getInstance(PaymentManager.INSTANCE), fragmentActivity, string, payParams, false, false, false, false, new Function3() { // from class: s54
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return CommonBridgeModule.pay$lambda$13(callback, ((Boolean) obj).booleanValue(), (MibiPayError) obj2, (MibiPayResult) obj3);
            }
        }, 120, null);
    }

    @ReactMethod
    public final void promGetAllRnVersion(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(getAllRnVersion());
    }

    @ReactMethod
    public final void promGetHostMode(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(getHostMode());
        Logger.i(TAG, "promGetHostMode:" + getHostMode());
    }

    @ReactMethod
    public final void promIsDev(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public final void promIsPopShowed(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
    }

    @ReactMethod
    public final void refreshUserProfile() {
        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).getUserInfoFromWeb();
    }

    @ReactMethod
    public final void removeAllCookies(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.removeAllCookies(null);
            cookieManager.flush();
            callback.invoke(Boolean.TRUE);
            Logger.i(TAG, "removeAllCookies");
        } catch (Exception e) {
            callback.invoke(Boolean.FALSE);
            Logger.e(TAG, "removeAllCookies exception", e);
        }
    }

    @ReactMethod
    public final void removeCookie(@Nullable String name, @NotNull String domain, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            if (name != null) {
                cookieManager.setCookie(domain, name + "=; expires=Thu, 01 Jan 1970 00:00:00 GMT");
            } else {
                cookieManager.setCookie(domain, "expires=Thu, 01 Jan 1970 00:00:00 GMT");
            }
            cookieManager.flush();
            callback.invoke(Boolean.TRUE);
            Logger.i(TAG, "removeCookie: domain=" + domain + ", name=" + name);
        } catch (Exception e) {
            callback.invoke(Boolean.FALSE);
            Logger.e(TAG, "removeCookie exception", e);
        }
    }

    @ReactMethod
    public final void removeGeoFence(@Nullable Promise promise) {
    }

    @ReactMethod
    public final void requestLocation(@Nullable Callback callback) {
    }

    @ReactMethod
    public final void resetApp(boolean openShadowAccount) {
    }

    @ReactMethod
    public final void rnInitModuleLoadFinish() {
        Logger.i(TAG, "rnInitModuleLoadFinish RN init module 模块加载完成");
        YRNPushHandlerExtKt.getInstance(YRNPushHandler.INSTANCE).afterInit();
    }

    @ReactMethod
    public final void setABGroupId(@NotNull ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(readableArray, "readableArray");
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            String string = readableArray.getString(i);
            if (string != null) {
                arrayList.add(string);
            }
        }
        ICompareKt.getINSTANCE(ICompare.INSTANCE).setGroupId(arrayList);
    }

    @ReactMethod
    public final void setCookie(@NotNull String name, @NotNull String value, @NotNull String domain, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setCookie(domain, name + "=" + value);
            cookieManager.flush();
            callback.invoke(Boolean.TRUE);
        } catch (Exception e) {
            callback.invoke(Boolean.FALSE);
            Logger.e(TAG, "setCookie exception", e);
        }
    }

    @ReactMethod
    public final void setDev(boolean z) {
    }

    @ReactMethod
    public final void setSharedValue(@Nullable String key, @Nullable String value, @Nullable Callback callback) {
    }

    @ReactMethod
    public final void setUserAgent(@NotNull String agent) {
        Intrinsics.checkNotNullParameter(agent, "agent");
    }

    @ReactMethod
    public final void share(@Nullable String name, @Nullable String url, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @ReactMethod
    public final void shareCustom(@Nullable ReadableMap map, @Nullable Callback callback) {
    }

    @ReactMethod
    public final void shouldOpenOperationsPage(@Nullable String url, int type, @Nullable String source, @Nullable String contentSource, @Nullable String exposeSource) {
        if (url == null) {
            return;
        }
        BannerExtKt.getINSTANCE(IBanner.INSTANCE).onBannerV2Click(url, type, null, contentSource == null ? "" : contentSource, exposeSource == null ? "" : exposeSource, source == null ? "" : source);
    }

    @ReactMethod
    public final void shouldOpenUrl(@NotNull String instance, @NotNull final String url, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.mUiHandler.post(new Runnable() { // from class: x54
            @Override // java.lang.Runnable
            public final void run() {
                CommonBridgeModule.shouldOpenUrl$lambda$2(url, promise);
            }
        });
        Logger.i(TAG, "shouldOpenUrl " + instance + " " + url);
    }

    @ReactMethod
    public final void showPictureSelect(@NotNull ReadableMap map, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @ReactMethod
    public final void showSystemUIBar() {
    }

    @ReactMethod
    public final void stat(@NotNull ReadableMap props, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            Map<String, ? extends Object> mutableMap = MapsKt__MapsKt.toMutableMap(convertReadableMapToMap(props));
            String string = props.hasKey("event_type") ? props.getString("event_type") : "";
            if (string != null && string.length() != 0) {
                mutableMap.remove("event_type");
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(string, mutableMap);
                promise.resolve(null);
                return;
            }
            promise.reject("STAT_ERROR", "eventName empty");
        } catch (Exception e) {
            promise.reject("STAT_ERROR", e.getMessage());
        }
    }

    @ReactMethod
    public final void statDynamicProperty(@NotNull ReadableMap props) {
        Intrinsics.checkNotNullParameter(props, "props");
    }

    @ReactMethod
    public final void syncDeviceAll(boolean manualForce) {
        Logger.i(TAG, "syncDeviceAll");
        getFitnessSyncer().triggerDataSync(manualForce);
    }

    @ReactMethod
    public final void syncVipFromRN() {
        AnyExtKt.io$default(null, new C34921(null), 1, null);
    }

    @ReactMethod
    public final void unzip(@NotNull String filePath, @NotNull String targetPath, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(targetPath, "targetPath");
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(Boolean.valueOf(im9.T(filePath, targetPath)));
    }

    @ReactMethod
    public final void updateLoginInfo(@NotNull String sid, @NotNull String domain, boolean forceLogin) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(domain, "domain");
    }

    @ReactMethod
    public final void updateToken(@Nullable String sid, @Nullable Integer serverTime, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Logger.i(TAG, "updateToken: start update token");
        TokenManager accountManagerExtKt = AccountManagerExtKt.getInstance(TokenManager.INSTANCE);
        if (sid == null) {
            sid = "";
        }
        MiAccessToken serviceToken = accountManagerExtKt.getServiceToken(sid, true, 2);
        if (serviceToken == null) {
            Logger.i(TAG, "updateToken: end, token null");
            callback.invoke(null);
        } else {
            if (serverTime != null) {
                serviceToken.setTimeDiff(((long) serverTime.intValue()) - System.currentTimeMillis());
            }
            Logger.i(TAG, "updateToken: end");
            callback.invoke(serviceToken.getServiceToken());
        }
    }
}
