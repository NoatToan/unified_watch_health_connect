package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.openalliance.ad.constant.ConfigMapKeys;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.constant.SpKeys;
import com.huawei.openalliance.ad.constant.WhiteListPkgList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ev extends et implements fy {
    public long z() {
        Long lK;
        long jLongValue;
        synchronized (this.f) {
            synchronized (this.f) {
                lK = !com.huawei.openalliance.ad.utils.br.a(this.n) ? com.huawei.openalliance.ad.utils.dg.k(this.n.get(ConfigMapKeys.OAID_REPORT_TIME_INTERVAL)) : null;
            }
            jLongValue = (lK == null || lK.longValue() <= 0) ? ConfigMapDefValues.DEFAULT_OAID_EVENT_INTENVAL : lK.longValue();
        }
        return jLongValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int y() {
        int iMax;
        synchronized (this.f) {
            Integer numJ = !com.huawei.openalliance.ad.utils.br.a(this.n) ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.DEVICE_CONNECT_LIST_MAX_SIZE)) : null;
            iMax = numJ == null ? 20 : Math.max(0, Math.min(numJ.intValue(), 50));
        }
        return iMax;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int x() {
        int iIntValue;
        synchronized (this.f) {
            Integer numJ = !com.huawei.openalliance.ad.utils.br.a(this.n) ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.DEVICE_CONNECT_LIST_COLLECT_INTERVAL)) : null;
            iIntValue = (numJ == null || numJ.intValue() <= 0) ? 60 : numJ.intValue();
        }
        return iIntValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean w() {
        synchronized (this.f) {
            if (!com.huawei.openalliance.ad.utils.br.a(this.n)) {
                String str = this.n.get(ConfigMapKeys.ADDRESS_CONNECT_LIST_COLLECT_SWITCH);
                if (TextUtils.equals(str, "1")) {
                    return true;
                }
                TextUtils.equals(str, "0");
            }
            return false;
        }
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean v() {
        synchronized (this.f) {
            if (!com.huawei.openalliance.ad.utils.br.a(this.n)) {
                String str = this.n.get(ConfigMapKeys.DEVICE_CONNECT_LIST_COLLECT_SWITCH);
                if (TextUtils.equals(str, "1")) {
                    return true;
                }
                TextUtils.equals(str, "0");
            }
            return false;
        }
    }

    @Override // com.huawei.openalliance.ad.fy
    public String u() {
        String strE;
        synchronized (this.f) {
            strE = !com.huawei.openalliance.ad.utils.br.a(this.n) ? com.huawei.openalliance.ad.utils.dg.e(this.n.get(ConfigMapKeys.WEBVIEW_PRELOAD_CLICK_ACTION)) : null;
            if (com.huawei.openalliance.ad.utils.dg.b(strE)) {
                strE = Constants.WEBVIEW_PRELOAD_CLICK_ACTION;
            }
        }
        return strE;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int t() {
        int iIntValue;
        synchronized (this.f) {
            Integer numJ = !com.huawei.openalliance.ad.utils.br.a(this.n) ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.WEBVIEW_PRELOAD_NETWORK)) : null;
            iIntValue = (numJ == null || numJ.intValue() <= 0) ? 0 : numJ.intValue();
        }
        return iIntValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int s() {
        int iIntValue;
        synchronized (this.f) {
            Integer numJ = !com.huawei.openalliance.ad.utils.br.a(this.n) ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.MAX_UPLOAD_EVENT_COUNT_HISUGGESTION)) : null;
            iIntValue = (numJ == null || numJ.intValue() <= 0) ? 80 : numJ.intValue();
        }
        return iIntValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int r() {
        int iIntValue;
        synchronized (this.f) {
            Integer numJ = !com.huawei.openalliance.ad.utils.br.a(this.n) ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.WEBVIEW_PRELOAD_MAXNUM)) : null;
            iIntValue = (numJ == null || numJ.intValue() <= 0) ? 20 : numJ.intValue();
        }
        return iIntValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public long q() {
        long jLongValue;
        synchronized (this.f) {
            jLongValue = (com.huawei.openalliance.ad.utils.br.a(this.n) ? 150L : Long.valueOf(com.huawei.openalliance.ad.utils.dg.a(this.n.get(ConfigMapKeys.REWARD_MAX_DATA), 150L))).longValue();
        }
        return jLongValue * 1048576;
    }

    @Override // com.huawei.openalliance.ad.fy
    public List<String> p() {
        synchronized (this.f) {
            if (!com.huawei.openalliance.ad.utils.br.a(this.n)) {
                String str = this.n.get(ConfigMapKeys.EVENT_BLACK_LIST);
                if (!com.huawei.openalliance.ad.utils.dg.b(str)) {
                    return Arrays.asList(str.trim().split(","));
                }
            }
            return null;
        }
    }

    @Override // com.huawei.openalliance.ad.fy
    public int o() {
        return com.huawei.openalliance.ad.utils.be.a(b("Intv_query_insapp", ""));
    }

    @Override // com.huawei.openalliance.ad.fy
    public int n() {
        return com.huawei.openalliance.ad.utils.cq.b(b(ConfigMapKeys.LOCAL_RECALL_MAX_ADS, ""));
    }

    @Override // com.huawei.openalliance.ad.fy
    public List<String> m() {
        return com.huawei.openalliance.ad.utils.cq.a(b(ConfigMapKeys.ALLOW_CACHE_TRADE_MODE, ""));
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean l() {
        return a(ConfigMapKeys.HUAWEI_USER_RECOMMEND_ENABLED, false);
    }

    @Override // com.huawei.openalliance.ad.fy
    public int k() {
        return d(ConfigMapKeys.ALLOW_TAG_AUD_MODE, 0);
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean j() {
        return a(ConfigMapKeys.ALLOW_RPT_AUD, false);
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean i() {
        return a(ConfigMapKeys.ALLOW_RPT_CTX_TAG, false);
    }

    @Override // com.huawei.openalliance.ad.fy
    public int h() {
        return d(ConfigMapKeys.VIDEO_PLAY_TIMEOUT, 5000);
    }

    @Override // com.huawei.openalliance.ad.fy
    public int g() {
        return d(ConfigMapKeys.UNINSTALLED_APP_CACHE_QUERY_INTERVAL, 60);
    }

    @Override // com.huawei.openalliance.ad.fy
    public long f() {
        return ((long) d(ConfigMapKeys.PKG_ADD_LISTEN_TIME, 5)) * 60000;
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean c(String str, int i) {
        boolean z = false;
        if (com.huawei.openalliance.ad.utils.dg.b(str)) {
            return false;
        }
        synchronized (this.f) {
            long j = this.f18720a.getLong(SpKeys.LAST_CALL_METHOD_TIME_PREFIX + str, 0L);
            hw.a("ConfigMapSpHandler", "methodName is %s,lastCallTime is %s", str, Long.valueOf(j));
            if (j > 0) {
                if (this.n != null) {
                    i = com.huawei.openalliance.ad.utils.dg.a(this.n.get(str), i);
                }
                if (i < 0) {
                    return true;
                }
                hw.a("ConfigMapSpHandler", "intvConfig is %s", Integer.valueOf(i));
                if (com.huawei.openalliance.ad.utils.as.c() < j + (((long) i) * 60000)) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean b(String str, int i) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this.f) {
            long j = this.f18720a.getLong(SpKeys.LAST_CALL_METHOD_TIME_PREFIX + str, 0L);
            hw.a("ConfigMapSpHandler", "methodName is %s ,lastCallTime is %s", str, Long.valueOf(j));
            if (j > 0) {
                if (this.n != null) {
                    i = com.huawei.openalliance.ad.utils.dg.a(this.n.get(ConfigMapKeys.INTERVAL_PREFIX + str), i);
                }
                hw.a("ConfigMapSpHandler", "intvConfig is %s", Integer.valueOf(i));
                if (com.huawei.openalliance.ad.utils.as.c() < j + ((long) (i * 60000))) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean b(String str) {
        return b(str, 30);
    }

    @Override // com.huawei.openalliance.ad.fy
    public String b(String str, String str2) {
        synchronized (this.f) {
            if (this.n != null) {
                String str3 = this.n.get(str);
                if (!com.huawei.openalliance.ad.utils.dg.b(str3)) {
                    str2 = str3;
                }
            }
        }
        return str2;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int az() {
        return d(ConfigMapKeys.INTENT_EVENT_LIMIT, 50);
    }

    @Override // com.huawei.openalliance.ad.fy
    public int ay() {
        int iD = d(ConfigMapKeys.LIMIT_SHOWTIME_DURATION, 3600000);
        if (iD < 1000) {
            return 3600000;
        }
        return iD;
    }

    @Override // com.huawei.openalliance.ad.fy
    public String ax() {
        String str;
        synchronized (this.f) {
            str = com.huawei.openalliance.ad.utils.br.a(this.n) ? "" : this.n.get(ConfigMapKeys.INTERCEPTION_WHITE_LIST);
            if (com.huawei.openalliance.ad.utils.dg.b(str)) {
                str = "com.huawei.appmarket";
            }
        }
        return str;
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean aw() {
        return a(ConfigMapKeys.MZ_IMP_CTRL, true);
    }

    @Override // com.huawei.openalliance.ad.fy
    public Map<String, String> av() {
        Map<String, String> map;
        try {
            synchronized (this.f) {
                map = this.n != null ? (Map) com.huawei.openalliance.ad.utils.bk.b(this.n.get(ConfigMapKeys.SINGLE_SLOT_ADS_COUNT), Map.class, new Class[0]) : null;
            }
            return map;
        } catch (Throwable th) {
            hw.d("ConfigMapSpHandler", "getSingleSlotAdsCountMap err: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    @Override // com.huawei.openalliance.ad.fy
    public Map<String, String> au() {
        Map<String, String> map;
        try {
            synchronized (this.f) {
                map = this.n != null ? (Map) com.huawei.openalliance.ad.utils.bk.b(this.n.get(ConfigMapKeys.ICON_LIST_TITLE), Map.class, new Class[0]) : null;
            }
            return map;
        } catch (Throwable th) {
            hw.d("ConfigMapSpHandler", "getIconListTitleMap err: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    @Override // com.huawei.openalliance.ad.fy
    public int at() {
        return d(ConfigMapKeys.EXPOSURE_HISTORY_COUNT, 6);
    }

    @Override // com.huawei.openalliance.ad.fy
    public long as() {
        return ((long) d(ConfigMapKeys.INTV_QUERY_GAME, 300)) * 1000;
    }

    @Override // com.huawei.openalliance.ad.fy
    public long ar() {
        return ((long) d(ConfigMapKeys.CA_SNP_VALID_TIME, 60)) * 60000;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int[] aq() {
        String strB = b(ConfigMapKeys.CLICK_VALID_INTVL, "");
        if (com.huawei.openalliance.ad.utils.dg.b(strB)) {
            return Constants.CLICK_DEF_INTVL;
        }
        String[] strArrSplit = strB.split(Constants.LINK);
        if (strArrSplit.length != 2) {
            return Constants.CLICK_DEF_INTVL;
        }
        int[] iArr = new int[2];
        try {
            iArr[0] = Integer.parseInt(strArrSplit[0].trim());
            int i = Integer.parseInt(strArrSplit[1].trim());
            iArr[1] = i;
            return iArr[0] >= i ? Constants.CLICK_DEF_INTVL : iArr;
        } catch (Throwable unused) {
            return Constants.CLICK_DEF_INTVL;
        }
    }

    @Override // com.huawei.openalliance.ad.fy
    public String ap() {
        return b(ConfigMapKeys.PARTNER_LIST, "");
    }

    @Override // com.huawei.openalliance.ad.fy
    public int ao() {
        return d(ConfigMapKeys.PARTNER_RULE, ConfigMapDefValues.DEF_PARTNER_RULE.intValue());
    }

    @Override // com.huawei.openalliance.ad.fy
    public Map<String, String> an() {
        Map<String, String> map;
        synchronized (this.f) {
            String packageName = this.m.getPackageName();
            Map map2 = this.n != null ? (Map) com.huawei.openalliance.ad.utils.bk.b(this.n.get(ConfigMapKeys.THIRD_SHARE_APP_ID), Map.class, new Class[0]) : null;
            if (map2 == null || !map2.containsKey(packageName) || (map = (Map) com.huawei.openalliance.ad.utils.bk.b((String) map2.get(packageName), Map.class, new Class[0])) == null) {
                map = new HashMap<>();
            }
        }
        return map;
    }

    @Override // com.huawei.openalliance.ad.fy
    public String am() {
        String str;
        synchronized (this.f) {
            str = this.n != null ? this.n.get(ConfigMapKeys.LANDING_TITLE_INVISIBLE_STR) : null;
            if (TextUtils.isEmpty(str)) {
                str = Constants.LRM_STR;
            }
        }
        return str;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int al() {
        int iIntValue;
        synchronized (this.f) {
            Integer numJ = this.n != null ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.SYNC_APP_DATA_INTV)) : null;
            iIntValue = numJ == null ? 45 : numJ.intValue();
        }
        return iIntValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public long ak() {
        long jB = b(ConfigMapKeys.PLAY_END_DCT_TO, 5L);
        return (jB >= 0 ? jB : 5L) * 1000;
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean aj() {
        return TextUtils.equals(b(ConfigMapKeys.SET_SURFACE_FIRST, "1"), "1");
    }

    @Override // com.huawei.openalliance.ad.fy
    public int ai() {
        int i;
        synchronized (this.f) {
            i = 0;
            int iA = (this.n == null || TextUtils.isEmpty(this.n.get(ConfigMapKeys.IPC_FLAG))) ? 0 : com.huawei.openalliance.ad.utils.dg.a(this.n.get(ConfigMapKeys.IPC_FLAG), 0);
            if (iA == 0 || iA == 1) {
                i = iA;
            }
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.fy
    public long ah() {
        long jLongValue;
        synchronized (this.f) {
            jLongValue = (com.huawei.openalliance.ad.utils.br.a(this.n) ? 20L : Long.valueOf(com.huawei.openalliance.ad.utils.dg.a(this.n.get(ConfigMapKeys.DELETE_INVALID_CONTENTS_DELAY), 20L))).longValue();
        }
        return jLongValue * 1000;
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean ag() {
        return a(ConfigMapKeys.REPORT_OTHER_ID_WITH_GRPID, false);
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean af() {
        return a(ConfigMapKeys.REPORT_AD_REQ_GRPID, false);
    }

    @Override // com.huawei.openalliance.ad.fy
    public Map<String, String> ae() {
        Map<String, String> map;
        synchronized (this.f) {
            synchronized (this.f) {
                map = this.n != null ? (Map) com.huawei.openalliance.ad.utils.bk.b(this.n.get(ConfigMapKeys.CLCT_CTX_MAP), Map.class, new Class[0]) : null;
            }
        }
        return map;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int ad() {
        int iIntValue;
        synchronized (this.f) {
            synchronized (this.f) {
                Integer numJ = this.n != null ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.CLCT_CTX_SIZE)) : null;
                iIntValue = (numJ == null || numJ.intValue() <= 0) ? 200 : numJ.intValue();
            }
        }
        return iIntValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int ac() {
        int iIntValue;
        synchronized (this.f) {
            synchronized (this.f) {
                Integer numJ = this.n != null ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.CLCT_CTX_INTVL)) : null;
                iIntValue = (numJ == null || numJ.intValue() < 0) ? 60 : numJ.intValue();
            }
        }
        return iIntValue;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    @Override // com.huawei.openalliance.ad.fy
    public boolean ab() {
        boolean z;
        synchronized (this.f) {
            Integer numJ = this.n != null ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.CLCT_CTX)) : null;
            if (numJ != null) {
                z = true;
                if (numJ.intValue() != 1) {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.huawei.openalliance.ad.fy
    public String aa() {
        String str;
        synchronized (this.f) {
            str = !com.huawei.openalliance.ad.utils.br.a(this.n) ? this.n.get(ConfigMapKeys.EMULATOR_FILE) : null;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
        }
        return str;
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean aI() {
        return d(ConfigMapKeys.BLOCK_AD_REQUEST, 0) != 0;
    }

    @Override // com.huawei.openalliance.ad.fy
    public String aH() {
        String str;
        synchronized (this.f) {
            str = this.n != null ? this.n.get(ConfigMapKeys.COUNTRY_AREA_DR_3) : null;
            if (com.huawei.openalliance.ad.utils.dg.b(str)) {
                str = "AD,AL,AT,AU,BA,BE,BG,BQ,CA,CH,CY,CZ,DE,DK,EE,ES,FI,FO,FR,GB,GI,GL,GR,HR,HU,IE,IL,IS,IT,LI,LT,LU,LV,MC,MD,ME,MK,MT,NL,NO,NZ,PL,PT,RO,RS,SE,SI,SK,SM,SX,TR,UA,VC";
            }
        }
        return str;
    }

    @Override // com.huawei.openalliance.ad.fy
    public List<String> aG() {
        synchronized (this.f) {
            String packageName = this.m.getPackageName();
            Map map = this.n != null ? (Map) com.huawei.openalliance.ad.utils.bk.b(this.n.get(ConfigMapKeys.SELECT_FENCE_FIELD), Map.class, new Class[0]) : null;
            if (map == null || !map.containsKey(packageName)) {
                return null;
            }
            return (List) com.huawei.openalliance.ad.utils.bk.b((String) map.get(packageName), List.class, new Class[0]);
        }
    }

    @Override // com.huawei.openalliance.ad.fy
    public List<String> aF() {
        synchronized (this.f) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Constants.HISUGGESTION_PKG_NAME);
            if (this.n == null) {
                return arrayList;
            }
            List<String> arrayList2 = new ArrayList<>();
            String str = this.n.get(ConfigMapKeys.REPORT_STRATEGY_WHITE_LIST);
            try {
                if (!com.huawei.openalliance.ad.utils.dg.b(str)) {
                    arrayList2 = Arrays.asList(str.trim().split(","));
                }
            } catch (Exception e) {
                hw.d("ConfigMapSpHandler", "getMonitorMainEvents err: %s", e.getClass().getSimpleName());
            }
            return com.huawei.openalliance.ad.utils.bm.a(arrayList2) ? arrayList : arrayList2;
        }
    }

    @Override // com.huawei.openalliance.ad.fy
    public int aE() {
        return d(ConfigMapKeys.NEED_FENCE, 1);
    }

    @Override // com.huawei.openalliance.ad.fy
    public List<String> aD() {
        synchronized (this.f) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(EventType.CLICK.value());
            arrayList.add(EventType.SHOW.value());
            if (this.n == null) {
                return arrayList;
            }
            List<String> arrayList2 = new ArrayList<>();
            String str = this.n.get(ConfigMapKeys.MONITOR_MAIN_EVENTS);
            try {
                if (!com.huawei.openalliance.ad.utils.dg.b(str)) {
                    arrayList2 = Arrays.asList(str.trim().split(","));
                }
            } catch (Exception e) {
                hw.d("ConfigMapSpHandler", "getMonitorMainEvents err: %s", e.getClass().getSimpleName());
            }
            return com.huawei.openalliance.ad.utils.bm.a(arrayList2) ? arrayList : arrayList2;
        }
    }

    @Override // com.huawei.openalliance.ad.fy
    public int aC() {
        return d(ConfigMapKeys.DSL_FILE_COUNT, 1000);
    }

    @Override // com.huawei.openalliance.ad.fy
    public int aB() {
        return d(ConfigMapKeys.INTENT_EVENT_INTVL, 60);
    }

    @Override // com.huawei.openalliance.ad.fy
    public int aA() {
        return d(ConfigMapKeys.INTENT_EVENT_CLEAR_INTVL, 15);
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        List list = (List) com.huawei.openalliance.ad.utils.bk.b(this.n != null ? this.n.get(ConfigMapKeys.NEED_ADD_FLAGS_APPS) : null, List.class, String.class);
        return list == null ? WhiteListPkgList.isPkgNeedAddFlags(str) : list.contains(str);
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean a(long j) {
        if (j <= 0) {
            return true;
        }
        return z() * 60000 <= System.currentTimeMillis() - j;
    }

    public int a(String str, int i) {
        synchronized (this.f) {
            if (this.n == null) {
                return i;
            }
            return com.huawei.openalliance.ad.utils.dg.a(this.n.get(str), i);
        }
    }

    @Override // com.huawei.openalliance.ad.fy
    public int a(Context context) {
        int iIntValue;
        synchronized (this.f) {
            boolean zQ = com.huawei.openalliance.ad.utils.as.q(context);
            iIntValue = zQ ? 98 : 64;
            int i = zQ ? Constants.MAX_PRO_BOTTOM_MARGIN_PAD : 85;
            Integer numJ = this.n != null ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.PRO_BOTTOM_MARGIN)) : null;
            if (numJ != null && numJ.intValue() >= 40 && numJ.intValue() <= i) {
                iIntValue = numJ.intValue();
            }
        }
        return iIntValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int Z() {
        synchronized (this.f) {
            Integer numJ = !com.huawei.openalliance.ad.utils.br.a(this.n) ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.CLCT_PRE_REQ)) : null;
            if (numJ == null) {
                return 0;
            }
            return numJ.intValue();
        }
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean Y() {
        boolean z;
        synchronized (this.f) {
            Integer numJ = !com.huawei.openalliance.ad.utils.br.a(this.n) ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.PRELOAD_DETAIL)) : null;
            z = true;
            if (numJ != null && 1 != numJ.intValue()) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean X() {
        boolean z;
        synchronized (this.f) {
            Integer numJ = !com.huawei.openalliance.ad.utils.br.a(this.n) ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.ENABLE_CLOSE_DIALOG)) : null;
            z = true;
            if (numJ != null && 1 != numJ.intValue()) {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    @Override // com.huawei.openalliance.ad.fy
    public boolean W() {
        boolean z;
        synchronized (this.f) {
            Integer numJ = !com.huawei.openalliance.ad.utils.br.a(this.n) ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.SHOW_END_MASKING)) : null;
            if (numJ != null) {
                z = true;
                if (1 != numJ.intValue()) {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean V() {
        synchronized (this.f) {
            if (!com.huawei.openalliance.ad.utils.br.a(this.n)) {
                String str = this.n.get(ConfigMapKeys.DIALOG_DISMISS_ON_BACK);
                if (!TextUtils.equals(str, "1")) {
                    return !TextUtils.equals(str, "0");
                }
            }
            return true;
        }
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean U() {
        return a(ConfigMapKeys.DL_CONFIRM_CLICKABLE, false);
    }

    @Override // com.huawei.openalliance.ad.fy
    public int T() {
        return d(ConfigMapKeys.CLCT_NETWORK_KIT, 0);
    }

    @Override // com.huawei.openalliance.ad.fy
    public int S() {
        int iIntValue;
        synchronized (this.f) {
            synchronized (this.f) {
                Integer numJ = this.n != null ? com.huawei.openalliance.ad.utils.dg.j(this.n.get("reqQaidInterval")) : null;
                iIntValue = (numJ == null || numJ.intValue() < 0) ? 30 : numJ.intValue();
            }
        }
        return iIntValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int R() {
        int iIntValue;
        synchronized (this.f) {
            synchronized (this.f) {
                Integer numJ = this.n != null ? com.huawei.openalliance.ad.utils.dg.j(this.n.get("reqQaidInterval")) : null;
                iIntValue = (numJ == null || numJ.intValue() < 0) ? 30 : numJ.intValue();
            }
        }
        return iIntValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int Q() {
        int iIntValue;
        Integer numJ;
        synchronized (this.f) {
            iIntValue = (com.huawei.openalliance.ad.utils.br.a(this.n) || this.n.get(ConfigMapKeys.INSAPPS_FILTER_SWITCH) == null || (numJ = com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.INSAPPS_FILTER_SWITCH))) == null || numJ.intValue() < 0) ? 0 : numJ.intValue();
        }
        return iIntValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int P() {
        int iIntValue;
        synchronized (this.f) {
            Integer numJ = this.n != null ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.PRO_RADIUS)) : null;
            iIntValue = (numJ == null || numJ.intValue() <= 0) ? 36 : numJ.intValue();
        }
        return iIntValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int O() {
        int iIntValue;
        synchronized (this.f) {
            Integer numJ = this.n != null ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.PRO_TEXT_SIZE)) : null;
            iIntValue = (numJ == null || numJ.intValue() < 12 || numJ.intValue() > 18) ? 16 : numJ.intValue();
        }
        return iIntValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int N() {
        int iIntValue;
        synchronized (this.f) {
            Integer numJ = this.n != null ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.PRO_HEIGHT)) : null;
            iIntValue = (numJ == null || numJ.intValue() < 40 || numJ.intValue() > 70) ? 56 : numJ.intValue();
        }
        return iIntValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int M() {
        int iIntValue;
        synchronized (this.f) {
            Integer numJ = !com.huawei.openalliance.ad.utils.br.a(this.n) ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.TWIST_ACCELERATION)) : null;
            iIntValue = (numJ == null || numJ.intValue() < 10) ? 15 : numJ.intValue();
        }
        return iIntValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int L() {
        int iIntValue;
        synchronized (this.f) {
            Integer numJ = !com.huawei.openalliance.ad.utils.br.a(this.n) ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.TWIST_DEGREE)) : null;
            iIntValue = 35;
            if (numJ != null && numJ.intValue() >= 35) {
                iIntValue = numJ.intValue();
            }
        }
        return iIntValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public String K() {
        String strE;
        synchronized (this.f) {
            strE = this.n != null ? com.huawei.openalliance.ad.utils.dg.e(this.n.get(ConfigMapKeys.TWIST_DESC)) : null;
        }
        return strE;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int J() {
        int iIntValue;
        synchronized (this.f) {
            Integer numJ = this.n != null ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.SWIPE_DP)) : null;
            iIntValue = (numJ == null || numJ.intValue() <= 0) ? 0 : numJ.intValue();
        }
        return iIntValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public String I() {
        String strE;
        synchronized (this.f) {
            strE = this.n != null ? com.huawei.openalliance.ad.utils.dg.e(this.n.get(ConfigMapKeys.SWIPE_DESC)) : null;
        }
        return strE;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int H() {
        int iIntValue;
        synchronized (this.f) {
            Integer numJ = this.n != null ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.CLICK_EXTRA_AREA)) : null;
            iIntValue = (numJ == null || numJ.intValue() < 0 || numJ.intValue() > 24) ? 3 : numJ.intValue();
        }
        return iIntValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public String G() {
        String strE;
        synchronized (this.f) {
            strE = this.n != null ? com.huawei.openalliance.ad.utils.dg.e(this.n.get(ConfigMapKeys.CLICK_DESC)) : null;
        }
        return strE;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int F() {
        synchronized (this.f) {
            Integer numJ = this.n != null ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.SPLASH_INTERACT_CFG)) : null;
            if (numJ != null && numJ.intValue() >= 0 && numJ.intValue() <= 4) {
                return numJ.intValue();
            }
            return 0;
        }
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean E() {
        boolean zEquals;
        synchronized (this.f) {
            zEquals = TextUtils.equals(com.huawei.openalliance.ad.utils.br.a(this.n) ? "1" : this.n.get(ConfigMapKeys.RPT_REPEATED_EVT), "0");
        }
        return !zEquals;
    }

    @Override // com.huawei.openalliance.ad.fy
    public int D() {
        int iIntValue;
        Long lK;
        synchronized (this.f) {
            Long lValueOf = 600000L;
            if (!com.huawei.openalliance.ad.utils.br.a(this.n) && this.n.get(ConfigMapKeys.CACHE_REFRESH_INTVL) != null && (lK = com.huawei.openalliance.ad.utils.dg.k(this.n.get(ConfigMapKeys.CACHE_REFRESH_INTVL))) != null && lK.longValue() > 0) {
                lValueOf = Long.valueOf(lK.longValue() * 1000);
            }
            iIntValue = lValueOf.intValue();
        }
        return iIntValue;
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean C() {
        synchronized (this.f) {
            if (!com.huawei.openalliance.ad.utils.br.a(this.n)) {
                String str = this.n.get(ConfigMapKeys.CLCT_STATDATA);
                if (TextUtils.equals(str, "1")) {
                    return true;
                }
                if (TextUtils.equals(str, "0")) {
                    return false;
                }
            }
            return cc.a(this.m).d();
        }
    }

    @Override // com.huawei.openalliance.ad.fy
    public boolean B() {
        synchronized (this.f) {
            if (!com.huawei.openalliance.ad.utils.br.a(this.n)) {
                String str = this.n.get(ConfigMapKeys.CLCT_DYNCDATA);
                if (TextUtils.equals(str, "1")) {
                    return true;
                }
                if (TextUtils.equals(str, "0")) {
                    return false;
                }
            }
            return cc.a(this.m).d();
        }
    }

    @Override // com.huawei.openalliance.ad.fy
    public int A() {
        int iIntValue;
        synchronized (this.f) {
            synchronized (this.f) {
                Integer numJ = this.n != null ? com.huawei.openalliance.ad.utils.dg.j(this.n.get(ConfigMapKeys.TEST_CFG_REF_INTERVAL_KEY)) : null;
                iIntValue = (numJ == null || numJ.intValue() <= 0) ? 10 : numJ.intValue();
            }
        }
        return iIntValue;
    }

    private int d(String str, int i) {
        synchronized (this.f) {
            if (this.n == null) {
                return i;
            }
            return com.huawei.openalliance.ad.utils.dg.a(this.n.get(str), i);
        }
    }

    private long b(String str, long j) {
        synchronized (this.f) {
            if (this.n == null) {
                return j;
            }
            return com.huawei.openalliance.ad.utils.dg.a(this.n.get(str), j);
        }
    }

    private boolean a(String str, boolean z) {
        synchronized (this.f) {
            if (this.n != null) {
                String str2 = this.n.get(str);
                if (!com.huawei.openalliance.ad.utils.dg.b(str2)) {
                    z = "1".equals(str2);
                }
            }
        }
        return z;
    }

    public ev(Context context) {
        super(context);
    }
}
