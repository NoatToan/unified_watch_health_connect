package com.huawei.openalliance.ad.analysis;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.consent.bean.network.ApiStatisticsReq;
import com.huawei.hms.ads.consent.bean.network.ConfirmResultReq;
import com.huawei.openalliance.ad.beans.metadata.OaidRecord;
import com.huawei.openalliance.ad.beans.metadata.ParamFromServer;
import com.huawei.openalliance.ad.beans.metadata.TouchPoint;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.cx;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.pc;
import com.huawei.openalliance.ad.rk;
import com.huawei.openalliance.ad.sp;
import com.huawei.openalliance.ad.sw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.dg;
import defpackage.ohl;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class i extends f implements cx {
    public void g(ContentRecord contentRecord) {
        StringBuilder sb;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onAppointSuccess, contentRecord is null.");
                return;
            }
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("93");
            bVarA.a(contentRecord.f());
            bVarA.o(contentRecord.n());
            bVarA.p(contentRecord.o());
            bVarA.H(contentRecord.p());
            bVarA.al(contentRecord.af());
            new pc(this.f18255a, sw.a(this.f18255a, contentRecord.f())).b(bVarA, false, false);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onAppointSuccess RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onAppointSuccess Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    @Override // com.huawei.openalliance.ad.cx
    public void f(ContentRecord contentRecord, String str) {
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onFeedbackAction, contentRecord is null.");
                return;
            }
            b bVarA = a(contentRecord.ao());
            if (bVarA == null) {
                return;
            }
            if (hw.a()) {
                hw.a("BaseAnalysisReport", "onFeedbackAction, extraStr1: %s", str);
            }
            bVarA.ak("157");
            bVarA.a(contentRecord.f());
            bVarA.o(contentRecord.n());
            bVarA.p(contentRecord.o());
            bVarA.H(contentRecord.p());
            bVarA.al(str);
            new pc(this.f18255a, sw.a(this.f18255a, contentRecord.f())).b(bVarA, false, false);
        } catch (Exception e) {
            hw.c("BaseAnalysisReport", "onFeedbackAction Exception:" + e.getClass().getSimpleName());
        }
    }

    public void e(ContentRecord contentRecord, String str) {
        String str2;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "reportInstallPopUpEvent, data is null");
                return;
            }
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak(str);
            bVarF.H(contentRecord.p());
            bVarF.p(contentRecord.o());
            new pc(this.f18255a, sw.a(this.f18255a, contentRecord.f())).b(bVarF, false, true);
        } catch (RuntimeException unused) {
            str2 = "reportInstallPopUpEvent RuntimeException";
            hw.c("BaseAnalysisReport", str2);
        } catch (Exception unused2) {
            str2 = "reportInstallPopUpEvent Exception";
            hw.c("BaseAnalysisReport", str2);
        }
    }

    public void e(ContentRecord contentRecord) {
        a("17", contentRecord, (String) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 int, still in use, count: 1, list:
      (r2v0 int) from 0x0021: IF  (r2v0 int) != (48718 int)  -> B:10:0x0023 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    public void d(ContentRecord contentRecord, String str) {
        StringBuilder sb;
        byte b2;
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                hw.d("BaseAnalysisReport", "onRewardAdPopUpReport get analysisInfo failed");
                return;
            }
            if (str.hashCode() != 48718) {
                switch (str) {
                    case "127":
                        b2 = 0;
                        break;
                    case "128":
                        b2 = 1;
                        break;
                    case "129":
                        b2 = 2;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
            } else if (str.equals("130")) {
                b2 = 3;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                bVarF.ak("127");
            } else if (b2 == 1) {
                bVarF.ak("128");
            } else if (b2 == 2) {
                bVarF.ak("129");
            } else if (b2 == 3) {
                bVarF.ak("130");
            }
            hw.b("BaseAnalysisReport", "adType is " + bVarF.t());
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, false, true);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onRewardAdPopUpReport RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onRewardAdPopUpReport Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void d(ContentRecord contentRecord) {
        a("18", contentRecord, (String) null);
    }

    public void c(ContentRecord contentRecord, String str) {
        String str2;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onAppNotificationOperateAction, contentRecord is null");
                return;
            }
            String strN = contentRecord.n();
            String strO = contentRecord.o();
            int iF = contentRecord.f();
            b bVarA = a(contentRecord.ao());
            if (bVarA == null) {
                return;
            }
            bVarA.ak("70");
            bVarA.o(strN);
            bVarA.p(strO);
            bVarA.a(iF);
            if (!TextUtils.isEmpty(str)) {
                bVarA.r(str);
            }
            pc pcVar = new pc(this.f18255a, sw.a(this.f18255a, iF));
            pcVar.a(contentRecord);
            pcVar.b(bVarA, false, true);
        } catch (RuntimeException unused) {
            str2 = "onAppNotificationOperateAction RuntimeException";
            hw.c("BaseAnalysisReport", str2);
        } catch (Exception unused2) {
            str2 = "onAppNotificationOperateAction Exception";
            hw.c("BaseAnalysisReport", str2);
        }
    }

    public void c(ContentRecord contentRecord, int i) {
        StringBuilder sb;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onCancelAppointmentFailed, contentRecord is null.");
                return;
            }
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("96");
            bVarA.a(contentRecord.f());
            bVarA.o(contentRecord.n());
            bVarA.p(contentRecord.o());
            bVarA.H(contentRecord.p());
            bVarA.c(i);
            bVarA.al(contentRecord.af());
            new pc(this.f18255a, sw.a(this.f18255a, contentRecord.f())).b(bVarA, false, false);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onCancelAppointmentFailed RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onCancelAppointmentFailed Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void c(ContentRecord contentRecord) {
        a("117", contentRecord, (String) null);
    }

    @Override // com.huawei.openalliance.ad.cx
    public void b(String str) {
        String str2;
        try {
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            bVarA.ak("69");
            if (!TextUtils.isEmpty(str)) {
                bVarA.r(str);
            }
            new pc(this.f18255a, null).b(bVarA, false, true);
        } catch (RuntimeException unused) {
            str2 = "onActiveAppFromBackBtn RuntimeException";
            hw.c("BaseAnalysisReport", str2);
        } catch (Exception unused2) {
            str2 = "onActiveAppFromBackBtn Exception";
            hw.c("BaseAnalysisReport", str2);
        }
    }

    public void b(AdLandingPageData adLandingPageData) {
        String str;
        try {
            if (adLandingPageData == null) {
                hw.c("BaseAnalysisReport", "onLandingOpenAppDialogCancel, data is null");
                return;
            }
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            bVarA.ak("62");
            new pc(this.f18255a, sw.a(this.f18255a, adLandingPageData.getAdType())).b(a(bVarA, adLandingPageData), false, true);
        } catch (RuntimeException unused) {
            str = "onLandingOpenAppDialogCancelError RuntimeException";
            hw.c("BaseAnalysisReport", str);
        } catch (Exception unused2) {
            str = "onLandingOpenAppDialogCancelError Exception";
            hw.c("BaseAnalysisReport", str);
        }
    }

    public void b(ContentRecord contentRecord, String str) {
        a("64", contentRecord, str);
    }

    public void b(ContentRecord contentRecord, int i) {
        StringBuilder sb;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onCancelAppointmentSuccess, contentRecord is null.");
                return;
            }
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("95");
            bVarA.a(contentRecord.f());
            bVarA.o(contentRecord.n());
            bVarA.p(contentRecord.o());
            bVarA.H(contentRecord.p());
            bVarA.c(i);
            bVarA.al(contentRecord.af());
            new pc(this.f18255a, sw.a(this.f18255a, contentRecord.f())).b(bVarA, false, false);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onCancelAppointmentSuccess RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onCancelAppointmentSuccess Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void b(ContentRecord contentRecord) {
        a("116", contentRecord, (String) null);
    }

    public void a(String str, String str2, String str3, String str4) {
        try {
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.a(1);
            bVarA.ak(str);
            bVarA.al(str2);
            bVarA.am(str3);
            bVarA.an(str4);
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarA, true, true);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "onDbSizeReport ex: %s", th.getClass().getSimpleName());
        }
    }

    public void a(String str, String str2, ContentRecord contentRecord) {
        try {
            if (!dg.b(str) && !dg.b(str2) && contentRecord != null) {
                b bVarA = a(contentRecord, true);
                if (bVarA == null) {
                    return;
                }
                bVarA.ak("2100055");
                bVarA.al(String.valueOf(contentRecord.D()));
                bVarA.am("app");
                bVarA.an(str2);
                if (str2.equals(Constants.FAST_APP_PKG)) {
                    bVarA.am(Constants.FASTAPP_PKG);
                    bVarA.ao(str);
                }
                bVarA.ap(e(contentRecord.c(this.f18255a)));
                new pc(this.f18255a, null).b(bVarA, false, true);
                return;
            }
            hw.c("BaseAnalysisReport", "param is empty");
        } catch (Throwable unused) {
            hw.c("BaseAnalysisReport", "onOpenAppDetail Exception");
        }
    }

    public void a(String str, String str2, long j) {
        try {
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("161");
            bVarA.c(j);
            bVarA.al(str);
            bVarA.am(str2);
            bVarA.c(0);
            new pc(this.f18255a, null).b(bVarA, false, true);
        } catch (Throwable unused) {
            hw.c("BaseAnalysisReport", "onDynamicLoaderSuccess Exception");
        }
    }

    public void a(String str, String str2, int i, String str3) {
        try {
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("161");
            bVarA.c(i);
            bVarA.al(str);
            bVarA.am(str2);
            bVarA.an(str3);
            new pc(this.f18255a, null).b(bVarA, false, true);
        } catch (Throwable unused) {
            hw.c("BaseAnalysisReport", "onDynamicLoaderException Exception");
        }
    }

    public void a(String str, String str2) {
        StringBuilder sb;
        try {
            if (OaidRecord.LIMIT_OAID_OPEN_KEY.equalsIgnoreCase(str2) || OaidRecord.LIMIT_OAID_CLOSE_KEY.equalsIgnoreCase(str2)) {
                a(str2);
            }
            OaidRecord oaidRecordQ = fp.b(this.f18255a).q(str2);
            if (oaidRecordQ == null) {
                oaidRecordQ = new OaidRecord();
            }
            hw.b("BaseAnalysisReport", "onOaidSettingReport");
            oaidRecordQ.c();
            if (fp.b(this.f18255a).a(oaidRecordQ.b())) {
                hw.b("BaseAnalysisReport", "report oaid setting event");
                b bVarA = a(false);
                if (bVarA == null) {
                    return;
                }
                a(this.f18255a, bVarA);
                b(this.f18255a, bVarA);
                bVarA.ak(str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("count", oaidRecordQ.a());
                bVarA.r(dg.f(jSONObject.toString()));
                new pc(this.f18255a, sw.a(this.f18255a, -1)).b(bVarA, true, true);
                oaidRecordQ.a(System.currentTimeMillis());
                oaidRecordQ.a(0);
            }
            fp.b(this.f18255a).a(str2, oaidRecordQ);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onOaidSettingReport RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onOaidSettingReport Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    @Override // com.huawei.openalliance.ad.cx
    public void a(String str, ConfirmResultReq confirmResultReq, rk rkVar) {
        StringBuilder sb;
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<ApiStatisticsReq> it = confirmResultReq.getCaches().iterator();
            while (it.hasNext()) {
                com.huawei.openalliance.ad.beans.inner.ApiStatisticsReq apiStatisticsReqConvert = it.next().convert();
                b bVarA = a(str, true);
                if (bVarA == null) {
                    return;
                }
                bVarA.ak("66");
                bVarA.a(as.a("yyyy-MM-dd HH:mm:ss.SSSZ").format(new Date(apiStatisticsReqConvert.e())));
                bVarA.r(dg.f(apiStatisticsReqConvert.g()));
                bVarA.z("3.4.84.300");
                bVarA.A(apiStatisticsReqConvert.a());
                bVarA.B(apiStatisticsReqConvert.b());
                bVarA.b(apiStatisticsReqConvert.c());
                bVarA.c(apiStatisticsReqConvert.d());
                bVarA.C(apiStatisticsReqConvert.i());
                if (apiStatisticsReqConvert.h() != null) {
                    bVarA.G(apiStatisticsReqConvert.h());
                }
                bVarA.F(com.huawei.openalliance.ad.utils.d.g(this.f18255a));
                arrayList.add(bVarA);
            }
            new pc(this.f18255a, sw.a(this.f18255a, -1)).a(str, arrayList, rkVar);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onApiStatisticsReport RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onApiStatisticsReport Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(String str) {
        StringBuilder sb;
        try {
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            hw.b("BaseAnalysisReport", "onConsentConfirm");
            bVarA.ak("66");
            bVarA.C(OaidRecord.LIMIT_OAID_OPEN_KEY.equalsIgnoreCase(str) ? "0" : "1");
            a(this.f18255a, bVarA);
            b(this.f18255a, bVarA);
            new pc(this.f18255a, sw.a(this.f18255a, -1)).b(bVarA, false, true);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onConsentConfirm RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onConsentConfirm Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(ohl ohlVar) {
        try {
            if (ohlVar == null) {
                hw.c("BaseAnalysisReport", "onPrivacyStatementOpen, privacyInfo is null");
                return;
            }
            b bVarA = a(this.f18255a.getPackageName(), true);
            if (bVarA == null) {
                return;
            }
            if (hw.a()) {
                hw.a("BaseAnalysisReport", "onPrivacyStatementOpen, type: %s", ohlVar.e());
            }
            bVarA.ak("120");
            bVarA.ad(ohlVar.e());
            bVarA.ae(ohlVar.d());
            bVarA.a(ohlVar.b());
            bVarA.b(ohlVar.c());
            bVarA.af(ohlVar.a());
            bVarA.ag(ohlVar.i());
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarA, true, true);
        } catch (RuntimeException e) {
            hw.c("BaseAnalysisReport", "onPrivacyStatementOpen RuntimeException： %s", e.getClass().getSimpleName());
        } catch (Exception e2) {
            hw.c("BaseAnalysisReport", "onPrivacyStatementOpen Exception： %s", e2.getClass().getSimpleName());
        }
    }

    public void a(AdLandingPageData adLandingPageData, String str) {
        String str2;
        try {
            if (c(str)) {
                if (adLandingPageData == null) {
                    hw.c("BaseAnalysisReport", "onLandingOpenAppDialogCancel, data is null");
                    return;
                }
                b bVarA = a();
                if (bVarA == null) {
                    return;
                }
                bVarA.ak(str);
                b bVarA2 = a(bVarA, adLandingPageData);
                bVarA2.al("1");
                new pc(this.f18255a, sw.a(this.f18255a, adLandingPageData.getAdType())).b(bVarA2, false, true);
            }
        } catch (RuntimeException unused) {
            str2 = "onLandPagePopUpReport RuntimeException";
            hw.c("BaseAnalysisReport", str2);
        } catch (Exception unused2) {
            str2 = "onLandPagePopUpReport Exception";
            hw.c("BaseAnalysisReport", str2);
        }
    }

    public void a(AdLandingPageData adLandingPageData) {
        String str;
        try {
            if (adLandingPageData == null) {
                hw.c("BaseAnalysisReport", "onLandingOpenAppDialogAccept, data is null");
                return;
            }
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            bVarA.ak("61");
            new pc(this.f18255a, sw.a(this.f18255a, adLandingPageData.getAdType())).b(a(bVarA, adLandingPageData), false, true);
        } catch (RuntimeException unused) {
            str = "onLandingOpenAppDialogAcceptError RuntimeException";
            hw.c("BaseAnalysisReport", str);
        } catch (Exception unused2) {
            str = "onLandingOpenAppDialogAcceptError Exception";
            hw.c("BaseAnalysisReport", str);
        }
    }

    public void a(ContentRecord contentRecord, String str) {
        a("63", contentRecord, str);
    }

    public void a(ContentRecord contentRecord, int i) {
        StringBuilder sb;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onAppointFailed, contentRecord is null.");
                return;
            }
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("94");
            bVarA.a(contentRecord.f());
            bVarA.o(contentRecord.n());
            bVarA.p(contentRecord.o());
            bVarA.H(contentRecord.p());
            bVarA.c(i);
            bVarA.al(contentRecord.af());
            new pc(this.f18255a, sw.a(this.f18255a, contentRecord.f())).b(bVarA, false, false);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onAppointSuccess RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onAppointSuccess Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(ContentRecord contentRecord) {
        a("115", contentRecord, (String) null);
    }

    public void a(int i, int i2, ContentRecord contentRecord) {
        String str;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onDownloadClick, contentRecord is null");
                return;
            }
            String strN = contentRecord.n();
            String strO = contentRecord.o();
            int iF = contentRecord.f();
            b bVarA = a(contentRecord.ao());
            if (bVarA == null) {
                return;
            }
            bVarA.ak("14");
            bVarA.o(strN);
            bVarA.p(strO);
            bVarA.a(iF);
            bVarA.r(bk.b(new TouchPoint(i, i2, contentRecord.p())));
            pc pcVar = new pc(this.f18255a, sw.a(this.f18255a, iF));
            pcVar.a(contentRecord);
            pcVar.b(bVarA, false, true);
        } catch (RuntimeException unused) {
            str = "onDownloadClick RuntimeException";
            hw.c("BaseAnalysisReport", str);
        } catch (Exception unused2) {
            str = "onDownloadClick Exception";
            hw.c("BaseAnalysisReport", str);
        }
    }

    private String e(String str) {
        ParamFromServer paramFromServer;
        if (dg.b(str) || (paramFromServer = (ParamFromServer) bk.b(str, ParamFromServer.class, new Class[0])) == null) {
            return null;
        }
        return dg.i(paramFromServer.a(), "||");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 int, still in use, count: 1, list:
      (r1v0 int) from 0x0011: IF  (r1v0 int) != (48718 int)  -> B:7:0x0013 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    private boolean c(String str) {
        byte b2;
        if (str == null) {
            return false;
        }
        str.hashCode();
        if (str.hashCode() != 48718) {
            switch (str) {
                case "127":
                    b2 = 0;
                    break;
                case "128":
                    b2 = 1;
                    break;
                case "129":
                    b2 = 2;
                    break;
                default:
                    b2 = -1;
                    break;
            }
        } else if (str.equals("130")) {
            b2 = 3;
        } else {
            b2 = -1;
        }
        return b2 == 0 || b2 == 1 || b2 == 2 || b2 == 3;
    }

    private void a(String str, ContentRecord contentRecord, String str2) {
        String str3;
        try {
            hw.b("BaseAnalysisReport", "report dialog action:" + str);
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "reportDialogActionEvent, contentRecord is null");
                return;
            }
            b bVarA = a(contentRecord.ao());
            if (bVarA == null) {
                return;
            }
            bVarA.ak(str);
            bVarA.o(contentRecord.n());
            bVarA.p(contentRecord.o());
            bVarA.a(contentRecord.f());
            if (!TextUtils.isEmpty(str2)) {
                bVarA.r(str2);
            }
            pc pcVar = new pc(this.f18255a, sw.a(this.f18255a, contentRecord.f()));
            pcVar.a(contentRecord);
            pcVar.b(bVarA, false, true);
        } catch (RuntimeException unused) {
            str3 = "reportDialogActionEvent RuntimeException";
            hw.c("BaseAnalysisReport", str3);
        } catch (Exception unused2) {
            str3 = "reportDialogActionEvent Exception";
            hw.c("BaseAnalysisReport", str3);
        }
    }

    public i(Context context) {
        super(context);
    }
}
