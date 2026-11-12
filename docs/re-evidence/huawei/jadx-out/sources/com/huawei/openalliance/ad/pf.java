package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.Monitor;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateV3;
import com.huawei.openalliance.ad.beans.vast.VastContent;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.EncryptionField;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.ImageInfo;
import com.huawei.openalliance.ad.inter.data.RewardItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class pf {
    private static void a(com.huawei.openalliance.ad.inter.data.d dVar, MetaData metaData) {
        dVar.B(com.huawei.openalliance.ad.utils.dg.e(metaData.e()));
        dVar.C(com.huawei.openalliance.ad.utils.dg.e(metaData.f()));
        dVar.N(metaData.z());
        dVar.O(metaData.A());
        dVar.P(metaData.B());
        dVar.e(metaData.y());
        dVar.d(a(metaData.p()));
        VideoInfo videoInfoD = metaData.d();
        if (videoInfoD != null) {
            dVar.a(new com.huawei.openalliance.ad.inter.data.VideoInfo(videoInfoD));
        }
        dVar.D(metaData.h());
        dVar.d(metaData.H());
        dVar.d(metaData.i());
        dVar.h(metaData.k());
        dVar.f(com.huawei.openalliance.ad.utils.dg.e(metaData.l()));
        dVar.E(metaData.m());
        dVar.F(metaData.n());
        dVar.g(metaData.o());
        dVar.b(com.huawei.openalliance.ad.utils.dg.e(metaData.a()));
        dVar.b(metaData.L());
        dVar.e(metaData.O());
        ApkInfo apkInfoS = metaData.s();
        if (apkInfoS != null) {
            AppInfo appInfo = new AppInfo(apkInfoS);
            appInfo.m(dVar.getIntent());
            appInfo.v(dVar.getUniqueId());
            appInfo.h(metaData.C());
            dVar.a(appInfo);
        }
        dVar.d(metaData.u());
    }

    private static List<ImageInfo> a(List<com.huawei.openalliance.ad.beans.metadata.ImageInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator<com.huawei.openalliance.ad.beans.metadata.ImageInfo> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new ImageInfo(it.next()));
            }
        }
        return arrayList;
    }

    public static com.huawei.openalliance.ad.inter.data.d a(String str, Content content, byte[] bArr) {
        com.huawei.openalliance.ad.inter.data.d dVar = new com.huawei.openalliance.ad.inter.data.d();
        dVar.K(str);
        dVar.f(content.U());
        dVar.a(content.a());
        dVar.c(content.g());
        dVar.z(content.ah());
        dVar.g(content.l());
        dVar.a(content.k());
        dVar.b(content.j());
        dVar.a(content.f());
        dVar.f(content.z());
        dVar.e(content.h());
        dVar.L(content.A());
        dVar.b(12);
        dVar.j(com.huawei.openalliance.ad.utils.dg.e(content.D()));
        dVar.k(com.huawei.openalliance.ad.utils.dg.e(content.E()));
        dVar.l(com.huawei.openalliance.ad.utils.dg.e(content.F()));
        dVar.q(com.huawei.openalliance.ad.utils.dg.e(content.q()));
        dVar.d(content.af().booleanValue());
        dVar.t(content.ae());
        dVar.f(content.ab());
        dVar.x(content.ao());
        List<String> listN = content.n();
        if (listN != null && listN.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = listN.iterator();
            while (it.hasNext()) {
                arrayList.add(com.huawei.openalliance.ad.utils.dg.e(it.next()));
            }
            dVar.e(arrayList);
        }
        String strM = content.m();
        if (strM != null) {
            dVar.A(com.huawei.openalliance.ad.utils.g.a(strM, bArr));
        }
        List<Monitor> listP = content.p();
        if (listP == null) {
            listP = new ArrayList<>();
        }
        MetaData metaDataC = content.c();
        VastContent vastContentA = qc.a(metaDataC, 12, content.f());
        if (vastContentA != null) {
            hw.b("InterstitialAdConverter", "content:%s is vast ad, merge monitors", content.g());
            listP = qc.a(listP, qc.a(vastContentA));
        }
        if (listP.size() > 0) {
            EncryptionField encryptionField = new EncryptionField(List.class, Monitor.class);
            encryptionField.a(listP);
            dVar.H(encryptionField.b(bArr));
        }
        RewardItem rewardItemC = content.C();
        if (rewardItemC != null) {
            dVar.a(rewardItemC);
        }
        dVar.i(content.r());
        dVar.h(content.u());
        dVar.I(content.v());
        dVar.J(content.w());
        dVar.G(content.d());
        if (metaDataC == null) {
            return dVar;
        }
        if (vastContentA != null) {
            hw.b("InterstitialAdConverter", "content:%s is vast ad, merge meta data", content.g());
            qc.a(metaDataC, vastContentA, 12);
            dVar.G(com.huawei.openalliance.ad.utils.bk.b(metaDataC));
            dVar.c(true);
        }
        a(dVar, metaDataC);
        String strB = content.B();
        if (!TextUtils.isEmpty(strB)) {
            EncryptionField encryptionField2 = new EncryptionField(String.class);
            encryptionField2.a(strB);
            dVar.M(encryptionField2.b(bArr));
        }
        TemplateV3 templateV3W = content.W();
        if (templateV3W != null) {
            dVar.Q(templateV3W.a());
            dVar.a(templateV3W.b());
            dVar.g(content.V());
            dVar.S(content.am());
        }
        dVar.f(content.U());
        dVar.b(content.I());
        dVar.a(content.e());
        dVar.p(content.R());
        dVar.r(content.X());
        dVar.s(com.huawei.openalliance.ad.utils.dg.e(content.Y()));
        dVar.c(content.Z());
        dVar.a(content.ad());
        return dVar;
    }

    public static com.huawei.openalliance.ad.inter.data.d a(Context context, ContentRecord contentRecord) {
        if (contentRecord == null || context == null) {
            return null;
        }
        com.huawei.openalliance.ad.inter.data.d dVar = new com.huawei.openalliance.ad.inter.data.d();
        if (!TextUtils.isEmpty(contentRecord.ac())) {
            dVar.m(contentRecord.ac());
        }
        dVar.f(Integer.valueOf(contentRecord.aQ()));
        dVar.g(contentRecord.aY());
        dVar.Q(contentRecord.aP());
        dVar.a(contentRecord.aV());
        dVar.K(contentRecord.n());
        dVar.c(contentRecord.o());
        dVar.z(contentRecord.bv());
        dVar.g(contentRecord.D());
        dVar.a(contentRecord.t());
        dVar.b(contentRecord.s());
        dVar.a(contentRecord.F());
        dVar.c(contentRecord.ao());
        dVar.f(contentRecord.Z());
        dVar.e(contentRecord.p());
        dVar.L(contentRecord.aa());
        dVar.b(12);
        dVar.j(com.huawei.openalliance.ad.utils.dg.e(contentRecord.ab()));
        dVar.k(com.huawei.openalliance.ad.utils.dg.e(contentRecord.am()));
        dVar.l(com.huawei.openalliance.ad.utils.dg.e(contentRecord.an()));
        dVar.i(contentRecord.ai());
        dVar.q(com.huawei.openalliance.ad.utils.dg.e(contentRecord.P()));
        dVar.d(contentRecord.bf());
        dVar.t(contentRecord.be());
        dVar.f(contentRecord.aZ());
        dVar.u(contentRecord.bi());
        dVar.y(contentRecord.aJ());
        List<String> listK = contentRecord.K();
        if (listK != null && listK.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = listK.iterator();
            while (it.hasNext()) {
                arrayList.add(com.huawei.openalliance.ad.utils.dg.e(it.next()));
            }
            dVar.e(arrayList);
        }
        byte[] bArrB = com.huawei.openalliance.ad.utils.cw.b(context);
        if (contentRecord.H() != null) {
            dVar.A(contentRecord.H().b(bArrB));
        }
        EncryptionField<List<Monitor>> encryptionFieldM = contentRecord.M();
        if (encryptionFieldM != null) {
            dVar.H(encryptionFieldM.b(bArrB));
        }
        RewardItem rewardItemAj = contentRecord.aj();
        if (rewardItemAj != null) {
            dVar.a(rewardItemAj);
        }
        dVar.i(contentRecord.Q());
        dVar.h(contentRecord.O());
        dVar.I(contentRecord.W());
        dVar.J(contentRecord.X());
        dVar.G(contentRecord.h());
        MetaData metaDataJ = contentRecord.j();
        if (metaDataJ == null) {
            return dVar;
        }
        a(dVar, metaDataJ);
        EncryptionField<String> encryptionFieldAd = contentRecord.ad();
        if (encryptionFieldAd != null) {
            dVar.M(encryptionFieldAd.b(bArrB));
        }
        dVar.b(com.huawei.openalliance.ad.utils.dg.j(contentRecord.ap()));
        dVar.R(contentRecord.A());
        dVar.a(contentRecord.b(context));
        dVar.p(contentRecord.aI());
        dVar.c(contentRecord.aU());
        dVar.a(contentRecord.bb());
        return dVar;
    }

    public static ContentRecord a(com.huawei.openalliance.ad.inter.data.d dVar) {
        if (dVar == null) {
            return null;
        }
        ContentRecord contentRecord = new ContentRecord();
        contentRecord.a(dVar.a());
        contentRecord.a(dVar.getMinEffectiveShowRatio());
        contentRecord.b(dVar.getMinEffectiveShowRatio());
        contentRecord.b(dVar.r());
        contentRecord.d(dVar.q() == null ? 0 : dVar.q().intValue());
        contentRecord.a(dVar.ae() == null ? new TemplateData() : dVar.ae());
        contentRecord.L(dVar.ad() == null ? Constants.NULL_TEMPLATE_ID : dVar.ad());
        contentRecord.s(dVar.ac() == null ? -1 : dVar.ac().intValue());
        contentRecord.l(dVar.af() == null ? new ArrayList<>() : dVar.af());
        contentRecord.c(dVar.getShowId());
        contentRecord.d(dVar.V());
        contentRecord.e(dVar.getContentId());
        contentRecord.ag(dVar.F());
        contentRecord.af(dVar.D());
        contentRecord.f(dVar.getStartTime());
        contentRecord.e(dVar.getEndTime());
        contentRecord.g(dVar.U());
        contentRecord.f(dVar.getTaskId());
        contentRecord.t(dVar.X());
        contentRecord.u(dVar.getWhyThisAd());
        contentRecord.z(dVar.getAdChoiceUrl());
        contentRecord.A(dVar.getAdChoiceIcon());
        contentRecord.G(dVar.k());
        contentRecord.H(dVar.l());
        contentRecord.o(dVar.u());
        contentRecord.t(dVar.x());
        String strK = dVar.K();
        if (!com.huawei.openalliance.ad.utils.dg.b(strK)) {
            EncryptionField<String> encryptionField = new EncryptionField<>(String.class);
            encryptionField.a(strK);
            contentRecord.a(encryptionField);
        }
        RewardItem rewardItemI = dVar.I();
        if (rewardItemI != null) {
            contentRecord.a(rewardItemI);
        }
        contentRecord.b(12);
        contentRecord.x(dVar.aa());
        contentRecord.k(dVar.M());
        contentRecord.i(dVar.J());
        contentRecord.m(dVar.getIntent());
        contentRecord.b(dVar.Q());
        String strR = dVar.R();
        if (!com.huawei.openalliance.ad.utils.dg.b(strR)) {
            EncryptionField<List<Monitor>> encryptionField2 = new EncryptionField<>(List.class, Monitor.class);
            encryptionField2.a(strR);
            contentRecord.b(encryptionField2);
        }
        contentRecord.l(dVar.S());
        contentRecord.e(dVar.ag());
        contentRecord.r(dVar.T());
        contentRecord.s(dVar.getCtrlSwitchs());
        contentRecord.v(dVar.getUniqueId());
        String strY = dVar.Y();
        if (!TextUtils.isEmpty(strY)) {
            EncryptionField<String> encryptionField3 = new EncryptionField<>(String.class);
            encryptionField3.a(strY);
            contentRecord.c(encryptionField3);
        }
        contentRecord.a(dVar.isAutoDownloadApp());
        contentRecord.y(dVar.f());
        contentRecord.ad(dVar.B());
        contentRecord.o(dVar.g());
        contentRecord.B(dVar.h() != null ? String.valueOf(dVar.h()) : null);
        contentRecord.D(dVar.i());
        contentRecord.E(dVar.j());
        contentRecord.i(dVar.ah());
        contentRecord.k(dVar.getCreativeType());
        contentRecord.d(dVar.m());
        contentRecord.J(dVar.n());
        contentRecord.h(dVar.p());
        contentRecord.d(dVar.s());
        contentRecord.N(dVar.getAbilityDetailInfo());
        contentRecord.O(dVar.getHwChannelId());
        contentRecord.k(dVar.getCompliance());
        contentRecord.R(dVar.c());
        contentRecord.e(dVar.isTransparencyOpen());
        contentRecord.T(dVar.getTransparencyTplUrl());
        contentRecord.U(dVar.A());
        contentRecord.K(dVar.E());
        return contentRecord;
    }
}
