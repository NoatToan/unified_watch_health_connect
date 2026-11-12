package com.huawei.openalliance.ad;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.LandpageAppWhiteList;
import com.huawei.openalliance.ad.beans.metadata.LandpageWebBlackList;
import com.huawei.openalliance.ad.beans.server.AppConfigRsp;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.SpKeys;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class et {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final SharedPreferences f18720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final SharedPreferences f18721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected SharedPreferences f18722c;
    protected final SharedPreferences d;
    protected final SharedPreferences e;
    protected final SharedPreferences l;
    protected Context m;
    protected Map<String, String> n;
    protected LandpageAppWhiteList q;
    protected final String r;
    protected LandpageWebBlackList t;
    private final String v;
    protected final byte[] f = new byte[0];
    protected final byte[] g = new byte[0];
    protected final byte[] h = new byte[0];
    protected final byte[] i = new byte[0];
    protected final byte[] j = new byte[0];
    protected final byte[] k = new byte[0];
    protected final Map<String, String> o = new HashMap();
    protected Boolean p = null;
    protected final byte[] s = new byte[0];
    protected String u = "0";

    /* JADX INFO: Access modifiers changed from: protected */
    public int e() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.IMG_SIZE_UPPER_LIMIT, Constants.IMG_SIZE_UPPER_LIMIT_KB);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int d() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.GIF_SIZE_UPPER_LIMIT, Constants.GIF_SIZE_UPPER_LIMIT_KB);
        }
        return i;
    }

    protected int c() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.GIF_TIME_LOWER_LIMIT_FRAME, 100);
        }
        return i;
    }

    protected int b() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.GIF_TIME_UPPER_LIMIT, 8000);
        }
        return i;
    }

    protected void a(List<String> list) {
        synchronized (this.f) {
            if (!com.huawei.openalliance.ad.utils.bm.a(list)) {
                this.f18720a.edit().putStringSet(SpKeys.SINGLE_INSTANCE_LS_MODEL_LIST, com.huawei.openalliance.ad.utils.bm.a(list, true)).commit();
            }
        }
    }

    protected void a(String str, String str2) {
        synchronized (this.f) {
            try {
                String string = this.f18720a.getString(MapKeyNames.REPORT_STRATEGY, "");
                JSONObject jSONObject = com.huawei.openalliance.ad.utils.dg.b(string) ? new JSONObject() : new JSONObject(string);
                jSONObject.put(str2, str);
                this.f18720a.edit().putString(MapKeyNames.REPORT_STRATEGY, jSONObject.toString()).commit();
            } catch (Throwable unused) {
                hw.d("BaseSpHandler", "set report strategy based on slot error");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, AppConfigRsp appConfigRsp, boolean z) {
        synchronized (this.f) {
            hw.b("BaseSpHandler", "sv config");
            SharedPreferences.Editor editorEdit = this.f18720a.edit();
            SharedPreferences.Editor editorEdit2 = this.d.edit();
            editorEdit.putLong(SpKeys.LOCATION_EXPIRE_TIME, appConfigRsp.C().longValue());
            editorEdit.putLong(SpKeys.LOCATION_REFRESH_INTERVAL_TIME, appConfigRsp.F().longValue());
            editorEdit.putInt(SpKeys.LOCATION_COLLECTED_SWITCH, appConfigRsp.D());
            editorEdit.putInt(SpKeys.SPLASH_SHOW_TIME, appConfigRsp.h());
            editorEdit.putInt(SpKeys.SPLASH_VIDEO_SHOW_TIME, appConfigRsp.i());
            a(editorEdit, SpKeys.SPLASH_SHOW_MODE, appConfigRsp.j());
            editorEdit.putInt("splash_skip_area", appConfigRsp.k());
            if (com.huawei.openalliance.ad.utils.ab.j(this.m)) {
                a(editorEdit, SpKeys.SLOGAN_SHOW_TIME, appConfigRsp.g());
            } else {
                a(editorEdit, SpKeys.SLOGAN_SHOW_TIME, appConfigRsp.g(), 2000);
            }
            editorEdit.putLong(SpKeys.SPLASH_SHOW_TIME_INTERVAL, appConfigRsp.e());
            editorEdit.putLong(SpKeys.SLOGAN_REAL_MIN_SHOW_TIME, appConfigRsp.f());
            editorEdit.putInt(SpKeys.SPLASH_APP_DAY_IMPFC, appConfigRsp.d());
            editorEdit.putString(SpKeys.REDUCE_DISTURB_RULE, appConfigRsp.a(a()));
            editorEdit.putInt(SpKeys.GIF_TIME_UPPER_LIMIT, appConfigRsp.a(b()));
            editorEdit.putInt(SpKeys.GIF_TIME_LOWER_LIMIT_FRAME, appConfigRsp.b(c()));
            editorEdit.putInt(SpKeys.GIF_SIZE_UPPER_LIMIT, appConfigRsp.c(d()));
            editorEdit.putInt(SpKeys.IMG_SIZE_UPPER_LIMIT, appConfigRsp.d(e()));
            editorEdit.putFloat(SpKeys.LIMIT_OF_CONTAINER_ASPECT_RATIO, (float) appConfigRsp.I());
            a(editorEdit, SpKeys.SHOW_LANDING_PAGE_MENU, appConfigRsp.n());
            a(editorEdit, "landpage_app_prompt", appConfigRsp.p());
            a(editorEdit, SpKeys.CFG_REF_INTERVAL, appConfigRsp.q());
            if (z) {
                a(str, System.currentTimeMillis());
            }
            editorEdit.putLong(SpKeys.CFG_REF_LAST_TIME, System.currentTimeMillis());
            a(editorEdit, SpKeys.VALIDITY_SPLASH_EVENT, appConfigRsp.r());
            a(editorEdit, SpKeys.VALIDITY_CLICK_SKIP, appConfigRsp.s());
            a(editorEdit, SpKeys.VALIDITY_LOCK_EVENT, appConfigRsp.t());
            a(editorEdit, SpKeys.VALIDITY_NATIVE_EVENT, appConfigRsp.u());
            a(editorEdit, SpKeys.EXSPLASH_DELETE_MODE, appConfigRsp.K());
            a(editorEdit, SpKeys.SPLASH_CACHE_NUM, appConfigRsp.L());
            editorEdit.putString(SpKeys.GLOBAL_SWITCH, appConfigRsp.v());
            editorEdit.putString(SpKeys.SUPPORT_HMS_SDK_VERCODE, appConfigRsp.x());
            editorEdit.putLong(SpKeys.PRELOAD_SPLASH_REQ_TIME_INTERVAL, appConfigRsp.y());
            a(editorEdit, SpKeys.MIN_BANNER_INTERVAL, appConfigRsp.b());
            a(editorEdit, SpKeys.MAX_BANNER_INTERVAL, appConfigRsp.c());
            b(editorEdit, appConfigRsp.E());
            a(editorEdit, SpKeys.NEED_NOTIFY_KIT_WHEN_REQUEST, appConfigRsp.A());
            a(editorEdit, SpKeys.DISKCACHE_VALID_TIME, appConfigRsp.J());
            editorEdit.putString(SpKeys.APP_LIST, appConfigRsp.O());
            editorEdit.putString(SpKeys.TEST_COUNTRY_CODE, appConfigRsp.Q());
            a(editorEdit, appConfigRsp.N(), str);
            a(editorEdit, SpKeys.SUPPORT_GZIP, appConfigRsp.R());
            a(editorEdit, SpKeys.SUPPORT_SDK_SERVER_GZIP, appConfigRsp.ab());
            a(editorEdit, SpKeys.DEFAULT_BANNER_INTERVAL, appConfigRsp.P());
            a(editorEdit, SpKeys.REWARD_GAIN_TIME_PERCENT, appConfigRsp.S());
            a(editorEdit, "ite_ad_close_tm", appConfigRsp.T());
            a(editorEdit, SpKeys.ITE_AD_EXP, appConfigRsp.V());
            a(editorEdit, "ite_ad_ca", appConfigRsp.W());
            a(editorEdit, SpKeys.REWARD_CLOSE_BTN_PERCENT, appConfigRsp.X());
            a(editorEdit, appConfigRsp.a());
            b(editorEdit, "sha256", appConfigRsp.Z());
            a(editorEdit, SpKeys.ALLOW_AD_SKIP_TIME, appConfigRsp.aa());
            a(editorEdit, "splashInteractCloseEffectiveTime", appConfigRsp.G());
            b(editorEdit, "splashFeedbackBtnText", appConfigRsp.H());
            a(editorEdit, SpKeys.VIDEO_CACHA_SIZE, appConfigRsp.ac());
            a(editorEdit, SpKeys.FLOW_CONTROL_SWITCH, appConfigRsp.ae());
            a(appConfigRsp.ad());
            a(editorEdit2, SpKeys.ITE_AD_FS, appConfigRsp.U());
            a(editorEdit2, SpKeys.OAID_REPORT_ON_NPA, appConfigRsp.Y());
            List<String> listW = appConfigRsp.w();
            if (!com.huawei.openalliance.ad.utils.bm.a(listW)) {
                editorEdit.putStringSet(SpKeys.DEF_BROSWER_PKG_LIST, new HashSet(listW));
            }
            List<String> listB = appConfigRsp.B();
            if (com.huawei.openalliance.ad.utils.bm.a(listB)) {
                editorEdit.putStringSet("scheme_info", null);
            } else {
                editorEdit.putStringSet("scheme_info", new HashSet(listB));
            }
            editorEdit.commit();
            editorEdit2.commit();
        }
        kf.a(this.m).c();
        synchronized (this.s) {
            this.q.a(appConfigRsp.o());
        }
        synchronized (this.k) {
            this.t.a(appConfigRsp.z());
        }
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.et.4
            @Override // java.lang.Runnable
            public void run() {
                synchronized (et.this.s) {
                    com.huawei.openalliance.ad.utils.cz.a(et.this.q, et.this.r);
                }
            }
        });
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.et.5
            @Override // java.lang.Runnable
            public void run() {
                synchronized (et.this.k) {
                    com.huawei.openalliance.ad.utils.cz.a(et.this.t, et.this.v);
                }
            }
        });
        final Integer numM = appConfigRsp.M();
        if (numM != null) {
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.et.6
                @Override // java.lang.Runnable
                public void run() {
                    et.this.a(numM.intValue());
                    long jIntValue = ((long) numM.intValue()) * 1048576;
                    dn dnVarA = dk.a(et.this.m, "normal");
                    long jC = dnVarA.c();
                    if (jC > 0 && jC != jIntValue) {
                        dnVarA.a(jIntValue);
                    }
                    dn dnVarA2 = dk.a(et.this.m, "ar");
                    long jC2 = dnVarA2.c();
                    if (jC2 <= 0 || jC2 == jIntValue) {
                        return;
                    }
                    dnVarA2.a(jIntValue);
                }
            });
        }
        final Integer numL = appConfigRsp.L();
        if (numL != null) {
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.et.7
                @Override // java.lang.Runnable
                public void run() {
                    dn dnVarA = dk.a(et.this.m, "normal");
                    int iB = dnVarA.b();
                    if (iB > 0 && iB != numL.intValue()) {
                        dnVarA.a(numL.intValue());
                    }
                    dn dnVarA2 = dk.a(et.this.m, "ar");
                    int iB2 = dnVarA2.b();
                    if (iB2 <= 0 || iB2 == numL.intValue()) {
                        return;
                    }
                    dnVarA2.a(numL.intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, long j) {
        synchronized (this.f) {
            try {
                String string = this.f18720a.getString(SpKeys.CFG_REF_LAST_TIME_SLOTID, "");
                JSONObject jSONObject = com.huawei.openalliance.ad.utils.dg.b(string) ? new JSONObject() : new JSONObject(string);
                jSONObject.put(str, j);
                this.f18720a.edit().putString(SpKeys.CFG_REF_LAST_TIME_SLOTID, jSONObject.toString()).commit();
            } catch (Throwable unused) {
                hw.d("BaseSpHandler", "set cfg refresh time based on slot error");
            }
        }
    }

    protected void a(SharedPreferences.Editor editor, String str, Integer num) {
        if (num != null) {
            editor.putInt(str, num.intValue());
        }
    }

    protected void a(int i) {
        if (i <= 0) {
            return;
        }
        synchronized (this.f) {
            SharedPreferences.Editor editorEdit = this.f18720a.edit();
            editorEdit.putInt(SpKeys.DISK_CACHE_SIZE, i);
            editorEdit.commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a() {
        String string;
        synchronized (this.f) {
            string = this.f18720a.getString(SpKeys.REDUCE_DISTURB_RULE, null);
        }
        return string;
    }

    private void z() {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.et.8
            @Override // java.lang.Runnable
            public void run() {
                et etVar = et.this;
                etVar.p = Boolean.valueOf(cc.a(etVar.m).d());
            }
        });
    }

    private void b(SharedPreferences.Editor editor, String str, String str2) {
        if (str2 != null) {
            editor.putString(str, str2);
        }
    }

    private void b(SharedPreferences.Editor editor, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apiWhiteList", jSONObject);
            b(editor, SpKeys.API_WHITE_LIST, jSONObject2.toString());
        } catch (JSONException unused) {
            hw.d("BaseSpHandler", "putApiWhiteList JSONException");
        }
    }

    private String aO() {
        hw.a("BaseSpHandler", "put support video codec");
        int codecCount = MediaCodecList.getCodecCount();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                hashSet.addAll(Arrays.asList(codecInfoAt.getSupportedTypes()));
            }
        }
        String strA = com.huawei.openalliance.ad.utils.dg.a((List<String>) new ArrayList(hashSet), ",");
        synchronized (this.f) {
            SharedPreferences.Editor editorEdit = this.f18720a.edit();
            editorEdit.putString(SpKeys.SUPPORT_VIDEO_CODEC, strA);
            editorEdit.commit();
        }
        return strA;
    }

    private String aN() {
        String string;
        synchronized (this.f) {
            string = this.f18720a.getString(SpKeys.SUPPORT_VIDEO_CODEC, "");
        }
        return !com.huawei.openalliance.ad.utils.dg.b(string) ? string : aO();
    }

    private String aM() {
        String string;
        synchronized (this.f) {
            string = this.f18720a.getString(SpKeys.CONFIG_MAP, "");
        }
        return string;
    }

    private boolean aL() {
        boolean z;
        synchronized (this.f) {
            z = this.f18720a.getBoolean(SpKeys.HAS_RESTORE_CONFIG, false);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aK() {
        synchronized (this.i) {
            for (Map.Entry<String, ?> entry : this.l.getAll().entrySet()) {
                this.o.put(entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void aJ() {
        if (aL()) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = this.f18722c;
            if (sharedPreferences != null) {
                Map<String, ?> all = sharedPreferences.getAll();
                if (all != null && !all.isEmpty()) {
                    Set<Map.Entry<String, ?>> setEntrySet = all.entrySet();
                    if (setEntrySet != null && !setEntrySet.isEmpty()) {
                        SharedPreferences.Editor editorEdit = this.f18720a.edit();
                        Iterator<Map.Entry<String, ?>> it = setEntrySet.iterator();
                        while (it.hasNext()) {
                            a(it.next(), editorEdit);
                        }
                        editorEdit.commit();
                    }
                    a(true);
                    return;
                }
                if (!hw.a()) {
                    return;
                }
            } else if (!hw.a()) {
                return;
            }
            hw.a("BaseSpHandler", "there is no old config file");
        } catch (Throwable th) {
            hw.c("BaseSpHandler", "restore config error:" + th.getClass().getSimpleName());
        }
    }

    private void a(boolean z) {
        synchronized (this.f) {
            this.f18720a.edit().putBoolean(SpKeys.HAS_RESTORE_CONFIG, z).commit();
        }
    }

    private void a(Map.Entry<String, ?> entry, SharedPreferences.Editor editor) {
        if (entry == null || editor == null) {
            return;
        }
        Object value = entry.getValue();
        String key = entry.getKey();
        if (value instanceof Integer) {
            editor.putInt(key, ((Integer) value).intValue());
            return;
        }
        if (value instanceof Boolean) {
            editor.putBoolean(key, ((Boolean) value).booleanValue());
            return;
        }
        if (value instanceof Long) {
            editor.putLong(key, ((Long) value).longValue());
            return;
        }
        if (value instanceof Float) {
            editor.putFloat(key, ((Float) value).floatValue());
        } else if (value instanceof String) {
            editor.putString(key, (String) value);
        } else if (value instanceof Set) {
            editor.putStringSet(key, new HashSet((Set) value));
        }
    }

    private void a(Object obj) {
        if (obj == null) {
            hw.a("BaseSpHandler", "allowed video codec is null");
            return;
        }
        String string = obj.toString();
        String strAN = aN();
        if (com.huawei.openalliance.ad.utils.dg.b(strAN)) {
            hw.a("BaseSpHandler", "support video codec is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(string)) {
            String[] strArrSplit = string.split("\\|");
            if (strArrSplit.length != 0) {
                for (String str : strArrSplit) {
                    if (strAN.contains(str)) {
                        hw.a("BaseSpHandler", "support video codec: %s", str);
                        arrayList.add(str);
                    }
                }
            }
        }
        com.huawei.openalliance.ad.utils.cn.a(this.m).a(arrayList);
    }

    private void a(SharedPreferences.Editor editor, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            editor.remove(SpKeys.CONFIG_MAP);
            this.n = null;
            return;
        }
        try {
            hw.b("BaseSpHandler", "sv config map");
            JSONObject jSONObject = new JSONObject(str);
            b(editor, SpKeys.CONFIG_MAP, jSONObject.toString());
            Map<String, String> map = (Map) com.huawei.openalliance.ad.utils.bk.b(jSONObject.toString(), Map.class, new Class[0]);
            this.n = map;
            a(map.get(Constants.ALLOWED_VIDEO_CODEC));
            String str3 = this.n.get(MapKeyNames.REPORT_STRATEGY);
            this.u = str3;
            a(str3, str2);
        } catch (JSONException unused) {
            hw.d("BaseSpHandler", "putConfigMap JSONException");
        }
    }

    private void a(SharedPreferences.Editor editor, String str, Long l) {
        if (l != null) {
            editor.putLong(str, l.longValue());
        }
    }

    private void a(SharedPreferences.Editor editor, String str, Integer num, int i) {
        if (num != null) {
            editor.putInt(str, num.intValue());
        } else {
            editor.putInt(str, i);
        }
    }

    private void a(SharedPreferences.Editor editor, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("trustAppList", jSONObject);
            b(editor, SpKeys.TRUST_APP_LIST, jSONObject2.toString());
        } catch (JSONException unused) {
            hw.d("BaseSpHandler", "putTrustAppList JSONException");
        }
    }

    public et(Context context) {
        this.m = com.huawei.openalliance.ad.utils.ab.i(context.getApplicationContext());
        z();
        this.f18720a = this.m.getSharedPreferences("HiAdSharedPreferences", 4);
        this.f18721b = this.m.getSharedPreferences("HiAdSharedPreferences_sec", 0);
        this.d = this.m.getSharedPreferences("HiAdSharedPreferences_opti", 0);
        try {
            this.f18722c = context.getSharedPreferences("HiAdSharedPreferences", 0);
        } catch (Throwable unused) {
            this.f18722c = null;
            hw.c("BaseSpHandler", "create sp error.");
        }
        aJ();
        this.l = this.m.getSharedPreferences("HiAd_url_cache_sp", 0);
        this.e = this.m.getSharedPreferences("HiAd_device_id_sp", 0);
        this.r = this.m.getFilesDir() + File.separator + Constants.PPS_ROOT_PATH + File.separator + "sp.config";
        this.v = this.m.getFilesDir() + File.separator + Constants.PPS_ROOT_PATH + File.separator + "black.config";
        this.n = (Map) com.huawei.openalliance.ad.utils.bk.b(aM(), Map.class, new Class[0]);
        synchronized (this.s) {
            this.q = new LandpageAppWhiteList();
        }
        synchronized (this.k) {
            this.t = new LandpageWebBlackList();
        }
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.et.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                Serializable serializableA = com.huawei.openalliance.ad.utils.cz.a(et.this.r);
                if (serializableA == null || !(serializableA instanceof LandpageAppWhiteList)) {
                    return;
                }
                synchronized (et.this.s) {
                    et.this.q = (LandpageAppWhiteList) serializableA;
                }
            }
        });
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.et.2
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                Serializable serializableA = com.huawei.openalliance.ad.utils.cz.a(et.this.v);
                if (serializableA == null || !(serializableA instanceof LandpageWebBlackList)) {
                    return;
                }
                synchronized (et.this.k) {
                    et.this.t = (LandpageWebBlackList) serializableA;
                }
            }
        });
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.et.3
            @Override // java.lang.Runnable
            public void run() {
                et.this.aK();
                if (et.this.o.isEmpty()) {
                    hw.c("BaseSpHandler", "load nothing from SP");
                }
            }
        });
    }
}
