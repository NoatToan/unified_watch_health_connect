package com.facebook.appevents.iap;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bc\u0010dJ\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007JF\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\fH\u0007JF\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\fH\u0002J,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00112\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u0002J\u001c\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000eH\u0002J\"\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\bH\u0002J*\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007J*\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007J2\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\bH\u0002J*\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007J0\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\bH\u0002J0\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u0002J\u001e\u0010#\u001a\u0004\u0018\u00010\"2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010!\u001a\u00020\bH\u0002J\u001e\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\bH\u0002JC\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u00012\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010'H\u0002¢\u0006\u0004\b)\u0010*J\b\u0010+\u001a\u00020\u0014H\u0007J\u000e\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020\bR2\u00101\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\"0.j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\"`/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00100R:\u00102\u001a&\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0.j\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f`/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00100R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u00104R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u00104R\u0016\u00108\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u00107R\u0016\u00109\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u00107R\u0016\u0010:\u001a\u0002038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u00104R\u0016\u0010;\u001a\u0002038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u00104R\u0016\u0010<\u001a\u0002038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u00104R\u0016\u0010=\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u00107R\u0016\u0010?\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u00107R\u0016\u0010A\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u00107R\u0016\u0010C\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u00107R\u0016\u0010E\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u00107R\u0016\u0010G\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u00107R\u0016\u0010I\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u00107R\u0016\u0010K\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u00107R\u0016\u0010M\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bL\u00107R\u0016\u0010O\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u00107R\u0016\u0010Q\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bP\u00107R\u0016\u0010S\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bR\u00107R\u0016\u0010U\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bT\u00107R\u001e\u0010X\u001a\n V*\u0004\u0018\u00010\b0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u00107R\u0016\u0010Z\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bY\u00107R\u0016\u0010\\\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b[\u00107R\u001e\u0010`\u001a\n V*\u0004\u0018\u00010]0]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001e\u0010b\u001a\n V*\u0004\u0018\u00010]0]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010_¨\u0006e"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseEventManager;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/os/IBinder;", "service", InAppPurchaseEventManager.AS_INTERFACE, "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "skuList", "inAppBillingObj", "", "isSubscription", "", InAppPurchaseEventManager.GET_SKU_DETAILS, "f", "", "i", "skuDetailsMap", "", z.j, "type", "h", "getPurchasesInapp", "getPurchasesSubs", "e", "getPurchaseHistoryInapp", GoogleApiAvailabilityLight.a, "purchases", "a", "Ljava/lang/Class;", "classObj", "methodName", "Ljava/lang/reflect/Method;", "c", "className", "b", IconCompat.EXTRA_OBJ, "", "args", "g", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "clearSkuDetailsCache", "skuDetail", "hasFreeTrialPeirod", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "methodMap", "classMap", "", LogUtil.I, "CACHE_CLEAR_TIME_LIMIT_SEC", "SKU_DETAIL_EXPIRE_TIME_SEC", "Ljava/lang/String;", "SUBSCRIPTION", "INAPP", "PURCHASE_EXPIRE_TIME_SEC", "PURCHASE_STOP_QUERY_TIME_SEC", "MAX_QUERY_PURCHASE_NUM", "IN_APP_BILLING_SERVICE_STUB", hl.k, "IN_APP_BILLING_SERVICE", "l", "AS_INTERFACE", "m", "GET_SKU_DETAILS", GoogleApiAvailabilityLight.b, "GET_PURCHASES", "o", "GET_PURCHASE_HISTORY", b.r, "IS_BILLING_SUPPORTED", DTransferConstants.SEARCH_KEY, InAppPurchaseEventManager.ITEM_ID_LIST, "r", InAppPurchaseEventManager.RESPONSE_CODE, SOAP.XMLNS, InAppPurchaseEventManager.DETAILS_LIST, "t", InAppPurchaseEventManager.INAPP_PURCHASE_DATA_LIST, "u", InAppPurchaseEventManager.INAPP_CONTINUATION_TOKEN, "v", InAppPurchaseEventManager.LAST_CLEARED_TIME, "kotlin.jvm.PlatformType", "w", "PACKAGE_NAME", "x", "SKU_DETAILS_STORE", "y", "PURCHASE_INAPP_STORE", "Landroid/content/SharedPreferences;", "z", "Landroid/content/SharedPreferences;", "skuDetailSharedPrefs", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "purchaseInappSharedPrefs", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class InAppPurchaseEventManager {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int CACHE_CLEAR_TIME_LIMIT_SEC = 604800;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int SKU_DETAIL_EXPIRE_TIME_SEC = 43200;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final String SUBSCRIPTION = "subs";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final String INAPP = "inapp";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final int PURCHASE_EXPIRE_TIME_SEC = 86400;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final int PURCHASE_STOP_QUERY_TIME_SEC = 1200;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final int MAX_QUERY_PURCHASE_NUM = 30;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final String IN_APP_BILLING_SERVICE_STUB = "com.android.vending.billing.IInAppBillingService$Stub";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final String IN_APP_BILLING_SERVICE = "com.android.vending.billing.IInAppBillingService";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final String AS_INTERFACE = "asInterface";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final String GET_SKU_DETAILS = "getSkuDetails";

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final String GET_PURCHASES = "getPurchases";

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static final String GET_PURCHASE_HISTORY = "getPurchaseHistory";

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private static final String IS_BILLING_SUPPORTED = "isBillingSupported";

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private static final String ITEM_ID_LIST = "ITEM_ID_LIST";

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private static final String RESPONSE_CODE = "RESPONSE_CODE";

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private static final String DETAILS_LIST = "DETAILS_LIST";

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private static final String INAPP_PURCHASE_DATA_LIST = "INAPP_PURCHASE_DATA_LIST";

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private static final String INAPP_CONTINUATION_TOKEN = "INAPP_CONTINUATION_TOKEN";

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private static final String LAST_CLEARED_TIME = "LAST_CLEARED_TIME";

    @NotNull
    public static final InAppPurchaseEventManager INSTANCE = new InAppPurchaseEventManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final HashMap<String, Method> methodMap = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final HashMap<String, Class<?>> classMap = new HashMap<>();

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private static final String PACKAGE_NAME = FacebookSdk.getApplicationContext().getPackageName();

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private static final String SKU_DETAILS_STORE = "com.facebook.internal.SKU_DETAILS";

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private static final SharedPreferences skuDetailSharedPrefs = FacebookSdk.getApplicationContext().getSharedPreferences(SKU_DETAILS_STORE, 0);

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private static final String PURCHASE_INAPP_STORE = "com.facebook.internal.PURCHASE";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final SharedPreferences purchaseInappSharedPrefs = FacebookSdk.getApplicationContext().getSharedPreferences(PURCHASE_INAPP_STORE, 0);

    private InAppPurchaseEventManager() {
    }

    private final ArrayList<String> a(ArrayList<String> purchases) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            SharedPreferences.Editor editorEdit = purchaseInappSharedPrefs.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String str : purchases) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (jCurrentTimeMillis - (j / 1000) <= 86400 && !Intrinsics.areEqual(purchaseInappSharedPrefs.getString(string, ""), string2)) {
                        editorEdit.putString(string, string2);
                        arrayList.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            editorEdit.apply();
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final Object asInterface(@NotNull Context context, @Nullable IBinder service) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            return INSTANCE.g(context, IN_APP_BILLING_SERVICE_STUB, AS_INTERFACE, null, new Object[]{service});
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseEventManager.class);
            return null;
        }
    }

    private final Class<?> b(Context context, String className) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> map = classMap;
            Class<?> clsLoadClass = map.get(className);
            if (clsLoadClass != null) {
                return clsLoadClass;
            }
            try {
                clsLoadClass = context.getClassLoader().loadClass(className);
                map.put(className, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException unused) {
                return clsLoadClass;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Method c(Class<?> classObj, String methodName) {
        Class[] clsArr;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            HashMap<String, Method> map = methodMap;
            Method declaredMethod = map.get(methodName);
            if (declaredMethod != null) {
                return declaredMethod;
            }
            try {
                switch (methodName.hashCode()) {
                    case -1801122596:
                        if (!methodName.equals(GET_PURCHASES)) {
                            clsArr = null;
                        } else {
                            clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class};
                        }
                        break;
                    case -1450694211:
                        if (!methodName.equals(IS_BILLING_SUPPORTED)) {
                            clsArr = null;
                        } else {
                            clsArr = new Class[]{Integer.TYPE, String.class, String.class};
                        }
                        break;
                    case -1123215065:
                        if (!methodName.equals(AS_INTERFACE)) {
                            clsArr = null;
                        } else {
                            clsArr = new Class[]{IBinder.class};
                        }
                        break;
                    case -594356707:
                        if (!methodName.equals(GET_PURCHASE_HISTORY)) {
                            clsArr = null;
                        } else {
                            clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class, Bundle.class};
                        }
                        break;
                    case -573310373:
                        if (!methodName.equals(GET_SKU_DETAILS)) {
                            clsArr = null;
                        } else {
                            clsArr = new Class[]{Integer.TYPE, String.class, String.class, Bundle.class};
                        }
                        break;
                    default:
                        clsArr = null;
                        break;
                }
                declaredMethod = clsArr == null ? classObj.getDeclaredMethod(methodName, null) : classObj.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                map.put(methodName, declaredMethod);
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                return declaredMethod;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @JvmStatic
    public static final void clearSkuDetailsCache() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseEventManager.class)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = skuDetailSharedPrefs;
            long j = sharedPreferences.getLong(LAST_CLEARED_TIME, 0L);
            if (j == 0) {
                sharedPreferences.edit().putLong(LAST_CLEARED_TIME, jCurrentTimeMillis).apply();
            } else if (jCurrentTimeMillis - j > CACHE_CLEAR_TIME_LIMIT_SEC) {
                sharedPreferences.edit().clear().putLong(LAST_CLEARED_TIME, jCurrentTimeMillis).apply();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseEventManager.class);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    private final ArrayList<String> d(Context context, Object inAppBillingObj, String type) {
        ArrayList<String> stringArrayList;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (h(context, inAppBillingObj, type)) {
                String string = null;
                int i = 0;
                boolean z = false;
                do {
                    Object objG = g(context, IN_APP_BILLING_SERVICE, GET_PURCHASE_HISTORY, inAppBillingObj, new Object[]{6, PACKAGE_NAME, type, string, new Bundle()});
                    if (objG != null) {
                        long j = 1000;
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) objG;
                        if (bundle.getInt(RESPONSE_CODE) != 0 || (stringArrayList = bundle.getStringArrayList(INAPP_PURCHASE_DATA_LIST)) == null) {
                            string = null;
                        } else {
                            for (String str : stringArrayList) {
                                try {
                                    if (jCurrentTimeMillis - (new JSONObject(str).getLong("purchaseTime") / j) > 1200) {
                                        z = true;
                                        break;
                                    }
                                    arrayList.add(str);
                                    i++;
                                } catch (JSONException unused) {
                                }
                                j = 1000;
                            }
                            string = bundle.getString(INAPP_CONTINUATION_TOKEN);
                        }
                    } else {
                        string = null;
                    }
                    if (i >= 30 || string == null) {
                        break;
                    }
                } while (!z);
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:30:0x0062 A[EDGE_INSN: B:30:0x0062->B:23:0x0062 BREAK  A[LOOP:0: B:11:0x0019->B:32:?], SYNTHETIC] */
    private final ArrayList<String> e(Context context, Object inAppBillingObj, String type) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (inAppBillingObj != null && h(context, inAppBillingObj, type)) {
                String string = null;
                int size = 0;
                do {
                    Object objG = g(context, IN_APP_BILLING_SERVICE, GET_PURCHASES, inAppBillingObj, new Object[]{3, PACKAGE_NAME, type, string});
                    if (objG == null) {
                        string = null;
                        if (size < 30) {
                            break;
                            break;
                        }
                    } else {
                        Bundle bundle = (Bundle) objG;
                        if (bundle.getInt(RESPONSE_CODE) == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList(INAPP_PURCHASE_DATA_LIST);
                            if (stringArrayList == null) {
                                break;
                            }
                            size += stringArrayList.size();
                            arrayList.addAll(stringArrayList);
                            string = bundle.getString(INAPP_CONTINUATION_TOKEN);
                        } else {
                            string = null;
                        }
                        if (size < 30) {
                            break;
                        }
                    }
                } while (string != null);
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final Map<String, String> f(Context context, ArrayList<String> skuList, Object inAppBillingObj, boolean isSubscription) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Map<String, String> linkedHashMap = new LinkedHashMap<>();
            if (inAppBillingObj != null && !skuList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList(ITEM_ID_LIST, skuList);
                Object[] objArr = new Object[4];
                objArr[0] = 3;
                objArr[1] = PACKAGE_NAME;
                objArr[2] = isSubscription ? "subs" : "inapp";
                objArr[3] = bundle;
                Object objG = g(context, IN_APP_BILLING_SERVICE, GET_SKU_DETAILS, inAppBillingObj, objArr);
                if (objG != null) {
                    Bundle bundle2 = (Bundle) objG;
                    if (bundle2.getInt(RESPONSE_CODE) == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList(DETAILS_LIST);
                        if (stringArrayList != null && skuList.size() == stringArrayList.size()) {
                            int size = skuList.size();
                            for (int i = 0; i < size; i++) {
                                linkedHashMap.put(skuList.get(i), stringArrayList.get(i));
                            }
                        }
                        j(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final Object g(Context context, String className, String methodName, Object obj, Object[] args) {
        Method methodC;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Class<?> clsB = b(context, className);
            if (clsB != null && (methodC = c(clsB, methodName)) != null) {
                if (obj != null) {
                    obj = clsB.cast(obj);
                }
                try {
                    return methodC.invoke(obj, Arrays.copyOf(args, args.length));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final ArrayList<String> getPurchaseHistoryInapp(@NotNull Context context, @Nullable Object inAppBillingObj) {
        InAppPurchaseEventManager inAppPurchaseEventManager;
        Class<?> clsB;
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            return (inAppBillingObj == null || (clsB = (inAppPurchaseEventManager = INSTANCE).b(context, IN_APP_BILLING_SERVICE)) == null || inAppPurchaseEventManager.c(clsB, GET_PURCHASE_HISTORY) == null) ? arrayList : inAppPurchaseEventManager.a(inAppPurchaseEventManager.d(context, inAppBillingObj, "inapp"));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseEventManager.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final ArrayList<String> getPurchasesInapp(@NotNull Context context, @Nullable Object inAppBillingObj) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            InAppPurchaseEventManager inAppPurchaseEventManager = INSTANCE;
            return inAppPurchaseEventManager.a(inAppPurchaseEventManager.e(context, inAppBillingObj, "inapp"));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseEventManager.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final ArrayList<String> getPurchasesSubs(@NotNull Context context, @Nullable Object inAppBillingObj) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            InAppPurchaseEventManager inAppPurchaseEventManager = INSTANCE;
            return inAppPurchaseEventManager.a(inAppPurchaseEventManager.e(context, inAppBillingObj, "subs"));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseEventManager.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> getSkuDetails(@NotNull Context context, @NotNull ArrayList<String> skuList, @Nullable Object inAppBillingObj, boolean isSubscription) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            Map<String, String> mapI = INSTANCE.i(skuList);
            ArrayList<String> arrayList = new ArrayList<>();
            for (String str : skuList) {
                if (!mapI.containsKey(str)) {
                    arrayList.add(str);
                }
            }
            mapI.putAll(INSTANCE.f(context, arrayList, inAppBillingObj, isSubscription));
            return mapI;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseEventManager.class);
            return null;
        }
    }

    private final boolean h(Context context, Object inAppBillingObj, String type) {
        if (CrashShieldHandler.isObjectCrashing(this) || inAppBillingObj == null) {
            return false;
        }
        try {
            Object objG = g(context, IN_APP_BILLING_SERVICE, IS_BILLING_SUPPORTED, inAppBillingObj, new Object[]{3, PACKAGE_NAME, type});
            return objG != null && ((Integer) objG).intValue() == 0;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final Map<String, String> i(ArrayList<String> skuList) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String str : skuList) {
                String string = skuDetailSharedPrefs.getString(str, null);
                if (string != null) {
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{";"}, false, 2, 2, (Object) null);
                    if (jCurrentTimeMillis - Long.parseLong((String) listSplit$default.get(0)) < SKU_DETAIL_EXPIRE_TIME_SEC) {
                        linkedHashMap.put(str, listSplit$default.get(1));
                    } else {
                        continue;
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final void j(Map<String, String> skuDetailsMap) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = skuDetailSharedPrefs.edit();
            for (Map.Entry<String, String> entry : skuDetailsMap.entrySet()) {
                editorEdit.putString(entry.getKey(), jCurrentTimeMillis + ';' + entry.getValue());
            }
            editorEdit.apply();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final boolean hasFreeTrialPeirod(@NotNull String skuDetail) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            String strOptString = new JSONObject(skuDetail).optString("freeTrialPeriod");
            if (strOptString != null) {
                return strOptString.length() > 0;
            }
            return false;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
