package com.huawei.openalliance.ad.analysis;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.huawei.openalliance.ad.beans.inner.HttpConnection;
import com.huawei.openalliance.ad.beans.inner.LocationSwitches;
import com.huawei.openalliance.ad.beans.metadata.AdTimeStatistics;
import com.huawei.openalliance.ad.beans.metadata.BluetoothInfo;
import com.huawei.openalliance.ad.beans.metadata.Location;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.openalliance.ad.cw;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.openalliance.ad.download.DownloadTask;
import com.huawei.openalliance.ad.dx;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.net.http.Response;
import com.huawei.openalliance.ad.pc;
import com.huawei.openalliance.ad.sn;
import com.huawei.openalliance.ad.sw;
import com.huawei.openalliance.ad.utils.ab;
import com.huawei.openalliance.ad.utils.ai;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.bo;
import com.huawei.openalliance.ad.utils.dd;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.ds;
import com.huawei.openalliance.ad.utils.dz;
import com.huawei.openalliance.ad.utils.s;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import java.lang.reflect.Field;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes12.dex */
public class h extends f implements cw {
    private boolean b(int i) {
        return i >= 200 && i < 300 && i != 204;
    }

    public void a(List<ContentResource> list, Integer num) {
        StringBuilder sb;
        try {
            if (bm.a(list)) {
                hw.c("BaseAnalysisReport", "onContentResourceRemoved, contentRecord is null");
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            String strA = null;
            int iD = -1;
            int iF = 1;
            for (int i = 0; i < size; i++) {
                ContentResource contentResource = list.get(i);
                if (i == 0) {
                    iD = contentResource.d();
                    iF = contentResource.f();
                    strA = contentResource.a();
                } else {
                    sb2.append(",");
                }
                sb2.append(contentResource.c());
                sb2.append("#");
                sb2.append(contentResource.d());
                sb2.append("#");
                sb2.append(contentResource.h());
                sb2.append("#");
                sb2.append(contentResource.e());
                sb2.append("#");
                sb2.append(contentResource.b());
            }
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            bVarA.a(iD);
            bVarA.ak("77");
            bVarA.r(sb2.toString());
            bVarA.b(Integer.valueOf(iF));
            bVarA.q(strA);
            if (num != null) {
                bVarA.al(String.valueOf(num));
            }
            new pc(this.f18255a, sw.a(this.f18255a, -1)).b(bVarA, false, true);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onContentResourceRemoved RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onContentResourceRemoved Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(String str, List<String> list, int i, Response response) {
        String simpleName;
        String message;
        int iA;
        Throwable thN;
        if (response == null || (thN = response.n()) == null) {
            simpleName = null;
            message = "unknown";
            iA = -1;
        } else {
            simpleName = thN.getClass().getSimpleName();
            message = thN.getMessage();
            iA = a(thN);
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                a(str, str2, i, iA, simpleName, message);
            }
        }
    }

    public void a(String str, String str2, int i, int i2, String str3, String str4) {
        StringBuilder sb;
        try {
            b bVarA = a(true);
            if (bVarA == null) {
                return;
            }
            bVarA.ak("81");
            bVarA.o(str2);
            bVarA.s(str);
            bVarA.a(i);
            bVarA.c(i2);
            bVarA.al(str3);
            bVarA.r(str4);
            new pc(this.f18255a, sw.a(this.f18255a, i)).b(bVarA, false, false);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onInnerError RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onInnerError Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(String str, Long l, Long l2, boolean z, ContentRecord contentRecord, String str2, HttpConnection httpConnection) {
        StringBuilder sb;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onAdResDownload, contentRecord is null");
                return;
            }
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("72");
            bVarF.q(str);
            bVarF.al(str2);
            bVarF.am(contentRecord.V());
            a(bVarF, httpConnection, str);
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, false, true);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onAdResDownload RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onAdResDownload Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(String str, Long l, Long l2, Long l3, Long l4, boolean z, ContentRecord contentRecord, String str2, long j, HttpConnection httpConnection) {
        StringBuilder sb;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onAdResDownloadSuccess, contentRecord is null");
                return;
            }
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("5");
            bVarF.r("isCached:" + z);
            bVarF.q(str);
            if (l3 != null) {
                if (l != null) {
                    long jLongValue = l3.longValue() - l.longValue();
                    hw.a("BaseAnalysisReport", "onAdResDownloadSuccess - adReqToContentDownloadDuration: %d", Long.valueOf(jLongValue));
                    bVarF.t(String.valueOf(jLongValue));
                }
                if (l2 != null) {
                    long jLongValue2 = l3.longValue() - l2.longValue();
                    hw.a("BaseAnalysisReport", "onAdResDownloadSuccess - contentDownloadDuration: %d", Long.valueOf(jLongValue2));
                    bVarF.u(String.valueOf(jLongValue2));
                    if (jLongValue2 > 0 && j > 0) {
                        long j2 = ((SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US * j) / jLongValue2) / 100;
                        bVarF.f(j2);
                        if (hw.a()) {
                            hw.a("BaseAnalysisReport", "onAdResDownloadSuccess - total download time: %d(ms) total download size: %d(bytes) avg. speed: %d(bytes/s)", Long.valueOf(jLongValue2), Long.valueOf(j), Long.valueOf(j2));
                        }
                    }
                }
                if (l4 != null && !z) {
                    long jLongValue3 = l4.longValue() - l3.longValue();
                    if (hw.a()) {
                        hw.a("BaseAnalysisReport", "onAdResDownloadSuccess - fileOperateDuration: %s", Long.valueOf(jLongValue3));
                    }
                    bVarF.d(jLongValue3);
                }
            }
            bVarF.g(j);
            String strF = dd.f(this.f18255a);
            if (!TextUtils.isEmpty(strF)) {
                bVarF.h(ai.d(strF).longValue());
                bVarF.i(ai.c(strF).longValue());
            }
            String strG = dd.g(this.f18255a);
            if (!TextUtils.isEmpty(strG)) {
                bVarF.j(ai.d(strG).longValue());
                bVarF.k(ai.c(strG).longValue());
            }
            bVarF.al(str2);
            bVarF.am(contentRecord.V());
            a(bVarF, httpConnection, str);
            if (hw.a()) {
                hw.a("BaseAnalysisReport", "ExceptionType is %s, TrackVersion is %s", bVarF.aN(), bVarF.aI());
            }
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, false, true);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onAdResDownloadSuccess RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onAdResDownloadSuccess Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(String str, Long l, Long l2, long j, ContentRecord contentRecord, String str2) {
        String str3;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onAdResCheckFailed, contentRecord is null");
                return;
            }
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            bVarA.ak("3");
            b bVarA2 = a(bVarA, contentRecord);
            bVarA2.q(str);
            if (l != null) {
                long jLongValue = j - l.longValue();
                hw.a("BaseAnalysisReport", "onAdResCheckFailed - adReqToContentDownloadDuration: %d", Long.valueOf(jLongValue));
                bVarA2.t(String.valueOf(jLongValue));
            }
            if (l2 != null) {
                long jLongValue2 = j - l2.longValue();
                hw.a("BaseAnalysisReport", "onAdResCheckFailed - contentDownloadDuration: %d", Long.valueOf(jLongValue2));
                bVarA2.u(String.valueOf(jLongValue2));
            }
            bVarA2.al(str2);
            if (hw.a()) {
                hw.a("BaseAnalysisReport", "ExceptionType is %s, TrackVersion is %s", bVarA2.aN(), bVarA2.aI());
            }
            new pc(this.f18255a, sw.a(this.f18255a, bVarA2.t().intValue()), contentRecord).b(bVarA2, false, true);
        } catch (RuntimeException unused) {
            str3 = "onAdResCheckFailed RuntimeException";
            hw.c("BaseAnalysisReport", str3);
        } catch (Exception unused2) {
            str3 = "onAdResCheckFailed Exception";
            hw.c("BaseAnalysisReport", str3);
        }
    }

