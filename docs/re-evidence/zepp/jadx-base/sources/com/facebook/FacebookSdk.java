package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.AsyncTask;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.AppEventsManager;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.LockOnGetVariable;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.InstrumentManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.y;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.m;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004²\u0001³\u0001B\u000b\b\u0002¢\u0006\u0006\b°\u0001\u0010±\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000bH\u0007J\b\u0010\u000f\u001a\u00020\u000bH\u0007J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000bH\u0007J\b\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0012H\u0007J\b\u0010\u0016\u001a\u00020\u000bH\u0007J\b\u0010\u0017\u001a\u00020\u0012H\u0007J\b\u0010\u0018\u001a\u00020\u0012H\u0007J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0012H\u0007J\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007J\"\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010 H\u0007J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0007J\u001a\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0007J\b\u0010\"\u001a\u00020\u000bH\u0007J\b\u0010#\u001a\u00020\u0005H\u0007J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0007J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020%H\u0007J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010'\u001a\u00020%H\u0007J\b\u0010*\u001a\u00020\u0005H\u0007J\u0010\u0010+\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020%H\u0007J\b\u0010,\u001a\u00020\u0005H\u0002J\b\u0010-\u001a\u00020\u0012H\u0007J\b\u0010.\u001a\u00020\u001bH\u0007J\u0018\u00101\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0012H\u0007J\u0018\u00102\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0012H\u0003J\b\u00103\u001a\u00020\u0012H\u0007J\u0010\u00104\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u001bH\u0007J\u0018\u00106\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u000bH\u0007J\u0019\u00109\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0004\b7\u00108J\u0014\u0010:\u001a\u0004\u0018\u00010\u00122\b\u0010/\u001a\u0004\u0018\u00010\u001bH\u0007J\b\u0010;\u001a\u00020\u0012H\u0007J\u0010\u0010<\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0012H\u0007J\n\u0010=\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u0010?\u001a\u00020\u00052\b\u0010>\u001a\u0004\u0018\u00010\u0012H\u0007J\n\u0010@\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u0010B\u001a\u00020\u00052\b\u0010A\u001a\u0004\u0018\u00010\u0012H\u0007J\b\u0010C\u001a\u00020\u000bH\u0007J\u0010\u0010E\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u000bH\u0007J\b\u0010F\u001a\u00020\u000bH\u0007J\u0010\u0010G\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u000bH\u0007J\b\u0010H\u001a\u00020\u000bH\u0007J\b\u0010I\u001a\u00020\u000bH\u0007J\b\u0010J\u001a\u00020\u000bH\u0007J\u0010\u0010K\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u000bH\u0007J\u0010\u0010L\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u000bH\u0007J\b\u0010M\u001a\u00020\u000bH\u0007J\u0010\u0010N\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u000bH\u0007J\u001f\u0010Q\u001a\u00020\u00052\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010OH\u0007¢\u0006\u0004\bQ\u0010RJ/\u0010Q\u001a\u00020\u00052\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010O2\u0006\u0010S\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020\u001dH\u0007¢\u0006\u0004\bQ\u0010UJ\n\u0010W\u001a\u0004\u0018\u00010VH\u0007J\u0010\u0010Y\u001a\u00020\u00052\u0006\u0010X\u001a\u00020VH\u0007J\b\u0010Z\u001a\u00020\u001dH\u0007J\u0010\u0010\\\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020\u001dH\u0007J\u0017\u0010a\u001a\u00020\u00052\u0006\u0010^\u001a\u00020]H\u0001¢\u0006\u0004\b_\u0010`R\u0018\u0010c\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010bR&\u0010g\u001a\u0012\u0012\u0004\u0012\u00020%0dj\b\u0012\u0004\u0012\u00020%`e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010fR\u0016\u0010j\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u00100\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010bR\u0018\u0010>\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010bR\u0018\u0010p\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010bR\u0018\u0010s\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010w\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010z\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010yR\u001c\u0010X\u001a\b\u0012\u0004\u0012\u00020V0|8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010iR\u001a\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010bR\u0018\u0010\u0088\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010iR\u0018\u0010\u008a\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010bR\u0018\u0010\u008c\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010bR\u0018\u0010\u008d\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010bR\u0018\u0010\u008e\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010bR\u0018\u0010\u008f\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010bR\u0018\u0010\u0090\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010bR\u0018\u0010\u0091\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010bR\u0018\u0010\u0092\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010bR\u0018\u0010\u0093\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010bR\u0018\u0010\u0094\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010bR\u0018\u0010\u0095\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010bR\u0018\u0010\u0096\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010bR\u0018\u0010\u0097\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010bR\u0018\u0010\u0098\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010bR\u0018\u0010\u0099\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010bR\u0018\u0010\u009a\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010bR\u0018\u0010\u009b\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010bR\u0018\u0010\u009c\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010bR\u0018\u0010\u009d\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010bR\u0018\u0010\u009e\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010yR\u0018\u0010\u009f\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009f\u0001\u0010yR\u0018\u0010 \u0001\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010yR\u0018\u0010¡\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b¡\u0001\u0010bR\u0018\u0010¢\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b¢\u0001\u0010bR\u0018\u0010£\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b£\u0001\u0010bR\u0018\u0010¤\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b¤\u0001\u0010bR\u0018\u0010¥\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b¥\u0001\u0010bR\u001a\u0010©\u0001\u001a\u00030¦\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010«\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bª\u0001\u0010bR\u0017\u0010\u0019\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010bR\u0018\u0010^\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0017\u0010\u0016\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¯\u0001\u0010y¨\u0006´\u0001"}, d2 = {"Lcom/facebook/FacebookSdk;", "", "Ljava/util/concurrent/Executor;", "getExecutor", "executor", "", "setExecutor", "", "getOnProgressThreshold", "threshold", "setOnProgressThreshold", "", "isDebugEnabled", Constants.ENABLED, "setIsDebugEnabled", "isLegacyTokenUpgradeSupported", "supported", "setLegacyTokenUpgradeSupported", "", "getGraphApiVersion", "graphApiVersion", "setGraphApiVersion", "isFullyInitialized", "getFacebookDomain", "getInstagramDomain", "facebookDomain", "setFacebookDomain", "Landroid/content/Context;", "applicationContext", "", "callbackRequestCodeOffset", "sdkInitialize", "Lcom/facebook/FacebookSdk$InitializeCallback;", "callback", "isInitialized", "fullyInitialize", "", "Lcom/facebook/LoggingBehavior;", "getLoggingBehaviors", "behavior", "addLoggingBehavior", "removeLoggingBehavior", "clearLoggingBehaviors", "isLoggingBehaviorEnabled", "b", "getGraphDomain", "getApplicationContext", DbUtils.Const.Table.CONTEXT, "applicationId", "publishInstallAsync", "a", "getSdkVersion", "getLimitEventAndDataUsage", "limitEventUsage", "setLimitEventAndDataUsage", "loadDefaultsFromMetadata$facebook_core_release", "(Landroid/content/Context;)V", "loadDefaultsFromMetadata", "getApplicationSignature", "getApplicationId", "setApplicationId", "getApplicationName", "applicationName", "setApplicationName", "getClientToken", "clientToken", "setClientToken", "getAutoInitEnabled", "flag", "setAutoInitEnabled", "getAutoLogAppEventsEnabled", "setAutoLogAppEventsEnabled", "getCodelessDebugLogEnabled", "getCodelessSetupEnabled", "getAdvertiserIDCollectionEnabled", "setAdvertiserIDCollectionEnabled", "setCodelessDebugLogEnabled", "getMonitorEnabled", "setMonitorEnabled", "", "options", "setDataProcessingOptions", "([Ljava/lang/String;)V", "country", "state", "([Ljava/lang/String;II)V", "Ljava/io/File;", "getCacheDir", "cacheDir", "setCacheDir", "getCallbackRequestCodeOffset", "requestCode", "isFacebookRequestCode", "Lcom/facebook/FacebookSdk$GraphRequestCreator;", "graphRequestCreator", "setGraphRequestCreator$facebook_core_release", "(Lcom/facebook/FacebookSdk$GraphRequestCreator;)V", "setGraphRequestCreator", "Ljava/lang/String;", "TAG", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "loggingBehaviors", "c", LogUtil.I, "DEFAULT_CALLBACK_REQUEST_CODE_OFFSET", GoogleApiAvailabilityLight.a, "Ljava/util/concurrent/Executor;", "e", "f", "g", "appClientToken", "h", "Ljava/lang/Boolean;", "codelessDebugLogEnabled", "Ljava/util/concurrent/atomic/AtomicLong;", "i", "Ljava/util/concurrent/atomic/AtomicLong;", "onProgressThreshold", z.j, "Z", "isDebugEnabledField", hl.k, "Lcom/facebook/internal/LockOnGetVariable;", "l", "Lcom/facebook/internal/LockOnGetVariable;", "m", "Landroid/content/Context;", GoogleApiAvailabilityLight.b, "Ljava/util/concurrent/locks/ReentrantLock;", "o", "Ljava/util/concurrent/locks/ReentrantLock;", "LOCK", com.google.android.exoplayer2.text.ttml.b.r, DTransferConstants.SEARCH_KEY, "MAX_REQUEST_CODE_RANGE", "r", "ATTRIBUTION_PREFERENCES", SOAP.XMLNS, "PUBLISH_ACTIVITY_PATH", "CALLBACK_OFFSET_CHANGED_AFTER_INIT", "CALLBACK_OFFSET_NEGATIVE", "APP_EVENT_PREFERENCES", "DATA_PROCESSING_OPTIONS_PREFERENCES", "APPLICATION_ID_PROPERTY", "APPLICATION_NAME_PROPERTY", "CLIENT_TOKEN_PROPERTY", "WEB_DIALOG_THEME", "AUTO_INIT_ENABLED_PROPERTY", "AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY", "CODELESS_DEBUG_LOG_ENABLED_PROPERTY", "ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY", "CALLBACK_OFFSET_PROPERTY", "MONITOR_ENABLED_PROPERTY", "DATA_PROCESSION_OPTIONS", "DATA_PROCESSION_OPTIONS_COUNTRY", "DATA_PROCESSION_OPTIONS_STATE", "hasCustomTabsPrefetching", "ignoreAppSwitchToLoggedOut", "bypassAppSwitch", "INSTAGRAM", "GAMING", "FACEBOOK_COM", "FB_GG", "INSTAGRAM_COM", "Ljava/util/concurrent/atomic/AtomicBoolean;", "t", "Ljava/util/concurrent/atomic/AtomicBoolean;", "sdkInitialized", "u", "instagramDomain", "v", "w", "Lcom/facebook/FacebookSdk$GraphRequestCreator;", "x", "<init>", "()V", "GraphRequestCreator", "InitializeCallback", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookSdk {

    @NotNull
    public static final String ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY = "com.facebook.sdk.AdvertiserIDCollectionEnabled";

    @NotNull
    public static final String APPLICATION_ID_PROPERTY = "com.facebook.sdk.ApplicationId";

    @NotNull
    public static final String APPLICATION_NAME_PROPERTY = "com.facebook.sdk.ApplicationName";

    @NotNull
    public static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";

    @NotNull
    public static final String AUTO_INIT_ENABLED_PROPERTY = "com.facebook.sdk.AutoInitEnabled";

    @NotNull
    public static final String AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY = "com.facebook.sdk.AutoLogAppEventsEnabled";

    @NotNull
    public static final String CALLBACK_OFFSET_CHANGED_AFTER_INIT = "The callback request code offset can't be updated once the SDK is initialized. Call FacebookSdk.setCallbackRequestCodeOffset inside your Application.onCreate method";

    @NotNull
    public static final String CALLBACK_OFFSET_NEGATIVE = "The callback request code offset can't be negative.";

    @NotNull
    public static final String CALLBACK_OFFSET_PROPERTY = "com.facebook.sdk.CallbackOffset";

    @NotNull
    public static final String CLIENT_TOKEN_PROPERTY = "com.facebook.sdk.ClientToken";

    @NotNull
    public static final String CODELESS_DEBUG_LOG_ENABLED_PROPERTY = "com.facebook.sdk.CodelessDebugLogEnabled";

    @NotNull
    public static final String DATA_PROCESSING_OPTIONS_PREFERENCES = "com.facebook.sdk.DataProcessingOptions";

    @NotNull
    public static final String DATA_PROCESSION_OPTIONS = "data_processing_options";

    @NotNull
    public static final String DATA_PROCESSION_OPTIONS_COUNTRY = "data_processing_options_country";

    @NotNull
    public static final String DATA_PROCESSION_OPTIONS_STATE = "data_processing_options_state";

    @NotNull
    public static final String FB_GG = "fb.gg";

    @NotNull
    public static final String GAMING = "gaming";

    @NotNull
    public static final String INSTAGRAM = "instagram";

    @NotNull
    public static final String MONITOR_ENABLED_PROPERTY = "com.facebook.sdk.MonitorEnabled";

    @NotNull
    public static final String WEB_DIALOG_THEME = "com.facebook.sdk.WebDialogTheme";

    @JvmField
    public static boolean bypassAppSwitch = false;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static Executor executor = null;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static volatile String applicationId = null;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static volatile String applicationName = null;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static volatile String appClientToken = null;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static volatile Boolean codelessDebugLogEnabled = null;

    @JvmField
    public static boolean hasCustomTabsPrefetching = false;

    @JvmField
    public static boolean ignoreAppSwitchToLoggedOut = false;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static volatile boolean isDebugEnabledField = false;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static boolean isLegacyTokenUpgradeSupported = false;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static LockOnGetVariable<File> cacheDir = null;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static Context applicationContext = null;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private static final int MAX_REQUEST_CODE_RANGE = 100;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private static final String ATTRIBUTION_PREFERENCES = "com.facebook.sdk.attributionTracking";

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private static final String PUBLISH_ACTIVITY_PATH = "%s/activities";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private static boolean isFullyInitialized;

    @NotNull
    public static final FacebookSdk INSTANCE = new FacebookSdk();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = FacebookSdk.class.getCanonicalName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final HashSet<LoggingBehavior> loggingBehaviors = y.hashSetOf(LoggingBehavior.DEVELOPER_ERRORS);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static AtomicLong onProgressThreshold = new AtomicLong(65536);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int DEFAULT_CALLBACK_REQUEST_CODE_OFFSET = 64206;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static int callbackRequestCodeOffset = DEFAULT_CALLBACK_REQUEST_CODE_OFFSET;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static final ReentrantLock LOCK = new ReentrantLock();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private static String graphApiVersion = ServerProtocol.getDefaultAPIVersion();

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private static final AtomicBoolean sdkInitialized = new AtomicBoolean(false);

    @NotNull
    public static final String INSTAGRAM_COM = "instagram.com";

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private static volatile String instagramDomain = INSTAGRAM_COM;

    @NotNull
    public static final String FACEBOOK_COM = "facebook.com";

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private static volatile String facebookDomain = FACEBOOK_COM;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private static GraphRequestCreator graphRequestCreator = a.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bá\u0080\u0001\u0018\u00002\u00020\u0001J0\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¨\u0006\f"}, d2 = {"Lcom/facebook/FacebookSdk$GraphRequestCreator;", "", "Lcom/facebook/AccessToken;", "accessToken", "", "publishUrl", "Lorg/json/JSONObject;", "publishParams", "Lcom/facebook/GraphRequest$Callback;", "callback", "Lcom/facebook/GraphRequest;", "createPostRequest", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    @VisibleForTesting
    public interface GraphRequestCreator {
        @NotNull
        GraphRequest createPostRequest(@Nullable AccessToken accessToken, @Nullable String publishUrl, @Nullable JSONObject publishParams, @Nullable GraphRequest.Callback callback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/facebook/FacebookSdk$InitializeCallback;", "", "", "onInitialized", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface InitializeCallback {
        void onInitialized();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/facebook/AccessToken;", "accessToken", "", "publishUrl", "Lorg/json/JSONObject;", "publishParams", "Lcom/facebook/GraphRequest$Callback;", "callback", "Lcom/facebook/GraphRequest;", "createPostRequest", "(Lcom/facebook/AccessToken;Ljava/lang/String;Lorg/json/JSONObject;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements GraphRequestCreator {
        public static final a a = new a();

        @Override // com.facebook.FacebookSdk.GraphRequestCreator
        @NotNull
        public final GraphRequest createPostRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable GraphRequest.Callback callback) {
            return GraphRequest.INSTANCE.newPostRequest(accessToken, str, jSONObject, callback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;

        public b(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                FacebookSdk.INSTANCE.a(this.a, this.b);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/io/File;", "kotlin.jvm.PlatformType", "a", "()Ljava/io/File;"}, k = 3, mv = {1, 5, 1})
    public static final class c<V> implements Callable {
        public static final c a = new c();

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File call() {
            return FacebookSdk.access$getApplicationContext$p(FacebookSdk.INSTANCE).getCacheDir();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Constants.ENABLED, "", "onCompleted", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d implements FeatureManager.Callback {
        public static final d a = new d();

        @Override // com.facebook.internal.FeatureManager.Callback
        public final void onCompleted(boolean z) {
            if (z) {
                InstrumentManager.start();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Constants.ENABLED, "", "onCompleted", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e implements FeatureManager.Callback {
        public static final e a = new e();

        @Override // com.facebook.internal.FeatureManager.Callback
        public final void onCompleted(boolean z) {
            if (z) {
                AppEventsManager.start();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Constants.ENABLED, "", "onCompleted", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f implements FeatureManager.Callback {
        public static final f a = new f();

        @Override // com.facebook.internal.FeatureManager.Callback
        public final void onCompleted(boolean z) {
            if (z) {
                FacebookSdk.hasCustomTabsPrefetching = true;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Constants.ENABLED, "", "onCompleted", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g implements FeatureManager.Callback {
        public static final g a = new g();

        @Override // com.facebook.internal.FeatureManager.Callback
        public final void onCompleted(boolean z) {
            if (z) {
                FacebookSdk.ignoreAppSwitchToLoggedOut = true;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Constants.ENABLED, "", "onCompleted", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h implements FeatureManager.Callback {
        public static final h a = new h();

        @Override // com.facebook.internal.FeatureManager.Callback
        public final void onCompleted(boolean z) {
            if (z) {
                FacebookSdk.bypassAppSwitch = true;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/lang/Void;", "kotlin.jvm.PlatformType", "a", "()Ljava/lang/Void;"}, k = 3, mv = {1, 5, 1})
    public static final class i<V> implements Callable {
        public final /* synthetic */ InitializeCallback a;

        public i(InitializeCallback initializeCallback) {
            this.a = initializeCallback;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void call() {
            AccessTokenManager.INSTANCE.getInstance().loadCurrentAccessToken();
            ProfileManager.INSTANCE.getInstance().loadCurrentProfile();
            if (AccessToken.INSTANCE.isCurrentAccessTokenActive()) {
                Profile.Companion companion = Profile.INSTANCE;
                if (companion.getCurrentProfile() == null) {
                    companion.fetchProfileForCurrentAccessToken();
                }
            }
            InitializeCallback initializeCallback = this.a;
            if (initializeCallback != null) {
                initializeCallback.onInitialized();
            }
            AppEventsLogger.Companion companion2 = AppEventsLogger.INSTANCE;
            companion2.initializeLib(FacebookSdk.getApplicationContext(), FacebookSdk.access$getApplicationId$p(FacebookSdk.INSTANCE));
            UserSettingsManager.logIfAutoAppLinkEnabled();
            companion2.newLogger(FacebookSdk.getApplicationContext().getApplicationContext()).flush();
            return null;
        }
    }

    private FacebookSdk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, String applicationId2) {
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.INSTANCE.getAttributionIdentifiers(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences(ATTRIBUTION_PREFERENCES, 0);
                String str = applicationId2 + "ping";
                long j = sharedPreferences.getLong(str, 0L);
                try {
                    JSONObject jSONObjectForGraphAPICall = AppEventsLoggerUtility.getJSONObjectForGraphAPICall(AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, attributionIdentifiers, AppEventsLogger.INSTANCE.getAnonymousAppDeviceGUID(context), getLimitEventAndDataUsage(context), context);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    GraphRequest graphRequestCreatePostRequest = graphRequestCreator.createPostRequest(null, String.format(PUBLISH_ACTIVITY_PATH, Arrays.copyOf(new Object[]{applicationId2}, 1)), jSONObjectForGraphAPICall, null);
                    if (j == 0 && graphRequestCreatePostRequest.executeAndWait().getError() == null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putLong(str, System.currentTimeMillis());
                        editorEdit.apply();
                    }
                } catch (JSONException e2) {
                    throw new FacebookException("An error occurred while publishing install.", e2);
                }
            } catch (Exception e3) {
                Utility.logd("Facebook-publish", e3);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final /* synthetic */ Context access$getApplicationContext$p(FacebookSdk facebookSdk) {
        return applicationContext;
    }

    public static final /* synthetic */ String access$getApplicationId$p(FacebookSdk facebookSdk) {
        return applicationId;
    }

    @JvmStatic
    public static final void addLoggingBehavior(@NotNull LoggingBehavior behavior) {
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.add(behavior);
            INSTANCE.b();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void b() {
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        if (hashSet.contains(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
            if (hashSet.contains(loggingBehavior)) {
                return;
            }
            hashSet.add(loggingBehavior);
        }
    }

    @JvmStatic
    public static final void clearLoggingBehaviors() {
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void fullyInitialize() {
        isFullyInitialized = true;
    }

    @JvmStatic
    public static final boolean getAdvertiserIDCollectionEnabled() {
        return UserSettingsManager.getAdvertiserIDCollectionEnabled();
    }

    @JvmStatic
    @NotNull
    public static final Context getApplicationContext() {
        Validate.sdkInitialized();
        return applicationContext;
    }

    @JvmStatic
    @NotNull
    public static final String getApplicationId() {
        Validate.sdkInitialized();
        String str = applicationId;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    @JvmStatic
    @Nullable
    public static final String getApplicationName() {
        Validate.sdkInitialized();
        return applicationName;
    }

    @JvmStatic
    @Nullable
    public static final String getApplicationSignature(@Nullable Context context) {
        PackageManager packageManager;
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return null;
        }
        try {
            Validate.sdkInitialized();
            if (context != null && (packageManager = context.getPackageManager()) != null) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 64);
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr != null) {
                        if (!(signatureArr.length == 0)) {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                            messageDigest.update(packageInfo.signatures[0].toByteArray());
                            return Base64.encodeToString(messageDigest.digest(), 9);
                        }
                    }
                } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
            return null;
        }
    }

    @JvmStatic
    public static final boolean getAutoInitEnabled() {
        return UserSettingsManager.getAutoInitEnabled();
    }

    @JvmStatic
    public static final boolean getAutoLogAppEventsEnabled() {
        return UserSettingsManager.getAutoLogAppEventsEnabled();
    }

    @JvmStatic
    @Nullable
    public static final File getCacheDir() {
        Validate.sdkInitialized();
        return cacheDir.getValue();
    }

    @JvmStatic
    public static final int getCallbackRequestCodeOffset() {
        Validate.sdkInitialized();
        return callbackRequestCodeOffset;
    }

    @JvmStatic
    @Nullable
    public static final String getClientToken() {
        Validate.sdkInitialized();
        return appClientToken;
    }

    @JvmStatic
    public static final boolean getCodelessDebugLogEnabled() {
        Validate.sdkInitialized();
        Boolean bool = codelessDebugLogEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final boolean getCodelessSetupEnabled() {
        return UserSettingsManager.getCodelessSetupEnabled();
    }

    @JvmStatic
    @NotNull
    public static final Executor getExecutor() {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            if (executor == null) {
                executor = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            Executor executor2 = executor;
            if (executor2 != null) {
                return executor2;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @JvmStatic
    @NotNull
    public static final String getFacebookDomain() {
        return facebookDomain;
    }

    @JvmStatic
    @NotNull
    public static final String getGraphApiVersion() {
        String str = TAG;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Utility.logd(str, String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{graphApiVersion}, 1)));
        return graphApiVersion;
    }

    @JvmStatic
    @NotNull
    public static final String getGraphDomain() {
        AccessToken currentAccessToken = AccessToken.INSTANCE.getCurrentAccessToken();
        return Utility.getGraphDomainFromTokenDomain(currentAccessToken != null ? currentAccessToken.getGraphDomain() : null);
    }

    @JvmStatic
    @NotNull
    public static final String getInstagramDomain() {
        return instagramDomain;
    }

    @JvmStatic
    public static final boolean getLimitEventAndDataUsage(@NotNull Context context) {
        Validate.sdkInitialized();
        return context.getSharedPreferences(APP_EVENT_PREFERENCES, 0).getBoolean("limitEventUsage", false);
    }

    @JvmStatic
    @NotNull
    public static final Set<LoggingBehavior> getLoggingBehaviors() {
        Set<LoggingBehavior> setUnmodifiableSet;
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(hashSet));
        }
        return setUnmodifiableSet;
    }

    @JvmStatic
    public static final boolean getMonitorEnabled() {
        return UserSettingsManager.getMonitorEnabled();
    }

    @JvmStatic
    public static final long getOnProgressThreshold() {
        Validate.sdkInitialized();
        return onProgressThreshold.get();
    }

    @JvmStatic
    @NotNull
    public static final String getSdkVersion() {
        return FacebookSdkVersion.BUILD;
    }

    @JvmStatic
    public static final boolean isDebugEnabled() {
        return isDebugEnabledField;
    }

    @JvmStatic
    public static final boolean isFacebookRequestCode(int requestCode) {
        int i2 = callbackRequestCodeOffset;
        return requestCode >= i2 && requestCode < i2 + 100;
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final synchronized boolean isFullyInitialized() {
        return isFullyInitialized;
    }

    @JvmStatic
    public static final boolean isInitialized() {
        return sdkInitialized.get();
    }

    @JvmStatic
    public static final boolean isLegacyTokenUpgradeSupported() {
        return isLegacyTokenUpgradeSupported;
    }

    @JvmStatic
    public static final boolean isLoggingBehaviorEnabled(@NotNull LoggingBehavior behavior) {
        boolean z;
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            z = isDebugEnabled() && hashSet.contains(behavior);
        }
        return z;
    }

    @JvmStatic
    public static final void loadDefaultsFromMetadata$facebook_core_release(@Nullable Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return;
            }
            if (applicationId == null) {
                Object obj = applicationInfo.metaData.get(APPLICATION_ID_PROPERTY);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (m.startsWith$default(str.toLowerCase(Locale.ROOT), "fb", false, 2, null)) {
                        applicationId = str.substring(2);
                    } else {
                        applicationId = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (applicationName == null) {
                applicationName = applicationInfo.metaData.getString(APPLICATION_NAME_PROPERTY);
            }
            if (appClientToken == null) {
                appClientToken = applicationInfo.metaData.getString(CLIENT_TOKEN_PROPERTY);
            }
            if (callbackRequestCodeOffset == DEFAULT_CALLBACK_REQUEST_CODE_OFFSET) {
                callbackRequestCodeOffset = applicationInfo.metaData.getInt(CALLBACK_OFFSET_PROPERTY, DEFAULT_CALLBACK_REQUEST_CODE_OFFSET);
            }
            if (codelessDebugLogEnabled == null) {
                codelessDebugLogEnabled = Boolean.valueOf(applicationInfo.metaData.getBoolean(CODELESS_DEBUG_LOG_ENABLED_PROPERTY, false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @JvmStatic
    @VisibleForTesting(otherwise = 3)
    public static final void publishInstallAsync(@NotNull Context context, @NotNull String applicationId2) {
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return;
        }
        try {
            getExecutor().execute(new b(context.getApplicationContext(), applicationId2));
            if (FeatureManager.isEnabled(FeatureManager.Feature.OnDeviceEventProcessing) && OnDeviceProcessingManager.isOnDeviceProcessingEnabled()) {
                OnDeviceProcessingManager.sendInstallEventAsync(applicationId2, ATTRIBUTION_PREFERENCES);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
        }
    }

    @JvmStatic
    public static final void removeLoggingBehavior(@NotNull LoggingBehavior behavior) {
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.remove(behavior);
        }
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final synchronized void sdkInitialize(@NotNull Context applicationContext2, int callbackRequestCodeOffset2) {
        sdkInitialize(applicationContext2, callbackRequestCodeOffset2, null);
    }

    @JvmStatic
    public static final void setAdvertiserIDCollectionEnabled(boolean flag) {
        UserSettingsManager.setAdvertiserIDCollectionEnabled(flag);
    }

    @JvmStatic
    public static final void setApplicationId(@NotNull String applicationId2) {
        Validate.notEmpty(applicationId2, "applicationId");
        applicationId = applicationId2;
    }

    @JvmStatic
    public static final void setApplicationName(@Nullable String applicationName2) {
        applicationName = applicationName2;
    }

    @JvmStatic
    public static final void setAutoInitEnabled(boolean flag) {
        UserSettingsManager.setAutoInitEnabled(flag);
        if (flag) {
            fullyInitialize();
        }
    }

    @JvmStatic
    public static final void setAutoLogAppEventsEnabled(boolean flag) {
        UserSettingsManager.setAutoLogAppEventsEnabled(flag);
        if (flag) {
            Context applicationContext2 = getApplicationContext();
            Objects.requireNonNull(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ActivityLifecycleTracker.startTracking((Application) applicationContext2, getApplicationId());
        }
    }

    @JvmStatic
    public static final void setCacheDir(@NotNull File cacheDir2) {
        cacheDir = new LockOnGetVariable<>(cacheDir2);
    }

    @JvmStatic
    public static final void setClientToken(@Nullable String clientToken) {
        appClientToken = clientToken;
    }

    @JvmStatic
    public static final void setCodelessDebugLogEnabled(boolean flag) {
        codelessDebugLogEnabled = Boolean.valueOf(flag);
    }

    @JvmStatic
    public static final void setDataProcessingOptions(@Nullable String[] options) {
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return;
        }
        try {
            setDataProcessingOptions(options, 0, 0);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
        }
    }

    @JvmStatic
    public static final void setExecutor(@NotNull Executor executor2) {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            executor = executor2;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @JvmStatic
    public static final void setFacebookDomain(@NotNull String facebookDomain2) {
        Log.w(TAG, "WARNING: Calling setFacebookDomain from non-DEBUG code.");
        facebookDomain = facebookDomain2;
    }

    @JvmStatic
    public static final void setGraphApiVersion(@NotNull String graphApiVersion2) {
        Log.w(TAG, "WARNING: Calling setGraphApiVersion from non-DEBUG code.");
        if (Utility.isNullOrEmpty(graphApiVersion2) || !(!Intrinsics.areEqual(graphApiVersion, graphApiVersion2))) {
            return;
        }
        graphApiVersion = graphApiVersion2;
    }

    @JvmStatic
    public static final void setIsDebugEnabled(boolean enabled) {
        isDebugEnabledField = enabled;
    }

    @JvmStatic
    public static final void setLegacyTokenUpgradeSupported(boolean supported) {
        isLegacyTokenUpgradeSupported = supported;
    }

    @JvmStatic
    public static final void setLimitEventAndDataUsage(@NotNull Context context, boolean limitEventUsage) {
        context.getSharedPreferences(APP_EVENT_PREFERENCES, 0).edit().putBoolean("limitEventUsage", limitEventUsage).apply();
    }

    @JvmStatic
    public static final void setMonitorEnabled(boolean flag) {
        UserSettingsManager.setMonitorEnabled(flag);
    }

    @JvmStatic
    public static final void setOnProgressThreshold(long threshold) {
        onProgressThreshold.set(threshold);
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final synchronized void sdkInitialize(@NotNull Context applicationContext2, int callbackRequestCodeOffset2, @Nullable InitializeCallback callback) {
        if (sdkInitialized.get() && callbackRequestCodeOffset2 != callbackRequestCodeOffset) {
            throw new FacebookException(CALLBACK_OFFSET_CHANGED_AFTER_INIT);
        }
        if (callbackRequestCodeOffset2 >= 0) {
            callbackRequestCodeOffset = callbackRequestCodeOffset2;
            sdkInitialize(applicationContext2, callback);
        } else {
            throw new FacebookException(CALLBACK_OFFSET_NEGATIVE);
        }
    }

    @JvmStatic
    public static final void setDataProcessingOptions(@Nullable String[] options, int country, int state) {
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return;
        }
        if (options == null) {
            try {
                options = new String[0];
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DATA_PROCESSION_OPTIONS, new JSONArray((Collection) ArraysKt___ArraysKt.toList(options)));
            jSONObject.put(DATA_PROCESSION_OPTIONS_COUNTRY, country);
            jSONObject.put(DATA_PROCESSION_OPTIONS_STATE, state);
            applicationContext.getSharedPreferences(DATA_PROCESSING_OPTIONS_PREFERENCES, 0).edit().putString(DATA_PROCESSION_OPTIONS, jSONObject.toString()).apply();
        } catch (JSONException unused) {
        }
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final synchronized void sdkInitialize(@NotNull Context applicationContext2) {
        sdkInitialize(applicationContext2, (InitializeCallback) null);
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final synchronized void sdkInitialize(@NotNull Context applicationContext2, @Nullable InitializeCallback callback) {
        AtomicBoolean atomicBoolean = sdkInitialized;
        if (atomicBoolean.get()) {
            if (callback != null) {
                callback.onInitialized();
            }
            return;
        }
        Validate.hasFacebookActivity(applicationContext2, false);
        Validate.hasInternetPermissions(applicationContext2, false);
        applicationContext = applicationContext2.getApplicationContext();
        AppEventsLogger.INSTANCE.getAnonymousAppDeviceGUID(applicationContext2);
        loadDefaultsFromMetadata$facebook_core_release(applicationContext);
        if (!Utility.isNullOrEmpty(applicationId)) {
            atomicBoolean.set(true);
            if (getAutoInitEnabled()) {
                fullyInitialize();
            }
            if ((applicationContext instanceof Application) && UserSettingsManager.getAutoLogAppEventsEnabled()) {
                Context context = applicationContext;
                if (context == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
                }
                ActivityLifecycleTracker.startTracking((Application) context, applicationId);
            }
            FetchedAppSettingsManager.loadAppSettingsAsync();
            NativeProtocol.updateAllAvailableProtocolVersionsAsync();
            BoltsMeasurementEventListener.INSTANCE.getInstance(applicationContext);
            cacheDir = new LockOnGetVariable<>((Callable) c.a);
            FeatureManager.checkFeature(FeatureManager.Feature.Instrument, d.a);
            FeatureManager.checkFeature(FeatureManager.Feature.AppEvents, e.a);
            FeatureManager.checkFeature(FeatureManager.Feature.ChromeCustomTabsPrefetching, f.a);
            FeatureManager.checkFeature(FeatureManager.Feature.IgnoreAppSwitchToLoggedOut, g.a);
            FeatureManager.checkFeature(FeatureManager.Feature.BypassAppSwitch, h.a);
            getExecutor().execute(new FutureTask(new i(callback)));
            return;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }
}
