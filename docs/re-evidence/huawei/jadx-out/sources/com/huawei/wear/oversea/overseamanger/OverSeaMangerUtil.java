package com.huawei.wear.oversea.overseamanger;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.BuildConfig;
import com.huawei.wear.oversea.satcomcard.SatcomCardMassTestConfig;
import com.huawei.wear.oversea.satcomcard.SatcomCardSupportInfo;
import defpackage.xml;
import defpackage.xmt;
import defpackage.xmy;
import defpackage.xnd;
import defpackage.xnf;
import defpackage.xng;
import defpackage.xnj;
import defpackage.xnm;
import defpackage.xnp;
import defpackage.xnr;
import defpackage.xns;
import defpackage.xnv;
import defpackage.xnz;
import defpackage.xoc;
import defpackage.xog;
import defpackage.xok;
import defpackage.xop;
import defpackage.xoq;
import defpackage.xot;
import defpackage.xpd;
import defpackage.xpf;
import defpackage.xpi;
import defpackage.xpq;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class OverSeaMangerUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f30699b = new Object();
    private static volatile OverSeaMangerUtil d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30700a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f30701c = false;
    private xmt e;

    /* JADX INFO: loaded from: classes46.dex */
    public interface IssuerControlFlag {
        public static final int AVAILABLE = 0;
        public static final int CAN_NOT_FIND = -1;
        public static final int CLIENT_VERSION_LOW = 2;
        public static final int ROM_VERSION_AND_CLIENT_VERSION_LOW = 3;
        public static final int ROM_VERSION_LOW = 1;
    }

    /* JADX INFO: loaded from: classes46.dex */
    public interface SatcomCardExistStauts {
        public static final int EXIST = 0;
        public static final int NOT_EXIST = 1;
        public static final int UNKNOWN = -1;
    }

    private void e() {
    }

    private OverSeaMangerUtil(Context context) {
        Log.i("OverSeaMangerUtil", "context=" + context);
        xml.d(context instanceof Activity ? context.getApplicationContext() : context);
    }

    public static OverSeaMangerUtil a(Context context) {
        if (d == null) {
            synchronized (f30699b) {
                if (d == null) {
                    d = new OverSeaMangerUtil(context);
                }
            }
        }
        if (context != null) {
            xml.d(context);
        } else {
            Log.e("OverSeaMangerUtil", "getInstance input incorrect context");
        }
        return d;
    }

    private void a(xmt xmtVar, Context context) {
        this.f30701c = b(context);
        this.e = xmtVar;
    }

    public void e(xmt xmtVar, final OverSeaQueryCallBack overSeaQueryCallBack) {
        if (xmtVar != null) {
            e(xmtVar);
            if (!b(xmtVar)) {
                overSeaQueryCallBack.onFail(5);
                xnd.b("OverSeaMangerUtil", "querySupportOverSeaWalletUtil checkParams returns error ", false);
                return;
            }
            xot.d().a(xml.d());
            a(xmtVar, xml.d());
            xnd.b("OverSeaMangerUtil", "querySupportOverSeaWalletUtil, isDebugBuild=" + this.f30701c, false);
            xpd.e().c(new Runnable() { // from class: com.huawei.wear.oversea.overseamanger.OverSeaMangerUtil.3
                @Override // java.lang.Runnable
                public void run() {
                    int iL = OverSeaMangerUtil.this.l();
                    if (iL == 0) {
                        xnd.b("OverSeaMangerUtil", "querySupportOverSeaWalletUtil onSuccess = " + iL, false);
                        overSeaQueryCallBack.onSuccess(iL);
                        return;
                    }
                    xnd.b("OverSeaMangerUtil", "querySupportOverSeaWalletUtil onFail = " + iL, false);
                    overSeaQueryCallBack.onFail(iL);
                }
            });
        }
    }

    public void a(Context context, xmt xmtVar, final SatcomQueryCallBack satcomQueryCallBack) {
        if (context == null) {
            Log.e("OverSeaMangerUtil", "querySupportSatcomCardUtil input incorrect context");
        } else {
            xml.d(context);
        }
        if (xmtVar != null) {
            e(xmtVar);
            if (!b(xmtVar)) {
                SatcomCardSupportInfo satcomCardSupportInfo = new SatcomCardSupportInfo();
                satcomCardSupportInfo.c(5);
                satcomQueryCallBack.onFail(satcomCardSupportInfo);
                xnd.b("OverSeaMangerUtil", "querySupportSatcomCardUtil checkParams returns error ", false);
                return;
            }
            xot.d().a(xml.d());
            a(xmtVar, xml.d());
            xnd.b("OverSeaMangerUtil", "querySupportSatcomCardUtil, isDebugBuild=" + this.f30701c, false);
            xpd.e().c(new Runnable() { // from class: com.huawei.wear.oversea.overseamanger.OverSeaMangerUtil.2
                @Override // java.lang.Runnable
                public void run() {
                    SatcomCardSupportInfo satcomCardSupportInfoJ = OverSeaMangerUtil.this.j();
                    if (satcomCardSupportInfoJ.e() == 0) {
                        xnd.d("OverSeaMangerUtil", "querySupportSatcomCardUtil onSuccess = " + satcomCardSupportInfoJ.e());
                        satcomQueryCallBack.onSuccess(satcomCardSupportInfoJ);
                        return;
                    }
                    xnd.d("OverSeaMangerUtil", "querySupportSatcomCardUtil onFail = " + satcomCardSupportInfoJ.e());
                    satcomQueryCallBack.onFail(satcomCardSupportInfoJ);
                }
            });
        }
    }

    public void b(Context context, xmt xmtVar, final SatcomExistInfoCallback satcomExistInfoCallback) {
        if (satcomExistInfoCallback == null) {
            Log.e("OverSeaMangerUtil", "queryNeedShowSatcomOobe input callback invalid");
            return;
        }
        if (context == null) {
            Log.e("OverSeaMangerUtil", "queryNeedShowSatcomOobe input incorrect context");
            satcomExistInfoCallback.onResult(-1, -1);
            return;
        }
        xml.d(context);
        if (xmtVar != null) {
            if (!b(xmtVar) || TextUtils.isEmpty(xmtVar.a()) || TextUtils.isEmpty(xmtVar.h())) {
                satcomExistInfoCallback.onResult(-1, -1);
                xnd.b("OverSeaMangerUtil", "queryNeedShowSatcomOobe checkParams returns error ", false);
                return;
            } else {
                xot.d().a(xml.d());
                a(xmtVar, xml.d());
                xnd.b("OverSeaMangerUtil", "queryNeedShowSatcomOobe", false);
                xpd.e().c(new Runnable() { // from class: xne
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53185b.b(satcomExistInfoCallback);
                    }
                });
                return;
            }
        }
        satcomExistInfoCallback.onResult(-1, -1);
    }

    public /* synthetic */ void b(SatcomExistInfoCallback satcomExistInfoCallback) {
        satcomExistInfoCallback.onResult(0, !o() ? 1 : 0);
    }

    private boolean b(String str) {
        return "1".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SatcomCardSupportInfo j() {
        SatcomCardSupportInfo satcomCardSupportInfo = new SatcomCardSupportInfo();
        if (this.e == null) {
            satcomCardSupportInfo.c(5);
            return satcomCardSupportInfo;
        }
        boolean z = false;
        satcomCardSupportInfo.c(0);
        if (k() != 0) {
            satcomCardSupportInfo.e(false);
            return satcomCardSupportInfo;
        }
        boolean zE = xmy.e(this.e, "satcomcard");
        boolean zA = a("Oversea_Wear_SatcomCard");
        if (!zE || !zA) {
            satcomCardSupportInfo.e(false);
            return satcomCardSupportInfo;
        }
        if (zE && zA) {
            z = true;
        }
        satcomCardSupportInfo.e(z);
        satcomCardSupportInfo.e(m());
        return satcomCardSupportInfo;
    }

    private int k() {
        xmt xmtVar = this.e;
        if (xmtVar == null) {
            xnd.c("OverSeaMangerUtil", "[getWalletSupportCheckResultInSatcomProcess]health info is null...");
            return 5;
        }
        if (!xmtVar.t()) {
            xnd.c("OverSeaMangerUtil", "[getWalletSupportCheckResultInSatcomProcess]not supported console...");
            return 0;
        }
        if (!"1".equals(this.e.g())) {
            xnd.c("OverSeaMangerUtil", "[getWalletSupportCheckResultInSatcomProcess]area is not cn...");
            return 1;
        }
        if (r() && xpf.c()) {
            return w();
        }
        e(n());
        xnd.d("OverSeaMangerUtil", "querySupportOverSeaWallet end " + this.f30700a);
        return this.f30700a;
    }

    private boolean r() {
        if (Math.abs(System.currentTimeMillis() - xnv.e(xml.d()).c("query_wallet_entrance_control_end_time_sub_sdk", (Long) 0L).longValue()) >= 3600000) {
            xnd.d("OverSeaMangerUtil", "isWalletEntranceControlNeedQueryServer need query server");
            return true;
        }
        if (xnv.e(xml.d()).c("query_wallet_entrance_control_result_sub_sdk", -1) != -1) {
            return false;
        }
        xnd.d("OverSeaMangerUtil", "isWalletEntranceControlNeedQueryServer sp invalid");
        return true;
    }

    private void e(xmt xmtVar) {
        int iC = xpi.c(xmtVar.n(), 0);
        if (d(xmtVar.f(), iC)) {
            i();
            if (!TextUtils.isEmpty(xmtVar.f())) {
                xnv.e(xml.d()).e("DEVICE_ROM_VERSION_SUB_SDK", xmtVar.f());
            }
            if (iC != 0) {
                xnv.e(xml.d()).e("HEALTH_APP_VERSION_FOR_WEAR_WALLET_SUB_SDK", iC);
            }
            String strG = xmtVar.g();
            xnd.e("OverSeaMangerUtil", "try to save area to sp...|area: " + strG);
            if (TextUtils.isEmpty(strG)) {
                return;
            }
            xnv.e(xml.d()).e("oversea_info_device_ota_area", strG);
        }
    }

    private boolean d(String str, int i) {
        String strB = xnv.e(xml.d()).b("DEVICE_ROM_VERSION_SUB_SDK", "");
        int iC = xnv.e(xml.d()).c("HEALTH_APP_VERSION_FOR_WEAR_WALLET_SUB_SDK", -1);
        xnd.d("OverSeaMangerUtil", "needUpdateCache deviceRomVersion=" + str + ", healthAppVersion=" + i + ", deviceRomVersionCache=" + strB + ", healthAppVersionCache=" + iC);
        return (iC == i && strB.equals(str)) ? false : true;
    }

    private void i() {
        e();
        f();
        g();
        h();
    }

    private void f() {
        if (xnv.e(xml.d()).e("oversea_info_device_ota_area")) {
            xnv.e(xml.d()).c("oversea_info_device_ota_area");
        }
    }

    private void g() {
        xmy.a();
        xnv.e(xml.d()).a("query_wallet_entrance_control_end_time_sub_sdk", 0L);
        xnv.e(xml.d()).e("query_wallet_entrance_control_result_sub_sdk", -1);
        c();
    }

    private void h() {
        xnv.e(xml.d()).e("satcom_card_exist", -1);
        xnv.e(xml.d()).a("satocm_card_exist_save_time", 0L);
    }

    private void c() {
        if (xnv.e(xml.d()).e("support_business_oversea")) {
            xnv.e(xml.d()).c("support_business_oversea");
        }
        if (xnv.e(xml.d()).e("support_business_query_end_time_oversea")) {
            xnv.e(xml.d()).c("support_business_query_end_time_oversea");
        }
    }

    private int m() {
        if (!xpf.c()) {
            return v();
        }
        if (t()) {
            if (p()) {
                return v();
            }
            return v();
        }
        return v();
    }

    private int v() {
        String strA = a();
        if (!xpi.d(strA, true) && strA.contains("|")) {
            String[] strArrSplit = strA.split("\\|");
            int i = Integer.parseInt(strArrSplit[0]);
            int i2 = Integer.parseInt(strArrSplit[1]);
            int i3 = Integer.parseInt(xpq.e(new Date(System.currentTimeMillis()), "yyyyMMdd"));
            if (i3 >= i && i3 <= i2) {
                return 1;
            }
        }
        return 0;
    }

    public String a() {
        return xnv.e(xml.d()).b("Mass_Test_Period", "");
    }

    private boolean t() {
        if (Math.abs(System.currentTimeMillis() - xnv.e(xml.d()).c("Test_Period_Query_End_Time", (Long) 0L).longValue()) < 3600000) {
            return false;
        }
        xnd.d("OverSeaMangerUtil", "need query mass test info from server");
        return true;
    }

    private boolean p() {
        xoc xocVar = new xoc();
        xocVar.a("hwpass.wallet.satcomcard");
        xns xnsVarProcessTask = new xop(xml.d(), xot.d().d("query.pass.type", "WalletPass", this.e.n(), this.e.e(), xml.d())).processTask(xocVar);
        if (xnsVarProcessTask == null || xnsVarProcessTask.f53201b != 0) {
            return false;
        }
        return d(xnsVarProcessTask);
    }

    private boolean d(xns xnsVar) {
        String strC = xnsVar.c();
        try {
            if (TextUtils.isEmpty(strC)) {
                xnd.d("OverSeaMangerUtil", "querySatcomActivityPeriodFromServer, reserve is null");
                return false;
            }
            SatcomCardMassTestConfig satcomCardMassTestConfig = (SatcomCardMassTestConfig) new Gson().fromJson(strC, SatcomCardMassTestConfig.class);
            if (satcomCardMassTestConfig == null) {
                xnd.c("OverSeaMangerUtil", "querySatcomActivityPeriodFromServer, config is null");
                return false;
            }
            xnv.e(xml.d()).e("Mass_Test_Period", satcomCardMassTestConfig.d());
            xnv.e(xml.d()).a("Test_Period_Query_End_Time", Long.valueOf(System.currentTimeMillis()));
            xnv.e(xml.d()).e("BeiDou_Audit_Cycle", satcomCardMassTestConfig.a());
            xnv.e(xml.d()).e("Beidou_Audit_Wait_Day", satcomCardMassTestConfig.e());
            return true;
        } catch (JsonSyntaxException unused) {
            xnd.a("OverSeaMangerUtil", "querySatcomActivityPeriodFromServer JsonSyntaxException");
            return false;
        } catch (NumberFormatException unused2) {
            xnd.a("OverSeaMangerUtil", "querySatcomActivityPeriodFromServer NumberFormatException");
            return false;
        }
    }

    private boolean o() {
        xnd.d("OverSeaMangerUtil", "isHasIssuedSatcomCard begin.");
        if (!q()) {
            return xnv.e(xml.d()).c("satcom_card_exist", -1) == 0;
        }
        xnz xnzVar = new xnz();
        xnzVar.d = this.e.a();
        xnzVar.c(BuildConfig.WALLET_MERCHANT_ID);
        xnzVar.e(-1);
        xnzVar.d("2");
        xnr xnrVarProcessTask = new xok(xml.d(), xot.e(xml.d(), "VIRTUALCARD", this.e.e())).processTask(xnzVar);
        if (xnrVarProcessTask != null && xnrVarProcessTask.f53201b == 0) {
            xnd.d("OverSeaMangerUtil", "isHasIssuedSatcomCard response success");
            xnv.e(xml.d()).a("satocm_card_exist_save_time", Long.valueOf(System.currentTimeMillis()));
            if (xnrVarProcessTask.b() == 0) {
                xnd.d("OverSeaMangerUtil", "isHasIssuedSatcomCard 1 NOT exist issued satcom card");
                xnv.e(xml.d()).e("satcom_card_exist", 1);
                return false;
            }
            Iterator<xnj> it = xnrVarProcessTask.c().iterator();
            while (it.hasNext()) {
                if ("satcomcard".equals(it.next().a())) {
                    xnv.e(xml.d()).e("satcom_card_exist", 0);
                    xnd.d("OverSeaMangerUtil", "isHasIssuedSatcomCard has issued satcom card");
                    return true;
                }
            }
            xnd.d("OverSeaMangerUtil", "isHasIssuedSatcomCard 2 NOT exist issued satcom card");
            xnv.e(xml.d()).e("satcom_card_exist", 1);
            return false;
        }
        xnd.d("OverSeaMangerUtil", "isHasIssuedSatcomCard response fail");
        return false;
    }

    private boolean q() {
        if (Math.abs(xnv.e(xml.d()).c("satocm_card_exist_save_time", (Long) 0L).longValue() - System.currentTimeMillis()) >= 3600000) {
            xnd.d("OverSeaMangerUtil", "needQuerySatomExistFromServer cache overTimeLimited");
            return true;
        }
        if (xnv.e(xml.d()).c("satcom_card_exist", -1) != -1) {
            return false;
        }
        xnd.d("OverSeaMangerUtil", "needQuerySatomExistFromServer cache invalid");
        return true;
    }

    private boolean a(String str) {
        String strB;
        xnd.d("OverSeaMangerUtil", "isSupportBusiness " + str);
        if (xpf.c() && s()) {
            xnd.d("OverSeaMangerUtil", "isSupportBusiness query from server");
            strB = c(xot.e(xml.d(), "VIRTUALCARD", this.e.e()), this.e.e());
            xnd.d("OverSeaMangerUtil", "isSupportBusiness serverResult=" + strB);
        } else {
            xnd.d("OverSeaMangerUtil", "isSupportBusiness use cache");
            strB = xnv.e(xml.d()).b("support_business_oversea", "");
        }
        if (TextUtils.isEmpty(strB)) {
            xnd.d("OverSeaMangerUtil", "isSupportBusiness cache invalid return NOT support");
            return false;
        }
        boolean zC = c(str, c(strB));
        xnd.d("OverSeaMangerUtil", "isSupportBusiness type=" + str + ", result=" + zC);
        return zC;
    }

    private boolean s() {
        long jAbs = Math.abs(System.currentTimeMillis() - xnv.e(xml.d()).c("support_business_query_end_time_oversea", (Long) 0L).longValue());
        String strB = xnv.e(xml.d()).b("support_business_oversea", "");
        if (jAbs >= 3600000) {
            xnd.d("OverSeaMangerUtil", "needQueryBusinessFromServer overTimeLimitation");
            return true;
        }
        if (!TextUtils.isEmpty(strB)) {
            return false;
        }
        xnd.d("OverSeaMangerUtil", "needQueryBusinessFromServer cache invalid");
        return true;
    }

    private String c(String str, String str2) {
        xoq xoqVar = new xoq(xml.d(), str);
        xog xogVar = new xog();
        xogVar.a(str2);
        xogVar.d(this.e.b());
        xnp xnpVarProcessTask = xoqVar.processTask(xogVar);
        if (xnpVarProcessTask.f53201b == 0) {
            String strE = xnpVarProcessTask.e();
            e(strE);
            return strE;
        }
        return "";
    }

    private void e(String str) {
        xnv.e(xml.d()).e("support_business_oversea", str);
        xnv.e(xml.d()).a("support_business_query_end_time_oversea", Long.valueOf(System.currentTimeMillis()));
    }

    public boolean c(String str, Map<String, String> map) {
        String str2;
        if (map == null || (str2 = map.get(str)) == null) {
            return false;
        }
        return str2.equals("1");
    }

    private Map<String, String> c(String str) {
        HashMap map = new HashMap();
        if (str != null && !TextUtils.isEmpty(str)) {
            map = new HashMap();
            for (String str2 : str.split("\\|")) {
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    String[] strArrSplit = str2.split(":");
                    if (strArrSplit.length > 1) {
                        map.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
            }
        }
        return map;
    }

    private boolean b(xmt xmtVar) {
        if (TextUtils.isEmpty(xmtVar.e())) {
            xnd.d("OverSeaMangerUtil", "checkParams countryCode is null ");
            return false;
        }
        if (TextUtils.isEmpty(xmtVar.o())) {
            xnd.d("OverSeaMangerUtil", "checkParams userid is null ");
            return false;
        }
        if (TextUtils.isEmpty(xmtVar.c())) {
            xnd.d("OverSeaMangerUtil", "checkParams appID is null ");
            return false;
        }
        if (TextUtils.isEmpty(xmtVar.b())) {
            xnd.d("OverSeaMangerUtil", "checkParams certModel is null ");
            return false;
        }
        if (TextUtils.isEmpty(xmtVar.n())) {
            xnd.d("OverSeaMangerUtil", "checkParams softVersion is null ");
            return false;
        }
        c(xmtVar);
        return true;
    }

    private void c(xmt xmtVar) {
        xnd.d("OverSeaMangerUtil", "debugPrintHealthInfo healthAppVersion=" + xmtVar.n() + ", watchWalletVersion=" + xmtVar.j() + ", deviceRomVersion=" + xmtVar.f() + ", newCtl=" + xmtVar.t() + ", otaType=" + xmtVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int l() {
        xmt xmtVar = this.e;
        if (xmtVar == null) {
            return 5;
        }
        if (!xmtVar.t() || b(this.e.g())) {
            return 0;
        }
        if (!xpf.c()) {
            xnd.d("OverSeaMangerUtil", "querySupportOverSeaWallet, no network.");
            return 7;
        }
        if (xmy.e(this.e, "over_sea_vip_card")) {
            return 0;
        }
        return w();
    }

    private int w() {
        String strE = this.e.e();
        String strN = this.e.n();
        String strF = this.e.f();
        String strB = this.e.b();
        if (!xpf.c()) {
            xnd.d("OverSeaMangerUtil", "querySupportOverSeaWallet,  no network.");
            return 7;
        }
        if (TextUtils.isEmpty(strB) || TextUtils.isEmpty(strF) || TextUtils.isEmpty(strN) || TextUtils.isEmpty(strE)) {
            return 5;
        }
        Log.i("OverSeaMangerUtil", "mContext=" + xml.d());
        String strE2 = e(xml.d(), "/api/v1/client/wearQueryHuaweiPayUsability", "/app/gateway");
        xnf xnfVar = new xnf();
        xnfVar.d(strB);
        xnfVar.e(strF);
        xnfVar.a(strN);
        xnfVar.b(strE);
        xnd.d("OverSeaMangerUtil", "romVersion = " + strF + " terminal = " + strB + " wearClientVersion = " + strN);
        xng xngVarProcessTask = new xnm(xml.d(), strE2).processTask(xnfVar);
        StringBuilder sb = new StringBuilder("querySupportOverSeaWallet = ");
        sb.append(xngVarProcessTask.f53201b);
        xnd.d("OverSeaMangerUtil", sb.toString());
        c(xngVarProcessTask.f53201b);
        e(xngVarProcessTask.f53201b);
        xnd.d("OverSeaMangerUtil", "querySupportOverSeaWallet end " + this.f30700a);
        return this.f30700a;
    }

    private void e(int i) {
        if (i == -12 || i == -11) {
            this.f30700a = 6;
            return;
        }
        if (i == 0) {
            this.f30700a = 0;
            return;
        }
        if (i == 1) {
            this.f30700a = 1;
            return;
        }
        if (i == 2) {
            this.f30700a = 2;
            return;
        }
        if (i == 3) {
            this.f30700a = 3;
        } else if (i == 4) {
            this.f30700a = 4;
        } else {
            this.f30700a = 8;
        }
    }

    private static void c(int i) {
        xnv.e(xml.d()).e("query_wallet_entrance_control_result_sub_sdk", i);
        xnv.e(xml.d()).a("query_wallet_entrance_control_end_time_sub_sdk", Long.valueOf(System.currentTimeMillis()));
    }

    private static int n() {
        return xnv.e(xml.d()).c("query_wallet_entrance_control_result_sub_sdk", 8);
    }

    private static String e(Context context, String str, String str2) {
        int i;
        String strReplace;
        xot.d();
        String strE = xot.e(context, "VIRTUALCARD", a(xml.d()).b().e());
        try {
            i = Integer.parseInt(a(xml.d()).b().n());
        } catch (NumberFormatException unused) {
            xnd.d("OverSeaMangerUtil", "getNewAddressUrl NumberFormatException");
            i = 0;
        }
        xnd.d("OverSeaMangerUtil", "getNewAddressUrl  " + i);
        if (!TextUtils.isEmpty(strE) && strE.contains(str2) && strE.endsWith(str2)) {
            strReplace = strE.replace(str2, str);
        } else {
            strReplace = strE + str;
        }
        return strReplace + "?clientVersion=" + i;
    }

    private static boolean b(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public xmt b() {
        xmt xmtVar = this.e;
        return xmtVar == null ? new xmt() : xmtVar;
    }

    public boolean d() {
        return this.f30701c;
    }
}
