package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.watchface.utils.analytice.data.BaseEvent;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.IoUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class nvt implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f43837c = false;
    private static DeviceInfo e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f43838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f43839b;
    private nun d;

    public nvt(nun nunVar, boolean z, boolean z2) {
        this.d = nunVar;
        this.f43839b = z;
        this.f43838a = z2;
    }

    public static void d(DeviceInfo deviceInfo) {
        e = deviceInfo;
    }

    public static void b(boolean z) {
        f43837c = z;
    }

    private static String c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("updateLog")) {
                LogUtil.a("AppStatusReportThread", "getUpdateLogContent not have updateLog");
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("updateLog");
            if (jSONObject2.has("IMEI")) {
                jSONObject2.put("IMEI", CommonUtil.n(jSONObject2.getString("IMEI")));
            }
            if (jSONObject2.has("udid")) {
                jSONObject2.put("udid", CommonUtil.n(jSONObject2.getString("udid")));
            }
            if (jSONObject2.has("deviceId")) {
                jSONObject2.put("deviceId", CommonUtil.n(jSONObject2.getString("deviceId")));
            }
            jSONObject.put("updateLog", jSONObject2);
            return jSONObject.toString();
        } catch (JSONException unused) {
            LogUtil.e("AppStatusReportThread", "getUpdateLogContent JSONException");
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        int iE;
        OutputStream outputStreamC = null;
        try {
            outputStreamC = c();
            if (outputStreamC != null) {
                LogUtil.a("AppStatusReportThread", "app status : ", System.lineSeparator(), c(outputStreamC.toString()));
                LogUtil.a("AppStatusReportThread", "isHonorDevice: ", Boolean.valueOf(eei.d(e)));
                if ((f43837c && this.f43838a && !this.f43839b) || (eei.d(e) && !this.f43839b && !this.f43838a)) {
                    str = nvd.a() + "/Ring2/v2/UpdateReport.action";
                } else if (CommonUtil.ap() && !this.f43839b) {
                    str = "";
                } else {
                    str = GRSManager.c(BaseApplication.getContext()).getUrl("domainQueryHicloud") + "/ring/v2/UpdateReport.action";
                }
                if (TextUtils.isEmpty(str)) {
                    iE = 0;
                } else if (nvd.i(str)) {
                    iE = lta.b(str, outputStreamC);
                } else {
                    iE = ltf.e(str, outputStreamC);
                }
                LogUtil.a("AppStatusReportThread", "run statusCode = ", Integer.valueOf(iE));
            }
        } catch (RuntimeException unused) {
            LogUtil.e("AppStatusReportThread", "run RuntimeException");
        } catch (IOException unused2) {
            LogUtil.e("AppStatusReportThread", "run IOException ");
        } catch (JSONException unused3) {
            LogUtil.e("AppStatusReportThread", "run JSONException");
        } finally {
            IoUtils.c(outputStreamC);
        }
    }

    public OutputStream c() throws JSONException, IOException {
        LogUtil.d("AppStatusReportThread", "convertAppStatusReportInfoToStream JSON begin");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        nun nunVar = this.d;
        if (nunVar == null) {
            LogUtil.e("AppStatusReportThread", "appStatusReportInfo is null");
            return null;
        }
        jSONObject.put("operateType", String.valueOf(nunVar.a()));
        if (this.f43839b) {
            if (CommonUtil.bt()) {
                jSONObject2.put("udid", CommonUtil.q());
                jSONObject2.put("deviceId", CommonUtil.k(BaseApplication.getContext()));
            } else if (CommonUtil.bg()) {
                jSONObject2.put("IMEI", this.d.b());
            } else {
                jSONObject2.put("udid", CommonUtil.al());
                jSONObject2.put("deviceId", CommonUtil.k(BaseApplication.getContext()));
            }
        } else if (CommonUtil.s(this.d.b())) {
            jSONObject2.put("deviceId", this.d.b());
        } else {
            jSONObject2.put("IMEI", this.d.b());
        }
        jSONObject2.put("versionID", this.d.c());
        jSONObject2.put("clientversion", this.d.e());
        jSONObject2.put(BaseEvent.KEY_DESCINFO, this.d.d());
        jSONObject.putOpt("updateLog", jSONObject2);
        byte[] bytes = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(bytes);
        byteArrayOutputStream.flush();
        return byteArrayOutputStream;
    }

    public void d() {
        Thread thread = new Thread(this);
        thread.setName("Ver-statusReport");
        thread.start();
    }
}
