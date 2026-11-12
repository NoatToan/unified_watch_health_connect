package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.miot.spec.exception.NotSupportValueException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class m5n {

    public class a implements zdi {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f25780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wa3 f25781b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ String e;

        public a(String str, wa3 wa3Var, String str2, int i, String str3) {
            this.f25780a = str;
            this.f25781b = wa3Var;
            this.c = str2;
            this.d = i;
            this.e = str3;
        }

        @Override // defpackage.zdi
        public void a(int i) {
            m5n.g("bleSpecOperation =>sendProtocolExchangePacket onResp =>protocol version " + i, new Object[0]);
            if (i <= 2) {
                m5n.d(this.c, this.d, this.e, this.f25781b);
                return;
            }
            if (!TextUtils.isEmpty(this.f25780a)) {
                p5n.i().v(this.f25780a);
            }
            wa3 wa3Var = this.f25781b;
            if (wa3Var != null) {
                wa3Var.onFail(-1015, "app spec protocol version less than device spec protocol version, you must upgrade your mijia app!");
            }
        }

        @Override // defpackage.zdi
        public void onFail(int i, String str) {
            m5n.g("bleSpecOperation =>sendProtocolExchangePacket onFail =>(%d,%s)", Integer.valueOf(i), str);
            wa3 wa3Var = this.f25781b;
            if (wa3Var != null) {
                wa3Var.onFail(i, str);
            }
        }
    }

    public class b implements r07 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wa3 f25782a;

        public b(wa3 wa3Var) {
            this.f25782a = wa3Var;
        }

        @Override // defpackage.r07
        public void a(JSONArray jSONArray) {
            if (this.f25782a != null) {
                if (jSONArray == null || jSONArray.length() == 0) {
                    this.f25782a.onSuccess(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("objects", jSONArray);
                    Bundle bundle = new Bundle();
                    bundle.putString("key_spec_json_resp", jSONObject.toString());
                    this.f25782a.onSuccess(bundle);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // defpackage.r07
        public void onFail(int i, String str) {
            wa3 wa3Var = this.f25782a;
            if (wa3Var != null) {
                wa3Var.onFail(i, str);
            }
        }
    }

    public class c implements czl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wa3 f25783a;

        public c(wa3 wa3Var) {
            this.f25783a = wa3Var;
        }

        @Override // defpackage.czl
        public void a(List<q5n> list) {
            if (this.f25783a == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("objects", q5n.n(list));
                Bundle bundle = new Bundle();
                bundle.putString("key_spec_json_resp", jSONObject.toString());
                this.f25783a.onSuccess(bundle);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override // defpackage.czl
        public void onFail(int i, String str) {
            wa3 wa3Var = this.f25783a;
            if (wa3Var == null) {
                return;
            }
            wa3Var.onFail(i, str);
        }
    }

    public class d implements wya {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wa3 f25784a;

        public d(wa3 wa3Var) {
            this.f25784a = wa3Var;
        }

        @Override // defpackage.wya
        public void a(List<q5n> list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("objects", q5n.n(list));
                Bundle bundle = new Bundle();
                bundle.putString("key_spec_json_resp", jSONObject.toString());
                this.f25784a.onSuccess(bundle);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override // defpackage.wya
        public void onFail(int i, String str) {
            wa3 wa3Var = this.f25784a;
            if (wa3Var != null) {
                wa3Var.onFail(i, str);
            }
        }
    }

    public static void c(String str, int i, String str2, String str3, wa3<Bundle> wa3Var) {
        g("ble spec operation, opcode:%d,jsonParams:%s", Integer.valueOf(i), str2);
        if (!p5n.i().w(str)) {
            if (wa3Var != null) {
                g("the device not support ble spec protocol", new Object[0]);
                wa3Var.onFail(-1008, "the device not support ble spec protocol!");
                return;
            }
            return;
        }
        int iH = p5n.i().h(str);
        g(" bleSpecOperation check deviceProtocol(%d) & app ble protocol version(%d)", Integer.valueOf(iH), 2);
        if (iH < 0) {
            p5n.i().t(str, new a(str3, wa3Var, str, i, str2));
            return;
        }
        if (iH <= 2) {
            d(str, i, str2, wa3Var);
            return;
        }
        if (!TextUtils.isEmpty(str3)) {
            p5n.i().v(str3);
        }
        if (wa3Var != null) {
            wa3Var.onFail(-1015, "app spec protocol version less than device spec protocol version, you must upgrade your mijia app!");
        }
    }

    public static void d(String str, int i, String str2, wa3<Bundle> wa3Var) {
        if (i == 0) {
            h(str, str2, wa3Var);
        } else if (i == 2) {
            f(str, str2, wa3Var);
        } else {
            if (i != 5) {
                return;
            }
            e(str, str2, wa3Var);
        }
    }

    public static void e(String str, String str2, wa3<Bundle> wa3Var) {
        l5n l5nVarD;
        try {
            l5nVarD = l5n.d(str2);
        } catch (NotSupportValueException e) {
            if (wa3Var != null) {
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(e.getErrorCode() == 0 ? -1007 : e.getErrorCode());
                objArr[1] = e.getMessage();
                g("parseDoAction error: code=%s,msg=%s", objArr);
                wa3Var.onFail(e.getErrorCode() != 0 ? e.getErrorCode() : -1007, e.getMessage());
            }
            e.printStackTrace();
            l5nVarD = null;
        }
        p5n.i().r(str, l5nVarD, new b(wa3Var));
    }

    public static void f(String str, String str2, wa3<Bundle> wa3Var) {
        List<q5n> listJ;
        try {
            listJ = q5n.j(str2);
        } catch (NotSupportValueException e) {
            if (wa3Var != null) {
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(e.getErrorCode() == 0 ? -1007 : e.getErrorCode());
                objArr[1] = e.getMessage();
                g("parseGetProperty error: code=%s,msg=%s", objArr);
                wa3Var.onFail(e.getErrorCode() != 0 ? e.getErrorCode() : -1007, e.getMessage());
            }
            e.printStackTrace();
            listJ = null;
        }
        p5n.i().j(str, listJ, new d(wa3Var));
    }

    public static void g(String str, Object... objArr) {
        n5n.b("SpecManager", str, objArr);
    }

    public static void h(String str, String str2, wa3<Bundle> wa3Var) {
        List<q5n> listK;
        try {
            listK = q5n.k(str2);
        } catch (NotSupportValueException e) {
            if (wa3Var != null) {
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(e.getErrorCode() == 0 ? -1007 : e.getErrorCode());
                objArr[1] = e.getMessage();
                g("parseSetProperty error: code=%s,msg=%s", objArr);
                wa3Var.onFail(e.getErrorCode() != 0 ? e.getErrorCode() : -1007, e.getMessage());
            }
            e.printStackTrace();
            listK = null;
        }
        p5n.i().u(str, listK, new c(wa3Var));
    }
}
