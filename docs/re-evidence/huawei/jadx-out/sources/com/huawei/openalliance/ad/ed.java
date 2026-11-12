package com.huawei.openalliance.ad;

import com.google.flatbuffers.FlatBufferBuilder;
import com.huawei.openalliance.ad.inter.data.fb.NativeAdFb;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes41.dex */
public class ed {
    public static byte[] a(com.huawei.openalliance.ad.inter.data.e eVar) {
        String str;
        if (eVar == null) {
            str = "toFlatBuffersBytes native ad is null";
        } else {
            try {
                FlatBufferBuilder flatBufferBuilder = new FlatBufferBuilder(0);
                int[] iArrJ = ee.j(eVar.m(), flatBufferBuilder);
                int[] iArrK = ee.k(eVar.t(), flatBufferBuilder);
                int[] iArrI = ee.i(eVar.getCompliance(), flatBufferBuilder);
                int iA = ee.a(eVar.getIcon(), flatBufferBuilder);
                int[] iArrH = ee.h(eVar.getImageInfos(), flatBufferBuilder);
                int[] iArrH2 = ee.h(eVar.getRawImageInfos(), flatBufferBuilder);
                int iA2 = ee.a(eVar.getVideoInfo(), flatBufferBuilder);
                int iA3 = ee.a(eVar.getAppInfo(), flatBufferBuilder);
                int iA4 = ee.a(eVar.getAudioInfo(), flatBufferBuilder);
                int[] iArrF = ee.f(eVar.ar(), flatBufferBuilder);
                int[] iArrE = ee.e(eVar.as(), flatBufferBuilder);
                int[] iArrD = ee.d(eVar.getFeedbackInfoList(), flatBufferBuilder);
                int[] iArrC = ee.c(eVar.af(), flatBufferBuilder);
                flatBufferBuilder.finish(NativeAdFb.createNativeAdFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(eVar.getShowId())), flatBufferBuilder.createString(ef.a(eVar.getContentId())), eVar.getEndTime(), flatBufferBuilder.createString(ef.a(eVar.getCta())), flatBufferBuilder.createString(ef.a(eVar.getAdSign())), eVar.getCreativeType(), eVar.w(), flatBufferBuilder.createString(ef.a(eVar.getTaskId())), flatBufferBuilder.createString(ef.a(eVar.getLabel())), eVar.getStartTime(), flatBufferBuilder.createString(ef.a(eVar.getIntent())), eVar.e(), flatBufferBuilder.createString(ef.a(eVar.f())), eVar.g(), flatBufferBuilder.createString(ef.a(eVar.getWhyThisAd())), flatBufferBuilder.createString(ef.a(eVar.getAdChoiceUrl())), flatBufferBuilder.createString(ef.a(eVar.getAdChoiceIcon())), eVar.h() == null ? 5 : eVar.h().intValue(), flatBufferBuilder.createString(ef.a(eVar.i())), flatBufferBuilder.createString(ef.a(eVar.j())), flatBufferBuilder.createString(ef.a(eVar.k())), flatBufferBuilder.createString(ef.a(eVar.l())), NativeAdFb.createOmVector(flatBufferBuilder, iArrJ), flatBufferBuilder.createString(ef.a(eVar.n())), flatBufferBuilder.createString(ef.a(eVar.getUniqueId())), eVar.o(), eVar.p(), eVar.q() == null ? 0 : eVar.q().intValue(), eVar.r() == null ? 0 : eVar.r().intValue(), eVar.s(), NativeAdFb.createAdSourcesVector(flatBufferBuilder, iArrK), flatBufferBuilder.createString(ef.a(eVar.u())), flatBufferBuilder.createString(ef.a(eVar.getAbilityDetailInfo())), flatBufferBuilder.createString(ef.a(eVar.getHwChannelId())), NativeAdFb.createComplianceVector(flatBufferBuilder, iArrI), eVar.isClicked(), eVar.getInterActionType(), flatBufferBuilder.createString(ef.a(eVar.R())), flatBufferBuilder.createString(ef.a(eVar.getTitle())), flatBufferBuilder.createString(ef.a(eVar.getDescription())), iA, NativeAdFb.createImageInfosVector(flatBufferBuilder, iArrH), NativeAdFb.createRawImageInfosVector(flatBufferBuilder, iArrH2), flatBufferBuilder.createString(ef.a(eVar.getLandWebUrl())), eVar.getMinEffectiveShowTime(), eVar.getMinEffectiveShowRatio(), flatBufferBuilder.createString(ef.a(eVar.S())), flatBufferBuilder.createString(ef.a(eVar.T())), iA2, NativeAdFb.createAdCloseKeyWordsVector(flatBufferBuilder, ef.a(eVar.getAdCloseKeyWords(), flatBufferBuilder)), NativeAdFb.createAdCloseKeyWordsTypeVector(flatBufferBuilder, ef.a(eVar.V(), flatBufferBuilder)), iA3, flatBufferBuilder.createString(ef.a(eVar.W())), flatBufferBuilder.createString(ef.a(eVar.X())), iA4, eVar.Y(), NativeAdFb.createClickActionListVector(flatBufferBuilder, ef.a(eVar.Z())), eVar.aa(), flatBufferBuilder.createString(ef.a(eVar.ab())), flatBufferBuilder.createString(ef.a(eVar.getCtrlSwitchs())), NativeAdFb.createNoReportEventListVector(flatBufferBuilder, ef.a(eVar.ac(), flatBufferBuilder)), flatBufferBuilder.createString(ef.a(eVar.getSlotId())), eVar.ad(), flatBufferBuilder.createString(ef.a(eVar.ak())), flatBufferBuilder.createString(ef.a(eVar.al())), flatBufferBuilder.createString(ef.a(eVar.am())), eVar.az(), flatBufferBuilder.createString(ef.a(eVar.an())), NativeAdFb.createInvalidcontentidsVector(flatBufferBuilder, ef.a(eVar.getInvalidContentIds(), flatBufferBuilder)), eVar.ao(), flatBufferBuilder.createString(ef.a(eVar.K())), eVar.aA(), flatBufferBuilder.createString(ef.a(eVar.aq())), eVar.aB(), NativeAdFb.createExtVector(flatBufferBuilder, iArrF), NativeAdFb.createContentExtsVector(flatBufferBuilder, iArrE), NativeAdFb.createFeedbackInfoListVector(flatBufferBuilder, iArrD), flatBufferBuilder.createString(ef.a(eVar.ae())), NativeAdFb.createAssetsVector(flatBufferBuilder, iArrC), ee.a(eVar.ag(), flatBufferBuilder), flatBufferBuilder.createString(ef.a(eVar.ah())), eVar.ai() == null ? 0 : eVar.ai().intValue(), ee.a(eVar.aj(), flatBufferBuilder), eVar.at(), flatBufferBuilder.createByteVector(eVar.au()), flatBufferBuilder.createString(ef.a(eVar.av())), NativeAdFb.createMonitorsVector(flatBufferBuilder, ee.a(eVar.aw(), flatBufferBuilder)), flatBufferBuilder.createString(ef.a(eVar.ax())), flatBufferBuilder.createString(ef.a(eVar.ay())), flatBufferBuilder.createString(ef.a(eVar.c())), eVar.y() != null ? eVar.y().intValue() : 0, eVar.isTransparencyOpen(), flatBufferBuilder.createString(ef.a(eVar.getTransparencyTplUrl())), flatBufferBuilder.createString(ef.a(eVar.A())), ee.a(eVar.getPromoteInfo(), flatBufferBuilder), eVar.x(), flatBufferBuilder.createString(ef.a(eVar.aC())), flatBufferBuilder.createString(ef.a(eVar.aD())), eVar.b(), NativeAdFb.createSubDescriptionVector(flatBufferBuilder, ef.a(eVar.getSubDescription(), flatBufferBuilder)), ee.a(eVar.getBiddingInfo(), flatBufferBuilder), flatBufferBuilder.createString(ef.a(eVar.aE())), flatBufferBuilder.createString(ef.a(eVar.aF())), flatBufferBuilder.createString(ef.a(eVar.aH())), flatBufferBuilder.createString(ef.a(eVar.B())), eVar.a().intValue(), flatBufferBuilder.createString(ef.a(eVar.C())), eVar.getMaxEffectiveShowTime(), flatBufferBuilder.createString(ef.a(eVar.aG())), flatBufferBuilder.createString(ef.a(eVar.E())), flatBufferBuilder.createString(ef.a(eVar.F()))));
                return flatBufferBuilder.sizedByteArray();
            } catch (Throwable th) {
                str = "toFlatBuffersBytes error:" + th.getClass().getSimpleName();
            }
        }
        hw.c("FBSerializeUtil", str);
        return null;
    }

    public static com.huawei.openalliance.ad.inter.data.e a(byte[] bArr) {
        String str;
        if (bArr == null || bArr.length == 0) {
            str = "data is empty";
        } else {
            try {
                NativeAdFb rootAsNativeAdFb = NativeAdFb.getRootAsNativeAdFb(ByteBuffer.wrap(bArr));
                if (rootAsNativeAdFb == null) {
                    hw.c("FBSerializeUtil", "fromFlatBuffersBytes native ad is null");
                    return null;
                }
                com.huawei.openalliance.ad.inter.data.e eVar = new com.huawei.openalliance.ad.inter.data.e();
                eVar.h(rootAsNativeAdFb.showId());
                eVar.c(rootAsNativeAdFb.contentId());
                eVar.b(rootAsNativeAdFb.endTime());
                eVar.b(rootAsNativeAdFb.cta());
                eVar.d(rootAsNativeAdFb.adSign());
                eVar.a(rootAsNativeAdFb.creativeType());
                eVar.e(rootAsNativeAdFb.originCreativeType());
                eVar.e(rootAsNativeAdFb.taskId());
                eVar.f(rootAsNativeAdFb.label());
                eVar.a(rootAsNativeAdFb.startTime());
                eVar.g(rootAsNativeAdFb.intent());
                eVar.b(rootAsNativeAdFb.adType());
                eVar.i(rootAsNativeAdFb.requestId());
                eVar.c(rootAsNativeAdFb.requestType());
                eVar.j(rootAsNativeAdFb.whyThisAd());
                eVar.k(rootAsNativeAdFb.adChoiceUrl());
                eVar.l(rootAsNativeAdFb.adChoiceIcon());
                eVar.b(Integer.valueOf(rootAsNativeAdFb.fileCachePriority()));
                eVar.n(rootAsNativeAdFb.appLanguage());
                eVar.o(rootAsNativeAdFb.appCountry());
                eVar.setCustomData(rootAsNativeAdFb.customData());
                eVar.setUserId(rootAsNativeAdFb.userId());
                eVar.a(ec.a(rootAsNativeAdFb.omVector()));
                eVar.p(rootAsNativeAdFb.landpgDlInteractionCfg());
                eVar.m(rootAsNativeAdFb.uniqueId());
                eVar.d(rootAsNativeAdFb.isPreload());
                eVar.c(rootAsNativeAdFb.startShowtime());
                eVar.c(Integer.valueOf(rootAsNativeAdFb.customExposureType()));
                eVar.d(Integer.valueOf(rootAsNativeAdFb.minEffectiveVideoPlayProgress()));
                eVar.c(rootAsNativeAdFb.isVastAd());
                eVar.b(ec.a(rootAsNativeAdFb.adSourcesVector()));
                eVar.q(rootAsNativeAdFb.logo2Text());
                eVar.r(rootAsNativeAdFb.abilityDetailInfo());
                eVar.s(rootAsNativeAdFb.hwChannelId());
                eVar.c(ec.a(rootAsNativeAdFb.complianceVector()));
                eVar.f(rootAsNativeAdFb.clicked());
                eVar.j(rootAsNativeAdFb.interactiontype());
                eVar.E(rootAsNativeAdFb.encodedParamFromServer());
                eVar.F(rootAsNativeAdFb.title());
                eVar.G(rootAsNativeAdFb.description());
                eVar.a(ec.a(rootAsNativeAdFb.icon()));
                eVar.e(ec.a(rootAsNativeAdFb.imageInfosVector()));
                eVar.l(ec.a(rootAsNativeAdFb.rawImageInfosVector()));
                eVar.H(rootAsNativeAdFb.landWebUrl());
                eVar.d(rootAsNativeAdFb.minEffectiveShowTime());
                eVar.k(rootAsNativeAdFb.minEffectiveShowRatio());
                eVar.I(rootAsNativeAdFb.appPromotionChannel());
                eVar.J(rootAsNativeAdFb.marketAppId());
                eVar.a(ec.a(rootAsNativeAdFb.videoInfo()));
                eVar.f(ef.a(rootAsNativeAdFb.adCloseKeyWordsVector()));
                eVar.g(ef.a(rootAsNativeAdFb.adCloseKeyWordsTypeVector()));
                eVar.a(ec.a(rootAsNativeAdFb.appInfo()));
                eVar.K(rootAsNativeAdFb.metaData());
                eVar.L(rootAsNativeAdFb.encodedeMonitors());
                eVar.a(ec.a(rootAsNativeAdFb.audioInfo()));
                eVar.l(rootAsNativeAdFb.showLandingPageTitleFlag());
                eVar.h(ef.a(rootAsNativeAdFb.clickActionListVector()));
                eVar.g(rootAsNativeAdFb.shown());
                eVar.M(rootAsNativeAdFb.webConfig());
                eVar.N(rootAsNativeAdFb.ctrlSwitchs());
                eVar.i(ef.a(rootAsNativeAdFb.noReportEventListVector()));
                eVar.O(rootAsNativeAdFb.slotId());
                eVar.h(rootAsNativeAdFb.hasReportShowEventDuringShowTime());
                eVar.R(rootAsNativeAdFb.taskinfo());
                eVar.S(rootAsNativeAdFb.encodeWhiteList());
                eVar.T(rootAsNativeAdFb.encodeJssdkAllowList());
                eVar.i(rootAsNativeAdFb.directReturnVideoAd());
                eVar.U(rootAsNativeAdFb.landingPageType());
                eVar.k(ef.a(rootAsNativeAdFb.invalidcontentidsVector()));
                eVar.j(rootAsNativeAdFb.isShowStartReported());
                eVar.B(rootAsNativeAdFb.splashMediaPath());
                eVar.e(rootAsNativeAdFb.apiRecordStartTime());
                eVar.V(rootAsNativeAdFb.bannerRefSetting());
                eVar.m(rootAsNativeAdFb.useGaussianBlur());
                eVar.m(ec.a(rootAsNativeAdFb.extVector()));
                eVar.n(ec.a(rootAsNativeAdFb.contentExtsVector()));
                eVar.o(ec.a(rootAsNativeAdFb.feedbackInfoListVector()));
                eVar.P(rootAsNativeAdFb.templateId());
                eVar.j(ec.a(rootAsNativeAdFb.assetsVector()));
                eVar.a(ec.a(rootAsNativeAdFb.templateData()));
                eVar.Q(rootAsNativeAdFb.templateStyle());
                eVar.f(Integer.valueOf(rootAsNativeAdFb.apiVer()));
                eVar.a(ec.a(rootAsNativeAdFb.defaultTemplate()));
                eVar.k(rootAsNativeAdFb.encryptInContentRrd());
                eVar.a(ef.a(rootAsNativeAdFb.workingKeyVector()));
                eVar.W(rootAsNativeAdFb.originParamFromServer());
                eVar.p(ec.a(rootAsNativeAdFb.monitorsVector()));
                eVar.X(rootAsNativeAdFb.originWhiteList());
                eVar.Y(rootAsNativeAdFb.originJssdkAllowList());
                eVar.a(rootAsNativeAdFb.ctrlExt());
                eVar.e(Integer.valueOf(rootAsNativeAdFb.showAppElement()));
                eVar.t(rootAsNativeAdFb.transparencyTplUrl());
                eVar.d(rootAsNativeAdFb.transparencySwitch());
                eVar.u(rootAsNativeAdFb.adRealCallerPkgName());
                eVar.a(ec.a(rootAsNativeAdFb.promoteInfo()));
                eVar.f(rootAsNativeAdFb.recallSource());
                eVar.aa(rootAsNativeAdFb.cshareUrl());
                eVar.Z(rootAsNativeAdFb.templateUrl());
                eVar.a(ec.a(rootAsNativeAdFb.biddingInfo()));
                eVar.a(rootAsNativeAdFb.hasReportInteractiveImp());
                eVar.d(ef.a(rootAsNativeAdFb.subDescriptionVector()));
                eVar.ab(rootAsNativeAdFb.style());
                eVar.ad(rootAsNativeAdFb.styleExt());
                eVar.ae(rootAsNativeAdFb.strAssets());
                eVar.v(rootAsNativeAdFb.trackVersion());
                eVar.a(Integer.valueOf(rootAsNativeAdFb.sdkMonitor()));
                eVar.w(rootAsNativeAdFb.bubbleInfo());
                eVar.f(rootAsNativeAdFb.maxEffectiveShowTime());
                eVar.ac(rootAsNativeAdFb.styleId());
                eVar.y(rootAsNativeAdFb.configMap());
                eVar.z(rootAsNativeAdFb.dspId());
                return eVar;
            } catch (Throwable th) {
                str = "fromFlatBuffersBytes error:" + th.getClass().getSimpleName();
            }
        }
        hw.c("FBSerializeUtil", str);
        return null;
    }
}
