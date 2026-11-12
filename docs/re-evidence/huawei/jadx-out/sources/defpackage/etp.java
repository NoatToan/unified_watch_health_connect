package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.text.TextUtils;
import com.amap.api.services.district.DistrictSearchQuery;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.versionmgr.api.VersionMgrApi;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class etp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Location f33466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33467b;
    private final b d;
    private npg e;

    public etp(b bVar) {
        this.d = bVar;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f33468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f33469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f33470c;
        private String d;
        private String e;
        private String i;

        public etp b() {
            return new etp(this);
        }

        public b c(String str) {
            this.f33470c = str;
            return this;
        }

        public b h(String str) {
            this.i = str;
            return this;
        }

        public b e(String str) {
            this.f33469b = str;
            return this;
        }

        public b b(String str) {
            this.f33468a = str;
            return this;
        }

        public b d(String str) {
            this.d = str;
            return this;
        }

        public b a(String str) {
            this.e = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String e() {
            return this.f33470c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String h() {
            return this.i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String d() {
            return this.f33469b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a() {
            return this.d;
        }
    }

    public void e() {
        LogUtil.a("UploadDataToHotaServer", "uploadData");
        String strC = this.d.c();
        if (!TextUtils.isEmpty(strC) && !era.g(strC)) {
            LogUtil.a("UploadDataToHotaServer", "isIntelligentDevice is false");
        } else if (b()) {
            LogUtil.a("UploadDataToHotaServer", "device sn has been upload");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: etq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33471b.d();
                }
            });
        }
    }

    private void j() {
        OutputStream outputStreamA = a();
        LogUtil.d("UploadDataToHotaServer", "send json: ", System.lineSeparator(), outputStreamA.toString());
        String strD = d(((VersionMgrApi) Services.b("HWVersionMgr", VersionMgrApi.class)).getUpdateUrl(false), outputStreamA.toString());
        LogUtil.a("UploadDataToHotaServer", "receive json:", strD);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("UploadDataToHotaServer", "receive is empty");
            return;
        }
        try {
            if ("1".equals(new JSONObject(strD).getString("status"))) {
                h();
            }
        } catch (JSONException unused) {
            LogUtil.e("UploadDataToHotaServer", "uploadDataToHota jsonException");
        }
    }

    private OutputStream a() {
        LogUtil.a("UploadDataToHotaServer", "convertVersionFilterJsonToStream(bone) begin");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        JSONObject jSONObject = new JSONObject();
        try {
            c(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("components", c());
            jSONObject2.putOpt("rules", jSONObject);
            try {
                byteArrayOutputStream.write(jSONObject2.toString().getBytes(StandardCharsets.UTF_8));
                byteArrayOutputStream.flush();
            } catch (IOException e) {
                LogUtil.e("UploadDataToHotaServer", "convertVersionFilterJsonToStream(bone) IOException ", e.getMessage());
            }
        } catch (JSONException unused) {
            LogUtil.e("UploadDataToHotaServer", "convertVersionFilterJsonToStream(bone), JSONException");
        }
        LogUtil.a("UploadDataToHotaServer", "convertVersionFilterJsonToStream(bone) leave");
        return byteArrayOutputStream;
    }

    private void c(JSONObject jSONObject) throws JSONException {
        jSONObject.put("FingerPrint", Build.FINGERPRINT);
        jSONObject.put("DeviceName", Build.MODEL);
        String strA = this.d.a();
        if (!TextUtils.isEmpty(strA)) {
            strA = strA.replace(Constants.LINK, "");
        }
        jSONObject.put("deviceId", strA);
        if (!TextUtils.isEmpty(this.f33467b)) {
            jSONObject.put("extra_info", this.f33467b);
        }
        jSONObject.put("Language", b(BaseApplication.getContext()));
        jSONObject.put("OS", "Android " + Build.VERSION.RELEASE);
    }

    private JSONArray c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DetailRect.CP_PACKAGE, this.d.e());
        jSONObject.put("PackageVersionCode", this.d.h());
        jSONObject.put("PackageVersionName", this.d.d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    private String b(Context context) {
        String strB;
        String country;
        if (context == null) {
            strB = "";
            country = "";
        } else {
            Configuration configuration = context.getResources().getConfiguration();
            strB = LanguageUtil.b(BaseApplication.getContext());
            country = configuration.locale.getCountry();
        }
        return (strB + '-' + country).toLowerCase(Locale.ENGLISH);
    }

    private String d(String str, String str2) {
        LogUtil.d("UploadDataToHotaServer", "postReq, urlString:", str);
        if (!TextUtils.isEmpty(str)) {
            if (d(str)) {
                return lta.b(str, str2);
            }
            return ltf.a(str, str2, true);
        }
        return "";
    }

    private boolean d(String str) {
        int iIndexOf;
        if (!TextUtils.isEmpty(str) && (iIndexOf = str.indexOf(":")) >= 0) {
            return "http".equalsIgnoreCase(str.substring(0, iIndexOf));
        }
        return false;
    }

    private boolean g() {
        return e(BaseApplication.getActivity()) && c(BaseApplication.getActivity());
    }

    private boolean e(Context context) {
        if (context != null) {
            return PermissionUtil.e(context, PermissionUtil.PermissionType.LOCATION) == PermissionUtil.PermissionResult.GRANTED;
        }
        LogUtil.j("UploadDataToHotaServer", "checkGpsIsAcceptPermission, context is null");
        return false;
    }

    private boolean c(Context context) {
        boolean zA = a(context);
        LogUtil.a("UploadDataToHotaServer", "gpsLocationisEnable isGpsEnable is ", Boolean.valueOf(zA));
        return zA;
    }

    private boolean a(Context context) {
        boolean zIsProviderEnabled;
        boolean zIsProviderEnabled2;
        if (context == null) {
            LogUtil.j("UploadDataToHotaServer", "context is null");
            return false;
        }
        Object systemService = context.getSystemService("location");
        if (systemService instanceof LocationManager) {
            LocationManager locationManager = (LocationManager) systemService;
            zIsProviderEnabled2 = locationManager.isProviderEnabled(GeocodeSearch.GPS);
            zIsProviderEnabled = locationManager.isProviderEnabled("network");
        } else {
            zIsProviderEnabled = false;
            zIsProviderEnabled2 = false;
        }
        return zIsProviderEnabled2 || zIsProviderEnabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (!g()) {
            LogUtil.a("UploadDataToHotaServer", "isAppHasLocationPermission is false");
            j();
            return;
        }
        if (this.e == null) {
            this.e = npg.d();
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add("network");
        arrayList.add(GeocodeSearch.GPS);
        Location locationC = this.e.c(arrayList);
        this.f33466a = locationC;
        if (locationC == null) {
            this.f33466a = this.e.c();
        }
        arrayList.clear();
        if (this.f33466a != null) {
            LogUtil.a("UploadDataToHotaServer", "get location != null");
            i();
        } else {
            LogUtil.a("UploadDataToHotaServer", "processLocationForQuery location is null");
            j();
        }
    }

    private void i() {
        try {
            List<Address> fromLocation = new Geocoder(BaseApplication.getContext(), Locale.getDefault()).getFromLocation(new BigDecimal(this.f33466a.getLatitude()).setScale(3, 4).doubleValue(), new BigDecimal(this.f33466a.getLongitude()).setScale(3, 4).doubleValue(), 1);
            if (njy.e(fromLocation)) {
                LogUtil.j("UploadDataToHotaServer", "location result is null");
                j();
                return;
            }
            if (fromLocation.get(0) instanceof Address) {
                Address address = fromLocation.get(0);
                if (address.getSubLocality() == null) {
                    LogUtil.j("UploadDataToHotaServer", "location getSubLocality is null");
                    j();
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("country", address.getCountryCode());
                jSONObject.put(DistrictSearchQuery.KEYWORDS_PROVINCE, address.getAdminArea());
                jSONObject.put(DistrictSearchQuery.KEYWORDS_CITY, address.getLocality());
                jSONObject.put("area", address.getSubLocality());
                this.f33467b = jSONObject.toString();
            }
            j();
        } catch (IOException unused) {
            LogUtil.e("UploadDataToHotaServer", "location IOException");
        } catch (JSONException unused2) {
            LogUtil.e("UploadDataToHotaServer", "location JSONException");
        }
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("UploadDataToHotaServer", "sn is empty");
            return;
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.length() < 7) {
            LogUtil.a("UploadDataToHotaServer", "sn invalids");
            return;
        }
        sb.replace(6, 7, "");
        sb.replace(0, 2, "");
        new b().d(sb.toString()).b().e();
    }

    private void h() {
        String strE = nio.e(this.d.a());
        if (TextUtils.isEmpty(strE)) {
            LogUtil.a("UploadDataToHotaServer", "setSnToSharedPreference sn sha256 is empty");
            return;
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), strE, "1", new StorageParams());
    }

    public boolean b() {
        String strE = nio.e(this.d.a());
        if (TextUtils.isEmpty(strE)) {
            LogUtil.a("UploadDataToHotaServer", "getSnToSharedPreference sn sha256 is empty");
            return false;
        }
        return "1".equals(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), strE));
    }
}
