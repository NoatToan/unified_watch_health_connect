package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class stj extends QrCodeDataBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f48672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f48674c;
    private String d;
    private String e;

    public stj(String str) {
        super(str);
    }

    public String b() {
        return this.f48673b;
    }

    public void c(String str) {
        this.f48673b = str;
    }

    public String c() {
        return this.e;
    }

    public void e(String str) {
        this.e = str;
    }

    public void d(String str) {
        this.d = str;
    }

    public String a() {
        return this.f48672a;
    }

    public void a(String str) {
        this.f48672a = str;
    }

    public String e() {
        return this.f48674c;
    }

    public void b(String str) {
        this.f48674c = str;
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase
    public int parser(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof String) {
                    byte[] bArrDecode = Base64.decode((String) obj, 0);
                    if (bArrDecode != null && bArrDecode.length > 0) {
                        String str = new String(bArrDecode, "UTF-8");
                        LogUtil.d("WifiQrCodeData", "parser result:", str);
                        JSONObject jSONObject = new JSONObject(str);
                        if (TextUtils.isEmpty(str)) {
                            LogUtil.e("R_QrCode_WifiQrCodeData", "parser result is null");
                            return -3;
                        }
                        if (jSONObject.has("nickName")) {
                            d(jSONObject.getString("nickName"));
                        }
                        if (jSONObject.has("devId")) {
                            c(jSONObject.getString("devId"));
                        }
                        if (jSONObject.has("mainHuid")) {
                            e(jSONObject.getString("mainHuid"));
                        }
                        if (jSONObject.has("verifyCode")) {
                            a(jSONObject.getString("verifyCode"));
                        }
                        if (jSONObject.has("proId")) {
                            b(jSONObject.getString("proId"));
                        }
                        return 0;
                    }
                    LogUtil.e("R_QrCode_WifiQrCodeData", "parser dataByte is null");
                    return -3;
                }
            } catch (UnsupportedEncodingException unused) {
                LogUtil.e("R_QrCode_WifiQrCodeData", "UnsupportedEncodingException");
                return -2;
            } catch (IllegalArgumentException unused2) {
                LogUtil.e("R_QrCode_WifiQrCodeData", "IllegalArgumentException");
                return -2;
            } catch (JSONException unused3) {
                LogUtil.e("R_QrCode_WifiQrCodeData", "JSONException");
                return -2;
            }
        }
        return -3;
    }

    public boolean d() {
        return TextUtils.isEmpty(this.f48673b) || TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f48672a);
    }
}
