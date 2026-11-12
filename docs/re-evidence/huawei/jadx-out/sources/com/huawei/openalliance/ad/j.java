package com.huawei.openalliance.ad;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.ads.data.Keyword;
import com.huawei.hms.ads.data.SearchInfo;
import com.huawei.hms.ads.jsb.inner.data.JsbCallBackData;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.beans.parameter.App;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.ContentTemplateRecord;
import com.huawei.openalliance.ad.db.bean.EncryptionField;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.IHiAd;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class j implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f19295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f19296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f19297c;
    private final byte[] d = new byte[0];
    private WeakReference<Activity> e;

    public boolean h(String str) {
        try {
            return !com.huawei.openalliance.ad.utils.dg.b(str) && Integer.parseInt(str.trim()) >= 10000300;
        } catch (Throwable th) {
            hw.d("H5Ad", "isSupportImpCtrl() exception: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    protected Location g(String str) {
        JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("location");
        if (jSONObjectOptJSONObject != null) {
            String strOptString = jSONObjectOptJSONObject.optString(JsbMapKeyNames.H5_LOC_LAT);
            String strOptString2 = jSONObjectOptJSONObject.optString(JsbMapKeyNames.H5_LOC_LON);
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && Pattern.matches(Constants.LOC_PATTERN, strOptString) && Pattern.matches(Constants.LOC_PATTERN, strOptString2)) {
                Location location = new Location("");
                location.setLatitude(new BigDecimal(strOptString).doubleValue());
                location.setLongitude(new BigDecimal(strOptString2).doubleValue());
                return location;
            }
        }
        return null;
    }

    public MaterialClickInfo f(String str) {
        JSONObject jSONObject = new JSONObject(str);
        int iOptInt = jSONObject.optInt(MapKeyNames.CLICK_X, -111111);
        Integer numValueOf = Integer.valueOf(iOptInt);
        int iOptInt2 = jSONObject.optInt(MapKeyNames.CLICK_Y, -111111);
        Integer numValueOf2 = Integer.valueOf(iOptInt2);
        String strOptString = jSONObject.optString(MapKeyNames.CREATIVE_SIZE, "");
        Float fA = com.huawei.openalliance.ad.utils.dg.a(jSONObject.optString(MapKeyNames.DENSITY, "-111111"), Float.valueOf(-111111.0f));
        int iOptInt3 = jSONObject.optInt(MapKeyNames.UP_X, -111111);
        Integer numValueOf3 = Integer.valueOf(iOptInt3);
        int iOptInt4 = jSONObject.optInt(MapKeyNames.UP_Y, -111111);
        Integer numValueOf4 = Integer.valueOf(iOptInt4);
        int iOptInt5 = jSONObject.optInt(MapKeyNames.SLD, -111111);
        Integer numValueOf5 = Integer.valueOf(iOptInt5);
        long jOptLong = jSONObject.optLong(MapKeyNames.CLICK_DOWN_TIME);
        Long lValueOf = Long.valueOf(jOptLong);
        long jOptLong2 = jSONObject.optLong(MapKeyNames.CLICK_UP_TIME);
        Long lValueOf2 = Long.valueOf(jOptLong2);
        String strOptString2 = jSONObject.optString(MapKeyNames.SHAKE_ANGLE, "");
        numValueOf.getClass();
        if (iOptInt == -111111) {
            numValueOf = null;
        }
        numValueOf2.getClass();
        if (iOptInt2 == -111111) {
            numValueOf2 = null;
        }
        if (!com.huawei.openalliance.ad.utils.dg.r(strOptString)) {
            strOptString = null;
        }
        if (fA.floatValue() == -111111.0f) {
            fA = null;
        }
        numValueOf3.getClass();
        if (iOptInt3 == -111111) {
            numValueOf3 = null;
        }
        numValueOf4.getClass();
        if (iOptInt4 == -111111) {
            numValueOf4 = null;
        }
        numValueOf5.getClass();
        if (iOptInt5 == -111111) {
            numValueOf5 = null;
        }
        lValueOf.getClass();
        if (jOptLong == 0) {
            lValueOf = null;
        }
        lValueOf2.getClass();
        Long l = jOptLong2 == 0 ? null : lValueOf2;
        if (com.huawei.openalliance.ad.utils.dg.b(strOptString2)) {
            strOptString2 = null;
        }
        return new MaterialClickInfo.a().a(numValueOf).b(numValueOf2).b(strOptString).c(numValueOf5).a(fA).d(numValueOf3).e(numValueOf4).b(lValueOf).a(l).a(strOptString2).a();
    }

    public String e(String str) {
        String strOptString = new JSONObject(str).optString(MapKeyNames.CREATIVE_SIZE, "");
        if (!com.huawei.openalliance.ad.utils.dg.r(strOptString)) {
            strOptString = null;
        }
        hw.b("BaseJsbCmd", "getCreativeSize: %s", strOptString);
        return strOptString;
    }

    public Integer d(String str) {
        int iOptInt = new JSONObject(str).optInt("source", -111111);
        if (iOptInt != -111111) {
            return Integer.valueOf(iOptInt);
        }
        return null;
    }

    protected RequestOptions c(Context context, String str) {
        RequestOptions.Builder builder = new RequestOptions.Builder();
        a(context, str, builder);
        return builder.build();
    }

    @Override // com.huawei.openalliance.ad.g
    public void b(String str) {
        this.f19297c = str;
    }

    protected void b(RemoteCallResultCallback<String> remoteCallResultCallback, boolean z) {
        a(remoteCallResultCallback, this.f19295a, 1000, "ok", z);
    }

    public ContentRecord b(Context context, String str) {
        ContentRecord contentRecordA;
        ContentTemplateRecord contentTemplateRecordA;
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("contentId");
        String strOptString2 = jSONObject.optString("slotid");
        String strOptString3 = jSONObject.optString("templateId", "");
        String strOptString4 = jSONObject.optString(JsbMapKeyNames.H5_UID);
        hw.b("BaseJsbCmd", "queryContentById, uniqueId: %s", strOptString4);
        int iOptInt = jSONObject.optInt("apiVer", 2);
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            if (TextUtils.isEmpty(strOptString)) {
                hw.c("BaseJsbCmd", "content id is null");
                contentRecordA = null;
            } else {
                contentRecordA = ew.a(context).a(strOptString);
            }
        } else if (iOptInt == 3) {
            contentRecordA = ex.b(context).a(strOptString, strOptString3, strOptString2, strOptString4);
            if (contentRecordA != null && (contentTemplateRecordA = ez.a(context).a(contentRecordA.o(), contentRecordA.aP())) != null) {
                contentRecordA.l(contentTemplateRecordA.c());
                contentRecordA.ac(contentTemplateRecordA.g());
                contentRecordA.a(new TemplateData(contentTemplateRecordA.d(), contentTemplateRecordA.e(), contentTemplateRecordA.f()));
            }
        } else {
            contentRecordA = ew.a(context).a(strOptString, strOptString2, strOptString4);
        }
        a(contentRecordA, str);
        return contentRecordA;
    }

    public boolean a(Context context, ContentRecord contentRecord) {
        if (contentRecord == null) {
            return false;
        }
        EncryptionField<String> encryptionFieldAF = contentRecord.aF();
        return com.huawei.openalliance.ad.utils.dg.d(this.f19296b, encryptionFieldAF != null ? encryptionFieldAF.a(context) : null) && pa.k(contentRecord.X());
    }

    @Override // com.huawei.openalliance.ad.g
    public void a(String str) {
        this.f19296b = str;
    }

    protected void a(RemoteCallResultCallback<String> remoteCallResultCallback, boolean z) {
        a(remoteCallResultCallback, this.f19295a, 1011, "", z);
    }

    @Override // com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        hw.c("BaseJsbCmd", "async execute is not implemented!");
        throw new IllegalStateException("async execute is not implemented!");
    }

    @Override // com.huawei.openalliance.ad.g
    public void a(Activity activity) {
        synchronized (this.d) {
            if (activity != null) {
                this.e = new WeakReference<>(activity);
                hw.a("BaseJsbCmd", "cur activity: %s, hash code: %s", activity.getClass(), Integer.valueOf(activity.hashCode()));
            }
        }
    }

    @Override // com.huawei.openalliance.ad.g
    public Object a(Context context, String str) {
        hw.c("BaseJsbCmd", "direct call is not implemented!");
        throw new IllegalStateException("direct call is not implemented!");
    }

    @Override // com.huawei.openalliance.ad.g
    public com.huawei.openalliance.ad.utils.o.a a() {
        return com.huawei.openalliance.ad.utils.o.a.IO;
    }

    public Context a(Context context) {
        Activity activity;
        synchronized (this.d) {
            WeakReference<Activity> weakReference = this.e;
            if (weakReference == null || (activity = weakReference.get()) == null) {
                return context;
            }
            hw.a("BaseJsbCmd", "cur activity: %s, hash code: %s", activity.getClass(), Integer.valueOf(activity.hashCode()));
            return activity;
        }
    }

    public static boolean i(String str) {
        return !com.huawei.openalliance.ad.utils.dg.b(str) && com.huawei.openalliance.ad.utils.dg.a(str.trim(), -111111) >= 10000301;
    }

    private Map<String, Bundle> c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map map = (Map) com.huawei.openalliance.ad.utils.bk.b(str, Map.class, Map.class);
        hw.a("BaseJsbCmd", "extras: %s", str);
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null) {
                Bundle bundle = new Bundle();
                String str2 = (String) entry.getKey();
                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    if (entry2 != null) {
                        bundle.putString((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                map2.put(str2, bundle);
            }
        }
        return map2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062 A[SYNTHETIC] */
    private SearchInfo b(JSONObject jSONObject) {
        String[] strArrSplit;
        int length;
        int i;
        Integer numValueOf;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString(JsbMapKeyNames.H5_SEARCHINFO_QRY);
        String strOptString2 = jSONObject.optString(JsbMapKeyNames.H5_SEARCHINFO_KWS_TYPE);
        String strOptString3 = jSONObject.optString(JsbMapKeyNames.H5_SEARCHINFO_KWS_KW);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strOptString3)) {
            String[] strArrSplit2 = strOptString3.split(",");
            if (TextUtils.isEmpty(strOptString2)) {
                strArrSplit = null;
            } else {
                strArrSplit = strOptString2.split(",");
                if (!TextUtils.isEmpty(strOptString2)) {
                    length = strArrSplit.length;
                }
                for (i = 0; i < strArrSplit2.length; i++) {
                    if (TextUtils.isEmpty(strArrSplit2[i])) {
                        if (length >= i + 1) {
                            numValueOf = Integer.valueOf(com.huawei.openalliance.ad.utils.dg.a(strArrSplit[i], 0));
                        } else {
                            numValueOf = null;
                        }
                        arrayList.add(new Keyword(numValueOf, strArrSplit2[i]));
                    }
                }
            }
            length = 0;
            while (i < strArrSplit2.length) {
                if (TextUtils.isEmpty(strArrSplit2[i])) {
                    if (length >= i + 1) {
                        numValueOf = Integer.valueOf(com.huawei.openalliance.ad.utils.dg.a(strArrSplit[i], 0));
                    } else {
                        numValueOf = null;
                    }
                    arrayList.add(new Keyword(numValueOf, strArrSplit2[i]));
                }
            }
        }
        String strOptString4 = jSONObject.optString(JsbMapKeyNames.H5_SEARCHINFO_CHNL);
        if (TextUtils.isEmpty(strOptString) && arrayList.isEmpty() && TextUtils.isEmpty(strOptString4)) {
            return null;
        }
        return new SearchInfo(strOptString, arrayList, strOptString4);
    }

    public static void a(RemoteCallResultCallback<String> remoteCallResultCallback, String str, int i, JSONObject jSONObject) {
        if (remoteCallResultCallback != null) {
            CallResult<String> callResult = new CallResult<>();
            callResult.setCode(i);
            try {
                callResult.setData(jSONObject.toString());
            } catch (Throwable th) {
                hw.c("BaseJsbCmd", "onCallResult by callBackJson " + th.getClass().getSimpleName());
            }
            remoteCallResultCallback.onRemoteCallResult(str, callResult);
        }
    }

    public static <T> void a(RemoteCallResultCallback<String> remoteCallResultCallback, String str, int i, T t, boolean z) {
        a(remoteCallResultCallback, str, i, new JsbCallBackData(t, z, null));
    }

    public static void a(RemoteCallResultCallback<String> remoteCallResultCallback, String str, int i, JsbCallBackData jsbCallBackData) {
        if (remoteCallResultCallback != null) {
            CallResult<String> callResult = new CallResult<>();
            callResult.setCode(i);
            try {
                callResult.setData(com.huawei.openalliance.ad.utils.bk.b(jsbCallBackData));
            } catch (Throwable th) {
                hw.c("BaseJsbCmd", "onCallResult " + th.getClass().getSimpleName());
            }
            remoteCallResultCallback.onRemoteCallResult(str, callResult);
        }
    }

    private void a(ContentRecord contentRecord, String str) {
        if (contentRecord != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = !TextUtils.isEmpty(jSONObject.optString("showId")) ? jSONObject.optString("showId") : "";
                if (!TextUtils.isEmpty(strOptString)) {
                    contentRecord.c(strOptString);
                }
                if (!TextUtils.isEmpty(jSONObject.optString("requestId"))) {
                    contentRecord.y(jSONObject.optString("requestId"));
                }
                long jOptLong = jSONObject.optLong(JsbMapKeyNames.START_SHOW_TIME);
                Long lValueOf = Long.valueOf(jOptLong);
                lValueOf.getClass();
                if (jOptLong == 0) {
                    lValueOf = Long.valueOf(com.huawei.openalliance.ad.utils.dg.a(strOptString, 0L));
                }
                if (lValueOf.longValue() != 0) {
                    contentRecord.h(lValueOf.longValue());
                }
                String strOptString2 = jSONObject.optString(JsbMapKeyNames.H5_CUSTOM_DATA);
                String strOptString3 = jSONObject.optString(JsbMapKeyNames.H5_USER_ID);
                String strOptString4 = jSONObject.optString(JsbMapKeyNames.H5_UID);
                if (strOptString2 != null) {
                    contentRecord.G(strOptString2);
                }
                if (strOptString3 != null) {
                    contentRecord.H(strOptString3);
                }
                if (TextUtils.isEmpty(strOptString4)) {
                    return;
                }
                contentRecord.v(strOptString4);
            } catch (Throwable unused) {
                hw.c("BaseJsbCmd", "update content failed");
            }
        }
    }

    private void a(RequestOptions.Builder builder, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(JsbMapKeyNames.H5_CHILD_PROTECTION_TAG, -111111);
        Integer numValueOf = Integer.valueOf(iOptInt);
        int iOptInt2 = jSONObject.optInt(JsbMapKeyNames.H5_QUE, -111111);
        Integer numValueOf2 = Integer.valueOf(iOptInt2);
        int iOptInt3 = jSONObject.optInt(JsbMapKeyNames.H5_UNDER_AGE_OF_PROMISE_TAG, -111111);
        Integer numValueOf3 = Integer.valueOf(iOptInt3);
        int iOptInt4 = jSONObject.optInt(JsbMapKeyNames.H5_NPA, -111111);
        Integer numValueOf4 = Integer.valueOf(iOptInt4);
        int iOptInt5 = jSONObject.optInt(JsbMapKeyNames.HW_DSP_NPA, -111111);
        Integer numValueOf5 = Integer.valueOf(iOptInt5);
        int iOptInt6 = jSONObject.optInt(JsbMapKeyNames.THIRD_DSP_NPA, -111111);
        Integer numValueOf6 = Integer.valueOf(iOptInt6);
        String strOptString = jSONObject.optString(JsbMapKeyNames.H5_AD_CONTENT_CLASSIFICATION);
        Boolean boolValueOf = Boolean.valueOf(jSONObject.optBoolean(JsbMapKeyNames.H5_REQUESTLOCATION, true));
        String strOptString2 = jSONObject.optString(JsbMapKeyNames.H5_CONSENT);
        String strOptString3 = jSONObject.optString(JsbMapKeyNames.H5_SEARCHTERM);
        String strOptString4 = jSONObject.optString(JsbMapKeyNames.H5_APPLANG);
        String strOptString5 = jSONObject.optString(JsbMapKeyNames.H5_APPCOUNTRY);
        Map<String, Bundle> mapC = c(jSONObject.optString(JsbMapKeyNames.H5_EXTRAS));
        App appA = a(jSONObject.optJSONObject("app"));
        SearchInfo searchInfoB = b(jSONObject.optJSONObject(JsbMapKeyNames.H5_SEARCHINFO));
        if (!jSONObject.isNull(JsbMapKeyNames.H5_USE_CONSENT_NPA)) {
            builder.setUseConsentNpa(jSONObject.optBoolean(JsbMapKeyNames.H5_USE_CONSENT_NPA));
        }
        numValueOf.getClass();
        if (-111111 != iOptInt) {
            builder.setTagForChildProtection(numValueOf);
        }
        numValueOf3.getClass();
        if (-111111 != iOptInt3) {
            builder.setTagForUnderAgeOfPromise(numValueOf3);
        }
        if (!TextUtils.isEmpty(strOptString)) {
            builder.setAdContentClassification(strOptString);
        }
        numValueOf2.getClass();
        if (-111111 != iOptInt2) {
            builder.setIsQueryUseEnabled(numValueOf2);
        }
        numValueOf4.getClass();
        if (-111111 != iOptInt4) {
            builder.setNonPersonalizedAd(numValueOf4);
        }
        numValueOf5.getClass();
        if (-111111 != iOptInt5) {
            builder.setHwNonPersonalizedAd(numValueOf5);
        }
        numValueOf6.getClass();
        if (-111111 != iOptInt6) {
            builder.setThirdNonPersonalizedAd(numValueOf6);
        }
        if (!TextUtils.isEmpty(strOptString2)) {
            builder.setConsent(strOptString2);
        }
        if (!TextUtils.isEmpty(strOptString3)) {
            builder.setSearchTerm(strOptString3);
        }
        if (boolValueOf != null) {
            builder.setRequestLocation(boolValueOf);
        }
        if (appA != null) {
            builder.setApp(appA);
        }
        if (!TextUtils.isEmpty(strOptString4)) {
            builder.setAppLang(strOptString4);
        }
        if (!TextUtils.isEmpty(strOptString5)) {
            builder.setAppCountry(strOptString5);
        }
        if (mapC != null) {
            builder.setExtras(mapC);
        }
        if (searchInfoB != null) {
            builder.setSearchInfo(searchInfoB);
        }
    }

    private void a(Context context, String str, RequestOptions.Builder builder) {
        JSONObject jSONObject = new JSONObject(str);
        int iOptInt = jSONObject.optInt("brand", -111111);
        Integer numValueOf = Integer.valueOf(iOptInt);
        boolean zOptBoolean = jSONObject.optBoolean(JsbMapKeyNames.H5_APPINSTALLEDNOTIFY, true);
        Boolean boolValueOf = Boolean.valueOf(zOptBoolean);
        int iOptInt2 = jSONObject.optInt(JsbMapKeyNames.H5_APPACTIVATESTYLE, 0);
        Integer numValueOf2 = Integer.valueOf(iOptInt2);
        boolean zOptBoolean2 = jSONObject.optBoolean(JsbMapKeyNames.H5_APPAUTOOPENFORBIDDEN, false);
        Boolean boolValueOf2 = Boolean.valueOf(zOptBoolean2);
        String strOptString = jSONObject.optString(JsbMapKeyNames.H5_BELONG_COUNTRY);
        if (numValueOf != null) {
            numValueOf.getClass();
            if (-111111 != iOptInt) {
                IHiAd hiAd = HiAd.getInstance(context);
                numValueOf.getClass();
                hiAd.setBrand(iOptInt);
            }
        }
        if (boolValueOf != null) {
            IHiAd hiAd2 = HiAd.getInstance(context);
            boolValueOf.getClass();
            hiAd2.setAppInstalledNotify(zOptBoolean);
        }
        hw.b("BaseJsbCmd", "appActivateStyle: %s", numValueOf2);
        numValueOf2.getClass();
        if (iOptInt2 != 0) {
            IHiAd hiAd3 = HiAd.getInstance(context);
            numValueOf2.getClass();
            hiAd3.setAppActivateStyle(iOptInt2);
        }
        if (boolValueOf2 != null) {
            IHiAd hiAd4 = HiAd.getInstance(context);
            boolValueOf2.getClass();
            hiAd4.setAppAutoOpenForbidden(zOptBoolean2);
        }
        if (!TextUtils.isEmpty(strOptString)) {
            HiAd.getInstance(context).setCountryCode(strOptString);
        }
        if (builder != null) {
            a(builder, jSONObject);
        }
    }

    private App a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("name");
        String strOptString2 = jSONObject.optString("version");
        String strOptString3 = jSONObject.optString(JsbMapKeyNames.H5_APP_PKGNAME);
        String strOptString4 = jSONObject.optString(JsbMapKeyNames.H5_APP_HOSTPKGNAME);
        if (TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString3) && TextUtils.isEmpty(strOptString2) && TextUtils.isEmpty(strOptString4)) {
            return null;
        }
        return new App(strOptString3, strOptString, strOptString2, strOptString4);
    }

    public j(String str) {
        this.f19295a = str;
    }
}
