package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.inner.AdContentData;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.AudioInfo;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.Monitor;
import com.huawei.openalliance.ad.beans.metadata.NegativeFb;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateV3;
import com.huawei.openalliance.ad.beans.vast.VastContent;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.EncryptionField;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.BiddingInfo;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class pl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20033a = "pl";

    private static void c(ContentRecord contentRecord, boolean z, com.huawei.openalliance.ad.inter.data.e eVar, byte[] bArr) {
        EncryptionField<String> encryptionFieldH = contentRecord.H();
        if (encryptionFieldH != null) {
            if (z) {
                eVar.W(encryptionFieldH.a(bArr));
            } else {
                eVar.W(encryptionFieldH.a(bArr));
                eVar.E(contentRecord.H().b(bArr));
            }
        }
    }

    private static void b(ContentRecord contentRecord, boolean z, com.huawei.openalliance.ad.inter.data.e eVar, byte[] bArr) {
        EncryptionField<List<Monitor>> encryptionFieldM = contentRecord.M();
        if (encryptionFieldM != null) {
            if (z) {
                eVar.p(encryptionFieldM.a(bArr));
                return;
            }
            EncryptionField encryptionField = new EncryptionField(List.class, Monitor.class);
            encryptionField.a(encryptionFieldM.a(bArr));
            eVar.L(encryptionField.b(bArr));
        }
    }

    private static void b(Content content, com.huawei.openalliance.ad.inter.data.e eVar) {
        List<NegativeFb> listT = content.T();
        if (com.huawei.openalliance.ad.utils.bm.a(listT)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (NegativeFb negativeFb : listT) {
            if (negativeFb != null) {
                FeedbackInfo feedbackInfo = new FeedbackInfo();
                feedbackInfo.a(negativeFb.a());
                feedbackInfo.a(com.huawei.openalliance.ad.utils.dg.e(negativeFb.b()));
                feedbackInfo.a(negativeFb.c());
                arrayList.add(feedbackInfo);
            }
        }
        eVar.o(arrayList);
    }

    private static void a(List<String> list, com.huawei.openalliance.ad.inter.data.e eVar, List<String> list2) {
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.huawei.openalliance.ad.utils.dg.e(it.next()));
            }
            eVar.f(arrayList);
        }
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(com.huawei.openalliance.ad.utils.dg.e(it2.next()));
        }
        eVar.g(arrayList2);
    }

    private static void a(com.huawei.openalliance.ad.inter.data.e eVar, MetaData metaData) {
        List<ImageInfo> listG = metaData.g();
        if (listG != null && !listG.isEmpty()) {
            eVar.a(new com.huawei.openalliance.ad.inter.data.ImageInfo(listG.get(0)));
        }
        List<com.huawei.openalliance.ad.inter.data.ImageInfo> listA = a(metaData.p());
        eVar.e(listA);
        eVar.l(listA);
        VideoInfo videoInfoD = metaData.d();
        if (videoInfoD != null) {
            com.huawei.openalliance.ad.inter.data.VideoInfo videoInfo = new com.huawei.openalliance.ad.inter.data.VideoInfo(videoInfoD);
            if (metaData.c() != null) {
                videoInfo.j(metaData.c().intValue());
            }
            eVar.a(videoInfo);
        }
        eVar.H(metaData.h());
        eVar.d(metaData.H());
        eVar.d(metaData.i());
        eVar.f(metaData.j());
        eVar.d(metaData.b());
        eVar.c(metaData.c());
        eVar.k(metaData.k());
        eVar.f(com.huawei.openalliance.ad.utils.dg.e(metaData.l()));
        eVar.I(metaData.m());
        eVar.J(metaData.n());
        eVar.g(metaData.o());
        eVar.b(com.huawei.openalliance.ad.utils.dg.e(metaData.a()));
        eVar.U(metaData.B());
        eVar.b(metaData.L());
    }

    private static void a(ContentRecord contentRecord, boolean z, com.huawei.openalliance.ad.inter.data.e eVar, byte[] bArr) {
        EncryptionField<String> encryptionFieldAd = contentRecord.ad();
        if (encryptionFieldAd != null) {
            if (z) {
                eVar.X(encryptionFieldAd.a(bArr));
            } else {
                encryptionFieldAd.a(encryptionFieldAd.a(bArr));
                eVar.S(encryptionFieldAd.b(bArr));
            }
        }
    }

    private static void a(Content content, byte[] bArr, boolean z, com.huawei.openalliance.ad.inter.data.e eVar) {
        String strB = content.B();
        if (!TextUtils.isEmpty(strB)) {
            if (z) {
                eVar.X(strB);
            } else {
                EncryptionField encryptionField = new EncryptionField(String.class);
                encryptionField.a(strB);
                eVar.S(encryptionField.b(bArr));
            }
        }
        String strO = content.O();
        if (TextUtils.isEmpty(strO)) {
            return;
        }
        if (z) {
            eVar.Y(strO);
            return;
        }
        EncryptionField encryptionField2 = new EncryptionField(String.class);
        encryptionField2.a(strO);
        eVar.T(encryptionField2.b(bArr));
    }

    private static void a(Content content, com.huawei.openalliance.ad.inter.data.e eVar, MetaData metaData, VastContent vastContent) {
        if (vastContent != null) {
            hw.b(f20033a, "content:%s is vast ad, merge meta data", content.g());
            qc.a(metaData, vastContent, 3);
            eVar.K(com.huawei.openalliance.ad.utils.bk.b(metaData));
            eVar.c(true);
        }
        eVar.F(com.huawei.openalliance.ad.utils.dg.e(metaData.e()));
        eVar.G(com.huawei.openalliance.ad.utils.dg.e(metaData.f()));
        eVar.d(com.huawei.openalliance.ad.utils.dg.a(metaData.P()));
        a(eVar, metaData);
        eVar.e(metaData.O());
        eVar.a(metaData.t());
        ApkInfo apkInfoS = metaData.s();
        if (apkInfoS != null) {
            AppInfo appInfo = new AppInfo(apkInfoS);
            appInfo.m(eVar.getIntent());
            appInfo.v(eVar.getUniqueId());
            appInfo.h(metaData.C());
            eVar.a(appInfo);
        }
    }

    private static void a(Content content, com.huawei.openalliance.ad.inter.data.e eVar) {
        if (content.ac() == null || com.huawei.openalliance.ad.utils.dg.b(content.ac().a())) {
            hw.a(f20033a, "DeviceAiParam or BasicTargetTag is null");
            return;
        }
        String strA = content.ac().a();
        if (com.huawei.openalliance.ad.utils.dg.b(strA)) {
            return;
        }
        try {
            eVar.l("1".equals(new JSONObject(strA).optString("not_app_first_open")));
            hw.a(f20033a, "native ad set supportFirstOpen value : %s", Boolean.valueOf(eVar.isSupportFirstOpen()));
        } catch (JSONException unused) {
            hw.d(f20033a, "preCheck: parse basicTargetTag error");
        }
    }

    private static List<com.huawei.openalliance.ad.inter.data.ImageInfo> a(List<ImageInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator<ImageInfo> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.huawei.openalliance.ad.inter.data.ImageInfo(it.next()));
            }
        }
        return arrayList;
    }

    public static com.huawei.openalliance.ad.inter.data.e a(String str, Content content, byte[] bArr, int i, boolean z, MetaData metaData) {
        com.huawei.openalliance.ad.inter.data.e eVar = new com.huawei.openalliance.ad.inter.data.e();
        AdContentData adContentData = new AdContentData();
        adContentData.a(i);
        eVar.O(str);
        eVar.a(content.a());
        eVar.c(content.g());
        eVar.z(content.ah());
        eVar.x(content.ao());
        eVar.j(content.l());
        eVar.a(content.k());
        eVar.b(content.j());
        eVar.a(content.f());
        eVar.e(content.f());
        adContentData.c(content.f());
        adContentData.d(content.f());
        eVar.i(content.z());
        eVar.e(content.h());
        eVar.R(content.A());
        eVar.b(i);
        eVar.k(z);
        eVar.a(bArr);
        eVar.a(content.ad());
        BiddingInfo.a lurl = new BiddingInfo.a().a(content.ai()).a(content.aj()).b(content.ak()).setLurl(content.al());
        if (!lurl.a().a()) {
            eVar.a(lurl.a());
        }
        List<String> listN = content.n();
        if (listN != null && listN.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = listN.iterator();
            while (it.hasNext()) {
                arrayList.add(com.huawei.openalliance.ad.utils.dg.e(it.next()));
            }
            eVar.f(arrayList);
        }
        List<String> listO = content.o();
        if (listO != null && listO.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it2 = listO.iterator();
            while (it2.hasNext()) {
                arrayList2.add(com.huawei.openalliance.ad.utils.dg.e(it2.next()));
            }
            eVar.g(arrayList2);
        }
        String strM = content.m();
        if (strM != null) {
            eVar.W(strM);
            if (!z) {
                eVar.E(com.huawei.openalliance.ad.utils.g.a(strM, bArr));
            }
        }
        List<Monitor> listP = content.p();
        if (listP == null) {
            listP = new ArrayList<>();
        }
        VastContent vastContentA = qc.a(metaData, 3, content.f());
        if (vastContentA != null) {
            hw.b(f20033a, "content:%s is vast ad, merge monitors", content.g());
            listP = qc.a(listP, qc.a(vastContentA));
        }
        if (listP.size() > 0) {
            if (z) {
                eVar.p(listP);
            } else {
                EncryptionField encryptionField = new EncryptionField(List.class, Monitor.class);
                encryptionField.a(listP);
                eVar.L(encryptionField.b(bArr));
            }
        }
        eVar.l(content.r());
        eVar.h(content.u());
        eVar.M(content.v());
        eVar.N(content.w());
        eVar.K(content.d());
        adContentData.a(content.d());
        eVar.f(content.ab());
        if (metaData == null) {
            return eVar;
        }
        a(content, eVar, metaData, vastContentA);
        eVar.q(com.huawei.openalliance.ad.utils.dg.e(content.q()));
        eVar.j(com.huawei.openalliance.ad.utils.dg.e(content.D()));
        eVar.k(com.huawei.openalliance.ad.utils.dg.e(content.E()));
        eVar.l(com.huawei.openalliance.ad.utils.dg.e(content.F()));
        eVar.d(content.af().booleanValue());
        eVar.t(content.ae());
        eVar.d(metaData.u());
        AudioInfo audioInfoF = metaData.F();
        if (audioInfoF != null) {
            eVar.a(new com.huawei.openalliance.ad.inter.data.AudioInfo(audioInfoF));
        }
        a(content, bArr, z, eVar);
        eVar.b(content.I());
        eVar.m(content.N());
        eVar.n(content.Q());
        eVar.m(content.P());
        eVar.a(content.e());
        eVar.p(content.R());
        b(content, eVar);
        eVar.r(content.X());
        eVar.s(com.huawei.openalliance.ad.utils.dg.e(content.Y()));
        TemplateV3 templateV3W = content.W();
        if (templateV3W != null) {
            eVar.P(templateV3W.a());
            eVar.a(templateV3W.b());
            eVar.j(content.V());
            eVar.ae(content.am());
            eVar.Z(templateV3W.c());
            eVar.ab(templateV3W.d());
            eVar.ad(templateV3W.e());
            eVar.ac(templateV3W.f());
            adContentData.d(templateV3W.a());
            adContentData.a(templateV3W.b());
            adContentData.a(content.V());
            adContentData.f(content.am());
            adContentData.e(templateV3W.c());
            adContentData.h(templateV3W.d());
            adContentData.i(templateV3W.e());
            adContentData.j(templateV3W.f());
        }
        eVar.f(content.U());
        eVar.w(content.an());
        eVar.c(content.Z());
        eVar.a(content.aa());
        eVar.aa(content.ag());
        a(content, eVar);
        adContentData.b(content.U() == null ? -1 : content.U().intValue());
        adContentData.a(content.aa());
        adContentData.g(content.an());
        adContentData.c(content.g());
        adContentData.k(content.ao());
        adContentData.b(str);
        adContentData.a(content.I());
        eVar.a(adContentData);
        return eVar;
    }

    public static com.huawei.openalliance.ad.inter.data.e a(Context context, ContentRecord contentRecord, boolean z) {
        com.huawei.openalliance.ad.inter.data.e eVar = new com.huawei.openalliance.ad.inter.data.e();
        if (!TextUtils.isEmpty(contentRecord.ac())) {
            eVar.m(contentRecord.ac());
        }
        AdContentData adContentData = new AdContentData();
        adContentData.a(contentRecord.f());
        eVar.O(contentRecord.n());
        eVar.c(contentRecord.o());
        eVar.z(contentRecord.bv());
        eVar.j(contentRecord.D());
        eVar.a(contentRecord.t());
        eVar.b(contentRecord.s());
        eVar.a(contentRecord.F());
        eVar.e(contentRecord.F());
        adContentData.c(contentRecord.F());
        adContentData.d(contentRecord.F());
        eVar.i(contentRecord.Z());
        eVar.e(contentRecord.p());
        eVar.R(contentRecord.aa());
        eVar.b(contentRecord.f());
        eVar.k(z);
        eVar.c(contentRecord.ao());
        eVar.i(contentRecord.ai());
        if (!TextUtils.isEmpty(contentRecord.l())) {
            eVar.h(contentRecord.l());
        }
        if (!TextUtils.isEmpty(contentRecord.bs())) {
            eVar.v(contentRecord.bs());
        }
        a(contentRecord.K(), eVar, contentRecord.L());
        byte[] bArrB = com.huawei.openalliance.ad.utils.cw.b(context);
        eVar.a(bArrB);
        c(contentRecord, z, eVar, bArrB);
        MetaData metaDataJ = contentRecord.j();
        b(contentRecord, z, eVar, bArrB);
        a(contentRecord, z, eVar, bArrB);
        EncryptionField<String> encryptionFieldAF = contentRecord.aF();
        if (encryptionFieldAF != null) {
            eVar.T(encryptionFieldAF.b(bArrB));
        }
        eVar.l(contentRecord.Q());
        eVar.h(contentRecord.O());
        eVar.M(contentRecord.W());
        eVar.N(contentRecord.X());
        eVar.K(contentRecord.h());
        adContentData.a(contentRecord.h());
        if (metaDataJ == null) {
            return eVar;
        }
        eVar.F(com.huawei.openalliance.ad.utils.dg.e(metaDataJ.e()));
        eVar.G(com.huawei.openalliance.ad.utils.dg.e(metaDataJ.f()));
        eVar.d(com.huawei.openalliance.ad.utils.dg.a(metaDataJ.P()));
        a(eVar, metaDataJ);
        eVar.q(com.huawei.openalliance.ad.utils.dg.e(contentRecord.P()));
        eVar.j(com.huawei.openalliance.ad.utils.dg.e(contentRecord.ab()));
        eVar.k(com.huawei.openalliance.ad.utils.dg.e(contentRecord.am()));
        eVar.l(com.huawei.openalliance.ad.utils.dg.e(contentRecord.an()));
        ApkInfo apkInfoS = metaDataJ.s();
        if (apkInfoS != null) {
            AppInfo appInfo = new AppInfo(apkInfoS);
            appInfo.m(eVar.getIntent());
            AppInfo appInfoAg = contentRecord.ag();
            if (appInfoAg == null || TextUtils.isEmpty(appInfoAg.getUniqueId())) {
                appInfo.v(eVar.getUniqueId());
                hw.b(f20033a, "myUniqueId2 is %s", appInfoAg.getUniqueId());
            } else {
                appInfo.v(appInfoAg.getUniqueId());
                hw.b(f20033a, "myUniqueId is %s", appInfoAg.getUniqueId());
            }
            appInfo.h(metaDataJ.C());
            eVar.a(appInfo);
        }
        eVar.a(metaDataJ.t());
        eVar.d(metaDataJ.u());
        AudioInfo audioInfoF = metaDataJ.F();
        if (audioInfoF != null) {
            eVar.a(new com.huawei.openalliance.ad.inter.data.AudioInfo(audioInfoF));
        }
        eVar.b(Integer.valueOf(contentRecord.E()));
        eVar.m(contentRecord.aE());
        eVar.n(contentRecord.aH());
        eVar.m(contentRecord.aG());
        eVar.a(contentRecord.b(context));
        eVar.p(contentRecord.aI());
        eVar.o(contentRecord.aN());
        eVar.r(contentRecord.aS());
        eVar.s(contentRecord.aT());
        eVar.P(contentRecord.aP());
        eVar.a(contentRecord.aV());
        eVar.j(contentRecord.aY());
        adContentData.d(contentRecord.aP());
        adContentData.a(contentRecord.aV());
        adContentData.a(contentRecord.aY());
        eVar.f(Integer.valueOf(contentRecord.aQ()));
        eVar.c(contentRecord.aU());
        eVar.a(contentRecord.aX());
        adContentData.b(contentRecord.aQ());
        adContentData.a(contentRecord.aX());
        eVar.a(adContentData);
        eVar.f(contentRecord.aZ());
        eVar.a(contentRecord.bb());
        return eVar;
    }

    public static ContentRecord a(com.huawei.openalliance.ad.inter.data.e eVar) {
        String strX;
        String strAl;
        String strAm;
        if (eVar == null) {
            return null;
        }
        ContentRecord contentRecord = new ContentRecord();
        contentRecord.a(eVar.a());
        contentRecord.a(eVar.getMinEffectiveShowRatio());
        contentRecord.b(eVar.getMinEffectiveShowTime());
        contentRecord.c(eVar.getMaxEffectiveShowTime());
        contentRecord.d(eVar.q() == null ? 0 : eVar.q().intValue());
        contentRecord.b(Integer.valueOf(eVar.r() != null ? eVar.r().intValue() : 0));
        contentRecord.c(eVar.getShowId());
        contentRecord.d(eVar.getSlotId());
        contentRecord.e(eVar.getContentId());
        contentRecord.f(eVar.getStartTime());
        contentRecord.e(eVar.getEndTime());
        contentRecord.g(eVar.ac());
        contentRecord.f(eVar.getTaskId());
        contentRecord.t(eVar.ak());
        contentRecord.u(eVar.getWhyThisAd());
        contentRecord.z(eVar.getAdChoiceUrl());
        contentRecord.A(eVar.getAdChoiceIcon());
        contentRecord.k(eVar.getCreativeType());
        contentRecord.af(eVar.D());
        EncryptionField<String> encryptionField = new EncryptionField<>(String.class);
        if (eVar.at()) {
            encryptionField.a(eVar.av());
        } else {
            encryptionField.a(eVar.R());
        }
        contentRecord.a(encryptionField);
        contentRecord.b(eVar.e());
        contentRecord.k(eVar.getLandWebUrl());
        contentRecord.i(eVar.getInterActionType());
        contentRecord.m(eVar.getIntent());
        contentRecord.b(eVar.W());
        if (eVar.at()) {
            List<Monitor> listAw = eVar.aw();
            EncryptionField encryptionField2 = new EncryptionField(List.class, Monitor.class);
            encryptionField2.a(listAw);
            strX = encryptionField2.b(eVar.au());
        } else {
            strX = eVar.X();
        }
        if (!com.huawei.openalliance.ad.utils.dg.b(strX)) {
            EncryptionField<List<Monitor>> encryptionField3 = new EncryptionField<>(List.class, Monitor.class);
            encryptionField3.a(strX);
            contentRecord.b(encryptionField3);
        }
        contentRecord.l(eVar.Y());
        contentRecord.e(eVar.Z());
        contentRecord.r(eVar.ab());
        contentRecord.s(eVar.getCtrlSwitchs());
        contentRecord.v(eVar.getUniqueId());
        if (eVar.at()) {
            EncryptionField encryptionField4 = new EncryptionField(String.class);
            encryptionField4.a(eVar.ax());
            strAl = encryptionField4.b(eVar.au());
        } else {
            strAl = eVar.al();
        }
        if (!TextUtils.isEmpty(strAl)) {
            EncryptionField<String> encryptionField5 = new EncryptionField<>(String.class);
            encryptionField5.a(strAl);
            contentRecord.c(encryptionField5);
        }
        if (eVar.at()) {
            EncryptionField encryptionField6 = new EncryptionField(String.class);
            encryptionField6.a(eVar.ay());
            strAm = encryptionField6.b(eVar.au());
        } else {
            strAm = eVar.am();
        }
        if (!TextUtils.isEmpty(strAm)) {
            EncryptionField<String> encryptionField7 = new EncryptionField<>(String.class);
            encryptionField7.a(strAm);
            contentRecord.d(encryptionField7);
        }
        contentRecord.a(eVar.isAutoDownloadApp());
        contentRecord.x(eVar.an());
        contentRecord.y(eVar.f());
        contentRecord.ad(eVar.B());
        contentRecord.a(eVar.getAdCloseKeyWords());
        contentRecord.b(eVar.V());
        contentRecord.o(eVar.g());
        contentRecord.c(1);
        contentRecord.B(eVar.h() != null ? String.valueOf(eVar.h()) : null);
        contentRecord.D(eVar.i());
        contentRecord.E(eVar.j());
        contentRecord.G(eVar.k());
        contentRecord.H(eVar.l());
        contentRecord.h(eVar.ar());
        contentRecord.i(eVar.as());
        contentRecord.d(eVar.m());
        contentRecord.J(eVar.n());
        contentRecord.h(eVar.p());
        contentRecord.j(eVar.getFeedbackInfoList());
        contentRecord.d(eVar.s());
        contentRecord.N(eVar.getAbilityDetailInfo());
        contentRecord.O(eVar.getHwChannelId());
        contentRecord.L(eVar.ae());
        contentRecord.M(eVar.ah());
        contentRecord.a(eVar.ag());
        contentRecord.Q(eVar.aC());
        contentRecord.Z(eVar.aE());
        contentRecord.aa(eVar.aF());
        contentRecord.ab(eVar.aG());
        contentRecord.l(eVar.af());
        contentRecord.s(eVar.ai() != null ? eVar.ai().intValue() : -1);
        contentRecord.k(eVar.getCompliance());
        contentRecord.t(eVar.x());
        contentRecord.R(eVar.c());
        contentRecord.e(eVar.isTransparencyOpen());
        contentRecord.T(eVar.getTransparencyTplUrl());
        contentRecord.U(eVar.A());
        contentRecord.V(eVar.aD());
        contentRecord.ae(eVar.C());
        contentRecord.K(eVar.E());
        contentRecord.ag(eVar.F());
        return contentRecord;
    }
}
