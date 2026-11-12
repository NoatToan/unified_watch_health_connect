package com.huawei.openalliance.ad.analysis;

import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.hms.ads.VideoConfiguration;
import com.huawei.openalliance.ad.beans.inner.ApiStatisticsReq;
import com.huawei.openalliance.ad.beans.inner.ContentFilterParam;
import com.huawei.openalliance.ad.beans.inner.FenceData;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.beans.metadata.v3.MotionData;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MzImpCannotReportInfo;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.cv;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.EventRecord;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gr;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.im;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.IAd;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.data.ShakeClickReportInfo;
import com.huawei.openalliance.ad.inter.data.SwipeClickReportInfo;
import com.huawei.openalliance.ad.inter.data.j;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.pc;
import com.huawei.openalliance.ad.sn;
import com.huawei.openalliance.ad.sp;
import com.huawei.openalliance.ad.sw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.l;
import com.huawei.openalliance.ad.utils.o;
import com.huawei.openalliance.ad.utils.q;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import defpackage.axg;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class c extends f implements cv {
    public void e(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("166");
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, true, false);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "onNotifyReward ex: %s", th.getClass().getSimpleName());
        }
    }

    public void d(ContentRecord contentRecord, String str) {
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("2100094");
            bVarF.al(str);
            hw.a("BaseAnalysisReport", "ExceptionType is %s, reportMinipageActionFailed, %s", bVarF.aN(), bVarF.aP());
            pc pcVar = new pc(this.f18255a, new sp(this.f18255a));
            pcVar.a(contentRecord);
            pcVar.b(bVarF, false, true);
        } catch (Exception e) {
            hw.d("BaseAnalysisReport", "reportMinipageActionFailed exception : %s", e.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void d(ContentRecord contentRecord, int i) {
        if (contentRecord == null) {
            return;
        }
        try {
            hw.a("BaseAnalysisReport", "on preload hit report: %d", Integer.valueOf(i));
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("177");
            bVarF.al(String.valueOf(i));
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, false, false);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "onPreloadHitReport ex: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void d(ContentRecord contentRecord) {
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onSplashIconShow, contentRecord is null.");
                return;
            }
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("137");
            bVarA.s(contentRecord.ai());
            bVarA.a(contentRecord.f());
            bVarA.o(contentRecord.n());
            bVarA.p(contentRecord.o());
            bVarA.H(contentRecord.p());
            new pc(this.f18255a, sw.a(this.f18255a, contentRecord.f())).b(bVarA, false, false);
        } catch (Exception e) {
            hw.c("BaseAnalysisReport", "onSplashIconShow Exception:" + e.getClass().getSimpleName());
        }
    }

    public void c(String str, ContentRecord contentRecord) {
        if (dg.b(str) || contentRecord == null) {
            return;
        }
        try {
            b bVarA = a(contentRecord, true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("2100047");
            bVarA.am(str);
            if (contentRecord.ag() != null) {
                bVarA.an(contentRecord.ag().getPackageName());
            }
            hw.a("BaseAnalysisReport", "onLandInterceptionUrl onAnalysis, infoPackageName: %s", str);
            new pc(this.f18255a, sw.a(this.f18255a, contentRecord.f())).b(bVarA, false, true);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "onLandInterceptionUrl:" + th.getClass().getSimpleName());
        }
    }

    public void c(String str) {
        try {
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("2100088");
            bVarA.al(str);
            hw.a("BaseAnalysisReport", "ExceptionType is %s, reportRequestDiscard, %s", bVarA.aN(), bVarA.aP());
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarA, true, true);
        } catch (Exception e) {
            hw.d("BaseAnalysisReport", "reportRequestDiscard exception : %s", e.getClass().getSimpleName());
        }
    }

    public void c(ContentRecord contentRecord, String str) {
        if (contentRecord != null) {
            try {
                if (dg.b(str)) {
                    return;
                }
                b bVarF = f(contentRecord);
                bVarF.ak("2100070");
                bVarF.al(this.f18255a.getPackageName());
                bVarF.am(str);
                hw.a("BaseAnalysisReport", "ExceptionType is %s, pkg is %s, eventType is %s", "2100070", bVarF.aP(), bVarF.aQ());
                pc pcVar = new pc(this.f18255a, new sp(this.f18255a));
                pcVar.a(contentRecord);
                pcVar.b(bVarF, false, true);
            } catch (Exception e) {
                hw.c("BaseAnalysisReport", "onEventNotInThirdMonitor error : %s", e.getClass().getSimpleName());
            }
        }
    }

    public void c(ContentRecord contentRecord, int i) {
        if (contentRecord == null) {
            return;
        }
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("175");
            bVarF.al(String.valueOf(i));
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, false, false);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "OnlinePlayInCacheMode ex: %s", th.getClass().getSimpleName());
        }
    }

    public void c(ContentRecord contentRecord) {
        StringBuilder sb;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onImageNotPreDownloadInNonWifi, contentRecord is null");
                return;
            }
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("2100032");
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, false, true);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onImageNotPreDownloadInNonWifi RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onImageNotPreDownloadInNonWifi Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void c(long j, long j2, String str) {
        try {
            hw.a("BaseAnalysisReport", "reportLandingPageLoadTiming start");
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            String strM = dg.m(str);
            int i = (fp.b(this.f18255a).cQ().contains(strM) && fp.b(this.f18255a).cP()) ? 1 : 0;
            bVarA.ak("2100100");
            bVarA.al(strM);
            bVarA.am(String.valueOf(i));
            bVarA.d(j2 - j);
            hw.a("BaseAnalysisReport", "ExceptionType is %s, reportLandingPageLoadTiming: %s, host: %s, flag: %s", "2100100", Long.valueOf(bVarA.aZ()), dg.h(bVarA.aP()), Integer.valueOf(i));
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarA, false, true);
        } catch (Exception e) {
            hw.d("BaseAnalysisReport", "reportLandingPageLoadTiming exception : %s", e.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void b(String str, String str2, String str3) {
        try {
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            bVarA.ak("2100052");
            bVarA.al(str);
            bVarA.am(str2);
            bVarA.an(str3);
            hw.a("BaseAnalysisReport", "reportRecentPlayedGameResult, queryTime: %s, queryResult: %s, resultInfo: %s.", str, str2, str3);
            new pc(this.f18255a, sw.a(this.f18255a, -1)).b(bVarA, false, true);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "reportRecentPlayedGameResult err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void b(String str, String str2, ContentRecord contentRecord) {
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.s(contentRecord.ai());
            bVarF.ak("2100027");
            bVarF.al(str);
            bVarF.am(str2);
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarF, false, true);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "reportTaskException err: %s.", th.getClass().getSimpleName());
        }
    }

    public void b(String str, ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("2100009");
            bVarF.am(str);
            bVarF.an(this.f18255a.getPackageName());
            bVarF.ap("FAT_SDK");
            bVarF.p(contentRecord.o());
            bVarF.H(contentRecord.p());
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarF, false, true);
            if (hw.a()) {
                hw.a("BaseAnalysisReport", "ExceptionType is %s, reportJumpFastApp, appName is %s.", "2100009", str);
            }
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "reportJumpFastApp:" + th.getClass().getSimpleName());
        }
    }

    public void b(String str, int i, String str2, String str3, long j) {
        StringBuilder sb;
        try {
            hw.a("BaseAnalysisReport", "onExLinkedShow");
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("84");
            bVarA.a(i);
            bVarA.i(str);
            bVarA.o(str2);
            bVarA.p(str3);
            bVarA.d(j);
            new pc(this.f18255a, sw.a(this.f18255a, i)).b(bVarA, false, false);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onExLinkedShow RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onExLinkedShow Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void b(String str) {
        try {
            b bVarD = d(str);
            if (bVarD == null) {
                return;
            }
            bVarD.ak("2100085");
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarD, false, true);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "reportBlockAd err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void b(ContentRecord contentRecord, String str, String str2) {
        String str3;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onMagazineReportExtraData, contentRecord is null");
                return;
            }
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            bVarA.ak("178");
            b bVarA2 = a(bVarA, contentRecord);
            bVarA2.al(str);
            bVarA2.am(str2);
            hw.a("BaseAnalysisReport", "report [TYPE_MAGAZINE_ADDITION_DATA_REPORT],contentId: %s, exception: exception_%s,additionInfo: %s, extraStr1: %s, extraStr2: %s", contentRecord.o(), bVarA2.aN(), bVarA2.r(), bVarA2.aP(), bVarA2.aQ());
            new pc(this.f18255a, sw.a(this.f18255a, bVarA2.t().intValue()), contentRecord).b(bVarA2, false, true);
        } catch (RuntimeException unused) {
            str3 = "onMagazineReportExtraData RuntimeException";
            hw.c("BaseAnalysisReport", str3);
        } catch (Exception unused2) {
            str3 = "onMagazineReportExtraData Exception";
            hw.c("BaseAnalysisReport", str3);
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void b(ContentRecord contentRecord, String str) {
        if (contentRecord == null) {
            return;
        }
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("170");
            bVarF.al(str);
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, false, false);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "onRecallReport ex: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void b(ContentRecord contentRecord, int i) {
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onSplashIconNotCached, contentRecord is null.");
                return;
            }
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("140");
            bVarA.s(contentRecord.ai());
            if (contentRecord.bs() != null) {
                bVarA.aj(contentRecord.bs());
            }
            bVarA.a(contentRecord.f());
            bVarA.o(contentRecord.n());
            bVarA.p(contentRecord.o());
            bVarA.H(contentRecord.p());
            bVarA.c(i);
            new pc(this.f18255a, sw.a(this.f18255a, contentRecord.f())).b(bVarA, false, false);
        } catch (Exception e) {
            hw.c("BaseAnalysisReport", "onSplashIconNotCached Exception:" + e.getClass().getSimpleName());
        }
    }

    public void b(ContentRecord contentRecord) {
        StringBuilder sb;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onVideoNotDownloadInNonWifi, contentRecord is null");
                return;
            }
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("121");
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, false, true);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onVideoNotDownloadInNonWifi RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onVideoNotDownloadInNonWifi Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void b(long j, long j2, String str) {
        try {
            hw.a("BaseAnalysisReport", "reportPreloadHostTime start");
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            String strM = dg.m(str);
            bVarA.ak("2100099");
            bVarA.al(strM);
            bVarA.d(j2 - j);
            hw.a("BaseAnalysisReport", "ExceptionType is %s, reportPreloadHostTime: %s, host: %s", "2100099", Long.valueOf(bVarA.aZ()), dg.h(bVarA.aP()));
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarA, false, true);
        } catch (Exception e) {
            hw.d("BaseAnalysisReport", "reportPreloadHostTime exception : %s", e.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(boolean z, FenceData fenceData) {
        try {
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            hw.a("BaseAnalysisReport", "reportFenceData, fence: %s", Boolean.valueOf(z));
            bVarA.ak("2100071");
            bVarA.al(cc.a(this.f18255a).l() ? "1" : "0");
            bVarA.am(z ? "1" : "0");
            bVarA.an(String.valueOf(Settings.Global.getInt(this.f18255a.getContentResolver(), Constants.IS_GEO_FENCE, 0)));
            bVarA.ao(String.valueOf(Settings.Global.getInt(this.f18255a.getContentResolver(), Constants.IS_BRAND_FENCE, 0)));
            bVarA.ap(String.valueOf(fp.b(this.f18255a).aE()));
            bVarA.aq(fp.b(this.f18255a).cO() ? "1" : "0");
            bVarA.ar(Settings.Global.getString(this.f18255a.getContentResolver(), Constants.FENCE_COUNTRY_CODE));
            if (fenceData != null) {
                bVarA.as(fenceData.a());
            }
            new pc(this.f18255a, sw.a(this.f18255a, -1)).b(bVarA, false, false);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "reportFenceData err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(List<ContentRecord> list) {
        if (bm.a(list)) {
            hw.a("BaseAnalysisReport", "recall records empty");
            return;
        }
        int size = list.size();
        hw.b("BaseAnalysisReport", "report client recall, size: %s", Integer.valueOf(size));
        int i = 0;
        while (i < size) {
            try {
                ContentRecord contentRecord = list.get(i);
                b bVarF = f(contentRecord);
                if (bVarF != null) {
                    bVarF.ak("170");
                    bVarF.al(Constants.EXTRA_CLIENT_RECALL);
                    new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, i == size + (-1), false);
                }
            } catch (Throwable th) {
                hw.c("BaseAnalysisReport", "onRecallContentReport ex: %s", th.getClass().getSimpleName());
            }
            i++;
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(Throwable th) {
        StringBuilder sb;
        try {
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            bVarA.ak("1");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(th.getClass().getSimpleName());
            sb2.append(",");
            sb2.append(th.getMessage());
            sb2.append(",");
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb2.append(stackTraceElement.toString());
                sb2.append(",");
            }
            bVarA.r(sb2.toString());
            bVarA.a(-1);
            new pc(this.f18255a, sw.a(this.f18255a, -1)).b(bVarA, false, true);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onAnalysis RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onAnalysis Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(String str, boolean z, int i, boolean z2, boolean z3, boolean z4) {
        try {
            b bVarD = d(str);
            if (bVarD == null) {
                return;
            }
            bVarD.ak("2100083");
            bVarD.al(z ? "0" : "1");
            bVarD.am(String.valueOf(i));
            bVarD.an(z2 ? "0" : "1");
            bVarD.ao(z3 ? "0" : "1");
            bVarD.ap(z4 ? "0" : "1");
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarD, false, true);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "reportTcfInfo err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(String str, List<String> list, List<String> list2, Map<String, String> map, String str2) {
        try {
            b bVarA = a(str, true);
            bVarA.s(str2);
            bVarA.ak("2100006");
            bVarA.al(dg.a(list, ","));
            bVarA.am(dg.a(list2, ","));
            bVarA.an(q.a(bk.b(map).getBytes("UTF-8")));
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarA, false, false);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "onTagReport ex: %s", th.getClass().getSimpleName());
        }
    }

    public void a(String str, String str2, boolean z) {
        String str3;
        try {
            hw.a("BaseAnalysisReport", "onDownloadImg, contentId:" + str2 + ", succ:" + z);
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            bVarA.ak("10");
            bVarA.r("download success:" + z);
            bVarA.p(str2);
            bVarA.o(str);
            bVarA.a(2);
            bVarA.al(z ? "1" : "0");
            hw.a("BaseAnalysisReport", "report [TYPE_DOWNLOAD_IMG],contentId: %s, exception: exception_%s,additionInfo: %s, extraStr1: %s", str2, bVarA.aN(), bVarA.r(), bVarA.aP());
            new pc(this.f18255a, sw.a(this.f18255a, bVarA.t().intValue())).b(bVarA, true, false);
        } catch (RuntimeException unused) {
            str3 = "onDownloadImg RuntimeException";
            hw.c("BaseAnalysisReport", str3);
        } catch (Exception unused2) {
            str3 = "onException Exception";
            hw.c("BaseAnalysisReport", str3);
        }
    }

    public void a(String str, String str2, String str3, String str4, long j, ContentRecord contentRecord) {
        StringBuilder sb;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onUploadThirdPartyEventFail, contentRecord is null");
                return;
            }
            b bVarA = a(true, contentRecord.ao());
            if (bVarA == null) {
                return;
            }
            String strN = contentRecord.n();
            String strO = contentRecord.o();
            int iF = contentRecord.f();
            bVarA.o(strN);
            bVarA.p(strO);
            bVarA.a(iF);
            bVarA.ak("9");
            bVarA.w(str3);
            bVarA.v(new URL(str2).getHost());
            bVarA.s(str4);
            if (contentRecord.bs() != null) {
                bVarA.aj(contentRecord.bs());
            }
            bVarA.c(j);
            bVarA.al(str);
            new pc(this.f18255a, sw.a(this.f18255a, iF)).a(bVarA, true, false);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onUploadThirdPartyEventFail RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onUploadThirdPartyEventFail Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(String str, String str2, String str3, AdLandingPageData adLandingPageData) {
        StringBuilder sb;
        try {
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            bVarA.ak("22");
            bVarA.r(str3);
            bVarA.w(str2);
            bVarA.q(str);
            b bVarA2 = a(bVarA, adLandingPageData);
            new pc(this.f18255a, sw.a(this.f18255a, bVarA2.t().intValue())).b(bVarA2, false, true);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onLandPageOpenFail RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onLandPageOpenFail Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(String str, String str2, String str3, long j, ContentRecord contentRecord) {
        StringBuilder sb;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onUploadThirdPartyEventSuccess, contentRecord is null");
                return;
            }
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("19");
            bVarF.v(new URL(str2).getHost());
            bVarF.s(str3);
            if (contentRecord.bs() != null) {
                bVarF.aj(contentRecord.bs());
            }
            bVarF.c(j);
            bVarF.al(str);
            bVarF.p(contentRecord.o());
            bVarF.H(contentRecord.p());
            new pc(this.f18255a, sw.a(this.f18255a, contentRecord.f())).a(bVarF, true, true);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onUploadThirdPartyEventSuccess RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onUploadThirdPartyEventSuccess Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(String str, String str2, String str3) {
        try {
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            bVarA.ak("2100049");
            bVarA.al(str);
            bVarA.am(str2);
            bVarA.an(str3);
            hw.a("BaseAnalysisReport", "reportDslZipSha256CheckResult onAnalysis, checkResult: %s, dslVersion: %s, failReason: %s", str, str2, str3);
            new pc(this.f18255a, sw.a(this.f18255a, -1)).b(bVarA, false, true);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "reportDslZipSha256CheckResult: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(String str, String str2, ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("2100013");
            bVarF.al(str);
            bVarF.am(str2);
            bVarF.an(contentRecord.aP());
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarF, false, true);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "loadInterstitialTemplate err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(String str, String str2, DelayInfo delayInfo, int i, int i2) {
        ApiStatisticsReq apiStatisticsReq = new ApiStatisticsReq();
        apiStatisticsReq.b(str);
        apiStatisticsReq.d(str2);
        apiStatisticsReq.a(delayInfo);
        apiStatisticsReq.b(i2);
        apiStatisticsReq.c(i);
        if (delayInfo != null && delayInfo.F() != null) {
            apiStatisticsReq.d(delayInfo.F().intValue());
        }
        a(apiStatisticsReq);
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(String str, Integer num, String str2, ContentRecord contentRecord, boolean z) {
        StringBuilder sb;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onAdEventFilter, contentRecord is null.");
                return;
            }
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("99");
            int iF = contentRecord.f();
            bVarA.a(iF);
            bVarA.p(contentRecord.o());
            bVarA.s(contentRecord.ai());
            if (contentRecord.bs() != null) {
                bVarA.aj(contentRecord.bs());
            }
            bVarA.d(contentRecord.ao());
            bVarA.al(str);
            if (num != null) {
                bVarA.am(num.toString());
            }
            bVarA.an(str2);
            bVarA.ao(contentRecord.l());
            bVarA.b(z ? 1 : 0);
            if (hw.a()) {
                hw.a("BaseAnalysisReport", "filterEvent eventType: %s, result: %s", str, Integer.valueOf(bVarA.D()));
            }
            new pc(this.f18255a, sw.a(this.f18255a, iF)).b(bVarA, false, true);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onAdEventFilter RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onAdEventFilter Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(String str, ContentRecord contentRecord, boolean z) {
        StringBuilder sb;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onAdEventAddToCache, contentRecord is null.");
                return;
            }
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("100");
            int iF = contentRecord.f();
            bVarA.a(iF);
            bVarA.p(contentRecord.o());
            bVarA.s(contentRecord.ai());
            if (contentRecord.bs() != null) {
                bVarA.aj(contentRecord.bs());
            }
            bVarA.d(contentRecord.ao());
            bVarA.al(str);
            bVarA.ao(contentRecord.l());
            bVarA.b(z ? 1 : 0);
            if (hw.a()) {
                hw.a("BaseAnalysisReport", "cacheEvent, eventType: %s, result: %s", str, Integer.valueOf(bVarA.D()));
            }
            new pc(this.f18255a, sw.a(this.f18255a, iF)).b(bVarA, false, true);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onAdEventAddToCache RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onAdEventAddToCache Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(String str, ContentRecord contentRecord, String str2, String str3, String str4) {
        try {
            if (dg.b(str)) {
                return;
            }
            b bVarF = f(contentRecord);
            bVarF.ak(str);
            bVarF.al(str3);
            bVarF.am(str4);
            bVarF.an(str2);
            hw.b("BaseAnalysisReport", "onIntentActionFail, type: %s, msg: %s, promotePkgName: %s, activity: %s", str, str2, str3, str4);
            pc pcVar = new pc(this.f18255a, new sp(this.f18255a));
            pcVar.a(contentRecord);
            pcVar.b(bVarF, false, true);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "onIntentActionFail ex: %s", th.getClass().getSimpleName());
        }
    }

    public void a(String str, ContentRecord contentRecord, int i, String str2, String str3) {
        StringBuilder sb;
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("88");
            bVarF.B(str2);
            bVarF.r(str3);
            bVarF.c(i);
            bVarF.al(com.huawei.openalliance.ad.utils.d.m(this.f18255a));
            bVarF.am(com.huawei.openalliance.ad.utils.d.n(this.f18255a));
            bVarF.an(str);
            if (hw.a()) {
                hw.a("BaseAnalysisReport", "onAgApiCalled additionInfo: %s apiName: %s, statusCode: %s, exception: %s, trackVersion: %s", str3, str2, Integer.valueOf(i), "88", bVarF.aI());
            }
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, false, false);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onAgApiCalled RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onAgApiCalled Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(String str, ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("2100003");
            bVarF.al(str);
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarF, false, false);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "onShareClickReport ex: %s", th.getClass().getSimpleName());
        }
    }

    public void a(String str, ApiStatisticsReq apiStatisticsReq) {
        StringBuilder sb;
        try {
            if (apiStatisticsReq == null) {
                hw.c("BaseAnalysisReport", "onApiStatisticsReport, apiStatisticsReq is null ");
                return;
            }
            b bVarA = a(str, true);
            if (bVarA == null) {
                return;
            }
            bVarA.d(apiStatisticsReq.l());
            a(bVarA, apiStatisticsReq);
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

    public void a(String str, b bVar) {
        try {
            b bVarA = a("", true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("2100002");
            bVarA.al(bVar.aP());
            bVarA.am(bVar.aQ());
            bVarA.an(bVar.aR());
            bVarA.ao(bVar.aS());
            bVarA.ap(bVar.aT());
            bVarA.aq(bVar.aU());
            bVarA.ar(bVar.aV());
            bVarA.as(bVar.aW());
            bVarA.at(bVar.aX());
            hw.a("BaseAnalysisReport", "remaining app data: %s", bVar.aR());
            new pc(this.f18255a, new sp(this.f18255a)).a(bVarA);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "onCacheRecordCollected ex: %s", th.getClass().getSimpleName());
        }
    }

    public void a(String str, Context context, ContentRecord contentRecord, String str2) {
        if (contentRecord == null) {
            return;
        }
        try {
            b bVarD = d(str);
            bVarD.H(contentRecord.p());
            bVarD.o(contentRecord.n());
            bVarD.p(contentRecord.o());
            bVarD.ak(str2);
            hw.a("AnalysisReport", "ExceptionType is %s, ContentId is %s, SlotId is %s, TaskId is %s", str2, contentRecord.o(), contentRecord.n(), contentRecord.p());
            new pc(context, sw.a(context, contentRecord.f())).b(bVarD, false, false);
        } catch (Throwable th) {
            hw.d("BaseAnalysisReport", "report onAnalysis error, type: %s, reportPlayable: %s", str2, th.getClass().getSimpleName());
        }
    }

    public void a(String str, long j, String str2, String str3, int i) {
        String str4;
        try {
            hw.b("BaseAnalysisReport", "onAidlCalledResult:" + str);
            if (TextUtils.isEmpty(str)) {
                hw.c("BaseAnalysisReport", "onAidlCalledResult, exceptionType is null");
                return;
            }
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            bVarA.ak(str);
            bVarA.c(j);
            bVarA.w(str2);
            bVarA.r(str3);
            bVarA.y(com.huawei.openalliance.ad.utils.d.l(this.f18255a));
            bVarA.a(i);
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarA, false, true);
        } catch (RuntimeException unused) {
            str4 = "onAidlCalledResult RuntimeException";
            hw.c("BaseAnalysisReport", str4);
        } catch (Exception unused2) {
            str4 = "onAidlCalledResult Exception";
            hw.c("BaseAnalysisReport", str4);
        }
    }

    public void a(String str, long j, String str2, String str3) {
        try {
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("2100050");
            bVarA.al(str);
            bVarA.am(String.valueOf(j));
            bVarA.an(str2);
            bVarA.ap(str3);
            hw.a("BaseAnalysisReport", "reportFirstWakeupResult onAnalysis, checkMap: %s, duration: %s, resultList: %s", str, Long.valueOf(j), str2);
            new pc(this.f18255a, sw.a(this.f18255a, -1)).b(bVarA, false, true);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "reportFirstWakeupResult error : %s", th.getClass().getSimpleName());
        }
    }

    public void a(String str, long j) {
        try {
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("143");
            bVarA.al(String.valueOf(j));
            bVarA.an(str);
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarA, false, false);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "onDbSizeReport ex: %s", th.getClass().getSimpleName());
        }
    }

    public void a(String str, int i, String str2, String str3, String str4, boolean z) {
        StringBuilder sb;
        try {
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("101");
            bVarA.a(i);
            bVarA.p(str4);
            bVarA.al(str);
            bVarA.s(str2);
            bVarA.ao(str3);
            bVarA.b(z ? 1 : 0);
            if (hw.a()) {
                hw.a("BaseAnalysisReport", "rptEvent, eventType: %s, result: %s", str, Integer.valueOf(bVarA.D()));
            }
            new pc(this.f18255a, sw.a(this.f18255a, i)).b(bVarA, false, true);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onAdEventUpload RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onAdEventUpload Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(String str, int i, String str2, String str3, long j) {
        StringBuilder sb;
        try {
            hw.a("BaseAnalysisReport", "onExLinkedOvertime");
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("83");
            bVarA.a(i);
            bVarA.i(str);
            bVarA.o(str2);
            bVarA.p(str3);
            bVarA.d(j);
            new pc(this.f18255a, sw.a(this.f18255a, i)).b(bVarA, false, false);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onExLinkedOvertime RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onExLinkedOvertime Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(String str, int i, String str2, String str3) {
        StringBuilder sb;
        try {
            hw.a("BaseAnalysisReport", "onExLinkedNotShow");
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("82");
            bVarA.a(i);
            bVarA.i(str);
            bVarA.o(str2);
            bVarA.p(str3);
            new pc(this.f18255a, sw.a(this.f18255a, i)).b(bVarA, false, false);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onExLinkedNotShow RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onExLinkedNotShow Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(String str, int i, String str2, ContentRecord contentRecord, boolean z) {
        StringBuilder sb;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onImageLoadFailed, contentRecord is null");
                return;
            }
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("104");
            bVarF.q(str);
            bVarF.c(i);
            bVarF.r(str2);
            bVarF.al(str2);
            bVarF.am("normal");
            bVarF.an(String.valueOf(z));
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, false, false);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onImageLoadFailed RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onImageLoadFailed Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(String str, int i, ContentRecord contentRecord) {
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.s(contentRecord.ai());
            bVarF.ak("2100026");
            bVarF.al(str);
            bVarF.am(dg.a(Integer.valueOf(i)));
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarF, false, true);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "reportNoMzUrl err: %s.", th.getClass().getSimpleName());
        }
    }

    public void a(String str, int i, int i2, ContentRecord contentRecord) {
        String str2;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onPlacementPlayError, contentRecord is null");
                return;
            }
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            bVarA.ak("11");
            b bVarA2 = a(bVarA, contentRecord);
            bVarA2.q(str);
            bVarA2.r("errorcode:" + i + ", extra:" + i2);
            new pc(this.f18255a, sw.a(this.f18255a, bVarA2.t().intValue()), contentRecord).b(bVarA2, false, true);
        } catch (RuntimeException unused) {
            str2 = "onPlacementPlayError RuntimeException";
            hw.c("BaseAnalysisReport", str2);
        } catch (Exception unused2) {
            str2 = "onPlacementPlayError Exception";
            hw.c("BaseAnalysisReport", str2);
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(final String str, final int i, final int i2, final int i3, final String str2) {
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.analysis.c.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    c cVar = c.this;
                    b bVarA = cVar.a(cVar.f18255a.getPackageName(), true);
                    bVarA.ak(str2);
                    bVarA.al(String.valueOf(str));
                    bVarA.am(String.valueOf(i));
                    bVarA.an(String.valueOf(i2));
                    bVarA.ao(String.valueOf(i3));
                    if (hw.a()) {
                        hw.a("BaseAnalysisReport", "update database name is %s, exception type is %s, oldVersion is %s, newVersion is %s, upgradeFlag is %s", str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
                    }
                    new pc(c.this.f18255a, new sp(c.this.f18255a)).b(bVarA, false, false);
                } catch (Throwable th) {
                    hw.c("BaseAnalysisReport", "update database exception: %s", th.getClass().getSimpleName());
                }
            }
        });
    }

    public void a(String str, int i, int i2) {
        try {
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            bVarA.ak("2100053");
            bVarA.o(str);
            bVarA.am(String.valueOf(i));
            bVarA.an(String.valueOf(i2));
            hw.a("BaseAnalysisReport", "reportSingleSlotShowMultiFail onAnalysis, slotId: %s, adCount: %s, templateAdCount: %s", str, Integer.valueOf(i), Integer.valueOf(i2));
            new pc(this.f18255a, sw.a(this.f18255a, -1)).b(bVarA, true, false);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "reportSingleSlotShowMultiFail error : %s", th.getClass().getSimpleName());
        }
    }

    public void a(String str, int i) {
        StringBuilder sb;
        try {
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.a(i);
            bVarA.ak("85");
            bVarA.o(str);
            new pc(this.f18255a, sw.a(this.f18255a, i)).b(bVarA, false, false);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onSplashDismissForExSplash RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onSplashDismissForExSplash Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(String str) {
        try {
            b bVarD = d(str);
            if (bVarD == null) {
                return;
            }
            bVarD.ak("2100084");
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarD, false, true);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "reportTcfNpa err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(final com.huawei.openalliance.ad.utils.dcservice.c cVar, final String str) {
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.analysis.c.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    c cVar2 = c.this;
                    b bVarD = cVar2.d(cVar2.f18255a.getPackageName());
                    bVarD.ak("180");
                    bVarD.H(cVar.e());
                    bVarD.p(cVar.b());
                    bVarD.a(cVar.a());
                    bVarD.al(cVar.f());
                    bVarD.am(cVar.g());
                    bVarD.an(str);
                    hw.c("BaseAnalysisReport", "start activity error %s", str);
                    new pc(c.this.f18255a, new sp(c.this.f18255a)).b(bVarD, false, false);
                } catch (Throwable th) {
                    hw.c("BaseAnalysisReport", "onStartActivityException ex: %s", th.getClass().getSimpleName());
                }
            }
        });
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(sn snVar) {
        String str;
        if (snVar != null) {
            try {
                if (snVar.l() == null) {
                    str = "reportNetHandlerDownloadSourceFail, params invalid";
                } else {
                    ContentRecord contentRecordL = snVar.l();
                    b bVarF = f(contentRecordL);
                    if (bVarF != null) {
                        bVarF.ak("2100030");
                        hw.b("BaseAnalysisReport", "fail to download Source, failReason: %s", snVar.c());
                        bVarF.c(snVar.b().intValue());
                        bVarF.w(snVar.c());
                        bVarF.al(snVar.i());
                        bVarF.am(snVar.e());
                        bVarF.d(System.currentTimeMillis());
                        new pc(this.f18255a, sw.a(this.f18255a, contentRecordL.f()), contentRecordL).b(bVarF, false, false);
                        return;
                    }
                    str = "reportNetHandlerDownloadSourceFail, AnalysisInfo is null";
                }
            } catch (Throwable th) {
                hw.c("BaseAnalysisReport", "reportNetHandlerDownloadSourceFail err: %s.", th.getClass().getSimpleName());
                return;
            }
        } else {
            str = "reportNetHandlerDownloadSourceFail, params invalid";
        }
        hw.b("BaseAnalysisReport", str);
    }

    public void a(com.huawei.openalliance.ad.processor.eventbeans.b bVar, ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("2100004");
            bVarF.al(bVar.b());
            bVarF.am(bk.b(bVar));
            MaterialClickInfo materialClickInfoH = bVar.h();
            if (materialClickInfoH != null && materialClickInfoH.k() != null && materialClickInfoH.l() != null) {
                bVarF.c(materialClickInfoH.k().longValue() - materialClickInfoH.l().longValue());
            }
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, false, false);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "onInvlidClickReport ex: %s", th.getClass().getSimpleName());
        }
    }

    public void a(AdLandingPageData adLandingPageData, String str) {
        String str2;
        try {
            if (adLandingPageData == null) {
                hw.c("BaseAnalysisReport", "onLandingUrlOverride, data is null");
                return;
            }
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            bVarA.ak("60");
            b bVarA2 = a(bVarA, adLandingPageData);
            bVarA2.al(str);
            new pc(this.f18255a, sw.a(this.f18255a, adLandingPageData.getAdType())).b(bVarA2, false, true);
        } catch (RuntimeException unused) {
            str2 = "onLandingUrlOverrideError RuntimeException";
            hw.c("BaseAnalysisReport", str2);
        } catch (Exception unused2) {
            str2 = "onLandingUrlOverrideError Exception";
            hw.c("BaseAnalysisReport", str2);
        }
    }

    public void a(AdLandingPageData adLandingPageData) {
        String str;
        try {
            if (adLandingPageData == null) {
                hw.c("BaseAnalysisReport", "onLandingPageBlocked, data is null");
                return;
            }
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            bVarA.ak(HealthZonePushReceiver.BODY_TEMPERATURE_HIGH_NOTIFY);
            new pc(this.f18255a, sw.a(this.f18255a, adLandingPageData.getAdType())).b(a(bVarA, adLandingPageData), false, true);
        } catch (RuntimeException unused) {
            str = "onPlacementPlayError RuntimeException";
            hw.c("BaseAnalysisReport", str);
        } catch (Exception unused2) {
            str = "onPlacementPlayError Exception";
            hw.c("BaseAnalysisReport", str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014 A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:4:0x0005, B:6:0x000b, B:10:0x001b, B:12:0x0022, B:13:0x0034, B:15:0x0060, B:17:0x0066, B:18:0x006d, B:7:0x0014), top: B:23:0x0005 }] */
    public void a(AppDownloadTask appDownloadTask, String str, CallResult callResult) {
        b bVarF;
        if (appDownloadTask != null) {
            try {
                if (appDownloadTask.S() != null) {
                    bVarF = f(appDownloadTask.S());
                } else {
                    bVarF = a(true);
                }
            } catch (Exception e) {
                hw.d("BaseAnalysisReport", "reportAddAgTaskFailed exception : %s", e.getClass().getSimpleName());
                return;
            }
        } else {
            bVarF = a(true);
        }
        if (bVarF == null) {
            return;
        }
        bVarF.ak("2100096");
        if (callResult != null) {
            bVarF.al(callResult.getMsg());
            bVarF.am(String.valueOf(callResult.getCode()));
        }
        bVarF.an(str);
        hw.a("BaseAnalysisReport", "ExceptionType is %s, reportAddAgTaskFailed, extras: %s, %s, %s", bVarF.aN(), bVarF.aP(), bVarF.aQ(), bVarF.aR());
        pc pcVar = new pc(this.f18255a, new sp(this.f18255a));
        if (appDownloadTask != null && appDownloadTask.S() != null) {
            pcVar.a(appDownloadTask.S());
        }
        pcVar.b(bVarF, false, true);
    }

    public void a(ContentRecord contentRecord, boolean z, String str) {
        try {
            if (contentRecord == null) {
                hw.a("BaseAnalysisReport", "reportShowOpenAppDialog return, contentRecord is empty");
                return;
            }
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("2100097");
            bVarF.al(String.valueOf(z));
            bVarF.am(str);
            hw.a("BaseAnalysisReport", "ExceptionType is %s, reportShowOpenAppDialog, %s, ex: %s", bVarF.aN(), Boolean.valueOf(z), str);
            pc pcVar = new pc(this.f18255a, new sp(this.f18255a));
            pcVar.a(contentRecord);
            pcVar.b(bVarF, false, true);
        } catch (Exception e) {
            hw.d("BaseAnalysisReport", "reportShowOpenAppDialog exception : %s", e.getClass().getSimpleName());
        }
    }

    public void a(ContentRecord contentRecord, Throwable th) {
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("2100095");
            if (th != null) {
                bVarF.al(th.getClass().getSimpleName());
                bVarF.am(th.getMessage());
            }
            hw.a("BaseAnalysisReport", "ExceptionType is %s, reportClickActionException, %s", bVarF.aN(), bVarF.aP());
            pc pcVar = new pc(this.f18255a, new sp(this.f18255a));
            pcVar.a(contentRecord);
            pcVar.b(bVarF, false, true);
        } catch (Exception e) {
            hw.d("BaseAnalysisReport", "reportClickActionException exception : %s", e.getClass().getSimpleName());
        }
    }

    public void a(ContentRecord contentRecord, String str, String str2, String str3) {
        String str4;
        JSONObject jSONObject;
        try {
            hw.b("BaseAnalysisReport", "report read channel info");
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onReadChannelInfo, contentRecord is null");
                return;
            }
            String strN = contentRecord.n();
            String strO = contentRecord.o();
            int iF = contentRecord.f();
            b bVarA = a(contentRecord.ao());
            if (bVarA == null) {
                return;
            }
            bVarA.ak("71");
            bVarA.o(strN);
            bVarA.p(strO);
            bVarA.a(iF);
            bVarA.al(str3);
            bVarA.y(com.huawei.openalliance.ad.utils.d.l(this.f18255a));
            if (!TextUtils.isEmpty(str)) {
                bVarA.r(str);
                try {
                    jSONObject = new JSONObject(dg.e(str));
                } catch (JSONException unused) {
                    hw.c("BaseAnalysisReport", "transfer channel info to json error");
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    bVarA.am(dg.f(jSONObject.optString("channelId")));
                }
            }
            bVarA.an(dg.f(str2));
            pc pcVar = new pc(this.f18255a, sw.a(this.f18255a, iF));
            pcVar.a(contentRecord);
            pcVar.b(bVarA, true, true);
        } catch (RuntimeException unused2) {
            str4 = "onReadChannelInfo RuntimeException";
            hw.c("BaseAnalysisReport", str4);
        } catch (Exception unused3) {
            str4 = "onReadChannelInfo Exception";
            hw.c("BaseAnalysisReport", str4);
        }
    }

    public void a(ContentRecord contentRecord, String str, String str2) {
        String str3;
        try {
            hw.b("BaseAnalysisReport", "report write channel info");
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onWriteChannelInfo, contentRecord is null");
                return;
            }
            String strN = contentRecord.n();
            String strO = contentRecord.o();
            int iF = contentRecord.f();
            b bVarA = a(contentRecord.ao());
            if (bVarA == null) {
                return;
            }
            bVarA.ak(HealthZonePushReceiver.FAMILY_CARE_NOTIFY);
            bVarA.o(strN);
            bVarA.p(strO);
            bVarA.a(iF);
            bVarA.al(str2);
            if (!TextUtils.isEmpty(str)) {
                bVarA.r(str);
            }
            pc pcVar = new pc(this.f18255a, sw.a(this.f18255a, iF));
            pcVar.a(contentRecord);
            pcVar.b(bVarA, true, true);
        } catch (RuntimeException unused) {
            str3 = "reportDialogActionEvent RuntimeException";
            hw.c("BaseAnalysisReport", str3);
        } catch (Exception unused2) {
            str3 = "reportDialogActionEvent Exception";
            hw.c("BaseAnalysisReport", str3);
        }
    }

    public void a(ContentRecord contentRecord, String str, AppDownloadTask appDownloadTask) {
        String str2;
        AppInfo appInfoB;
        if (contentRecord == null) {
            hw.c("BaseAnalysisReport", "onAppInstalled, contentRecord is null ");
            return;
        }
        try {
            b bVarA = a(contentRecord.ao());
            if (bVarA == null) {
                return;
            }
            bVarA.ak("50");
            bVarA.o(contentRecord.n());
            bVarA.p(contentRecord.o());
            bVarA.a(contentRecord.f());
            bVarA.r(String.valueOf(Process.myPid()));
            if (!TextUtils.isEmpty(str)) {
                bVarA.al(str);
            }
            if (appDownloadTask != null && (appInfoB = appDownloadTask.B()) != null) {
                a(appInfoB, appDownloadTask, bVarA, contentRecord);
            }
            pc pcVar = new pc(this.f18255a, sw.a(this.f18255a, contentRecord.f()));
            pcVar.a(contentRecord);
            pcVar.b(bVarA, false, true);
        } catch (RuntimeException unused) {
            str2 = "onAppInstalled RuntimeException";
            hw.c("BaseAnalysisReport", str2);
        } catch (Exception unused2) {
            str2 = "onAppInstalled Exception";
            hw.c("BaseAnalysisReport", str2);
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(ContentRecord contentRecord, String str, a aVar) {
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onFullScreenNotifyAction, contentRecord is null.");
                return;
            }
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            if (hw.a()) {
                hw.a("BaseAnalysisReport", "onFullScreenNotifyAction, extraStr1: %s", str);
            }
            if (aVar != null) {
                if (hw.a()) {
                    hw.a("BaseAnalysisReport", "onFullScreenNotifyAction, extraStr2: %s, extraStr3: %s", aVar.e(), aVar.f());
                }
                bVarA.am(aVar.e());
                bVarA.an(aVar.f());
            }
            bVarA.ak("126");
            bVarA.a(contentRecord.f());
            bVarA.o(contentRecord.n());
            bVarA.p(contentRecord.o());
            bVarA.H(contentRecord.p());
            bVarA.al(str);
            new pc(this.f18255a, sw.a(this.f18255a, contentRecord.f())).b(bVarA, false, false);
        } catch (Exception e) {
            hw.c("BaseAnalysisReport", "onFullScreenNotifyAction Exception:" + e.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(ContentRecord contentRecord, String str) {
        StringBuilder sb;
        try {
            hw.b("BaseAnalysisReport", "onPlacementAdDiscarded: %s", str);
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onPlacementAdDiscarded, contentRecord is null");
                return;
            }
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("2100035");
            bVarF.w(str);
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, false, true);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onPlacementAdDiscarded RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onPlacementAdDiscarded Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(ContentRecord contentRecord, Long l, Integer num) {
        int i;
        if (contentRecord != null) {
            try {
                if (contentRecord.i() == null) {
                    return;
                }
                MetaData metaDataI = contentRecord.i();
                if (a(metaDataI, l, num)) {
                    i = 3;
                } else if (a(metaDataI, l)) {
                    i = 1;
                } else {
                    i = a(metaDataI, num) ? 2 : 0;
                }
                b bVarF = f(contentRecord);
                bVarF.ak("2100074");
                bVarF.al(String.valueOf(i));
                bVarF.am(String.valueOf(metaDataI.i()));
                bVarF.an(String.valueOf(metaDataI.k()));
                bVarF.ao(String.valueOf(l));
                bVarF.ap(String.valueOf(num));
                bVarF.s(contentRecord.ai());
                hw.a("BaseAnalysisReport", "ExceptionType is %s, onSplashImpCannotReportReason is %s, info: %s", "2100074", bVarF.aP(), bk.b(bVarF));
                pc pcVar = new pc(this.f18255a, new sp(this.f18255a));
                pcVar.a(contentRecord);
                pcVar.b(bVarF, false, true);
            } catch (Exception e) {
                hw.d("BaseAnalysisReport", "onSplashImpCannotReport error : %s", e.getClass().getSimpleName());
            }
        }
    }

    public void a(ContentRecord contentRecord, Integer num, Integer num2, Boolean bool, String str) {
        if (contentRecord != null) {
            try {
                if (contentRecord.aV() != null && !bm.a(contentRecord.aV().c())) {
                    b bVarF = f(contentRecord);
                    bVarF.ak("2100077");
                    bVarF.al(String.valueOf(num));
                    bVarF.am(String.valueOf(num2));
                    bVarF.an(String.valueOf(bool));
                    bVarF.ao(str);
                    hw.a("BaseAnalysisReport", "ExceptionType is %s, reportEggShowError code: %s, mediaCode: %s, hasPlayed: %s", "2100077", num, num2, bool);
                    pc pcVar = new pc(this.f18255a, new sp(this.f18255a));
                    pcVar.a(contentRecord);
                    pcVar.b(bVarF, false, true);
                    return;
                }
            } catch (Exception e) {
                hw.d("BaseAnalysisReport", "reportEggShowError exception : %s", e.getClass().getSimpleName());
                return;
            }
        }
        hw.a("BaseAnalysisReport", "reportEggShowError return, motionData is empty");
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(ContentRecord contentRecord, SwipeClickReportInfo swipeClickReportInfo) {
        if (contentRecord == null || swipeClickReportInfo == null) {
            return;
        }
        try {
            b bVarF = f(contentRecord);
            bVarF.ak("2100072");
            bVarF.al(String.valueOf(swipeClickReportInfo.a()));
            bVarF.am(String.valueOf(swipeClickReportInfo.e()));
            bVarF.an(bk.b(swipeClickReportInfo.b()));
            bVarF.ao(String.valueOf(swipeClickReportInfo.g()));
            bVarF.ap(String.valueOf(swipeClickReportInfo.f()));
            bVarF.aq(String.valueOf(swipeClickReportInfo.d()));
            bVarF.ar(String.valueOf(swipeClickReportInfo.h()));
            bVarF.as(String.valueOf(swipeClickReportInfo.i()));
            bVarF.au(String.valueOf(swipeClickReportInfo.c()));
            bVarF.s(contentRecord.ai());
            bVarF.d(1L);
            hw.a("BaseAnalysisReport", "ExceptionType is %s, canReportClick is %s, sld is %s, info: %s", "2100072", bVarF.aP(), bVarF.aQ(), bk.b(bVarF));
            pc pcVar = new pc(this.f18255a, new sp(this.f18255a));
            pcVar.a(contentRecord);
            pcVar.b(bVarF, false, true);
        } catch (Exception e) {
            hw.d("BaseAnalysisReport", "recordSwipeClickInfo error : %s", e.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(ContentRecord contentRecord, ShakeClickReportInfo shakeClickReportInfo) {
        if (contentRecord == null || shakeClickReportInfo == null) {
            return;
        }
        try {
            b bVarF = f(contentRecord);
            bVarF.ak("2100073");
            bVarF.al(String.valueOf(shakeClickReportInfo.g()));
            bVarF.am(String.valueOf(shakeClickReportInfo.j()));
            bVarF.an(bk.b(shakeClickReportInfo.h()));
            bVarF.ao(shakeClickReportInfo.b());
            bVarF.ap(String.valueOf(shakeClickReportInfo.d()));
            bVarF.aq(shakeClickReportInfo.e());
            bVarF.ar(String.valueOf(shakeClickReportInfo.c()));
            bVarF.as(String.valueOf(shakeClickReportInfo.f()));
            bVarF.at(String.valueOf(shakeClickReportInfo.a()));
            bVarF.au(String.valueOf(shakeClickReportInfo.i()));
            bVarF.s(contentRecord.ai());
            bVarF.d(1L);
            hw.a("BaseAnalysisReport", "ExceptionType is %s, canReportClick is %s, sld is %s, info: %s", "2100073", bVarF.aP(), bVarF.aQ(), bk.b(bVarF));
            pc pcVar = new pc(this.f18255a, new sp(this.f18255a));
            pcVar.a(contentRecord);
            pcVar.b(bVarF, false, true);
        } catch (Exception e) {
            hw.d("BaseAnalysisReport", "recordShakeClickInfo error : %s", e.getClass().getSimpleName());
        }
    }

    public void a(ContentRecord contentRecord, EventRecord eventRecord, String str) {
        if (contentRecord == null || eventRecord == null) {
            return;
        }
        try {
            b bVarF = f(contentRecord);
            bVarF.ak("2100069");
            bVarF.al(this.f18255a.getPackageName());
            bVarF.am(eventRecord.j());
            bVarF.an(str);
            hw.a("BaseAnalysisReport", "ExceptionType is %s, pkg is %s, eventType is %s, reportStrategy is %s", "2100069", bVarF.aP(), bVarF.aQ(), bVarF.aR());
            pc pcVar = new pc(this.f18255a, new sp(this.f18255a));
            pcVar.a(contentRecord);
            pcVar.b(bVarF, true, true);
        } catch (Exception e) {
            hw.c("BaseAnalysisReport", "onNotReportThirdMonitor error : %s", e.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(ContentRecord contentRecord, MzImpCannotReportInfo mzImpCannotReportInfo) {
        if (contentRecord == null || mzImpCannotReportInfo == null) {
            return;
        }
        try {
            b bVarF = f(contentRecord);
            bVarF.ak("2100075");
            bVarF.al(String.valueOf(mzImpCannotReportInfo.getReason()));
            bVarF.am(String.valueOf(mzImpCannotReportInfo.getMinShowTime()));
            bVarF.an(String.valueOf(mzImpCannotReportInfo.getMinShowRatio()));
            bVarF.ao(String.valueOf(mzImpCannotReportInfo.getPercent()));
            bVarF.ap(String.valueOf(mzImpCannotReportInfo.getDuration()));
            bVarF.aq(String.valueOf(mzImpCannotReportInfo.getMaxShowAreaPer()));
            bVarF.ar(String.valueOf(mzImpCannotReportInfo.getPlayPercentage()));
            bVarF.as(String.valueOf(mzImpCannotReportInfo.getExposeType()));
            bVarF.s(contentRecord.ai());
            hw.a("BaseAnalysisReport", "ExceptionType is %s, onMzImpCannotReportReason is %s, info: %s", "2100075", bVarF.aP(), bk.b(bVarF));
            pc pcVar = new pc(this.f18255a, new sp(this.f18255a));
            pcVar.a(contentRecord);
            pcVar.b(bVarF, false, true);
        } catch (Exception e) {
            hw.d("BaseAnalysisReport", "onMzImpCannotReport error : %s", e.getClass().getSimpleName());
        }
    }

    public void a(ContentRecord contentRecord, MotionData motionData, int i) {
        if (contentRecord == null || motionData == null) {
            return;
        }
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("2100014");
            if (contentRecord.f() == 1) {
                bVarF.ak("2100015");
            }
            bVarF.al(String.valueOf(i));
            hw.a("BaseAnalysisReport", "ExceptionType is %s, reportEggCannotDisplay reason: %s, url: %s", bVarF.aN(), bVarF.aP(), motionData.g());
            pc pcVar = new pc(this.f18255a, new sp(this.f18255a));
            pcVar.a(contentRecord);
            pcVar.b(bVarF, false, true);
        } catch (Exception e) {
            hw.d("BaseAnalysisReport", "reportEggCannotDisplay error : %s", e.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(ContentRecord contentRecord, long j, long j2, a aVar) {
        StringBuilder sb;
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("86");
            bVarF.c(j);
            bVarF.d(j2);
            if (contentRecord != null) {
                bVarF.al(contentRecord.aA());
                bVarF.am(String.valueOf(contentRecord.aB()));
            }
            if (aVar != null) {
                bVarF.an(String.valueOf(aVar.g()));
                bVarF.ao(aVar.h());
            }
            if (hw.a()) {
                hw.a("BaseAnalysisReport", "onVideoStartTimeCost duration: %s, bufferingDuration: %s, fileSize:%s, sequence: %s, playMode: %s", Long.valueOf(bVarF.aO()), Long.valueOf(bVarF.aZ()), bVarF.aP(), bVarF.aR(), bVarF.aQ());
            }
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue())).b(bVarF, false, false);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onVideoStartTimeCost RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onVideoStartTimeCost Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(ContentRecord contentRecord, long j, long j2, int i) {
        if (contentRecord == null) {
            return;
        }
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            hw.b("BaseAnalysisReport", "onVideoPlayEx, contentId: %s", contentRecord.o());
            if (hw.a()) {
                hw.a("BaseAnalysisReport", "onVideoPlayEx, waitingTime: %s, playedTime: %s", Long.valueOf(j), Long.valueOf(j2));
            }
            bVarF.ak("160");
            bVarF.c(j);
            bVarF.d(j2);
            bVarF.al(String.valueOf(i));
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, false, true);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "onVideoPlayException ex: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(ContentRecord contentRecord, long j, long j2) {
        a(contentRecord, j, j2, (a) null);
    }

    public void a(ContentRecord contentRecord, long j, int i) {
        String str;
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("142");
            VideoInfo videoInfoT = contentRecord.T();
            if (videoInfoT != null) {
                long jA = im.a().a(videoInfoT.a());
                bVarF.d(videoInfoT.c());
                bVarF.e(jA);
            }
            bVarF.al(dg.a(Integer.valueOf(i)));
            hw.b("BaseAnalysisReport", "adType is " + bVarF.t());
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, true, true);
        } catch (RuntimeException unused) {
            str = "onVideoStreamError RuntimeException";
            hw.c("BaseAnalysisReport", str);
        } catch (Exception unused2) {
            str = "onVideoStreamError Exception";
            hw.c("BaseAnalysisReport", str);
        }
    }

    public void a(ContentRecord contentRecord, long j) {
        try {
            b bVarA = a(contentRecord, true);
            if (bVarA == null) {
                hw.b("BaseAnalysisReport", "info or contentRecord is null");
                return;
            }
            bVarA.ak("2100068");
            bVarA.al(String.valueOf(j));
            new pc(this.f18255a, sw.a(this.f18255a, -1)).b(bVarA, true, false);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "reportLimitTimeDuration error : %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(ContentRecord contentRecord, int i, int i2, String str) {
        StringBuilder sb;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onContentOrentationError, contentRecord is null");
                return;
            }
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("108");
            bVarF.s(str);
            bVarF.al(String.valueOf(i));
            bVarF.am(String.valueOf(contentRecord.au()));
            bVarF.an(String.valueOf(i2));
            if ((contentRecord.T() != null && contentRecord.T().m() == null) || (contentRecord.S() != null && (contentRecord.S().d() == 0 || contentRecord.S().e() == 0))) {
                bVarF.c(1);
            }
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, false, false);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onContentOrrentationError RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onContentOrrentationError Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(ContentRecord contentRecord, int i, int i2) {
        StringBuilder sb;
        try {
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("119");
            b bVarA2 = a(bVarA, contentRecord);
            bVarA2.c(i);
            if (hw.a()) {
                hw.a("BaseAnalysisReport", "onSpareSplashMediaPathChecked resultCode: %s", Integer.valueOf(i));
            }
            new pc(this.f18255a, sw.a(this.f18255a, i2), contentRecord).b(bVarA2, false, true);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onSpareSplashMediaPathChecked RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onSpareSplashMediaPathChecked Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(ContentRecord contentRecord, int i) {
        StringBuilder sb;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onStartSpareSplashAd, contentRecord is null.");
                return;
            }
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("105");
            bVarA.s(contentRecord.ai());
            bVarA.a(contentRecord.f());
            bVarA.o(contentRecord.n());
            bVarA.p(contentRecord.o());
            bVarA.H(contentRecord.p());
            bVarA.al(String.valueOf(contentRecord.au()));
            bVarA.c(i);
            if (hw.a()) {
                hw.a("BaseAnalysisReport", "onStartSpareSplashAd resultCode: %s", Integer.valueOf(i));
            }
            new pc(this.f18255a, sw.a(this.f18255a, contentRecord.f())).b(bVarA, false, false);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onStartSpareSplashAd RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onStartSpareSplashAd Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(ContentRecord contentRecord) {
        String str;
        if (contentRecord == null) {
            hw.c("BaseAnalysisReport", "onPraise, contentRecord is null ");
            return;
        }
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("2100001");
            bVarF.c(dg.a(contentRecord.aC(), -1));
            pc pcVar = new pc(this.f18255a, sw.a(this.f18255a, contentRecord.f()));
            pcVar.a(contentRecord);
            pcVar.b(bVarF, false, true);
        } catch (RuntimeException unused) {
            str = "onPraise RuntimeException";
            hw.c("BaseAnalysisReport", str);
        } catch (Exception unused2) {
            str = "onPraise Exception";
            hw.c("BaseAnalysisReport", str);
        }
    }

    public void a(ContentFilterParam contentFilterParam) {
        try {
            b bVarA = a(this.f18255a.getPackageName(), true);
            bVarA.ak("2100010");
            Content contentB = contentFilterParam.b();
            if (contentB != null) {
                bVarA.p(contentB.g());
                bVarA.H(contentB.h());
            }
            bVarA.o(contentFilterParam.a());
            bVarA.a(contentFilterParam.d());
            bVarA.al(String.valueOf(contentFilterParam.c()));
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarA, false, false);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "onContentFilterException ex: %s", th.getClass().getSimpleName());
        }
    }

    public void a(ApiStatisticsReq apiStatisticsReq) {
        StringBuilder sb;
        try {
            if (apiStatisticsReq == null) {
                hw.c("BaseAnalysisReport", "onApiStatisticsReport, apiStatisticsReq is null ");
                return;
            }
            b bVarA = a(true, apiStatisticsReq.l());
            if (bVarA == null) {
                return;
            }
            a(bVarA, apiStatisticsReq);
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

    @Override // com.huawei.openalliance.ad.cv
    public void a(e eVar) {
        if (eVar == null) {
            hw.a("BaseAnalysisReport", "AutoOpenAnalysisData is null");
            return;
        }
        b bVarD = d(this.f18255a.getPackageName());
        bVarD.ak("2100033");
        ContentRecord contentRecordC = eVar.c();
        if (contentRecordC != null) {
            a(bVarD, contentRecordC);
        }
        bVarD.al(String.valueOf(eVar.a()));
        AppInfo appInfoB = eVar.b();
        int iA = eVar.a();
        if (iA == 1) {
            a(appInfoB, bVarD);
        } else if (iA == 2) {
            AppDownloadTask appDownloadTaskD = eVar.d();
            bVarD.at(eVar.e() ? "1" : "0");
            a(appInfoB, appDownloadTaskD, bVarD, contentRecordC);
        }
        new pc(this.f18255a, sw.a(this.f18255a, contentRecordC.f())).b(bVarD, false, true);
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(a aVar, int i, String str, String str2) {
        StringBuilder sb;
        try {
            b bVarA = a(true);
            if (bVarA != null && aVar != null) {
                bVarA.ak("107");
                bVarA.a(aVar.d());
                bVarA.s(aVar.a());
                bVarA.o(aVar.b());
                bVarA.p(aVar.c());
                bVarA.c(i);
                bVarA.al(str);
                bVarA.am(str2);
                bVarA.an("normal");
                if (hw.a()) {
                    hw.a("BaseAnalysisReport", "onRecordSpareSplashAdFailed resultCode: %s", Integer.valueOf(i));
                }
                new pc(this.f18255a, sw.a(this.f18255a, aVar.d())).b(bVarA, false, false);
            }
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onRecordSpareAdFailed RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onRecordSpareAdFailed Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(VideoConfiguration videoConfiguration, boolean z, boolean z2, int i) {
        try {
            b bVarD = d(this.f18255a.getPackageName());
            if (bVarD == null) {
                return;
            }
            bVarD.ak("2200195");
            bVarD.al(this.f18255a.getPackageName());
            bVarD.aq(String.valueOf(i));
            if (videoConfiguration == null) {
                return;
            }
            bVarD.am(String.valueOf(z));
            bVarD.an(String.valueOf(videoConfiguration.getAutoPlayNetwork()));
            bVarD.ao(String.valueOf(z2));
            bVarD.ap(String.valueOf(videoConfiguration.isMute()));
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarD, false, true);
            if (hw.a()) {
                hw.a("BaseAnalysisReport", "ExceptionType is %s, Media pkgName is %s, AdType is %s, ServerFirst is %s, AutoPlay is %s, ServerFirst is %s, isMute is %s", "2200195", this.f18255a.getPackageName(), Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(videoConfiguration.getAutoPlayNetwork()), Boolean.valueOf(z2), Boolean.valueOf(videoConfiguration.isMute()));
            }
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "onSetVideoConfigMedia err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(axg axgVar) {
        if (axgVar == null) {
            return;
        }
        try {
            b bVarA = a(axgVar.n(), true);
            bVarA.ak(axgVar.c());
            bVarA.al(axgVar.e());
            bVarA.am(axgVar.d());
            bVarA.an(axgVar.h());
            bVarA.ao(axgVar.j());
            bVarA.ap(axgVar.f());
            bVarA.aq(axgVar.g());
            bVarA.ar(axgVar.i());
            bVarA.as(axgVar.o());
            bVarA.at(axgVar.m());
            bVarA.au(axgVar.a());
            bVarA.a(axgVar.b());
            bVarA.d(axgVar.l());
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarA, false, false);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "onEventProcessCallBackFromRecEngine ex: %s", th.getClass().getSimpleName());
        }
    }

    public void a(Bundle bundle, ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            if (bundle != null) {
                gr grVar = new gr(bundle);
                bVarF.ak(grVar.d(ParamConstants.Param.EXCEPTION_TYPE));
                bVarF.al(grVar.d(ParamConstants.Param.EXTRA_STR1));
                bVarF.am(grVar.d(ParamConstants.Param.EXTRA_STR2));
                bVarF.an(grVar.d(ParamConstants.Param.EXTRA_STR3));
                bVarF.ao(grVar.d(ParamConstants.Param.EXTRA_STR4));
                bVarF.ap(grVar.d(ParamConstants.Param.EXTRA_STR5));
            }
            bVarF.a(1);
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarF, false, false);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "splashEventReport ex: %s", th.getClass().getSimpleName());
        }
    }

    public void a(Context context, com.huawei.openalliance.ad.utils.dcservice.c cVar, String str, String str2) {
        if (context == null || cVar == null) {
            return;
        }
        try {
            b bVarD = d(context.getPackageName());
            bVarD.H(cVar.e());
            bVarD.p(cVar.b());
            bVarD.ak("2100062");
            bVarD.al(context.getPackageName());
            bVarD.am(cVar.f());
            if (!dg.b(str2)) {
                bVarD.an(String.valueOf(str.equals(str2)));
                bVarD.ap(String.valueOf(true));
            }
            hw.a("AnalysisReport", "ExceptionType is %s, ContentId is %s, TaskId is %s", "2100062", cVar.b(), cVar.e());
            new pc(context, sw.a(context, cVar.a())).b(bVarD, false, false);
        } catch (Throwable th) {
            hw.d("BaseAnalysisReport", "report onAnalysis error, type: %s, reportPlayable: %s", "2100062", th.getClass().getSimpleName());
        }
    }

    public void a(Context context, com.huawei.openalliance.ad.inter.data.e eVar, long j) {
        try {
            if (context == null || eVar == null) {
                hw.c("BaseAnalysisReport", "param err");
                return;
            }
            long minEffectiveShowTime = eVar.getMinEffectiveShowTime();
            long maxEffectiveShowTime = eVar.getMaxEffectiveShowTime();
            b bVarA = a();
            bVarA.ak("2100041");
            bVarA.o(eVar.getSlotId());
            bVarA.H(eVar.getTaskId());
            bVarA.p(eVar.getContentId());
            bVarA.am(Long.toString(minEffectiveShowTime));
            bVarA.an(Long.toString(maxEffectiveShowTime));
            bVarA.ap(Long.toString(j));
            new pc(context, sw.a(context, -1)).b(bVarA, false, true);
        } catch (Throwable unused) {
            hw.d("BaseAnalysisReport", "report imp discard failed");
        }
    }

    public void a(Context context, IAd iAd, int i) {
        String strM;
        String strN;
        boolean z;
        try {
            if (context == null || iAd == null) {
                hw.c("BaseAnalysisReport", "param err");
                return;
            }
            if (iAd instanceof com.huawei.openalliance.ad.inter.data.e) {
                strM = ((com.huawei.openalliance.ad.inter.data.e) iAd).getSlotId();
            } else {
                if (!(iAd instanceof com.huawei.openalliance.ad.inter.data.h)) {
                    if (iAd instanceof j) {
                        strN = ((j) iAd).a() != null ? ((j) iAd).a().n() : "";
                        z = true;
                    } else {
                        strM = "";
                    }
                    b bVarA = a();
                    bVarA.ak("2200198");
                    bVarA.o(strN);
                    bVarA.H(iAd.getTaskId());
                    bVarA.al(dg.a(Integer.valueOf(i)));
                    bVarA.am(dg.a(Boolean.valueOf(z)));
                    new pc(context, sw.a(context, -1)).b(bVarA, false, true);
                }
                strM = ((com.huawei.openalliance.ad.inter.data.h) iAd).M();
            }
            strN = strM;
            z = false;
            b bVarA2 = a();
            bVarA2.ak("2200198");
            bVarA2.o(strN);
            bVarA2.H(iAd.getTaskId());
            bVarA2.al(dg.a(Integer.valueOf(i)));
            bVarA2.am(dg.a(Boolean.valueOf(z)));
            new pc(context, sw.a(context, -1)).b(bVarA2, false, true);
        } catch (Throwable unused) {
            hw.d("BaseAnalysisReport", "report download inter failed");
        }
    }

    public void a(long j, long j2, String str) {
        try {
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("2100086");
            bVarA.al(URLEncoder.encode(str, "UTF-8"));
            bVarA.am(String.valueOf(j));
            bVarA.an(String.valueOf(j2));
            hw.a("BaseAnalysisReport", "ExceptionType is %s, reportUnderLimitSize, fileSize: %s, limit: %s, url: %s", "2100086", bVarA.aQ(), bVarA.aR(), bVarA.aP());
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarA, false, true);
        } catch (Exception e) {
            hw.d("BaseAnalysisReport", "reportUnderLimitSize exception : %s", e.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(int i, String str, String str2, String str3, ContentRecord contentRecord, String str4) {
        String str5;
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.s(contentRecord.ai());
            hw.b("BaseAnalysisReport", "InvokeMZ, type is %s", Integer.valueOf(i));
            if (i == 0) {
                str5 = "2100024";
            } else if (i == 1) {
                str5 = "2100022";
            } else if (i != 2) {
                return;
            } else {
                str5 = "2100023";
            }
            bVarF.ak(str5);
            bVarF.al(str);
            bVarF.am(str2);
            bVarF.an(str3);
            bVarF.ao(str4);
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarF, false, false);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "invoke MZ SDK err: %s.", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(final int i, final Integer num, final Integer num2) {
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.analysis.c.1
            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                b bVarA = cVar.a(cVar.f18255a.getPackageName(), true);
                try {
                    bVarA.ak("2100008");
                    bVarA.al(String.valueOf(i));
                    bVarA.am(String.valueOf(num));
                    bVarA.an(String.valueOf(num2));
                    bVarA.d(System.currentTimeMillis());
                    new pc(c.this.f18255a, new sp(c.this.f18255a)).b(bVarA, false, false);
                } catch (Throwable th) {
                    hw.c("BaseAnalysisReport", "report update uiengine error: %s", th.getClass().getSimpleName());
                }
            }
        });
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(int i, ContentRecord contentRecord) {
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.s(contentRecord.ai());
            bVarF.ak("2100025");
            bVarF.al(dg.a(Integer.valueOf(i)));
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarF, false, true);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "reportSdkMonitors err: %s.", th.getClass().getSimpleName());
        }
    }

    public void a(int i, long j, long j2, ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        try {
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            if (i == 1) {
                bVarF.ak("2100037");
                bVarF.am(String.valueOf(j2));
            } else {
                bVarF.ak("2100038");
            }
            bVarF.an(String.valueOf(j));
            hw.a("BaseAnalysisReport", "reportSplashStartMode, mode: %s, timeInterval: %s, adStartLoadTime: %s", Integer.valueOf(i), bVarF.aQ(), bVarF.aR());
            new pc(this.f18255a, new sp(this.f18255a)).b(bVarF, true, true);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "reportSplashStartMode ex: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.cv
    public void a(int i, float f, String str, String str2) {
        try {
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            bVarA.ak("2100051");
            bVarA.al("" + i);
            bVarA.am("" + f);
            bVarA.an(str);
            bVarA.ap(str2);
            hw.a("BaseAnalysisReport", "reportHiboardGameData, gameNum: %s, adRatio: %s, sourceList: %s, pkgNameList: %s", Integer.valueOf(i), Float.valueOf(f), str, str2);
            new pc(this.f18255a, sw.a(this.f18255a, -1)).b(bVarA, false, true);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "reportHiboardGameData err: %s.", th.getClass().getSimpleName());
        }
    }

    private boolean a(MetaData metaData, Long l, Integer num) {
        return l != null && num != null && l.longValue() < metaData.i() && num.intValue() < metaData.k();
    }

    private boolean a(MetaData metaData, Long l) {
        return l != null && l.longValue() < metaData.i();
    }

    private boolean a(MetaData metaData, Integer num) {
        return num != null && num.intValue() < metaData.k();
    }

    private void a(AppInfo appInfo, AppDownloadTask appDownloadTask, b bVar, ContentRecord contentRecord) {
        if (appInfo != null) {
            bVar.am(String.valueOf(appInfo.c()));
            bVar.ap(fp.b(this.f18255a).cs() ? "1" : "0");
        }
        if (appDownloadTask != null) {
            bVar.an(appDownloadTask.V() ? "1" : "0");
            bVar.ao(appDownloadTask.K() ? "1" : "0");
            String strO = appDownloadTask.O();
            if (strO == null && contentRecord != null) {
                strO = contentRecord.l();
            }
            bVar.aq(strO);
            bVar.ar(appDownloadTask.n());
            bVar.as(l.a(appInfo, Boolean.valueOf(appDownloadTask.V())) ? "1" : "0");
        }
    }

    private void a(AppInfo appInfo, b bVar) {
        if (appInfo != null) {
            bVar.am(appInfo.getPriorInstallWay());
            bVar.an(appInfo.v());
        }
        bVar.ap(fp.b(this.f18255a).cs() ? "1" : "0");
    }

    private void a(b bVar, ApiStatisticsReq apiStatisticsReq) {
        bVar.ak("65");
        bVar.a(as.a("yyyy-MM-dd HH:mm:ss.SSSZ").format(new Date(apiStatisticsReq.e())));
        bVar.r(dg.f(apiStatisticsReq.g()));
        bVar.A(apiStatisticsReq.a());
        bVar.B(apiStatisticsReq.b());
        bVar.b(apiStatisticsReq.c());
        bVar.c(apiStatisticsReq.d());
        bVar.s(apiStatisticsReq.j());
        bVar.p(apiStatisticsReq.m());
        int iK = apiStatisticsReq.k();
        bVar.a(iK);
        bVar.c(apiStatisticsReq.f());
        a(bVar, apiStatisticsReq.n());
        bVar.F(com.huawei.openalliance.ad.utils.d.g(this.f18255a));
        bVar.D(com.huawei.openalliance.ad.utils.d.a(this.f18255a, false));
        if (hw.a()) {
            String strC = bVar.C();
            String strS = bVar.s();
            int iN = bVar.N();
            Integer numT = bVar.t();
            int iE = bVar.E();
            hw.a("BaseAnalysisReport", "onApiStatisticsReport apiName: %s requestId: %s  requestType: %s adType: %s resultCode: %s  e2e: %s", strC, strS, Integer.valueOf(iN), numT, Integer.valueOf(iE), bVar.aK());
            hw.a("BaseAnalysisReport", "onApiStatisticsReport, uuid: %s, uuid: %s", bVar.I(), bVar.G());
            hw.a("BaseAnalysisReport", "rec engine cost time: %s", Long.valueOf(bVar.bk()));
            hw.a("BaseAnalysisReport", "hms rec engine cost time: %s", Long.valueOf(bVar.bl()));
        }
        new pc(this.f18255a, sw.a(this.f18255a, iK)).b(bVar, false, true);
    }

    public c(Context context) {
        super(context);
    }
}
