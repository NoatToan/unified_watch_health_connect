package com.huawei.openalliance.ad;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.App;
import com.huawei.openalliance.ad.beans.metadata.FlowControl;
import com.huawei.openalliance.ad.beans.metadata.Location;
import com.huawei.openalliance.ad.beans.metadata.OaidRecord;
import com.huawei.openalliance.ad.beans.server.AppConfigRsp;
import com.huawei.openalliance.ad.beans.tags.TagCfgModel;
import com.huawei.openalliance.ad.constant.AdLoadMode;
import com.huawei.openalliance.ad.constant.ConfigMapKeys;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.DefBrowserPkgList;
import com.huawei.openalliance.ad.constant.DefSchemeInfo;
import com.huawei.openalliance.ad.constant.DefaultUrlConstant;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.SpDefaultValues;
import com.huawei.openalliance.ad.constant.SpKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class fp extends ev implements gk {
    private static gk v;
    private static final byte[] w = new byte[0];
    private String x;
    private String y;

    @Override // com.huawei.openalliance.ad.gk
    public boolean bu() {
        return true;
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean z(String str) {
        boolean zEquals;
        synchronized (this.f) {
            zEquals = "1".equals(this.n != null ? this.n.get(SpKeys.LOADER_ENGINE_UPDATE) : null);
        }
        return zEquals;
    }

    @Override // com.huawei.openalliance.ad.gk
    public void y(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f) {
            SharedPreferences.Editor editorEdit = this.f18720a.edit();
            editorEdit.putString(SpKeys.UNINSTALLED_APP_CACHE, str);
            editorEdit.apply();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void x(String str) {
        synchronized (this.f) {
            this.f18720a.edit().remove(str + SpKeys.FLOW_CONTROL_COUNTS).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public int w(String str) {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(str + SpKeys.FLOW_CONTROL_COUNTS, 0);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public void v(String str) {
        synchronized (this.f) {
            String str2 = str + SpKeys.FLOW_CONTROL_COUNTS;
            this.f18720a.edit().putInt(str2, this.f18720a.getInt(str2, 0) + 1).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public FlowControl u(String str) {
        if (com.huawei.openalliance.ad.utils.dg.b(str)) {
            hw.b("SpHandler", "slot is empty");
            return null;
        }
        synchronized (this.f) {
            String string = this.f18720a.getString(str, null);
            if (com.huawei.openalliance.ad.utils.dg.b(string)) {
                return null;
            }
            return (FlowControl) com.huawei.openalliance.ad.utils.bk.b(string, FlowControl.class, new Class[0]);
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void t(String str) {
        synchronized (this.f) {
            this.f18720a.edit().putString(SpKeys.SHIELD_OTHER_SPLASH_FASHION, str).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void s(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f) {
            this.f18720a.edit().putLong(SpKeys.LAST_CALL_METHOD_TIME_PREFIX + str, com.huawei.openalliance.ad.utils.as.c()).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void s(long j) {
        synchronized (this.f) {
            this.f18720a.edit().putLong(SpKeys.LAST_CACHE_FENCE_TIME, j).apply();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void r(String str) {
        synchronized (this.f) {
            this.f18720a.edit().putString(SpKeys.PLACEMENT_CFG_REQ_AD_ID, str).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void r(long j) {
        synchronized (this.f) {
            this.f18720a.edit().putLong(SpKeys.LAST_SEND_TIME, j).apply();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void q(long j) {
        synchronized (this.f) {
            this.f18720a.edit().putLong(SpKeys.LAST_QUERY_GAME_TIME, j).apply();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public OaidRecord q(String str) {
        if (hw.a()) {
            hw.a("SpHandler", "getOaidRecord, key: %s", str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f) {
            String string = this.f18720a.getString(str, "");
            if (!TextUtils.isEmpty(string)) {
                return (OaidRecord) com.huawei.openalliance.ad.utils.bk.b(string, OaidRecord.class, new Class[0]);
            }
            hw.c("SpHandler", "oaid record do not exist for: " + str);
            return null;
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void p(String str) {
        synchronized (this.f) {
            if (!TextUtils.isEmpty(str)) {
                this.f18720a.edit().putString(SpKeys.GLOBAL_SWITCH, str).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void p(long j) {
        if (j <= 0) {
            return;
        }
        synchronized (this.f) {
            this.f18720a.edit().putLong(SpKeys.LOADER_LAST_CHECK_TIME, j).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void o(String str) {
        synchronized (this.f) {
            if (!TextUtils.isEmpty(str)) {
                this.f18720a.edit().putString(SpKeys.LINKED_CONTENT_ID, str).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void o(long j) {
        synchronized (this.g) {
            this.e.edit().putLong(SpKeys.LAST_REQ_HONORQAID_TIME, j).apply();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void n(String str) {
        synchronized (this.f) {
            if (!TextUtils.isEmpty(str)) {
                this.f18720a.edit().putString(SpKeys.BELONG_COUNTRY_CODE, str).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void n(long j) {
        synchronized (this.f) {
            this.f18720a.edit().putLong(SpKeys.LAST_QUERY_ACCOUNT_TIME, j).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void m(String str) {
        synchronized (this.f) {
            this.f18720a.edit().putString(SpKeys.R_D, str).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void m(long j) {
        synchronized (this.f) {
            this.f18720a.edit().putLong(SpKeys.LAST_QRY_GRP_ID_TIME, j).apply();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void m(int i) {
        synchronized (this.f) {
            this.f18720a.edit().putInt(SpKeys.MEDIA_UI_MODE, i).apply();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void l(long j) {
        synchronized (this.f) {
            this.f18720a.edit().putLong(SpKeys.CLCT_CTX_TIME, j).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void l(int i) {
        synchronized (this.f) {
            this.f18720a.edit().putInt(SpKeys.VIDEO_AUTO_PLAY_FROM_MEDIA, i).apply();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public long l(String str) {
        Object obj;
        long j = 0;
        if (com.huawei.openalliance.ad.utils.dg.b(str)) {
            return 0L;
        }
        synchronized (this.f) {
            try {
                String string = this.f18720a.getString(SpKeys.CFG_REF_LAST_TIME_SLOTID, "");
                if (!com.huawei.openalliance.ad.utils.dg.b(string) && (obj = new JSONObject(string).get(str)) != null) {
                    j = Long.parseLong(obj.toString());
                }
            } catch (Throwable unused) {
                hw.d("SpHandler", "get cfg refresh time based on slot error");
                return 0L;
            }
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public void k(long j) {
        synchronized (this.g) {
            this.e.edit().putLong(SpKeys.LAST_REQ_UUID_TIME, j).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void k(int i) {
        synchronized (this.f) {
            this.f18720a.edit().putInt(SpDefaultValues.DEFAULT_SPLASH_MODE, i).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public Boolean k(String str) {
        Boolean boolC;
        synchronized (this.s) {
            boolC = this.q.c(str);
        }
        return boolC;
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean j(String str) {
        synchronized (this.k) {
            if (this.t == null) {
                return false;
            }
            return this.t.b(str);
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void j(long j) {
        synchronized (this.g) {
            this.e.edit().putLong(SpKeys.LAST_REQ_QAID_TIME, j).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void j(int i) {
        synchronized (this.f) {
            if (i >= 0) {
                a(this.f18720a.edit(), "landpage_app_prompt", Integer.valueOf(i));
            }
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean i(String str) {
        synchronized (this.s) {
            if (this.q == null) {
                return true;
            }
            return this.q.b(str);
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void i(long j) {
        synchronized (this.f) {
            this.f18720a.edit().putLong(SpKeys.LAST_QUERY_UA_TIME, j).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void i(int i) {
        synchronized (this.f) {
            if (i > 0) {
                this.f18720a.edit().putInt(SpKeys.EXSPLASH_REDUNDANCY_TIME, i).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void h(boolean z) {
        synchronized (this.f) {
            this.f18720a.edit().putBoolean(SpKeys.IS_QUERY_FENCE_DATA_FAIL, z).apply();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void h(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f) {
            this.y = str;
            SharedPreferences.Editor editorEdit = this.f18720a.edit();
            editorEdit.putString(SpKeys.PPS_STORE, str);
            editorEdit.commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void h(long j) {
        synchronized (this.f) {
            SharedPreferences.Editor editorEdit = this.f18720a.edit();
            editorEdit.putLong(SpKeys.DEVICE_CONNECT_LIST_LAST_TIME, j);
            editorEdit.commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void h(int i) {
        synchronized (this.f) {
            if (i > 0) {
                this.f18720a.edit().putInt(SpKeys.EXSPLASH_SLOGAN_SHOW_TIME, i).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void g(boolean z) {
        synchronized (this.f) {
            this.f18720a.edit().putBoolean(SpKeys.REMIND_AGAIN, z).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f) {
            this.x = str;
            SharedPreferences.Editor editorEdit = this.f18720a.edit();
            editorEdit.putString(SpKeys.SERVER_STORE, str);
            editorEdit.commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void g(long j) {
        synchronized (this.f) {
            if (j > 0) {
                this.f18720a.edit().putLong(SpKeys.EXSPLASH_SLOGAN_START_TIME, j).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void g(int i) {
        synchronized (this.f) {
            SharedPreferences.Editor editorEdit = this.f18720a.edit();
            editorEdit.putInt(SpKeys.AD_PRELOAD_INTERVAL, i);
            editorEdit.commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void f(boolean z) {
        synchronized (this.f) {
            this.f18720a.edit().putBoolean(SpKeys.AUTO_OPEN_FORBIDDEN, z).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void f(String str) {
        synchronized (this.f) {
            this.f18720a.edit().putString(SpKeys.MAGLOCK_SHOW_ID, str).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void f(long j) {
        synchronized (this.f) {
            SharedPreferences.Editor editorEdit = this.f18720a.edit();
            editorEdit.putLong(SpKeys.LAST_SYNC_CONFIRM_RESULT_TIME, j);
            editorEdit.apply();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public long f(int i) {
        int iE;
        if (4 == i) {
            iE = d();
        } else {
            if (2 != i) {
                return 51200L;
            }
            iE = e();
        }
        return iE;
    }

    @Override // com.huawei.openalliance.ad.gk
    public void e(boolean z) {
        synchronized (this.f) {
            this.f18720a.edit().putBoolean(SpKeys.APP_AD_LMT_KEY, z).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void e(String str) {
        synchronized (this.f) {
            this.f18720a.edit().putString(SpKeys.TODAY_DATE, str).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void e(long j) {
        synchronized (this.f) {
            SharedPreferences.Editor editorEdit = this.f18720a.edit();
            editorEdit.putLong(SpKeys.CFG_REF_LAST_TIME, j);
            editorEdit.commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void e(int i) {
        synchronized (this.f) {
            this.f18720a.edit().putInt(SpKeys.TODAY_SHOW_TIMES, i).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.et, com.huawei.openalliance.ad.gk
    public int e() {
        return super.e();
    }

    @Override // com.huawei.openalliance.ad.gk
    public void d(boolean z) {
        synchronized (this.f) {
            this.f18720a.edit().putBoolean(SpKeys.ENABLE_SHARE_PD, z).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void d(long j) {
        synchronized (this.f) {
            this.f18720a.edit().putLong(SpKeys.NO_SHOW_AD_TIME, j).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void d(int i) {
        synchronized (this.f) {
            this.f18720a.edit().putInt(SpKeys.SMART_SCREEN_SLOGAN_TIME, i).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public String d(String str) {
        Object obj;
        String string;
        if (com.huawei.openalliance.ad.utils.dg.b(str)) {
            return "";
        }
        synchronized (this.f) {
            try {
                String string2 = this.f18720a.getString(MapKeyNames.REPORT_STRATEGY, "");
                string = (com.huawei.openalliance.ad.utils.dg.b(string2) || (obj = new JSONObject(string2).get(str)) == null) ? "" : obj.toString();
            } catch (Throwable unused) {
                hw.b("SpHandler", "get report strategy based on slot error");
                return "";
            }
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.et, com.huawei.openalliance.ad.gk
    public int d() {
        return super.d();
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean cz() {
        synchronized (this.f) {
            if (!com.huawei.openalliance.ad.utils.ab.j(this.m)) {
                return false;
            }
            if (hw.a()) {
                hw.a("SpHandler", "isSingleMediaPlayerInstance, is tv");
            }
            Set<String> stringSet = this.f18720a.getStringSet(SpKeys.SINGLE_INSTANCE_LS_MODEL_LIST, new HashSet());
            String strB = cc.a(this.m).b();
            if (!com.huawei.openalliance.ad.utils.bm.a(stringSet) && !TextUtils.isEmpty(strB)) {
                return com.huawei.openalliance.ad.utils.dg.a(stringSet, strB.toUpperCase(Locale.ENGLISH));
            }
            return true;
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public Set<String> cy() {
        Set<String> stringSet;
        synchronized (this.f) {
            stringSet = this.f18720a.getStringSet(SpKeys.NOTIFICATION_APP_LIST, new HashSet());
        }
        return stringSet;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long cx() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.CLCT_CTX_TIME, 0L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean cw() {
        boolean z;
        synchronized (this.f) {
            z = this.f18720a.getBoolean(SpKeys.REMIND_AGAIN, true);
        }
        return z;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String cv() {
        String string;
        synchronized (this.f) {
            string = this.f18720a.getString(SpKeys.SHIELD_OTHER_SPLASH_FASHION, "");
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String cu() {
        String string;
        synchronized (this.f) {
            string = this.f18720a.getString("splashFeedbackBtnText", "");
        }
        return string;
    }

    public int ct() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt("splashInteractCloseEffectiveTime", 30);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean cs() {
        boolean z;
        synchronized (this.f) {
            z = this.f18720a.getBoolean(SpKeys.AUTO_OPEN_FORBIDDEN, false);
        }
        return z;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int cr() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.ALLOW_AD_SKIP_TIME, 0);
        }
        return i * 1000;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int cq() {
        synchronized (this.h) {
            if (this.p == null) {
                this.p = Boolean.valueOf(cc.a(this.m).d());
            }
            if (!this.p.booleanValue()) {
                return 0;
            }
            return this.d.getInt(SpKeys.OAID_REPORT_ON_NPA, 0);
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public long cp() {
        long j;
        synchronized (this.g) {
            j = this.e.getLong(SpKeys.LAST_REQ_UUID_TIME, 0L);
            if (0 == j) {
                j = this.f18720a.getLong(SpKeys.LAST_REQ_UUID_TIME, 0L);
            }
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long co() {
        long j;
        synchronized (this.g) {
            j = this.e.getLong(SpKeys.LAST_REQ_QAID_TIME, 0L);
            if (0 == j) {
                j = this.f18720a.getLong(SpKeys.LAST_REQ_QAID_TIME, 0L);
            }
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int cn() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt("ite_ad_ca", 0);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int cm() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.ITE_AD_EXP, 0);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int cl() {
        int i;
        synchronized (this.h) {
            if (this.p == null) {
                this.p = Boolean.valueOf(cc.a(this.m).d());
            }
            i = this.d.getInt(SpKeys.ITE_AD_FS, this.p.booleanValue() ? 1 : 0);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean ck() {
        return a(SpKeys.IS_AD_CLICKABLE, 1) != 0;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int cj() {
        int i;
        synchronized (this.f) {
            int i2 = this.f18720a.getInt("ite_ad_close_tm", 3);
            i = i2 >= 0 ? i2 : 3;
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int ci() {
        int iMax;
        synchronized (this.f) {
            iMax = Math.max(this.f18720a.getInt(SpKeys.REWARD_GAIN_TIME_PERCENT, 90), 1);
        }
        return iMax;
    }

    @Override // com.huawei.openalliance.ad.gk
    public Location ch() {
        Location location;
        synchronized (this.j) {
            String string = this.f18721b.getString(SpKeys.LAST_KNOWN_LOCATION, "");
            location = TextUtils.isEmpty(string) ? null : (Location) com.huawei.openalliance.ad.utils.bk.b(com.huawei.openalliance.ad.utils.g.b(string, com.huawei.openalliance.ad.utils.cw.b(this.m)), Location.class, new Class[0]);
        }
        return location;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String cg() {
        String string;
        synchronized (this.f) {
            string = this.f18720a.getString(SpKeys.PLACEMENT_CFG_REQ_AD_ID, "");
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String cf() {
        String string;
        synchronized (this.f) {
            string = this.f18720a.getString(SpKeys.TRUST_APP_LIST, "");
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean ce() {
        boolean z;
        synchronized (this.f) {
            z = this.f18720a.getInt(SpKeys.SUPPORT_SDK_SERVER_GZIP, 0) == 1;
        }
        return z;
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean cd() {
        boolean z;
        synchronized (this.f) {
            z = this.f18720a.getInt(SpKeys.SUPPORT_GZIP, 0) == 1;
        }
        return z;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String cc() {
        String string;
        synchronized (this.f) {
            string = this.f18720a.getString(SpKeys.TEST_COUNTRY_CODE, "");
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    @Override // com.huawei.openalliance.ad.gk
    public List<App> cb() {
        ArrayList arrayList;
        synchronized (this.f) {
            String string = this.f18720a.getString(SpKeys.APP_LIST, "");
            if (TextUtils.isEmpty(string)) {
                arrayList = null;
            } else {
                HashSet hashSet = new HashSet();
                String[] strArrSplit = string.split(",");
                int length = strArrSplit.length;
                if (length > 0) {
                    for (int i = 0; i < length; i++) {
                        if (!TextUtils.isEmpty(strArrSplit[i])) {
                            App app = new App(this.m, strArrSplit[i]);
                            if (!TextUtils.isEmpty(app.a())) {
                                hashSet.add(app);
                            }
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    arrayList = new ArrayList();
                    arrayList.addAll(hashSet);
                } else {
                    arrayList = null;
                }
            }
        }
        return arrayList;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long ca() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.LAST_QUERY_UA_TIME, 0L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public List<String> cQ() {
        String strB = b(ConfigMapKeys.PRELOAD_HOST_LIST, "");
        return !TextUtils.isEmpty(strB) ? Arrays.asList(strB.split(",")) : Collections.EMPTY_LIST;
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean cP() {
        return "1".equalsIgnoreCase(b(ConfigMapKeys.PRELOAD_HOST, "0"));
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean cO() {
        boolean z;
        synchronized (this.f) {
            z = this.f18720a.getBoolean(SpKeys.IS_QUERY_FENCE_DATA_FAIL, false);
        }
        return z;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String cN() {
        String string;
        synchronized (this.f) {
            string = this.f18720a.getString("fence", "");
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long cM() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.LAST_CACHE_FENCE_TIME, 0L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long cL() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.LAST_SEND_TIME, 0L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String cK() {
        String string;
        synchronized (this.f) {
            string = this.f18720a.getString(SpKeys.LAST_QUERY_GAME_RESULT, "");
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long cJ() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.LAST_QUERY_GAME_TIME, 0L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String cI() {
        String string;
        synchronized (this.f) {
            string = this.f18720a.getString("adid", "");
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long cH() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.LOADER_LAST_CHECK_TIME, 0L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long cG() {
        long j;
        synchronized (this.g) {
            j = this.e.getLong(SpKeys.LAST_REQ_HONORQAID_TIME, 0L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public List<TagCfgModel> cF() {
        ArrayList arrayList = new ArrayList();
        String strB = b(SpKeys.TAG_CFG, "");
        if (!com.huawei.openalliance.ad.utils.dg.b(strB)) {
            try {
                hw.a("SpHandler", "tagCfg info is : %s", strB);
                String strOptString = new JSONObject(strB).optString(SpKeys.ALLOWED_TAGS, "");
                if (!com.huawei.openalliance.ad.utils.dg.b(strOptString)) {
                    return (List) com.huawei.openalliance.ad.utils.bk.b(strOptString, List.class, TagCfgModel.class);
                }
            } catch (Exception unused) {
                hw.c("SpHandler", "get tag cfg list error");
            }
        }
        return arrayList;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long cE() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.LAST_QUERY_ACCOUNT_TIME, 0L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String cD() {
        String string;
        synchronized (this.f) {
            string = this.f18720a.getString(SpKeys.UNINSTALLED_APP_CACHE, null);
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int cC() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.FLOW_CONTROL_SWITCH, 0);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int cB() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.MEDIA_UI_MODE, -1);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long cA() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.LAST_QRY_GRP_ID_TIME, 0L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public void c(boolean z) {
        synchronized (this.f) {
            this.f18720a.edit().putBoolean(SpKeys.ENABLE_ANDROID_ID, z).apply();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void c(List<String> list) {
        synchronized (this.k) {
            if (list != null) {
                this.t.a(com.huawei.openalliance.ad.utils.bm.a(list, ","));
            }
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void c(long j) {
        synchronized (this.f) {
            this.f18720a.edit().putLong(SpKeys.ONLINE_STREAM_CLEAN_DISK_TIME, j).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void c(int i) {
        synchronized (this.f) {
            this.f18720a.edit().putInt(SpKeys.CACHE_SLOGAN_SHOW_TIME_DEF, i).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public String c(String str) {
        String strD = d(str);
        return com.huawei.openalliance.ad.utils.dg.b(strD) ? "0" : strD;
    }

    @Override // com.huawei.openalliance.ad.et
    public int c() {
        return super.c();
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean bz() {
        Integer numA = com.huawei.openalliance.ad.utils.dh.a(cR(), 3);
        return numA == null || numA.intValue() == 1;
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean by() {
        Integer numA = com.huawei.openalliance.ad.utils.dh.a(cR(), 2);
        return numA != null && numA.intValue() == 1;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String bx() {
        String string;
        synchronized (this.f) {
            string = this.f18720a.getString(SpKeys.API_WHITE_LIST, "");
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean bw() {
        synchronized (this.f) {
            int i = this.f18720a.getInt(SpKeys.LOCATION_COLLECTED_SWITCH, 0);
            Integer.valueOf(i).getClass();
            return i == 1;
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean bv() {
        Integer numA = com.huawei.openalliance.ad.utils.dh.a(cR(), 1);
        return numA != null && numA.intValue() == 1;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int bt() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.DISK_CACHE_SIZE, 800);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int bs() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.VALIDITY_NATIVE_EVENT, 2880);
        }
        return i * 60000;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int br() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.VALIDITY_LOCK_EVENT, 10080);
        }
        return i * 60000;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int bq() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.VALIDITY_CLICK_SKIP, 30);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int bp() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.VALIDITY_SPLASH_EVENT, 2880);
        }
        return i * 60000;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long bo() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.CFG_REF_LAST_TIME, 0L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int bn() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.CFG_REF_INTERVAL, 360);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean bm() {
        boolean z;
        synchronized (this.f) {
            z = this.f18720a.getInt("landpage_app_prompt", 0) == 1;
        }
        return z;
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean bl() {
        boolean z;
        synchronized (this.f) {
            z = this.f18720a.getInt(SpKeys.SHOW_LANDING_PAGE_MENU, 0) == 1;
        }
        return z;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String bk() {
        String string;
        synchronized (this.f) {
            string = this.y;
            if (string == null) {
                string = this.f18720a.getString(SpKeys.PPS_STORE, "");
                this.y = string;
            }
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String bj() {
        String string;
        synchronized (this.f) {
            string = this.x;
            if (string == null) {
                string = this.f18720a.getString(SpKeys.SERVER_STORE, "");
                this.x = string;
            }
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long bi() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.NO_SHOW_AD_TIME, 0L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String bh() {
        String string;
        synchronized (this.f) {
            string = this.f18720a.getString(SpKeys.MAGLOCK_SHOW_ID, "");
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean bg() {
        boolean z;
        synchronized (this.f) {
            z = this.f18720a.getBoolean(SpKeys.ENABLE_SHARE_PD, true);
        }
        return z;
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean bf() {
        boolean z;
        synchronized (this.f) {
            z = (this.f18722c != null && this.f18722c.getBoolean(SpKeys.ENABLE_USER_INFO, false)) || this.f18720a.getBoolean(SpKeys.ENABLE_USER_INFO, false);
        }
        return z;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String be() {
        String string;
        synchronized (this.f) {
            string = this.f18720a.getString(SpKeys.TODAY_DATE, "");
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int bd() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.TODAY_SHOW_TIMES, 0);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int bc() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.SPLASH_APP_DAY_IMPFC, 0);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long bb() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.SLOGAN_REAL_MIN_SHOW_TIME, 300L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long ba() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.SPLASH_SHOW_TIME_INTERVAL, 0L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String bZ() {
        synchronized (this.f) {
            boolean zD = cc.a(this.m).d();
            boolean zB = cc.b(this.m);
            if (zD && !zB) {
                return this.f18720a.getBoolean(SpKeys.APP_AD_LMT_KEY, false) ? "1" : "0";
            }
            return null;
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public long bY() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.DEVICE_CONNECT_LIST_LAST_TIME, 0L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int bX() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.EXSPLASH_REDUNDANCY_TIME, 100);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int bW() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.EXSPLASH_SLOGAN_SHOW_TIME, 0);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public Long bV() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.EXSPLASH_SLOGAN_START_TIME, 0L);
        }
        return Long.valueOf(j);
    }

    @Override // com.huawei.openalliance.ad.gk
    public Long bU() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.DISKCACHE_VALID_TIME, Constants.DISKCACHE_DEFAULT_VALID_TIME);
        }
        return Long.valueOf(j);
    }

    @Override // com.huawei.openalliance.ad.gk
    public int bT() {
        Integer numA = com.huawei.openalliance.ad.utils.dh.a(cR(), 9);
        if (numA != null) {
            return numA.intValue();
        }
        return 0;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int bS() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.EXSPLASH_DELETE_MODE, 2);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public float bR() {
        float f;
        synchronized (this.f) {
            f = this.f18720a.getFloat(SpKeys.LIMIT_OF_CONTAINER_ASPECT_RATIO, 0.05f);
        }
        return f;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String bQ() {
        String string;
        synchronized (this.f) {
            string = this.f18720a.getString(SpKeys.BELONG_COUNTRY_CODE, null);
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int bP() {
        Integer numA = com.huawei.openalliance.ad.utils.dh.a(cR(), 8);
        if (numA != null) {
            return numA.intValue();
        }
        return 1;
    }

    @Override // com.huawei.openalliance.ad.gk
    public Set<String> bO() {
        Set<String> stringSet;
        synchronized (this.f) {
            stringSet = this.f18720a.getStringSet("scheme_info", DefSchemeInfo.SCHEME_INFO);
        }
        return stringSet;
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean bN() {
        boolean z;
        synchronized (this.f) {
            z = true;
            if (1 != this.f18720a.getInt(SpKeys.NEED_NOTIFY_KIT_WHEN_REQUEST, 1)) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long bM() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.LAST_SYNC_CONFIRM_RESULT_TIME, 0L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long bL() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.MAX_BANNER_INTERVAL, 120L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long bK() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getInt(SpKeys.DEFAULT_BANNER_INTERVAL, 60);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long bJ() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.MIN_BANNER_INTERVAL, 30L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long bI() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.PRELOAD_SPLASH_REQ_TIME_INTERVAL, 600000L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean bH() {
        boolean z;
        synchronized (this.f) {
            z = Math.abs(System.currentTimeMillis() - this.f18720a.getLong(SpKeys.NO_WIFI_REMIND_STARTTIME, 0L)) > ((long) this.f18720a.getInt(SpKeys.NO_WFII_REMIND_BLOCK_TIME, 7)) * 86400000;
        }
        return z;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String bG() {
        String string;
        synchronized (this.f) {
            string = this.f18720a.getString(SpKeys.R_D, null);
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int bF() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.AD_PRELOAD_INTERVAL, 0);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public Set<String> bE() {
        Set<String> stringSet;
        synchronized (this.f) {
            stringSet = this.f18720a.getStringSet(SpKeys.DEF_BROSWER_PKG_LIST, DefBrowserPkgList.CONTENT);
        }
        return stringSet;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int bD() {
        Integer numA = com.huawei.openalliance.ad.utils.dh.a(cR(), 4);
        if (numA != null) {
            return numA.intValue();
        }
        return 5;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int bC() {
        Integer numA = com.huawei.openalliance.ad.utils.dh.a(cR(), 7);
        if (numA != null) {
            return numA.intValue();
        }
        return 0;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int bB() {
        Integer numA = com.huawei.openalliance.ad.utils.dh.a(cR(), 6);
        if (numA != null) {
            return numA.intValue();
        }
        return 0;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int bA() {
        Integer numA = com.huawei.openalliance.ad.utils.dh.a(cR(), 5);
        if (numA != null) {
            return numA.intValue();
        }
        return 1;
    }

    @Override // com.huawei.openalliance.ad.gk
    public void b(boolean z) {
        synchronized (this.f) {
            this.f18720a.edit().putBoolean(SpKeys.ENABLE_USER_INFO, z).commit();
            if (this.f18722c != null) {
                this.f18722c.edit().putBoolean(SpKeys.ENABLE_USER_INFO, z).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void b(Set<String> set) {
        synchronized (this.f) {
            SharedPreferences.Editor editorEdit = this.f18720a.edit();
            if (com.huawei.openalliance.ad.utils.bm.a(set)) {
                editorEdit.putStringSet(SpKeys.NOTIFICATION_APP_LIST, null);
            } else {
                editorEdit.putStringSet(SpKeys.NOTIFICATION_APP_LIST, set);
            }
            editorEdit.commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void b(List<String> list) {
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            return;
        }
        synchronized (this.f) {
            this.f18720a.edit().putString(SpKeys.BLK_TPT_IDS, com.huawei.openalliance.ad.utils.bk.b(list)).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void b(long j) {
        synchronized (this.f) {
            this.f18720a.edit().putLong(SpKeys.LAST_CLEAN_DISK_TIME, j).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void b(int i) {
        synchronized (this.f) {
            this.f18720a.edit().putInt("splash_skip_area", i).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.et
    public int b() {
        return super.b();
    }

    @Override // com.huawei.openalliance.ad.gk
    public int aZ() {
        int i;
        synchronized (this.f) {
            int iAW = AdLoadMode.CACHE == aS() ? aW() : 2000;
            if (com.huawei.openalliance.ad.utils.ab.j(this.m)) {
                iAW = aY();
            }
            i = this.f18720a.getInt(SpKeys.SLOGAN_SHOW_TIME, iAW);
        }
        return i;
    }

    public int aY() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.SMART_SCREEN_SLOGAN_TIME, 2000);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public boolean aX() {
        boolean z;
        synchronized (this.f) {
            z = this.f18720a.getBoolean(SpKeys.USE_POST_AT_FRONT, false);
        }
        return z;
    }

    public int aW() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.CACHE_SLOGAN_SHOW_TIME_DEF, 0);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long aV() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.ONLINE_STREAM_CLEAN_DISK_TIME, 0L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long aU() {
        long j;
        synchronized (this.f) {
            j = this.f18720a.getLong(SpKeys.LAST_CLEAN_DISK_TIME, 0L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int aT() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt("splash_skip_area", 0);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public AdLoadMode aS() {
        AdLoadMode adLoadMode;
        synchronized (this.f) {
            int i = this.f18720a.getInt(SpKeys.SPLASH_SHOW_MODE, cS());
            adLoadMode = AdLoadMode.CACHE;
            if (2 == i) {
                adLoadMode = AdLoadMode.REAL;
            } else if (3 == i) {
                adLoadMode = AdLoadMode.REAL_NEW;
            }
        }
        return adLoadMode;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int aR() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.SPLASH_VIDEO_SHOW_TIME, 5000);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int aQ() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.SPLASH_SHOW_TIME, 3000);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public long aP() {
        long jMax;
        synchronized (this.f) {
            jMax = Math.max(this.f18720a.getLong(SpKeys.LOCATION_REFRESH_INTERVAL_TIME, 1800000L), 300000L);
        }
        return jMax;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int aO() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.SPLASH_CACHE_NUM, 10);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int aN() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpKeys.VIDEO_CACHA_SIZE, 300);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String aM() {
        String string;
        synchronized (this.f) {
            string = PreferenceManager.getDefaultSharedPreferences(this.m.getApplicationContext()).getString(SpKeys.HW_ACSTRING, "");
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String aL() {
        String string;
        synchronized (this.f) {
            string = PreferenceManager.getDefaultSharedPreferences(this.m.getApplicationContext()).getString(SpKeys.GOOGLE_ACSTRING, "");
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.gk
    public String aK() {
        String string;
        synchronized (this.f) {
            string = PreferenceManager.getDefaultSharedPreferences(this.m.getApplicationContext()).getString(SpKeys.IABTCF_TCSTRING, "");
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.gk
    public List<String> aJ() {
        String string = this.f18720a.getString(SpKeys.BLK_TPT_IDS, null);
        if (com.huawei.openalliance.ad.utils.dg.b(string)) {
            return null;
        }
        return (List) com.huawei.openalliance.ad.utils.bk.b(string, List.class, String.class);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    @Override // com.huawei.openalliance.ad.gk
    public boolean a(Long l) {
        boolean z;
        synchronized (this.f) {
            if (l == null) {
                z = false;
            } else {
                long jCt = ct();
                z = true;
                if (jCt == -1) {
                    return true;
                }
                if (System.currentTimeMillis() >= (jCt * 86400000) + l.longValue()) {
                    z = false;
                }
            }
            return z;
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void a(boolean z) {
        synchronized (this.f) {
            this.f18720a.edit().putBoolean(SpKeys.USE_POST_AT_FRONT, z).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void a(Set<String> set) {
        synchronized (this.f) {
            SharedPreferences.Editor editorEdit = this.f18720a.edit();
            if (com.huawei.openalliance.ad.utils.bm.a(set)) {
                editorEdit.putStringSet("scheme_info", null);
            } else {
                editorEdit.putStringSet("scheme_info", set);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        synchronized (this.i) {
            SharedPreferences.Editor editorEdit = this.l.edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                editorEdit.putString(entry.getKey(), entry.getValue());
                this.o.put(entry.getKey(), entry.getValue());
                if (hw.a()) {
                    hw.a("SpHandler", "save base url to SP: %s", com.huawei.openalliance.ad.utils.ds.a(entry.getValue()));
                }
            }
            hw.b("SpHandler", "save result: " + editorEdit.commit());
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void a(List<String> list, Map<String, Boolean> map) {
        synchronized (this.s) {
            if (list != null) {
                try {
                    this.q.a(com.huawei.openalliance.ad.utils.bm.a(list, ","));
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (map != null) {
                this.q.a(map);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.et
    public void a(List<String> list) {
        super.a(list);
    }

    @Override // com.huawei.openalliance.ad.gk
    public void a(String str, boolean z) {
        synchronized (this.s) {
            this.q.a(str, z);
            com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.fp.2
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (fp.this.s) {
                        com.huawei.openalliance.ad.utils.cz.a(fp.this.q, fp.this.r);
                    }
                }
            });
        }
    }

    @Override // com.huawei.openalliance.ad.et, com.huawei.openalliance.ad.gk
    public void a(String str, AppConfigRsp appConfigRsp, boolean z) {
        super.a(str, appConfigRsp, z);
    }

    @Override // com.huawei.openalliance.ad.gk
    public void a(String str, OaidRecord oaidRecord) {
        if (hw.a()) {
            hw.a("SpHandler", "saveOaidRecord, key: %s", str);
        }
        if (TextUtils.isEmpty(str) || oaidRecord == null) {
            return;
        }
        String strB = com.huawei.openalliance.ad.utils.bk.b(oaidRecord);
        if (TextUtils.isEmpty(strB)) {
            hw.c("SpHandler", "oaid record is null");
            return;
        }
        synchronized (this.f) {
            SharedPreferences.Editor editorEdit = this.f18720a.edit();
            editorEdit.putString(str, strB);
            editorEdit.commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void a(String str, FlowControl flowControl) {
        String str2;
        if (com.huawei.openalliance.ad.utils.dg.b(str) || flowControl == null) {
            str2 = "fc para null";
        } else {
            String strB = com.huawei.openalliance.ad.utils.bk.b(flowControl);
            if (!com.huawei.openalliance.ad.utils.dg.b(strB)) {
                hw.b("SpHandler", "fc para:%s", strB);
                synchronized (this.f) {
                    this.f18720a.edit().putString(str, strB).commit();
                }
                return;
            }
            str2 = "fc to json failed";
        }
        hw.b("SpHandler", str2);
    }

    @Override // com.huawei.openalliance.ad.et, com.huawei.openalliance.ad.gk
    public void a(String str, long j) {
        super.a(str, j);
    }

    @Override // com.huawei.openalliance.ad.gk
    public void a(Location location) {
        synchronized (this.j) {
            this.f18721b.edit().putString(SpKeys.LAST_KNOWN_LOCATION, com.huawei.openalliance.ad.utils.g.a(com.huawei.openalliance.ad.utils.bk.b(location), com.huawei.openalliance.ad.utils.cw.b(this.m))).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.et
    public void a(int i) {
        super.a(i);
    }

    @Override // com.huawei.openalliance.ad.gk
    public String a(Context context, String str) {
        String str2;
        String url;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strO = cc.a(context).o();
        String str3 = str + com.huawei.openalliance.ad.utils.dg.a(context) + strO;
        hw.a("SpHandler", "countryCode: %s", strO);
        synchronized (this.i) {
            str2 = this.o.get(str3);
            if (TextUtils.isEmpty(str2)) {
                em emVarA = em.a(context);
                String strA = emVarA.a(str);
                hw.b("SpHandler", "baseUrlKey:" + strA);
                String str4 = this.o.get(strA + strO);
                String strB = emVarA.b(str);
                if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(strB)) {
                    if (!cc.a(context).m()) {
                        hw.b("SpHandler", "there is no url in SP, use default");
                        url = DefaultUrlConstant.getUrl(context, str);
                    }
                    this.o.put(str3, str2);
                    c(str3, str2);
                } else {
                    url = str4 + strB;
                }
                str2 = url;
                this.o.put(str3, str2);
                c(str3, str2);
            } else {
                com.huawei.openalliance.ad.utils.da.a().b(context);
            }
            hw.a("SpHandler", "serverUrl= %s", com.huawei.openalliance.ad.utils.ds.a(str2));
        }
        return str2;
    }

    @Override // com.huawei.openalliance.ad.et, com.huawei.openalliance.ad.gk
    public String a() {
        return super.a();
    }

    @Override // com.huawei.openalliance.ad.gk
    public void E(String str) {
        synchronized (this.f) {
            this.f18720a.edit().putString("fence", str).apply();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void D(String str) {
        synchronized (this.f) {
            this.f18720a.edit().putString(SpKeys.LAST_QUERY_GAME_RESULT, str).apply();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public void C(String str) {
        synchronized (this.f) {
            this.f18720a.edit().putString("adid", str).apply();
        }
    }

    @Override // com.huawei.openalliance.ad.gk
    public int B(String str) {
        int iA;
        synchronized (this.f) {
            iA = this.n != null ? com.huawei.openalliance.ad.utils.dg.a(this.n.get(SpKeys.LOADER_ENGINE_ENGINE_INTERVAL), 10080) : 10080;
        }
        return iA * 60000;
    }

    @Override // com.huawei.openalliance.ad.gk
    public int A(String str) {
        int iA;
        synchronized (this.f) {
            iA = this.n != null ? com.huawei.openalliance.ad.utils.dg.a(this.n.get(SpKeys.LOADER_ENGINE_2KIT_UPDATE), 60) : 60;
        }
        return iA * 60000;
    }

    private int cS() {
        int i;
        synchronized (this.f) {
            i = this.f18720a.getInt(SpDefaultValues.DEFAULT_SPLASH_MODE, 2);
        }
        return i;
    }

    private String cR() {
        String string;
        synchronized (this.f) {
            string = this.f18720a.getString(SpKeys.GLOBAL_SWITCH, "");
        }
        return string;
    }

    private void c(final String str, final String str2) {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.fp.1
            @Override // java.lang.Runnable
            public void run() {
                fp.this.l.edit().putString(str, str2).commit();
                com.huawei.openalliance.ad.utils.da.a().b(fp.this.m);
            }
        });
    }

    private static gk c(Context context) {
        gk gkVar;
        synchronized (w) {
            if (v == null) {
                v = new fp(context);
            }
            gkVar = v;
        }
        return gkVar;
    }

    public static gk b(Context context) {
        return c(context);
    }

    private fp(Context context) {
        super(context);
    }
}
