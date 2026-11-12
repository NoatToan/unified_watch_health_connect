package defpackage;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.HiDateUtil;
import health.compact.a.SharedPreferenceManager;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class dnj implements Serializable {
    private static final long serialVersionUID = -7145013958496895419L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f32056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f32058c;
    private int d;
    private int e;
    private int f;
    private String g;
    private String h;
    private boolean i;
    private String j;
    private float k;
    private String l;
    private String m;
    private int n;
    private float o;
    private float r;

    public dnj() {
        this(null);
    }

    public dnj(JSONObject jSONObject) {
        this.f32056a = (byte) -100;
        this.r = -100.0f;
        this.g = "";
        this.f32057b = -100;
        this.f = -1;
        if (jSONObject != null) {
            e(jSONObject);
        }
    }

    public String i() {
        return (String) dym.d(this.l);
    }

    public void d(String str) {
        this.l = (String) dym.d(str);
    }

    public String h() {
        return (String) dym.d(this.j);
    }

    public void e(String str) {
        this.j = (String) dym.d(str);
    }

    public int c() {
        return ((Integer) dym.d(Integer.valueOf(this.d))).intValue();
    }

    public void e(int i) {
        this.d = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public byte d() {
        return ((Byte) dym.d(Byte.valueOf(this.f32056a))).byteValue();
    }

    public void e(byte b2) {
        this.f32056a = ((Byte) dym.d(Byte.valueOf(b2))).byteValue();
    }

    public int e() {
        return ((Integer) dym.d(Integer.valueOf(this.e))).intValue();
    }

    public void c(int i) {
        this.e = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public float r() {
        return ((Float) dym.d(Float.valueOf(this.r))).floatValue();
    }

    public void e(final float f) {
        this.r = ((Float) dym.d(Float.valueOf(f))).floatValue();
        ThreadPoolManager.c().execute(new Runnable() { // from class: dng
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b(f);
            }
        });
    }

    /* synthetic */ void b(float f) {
        String strE;
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.weight_auto_update_status");
        if (userPreference != null) {
            strE = userPreference.getValue();
        } else {
            strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "health_weight_auto_update");
        }
        if ("0".equals(strE)) {
            LogUtil.a("User", "weight userinfo update switch is close");
        } else {
            LogUtil.a("User", "weight userinfo update switch is on");
            d(f);
        }
    }

    public int m() {
        return ((Integer) dym.d(Integer.valueOf(this.n))).intValue();
    }

    public void a(int i) {
        this.n = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public boolean q() {
        return ((Boolean) dym.d(Boolean.valueOf(this.i))).booleanValue();
    }

    public void a(boolean z) {
        this.i = ((Boolean) dym.d(Boolean.valueOf(z))).booleanValue();
    }

    public float n() {
        return ((Float) dym.d(Float.valueOf(this.f32058c))).floatValue();
    }

    public void c(float f) {
        this.f32058c = ((Float) dym.d(Float.valueOf(f))).floatValue();
    }

    public int j() {
        return ((Integer) dym.d(Integer.valueOf(this.f32057b))).intValue();
    }

    public void d(int i) {
        this.f32057b = ((Integer) dym.d(Integer.valueOf(i))).intValue();
        e(i(i));
    }

    public void c(String str) {
        this.g = (String) dym.d(str);
    }

    public String b() {
        return (String) dym.d(this.g);
    }

    public String l() {
        return this.m;
    }

    public Bitmap k() {
        return (Bitmap) dym.d(qqf.d(this.m));
    }

    public void d(Bitmap bitmap) {
        this.m = qqf.c(bitmap);
    }

    public String g() {
        return (String) dym.d(this.h);
    }

    public void b(String str) {
        this.h = (String) dym.d(str);
    }

    public float o() {
        return ((Float) dym.d(Float.valueOf(this.k))).floatValue();
    }

    public void d(float f) {
        this.k = ((Float) dym.d(Float.valueOf(f))).floatValue();
    }

    public float f() {
        return this.o;
    }

    public void a(float f) {
        this.o = f;
    }

    public int a() {
        return ((Integer) dym.d(Integer.valueOf(this.f))).intValue();
    }

    public void b(int i) {
        this.f = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public boolean u() {
        byte b2 = this.f32056a;
        return b2 == 1 || b2 == 0 || b2 == 2;
    }

    public boolean v() {
        UserInfomation userInfomationA = ioy.a();
        int gender = userInfomationA != null ? userInfomationA.getGender() : -100;
        return gender == 1 || gender == 0 || gender == 2;
    }

    public boolean s() {
        return this.f32057b > 0;
    }

    public boolean y() {
        return this.e > 0;
    }

    public boolean w() {
        return this.r > 0.0f;
    }

    public boolean p() {
        return y() && s() && u();
    }

    public boolean t() {
        return y() && s() && v();
    }

    public String c(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("UUID", this.l);
            jSONObject.put("name", this.j);
            jSONObject.put(CommonConstant.KEY_GENDER, (int) this.f32056a);
            jSONObject.put("height", this.e);
            if (!Double.isNaN(this.r)) {
                jSONObject.put("weight", this.r);
            }
            jSONObject.put("type", this.n);
            jSONObject.put("isCurrent", this.i);
            if (z) {
                jSONObject.put("icon", this.m);
            } else {
                jSONObject.put("icon", "");
            }
            jSONObject.put("goalWeight", this.f32058c);
            jSONObject.put("birthday", this.f32057b);
            jSONObject.put(CmcdConfiguration.KEY_SESSION_ID, this.h);
            if (!Double.isNaN(this.k)) {
                jSONObject.put("userInfoWeight", this.k);
            }
        } catch (JSONException e) {
            LogUtil.e("User", "error when create JSON: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    private void e(JSONObject jSONObject) {
        this.l = jSONObject.optString("UUID");
        this.j = jSONObject.optString("name");
        try {
            this.f32056a = Byte.parseByte(jSONObject.optString(CommonConstant.KEY_GENDER));
        } catch (NumberFormatException unused) {
            LogUtil.e("User", "User, parseJson: gender parse byte fail");
        }
        this.e = jSONObject.optInt("height");
        if (Double.isNaN(jSONObject.optDouble("weight"))) {
            LogUtil.d("User", "@@save mutiuserinfo weight is null");
        } else {
            this.r = (float) jSONObject.optDouble("weight");
        }
        this.n = jSONObject.optInt("type");
        this.i = jSONObject.optBoolean("isCurrent");
        this.m = jSONObject.optString("icon");
        this.f32058c = jSONObject.optInt("goalWeight");
        int iOptInt = jSONObject.optInt("birthday");
        this.f32057b = iOptInt;
        this.d = i(iOptInt);
        this.h = jSONObject.optString(CmcdConfiguration.KEY_SESSION_ID);
        this.k = (float) jSONObject.optDouble("userInfoWeight");
    }

    private int i(int i) {
        if (s()) {
            return (HiDateUtil.d(System.currentTimeMillis()) / 10000) - (i / 10000);
        }
        return 0;
    }

    public String toString() {
        return "uuid= " + this.l + ",name = " + this.j;
    }
}
