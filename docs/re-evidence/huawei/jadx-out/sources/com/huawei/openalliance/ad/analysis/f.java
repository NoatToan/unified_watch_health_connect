package com.huawei.openalliance.ad.analysis;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Address;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.openalliance.ad.beans.metadata.Ad30;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.beans.metadata.GeoLocation;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.ApiNames;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.net.http.Response;
import com.huawei.openalliance.ad.utils.ab;
import com.huawei.openalliance.ad.utils.ak;
import com.huawei.openalliance.ad.utils.al;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.cb;
import com.huawei.openalliance.ad.utils.cn;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.k;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f18255a;

    protected b f(ContentRecord contentRecord) {
        return a(contentRecord, true);
    }

    protected b d(String str) {
        StringBuilder sb;
        Pair pair;
        PackageInfo packageInfoA;
        try {
            PackageManager packageManager = this.f18255a.getPackageManager();
            String strE = cc.a(this.f18255a).e();
            if (packageManager == null) {
                return null;
            }
            b bVar = new b();
            bVar.a(as.a("yyyy-MM-dd HH:mm:ss.SSSZ").format(new Date()));
            String strAb = cn.a(this.f18255a).ab();
            if (strAb != null) {
                bVar.aj(strAb);
            }
            bVar.b("3.4.84.300");
            if (TextUtils.isEmpty(str)) {
                str = this.f18255a.getPackageName();
            }
            bVar.k(str);
            if (k.a(this.f18255a, str) && (packageInfoA = k.a(packageManager, str, 16384)) != null) {
                bVar.j(packageInfoA.versionName);
                bVar.i(k.c(this.f18255a, str));
            }
            bVar.c(OsType.ANDROID);
            bVar.g(com.huawei.openalliance.ad.utils.d.a());
            bVar.d(Build.VERSION.RELEASE);
            bVar.h(cc.a(this.f18255a).c());
            bVar.e(Build.MANUFACTURER.toUpperCase(Locale.ENGLISH));
            if (TextUtils.isEmpty(strE)) {
                strE = cc.a(this.f18255a).i();
            }
            bVar.E(strE);
            bVar.ah(ab.a());
            String strB = cc.a(this.f18255a).b();
            if (strB != null) {
                strB = strB.toUpperCase(Locale.ENGLISH);
            }
            bVar.f(strB);
            bVar.l(String.valueOf(cb.d(this.f18255a)));
            Pair<Integer, Pair<String, String>> pairF = cb.f(this.f18255a);
            if (pairF != null && (pair = (Pair) pairF.second) != null) {
                bVar.m((String) pair.first);
                bVar.n((String) pair.second);
            }
            return bVar;
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("createAnalysisInfo RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
            return null;
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("createAnalysisInfo Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseAnalysisReport", sb.toString());
            return null;
        }
    }

    protected void b(b bVar) {
        gk gkVarB = fp.b(this.f18255a);
        if (!gkVarB.C()) {
            hw.b("BaseAnalysisReport", "clctStatData is off");
            return;
        }
        hw.a("BaseAnalysisReport", "clctStatData is on");
        int iD = gkVarB.D();
        hw.a("BaseAnalysisReport", "StatData interval is %d", Integer.valueOf(iD));
        bVar.I(dg.p(ab.a(this.f18255a, iD)));
        bVar.J(ab.b(this.f18255a, iD));
        bVar.c(ab.c(this.f18255a, iD));
        bVar.K(ab.d(this.f18255a, iD));
        bVar.L(String.valueOf(ab.e(this.f18255a, iD)));
        bVar.M(String.valueOf(ab.f(this.f18255a, iD)));
        bVar.O(ab.i(this.f18255a, iD));
        bVar.P(ab.j(this.f18255a, iD));
    }

    protected void a(b bVar, Double d, Double d2, int i) {
        Address addressA;
        if (!al.a(this.f18255a) || d == null || d2 == null || bVar == null || (addressA = al.a(this.f18255a, d, d2)) == null) {
            return;
        }
        GeoLocation geoLocation = new GeoLocation();
        geoLocation.a(d);
        geoLocation.b(d2);
        geoLocation.a(Long.valueOf(System.currentTimeMillis()));
        geoLocation.a(i);
        geoLocation.a(al.a(addressA));
        bVar.ai(bk.b(geoLocation));
    }

    protected void a(b bVar, Response response, long j) {
        long j2;
        long jN;
        if (bVar == null || response == null) {
            return;
        }
        Object objB = response.b();
        AdContentRsp adContentRsp = objB instanceof AdContentRsp ? (AdContentRsp) objB : null;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long jA = 0;
        if (adContentRsp != null) {
            String strS = adContentRsp.s();
            bVar.Z(strS);
            if (TextUtils.isEmpty(strS)) {
                jA = adContentRsp.m();
                jN = adContentRsp.n();
            } else {
                try {
                    String[] strArrSplit = strS.split(",");
                    if (strArrSplit == null || strArrSplit.length < 8) {
                        jN = 0;
                    } else {
                        long jA2 = a(strArrSplit[1]);
                        try {
                            jA = a(strArrSplit[7]);
                            bVar.h(a(strArrSplit[0]));
                            bVar.i(a(strArrSplit[2]));
                            bVar.j(a(strArrSplit[3]));
                            bVar.k(a(strArrSplit[4]));
                            bVar.l(a(strArrSplit[5]));
                            bVar.ao(strArrSplit[6]);
                            jA = jA2;
                            jN = jA;
                        } catch (Throwable unused) {
                            long j3 = jA;
                            jA = jA2;
                            jN = j3;
                            hw.c("BaseAnalysisReport", "parse server cost error");
                        }
                    }
                } catch (Throwable unused2) {
                    jN = 0;
                }
            }
            List<Ad30> listC = adContentRsp.c();
            if (!bm.a(listC)) {
                for (Ad30 ad30 : listC) {
                    if (ad30 != null) {
                        arrayList.add(ad30.a());
                        List<Content> listC2 = ad30.c();
                        if (!bm.a(listC2)) {
                            for (Content content : listC2) {
                                if (content != null) {
                                    arrayList2.add(content.g());
                                }
                            }
                        }
                    }
                }
            }
            long j4 = jA;
            jA = jN;
            j2 = j4;
        } else {
            j2 = 0;
        }
        bVar.m(response.k());
        bVar.n(response.l());
        bVar.al(String.valueOf(jA));
        if (!bm.a(arrayList)) {
            bVar.o(arrayList.toString());
            bVar.am(String.valueOf(arrayList.size()));
        }
        if (!bm.a(arrayList2)) {
            bVar.p(arrayList2.toString());
            bVar.ap(String.valueOf(arrayList2.size()));
        }
        bVar.c((j - j2) + jA);
        bVar.d(response.f());
        bVar.e(j2);
        bVar.f(response.g());
        bVar.g(jA);
    }

    protected void a(b bVar, DelayInfo delayInfo) {
        if (bVar == null || delayInfo == null) {
            return;
        }
        bVar.al(delayInfo.l());
        bVar.am(delayInfo.k());
        bVar.ar(delayInfo.C());
        bVar.c(delayInfo.a());
        bVar.d(delayInfo.j());
        bVar.e(delayInfo.e());
        bVar.f(delayInfo.b());
        bVar.g(delayInfo.c());
        bVar.h(delayInfo.f());
        bVar.i(delayInfo.d());
        bVar.j(delayInfo.m());
        bVar.k(delayInfo.n());
        bVar.l(delayInfo.o());
        bVar.m(delayInfo.B());
        List<String> listG = delayInfo.g();
        if (!bm.a(listG)) {
            bVar.o(listG.toString());
            bVar.an(String.valueOf(listG.size()));
        }
        List<String> listH = delayInfo.h();
        if (!bm.a(listH)) {
            bVar.p(listH.toString());
            bVar.ao(String.valueOf(listH.size()));
        }
        bVar.ap(String.valueOf(delayInfo.i()));
        bVar.aq(String.valueOf(delayInfo.p()));
        bVar.as(String.valueOf(delayInfo.t()));
        bVar.at(String.valueOf(delayInfo.r()));
        Integer numW = delayInfo.w();
        if (numW != null) {
            bVar.au(String.valueOf(numW));
        }
        bVar.Y(bk.b(delayInfo.u()));
        bVar.a(delayInfo.v());
        bVar.Z(delayInfo.x());
        if (delayInfo.D() > 0) {
            bVar.o(delayInfo.D());
        }
        if (delayInfo.E() > 0) {
            bVar.p(delayInfo.E());
        }
        if (ApiNames.LOAD_AD.equalsIgnoreCase(bVar.C())) {
            String strR = bVar.r();
            if (strR == null) {
                strR = "";
            }
            bVar.r(strR + "#AdSign:" + delayInfo.y() + "#SpareContentId:" + delayInfo.z() + "#SpareExist:" + delayInfo.A());
        }
    }

    protected void a(b bVar, BaseAnalysisInfo baseAnalysisInfo) {
        if (bVar == null || baseAnalysisInfo == null) {
            return;
        }
        bVar.ak(baseAnalysisInfo.aN());
        bVar.c(baseAnalysisInfo.aO());
        bVar.al(baseAnalysisInfo.aP());
        bVar.am(baseAnalysisInfo.aQ());
        bVar.an(baseAnalysisInfo.aR());
        bVar.ao(baseAnalysisInfo.aS());
        bVar.ap(baseAnalysisInfo.aT());
        bVar.aq(baseAnalysisInfo.aU());
        bVar.ar(baseAnalysisInfo.aV());
        bVar.as(baseAnalysisInfo.aW());
        bVar.at(baseAnalysisInfo.aX());
        bVar.au(baseAnalysisInfo.aY());
        bVar.d(baseAnalysisInfo.aZ());
        bVar.e(baseAnalysisInfo.ba());
        bVar.f(baseAnalysisInfo.bb());
        bVar.g(baseAnalysisInfo.bc());
        bVar.h(baseAnalysisInfo.bd());
        bVar.i(baseAnalysisInfo.be());
        bVar.j(baseAnalysisInfo.bf());
        bVar.k(baseAnalysisInfo.bg());
        bVar.l(baseAnalysisInfo.bh());
        bVar.m(baseAnalysisInfo.bi());
        bVar.n(baseAnalysisInfo.bj());
        bVar.o(baseAnalysisInfo.bk());
        bVar.p(baseAnalysisInfo.bl());
        bVar.q(baseAnalysisInfo.bm());
        bVar.r(baseAnalysisInfo.bn());
        hw.b("BaseAnalysisReport", "baseToAnalysisInfo completed");
    }

    protected void a(b bVar) {
        String str;
        gk gkVarB = fp.b(this.f18255a);
        if (gkVarB.B()) {
            int iD = gkVarB.D();
            hw.a("BaseAnalysisReport", "DyncData interval is %d", Integer.valueOf(iD));
            bVar.N(String.valueOf(ab.g(this.f18255a, iD)));
            bVar.R(ab.k(this.f18255a, iD));
            bVar.S(ab.l(this.f18255a, iD));
            bVar.T(ab.m(this.f18255a, iD));
            bVar.U(ab.n(this.f18255a, iD));
            bVar.d(ab.o(this.f18255a, iD));
            bVar.e(ab.p(this.f18255a, iD));
            bVar.a(ab.q(this.f18255a, iD));
            bVar.b(ab.r(this.f18255a, iD));
            bVar.c(ab.s(this.f18255a, iD));
            bVar.d(ab.t(this.f18255a, iD));
            str = "clctStatData is off" + ab.s(this.f18255a, iD);
        } else {
            str = "clctDyncData is off";
        }
        hw.b("BaseAnalysisReport", str);
    }

    protected b a(boolean z, int i) {
        b bVarA = a(z);
        if (bVarA != null) {
            bVarA.d(i);
        }
        return bVarA;
    }

    protected b a(boolean z) {
        b bVarA = a();
        if (bVarA != null && z) {
            a(this.f18255a, bVarA);
        }
        b(this.f18255a, bVarA);
        return bVarA;
    }

    protected b a(String str, boolean z) {
        b bVarD = d(str);
        if (bVarD != null && z) {
            a(this.f18255a, bVarD);
        }
        b(this.f18255a, bVarD);
        return bVarD;
    }

    protected b a(ContentRecord contentRecord, boolean z) {
        return a(a(z), contentRecord);
    }

    protected b a(b bVar, AdLandingPageData adLandingPageData) {
        if (adLandingPageData != null && bVar != null) {
            bVar.o(adLandingPageData.getSlotId());
            bVar.p(adLandingPageData.getContentId());
            bVar.a(adLandingPageData.getAdType());
            bVar.d(adLandingPageData.v());
        }
        return bVar;
    }

    protected b a(b bVar, ContentRecord contentRecord) {
        if (contentRecord != null && bVar != null) {
            bVar.o(contentRecord.n());
            bVar.p(contentRecord.o());
            bVar.a(contentRecord.f());
            bVar.H(contentRecord.p());
            bVar.a(Integer.valueOf(contentRecord.F()));
            bVar.b(Integer.valueOf(contentRecord.k()));
            bVar.s(contentRecord.ai());
            bVar.aj(contentRecord.bs() == null ? cn.a(this.f18255a).ab() : contentRecord.bs());
            bVar.d(contentRecord.ao());
        }
        return bVar;
    }

    protected b a(int i) {
        b bVarA = a();
        if (bVarA != null) {
            bVarA.d(i);
        }
        return bVarA;
    }

    protected b a() {
        return d("");
    }

    protected static void b(Context context, b bVar) {
        ak.a aVarA;
        if (bVar == null || !ak.b(context) || (aVarA = ak.a(context)) == null) {
            return;
        }
        bVar.W(aVarA.a());
        bVar.X(aVarA.b() ? "0" : "1");
    }

    protected static void a(Context context, b bVar) {
        Pair<String, Boolean> pairB;
        if (bVar == null || (pairB = com.huawei.openalliance.ad.utils.d.b(context, true)) == null) {
            return;
        }
        bVar.C(((Boolean) pairB.second).booleanValue() ? "0" : "1");
        bVar.x((String) pairB.first);
    }

    private long a(String str) {
        return Math.max(dg.a(str, 0L), 0L);
    }

    public f(Context context) {
        this.f18255a = context.getApplicationContext();
    }
}
