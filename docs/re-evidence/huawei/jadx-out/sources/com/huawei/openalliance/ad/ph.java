package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.Monitor;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.EncryptionField;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.LinkedSplashAd;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ph {
    public static LinkedSplashAd a(Context context, ContentRecord contentRecord) {
        LinkedSplashAd linkedSplashAd = new LinkedSplashAd();
        if (!TextUtils.isEmpty(contentRecord.ac())) {
            linkedSplashAd.m(contentRecord.ac());
        }
        linkedSplashAd.a(contentRecord);
        linkedSplashAd.i(contentRecord.ai());
        linkedSplashAd.a(Integer.valueOf(contentRecord.b()));
        linkedSplashAd.b(1);
        linkedSplashAd.a(contentRecord.ag());
        linkedSplashAd.h(contentRecord.O());
        linkedSplashAd.f(contentRecord.K());
        linkedSplashAd.a(contentRecord.F());
        linkedSplashAd.c(contentRecord.o());
        linkedSplashAd.z(contentRecord.bv());
        linkedSplashAd.g(contentRecord.L());
        linkedSplashAd.H(contentRecord.C());
        linkedSplashAd.U(contentRecord.af());
        linkedSplashAd.O(contentRecord.n());
        linkedSplashAd.h(contentRecord.l());
        linkedSplashAd.b(contentRecord.s());
        linkedSplashAd.a(contentRecord.t());
        linkedSplashAd.i(contentRecord.Z());
        linkedSplashAd.e(contentRecord.p());
        linkedSplashAd.R(contentRecord.aa());
        linkedSplashAd.j(contentRecord.ab());
        if (contentRecord.H() != null) {
            linkedSplashAd.E(contentRecord.H().b());
        }
        linkedSplashAd.j(contentRecord.D());
        linkedSplashAd.g(contentRecord.I());
        linkedSplashAd.K(contentRecord.h());
        if (contentRecord.M() != null) {
            linkedSplashAd.L(contentRecord.M().b());
        }
        linkedSplashAd.l(contentRecord.Q());
        linkedSplashAd.M(contentRecord.W());
        linkedSplashAd.N(contentRecord.X());
        if (contentRecord.ad() != null) {
            linkedSplashAd.S(contentRecord.ad().b());
        }
        linkedSplashAd.a(new VideoInfo(contentRecord.T()));
        MetaData metaDataJ = contentRecord.j();
        if (metaDataJ != null) {
            linkedSplashAd.F(com.huawei.openalliance.ad.utils.dg.e(metaDataJ.e()));
            linkedSplashAd.G(com.huawei.openalliance.ad.utils.dg.e(metaDataJ.f()));
            linkedSplashAd.H(metaDataJ.h());
            linkedSplashAd.d(metaDataJ.H());
            linkedSplashAd.d(metaDataJ.i());
            linkedSplashAd.k(metaDataJ.k());
            linkedSplashAd.f(com.huawei.openalliance.ad.utils.dg.e(contentRecord.j().l()));
            linkedSplashAd.I(metaDataJ.m());
            linkedSplashAd.J(metaDataJ.n());
            linkedSplashAd.g(metaDataJ.o());
            linkedSplashAd.b(com.huawei.openalliance.ad.utils.dg.e(metaDataJ.a()));
            linkedSplashAd.U(metaDataJ.B());
            ApkInfo apkInfoS = metaDataJ.s();
            if (apkInfoS != null) {
                AppInfo appInfo = new AppInfo(apkInfoS);
                appInfo.m(linkedSplashAd.getIntent());
                appInfo.v(linkedSplashAd.getUniqueId());
                appInfo.h(metaDataJ.C());
                linkedSplashAd.a(appInfo);
            }
            linkedSplashAd.d(metaDataJ.u());
        }
        linkedSplashAd.g(contentRecord.q());
        linkedSplashAd.A(contentRecord.R());
        linkedSplashAd.q(contentRecord.P());
        linkedSplashAd.C(contentRecord.g());
        linkedSplashAd.D(contentRecord.N());
        linkedSplashAd.h(contentRecord.ak());
        linkedSplashAd.i(contentRecord.al());
        linkedSplashAd.B(contentRecord.A());
        linkedSplashAd.a(contentRecord.b(context));
        linkedSplashAd.p(contentRecord.aI());
        linkedSplashAd.c(contentRecord.aO());
        linkedSplashAd.a(contentRecord.bb());
        linkedSplashAd.d(contentRecord.bf());
        linkedSplashAd.t(contentRecord.be());
        linkedSplashAd.u(contentRecord.bi());
        linkedSplashAd.f(contentRecord.aZ());
        return linkedSplashAd;
    }

    public static ContentRecord a(LinkedSplashAd linkedSplashAd) {
        if (linkedSplashAd == null) {
            return null;
        }
        ContentRecord contentRecord = new ContentRecord();
        contentRecord.c(linkedSplashAd.getShowId());
        contentRecord.a(linkedSplashAd.a());
        contentRecord.d(linkedSplashAd.getSlotId());
        contentRecord.e(linkedSplashAd.getContentId());
        contentRecord.ag(linkedSplashAd.F());
        contentRecord.f(linkedSplashAd.getStartTime());
        contentRecord.e(linkedSplashAd.getEndTime());
        contentRecord.g(linkedSplashAd.ac());
        contentRecord.f(linkedSplashAd.getTaskId());
        contentRecord.t(linkedSplashAd.ak());
        contentRecord.u(linkedSplashAd.getWhyThisAd());
        contentRecord.k(linkedSplashAd.getCreativeType());
        String strR = linkedSplashAd.R();
        if (!com.huawei.openalliance.ad.utils.dg.b(strR)) {
            EncryptionField<String> encryptionField = new EncryptionField<>(String.class);
            encryptionField.a(strR);
            contentRecord.a(encryptionField);
        }
        contentRecord.b(1);
        contentRecord.k(linkedSplashAd.getLandWebUrl());
        contentRecord.i(linkedSplashAd.getInterActionType());
        contentRecord.m(linkedSplashAd.getIntent());
        contentRecord.b(linkedSplashAd.W());
        String strX = linkedSplashAd.X();
        if (!com.huawei.openalliance.ad.utils.dg.b(strX)) {
            EncryptionField<List<Monitor>> encryptionField2 = new EncryptionField<>(List.class, Monitor.class);
            encryptionField2.a(strX);
            contentRecord.b(encryptionField2);
        }
        contentRecord.l(linkedSplashAd.Y());
        contentRecord.e(linkedSplashAd.Z());
        contentRecord.r(linkedSplashAd.ab());
        contentRecord.s(linkedSplashAd.getCtrlSwitchs());
        contentRecord.v(linkedSplashAd.getUniqueId());
        String strAl = linkedSplashAd.al();
        if (!TextUtils.isEmpty(strAl)) {
            EncryptionField<String> encryptionField3 = new EncryptionField<>(String.class);
            encryptionField3.a(strAl);
            contentRecord.c(encryptionField3);
        }
        contentRecord.a(linkedSplashAd.isAutoDownloadApp());
        contentRecord.x(linkedSplashAd.an());
        contentRecord.y(linkedSplashAd.f());
        contentRecord.a(linkedSplashAd.getAdCloseKeyWords());
        contentRecord.b(linkedSplashAd.V());
        contentRecord.p(linkedSplashAd.J());
        contentRecord.o(linkedSplashAd.u());
        contentRecord.e(linkedSplashAd.I());
        contentRecord.a(linkedSplashAd.L());
        contentRecord.n(linkedSplashAd.M());
        contentRecord.m(linkedSplashAd.N());
        contentRecord.n(linkedSplashAd.O());
        contentRecord.i(linkedSplashAd.K());
        contentRecord.d(linkedSplashAd.m());
        contentRecord.J(linkedSplashAd.n());
        contentRecord.d(linkedSplashAd.s());
        contentRecord.R(linkedSplashAd.c());
        contentRecord.U(linkedSplashAd.A());
        contentRecord.t(linkedSplashAd.x());
        return contentRecord;
    }
}
