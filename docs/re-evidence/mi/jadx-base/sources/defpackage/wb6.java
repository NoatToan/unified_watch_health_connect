package defpackage;

import android.text.TextUtils;
import com.miui.tsmclient.util.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class wb6 {
    public int A;
    public int B;
    public String C;
    public int D;
    public long E;
    public List<Integer> F;
    public int G;
    public int H;
    public boolean I = true;
    public int J;
    public int K;
    public List<Integer> L;
    public List<Integer> M;
    public int N;
    public List<String> O;
    public int P;
    public int Q;
    public int R;
    public byte S;
    public int T;
    public int U;
    public String V;
    public int W;
    public String X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37797b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f37798k;
    public String l;
    public int m;
    public int n;
    public String o;
    public String p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f37799r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f37800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f37801b;

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f37800a = jSONObject.optString("ssid");
            aVar.f37801b = jSONObject.optString("passwd");
            return aVar;
        }
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        int i6 = 1 == i ? 1 : 0;
        if (1 == i2) {
            i6 |= 2;
        }
        if (1 == i3) {
            i6 |= 16;
        }
        if (2 == i4) {
            i6 |= 4;
        } else if (4 == i4) {
            i6 |= 8;
        }
        if (i5 >= 1) {
            return i5 == 1 ? i6 | 256 : i6 | 65536;
        }
        return i6;
    }

    public static wb6 b(JSONObject jSONObject) {
        wb6 wb6Var = new wb6();
        wb6Var.f37796a = jSONObject.optString("model");
        wb6Var.f37797b = jSONObject.optInt("pd_id");
        wb6Var.c = jSONObject.optInt("min_app_version");
        wb6Var.d = jSONObject.optString("name");
        wb6Var.j = jSONObject.optInt("bind_confirm");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("model_regex");
        if (jSONObjectOptJSONObject != null) {
            wb6Var.f37798k = a.a(jSONObjectOptJSONObject);
        }
        wb6Var.l = jSONObject.optString("desc");
        wb6Var.m = jSONObject.optInt("pid");
        wb6Var.n = jSONObject.optInt("status");
        wb6Var.o = jSONObject.optString("brand_name");
        wb6Var.p = jSONObject.optString("cate_name");
        wb6Var.q = jSONObject.optInt("bt_bind_style");
        wb6Var.f37799r = jSONObject.optInt("ct_offline_enter");
        wb6Var.s = jSONObject.optInt("permission_control");
        wb6Var.t = jSONObject.optInt("wexin_share");
        wb6Var.u = jSONObject.optInt("bt_match");
        wb6Var.v = jSONObject.optInt("bt_rssi");
        wb6Var.w = jSONObject.optInt("sc_failed");
        wb6Var.x = jSONObject.optInt("voice_control");
        wb6Var.y = jSONObject.optInt("voice_ctrl_ed");
        wb6Var.z = jSONObject.optInt("op_history");
        wb6Var.J = jSONObject.optInt("sc_type");
        wb6Var.K = jSONObject.optInt("sc_status");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("sc_type_more");
        wb6Var.L = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                wb6Var.L.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i)));
            }
        }
        wb6Var.A = jSONObject.optInt("bt_is_secure");
        wb6Var.B = jSONObject.optInt("bt_gateway");
        wb6Var.e = c(jSONObject, "icon_on", "https://cdn.fds.api.xiaomi.com");
        wb6Var.f = c(jSONObject, "icon_off", "https://cdn.fds.api.xiaomi.com");
        wb6Var.g = c(jSONObject, "icon_offline", "https://cdn.fds.api.xiaomi.com");
        wb6Var.h = c(jSONObject, "icon_bluetooth_pairing", "https://cdn.fds.api.xiaomi.com");
        wb6Var.i = c(jSONObject, "icon_real", "https://cdn.fds.api.xiaomi.com");
        wb6Var.C = c(jSONObject, "icon_336", "https://cdn.fds.api.xiaomi.com");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("sc_type_more_v2");
        wb6Var.M = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                wb6Var.M.add(Integer.valueOf(jSONArrayOptJSONArray2.optInt(i2)));
            }
        }
        wb6Var.N = jSONObject.optInt("fiveG_wifi");
        wb6Var.D = jSONObject.optInt("subcategory_id");
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("relations");
        wb6Var.O = new ArrayList();
        if (jSONArrayOptJSONArray3 != null) {
            for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                wb6Var.O.add(jSONArrayOptJSONArray3.optString(i3));
            }
        }
        wb6Var.H = jSONObject.optInt("brand_id");
        wb6Var.E = jSONObject.optLong("verified_time");
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("display_type_list");
        wb6Var.F = new ArrayList();
        if (jSONArrayOptJSONArray4 != null) {
            for (int i4 = 0; i4 < jSONArrayOptJSONArray4.length(); i4++) {
                wb6Var.F.add(Integer.valueOf(jSONArrayOptJSONArray4.optInt(i4)));
            }
        }
        wb6Var.P = jSONObject.optInt("rank");
        wb6Var.Q = jSONObject.optInt("inherit_id");
        wb6Var.R = jSONObject.optInt("mesh_gateway");
        wb6Var.S = (byte) jSONObject.optInt("member_cnt");
        wb6Var.U = jSONObject.optInt("support_uwb");
        wb6Var.T = a(wb6Var.B, wb6Var.R, jSONObject.optInt("infrared_gateway"), jSONObject.optInt("zigbee_gateway"), wb6Var.U);
        wb6Var.V = jSONObject.optString("privacy_ver");
        wb6Var.G = jSONObject.optInt("eth_type");
        wb6Var.W = jSONObject.optInt("centre");
        wb6Var.I = jSONObject.optInt("ssid_type") != 1;
        wb6Var.X = jSONObject.optString("localizations");
        return wb6Var;
    }

    public static String c(JSONObject jSONObject, String str, String str2) {
        String strOptString = jSONObject.optString(str);
        if (TextUtils.isEmpty(strOptString) || strOptString.startsWith("http") || strOptString.startsWith(Constants.URI_SCHEME)) {
            return strOptString;
        }
        return str2 + strOptString;
    }
}
