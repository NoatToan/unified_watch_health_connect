package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.AdEvent;
import com.huawei.openalliance.ad.beans.metadata.AppCollectInfo;
import com.huawei.openalliance.ad.beans.metadata.AppCollection;
import com.huawei.openalliance.ad.beans.metadata.BluetoothInfo;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.NegativeFb;
import com.huawei.openalliance.ad.beans.metadata.ParamFromServer;
import com.huawei.openalliance.ad.beans.metadata.Precontent;
import com.huawei.openalliance.ad.beans.metadata.Skip;
import com.huawei.openalliance.ad.beans.metadata.Template;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.beans.metadata.WifiInfo;
import com.huawei.openalliance.ad.db.bean.AppDataCollectionRecord;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.EncryptionField;
import com.huawei.openalliance.ad.db.bean.EventRecord;
import com.huawei.openalliance.ad.db.bean.PlacementRecord;
import com.huawei.openalliance.ad.db.bean.TemplateRecord;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public abstract class pn {
    private static void c(Content content, ContentRecord contentRecord) {
        int iE;
        contentRecord.b(content.d());
        MetaData metaDataC = content.c();
        if (metaDataC == null) {
            return;
        }
        contentRecord.d(metaDataC.c() == null ? 0 : metaDataC.c().intValue());
        contentRecord.a(metaDataC.k());
        contentRecord.b(metaDataC.i());
        contentRecord.c(metaDataC.j());
        contentRecord.b(metaDataC.b());
        contentRecord.m(metaDataC.o());
        contentRecord.k(metaDataC.h());
        contentRecord.f(metaDataC.w());
        VideoInfo videoInfoD = metaDataC.d();
        if (videoInfoD != null) {
            Float fM = videoInfoD.m();
            if (fM != null) {
                iE = (int) ((720 * 1.0f) / fM.floatValue());
                contentRecord.f(720);
                contentRecord.g(iE);
            }
        } else {
            List<ImageInfo> listP = metaDataC.p();
            if (listP != null && listP.size() > 0) {
                ImageInfo imageInfo = listP.get(0);
                contentRecord.i(imageInfo.c());
                contentRecord.f(imageInfo.d());
                iE = imageInfo.e();
                contentRecord.g(iE);
            }
        }
        contentRecord.x(metaDataC.B());
    }

    private static void b(EventRecord eventRecord, AdEvent adEvent) {
        if (eventRecord == null || adEvent == null) {
            return;
        }
        if (-111111 != eventRecord.V()) {
            adEvent.r(Integer.valueOf(eventRecord.V()));
        }
        if (-111111 != eventRecord.Y()) {
            adEvent.s(Integer.valueOf(eventRecord.Y()));
        }
        if (-111111 != eventRecord.af()) {
            adEvent.t(Integer.valueOf(eventRecord.af()));
        }
        if (-111111 != eventRecord.an()) {
            adEvent.f(Long.valueOf(eventRecord.an()));
        }
        if (-111111 != eventRecord.ao()) {
            adEvent.g(Long.valueOf(eventRecord.ao()));
        }
        if (-111111 != eventRecord.ah()) {
            adEvent.y(Integer.valueOf(eventRecord.ah()));
        }
        if (-111111 != eventRecord.ai()) {
            adEvent.z(Integer.valueOf(eventRecord.ai()));
        }
        if (-111111.0f != eventRecord.aq()) {
            adEvent.a(Float.valueOf(eventRecord.aq()));
        }
        if (-111111.0f != eventRecord.ar()) {
            adEvent.b(Float.valueOf(eventRecord.ar()));
        }
        if (-111111.0f != eventRecord.as()) {
            adEvent.c(Float.valueOf(eventRecord.as()));
        }
        if (-111111.0f != eventRecord.at()) {
            adEvent.d(Float.valueOf(eventRecord.at()));
        }
        if (-111111 != eventRecord.au()) {
            adEvent.A(Integer.valueOf(eventRecord.au()));
        }
        if (-111111 != eventRecord.av()) {
            adEvent.B(Integer.valueOf(eventRecord.av()));
        }
        if (!com.huawei.openalliance.ad.utils.dg.b(eventRecord.ap())) {
            adEvent.t(eventRecord.ap());
        }
        a(eventRecord, adEvent);
    }

    private static void b(Content content, ContentRecord contentRecord) {
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
        contentRecord.j(arrayList);
    }

    public static List<AppCollection> b(Collection<AppDataCollectionRecord> collection, Context context) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        byte[] bArrB = com.huawei.openalliance.ad.utils.cw.b(context);
        ArrayList arrayList = new ArrayList();
        for (AppDataCollectionRecord appDataCollectionRecord : collection) {
            AppCollection appCollection = new AppCollection();
            appCollection.a(Long.valueOf(appDataCollectionRecord.o()));
            appCollection.a(appDataCollectionRecord.b());
            appCollection.b(appDataCollectionRecord.p());
            appCollection.c(appDataCollectionRecord.q());
            appCollection.d(appDataCollectionRecord.r());
            appCollection.e(appDataCollectionRecord.s());
            appCollection.b(com.huawei.openalliance.ad.utils.dg.k(appDataCollectionRecord.c()));
            appCollection.a(com.huawei.openalliance.ad.utils.dg.j(appDataCollectionRecord.d()));
            appCollection.f(appDataCollectionRecord.e());
            appCollection.g(appDataCollectionRecord.f());
            appCollection.b(Integer.valueOf(appDataCollectionRecord.g()));
            appCollection.h(appDataCollectionRecord.h());
            appCollection.o(appDataCollectionRecord.t());
            appCollection.n(appDataCollectionRecord.i());
            EncryptionField<List<AppCollectInfo>> encryptionFieldX = appDataCollectionRecord.X();
            if (encryptionFieldX != null) {
                List<AppCollectInfo> listA = encryptionFieldX.a(bArrB);
                if (!com.huawei.openalliance.ad.utils.bm.a(listA)) {
                    appCollection.a(listA);
                }
            }
            appCollection.p(appDataCollectionRecord.u());
            appCollection.q(appDataCollectionRecord.v());
            appCollection.r(appDataCollectionRecord.w());
            appCollection.s(appDataCollectionRecord.x());
            appCollection.t(appDataCollectionRecord.y());
            appCollection.i(appDataCollectionRecord.j());
            appCollection.j(appDataCollectionRecord.k());
            appCollection.k(appDataCollectionRecord.l());
            appCollection.l(appDataCollectionRecord.m());
            appCollection.m(appDataCollectionRecord.n());
            appCollection.u(appDataCollectionRecord.z());
            appCollection.v(appDataCollectionRecord.A());
            appCollection.w(appDataCollectionRecord.B());
            appCollection.x(appDataCollectionRecord.C());
            appCollection.y(appDataCollectionRecord.D());
            appCollection.z(appDataCollectionRecord.E());
            appCollection.A(appDataCollectionRecord.F());
            appCollection.B(appDataCollectionRecord.G());
            appCollection.C(appDataCollectionRecord.H());
            appCollection.D(appDataCollectionRecord.I());
            appCollection.E(appDataCollectionRecord.J());
            appCollection.F(appDataCollectionRecord.K());
            appCollection.G(appDataCollectionRecord.L());
            appCollection.H(appDataCollectionRecord.M());
            appCollection.I(appDataCollectionRecord.N());
            appCollection.J(appDataCollectionRecord.O());
            appCollection.K(appDataCollectionRecord.P());
            appCollection.L(appDataCollectionRecord.Q());
            appCollection.M(appDataCollectionRecord.R());
            appCollection.N(appDataCollectionRecord.S());
            appCollection.ag(appDataCollectionRecord.aq());
            appCollection.a(appDataCollectionRecord.a());
            appCollection.d(com.huawei.openalliance.ad.utils.dg.j(appDataCollectionRecord.U()));
            appCollection.c(com.huawei.openalliance.ad.utils.dg.j(appDataCollectionRecord.T()));
            EncryptionField<List<BluetoothInfo>> encryptionFieldV = appDataCollectionRecord.V();
            if (encryptionFieldV != null) {
                List<BluetoothInfo> listA2 = encryptionFieldV.a(bArrB);
                if (!com.huawei.openalliance.ad.utils.bm.a(listA2)) {
                    appCollection.b(com.huawei.openalliance.ad.utils.s.a(listA2));
                }
            }
            EncryptionField<List<WifiInfo>> encryptionFieldW = appDataCollectionRecord.W();
            if (encryptionFieldW != null) {
                List<WifiInfo> listA3 = encryptionFieldW.a(bArrB);
                if (!com.huawei.openalliance.ad.utils.bm.a(listA3)) {
                    appCollection.c(listA3);
                }
            }
            appCollection.c(Long.valueOf(com.huawei.openalliance.ad.utils.dk.f()));
            appCollection.O(appDataCollectionRecord.Y());
            appCollection.P(appDataCollectionRecord.Z());
            EncryptionField<String> encryptionFieldAa = appDataCollectionRecord.aa();
            if (encryptionFieldAa != null) {
                String strA = encryptionFieldAa.a(bArrB);
                if (!com.huawei.openalliance.ad.utils.dg.b(strA)) {
                    appCollection.Q(strA);
                }
            }
            appCollection.R(appDataCollectionRecord.ab());
            appCollection.S(appDataCollectionRecord.ac());
            appCollection.T(appDataCollectionRecord.ad());
            appCollection.U(appDataCollectionRecord.ae());
            appCollection.V(appDataCollectionRecord.af());
            appCollection.W(appDataCollectionRecord.ag());
            appCollection.X(appDataCollectionRecord.ah());
            appCollection.Y(appDataCollectionRecord.ai());
            appCollection.Z(appDataCollectionRecord.aj());
            appCollection.aa(appDataCollectionRecord.ak());
            appCollection.ad(appDataCollectionRecord.an());
            appCollection.ae(appDataCollectionRecord.ao());
            appCollection.ab(appDataCollectionRecord.al());
            appCollection.ac(appDataCollectionRecord.am());
            appCollection.af(appDataCollectionRecord.ap());
            arrayList.add(appCollection);
        }
        return arrayList;
    }

    public static PlacementRecord b(String str, Precontent precontent, int i) {
        PlacementRecord placementRecordA = a(str, new Content(precontent), i);
        if (placementRecordA != null) {
            placementRecordA.e(0);
        }
        return placementRecordA;
    }

    public static void a(EventRecord eventRecord, AdEvent adEvent) {
        if (eventRecord == null || adEvent == null) {
            return;
        }
        if (!com.huawei.openalliance.ad.utils.dg.b(eventRecord.W())) {
            adEvent.e(eventRecord.W());
        }
        if (com.huawei.openalliance.ad.utils.dg.b(eventRecord.X())) {
            return;
        }
        adEvent.f(eventRecord.X());
    }

    private static void a(EventRecord eventRecord, Context context, AdEvent adEvent) {
        EncryptionField<String> encryptionFieldN = eventRecord.n();
        if (encryptionFieldN != null) {
            byte[] bArrBw = eventRecord.bw();
            String strA = bArrBw != null ? encryptionFieldN.a(bArrBw) : encryptionFieldN.a(context);
            if (!com.huawei.openalliance.ad.utils.dg.b(strA)) {
                adEvent.a((ParamFromServer) com.huawei.openalliance.ad.utils.bk.b(strA, ParamFromServer.class, new Class[0]));
            }
        }
        EncryptionField<String> encryptionFieldR = eventRecord.r();
        if (encryptionFieldR != null) {
            byte[] bArrBw2 = eventRecord.bw();
            String strA2 = bArrBw2 != null ? encryptionFieldR.a(bArrBw2) : encryptionFieldR.a(context);
            if (com.huawei.openalliance.ad.utils.dg.b(strA2)) {
                return;
            }
            adEvent.g(strA2);
        }
    }

    private static void a(Content content, ContentRecord contentRecord) {
        contentRecord.a(content.b());
        contentRecord.n(content.s());
        Skip skipG = content.G();
        if (skipG != null) {
            if (!TextUtils.isEmpty(skipG.a())) {
                contentRecord.n(skipG.a());
            }
            if (skipG.b() > 0) {
                contentRecord.n(skipG.b());
            }
            if (skipG.c() > 0) {
                contentRecord.m(skipG.c());
            }
        }
    }

    public static List<AdEvent> a(Collection<EventRecord> collection, Context context) {
        ArrayList arrayList = new ArrayList();
        if (!com.huawei.openalliance.ad.utils.bm.a(collection)) {
            byte[] bArrB = com.huawei.openalliance.ad.utils.cw.b(context);
            for (EventRecord eventRecord : collection) {
                eventRecord.a(bArrB);
                AdEvent adEventA = a(eventRecord, context);
                if (adEventA != null) {
                    arrayList.add(adEventA);
                }
            }
        }
        return arrayList;
    }

    public static Collection<AppDataCollectionRecord> a(List<AppCollection> list, String str) {
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AppCollection appCollection : list) {
            AppDataCollectionRecord appDataCollectionRecord = new AppDataCollectionRecord();
            appDataCollectionRecord.a(appCollection.c());
            appDataCollectionRecord.b(appCollection.b().longValue());
            appDataCollectionRecord.m(appCollection.d());
            appDataCollectionRecord.n(appCollection.e());
            appDataCollectionRecord.o(appCollection.f());
            appDataCollectionRecord.p(appCollection.g());
            if (appCollection.h() != null) {
                appDataCollectionRecord.b(String.valueOf(appCollection.h()));
            }
            if (appCollection.i() != null) {
                appDataCollectionRecord.c(String.valueOf(appCollection.i()));
            }
            appDataCollectionRecord.d(appCollection.j());
            appDataCollectionRecord.e(appCollection.k());
            appDataCollectionRecord.a(appCollection.l().intValue());
            appDataCollectionRecord.f(appCollection.m());
            appDataCollectionRecord.g(appCollection.n());
            appDataCollectionRecord.h(appCollection.o());
            appDataCollectionRecord.i(appCollection.p());
            appDataCollectionRecord.j(appCollection.q());
            appDataCollectionRecord.k(appCollection.r());
            appDataCollectionRecord.l(str);
            appDataCollectionRecord.q(appCollection.t());
            appDataCollectionRecord.r(appCollection.u());
            appDataCollectionRecord.s(appCollection.v());
            appDataCollectionRecord.t(appCollection.w());
            appDataCollectionRecord.u(appCollection.x());
            appDataCollectionRecord.v(appCollection.y());
            appDataCollectionRecord.w(appCollection.z());
            appDataCollectionRecord.x(appCollection.A());
            appDataCollectionRecord.y(appCollection.B());
            appDataCollectionRecord.z(appCollection.C());
            appDataCollectionRecord.A(appCollection.D());
            appDataCollectionRecord.B(appCollection.E());
            appDataCollectionRecord.C(appCollection.F());
            appDataCollectionRecord.D(appCollection.G());
            appDataCollectionRecord.E(appCollection.H());
            appDataCollectionRecord.F(appCollection.I());
            appDataCollectionRecord.G(appCollection.J());
            appDataCollectionRecord.H(appCollection.K());
            appDataCollectionRecord.I(appCollection.L());
            appDataCollectionRecord.J(appCollection.M());
            appDataCollectionRecord.K(appCollection.N());
            appDataCollectionRecord.L(appCollection.O());
            appDataCollectionRecord.M(appCollection.P());
            appDataCollectionRecord.N(appCollection.Q());
            if (appCollection.R() != null) {
                appDataCollectionRecord.O(String.valueOf(appCollection.R()));
            }
            if (appCollection.S() != null) {
                appDataCollectionRecord.P(String.valueOf(appCollection.S()));
            }
            appDataCollectionRecord.Q(appCollection.U());
            appDataCollectionRecord.R(appCollection.V());
            appDataCollectionRecord.a(appCollection.a());
            appDataCollectionRecord.c(appCollection.s());
            appDataCollectionRecord.a(appCollection.T());
            appDataCollectionRecord.b(appCollection.W());
            appDataCollectionRecord.S(appCollection.X());
            appDataCollectionRecord.T(appCollection.Y());
            appDataCollectionRecord.V(appCollection.aa());
            appDataCollectionRecord.U(appCollection.Z());
            appDataCollectionRecord.W(appCollection.ab());
            appDataCollectionRecord.X(appCollection.ac());
            appDataCollectionRecord.Y(appCollection.ad());
            appDataCollectionRecord.Z(appCollection.ae());
            appDataCollectionRecord.aa(appCollection.af());
            appDataCollectionRecord.ab(appCollection.ag());
            appDataCollectionRecord.ac(appCollection.ah());
            appDataCollectionRecord.ad(appCollection.ai());
            appDataCollectionRecord.ae(appCollection.aj());
            appDataCollectionRecord.af(appCollection.ak());
            appDataCollectionRecord.ag(appCollection.al());
            appDataCollectionRecord.ah(appCollection.am());
            appDataCollectionRecord.ai(appCollection.an());
            arrayList.add(appDataCollectionRecord);
        }
        return arrayList;
    }

    public static TemplateRecord a(Template template) {
        if (!template.a()) {
            return null;
        }
        TemplateRecord templateRecord = new TemplateRecord();
        templateRecord.a(template.b());
        templateRecord.b(template.c());
        return templateRecord;
    }

    public static PlacementRecord a(String str, Content content, int i) {
        if (com.huawei.openalliance.ad.utils.dg.b(str) || content == null) {
            return null;
        }
        PlacementRecord placementRecord = new PlacementRecord();
        placementRecord.a(str);
        placementRecord.f(i);
        String strM = content.m();
        if (strM != null) {
            placementRecord.c(strM);
        }
        placementRecord.b(content.u());
        placementRecord.b(content.g());
        placementRecord.l(content.ao());
        placementRecord.b(content.f());
        placementRecord.h(content.w());
        placementRecord.b(content.j());
        placementRecord.a(content.l());
        placementRecord.c(content.r());
        placementRecord.a(content.p());
        placementRecord.e(1);
        placementRecord.d(content.x());
        placementRecord.a(content.k());
        placementRecord.f(content.h());
        placementRecord.g(content.v());
        MetaData metaDataC = content.c();
        if (metaDataC != null) {
            placementRecord.e(com.huawei.openalliance.ad.utils.bk.b(metaDataC));
            placementRecord.d(metaDataC.o());
            placementRecord.i(metaDataC.h());
            placementRecord.a(metaDataC.v());
            if (metaDataC.x() != null) {
                placementRecord.c(metaDataC.x());
            }
            placementRecord.j(metaDataC.B());
        }
        placementRecord.k(content.I() != null ? String.valueOf(content.I()) : null);
        return placementRecord;
    }

    public static ContentRecord a(String str, Precontent precontent, int i) {
        ContentRecord contentRecordA = a(str, new Content(precontent), i, null, true);
        if (contentRecordA != null) {
            contentRecordA.c(0);
            contentRecordA.f(true);
        }
        return contentRecordA;
    }

    private static ContentRecord a(String str, Content content, int i, String str2, boolean z) {
        if (content == null || (!z && com.huawei.openalliance.ad.utils.dg.b(str))) {
            return null;
        }
        ContentRecord contentRecord = new ContentRecord();
        contentRecord.a(content.a());
        contentRecord.h(0);
        contentRecord.h(com.huawei.openalliance.ad.utils.as.b("yyyy-MM-dd"));
        contentRecord.i(content.l());
        contentRecord.k(content.f());
        contentRecord.e(content.g());
        contentRecord.af(content.ao());
        contentRecord.f(content.h());
        contentRecord.d(str);
        contentRecord.e(content.j());
        contentRecord.f(content.k());
        contentRecord.e(content.i());
        contentRecord.j(0);
        contentRecord.g(com.huawei.openalliance.ad.utils.as.c());
        contentRecord.a(content.n());
        contentRecord.b(content.o());
        contentRecord.g(content.z());
        contentRecord.t(content.A());
        contentRecord.c(content.J() != 0);
        contentRecord.F(content.M());
        String strM = content.m();
        if (strM != null) {
            contentRecord.l(strM);
        }
        contentRecord.b(i);
        a(content, contentRecord);
        c(content, contentRecord);
        contentRecord.c(content.p());
        contentRecord.o(com.huawei.openalliance.ad.utils.dg.e(content.q()));
        contentRecord.p(content.t());
        contentRecord.l(content.r());
        contentRecord.e(content.u());
        contentRecord.r(content.v());
        contentRecord.s(content.w());
        contentRecord.w(content.B());
        contentRecord.I(content.O());
        contentRecord.u(content.D());
        contentRecord.z(content.E());
        contentRecord.A(content.F());
        contentRecord.e(content.af().booleanValue());
        contentRecord.T(content.ae());
        contentRecord.o(content.H());
        contentRecord.B(content.I() != null ? String.valueOf(content.I()) : null);
        if (content.L() != null) {
            contentRecord.q(content.L().intValue());
        }
        if (content.K() != null) {
            contentRecord.p(content.K().intValue());
        }
        contentRecord.r(content.N());
        contentRecord.h(content.P());
        contentRecord.i(content.Q());
        contentRecord.d(content.e());
        contentRecord.J(content.R());
        contentRecord.K(str2);
        contentRecord.a(content.S());
        b(content, contentRecord);
        if (content.W() != null) {
            contentRecord.L(content.W().a());
            contentRecord.a(content.W().b());
            contentRecord.Q(content.W().c());
            contentRecord.Z(content.W().d());
            contentRecord.aa(content.W().e());
            contentRecord.ab(content.W().f());
        }
        contentRecord.l(content.V());
        contentRecord.ac(content.am());
        contentRecord.s(content.U() == null ? -1 : content.U().intValue());
        contentRecord.N(content.X());
        contentRecord.O(com.huawei.openalliance.ad.utils.dg.e(content.Y()));
        contentRecord.k(content.Z());
        contentRecord.a(content.aa());
        if (1 == i) {
            contentRecord.v(UUID.randomUUID().toString());
        }
        contentRecord.t(content.ab());
        contentRecord.R(content.ad());
        contentRecord.ag(content.ah());
        contentRecord.W(content.ai());
        contentRecord.a(content.aj());
        contentRecord.X(content.ak());
        contentRecord.Y(content.al());
        contentRecord.ae(content.an());
        qc.a(contentRecord);
        return contentRecord;
    }

    public static ContentRecord a(String str, Content content, int i, String str2) {
        ContentRecord contentRecordA = a(str, content, i, str2, false);
        if (contentRecordA != null) {
            contentRecordA.c(1);
        }
        return contentRecordA;
    }

    public static ContentRecord a(AdLandingPageData adLandingPageData) {
        return adLandingPageData == null ? new ContentRecord() : adLandingPageData.z();
    }

    private static AdEvent a(EventRecord eventRecord, Context context) {
        if (eventRecord == null) {
            return null;
        }
        AdEvent adEvent = new AdEvent();
        adEvent.c(eventRecord.j());
        adEvent.a(eventRecord.k());
        adEvent.a(eventRecord.o());
        adEvent.b(eventRecord.p());
        adEvent.c(eventRecord.q());
        adEvent.d(eventRecord.i());
        adEvent.b(eventRecord.l());
        adEvent.a(eventRecord.s());
        adEvent.b(eventRecord.t());
        adEvent.b(eventRecord.w());
        adEvent.h(eventRecord.u());
        adEvent.i(eventRecord.v());
        adEvent.d(com.huawei.openalliance.ad.utils.dg.j(eventRecord.x()));
        adEvent.c(eventRecord.y());
        adEvent.e(com.huawei.openalliance.ad.utils.dg.j(eventRecord.z()));
        adEvent.f(com.huawei.openalliance.ad.utils.dg.j(eventRecord.A()));
        adEvent.g(com.huawei.openalliance.ad.utils.dg.j(eventRecord.B()));
        adEvent.h(com.huawei.openalliance.ad.utils.dg.j(eventRecord.C()));
        adEvent.n(eventRecord.T());
        adEvent.o(eventRecord.U());
        adEvent.i(com.huawei.openalliance.ad.utils.dg.j(eventRecord.D()));
        adEvent.j(com.huawei.openalliance.ad.utils.dg.j(eventRecord.E()));
        adEvent.j(eventRecord.F());
        adEvent.k(com.huawei.openalliance.ad.utils.dg.j(eventRecord.J()));
        adEvent.d(com.huawei.openalliance.ad.utils.dg.k(eventRecord.I()));
        adEvent.l(com.huawei.openalliance.ad.utils.dg.j(eventRecord.L()));
        adEvent.m(com.huawei.openalliance.ad.utils.dg.j(eventRecord.H()));
        adEvent.k(eventRecord.a());
        adEvent.n(com.huawei.openalliance.ad.utils.dg.j(eventRecord.K()));
        adEvent.o(Integer.valueOf(eventRecord.M()));
        adEvent.l(eventRecord.N());
        adEvent.m(eventRecord.O());
        adEvent.p(Integer.valueOf(eventRecord.Q()));
        adEvent.q(eventRecord.P());
        adEvent.p(eventRecord.Z());
        adEvent.q(eventRecord.aa());
        adEvent.s(eventRecord.aj());
        if (-111111 != eventRecord.ak()) {
            adEvent.x(Integer.valueOf(eventRecord.ak()));
        }
        if (-111111 != eventRecord.h()) {
            adEvent.a(Integer.valueOf(eventRecord.h()));
        }
        if (-111111 != eventRecord.b()) {
            adEvent.a(Long.valueOf(eventRecord.b()));
        }
        adEvent.a(eventRecord.c());
        if (-111111 != eventRecord.d()) {
            adEvent.b(Long.valueOf(eventRecord.d()));
        }
        if (-111111 != eventRecord.e()) {
            adEvent.c(Long.valueOf(eventRecord.e()));
        }
        if (-111111 != eventRecord.f()) {
            adEvent.b(Integer.valueOf(eventRecord.f()));
        }
        if (-111111 != eventRecord.g()) {
            adEvent.c(Integer.valueOf(eventRecord.g()));
        }
        if (-111111 != eventRecord.ab() && eventRecord.ab() > 0) {
            adEvent.e(Long.valueOf(eventRecord.ab()));
        }
        if (-111111 != eventRecord.ac()) {
            adEvent.u(Integer.valueOf(eventRecord.ac()));
            adEvent.v(Integer.valueOf(eventRecord.ac()));
        }
        adEvent.r(eventRecord.ad());
        if (-111111 != eventRecord.ae()) {
            adEvent.w(Integer.valueOf(eventRecord.ae()));
        }
        b(eventRecord, adEvent);
        a(eventRecord, context, adEvent);
        return adEvent;
    }
}
