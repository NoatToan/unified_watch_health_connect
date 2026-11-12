package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.Monitor;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateV3;
import com.huawei.openalliance.ad.beans.vast.VastContent;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.EncryptionField;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.BiddingInfo;
import com.huawei.openalliance.ad.inter.data.ImageInfo;
import com.huawei.openalliance.ad.inter.data.RewardItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class pw {
    private static void a(com.huawei.openalliance.ad.inter.data.i iVar, MetaData metaData) {
        iVar.A(com.huawei.openalliance.ad.utils.dg.e(metaData.e()));
        iVar.B(com.huawei.openalliance.ad.utils.dg.e(metaData.f()));
        iVar.N(metaData.z());
        iVar.P(metaData.A());
        iVar.Q(metaData.B());
        iVar.e(metaData.y());
        iVar.d(a(metaData.p()));
        iVar.e(a(metaData.g()));
        VideoInfo videoInfoD = metaData.d();
        if (videoInfoD != null) {
            iVar.a(new com.huawei.openalliance.ad.inter.data.VideoInfo(videoInfoD));
        }
        iVar.C(metaData.h());
        iVar.d(metaData.H());
        iVar.d(metaData.i());
        iVar.h(metaData.k());
        iVar.f(com.huawei.openalliance.ad.utils.dg.e(metaData.l()));
        iVar.D(metaData.m());
        iVar.E(metaData.n());
        iVar.g(metaData.o());
        iVar.b(com.huawei.openalliance.ad.utils.dg.e(metaData.a()));
        iVar.e(metaData.O());
        ApkInfo apkInfoS = metaData.s();
        if (apkInfoS != null) {
            AppInfo appInfo = new AppInfo(apkInfoS);
            appInfo.m(iVar.getIntent());
            appInfo.v(iVar.getUniqueId());
            appInfo.h(metaData.C());
            iVar.a(appInfo);
        }
        iVar.d(metaData.u());
    }

    private static void a(ContentRecord contentRecord, com.huawei.openalliance.ad.inter.data.i iVar) {
        if (contentRecord == null || iVar == null) {
            return;
        }
        iVar.a(contentRecord.aV());
        iVar.i(contentRecord.aY());
        iVar.f(Integer.valueOf(contentRecord.aQ()));
        iVar.R(contentRecord.aP());
    }

    private static void a(Content content, com.huawei.openalliance.ad.inter.data.i iVar) {
        if (content == null || iVar == null) {
            return;
        }
        TemplateV3 templateV3W = content.W();
        if (templateV3W != null) {
            iVar.R(templateV3W.a());
            iVar.S(templateV3W.f());
            iVar.a(templateV3W.b());
            iVar.i(content.V());
            iVar.T(content.am());
        }
        iVar.f(content.U());
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

    public static com.huawei.openalliance.ad.inter.data.i a(String str, Content content, byte[] bArr, String str2) {
        com.huawei.openalliance.ad.inter.data.i iVar = new com.huawei.openalliance.ad.inter.data.i();
        iVar.a(content.a());
        iVar.I(str);
        iVar.c(content.g());
        iVar.z(content.ah());
        iVar.x(content.ao());
        iVar.g(content.l());
        iVar.a(content.k());
        iVar.b(content.j());
        iVar.a(content.f());
        iVar.c(content.H());
        iVar.h(content.z());
        iVar.e(content.h());
        iVar.J(content.A());
        iVar.O(com.huawei.openalliance.ad.utils.dg.e(content.b()));
        iVar.b(7);
        iVar.j(com.huawei.openalliance.ad.utils.dg.e(content.D()));
        iVar.k(com.huawei.openalliance.ad.utils.dg.e(content.E()));
        iVar.l(com.huawei.openalliance.ad.utils.dg.e(content.F()));
        iVar.d(content.af().booleanValue());
        iVar.t(content.ae());
        iVar.j(content.Q());
        BiddingInfo.a aVarB = new BiddingInfo.a().a(content.ai()).a(content.aj()).setLurl(content.al()).b(content.ak());
        if (!aVarB.a().a()) {
            iVar.a(aVarB.a());
        }
        a(content, iVar);
        List<String> listN = content.n();
        if (listN != null && listN.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = listN.iterator();
            while (it.hasNext()) {
                arrayList.add(com.huawei.openalliance.ad.utils.dg.e(it.next()));
            }
            iVar.f(arrayList);
        }
        String strM = content.m();
        if (strM != null) {
            iVar.K(com.huawei.openalliance.ad.utils.g.a(strM, bArr));
        }
        List<Monitor> listP = content.p();
        if (listP == null) {
            listP = new ArrayList<>();
        }
        MetaData metaDataC = content.c();
        if (metaDataC != null) {
            iVar.a(metaDataC.t());
        }
        VastContent vastContentA = qc.a(metaDataC, 7, content.f());
        if (vastContentA != null) {
            hw.b("RewardAdConverter", "content:%s is vast ad, merge monitors", content.g());
            listP = qc.a(listP, qc.a(vastContentA));
        }
        if (listP.size() > 0) {
            EncryptionField encryptionField = new EncryptionField(List.class, Monitor.class);
            encryptionField.a(listP);
            iVar.L(encryptionField.b(bArr));
        }
        RewardItem rewardItemC = content.C();
        if (rewardItemC != null) {
            iVar.setRewardItem(rewardItemC);
        }
        iVar.i(content.r());
        iVar.g(content.u());
        iVar.G(content.v());
        iVar.H(content.w());
        iVar.F(content.d());
        if (metaDataC == null) {
            return iVar;
        }
        if (vastContentA != null) {
            hw.b("RewardAdConverter", "content:%s is vast ad, merge meta data", content.g());
            qc.a(metaDataC, vastContentA, 7);
            iVar.F(com.huawei.openalliance.ad.utils.bk.b(metaDataC));
            iVar.c(true);
        }
        a(iVar, metaDataC);
        String strB = content.B();
        if (!TextUtils.isEmpty(strB)) {
            EncryptionField encryptionField2 = new EncryptionField(String.class);
            encryptionField2.a(strB);
            iVar.M(encryptionField2.b(bArr));
        }
        iVar.b(content.I());
        iVar.a(content.e());
        iVar.p(content.R());
        iVar.y(str2);
        iVar.q(com.huawei.openalliance.ad.utils.dg.e(content.q()));
        iVar.b(metaDataC.L());
        iVar.r(content.X());
        iVar.s(com.huawei.openalliance.ad.utils.dg.e(content.Y()));
        iVar.c(content.Z());
        iVar.a(content.ad());
        iVar.f(content.ab());
        return iVar;
    }

    public static com.huawei.openalliance.ad.inter.data.i a(Context context, ContentRecord contentRecord) {
        if (contentRecord == null || context == null) {
            return null;
        }
        com.huawei.openalliance.ad.inter.data.i iVar = new com.huawei.openalliance.ad.inter.data.i();
        if (!TextUtils.isEmpty(contentRecord.ac())) {
            iVar.m(contentRecord.ac());
        }
        iVar.I(contentRecord.n());
        iVar.c(contentRecord.o());
        iVar.z(contentRecord.bv());
        iVar.g(contentRecord.D());
        iVar.a(contentRecord.t());
        iVar.b(contentRecord.s());
        iVar.a(contentRecord.F());
        iVar.c(contentRecord.ao());
        iVar.h(contentRecord.Z());
        iVar.e(contentRecord.p());
        iVar.J(contentRecord.aa());
        iVar.O(com.huawei.openalliance.ad.utils.dg.e(contentRecord.g()));
        iVar.b(7);
        iVar.j(com.huawei.openalliance.ad.utils.dg.e(contentRecord.ab()));
        iVar.k(com.huawei.openalliance.ad.utils.dg.e(contentRecord.am()));
        iVar.l(com.huawei.openalliance.ad.utils.dg.e(contentRecord.an()));
        iVar.i(contentRecord.ai());
        iVar.y(contentRecord.aJ());
        iVar.S(contentRecord.bq());
        List<String> listK = contentRecord.K();
        if (listK != null && listK.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = listK.iterator();
            while (it.hasNext()) {
                arrayList.add(com.huawei.openalliance.ad.utils.dg.e(it.next()));
            }
            iVar.f(arrayList);
        }
        byte[] bArrB = com.huawei.openalliance.ad.utils.cw.b(context);
        if (contentRecord.H() != null) {
            iVar.K(contentRecord.H().b(bArrB));
        }
        EncryptionField<List<Monitor>> encryptionFieldM = contentRecord.M();
        if (encryptionFieldM != null) {
            iVar.L(encryptionFieldM.b(bArrB));
        }
        RewardItem rewardItemAj = contentRecord.aj();
        if (rewardItemAj != null) {
            iVar.setRewardItem(rewardItemAj);
        }
        iVar.i(contentRecord.Q());
        iVar.g(contentRecord.O());
        iVar.G(contentRecord.W());
        iVar.H(contentRecord.X());
        iVar.F(contentRecord.h());
        MetaData metaDataJ = contentRecord.j();
        if (metaDataJ == null) {
            return iVar;
        }
        a(iVar, metaDataJ);
        EncryptionField<String> encryptionFieldAd = contentRecord.ad();
        if (encryptionFieldAd != null) {
            iVar.M(encryptionFieldAd.b(bArrB));
        }
        iVar.b(com.huawei.openalliance.ad.utils.dg.j(contentRecord.ap()));
        iVar.a(contentRecord.b(context));
        iVar.p(contentRecord.aI());
        iVar.q(com.huawei.openalliance.ad.utils.dg.e(contentRecord.P()));
        iVar.b(metaDataJ.L());
        iVar.c(contentRecord.aU());
        iVar.a(contentRecord.bb());
        iVar.d(contentRecord.bf());
        iVar.t(contentRecord.be());
        a(contentRecord, iVar);
        iVar.f(contentRecord.aZ());
        iVar.u(contentRecord.bi());
        return iVar;
    }

    public static ContentRecord a(com.huawei.openalliance.ad.inter.data.i iVar) {
        if (iVar == null) {
            return null;
        }
        ContentRecord contentRecord = new ContentRecord();
        contentRecord.a(iVar.a());
        contentRecord.b(iVar.getMinEffectiveShowTime());
        contentRecord.a(iVar.getMinEffectiveShowRatio());
        contentRecord.b(iVar.r());
        contentRecord.d(iVar.q() == null ? 0 : iVar.q().intValue());
        contentRecord.c(iVar.getShowId());
        contentRecord.d(iVar.W());
        contentRecord.e(iVar.getContentId());
        contentRecord.ag(iVar.F());
        contentRecord.af(iVar.D());
        contentRecord.f(iVar.getStartTime());
        contentRecord.e(iVar.getEndTime());
        contentRecord.g(iVar.V());
        contentRecord.f(iVar.getTaskId());
        contentRecord.t(iVar.Y());
        contentRecord.u(iVar.getWhyThisAd());
        contentRecord.z(iVar.getAdChoiceUrl());
        contentRecord.A(iVar.getAdChoiceIcon());
        contentRecord.i(iVar.as());
        String strZ = iVar.Z();
        if (!com.huawei.openalliance.ad.utils.dg.b(strZ)) {
            EncryptionField<String> encryptionField = new EncryptionField<>(String.class);
            encryptionField.a(strZ);
            contentRecord.a(encryptionField);
        }
        RewardItem rewardItem = iVar.getRewardItem();
        if (rewardItem != null) {
            contentRecord.a(rewardItem);
        }
        contentRecord.b(7);
        contentRecord.x(iVar.ai());
        contentRecord.k(iVar.M());
        contentRecord.i(iVar.I());
        contentRecord.m(iVar.getIntent());
        contentRecord.b(iVar.Q());
        String strAa = iVar.aa();
        if (!com.huawei.openalliance.ad.utils.dg.b(strAa)) {
            EncryptionField<List<Monitor>> encryptionField2 = new EncryptionField<>(List.class, Monitor.class);
            encryptionField2.a(strAa);
            contentRecord.b(encryptionField2);
        }
        contentRecord.l(iVar.S());
        contentRecord.e(iVar.R());
        contentRecord.r(iVar.U());
        contentRecord.s(iVar.getCtrlSwitchs());
        contentRecord.v(iVar.getUniqueId());
        String strAb = iVar.ab();
        if (!TextUtils.isEmpty(strAb)) {
            EncryptionField<String> encryptionField3 = new EncryptionField<>(String.class);
            encryptionField3.a(strAb);
            contentRecord.c(encryptionField3);
        }
        contentRecord.a(iVar.isAutoDownloadApp());
        contentRecord.y(iVar.f());
        contentRecord.ad(iVar.B());
        contentRecord.o(iVar.g());
        contentRecord.c(1);
        contentRecord.B(iVar.h() != null ? String.valueOf(iVar.h()) : null);
        contentRecord.D(iVar.i());
        contentRecord.E(iVar.j());
        contentRecord.G(iVar.k());
        contentRecord.H(iVar.l());
        contentRecord.d(iVar.m());
        contentRecord.J(iVar.n());
        contentRecord.K(iVar.E());
        contentRecord.h(iVar.p());
        contentRecord.d(iVar.s());
        contentRecord.o(com.huawei.openalliance.ad.utils.dg.f(iVar.u()));
        contentRecord.N(iVar.getAbilityDetailInfo());
        contentRecord.O(iVar.getHwChannelId());
        contentRecord.k(iVar.getCompliance());
        contentRecord.R(iVar.c());
        contentRecord.L(iVar.am());
        contentRecord.ab(iVar.an());
        contentRecord.l(iVar.ao());
        contentRecord.ac(iVar.ar());
        contentRecord.a(iVar.ap());
        contentRecord.s(iVar.aq() == null ? -1 : iVar.aq().intValue());
        contentRecord.e(iVar.isTransparencyOpen());
        contentRecord.T(iVar.getTransparencyTplUrl());
        contentRecord.U(iVar.A());
        contentRecord.t(iVar.x());
        return contentRecord;
    }
}
