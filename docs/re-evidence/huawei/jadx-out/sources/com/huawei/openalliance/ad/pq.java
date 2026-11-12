package com.huawei.openalliance.ad;

import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.MediaFile;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.Monitor;
import com.huawei.openalliance.ad.beans.vast.VastContent;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.EncryptionField;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.BiddingInfo;
import com.huawei.openalliance.ad.inter.data.PlacementMediaFile;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes12.dex */
public class pq {
    public static com.huawei.openalliance.ad.inter.data.h a(String str, Content content, byte[] bArr) {
        com.huawei.openalliance.ad.inter.data.h hVar = new com.huawei.openalliance.ad.inter.data.h();
        hVar.a(content.a());
        hVar.d(content.u());
        hVar.I(str);
        hVar.c(content.g());
        hVar.z(content.ah());
        hVar.x(content.ao());
        hVar.e(false);
        hVar.a(content.f());
        hVar.G(content.w());
        hVar.b(content.j());
        hVar.g(content.l());
        hVar.j(content.x());
        hVar.i(content.r());
        hVar.f(false);
        hVar.a(content.k());
        hVar.F(content.v());
        hVar.e(content.h());
        hVar.L(content.A());
        hVar.f(content.z());
        hVar.b(60);
        hVar.j(com.huawei.openalliance.ad.utils.dg.e(content.D()));
        String strB = content.B();
        if (!TextUtils.isEmpty(strB)) {
            EncryptionField encryptionField = new EncryptionField(String.class);
            encryptionField.a(strB);
            hVar.J(encryptionField.b(bArr));
        }
        BiddingInfo.a aVarB = new BiddingInfo.a().a(content.ai()).a(content.aj()).setLurl(content.al()).b(content.ak());
        if (!aVarB.a().a()) {
            hVar.a(aVarB.a());
        }
        String strM = content.m();
        if (strM != null) {
            hVar.A(com.huawei.openalliance.ad.utils.g.a(strM, bArr));
        }
        List<Monitor> listP = content.p();
        if (listP == null) {
            listP = new ArrayList<>();
        }
        MetaData metaDataC = content.c();
        VastContent vastContentA = qc.a(metaDataC, 60, content.f());
        if (vastContentA != null) {
            hw.b("PlacementAdConverter", "content:%s is vast ad, merge monitors", content.g());
            listP = qc.a(listP, qc.a(vastContentA));
        }
        if (listP.size() > 0) {
            EncryptionField encryptionField2 = new EncryptionField(List.class, Monitor.class);
            encryptionField2.a(listP);
            hVar.E(encryptionField2.b(bArr));
        }
        if (metaDataC == null) {
            return hVar;
        }
        if (vastContentA != null) {
            hw.b("PlacementAdConverter", "content:%s is vast ad, merge meta data", content.g());
            qc.a(metaDataC, vastContentA, 60);
            hVar.c(true);
        }
        hVar.d(metaDataC.i());
        hVar.d(metaDataC.b());
        hVar.c(metaDataC.c());
        hVar.h(metaDataC.k());
        hVar.D(metaDataC.n());
        hVar.B(metaDataC.h());
        hVar.d(metaDataC.H());
        hVar.f(com.huawei.openalliance.ad.utils.dg.e(metaDataC.l()));
        hVar.g(metaDataC.o());
        hVar.b(com.huawei.openalliance.ad.utils.dg.e(metaDataC.a()));
        hVar.C(metaDataC.m());
        hVar.d(metaDataC.u());
        hVar.K(metaDataC.B());
        hVar.q(com.huawei.openalliance.ad.utils.dg.e(content.q()));
        hVar.b(metaDataC.L());
        hVar.e(metaDataC.O());
        hVar.a(metaDataC.t());
        ApkInfo apkInfoS = metaDataC.s();
        if (apkInfoS != null) {
            AppInfo appInfo = new AppInfo(apkInfoS);
            appInfo.m(hVar.getIntent());
            appInfo.v(hVar.getUniqueId());
            appInfo.h(metaDataC.C());
            hVar.a(appInfo);
        }
        MediaFile mediaFileV = metaDataC.v();
        if (mediaFileV != null) {
            hVar.a(new PlacementMediaFile(mediaFileV, metaDataC.y()));
        }
        List<MediaFile> listX = metaDataC.x();
        if (!com.huawei.openalliance.ad.utils.bm.a(listX)) {
            int size = listX.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                arrayList.add(new PlacementMediaFile(listX.get(i), 0L));
            }
            hVar.e(arrayList);
        }
        try {
            hVar.H(com.huawei.openalliance.ad.utils.bk.a(metaDataC));
        } catch (JSONException unused) {
            hw.d("PlacementAdConverter", "MetaData.toJson error");
        }
        hVar.b(content.I());
        hVar.a(content.e());
        hVar.p(content.R());
        hVar.s(com.huawei.openalliance.ad.utils.dg.e(content.Y()));
        hVar.r(content.X());
        hVar.c(content.Z());
        hVar.a(content.ad());
        hVar.d(content.af().booleanValue());
        hVar.t(content.ae());
        return hVar;
    }

    public static ContentRecord a(com.huawei.openalliance.ad.inter.data.h hVar) {
        if (hVar == null) {
            return null;
        }
        ContentRecord contentRecord = new ContentRecord();
        contentRecord.a(hVar.a());
        contentRecord.b(hVar.getMinEffectiveShowTime());
        contentRecord.a(hVar.getMinEffectiveShowRatio());
        contentRecord.b(hVar.r());
        contentRecord.d(hVar.q() == null ? 0 : hVar.q().intValue());
        contentRecord.c(hVar.getShowId());
        contentRecord.d(hVar.M());
        contentRecord.e(hVar.getContentId());
        contentRecord.ag(hVar.F());
        contentRecord.af(hVar.D());
        contentRecord.f(hVar.getTaskId());
        contentRecord.t(hVar.P());
        contentRecord.f(hVar.getStartTime());
        contentRecord.e(hVar.getEndTime());
        String encodedParamFromServer = hVar.getEncodedParamFromServer();
        if (!com.huawei.openalliance.ad.utils.dg.b(encodedParamFromServer)) {
            EncryptionField<String> encryptionField = new EncryptionField<>(String.class);
            encryptionField.a(encodedParamFromServer);
            contentRecord.a(encryptionField);
        }
        contentRecord.b(60);
        contentRecord.k(hVar.getLandWebUrl());
        contentRecord.i(hVar.getInterActionType());
        contentRecord.m(hVar.getIntent());
        contentRecord.b(hVar.J());
        String encodedeMonitors = hVar.getEncodedeMonitors();
        if (!com.huawei.openalliance.ad.utils.dg.b(encodedeMonitors)) {
            EncryptionField<List<Monitor>> encryptionField2 = new EncryptionField<>(List.class, Monitor.class);
            encryptionField2.a(encodedeMonitors);
            contentRecord.b(encryptionField2);
        }
        contentRecord.l(hVar.getShowLandingPageTitleFlag());
        contentRecord.e(hVar.getClickActionList());
        contentRecord.r(hVar.getWebConfig());
        contentRecord.s(hVar.getCtrlSwitchs());
        contentRecord.g(hVar.L());
        contentRecord.x(hVar.O());
        String strN = hVar.N();
        if (!TextUtils.isEmpty(strN)) {
            EncryptionField<String> encryptionField3 = new EncryptionField<>(String.class);
            encryptionField3.a(strN);
            contentRecord.c(encryptionField3);
        }
        contentRecord.a(hVar.isAutoDownloadApp());
        contentRecord.y(hVar.f());
        contentRecord.ad(hVar.B());
        contentRecord.o(hVar.g());
        contentRecord.B(hVar.h() != null ? String.valueOf(hVar.h()) : null);
        contentRecord.v(hVar.getUniqueId());
        contentRecord.u(hVar.getWhyThisAd());
        contentRecord.D(hVar.i());
        contentRecord.E(hVar.j());
        contentRecord.G(hVar.k());
        contentRecord.H(hVar.l());
        contentRecord.d(hVar.m());
        contentRecord.J(hVar.n());
        contentRecord.h(hVar.p());
        contentRecord.d(hVar.s());
        contentRecord.O(hVar.getHwChannelId());
        contentRecord.N(hVar.getAbilityDetailInfo());
        contentRecord.k(hVar.getCompliance());
        contentRecord.R(hVar.c());
        contentRecord.e(hVar.isTransparencyOpen());
        contentRecord.T(hVar.getTransparencyTplUrl());
        contentRecord.U(hVar.A());
        return contentRecord;
    }
}