    public void a(String str, ContentRecord contentRecord, long j) {
        String str2;
        try {
            if (str == null || contentRecord == null) {
                hw.c("BaseAnalysisReport", "onAdExpire, contentRecord or ExceptionType is null ");
                return;
            }
            String strN = contentRecord.n();
            String strO = contentRecord.o();
            int iF = contentRecord.f();
            b bVarA = a(contentRecord.ao());
            if (bVarA == null) {
                return;
            }
            bVarA.ak(str);
            bVarA.o(strN);
            bVarA.p(strO);
            bVarA.a(iF);
            if (j > 0) {
                bVarA.d(j);
            }
            pc pcVar = new pc(this.f18255a, sw.a(this.f18255a, iF));
            pcVar.a(contentRecord);
            pcVar.b(bVarA, false, true);
        } catch (RuntimeException unused) {
            str2 = "onAdInvalid RuntimeException";
            hw.c("BaseAnalysisReport", str2);
        } catch (Exception unused2) {
            str2 = "onAdInvalid Exception";
            hw.c("BaseAnalysisReport", str2);
        }
    }

    public void a(String str, int i, String str2, Long l, Long l2, long j, ContentRecord contentRecord, String str3, HttpConnection httpConnection) {
        StringBuilder sb;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onAdResDownloadFailed, contentRecord is null");
                return;
            }
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("2");
            bVarF.q(str);
            bVarF.r("httpCode:" + i + ", reason:" + str2);
            bVarF.c(i);
            bVarF.w(str2);
            if (l != null) {
                long jLongValue = j - l.longValue();
                hw.a("BaseAnalysisReport", "onAdResDownloadFailed - adReqToContentDownloadDuration: %d", Long.valueOf(jLongValue));
                bVarF.t(String.valueOf(jLongValue));
            }
            if (l2 != null) {
                long jLongValue2 = j - l2.longValue();
                hw.a("BaseAnalysisReport", "onAdResDownloadFailed - contentDownloadDuration: %d", Long.valueOf(jLongValue2));
                bVarF.u(String.valueOf(jLongValue2));
            }
            if (hw.a()) {
                hw.a("BaseAnalysisReport", "ExceptionType is %s, TrackVersion is %s", bVarF.aN(), bVarF.aI());
            }
            String strF = dd.f(this.f18255a);
            if (!TextUtils.isEmpty(strF)) {
                bVarF.h(ai.d(strF).longValue());
                bVarF.i(ai.c(strF).longValue());
            }
            String strG = dd.g(this.f18255a);
            if (!TextUtils.isEmpty(strG)) {
                bVarF.j(ai.d(strG).longValue());
                bVarF.k(ai.c(strG).longValue());
            }
            bVarF.al(str3);
            bVarF.am(contentRecord.V());
            a(bVarF, httpConnection, str);
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, false, true);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onAdResDownloadFailed RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onAdResDownloadFailed Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f A[Catch: Exception -> 0x0144, RuntimeException -> 0x014d, TryCatch #2 {RuntimeException -> 0x014d, Exception -> 0x0144, blocks: (B:6:0x0015, B:19:0x003a, B:20:0x003d, B:22:0x004d, B:28:0x005f, B:30:0x0065, B:32:0x0075, B:33:0x007f, B:35:0x0095, B:37:0x009b, B:39:0x00a5, B:40:0x00b5, B:43:0x0127, B:45:0x012f, B:47:0x0133, B:13:0x002a, B:15:0x0030, B:5:0x0011), top: B:55:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075 A[Catch: Exception -> 0x0144, RuntimeException -> 0x014d, TryCatch #2 {RuntimeException -> 0x014d, Exception -> 0x0144, blocks: (B:6:0x0015, B:19:0x003a, B:20:0x003d, B:22:0x004d, B:28:0x005f, B:30:0x0065, B:32:0x0075, B:33:0x007f, B:35:0x0095, B:37:0x009b, B:39:0x00a5, B:40:0x00b5, B:43:0x0127, B:45:0x012f, B:47:0x0133, B:13:0x002a, B:15:0x0030, B:5:0x0011), top: B:55:0x0011 }] */
    public void a(String str, int i, long j, AdSlotParam adSlotParam, Response response, String str2, List<String> list) {
        StringBuilder sb;
        int iH;
        String str3;
        boolean z;
        RequestOptions requestOptionsL;
        if (response == null) {
            iH = 0;
        } else {
            try {
                iH = response.h();
            } catch (RuntimeException e) {
                e = e;
                sb = new StringBuilder("onAdRequest RuntimeException:");
                sb.append(e.getClass().getSimpleName());
                hw.c("BaseAnalysisReport", sb.toString());
                return;
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder("onAdRequest Exception:");
                sb.append(e.getClass().getSimpleName());
                hw.c("BaseAnalysisReport", sb.toString());
                return;
            }
        }
        b bVarA = a(true, iH);
        if (bVarA == null) {
            return;
        }
        if (iH != 1) {
            if (iH == 3) {
                bVarA.ak("122");
            } else {
                str3 = (adSlotParam == null || !adSlotParam.j()) ? "6" : HealthZonePushReceiver.BLOOD_SUGAR_DAWN_NOTIFY;
            }
            bVarA.s(str);
            bVarA.a(i);
            if (!"6".equals(bVarA.aN()) || "122".equals(bVarA.aN())) {
                z = true;
            } else {
                z = false;
            }
            if (adSlotParam != null) {
                requestOptionsL = adSlotParam.l();
            } else {
                requestOptionsL = null;
            }
            boolean zA = bo.a(this.f18255a, requestOptionsL);
            if ("6".equals(bVarA.aN())) {
                bVarA.r(a(requestOptionsL));
                a(response, bVarA);
            }
            a(bVarA);
            b(bVarA);
            bVarA.Q(ab.d(this.f18255a));
            a(bVarA, response, j);
            if (adSlotParam != null && adSlotParam.l() != null && adSlotParam.l().getTMax() != null) {
                bVarA.q(adSlotParam.l().getTMax().intValue());
            }
            a(bVarA, response);
            c(bVarA);
            a(adSlotParam, response, str2, list, bVarA, z);
            hw.a("BaseAnalysisReport", "onAdRequest requestId: %s  adType: %s duration: %s ms netDuration1: %s ms netDuration2: %s ms dspCost: %s ms dsp1Cost: %s ms, bodyGzipped: %s, tmax:%s", str, Integer.valueOf(i), Long.valueOf(j), Long.valueOf(bVarA.aZ()), Long.valueOf(bVarA.bb()), Long.valueOf(bVarA.ba()), Long.valueOf(bVarA.bc()), bVarA.aV(), Long.valueOf(bVarA.bm()));
            if (!z && zA && dz.a(this.f18255a)) {
                a(i, adSlotParam, bVarA);
                return;
            } else {
                new pc(this.f18255a, sw.a(this.f18255a, i)).b(bVarA, true, false);
            }
        }
        str3 = "74";
        bVarA.ak(str3);
        bVarA.s(str);
        bVarA.a(i);
        if ("6".equals(bVarA.aN())) {
            z = true;
        } else {
            z = true;
        }
        if (adSlotParam != null) {
            requestOptionsL = adSlotParam.l();
        } else {
            requestOptionsL = null;
        }
        boolean zA2 = bo.a(this.f18255a, requestOptionsL);
        if ("6".equals(bVarA.aN())) {
            bVarA.r(a(requestOptionsL));
            a(response, bVarA);
        }
        a(bVarA);
        b(bVarA);
        bVarA.Q(ab.d(this.f18255a));
        a(bVarA, response, j);
        if (adSlotParam != null) {
            bVarA.q(adSlotParam.l().getTMax().intValue());
        }
        a(bVarA, response);
        c(bVarA);
        a(adSlotParam, response, str2, list, bVarA, z);
        hw.a("BaseAnalysisReport", "onAdRequest requestId: %s  adType: %s duration: %s ms netDuration1: %s ms netDuration2: %s ms dspCost: %s ms dsp1Cost: %s ms, bodyGzipped: %s, tmax:%s", str, Integer.valueOf(i), Long.valueOf(j), Long.valueOf(bVarA.aZ()), Long.valueOf(bVarA.bb()), Long.valueOf(bVarA.ba()), Long.valueOf(bVarA.bc()), bVarA.aV(), Long.valueOf(bVarA.bm()));
        if (!z) {
        }
        new pc(this.f18255a, sw.a(this.f18255a, i)).b(bVarA, true, false);
    }

    public void a(String str, int i, int i2, String str2, int i3, long j, boolean z, Response response) {
        int iH;
        StringBuilder sb;
        String str3;
        if (response == null) {
            iH = 0;
        } else {
            try {
                iH = response.h();
            } catch (RuntimeException e) {
                e = e;
                sb = new StringBuilder("onAdRequestFail RuntimeException:");
                sb.append(e.getClass().getSimpleName());
                hw.c("BaseAnalysisReport", sb.toString());
                return;
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder("onAdRequestFail Exception:");
                sb.append(e.getClass().getSimpleName());
                hw.c("BaseAnalysisReport", sb.toString());
                return;
            }
        }
        b bVarA = a(iH);
        if (bVarA == null) {
            return;
        }
        if (iH == 1) {
            str3 = "76";
        } else if (iH == 3) {
            str3 = "124";
        } else {
            str3 = z ? HealthZonePushReceiver.SLEEP_TIME_NOTIFY : "8";
        }
        bVarA.ak(str3);
        bVarA.s(str);
        bVarA.r("httpCode:" + i2 + ", reason:" + str2 + ", retCode:" + i3);
        bVarA.a(i);
        a(bVarA, response, j);
        new pc(this.f18255a, sw.a(this.f18255a, i)).b(bVarA, false, true);
    }

    public void a(String str, int i, int i2, Integer num, boolean z, AdTimeStatistics adTimeStatistics) {
        StringBuilder sb;
        try {
            b bVarA = a();
            if (bVarA == null) {
                return;
            }
            bVarA.ak("113");
            bVarA.s(str);
            bVarA.a(i);
            bVarA.b(Integer.valueOf(!z ? 1 : 0));
            bVarA.Y(bk.b(adTimeStatistics));
            bVarA.am(String.valueOf(i2));
            if (num != null) {
                bVarA.an(String.valueOf(num));
            }
            new pc(this.f18255a, sw.a(this.f18255a, i)).b(bVarA, false, false);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onAdCounting RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onAdCounting Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(String str, int i, int i2, long j, boolean z, Response response, String str2) {
        int iH;
        StringBuilder sb;
        String str3;
        if (response == null) {
            iH = 0;
        } else {
            try {
                iH = response.h();
            } catch (RuntimeException e) {
                e = e;
                sb = new StringBuilder("onAdRequestSuccess RuntimeException:");
                sb.append(e.getClass().getSimpleName());
                hw.c("BaseAnalysisReport", sb.toString());
                return;
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder("onAdRequestSuccess Exception:");
                sb.append(e.getClass().getSimpleName());
                hw.c("BaseAnalysisReport", sb.toString());
                return;
            }
        }
        b bVarA = a(iH);
        if (bVarA == null) {
            return;
        }
        if (iH == 1) {
            str3 = "75";
        } else if (iH == 3) {
            str3 = "123";
        } else {
            str3 = z ? "28" : "7";
        }
        bVarA.ak(str3);
        bVarA.s(str);
        bVarA.r("retCode:" + i2);
        bVarA.a(i);
        bVarA.Y(str2);
        bVarA.y(com.huawei.openalliance.ad.utils.d.l(this.f18255a));
        a(bVarA, response, j);
        new pc(this.f18255a, sw.a(this.f18255a, i)).b(bVarA, false, false);
    }

    public void a(String str, int i, int i2) {
        try {
            if (dg.b(str) || i <= 0) {
                hw.b("BaseAnalysisReport", "no fc");
            }
            b bVarA = a();
            bVarA.ak("162");
            bVarA.o(str);
            bVarA.a(i2);
            bVarA.al(String.valueOf(i));
            new pc(this.f18255a, sw.a(this.f18255a, -1)).b(bVarA, false, true);
        } catch (Throwable th) {
            hw.c("BaseAnalysisReport", "fc analysis err, %s", th.getClass().getSimpleName());
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    @Override // com.huawei.openalliance.ad.cw
    public void a(sn snVar, String str, long j, long j2, int i, String str2) {
        byte b2;
        if (snVar == null) {
            hw.c("BaseAnalysisReport", "reportAdResDownloadEvent, sourceParam is null");
            return;
        }
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 50) {
            if (iHashCode != 51) {
                if (iHashCode != 53) {
                    if (iHashCode != 1755) {
                        if (iHashCode == 1756 && str.equals("73")) {
                            b2 = 4;
                        } else {
                            b2 = -1;
                        }
                    } else if (str.equals("72")) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("5")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("3")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("2")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            a(snVar.i(), i, str2, snVar.k(), Long.valueOf(j), j2, snVar.l(), snVar.q(), snVar.n());
            return;
        }
        if (b2 == 1) {
            a(snVar.i(), snVar.k(), Long.valueOf(j), j2, snVar.l(), snVar.q());
            return;
        }
        if (b2 == 2) {
            a(snVar.i(), snVar.k(), Long.valueOf(j), snVar.p(), Long.valueOf(j2), false, snVar.l(), snVar.q(), snVar.o(), snVar.n());
        } else if (b2 == 3) {
            a(snVar.i(), snVar.k(), Long.valueOf(j), false, snVar.l(), snVar.q(), snVar.n());
        } else {
            if (b2 != 4) {
                return;
            }
            a(snVar.l(), snVar.q());
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    public void a(dx dxVar, String str, long j) {
        byte b2;
        if (dxVar == null) {
            hw.c("BaseAnalysisReport", "reportAdResDownloadEvent, task is null");
            return;
        }
        ContentRecord contentRecord = new ContentRecord();
        contentRecord.b(dxVar.G());
        contentRecord.e(dxVar.B());
        contentRecord.d(dxVar.C());
        contentRecord.f(dxVar.n());
        contentRecord.o(dxVar.I());
        DownloadTask.b bVarJ = dxVar.j();
        if (bVarJ == null) {
            bVarJ = DownloadTask.b.NONE;
        }
        int iA = bVarJ.a();
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 50) {
            if (iHashCode != 53) {
                if (iHashCode == 1755 && str.equals("72")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("5")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("2")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            a(dxVar.a(), iA, dxVar.H(), null, dxVar.E(), j, contentRecord, null, dxVar.u());
        } else if (b2 == 1) {
            a(dxVar.a(), null, dxVar.E(), dxVar.F(), Long.valueOf(j), dxVar.D(), contentRecord, null, dxVar.f(), dxVar.u());
        } else {
            if (b2 != 2) {
                return;
            }
            a(dxVar.a(), (Long) null, dxVar.E(), dxVar.D(), contentRecord, (String) null, dxVar.u());
        }
    }

    public void a(ContentRecord contentRecord, String str) {
        StringBuilder sb;
        try {
            if (contentRecord == null) {
                hw.c("BaseAnalysisReport", "onDiskSpaceInsufficient, contentRecord is null");
                return;
            }
            b bVarF = f(contentRecord);
            if (bVarF == null) {
                return;
            }
            bVarF.ak("73");
            bVarF.al(str);
            new pc(this.f18255a, sw.a(this.f18255a, bVarF.t().intValue()), contentRecord).b(bVarF, false, true);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("onDiskSpaceInsufficient RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("onDiskSpaceInsufficient Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
        }
    }

    public void a(int i, a aVar, String str, ContentRecord contentRecord) {
        String str2;
        try {
            b bVarA = a(true);
            if (bVarA != null && aVar != null) {
                bVarA.ak("54");
                bVarA.a(aVar.d());
                bVarA.s(aVar.a());
                bVarA.o(aVar.b());
                bVarA.c(i);
                bVarA.al("normal");
                bVarA.an(str);
                if (contentRecord != null) {
                    bVarA.H(contentRecord.p());
                    bVarA.p(contentRecord.o());
                    bVarA.a(Integer.valueOf(contentRecord.F()));
                    bVarA.al(contentRecord.ar() ? "exsplash" : "normal");
                    bVarA.am(String.valueOf(contentRecord.au()));
                }
                bVarA.r("errorCode:" + i + ", reason:" + c(i));
                hw.a("BaseAnalysisReport", "onSplashAdLoadFailed, reason: %s", bVarA.r());
                new pc(this.f18255a, sw.a(this.f18255a, aVar.d())).b(bVarA, false, true);
            }
        } catch (RuntimeException unused) {
            str2 = "onSplashAdLoadFailed RuntimeException";
            hw.c("BaseAnalysisReport", str2);
        } catch (Exception unused2) {
            str2 = "onSplashAdLoadFailed Exception";
            hw.c("BaseAnalysisReport", str2);
        }
    }

    private void c(b bVar) {
        bVar.G(fp.b(this.f18255a).cI());
    }

    private String c(int i) {
        String strA;
        try {
            strA = a(ErrorCode.class, Integer.valueOf(i));
        } catch (IllegalAccessException unused) {
            hw.c("BaseAnalysisReport", "getVariableNameByValue Exception");
            strA = null;
        }
        return !TextUtils.isEmpty(strA) ? strA.replace("error_code_", "") : strA;
    }

    private void a(Response response, b bVar) {
        try {
            if (response != null) {
                bVar.c(b(((AdContentRsp) response.b()).a()) ? 7 : 8);
            } else {
                bVar.c(8);
            }
        } catch (Throwable unused) {
            bVar.c(8);
        }
    }

    private void a(AdSlotParam adSlotParam, Response response, String str, List<String> list, b bVar, boolean z) {
        if (response != null) {
            bVar.an(String.valueOf(response.i()));
            bVar.w(response.j());
            HttpConnection httpConnectionM = response.m();
            if (httpConnectionM != null) {
                bVar.v(dg.f(httpConnectionM.a()));
            }
            bVar.ar(String.valueOf(response.o() ? 1 : 0));
            bVar.au(String.valueOf(response.t()));
        }
        if (!bm.a(list)) {
            bVar.as(String.valueOf(list.size()));
        }
        if (adSlotParam != null) {
            bVar.e(adSlotParam.E());
            hw.a("BaseAnalysisReport", "grpIdCode: %s", Integer.valueOf(bVar.aH()));
        }
        if (z) {
            bVar.Y(str);
            if (adSlotParam != null) {
                if (hw.a()) {
                    hw.a("BaseAnalysisReport", "WlacStatus: %s", adSlotParam.w());
                }
                bVar.at(String.valueOf(adSlotParam.w()));
            }
        }
    }

    private void a(b bVar, Response response) {
        if (bVar == null || response == null) {
            return;
        }
        Object objB = response.b();
        AdContentRsp adContentRsp = objB instanceof AdContentRsp ? (AdContentRsp) objB : null;
        if (adContentRsp == null || adContentRsp.t() == null) {
            return;
        }
        bVar.aq(bk.b(adContentRsp.t()));
    }

    private void a(b bVar, HttpConnection httpConnection, String str) {
        if (httpConnection != null) {
            bVar.v(dg.f(httpConnection.a()));
            bVar.aa(dg.f(httpConnection.b()));
            bVar.ab(dg.f(httpConnection.c()));
            bVar.ac(dg.f(httpConnection.a("dl-from")));
        }
        String strAs = bVar.as();
        String strAt = bVar.at();
        if (TextUtils.isEmpty(strAs) || TextUtils.isEmpty(strAt)) {
            try {
                String host = Uri.parse(str).getHost();
                bVar.aa(dg.f(host));
                bVar.ab(dg.f(InetAddress.getByName(host).getHostAddress()));
            } catch (Throwable th) {
                hw.c("BaseAnalysisReport", "onAdResDownload parse url exception: %s", th.getClass().getSimpleName());
            }
        }
        if (hw.a()) {
            hw.a("BaseAnalysisReport", "onAdResDownload analysisType: %s, cdnDomain: %s, cdnIp: %s, dlFrom: %s, trackVersion: %s", bVar.aN(), ds.a(bVar.as()), ds.a(bVar.at()), bVar.au(), bVar.aI());
        }
    }

    private void a(final int i, AdSlotParam adSlotParam, final b bVar) {
        Location locationK = adSlotParam == null ? null : adSlotParam.k();
        bVar.o(System.currentTimeMillis());
        if (locationK != null) {
            Double dC = locationK.c();
            Double dB = locationK.b();
            bVar.b(dC);
            bVar.a(dB);
            a(bVar, dB, dC, 1);
        }
        bVar.p(System.currentTimeMillis());
        final int iY = fp.b(this.f18255a).y();
        bVar.a(Long.valueOf(dk.f()));
        s.a(this.f18255a, new s.a() { // from class: com.huawei.openalliance.ad.analysis.h.1
            @Override // com.huawei.openalliance.ad.utils.s.a
            public void a(List<BluetoothInfo> list, int i2) {
                if (list != null) {
                    int size = list.size();
                    int i3 = iY;
                    if (size > i3) {
                        list = list.subList(0, i3);
                    }
                }
                if (!bm.a(list)) {
                    bVar.V(bk.b(s.a(list)));
                }
                bVar.f(Integer.valueOf(i2));
                if (hw.a()) {
                    hw.a("BaseAnalysisReport", "wifi retCode: %s,  bt retCode: %s", bVar.ak(), bVar.al());
                }
                new pc(h.this.f18255a, sw.a(h.this.f18255a, i)).b(bVar, true, false);
            }
        });
    }

    private String a(Class cls, Object obj) {
        for (Field field : cls.getDeclaredFields()) {
            if (((~field.getModifiers()) & 24) == 0 && field.get(cls).equals(obj)) {
                return field.getName().toLowerCase(Locale.ENGLISH);
            }
        }
        return null;
    }

    private String a(RequestOptions requestOptions) {
        StringBuilder sb = new StringBuilder("111");
        RequestOptions requestConfiguration = HiAd.getInstance(this.f18255a).getRequestConfiguration();
        String str = (requestConfiguration == null || requestConfiguration.isRequestLocation()) ? "1" : "0";
        String str2 = (requestOptions == null || requestOptions.isRequestLocation()) ? "1" : "0";
        LocationSwitches locationSwitchesA = bo.a(this.f18255a);
        String str3 = locationSwitchesA.c() == 1 ? "1" : "0";
        String str4 = locationSwitchesA.b() == 1 ? "1" : "0";
        String str5 = locationSwitchesA.a() != 1 ? "0" : "1";
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        hw.a("BaseAnalysisReport", "addition info is %s", sb.toString());
        return sb.toString();
    }

    private int a(Throwable th) {
        if (th instanceof SSLHandshakeException) {
            return 10000;
        }
        if (th instanceof SocketTimeoutException) {
            return 10001;
        }
        if (th instanceof ConnectException) {
            return 10002;
        }
        if (th instanceof UnknownHostException) {
            return 10003;
        }
        return th instanceof JSONException ? 10004 : -1;
    }

    public h(Context context) {
        super(context);
    }
}
