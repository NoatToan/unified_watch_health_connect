package com.huawei.health.provider;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.huawei.health.device.api.PluginDeviceApi;
import com.huawei.health.facardagds.FaCardAgdsApi;
import com.huawei.health.provider.cursor.HealthCursor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import defpackage.etr;
import defpackage.ett;
import defpackage.gse;
import defpackage.gsh;
import defpackage.gsi;
import defpackage.gsj;
import health.compact.a.ApplicationLazyLoad;
import health.compact.a.AuthorityHealthCursor;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtil;
import health.compact.a.DaemonServiceSpUtils;
import health.compact.a.DeviceUtil;
import health.compact.a.HealthFaDataHelper;
import health.compact.a.HuaweiHealth;
import health.compact.a.LogUtil;
import health.compact.a.LogicalStepCounter;
import health.compact.a.ProviderAuthorityUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPerferenceUtils;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StatisticsSleepHealthCursor;
import health.compact.a.StatisticsSportHealthCursor;
import health.compact.a.StepCounterSupport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HealthOpenProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f8643a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f8644b = false;
    private static final UriMatcher e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LogicalStepCounter f8645c = null;

    private int f() {
        return 0;
    }

    private int h() {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        e = uriMatcher;
        uriMatcher.addURI("com.huawei.healthcloud.health.provider", "authority", 0);
        uriMatcher.addURI("com.huawei.healthcloud.health.provider", "sport_statistics", 2000);
        uriMatcher.addURI("com.huawei.healthcloud.health.provider", "sleep_statistics", 2001);
        uriMatcher.addURI("com.huawei.healthcloud.health.provider", "health_statistics", 2002);
        uriMatcher.addURI("com.huawei.healthcloud.health.provider", "wear_device_state", 2003);
        uriMatcher.addURI("com.huawei.healthcloud.health.provider", "wear_device_state/wearEngine", 2004);
        uriMatcher.addURI("com.huawei.healthcloud.health.provider", "health_fa_form", 2005);
        uriMatcher.addURI("com.huawei.healthcloud.health.provider", "health_fa_ability", 2006);
        uriMatcher.addURI("com.huawei.healthcloud.health.provider", "step_counter_detection", 2007);
        uriMatcher.addURI("com.huawei.healthcloud.health.provider", "single_motion_detection", 2008);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        HuaweiHealth.e(BaseApplication.getContext());
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1 A[RETURN] */
    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        boolean zB;
        if (uri == null) {
            LogUtil.d("Step_HlthOpenProv", "uri is null");
            return null;
        }
        UriMatcher uriMatcher = e;
        int iMatch = uriMatcher.match(uri);
        Context contextB = com.huawei.haf.application.BaseApplication.b();
        if (!f8644b && DaemonServiceSpUtils.b(contextB) && FaCardAgdsApi.STEP_FA_CARD_PACKAGE_NAME.equals(getCallingPackage()) && iMatch == 2000) {
            c(contextB);
            f8644b = true;
        }
        if (!ApplicationLazyLoad.b()) {
            LogUtil.d("Step_HlthOpenProv", "lazy load not finish.");
            return c(iMatch, contextB);
        }
        if (uriMatcher.match(uri) == 2003 || uriMatcher.match(uri) == 2004) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return b(uri, strArr, str, strArr2, str2);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        if (strArr == null) {
            LogUtil.d("Step_HlthOpenProv", "projection is null");
            return null;
        }
        if (str2 == null || strArr2 == null) {
            LogUtil.d("Step_HlthOpenProv", "sortOrder or selectionArgs is null");
            return null;
        }
        if (str == null) {
            LogUtil.d("Step_HlthOpenProv", "selection is null");
            return null;
        }
        if (uriMatcher.match(uri) == 2007) {
            zB = e(strArr);
        } else {
            if (uriMatcher.match(uri) != 2008) {
                zB = ProviderAuthorityUtil.b(getContext(), getCallingPackage());
            }
            LogUtil.b("Step_HlthOpenProv", "AppAuthority is ok!");
            if (iMatch >= 0) {
                return a(iMatch, uri, strArr);
            }
            return null;
        }
        if (!zB) {
            LogUtil.b("Step_HlthOpenProv", "no AppAuthority pathType =", Integer.valueOf(iMatch));
            return null;
        }
        LogUtil.b("Step_HlthOpenProv", "AppAuthority is ok!");
        if (iMatch >= 0) {
            return a(iMatch, uri, strArr);
        }
        return null;
    }

    private Cursor c(int i, Context context) {
        if (DaemonServiceSpUtils.b(context) || i != 2000) {
            return null;
        }
        ReleaseLogUtil.c("Step_HlthOpenProv", "return default cursor with not authorized ");
        HashMap map = new HashMap(3);
        map.put("support_version", Integer.valueOf(com.huawei.haf.application.BaseApplication.c()));
        map.put("is_authorized", false);
        map.put("app_authorized", false);
        return new StatisticsSportHealthCursor(map);
    }

    private void c(Context context) {
        ReleaseLogUtil.c("Step_HlthOpenProv", "start DaemonService");
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.health.manager.DaemonService");
        intent.setPackage(context.getPackageName());
        intent.setAction("query_data_refresh_ui");
        try {
            context.startService(intent);
        } catch (Exception e2) {
            ReleaseLogUtil.d("Step_HlthOpenProv", "processStartDaemonService ", e2.getMessage());
        }
    }

    private boolean e(String[] strArr) {
        if (Arrays.asList(strArr).contains("step_counter_details")) {
            return ProviderAuthorityUtil.a(getCallingPackage(), 101003, true);
        }
        return true;
    }

    private HealthCursor a(int i, Uri uri, String[] strArr) {
        if (i == 0) {
            LogUtil.b("Step_HlthOpenProv", "query GET_AUTHORITY");
            return new AuthorityHealthCursor();
        }
        if (i == 2007) {
            LogUtil.b("Step_HlthOpenProv", "query STEP_COUNT_DETECTION");
            return new gsj(d(strArr));
        }
        if (i != 2008) {
            switch (i) {
                case 2000:
                    LogUtil.b("Step_HlthOpenProv", "query GET_SPORT_STATISTICS");
                    StatisticsSportHealthCursor statisticsSportHealthCursor = new StatisticsSportHealthCursor(a());
                    ReleaseLogUtil.c("Step_HlthOpenProv", "CallingPackage ", getCallingPackage());
                    if (FaCardAgdsApi.STEP_FA_CARD_PACKAGE_NAME.equals(getCallingPackage())) {
                        e(true);
                    }
                    return statisticsSportHealthCursor;
                case 2001:
                    ReleaseLogUtil.c("Step_HlthOpenProv", "query GET_SLEEP_STATISTICS");
                    HashMap map = new HashMap(10);
                    LogicalStepCounter logicalStepCounterD = LogicalStepCounter.d(getContext());
                    this.f8645c = logicalStepCounterD;
                    if (logicalStepCounterD != null) {
                        logicalStepCounterD.d(map);
                    }
                    return new StatisticsSleepHealthCursor(map);
                case 2002:
                    LogUtil.b("Step_HlthOpenProv", "query GET_HEALTH_STATISTICS");
                    return HealthFaDataHelper.a(uri);
                default:
                    return null;
            }
        }
        LogUtil.b("Step_HlthOpenProv", "query SINGLE_MOTION_DETECTION");
        return new gsi(gse.c(strArr));
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        if (!ApplicationLazyLoad.b()) {
            LogUtil.d("Step_HlthOpenProv", "lazy load not finish.");
            return null;
        }
        if (uri == null || contentValues == null) {
            LogUtil.d("Step_HlthOpenProv", "uri or values is null");
            return null;
        }
        int iMatch = e.match(uri);
        if (iMatch == 2000) {
            LogUtil.b("Step_HlthOpenProv", "card_visible ", contentValues.getAsInteger("card_visible"));
            e(contentValues.getAsInteger("card_visible").intValue() != 0);
        } else if (iMatch == 2005) {
            ReleaseLogUtil.c("Step_HlthOpenProv", "insert fa card. card: ", contentValues);
            ett ettVarA = etr.d().a(contentValues);
            if (ettVarA != null) {
                return ContentUris.withAppendedId(uri, ettVarA.c());
            }
        } else if (iMatch == 2006) {
            ReleaseLogUtil.c("Step_HlthOpenProv", " insert fa abilityL ", contentValues);
            etr.d().c(contentValues.getAsString("HealthFaAbility"));
            return ContentUris.withAppendedId(uri, 0L);
        }
        Integer asInteger = contentValues.getAsInteger("app_id");
        String asString = contentValues.getAsString("app_package_name");
        if (asInteger != null && asString != null) {
            return null;
        }
        LogUtil.d("Step_HlthOpenProv", "appId or appPackage is null");
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        ReleaseLogUtil.c("Step_HlthOpenProv", " uri:", uri, "selection", " selectionArgs", strArr);
        if (!ApplicationLazyLoad.b()) {
            LogUtil.d("Step_HlthOpenProv", "lazy load not finish.");
            return -1;
        }
        if (uri == null) {
            LogUtil.d("Step_HlthOpenProv", "uri or values is null");
            return -1;
        }
        if (e.match(uri) == 2005) {
            ReleaseLogUtil.c("Step_HlthOpenProv", "delete fa form, cardId:", strArr == null ? null : Arrays.asList(strArr));
            if (strArr != null) {
                return -1;
            }
            for (String str2 : strArr) {
                etr.d().a(CommonUtil.i(str2));
            }
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        if (uri == null || contentValuesArr == null) {
            LogUtil.d("Step_HlthOpenProv", "uri or values is null");
            return 0;
        }
        int iMatch = e.match(uri);
        Integer asInteger = contentValuesArr[0].getAsInteger("app_id");
        if (asInteger == null || asInteger.intValue() < 1) {
            LogUtil.d("Step_HlthOpenProv", "invalid appId ");
            return 0;
        }
        if (iMatch >= 0) {
            if (iMatch == 1) {
                return f();
            }
            if (iMatch == 2) {
                return h();
            }
        }
        return 0;
    }

    private Map<String, Object> a() {
        LogicalStepCounter logicalStepCounterD = LogicalStepCounter.d(getContext());
        this.f8645c = logicalStepCounterD;
        HashMap map = null;
        if (logicalStepCounterD != null) {
            Bundle bundleF = logicalStepCounterD.f();
            if (bundleF == null) {
                LogUtil.d("Step_HlthOpenProv", "getSportDataDetail bundle is null");
                return null;
            }
            map = new HashMap(8);
            map.put("time", DateFormatUtil.e(System.currentTimeMillis(), DateFormatUtil.DateFormatType.DATE_FORMAT_8));
            map.put("step", Integer.valueOf(bundleF.getInt("step")));
            map.put("distance", Integer.valueOf(bundleF.getInt("distance")));
            map.put("carior", Integer.valueOf(bundleF.getInt("carior")));
            map.put("floor", Integer.valueOf(bundleF.getInt("floor")));
            map.put("duration", Long.valueOf(bundleF.getLong("duration")));
            boolean zN = SharedPerferenceUtils.n(com.huawei.haf.application.BaseApplication.b());
            LogUtil.b("Step_HlthOpenProv", "isBrowseMode ", Boolean.valueOf(zN));
            if (zN) {
                map.put("step_goal", 10000);
            } else {
                map.put("step_goal", Integer.valueOf(bundleF.getInt("stepTarget")));
            }
            map.put("support_version", Integer.valueOf(com.huawei.haf.application.BaseApplication.c()));
            map.put("is_browse_mode", Boolean.valueOf(zN));
            map.put("is_oversea", Boolean.valueOf(CloudUtils.d()));
            map.put("is_authorized", Boolean.valueOf(AuthorizationUtils.c(getContext())));
            map.put("app_authorized", Boolean.valueOf(AuthorizationUtils.c(getContext())));
        }
        return map;
    }

    public static boolean e() {
        return f8643a;
    }

    public static void e(boolean z) {
        f8643a = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    private LinkedHashMap<String, Object> d(String[] strArr) {
        boolean z;
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>(strArr.length);
        for (String str : strArr) {
            str.hashCode();
            switch (str) {
                case "is_bind_huawei_health":
                    String strD = gsh.a(getContext()).d();
                    ReleaseLogUtil.c("Step_HlthOpenProv", "userBindStatus: ", strD);
                    linkedHashMap.put("is_bind_huawei_health", strD);
                    break;
                case "step_counter_details":
                    linkedHashMap.put("step_counter_details", String.valueOf(gsh.a(getContext()).a()));
                    break;
                case "last_sync_data_time":
                    String strE = SharedPreferenceManager.e(getContext(), Integer.toString(10000), "last_sync_time");
                    ReleaseLogUtil.c("Step_HlthOpenProv", "lastSyncTime: ", strE);
                    linkedHashMap.put("last_sync_data_time", strE);
                    break;
                case "is_step_counter_registered":
                    boolean zG = LogicalStepCounter.d(getContext()).g();
                    ReleaseLogUtil.c("Step_HlthOpenProv", "isStepCounterRegistered: ", Boolean.valueOf(zG));
                    linkedHashMap.put("is_step_counter_registered", String.valueOf(zG));
                    break;
                case "is_step_counter_sensor_enabled":
                    boolean zI = StepCounterSupport.i(getContext());
                    ReleaseLogUtil.c("Step_HlthOpenProv", "isStepCounterSensorEnabled: ", Boolean.valueOf(zI));
                    linkedHashMap.put("is_step_counter_sensor_enabled", String.valueOf(zI));
                    break;
                case "has_step_permission":
                    try {
                        z = ContextCompat.checkSelfPermission(getContext(), "android.permission.ACTIVITY_RECOGNITION") == 0;
                    } catch (SecurityException e2) {
                        LogUtil.d("Step_HlthOpenProv", "SecurityException: ", e2.getMessage());
                    }
                    ReleaseLogUtil.c("Step_HlthOpenProv", "hasStepPermission: ", Boolean.valueOf(z));
                    linkedHashMap.put("has_step_permission", String.valueOf(z));
                    break;
                case "step_counter_sensor_types":
                    int iB = StepCounterSupport.b(getContext());
                    ReleaseLogUtil.c("Step_HlthOpenProv", "stepCounterSensorTypes: ", Integer.valueOf(iB));
                    linkedHashMap.put("step_counter_sensor_types", String.valueOf(iB));
                    break;
                default:
                    LogUtil.e("Step_HlthOpenProv", "unknown projection");
                    break;
            }
        }
        return linkedHashMap;
    }

    private Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        UriMatcher uriMatcher = e;
        if (uriMatcher.match(uri) == 2003) {
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"boundedDevice", "boundedWearableDevice", "connectedWearableDevice"}, 1);
            boolean zB = DeviceUtil.b();
            boolean z = zB || b();
            boolean zD = d();
            matrixCursor.addRow(new Object[]{String.valueOf(z), String.valueOf(zB), String.valueOf(zB && zD)});
            LogUtil.b("Step_HlthOpenProv", "hasBoundedDevice = ", Boolean.valueOf(z), ",hasConnectedDevice = ", Boolean.valueOf(zB && zD), ",hasBoundedWearableDevice = ", Boolean.valueOf(zB));
            return matrixCursor;
        }
        if (uriMatcher.match(uri) != 2004) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("selection isEmpty");
        }
        MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"isAllowBindService"}, 1);
        boolean zE = e(str);
        LogUtil.b("Step_HlthOpenProv", "getWearEngineQueryResult = ", Boolean.valueOf(zE));
        matrixCursor2.addRow(new Object[]{String.valueOf(zE)});
        return matrixCursor2;
    }

    private boolean b() {
        ArrayList<ContentValues> bondedDevice = ((PluginDeviceApi) Services.b("PluginDevice", PluginDeviceApi.class)).getBondedDevice();
        return (bondedDevice == null || bondedDevice.isEmpty()) ? false : true;
    }

    private boolean d() {
        return c()[0];
    }

    private boolean e(String str) {
        LogUtil.b("Step_HlthOpenProv", "getWearEngineQueryResult callAPiName = ", str);
        boolean[] zArrC = c();
        if (str.equals("getBondedDevices")) {
            return zArrC[1];
        }
        if (str.equals("getCommonDevice")) {
            return zArrC[2];
        }
        if (str.equals("getAllBondedDevices")) {
            return DeviceUtil.b() || b();
        }
        if (str.equals("hasAvailableDevices")) {
            return zArrC[3];
        }
        return false;
    }

    private boolean[] c() {
        boolean[] zArr = {false, false, false, false};
        String strB = SharedPreferenceManager.b(String.valueOf(53), "key_wearEngine_device", "");
        if (TextUtils.isEmpty(strB)) {
            LogUtil.d("Step_HlthOpenProv", "getWearEngineDevice wearEngineDeviceInfo is null");
            return zArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(strB);
            if (jSONObject.has("isHasConnectedWearDevice")) {
                zArr[0] = jSONObject.getBoolean("isHasConnectedWearDevice");
            }
            if (jSONObject.has("isHasSupportHiWearDevice")) {
                zArr[1] = jSONObject.getBoolean("isHasSupportHiWearDevice");
            }
            if (jSONObject.has("isHasSupportCommonDevice")) {
                zArr[2] = jSONObject.getBoolean("isHasSupportCommonDevice");
            }
            if (jSONObject.has("isHasAvailableDevice")) {
                zArr[3] = jSONObject.getBoolean("isHasAvailableDevice");
                return zArr;
            }
        } catch (JSONException unused) {
            LogUtil.d("Step_HlthOpenProv", "getWearEngineDevice JSONException");
        }
        return zArr;
    }
}
